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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.MesConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class MesJInternalFrame extends MesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMes;
	
	protected JMenuBar jmenuBarMes;
	
	protected JMenu jmenuMes;
	protected JMenu jmenuDatosMes;
	protected JMenu jmenuArchivoMes;
	protected JMenu jmenuAccionesMes;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMes;	
	protected GridBagConstraints gridBagConstraintsMes;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MesDetalleFormJInternalFrame jInternalFrameDetalleFormMes;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMes;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMes;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public MesSessionBean mesSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Mes> mess;		
	public List<Mes> messEliminados;	
	public List<Mes> messAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMes;		
	protected JButton jButtonAbrirOrderByMes;
	
	
	//protected JPanel jPanelOrderByMes;
	//public JScrollPane jScrollPanelOrderByMes;	
	//protected JButton jButtonCerrarOrderByMes;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MesLogic mesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMes;
	public JScrollPane jScrollPanelDatosEdicionMes;
	public JScrollPane jScrollPanelDatosGeneralMes;
    
	
	
	//public JScrollPane jScrollPanelDatosMesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMes;
	//public JScrollPane jScrollPanelImportacionMes;
	
	
	
	protected JPanel jPanelAccionesMes;
	
    protected JPanel jPanelPaginacionMes;
    protected JPanel jPanelParametrosReportesMes;
	protected JPanel jPanelParametrosReportesAccionesMes;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Mes;
	protected JPanel jPanelParametrosAuxiliar2Mes;
	protected JPanel jPanelParametrosAuxiliar3Mes;
	protected JPanel jPanelParametrosAuxiliar4Mes;
	//protected JPanel jPanelParametrosAuxiliar5Mes;
	
	
	
	//protected JPanel jPanelReporteDinamicoMes;
	//protected JPanel jPanelImportacionMes;
	
	
	public JTable jTableDatosMes;
	
	
	
	//public JTable jTableDatosMesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMes;
	protected JButton jButtonDuplicarMes;
	protected JButton jButtonCopiarMes;
	protected JButton jButtonVerFormMes;
	protected JButton jButtonNuevoRelacionesMes;
	protected JButton jButtonModificarMes;
	
    protected JButton jButtonGuardarCambiosTablaMes;
	protected JButton jButtonCerrarMes;
	
	
	protected JButton jButtonRecargarInformacionMes;
	protected JButton jButtonProcesarInformacionMes;
	
	
	protected JButton jButtonAnterioresMes;
	protected JButton jButtonSiguientesMes;
	protected JButton jButtonNuevoGuardarCambiosMes;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMes;
	//protected JButton jButtonCerrarReporteDinamicoMes;
	//protected JButton jButtonGenerarExcelReporteDinamicoMes;	
	
	
	
	//protected JButton jButtonAbrirImportacionMes;
	//protected JButton jButtonGenerarImportacionMes;
	//protected JButton jButtonCerrarImportacionMes;
	//protected JFileChooser jFileChooserImportacionMes;
	//protected File fileImportacionMes;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMes;
	protected JButton jButtonDuplicarToolBarMes;
	protected JButton jButtonNuevoRelacionesToolBarMes;
	
	
	public JButton jButtonGuardarCambiosToolBarMes;
	protected JButton jButtonCopiarToolBarMes;
	protected JButton jButtonVerFormToolBarMes;
	public JButton jButtonGuardarCambiosTablaToolBarMes;
	protected JButton jButtonMostrarOcultarTablaToolBarMes;
	protected JButton jButtonCerrarToolBarMes;
	
	protected JButton jButtonRecargarInformacionToolBarMes;
	protected JButton jButtonProcesarInformacionToolBarMes;
	protected JButton jButtonAnterioresToolBarMes;
	protected JButton jButtonSiguientesToolBarMes;
	protected JButton jButtonNuevoGuardarCambiosToolBarMes;
	protected JButton jButtonAbrirOrderByToolBarMes;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMes;
	protected JMenuItem jMenuItemDuplicarMes;
	protected JMenuItem jMenuItemNuevoRelacionesMes;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMes;
	protected JMenuItem jMenuItemCopiarMes;
	protected JMenuItem jMenuItemVerFormMes;
	protected JMenuItem jMenuItemGuardarCambiosTablaMes;
	protected JMenuItem jMenuItemCerrarMes;
	protected JMenuItem jMenuItemDetalleCerrarMes;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMes;
	protected JMenuItem jMenuItemDetalleMostarOcultarMes;
	
	protected JMenuItem jMenuItemRecargarInformacionMes;
	protected JMenuItem jMenuItemProcesarInformacionMes;
	protected JMenuItem jMenuItemAnterioresMes;
	protected JMenuItem jMenuItemSiguientesMes;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMes;
	protected JMenuItem jMenuItemAbrirOrderByMes;
	protected JMenuItem jMenuItemMostrarOcultarMes;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMes;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMes;
	protected JCheckBox jCheckBoxSeleccionadosMes;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMes;
	protected JCheckBox jCheckBoxConGraficoReporteMes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMes;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMes;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMes;
	protected JTextField jTextFieldValorCampoGeneralMes;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMes;
	//public JList<Reporte> jListColumnasSelectReporteMes;
	//public JScrollPane jScrollColumnasSelectReporteMes;
	
	//public JLabel jLabelRelacionesSelectReporteMes;
	//public JList<Reporte> jListRelacionesSelectReporteMes;
	//public JScrollPane jScrollRelacionesSelectReporteMes;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMes;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMes;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMes;
	//public JLabel jLabelTiposArchivoReporteDinamicoMes;
	
		
	//public JLabel jLabelArchivoImportacionMes;	
	//public JLabel jLabelPathArchivoImportacionMes;
	//protected JTextField jTextFieldPathArchivoImportacionMes;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMes;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMes;
	
	//public JLabel jLabelColumnaCategoriaValorMes;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMes;
	
	//public JLabel jLabelColumnasValoresGraficoMes;
	//public JList<Reporte> jListColumnasValoresGraficoMes;
	//public JScrollPane jScrollColumnasValoresGraficoMes;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMes;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMes;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	public MesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Mes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Mes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Mes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Mes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMes)	{
		this.jButtonRecargarInformacionMes = jButtonRecargarInformacionMes;
	}
	
	public JButton getjButtonProcesarInformacionMes() {
		return this.jButtonProcesarInformacionMes;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMes)	{
		this.jButtonProcesarInformacionMes = jButtonProcesarInformacionMes;
	}
	
	
	public JButton getjButtonRecargarInformacionMes() {
		return this.jButtonRecargarInformacionMes;
	}
	
	
	public List<Mes> getmess() {
		return this.mess;
	}

	public void setmess(List<Mes> mess) {
		this.mess = mess;
	}
	
	public List<Mes> getmessAux() {
		return this.messAux;
	}

	public void setmessAux(List<Mes> messAux) {
		this.messAux = messAux;
	}
	
	public List<Mes> getmessEliminados() {
		return this.messEliminados;
	}

	public void setMessEliminados(List<Mes> messEliminados) {
		this.messEliminados = messEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMes() {
		return jComboBoxTiposSeleccionarMes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMes(
			JComboBox jComboBoxTiposSeleccionarMes) {
		this.jComboBoxTiposSeleccionarMes = jComboBoxTiposSeleccionarMes;
	}
	
	public void setBorderResaltarTiposSeleccionarMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMes.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMes .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMes() {
		return jTextFieldValorCampoGeneralMes;
	}

	public void setjTextFieldValorCampoGeneralMes(
			JTextField jTextFieldValorCampoGeneralMes) {
		this.jTextFieldValorCampoGeneralMes = jTextFieldValorCampoGeneralMes;
	}

	public void setBorderResaltarValorCampoGeneralMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMes.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMes .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMes() {
		return this.jCheckBoxSeleccionarTodosMes;
	}

	public void setjCheckBoxSeleccionarTodosMes(
			JCheckBox jCheckBoxSeleccionarTodosMes) {
		this.jCheckBoxSeleccionarTodosMes = jCheckBoxSeleccionarTodosMes;
	}

	public void setBorderResaltarSeleccionarTodosMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMes.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMes .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMes() {
		return this.jCheckBoxSeleccionadosMes;
	}

	public void setjCheckBoxSeleccionadosMes(
			JCheckBox jCheckBoxSeleccionadosMes) {
		this.jCheckBoxSeleccionadosMes = jCheckBoxSeleccionadosMes;
	}
	
	public void setBorderResaltarSeleccionadosMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMes.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMes .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMes() {
		return this.jComboBoxTiposArchivosReportesMes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMes(
			JComboBox jComboBoxTiposArchivosReportesMes) {
		this.jComboBoxTiposArchivosReportesMes = jComboBoxTiposArchivosReportesMes;
	}

	public void setBorderResaltarTiposArchivosReportesMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMes.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMes() {
		return this.jComboBoxTiposReportesMes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMes(
			JComboBox jComboBoxTiposReportesMes) {
		this.jComboBoxTiposReportesMes = jComboBoxTiposReportesMes;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMes() {
	//	return jComboBoxTiposReportesDinamicoMes;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMes(
	//		JComboBox jComboBoxTiposReportesDinamicoMes) {
	//	this.jComboBoxTiposReportesDinamicoMes = jComboBoxTiposReportesDinamicoMes;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMes() {
	//	return jComboBoxTiposArchivosReportesDinamicoMes;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMes(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMes) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMes = jComboBoxTiposArchivosReportesDinamicoMes;
	//}
	
	public void setBorderResaltarTiposReportesMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMes.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMes() {
		return this.jComboBoxTiposGraficosReportesMes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMes(
			JComboBox jComboBoxTiposGraficosReportesMes) {
		this.jComboBoxTiposGraficosReportesMes = jComboBoxTiposGraficosReportesMes;
	}
	
	public void setBorderResaltarTiposGraficosReportesMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMes.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMes() {
		return this.jComboBoxTiposPaginacionMes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMes(
			JComboBox jComboBoxTiposPaginacionMes) {
		this.jComboBoxTiposPaginacionMes = jComboBoxTiposPaginacionMes;
	}
	
	public void setBorderResaltarTiposPaginacionMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMes.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMes() {
		return this.jComboBoxTiposRelacionesMes;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMes() {
		return this.jComboBoxTiposAccionesMes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMes(
			JComboBox jComboBoxTiposRelacionesMes) {
		this.jComboBoxTiposRelacionesMes = jComboBoxTiposRelacionesMes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMes(
			JComboBox jComboBoxTiposAccionesMes) {
		this.jComboBoxTiposAccionesMes = jComboBoxTiposAccionesMes;
	}
	
	public void setBorderResaltarTiposRelacionesMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMes.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMes .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMes.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMes .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMes() {
	//	return jCheckBoxConGraficoDinamicoMes;
	//}

	//public void setjCheckBoxConGraficoDinamicoMes(
	//		JCheckBox jCheckBoxConGraficoDinamicoMes) {
	//	this.jCheckBoxConGraficoDinamicoMes = jCheckBoxConGraficoDinamicoMes;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMes() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMes.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMes .setBorder(borderResaltar);		
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
		this.mesSessionBean=new MesSessionBean();
		
		this.mesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.mesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Mes MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.mesSessionBean.getEsGuardarRelacionado()) {
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
		
		MesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Mes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMes= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMes,this.jTtoolBarMes,
							"nuevo","nuevo","Nuevo"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMes,this.jTtoolBarMes,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMes,this.jTtoolBarMes,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMes,this.jTtoolBarMes,
							"duplicar","duplicar","Duplicar"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMes,this.jTtoolBarMes,
							"copiar","copiar","Copiar"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMes,this.jTtoolBarMes,
							"ver_form","ver_form","Ver"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMes,this.jTtoolBarMes,
							"recargar","recargar","Recargar"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMes,this.jTtoolBarMes,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMes,this.jTtoolBarMes,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMes,this.jTtoolBarMes,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMes,this.jTtoolBarMes,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMes,this.jTtoolBarMes,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMes,this.jTtoolBarMes,
							"cerrar","cerrar","Salir"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMes=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMes;
			
				this.jButtonProcesarInformacionToolBarMes=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMes;
				
		//protected JButton jButtonModificarToolBarMes;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMes=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMes=new JMenuMe("General");
		this.jmenuArchivoMes=new JMenuMe("Archivo");
		this.jmenuAccionesMes=new JMenuMe("Acciones");
		this.jmenuDatosMes=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMes= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMes.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMes,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMes= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMes.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMes,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMes= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMes.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMes,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMes= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMes.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMes,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMes= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMes.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMes,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMes= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMes.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMes,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMes= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMes.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMes,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMes= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMes.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMes,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMes= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMes.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMes,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMes= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMes.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMes,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMes= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMes.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMes,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMes= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMes.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMes,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMes,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMes= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMes.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMes,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMes,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMes, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMes= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMes.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMes,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMes.add(this.jMenuItemCerrarMes);
			
			this.jmenuAccionesMes.add(this.jMenuItemNuevoMes);
			this.jmenuAccionesMes.add(this.jMenuItemNuevoGuardarCambiosMes);
			this.jmenuAccionesMes.add(this.jMenuItemNuevoRelacionesMes);
			this.jmenuAccionesMes.add(this.jMenuItemGuardarCambiosTablaMes);		
			this.jmenuAccionesMes.add(this.jMenuItemDuplicarMes);		
			this.jmenuAccionesMes.add(this.jMenuItemCopiarMes);		
			this.jmenuAccionesMes.add(this.jMenuItemVerFormMes);		
			
			this.jmenuDatosMes.add(this.jMenuItemRecargarInformacionMes);				
			this.jmenuDatosMes.add(this.jMenuItemAnterioresMes);				
			this.jmenuDatosMes.add(this.jMenuItemSiguientesMes);				
			this.jmenuDatosMes.add(this.jMenuItemAbrirOrderByMes);				
			this.jmenuDatosMes.add(this.jMenuItemMostrarOcultarMes);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMes.add(this.jMenuItemGuardarCambiosMes);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMes, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMes, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMes, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMes.add(this.jmenuArchivoMes);		
			this.jmenuBarMes.add(this.jmenuAccionesMes);		
			this.jmenuBarMes.add(this.jmenuDatosMes);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMes);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMes() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleMes = new MesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Mes DATOS");
			this.jInternalFrameDetalleFormMes = new MesDetalleFormJInternalFrame(jDesktopPane,this.mesSessionBean.getConGuardarRelaciones(),this.mesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMes = null;//new MesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMes= new GridBagLayout();
		
		
		this.jTableDatosMes = new JTableMe();      
		
		String sToolTipMes="";
		sToolTipMes=MesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMes+="(Seguridad.Mes)";
		}
		
		if(!this.mesSessionBean.getEsGuardarRelacionado()) {
			sToolTipMes+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMes.setToolTipText(sToolTipMes);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMes);
		this.jTableDatosMes.setAutoCreateRowSorter(true);
		this.jTableDatosMes.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMes.setRowSelectionAllowed(true);
		this.jTableDatosMes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMes,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMes = new JButtonMe();
		this.jButtonDuplicarMes = new JButtonMe();
		this.jButtonCopiarMes = new JButtonMe();
		this.jButtonVerFormMes = new JButtonMe();
		this.jButtonNuevoRelacionesMes = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMes = new JButtonMe();
		this.jButtonCerrarMes = new JButtonMe();
		
		this.jScrollPanelDatosMes = new JScrollPane();   
        this.jScrollPanelDatosGeneralMes = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Mes";
		
		if(!this.mesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mess" + this.sPath));
		} else {
			this.jScrollPanelDatosMes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMes.setToolTipText("Acciones");
        this.jPanelAccionesMes.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMes, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoMes=new ReporteDinamicoJInternalFrame(MesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMes();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMes=new ImportacionJInternalFrame(MesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMes();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMes = new JButtonMe();
		
		this.jButtonAbrirOrderByMes.setText("Orden");
		this.jButtonAbrirOrderByMes.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMes,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMes,false,this);
			
			//this.cargarOrderByMes(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMes,true,this);
			
			//this.cargarOrderByMes(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMes.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosMes.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosMes.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosMes.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMes.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMes.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMes.setText("Nuevo");
		this.jButtonDuplicarMes.setText("Duplicar");
		this.jButtonCopiarMes.setText("Copiar");
		this.jButtonVerFormMes.setText("Ver");
		this.jButtonNuevoRelacionesMes.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMes.setText("Guardar");
		this.jButtonCerrarMes.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMes,"nuevo_button","Nuevo",this.mesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMes,"duplicar_button","Duplicar",this.mesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMes,"copiar_button","Copiar",this.mesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMes,"ver_form","Ver",this.mesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMes,"nuevorelaciones_button","Nuevo Rel",this.mesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMes,"guardarcambiostabla_button","Guardar",this.mesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMes,"cerrar_button","Salir",this.mesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMes, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMes.setToolTipText("Nuevo"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMes.setToolTipText("Duplicar"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMes.setToolTipText("Copiar"+" "+MesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMes.setToolTipText("Ver"+" "+MesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMes.setToolTipText("Nuevo Rel"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMes.setToolTipText("Guardar"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMes.setToolTipText("Salir"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMes";
		inputMap = this.jButtonNuevoMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMes"));
		
		//DUPLICAR
		sMapKey = "DuplicarMes";
		inputMap = this.jButtonDuplicarMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMes"));
		
		//COPIAR
		sMapKey = "CopiarMes";
		inputMap = this.jButtonCopiarMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMes"));
		
		//VEr FORM
		sMapKey = "VerFormMes";
		inputMap = this.jButtonVerFormMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMes"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMes";
		inputMap = this.jButtonNuevoRelacionesMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMes"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMes";
		inputMap = this.jButtonModificarMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMes"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMes";
		inputMap = this.jButtonCerrarMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMes"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMes";
		inputMap = this.jButtonGuardarCambiosTablaMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMes"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Mes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Mes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Mes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Mes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Mes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMes.setName("jPanelParametrosReportesMes"); 
		
		this.jPanelParametrosReportesAccionesMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMes.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMes.setName("jPanelParametrosReportesAccionesMes"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMes, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMes, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMes = new JButtonMe();
		this.jButtonRecargarInformacionMes.setText("Recargar");
		this.jButtonRecargarInformacionMes.setToolTipText("Recargar"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMes,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionMes = new JButtonMe();
		this.jButtonProcesarInformacionMes.setText("Procesar");
		this.jButtonProcesarInformacionMes.setToolTipText("Procesar"+" "+MesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMes.setVisible(false);
			
		this.jButtonProcesarInformacionMes.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMes.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMes.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMes.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMes.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMes.setText("TIPO");       
		this.jComboBoxTiposReportesMes.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMes.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMes.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMes = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMes.setText("Paginacion");
		this.jComboBoxTiposPaginacionMes.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMes = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMes.setText("Accion");
		this.jComboBoxTiposRelacionesMes.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMes.setText("Accion");
		this.jComboBoxTiposAccionesMes.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMes = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMes.setText("Accion");
		this.jComboBoxTiposSeleccionarMes.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMes=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMes.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMes.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMes.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMes = new JLabelMe();
		
		this.jLabelAccionesMes.setText("Acciones");		
		this.jLabelAccionesMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMes = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMes.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMes.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMes = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMes.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMes.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMes = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMes.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMes.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMes = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMes.setText("Graf.");
		this.jCheckBoxConGraficoReporteMes.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMes = new JButtonMe();
		//this.jButtonAnterioresMes.setText("<<");
        this.jButtonAnterioresMes.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMes,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMes = new JButtonMe();
		//this.jButtonSiguientesMes.setText(">>");
        this.jButtonSiguientesMes.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMes,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMes = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMes.setText("Nue");
        this.jButtonNuevoGuardarCambiosMes.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMes,"nuevoguardarcambios_button","Nue",this.mesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMes";
		inputMap = this.jButtonNuevoGuardarCambiosMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMes"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMes";
		inputMap = this.jButtonRecargarInformacionMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMes"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMes";
		inputMap = this.jButtonSiguientesMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMes"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMes";
		inputMap = this.jButtonAnterioresMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMes"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMes();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMes.setMinimumSize(new Dimension(this.getWidth(),MesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMes.setMaximumSize(new Dimension(this.getWidth(),MesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMes.setPreferredSize(new Dimension(this.getWidth(),MesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMes = new GridBagLayout();

			this.jPanelPaginacionMes.setLayout(gridaBagLayoutPaginacionMes);						
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMes.gridy = 0;
			this.gridBagConstraintsMes.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMes.add(this.jButtonAnterioresMes, this.gridBagConstraintsMes);
					
						
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMes.gridy = 0;
			
			this.jPanelPaginacionMes.add(this.jButtonNuevoGuardarCambiosMes, this.gridBagConstraintsMes);
						
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMes.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMes.gridy = 0;
			this.jPanelPaginacionMes.add(this.jButtonSiguientesMes, this.gridBagConstraintsMes);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMes.gridy = 1;
			this.gridBagConstraintsMes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMes.add(this.jButtonNuevoMes, this.gridBagConstraintsMes);
						
			
			
			if(!this.mesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMes = new GridBagConstraints();
				this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMes.gridy = 1;
				this.gridBagConstraintsMes.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionMes.add(this.jButtonGuardarCambiosTablaMes, this.gridBagConstraintsMes);
			}
			
			
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMes.gridy = 1;
			this.gridBagConstraintsMes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMes.add(this.jButtonDuplicarMes, this.gridBagConstraintsMes);
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMes.gridy = 1;
			this.gridBagConstraintsMes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMes.add(this.jButtonCopiarMes, this.gridBagConstraintsMes);
		
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMes.gridy = 1;
			this.gridBagConstraintsMes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMes.add(this.jButtonVerFormMes, this.gridBagConstraintsMes);
		
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMes.gridy = 1;
			this.gridBagConstraintsMes.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMes.add(this.jButtonCerrarMes, this.gridBagConstraintsMes);
		
		
		
		this.jButtonRecargarInformacionMes.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMes.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMes.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMes, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMes.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMes.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMes.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMes.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMes.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMes.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMes.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMes.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMes.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMes.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMes.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMes.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMes.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMes.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMes.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMes, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMes.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMes.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMes.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMes.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMes.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMes.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMes = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMes = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Mes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Mes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Mes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Mes = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMes.setLayout(gridaBagParametrosReportesMes);
			this.jPanelParametrosReportesAccionesMes.setLayout(gridaBagParametrosReportesAccionesMes);
			
			
			this.jPanelParametrosAuxiliar1Mes.setLayout(gridaBagParametrosAuxiliar1Mes);
			this.jPanelParametrosAuxiliar2Mes.setLayout(gridaBagParametrosAuxiliar2Mes);
			this.jPanelParametrosAuxiliar3Mes.setLayout(gridaBagParametrosAuxiliar3Mes);
			this.jPanelParametrosAuxiliar4Mes.setLayout(gridaBagParametrosAuxiliar4Mes);
			//this.jPanelParametrosAuxiliar5Mes.setLayout(gridaBagParametrosAuxiliar2Mes);			
			
			
			
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMes.add(this.jButtonRecargarInformacionMes, this.gridBagConstraintsMes);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Mes.add(this.jComboBoxTiposPaginacionMes, this.gridBagConstraintsMes);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Mes.add(this.jCheckBoxConAltoMaximoTablaMes, this.gridBagConstraintsMes);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Mes.add(this.jComboBoxTiposArchivosReportesMes, this.gridBagConstraintsMes);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMes.add(this.jPanelParametrosAuxiliar1Mes, this.gridBagConstraintsMes);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Mes.add(this.jComboBoxTiposReportesMes, this.gridBagConstraintsMes);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMes.add(this.jPanelParametrosAuxiliar4Mes, this.gridBagConstraintsMes);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMes.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMes.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMes.add(this.jComboBoxTiposReportesMes, this.gridBagConstraintsMes);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMes.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMes.add(this.jCheckBoxGenerarReporteMes, this.gridBagConstraintsMes);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMes.add(this.jPanelParametrosAuxiliar2Mes, this.gridBagConstraintsMes);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMes.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMes.add(this.jLabelAccionesMes, this.gridBagConstraintsMes);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMes = new GridBagConstraints();
				this.gridBagConstraintsMes.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMes.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMes.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMes.add(this.jButtonAbrirOrderByMes, this.gridBagConstraintsMes);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMes.add(this.jComboBoxTiposSeleccionarMes, this.gridBagConstraintsMes);			
			
			
			/*
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMes.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMes.add(this.jCheckBoxSeleccionarTodosMes, this.gridBagConstraintsMes);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Mes.add(this.jCheckBoxSeleccionarTodosMes, this.gridBagConstraintsMes);															
				
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Mes.add(this.jCheckBoxSeleccionadosMes, this.gridBagConstraintsMes);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMes.add(this.jPanelParametrosAuxiliar3Mes, this.gridBagConstraintsMes);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMes.add(this.jComboBoxTiposAccionesMes, this.gridBagConstraintsMes);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMes = new GridBagLayout();

			this.jScrollPanelDatosMes.setLayout(gridaBagLayoutDatosMes);
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMes.gridy = 0;
			this.gridBagConstraintsMes.gridx = 0;
			
			this.jScrollPanelDatosMes.add(this.jTableDatosMes, this.gridBagConstraintsMes);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMes.setViewportView(this.jTableDatosMes);
		this.jTableDatosMes.setFillsViewportHeight(true);
		this.jTableDatosMes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMes= new GridBagLayout();
		this.jPanelAccionesMes.setLayout(gridaBagLayoutAccionesMes);
		
		
		/*	
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMes.gridy = 0;
		this.gridBagConstraintsMes.gridx = 0;
			
		this.jPanelAccionesMes.add(this.jButtonNuevoMes, this.gridBagConstraintsMes);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMes = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMes);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.mesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMes = new GridBagConstraints();						
			this.gridBagConstraintsMes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMes.gridx = 0;		
			//this.gridBagConstraintsMes.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMes.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMes.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMes, this.gridBagConstraintsMes);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMes.gridx = 0;		
		//this.gridBagConstraintsMes.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMes.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMes.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMes);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMes.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMes, this.gridBagConstraintsMes);								
		
		
		/*
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMes.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMes, this.gridBagConstraintsMes);
		*/		
		
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMes.gridx =0;
		this.gridBagConstraintsMes.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMes.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMes, this.gridBagConstraintsMes);
				
		
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMes.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMes, this.gridBagConstraintsMes);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(MesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMes = new GridBagLayout();
			this.jPanelBusquedasParametrosMes.setLayout(gridaBagLayoutBusquedasParametrosMes);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMes=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMes, this.gridBagConstraintsMes);
			
			
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMes, this.gridBagConstraintsMes);
		
			
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMes.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMes, this.gridBagConstraintsMes);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMes;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMes() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMes = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMes.setName("jPanelReporteDinamicoMes"); 
		
		this.jPanelReporteDinamicoMes.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMes.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMes.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMes.setLayout(gridaBagLayoutReporteDinamicoMes);
		
		
		this.jInternalFrameReporteDinamicoMes= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMes = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMes= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMes.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMes.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMes.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMes.setResizable(true);
	    this.jInternalFrameReporteDinamicoMes.setClosable(true);
	    this.jInternalFrameReporteDinamicoMes.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMes.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMes.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMes.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mess"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMes = new JLabelMe();

		this.jLabelColumnasSelectReporteMes.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMes.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMes.add(this.jLabelColumnasSelectReporteMes, this.gridBagConstraintsMes);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMes = new JList<Reporte>();
		this.jListColumnasSelectReporteMes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMes.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMes.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMes.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMes.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMes=new JScrollPane(this.jListColumnasSelectReporteMes);
			
			this.jScrollColumnasSelectReporteMes.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMes.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMes.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMes.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMes.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMes.add(this.jListColumnasSelectReporteMes, this.gridBagConstraintsMes);
		this.jPanelReporteDinamicoMes.add(this.jScrollColumnasSelectReporteMes, this.gridBagConstraintsMes);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMes = new JLabelMe();

		this.jLabelRelacionesSelectReporteMes.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMes = new JList<Reporte>();
		this.jListRelacionesSelectReporteMes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMes.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMes.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMes.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMes.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMes=new JScrollPane(this.jListRelacionesSelectReporteMes);
			
			this.jScrollRelacionesSelectReporteMes.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMes.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMes.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMes.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoMes = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMes = new JComboBoxMe();
		this.jListColumnasValoresGraficoMes = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMes = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMes.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMes, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMes = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMes.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMes, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMes = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMes.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMes.add(this.jLabelGenerarExcelReporteDinamicoMes, this.gridBagConstraintsMes);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMes = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMes.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMes,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMes.setToolTipText("Generar EXCEL"+" "+MesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMes = new GridBagConstraints();
		//this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMes.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMes.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMes.add(this.jButtonGenerarExcelReporteDinamicoMes, this.gridBagConstraintsMes);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMes.add(this.jComboBoxTiposReportesDinamicoMes, this.gridBagConstraintsMes);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMes = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMes.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMes.add(this.jLabelTiposArchivoReporteDinamicoMes, this.gridBagConstraintsMes);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMes.add(this.jComboBoxTiposArchivosReportesDinamicoMes, this.gridBagConstraintsMes);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMes = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMes.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMes,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMes.setToolTipText("Generar"+" "+MesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMes.add(this.jButtonGenerarReporteDinamicoMes, this.gridBagConstraintsMes);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMes = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMes.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMes,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMes.setToolTipText("Cancelar"+" "+MesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMes.add(this.jButtonCerrarReporteDinamicoMes, this.gridBagConstraintsMes);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMes = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMes= new JScrollPane(jPanelReporteDinamicoMes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMes.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMes.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMes.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mess"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMes.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMes.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMes.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMes);
		this.jInternalFrameReporteDinamicoMes.getContentPane().add(this.jScrollPanelReporteDinamicoMes, this.gridBagConstraintsMes);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMes() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMes = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMes.setName("jPanelImportacionMes"); 
		
		this.jPanelImportacionMes.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMes.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMes.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMes.setLayout(gridaBagLayoutImportacionMes);
		
		
		this.jInternalFrameImportacionMes= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMes= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMes = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMes= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMes.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMes.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMes.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMes.setResizable(true);
	    this.jInternalFrameImportacionMes.setClosable(true);
	    this.jInternalFrameImportacionMes.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMes.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMes.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMes.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMes.setResizable(true);
	    this.jInternalFrameImportacionMes.setClosable(true);
	    this.jInternalFrameImportacionMes.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMes.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMes.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMes.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mess"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMes = new JLabelMe();

		this.jLabelArchivoImportacionMes.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMes.gridy = iPosYImportacion;		
		this.gridBagConstraintsMes.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMes.add(this.jLabelArchivoImportacionMes, this.gridBagConstraintsMes);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMes = new JFileChooser();		
		this.jFileChooserImportacionMes.setToolTipText("ESCOGER ARCHIVO"+" "+MesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMes = new JButtonMe();
		this.jButtonAbrirImportacionMes.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMes,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMes.setToolTipText("Generar"+" "+MesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMes.gridy = iPosYImportacion;
		this.gridBagConstraintsMes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMes.add(this.jButtonAbrirImportacionMes, this.gridBagConstraintsMes);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMes = new JLabelMe();

		this.jLabelPathArchivoImportacionMes.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMes.gridy = iPosYImportacion;		
		this.gridBagConstraintsMes.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMes.add(this.jLabelPathArchivoImportacionMes, this.gridBagConstraintsMes);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMes=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMes.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMes.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMes.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMes.gridy = iPosYImportacion;
		this.gridBagConstraintsMes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMes.add(this.jTextFieldPathArchivoImportacionMes, this.gridBagConstraintsMes);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMes = new JButtonMe();
		this.jButtonGenerarImportacionMes.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMes,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMes.setToolTipText("Generar"+" "+MesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMes.gridy = iPosYImportacion;
		this.gridBagConstraintsMes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMes.add(this.jButtonGenerarImportacionMes, this.gridBagConstraintsMes);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMes = new JButtonMe();
		this.jButtonCerrarImportacionMes.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMes,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMes.setToolTipText("Cancelar"+" "+MesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMes.gridy = iPosYImportacion;
		this.gridBagConstraintsMes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMes.add(this.jButtonCerrarImportacionMes, this.gridBagConstraintsMes);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMes = new GridBagLayout();
		
		this.jScrollPanelImportacionMes= new JScrollPane(jPanelImportacionMes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy =iPosYImportacion;
		this.gridBagConstraintsMes.gridx =iPosXImportacion;
		this.gridBagConstraintsMes.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMes.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMes);
		this.jInternalFrameImportacionMes.getContentPane().add(this.jScrollPanelImportacionMes, this.gridBagConstraintsMes);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMes(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMes = new JButtonMe();
			this.jButtonAbrirOrderByMes.setText("Orden");
			this.jButtonAbrirOrderByMes.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMes,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMes";
			inputMap = this.jButtonAbrirOrderByMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMes"));
		
		
			GridBagLayout gridaBagLayoutOrderByMes = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMes.setName("jPanelOrderByMes"); 
			
			this.jPanelOrderByMes.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMes.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMes.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMes.setLayout(gridaBagLayoutOrderByMes);
			
			
			this.jTableDatosMesOrderBy = new JTableMe();        
			this.jTableDatosMesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMesOrderBy.setViewportView(this.jTableDatosMesOrderBy);
			this.jTableDatosMesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMes= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMes= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMes = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMes= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMes.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMes.setTitle("Orden");
			this.jInternalFrameOrderByMes.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMes.setResizable(true);
			this.jInternalFrameOrderByMes.setClosable(true);
			this.jInternalFrameOrderByMes.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMes.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMes.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMes.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mess"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMes.gridx =iPosXOrderBy;
			this.gridBagConstraintsMes.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMes.ipady =150;
				
			this.jPanelOrderByMes.add(jScrollPanelDatosMesOrderBy, this.gridBagConstraintsMes);//this.jTableDatosMesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMes = new JButtonMe();
			this.jButtonCerrarOrderByMes.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMes,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMes.setToolTipText("Cancelar"+" "+MesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMes.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMes.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMes.add(this.jButtonCerrarOrderByMes, this.gridBagConstraintsMes);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMes = new GridBagLayout();
			
			this.jScrollPanelOrderByMes= new JScrollPane(jPanelOrderByMes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.gridy =iPosYOrderBy;
			this.gridBagConstraintsMes.gridx =iPosXOrderBy;
			this.gridBagConstraintsMes.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMes.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMes);
			
			this.jInternalFrameOrderByMes.getContentPane().add(this.jScrollPanelOrderByMes, this.gridBagConstraintsMes);			
		
		} else {
			this.jButtonAbrirOrderByMes = new JButtonMe();
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
		int iWidthTableCalculado=0;//530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.mesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMes.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMes.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMes.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosMes.getRowHeight();//MesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.mesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMes.isSelected()) {
					iHeightTable=MesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMes.isSelected()) {
					iHeightTable=MesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMes.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMes.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMes.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMes.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMes.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMes.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMes!=null && this.jInternalFrameOrderByMes.getjTableDatosOrderBy()!=null) {
			//if(!this.mesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMes.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMes.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMes.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMes.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMes.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMes.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMes.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMes.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMes.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMes.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=mesLogic.getMess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mess.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Mes> TraerMesBeans(List<Mes> mess,ArrayList<Classe> classes)throws Exception {
		try {
			for(Mes mes:mess) {
					
				if(!(MesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					mes.setsDetalleGeneralEntityReporte(MesConstantesFunciones.getMesDescripcion(mes));
										
						
					
						
					
				} else  {
							
					//mes.setsDetalleGeneralEntityReporte(mes.getsDetalleGeneralEntityReporte());
										
				}
				
				//mesbeans.add(mesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return mess;
    }
	//PARA REPORTES FIN
}
