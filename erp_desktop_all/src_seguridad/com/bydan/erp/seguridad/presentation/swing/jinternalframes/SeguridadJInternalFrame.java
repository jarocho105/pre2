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
import com.bydan.erp.seguridad.util.SeguridadConstantesFunciones;

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
public class SeguridadJInternalFrame extends SeguridadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSeguridad;
	
	protected JMenuBar jmenuBarSeguridad;
	
	protected JMenu jmenuSeguridad;
	protected JMenu jmenuDatosSeguridad;
	protected JMenu jmenuArchivoSeguridad;
	protected JMenu jmenuAccionesSeguridad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSeguridad;	
	protected GridBagConstraints gridBagConstraintsSeguridad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SeguridadDetalleFormJInternalFrame jInternalFrameDetalleFormSeguridad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSeguridad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSeguridad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public SeguridadSessionBean seguridadSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Seguridad> seguridads;		
	public List<Seguridad> seguridadsEliminados;	
	public List<Seguridad> seguridadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySeguridad;		
	protected JButton jButtonAbrirOrderBySeguridad;
	
	
	//protected JPanel jPanelOrderBySeguridad;
	//public JScrollPane jScrollPanelOrderBySeguridad;	
	//protected JButton jButtonCerrarOrderBySeguridad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SeguridadLogic seguridadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSeguridad;
	public JScrollPane jScrollPanelDatosEdicionSeguridad;
	public JScrollPane jScrollPanelDatosGeneralSeguridad;
    
	
	
	//public JScrollPane jScrollPanelDatosSeguridadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSeguridad;
	//public JScrollPane jScrollPanelImportacionSeguridad;
	
	
	
	protected JPanel jPanelAccionesSeguridad;
	
    protected JPanel jPanelPaginacionSeguridad;
    protected JPanel jPanelParametrosReportesSeguridad;
	protected JPanel jPanelParametrosReportesAccionesSeguridad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Seguridad;
	protected JPanel jPanelParametrosAuxiliar2Seguridad;
	protected JPanel jPanelParametrosAuxiliar3Seguridad;
	protected JPanel jPanelParametrosAuxiliar4Seguridad;
	//protected JPanel jPanelParametrosAuxiliar5Seguridad;
	
	
	
	//protected JPanel jPanelReporteDinamicoSeguridad;
	//protected JPanel jPanelImportacionSeguridad;
	
	
	public JTable jTableDatosSeguridad;
	
	
	
	//public JTable jTableDatosSeguridadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSeguridad;
	protected JButton jButtonDuplicarSeguridad;
	protected JButton jButtonCopiarSeguridad;
	protected JButton jButtonVerFormSeguridad;
	protected JButton jButtonNuevoRelacionesSeguridad;
	protected JButton jButtonModificarSeguridad;
	
    protected JButton jButtonGuardarCambiosTablaSeguridad;
	protected JButton jButtonCerrarSeguridad;
	
	
	protected JButton jButtonRecargarInformacionSeguridad;
	protected JButton jButtonProcesarInformacionSeguridad;
	
	
	protected JButton jButtonAnterioresSeguridad;
	protected JButton jButtonSiguientesSeguridad;
	protected JButton jButtonNuevoGuardarCambiosSeguridad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSeguridad;
	//protected JButton jButtonCerrarReporteDinamicoSeguridad;
	//protected JButton jButtonGenerarExcelReporteDinamicoSeguridad;	
	
	
	
	//protected JButton jButtonAbrirImportacionSeguridad;
	//protected JButton jButtonGenerarImportacionSeguridad;
	//protected JButton jButtonCerrarImportacionSeguridad;
	//protected JFileChooser jFileChooserImportacionSeguridad;
	//protected File fileImportacionSeguridad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSeguridad;
	protected JButton jButtonDuplicarToolBarSeguridad;
	protected JButton jButtonNuevoRelacionesToolBarSeguridad;
	
	
	public JButton jButtonGuardarCambiosToolBarSeguridad;
	protected JButton jButtonCopiarToolBarSeguridad;
	protected JButton jButtonVerFormToolBarSeguridad;
	public JButton jButtonGuardarCambiosTablaToolBarSeguridad;
	protected JButton jButtonMostrarOcultarTablaToolBarSeguridad;
	protected JButton jButtonCerrarToolBarSeguridad;
	
	protected JButton jButtonRecargarInformacionToolBarSeguridad;
	protected JButton jButtonProcesarInformacionToolBarSeguridad;
	protected JButton jButtonAnterioresToolBarSeguridad;
	protected JButton jButtonSiguientesToolBarSeguridad;
	protected JButton jButtonNuevoGuardarCambiosToolBarSeguridad;
	protected JButton jButtonAbrirOrderByToolBarSeguridad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSeguridad;
	protected JMenuItem jMenuItemDuplicarSeguridad;
	protected JMenuItem jMenuItemNuevoRelacionesSeguridad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSeguridad;
	protected JMenuItem jMenuItemCopiarSeguridad;
	protected JMenuItem jMenuItemVerFormSeguridad;
	protected JMenuItem jMenuItemGuardarCambiosTablaSeguridad;
	protected JMenuItem jMenuItemCerrarSeguridad;
	protected JMenuItem jMenuItemDetalleCerrarSeguridad;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySeguridad;
	protected JMenuItem jMenuItemDetalleMostarOcultarSeguridad;
	
	protected JMenuItem jMenuItemRecargarInformacionSeguridad;
	protected JMenuItem jMenuItemProcesarInformacionSeguridad;
	protected JMenuItem jMenuItemAnterioresSeguridad;
	protected JMenuItem jMenuItemSiguientesSeguridad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSeguridad;
	protected JMenuItem jMenuItemAbrirOrderBySeguridad;
	protected JMenuItem jMenuItemMostrarOcultarSeguridad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSeguridad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSeguridad;
	protected JCheckBox jCheckBoxSeleccionadosSeguridad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSeguridad;
	protected JCheckBox jCheckBoxConGraficoReporteSeguridad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSeguridad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSeguridad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSeguridad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSeguridad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSeguridad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSeguridad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSeguridad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSeguridad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSeguridad;
	protected JTextField jTextFieldValorCampoGeneralSeguridad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSeguridad;
	//public JList<Reporte> jListColumnasSelectReporteSeguridad;
	//public JScrollPane jScrollColumnasSelectReporteSeguridad;
	
	//public JLabel jLabelRelacionesSelectReporteSeguridad;
	//public JList<Reporte> jListRelacionesSelectReporteSeguridad;
	//public JScrollPane jScrollRelacionesSelectReporteSeguridad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSeguridad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSeguridad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSeguridad;
	//public JLabel jLabelTiposArchivoReporteDinamicoSeguridad;
	
		
	//public JLabel jLabelArchivoImportacionSeguridad;	
	//public JLabel jLabelPathArchivoImportacionSeguridad;
	//protected JTextField jTextFieldPathArchivoImportacionSeguridad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSeguridad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSeguridad;
	
	//public JLabel jLabelColumnaCategoriaValorSeguridad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSeguridad;
	
	//public JLabel jLabelColumnasValoresGraficoSeguridad;
	//public JList<Reporte> jListColumnasValoresGraficoSeguridad;
	//public JScrollPane jScrollColumnasValoresGraficoSeguridad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSeguridad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSeguridad;	
	
	
	
	
	
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
	public SeguridadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Seguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SeguridadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Seguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SeguridadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Seguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SeguridadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Seguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSeguridad)	{
		this.jButtonRecargarInformacionSeguridad = jButtonRecargarInformacionSeguridad;
	}
	
	public JButton getjButtonProcesarInformacionSeguridad() {
		return this.jButtonProcesarInformacionSeguridad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSeguridad)	{
		this.jButtonProcesarInformacionSeguridad = jButtonProcesarInformacionSeguridad;
	}
	
	
	public JButton getjButtonRecargarInformacionSeguridad() {
		return this.jButtonRecargarInformacionSeguridad;
	}
	
	
	public List<Seguridad> getseguridads() {
		return this.seguridads;
	}

	public void setseguridads(List<Seguridad> seguridads) {
		this.seguridads = seguridads;
	}
	
	public List<Seguridad> getseguridadsAux() {
		return this.seguridadsAux;
	}

	public void setseguridadsAux(List<Seguridad> seguridadsAux) {
		this.seguridadsAux = seguridadsAux;
	}
	
	public List<Seguridad> getseguridadsEliminados() {
		return this.seguridadsEliminados;
	}

	public void setSeguridadsEliminados(List<Seguridad> seguridadsEliminados) {
		this.seguridadsEliminados = seguridadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSeguridad() {
		return jComboBoxTiposSeleccionarSeguridad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSeguridad(
			JComboBox jComboBoxTiposSeleccionarSeguridad) {
		this.jComboBoxTiposSeleccionarSeguridad = jComboBoxTiposSeleccionarSeguridad;
	}
	
	public void setBorderResaltarTiposSeleccionarSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSeguridad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSeguridad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSeguridad() {
		return jTextFieldValorCampoGeneralSeguridad;
	}

	public void setjTextFieldValorCampoGeneralSeguridad(
			JTextField jTextFieldValorCampoGeneralSeguridad) {
		this.jTextFieldValorCampoGeneralSeguridad = jTextFieldValorCampoGeneralSeguridad;
	}

	public void setBorderResaltarValorCampoGeneralSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguridad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSeguridad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSeguridad() {
		return this.jCheckBoxSeleccionarTodosSeguridad;
	}

	public void setjCheckBoxSeleccionarTodosSeguridad(
			JCheckBox jCheckBoxSeleccionarTodosSeguridad) {
		this.jCheckBoxSeleccionarTodosSeguridad = jCheckBoxSeleccionarTodosSeguridad;
	}

	public void setBorderResaltarSeleccionarTodosSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguridad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSeguridad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSeguridad() {
		return this.jCheckBoxSeleccionadosSeguridad;
	}

	public void setjCheckBoxSeleccionadosSeguridad(
			JCheckBox jCheckBoxSeleccionadosSeguridad) {
		this.jCheckBoxSeleccionadosSeguridad = jCheckBoxSeleccionadosSeguridad;
	}
	
	public void setBorderResaltarSeleccionadosSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguridad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSeguridad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSeguridad() {
		return this.jComboBoxTiposArchivosReportesSeguridad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSeguridad(
			JComboBox jComboBoxTiposArchivosReportesSeguridad) {
		this.jComboBoxTiposArchivosReportesSeguridad = jComboBoxTiposArchivosReportesSeguridad;
	}

	public void setBorderResaltarTiposArchivosReportesSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguridad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSeguridad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSeguridad() {
		return this.jComboBoxTiposReportesSeguridad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSeguridad(
			JComboBox jComboBoxTiposReportesSeguridad) {
		this.jComboBoxTiposReportesSeguridad = jComboBoxTiposReportesSeguridad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSeguridad() {
	//	return jComboBoxTiposReportesDinamicoSeguridad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSeguridad(
	//		JComboBox jComboBoxTiposReportesDinamicoSeguridad) {
	//	this.jComboBoxTiposReportesDinamicoSeguridad = jComboBoxTiposReportesDinamicoSeguridad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSeguridad() {
	//	return jComboBoxTiposArchivosReportesDinamicoSeguridad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSeguridad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSeguridad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSeguridad = jComboBoxTiposArchivosReportesDinamicoSeguridad;
	//}
	
	public void setBorderResaltarTiposReportesSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguridad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSeguridad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSeguridad() {
		return this.jComboBoxTiposGraficosReportesSeguridad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSeguridad(
			JComboBox jComboBoxTiposGraficosReportesSeguridad) {
		this.jComboBoxTiposGraficosReportesSeguridad = jComboBoxTiposGraficosReportesSeguridad;
	}
	
	public void setBorderResaltarTiposGraficosReportesSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguridad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSeguridad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSeguridad() {
		return this.jComboBoxTiposPaginacionSeguridad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSeguridad(
			JComboBox jComboBoxTiposPaginacionSeguridad) {
		this.jComboBoxTiposPaginacionSeguridad = jComboBoxTiposPaginacionSeguridad;
	}
	
	public void setBorderResaltarTiposPaginacionSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguridad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSeguridad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSeguridad() {
		return this.jComboBoxTiposRelacionesSeguridad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSeguridad() {
		return this.jComboBoxTiposAccionesSeguridad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSeguridad(
			JComboBox jComboBoxTiposRelacionesSeguridad) {
		this.jComboBoxTiposRelacionesSeguridad = jComboBoxTiposRelacionesSeguridad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSeguridad(
			JComboBox jComboBoxTiposAccionesSeguridad) {
		this.jComboBoxTiposAccionesSeguridad = jComboBoxTiposAccionesSeguridad;
	}
	
	public void setBorderResaltarTiposRelacionesSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguridad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSeguridad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguridad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSeguridad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSeguridad() {
	//	return jCheckBoxConGraficoDinamicoSeguridad;
	//}

	//public void setjCheckBoxConGraficoDinamicoSeguridad(
	//		JCheckBox jCheckBoxConGraficoDinamicoSeguridad) {
	//	this.jCheckBoxConGraficoDinamicoSeguridad = jCheckBoxConGraficoDinamicoSeguridad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSeguridad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSeguridad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSeguridad .setBorder(borderResaltar);		
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
		this.seguridadSessionBean=new SeguridadSessionBean();
		
		this.seguridadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.seguridadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.seguridadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SeguridadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SeguridadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SeguridadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SeguridadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SeguridadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Seguridad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
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
		
		SeguridadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Seguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSeguridad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSeguridad,this.jTtoolBarSeguridad,
							"nuevo","nuevo","Nuevo"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSeguridad,this.jTtoolBarSeguridad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSeguridad,this.jTtoolBarSeguridad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSeguridad,this.jTtoolBarSeguridad,
							"duplicar","duplicar","Duplicar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSeguridad,this.jTtoolBarSeguridad,
							"copiar","copiar","Copiar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSeguridad,this.jTtoolBarSeguridad,
							"ver_form","ver_form","Ver"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSeguridad,this.jTtoolBarSeguridad,
							"recargar","recargar","Recargar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSeguridad,this.jTtoolBarSeguridad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSeguridad,this.jTtoolBarSeguridad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSeguridad,this.jTtoolBarSeguridad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSeguridad,this.jTtoolBarSeguridad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSeguridad,this.jTtoolBarSeguridad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSeguridad,this.jTtoolBarSeguridad,
							"cerrar","cerrar","Salir"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSeguridad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSeguridad;
			
				this.jButtonProcesarInformacionToolBarSeguridad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSeguridad;
				
		//protected JButton jButtonModificarToolBarSeguridad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSeguridad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSeguridad=new JMenuMe("General");
		this.jmenuArchivoSeguridad=new JMenuMe("Archivo");
		this.jmenuAccionesSeguridad=new JMenuMe("Acciones");
		this.jmenuDatosSeguridad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSeguridad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSeguridad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSeguridad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSeguridad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSeguridad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSeguridad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSeguridad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSeguridad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSeguridad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSeguridad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSeguridad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSeguridad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSeguridad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSeguridad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSeguridad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSeguridad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSeguridad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSeguridad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSeguridad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSeguridad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSeguridad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSeguridad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSeguridad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSeguridad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSeguridad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSeguridad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSeguridad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSeguridad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSeguridad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSeguridad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSeguridad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSeguridad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSeguridad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSeguridad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSeguridad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSeguridad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySeguridad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySeguridad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySeguridad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSeguridad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSeguridad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSeguridad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySeguridad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySeguridad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySeguridad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSeguridad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSeguridad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSeguridad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSeguridad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSeguridad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSeguridad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSeguridad.add(this.jMenuItemCerrarSeguridad);
			
			this.jmenuAccionesSeguridad.add(this.jMenuItemNuevoSeguridad);
			this.jmenuAccionesSeguridad.add(this.jMenuItemNuevoGuardarCambiosSeguridad);
			this.jmenuAccionesSeguridad.add(this.jMenuItemNuevoRelacionesSeguridad);
			this.jmenuAccionesSeguridad.add(this.jMenuItemGuardarCambiosTablaSeguridad);		
			this.jmenuAccionesSeguridad.add(this.jMenuItemDuplicarSeguridad);		
			this.jmenuAccionesSeguridad.add(this.jMenuItemCopiarSeguridad);		
			this.jmenuAccionesSeguridad.add(this.jMenuItemVerFormSeguridad);		
			
			this.jmenuDatosSeguridad.add(this.jMenuItemRecargarInformacionSeguridad);				
			this.jmenuDatosSeguridad.add(this.jMenuItemAnterioresSeguridad);				
			this.jmenuDatosSeguridad.add(this.jMenuItemSiguientesSeguridad);				
			this.jmenuDatosSeguridad.add(this.jMenuItemAbrirOrderBySeguridad);				
			this.jmenuDatosSeguridad.add(this.jMenuItemMostrarOcultarSeguridad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSeguridad.add(this.jMenuItemGuardarCambiosSeguridad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSeguridad.add(this.jmenuArchivoSeguridad);		
			this.jmenuBarSeguridad.add(this.jmenuAccionesSeguridad);		
			this.jmenuBarSeguridad.add(this.jmenuDatosSeguridad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSeguridad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSeguridad() {
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
			//this.jInternalFrameDetalleSeguridad = new SeguridadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Seguridad DATOS");
			this.jInternalFrameDetalleFormSeguridad = new SeguridadDetalleFormJInternalFrame(jDesktopPane,this.seguridadSessionBean.getConGuardarRelaciones(),this.seguridadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSeguridad = null;//new SeguridadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSeguridad= new GridBagLayout();
		
		
		this.jTableDatosSeguridad = new JTableMe();      
		
		String sToolTipSeguridad="";
		sToolTipSeguridad=SeguridadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSeguridad+="(Seguridad.Seguridad)";
		}
		
		if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
			sToolTipSeguridad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSeguridad.setToolTipText(sToolTipSeguridad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSeguridad);
		this.jTableDatosSeguridad.setAutoCreateRowSorter(true);
		this.jTableDatosSeguridad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSeguridad.setRowSelectionAllowed(true);
		this.jTableDatosSeguridad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSeguridad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSeguridad = new JButtonMe();
		this.jButtonDuplicarSeguridad = new JButtonMe();
		this.jButtonCopiarSeguridad = new JButtonMe();
		this.jButtonVerFormSeguridad = new JButtonMe();
		this.jButtonNuevoRelacionesSeguridad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSeguridad = new JButtonMe();
		this.jButtonCerrarSeguridad = new JButtonMe();
		
		this.jScrollPanelDatosSeguridad = new JScrollPane();   
        this.jScrollPanelDatosGeneralSeguridad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Seguridad";
		
		if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Seguridades" + this.sPath));
		} else {
			this.jScrollPanelDatosSeguridad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSeguridad.setToolTipText("Acciones");
        this.jPanelAccionesSeguridad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSeguridad=new ReporteDinamicoJInternalFrame(SeguridadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSeguridad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSeguridad=new ImportacionJInternalFrame(SeguridadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSeguridad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySeguridad = new JButtonMe();
		
		this.jButtonAbrirOrderBySeguridad.setText("Orden");
		this.jButtonAbrirOrderBySeguridad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySeguridad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySeguridad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySeguridad,false,this);
			
			//this.cargarOrderBySeguridad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySeguridad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySeguridad,true,this);
			
			//this.cargarOrderBySeguridad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSeguridad.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosSeguridad.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosSeguridad.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosSeguridad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSeguridad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSeguridad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSeguridad.setText("Nuevo");
		this.jButtonDuplicarSeguridad.setText("Duplicar");
		this.jButtonCopiarSeguridad.setText("Copiar");
		this.jButtonVerFormSeguridad.setText("Ver");
		this.jButtonNuevoRelacionesSeguridad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSeguridad.setText("Guardar");
		this.jButtonCerrarSeguridad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSeguridad,"nuevo_button","Nuevo",this.seguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSeguridad,"duplicar_button","Duplicar",this.seguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSeguridad,"copiar_button","Copiar",this.seguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSeguridad,"ver_form","Ver",this.seguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSeguridad,"nuevorelaciones_button","Nuevo Rel",this.seguridadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSeguridad,"guardarcambiostabla_button","Guardar",this.seguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSeguridad,"cerrar_button","Salir",this.seguridadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSeguridad.setToolTipText("Nuevo"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSeguridad.setToolTipText("Duplicar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSeguridad.setToolTipText("Copiar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSeguridad.setToolTipText("Ver"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSeguridad.setToolTipText("Nuevo Rel"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSeguridad.setToolTipText("Guardar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSeguridad.setToolTipText("Salir"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSeguridad";
		inputMap = this.jButtonNuevoSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSeguridad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSeguridad"));
		
		//DUPLICAR
		sMapKey = "DuplicarSeguridad";
		inputMap = this.jButtonDuplicarSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSeguridad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSeguridad"));
		
		//COPIAR
		sMapKey = "CopiarSeguridad";
		inputMap = this.jButtonCopiarSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSeguridad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSeguridad"));
		
		//VEr FORM
		sMapKey = "VerFormSeguridad";
		inputMap = this.jButtonVerFormSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSeguridad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSeguridad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSeguridad";
		inputMap = this.jButtonNuevoRelacionesSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSeguridad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSeguridad";
		inputMap = this.jButtonModificarSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSeguridad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSeguridad";
		inputMap = this.jButtonCerrarSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSeguridad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSeguridad";
		inputMap = this.jButtonGuardarCambiosTablaSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSeguridad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Seguridad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Seguridad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Seguridad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Seguridad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Seguridad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSeguridad.setName("jPanelParametrosReportesSeguridad"); 
		
		this.jPanelParametrosReportesAccionesSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSeguridad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSeguridad.setName("jPanelParametrosReportesAccionesSeguridad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSeguridad = new JButtonMe();
		this.jButtonRecargarInformacionSeguridad.setText("Recargar");
		this.jButtonRecargarInformacionSeguridad.setToolTipText("Recargar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSeguridad,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSeguridad = new JButtonMe();
		this.jButtonProcesarInformacionSeguridad.setText("Procesar");
		this.jButtonProcesarInformacionSeguridad.setToolTipText("Procesar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSeguridad.setVisible(false);
			
		this.jButtonProcesarInformacionSeguridad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSeguridad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSeguridad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSeguridad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSeguridad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSeguridad.setText("TIPO");       
		this.jComboBoxTiposReportesSeguridad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSeguridad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSeguridad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSeguridad.setText("Paginacion");
		this.jComboBoxTiposPaginacionSeguridad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSeguridad.setText("Accion");
		this.jComboBoxTiposRelacionesSeguridad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSeguridad.setText("Accion");
		this.jComboBoxTiposAccionesSeguridad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSeguridad.setText("Accion");
		this.jComboBoxTiposSeleccionarSeguridad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSeguridad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSeguridad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSeguridad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSeguridad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSeguridad = new JLabelMe();
		
		this.jLabelAccionesSeguridad.setText("Acciones");		
		this.jLabelAccionesSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSeguridad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSeguridad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSeguridad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSeguridad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSeguridad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSeguridad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSeguridad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSeguridad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSeguridad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSeguridad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSeguridad.setText("Graf.");
		this.jCheckBoxConGraficoReporteSeguridad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSeguridad = new JButtonMe();
		//this.jButtonAnterioresSeguridad.setText("<<");
        this.jButtonAnterioresSeguridad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSeguridad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSeguridad = new JButtonMe();
		//this.jButtonSiguientesSeguridad.setText(">>");
        this.jButtonSiguientesSeguridad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSeguridad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSeguridad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSeguridad.setText("Nue");
        this.jButtonNuevoGuardarCambiosSeguridad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSeguridad,"nuevoguardarcambios_button","Nue",this.seguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSeguridad";
		inputMap = this.jButtonNuevoGuardarCambiosSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSeguridad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSeguridad";
		inputMap = this.jButtonRecargarInformacionSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSeguridad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSeguridad";
		inputMap = this.jButtonSiguientesSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSeguridad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSeguridad";
		inputMap = this.jButtonAnterioresSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSeguridad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSeguridad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSeguridad.setMinimumSize(new Dimension(this.getWidth(),SeguridadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SeguridadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSeguridad.setMaximumSize(new Dimension(this.getWidth(),SeguridadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SeguridadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSeguridad.setPreferredSize(new Dimension(this.getWidth(),SeguridadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SeguridadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSeguridad = new GridBagLayout();

			this.jPanelPaginacionSeguridad.setLayout(gridaBagLayoutPaginacionSeguridad);						
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguridad.gridy = 0;
			this.gridBagConstraintsSeguridad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSeguridad.add(this.jButtonAnterioresSeguridad, this.gridBagConstraintsSeguridad);
					
						
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSeguridad.gridy = 0;
			
			this.jPanelPaginacionSeguridad.add(this.jButtonNuevoGuardarCambiosSeguridad, this.gridBagConstraintsSeguridad);
						
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSeguridad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSeguridad.gridy = 0;
			this.jPanelPaginacionSeguridad.add(this.jButtonSiguientesSeguridad, this.gridBagConstraintsSeguridad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguridad.gridy = 1;
			this.gridBagConstraintsSeguridad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSeguridad.add(this.jButtonNuevoSeguridad, this.gridBagConstraintsSeguridad);
						
			
			
			if(!this.seguridadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSeguridad = new GridBagConstraints();
				this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSeguridad.gridy = 1;
				this.gridBagConstraintsSeguridad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSeguridad.add(this.jButtonGuardarCambiosTablaSeguridad, this.gridBagConstraintsSeguridad);
			}
			
			
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguridad.gridy = 1;
			this.gridBagConstraintsSeguridad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSeguridad.add(this.jButtonDuplicarSeguridad, this.gridBagConstraintsSeguridad);
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguridad.gridy = 1;
			this.gridBagConstraintsSeguridad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSeguridad.add(this.jButtonCopiarSeguridad, this.gridBagConstraintsSeguridad);
		
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguridad.gridy = 1;
			this.gridBagConstraintsSeguridad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSeguridad.add(this.jButtonVerFormSeguridad, this.gridBagConstraintsSeguridad);
		
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguridad.gridy = 1;
			this.gridBagConstraintsSeguridad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSeguridad.add(this.jButtonCerrarSeguridad, this.gridBagConstraintsSeguridad);
		
		
		
		this.jButtonRecargarInformacionSeguridad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSeguridad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSeguridad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSeguridad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSeguridad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSeguridad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSeguridad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSeguridad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSeguridad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSeguridad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSeguridad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSeguridad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSeguridad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSeguridad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSeguridad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSeguridad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSeguridad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSeguridad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSeguridad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSeguridad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSeguridad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSeguridad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSeguridad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSeguridad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSeguridad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSeguridad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSeguridad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSeguridad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSeguridad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSeguridad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSeguridad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSeguridad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSeguridad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSeguridad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSeguridad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSeguridad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSeguridad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSeguridad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Seguridad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Seguridad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Seguridad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Seguridad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSeguridad.setLayout(gridaBagParametrosReportesSeguridad);
			this.jPanelParametrosReportesAccionesSeguridad.setLayout(gridaBagParametrosReportesAccionesSeguridad);
			
			
			this.jPanelParametrosAuxiliar1Seguridad.setLayout(gridaBagParametrosAuxiliar1Seguridad);
			this.jPanelParametrosAuxiliar2Seguridad.setLayout(gridaBagParametrosAuxiliar2Seguridad);
			this.jPanelParametrosAuxiliar3Seguridad.setLayout(gridaBagParametrosAuxiliar3Seguridad);
			this.jPanelParametrosAuxiliar4Seguridad.setLayout(gridaBagParametrosAuxiliar4Seguridad);
			//this.jPanelParametrosAuxiliar5Seguridad.setLayout(gridaBagParametrosAuxiliar2Seguridad);			
			
			
			
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguridad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSeguridad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSeguridad.add(this.jButtonRecargarInformacionSeguridad, this.gridBagConstraintsSeguridad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguridad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSeguridad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Seguridad.add(this.jComboBoxTiposPaginacionSeguridad, this.gridBagConstraintsSeguridad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguridad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSeguridad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Seguridad.add(this.jCheckBoxConAltoMaximoTablaSeguridad, this.gridBagConstraintsSeguridad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguridad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSeguridad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Seguridad.add(this.jComboBoxTiposArchivosReportesSeguridad, this.gridBagConstraintsSeguridad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguridad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSeguridad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSeguridad.add(this.jPanelParametrosAuxiliar1Seguridad, this.gridBagConstraintsSeguridad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguridad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSeguridad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Seguridad.add(this.jComboBoxTiposReportesSeguridad, this.gridBagConstraintsSeguridad);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguridad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSeguridad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSeguridad.add(this.jPanelParametrosAuxiliar4Seguridad, this.gridBagConstraintsSeguridad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguridad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSeguridad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSeguridad.add(this.jComboBoxTiposReportesSeguridad, this.gridBagConstraintsSeguridad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguridad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSeguridad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSeguridad.add(this.jCheckBoxGenerarReporteSeguridad, this.gridBagConstraintsSeguridad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguridad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSeguridad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSeguridad.add(this.jPanelParametrosAuxiliar2Seguridad, this.gridBagConstraintsSeguridad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguridad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSeguridad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSeguridad.add(this.jLabelAccionesSeguridad, this.gridBagConstraintsSeguridad);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSeguridad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSeguridad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSeguridad.add(this.jComboBoxTiposSeleccionarSeguridad, this.gridBagConstraintsSeguridad);			
			
			
			/*
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguridad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSeguridad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSeguridad.add(this.jCheckBoxSeleccionarTodosSeguridad, this.gridBagConstraintsSeguridad);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguridad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSeguridad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Seguridad.add(this.jCheckBoxSeleccionarTodosSeguridad, this.gridBagConstraintsSeguridad);															
				
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguridad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSeguridad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Seguridad.add(this.jCheckBoxSeleccionadosSeguridad, this.gridBagConstraintsSeguridad);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguridad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSeguridad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSeguridad.add(this.jPanelParametrosAuxiliar3Seguridad, this.gridBagConstraintsSeguridad);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSeguridad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSeguridad.add(this.jComboBoxTiposAccionesSeguridad, this.gridBagConstraintsSeguridad);
	
				
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSeguridad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSeguridad.add(this.jTextFieldValorCampoGeneralSeguridad, this.gridBagConstraintsSeguridad);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSeguridad = new GridBagLayout();

			this.jScrollPanelDatosSeguridad.setLayout(gridaBagLayoutDatosSeguridad);
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguridad.gridy = 0;
			this.gridBagConstraintsSeguridad.gridx = 0;
			
			this.jScrollPanelDatosSeguridad.add(this.jTableDatosSeguridad, this.gridBagConstraintsSeguridad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSeguridad.setViewportView(this.jTableDatosSeguridad);
		this.jTableDatosSeguridad.setFillsViewportHeight(true);
		this.jTableDatosSeguridad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSeguridad= new GridBagLayout();
		this.jPanelAccionesSeguridad.setLayout(gridaBagLayoutAccionesSeguridad);
		
		
		/*	
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguridad.gridy = 0;
		this.gridBagConstraintsSeguridad.gridx = 0;
			
		this.jPanelAccionesSeguridad.add(this.jButtonNuevoSeguridad, this.gridBagConstraintsSeguridad);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSeguridad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSeguridad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.seguridadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSeguridad = new GridBagConstraints();						
			this.gridBagConstraintsSeguridad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSeguridad.gridx = 0;		
			//this.gridBagConstraintsSeguridad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSeguridad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSeguridad, this.gridBagConstraintsSeguridad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSeguridad.gridx = 0;		
		//this.gridBagConstraintsSeguridad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguridad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSeguridad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSeguridad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSeguridad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSeguridad, this.gridBagConstraintsSeguridad);								
		
		
		/*
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSeguridad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSeguridad, this.gridBagConstraintsSeguridad);
		*/		
		
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSeguridad.gridx =0;
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSeguridad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSeguridad, this.gridBagConstraintsSeguridad);
				
		
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSeguridad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSeguridad, this.gridBagConstraintsSeguridad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SeguridadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSeguridad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSeguridad = new GridBagLayout();
			this.jPanelBusquedasParametrosSeguridad.setLayout(gridaBagLayoutBusquedasParametrosSeguridad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSeguridad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSeguridad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSeguridad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSeguridad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSeguridad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSeguridad, this.gridBagConstraintsSeguridad);
			
			
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSeguridad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSeguridad, this.gridBagConstraintsSeguridad);
		
			
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSeguridad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSeguridad, this.gridBagConstraintsSeguridad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSeguridad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSeguridad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSeguridad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSeguridad.setName("jPanelReporteDinamicoSeguridad"); 
		
		this.jPanelReporteDinamicoSeguridad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSeguridad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSeguridad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSeguridad.setLayout(gridaBagLayoutReporteDinamicoSeguridad);
		
		
		this.jInternalFrameReporteDinamicoSeguridad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSeguridad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSeguridad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSeguridad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSeguridad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSeguridad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSeguridad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSeguridad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSeguridad.setResizable(true);
	    this.jInternalFrameReporteDinamicoSeguridad.setClosable(true);
	    this.jInternalFrameReporteDinamicoSeguridad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSeguridad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSeguridad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSeguridad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Seguridades"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSeguridad = new JLabelMe();

		this.jLabelColumnasSelectReporteSeguridad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSeguridad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSeguridad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSeguridad.add(this.jLabelColumnasSelectReporteSeguridad, this.gridBagConstraintsSeguridad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSeguridad = new JList<Reporte>();
		this.jListColumnasSelectReporteSeguridad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSeguridad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSeguridad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSeguridad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSeguridad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSeguridad=new JScrollPane(this.jListColumnasSelectReporteSeguridad);
			
			this.jScrollColumnasSelectReporteSeguridad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSeguridad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSeguridad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSeguridad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSeguridad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSeguridad.add(this.jListColumnasSelectReporteSeguridad, this.gridBagConstraintsSeguridad);
		this.jPanelReporteDinamicoSeguridad.add(this.jScrollColumnasSelectReporteSeguridad, this.gridBagConstraintsSeguridad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSeguridad = new JLabelMe();

		this.jLabelRelacionesSelectReporteSeguridad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSeguridad = new JList<Reporte>();
		this.jListRelacionesSelectReporteSeguridad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSeguridad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSeguridad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSeguridad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSeguridad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSeguridad=new JScrollPane(this.jListRelacionesSelectReporteSeguridad);
			
			this.jScrollRelacionesSelectReporteSeguridad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSeguridad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSeguridad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSeguridad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSeguridad = new JComboBoxMe();
		this.jListColumnasValoresGraficoSeguridad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSeguridad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSeguridad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSeguridad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSeguridad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSeguridad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSeguridad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSeguridad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSeguridad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSeguridad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSeguridad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSeguridad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSeguridad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSeguridad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSeguridad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSeguridad.add(this.jLabelGenerarExcelReporteDinamicoSeguridad, this.gridBagConstraintsSeguridad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSeguridad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSeguridad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSeguridad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSeguridad.setToolTipText("Generar EXCEL"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSeguridad = new GridBagConstraints();
		//this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSeguridad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSeguridad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSeguridad.add(this.jButtonGenerarExcelReporteDinamicoSeguridad, this.gridBagConstraintsSeguridad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguridad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSeguridad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSeguridad.add(this.jComboBoxTiposReportesDinamicoSeguridad, this.gridBagConstraintsSeguridad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSeguridad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSeguridad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSeguridad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSeguridad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSeguridad.add(this.jLabelTiposArchivoReporteDinamicoSeguridad, this.gridBagConstraintsSeguridad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguridad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSeguridad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSeguridad.add(this.jComboBoxTiposArchivosReportesDinamicoSeguridad, this.gridBagConstraintsSeguridad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSeguridad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSeguridad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSeguridad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSeguridad.setToolTipText("Generar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguridad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSeguridad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSeguridad.add(this.jButtonGenerarReporteDinamicoSeguridad, this.gridBagConstraintsSeguridad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSeguridad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSeguridad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSeguridad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSeguridad.setToolTipText("Cancelar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguridad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSeguridad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSeguridad.add(this.jButtonCerrarReporteDinamicoSeguridad, this.gridBagConstraintsSeguridad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSeguridad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSeguridad= new JScrollPane(jPanelReporteDinamicoSeguridad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSeguridad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSeguridad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSeguridad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Seguridades"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSeguridad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSeguridad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSeguridad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSeguridad);
		this.jInternalFrameReporteDinamicoSeguridad.getContentPane().add(this.jScrollPanelReporteDinamicoSeguridad, this.gridBagConstraintsSeguridad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSeguridad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSeguridad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSeguridad.setName("jPanelImportacionSeguridad"); 
		
		this.jPanelImportacionSeguridad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSeguridad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSeguridad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSeguridad.setLayout(gridaBagLayoutImportacionSeguridad);
		
		
		this.jInternalFrameImportacionSeguridad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSeguridad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSeguridad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSeguridad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSeguridad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSeguridad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSeguridad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSeguridad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSeguridad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSeguridad.setResizable(true);
	    this.jInternalFrameImportacionSeguridad.setClosable(true);
	    this.jInternalFrameImportacionSeguridad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSeguridad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSeguridad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSeguridad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSeguridad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSeguridad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSeguridad.setResizable(true);
	    this.jInternalFrameImportacionSeguridad.setClosable(true);
	    this.jInternalFrameImportacionSeguridad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSeguridad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSeguridad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSeguridad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Seguridades"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSeguridad = new JLabelMe();

		this.jLabelArchivoImportacionSeguridad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSeguridad.gridy = iPosYImportacion;		
		this.gridBagConstraintsSeguridad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSeguridad.add(this.jLabelArchivoImportacionSeguridad, this.gridBagConstraintsSeguridad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSeguridad = new JFileChooser();		
		this.jFileChooserImportacionSeguridad.setToolTipText("ESCOGER ARCHIVO"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSeguridad = new JButtonMe();
		this.jButtonAbrirImportacionSeguridad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSeguridad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSeguridad.setToolTipText("Generar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguridad.gridy = iPosYImportacion;
		this.gridBagConstraintsSeguridad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSeguridad.add(this.jButtonAbrirImportacionSeguridad, this.gridBagConstraintsSeguridad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSeguridad = new JLabelMe();

		this.jLabelPathArchivoImportacionSeguridad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSeguridad.gridy = iPosYImportacion;		
		this.gridBagConstraintsSeguridad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSeguridad.add(this.jLabelPathArchivoImportacionSeguridad, this.gridBagConstraintsSeguridad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSeguridad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSeguridad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSeguridad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSeguridad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguridad.gridy = iPosYImportacion;
		this.gridBagConstraintsSeguridad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSeguridad.add(this.jTextFieldPathArchivoImportacionSeguridad, this.gridBagConstraintsSeguridad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSeguridad = new JButtonMe();
		this.jButtonGenerarImportacionSeguridad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSeguridad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSeguridad.setToolTipText("Generar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguridad.gridy = iPosYImportacion;
		this.gridBagConstraintsSeguridad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSeguridad.add(this.jButtonGenerarImportacionSeguridad, this.gridBagConstraintsSeguridad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSeguridad = new JButtonMe();
		this.jButtonCerrarImportacionSeguridad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSeguridad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSeguridad.setToolTipText("Cancelar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguridad.gridy = iPosYImportacion;
		this.gridBagConstraintsSeguridad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSeguridad.add(this.jButtonCerrarImportacionSeguridad, this.gridBagConstraintsSeguridad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSeguridad = new GridBagLayout();
		
		this.jScrollPanelImportacionSeguridad= new JScrollPane(jPanelImportacionSeguridad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSeguridad = new GridBagConstraints();
		this.gridBagConstraintsSeguridad.gridy =iPosYImportacion;
		this.gridBagConstraintsSeguridad.gridx =iPosXImportacion;
		this.gridBagConstraintsSeguridad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSeguridad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSeguridad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSeguridad);
		this.jInternalFrameImportacionSeguridad.getContentPane().add(this.jScrollPanelImportacionSeguridad, this.gridBagConstraintsSeguridad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySeguridad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySeguridad = new JButtonMe();
			this.jButtonAbrirOrderBySeguridad.setText("Orden");
			this.jButtonAbrirOrderBySeguridad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySeguridad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySeguridad";
			inputMap = this.jButtonAbrirOrderBySeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySeguridad"));
		
		
			GridBagLayout gridaBagLayoutOrderBySeguridad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySeguridad.setName("jPanelOrderBySeguridad"); 
			
			this.jPanelOrderBySeguridad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySeguridad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySeguridad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySeguridad.setLayout(gridaBagLayoutOrderBySeguridad);
			
			
			this.jTableDatosSeguridadOrderBy = new JTableMe();        
			this.jTableDatosSeguridadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSeguridadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSeguridadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSeguridadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSeguridadOrderBy.setViewportView(this.jTableDatosSeguridadOrderBy);
			this.jTableDatosSeguridadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSeguridadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySeguridad= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySeguridad= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySeguridad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSeguridad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySeguridad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySeguridad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySeguridad.setTitle("Orden");
			this.jInternalFrameOrderBySeguridad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySeguridad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySeguridad.setResizable(true);
			this.jInternalFrameOrderBySeguridad.setClosable(true);
			this.jInternalFrameOrderBySeguridad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySeguridad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySeguridad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySeguridad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Seguridades"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSeguridad.gridx =iPosXOrderBy;
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSeguridad.ipady =150;
				
			this.jPanelOrderBySeguridad.add(jScrollPanelDatosSeguridadOrderBy, this.gridBagConstraintsSeguridad);//this.jTableDatosSeguridadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySeguridad = new JButtonMe();
			this.jButtonCerrarOrderBySeguridad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySeguridad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySeguridad.setToolTipText("Cancelar"+" "+SeguridadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguridad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSeguridad.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySeguridad.add(this.jButtonCerrarOrderBySeguridad, this.gridBagConstraintsSeguridad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSeguridad = new GridBagLayout();
			
			this.jScrollPanelOrderBySeguridad= new JScrollPane(jPanelOrderBySeguridad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSeguridad = new GridBagConstraints();
			this.gridBagConstraintsSeguridad.gridy =iPosYOrderBy;
			this.gridBagConstraintsSeguridad.gridx =iPosXOrderBy;
			this.gridBagConstraintsSeguridad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySeguridad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySeguridad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSeguridad);
			
			this.jInternalFrameOrderBySeguridad.getContentPane().add(this.jScrollPanelOrderBySeguridad, this.gridBagConstraintsSeguridad);			
		
		} else {
			this.jButtonAbrirOrderBySeguridad = new JButtonMe();
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
			&& this.seguridadSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSeguridad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSeguridad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSeguridad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSeguridad.getRowHeight();//SeguridadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SeguridadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSeguridad.isSelected()) {
					iHeightTable=SeguridadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SeguridadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SeguridadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SeguridadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSeguridad.isSelected()) {
					iHeightTable=SeguridadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SeguridadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SeguridadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSeguridad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSeguridad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSeguridad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSeguridad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSeguridad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSeguridad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySeguridad!=null && this.jInternalFrameOrderBySeguridad.getjTableDatosOrderBy()!=null) {
			//if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySeguridad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySeguridad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySeguridad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySeguridad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySeguridad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySeguridad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySeguridad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSeguridad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSeguridad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSeguridad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=seguridadLogic.getSeguridads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=seguridads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Seguridad> TraerSeguridadBeans(List<Seguridad> seguridads,ArrayList<Classe> classes)throws Exception {
		try {
			for(Seguridad seguridad:seguridads) {
					
				if(!(SeguridadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SeguridadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					seguridad.setsDetalleGeneralEntityReporte(SeguridadConstantesFunciones.getSeguridadDescripcion(seguridad));
										
						
					
						
					
				} else  {
							
					//seguridad.setsDetalleGeneralEntityReporte(seguridad.getsDetalleGeneralEntityReporte());
										
				}
				
				//seguridadbeans.add(seguridadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return seguridads;
    }
	//PARA REPORTES FIN
}
