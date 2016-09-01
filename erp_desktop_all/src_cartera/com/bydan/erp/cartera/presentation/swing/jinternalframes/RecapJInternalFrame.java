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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.RecapConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class RecapJInternalFrame extends RecapBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRecap;
	
	protected JMenuBar jmenuBarRecap;
	
	protected JMenu jmenuRecap;
	protected JMenu jmenuDatosRecap;
	protected JMenu jmenuArchivoRecap;
	protected JMenu jmenuAccionesRecap;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRecap;	
	protected GridBagConstraints gridBagConstraintsRecap;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RecapDetalleFormJInternalFrame jInternalFrameDetalleFormRecap;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRecap;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRecap;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public RecapSessionBean recapSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Recap> recaps;		
	public List<Recap> recapsEliminados;	
	public List<Recap> recapsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRecap;		
	protected JButton jButtonAbrirOrderByRecap;
	
	
	//protected JPanel jPanelOrderByRecap;
	//public JScrollPane jScrollPanelOrderByRecap;	
	//protected JButton jButtonCerrarOrderByRecap;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RecapLogic recapLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRecap;
	public JScrollPane jScrollPanelDatosEdicionRecap;
	public JScrollPane jScrollPanelDatosGeneralRecap;
    
	
	
	//public JScrollPane jScrollPanelDatosRecapOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRecap;
	//public JScrollPane jScrollPanelImportacionRecap;
	
	
	
	protected JPanel jPanelAccionesRecap;
	
    protected JPanel jPanelPaginacionRecap;
    protected JPanel jPanelParametrosReportesRecap;
	protected JPanel jPanelParametrosReportesAccionesRecap;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Recap;
	protected JPanel jPanelParametrosAuxiliar2Recap;
	protected JPanel jPanelParametrosAuxiliar3Recap;
	protected JPanel jPanelParametrosAuxiliar4Recap;
	//protected JPanel jPanelParametrosAuxiliar5Recap;
	
	
	
	//protected JPanel jPanelReporteDinamicoRecap;
	//protected JPanel jPanelImportacionRecap;
	
	
	public JTable jTableDatosRecap;
	
	
	
	//public JTable jTableDatosRecapOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRecap;
	protected JButton jButtonDuplicarRecap;
	protected JButton jButtonCopiarRecap;
	protected JButton jButtonVerFormRecap;
	protected JButton jButtonNuevoRelacionesRecap;
	protected JButton jButtonModificarRecap;
	
    protected JButton jButtonGuardarCambiosTablaRecap;
	protected JButton jButtonCerrarRecap;
	
	
	protected JButton jButtonRecargarInformacionRecap;
	protected JButton jButtonProcesarInformacionRecap;
	
	
	protected JButton jButtonAnterioresRecap;
	protected JButton jButtonSiguientesRecap;
	protected JButton jButtonNuevoGuardarCambiosRecap;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRecap;
	//protected JButton jButtonCerrarReporteDinamicoRecap;
	//protected JButton jButtonGenerarExcelReporteDinamicoRecap;	
	
	
	
	//protected JButton jButtonAbrirImportacionRecap;
	//protected JButton jButtonGenerarImportacionRecap;
	//protected JButton jButtonCerrarImportacionRecap;
	//protected JFileChooser jFileChooserImportacionRecap;
	//protected File fileImportacionRecap;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRecap;
	protected JButton jButtonDuplicarToolBarRecap;
	protected JButton jButtonNuevoRelacionesToolBarRecap;
	
	
	public JButton jButtonGuardarCambiosToolBarRecap;
	protected JButton jButtonCopiarToolBarRecap;
	protected JButton jButtonVerFormToolBarRecap;
	public JButton jButtonGuardarCambiosTablaToolBarRecap;
	protected JButton jButtonMostrarOcultarTablaToolBarRecap;
	protected JButton jButtonCerrarToolBarRecap;
	
	protected JButton jButtonRecargarInformacionToolBarRecap;
	protected JButton jButtonProcesarInformacionToolBarRecap;
	protected JButton jButtonAnterioresToolBarRecap;
	protected JButton jButtonSiguientesToolBarRecap;
	protected JButton jButtonNuevoGuardarCambiosToolBarRecap;
	protected JButton jButtonAbrirOrderByToolBarRecap;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRecap;
	protected JMenuItem jMenuItemDuplicarRecap;
	protected JMenuItem jMenuItemNuevoRelacionesRecap;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRecap;
	protected JMenuItem jMenuItemCopiarRecap;
	protected JMenuItem jMenuItemVerFormRecap;
	protected JMenuItem jMenuItemGuardarCambiosTablaRecap;
	protected JMenuItem jMenuItemCerrarRecap;
	protected JMenuItem jMenuItemDetalleCerrarRecap;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRecap;
	protected JMenuItem jMenuItemDetalleMostarOcultarRecap;
	
	protected JMenuItem jMenuItemRecargarInformacionRecap;
	protected JMenuItem jMenuItemProcesarInformacionRecap;
	protected JMenuItem jMenuItemAnterioresRecap;
	protected JMenuItem jMenuItemSiguientesRecap;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRecap;
	protected JMenuItem jMenuItemAbrirOrderByRecap;
	protected JMenuItem jMenuItemMostrarOcultarRecap;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRecap;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRecap;
	protected JCheckBox jCheckBoxSeleccionadosRecap;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRecap;
	protected JCheckBox jCheckBoxConGraficoReporteRecap;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRecap;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRecap;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRecap;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRecap;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRecap;
	protected JTextField jTextFieldValorCampoGeneralRecap;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRecap;
	//public JList<Reporte> jListColumnasSelectReporteRecap;
	//public JScrollPane jScrollColumnasSelectReporteRecap;
	
	//public JLabel jLabelRelacionesSelectReporteRecap;
	//public JList<Reporte> jListRelacionesSelectReporteRecap;
	//public JScrollPane jScrollRelacionesSelectReporteRecap;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRecap;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRecap;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRecap;
	//public JLabel jLabelTiposArchivoReporteDinamicoRecap;
	
		
	//public JLabel jLabelArchivoImportacionRecap;	
	//public JLabel jLabelPathArchivoImportacionRecap;
	//protected JTextField jTextFieldPathArchivoImportacionRecap;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRecap;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRecap;
	
	//public JLabel jLabelColumnaCategoriaValorRecap;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRecap;
	
	//public JLabel jLabelColumnasValoresGraficoRecap;
	//public JList<Reporte> jListColumnasValoresGraficoRecap;
	//public JScrollPane jScrollColumnasValoresGraficoRecap;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRecap;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRecap;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRecap;
	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RecapJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Recap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RecapJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Recap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RecapJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Recap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RecapJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Recap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRecap)	{
		this.jButtonRecargarInformacionRecap = jButtonRecargarInformacionRecap;
	}
	
	public JButton getjButtonProcesarInformacionRecap() {
		return this.jButtonProcesarInformacionRecap;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRecap)	{
		this.jButtonProcesarInformacionRecap = jButtonProcesarInformacionRecap;
	}
	
	
	public JButton getjButtonRecargarInformacionRecap() {
		return this.jButtonRecargarInformacionRecap;
	}
	
	
	public List<Recap> getrecaps() {
		return this.recaps;
	}

	public void setrecaps(List<Recap> recaps) {
		this.recaps = recaps;
	}
	
	public List<Recap> getrecapsAux() {
		return this.recapsAux;
	}

	public void setrecapsAux(List<Recap> recapsAux) {
		this.recapsAux = recapsAux;
	}
	
	public List<Recap> getrecapsEliminados() {
		return this.recapsEliminados;
	}

	public void setRecapsEliminados(List<Recap> recapsEliminados) {
		this.recapsEliminados = recapsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRecap() {
		return jComboBoxTiposSeleccionarRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRecap(
			JComboBox jComboBoxTiposSeleccionarRecap) {
		this.jComboBoxTiposSeleccionarRecap = jComboBoxTiposSeleccionarRecap;
	}
	
	public void setBorderResaltarTiposSeleccionarRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRecap .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRecap() {
		return jTextFieldValorCampoGeneralRecap;
	}

	public void setjTextFieldValorCampoGeneralRecap(
			JTextField jTextFieldValorCampoGeneralRecap) {
		this.jTextFieldValorCampoGeneralRecap = jTextFieldValorCampoGeneralRecap;
	}

	public void setBorderResaltarValorCampoGeneralRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecap.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRecap .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRecap() {
		return this.jCheckBoxSeleccionarTodosRecap;
	}

	public void setjCheckBoxSeleccionarTodosRecap(
			JCheckBox jCheckBoxSeleccionarTodosRecap) {
		this.jCheckBoxSeleccionarTodosRecap = jCheckBoxSeleccionarTodosRecap;
	}

	public void setBorderResaltarSeleccionarTodosRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecap.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRecap .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRecap() {
		return this.jCheckBoxSeleccionadosRecap;
	}

	public void setjCheckBoxSeleccionadosRecap(
			JCheckBox jCheckBoxSeleccionadosRecap) {
		this.jCheckBoxSeleccionadosRecap = jCheckBoxSeleccionadosRecap;
	}
	
	public void setBorderResaltarSeleccionadosRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecap.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRecap .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRecap() {
		return this.jComboBoxTiposArchivosReportesRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRecap(
			JComboBox jComboBoxTiposArchivosReportesRecap) {
		this.jComboBoxTiposArchivosReportesRecap = jComboBoxTiposArchivosReportesRecap;
	}

	public void setBorderResaltarTiposArchivosReportesRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRecap .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRecap() {
		return this.jComboBoxTiposReportesRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRecap(
			JComboBox jComboBoxTiposReportesRecap) {
		this.jComboBoxTiposReportesRecap = jComboBoxTiposReportesRecap;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRecap() {
	//	return jComboBoxTiposReportesDinamicoRecap;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRecap(
	//		JComboBox jComboBoxTiposReportesDinamicoRecap) {
	//	this.jComboBoxTiposReportesDinamicoRecap = jComboBoxTiposReportesDinamicoRecap;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRecap() {
	//	return jComboBoxTiposArchivosReportesDinamicoRecap;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRecap(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRecap) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRecap = jComboBoxTiposArchivosReportesDinamicoRecap;
	//}
	
	public void setBorderResaltarTiposReportesRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRecap .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRecap() {
		return this.jComboBoxTiposGraficosReportesRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRecap(
			JComboBox jComboBoxTiposGraficosReportesRecap) {
		this.jComboBoxTiposGraficosReportesRecap = jComboBoxTiposGraficosReportesRecap;
	}
	
	public void setBorderResaltarTiposGraficosReportesRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRecap .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRecap() {
		return this.jComboBoxTiposPaginacionRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRecap(
			JComboBox jComboBoxTiposPaginacionRecap) {
		this.jComboBoxTiposPaginacionRecap = jComboBoxTiposPaginacionRecap;
	}
	
	public void setBorderResaltarTiposPaginacionRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRecap .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRecap() {
		return this.jComboBoxTiposRelacionesRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRecap() {
		return this.jComboBoxTiposAccionesRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRecap(
			JComboBox jComboBoxTiposRelacionesRecap) {
		this.jComboBoxTiposRelacionesRecap = jComboBoxTiposRelacionesRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRecap(
			JComboBox jComboBoxTiposAccionesRecap) {
		this.jComboBoxTiposAccionesRecap = jComboBoxTiposAccionesRecap;
	}
	
	public void setBorderResaltarTiposRelacionesRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRecap .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRecap .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRecap() {
	//	return jCheckBoxConGraficoDinamicoRecap;
	//}

	//public void setjCheckBoxConGraficoDinamicoRecap(
	//		JCheckBox jCheckBoxConGraficoDinamicoRecap) {
	//	this.jCheckBoxConGraficoDinamicoRecap = jCheckBoxConGraficoDinamicoRecap;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRecap() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRecap.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRecap .setBorder(borderResaltar);		
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
		this.recapSessionBean=new RecapSessionBean();
		
		this.recapSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.recapSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.recapSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RecapJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RecapJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RecapJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RecapJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RecapJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Recap MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.recapSessionBean.getEsGuardarRelacionado()) {
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
		
		RecapJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Recap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRecap= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRecap,this.jTtoolBarRecap,
							"nuevo","nuevo","Nuevo"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRecap,this.jTtoolBarRecap,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRecap,this.jTtoolBarRecap,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRecap,this.jTtoolBarRecap,
							"duplicar","duplicar","Duplicar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRecap,this.jTtoolBarRecap,
							"copiar","copiar","Copiar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRecap,this.jTtoolBarRecap,
							"ver_form","ver_form","Ver"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRecap,this.jTtoolBarRecap,
							"recargar","recargar","Recargar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRecap,this.jTtoolBarRecap,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRecap,this.jTtoolBarRecap,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRecap,this.jTtoolBarRecap,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRecap,this.jTtoolBarRecap,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRecap,this.jTtoolBarRecap,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRecap,this.jTtoolBarRecap,
							"cerrar","cerrar","Salir"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRecap=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRecap;
			
				this.jButtonProcesarInformacionToolBarRecap=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRecap;
				
		//protected JButton jButtonModificarToolBarRecap;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRecap=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRecap=new JMenuMe("General");
		this.jmenuArchivoRecap=new JMenuMe("Archivo");
		this.jmenuAccionesRecap=new JMenuMe("Acciones");
		this.jmenuDatosRecap=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRecap= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRecap.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRecap,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRecap= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRecap.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRecap,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRecap= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRecap.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRecap,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRecap= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRecap.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRecap,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRecap= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRecap.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRecap,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRecap= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRecap.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRecap,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRecap= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRecap.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRecap,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRecap= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRecap.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRecap,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRecap= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRecap.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRecap,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRecap= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRecap.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRecap,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRecap= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRecap.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRecap,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRecap= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRecap.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRecap,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRecap= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRecap.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRecap,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRecap= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRecap.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRecap,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRecap= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRecap.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRecap,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRecap= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRecap.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRecap,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRecap= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRecap.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRecap,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRecap.add(this.jMenuItemCerrarRecap);
			
			this.jmenuAccionesRecap.add(this.jMenuItemNuevoRecap);
			this.jmenuAccionesRecap.add(this.jMenuItemNuevoGuardarCambiosRecap);
			this.jmenuAccionesRecap.add(this.jMenuItemNuevoRelacionesRecap);
			this.jmenuAccionesRecap.add(this.jMenuItemGuardarCambiosTablaRecap);		
			this.jmenuAccionesRecap.add(this.jMenuItemDuplicarRecap);		
			this.jmenuAccionesRecap.add(this.jMenuItemCopiarRecap);		
			this.jmenuAccionesRecap.add(this.jMenuItemVerFormRecap);		
			
			this.jmenuDatosRecap.add(this.jMenuItemRecargarInformacionRecap);				
			this.jmenuDatosRecap.add(this.jMenuItemAnterioresRecap);				
			this.jmenuDatosRecap.add(this.jMenuItemSiguientesRecap);				
			this.jmenuDatosRecap.add(this.jMenuItemAbrirOrderByRecap);				
			this.jmenuDatosRecap.add(this.jMenuItemMostrarOcultarRecap);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRecap.add(this.jMenuItemGuardarCambiosRecap);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRecap.add(this.jmenuArchivoRecap);		
			this.jmenuBarRecap.add(this.jmenuAccionesRecap);		
			this.jmenuBarRecap.add(this.jmenuDatosRecap);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRecap);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRecap() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasRecap=new JTabbedPane();


		this.jTabbedPaneBusquedasRecap.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRecap.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRecap.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRecap.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRecap,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRecap = new RecapDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Recap DATOS");
			this.jInternalFrameDetalleFormRecap = new RecapDetalleFormJInternalFrame(jDesktopPane,this.recapSessionBean.getConGuardarRelaciones(),this.recapSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRecap = null;//new RecapDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRecap= new GridBagLayout();
		
		
		this.jTableDatosRecap = new JTableMe();      
		
		String sToolTipRecap="";
		sToolTipRecap=RecapConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRecap+="(Cartera.Recap)";
		}
		
		if(!this.recapSessionBean.getEsGuardarRelacionado()) {
			sToolTipRecap+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRecap.setToolTipText(sToolTipRecap);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRecap);
		this.jTableDatosRecap.setAutoCreateRowSorter(true);
		this.jTableDatosRecap.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRecap.setRowSelectionAllowed(true);
		this.jTableDatosRecap.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRecap,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRecap = new JButtonMe();
		this.jButtonDuplicarRecap = new JButtonMe();
		this.jButtonCopiarRecap = new JButtonMe();
		this.jButtonVerFormRecap = new JButtonMe();
		this.jButtonNuevoRelacionesRecap = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRecap = new JButtonMe();
		this.jButtonCerrarRecap = new JButtonMe();
		
		this.jScrollPanelDatosRecap = new JScrollPane();   
        this.jScrollPanelDatosGeneralRecap = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Recap";
		
		if(!this.recapSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recapes" + this.sPath));
		} else {
			this.jScrollPanelDatosRecap.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRecap.setToolTipText("Acciones");
        this.jPanelAccionesRecap.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRecap, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRecap=new ReporteDinamicoJInternalFrame(RecapConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRecap();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRecap=new ImportacionJInternalFrame(RecapConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRecap();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRecap = new JButtonMe();
		
		this.jButtonAbrirOrderByRecap.setText("Orden");
		this.jButtonAbrirOrderByRecap.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRecap,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRecap=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRecap,false,this);
			
			//this.cargarOrderByRecap(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRecap=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRecap,true,this);
			
			//this.cargarOrderByRecap(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRecap.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosRecap.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosRecap.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosRecap.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRecap.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRecap.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRecap.setText("Nuevo");
		this.jButtonDuplicarRecap.setText("Duplicar");
		this.jButtonCopiarRecap.setText("Copiar");
		this.jButtonVerFormRecap.setText("Ver");
		this.jButtonNuevoRelacionesRecap.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRecap.setText("Guardar");
		this.jButtonCerrarRecap.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRecap,"nuevo_button","Nuevo",this.recapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRecap,"duplicar_button","Duplicar",this.recapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRecap,"copiar_button","Copiar",this.recapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRecap,"ver_form","Ver",this.recapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRecap,"nuevorelaciones_button","Nuevo Rel",this.recapSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRecap,"guardarcambiostabla_button","Guardar",this.recapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRecap,"cerrar_button","Salir",this.recapSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRecap, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRecap.setToolTipText("Nuevo"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRecap.setToolTipText("Duplicar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRecap.setToolTipText("Copiar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRecap.setToolTipText("Ver"+" "+RecapConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRecap.setToolTipText("Nuevo Rel"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRecap.setToolTipText("Guardar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRecap.setToolTipText("Salir"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRecap";
		inputMap = this.jButtonNuevoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRecap"));
		
		//DUPLICAR
		sMapKey = "DuplicarRecap";
		inputMap = this.jButtonDuplicarRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRecap"));
		
		//COPIAR
		sMapKey = "CopiarRecap";
		inputMap = this.jButtonCopiarRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRecap"));
		
		//VEr FORM
		sMapKey = "VerFormRecap";
		inputMap = this.jButtonVerFormRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRecap"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRecap";
		inputMap = this.jButtonNuevoRelacionesRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRecap"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRecap";
		inputMap = this.jButtonModificarRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRecap"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRecap";
		inputMap = this.jButtonCerrarRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRecap"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRecap";
		inputMap = this.jButtonGuardarCambiosTablaRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRecap"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Recap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Recap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Recap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Recap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Recap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRecap.setName("jPanelParametrosReportesRecap"); 
		
		this.jPanelParametrosReportesAccionesRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRecap.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRecap.setName("jPanelParametrosReportesAccionesRecap"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRecap, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRecap, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRecap = new JButtonMe();
		this.jButtonRecargarInformacionRecap.setText("Recargar");
		this.jButtonRecargarInformacionRecap.setToolTipText("Recargar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRecap,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRecap = new JButtonMe();
		this.jButtonProcesarInformacionRecap.setText("Procesar");
		this.jButtonProcesarInformacionRecap.setToolTipText("Procesar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRecap.setVisible(false);
			
		this.jButtonProcesarInformacionRecap.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRecap.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRecap.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRecap = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRecap.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRecap.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRecap = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRecap.setText("TIPO");       
		this.jComboBoxTiposReportesRecap.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRecap = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRecap.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRecap.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRecap = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRecap.setText("Paginacion");
		this.jComboBoxTiposPaginacionRecap.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRecap = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRecap.setText("Accion");
		this.jComboBoxTiposRelacionesRecap.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRecap = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRecap.setText("Accion");
		this.jComboBoxTiposAccionesRecap.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRecap = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRecap.setText("Accion");
		this.jComboBoxTiposSeleccionarRecap.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRecap=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRecap.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRecap.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRecap.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRecap = new JLabelMe();
		
		this.jLabelAccionesRecap.setText("Acciones");		
		this.jLabelAccionesRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRecap = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRecap.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRecap.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRecap = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRecap.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRecap.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRecap = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRecap.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRecap.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRecap = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRecap.setText("Graf.");
		this.jCheckBoxConGraficoReporteRecap.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRecap = new JButtonMe();
		//this.jButtonAnterioresRecap.setText("<<");
        this.jButtonAnterioresRecap.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRecap,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRecap = new JButtonMe();
		//this.jButtonSiguientesRecap.setText(">>");
        this.jButtonSiguientesRecap.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRecap,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRecap = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRecap.setText("Nue");
        this.jButtonNuevoGuardarCambiosRecap.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRecap,"nuevoguardarcambios_button","Nue",this.recapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRecap";
		inputMap = this.jButtonNuevoGuardarCambiosRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRecap"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRecap";
		inputMap = this.jButtonRecargarInformacionRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRecap"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRecap";
		inputMap = this.jButtonSiguientesRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRecap"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRecap";
		inputMap = this.jButtonAnterioresRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRecap"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRecap();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRecap.setMinimumSize(new Dimension(this.getWidth(),RecapBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RecapBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRecap.setMaximumSize(new Dimension(this.getWidth(),RecapBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RecapBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRecap.setPreferredSize(new Dimension(this.getWidth(),RecapBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RecapBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRecap = new GridBagLayout();

			this.jPanelPaginacionRecap.setLayout(gridaBagLayoutPaginacionRecap);						
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy = 0;
			this.gridBagConstraintsRecap.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRecap.add(this.jButtonAnterioresRecap, this.gridBagConstraintsRecap);
					
						
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRecap.gridy = 0;
			
			this.jPanelPaginacionRecap.add(this.jButtonNuevoGuardarCambiosRecap, this.gridBagConstraintsRecap);
						
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRecap.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRecap.gridy = 0;
			this.jPanelPaginacionRecap.add(this.jButtonSiguientesRecap, this.gridBagConstraintsRecap);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy = 1;
			this.gridBagConstraintsRecap.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRecap.add(this.jButtonNuevoRecap, this.gridBagConstraintsRecap);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsRecap = new GridBagConstraints();
				this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRecap.gridy = 1;
				this.gridBagConstraintsRecap.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionRecap.add(this.jButtonNuevoRelacionesRecap, this.gridBagConstraintsRecap);
			}
			
			
			if(!this.recapSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRecap = new GridBagConstraints();
				this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRecap.gridy = 1;
				this.gridBagConstraintsRecap.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRecap.add(this.jButtonGuardarCambiosTablaRecap, this.gridBagConstraintsRecap);
			}
			
			
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy = 1;
			this.gridBagConstraintsRecap.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRecap.add(this.jButtonDuplicarRecap, this.gridBagConstraintsRecap);
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy = 1;
			this.gridBagConstraintsRecap.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRecap.add(this.jButtonCopiarRecap, this.gridBagConstraintsRecap);
		
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy = 1;
			this.gridBagConstraintsRecap.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRecap.add(this.jButtonVerFormRecap, this.gridBagConstraintsRecap);
		
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy = 1;
			this.gridBagConstraintsRecap.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRecap.add(this.jButtonCerrarRecap, this.gridBagConstraintsRecap);
		
		
		
		this.jButtonRecargarInformacionRecap.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRecap.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRecap.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRecap, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRecap.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRecap.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRecap.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRecap.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRecap.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRecap.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRecap.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRecap.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRecap.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRecap.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRecap.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRecap.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRecap.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRecap.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRecap.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRecap.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRecap.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRecap.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRecap.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRecap.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRecap.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRecap.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRecap.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRecap.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRecap.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRecap.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRecap.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRecap, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRecap.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRecap.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRecap.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRecap.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRecap.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRecap.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRecap = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRecap = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Recap = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Recap = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Recap = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Recap = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRecap.setLayout(gridaBagParametrosReportesRecap);
			this.jPanelParametrosReportesAccionesRecap.setLayout(gridaBagParametrosReportesAccionesRecap);
			
			
			this.jPanelParametrosAuxiliar1Recap.setLayout(gridaBagParametrosAuxiliar1Recap);
			this.jPanelParametrosAuxiliar2Recap.setLayout(gridaBagParametrosAuxiliar2Recap);
			this.jPanelParametrosAuxiliar3Recap.setLayout(gridaBagParametrosAuxiliar3Recap);
			this.jPanelParametrosAuxiliar4Recap.setLayout(gridaBagParametrosAuxiliar4Recap);
			//this.jPanelParametrosAuxiliar5Recap.setLayout(gridaBagParametrosAuxiliar2Recap);			
			
			
			
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRecap.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRecap.add(this.jButtonRecargarInformacionRecap, this.gridBagConstraintsRecap);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecap.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRecap.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Recap.add(this.jComboBoxTiposPaginacionRecap, this.gridBagConstraintsRecap);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecap.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRecap.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Recap.add(this.jCheckBoxConAltoMaximoTablaRecap, this.gridBagConstraintsRecap);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecap.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRecap.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Recap.add(this.jComboBoxTiposArchivosReportesRecap, this.gridBagConstraintsRecap);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecap.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRecap.add(this.jPanelParametrosAuxiliar1Recap, this.gridBagConstraintsRecap);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Recap.add(this.jComboBoxTiposReportesRecap, this.gridBagConstraintsRecap);																		
			
			
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Recap.add(this.jComboBoxTiposGraficosReportesRecap, this.gridBagConstraintsRecap);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecap.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRecap.add(this.jPanelParametrosAuxiliar4Recap, this.gridBagConstraintsRecap);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecap.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRecap.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRecap.add(this.jComboBoxTiposReportesRecap, this.gridBagConstraintsRecap);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecap.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRecap.add(this.jCheckBoxGenerarReporteRecap, this.gridBagConstraintsRecap);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecap.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRecap.add(this.jPanelParametrosAuxiliar2Recap, this.gridBagConstraintsRecap);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRecap.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRecap.add(this.jLabelAccionesRecap, this.gridBagConstraintsRecap);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRecap = new GridBagConstraints();
				this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRecap.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRecap.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRecap.add(this.jButtonAbrirOrderByRecap, this.gridBagConstraintsRecap);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecap.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRecap.add(this.jComboBoxTiposSeleccionarRecap, this.gridBagConstraintsRecap);			
			
			
			/*
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRecap.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRecap.add(this.jCheckBoxSeleccionarTodosRecap, this.gridBagConstraintsRecap);
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRecap.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRecap.add(this.jCheckBoxConGraficoReporteRecap, this.gridBagConstraintsRecap);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Recap.add(this.jCheckBoxSeleccionarTodosRecap, this.gridBagConstraintsRecap);															
				
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Recap.add(this.jCheckBoxSeleccionadosRecap, this.gridBagConstraintsRecap);															
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Recap.add(this.jCheckBoxConGraficoReporteRecap, this.gridBagConstraintsRecap);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecap.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRecap.add(this.jPanelParametrosAuxiliar3Recap, this.gridBagConstraintsRecap);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecap.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRecap.add(this.jComboBoxTiposRelacionesRecap, this.gridBagConstraintsRecap);
				
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecap.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRecap.add(this.jComboBoxTiposAccionesRecap, this.gridBagConstraintsRecap);
	
				
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecap.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRecap.add(this.jTextFieldValorCampoGeneralRecap, this.gridBagConstraintsRecap);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRecap = new GridBagLayout();

			this.jScrollPanelDatosRecap.setLayout(gridaBagLayoutDatosRecap);
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy = 0;
			this.gridBagConstraintsRecap.gridx = 0;
			
			this.jScrollPanelDatosRecap.add(this.jTableDatosRecap, this.gridBagConstraintsRecap);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRecap.setViewportView(this.jTableDatosRecap);
		this.jTableDatosRecap.setFillsViewportHeight(true);
		this.jTableDatosRecap.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRecap= new GridBagLayout();
		this.jPanelAccionesRecap.setLayout(gridaBagLayoutAccionesRecap);
		
		
		/*	
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 0;
			
		this.jPanelAccionesRecap.add(this.jButtonNuevoRecap, this.gridBagConstraintsRecap);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRecap = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRecap);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.recapSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRecap = new GridBagConstraints();						
			this.gridBagConstraintsRecap.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRecap.gridx = 0;		
			//this.gridBagConstraintsRecap.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRecap.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRecap, this.gridBagConstraintsRecap);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRecap.gridx = 0;		
		//this.gridBagConstraintsRecap.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecap.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRecap.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRecap);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRecap.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRecap, this.gridBagConstraintsRecap);								
		
		
		/*
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRecap.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRecap, this.gridBagConstraintsRecap);
		*/		
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRecap.gridx =0;
		this.gridBagConstraintsRecap.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRecap.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRecap, this.gridBagConstraintsRecap);
				
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRecap.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRecap, this.gridBagConstraintsRecap);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(RecapJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRecap = new GridBagLayout();
			this.jPanelBusquedasParametrosRecap.setLayout(gridaBagLayoutBusquedasParametrosRecap);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRecap=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRecap.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRecap.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRecap.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRecap.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRecap, this.gridBagConstraintsRecap);
			
			
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRecap.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRecap, this.gridBagConstraintsRecap);
		
			
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRecap.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRecap, this.gridBagConstraintsRecap);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRecap;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRecap() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRecap = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRecap.setName("jPanelReporteDinamicoRecap"); 
		
		this.jPanelReporteDinamicoRecap.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRecap.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRecap.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRecap.setLayout(gridaBagLayoutReporteDinamicoRecap);
		
		
		this.jInternalFrameReporteDinamicoRecap= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRecap = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRecap= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRecap.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRecap.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRecap.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRecap.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRecap.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRecap.setResizable(true);
	    this.jInternalFrameReporteDinamicoRecap.setClosable(true);
	    this.jInternalFrameReporteDinamicoRecap.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRecap.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRecap.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRecap.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recapes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRecap = new JLabelMe();

		this.jLabelColumnasSelectReporteRecap.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRecap.add(this.jLabelColumnasSelectReporteRecap, this.gridBagConstraintsRecap);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRecap = new JList<Reporte>();
		this.jListColumnasSelectReporteRecap.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRecap.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRecap.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRecap.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRecap.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRecap=new JScrollPane(this.jListColumnasSelectReporteRecap);
			
			this.jScrollColumnasSelectReporteRecap.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRecap.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRecap.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRecap.add(this.jListColumnasSelectReporteRecap, this.gridBagConstraintsRecap);
		this.jPanelReporteDinamicoRecap.add(this.jScrollColumnasSelectReporteRecap, this.gridBagConstraintsRecap);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRecap = new JLabelMe();

		this.jLabelRelacionesSelectReporteRecap.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRecap.add(this.jLabelRelacionesSelectReporteRecap, this.gridBagConstraintsRecap);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRecap = new JList<Reporte>();
		this.jListRelacionesSelectReporteRecap.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRecap.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRecap.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRecap.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRecap.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRecap=new JScrollPane(this.jListRelacionesSelectReporteRecap);
			
			this.jScrollRelacionesSelectReporteRecap.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRecap.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRecap.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRecap.add(this.jListRelacionesSelectReporteRecap, this.gridBagConstraintsRecap);
		this.jPanelReporteDinamicoRecap.add(this.jScrollRelacionesSelectReporteRecap, this.gridBagConstraintsRecap);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoRecap = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRecap = new JComboBoxMe();
		this.jListColumnasValoresGraficoRecap = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRecap = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRecap.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRecap.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRecap.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRecap.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRecap = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRecap.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRecap.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRecap.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRecap.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoRecap = new JLabelMe();

		this.jLabelConGraficoDinamicoRecap.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRecap.add(this.jLabelConGraficoDinamicoRecap, this.gridBagConstraintsRecap);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoRecap = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoRecap.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoRecap.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoRecap.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRecap.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRecap.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRecap.add(this.jCheckBoxConGraficoDinamicoRecap, this.gridBagConstraintsRecap);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoRecap = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoRecap.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRecap.add(this.jLabelColumnaCategoriaGraficoRecap, this.gridBagConstraintsRecap);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoRecap = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRecap.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoRecap.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoRecap.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRecap.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRecap.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoRecap.add(this.jComboBoxColumnaCategoriaGraficoRecap, this.gridBagConstraintsRecap);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorRecap = new JLabelMe();

		this.jLabelColumnaCategoriaValorRecap.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRecap.add(this.jLabelColumnaCategoriaValorRecap, this.gridBagConstraintsRecap);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorRecap = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorRecap.setText("Accion");
        this.jComboBoxColumnaCategoriaValorRecap.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorRecap.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRecap.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRecap.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoRecap.add(this.jComboBoxColumnaCategoriaValorRecap, this.gridBagConstraintsRecap);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoRecap = new JLabelMe();

		this.jLabelColumnasValoresGraficoRecap.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRecap.add(this.jLabelColumnasValoresGraficoRecap, this.gridBagConstraintsRecap);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoRecap = new JList<Reporte>();
		this.jListColumnasValoresGraficoRecap.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoRecap.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoRecap.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRecap.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRecap.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoRecap=new JScrollPane(this.jListColumnasValoresGraficoRecap);
			
			this.jScrollColumnasValoresGraficoRecap.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRecap.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRecap.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoRecap.add(this.jListColumnasSelectReporteRecap, this.gridBagConstraintsRecap);
		this.jPanelReporteDinamicoRecap.add(this.jScrollColumnasValoresGraficoRecap, this.gridBagConstraintsRecap);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoRecap = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoRecap.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRecap.add(this.jLabelTiposGraficosReportesDinamicoRecap, this.gridBagConstraintsRecap);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoRecap = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRecap.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoRecap.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoRecap.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRecap.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRecap.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRecap.add(this.jComboBoxTiposGraficosReportesDinamicoRecap, this.gridBagConstraintsRecap);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRecap = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRecap.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRecap.add(this.jLabelGenerarExcelReporteDinamicoRecap, this.gridBagConstraintsRecap);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRecap = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRecap.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRecap,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRecap.setToolTipText("Generar EXCEL"+" "+RecapConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRecap.add(this.jButtonGenerarExcelReporteDinamicoRecap, this.gridBagConstraintsRecap);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRecap.add(this.jComboBoxTiposReportesDinamicoRecap, this.gridBagConstraintsRecap);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRecap = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRecap.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRecap.add(this.jLabelTiposArchivoReporteDinamicoRecap, this.gridBagConstraintsRecap);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRecap.add(this.jComboBoxTiposArchivosReportesDinamicoRecap, this.gridBagConstraintsRecap);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRecap = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRecap.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRecap,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRecap.setToolTipText("Generar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRecap.add(this.jButtonGenerarReporteDinamicoRecap, this.gridBagConstraintsRecap);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRecap = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRecap.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRecap,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRecap.setToolTipText("Cancelar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecap.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRecap.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRecap.add(this.jButtonCerrarReporteDinamicoRecap, this.gridBagConstraintsRecap);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRecap = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRecap= new JScrollPane(jPanelReporteDinamicoRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRecap.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRecap.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRecap.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recapes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRecap.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRecap.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRecap.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRecap.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRecap);
		this.jInternalFrameReporteDinamicoRecap.getContentPane().add(this.jScrollPanelReporteDinamicoRecap, this.gridBagConstraintsRecap);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRecap() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRecap = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRecap.setName("jPanelImportacionRecap"); 
		
		this.jPanelImportacionRecap.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRecap.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRecap.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRecap.setLayout(gridaBagLayoutImportacionRecap);
		
		
		this.jInternalFrameImportacionRecap= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRecap= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRecap = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRecap= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRecap.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRecap.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRecap.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRecap.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRecap.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRecap.setResizable(true);
	    this.jInternalFrameImportacionRecap.setClosable(true);
	    this.jInternalFrameImportacionRecap.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRecap.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRecap.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRecap.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRecap.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRecap.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRecap.setResizable(true);
	    this.jInternalFrameImportacionRecap.setClosable(true);
	    this.jInternalFrameImportacionRecap.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRecap.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRecap.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRecap.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recapes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRecap = new JLabelMe();

		this.jLabelArchivoImportacionRecap.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYImportacion;		
		this.gridBagConstraintsRecap.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRecap.add(this.jLabelArchivoImportacionRecap, this.gridBagConstraintsRecap);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRecap = new JFileChooser();		
		this.jFileChooserImportacionRecap.setToolTipText("ESCOGER ARCHIVO"+" "+RecapConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRecap = new JButtonMe();
		this.jButtonAbrirImportacionRecap.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRecap,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRecap.setToolTipText("Generar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecap.gridy = iPosYImportacion;
		this.gridBagConstraintsRecap.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRecap.add(this.jButtonAbrirImportacionRecap, this.gridBagConstraintsRecap);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRecap = new JLabelMe();

		this.jLabelPathArchivoImportacionRecap.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = iPosYImportacion;		
		this.gridBagConstraintsRecap.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRecap.add(this.jLabelPathArchivoImportacionRecap, this.gridBagConstraintsRecap);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRecap=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRecap.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRecap.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRecap.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecap.gridy = iPosYImportacion;
		this.gridBagConstraintsRecap.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRecap.add(this.jTextFieldPathArchivoImportacionRecap, this.gridBagConstraintsRecap);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRecap = new JButtonMe();
		this.jButtonGenerarImportacionRecap.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRecap,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRecap.setToolTipText("Generar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecap.gridy = iPosYImportacion;
		this.gridBagConstraintsRecap.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRecap.add(this.jButtonGenerarImportacionRecap, this.gridBagConstraintsRecap);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRecap = new JButtonMe();
		this.jButtonCerrarImportacionRecap.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRecap,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRecap.setToolTipText("Cancelar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecap.gridy = iPosYImportacion;
		this.gridBagConstraintsRecap.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRecap.add(this.jButtonCerrarImportacionRecap, this.gridBagConstraintsRecap);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRecap = new GridBagLayout();
		
		this.jScrollPanelImportacionRecap= new JScrollPane(jPanelImportacionRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy =iPosYImportacion;
		this.gridBagConstraintsRecap.gridx =iPosXImportacion;
		this.gridBagConstraintsRecap.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRecap.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRecap.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRecap);
		this.jInternalFrameImportacionRecap.getContentPane().add(this.jScrollPanelImportacionRecap, this.gridBagConstraintsRecap);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRecap(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRecap = new JButtonMe();
			this.jButtonAbrirOrderByRecap.setText("Orden");
			this.jButtonAbrirOrderByRecap.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRecap,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRecap";
			inputMap = this.jButtonAbrirOrderByRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRecap"));
		
		
			GridBagLayout gridaBagLayoutOrderByRecap = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRecap.setName("jPanelOrderByRecap"); 
			
			this.jPanelOrderByRecap.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRecap.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRecap.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRecap.setLayout(gridaBagLayoutOrderByRecap);
			
			
			this.jTableDatosRecapOrderBy = new JTableMe();        
			this.jTableDatosRecapOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRecapOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRecapOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRecapOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRecapOrderBy.setViewportView(this.jTableDatosRecapOrderBy);
			this.jTableDatosRecapOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRecapOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRecap= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRecap= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRecap = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRecap= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRecap.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRecap.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRecap.setTitle("Orden");
			this.jInternalFrameOrderByRecap.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRecap.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRecap.setResizable(true);
			this.jInternalFrameOrderByRecap.setClosable(true);
			this.jInternalFrameOrderByRecap.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRecap.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRecap.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRecap.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recapes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRecap.gridx =iPosXOrderBy;
			this.gridBagConstraintsRecap.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRecap.ipady =150;
				
			this.jPanelOrderByRecap.add(jScrollPanelDatosRecapOrderBy, this.gridBagConstraintsRecap);//this.jTableDatosRecapTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRecap = new JButtonMe();
			this.jButtonCerrarOrderByRecap.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRecap,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRecap.setToolTipText("Cancelar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRecap.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRecap.add(this.jButtonCerrarOrderByRecap, this.gridBagConstraintsRecap);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRecap = new GridBagLayout();
			
			this.jScrollPanelOrderByRecap= new JScrollPane(jPanelOrderByRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.gridy =iPosYOrderBy;
			this.gridBagConstraintsRecap.gridx =iPosXOrderBy;
			this.gridBagConstraintsRecap.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRecap.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRecap.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRecap);
			
			this.jInternalFrameOrderByRecap.getContentPane().add(this.jScrollPanelOrderByRecap, this.gridBagConstraintsRecap);			
		
		} else {
			this.jButtonAbrirOrderByRecap = new JButtonMe();
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
		int iWidthTableCalculado=0;//3730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.recapSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRecap.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRecap.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRecap.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRecap.getRowHeight();//RecapConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.recapSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RecapConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRecap.isSelected()) {
					iHeightTable=RecapConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RecapConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RecapConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RecapConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRecap.isSelected()) {
					iHeightTable=RecapConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RecapConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RecapConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRecap.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRecap.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRecap.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRecap.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRecap.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRecap.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRecap!=null && this.jInternalFrameOrderByRecap.getjTableDatosOrderBy()!=null) {
			//if(!this.recapSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRecap.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRecap.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRecap.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRecap.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRecap.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRecap.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRecap.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRecap.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRecap.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRecap.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=recapLogic.getRecaps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=recaps.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Recap> TraerRecapBeans(List<Recap> recaps,ArrayList<Classe> classes)throws Exception {
		try {
			for(Recap recap:recaps) {
					
				if(!(RecapConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RecapConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					recap.setsDetalleGeneralEntityReporte(RecapConstantesFunciones.getRecapDescripcion(recap));
										
						
					
					

					if(recap.getDetalleRecaps()!=null && Funciones.existeClass(classes,DetalleRecap.class)) {
						try{recap.setdetallerecapsDescripcionReporte(new JRBeanCollectionDataSource(DetalleRecapJInternalFrame.TraerDetalleRecapBeans(recap.getDetalleRecaps(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//recap.setsDetalleGeneralEntityReporte(recap.getsDetalleGeneralEntityReporte());
										
				}
				
				//recapbeans.add(recapbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return recaps;
    }
	//PARA REPORTES FIN
}
