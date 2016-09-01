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
import com.bydan.erp.nomina.util.PreguntaNomiConstantesFunciones;

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
public class PreguntaNomiJInternalFrame extends PreguntaNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPreguntaNomi;
	
	protected JMenuBar jmenuBarPreguntaNomi;
	
	protected JMenu jmenuPreguntaNomi;
	protected JMenu jmenuDatosPreguntaNomi;
	protected JMenu jmenuArchivoPreguntaNomi;
	protected JMenu jmenuAccionesPreguntaNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPreguntaNomi;	
	protected GridBagConstraints gridBagConstraintsPreguntaNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PreguntaNomiDetalleFormJInternalFrame jInternalFrameDetalleFormPreguntaNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPreguntaNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPreguntaNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected FactorNomiBeanSwingJInternalFrame factornomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factornomi="";
	
	public PreguntaNomiSessionBean preguntanomiSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public FactorNomiSessionBean factornomiSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PreguntaNomi> preguntanomis;		
	public List<PreguntaNomi> preguntanomisEliminados;	
	public List<PreguntaNomi> preguntanomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPreguntaNomi;		
	protected JButton jButtonAbrirOrderByPreguntaNomi;
	
	
	//protected JPanel jPanelOrderByPreguntaNomi;
	//public JScrollPane jScrollPanelOrderByPreguntaNomi;	
	//protected JButton jButtonCerrarOrderByPreguntaNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PreguntaNomiLogic preguntanomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPreguntaNomi;
	public JScrollPane jScrollPanelDatosEdicionPreguntaNomi;
	public JScrollPane jScrollPanelDatosGeneralPreguntaNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosPreguntaNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPreguntaNomi;
	//public JScrollPane jScrollPanelImportacionPreguntaNomi;
	
	
	
	protected JPanel jPanelAccionesPreguntaNomi;
	
    protected JPanel jPanelPaginacionPreguntaNomi;
    protected JPanel jPanelParametrosReportesPreguntaNomi;
	protected JPanel jPanelParametrosReportesAccionesPreguntaNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PreguntaNomi;
	protected JPanel jPanelParametrosAuxiliar2PreguntaNomi;
	protected JPanel jPanelParametrosAuxiliar3PreguntaNomi;
	protected JPanel jPanelParametrosAuxiliar4PreguntaNomi;
	//protected JPanel jPanelParametrosAuxiliar5PreguntaNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoPreguntaNomi;
	//protected JPanel jPanelImportacionPreguntaNomi;
	
	
	public JTable jTableDatosPreguntaNomi;
	
	
	
	//public JTable jTableDatosPreguntaNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPreguntaNomi;
	protected JButton jButtonDuplicarPreguntaNomi;
	protected JButton jButtonCopiarPreguntaNomi;
	protected JButton jButtonVerFormPreguntaNomi;
	protected JButton jButtonNuevoRelacionesPreguntaNomi;
	protected JButton jButtonModificarPreguntaNomi;
	
    protected JButton jButtonGuardarCambiosTablaPreguntaNomi;
	protected JButton jButtonCerrarPreguntaNomi;
	
	
	protected JButton jButtonRecargarInformacionPreguntaNomi;
	protected JButton jButtonProcesarInformacionPreguntaNomi;
	
	
	protected JButton jButtonAnterioresPreguntaNomi;
	protected JButton jButtonSiguientesPreguntaNomi;
	protected JButton jButtonNuevoGuardarCambiosPreguntaNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPreguntaNomi;
	//protected JButton jButtonCerrarReporteDinamicoPreguntaNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoPreguntaNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionPreguntaNomi;
	//protected JButton jButtonGenerarImportacionPreguntaNomi;
	//protected JButton jButtonCerrarImportacionPreguntaNomi;
	//protected JFileChooser jFileChooserImportacionPreguntaNomi;
	//protected File fileImportacionPreguntaNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPreguntaNomi;
	protected JButton jButtonDuplicarToolBarPreguntaNomi;
	protected JButton jButtonNuevoRelacionesToolBarPreguntaNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarPreguntaNomi;
	protected JButton jButtonCopiarToolBarPreguntaNomi;
	protected JButton jButtonVerFormToolBarPreguntaNomi;
	public JButton jButtonGuardarCambiosTablaToolBarPreguntaNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarPreguntaNomi;
	protected JButton jButtonCerrarToolBarPreguntaNomi;
	
	protected JButton jButtonRecargarInformacionToolBarPreguntaNomi;
	protected JButton jButtonProcesarInformacionToolBarPreguntaNomi;
	protected JButton jButtonAnterioresToolBarPreguntaNomi;
	protected JButton jButtonSiguientesToolBarPreguntaNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarPreguntaNomi;
	protected JButton jButtonAbrirOrderByToolBarPreguntaNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPreguntaNomi;
	protected JMenuItem jMenuItemDuplicarPreguntaNomi;
	protected JMenuItem jMenuItemNuevoRelacionesPreguntaNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPreguntaNomi;
	protected JMenuItem jMenuItemCopiarPreguntaNomi;
	protected JMenuItem jMenuItemVerFormPreguntaNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaPreguntaNomi;
	protected JMenuItem jMenuItemCerrarPreguntaNomi;
	protected JMenuItem jMenuItemDetalleCerrarPreguntaNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPreguntaNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarPreguntaNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionPreguntaNomi;
	protected JMenuItem jMenuItemProcesarInformacionPreguntaNomi;
	protected JMenuItem jMenuItemAnterioresPreguntaNomi;
	protected JMenuItem jMenuItemSiguientesPreguntaNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPreguntaNomi;
	protected JMenuItem jMenuItemAbrirOrderByPreguntaNomi;
	protected JMenuItem jMenuItemMostrarOcultarPreguntaNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPreguntaNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPreguntaNomi;
	protected JCheckBox jCheckBoxSeleccionadosPreguntaNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPreguntaNomi;
	protected JCheckBox jCheckBoxConGraficoReportePreguntaNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPreguntaNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPreguntaNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPreguntaNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPreguntaNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPreguntaNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPreguntaNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPreguntaNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPreguntaNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPreguntaNomi;
	protected JTextField jTextFieldValorCampoGeneralPreguntaNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePreguntaNomi;
	//public JList<Reporte> jListColumnasSelectReportePreguntaNomi;
	//public JScrollPane jScrollColumnasSelectReportePreguntaNomi;
	
	//public JLabel jLabelRelacionesSelectReportePreguntaNomi;
	//public JList<Reporte> jListRelacionesSelectReportePreguntaNomi;
	//public JScrollPane jScrollRelacionesSelectReportePreguntaNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPreguntaNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPreguntaNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPreguntaNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoPreguntaNomi;
	
		
	//public JLabel jLabelArchivoImportacionPreguntaNomi;	
	//public JLabel jLabelPathArchivoImportacionPreguntaNomi;
	//protected JTextField jTextFieldPathArchivoImportacionPreguntaNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPreguntaNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPreguntaNomi;
	
	//public JLabel jLabelColumnaCategoriaValorPreguntaNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPreguntaNomi;
	
	//public JLabel jLabelColumnasValoresGraficoPreguntaNomi;
	//public JList<Reporte> jListColumnasValoresGraficoPreguntaNomi;
	//public JScrollPane jScrollColumnasValoresGraficoPreguntaNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPreguntaNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPreguntaNomi;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPreguntaNomi;
	public JPanel jPanelFK_IdFactorNomiPreguntaNomi;
	public JButton jButtonFK_IdFactorNomiPreguntaNomi;
	
	public JPanel jPanelid_factor_nomiFK_IdFactorNomiPreguntaNomi;
	public JLabel jLabelid_factor_nomiFK_IdFactorNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi;
	public JButton jButtonid_factor_nomiFK_IdFactorNomiPreguntaNomi= new JButtonMe();
	public JButton jButtonid_factor_nomiFK_IdFactorNomiPreguntaNomiUpdate= new JButtonMe();
	public JButton jButtonid_factor_nomiFK_IdFactorNomiPreguntaNomiBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PreguntaNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPreguntaNomi)	{
		this.jButtonRecargarInformacionPreguntaNomi = jButtonRecargarInformacionPreguntaNomi;
	}
	
	public JButton getjButtonProcesarInformacionPreguntaNomi() {
		return this.jButtonProcesarInformacionPreguntaNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPreguntaNomi)	{
		this.jButtonProcesarInformacionPreguntaNomi = jButtonProcesarInformacionPreguntaNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionPreguntaNomi() {
		return this.jButtonRecargarInformacionPreguntaNomi;
	}
	
	
	public List<PreguntaNomi> getpreguntanomis() {
		return this.preguntanomis;
	}

	public void setpreguntanomis(List<PreguntaNomi> preguntanomis) {
		this.preguntanomis = preguntanomis;
	}
	
	public List<PreguntaNomi> getpreguntanomisAux() {
		return this.preguntanomisAux;
	}

	public void setpreguntanomisAux(List<PreguntaNomi> preguntanomisAux) {
		this.preguntanomisAux = preguntanomisAux;
	}
	
	public List<PreguntaNomi> getpreguntanomisEliminados() {
		return this.preguntanomisEliminados;
	}

	public void setPreguntaNomisEliminados(List<PreguntaNomi> preguntanomisEliminados) {
		this.preguntanomisEliminados = preguntanomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPreguntaNomi() {
		return jComboBoxTiposSeleccionarPreguntaNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPreguntaNomi(
			JComboBox jComboBoxTiposSeleccionarPreguntaNomi) {
		this.jComboBoxTiposSeleccionarPreguntaNomi = jComboBoxTiposSeleccionarPreguntaNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPreguntaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPreguntaNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPreguntaNomi() {
		return jTextFieldValorCampoGeneralPreguntaNomi;
	}

	public void setjTextFieldValorCampoGeneralPreguntaNomi(
			JTextField jTextFieldValorCampoGeneralPreguntaNomi) {
		this.jTextFieldValorCampoGeneralPreguntaNomi = jTextFieldValorCampoGeneralPreguntaNomi;
	}

	public void setBorderResaltarValorCampoGeneralPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPreguntaNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPreguntaNomi() {
		return this.jCheckBoxSeleccionarTodosPreguntaNomi;
	}

	public void setjCheckBoxSeleccionarTodosPreguntaNomi(
			JCheckBox jCheckBoxSeleccionarTodosPreguntaNomi) {
		this.jCheckBoxSeleccionarTodosPreguntaNomi = jCheckBoxSeleccionarTodosPreguntaNomi;
	}

	public void setBorderResaltarSeleccionarTodosPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPreguntaNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPreguntaNomi() {
		return this.jCheckBoxSeleccionadosPreguntaNomi;
	}

	public void setjCheckBoxSeleccionadosPreguntaNomi(
			JCheckBox jCheckBoxSeleccionadosPreguntaNomi) {
		this.jCheckBoxSeleccionadosPreguntaNomi = jCheckBoxSeleccionadosPreguntaNomi;
	}
	
	public void setBorderResaltarSeleccionadosPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPreguntaNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPreguntaNomi() {
		return this.jComboBoxTiposArchivosReportesPreguntaNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPreguntaNomi(
			JComboBox jComboBoxTiposArchivosReportesPreguntaNomi) {
		this.jComboBoxTiposArchivosReportesPreguntaNomi = jComboBoxTiposArchivosReportesPreguntaNomi;
	}

	public void setBorderResaltarTiposArchivosReportesPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPreguntaNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPreguntaNomi() {
		return this.jComboBoxTiposReportesPreguntaNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPreguntaNomi(
			JComboBox jComboBoxTiposReportesPreguntaNomi) {
		this.jComboBoxTiposReportesPreguntaNomi = jComboBoxTiposReportesPreguntaNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPreguntaNomi() {
	//	return jComboBoxTiposReportesDinamicoPreguntaNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPreguntaNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoPreguntaNomi) {
	//	this.jComboBoxTiposReportesDinamicoPreguntaNomi = jComboBoxTiposReportesDinamicoPreguntaNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPreguntaNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoPreguntaNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPreguntaNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPreguntaNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPreguntaNomi = jComboBoxTiposArchivosReportesDinamicoPreguntaNomi;
	//}
	
	public void setBorderResaltarTiposReportesPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPreguntaNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPreguntaNomi() {
		return this.jComboBoxTiposGraficosReportesPreguntaNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPreguntaNomi(
			JComboBox jComboBoxTiposGraficosReportesPreguntaNomi) {
		this.jComboBoxTiposGraficosReportesPreguntaNomi = jComboBoxTiposGraficosReportesPreguntaNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPreguntaNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPreguntaNomi() {
		return this.jComboBoxTiposPaginacionPreguntaNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPreguntaNomi(
			JComboBox jComboBoxTiposPaginacionPreguntaNomi) {
		this.jComboBoxTiposPaginacionPreguntaNomi = jComboBoxTiposPaginacionPreguntaNomi;
	}
	
	public void setBorderResaltarTiposPaginacionPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPreguntaNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPreguntaNomi() {
		return this.jComboBoxTiposRelacionesPreguntaNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPreguntaNomi() {
		return this.jComboBoxTiposAccionesPreguntaNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPreguntaNomi(
			JComboBox jComboBoxTiposRelacionesPreguntaNomi) {
		this.jComboBoxTiposRelacionesPreguntaNomi = jComboBoxTiposRelacionesPreguntaNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPreguntaNomi(
			JComboBox jComboBoxTiposAccionesPreguntaNomi) {
		this.jComboBoxTiposAccionesPreguntaNomi = jComboBoxTiposAccionesPreguntaNomi;
	}
	
	public void setBorderResaltarTiposRelacionesPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPreguntaNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPreguntaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPreguntaNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPreguntaNomi() {
	//	return jCheckBoxConGraficoDinamicoPreguntaNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoPreguntaNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoPreguntaNomi) {
	//	this.jCheckBoxConGraficoDinamicoPreguntaNomi = jCheckBoxConGraficoDinamicoPreguntaNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPreguntaNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPreguntaNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPreguntaNomi .setBorder(borderResaltar);		
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
		this.preguntanomiSessionBean=new PreguntaNomiSessionBean();
		
		this.preguntanomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.preguntanomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.preguntanomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PreguntaNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pregunta Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
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
		
		PreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPreguntaNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPreguntaNomi,this.jTtoolBarPreguntaNomi,
							"nuevo","nuevo","Nuevo"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPreguntaNomi,this.jTtoolBarPreguntaNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPreguntaNomi,this.jTtoolBarPreguntaNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPreguntaNomi,this.jTtoolBarPreguntaNomi,
							"duplicar","duplicar","Duplicar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPreguntaNomi,this.jTtoolBarPreguntaNomi,
							"copiar","copiar","Copiar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPreguntaNomi,this.jTtoolBarPreguntaNomi,
							"ver_form","ver_form","Ver"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPreguntaNomi,this.jTtoolBarPreguntaNomi,
							"recargar","recargar","Recargar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPreguntaNomi,this.jTtoolBarPreguntaNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPreguntaNomi,this.jTtoolBarPreguntaNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPreguntaNomi,this.jTtoolBarPreguntaNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPreguntaNomi,this.jTtoolBarPreguntaNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPreguntaNomi,this.jTtoolBarPreguntaNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPreguntaNomi,this.jTtoolBarPreguntaNomi,
							"cerrar","cerrar","Salir"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPreguntaNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPreguntaNomi;
			
				this.jButtonProcesarInformacionToolBarPreguntaNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPreguntaNomi;
				
		//protected JButton jButtonModificarToolBarPreguntaNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPreguntaNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPreguntaNomi=new JMenuMe("General");
		this.jmenuArchivoPreguntaNomi=new JMenuMe("Archivo");
		this.jmenuAccionesPreguntaNomi=new JMenuMe("Acciones");
		this.jmenuDatosPreguntaNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPreguntaNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPreguntaNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPreguntaNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPreguntaNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPreguntaNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPreguntaNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPreguntaNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPreguntaNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPreguntaNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPreguntaNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPreguntaNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPreguntaNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPreguntaNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPreguntaNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPreguntaNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPreguntaNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPreguntaNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPreguntaNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPreguntaNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPreguntaNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPreguntaNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPreguntaNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPreguntaNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPreguntaNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPreguntaNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPreguntaNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPreguntaNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPreguntaNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPreguntaNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPreguntaNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPreguntaNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPreguntaNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPreguntaNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPreguntaNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPreguntaNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPreguntaNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPreguntaNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPreguntaNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPreguntaNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPreguntaNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPreguntaNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPreguntaNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPreguntaNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPreguntaNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPreguntaNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPreguntaNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPreguntaNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPreguntaNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPreguntaNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPreguntaNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPreguntaNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPreguntaNomi.add(this.jMenuItemCerrarPreguntaNomi);
			
			this.jmenuAccionesPreguntaNomi.add(this.jMenuItemNuevoPreguntaNomi);
			this.jmenuAccionesPreguntaNomi.add(this.jMenuItemNuevoGuardarCambiosPreguntaNomi);
			this.jmenuAccionesPreguntaNomi.add(this.jMenuItemNuevoRelacionesPreguntaNomi);
			this.jmenuAccionesPreguntaNomi.add(this.jMenuItemGuardarCambiosTablaPreguntaNomi);		
			this.jmenuAccionesPreguntaNomi.add(this.jMenuItemDuplicarPreguntaNomi);		
			this.jmenuAccionesPreguntaNomi.add(this.jMenuItemCopiarPreguntaNomi);		
			this.jmenuAccionesPreguntaNomi.add(this.jMenuItemVerFormPreguntaNomi);		
			
			this.jmenuDatosPreguntaNomi.add(this.jMenuItemRecargarInformacionPreguntaNomi);				
			this.jmenuDatosPreguntaNomi.add(this.jMenuItemAnterioresPreguntaNomi);				
			this.jmenuDatosPreguntaNomi.add(this.jMenuItemSiguientesPreguntaNomi);				
			this.jmenuDatosPreguntaNomi.add(this.jMenuItemAbrirOrderByPreguntaNomi);				
			this.jmenuDatosPreguntaNomi.add(this.jMenuItemMostrarOcultarPreguntaNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPreguntaNomi.add(this.jMenuItemGuardarCambiosPreguntaNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPreguntaNomi.add(this.jmenuArchivoPreguntaNomi);		
			this.jmenuBarPreguntaNomi.add(this.jmenuAccionesPreguntaNomi);		
			this.jmenuBarPreguntaNomi.add(this.jmenuDatosPreguntaNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPreguntaNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPreguntaNomi() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdFactorNomiPreguntaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFactorNomiPreguntaNomi.setToolTipText("Buscar Por Factor Nomi ");
		this.jButtonFK_IdFactorNomiPreguntaNomi= new JButtonMe();
		this.jButtonFK_IdFactorNomiPreguntaNomi.setText("Buscar");
		this.jButtonFK_IdFactorNomiPreguntaNomi.setToolTipText("Buscar Por Factor Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFactorNomiPreguntaNomi,"buscar_button","Buscar Por Factor Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFactorNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_factor_nomiFK_IdFactorNomiPreguntaNomi = new JLabelMe();
		jLabelid_factor_nomiFK_IdFactorNomiPreguntaNomi.setText("Factor Nomi :");
		jLabelid_factor_nomiFK_IdFactorNomiPreguntaNomi.setToolTipText("Factor Nomi");
		jLabelid_factor_nomiFK_IdFactorNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_factor_nomiFK_IdFactorNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_factor_nomiFK_IdFactorNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_factor_nomiFK_IdFactorNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi= new JComboBoxMe();
		jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPreguntaNomi=new JTabbedPane();


		this.jTabbedPaneBusquedasPreguntaNomi.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPreguntaNomi.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPreguntaNomi.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPreguntaNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPreguntaNomi,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePreguntaNomi = new PreguntaNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pregunta Nomi DATOS");
			this.jInternalFrameDetalleFormPreguntaNomi = new PreguntaNomiDetalleFormJInternalFrame(jDesktopPane,this.preguntanomiSessionBean.getConGuardarRelaciones(),this.preguntanomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPreguntaNomi = null;//new PreguntaNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPreguntaNomi= new GridBagLayout();
		
		
		this.jTableDatosPreguntaNomi = new JTableMe();      
		
		String sToolTipPreguntaNomi="";
		sToolTipPreguntaNomi=PreguntaNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPreguntaNomi+="(Nomina.PreguntaNomi)";
		}
		
		if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipPreguntaNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPreguntaNomi.setToolTipText(sToolTipPreguntaNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPreguntaNomi);
		this.jTableDatosPreguntaNomi.setAutoCreateRowSorter(true);
		this.jTableDatosPreguntaNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPreguntaNomi.setRowSelectionAllowed(true);
		this.jTableDatosPreguntaNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPreguntaNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPreguntaNomi = new JButtonMe();
		this.jButtonDuplicarPreguntaNomi = new JButtonMe();
		this.jButtonCopiarPreguntaNomi = new JButtonMe();
		this.jButtonVerFormPreguntaNomi = new JButtonMe();
		this.jButtonNuevoRelacionesPreguntaNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPreguntaNomi = new JButtonMe();
		this.jButtonCerrarPreguntaNomi = new JButtonMe();
		
		this.jScrollPanelDatosPreguntaNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralPreguntaNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Pregunta Nomi";
		
		if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pregunta Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosPreguntaNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPreguntaNomi.setToolTipText("Acciones");
        this.jPanelAccionesPreguntaNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPreguntaNomi=new ReporteDinamicoJInternalFrame(PreguntaNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPreguntaNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPreguntaNomi=new ImportacionJInternalFrame(PreguntaNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPreguntaNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPreguntaNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByPreguntaNomi.setText("Orden");
		this.jButtonAbrirOrderByPreguntaNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPreguntaNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPreguntaNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPreguntaNomi,false,this);
			
			//this.cargarOrderByPreguntaNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPreguntaNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPreguntaNomi,true,this);
			
			//this.cargarOrderByPreguntaNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPreguntaNomi.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosPreguntaNomi.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosPreguntaNomi.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosPreguntaNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPreguntaNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPreguntaNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPreguntaNomi.setText("Nuevo");
		this.jButtonDuplicarPreguntaNomi.setText("Duplicar");
		this.jButtonCopiarPreguntaNomi.setText("Copiar");
		this.jButtonVerFormPreguntaNomi.setText("Ver");
		this.jButtonNuevoRelacionesPreguntaNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPreguntaNomi.setText("Guardar");
		this.jButtonCerrarPreguntaNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPreguntaNomi,"nuevo_button","Nuevo",this.preguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPreguntaNomi,"duplicar_button","Duplicar",this.preguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPreguntaNomi,"copiar_button","Copiar",this.preguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPreguntaNomi,"ver_form","Ver",this.preguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPreguntaNomi,"nuevorelaciones_button","Nuevo Rel",this.preguntanomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPreguntaNomi,"guardarcambiostabla_button","Guardar",this.preguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPreguntaNomi,"cerrar_button","Salir",this.preguntanomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPreguntaNomi.setToolTipText("Nuevo"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPreguntaNomi.setToolTipText("Duplicar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPreguntaNomi.setToolTipText("Copiar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPreguntaNomi.setToolTipText("Ver"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPreguntaNomi.setToolTipText("Nuevo Rel"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPreguntaNomi.setToolTipText("Guardar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPreguntaNomi.setToolTipText("Salir"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPreguntaNomi";
		inputMap = this.jButtonNuevoPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPreguntaNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPreguntaNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarPreguntaNomi";
		inputMap = this.jButtonDuplicarPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPreguntaNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPreguntaNomi"));
		
		//COPIAR
		sMapKey = "CopiarPreguntaNomi";
		inputMap = this.jButtonCopiarPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPreguntaNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPreguntaNomi"));
		
		//VEr FORM
		sMapKey = "VerFormPreguntaNomi";
		inputMap = this.jButtonVerFormPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPreguntaNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPreguntaNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPreguntaNomi";
		inputMap = this.jButtonNuevoRelacionesPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPreguntaNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPreguntaNomi";
		inputMap = this.jButtonModificarPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPreguntaNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPreguntaNomi";
		inputMap = this.jButtonCerrarPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPreguntaNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPreguntaNomi";
		inputMap = this.jButtonGuardarCambiosTablaPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPreguntaNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PreguntaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PreguntaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PreguntaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PreguntaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PreguntaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPreguntaNomi.setName("jPanelParametrosReportesPreguntaNomi"); 
		
		this.jPanelParametrosReportesAccionesPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPreguntaNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPreguntaNomi.setName("jPanelParametrosReportesAccionesPreguntaNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPreguntaNomi = new JButtonMe();
		this.jButtonRecargarInformacionPreguntaNomi.setText("Recargar");
		this.jButtonRecargarInformacionPreguntaNomi.setToolTipText("Recargar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPreguntaNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPreguntaNomi = new JButtonMe();
		this.jButtonProcesarInformacionPreguntaNomi.setText("Procesar");
		this.jButtonProcesarInformacionPreguntaNomi.setToolTipText("Procesar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPreguntaNomi.setVisible(false);
			
		this.jButtonProcesarInformacionPreguntaNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPreguntaNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPreguntaNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPreguntaNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPreguntaNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPreguntaNomi.setText("TIPO");       
		this.jComboBoxTiposReportesPreguntaNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPreguntaNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPreguntaNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPreguntaNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionPreguntaNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPreguntaNomi.setText("Accion");
		this.jComboBoxTiposRelacionesPreguntaNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPreguntaNomi.setText("Accion");
		this.jComboBoxTiposAccionesPreguntaNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPreguntaNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarPreguntaNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPreguntaNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPreguntaNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPreguntaNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPreguntaNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPreguntaNomi = new JLabelMe();
		
		this.jLabelAccionesPreguntaNomi.setText("Acciones");		
		this.jLabelAccionesPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPreguntaNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPreguntaNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPreguntaNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPreguntaNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPreguntaNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPreguntaNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPreguntaNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPreguntaNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPreguntaNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePreguntaNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePreguntaNomi.setText("Graf.");
		this.jCheckBoxConGraficoReportePreguntaNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPreguntaNomi = new JButtonMe();
		//this.jButtonAnterioresPreguntaNomi.setText("<<");
        this.jButtonAnterioresPreguntaNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPreguntaNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPreguntaNomi = new JButtonMe();
		//this.jButtonSiguientesPreguntaNomi.setText(">>");
        this.jButtonSiguientesPreguntaNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPreguntaNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPreguntaNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPreguntaNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosPreguntaNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPreguntaNomi,"nuevoguardarcambios_button","Nue",this.preguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPreguntaNomi";
		inputMap = this.jButtonNuevoGuardarCambiosPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPreguntaNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPreguntaNomi";
		inputMap = this.jButtonRecargarInformacionPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPreguntaNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPreguntaNomi";
		inputMap = this.jButtonSiguientesPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPreguntaNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPreguntaNomi";
		inputMap = this.jButtonAnterioresPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPreguntaNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPreguntaNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPreguntaNomi.setMinimumSize(new Dimension(this.getWidth(),PreguntaNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PreguntaNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPreguntaNomi.setMaximumSize(new Dimension(this.getWidth(),PreguntaNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PreguntaNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPreguntaNomi.setPreferredSize(new Dimension(this.getWidth(),PreguntaNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PreguntaNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPreguntaNomi = new GridBagLayout();

			this.jPanelPaginacionPreguntaNomi.setLayout(gridaBagLayoutPaginacionPreguntaNomi);						
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.gridy = 0;
			this.gridBagConstraintsPreguntaNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPreguntaNomi.add(this.jButtonAnterioresPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
					
						
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPreguntaNomi.gridy = 0;
			
			this.jPanelPaginacionPreguntaNomi.add(this.jButtonNuevoGuardarCambiosPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
						
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPreguntaNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPreguntaNomi.gridy = 0;
			this.jPanelPaginacionPreguntaNomi.add(this.jButtonSiguientesPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.gridy = 1;
			this.gridBagConstraintsPreguntaNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPreguntaNomi.add(this.jButtonNuevoPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
				this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPreguntaNomi.gridy = 1;
				this.gridBagConstraintsPreguntaNomi.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPreguntaNomi.add(this.jButtonNuevoRelacionesPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
			}
			
			
			if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
				this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPreguntaNomi.gridy = 1;
				this.gridBagConstraintsPreguntaNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPreguntaNomi.add(this.jButtonGuardarCambiosTablaPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
			}
			
			
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.gridy = 1;
			this.gridBagConstraintsPreguntaNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPreguntaNomi.add(this.jButtonDuplicarPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.gridy = 1;
			this.gridBagConstraintsPreguntaNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPreguntaNomi.add(this.jButtonCopiarPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.gridy = 1;
			this.gridBagConstraintsPreguntaNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPreguntaNomi.add(this.jButtonVerFormPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.gridy = 1;
			this.gridBagConstraintsPreguntaNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPreguntaNomi.add(this.jButtonCerrarPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		
		
		
		this.jButtonRecargarInformacionPreguntaNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPreguntaNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPreguntaNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPreguntaNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPreguntaNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPreguntaNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPreguntaNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPreguntaNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPreguntaNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPreguntaNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPreguntaNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPreguntaNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPreguntaNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPreguntaNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPreguntaNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPreguntaNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPreguntaNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPreguntaNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPreguntaNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPreguntaNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPreguntaNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPreguntaNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPreguntaNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPreguntaNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPreguntaNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPreguntaNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPreguntaNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePreguntaNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePreguntaNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePreguntaNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPreguntaNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPreguntaNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPreguntaNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPreguntaNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPreguntaNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPreguntaNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPreguntaNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPreguntaNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PreguntaNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PreguntaNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PreguntaNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PreguntaNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPreguntaNomi.setLayout(gridaBagParametrosReportesPreguntaNomi);
			this.jPanelParametrosReportesAccionesPreguntaNomi.setLayout(gridaBagParametrosReportesAccionesPreguntaNomi);
			
			
			this.jPanelParametrosAuxiliar1PreguntaNomi.setLayout(gridaBagParametrosAuxiliar1PreguntaNomi);
			this.jPanelParametrosAuxiliar2PreguntaNomi.setLayout(gridaBagParametrosAuxiliar2PreguntaNomi);
			this.jPanelParametrosAuxiliar3PreguntaNomi.setLayout(gridaBagParametrosAuxiliar3PreguntaNomi);
			this.jPanelParametrosAuxiliar4PreguntaNomi.setLayout(gridaBagParametrosAuxiliar4PreguntaNomi);
			//this.jPanelParametrosAuxiliar5PreguntaNomi.setLayout(gridaBagParametrosAuxiliar2PreguntaNomi);			
			
			
			
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreguntaNomi.add(this.jButtonRecargarInformacionPreguntaNomi, this.gridBagConstraintsPreguntaNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PreguntaNomi.add(this.jComboBoxTiposPaginacionPreguntaNomi, this.gridBagConstraintsPreguntaNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PreguntaNomi.add(this.jCheckBoxConAltoMaximoTablaPreguntaNomi, this.gridBagConstraintsPreguntaNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PreguntaNomi.add(this.jComboBoxTiposArchivosReportesPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreguntaNomi.add(this.jPanelParametrosAuxiliar1PreguntaNomi, this.gridBagConstraintsPreguntaNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PreguntaNomi.add(this.jComboBoxTiposReportesPreguntaNomi, this.gridBagConstraintsPreguntaNomi);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreguntaNomi.add(this.jPanelParametrosAuxiliar4PreguntaNomi, this.gridBagConstraintsPreguntaNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreguntaNomi.add(this.jComboBoxTiposReportesPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPreguntaNomi.add(this.jCheckBoxGenerarReportePreguntaNomi, this.gridBagConstraintsPreguntaNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreguntaNomi.add(this.jPanelParametrosAuxiliar2PreguntaNomi, this.gridBagConstraintsPreguntaNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPreguntaNomi.add(this.jLabelAccionesPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
				this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPreguntaNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPreguntaNomi.add(this.jButtonAbrirOrderByPreguntaNomi, this.gridBagConstraintsPreguntaNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreguntaNomi.add(this.jComboBoxTiposSeleccionarPreguntaNomi, this.gridBagConstraintsPreguntaNomi);			
			
			
			/*
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPreguntaNomi.add(this.jCheckBoxSeleccionarTodosPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PreguntaNomi.add(this.jCheckBoxSeleccionarTodosPreguntaNomi, this.gridBagConstraintsPreguntaNomi);															
				
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPreguntaNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PreguntaNomi.add(this.jCheckBoxSeleccionadosPreguntaNomi, this.gridBagConstraintsPreguntaNomi);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPreguntaNomi.add(this.jPanelParametrosAuxiliar3PreguntaNomi, this.gridBagConstraintsPreguntaNomi);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreguntaNomi.add(this.jComboBoxTiposRelacionesPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
				
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreguntaNomi.add(this.jComboBoxTiposAccionesPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
	
				
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPreguntaNomi.add(this.jTextFieldValorCampoGeneralPreguntaNomi, this.gridBagConstraintsPreguntaNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPreguntaNomi = new GridBagLayout();

			this.jScrollPanelDatosPreguntaNomi.setLayout(gridaBagLayoutDatosPreguntaNomi);
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.gridy = 0;
			this.gridBagConstraintsPreguntaNomi.gridx = 0;
			
			this.jScrollPanelDatosPreguntaNomi.add(this.jTableDatosPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPreguntaNomi.setViewportView(this.jTableDatosPreguntaNomi);
		this.jTableDatosPreguntaNomi.setFillsViewportHeight(true);
		this.jTableDatosPreguntaNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPreguntaNomi= new GridBagLayout();
		this.jPanelAccionesPreguntaNomi.setLayout(gridaBagLayoutAccionesPreguntaNomi);
		
		
		/*	
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaNomi.gridy = 0;
		this.gridBagConstraintsPreguntaNomi.gridx = 0;
			
		this.jPanelAccionesPreguntaNomi.add(this.jButtonNuevoPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdFactorNomiPreguntaNomi= new GridBagLayout();
		gridaBagLayoutFK_IdFactorNomiPreguntaNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFactorNomiPreguntaNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFactorNomiPreguntaNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFactorNomiPreguntaNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFactorNomiPreguntaNomi.setLayout(gridaBagLayoutFK_IdFactorNomiPreguntaNomi);

		gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreguntaNomi.gridy = 0;
		gridBagConstraintsPreguntaNomi.gridx = 0;
		jPanelFK_IdFactorNomiPreguntaNomi.add(jLabelid_factor_nomiFK_IdFactorNomiPreguntaNomi, gridBagConstraintsPreguntaNomi);

		gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreguntaNomi.gridy = 0;
		gridBagConstraintsPreguntaNomi.gridx = 1;
		jPanelFK_IdFactorNomiPreguntaNomi.add(jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi, gridBagConstraintsPreguntaNomi);

		gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPreguntaNomi.gridy = 1;
		gridBagConstraintsPreguntaNomi.gridx =1;
		jPanelFK_IdFactorNomiPreguntaNomi.add(jButtonFK_IdFactorNomiPreguntaNomi, gridBagConstraintsPreguntaNomi);

		jTabbedPaneBusquedasPreguntaNomi.addTab("1.-Por Factor Nomi ", jPanelFK_IdFactorNomiPreguntaNomi);
		jTabbedPaneBusquedasPreguntaNomi.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPreguntaNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPreguntaNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.preguntanomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();						
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPreguntaNomi.gridx = 0;		
			//this.gridBagConstraintsPreguntaNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPreguntaNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPreguntaNomi, this.gridBagConstraintsPreguntaNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPreguntaNomi.gridx = 0;		
		//this.gridBagConstraintsPreguntaNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPreguntaNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPreguntaNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPreguntaNomi.gridx = 0;		
			this.gridBagConstraintsPreguntaNomi.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPreguntaNomi.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPreguntaNomi, this.gridBagConstraintsPreguntaNomi);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPreguntaNomi, this.gridBagConstraintsPreguntaNomi);								
		
		
		/*
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		*/		
		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPreguntaNomi.gridx =0;
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPreguntaNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
				
		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PreguntaNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPreguntaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPreguntaNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosPreguntaNomi.setLayout(gridaBagLayoutBusquedasParametrosPreguntaNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPreguntaNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPreguntaNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPreguntaNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPreguntaNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
			
			
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		
			
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPreguntaNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPreguntaNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPreguntaNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPreguntaNomi.setName("jPanelReporteDinamicoPreguntaNomi"); 
		
		this.jPanelReporteDinamicoPreguntaNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPreguntaNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPreguntaNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPreguntaNomi.setLayout(gridaBagLayoutReporteDinamicoPreguntaNomi);
		
		
		this.jInternalFrameReporteDinamicoPreguntaNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPreguntaNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePreguntaNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPreguntaNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPreguntaNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPreguntaNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPreguntaNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPreguntaNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPreguntaNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoPreguntaNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoPreguntaNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPreguntaNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPreguntaNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPreguntaNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pregunta Nomis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePreguntaNomi = new JLabelMe();

		this.jLabelColumnasSelectReportePreguntaNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPreguntaNomi.add(this.jLabelColumnasSelectReportePreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePreguntaNomi = new JList<Reporte>();
		this.jListColumnasSelectReportePreguntaNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePreguntaNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePreguntaNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePreguntaNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePreguntaNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePreguntaNomi=new JScrollPane(this.jListColumnasSelectReportePreguntaNomi);
			
			this.jScrollColumnasSelectReportePreguntaNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePreguntaNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePreguntaNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPreguntaNomi.add(this.jListColumnasSelectReportePreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		this.jPanelReporteDinamicoPreguntaNomi.add(this.jScrollColumnasSelectReportePreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePreguntaNomi = new JLabelMe();

		this.jLabelRelacionesSelectReportePreguntaNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPreguntaNomi.add(this.jLabelRelacionesSelectReportePreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePreguntaNomi = new JList<Reporte>();
		this.jListRelacionesSelectReportePreguntaNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePreguntaNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePreguntaNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePreguntaNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePreguntaNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePreguntaNomi=new JScrollPane(this.jListRelacionesSelectReportePreguntaNomi);
			
			this.jScrollRelacionesSelectReportePreguntaNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePreguntaNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePreguntaNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPreguntaNomi.add(this.jListRelacionesSelectReportePreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		this.jPanelReporteDinamicoPreguntaNomi.add(this.jScrollRelacionesSelectReportePreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPreguntaNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPreguntaNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoPreguntaNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPreguntaNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPreguntaNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPreguntaNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPreguntaNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPreguntaNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPreguntaNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPreguntaNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPreguntaNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPreguntaNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPreguntaNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPreguntaNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPreguntaNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreguntaNomi.add(this.jLabelGenerarExcelReporteDinamicoPreguntaNomi, this.gridBagConstraintsPreguntaNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPreguntaNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPreguntaNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPreguntaNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPreguntaNomi.setToolTipText("Generar EXCEL"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPreguntaNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPreguntaNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPreguntaNomi.add(this.jButtonGenerarExcelReporteDinamicoPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPreguntaNomi.add(this.jComboBoxTiposReportesDinamicoPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPreguntaNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPreguntaNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPreguntaNomi.add(this.jLabelTiposArchivoReporteDinamicoPreguntaNomi, this.gridBagConstraintsPreguntaNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPreguntaNomi.add(this.jComboBoxTiposArchivosReportesDinamicoPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPreguntaNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPreguntaNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPreguntaNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPreguntaNomi.setToolTipText("Generar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPreguntaNomi.add(this.jButtonGenerarReporteDinamicoPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPreguntaNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPreguntaNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPreguntaNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPreguntaNomi.setToolTipText("Cancelar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPreguntaNomi.add(this.jButtonCerrarReporteDinamicoPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPreguntaNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPreguntaNomi= new JScrollPane(jPanelReporteDinamicoPreguntaNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPreguntaNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPreguntaNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPreguntaNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pregunta Nomis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPreguntaNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPreguntaNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPreguntaNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPreguntaNomi);
		this.jInternalFrameReporteDinamicoPreguntaNomi.getContentPane().add(this.jScrollPanelReporteDinamicoPreguntaNomi, this.gridBagConstraintsPreguntaNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPreguntaNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPreguntaNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPreguntaNomi.setName("jPanelImportacionPreguntaNomi"); 
		
		this.jPanelImportacionPreguntaNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPreguntaNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPreguntaNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPreguntaNomi.setLayout(gridaBagLayoutImportacionPreguntaNomi);
		
		
		this.jInternalFrameImportacionPreguntaNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPreguntaNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPreguntaNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePreguntaNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPreguntaNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPreguntaNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPreguntaNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPreguntaNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPreguntaNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPreguntaNomi.setResizable(true);
	    this.jInternalFrameImportacionPreguntaNomi.setClosable(true);
	    this.jInternalFrameImportacionPreguntaNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPreguntaNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPreguntaNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPreguntaNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPreguntaNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPreguntaNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPreguntaNomi.setResizable(true);
	    this.jInternalFrameImportacionPreguntaNomi.setClosable(true);
	    this.jInternalFrameImportacionPreguntaNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPreguntaNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPreguntaNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPreguntaNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pregunta Nomis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPreguntaNomi = new JLabelMe();

		this.jLabelArchivoImportacionPreguntaNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPreguntaNomi.add(this.jLabelArchivoImportacionPreguntaNomi, this.gridBagConstraintsPreguntaNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPreguntaNomi = new JFileChooser();		
		this.jFileChooserImportacionPreguntaNomi.setToolTipText("ESCOGER ARCHIVO"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPreguntaNomi = new JButtonMe();
		this.jButtonAbrirImportacionPreguntaNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPreguntaNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPreguntaNomi.setToolTipText("Generar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPreguntaNomi.add(this.jButtonAbrirImportacionPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPreguntaNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionPreguntaNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPreguntaNomi.add(this.jLabelPathArchivoImportacionPreguntaNomi, this.gridBagConstraintsPreguntaNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPreguntaNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPreguntaNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPreguntaNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPreguntaNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPreguntaNomi.add(this.jTextFieldPathArchivoImportacionPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPreguntaNomi = new JButtonMe();
		this.jButtonGenerarImportacionPreguntaNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPreguntaNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPreguntaNomi.setToolTipText("Generar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPreguntaNomi.add(this.jButtonGenerarImportacionPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPreguntaNomi = new JButtonMe();
		this.jButtonCerrarImportacionPreguntaNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPreguntaNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPreguntaNomi.setToolTipText("Cancelar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPreguntaNomi.add(this.jButtonCerrarImportacionPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPreguntaNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionPreguntaNomi= new JScrollPane(jPanelImportacionPreguntaNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsPreguntaNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPreguntaNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPreguntaNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPreguntaNomi);
		this.jInternalFrameImportacionPreguntaNomi.getContentPane().add(this.jScrollPanelImportacionPreguntaNomi, this.gridBagConstraintsPreguntaNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPreguntaNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPreguntaNomi = new JButtonMe();
			this.jButtonAbrirOrderByPreguntaNomi.setText("Orden");
			this.jButtonAbrirOrderByPreguntaNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPreguntaNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPreguntaNomi";
			inputMap = this.jButtonAbrirOrderByPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPreguntaNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByPreguntaNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPreguntaNomi.setName("jPanelOrderByPreguntaNomi"); 
			
			this.jPanelOrderByPreguntaNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPreguntaNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPreguntaNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPreguntaNomi.setLayout(gridaBagLayoutOrderByPreguntaNomi);
			
			
			this.jTableDatosPreguntaNomiOrderBy = new JTableMe();        
			this.jTableDatosPreguntaNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPreguntaNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPreguntaNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPreguntaNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPreguntaNomiOrderBy.setViewportView(this.jTableDatosPreguntaNomiOrderBy);
			this.jTableDatosPreguntaNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPreguntaNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPreguntaNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPreguntaNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPreguntaNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePreguntaNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPreguntaNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPreguntaNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPreguntaNomi.setTitle("Orden");
			this.jInternalFrameOrderByPreguntaNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPreguntaNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPreguntaNomi.setResizable(true);
			this.jInternalFrameOrderByPreguntaNomi.setClosable(true);
			this.jInternalFrameOrderByPreguntaNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPreguntaNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPreguntaNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPreguntaNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pregunta Nomis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPreguntaNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPreguntaNomi.ipady =150;
				
			this.jPanelOrderByPreguntaNomi.add(jScrollPanelDatosPreguntaNomiOrderBy, this.gridBagConstraintsPreguntaNomi);//this.jTableDatosPreguntaNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPreguntaNomi = new JButtonMe();
			this.jButtonCerrarOrderByPreguntaNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPreguntaNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPreguntaNomi.setToolTipText("Cancelar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPreguntaNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPreguntaNomi.add(this.jButtonCerrarOrderByPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPreguntaNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByPreguntaNomi= new JScrollPane(jPanelOrderByPreguntaNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsPreguntaNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPreguntaNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPreguntaNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPreguntaNomi);
			
			this.jInternalFrameOrderByPreguntaNomi.getContentPane().add(this.jScrollPanelOrderByPreguntaNomi, this.gridBagConstraintsPreguntaNomi);			
		
		} else {
			this.jButtonAbrirOrderByPreguntaNomi = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.preguntanomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPreguntaNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPreguntaNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPreguntaNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPreguntaNomi.getRowHeight();//PreguntaNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PreguntaNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPreguntaNomi.isSelected()) {
					iHeightTable=PreguntaNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PreguntaNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PreguntaNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PreguntaNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPreguntaNomi.isSelected()) {
					iHeightTable=PreguntaNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PreguntaNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PreguntaNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPreguntaNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPreguntaNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPreguntaNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPreguntaNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPreguntaNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPreguntaNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPreguntaNomi!=null && this.jInternalFrameOrderByPreguntaNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPreguntaNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPreguntaNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPreguntaNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPreguntaNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPreguntaNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPreguntaNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPreguntaNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPreguntaNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPreguntaNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPreguntaNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=preguntanomiLogic.getPreguntaNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=preguntanomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PreguntaNomi> TraerPreguntaNomiBeans(List<PreguntaNomi> preguntanomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(PreguntaNomi preguntanomi:preguntanomis) {
					
				if(!(PreguntaNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PreguntaNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					preguntanomi.setsDetalleGeneralEntityReporte(PreguntaNomiConstantesFunciones.getPreguntaNomiDescripcion(preguntanomi));
										
						
					
					

					if(preguntanomi.getFormatoNomiPreguntaNomis()!=null && Funciones.existeClass(classes,FormatoNomiPreguntaNomi.class)) {
						try{preguntanomi.setformatonomipreguntanomisDescripcionReporte(new JRBeanCollectionDataSource(FormatoNomiPreguntaNomiJInternalFrame.TraerFormatoNomiPreguntaNomiBeans(preguntanomi.getFormatoNomiPreguntaNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(preguntanomi.getDetalleEvaluacionNomis()!=null && Funciones.existeClass(classes,DetalleEvaluacionNomi.class)) {
						try{preguntanomi.setdetalleevaluacionnomisDescripcionReporte(new JRBeanCollectionDataSource(DetalleEvaluacionNomiJInternalFrame.TraerDetalleEvaluacionNomiBeans(preguntanomi.getDetalleEvaluacionNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//preguntanomi.setsDetalleGeneralEntityReporte(preguntanomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//preguntanomibeans.add(preguntanomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return preguntanomis;
    }
	//PARA REPORTES FIN
}
