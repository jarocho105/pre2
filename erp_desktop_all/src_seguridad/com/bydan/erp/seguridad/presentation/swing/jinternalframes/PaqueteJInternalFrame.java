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
import com.bydan.erp.seguridad.util.PaqueteConstantesFunciones;

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
public class PaqueteJInternalFrame extends PaqueteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPaquete;
	
	protected JMenuBar jmenuBarPaquete;
	
	protected JMenu jmenuPaquete;
	protected JMenu jmenuDatosPaquete;
	protected JMenu jmenuArchivoPaquete;
	protected JMenu jmenuAccionesPaquete;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPaquete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPaquete;	
	protected GridBagConstraints gridBagConstraintsPaquete;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PaqueteDetalleFormJInternalFrame jInternalFrameDetalleFormPaquete;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPaquete;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPaquete;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sistema="";
	
	public PaqueteSessionBean paqueteSessionBean;
		
	
	
	public SistemaSessionBean sistemaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Paquete> paquetes;		
	public List<Paquete> paquetesEliminados;	
	public List<Paquete> paquetesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPaquete;		
	protected JButton jButtonAbrirOrderByPaquete;
	
	
	//protected JPanel jPanelOrderByPaquete;
	//public JScrollPane jScrollPanelOrderByPaquete;	
	//protected JButton jButtonCerrarOrderByPaquete;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PaqueteLogic paqueteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPaquete;
	public JScrollPane jScrollPanelDatosEdicionPaquete;
	public JScrollPane jScrollPanelDatosGeneralPaquete;
    
	
	
	//public JScrollPane jScrollPanelDatosPaqueteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPaquete;
	//public JScrollPane jScrollPanelImportacionPaquete;
	
	
	
	protected JPanel jPanelAccionesPaquete;
	
    protected JPanel jPanelPaginacionPaquete;
    protected JPanel jPanelParametrosReportesPaquete;
	protected JPanel jPanelParametrosReportesAccionesPaquete;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Paquete;
	protected JPanel jPanelParametrosAuxiliar2Paquete;
	protected JPanel jPanelParametrosAuxiliar3Paquete;
	protected JPanel jPanelParametrosAuxiliar4Paquete;
	//protected JPanel jPanelParametrosAuxiliar5Paquete;
	
	
	
	//protected JPanel jPanelReporteDinamicoPaquete;
	//protected JPanel jPanelImportacionPaquete;
	
	
	public JTable jTableDatosPaquete;
	
	
	
	//public JTable jTableDatosPaqueteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPaquete;
	protected JButton jButtonDuplicarPaquete;
	protected JButton jButtonCopiarPaquete;
	protected JButton jButtonVerFormPaquete;
	protected JButton jButtonNuevoRelacionesPaquete;
	protected JButton jButtonModificarPaquete;
	
    protected JButton jButtonGuardarCambiosTablaPaquete;
	protected JButton jButtonCerrarPaquete;
	
	
	protected JButton jButtonRecargarInformacionPaquete;
	protected JButton jButtonProcesarInformacionPaquete;
	
	
	protected JButton jButtonAnterioresPaquete;
	protected JButton jButtonSiguientesPaquete;
	protected JButton jButtonNuevoGuardarCambiosPaquete;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPaquete;
	//protected JButton jButtonCerrarReporteDinamicoPaquete;
	//protected JButton jButtonGenerarExcelReporteDinamicoPaquete;	
	
	
	
	//protected JButton jButtonAbrirImportacionPaquete;
	//protected JButton jButtonGenerarImportacionPaquete;
	//protected JButton jButtonCerrarImportacionPaquete;
	//protected JFileChooser jFileChooserImportacionPaquete;
	//protected File fileImportacionPaquete;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPaquete;
	protected JButton jButtonDuplicarToolBarPaquete;
	protected JButton jButtonNuevoRelacionesToolBarPaquete;
	
	
	public JButton jButtonGuardarCambiosToolBarPaquete;
	protected JButton jButtonCopiarToolBarPaquete;
	protected JButton jButtonVerFormToolBarPaquete;
	public JButton jButtonGuardarCambiosTablaToolBarPaquete;
	protected JButton jButtonMostrarOcultarTablaToolBarPaquete;
	protected JButton jButtonCerrarToolBarPaquete;
	
	protected JButton jButtonRecargarInformacionToolBarPaquete;
	protected JButton jButtonProcesarInformacionToolBarPaquete;
	protected JButton jButtonAnterioresToolBarPaquete;
	protected JButton jButtonSiguientesToolBarPaquete;
	protected JButton jButtonNuevoGuardarCambiosToolBarPaquete;
	protected JButton jButtonAbrirOrderByToolBarPaquete;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPaquete;
	protected JMenuItem jMenuItemDuplicarPaquete;
	protected JMenuItem jMenuItemNuevoRelacionesPaquete;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPaquete;
	protected JMenuItem jMenuItemCopiarPaquete;
	protected JMenuItem jMenuItemVerFormPaquete;
	protected JMenuItem jMenuItemGuardarCambiosTablaPaquete;
	protected JMenuItem jMenuItemCerrarPaquete;
	protected JMenuItem jMenuItemDetalleCerrarPaquete;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPaquete;
	protected JMenuItem jMenuItemDetalleMostarOcultarPaquete;
	
	protected JMenuItem jMenuItemRecargarInformacionPaquete;
	protected JMenuItem jMenuItemProcesarInformacionPaquete;
	protected JMenuItem jMenuItemAnterioresPaquete;
	protected JMenuItem jMenuItemSiguientesPaquete;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPaquete;
	protected JMenuItem jMenuItemAbrirOrderByPaquete;
	protected JMenuItem jMenuItemMostrarOcultarPaquete;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPaquete;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPaquete;
	protected JCheckBox jCheckBoxSeleccionadosPaquete;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPaquete;
	protected JCheckBox jCheckBoxConGraficoReportePaquete;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPaquete;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPaquete;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPaquete;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPaquete;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPaquete;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPaquete;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPaquete;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPaquete;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPaquete;
	protected JTextField jTextFieldValorCampoGeneralPaquete;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePaquete;
	//public JList<Reporte> jListColumnasSelectReportePaquete;
	//public JScrollPane jScrollColumnasSelectReportePaquete;
	
	//public JLabel jLabelRelacionesSelectReportePaquete;
	//public JList<Reporte> jListRelacionesSelectReportePaquete;
	//public JScrollPane jScrollRelacionesSelectReportePaquete;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPaquete;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPaquete;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPaquete;
	//public JLabel jLabelTiposArchivoReporteDinamicoPaquete;
	
		
	//public JLabel jLabelArchivoImportacionPaquete;	
	//public JLabel jLabelPathArchivoImportacionPaquete;
	//protected JTextField jTextFieldPathArchivoImportacionPaquete;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPaquete;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPaquete;
	
	//public JLabel jLabelColumnaCategoriaValorPaquete;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPaquete;
	
	//public JLabel jLabelColumnasValoresGraficoPaquete;
	//public JList<Reporte> jListColumnasValoresGraficoPaquete;
	//public JScrollPane jScrollColumnasValoresGraficoPaquete;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPaquete;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPaquete;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPaquete;
	public JPanel jPanelFK_IdSistemaPaquete;
	public JButton jButtonFK_IdSistemaPaquete;
	
	public JPanel jPanelid_sistemaFK_IdSistemaPaquete;
	public JLabel jLabelid_sistemaFK_IdSistemaPaquete;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sistemaFK_IdSistemaPaquete;
	public JButton jButtonid_sistemaFK_IdSistemaPaquete= new JButtonMe();
	public JButton jButtonid_sistemaFK_IdSistemaPaqueteUpdate= new JButtonMe();
	public JButton jButtonid_sistemaFK_IdSistemaPaqueteBusqueda= new JButtonMe();

	
	
	
	
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
	public PaqueteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Paquete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PaqueteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Paquete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PaqueteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Paquete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PaqueteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Paquete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPaquete)	{
		this.jButtonRecargarInformacionPaquete = jButtonRecargarInformacionPaquete;
	}
	
	public JButton getjButtonProcesarInformacionPaquete() {
		return this.jButtonProcesarInformacionPaquete;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPaquete)	{
		this.jButtonProcesarInformacionPaquete = jButtonProcesarInformacionPaquete;
	}
	
	
	public JButton getjButtonRecargarInformacionPaquete() {
		return this.jButtonRecargarInformacionPaquete;
	}
	
	
	public List<Paquete> getpaquetes() {
		return this.paquetes;
	}

	public void setpaquetes(List<Paquete> paquetes) {
		this.paquetes = paquetes;
	}
	
	public List<Paquete> getpaquetesAux() {
		return this.paquetesAux;
	}

	public void setpaquetesAux(List<Paquete> paquetesAux) {
		this.paquetesAux = paquetesAux;
	}
	
	public List<Paquete> getpaquetesEliminados() {
		return this.paquetesEliminados;
	}

	public void setPaquetesEliminados(List<Paquete> paquetesEliminados) {
		this.paquetesEliminados = paquetesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPaquete() {
		return jComboBoxTiposSeleccionarPaquete;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPaquete(
			JComboBox jComboBoxTiposSeleccionarPaquete) {
		this.jComboBoxTiposSeleccionarPaquete = jComboBoxTiposSeleccionarPaquete;
	}
	
	public void setBorderResaltarTiposSeleccionarPaquete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPaquete.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPaquete .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPaquete() {
		return jTextFieldValorCampoGeneralPaquete;
	}

	public void setjTextFieldValorCampoGeneralPaquete(
			JTextField jTextFieldValorCampoGeneralPaquete) {
		this.jTextFieldValorCampoGeneralPaquete = jTextFieldValorCampoGeneralPaquete;
	}

	public void setBorderResaltarValorCampoGeneralPaquete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPaquete.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPaquete .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPaquete() {
		return this.jCheckBoxSeleccionarTodosPaquete;
	}

	public void setjCheckBoxSeleccionarTodosPaquete(
			JCheckBox jCheckBoxSeleccionarTodosPaquete) {
		this.jCheckBoxSeleccionarTodosPaquete = jCheckBoxSeleccionarTodosPaquete;
	}

	public void setBorderResaltarSeleccionarTodosPaquete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPaquete.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPaquete .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPaquete() {
		return this.jCheckBoxSeleccionadosPaquete;
	}

	public void setjCheckBoxSeleccionadosPaquete(
			JCheckBox jCheckBoxSeleccionadosPaquete) {
		this.jCheckBoxSeleccionadosPaquete = jCheckBoxSeleccionadosPaquete;
	}
	
	public void setBorderResaltarSeleccionadosPaquete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPaquete.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPaquete .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPaquete() {
		return this.jComboBoxTiposArchivosReportesPaquete;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPaquete(
			JComboBox jComboBoxTiposArchivosReportesPaquete) {
		this.jComboBoxTiposArchivosReportesPaquete = jComboBoxTiposArchivosReportesPaquete;
	}

	public void setBorderResaltarTiposArchivosReportesPaquete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPaquete.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPaquete .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPaquete() {
		return this.jComboBoxTiposReportesPaquete;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPaquete(
			JComboBox jComboBoxTiposReportesPaquete) {
		this.jComboBoxTiposReportesPaquete = jComboBoxTiposReportesPaquete;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPaquete() {
	//	return jComboBoxTiposReportesDinamicoPaquete;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPaquete(
	//		JComboBox jComboBoxTiposReportesDinamicoPaquete) {
	//	this.jComboBoxTiposReportesDinamicoPaquete = jComboBoxTiposReportesDinamicoPaquete;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPaquete() {
	//	return jComboBoxTiposArchivosReportesDinamicoPaquete;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPaquete(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPaquete) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPaquete = jComboBoxTiposArchivosReportesDinamicoPaquete;
	//}
	
	public void setBorderResaltarTiposReportesPaquete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPaquete.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPaquete .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPaquete() {
		return this.jComboBoxTiposGraficosReportesPaquete;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPaquete(
			JComboBox jComboBoxTiposGraficosReportesPaquete) {
		this.jComboBoxTiposGraficosReportesPaquete = jComboBoxTiposGraficosReportesPaquete;
	}
	
	public void setBorderResaltarTiposGraficosReportesPaquete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPaquete.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPaquete .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPaquete() {
		return this.jComboBoxTiposPaginacionPaquete;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPaquete(
			JComboBox jComboBoxTiposPaginacionPaquete) {
		this.jComboBoxTiposPaginacionPaquete = jComboBoxTiposPaginacionPaquete;
	}
	
	public void setBorderResaltarTiposPaginacionPaquete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPaquete.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPaquete .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPaquete() {
		return this.jComboBoxTiposRelacionesPaquete;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPaquete() {
		return this.jComboBoxTiposAccionesPaquete;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPaquete(
			JComboBox jComboBoxTiposRelacionesPaquete) {
		this.jComboBoxTiposRelacionesPaquete = jComboBoxTiposRelacionesPaquete;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPaquete(
			JComboBox jComboBoxTiposAccionesPaquete) {
		this.jComboBoxTiposAccionesPaquete = jComboBoxTiposAccionesPaquete;
	}
	
	public void setBorderResaltarTiposRelacionesPaquete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPaquete.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPaquete .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPaquete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPaquete.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPaquete .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPaquete() {
	//	return jCheckBoxConGraficoDinamicoPaquete;
	//}

	//public void setjCheckBoxConGraficoDinamicoPaquete(
	//		JCheckBox jCheckBoxConGraficoDinamicoPaquete) {
	//	this.jCheckBoxConGraficoDinamicoPaquete = jCheckBoxConGraficoDinamicoPaquete;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPaquete() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPaquete.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPaquete .setBorder(borderResaltar);		
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
		this.paqueteSessionBean=new PaqueteSessionBean();
		
		this.paqueteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.paqueteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.paqueteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PaqueteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PaqueteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PaqueteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PaqueteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PaqueteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Paquete MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
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
		
		PaqueteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Paquete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPaquete= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPaquete,this.jTtoolBarPaquete,
							"nuevo","nuevo","Nuevo"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPaquete,this.jTtoolBarPaquete,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPaquete,this.jTtoolBarPaquete,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPaquete,this.jTtoolBarPaquete,
							"duplicar","duplicar","Duplicar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPaquete,this.jTtoolBarPaquete,
							"copiar","copiar","Copiar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPaquete,this.jTtoolBarPaquete,
							"ver_form","ver_form","Ver"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPaquete,this.jTtoolBarPaquete,
							"recargar","recargar","Recargar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPaquete,this.jTtoolBarPaquete,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPaquete,this.jTtoolBarPaquete,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPaquete,this.jTtoolBarPaquete,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPaquete,this.jTtoolBarPaquete,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPaquete,this.jTtoolBarPaquete,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPaquete,this.jTtoolBarPaquete,
							"cerrar","cerrar","Salir"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPaquete=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPaquete;
			
				this.jButtonProcesarInformacionToolBarPaquete=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPaquete;
				
		//protected JButton jButtonModificarToolBarPaquete;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPaquete=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPaquete=new JMenuMe("General");
		this.jmenuArchivoPaquete=new JMenuMe("Archivo");
		this.jmenuAccionesPaquete=new JMenuMe("Acciones");
		this.jmenuDatosPaquete=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPaquete= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPaquete.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPaquete,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPaquete= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPaquete.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPaquete,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPaquete= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPaquete.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPaquete,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPaquete= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPaquete.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPaquete,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPaquete= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPaquete.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPaquete,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPaquete= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPaquete.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPaquete,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPaquete= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPaquete.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPaquete,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPaquete= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPaquete.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPaquete,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPaquete= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPaquete.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPaquete,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPaquete= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPaquete.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPaquete,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPaquete= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPaquete.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPaquete,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPaquete= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPaquete.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPaquete,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPaquete= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPaquete.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPaquete,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPaquete= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPaquete.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPaquete,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPaquete= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPaquete.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPaquete,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPaquete= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPaquete.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPaquete,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPaquete= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPaquete.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPaquete,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPaquete.add(this.jMenuItemCerrarPaquete);
			
			this.jmenuAccionesPaquete.add(this.jMenuItemNuevoPaquete);
			this.jmenuAccionesPaquete.add(this.jMenuItemNuevoGuardarCambiosPaquete);
			this.jmenuAccionesPaquete.add(this.jMenuItemNuevoRelacionesPaquete);
			this.jmenuAccionesPaquete.add(this.jMenuItemGuardarCambiosTablaPaquete);		
			this.jmenuAccionesPaquete.add(this.jMenuItemDuplicarPaquete);		
			this.jmenuAccionesPaquete.add(this.jMenuItemCopiarPaquete);		
			this.jmenuAccionesPaquete.add(this.jMenuItemVerFormPaquete);		
			
			this.jmenuDatosPaquete.add(this.jMenuItemRecargarInformacionPaquete);				
			this.jmenuDatosPaquete.add(this.jMenuItemAnterioresPaquete);				
			this.jmenuDatosPaquete.add(this.jMenuItemSiguientesPaquete);				
			this.jmenuDatosPaquete.add(this.jMenuItemAbrirOrderByPaquete);				
			this.jmenuDatosPaquete.add(this.jMenuItemMostrarOcultarPaquete);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPaquete.add(this.jMenuItemGuardarCambiosPaquete);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPaquete.add(this.jmenuArchivoPaquete);		
			this.jmenuBarPaquete.add(this.jmenuAccionesPaquete);		
			this.jmenuBarPaquete.add(this.jmenuDatosPaquete);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPaquete);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPaquete() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdSistemaPaquete=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSistemaPaquete.setToolTipText("Buscar Por Sistema ");
		this.jButtonFK_IdSistemaPaquete= new JButtonMe();
		this.jButtonFK_IdSistemaPaquete.setText("Buscar");
		this.jButtonFK_IdSistemaPaquete.setToolTipText("Buscar Por Sistema ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSistemaPaquete,"buscar_button","Buscar Por Sistema ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSistemaPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sistemaFK_IdSistemaPaquete = new JLabelMe();
		jLabelid_sistemaFK_IdSistemaPaquete.setText("Sistema :");
		jLabelid_sistemaFK_IdSistemaPaquete.setToolTipText("Sistema");
		jLabelid_sistemaFK_IdSistemaPaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaFK_IdSistemaPaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaFK_IdSistemaPaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sistemaFK_IdSistemaPaquete,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sistemaFK_IdSistemaPaquete= new JComboBoxMe();
		jComboBoxid_sistemaFK_IdSistemaPaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaFK_IdSistemaPaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaFK_IdSistemaPaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sistemaFK_IdSistemaPaquete,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPaquete=new JTabbedPane();


		this.jTabbedPaneBusquedasPaquete.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPaquete.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPaquete.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPaquete.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPaquete,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePaquete = new PaqueteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Paquete DATOS");
			this.jInternalFrameDetalleFormPaquete = new PaqueteDetalleFormJInternalFrame(jDesktopPane,this.paqueteSessionBean.getConGuardarRelaciones(),this.paqueteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPaquete = null;//new PaqueteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPaquete= new GridBagLayout();
		
		
		this.jTableDatosPaquete = new JTableMe();      
		
		String sToolTipPaquete="";
		sToolTipPaquete=PaqueteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPaquete+="(Seguridad.Paquete)";
		}
		
		if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
			sToolTipPaquete+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPaquete.setToolTipText(sToolTipPaquete);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPaquete);
		this.jTableDatosPaquete.setAutoCreateRowSorter(true);
		this.jTableDatosPaquete.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPaquete.setRowSelectionAllowed(true);
		this.jTableDatosPaquete.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPaquete,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPaquete = new JButtonMe();
		this.jButtonDuplicarPaquete = new JButtonMe();
		this.jButtonCopiarPaquete = new JButtonMe();
		this.jButtonVerFormPaquete = new JButtonMe();
		this.jButtonNuevoRelacionesPaquete = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPaquete = new JButtonMe();
		this.jButtonCerrarPaquete = new JButtonMe();
		
		this.jScrollPanelDatosPaquete = new JScrollPane();   
        this.jScrollPanelDatosGeneralPaquete = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPaquete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Paquete";
		
		if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Paquetes" + this.sPath));
		} else {
			this.jScrollPanelDatosPaquete.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPaquete.setToolTipText("Acciones");
        this.jPanelAccionesPaquete.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPaquete, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPaquete, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPaquete=new ReporteDinamicoJInternalFrame(PaqueteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPaquete();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPaquete=new ImportacionJInternalFrame(PaqueteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPaquete();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPaquete = new JButtonMe();
		
		this.jButtonAbrirOrderByPaquete.setText("Orden");
		this.jButtonAbrirOrderByPaquete.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPaquete,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPaquete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPaquete=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPaquete,false,this);
			
			//this.cargarOrderByPaquete(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPaquete=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPaquete,true,this);
			
			//this.cargarOrderByPaquete(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPaquete.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosPaquete.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosPaquete.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosPaquete.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPaquete.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPaquete.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPaquete.setText("Nuevo");
		this.jButtonDuplicarPaquete.setText("Duplicar");
		this.jButtonCopiarPaquete.setText("Copiar");
		this.jButtonVerFormPaquete.setText("Ver");
		this.jButtonNuevoRelacionesPaquete.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPaquete.setText("Guardar");
		this.jButtonCerrarPaquete.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPaquete,"nuevo_button","Nuevo",this.paqueteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPaquete,"duplicar_button","Duplicar",this.paqueteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPaquete,"copiar_button","Copiar",this.paqueteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPaquete,"ver_form","Ver",this.paqueteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPaquete,"nuevorelaciones_button","Nuevo Rel",this.paqueteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPaquete,"guardarcambiostabla_button","Guardar",this.paqueteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPaquete,"cerrar_button","Salir",this.paqueteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPaquete, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPaquete.setToolTipText("Nuevo"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPaquete.setToolTipText("Duplicar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPaquete.setToolTipText("Copiar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPaquete.setToolTipText("Ver"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPaquete.setToolTipText("Nuevo Rel"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPaquete.setToolTipText("Guardar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPaquete.setToolTipText("Salir"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPaquete";
		inputMap = this.jButtonNuevoPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPaquete.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPaquete"));
		
		//DUPLICAR
		sMapKey = "DuplicarPaquete";
		inputMap = this.jButtonDuplicarPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPaquete.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPaquete"));
		
		//COPIAR
		sMapKey = "CopiarPaquete";
		inputMap = this.jButtonCopiarPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPaquete.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPaquete"));
		
		//VEr FORM
		sMapKey = "VerFormPaquete";
		inputMap = this.jButtonVerFormPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPaquete.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPaquete"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPaquete";
		inputMap = this.jButtonNuevoRelacionesPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPaquete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPaquete"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPaquete";
		inputMap = this.jButtonModificarPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPaquete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPaquete"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPaquete";
		inputMap = this.jButtonCerrarPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPaquete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPaquete"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPaquete";
		inputMap = this.jButtonGuardarCambiosTablaPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPaquete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPaquete"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPaquete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPaquete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPaquete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Paquete= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Paquete= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Paquete= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Paquete= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Paquete= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPaquete.setName("jPanelParametrosReportesPaquete"); 
		
		this.jPanelParametrosReportesAccionesPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPaquete.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPaquete.setName("jPanelParametrosReportesAccionesPaquete"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPaquete, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPaquete, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPaquete = new JButtonMe();
		this.jButtonRecargarInformacionPaquete.setText("Recargar");
		this.jButtonRecargarInformacionPaquete.setToolTipText("Recargar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPaquete,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPaquete = new JButtonMe();
		this.jButtonProcesarInformacionPaquete.setText("Procesar");
		this.jButtonProcesarInformacionPaquete.setToolTipText("Procesar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPaquete.setVisible(false);
			
		this.jButtonProcesarInformacionPaquete.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPaquete.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPaquete.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPaquete = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPaquete.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPaquete.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPaquete = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPaquete.setText("TIPO");       
		this.jComboBoxTiposReportesPaquete.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPaquete = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPaquete.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPaquete.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPaquete = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPaquete.setText("Paginacion");
		this.jComboBoxTiposPaginacionPaquete.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPaquete = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPaquete.setText("Accion");
		this.jComboBoxTiposRelacionesPaquete.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPaquete = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPaquete.setText("Accion");
		this.jComboBoxTiposAccionesPaquete.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPaquete = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPaquete.setText("Accion");
		this.jComboBoxTiposSeleccionarPaquete.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPaquete=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPaquete.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPaquete.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPaquete.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPaquete = new JLabelMe();
		
		this.jLabelAccionesPaquete.setText("Acciones");		
		this.jLabelAccionesPaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPaquete = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPaquete.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPaquete.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPaquete = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPaquete.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPaquete.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPaquete = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPaquete.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPaquete.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePaquete = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePaquete.setText("Graf.");
		this.jCheckBoxConGraficoReportePaquete.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPaquete = new JButtonMe();
		//this.jButtonAnterioresPaquete.setText("<<");
        this.jButtonAnterioresPaquete.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPaquete,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPaquete = new JButtonMe();
		//this.jButtonSiguientesPaquete.setText(">>");
        this.jButtonSiguientesPaquete.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPaquete,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPaquete = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPaquete.setText("Nue");
        this.jButtonNuevoGuardarCambiosPaquete.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPaquete,"nuevoguardarcambios_button","Nue",this.paqueteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPaquete";
		inputMap = this.jButtonNuevoGuardarCambiosPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPaquete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPaquete"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPaquete";
		inputMap = this.jButtonRecargarInformacionPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPaquete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPaquete"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPaquete";
		inputMap = this.jButtonSiguientesPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPaquete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPaquete"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPaquete";
		inputMap = this.jButtonAnterioresPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPaquete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPaquete"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPaquete();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPaquete.setMinimumSize(new Dimension(this.getWidth(),PaqueteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PaqueteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPaquete.setMaximumSize(new Dimension(this.getWidth(),PaqueteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PaqueteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPaquete.setPreferredSize(new Dimension(this.getWidth(),PaqueteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PaqueteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPaquete = new GridBagLayout();

			this.jPanelPaginacionPaquete.setLayout(gridaBagLayoutPaginacionPaquete);						
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.gridy = 0;
			this.gridBagConstraintsPaquete.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPaquete.add(this.jButtonAnterioresPaquete, this.gridBagConstraintsPaquete);
					
						
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPaquete.gridy = 0;
			
			this.jPanelPaginacionPaquete.add(this.jButtonNuevoGuardarCambiosPaquete, this.gridBagConstraintsPaquete);
						
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPaquete.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPaquete.gridy = 0;
			this.jPanelPaginacionPaquete.add(this.jButtonSiguientesPaquete, this.gridBagConstraintsPaquete);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.gridy = 1;
			this.gridBagConstraintsPaquete.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPaquete.add(this.jButtonNuevoPaquete, this.gridBagConstraintsPaquete);
						
			
			
			if(!this.paqueteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPaquete = new GridBagConstraints();
				this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPaquete.gridy = 1;
				this.gridBagConstraintsPaquete.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPaquete.add(this.jButtonGuardarCambiosTablaPaquete, this.gridBagConstraintsPaquete);
			}
			
			
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.gridy = 1;
			this.gridBagConstraintsPaquete.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPaquete.add(this.jButtonDuplicarPaquete, this.gridBagConstraintsPaquete);
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.gridy = 1;
			this.gridBagConstraintsPaquete.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPaquete.add(this.jButtonCopiarPaquete, this.gridBagConstraintsPaquete);
		
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.gridy = 1;
			this.gridBagConstraintsPaquete.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPaquete.add(this.jButtonVerFormPaquete, this.gridBagConstraintsPaquete);
		
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.gridy = 1;
			this.gridBagConstraintsPaquete.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPaquete.add(this.jButtonCerrarPaquete, this.gridBagConstraintsPaquete);
		
		
		
		this.jButtonRecargarInformacionPaquete.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPaquete.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPaquete.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPaquete, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPaquete.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPaquete.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPaquete.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPaquete.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPaquete.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPaquete.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPaquete.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPaquete.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPaquete.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPaquete.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPaquete.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPaquete.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPaquete.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPaquete.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPaquete.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPaquete.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPaquete.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPaquete.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPaquete.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPaquete.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPaquete.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPaquete.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPaquete.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPaquete.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePaquete.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePaquete.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePaquete.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePaquete, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPaquete.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPaquete.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPaquete.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPaquete.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPaquete.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPaquete.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPaquete = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPaquete = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Paquete = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Paquete = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Paquete = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Paquete = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPaquete.setLayout(gridaBagParametrosReportesPaquete);
			this.jPanelParametrosReportesAccionesPaquete.setLayout(gridaBagParametrosReportesAccionesPaquete);
			
			
			this.jPanelParametrosAuxiliar1Paquete.setLayout(gridaBagParametrosAuxiliar1Paquete);
			this.jPanelParametrosAuxiliar2Paquete.setLayout(gridaBagParametrosAuxiliar2Paquete);
			this.jPanelParametrosAuxiliar3Paquete.setLayout(gridaBagParametrosAuxiliar3Paquete);
			this.jPanelParametrosAuxiliar4Paquete.setLayout(gridaBagParametrosAuxiliar4Paquete);
			//this.jPanelParametrosAuxiliar5Paquete.setLayout(gridaBagParametrosAuxiliar2Paquete);			
			
			
			
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPaquete.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPaquete.add(this.jButtonRecargarInformacionPaquete, this.gridBagConstraintsPaquete);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPaquete.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPaquete.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Paquete.add(this.jComboBoxTiposPaginacionPaquete, this.gridBagConstraintsPaquete);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPaquete.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPaquete.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Paquete.add(this.jCheckBoxConAltoMaximoTablaPaquete, this.gridBagConstraintsPaquete);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPaquete.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPaquete.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Paquete.add(this.jComboBoxTiposArchivosReportesPaquete, this.gridBagConstraintsPaquete);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPaquete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPaquete.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPaquete.add(this.jPanelParametrosAuxiliar1Paquete, this.gridBagConstraintsPaquete);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPaquete.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Paquete.add(this.jComboBoxTiposReportesPaquete, this.gridBagConstraintsPaquete);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPaquete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPaquete.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPaquete.add(this.jPanelParametrosAuxiliar4Paquete, this.gridBagConstraintsPaquete);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPaquete.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPaquete.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPaquete.add(this.jComboBoxTiposReportesPaquete, this.gridBagConstraintsPaquete);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPaquete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPaquete.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPaquete.add(this.jCheckBoxGenerarReportePaquete, this.gridBagConstraintsPaquete);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPaquete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPaquete.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPaquete.add(this.jPanelParametrosAuxiliar2Paquete, this.gridBagConstraintsPaquete);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPaquete.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPaquete.add(this.jLabelAccionesPaquete, this.gridBagConstraintsPaquete);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPaquete = new GridBagConstraints();
				this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPaquete.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPaquete.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPaquete.add(this.jButtonAbrirOrderByPaquete, this.gridBagConstraintsPaquete);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPaquete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPaquete.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPaquete.add(this.jComboBoxTiposSeleccionarPaquete, this.gridBagConstraintsPaquete);			
			
			
			/*
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPaquete.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPaquete.add(this.jCheckBoxSeleccionarTodosPaquete, this.gridBagConstraintsPaquete);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPaquete.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Paquete.add(this.jCheckBoxSeleccionarTodosPaquete, this.gridBagConstraintsPaquete);															
				
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPaquete.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Paquete.add(this.jCheckBoxSeleccionadosPaquete, this.gridBagConstraintsPaquete);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPaquete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPaquete.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPaquete.add(this.jPanelParametrosAuxiliar3Paquete, this.gridBagConstraintsPaquete);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPaquete.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPaquete.add(this.jComboBoxTiposRelacionesPaquete, this.gridBagConstraintsPaquete);
				
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPaquete.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPaquete.add(this.jComboBoxTiposAccionesPaquete, this.gridBagConstraintsPaquete);
	
				
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPaquete.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPaquete.add(this.jTextFieldValorCampoGeneralPaquete, this.gridBagConstraintsPaquete);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPaquete = new GridBagLayout();

			this.jScrollPanelDatosPaquete.setLayout(gridaBagLayoutDatosPaquete);
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.gridy = 0;
			this.gridBagConstraintsPaquete.gridx = 0;
			
			this.jScrollPanelDatosPaquete.add(this.jTableDatosPaquete, this.gridBagConstraintsPaquete);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPaquete.setViewportView(this.jTableDatosPaquete);
		this.jTableDatosPaquete.setFillsViewportHeight(true);
		this.jTableDatosPaquete.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPaquete= new GridBagLayout();
		this.jPanelAccionesPaquete.setLayout(gridaBagLayoutAccionesPaquete);
		
		
		/*	
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPaquete.gridy = 0;
		this.gridBagConstraintsPaquete.gridx = 0;
			
		this.jPanelAccionesPaquete.add(this.jButtonNuevoPaquete, this.gridBagConstraintsPaquete);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdSistemaPaquete= new GridBagLayout();
		gridaBagLayoutFK_IdSistemaPaquete.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSistemaPaquete.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSistemaPaquete.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSistemaPaquete.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSistemaPaquete.setLayout(gridaBagLayoutFK_IdSistemaPaquete);

		gridBagConstraintsPaquete = new GridBagConstraints();
		gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPaquete.gridy = 0;
		gridBagConstraintsPaquete.gridx = 0;
		jPanelFK_IdSistemaPaquete.add(jLabelid_sistemaFK_IdSistemaPaquete, gridBagConstraintsPaquete);

		gridBagConstraintsPaquete = new GridBagConstraints();
		gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPaquete.gridy = 0;
		gridBagConstraintsPaquete.gridx = 1;
		jPanelFK_IdSistemaPaquete.add(jComboBoxid_sistemaFK_IdSistemaPaquete, gridBagConstraintsPaquete);

		gridBagConstraintsPaquete = new GridBagConstraints();
		gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPaquete.gridy = 1;
		gridBagConstraintsPaquete.gridx =1;
		jPanelFK_IdSistemaPaquete.add(jButtonFK_IdSistemaPaquete, gridBagConstraintsPaquete);

		jTabbedPaneBusquedasPaquete.addTab("1.-Por Sistema ", jPanelFK_IdSistemaPaquete);
		jTabbedPaneBusquedasPaquete.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPaquete = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPaquete);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.paqueteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPaquete = new GridBagConstraints();						
			this.gridBagConstraintsPaquete.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPaquete.gridx = 0;		
			//this.gridBagConstraintsPaquete.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPaquete.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPaquete, this.gridBagConstraintsPaquete);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPaquete.gridx = 0;		
		//this.gridBagConstraintsPaquete.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPaquete.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPaquete.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPaquete);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPaquete.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPaquete.gridx = 0;		
			this.gridBagConstraintsPaquete.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPaquete.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPaquete, this.gridBagConstraintsPaquete);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPaquete.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPaquete, this.gridBagConstraintsPaquete);								
		
		
		/*
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPaquete.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPaquete, this.gridBagConstraintsPaquete);
		*/		
		
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPaquete.gridx =0;
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPaquete.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPaquete, this.gridBagConstraintsPaquete);
				
		
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPaquete.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPaquete, this.gridBagConstraintsPaquete);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PaqueteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPaquete= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPaquete = new GridBagLayout();
			this.jPanelBusquedasParametrosPaquete.setLayout(gridaBagLayoutBusquedasParametrosPaquete);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPaquete=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPaquete.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPaquete.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPaquete.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPaquete.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPaquete, this.gridBagConstraintsPaquete);
			
			
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPaquete.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPaquete, this.gridBagConstraintsPaquete);
		
			
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPaquete.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPaquete, this.gridBagConstraintsPaquete);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPaquete;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPaquete() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPaquete = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPaquete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPaquete.setName("jPanelReporteDinamicoPaquete"); 
		
		this.jPanelReporteDinamicoPaquete.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPaquete.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPaquete.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPaquete.setLayout(gridaBagLayoutReporteDinamicoPaquete);
		
		
		this.jInternalFrameReporteDinamicoPaquete= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPaquete = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePaquete= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPaquete.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPaquete.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPaquete.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPaquete.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPaquete.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPaquete.setResizable(true);
	    this.jInternalFrameReporteDinamicoPaquete.setClosable(true);
	    this.jInternalFrameReporteDinamicoPaquete.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPaquete.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPaquete.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPaquete.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Paquetes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePaquete = new JLabelMe();

		this.jLabelColumnasSelectReportePaquete.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPaquete.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPaquete.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPaquete.add(this.jLabelColumnasSelectReportePaquete, this.gridBagConstraintsPaquete);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePaquete = new JList<Reporte>();
		this.jListColumnasSelectReportePaquete.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePaquete.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePaquete.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePaquete.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePaquete.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePaquete=new JScrollPane(this.jListColumnasSelectReportePaquete);
			
			this.jScrollColumnasSelectReportePaquete.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePaquete.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePaquete.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPaquete.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPaquete.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPaquete.add(this.jListColumnasSelectReportePaquete, this.gridBagConstraintsPaquete);
		this.jPanelReporteDinamicoPaquete.add(this.jScrollColumnasSelectReportePaquete, this.gridBagConstraintsPaquete);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePaquete = new JLabelMe();

		this.jLabelRelacionesSelectReportePaquete.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePaquete = new JList<Reporte>();
		this.jListRelacionesSelectReportePaquete.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePaquete.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePaquete.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePaquete.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePaquete.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePaquete=new JScrollPane(this.jListRelacionesSelectReportePaquete);
			
			this.jScrollRelacionesSelectReportePaquete.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePaquete.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePaquete.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPaquete = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPaquete = new JComboBoxMe();
		this.jListColumnasValoresGraficoPaquete = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPaquete = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPaquete.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPaquete.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPaquete.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPaquete.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPaquete = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPaquete.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPaquete.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPaquete.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPaquete.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPaquete = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPaquete.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPaquete.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPaquete.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPaquete.add(this.jLabelGenerarExcelReporteDinamicoPaquete, this.gridBagConstraintsPaquete);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPaquete = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPaquete.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPaquete,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPaquete.setToolTipText("Generar EXCEL"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPaquete = new GridBagConstraints();
		//this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPaquete.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPaquete.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPaquete.add(this.jButtonGenerarExcelReporteDinamicoPaquete, this.gridBagConstraintsPaquete);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPaquete.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPaquete.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPaquete.add(this.jComboBoxTiposReportesDinamicoPaquete, this.gridBagConstraintsPaquete);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPaquete = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPaquete.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPaquete.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPaquete.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPaquete.add(this.jLabelTiposArchivoReporteDinamicoPaquete, this.gridBagConstraintsPaquete);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPaquete.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPaquete.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPaquete.add(this.jComboBoxTiposArchivosReportesDinamicoPaquete, this.gridBagConstraintsPaquete);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPaquete = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPaquete.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPaquete,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPaquete.setToolTipText("Generar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPaquete.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPaquete.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPaquete.add(this.jButtonGenerarReporteDinamicoPaquete, this.gridBagConstraintsPaquete);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPaquete = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPaquete.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPaquete,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPaquete.setToolTipText("Cancelar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPaquete.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPaquete.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPaquete.add(this.jButtonCerrarReporteDinamicoPaquete, this.gridBagConstraintsPaquete);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPaquete = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPaquete= new JScrollPane(jPanelReporteDinamicoPaquete,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPaquete.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPaquete.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPaquete.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Paquetes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPaquete.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPaquete.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPaquete.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPaquete);
		this.jInternalFrameReporteDinamicoPaquete.getContentPane().add(this.jScrollPanelReporteDinamicoPaquete, this.gridBagConstraintsPaquete);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPaquete() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPaquete = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPaquete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPaquete.setName("jPanelImportacionPaquete"); 
		
		this.jPanelImportacionPaquete.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPaquete.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPaquete.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPaquete.setLayout(gridaBagLayoutImportacionPaquete);
		
		
		this.jInternalFrameImportacionPaquete= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPaquete= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPaquete = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePaquete= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPaquete.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPaquete.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPaquete.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPaquete.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPaquete.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPaquete.setResizable(true);
	    this.jInternalFrameImportacionPaquete.setClosable(true);
	    this.jInternalFrameImportacionPaquete.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPaquete.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPaquete.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPaquete.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPaquete.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPaquete.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPaquete.setResizable(true);
	    this.jInternalFrameImportacionPaquete.setClosable(true);
	    this.jInternalFrameImportacionPaquete.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPaquete.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPaquete.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPaquete.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Paquetes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPaquete = new JLabelMe();

		this.jLabelArchivoImportacionPaquete.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPaquete.gridy = iPosYImportacion;		
		this.gridBagConstraintsPaquete.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPaquete.add(this.jLabelArchivoImportacionPaquete, this.gridBagConstraintsPaquete);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPaquete = new JFileChooser();		
		this.jFileChooserImportacionPaquete.setToolTipText("ESCOGER ARCHIVO"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPaquete = new JButtonMe();
		this.jButtonAbrirImportacionPaquete.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPaquete,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPaquete.setToolTipText("Generar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPaquete.gridy = iPosYImportacion;
		this.gridBagConstraintsPaquete.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPaquete.add(this.jButtonAbrirImportacionPaquete, this.gridBagConstraintsPaquete);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPaquete = new JLabelMe();

		this.jLabelPathArchivoImportacionPaquete.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPaquete.gridy = iPosYImportacion;		
		this.gridBagConstraintsPaquete.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPaquete.add(this.jLabelPathArchivoImportacionPaquete, this.gridBagConstraintsPaquete);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPaquete=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPaquete.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPaquete.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPaquete.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPaquete.gridy = iPosYImportacion;
		this.gridBagConstraintsPaquete.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPaquete.add(this.jTextFieldPathArchivoImportacionPaquete, this.gridBagConstraintsPaquete);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPaquete = new JButtonMe();
		this.jButtonGenerarImportacionPaquete.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPaquete,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPaquete.setToolTipText("Generar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPaquete.gridy = iPosYImportacion;
		this.gridBagConstraintsPaquete.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPaquete.add(this.jButtonGenerarImportacionPaquete, this.gridBagConstraintsPaquete);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPaquete = new JButtonMe();
		this.jButtonCerrarImportacionPaquete.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPaquete,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPaquete.setToolTipText("Cancelar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPaquete.gridy = iPosYImportacion;
		this.gridBagConstraintsPaquete.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPaquete.add(this.jButtonCerrarImportacionPaquete, this.gridBagConstraintsPaquete);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPaquete = new GridBagLayout();
		
		this.jScrollPanelImportacionPaquete= new JScrollPane(jPanelImportacionPaquete,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy =iPosYImportacion;
		this.gridBagConstraintsPaquete.gridx =iPosXImportacion;
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPaquete.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPaquete.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPaquete);
		this.jInternalFrameImportacionPaquete.getContentPane().add(this.jScrollPanelImportacionPaquete, this.gridBagConstraintsPaquete);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPaquete(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPaquete = new JButtonMe();
			this.jButtonAbrirOrderByPaquete.setText("Orden");
			this.jButtonAbrirOrderByPaquete.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPaquete,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPaquete";
			inputMap = this.jButtonAbrirOrderByPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPaquete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPaquete"));
		
		
			GridBagLayout gridaBagLayoutOrderByPaquete = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPaquete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPaquete.setName("jPanelOrderByPaquete"); 
			
			this.jPanelOrderByPaquete.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPaquete.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPaquete.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPaquete.setLayout(gridaBagLayoutOrderByPaquete);
			
			
			this.jTableDatosPaqueteOrderBy = new JTableMe();        
			this.jTableDatosPaqueteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPaqueteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPaqueteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPaqueteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPaqueteOrderBy.setViewportView(this.jTableDatosPaqueteOrderBy);
			this.jTableDatosPaqueteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPaqueteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPaquete= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPaquete= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPaquete = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePaquete= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPaquete.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPaquete.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPaquete.setTitle("Orden");
			this.jInternalFrameOrderByPaquete.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPaquete.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPaquete.setResizable(true);
			this.jInternalFrameOrderByPaquete.setClosable(true);
			this.jInternalFrameOrderByPaquete.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPaquete.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPaquete.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPaquete.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Paquetes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPaquete.gridx =iPosXOrderBy;
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPaquete.ipady =150;
				
			this.jPanelOrderByPaquete.add(jScrollPanelDatosPaqueteOrderBy, this.gridBagConstraintsPaquete);//this.jTableDatosPaqueteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPaquete = new JButtonMe();
			this.jButtonCerrarOrderByPaquete.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPaquete,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPaquete.setToolTipText("Cancelar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPaquete.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPaquete.add(this.jButtonCerrarOrderByPaquete, this.gridBagConstraintsPaquete);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPaquete = new GridBagLayout();
			
			this.jScrollPanelOrderByPaquete= new JScrollPane(jPanelOrderByPaquete,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.gridy =iPosYOrderBy;
			this.gridBagConstraintsPaquete.gridx =iPosXOrderBy;
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPaquete.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPaquete.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPaquete);
			
			this.jInternalFrameOrderByPaquete.getContentPane().add(this.jScrollPanelOrderByPaquete, this.gridBagConstraintsPaquete);			
		
		} else {
			this.jButtonAbrirOrderByPaquete = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.paqueteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPaquete.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPaquete.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPaquete.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPaquete.getRowHeight();//PaqueteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PaqueteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPaquete.isSelected()) {
					iHeightTable=PaqueteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PaqueteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PaqueteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PaqueteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPaquete.isSelected()) {
					iHeightTable=PaqueteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PaqueteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PaqueteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPaquete.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPaquete.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPaquete.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPaquete.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPaquete.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPaquete.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPaquete!=null && this.jInternalFrameOrderByPaquete.getjTableDatosOrderBy()!=null) {
			//if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPaquete.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPaquete.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPaquete.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPaquete.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPaquete.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPaquete.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPaquete.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPaquete.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPaquete.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPaquete.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=paqueteLogic.getPaquetes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=paquetes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Paquete> TraerPaqueteBeans(List<Paquete> paquetes,ArrayList<Classe> classes)throws Exception {
		try {
			for(Paquete paquete:paquetes) {
					
				if(!(PaqueteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PaqueteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					paquete.setsDetalleGeneralEntityReporte(PaqueteConstantesFunciones.getPaqueteDescripcion(paquete));
										
						
					
						
					
				} else  {
							
					//paquete.setsDetalleGeneralEntityReporte(paquete.getsDetalleGeneralEntityReporte());
										
				}
				
				//paquetebeans.add(paquetebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return paquetes;
    }
	//PARA REPORTES FIN
}
