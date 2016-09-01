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
import com.bydan.erp.seguridad.util.AnioConstantesFunciones;

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
public class AnioJInternalFrame extends AnioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAnio;
	
	protected JMenuBar jmenuBarAnio;
	
	protected JMenu jmenuAnio;
	protected JMenu jmenuDatosAnio;
	protected JMenu jmenuArchivoAnio;
	protected JMenu jmenuAccionesAnio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAnio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAnio;	
	protected GridBagConstraints gridBagConstraintsAnio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AnioDetalleFormJInternalFrame jInternalFrameDetalleFormAnio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAnio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAnio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public AnioSessionBean anioSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Anio> anios;		
	public List<Anio> aniosEliminados;	
	public List<Anio> aniosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAnio;		
	protected JButton jButtonAbrirOrderByAnio;
	
	
	//protected JPanel jPanelOrderByAnio;
	//public JScrollPane jScrollPanelOrderByAnio;	
	//protected JButton jButtonCerrarOrderByAnio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AnioLogic anioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAnio;
	public JScrollPane jScrollPanelDatosEdicionAnio;
	public JScrollPane jScrollPanelDatosGeneralAnio;
    
	
	
	//public JScrollPane jScrollPanelDatosAnioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAnio;
	//public JScrollPane jScrollPanelImportacionAnio;
	
	
	
	protected JPanel jPanelAccionesAnio;
	
    protected JPanel jPanelPaginacionAnio;
    protected JPanel jPanelParametrosReportesAnio;
	protected JPanel jPanelParametrosReportesAccionesAnio;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Anio;
	protected JPanel jPanelParametrosAuxiliar2Anio;
	protected JPanel jPanelParametrosAuxiliar3Anio;
	protected JPanel jPanelParametrosAuxiliar4Anio;
	//protected JPanel jPanelParametrosAuxiliar5Anio;
	
	
	
	//protected JPanel jPanelReporteDinamicoAnio;
	//protected JPanel jPanelImportacionAnio;
	
	
	public JTable jTableDatosAnio;
	
	
	
	//public JTable jTableDatosAnioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAnio;
	protected JButton jButtonDuplicarAnio;
	protected JButton jButtonCopiarAnio;
	protected JButton jButtonVerFormAnio;
	protected JButton jButtonNuevoRelacionesAnio;
	protected JButton jButtonModificarAnio;
	
    protected JButton jButtonGuardarCambiosTablaAnio;
	protected JButton jButtonCerrarAnio;
	
	
	protected JButton jButtonRecargarInformacionAnio;
	protected JButton jButtonProcesarInformacionAnio;
	
	
	protected JButton jButtonAnterioresAnio;
	protected JButton jButtonSiguientesAnio;
	protected JButton jButtonNuevoGuardarCambiosAnio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAnio;
	//protected JButton jButtonCerrarReporteDinamicoAnio;
	//protected JButton jButtonGenerarExcelReporteDinamicoAnio;	
	
	
	
	//protected JButton jButtonAbrirImportacionAnio;
	//protected JButton jButtonGenerarImportacionAnio;
	//protected JButton jButtonCerrarImportacionAnio;
	//protected JFileChooser jFileChooserImportacionAnio;
	//protected File fileImportacionAnio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAnio;
	protected JButton jButtonDuplicarToolBarAnio;
	protected JButton jButtonNuevoRelacionesToolBarAnio;
	
	
	public JButton jButtonGuardarCambiosToolBarAnio;
	protected JButton jButtonCopiarToolBarAnio;
	protected JButton jButtonVerFormToolBarAnio;
	public JButton jButtonGuardarCambiosTablaToolBarAnio;
	protected JButton jButtonMostrarOcultarTablaToolBarAnio;
	protected JButton jButtonCerrarToolBarAnio;
	
	protected JButton jButtonRecargarInformacionToolBarAnio;
	protected JButton jButtonProcesarInformacionToolBarAnio;
	protected JButton jButtonAnterioresToolBarAnio;
	protected JButton jButtonSiguientesToolBarAnio;
	protected JButton jButtonNuevoGuardarCambiosToolBarAnio;
	protected JButton jButtonAbrirOrderByToolBarAnio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAnio;
	protected JMenuItem jMenuItemDuplicarAnio;
	protected JMenuItem jMenuItemNuevoRelacionesAnio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAnio;
	protected JMenuItem jMenuItemCopiarAnio;
	protected JMenuItem jMenuItemVerFormAnio;
	protected JMenuItem jMenuItemGuardarCambiosTablaAnio;
	protected JMenuItem jMenuItemCerrarAnio;
	protected JMenuItem jMenuItemDetalleCerrarAnio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAnio;
	protected JMenuItem jMenuItemDetalleMostarOcultarAnio;
	
	protected JMenuItem jMenuItemRecargarInformacionAnio;
	protected JMenuItem jMenuItemProcesarInformacionAnio;
	protected JMenuItem jMenuItemAnterioresAnio;
	protected JMenuItem jMenuItemSiguientesAnio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAnio;
	protected JMenuItem jMenuItemAbrirOrderByAnio;
	protected JMenuItem jMenuItemMostrarOcultarAnio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAnio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAnio;
	protected JCheckBox jCheckBoxSeleccionadosAnio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAnio;
	protected JCheckBox jCheckBoxConGraficoReporteAnio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAnio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAnio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAnio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAnio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAnio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAnio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAnio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAnio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAnio;
	protected JTextField jTextFieldValorCampoGeneralAnio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAnio;
	//public JList<Reporte> jListColumnasSelectReporteAnio;
	//public JScrollPane jScrollColumnasSelectReporteAnio;
	
	//public JLabel jLabelRelacionesSelectReporteAnio;
	//public JList<Reporte> jListRelacionesSelectReporteAnio;
	//public JScrollPane jScrollRelacionesSelectReporteAnio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAnio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAnio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAnio;
	//public JLabel jLabelTiposArchivoReporteDinamicoAnio;
	
		
	//public JLabel jLabelArchivoImportacionAnio;	
	//public JLabel jLabelPathArchivoImportacionAnio;
	//protected JTextField jTextFieldPathArchivoImportacionAnio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAnio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAnio;
	
	//public JLabel jLabelColumnaCategoriaValorAnio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAnio;
	
	//public JLabel jLabelColumnasValoresGraficoAnio;
	//public JList<Reporte> jListColumnasValoresGraficoAnio;
	//public JScrollPane jScrollColumnasValoresGraficoAnio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAnio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAnio;	
	
	
	
	
	
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
	public AnioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Anio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Anio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Anio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Anio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAnio)	{
		this.jButtonRecargarInformacionAnio = jButtonRecargarInformacionAnio;
	}
	
	public JButton getjButtonProcesarInformacionAnio() {
		return this.jButtonProcesarInformacionAnio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAnio)	{
		this.jButtonProcesarInformacionAnio = jButtonProcesarInformacionAnio;
	}
	
	
	public JButton getjButtonRecargarInformacionAnio() {
		return this.jButtonRecargarInformacionAnio;
	}
	
	
	public List<Anio> getanios() {
		return this.anios;
	}

	public void setanios(List<Anio> anios) {
		this.anios = anios;
	}
	
	public List<Anio> getaniosAux() {
		return this.aniosAux;
	}

	public void setaniosAux(List<Anio> aniosAux) {
		this.aniosAux = aniosAux;
	}
	
	public List<Anio> getaniosEliminados() {
		return this.aniosEliminados;
	}

	public void setAniosEliminados(List<Anio> aniosEliminados) {
		this.aniosEliminados = aniosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAnio() {
		return jComboBoxTiposSeleccionarAnio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAnio(
			JComboBox jComboBoxTiposSeleccionarAnio) {
		this.jComboBoxTiposSeleccionarAnio = jComboBoxTiposSeleccionarAnio;
	}
	
	public void setBorderResaltarTiposSeleccionarAnio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAnio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAnio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAnio() {
		return jTextFieldValorCampoGeneralAnio;
	}

	public void setjTextFieldValorCampoGeneralAnio(
			JTextField jTextFieldValorCampoGeneralAnio) {
		this.jTextFieldValorCampoGeneralAnio = jTextFieldValorCampoGeneralAnio;
	}

	public void setBorderResaltarValorCampoGeneralAnio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAnio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAnio() {
		return this.jCheckBoxSeleccionarTodosAnio;
	}

	public void setjCheckBoxSeleccionarTodosAnio(
			JCheckBox jCheckBoxSeleccionarTodosAnio) {
		this.jCheckBoxSeleccionarTodosAnio = jCheckBoxSeleccionarTodosAnio;
	}

	public void setBorderResaltarSeleccionarTodosAnio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAnio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAnio() {
		return this.jCheckBoxSeleccionadosAnio;
	}

	public void setjCheckBoxSeleccionadosAnio(
			JCheckBox jCheckBoxSeleccionadosAnio) {
		this.jCheckBoxSeleccionadosAnio = jCheckBoxSeleccionadosAnio;
	}
	
	public void setBorderResaltarSeleccionadosAnio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAnio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAnio() {
		return this.jComboBoxTiposArchivosReportesAnio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAnio(
			JComboBox jComboBoxTiposArchivosReportesAnio) {
		this.jComboBoxTiposArchivosReportesAnio = jComboBoxTiposArchivosReportesAnio;
	}

	public void setBorderResaltarTiposArchivosReportesAnio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAnio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAnio() {
		return this.jComboBoxTiposReportesAnio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAnio(
			JComboBox jComboBoxTiposReportesAnio) {
		this.jComboBoxTiposReportesAnio = jComboBoxTiposReportesAnio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAnio() {
	//	return jComboBoxTiposReportesDinamicoAnio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAnio(
	//		JComboBox jComboBoxTiposReportesDinamicoAnio) {
	//	this.jComboBoxTiposReportesDinamicoAnio = jComboBoxTiposReportesDinamicoAnio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAnio() {
	//	return jComboBoxTiposArchivosReportesDinamicoAnio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAnio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAnio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAnio = jComboBoxTiposArchivosReportesDinamicoAnio;
	//}
	
	public void setBorderResaltarTiposReportesAnio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAnio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAnio() {
		return this.jComboBoxTiposGraficosReportesAnio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAnio(
			JComboBox jComboBoxTiposGraficosReportesAnio) {
		this.jComboBoxTiposGraficosReportesAnio = jComboBoxTiposGraficosReportesAnio;
	}
	
	public void setBorderResaltarTiposGraficosReportesAnio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAnio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAnio() {
		return this.jComboBoxTiposPaginacionAnio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAnio(
			JComboBox jComboBoxTiposPaginacionAnio) {
		this.jComboBoxTiposPaginacionAnio = jComboBoxTiposPaginacionAnio;
	}
	
	public void setBorderResaltarTiposPaginacionAnio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAnio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAnio() {
		return this.jComboBoxTiposRelacionesAnio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAnio() {
		return this.jComboBoxTiposAccionesAnio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAnio(
			JComboBox jComboBoxTiposRelacionesAnio) {
		this.jComboBoxTiposRelacionesAnio = jComboBoxTiposRelacionesAnio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAnio(
			JComboBox jComboBoxTiposAccionesAnio) {
		this.jComboBoxTiposAccionesAnio = jComboBoxTiposAccionesAnio;
	}
	
	public void setBorderResaltarTiposRelacionesAnio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAnio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAnio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAnio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAnio() {
	//	return jCheckBoxConGraficoDinamicoAnio;
	//}

	//public void setjCheckBoxConGraficoDinamicoAnio(
	//		JCheckBox jCheckBoxConGraficoDinamicoAnio) {
	//	this.jCheckBoxConGraficoDinamicoAnio = jCheckBoxConGraficoDinamicoAnio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAnio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAnio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAnio .setBorder(borderResaltar);		
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
		this.anioSessionBean=new AnioSessionBean();
		
		this.anioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.anioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.anioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AnioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AnioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AnioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AnioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AnioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Anio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.anioSessionBean.getEsGuardarRelacionado()) {
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
		
		AnioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Anio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAnio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAnio,this.jTtoolBarAnio,
							"nuevo","nuevo","Nuevo"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAnio,this.jTtoolBarAnio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAnio,this.jTtoolBarAnio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAnio,this.jTtoolBarAnio,
							"duplicar","duplicar","Duplicar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAnio,this.jTtoolBarAnio,
							"copiar","copiar","Copiar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAnio,this.jTtoolBarAnio,
							"ver_form","ver_form","Ver"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAnio,this.jTtoolBarAnio,
							"recargar","recargar","Recargar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAnio,this.jTtoolBarAnio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAnio,this.jTtoolBarAnio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAnio,this.jTtoolBarAnio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAnio,this.jTtoolBarAnio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAnio,this.jTtoolBarAnio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAnio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAnio,this.jTtoolBarAnio,
							"cerrar","cerrar","Salir"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAnio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAnio;
			
				this.jButtonProcesarInformacionToolBarAnio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAnio;
				
		//protected JButton jButtonModificarToolBarAnio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAnio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAnio=new JMenuMe("General");
		this.jmenuArchivoAnio=new JMenuMe("Archivo");
		this.jmenuAccionesAnio=new JMenuMe("Acciones");
		this.jmenuDatosAnio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAnio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAnio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAnio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAnio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAnio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAnio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAnio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAnio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAnio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAnio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAnio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAnio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAnio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAnio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAnio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAnio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAnio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAnio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAnio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAnio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAnio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAnio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAnio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAnio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAnio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAnio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAnio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAnio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAnio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAnio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAnio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAnio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAnio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAnio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAnio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAnio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAnio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAnio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAnio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAnio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAnio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAnio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAnio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAnio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAnio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAnio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAnio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAnio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAnio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAnio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAnio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAnio.add(this.jMenuItemCerrarAnio);
			
			this.jmenuAccionesAnio.add(this.jMenuItemNuevoAnio);
			this.jmenuAccionesAnio.add(this.jMenuItemNuevoGuardarCambiosAnio);
			this.jmenuAccionesAnio.add(this.jMenuItemNuevoRelacionesAnio);
			this.jmenuAccionesAnio.add(this.jMenuItemGuardarCambiosTablaAnio);		
			this.jmenuAccionesAnio.add(this.jMenuItemDuplicarAnio);		
			this.jmenuAccionesAnio.add(this.jMenuItemCopiarAnio);		
			this.jmenuAccionesAnio.add(this.jMenuItemVerFormAnio);		
			
			this.jmenuDatosAnio.add(this.jMenuItemRecargarInformacionAnio);				
			this.jmenuDatosAnio.add(this.jMenuItemAnterioresAnio);				
			this.jmenuDatosAnio.add(this.jMenuItemSiguientesAnio);				
			this.jmenuDatosAnio.add(this.jMenuItemAbrirOrderByAnio);				
			this.jmenuDatosAnio.add(this.jMenuItemMostrarOcultarAnio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAnio.add(this.jMenuItemGuardarCambiosAnio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAnio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAnio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAnio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAnio.add(this.jmenuArchivoAnio);		
			this.jmenuBarAnio.add(this.jmenuAccionesAnio);		
			this.jmenuBarAnio.add(this.jmenuDatosAnio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAnio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAnio() {
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
			//this.jInternalFrameDetalleAnio = new AnioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Anio DATOS");
			this.jInternalFrameDetalleFormAnio = new AnioDetalleFormJInternalFrame(jDesktopPane,this.anioSessionBean.getConGuardarRelaciones(),this.anioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAnio = null;//new AnioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAnio= new GridBagLayout();
		
		
		this.jTableDatosAnio = new JTableMe();      
		
		String sToolTipAnio="";
		sToolTipAnio=AnioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAnio+="(Seguridad.Anio)";
		}
		
		if(!this.anioSessionBean.getEsGuardarRelacionado()) {
			sToolTipAnio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAnio.setToolTipText(sToolTipAnio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAnio);
		this.jTableDatosAnio.setAutoCreateRowSorter(true);
		this.jTableDatosAnio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAnio.setRowSelectionAllowed(true);
		this.jTableDatosAnio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAnio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAnio = new JButtonMe();
		this.jButtonDuplicarAnio = new JButtonMe();
		this.jButtonCopiarAnio = new JButtonMe();
		this.jButtonVerFormAnio = new JButtonMe();
		this.jButtonNuevoRelacionesAnio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAnio = new JButtonMe();
		this.jButtonCerrarAnio = new JButtonMe();
		
		this.jScrollPanelDatosAnio = new JScrollPane();   
        this.jScrollPanelDatosGeneralAnio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAnio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Anio";
		
		if(!this.anioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anios" + this.sPath));
		} else {
			this.jScrollPanelDatosAnio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAnio.setToolTipText("Acciones");
        this.jPanelAccionesAnio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAnio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAnio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAnio=new ReporteDinamicoJInternalFrame(AnioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAnio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAnio=new ImportacionJInternalFrame(AnioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAnio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAnio = new JButtonMe();
		
		this.jButtonAbrirOrderByAnio.setText("Orden");
		this.jButtonAbrirOrderByAnio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAnio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAnio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAnio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAnio,false,this);
			
			//this.cargarOrderByAnio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAnio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAnio,true,this);
			
			//this.cargarOrderByAnio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAnio.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosAnio.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosAnio.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosAnio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAnio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAnio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAnio.setText("Nuevo");
		this.jButtonDuplicarAnio.setText("Duplicar");
		this.jButtonCopiarAnio.setText("Copiar");
		this.jButtonVerFormAnio.setText("Ver");
		this.jButtonNuevoRelacionesAnio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAnio.setText("Guardar");
		this.jButtonCerrarAnio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAnio,"nuevo_button","Nuevo",this.anioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAnio,"duplicar_button","Duplicar",this.anioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAnio,"copiar_button","Copiar",this.anioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAnio,"ver_form","Ver",this.anioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAnio,"nuevorelaciones_button","Nuevo Rel",this.anioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAnio,"guardarcambiostabla_button","Guardar",this.anioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAnio,"cerrar_button","Salir",this.anioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAnio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAnio.setToolTipText("Nuevo"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAnio.setToolTipText("Duplicar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAnio.setToolTipText("Copiar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAnio.setToolTipText("Ver"+" "+AnioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAnio.setToolTipText("Nuevo Rel"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAnio.setToolTipText("Guardar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAnio.setToolTipText("Salir"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAnio";
		inputMap = this.jButtonNuevoAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAnio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAnio"));
		
		//DUPLICAR
		sMapKey = "DuplicarAnio";
		inputMap = this.jButtonDuplicarAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAnio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAnio"));
		
		//COPIAR
		sMapKey = "CopiarAnio";
		inputMap = this.jButtonCopiarAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAnio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAnio"));
		
		//VEr FORM
		sMapKey = "VerFormAnio";
		inputMap = this.jButtonVerFormAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAnio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAnio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAnio";
		inputMap = this.jButtonNuevoRelacionesAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAnio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAnio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAnio";
		inputMap = this.jButtonModificarAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAnio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAnio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAnio";
		inputMap = this.jButtonCerrarAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAnio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAnio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAnio";
		inputMap = this.jButtonGuardarCambiosTablaAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAnio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAnio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAnio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAnio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAnio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Anio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Anio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Anio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Anio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Anio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAnio.setName("jPanelParametrosReportesAnio"); 
		
		this.jPanelParametrosReportesAccionesAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAnio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAnio.setName("jPanelParametrosReportesAccionesAnio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAnio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAnio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAnio = new JButtonMe();
		this.jButtonRecargarInformacionAnio.setText("Recargar");
		this.jButtonRecargarInformacionAnio.setToolTipText("Recargar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAnio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAnio = new JButtonMe();
		this.jButtonProcesarInformacionAnio.setText("Procesar");
		this.jButtonProcesarInformacionAnio.setToolTipText("Procesar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAnio.setVisible(false);
			
		this.jButtonProcesarInformacionAnio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAnio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAnio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAnio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAnio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAnio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAnio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAnio.setText("TIPO");       
		this.jComboBoxTiposReportesAnio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAnio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAnio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAnio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAnio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAnio.setText("Paginacion");
		this.jComboBoxTiposPaginacionAnio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAnio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAnio.setText("Accion");
		this.jComboBoxTiposRelacionesAnio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAnio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAnio.setText("Accion");
		this.jComboBoxTiposAccionesAnio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAnio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAnio.setText("Accion");
		this.jComboBoxTiposSeleccionarAnio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAnio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAnio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAnio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAnio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAnio = new JLabelMe();
		
		this.jLabelAccionesAnio.setText("Acciones");		
		this.jLabelAccionesAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAnio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAnio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAnio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAnio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAnio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAnio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAnio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAnio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAnio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAnio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAnio.setText("Graf.");
		this.jCheckBoxConGraficoReporteAnio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAnio = new JButtonMe();
		//this.jButtonAnterioresAnio.setText("<<");
        this.jButtonAnterioresAnio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAnio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAnio = new JButtonMe();
		//this.jButtonSiguientesAnio.setText(">>");
        this.jButtonSiguientesAnio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAnio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAnio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAnio.setText("Nue");
        this.jButtonNuevoGuardarCambiosAnio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAnio,"nuevoguardarcambios_button","Nue",this.anioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAnio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAnio";
		inputMap = this.jButtonNuevoGuardarCambiosAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAnio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAnio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAnio";
		inputMap = this.jButtonRecargarInformacionAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAnio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAnio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAnio";
		inputMap = this.jButtonSiguientesAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAnio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAnio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAnio";
		inputMap = this.jButtonAnterioresAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAnio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAnio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAnio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAnio.setMinimumSize(new Dimension(this.getWidth(),AnioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AnioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAnio.setMaximumSize(new Dimension(this.getWidth(),AnioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AnioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAnio.setPreferredSize(new Dimension(this.getWidth(),AnioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AnioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAnio = new GridBagLayout();

			this.jPanelPaginacionAnio.setLayout(gridaBagLayoutPaginacionAnio);						
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy = 0;
			this.gridBagConstraintsAnio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAnio.add(this.jButtonAnterioresAnio, this.gridBagConstraintsAnio);
					
						
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAnio.gridy = 0;
			
			this.jPanelPaginacionAnio.add(this.jButtonNuevoGuardarCambiosAnio, this.gridBagConstraintsAnio);
						
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAnio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAnio.gridy = 0;
			this.jPanelPaginacionAnio.add(this.jButtonSiguientesAnio, this.gridBagConstraintsAnio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy = 1;
			this.gridBagConstraintsAnio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAnio.add(this.jButtonNuevoAnio, this.gridBagConstraintsAnio);
						
			
			
			if(!this.anioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAnio = new GridBagConstraints();
				this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAnio.gridy = 1;
				this.gridBagConstraintsAnio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAnio.add(this.jButtonGuardarCambiosTablaAnio, this.gridBagConstraintsAnio);
			}
			
			
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy = 1;
			this.gridBagConstraintsAnio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAnio.add(this.jButtonDuplicarAnio, this.gridBagConstraintsAnio);
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy = 1;
			this.gridBagConstraintsAnio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAnio.add(this.jButtonCopiarAnio, this.gridBagConstraintsAnio);
		
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy = 1;
			this.gridBagConstraintsAnio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAnio.add(this.jButtonVerFormAnio, this.gridBagConstraintsAnio);
		
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy = 1;
			this.gridBagConstraintsAnio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAnio.add(this.jButtonCerrarAnio, this.gridBagConstraintsAnio);
		
		
		
		this.jButtonRecargarInformacionAnio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAnio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAnio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAnio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAnio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAnio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAnio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAnio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAnio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAnio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAnio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAnio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAnio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAnio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAnio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAnio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAnio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAnio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAnio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAnio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAnio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAnio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAnio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAnio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAnio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAnio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAnio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAnio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAnio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAnio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAnio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAnio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAnio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAnio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAnio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAnio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAnio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAnio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAnio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAnio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Anio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Anio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Anio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Anio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAnio.setLayout(gridaBagParametrosReportesAnio);
			this.jPanelParametrosReportesAccionesAnio.setLayout(gridaBagParametrosReportesAccionesAnio);
			
			
			this.jPanelParametrosAuxiliar1Anio.setLayout(gridaBagParametrosAuxiliar1Anio);
			this.jPanelParametrosAuxiliar2Anio.setLayout(gridaBagParametrosAuxiliar2Anio);
			this.jPanelParametrosAuxiliar3Anio.setLayout(gridaBagParametrosAuxiliar3Anio);
			this.jPanelParametrosAuxiliar4Anio.setLayout(gridaBagParametrosAuxiliar4Anio);
			//this.jPanelParametrosAuxiliar5Anio.setLayout(gridaBagParametrosAuxiliar2Anio);			
			
			
			
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAnio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAnio.add(this.jButtonRecargarInformacionAnio, this.gridBagConstraintsAnio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAnio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Anio.add(this.jComboBoxTiposPaginacionAnio, this.gridBagConstraintsAnio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAnio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Anio.add(this.jCheckBoxConAltoMaximoTablaAnio, this.gridBagConstraintsAnio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAnio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Anio.add(this.jComboBoxTiposArchivosReportesAnio, this.gridBagConstraintsAnio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnio.add(this.jPanelParametrosAuxiliar1Anio, this.gridBagConstraintsAnio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Anio.add(this.jComboBoxTiposReportesAnio, this.gridBagConstraintsAnio);																		
			
			
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Anio.add(this.jComboBoxTiposGraficosReportesAnio, this.gridBagConstraintsAnio);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnio.add(this.jPanelParametrosAuxiliar4Anio, this.gridBagConstraintsAnio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAnio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnio.add(this.jComboBoxTiposReportesAnio, this.gridBagConstraintsAnio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAnio.add(this.jCheckBoxGenerarReporteAnio, this.gridBagConstraintsAnio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnio.add(this.jPanelParametrosAuxiliar2Anio, this.gridBagConstraintsAnio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAnio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAnio.add(this.jLabelAccionesAnio, this.gridBagConstraintsAnio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAnio = new GridBagConstraints();
				this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAnio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAnio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAnio.add(this.jButtonAbrirOrderByAnio, this.gridBagConstraintsAnio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAnio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAnio.add(this.jComboBoxTiposSeleccionarAnio, this.gridBagConstraintsAnio);			
			
			
			/*
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAnio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAnio.add(this.jCheckBoxSeleccionarTodosAnio, this.gridBagConstraintsAnio);
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAnio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAnio.add(this.jCheckBoxConGraficoReporteAnio, this.gridBagConstraintsAnio);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Anio.add(this.jCheckBoxSeleccionarTodosAnio, this.gridBagConstraintsAnio);															
				
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Anio.add(this.jCheckBoxSeleccionadosAnio, this.gridBagConstraintsAnio);															
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Anio.add(this.jCheckBoxConGraficoReporteAnio, this.gridBagConstraintsAnio);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnio.add(this.jPanelParametrosAuxiliar3Anio, this.gridBagConstraintsAnio);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAnio.add(this.jComboBoxTiposAccionesAnio, this.gridBagConstraintsAnio);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAnio = new GridBagLayout();

			this.jScrollPanelDatosAnio.setLayout(gridaBagLayoutDatosAnio);
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy = 0;
			this.gridBagConstraintsAnio.gridx = 0;
			
			this.jScrollPanelDatosAnio.add(this.jTableDatosAnio, this.gridBagConstraintsAnio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAnio.setViewportView(this.jTableDatosAnio);
		this.jTableDatosAnio.setFillsViewportHeight(true);
		this.jTableDatosAnio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAnio= new GridBagLayout();
		this.jPanelAccionesAnio.setLayout(gridaBagLayoutAccionesAnio);
		
		
		/*	
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnio.gridy = 0;
		this.gridBagConstraintsAnio.gridx = 0;
			
		this.jPanelAccionesAnio.add(this.jButtonNuevoAnio, this.gridBagConstraintsAnio);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAnio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAnio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.anioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAnio = new GridBagConstraints();						
			this.gridBagConstraintsAnio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAnio.gridx = 0;		
			//this.gridBagConstraintsAnio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAnio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAnio, this.gridBagConstraintsAnio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAnio.gridx = 0;		
		//this.gridBagConstraintsAnio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAnio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAnio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAnio, this.gridBagConstraintsAnio);								
		
		
		/*
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAnio, this.gridBagConstraintsAnio);
		*/		
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAnio.gridx =0;
		this.gridBagConstraintsAnio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAnio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAnio, this.gridBagConstraintsAnio);
				
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAnio, this.gridBagConstraintsAnio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AnioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAnio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAnio = new GridBagLayout();
			this.jPanelBusquedasParametrosAnio.setLayout(gridaBagLayoutBusquedasParametrosAnio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAnio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAnio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAnio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAnio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAnio, this.gridBagConstraintsAnio);
			
			
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAnio, this.gridBagConstraintsAnio);
		
			
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAnio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAnio, this.gridBagConstraintsAnio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAnio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAnio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAnio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAnio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAnio.setName("jPanelReporteDinamicoAnio"); 
		
		this.jPanelReporteDinamicoAnio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAnio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAnio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAnio.setLayout(gridaBagLayoutReporteDinamicoAnio);
		
		
		this.jInternalFrameReporteDinamicoAnio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAnio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAnio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAnio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAnio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAnio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAnio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAnio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAnio.setResizable(true);
	    this.jInternalFrameReporteDinamicoAnio.setClosable(true);
	    this.jInternalFrameReporteDinamicoAnio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAnio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAnio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAnio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAnio = new JLabelMe();

		this.jLabelColumnasSelectReporteAnio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAnio.add(this.jLabelColumnasSelectReporteAnio, this.gridBagConstraintsAnio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAnio = new JList<Reporte>();
		this.jListColumnasSelectReporteAnio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAnio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAnio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAnio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAnio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAnio=new JScrollPane(this.jListColumnasSelectReporteAnio);
			
			this.jScrollColumnasSelectReporteAnio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAnio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAnio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAnio.add(this.jListColumnasSelectReporteAnio, this.gridBagConstraintsAnio);
		this.jPanelReporteDinamicoAnio.add(this.jScrollColumnasSelectReporteAnio, this.gridBagConstraintsAnio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAnio = new JLabelMe();

		this.jLabelRelacionesSelectReporteAnio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAnio = new JList<Reporte>();
		this.jListRelacionesSelectReporteAnio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAnio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAnio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAnio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAnio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAnio=new JScrollPane(this.jListRelacionesSelectReporteAnio);
			
			this.jScrollRelacionesSelectReporteAnio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAnio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAnio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAnio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAnio = new JComboBoxMe();
		this.jListColumnasValoresGraficoAnio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAnio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAnio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAnio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAnio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAnio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAnio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAnio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAnio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAnio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAnio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoAnio = new JLabelMe();

		this.jLabelConGraficoDinamicoAnio.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAnio.add(this.jLabelConGraficoDinamicoAnio, this.gridBagConstraintsAnio);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoAnio = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoAnio.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoAnio.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoAnio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAnio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAnio.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnio.add(this.jCheckBoxConGraficoDinamicoAnio, this.gridBagConstraintsAnio);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoAnio = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoAnio.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAnio.add(this.jLabelColumnaCategoriaGraficoAnio, this.gridBagConstraintsAnio);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoAnio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAnio.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoAnio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoAnio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAnio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAnio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoAnio.add(this.jComboBoxColumnaCategoriaGraficoAnio, this.gridBagConstraintsAnio);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorAnio = new JLabelMe();

		this.jLabelColumnaCategoriaValorAnio.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnio.add(this.jLabelColumnaCategoriaValorAnio, this.gridBagConstraintsAnio);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorAnio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorAnio.setText("Accion");
        this.jComboBoxColumnaCategoriaValorAnio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorAnio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAnio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAnio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoAnio.add(this.jComboBoxColumnaCategoriaValorAnio, this.gridBagConstraintsAnio);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoAnio = new JLabelMe();

		this.jLabelColumnasValoresGraficoAnio.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnio.add(this.jLabelColumnasValoresGraficoAnio, this.gridBagConstraintsAnio);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoAnio = new JList<Reporte>();
		this.jListColumnasValoresGraficoAnio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoAnio.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoAnio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAnio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAnio.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoAnio=new JScrollPane(this.jListColumnasValoresGraficoAnio);
			
			this.jScrollColumnasValoresGraficoAnio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAnio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAnio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoAnio.add(this.jListColumnasSelectReporteAnio, this.gridBagConstraintsAnio);
		this.jPanelReporteDinamicoAnio.add(this.jScrollColumnasValoresGraficoAnio, this.gridBagConstraintsAnio);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoAnio = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoAnio.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnio.add(this.jLabelTiposGraficosReportesDinamicoAnio, this.gridBagConstraintsAnio);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoAnio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAnio.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoAnio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoAnio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAnio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAnio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnio.add(this.jComboBoxTiposGraficosReportesDinamicoAnio, this.gridBagConstraintsAnio);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAnio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAnio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnio.add(this.jLabelGenerarExcelReporteDinamicoAnio, this.gridBagConstraintsAnio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAnio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAnio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAnio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAnio.setToolTipText("Generar EXCEL"+" "+AnioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAnio = new GridBagConstraints();
		//this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAnio.add(this.jButtonGenerarExcelReporteDinamicoAnio, this.gridBagConstraintsAnio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAnio.add(this.jComboBoxTiposReportesDinamicoAnio, this.gridBagConstraintsAnio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAnio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAnio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnio.add(this.jLabelTiposArchivoReporteDinamicoAnio, this.gridBagConstraintsAnio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAnio.add(this.jComboBoxTiposArchivosReportesDinamicoAnio, this.gridBagConstraintsAnio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAnio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAnio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAnio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAnio.setToolTipText("Generar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAnio.add(this.jButtonGenerarReporteDinamicoAnio, this.gridBagConstraintsAnio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAnio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAnio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAnio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAnio.setToolTipText("Cancelar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAnio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAnio.add(this.jButtonCerrarReporteDinamicoAnio, this.gridBagConstraintsAnio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAnio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAnio= new JScrollPane(jPanelReporteDinamicoAnio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAnio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAnio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAnio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAnio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAnio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAnio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAnio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAnio);
		this.jInternalFrameReporteDinamicoAnio.getContentPane().add(this.jScrollPanelReporteDinamicoAnio, this.gridBagConstraintsAnio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAnio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAnio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAnio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAnio.setName("jPanelImportacionAnio"); 
		
		this.jPanelImportacionAnio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAnio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAnio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAnio.setLayout(gridaBagLayoutImportacionAnio);
		
		
		this.jInternalFrameImportacionAnio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAnio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAnio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAnio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAnio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAnio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAnio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAnio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAnio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAnio.setResizable(true);
	    this.jInternalFrameImportacionAnio.setClosable(true);
	    this.jInternalFrameImportacionAnio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAnio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAnio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAnio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAnio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAnio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAnio.setResizable(true);
	    this.jInternalFrameImportacionAnio.setClosable(true);
	    this.jInternalFrameImportacionAnio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAnio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAnio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAnio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAnio = new JLabelMe();

		this.jLabelArchivoImportacionAnio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = iPosYImportacion;		
		this.gridBagConstraintsAnio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAnio.add(this.jLabelArchivoImportacionAnio, this.gridBagConstraintsAnio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAnio = new JFileChooser();		
		this.jFileChooserImportacionAnio.setToolTipText("ESCOGER ARCHIVO"+" "+AnioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAnio = new JButtonMe();
		this.jButtonAbrirImportacionAnio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAnio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAnio.setToolTipText("Generar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnio.gridy = iPosYImportacion;
		this.gridBagConstraintsAnio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAnio.add(this.jButtonAbrirImportacionAnio, this.gridBagConstraintsAnio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAnio = new JLabelMe();

		this.jLabelPathArchivoImportacionAnio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAnio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAnio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAnio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnio.gridy = iPosYImportacion;		
		this.gridBagConstraintsAnio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAnio.add(this.jLabelPathArchivoImportacionAnio, this.gridBagConstraintsAnio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAnio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAnio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAnio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAnio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnio.gridy = iPosYImportacion;
		this.gridBagConstraintsAnio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAnio.add(this.jTextFieldPathArchivoImportacionAnio, this.gridBagConstraintsAnio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAnio = new JButtonMe();
		this.jButtonGenerarImportacionAnio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAnio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAnio.setToolTipText("Generar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnio.gridy = iPosYImportacion;
		this.gridBagConstraintsAnio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAnio.add(this.jButtonGenerarImportacionAnio, this.gridBagConstraintsAnio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAnio = new JButtonMe();
		this.jButtonCerrarImportacionAnio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAnio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAnio.setToolTipText("Cancelar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnio.gridy = iPosYImportacion;
		this.gridBagConstraintsAnio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAnio.add(this.jButtonCerrarImportacionAnio, this.gridBagConstraintsAnio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAnio = new GridBagLayout();
		
		this.jScrollPanelImportacionAnio= new JScrollPane(jPanelImportacionAnio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAnio = new GridBagConstraints();
		this.gridBagConstraintsAnio.gridy =iPosYImportacion;
		this.gridBagConstraintsAnio.gridx =iPosXImportacion;
		this.gridBagConstraintsAnio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAnio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAnio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAnio);
		this.jInternalFrameImportacionAnio.getContentPane().add(this.jScrollPanelImportacionAnio, this.gridBagConstraintsAnio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAnio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAnio = new JButtonMe();
			this.jButtonAbrirOrderByAnio.setText("Orden");
			this.jButtonAbrirOrderByAnio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAnio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAnio";
			inputMap = this.jButtonAbrirOrderByAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAnio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAnio"));
		
		
			GridBagLayout gridaBagLayoutOrderByAnio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAnio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAnio.setName("jPanelOrderByAnio"); 
			
			this.jPanelOrderByAnio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAnio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAnio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAnio.setLayout(gridaBagLayoutOrderByAnio);
			
			
			this.jTableDatosAnioOrderBy = new JTableMe();        
			this.jTableDatosAnioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAnioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAnioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAnioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAnioOrderBy.setViewportView(this.jTableDatosAnioOrderBy);
			this.jTableDatosAnioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAnioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAnio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAnio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAnio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAnio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAnio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAnio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAnio.setTitle("Orden");
			this.jInternalFrameOrderByAnio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAnio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAnio.setResizable(true);
			this.jInternalFrameOrderByAnio.setClosable(true);
			this.jInternalFrameOrderByAnio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAnio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAnio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAnio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAnio.gridx =iPosXOrderBy;
			this.gridBagConstraintsAnio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAnio.ipady =150;
				
			this.jPanelOrderByAnio.add(jScrollPanelDatosAnioOrderBy, this.gridBagConstraintsAnio);//this.jTableDatosAnioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAnio = new JButtonMe();
			this.jButtonCerrarOrderByAnio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAnio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAnio.setToolTipText("Cancelar"+" "+AnioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAnio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAnio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAnio.add(this.jButtonCerrarOrderByAnio, this.gridBagConstraintsAnio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAnio = new GridBagLayout();
			
			this.jScrollPanelOrderByAnio= new JScrollPane(jPanelOrderByAnio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAnio = new GridBagConstraints();
			this.gridBagConstraintsAnio.gridy =iPosYOrderBy;
			this.gridBagConstraintsAnio.gridx =iPosXOrderBy;
			this.gridBagConstraintsAnio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAnio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAnio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAnio);
			
			this.jInternalFrameOrderByAnio.getContentPane().add(this.jScrollPanelOrderByAnio, this.gridBagConstraintsAnio);			
		
		} else {
			this.jButtonAbrirOrderByAnio = new JButtonMe();
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
		if(this.conMaximoRelaciones 
			&& this.anioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAnio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAnio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAnio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAnio.getRowHeight();//AnioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.anioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AnioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAnio.isSelected()) {
					iHeightTable=AnioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AnioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AnioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AnioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAnio.isSelected()) {
					iHeightTable=AnioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AnioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AnioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAnio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAnio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAnio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAnio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAnio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAnio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAnio!=null && this.jInternalFrameOrderByAnio.getjTableDatosOrderBy()!=null) {
			//if(!this.anioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAnio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAnio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAnio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAnio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAnio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAnio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAnio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAnio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAnio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAnio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=anioLogic.getAnios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=anios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Anio> TraerAnioBeans(List<Anio> anios,ArrayList<Classe> classes)throws Exception {
		try {
			for(Anio anio:anios) {
					
				if(!(AnioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AnioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					anio.setsDetalleGeneralEntityReporte(AnioConstantesFunciones.getAnioDescripcion(anio));
										
						
					
						
					
				} else  {
							
					//anio.setsDetalleGeneralEntityReporte(anio.getsDetalleGeneralEntityReporte());
										
				}
				
				//aniobeans.add(aniobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return anios;
    }
	//PARA REPORTES FIN
}
