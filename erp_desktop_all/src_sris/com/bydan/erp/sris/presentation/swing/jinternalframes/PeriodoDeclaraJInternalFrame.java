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
package com.bydan.erp.sris.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.PeriodoDeclaraConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class PeriodoDeclaraJInternalFrame extends PeriodoDeclaraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPeriodoDeclara;
	
	protected JMenuBar jmenuBarPeriodoDeclara;
	
	protected JMenu jmenuPeriodoDeclara;
	protected JMenu jmenuDatosPeriodoDeclara;
	protected JMenu jmenuArchivoPeriodoDeclara;
	protected JMenu jmenuAccionesPeriodoDeclara;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPeriodoDeclara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPeriodoDeclara;	
	protected GridBagConstraints gridBagConstraintsPeriodoDeclara;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PeriodoDeclaraDetalleFormJInternalFrame jInternalFrameDetalleFormPeriodoDeclara;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPeriodoDeclara;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPeriodoDeclara;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
		
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PeriodoDeclara> periododeclaras;		
	public List<PeriodoDeclara> periododeclarasEliminados;	
	public List<PeriodoDeclara> periododeclarasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPeriodoDeclara;		
	protected JButton jButtonAbrirOrderByPeriodoDeclara;
	
	
	//protected JPanel jPanelOrderByPeriodoDeclara;
	//public JScrollPane jScrollPanelOrderByPeriodoDeclara;	
	//protected JButton jButtonCerrarOrderByPeriodoDeclara;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PeriodoDeclaraLogic periododeclaraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPeriodoDeclara;
	public JScrollPane jScrollPanelDatosEdicionPeriodoDeclara;
	public JScrollPane jScrollPanelDatosGeneralPeriodoDeclara;
    
	
	
	//public JScrollPane jScrollPanelDatosPeriodoDeclaraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPeriodoDeclara;
	//public JScrollPane jScrollPanelImportacionPeriodoDeclara;
	
	
	
	protected JPanel jPanelAccionesPeriodoDeclara;
	
    protected JPanel jPanelPaginacionPeriodoDeclara;
    protected JPanel jPanelParametrosReportesPeriodoDeclara;
	protected JPanel jPanelParametrosReportesAccionesPeriodoDeclara;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PeriodoDeclara;
	protected JPanel jPanelParametrosAuxiliar2PeriodoDeclara;
	protected JPanel jPanelParametrosAuxiliar3PeriodoDeclara;
	protected JPanel jPanelParametrosAuxiliar4PeriodoDeclara;
	//protected JPanel jPanelParametrosAuxiliar5PeriodoDeclara;
	
	
	
	//protected JPanel jPanelReporteDinamicoPeriodoDeclara;
	//protected JPanel jPanelImportacionPeriodoDeclara;
	
	
	public JTable jTableDatosPeriodoDeclara;
	
	
	
	//public JTable jTableDatosPeriodoDeclaraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPeriodoDeclara;
	protected JButton jButtonDuplicarPeriodoDeclara;
	protected JButton jButtonCopiarPeriodoDeclara;
	protected JButton jButtonVerFormPeriodoDeclara;
	protected JButton jButtonNuevoRelacionesPeriodoDeclara;
	protected JButton jButtonModificarPeriodoDeclara;
	
    protected JButton jButtonGuardarCambiosTablaPeriodoDeclara;
	protected JButton jButtonCerrarPeriodoDeclara;
	
	
	protected JButton jButtonRecargarInformacionPeriodoDeclara;
	protected JButton jButtonProcesarInformacionPeriodoDeclara;
	
	
	protected JButton jButtonAnterioresPeriodoDeclara;
	protected JButton jButtonSiguientesPeriodoDeclara;
	protected JButton jButtonNuevoGuardarCambiosPeriodoDeclara;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPeriodoDeclara;
	//protected JButton jButtonCerrarReporteDinamicoPeriodoDeclara;
	//protected JButton jButtonGenerarExcelReporteDinamicoPeriodoDeclara;	
	
	
	
	//protected JButton jButtonAbrirImportacionPeriodoDeclara;
	//protected JButton jButtonGenerarImportacionPeriodoDeclara;
	//protected JButton jButtonCerrarImportacionPeriodoDeclara;
	//protected JFileChooser jFileChooserImportacionPeriodoDeclara;
	//protected File fileImportacionPeriodoDeclara;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPeriodoDeclara;
	protected JButton jButtonDuplicarToolBarPeriodoDeclara;
	protected JButton jButtonNuevoRelacionesToolBarPeriodoDeclara;
	
	
	public JButton jButtonGuardarCambiosToolBarPeriodoDeclara;
	protected JButton jButtonCopiarToolBarPeriodoDeclara;
	protected JButton jButtonVerFormToolBarPeriodoDeclara;
	public JButton jButtonGuardarCambiosTablaToolBarPeriodoDeclara;
	protected JButton jButtonMostrarOcultarTablaToolBarPeriodoDeclara;
	protected JButton jButtonCerrarToolBarPeriodoDeclara;
	
	protected JButton jButtonRecargarInformacionToolBarPeriodoDeclara;
	protected JButton jButtonProcesarInformacionToolBarPeriodoDeclara;
	protected JButton jButtonAnterioresToolBarPeriodoDeclara;
	protected JButton jButtonSiguientesToolBarPeriodoDeclara;
	protected JButton jButtonNuevoGuardarCambiosToolBarPeriodoDeclara;
	protected JButton jButtonAbrirOrderByToolBarPeriodoDeclara;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPeriodoDeclara;
	protected JMenuItem jMenuItemDuplicarPeriodoDeclara;
	protected JMenuItem jMenuItemNuevoRelacionesPeriodoDeclara;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPeriodoDeclara;
	protected JMenuItem jMenuItemCopiarPeriodoDeclara;
	protected JMenuItem jMenuItemVerFormPeriodoDeclara;
	protected JMenuItem jMenuItemGuardarCambiosTablaPeriodoDeclara;
	protected JMenuItem jMenuItemCerrarPeriodoDeclara;
	protected JMenuItem jMenuItemDetalleCerrarPeriodoDeclara;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPeriodoDeclara;
	protected JMenuItem jMenuItemDetalleMostarOcultarPeriodoDeclara;
	
	protected JMenuItem jMenuItemRecargarInformacionPeriodoDeclara;
	protected JMenuItem jMenuItemProcesarInformacionPeriodoDeclara;
	protected JMenuItem jMenuItemAnterioresPeriodoDeclara;
	protected JMenuItem jMenuItemSiguientesPeriodoDeclara;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPeriodoDeclara;
	protected JMenuItem jMenuItemAbrirOrderByPeriodoDeclara;
	protected JMenuItem jMenuItemMostrarOcultarPeriodoDeclara;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPeriodoDeclara;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPeriodoDeclara;
	protected JCheckBox jCheckBoxSeleccionadosPeriodoDeclara;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPeriodoDeclara;
	protected JCheckBox jCheckBoxConGraficoReportePeriodoDeclara;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPeriodoDeclara;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPeriodoDeclara;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPeriodoDeclara;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPeriodoDeclara;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPeriodoDeclara;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPeriodoDeclara;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPeriodoDeclara;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPeriodoDeclara;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPeriodoDeclara;
	protected JTextField jTextFieldValorCampoGeneralPeriodoDeclara;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePeriodoDeclara;
	//public JList<Reporte> jListColumnasSelectReportePeriodoDeclara;
	//public JScrollPane jScrollColumnasSelectReportePeriodoDeclara;
	
	//public JLabel jLabelRelacionesSelectReportePeriodoDeclara;
	//public JList<Reporte> jListRelacionesSelectReportePeriodoDeclara;
	//public JScrollPane jScrollRelacionesSelectReportePeriodoDeclara;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPeriodoDeclara;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPeriodoDeclara;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPeriodoDeclara;
	//public JLabel jLabelTiposArchivoReporteDinamicoPeriodoDeclara;
	
		
	//public JLabel jLabelArchivoImportacionPeriodoDeclara;	
	//public JLabel jLabelPathArchivoImportacionPeriodoDeclara;
	//protected JTextField jTextFieldPathArchivoImportacionPeriodoDeclara;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPeriodoDeclara;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPeriodoDeclara;
	
	//public JLabel jLabelColumnaCategoriaValorPeriodoDeclara;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPeriodoDeclara;
	
	//public JLabel jLabelColumnasValoresGraficoPeriodoDeclara;
	//public JList<Reporte> jListColumnasValoresGraficoPeriodoDeclara;
	//public JScrollPane jScrollColumnasValoresGraficoPeriodoDeclara;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPeriodoDeclara;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPeriodoDeclara;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPeriodoDeclara;
	public JPanel jPanelFK_IdAnioPeriodoDeclara;
	public JButton jButtonFK_IdAnioPeriodoDeclara;
	public JPanel jPanelFK_IdMesPeriodoDeclara;
	public JButton jButtonFK_IdMesPeriodoDeclara;
	
	public JPanel jPanelid_anioFK_IdAnioPeriodoDeclara;
	public JLabel jLabelid_anioFK_IdAnioPeriodoDeclara;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioPeriodoDeclara;
	public JButton jButtonid_anioFK_IdAnioPeriodoDeclara= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioPeriodoDeclaraUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioPeriodoDeclaraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesPeriodoDeclara;
	public JLabel jLabelid_mesFK_IdMesPeriodoDeclara;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesPeriodoDeclara;
	public JButton jButtonid_mesFK_IdMesPeriodoDeclara= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesPeriodoDeclaraUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesPeriodoDeclaraBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PeriodoDeclaraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PeriodoDeclara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoDeclaraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PeriodoDeclara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoDeclaraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PeriodoDeclara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoDeclaraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PeriodoDeclara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPeriodoDeclara)	{
		this.jButtonRecargarInformacionPeriodoDeclara = jButtonRecargarInformacionPeriodoDeclara;
	}
	
	public JButton getjButtonProcesarInformacionPeriodoDeclara() {
		return this.jButtonProcesarInformacionPeriodoDeclara;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPeriodoDeclara)	{
		this.jButtonProcesarInformacionPeriodoDeclara = jButtonProcesarInformacionPeriodoDeclara;
	}
	
	
	public JButton getjButtonRecargarInformacionPeriodoDeclara() {
		return this.jButtonRecargarInformacionPeriodoDeclara;
	}
	
	
	public List<PeriodoDeclara> getperiododeclaras() {
		return this.periododeclaras;
	}

	public void setperiododeclaras(List<PeriodoDeclara> periododeclaras) {
		this.periododeclaras = periododeclaras;
	}
	
	public List<PeriodoDeclara> getperiododeclarasAux() {
		return this.periododeclarasAux;
	}

	public void setperiododeclarasAux(List<PeriodoDeclara> periododeclarasAux) {
		this.periododeclarasAux = periododeclarasAux;
	}
	
	public List<PeriodoDeclara> getperiododeclarasEliminados() {
		return this.periododeclarasEliminados;
	}

	public void setPeriodoDeclarasEliminados(List<PeriodoDeclara> periododeclarasEliminados) {
		this.periododeclarasEliminados = periododeclarasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPeriodoDeclara() {
		return jComboBoxTiposSeleccionarPeriodoDeclara;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPeriodoDeclara(
			JComboBox jComboBoxTiposSeleccionarPeriodoDeclara) {
		this.jComboBoxTiposSeleccionarPeriodoDeclara = jComboBoxTiposSeleccionarPeriodoDeclara;
	}
	
	public void setBorderResaltarTiposSeleccionarPeriodoDeclara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPeriodoDeclara.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPeriodoDeclara .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPeriodoDeclara() {
		return jTextFieldValorCampoGeneralPeriodoDeclara;
	}

	public void setjTextFieldValorCampoGeneralPeriodoDeclara(
			JTextField jTextFieldValorCampoGeneralPeriodoDeclara) {
		this.jTextFieldValorCampoGeneralPeriodoDeclara = jTextFieldValorCampoGeneralPeriodoDeclara;
	}

	public void setBorderResaltarValorCampoGeneralPeriodoDeclara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoDeclara.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPeriodoDeclara .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPeriodoDeclara() {
		return this.jCheckBoxSeleccionarTodosPeriodoDeclara;
	}

	public void setjCheckBoxSeleccionarTodosPeriodoDeclara(
			JCheckBox jCheckBoxSeleccionarTodosPeriodoDeclara) {
		this.jCheckBoxSeleccionarTodosPeriodoDeclara = jCheckBoxSeleccionarTodosPeriodoDeclara;
	}

	public void setBorderResaltarSeleccionarTodosPeriodoDeclara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoDeclara.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPeriodoDeclara .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPeriodoDeclara() {
		return this.jCheckBoxSeleccionadosPeriodoDeclara;
	}

	public void setjCheckBoxSeleccionadosPeriodoDeclara(
			JCheckBox jCheckBoxSeleccionadosPeriodoDeclara) {
		this.jCheckBoxSeleccionadosPeriodoDeclara = jCheckBoxSeleccionadosPeriodoDeclara;
	}
	
	public void setBorderResaltarSeleccionadosPeriodoDeclara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoDeclara.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPeriodoDeclara .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPeriodoDeclara() {
		return this.jComboBoxTiposArchivosReportesPeriodoDeclara;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPeriodoDeclara(
			JComboBox jComboBoxTiposArchivosReportesPeriodoDeclara) {
		this.jComboBoxTiposArchivosReportesPeriodoDeclara = jComboBoxTiposArchivosReportesPeriodoDeclara;
	}

	public void setBorderResaltarTiposArchivosReportesPeriodoDeclara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoDeclara.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPeriodoDeclara .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPeriodoDeclara() {
		return this.jComboBoxTiposReportesPeriodoDeclara;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPeriodoDeclara(
			JComboBox jComboBoxTiposReportesPeriodoDeclara) {
		this.jComboBoxTiposReportesPeriodoDeclara = jComboBoxTiposReportesPeriodoDeclara;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPeriodoDeclara() {
	//	return jComboBoxTiposReportesDinamicoPeriodoDeclara;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPeriodoDeclara(
	//		JComboBox jComboBoxTiposReportesDinamicoPeriodoDeclara) {
	//	this.jComboBoxTiposReportesDinamicoPeriodoDeclara = jComboBoxTiposReportesDinamicoPeriodoDeclara;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPeriodoDeclara() {
	//	return jComboBoxTiposArchivosReportesDinamicoPeriodoDeclara;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPeriodoDeclara(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPeriodoDeclara) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPeriodoDeclara = jComboBoxTiposArchivosReportesDinamicoPeriodoDeclara;
	//}
	
	public void setBorderResaltarTiposReportesPeriodoDeclara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoDeclara.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPeriodoDeclara .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPeriodoDeclara() {
		return this.jComboBoxTiposGraficosReportesPeriodoDeclara;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPeriodoDeclara(
			JComboBox jComboBoxTiposGraficosReportesPeriodoDeclara) {
		this.jComboBoxTiposGraficosReportesPeriodoDeclara = jComboBoxTiposGraficosReportesPeriodoDeclara;
	}
	
	public void setBorderResaltarTiposGraficosReportesPeriodoDeclara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoDeclara.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPeriodoDeclara .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPeriodoDeclara() {
		return this.jComboBoxTiposPaginacionPeriodoDeclara;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPeriodoDeclara(
			JComboBox jComboBoxTiposPaginacionPeriodoDeclara) {
		this.jComboBoxTiposPaginacionPeriodoDeclara = jComboBoxTiposPaginacionPeriodoDeclara;
	}
	
	public void setBorderResaltarTiposPaginacionPeriodoDeclara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoDeclara.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPeriodoDeclara .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPeriodoDeclara() {
		return this.jComboBoxTiposRelacionesPeriodoDeclara;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPeriodoDeclara() {
		return this.jComboBoxTiposAccionesPeriodoDeclara;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPeriodoDeclara(
			JComboBox jComboBoxTiposRelacionesPeriodoDeclara) {
		this.jComboBoxTiposRelacionesPeriodoDeclara = jComboBoxTiposRelacionesPeriodoDeclara;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPeriodoDeclara(
			JComboBox jComboBoxTiposAccionesPeriodoDeclara) {
		this.jComboBoxTiposAccionesPeriodoDeclara = jComboBoxTiposAccionesPeriodoDeclara;
	}
	
	public void setBorderResaltarTiposRelacionesPeriodoDeclara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoDeclara.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPeriodoDeclara .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPeriodoDeclara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPeriodoDeclara.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPeriodoDeclara .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPeriodoDeclara() {
	//	return jCheckBoxConGraficoDinamicoPeriodoDeclara;
	//}

	//public void setjCheckBoxConGraficoDinamicoPeriodoDeclara(
	//		JCheckBox jCheckBoxConGraficoDinamicoPeriodoDeclara) {
	//	this.jCheckBoxConGraficoDinamicoPeriodoDeclara = jCheckBoxConGraficoDinamicoPeriodoDeclara;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPeriodoDeclara() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPeriodoDeclara.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPeriodoDeclara .setBorder(borderResaltar);		
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
		this.periododeclaraSessionBean=new PeriodoDeclaraSessionBean();
		
		this.periododeclaraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.periododeclaraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.periododeclaraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PeriodoDeclaraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PeriodoDeclaraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PeriodoDeclaraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PeriodoDeclaraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PeriodoDeclaraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Periodo Declara MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
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
		
		PeriodoDeclaraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PeriodoDeclara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPeriodoDeclara= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPeriodoDeclara,this.jTtoolBarPeriodoDeclara,
							"nuevo","nuevo","Nuevo"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPeriodoDeclara,this.jTtoolBarPeriodoDeclara,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPeriodoDeclara,this.jTtoolBarPeriodoDeclara,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPeriodoDeclara,this.jTtoolBarPeriodoDeclara,
							"duplicar","duplicar","Duplicar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPeriodoDeclara,this.jTtoolBarPeriodoDeclara,
							"copiar","copiar","Copiar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPeriodoDeclara,this.jTtoolBarPeriodoDeclara,
							"ver_form","ver_form","Ver"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPeriodoDeclara,this.jTtoolBarPeriodoDeclara,
							"recargar","recargar","Recargar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPeriodoDeclara,this.jTtoolBarPeriodoDeclara,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPeriodoDeclara,this.jTtoolBarPeriodoDeclara,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPeriodoDeclara,this.jTtoolBarPeriodoDeclara,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPeriodoDeclara,this.jTtoolBarPeriodoDeclara,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPeriodoDeclara,this.jTtoolBarPeriodoDeclara,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPeriodoDeclara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPeriodoDeclara,this.jTtoolBarPeriodoDeclara,
							"cerrar","cerrar","Salir"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPeriodoDeclara=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPeriodoDeclara;
			
				this.jButtonProcesarInformacionToolBarPeriodoDeclara=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPeriodoDeclara;
				
		//protected JButton jButtonModificarToolBarPeriodoDeclara;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPeriodoDeclara=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPeriodoDeclara=new JMenuMe("General");
		this.jmenuArchivoPeriodoDeclara=new JMenuMe("Archivo");
		this.jmenuAccionesPeriodoDeclara=new JMenuMe("Acciones");
		this.jmenuDatosPeriodoDeclara=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPeriodoDeclara= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPeriodoDeclara.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPeriodoDeclara,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPeriodoDeclara= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPeriodoDeclara.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPeriodoDeclara,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPeriodoDeclara= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPeriodoDeclara.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPeriodoDeclara,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPeriodoDeclara= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPeriodoDeclara.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPeriodoDeclara,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPeriodoDeclara= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPeriodoDeclara.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPeriodoDeclara,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPeriodoDeclara= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPeriodoDeclara.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPeriodoDeclara,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPeriodoDeclara= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPeriodoDeclara.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPeriodoDeclara,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPeriodoDeclara= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPeriodoDeclara.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPeriodoDeclara,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPeriodoDeclara= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPeriodoDeclara.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPeriodoDeclara,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPeriodoDeclara= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPeriodoDeclara.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPeriodoDeclara,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPeriodoDeclara= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPeriodoDeclara.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPeriodoDeclara,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPeriodoDeclara= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPeriodoDeclara.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPeriodoDeclara,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPeriodoDeclara= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPeriodoDeclara.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPeriodoDeclara,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPeriodoDeclara= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPeriodoDeclara.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPeriodoDeclara,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPeriodoDeclara= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPeriodoDeclara.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPeriodoDeclara,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPeriodoDeclara= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPeriodoDeclara.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPeriodoDeclara,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPeriodoDeclara= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPeriodoDeclara.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPeriodoDeclara,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPeriodoDeclara.add(this.jMenuItemCerrarPeriodoDeclara);
			
			this.jmenuAccionesPeriodoDeclara.add(this.jMenuItemNuevoPeriodoDeclara);
			this.jmenuAccionesPeriodoDeclara.add(this.jMenuItemNuevoGuardarCambiosPeriodoDeclara);
			this.jmenuAccionesPeriodoDeclara.add(this.jMenuItemNuevoRelacionesPeriodoDeclara);
			this.jmenuAccionesPeriodoDeclara.add(this.jMenuItemGuardarCambiosTablaPeriodoDeclara);		
			this.jmenuAccionesPeriodoDeclara.add(this.jMenuItemDuplicarPeriodoDeclara);		
			this.jmenuAccionesPeriodoDeclara.add(this.jMenuItemCopiarPeriodoDeclara);		
			this.jmenuAccionesPeriodoDeclara.add(this.jMenuItemVerFormPeriodoDeclara);		
			
			this.jmenuDatosPeriodoDeclara.add(this.jMenuItemRecargarInformacionPeriodoDeclara);				
			this.jmenuDatosPeriodoDeclara.add(this.jMenuItemAnterioresPeriodoDeclara);				
			this.jmenuDatosPeriodoDeclara.add(this.jMenuItemSiguientesPeriodoDeclara);				
			this.jmenuDatosPeriodoDeclara.add(this.jMenuItemAbrirOrderByPeriodoDeclara);				
			this.jmenuDatosPeriodoDeclara.add(this.jMenuItemMostrarOcultarPeriodoDeclara);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPeriodoDeclara.add(this.jMenuItemGuardarCambiosPeriodoDeclara);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPeriodoDeclara.add(this.jmenuArchivoPeriodoDeclara);		
			this.jmenuBarPeriodoDeclara.add(this.jmenuAccionesPeriodoDeclara);		
			this.jmenuBarPeriodoDeclara.add(this.jmenuDatosPeriodoDeclara);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPeriodoDeclara);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPeriodoDeclara() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioPeriodoDeclara=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioPeriodoDeclara.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioPeriodoDeclara= new JButtonMe();
		this.jButtonFK_IdAnioPeriodoDeclara.setText("Buscar");
		this.jButtonFK_IdAnioPeriodoDeclara.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioPeriodoDeclara,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioPeriodoDeclara = new JLabelMe();
		jLabelid_anioFK_IdAnioPeriodoDeclara.setText("Anio :");
		jLabelid_anioFK_IdAnioPeriodoDeclara.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioPeriodoDeclara= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesPeriodoDeclara=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesPeriodoDeclara.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesPeriodoDeclara= new JButtonMe();
		this.jButtonFK_IdMesPeriodoDeclara.setText("Buscar");
		this.jButtonFK_IdMesPeriodoDeclara.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesPeriodoDeclara,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesPeriodoDeclara = new JLabelMe();
		jLabelid_mesFK_IdMesPeriodoDeclara.setText("Mes :");
		jLabelid_mesFK_IdMesPeriodoDeclara.setToolTipText("Mes");
		jLabelid_mesFK_IdMesPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesPeriodoDeclara= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPeriodoDeclara=new JTabbedPane();


		this.jTabbedPaneBusquedasPeriodoDeclara.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPeriodoDeclara.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPeriodoDeclara.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPeriodoDeclara.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePeriodoDeclara = new PeriodoDeclaraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Periodo Declara DATOS");
			this.jInternalFrameDetalleFormPeriodoDeclara = new PeriodoDeclaraDetalleFormJInternalFrame(jDesktopPane,this.periododeclaraSessionBean.getConGuardarRelaciones(),this.periododeclaraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPeriodoDeclara = null;//new PeriodoDeclaraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPeriodoDeclara= new GridBagLayout();
		
		
		this.jTableDatosPeriodoDeclara = new JTableMe();      
		
		String sToolTipPeriodoDeclara="";
		sToolTipPeriodoDeclara=PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPeriodoDeclara+="(Sris.PeriodoDeclara)";
		}
		
		if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
			sToolTipPeriodoDeclara+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPeriodoDeclara.setToolTipText(sToolTipPeriodoDeclara);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPeriodoDeclara);
		this.jTableDatosPeriodoDeclara.setAutoCreateRowSorter(true);
		this.jTableDatosPeriodoDeclara.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPeriodoDeclara.setRowSelectionAllowed(true);
		this.jTableDatosPeriodoDeclara.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPeriodoDeclara,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPeriodoDeclara = new JButtonMe();
		this.jButtonDuplicarPeriodoDeclara = new JButtonMe();
		this.jButtonCopiarPeriodoDeclara = new JButtonMe();
		this.jButtonVerFormPeriodoDeclara = new JButtonMe();
		this.jButtonNuevoRelacionesPeriodoDeclara = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPeriodoDeclara = new JButtonMe();
		this.jButtonCerrarPeriodoDeclara = new JButtonMe();
		
		this.jScrollPanelDatosPeriodoDeclara = new JScrollPane();   
        this.jScrollPanelDatosGeneralPeriodoDeclara = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPeriodoDeclara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Periodo Declara";
		
		if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Declaras" + this.sPath));
		} else {
			this.jScrollPanelDatosPeriodoDeclara.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPeriodoDeclara.setToolTipText("Acciones");
        this.jPanelAccionesPeriodoDeclara.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPeriodoDeclara=new ReporteDinamicoJInternalFrame(PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPeriodoDeclara();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPeriodoDeclara=new ImportacionJInternalFrame(PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPeriodoDeclara();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPeriodoDeclara = new JButtonMe();
		
		this.jButtonAbrirOrderByPeriodoDeclara.setText("Orden");
		this.jButtonAbrirOrderByPeriodoDeclara.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPeriodoDeclara,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPeriodoDeclara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPeriodoDeclara=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPeriodoDeclara,false,this);
			
			//this.cargarOrderByPeriodoDeclara(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPeriodoDeclara=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPeriodoDeclara,true,this);
			
			//this.cargarOrderByPeriodoDeclara(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPeriodoDeclara.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosPeriodoDeclara.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosPeriodoDeclara.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosPeriodoDeclara.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPeriodoDeclara.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPeriodoDeclara.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPeriodoDeclara.setText("Nuevo");
		this.jButtonDuplicarPeriodoDeclara.setText("Duplicar");
		this.jButtonCopiarPeriodoDeclara.setText("Copiar");
		this.jButtonVerFormPeriodoDeclara.setText("Ver");
		this.jButtonNuevoRelacionesPeriodoDeclara.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPeriodoDeclara.setText("Guardar");
		this.jButtonCerrarPeriodoDeclara.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPeriodoDeclara,"nuevo_button","Nuevo",this.periododeclaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPeriodoDeclara,"duplicar_button","Duplicar",this.periododeclaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPeriodoDeclara,"copiar_button","Copiar",this.periododeclaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPeriodoDeclara,"ver_form","Ver",this.periododeclaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPeriodoDeclara,"nuevorelaciones_button","Nuevo Rel",this.periododeclaraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPeriodoDeclara,"guardarcambiostabla_button","Guardar",this.periododeclaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPeriodoDeclara,"cerrar_button","Salir",this.periododeclaraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPeriodoDeclara.setToolTipText("Nuevo"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPeriodoDeclara.setToolTipText("Duplicar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPeriodoDeclara.setToolTipText("Copiar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPeriodoDeclara.setToolTipText("Ver"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPeriodoDeclara.setToolTipText("Nuevo Rel"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPeriodoDeclara.setToolTipText("Guardar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPeriodoDeclara.setToolTipText("Salir"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPeriodoDeclara";
		inputMap = this.jButtonNuevoPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPeriodoDeclara.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPeriodoDeclara"));
		
		//DUPLICAR
		sMapKey = "DuplicarPeriodoDeclara";
		inputMap = this.jButtonDuplicarPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPeriodoDeclara.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPeriodoDeclara"));
		
		//COPIAR
		sMapKey = "CopiarPeriodoDeclara";
		inputMap = this.jButtonCopiarPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPeriodoDeclara.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPeriodoDeclara"));
		
		//VEr FORM
		sMapKey = "VerFormPeriodoDeclara";
		inputMap = this.jButtonVerFormPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPeriodoDeclara.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPeriodoDeclara"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPeriodoDeclara";
		inputMap = this.jButtonNuevoRelacionesPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPeriodoDeclara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPeriodoDeclara"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPeriodoDeclara";
		inputMap = this.jButtonModificarPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPeriodoDeclara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPeriodoDeclara"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPeriodoDeclara";
		inputMap = this.jButtonCerrarPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPeriodoDeclara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPeriodoDeclara"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPeriodoDeclara";
		inputMap = this.jButtonGuardarCambiosTablaPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPeriodoDeclara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPeriodoDeclara"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPeriodoDeclara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPeriodoDeclara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPeriodoDeclara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PeriodoDeclara= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PeriodoDeclara= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PeriodoDeclara= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PeriodoDeclara= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PeriodoDeclara= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPeriodoDeclara.setName("jPanelParametrosReportesPeriodoDeclara"); 
		
		this.jPanelParametrosReportesAccionesPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPeriodoDeclara.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPeriodoDeclara.setName("jPanelParametrosReportesAccionesPeriodoDeclara"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPeriodoDeclara = new JButtonMe();
		this.jButtonRecargarInformacionPeriodoDeclara.setText("Recargar");
		this.jButtonRecargarInformacionPeriodoDeclara.setToolTipText("Recargar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPeriodoDeclara,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPeriodoDeclara = new JButtonMe();
		this.jButtonProcesarInformacionPeriodoDeclara.setText("Procesar");
		this.jButtonProcesarInformacionPeriodoDeclara.setToolTipText("Procesar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPeriodoDeclara.setVisible(false);
			
		this.jButtonProcesarInformacionPeriodoDeclara.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPeriodoDeclara.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPeriodoDeclara.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPeriodoDeclara = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPeriodoDeclara.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPeriodoDeclara.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPeriodoDeclara = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPeriodoDeclara.setText("TIPO");       
		this.jComboBoxTiposReportesPeriodoDeclara.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPeriodoDeclara = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPeriodoDeclara.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPeriodoDeclara.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPeriodoDeclara = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPeriodoDeclara.setText("Paginacion");
		this.jComboBoxTiposPaginacionPeriodoDeclara.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPeriodoDeclara = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPeriodoDeclara.setText("Accion");
		this.jComboBoxTiposRelacionesPeriodoDeclara.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPeriodoDeclara = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPeriodoDeclara.setText("Accion");
		this.jComboBoxTiposAccionesPeriodoDeclara.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPeriodoDeclara = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPeriodoDeclara.setText("Accion");
		this.jComboBoxTiposSeleccionarPeriodoDeclara.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPeriodoDeclara=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPeriodoDeclara.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPeriodoDeclara.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPeriodoDeclara.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPeriodoDeclara = new JLabelMe();
		
		this.jLabelAccionesPeriodoDeclara.setText("Acciones");		
		this.jLabelAccionesPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPeriodoDeclara = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPeriodoDeclara.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPeriodoDeclara.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPeriodoDeclara = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPeriodoDeclara.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPeriodoDeclara.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPeriodoDeclara = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPeriodoDeclara.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPeriodoDeclara.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePeriodoDeclara = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePeriodoDeclara.setText("Graf.");
		this.jCheckBoxConGraficoReportePeriodoDeclara.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPeriodoDeclara = new JButtonMe();
		//this.jButtonAnterioresPeriodoDeclara.setText("<<");
        this.jButtonAnterioresPeriodoDeclara.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPeriodoDeclara,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPeriodoDeclara = new JButtonMe();
		//this.jButtonSiguientesPeriodoDeclara.setText(">>");
        this.jButtonSiguientesPeriodoDeclara.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPeriodoDeclara,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPeriodoDeclara = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPeriodoDeclara.setText("Nue");
        this.jButtonNuevoGuardarCambiosPeriodoDeclara.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPeriodoDeclara,"nuevoguardarcambios_button","Nue",this.periododeclaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPeriodoDeclara";
		inputMap = this.jButtonNuevoGuardarCambiosPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPeriodoDeclara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPeriodoDeclara"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPeriodoDeclara";
		inputMap = this.jButtonRecargarInformacionPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPeriodoDeclara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPeriodoDeclara"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPeriodoDeclara";
		inputMap = this.jButtonSiguientesPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPeriodoDeclara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPeriodoDeclara"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPeriodoDeclara";
		inputMap = this.jButtonAnterioresPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPeriodoDeclara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPeriodoDeclara"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPeriodoDeclara();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPeriodoDeclara.setMinimumSize(new Dimension(this.getWidth(),PeriodoDeclaraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PeriodoDeclaraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPeriodoDeclara.setMaximumSize(new Dimension(this.getWidth(),PeriodoDeclaraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PeriodoDeclaraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPeriodoDeclara.setPreferredSize(new Dimension(this.getWidth(),PeriodoDeclaraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PeriodoDeclaraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPeriodoDeclara = new GridBagLayout();

			this.jPanelPaginacionPeriodoDeclara.setLayout(gridaBagLayoutPaginacionPeriodoDeclara);						
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.gridy = 0;
			this.gridBagConstraintsPeriodoDeclara.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPeriodoDeclara.add(this.jButtonAnterioresPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
					
						
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPeriodoDeclara.gridy = 0;
			
			this.jPanelPaginacionPeriodoDeclara.add(this.jButtonNuevoGuardarCambiosPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
						
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPeriodoDeclara.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPeriodoDeclara.gridy = 0;
			this.jPanelPaginacionPeriodoDeclara.add(this.jButtonSiguientesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.gridy = 1;
			this.gridBagConstraintsPeriodoDeclara.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPeriodoDeclara.add(this.jButtonNuevoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
				this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPeriodoDeclara.gridy = 1;
				this.gridBagConstraintsPeriodoDeclara.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPeriodoDeclara.add(this.jButtonNuevoRelacionesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
			}
			
			
			if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
				this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPeriodoDeclara.gridy = 1;
				this.gridBagConstraintsPeriodoDeclara.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPeriodoDeclara.add(this.jButtonGuardarCambiosTablaPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
			}
			
			
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.gridy = 1;
			this.gridBagConstraintsPeriodoDeclara.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPeriodoDeclara.add(this.jButtonDuplicarPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.gridy = 1;
			this.gridBagConstraintsPeriodoDeclara.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPeriodoDeclara.add(this.jButtonCopiarPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.gridy = 1;
			this.gridBagConstraintsPeriodoDeclara.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPeriodoDeclara.add(this.jButtonVerFormPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.gridy = 1;
			this.gridBagConstraintsPeriodoDeclara.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPeriodoDeclara.add(this.jButtonCerrarPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		
		
		
		this.jButtonRecargarInformacionPeriodoDeclara.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPeriodoDeclara.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPeriodoDeclara.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPeriodoDeclara.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPeriodoDeclara.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPeriodoDeclara.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPeriodoDeclara.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPeriodoDeclara.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPeriodoDeclara.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPeriodoDeclara.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPeriodoDeclara.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPeriodoDeclara.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPeriodoDeclara.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPeriodoDeclara.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPeriodoDeclara.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPeriodoDeclara.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPeriodoDeclara.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPeriodoDeclara.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPeriodoDeclara.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPeriodoDeclara.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPeriodoDeclara.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPeriodoDeclara.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPeriodoDeclara.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPeriodoDeclara.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPeriodoDeclara.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPeriodoDeclara.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPeriodoDeclara.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePeriodoDeclara.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePeriodoDeclara.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePeriodoDeclara.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPeriodoDeclara.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPeriodoDeclara.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPeriodoDeclara.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPeriodoDeclara.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPeriodoDeclara.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPeriodoDeclara.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPeriodoDeclara = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPeriodoDeclara = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PeriodoDeclara = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PeriodoDeclara = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PeriodoDeclara = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PeriodoDeclara = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPeriodoDeclara.setLayout(gridaBagParametrosReportesPeriodoDeclara);
			this.jPanelParametrosReportesAccionesPeriodoDeclara.setLayout(gridaBagParametrosReportesAccionesPeriodoDeclara);
			
			
			this.jPanelParametrosAuxiliar1PeriodoDeclara.setLayout(gridaBagParametrosAuxiliar1PeriodoDeclara);
			this.jPanelParametrosAuxiliar2PeriodoDeclara.setLayout(gridaBagParametrosAuxiliar2PeriodoDeclara);
			this.jPanelParametrosAuxiliar3PeriodoDeclara.setLayout(gridaBagParametrosAuxiliar3PeriodoDeclara);
			this.jPanelParametrosAuxiliar4PeriodoDeclara.setLayout(gridaBagParametrosAuxiliar4PeriodoDeclara);
			//this.jPanelParametrosAuxiliar5PeriodoDeclara.setLayout(gridaBagParametrosAuxiliar2PeriodoDeclara);			
			
			
			
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoDeclara.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodoDeclara.add(this.jButtonRecargarInformacionPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoDeclara.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PeriodoDeclara.add(this.jComboBoxTiposPaginacionPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoDeclara.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PeriodoDeclara.add(this.jCheckBoxConAltoMaximoTablaPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoDeclara.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PeriodoDeclara.add(this.jComboBoxTiposArchivosReportesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoDeclara.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodoDeclara.add(this.jPanelParametrosAuxiliar1PeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoDeclara.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PeriodoDeclara.add(this.jComboBoxTiposReportesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoDeclara.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodoDeclara.add(this.jPanelParametrosAuxiliar4PeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoDeclara.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodoDeclara.add(this.jComboBoxTiposReportesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoDeclara.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPeriodoDeclara.add(this.jCheckBoxGenerarReportePeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoDeclara.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodoDeclara.add(this.jPanelParametrosAuxiliar2PeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoDeclara.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPeriodoDeclara.add(this.jLabelAccionesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
				this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPeriodoDeclara.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPeriodoDeclara.add(this.jButtonAbrirOrderByPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoDeclara.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodoDeclara.add(this.jComboBoxTiposSeleccionarPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);			
			
			
			/*
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoDeclara.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPeriodoDeclara.add(this.jCheckBoxSeleccionarTodosPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoDeclara.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PeriodoDeclara.add(this.jCheckBoxSeleccionarTodosPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);															
				
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPeriodoDeclara.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PeriodoDeclara.add(this.jCheckBoxSeleccionadosPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoDeclara.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPeriodoDeclara.add(this.jPanelParametrosAuxiliar3PeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoDeclara.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodoDeclara.add(this.jComboBoxTiposRelacionesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
				
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoDeclara.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodoDeclara.add(this.jComboBoxTiposAccionesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
	
				
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPeriodoDeclara.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPeriodoDeclara.add(this.jTextFieldValorCampoGeneralPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPeriodoDeclara = new GridBagLayout();

			this.jScrollPanelDatosPeriodoDeclara.setLayout(gridaBagLayoutDatosPeriodoDeclara);
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.gridy = 0;
			this.gridBagConstraintsPeriodoDeclara.gridx = 0;
			
			this.jScrollPanelDatosPeriodoDeclara.add(this.jTableDatosPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPeriodoDeclara.setViewportView(this.jTableDatosPeriodoDeclara);
		this.jTableDatosPeriodoDeclara.setFillsViewportHeight(true);
		this.jTableDatosPeriodoDeclara.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPeriodoDeclara= new GridBagLayout();
		this.jPanelAccionesPeriodoDeclara.setLayout(gridaBagLayoutAccionesPeriodoDeclara);
		
		
		/*	
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = 0;
		this.gridBagConstraintsPeriodoDeclara.gridx = 0;
			
		this.jPanelAccionesPeriodoDeclara.add(this.jButtonNuevoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioPeriodoDeclara= new GridBagLayout();
		gridaBagLayoutFK_IdAnioPeriodoDeclara.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioPeriodoDeclara.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioPeriodoDeclara.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioPeriodoDeclara.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioPeriodoDeclara.setLayout(gridaBagLayoutFK_IdAnioPeriodoDeclara);

		gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodoDeclara.gridy = 0;
		gridBagConstraintsPeriodoDeclara.gridx = 0;
		jPanelFK_IdAnioPeriodoDeclara.add(jLabelid_anioFK_IdAnioPeriodoDeclara, gridBagConstraintsPeriodoDeclara);

		gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodoDeclara.gridy = 0;
		gridBagConstraintsPeriodoDeclara.gridx = 1;
		jPanelFK_IdAnioPeriodoDeclara.add(jComboBoxid_anioFK_IdAnioPeriodoDeclara, gridBagConstraintsPeriodoDeclara);

		gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodoDeclara.gridy = 1;
		gridBagConstraintsPeriodoDeclara.gridx =1;
		jPanelFK_IdAnioPeriodoDeclara.add(jButtonFK_IdAnioPeriodoDeclara, gridBagConstraintsPeriodoDeclara);

		jTabbedPaneBusquedasPeriodoDeclara.addTab("1.-Por Anio ", jPanelFK_IdAnioPeriodoDeclara);
		jTabbedPaneBusquedasPeriodoDeclara.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdMesPeriodoDeclara= new GridBagLayout();
		gridaBagLayoutFK_IdMesPeriodoDeclara.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesPeriodoDeclara.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesPeriodoDeclara.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesPeriodoDeclara.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesPeriodoDeclara.setLayout(gridaBagLayoutFK_IdMesPeriodoDeclara);

		gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodoDeclara.gridy = 0;
		gridBagConstraintsPeriodoDeclara.gridx = 0;
		jPanelFK_IdMesPeriodoDeclara.add(jLabelid_mesFK_IdMesPeriodoDeclara, gridBagConstraintsPeriodoDeclara);

		gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodoDeclara.gridy = 0;
		gridBagConstraintsPeriodoDeclara.gridx = 1;
		jPanelFK_IdMesPeriodoDeclara.add(jComboBoxid_mesFK_IdMesPeriodoDeclara, gridBagConstraintsPeriodoDeclara);

		gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPeriodoDeclara.gridy = 1;
		gridBagConstraintsPeriodoDeclara.gridx =1;
		jPanelFK_IdMesPeriodoDeclara.add(jButtonFK_IdMesPeriodoDeclara, gridBagConstraintsPeriodoDeclara);

		jTabbedPaneBusquedasPeriodoDeclara.addTab("2.-Por Mes ", jPanelFK_IdMesPeriodoDeclara);
		jTabbedPaneBusquedasPeriodoDeclara.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPeriodoDeclara = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPeriodoDeclara);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.periododeclaraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();						
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPeriodoDeclara.gridx = 0;		
			//this.gridBagConstraintsPeriodoDeclara.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPeriodoDeclara.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPeriodoDeclara.gridx = 0;		
		//this.gridBagConstraintsPeriodoDeclara.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPeriodoDeclara.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPeriodoDeclara);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPeriodoDeclara.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPeriodoDeclara.gridx = 0;		
			this.gridBagConstraintsPeriodoDeclara.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPeriodoDeclara.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoDeclara.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);								
		
		
		/*
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoDeclara.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		*/		
		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPeriodoDeclara.gridx =0;
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPeriodoDeclara.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
				
		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoDeclara.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PeriodoDeclaraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPeriodoDeclara= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPeriodoDeclara = new GridBagLayout();
			this.jPanelBusquedasParametrosPeriodoDeclara.setLayout(gridaBagLayoutBusquedasParametrosPeriodoDeclara);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPeriodoDeclara=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPeriodoDeclara.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPeriodoDeclara.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPeriodoDeclara.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoDeclara.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
			
			
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoDeclara.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		
			
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoDeclara.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPeriodoDeclara;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPeriodoDeclara() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPeriodoDeclara = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPeriodoDeclara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPeriodoDeclara.setName("jPanelReporteDinamicoPeriodoDeclara"); 
		
		this.jPanelReporteDinamicoPeriodoDeclara.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPeriodoDeclara.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPeriodoDeclara.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPeriodoDeclara.setLayout(gridaBagLayoutReporteDinamicoPeriodoDeclara);
		
		
		this.jInternalFrameReporteDinamicoPeriodoDeclara= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPeriodoDeclara = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePeriodoDeclara= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPeriodoDeclara.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPeriodoDeclara.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPeriodoDeclara.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPeriodoDeclara.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPeriodoDeclara.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPeriodoDeclara.setResizable(true);
	    this.jInternalFrameReporteDinamicoPeriodoDeclara.setClosable(true);
	    this.jInternalFrameReporteDinamicoPeriodoDeclara.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPeriodoDeclara.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPeriodoDeclara.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPeriodoDeclara.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Declaras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePeriodoDeclara = new JLabelMe();

		this.jLabelColumnasSelectReportePeriodoDeclara.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPeriodoDeclara.add(this.jLabelColumnasSelectReportePeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePeriodoDeclara = new JList<Reporte>();
		this.jListColumnasSelectReportePeriodoDeclara.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePeriodoDeclara.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePeriodoDeclara.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePeriodoDeclara.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePeriodoDeclara.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePeriodoDeclara=new JScrollPane(this.jListColumnasSelectReportePeriodoDeclara);
			
			this.jScrollColumnasSelectReportePeriodoDeclara.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePeriodoDeclara.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePeriodoDeclara.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPeriodoDeclara.add(this.jListColumnasSelectReportePeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		this.jPanelReporteDinamicoPeriodoDeclara.add(this.jScrollColumnasSelectReportePeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePeriodoDeclara = new JLabelMe();

		this.jLabelRelacionesSelectReportePeriodoDeclara.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPeriodoDeclara.add(this.jLabelRelacionesSelectReportePeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePeriodoDeclara = new JList<Reporte>();
		this.jListRelacionesSelectReportePeriodoDeclara.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePeriodoDeclara.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePeriodoDeclara.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePeriodoDeclara.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePeriodoDeclara.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePeriodoDeclara=new JScrollPane(this.jListRelacionesSelectReportePeriodoDeclara);
			
			this.jScrollRelacionesSelectReportePeriodoDeclara.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePeriodoDeclara.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePeriodoDeclara.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPeriodoDeclara.add(this.jListRelacionesSelectReportePeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		this.jPanelReporteDinamicoPeriodoDeclara.add(this.jScrollRelacionesSelectReportePeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPeriodoDeclara = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPeriodoDeclara = new JComboBoxMe();
		this.jListColumnasValoresGraficoPeriodoDeclara = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPeriodoDeclara = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPeriodoDeclara.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPeriodoDeclara.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPeriodoDeclara.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPeriodoDeclara.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPeriodoDeclara = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPeriodoDeclara.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPeriodoDeclara.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPeriodoDeclara.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPeriodoDeclara.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPeriodoDeclara = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPeriodoDeclara.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPeriodoDeclara.add(this.jLabelGenerarExcelReporteDinamicoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPeriodoDeclara = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPeriodoDeclara.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPeriodoDeclara,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPeriodoDeclara.setToolTipText("Generar EXCEL"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPeriodoDeclara.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPeriodoDeclara.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPeriodoDeclara.add(this.jButtonGenerarExcelReporteDinamicoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPeriodoDeclara.add(this.jComboBoxTiposReportesDinamicoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPeriodoDeclara = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPeriodoDeclara.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPeriodoDeclara.add(this.jLabelTiposArchivoReporteDinamicoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPeriodoDeclara.add(this.jComboBoxTiposArchivosReportesDinamicoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPeriodoDeclara = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPeriodoDeclara.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPeriodoDeclara,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPeriodoDeclara.setToolTipText("Generar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPeriodoDeclara.add(this.jButtonGenerarReporteDinamicoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPeriodoDeclara = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPeriodoDeclara.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPeriodoDeclara,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPeriodoDeclara.setToolTipText("Cancelar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPeriodoDeclara.add(this.jButtonCerrarReporteDinamicoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPeriodoDeclara = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPeriodoDeclara= new JScrollPane(jPanelReporteDinamicoPeriodoDeclara,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPeriodoDeclara.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPeriodoDeclara.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPeriodoDeclara.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Declaras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPeriodoDeclara.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPeriodoDeclara.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPeriodoDeclara.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPeriodoDeclara);
		this.jInternalFrameReporteDinamicoPeriodoDeclara.getContentPane().add(this.jScrollPanelReporteDinamicoPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPeriodoDeclara() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPeriodoDeclara = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPeriodoDeclara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPeriodoDeclara.setName("jPanelImportacionPeriodoDeclara"); 
		
		this.jPanelImportacionPeriodoDeclara.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPeriodoDeclara.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPeriodoDeclara.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPeriodoDeclara.setLayout(gridaBagLayoutImportacionPeriodoDeclara);
		
		
		this.jInternalFrameImportacionPeriodoDeclara= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPeriodoDeclara= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPeriodoDeclara = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePeriodoDeclara= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPeriodoDeclara.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPeriodoDeclara.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPeriodoDeclara.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPeriodoDeclara.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPeriodoDeclara.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPeriodoDeclara.setResizable(true);
	    this.jInternalFrameImportacionPeriodoDeclara.setClosable(true);
	    this.jInternalFrameImportacionPeriodoDeclara.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPeriodoDeclara.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPeriodoDeclara.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPeriodoDeclara.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPeriodoDeclara.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPeriodoDeclara.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPeriodoDeclara.setResizable(true);
	    this.jInternalFrameImportacionPeriodoDeclara.setClosable(true);
	    this.jInternalFrameImportacionPeriodoDeclara.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPeriodoDeclara.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPeriodoDeclara.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPeriodoDeclara.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Declaras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPeriodoDeclara = new JLabelMe();

		this.jLabelArchivoImportacionPeriodoDeclara.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = iPosYImportacion;		
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPeriodoDeclara.add(this.jLabelArchivoImportacionPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPeriodoDeclara = new JFileChooser();		
		this.jFileChooserImportacionPeriodoDeclara.setToolTipText("ESCOGER ARCHIVO"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPeriodoDeclara = new JButtonMe();
		this.jButtonAbrirImportacionPeriodoDeclara.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPeriodoDeclara,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPeriodoDeclara.setToolTipText("Generar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = iPosYImportacion;
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPeriodoDeclara.add(this.jButtonAbrirImportacionPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPeriodoDeclara = new JLabelMe();

		this.jLabelPathArchivoImportacionPeriodoDeclara.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPeriodoDeclara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPeriodoDeclara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPeriodoDeclara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = iPosYImportacion;		
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPeriodoDeclara.add(this.jLabelPathArchivoImportacionPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPeriodoDeclara=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPeriodoDeclara.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPeriodoDeclara.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPeriodoDeclara.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = iPosYImportacion;
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPeriodoDeclara.add(this.jTextFieldPathArchivoImportacionPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPeriodoDeclara = new JButtonMe();
		this.jButtonGenerarImportacionPeriodoDeclara.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPeriodoDeclara,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPeriodoDeclara.setToolTipText("Generar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = iPosYImportacion;
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPeriodoDeclara.add(this.jButtonGenerarImportacionPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPeriodoDeclara = new JButtonMe();
		this.jButtonCerrarImportacionPeriodoDeclara.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPeriodoDeclara,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPeriodoDeclara.setToolTipText("Cancelar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoDeclara.gridy = iPosYImportacion;
		this.gridBagConstraintsPeriodoDeclara.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPeriodoDeclara.add(this.jButtonCerrarImportacionPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPeriodoDeclara = new GridBagLayout();
		
		this.jScrollPanelImportacionPeriodoDeclara= new JScrollPane(jPanelImportacionPeriodoDeclara,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
		this.gridBagConstraintsPeriodoDeclara.gridy =iPosYImportacion;
		this.gridBagConstraintsPeriodoDeclara.gridx =iPosXImportacion;
		this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPeriodoDeclara.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPeriodoDeclara.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPeriodoDeclara);
		this.jInternalFrameImportacionPeriodoDeclara.getContentPane().add(this.jScrollPanelImportacionPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPeriodoDeclara(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPeriodoDeclara = new JButtonMe();
			this.jButtonAbrirOrderByPeriodoDeclara.setText("Orden");
			this.jButtonAbrirOrderByPeriodoDeclara.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPeriodoDeclara,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPeriodoDeclara";
			inputMap = this.jButtonAbrirOrderByPeriodoDeclara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPeriodoDeclara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPeriodoDeclara"));
		
		
			GridBagLayout gridaBagLayoutOrderByPeriodoDeclara = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPeriodoDeclara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPeriodoDeclara.setName("jPanelOrderByPeriodoDeclara"); 
			
			this.jPanelOrderByPeriodoDeclara.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPeriodoDeclara.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPeriodoDeclara.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPeriodoDeclara.setLayout(gridaBagLayoutOrderByPeriodoDeclara);
			
			
			this.jTableDatosPeriodoDeclaraOrderBy = new JTableMe();        
			this.jTableDatosPeriodoDeclaraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPeriodoDeclaraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPeriodoDeclaraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPeriodoDeclaraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPeriodoDeclaraOrderBy.setViewportView(this.jTableDatosPeriodoDeclaraOrderBy);
			this.jTableDatosPeriodoDeclaraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPeriodoDeclaraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPeriodoDeclara= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPeriodoDeclara= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPeriodoDeclara = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePeriodoDeclara= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPeriodoDeclara.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPeriodoDeclara.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPeriodoDeclara.setTitle("Orden");
			this.jInternalFrameOrderByPeriodoDeclara.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPeriodoDeclara.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPeriodoDeclara.setResizable(true);
			this.jInternalFrameOrderByPeriodoDeclara.setClosable(true);
			this.jInternalFrameOrderByPeriodoDeclara.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPeriodoDeclara.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPeriodoDeclara.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPeriodoDeclara.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPeriodoDeclara.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Declaras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPeriodoDeclara.gridx =iPosXOrderBy;
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPeriodoDeclara.ipady =150;
				
			this.jPanelOrderByPeriodoDeclara.add(jScrollPanelDatosPeriodoDeclaraOrderBy, this.gridBagConstraintsPeriodoDeclara);//this.jTableDatosPeriodoDeclaraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPeriodoDeclara = new JButtonMe();
			this.jButtonCerrarOrderByPeriodoDeclara.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPeriodoDeclara,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPeriodoDeclara.setToolTipText("Cancelar"+" "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPeriodoDeclara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoDeclara.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPeriodoDeclara.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPeriodoDeclara.add(this.jButtonCerrarOrderByPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPeriodoDeclara = new GridBagLayout();
			
			this.jScrollPanelOrderByPeriodoDeclara= new JScrollPane(jPanelOrderByPeriodoDeclara,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPeriodoDeclara = new GridBagConstraints();
			this.gridBagConstraintsPeriodoDeclara.gridy =iPosYOrderBy;
			this.gridBagConstraintsPeriodoDeclara.gridx =iPosXOrderBy;
			this.gridBagConstraintsPeriodoDeclara.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPeriodoDeclara.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPeriodoDeclara.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPeriodoDeclara);
			
			this.jInternalFrameOrderByPeriodoDeclara.getContentPane().add(this.jScrollPanelOrderByPeriodoDeclara, this.gridBagConstraintsPeriodoDeclara);			
		
		} else {
			this.jButtonAbrirOrderByPeriodoDeclara = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=400;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.periododeclaraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPeriodoDeclara.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPeriodoDeclara.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPeriodoDeclara.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPeriodoDeclara.getRowHeight();//PeriodoDeclaraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PeriodoDeclaraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPeriodoDeclara.isSelected()) {
					iHeightTable=PeriodoDeclaraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PeriodoDeclaraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PeriodoDeclaraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PeriodoDeclaraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPeriodoDeclara.isSelected()) {
					iHeightTable=PeriodoDeclaraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PeriodoDeclaraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PeriodoDeclaraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPeriodoDeclara.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPeriodoDeclara.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPeriodoDeclara.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPeriodoDeclara.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPeriodoDeclara.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPeriodoDeclara.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPeriodoDeclara!=null && this.jInternalFrameOrderByPeriodoDeclara.getjTableDatosOrderBy()!=null) {
			//if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPeriodoDeclara.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPeriodoDeclara.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPeriodoDeclara.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPeriodoDeclara.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPeriodoDeclara.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPeriodoDeclara.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPeriodoDeclara.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPeriodoDeclara.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPeriodoDeclara.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPeriodoDeclara.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=periododeclaraLogic.getPeriodoDeclaras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=periododeclaras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PeriodoDeclara> TraerPeriodoDeclaraBeans(List<PeriodoDeclara> periododeclaras,ArrayList<Classe> classes)throws Exception {
		try {
			for(PeriodoDeclara periododeclara:periododeclaras) {
					
				if(!(PeriodoDeclaraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PeriodoDeclaraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					periododeclara.setsDetalleGeneralEntityReporte(PeriodoDeclaraConstantesFunciones.getPeriodoDeclaraDescripcion(periododeclara));
										
					periododeclara.setesta_activo_descripcion(PeriodoDeclaraConstantesFunciones.getesta_activoDescripcion(periododeclara));	
					
					

					if(periododeclara.getTransaccionLocals()!=null && Funciones.existeClass(classes,TransaccionLocal.class)) {
						try{periododeclara.settransaccionlocalsDescripcionReporte(new JRBeanCollectionDataSource(TransaccionLocalJInternalFrame.TraerTransaccionLocalBeans(periododeclara.getTransaccionLocals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(periododeclara.getRetencionVentas()!=null && Funciones.existeClass(classes,RetencionVenta.class)) {
						try{periododeclara.setretencionventasDescripcionReporte(new JRBeanCollectionDataSource(RetencionVentaJInternalFrame.TraerRetencionVentaBeans(periododeclara.getRetencionVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(periododeclara.getFacturaDiarios()!=null && Funciones.existeClass(classes,FacturaDiario.class)) {
						try{periododeclara.setfacturadiariosDescripcionReporte(new JRBeanCollectionDataSource(FacturaDiarioJInternalFrame.TraerFacturaDiarioBeans(periododeclara.getFacturaDiarios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(periododeclara.getDocumentoAnulados()!=null && Funciones.existeClass(classes,DocumentoAnulado.class)) {
						try{periododeclara.setdocumentoanuladosDescripcionReporte(new JRBeanCollectionDataSource(DocumentoAnuladoJInternalFrame.TraerDocumentoAnuladoBeans(periododeclara.getDocumentoAnulados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//periododeclara.setsDetalleGeneralEntityReporte(periododeclara.getsDetalleGeneralEntityReporte());
										
				}
				
				//periododeclarabeans.add(periododeclarabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return periododeclaras;
    }
	//PARA REPORTES FIN
}
