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
import com.bydan.erp.nomina.util.VariableNomiConstantesFunciones;

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
public class VariableNomiJInternalFrame extends VariableNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVariableNomi;
	
	protected JMenuBar jmenuBarVariableNomi;
	
	protected JMenu jmenuVariableNomi;
	protected JMenu jmenuDatosVariableNomi;
	protected JMenu jmenuArchivoVariableNomi;
	protected JMenu jmenuAccionesVariableNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVariableNomi;	
	protected GridBagConstraints gridBagConstraintsVariableNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VariableNomiDetalleFormJInternalFrame jInternalFrameDetalleFormVariableNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVariableNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVariableNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoVariableNomiBeanSwingJInternalFrame tipovariablenomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovariablenomi="";

	protected TipoValorVariableNomiBeanSwingJInternalFrame tipovalorvariablenomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovalorvariablenomi="";
	
	public VariableNomiSessionBean variablenomiSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoVariableNomiSessionBean tipovariablenomiSessionBean;
	public TipoValorVariableNomiSessionBean tipovalorvariablenomiSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VariableNomi> variablenomis;		
	public List<VariableNomi> variablenomisEliminados;	
	public List<VariableNomi> variablenomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVariableNomi;		
	protected JButton jButtonAbrirOrderByVariableNomi;
	
	
	//protected JPanel jPanelOrderByVariableNomi;
	//public JScrollPane jScrollPanelOrderByVariableNomi;	
	//protected JButton jButtonCerrarOrderByVariableNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VariableNomiLogic variablenomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVariableNomi;
	public JScrollPane jScrollPanelDatosEdicionVariableNomi;
	public JScrollPane jScrollPanelDatosGeneralVariableNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosVariableNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVariableNomi;
	//public JScrollPane jScrollPanelImportacionVariableNomi;
	
	
	
	protected JPanel jPanelAccionesVariableNomi;
	
    protected JPanel jPanelPaginacionVariableNomi;
    protected JPanel jPanelParametrosReportesVariableNomi;
	protected JPanel jPanelParametrosReportesAccionesVariableNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VariableNomi;
	protected JPanel jPanelParametrosAuxiliar2VariableNomi;
	protected JPanel jPanelParametrosAuxiliar3VariableNomi;
	protected JPanel jPanelParametrosAuxiliar4VariableNomi;
	//protected JPanel jPanelParametrosAuxiliar5VariableNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoVariableNomi;
	//protected JPanel jPanelImportacionVariableNomi;
	
	
	public JTable jTableDatosVariableNomi;
	
	
	
	//public JTable jTableDatosVariableNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVariableNomi;
	protected JButton jButtonDuplicarVariableNomi;
	protected JButton jButtonCopiarVariableNomi;
	protected JButton jButtonVerFormVariableNomi;
	protected JButton jButtonNuevoRelacionesVariableNomi;
	protected JButton jButtonModificarVariableNomi;
	
    protected JButton jButtonGuardarCambiosTablaVariableNomi;
	protected JButton jButtonCerrarVariableNomi;
	
	
	protected JButton jButtonRecargarInformacionVariableNomi;
	protected JButton jButtonProcesarInformacionVariableNomi;
	
	
	protected JButton jButtonAnterioresVariableNomi;
	protected JButton jButtonSiguientesVariableNomi;
	protected JButton jButtonNuevoGuardarCambiosVariableNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVariableNomi;
	//protected JButton jButtonCerrarReporteDinamicoVariableNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoVariableNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionVariableNomi;
	//protected JButton jButtonGenerarImportacionVariableNomi;
	//protected JButton jButtonCerrarImportacionVariableNomi;
	//protected JFileChooser jFileChooserImportacionVariableNomi;
	//protected File fileImportacionVariableNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVariableNomi;
	protected JButton jButtonDuplicarToolBarVariableNomi;
	protected JButton jButtonNuevoRelacionesToolBarVariableNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarVariableNomi;
	protected JButton jButtonCopiarToolBarVariableNomi;
	protected JButton jButtonVerFormToolBarVariableNomi;
	public JButton jButtonGuardarCambiosTablaToolBarVariableNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarVariableNomi;
	protected JButton jButtonCerrarToolBarVariableNomi;
	
	protected JButton jButtonRecargarInformacionToolBarVariableNomi;
	protected JButton jButtonProcesarInformacionToolBarVariableNomi;
	protected JButton jButtonAnterioresToolBarVariableNomi;
	protected JButton jButtonSiguientesToolBarVariableNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarVariableNomi;
	protected JButton jButtonAbrirOrderByToolBarVariableNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVariableNomi;
	protected JMenuItem jMenuItemDuplicarVariableNomi;
	protected JMenuItem jMenuItemNuevoRelacionesVariableNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVariableNomi;
	protected JMenuItem jMenuItemCopiarVariableNomi;
	protected JMenuItem jMenuItemVerFormVariableNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaVariableNomi;
	protected JMenuItem jMenuItemCerrarVariableNomi;
	protected JMenuItem jMenuItemDetalleCerrarVariableNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVariableNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarVariableNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionVariableNomi;
	protected JMenuItem jMenuItemProcesarInformacionVariableNomi;
	protected JMenuItem jMenuItemAnterioresVariableNomi;
	protected JMenuItem jMenuItemSiguientesVariableNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVariableNomi;
	protected JMenuItem jMenuItemAbrirOrderByVariableNomi;
	protected JMenuItem jMenuItemMostrarOcultarVariableNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVariableNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVariableNomi;
	protected JCheckBox jCheckBoxSeleccionadosVariableNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVariableNomi;
	protected JCheckBox jCheckBoxConGraficoReporteVariableNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVariableNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVariableNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVariableNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVariableNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVariableNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVariableNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVariableNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVariableNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVariableNomi;
	protected JTextField jTextFieldValorCampoGeneralVariableNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVariableNomi;
	//public JList<Reporte> jListColumnasSelectReporteVariableNomi;
	//public JScrollPane jScrollColumnasSelectReporteVariableNomi;
	
	//public JLabel jLabelRelacionesSelectReporteVariableNomi;
	//public JList<Reporte> jListRelacionesSelectReporteVariableNomi;
	//public JScrollPane jScrollRelacionesSelectReporteVariableNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVariableNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVariableNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVariableNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoVariableNomi;
	
		
	//public JLabel jLabelArchivoImportacionVariableNomi;	
	//public JLabel jLabelPathArchivoImportacionVariableNomi;
	//protected JTextField jTextFieldPathArchivoImportacionVariableNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVariableNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVariableNomi;
	
	//public JLabel jLabelColumnaCategoriaValorVariableNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVariableNomi;
	
	//public JLabel jLabelColumnasValoresGraficoVariableNomi;
	//public JList<Reporte> jListColumnasValoresGraficoVariableNomi;
	//public JScrollPane jScrollColumnasValoresGraficoVariableNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVariableNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVariableNomi;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVariableNomi;
	public JPanel jPanelFK_IdTipoValorVariableNomiVariableNomi;
	public JButton jButtonFK_IdTipoValorVariableNomiVariableNomi;
	public JPanel jPanelFK_IdTipoVariableNomiVariableNomi;
	public JButton jButtonFK_IdTipoVariableNomiVariableNomi;
	
	public JPanel jPanelid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi;
	public JLabel jLabelid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi;
	public JButton jButtonid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi= new JButtonMe();
	public JButton jButtonid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomiUpdate= new JButtonMe();
	public JButton jButtonid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi;
	public JLabel jLabelid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi;
	public JButton jButtonid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi= new JButtonMe();
	public JButton jButtonid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomiUpdate= new JButtonMe();
	public JButton jButtonid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomiBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public VariableNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VariableNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VariableNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VariableNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVariableNomi)	{
		this.jButtonRecargarInformacionVariableNomi = jButtonRecargarInformacionVariableNomi;
	}
	
	public JButton getjButtonProcesarInformacionVariableNomi() {
		return this.jButtonProcesarInformacionVariableNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVariableNomi)	{
		this.jButtonProcesarInformacionVariableNomi = jButtonProcesarInformacionVariableNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionVariableNomi() {
		return this.jButtonRecargarInformacionVariableNomi;
	}
	
	
	public List<VariableNomi> getvariablenomis() {
		return this.variablenomis;
	}

	public void setvariablenomis(List<VariableNomi> variablenomis) {
		this.variablenomis = variablenomis;
	}
	
	public List<VariableNomi> getvariablenomisAux() {
		return this.variablenomisAux;
	}

	public void setvariablenomisAux(List<VariableNomi> variablenomisAux) {
		this.variablenomisAux = variablenomisAux;
	}
	
	public List<VariableNomi> getvariablenomisEliminados() {
		return this.variablenomisEliminados;
	}

	public void setVariableNomisEliminados(List<VariableNomi> variablenomisEliminados) {
		this.variablenomisEliminados = variablenomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVariableNomi() {
		return jComboBoxTiposSeleccionarVariableNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVariableNomi(
			JComboBox jComboBoxTiposSeleccionarVariableNomi) {
		this.jComboBoxTiposSeleccionarVariableNomi = jComboBoxTiposSeleccionarVariableNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVariableNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVariableNomi() {
		return jTextFieldValorCampoGeneralVariableNomi;
	}

	public void setjTextFieldValorCampoGeneralVariableNomi(
			JTextField jTextFieldValorCampoGeneralVariableNomi) {
		this.jTextFieldValorCampoGeneralVariableNomi = jTextFieldValorCampoGeneralVariableNomi;
	}

	public void setBorderResaltarValorCampoGeneralVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVariableNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVariableNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVariableNomi() {
		return this.jCheckBoxSeleccionarTodosVariableNomi;
	}

	public void setjCheckBoxSeleccionarTodosVariableNomi(
			JCheckBox jCheckBoxSeleccionarTodosVariableNomi) {
		this.jCheckBoxSeleccionarTodosVariableNomi = jCheckBoxSeleccionarTodosVariableNomi;
	}

	public void setBorderResaltarSeleccionarTodosVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVariableNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVariableNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVariableNomi() {
		return this.jCheckBoxSeleccionadosVariableNomi;
	}

	public void setjCheckBoxSeleccionadosVariableNomi(
			JCheckBox jCheckBoxSeleccionadosVariableNomi) {
		this.jCheckBoxSeleccionadosVariableNomi = jCheckBoxSeleccionadosVariableNomi;
	}
	
	public void setBorderResaltarSeleccionadosVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVariableNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVariableNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVariableNomi() {
		return this.jComboBoxTiposArchivosReportesVariableNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVariableNomi(
			JComboBox jComboBoxTiposArchivosReportesVariableNomi) {
		this.jComboBoxTiposArchivosReportesVariableNomi = jComboBoxTiposArchivosReportesVariableNomi;
	}

	public void setBorderResaltarTiposArchivosReportesVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVariableNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVariableNomi() {
		return this.jComboBoxTiposReportesVariableNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVariableNomi(
			JComboBox jComboBoxTiposReportesVariableNomi) {
		this.jComboBoxTiposReportesVariableNomi = jComboBoxTiposReportesVariableNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVariableNomi() {
	//	return jComboBoxTiposReportesDinamicoVariableNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVariableNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoVariableNomi) {
	//	this.jComboBoxTiposReportesDinamicoVariableNomi = jComboBoxTiposReportesDinamicoVariableNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVariableNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoVariableNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVariableNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVariableNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVariableNomi = jComboBoxTiposArchivosReportesDinamicoVariableNomi;
	//}
	
	public void setBorderResaltarTiposReportesVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVariableNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVariableNomi() {
		return this.jComboBoxTiposGraficosReportesVariableNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVariableNomi(
			JComboBox jComboBoxTiposGraficosReportesVariableNomi) {
		this.jComboBoxTiposGraficosReportesVariableNomi = jComboBoxTiposGraficosReportesVariableNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVariableNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVariableNomi() {
		return this.jComboBoxTiposPaginacionVariableNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVariableNomi(
			JComboBox jComboBoxTiposPaginacionVariableNomi) {
		this.jComboBoxTiposPaginacionVariableNomi = jComboBoxTiposPaginacionVariableNomi;
	}
	
	public void setBorderResaltarTiposPaginacionVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVariableNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVariableNomi() {
		return this.jComboBoxTiposRelacionesVariableNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVariableNomi() {
		return this.jComboBoxTiposAccionesVariableNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVariableNomi(
			JComboBox jComboBoxTiposRelacionesVariableNomi) {
		this.jComboBoxTiposRelacionesVariableNomi = jComboBoxTiposRelacionesVariableNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVariableNomi(
			JComboBox jComboBoxTiposAccionesVariableNomi) {
		this.jComboBoxTiposAccionesVariableNomi = jComboBoxTiposAccionesVariableNomi;
	}
	
	public void setBorderResaltarTiposRelacionesVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVariableNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVariableNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVariableNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVariableNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVariableNomi() {
	//	return jCheckBoxConGraficoDinamicoVariableNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoVariableNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoVariableNomi) {
	//	this.jCheckBoxConGraficoDinamicoVariableNomi = jCheckBoxConGraficoDinamicoVariableNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVariableNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVariableNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVariableNomi .setBorder(borderResaltar);		
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
		this.variablenomiSessionBean=new VariableNomiSessionBean();
		
		this.variablenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.variablenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.variablenomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VariableNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Variable Nomina MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
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
		
		VariableNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVariableNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVariableNomi,this.jTtoolBarVariableNomi,
							"nuevo","nuevo","Nuevo"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVariableNomi,this.jTtoolBarVariableNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVariableNomi,this.jTtoolBarVariableNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVariableNomi,this.jTtoolBarVariableNomi,
							"duplicar","duplicar","Duplicar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVariableNomi,this.jTtoolBarVariableNomi,
							"copiar","copiar","Copiar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVariableNomi,this.jTtoolBarVariableNomi,
							"ver_form","ver_form","Ver"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVariableNomi,this.jTtoolBarVariableNomi,
							"recargar","recargar","Recargar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVariableNomi,this.jTtoolBarVariableNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVariableNomi,this.jTtoolBarVariableNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVariableNomi,this.jTtoolBarVariableNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVariableNomi,this.jTtoolBarVariableNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVariableNomi,this.jTtoolBarVariableNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVariableNomi,this.jTtoolBarVariableNomi,
							"cerrar","cerrar","Salir"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVariableNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVariableNomi;
			
				this.jButtonProcesarInformacionToolBarVariableNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVariableNomi;
				
		//protected JButton jButtonModificarToolBarVariableNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVariableNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVariableNomi=new JMenuMe("General");
		this.jmenuArchivoVariableNomi=new JMenuMe("Archivo");
		this.jmenuAccionesVariableNomi=new JMenuMe("Acciones");
		this.jmenuDatosVariableNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVariableNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVariableNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVariableNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVariableNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVariableNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVariableNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVariableNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVariableNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVariableNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVariableNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVariableNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVariableNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVariableNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVariableNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVariableNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVariableNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVariableNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVariableNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVariableNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVariableNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVariableNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVariableNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVariableNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVariableNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVariableNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVariableNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVariableNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVariableNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVariableNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVariableNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVariableNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVariableNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVariableNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVariableNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVariableNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVariableNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVariableNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVariableNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVariableNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVariableNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVariableNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVariableNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVariableNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVariableNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVariableNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVariableNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVariableNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVariableNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVariableNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVariableNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVariableNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVariableNomi.add(this.jMenuItemCerrarVariableNomi);
			
			this.jmenuAccionesVariableNomi.add(this.jMenuItemNuevoVariableNomi);
			this.jmenuAccionesVariableNomi.add(this.jMenuItemNuevoGuardarCambiosVariableNomi);
			this.jmenuAccionesVariableNomi.add(this.jMenuItemNuevoRelacionesVariableNomi);
			this.jmenuAccionesVariableNomi.add(this.jMenuItemGuardarCambiosTablaVariableNomi);		
			this.jmenuAccionesVariableNomi.add(this.jMenuItemDuplicarVariableNomi);		
			this.jmenuAccionesVariableNomi.add(this.jMenuItemCopiarVariableNomi);		
			this.jmenuAccionesVariableNomi.add(this.jMenuItemVerFormVariableNomi);		
			
			this.jmenuDatosVariableNomi.add(this.jMenuItemRecargarInformacionVariableNomi);				
			this.jmenuDatosVariableNomi.add(this.jMenuItemAnterioresVariableNomi);				
			this.jmenuDatosVariableNomi.add(this.jMenuItemSiguientesVariableNomi);				
			this.jmenuDatosVariableNomi.add(this.jMenuItemAbrirOrderByVariableNomi);				
			this.jmenuDatosVariableNomi.add(this.jMenuItemMostrarOcultarVariableNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVariableNomi.add(this.jMenuItemGuardarCambiosVariableNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVariableNomi.add(this.jmenuArchivoVariableNomi);		
			this.jmenuBarVariableNomi.add(this.jmenuAccionesVariableNomi);		
			this.jmenuBarVariableNomi.add(this.jmenuDatosVariableNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVariableNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVariableNomi() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoValorVariableNomiVariableNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoValorVariableNomiVariableNomi.setToolTipText("Buscar Por Tipo Valor Variable ");
		this.jButtonFK_IdTipoValorVariableNomiVariableNomi= new JButtonMe();
		this.jButtonFK_IdTipoValorVariableNomiVariableNomi.setText("Buscar");
		this.jButtonFK_IdTipoValorVariableNomiVariableNomi.setToolTipText("Buscar Por Tipo Valor Variable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoValorVariableNomiVariableNomi,"buscar_button","Buscar Por Tipo Valor Variable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoValorVariableNomiVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi = new JLabelMe();
		jLabelid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.setText("Tipo Valor Variable :");
		jLabelid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.setToolTipText("Tipo Valor Variable");
		jLabelid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi= new JComboBoxMe();
		jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoVariableNomiVariableNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoVariableNomiVariableNomi.setToolTipText("Buscar Por Tipo Variable ");
		this.jButtonFK_IdTipoVariableNomiVariableNomi= new JButtonMe();
		this.jButtonFK_IdTipoVariableNomiVariableNomi.setText("Buscar");
		this.jButtonFK_IdTipoVariableNomiVariableNomi.setToolTipText("Buscar Por Tipo Variable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoVariableNomiVariableNomi,"buscar_button","Buscar Por Tipo Variable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoVariableNomiVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi = new JLabelMe();
		jLabelid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.setText("Tipo Variable :");
		jLabelid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.setToolTipText("Tipo Variable");
		jLabelid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi= new JComboBoxMe();
		jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasVariableNomi=new JTabbedPane();


		this.jTabbedPaneBusquedasVariableNomi.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVariableNomi.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVariableNomi.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVariableNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVariableNomi,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVariableNomi = new VariableNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Variable Nomina DATOS");
			this.jInternalFrameDetalleFormVariableNomi = new VariableNomiDetalleFormJInternalFrame(jDesktopPane,this.variablenomiSessionBean.getConGuardarRelaciones(),this.variablenomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVariableNomi = null;//new VariableNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVariableNomi= new GridBagLayout();
		
		
		this.jTableDatosVariableNomi = new JTableMe();      
		
		String sToolTipVariableNomi="";
		sToolTipVariableNomi=VariableNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVariableNomi+="(Nomina.VariableNomi)";
		}
		
		if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipVariableNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVariableNomi.setToolTipText(sToolTipVariableNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVariableNomi);
		this.jTableDatosVariableNomi.setAutoCreateRowSorter(true);
		this.jTableDatosVariableNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVariableNomi.setRowSelectionAllowed(true);
		this.jTableDatosVariableNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVariableNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVariableNomi = new JButtonMe();
		this.jButtonDuplicarVariableNomi = new JButtonMe();
		this.jButtonCopiarVariableNomi = new JButtonMe();
		this.jButtonVerFormVariableNomi = new JButtonMe();
		this.jButtonNuevoRelacionesVariableNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVariableNomi = new JButtonMe();
		this.jButtonCerrarVariableNomi = new JButtonMe();
		
		this.jScrollPanelDatosVariableNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralVariableNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Variable Nomina";
		
		if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Variable Nominas" + this.sPath));
		} else {
			this.jScrollPanelDatosVariableNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVariableNomi.setToolTipText("Acciones");
        this.jPanelAccionesVariableNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVariableNomi=new ReporteDinamicoJInternalFrame(VariableNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVariableNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVariableNomi=new ImportacionJInternalFrame(VariableNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVariableNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVariableNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByVariableNomi.setText("Orden");
		this.jButtonAbrirOrderByVariableNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVariableNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVariableNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVariableNomi,false,this);
			
			//this.cargarOrderByVariableNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVariableNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVariableNomi,true,this);
			
			//this.cargarOrderByVariableNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVariableNomi.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosVariableNomi.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosVariableNomi.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosVariableNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVariableNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVariableNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVariableNomi.setText("Nuevo");
		this.jButtonDuplicarVariableNomi.setText("Duplicar");
		this.jButtonCopiarVariableNomi.setText("Copiar");
		this.jButtonVerFormVariableNomi.setText("Ver");
		this.jButtonNuevoRelacionesVariableNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVariableNomi.setText("Guardar");
		this.jButtonCerrarVariableNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVariableNomi,"nuevo_button","Nuevo",this.variablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVariableNomi,"duplicar_button","Duplicar",this.variablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVariableNomi,"copiar_button","Copiar",this.variablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVariableNomi,"ver_form","Ver",this.variablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVariableNomi,"nuevorelaciones_button","Nuevo Rel",this.variablenomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVariableNomi,"guardarcambiostabla_button","Guardar",this.variablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVariableNomi,"cerrar_button","Salir",this.variablenomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVariableNomi.setToolTipText("Nuevo"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVariableNomi.setToolTipText("Duplicar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVariableNomi.setToolTipText("Copiar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVariableNomi.setToolTipText("Ver"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVariableNomi.setToolTipText("Nuevo Rel"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVariableNomi.setToolTipText("Guardar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVariableNomi.setToolTipText("Salir"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVariableNomi";
		inputMap = this.jButtonNuevoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVariableNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVariableNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarVariableNomi";
		inputMap = this.jButtonDuplicarVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVariableNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVariableNomi"));
		
		//COPIAR
		sMapKey = "CopiarVariableNomi";
		inputMap = this.jButtonCopiarVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVariableNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVariableNomi"));
		
		//VEr FORM
		sMapKey = "VerFormVariableNomi";
		inputMap = this.jButtonVerFormVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVariableNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVariableNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVariableNomi";
		inputMap = this.jButtonNuevoRelacionesVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVariableNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVariableNomi";
		inputMap = this.jButtonModificarVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVariableNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVariableNomi";
		inputMap = this.jButtonCerrarVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVariableNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVariableNomi";
		inputMap = this.jButtonGuardarCambiosTablaVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVariableNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVariableNomi.setName("jPanelParametrosReportesVariableNomi"); 
		
		this.jPanelParametrosReportesAccionesVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVariableNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVariableNomi.setName("jPanelParametrosReportesAccionesVariableNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVariableNomi = new JButtonMe();
		this.jButtonRecargarInformacionVariableNomi.setText("Recargar");
		this.jButtonRecargarInformacionVariableNomi.setToolTipText("Recargar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVariableNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionVariableNomi = new JButtonMe();
		this.jButtonProcesarInformacionVariableNomi.setText("Procesar");
		this.jButtonProcesarInformacionVariableNomi.setToolTipText("Procesar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVariableNomi.setVisible(false);
			
		this.jButtonProcesarInformacionVariableNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVariableNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVariableNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVariableNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVariableNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVariableNomi.setText("TIPO");       
		this.jComboBoxTiposReportesVariableNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVariableNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVariableNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVariableNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionVariableNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVariableNomi.setText("Accion");
		this.jComboBoxTiposRelacionesVariableNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVariableNomi.setText("Accion");
		this.jComboBoxTiposAccionesVariableNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVariableNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarVariableNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVariableNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVariableNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVariableNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVariableNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVariableNomi = new JLabelMe();
		
		this.jLabelAccionesVariableNomi.setText("Acciones");		
		this.jLabelAccionesVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVariableNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVariableNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVariableNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVariableNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVariableNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVariableNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVariableNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVariableNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVariableNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVariableNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVariableNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteVariableNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVariableNomi = new JButtonMe();
		//this.jButtonAnterioresVariableNomi.setText("<<");
        this.jButtonAnterioresVariableNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVariableNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVariableNomi = new JButtonMe();
		//this.jButtonSiguientesVariableNomi.setText(">>");
        this.jButtonSiguientesVariableNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVariableNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVariableNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVariableNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosVariableNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVariableNomi,"nuevoguardarcambios_button","Nue",this.variablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVariableNomi";
		inputMap = this.jButtonNuevoGuardarCambiosVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVariableNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVariableNomi";
		inputMap = this.jButtonRecargarInformacionVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVariableNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVariableNomi";
		inputMap = this.jButtonSiguientesVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVariableNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVariableNomi";
		inputMap = this.jButtonAnterioresVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVariableNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVariableNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVariableNomi.setMinimumSize(new Dimension(this.getWidth(),VariableNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VariableNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVariableNomi.setMaximumSize(new Dimension(this.getWidth(),VariableNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VariableNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVariableNomi.setPreferredSize(new Dimension(this.getWidth(),VariableNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VariableNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVariableNomi = new GridBagLayout();

			this.jPanelPaginacionVariableNomi.setLayout(gridaBagLayoutPaginacionVariableNomi);						
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy = 0;
			this.gridBagConstraintsVariableNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVariableNomi.add(this.jButtonAnterioresVariableNomi, this.gridBagConstraintsVariableNomi);
					
						
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVariableNomi.gridy = 0;
			
			this.jPanelPaginacionVariableNomi.add(this.jButtonNuevoGuardarCambiosVariableNomi, this.gridBagConstraintsVariableNomi);
						
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVariableNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVariableNomi.gridy = 0;
			this.jPanelPaginacionVariableNomi.add(this.jButtonSiguientesVariableNomi, this.gridBagConstraintsVariableNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy = 1;
			this.gridBagConstraintsVariableNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVariableNomi.add(this.jButtonNuevoVariableNomi, this.gridBagConstraintsVariableNomi);
						
			
			
			if(!this.variablenomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVariableNomi = new GridBagConstraints();
				this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVariableNomi.gridy = 1;
				this.gridBagConstraintsVariableNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVariableNomi.add(this.jButtonGuardarCambiosTablaVariableNomi, this.gridBagConstraintsVariableNomi);
			}
			
			
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy = 1;
			this.gridBagConstraintsVariableNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVariableNomi.add(this.jButtonDuplicarVariableNomi, this.gridBagConstraintsVariableNomi);
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy = 1;
			this.gridBagConstraintsVariableNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVariableNomi.add(this.jButtonCopiarVariableNomi, this.gridBagConstraintsVariableNomi);
		
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy = 1;
			this.gridBagConstraintsVariableNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVariableNomi.add(this.jButtonVerFormVariableNomi, this.gridBagConstraintsVariableNomi);
		
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy = 1;
			this.gridBagConstraintsVariableNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVariableNomi.add(this.jButtonCerrarVariableNomi, this.gridBagConstraintsVariableNomi);
		
		
		
		this.jButtonRecargarInformacionVariableNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVariableNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVariableNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVariableNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVariableNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVariableNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVariableNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVariableNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVariableNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVariableNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVariableNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVariableNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVariableNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVariableNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVariableNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVariableNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVariableNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVariableNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVariableNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVariableNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVariableNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVariableNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVariableNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVariableNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVariableNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVariableNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVariableNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVariableNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVariableNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVariableNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVariableNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVariableNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVariableNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVariableNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVariableNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVariableNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVariableNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVariableNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VariableNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VariableNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VariableNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VariableNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVariableNomi.setLayout(gridaBagParametrosReportesVariableNomi);
			this.jPanelParametrosReportesAccionesVariableNomi.setLayout(gridaBagParametrosReportesAccionesVariableNomi);
			
			
			this.jPanelParametrosAuxiliar1VariableNomi.setLayout(gridaBagParametrosAuxiliar1VariableNomi);
			this.jPanelParametrosAuxiliar2VariableNomi.setLayout(gridaBagParametrosAuxiliar2VariableNomi);
			this.jPanelParametrosAuxiliar3VariableNomi.setLayout(gridaBagParametrosAuxiliar3VariableNomi);
			this.jPanelParametrosAuxiliar4VariableNomi.setLayout(gridaBagParametrosAuxiliar4VariableNomi);
			//this.jPanelParametrosAuxiliar5VariableNomi.setLayout(gridaBagParametrosAuxiliar2VariableNomi);			
			
			
			
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVariableNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVariableNomi.add(this.jButtonRecargarInformacionVariableNomi, this.gridBagConstraintsVariableNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVariableNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VariableNomi.add(this.jComboBoxTiposPaginacionVariableNomi, this.gridBagConstraintsVariableNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVariableNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VariableNomi.add(this.jCheckBoxConAltoMaximoTablaVariableNomi, this.gridBagConstraintsVariableNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVariableNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VariableNomi.add(this.jComboBoxTiposArchivosReportesVariableNomi, this.gridBagConstraintsVariableNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVariableNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVariableNomi.add(this.jPanelParametrosAuxiliar1VariableNomi, this.gridBagConstraintsVariableNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVariableNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VariableNomi.add(this.jComboBoxTiposReportesVariableNomi, this.gridBagConstraintsVariableNomi);																		
			
			
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVariableNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4VariableNomi.add(this.jComboBoxTiposGraficosReportesVariableNomi, this.gridBagConstraintsVariableNomi);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVariableNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVariableNomi.add(this.jPanelParametrosAuxiliar4VariableNomi, this.gridBagConstraintsVariableNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVariableNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVariableNomi.add(this.jComboBoxTiposReportesVariableNomi, this.gridBagConstraintsVariableNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVariableNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVariableNomi.add(this.jCheckBoxGenerarReporteVariableNomi, this.gridBagConstraintsVariableNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVariableNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVariableNomi.add(this.jPanelParametrosAuxiliar2VariableNomi, this.gridBagConstraintsVariableNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVariableNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVariableNomi.add(this.jLabelAccionesVariableNomi, this.gridBagConstraintsVariableNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVariableNomi = new GridBagConstraints();
				this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVariableNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVariableNomi.add(this.jButtonAbrirOrderByVariableNomi, this.gridBagConstraintsVariableNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVariableNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVariableNomi.add(this.jComboBoxTiposSeleccionarVariableNomi, this.gridBagConstraintsVariableNomi);			
			
			
			/*
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVariableNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVariableNomi.add(this.jCheckBoxSeleccionarTodosVariableNomi, this.gridBagConstraintsVariableNomi);
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVariableNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVariableNomi.add(this.jCheckBoxConGraficoReporteVariableNomi, this.gridBagConstraintsVariableNomi);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVariableNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VariableNomi.add(this.jCheckBoxSeleccionarTodosVariableNomi, this.gridBagConstraintsVariableNomi);															
				
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVariableNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VariableNomi.add(this.jCheckBoxSeleccionadosVariableNomi, this.gridBagConstraintsVariableNomi);															
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVariableNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VariableNomi.add(this.jCheckBoxConGraficoReporteVariableNomi, this.gridBagConstraintsVariableNomi);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVariableNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVariableNomi.add(this.jPanelParametrosAuxiliar3VariableNomi, this.gridBagConstraintsVariableNomi);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVariableNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVariableNomi.add(this.jComboBoxTiposAccionesVariableNomi, this.gridBagConstraintsVariableNomi);
	
				
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVariableNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVariableNomi.add(this.jTextFieldValorCampoGeneralVariableNomi, this.gridBagConstraintsVariableNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVariableNomi = new GridBagLayout();

			this.jScrollPanelDatosVariableNomi.setLayout(gridaBagLayoutDatosVariableNomi);
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy = 0;
			this.gridBagConstraintsVariableNomi.gridx = 0;
			
			this.jScrollPanelDatosVariableNomi.add(this.jTableDatosVariableNomi, this.gridBagConstraintsVariableNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVariableNomi.setViewportView(this.jTableDatosVariableNomi);
		this.jTableDatosVariableNomi.setFillsViewportHeight(true);
		this.jTableDatosVariableNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVariableNomi= new GridBagLayout();
		this.jPanelAccionesVariableNomi.setLayout(gridaBagLayoutAccionesVariableNomi);
		
		
		/*	
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx = 0;
			
		this.jPanelAccionesVariableNomi.add(this.jButtonNuevoVariableNomi, this.gridBagConstraintsVariableNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoValorVariableNomiVariableNomi= new GridBagLayout();
		gridaBagLayoutFK_IdTipoValorVariableNomiVariableNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoValorVariableNomiVariableNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoValorVariableNomiVariableNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoValorVariableNomiVariableNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoValorVariableNomiVariableNomi.setLayout(gridaBagLayoutFK_IdTipoValorVariableNomiVariableNomi);

		gridBagConstraintsVariableNomi = new GridBagConstraints();
		gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVariableNomi.gridy = 0;
		gridBagConstraintsVariableNomi.gridx = 0;
		jPanelFK_IdTipoValorVariableNomiVariableNomi.add(jLabelid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi, gridBagConstraintsVariableNomi);

		gridBagConstraintsVariableNomi = new GridBagConstraints();
		gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVariableNomi.gridy = 0;
		gridBagConstraintsVariableNomi.gridx = 1;
		jPanelFK_IdTipoValorVariableNomiVariableNomi.add(jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi, gridBagConstraintsVariableNomi);

		gridBagConstraintsVariableNomi = new GridBagConstraints();
		gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVariableNomi.gridy = 1;
		gridBagConstraintsVariableNomi.gridx =1;
		jPanelFK_IdTipoValorVariableNomiVariableNomi.add(jButtonFK_IdTipoValorVariableNomiVariableNomi, gridBagConstraintsVariableNomi);

		jTabbedPaneBusquedasVariableNomi.addTab("1.-Por Tipo Valor Variable ", jPanelFK_IdTipoValorVariableNomiVariableNomi);
		jTabbedPaneBusquedasVariableNomi.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoVariableNomiVariableNomi= new GridBagLayout();
		gridaBagLayoutFK_IdTipoVariableNomiVariableNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoVariableNomiVariableNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoVariableNomiVariableNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoVariableNomiVariableNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoVariableNomiVariableNomi.setLayout(gridaBagLayoutFK_IdTipoVariableNomiVariableNomi);

		gridBagConstraintsVariableNomi = new GridBagConstraints();
		gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVariableNomi.gridy = 0;
		gridBagConstraintsVariableNomi.gridx = 0;
		jPanelFK_IdTipoVariableNomiVariableNomi.add(jLabelid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi, gridBagConstraintsVariableNomi);

		gridBagConstraintsVariableNomi = new GridBagConstraints();
		gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVariableNomi.gridy = 0;
		gridBagConstraintsVariableNomi.gridx = 1;
		jPanelFK_IdTipoVariableNomiVariableNomi.add(jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi, gridBagConstraintsVariableNomi);

		gridBagConstraintsVariableNomi = new GridBagConstraints();
		gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVariableNomi.gridy = 1;
		gridBagConstraintsVariableNomi.gridx =1;
		jPanelFK_IdTipoVariableNomiVariableNomi.add(jButtonFK_IdTipoVariableNomiVariableNomi, gridBagConstraintsVariableNomi);

		jTabbedPaneBusquedasVariableNomi.addTab("2.-Por Tipo Variable ", jPanelFK_IdTipoVariableNomiVariableNomi);
		jTabbedPaneBusquedasVariableNomi.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVariableNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVariableNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.variablenomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();						
			this.gridBagConstraintsVariableNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVariableNomi.gridx = 0;		
			//this.gridBagConstraintsVariableNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVariableNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVariableNomi, this.gridBagConstraintsVariableNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVariableNomi.gridx = 0;		
		//this.gridBagConstraintsVariableNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVariableNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVariableNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVariableNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVariableNomi.gridx = 0;		
			this.gridBagConstraintsVariableNomi.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVariableNomi.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVariableNomi, this.gridBagConstraintsVariableNomi);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVariableNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVariableNomi, this.gridBagConstraintsVariableNomi);								
		
		
		/*
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVariableNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVariableNomi, this.gridBagConstraintsVariableNomi);
		*/		
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVariableNomi.gridx =0;
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVariableNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVariableNomi, this.gridBagConstraintsVariableNomi);
				
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVariableNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVariableNomi, this.gridBagConstraintsVariableNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VariableNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVariableNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVariableNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosVariableNomi.setLayout(gridaBagLayoutBusquedasParametrosVariableNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVariableNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVariableNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVariableNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVariableNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVariableNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVariableNomi, this.gridBagConstraintsVariableNomi);
			
			
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVariableNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVariableNomi, this.gridBagConstraintsVariableNomi);
		
			
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVariableNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVariableNomi, this.gridBagConstraintsVariableNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVariableNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVariableNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVariableNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVariableNomi.setName("jPanelReporteDinamicoVariableNomi"); 
		
		this.jPanelReporteDinamicoVariableNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVariableNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVariableNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVariableNomi.setLayout(gridaBagLayoutReporteDinamicoVariableNomi);
		
		
		this.jInternalFrameReporteDinamicoVariableNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVariableNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVariableNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVariableNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVariableNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVariableNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVariableNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVariableNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVariableNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoVariableNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoVariableNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVariableNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVariableNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVariableNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Variable Nominas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVariableNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteVariableNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVariableNomi.add(this.jLabelColumnasSelectReporteVariableNomi, this.gridBagConstraintsVariableNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVariableNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteVariableNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVariableNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVariableNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVariableNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVariableNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVariableNomi=new JScrollPane(this.jListColumnasSelectReporteVariableNomi);
			
			this.jScrollColumnasSelectReporteVariableNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVariableNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVariableNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVariableNomi.add(this.jListColumnasSelectReporteVariableNomi, this.gridBagConstraintsVariableNomi);
		this.jPanelReporteDinamicoVariableNomi.add(this.jScrollColumnasSelectReporteVariableNomi, this.gridBagConstraintsVariableNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVariableNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteVariableNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVariableNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteVariableNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVariableNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVariableNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVariableNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVariableNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVariableNomi=new JScrollPane(this.jListRelacionesSelectReporteVariableNomi);
			
			this.jScrollRelacionesSelectReporteVariableNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVariableNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVariableNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVariableNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVariableNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoVariableNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVariableNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVariableNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVariableNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVariableNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVariableNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVariableNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVariableNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVariableNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVariableNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVariableNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVariableNomi = new JLabelMe();

		this.jLabelConGraficoDinamicoVariableNomi.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVariableNomi.add(this.jLabelConGraficoDinamicoVariableNomi, this.gridBagConstraintsVariableNomi);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVariableNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVariableNomi.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVariableNomi.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVariableNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVariableNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVariableNomi.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVariableNomi.add(this.jCheckBoxConGraficoDinamicoVariableNomi, this.gridBagConstraintsVariableNomi);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVariableNomi = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVariableNomi.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVariableNomi.add(this.jLabelColumnaCategoriaGraficoVariableNomi, this.gridBagConstraintsVariableNomi);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVariableNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVariableNomi.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVariableNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVariableNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVariableNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVariableNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVariableNomi.add(this.jComboBoxColumnaCategoriaGraficoVariableNomi, this.gridBagConstraintsVariableNomi);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVariableNomi = new JLabelMe();

		this.jLabelColumnaCategoriaValorVariableNomi.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVariableNomi.add(this.jLabelColumnaCategoriaValorVariableNomi, this.gridBagConstraintsVariableNomi);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVariableNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVariableNomi.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVariableNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVariableNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVariableNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVariableNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVariableNomi.add(this.jComboBoxColumnaCategoriaValorVariableNomi, this.gridBagConstraintsVariableNomi);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVariableNomi = new JLabelMe();

		this.jLabelColumnasValoresGraficoVariableNomi.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVariableNomi.add(this.jLabelColumnasValoresGraficoVariableNomi, this.gridBagConstraintsVariableNomi);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVariableNomi = new JList<Reporte>();
		this.jListColumnasValoresGraficoVariableNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVariableNomi.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVariableNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVariableNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVariableNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVariableNomi=new JScrollPane(this.jListColumnasValoresGraficoVariableNomi);
			
			this.jScrollColumnasValoresGraficoVariableNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVariableNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVariableNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVariableNomi.add(this.jListColumnasSelectReporteVariableNomi, this.gridBagConstraintsVariableNomi);
		this.jPanelReporteDinamicoVariableNomi.add(this.jScrollColumnasValoresGraficoVariableNomi, this.gridBagConstraintsVariableNomi);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVariableNomi = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVariableNomi.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVariableNomi.add(this.jLabelTiposGraficosReportesDinamicoVariableNomi, this.gridBagConstraintsVariableNomi);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVariableNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVariableNomi.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVariableNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVariableNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVariableNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVariableNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVariableNomi.add(this.jComboBoxTiposGraficosReportesDinamicoVariableNomi, this.gridBagConstraintsVariableNomi);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVariableNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVariableNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVariableNomi.add(this.jLabelGenerarExcelReporteDinamicoVariableNomi, this.gridBagConstraintsVariableNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVariableNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVariableNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVariableNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVariableNomi.setToolTipText("Generar EXCEL"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVariableNomi.add(this.jButtonGenerarExcelReporteDinamicoVariableNomi, this.gridBagConstraintsVariableNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVariableNomi.add(this.jComboBoxTiposReportesDinamicoVariableNomi, this.gridBagConstraintsVariableNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVariableNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVariableNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVariableNomi.add(this.jLabelTiposArchivoReporteDinamicoVariableNomi, this.gridBagConstraintsVariableNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVariableNomi.add(this.jComboBoxTiposArchivosReportesDinamicoVariableNomi, this.gridBagConstraintsVariableNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVariableNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVariableNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVariableNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVariableNomi.setToolTipText("Generar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVariableNomi.add(this.jButtonGenerarReporteDinamicoVariableNomi, this.gridBagConstraintsVariableNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVariableNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVariableNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVariableNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVariableNomi.setToolTipText("Cancelar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVariableNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVariableNomi.add(this.jButtonCerrarReporteDinamicoVariableNomi, this.gridBagConstraintsVariableNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVariableNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVariableNomi= new JScrollPane(jPanelReporteDinamicoVariableNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVariableNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVariableNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVariableNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Variable Nominas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVariableNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVariableNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVariableNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVariableNomi);
		this.jInternalFrameReporteDinamicoVariableNomi.getContentPane().add(this.jScrollPanelReporteDinamicoVariableNomi, this.gridBagConstraintsVariableNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVariableNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVariableNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVariableNomi.setName("jPanelImportacionVariableNomi"); 
		
		this.jPanelImportacionVariableNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVariableNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVariableNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVariableNomi.setLayout(gridaBagLayoutImportacionVariableNomi);
		
		
		this.jInternalFrameImportacionVariableNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVariableNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVariableNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVariableNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVariableNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVariableNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVariableNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVariableNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVariableNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVariableNomi.setResizable(true);
	    this.jInternalFrameImportacionVariableNomi.setClosable(true);
	    this.jInternalFrameImportacionVariableNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVariableNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVariableNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVariableNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVariableNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVariableNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVariableNomi.setResizable(true);
	    this.jInternalFrameImportacionVariableNomi.setClosable(true);
	    this.jInternalFrameImportacionVariableNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVariableNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVariableNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVariableNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Variable Nominas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVariableNomi = new JLabelMe();

		this.jLabelArchivoImportacionVariableNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVariableNomi.add(this.jLabelArchivoImportacionVariableNomi, this.gridBagConstraintsVariableNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVariableNomi = new JFileChooser();		
		this.jFileChooserImportacionVariableNomi.setToolTipText("ESCOGER ARCHIVO"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVariableNomi = new JButtonMe();
		this.jButtonAbrirImportacionVariableNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVariableNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVariableNomi.setToolTipText("Generar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsVariableNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVariableNomi.add(this.jButtonAbrirImportacionVariableNomi, this.gridBagConstraintsVariableNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVariableNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionVariableNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVariableNomi.add(this.jLabelPathArchivoImportacionVariableNomi, this.gridBagConstraintsVariableNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVariableNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVariableNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVariableNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVariableNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsVariableNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVariableNomi.add(this.jTextFieldPathArchivoImportacionVariableNomi, this.gridBagConstraintsVariableNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVariableNomi = new JButtonMe();
		this.jButtonGenerarImportacionVariableNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVariableNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVariableNomi.setToolTipText("Generar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsVariableNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVariableNomi.add(this.jButtonGenerarImportacionVariableNomi, this.gridBagConstraintsVariableNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVariableNomi = new JButtonMe();
		this.jButtonCerrarImportacionVariableNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVariableNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVariableNomi.setToolTipText("Cancelar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVariableNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsVariableNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVariableNomi.add(this.jButtonCerrarImportacionVariableNomi, this.gridBagConstraintsVariableNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVariableNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionVariableNomi= new JScrollPane(jPanelImportacionVariableNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsVariableNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVariableNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVariableNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVariableNomi);
		this.jInternalFrameImportacionVariableNomi.getContentPane().add(this.jScrollPanelImportacionVariableNomi, this.gridBagConstraintsVariableNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVariableNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVariableNomi = new JButtonMe();
			this.jButtonAbrirOrderByVariableNomi.setText("Orden");
			this.jButtonAbrirOrderByVariableNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVariableNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVariableNomi";
			inputMap = this.jButtonAbrirOrderByVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVariableNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByVariableNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVariableNomi.setName("jPanelOrderByVariableNomi"); 
			
			this.jPanelOrderByVariableNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVariableNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVariableNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVariableNomi.setLayout(gridaBagLayoutOrderByVariableNomi);
			
			
			this.jTableDatosVariableNomiOrderBy = new JTableMe();        
			this.jTableDatosVariableNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVariableNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVariableNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVariableNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVariableNomiOrderBy.setViewportView(this.jTableDatosVariableNomiOrderBy);
			this.jTableDatosVariableNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVariableNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVariableNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVariableNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVariableNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVariableNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVariableNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVariableNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVariableNomi.setTitle("Orden");
			this.jInternalFrameOrderByVariableNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVariableNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVariableNomi.setResizable(true);
			this.jInternalFrameOrderByVariableNomi.setClosable(true);
			this.jInternalFrameOrderByVariableNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVariableNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVariableNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVariableNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Variable Nominas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVariableNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVariableNomi.ipady =150;
				
			this.jPanelOrderByVariableNomi.add(jScrollPanelDatosVariableNomiOrderBy, this.gridBagConstraintsVariableNomi);//this.jTableDatosVariableNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVariableNomi = new JButtonMe();
			this.jButtonCerrarOrderByVariableNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVariableNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVariableNomi.setToolTipText("Cancelar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVariableNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVariableNomi.add(this.jButtonCerrarOrderByVariableNomi, this.gridBagConstraintsVariableNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVariableNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByVariableNomi= new JScrollPane(jPanelOrderByVariableNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsVariableNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVariableNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVariableNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVariableNomi);
			
			this.jInternalFrameOrderByVariableNomi.getContentPane().add(this.jScrollPanelOrderByVariableNomi, this.gridBagConstraintsVariableNomi);			
		
		} else {
			this.jButtonAbrirOrderByVariableNomi = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.variablenomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVariableNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVariableNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVariableNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosVariableNomi.getRowHeight();//VariableNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VariableNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVariableNomi.isSelected()) {
					iHeightTable=VariableNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VariableNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VariableNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VariableNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVariableNomi.isSelected()) {
					iHeightTable=VariableNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VariableNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VariableNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVariableNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVariableNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVariableNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVariableNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVariableNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVariableNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVariableNomi!=null && this.jInternalFrameOrderByVariableNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVariableNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVariableNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVariableNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVariableNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVariableNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVariableNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVariableNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVariableNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVariableNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVariableNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=variablenomiLogic.getVariableNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=variablenomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VariableNomi> TraerVariableNomiBeans(List<VariableNomi> variablenomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(VariableNomi variablenomi:variablenomis) {
					
				if(!(VariableNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VariableNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					variablenomi.setsDetalleGeneralEntityReporte(VariableNomiConstantesFunciones.getVariableNomiDescripcion(variablenomi));
										
						
					
						
					
				} else  {
							
					//variablenomi.setsDetalleGeneralEntityReporte(variablenomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//variablenomibeans.add(variablenomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return variablenomis;
    }
	//PARA REPORTES FIN
}
