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
import com.bydan.erp.seguridad.util.ParametroSeguridadConstantesFunciones;

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
public class ParametroSeguridadJInternalFrame extends ParametroSeguridadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroSeguridad;
	
	protected JMenuBar jmenuBarParametroSeguridad;
	
	protected JMenu jmenuParametroSeguridad;
	protected JMenu jmenuDatosParametroSeguridad;
	protected JMenu jmenuArchivoParametroSeguridad;
	protected JMenu jmenuAccionesParametroSeguridad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroSeguridad;	
	protected GridBagConstraints gridBagConstraintsParametroSeguridad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroSeguridadDetalleFormJInternalFrame jInternalFrameDetalleFormParametroSeguridad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroSeguridad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroSeguridad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ParametroSeguridadSessionBean parametroseguridadSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroSeguridad> parametroseguridads;		
	public List<ParametroSeguridad> parametroseguridadsEliminados;	
	public List<ParametroSeguridad> parametroseguridadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroSeguridad;		
	protected JButton jButtonAbrirOrderByParametroSeguridad;
	
	
	//protected JPanel jPanelOrderByParametroSeguridad;
	//public JScrollPane jScrollPanelOrderByParametroSeguridad;	
	//protected JButton jButtonCerrarOrderByParametroSeguridad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroSeguridadLogic parametroseguridadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroSeguridad;
	public JScrollPane jScrollPanelDatosEdicionParametroSeguridad;
	public JScrollPane jScrollPanelDatosGeneralParametroSeguridad;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroSeguridadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroSeguridad;
	//public JScrollPane jScrollPanelImportacionParametroSeguridad;
	
	
	
	protected JPanel jPanelAccionesParametroSeguridad;
	
    protected JPanel jPanelPaginacionParametroSeguridad;
    protected JPanel jPanelParametrosReportesParametroSeguridad;
	protected JPanel jPanelParametrosReportesAccionesParametroSeguridad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroSeguridad;
	protected JPanel jPanelParametrosAuxiliar2ParametroSeguridad;
	protected JPanel jPanelParametrosAuxiliar3ParametroSeguridad;
	protected JPanel jPanelParametrosAuxiliar4ParametroSeguridad;
	//protected JPanel jPanelParametrosAuxiliar5ParametroSeguridad;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroSeguridad;
	//protected JPanel jPanelImportacionParametroSeguridad;
	
	
	public JTable jTableDatosParametroSeguridad;
	
	
	
	//public JTable jTableDatosParametroSeguridadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroSeguridad;
	protected JButton jButtonDuplicarParametroSeguridad;
	protected JButton jButtonCopiarParametroSeguridad;
	protected JButton jButtonVerFormParametroSeguridad;
	protected JButton jButtonNuevoRelacionesParametroSeguridad;
	protected JButton jButtonModificarParametroSeguridad;
	
    protected JButton jButtonGuardarCambiosTablaParametroSeguridad;
	protected JButton jButtonCerrarParametroSeguridad;
	
	
	protected JButton jButtonRecargarInformacionParametroSeguridad;
	protected JButton jButtonProcesarInformacionParametroSeguridad;
	
	
	protected JButton jButtonAnterioresParametroSeguridad;
	protected JButton jButtonSiguientesParametroSeguridad;
	protected JButton jButtonNuevoGuardarCambiosParametroSeguridad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroSeguridad;
	//protected JButton jButtonCerrarReporteDinamicoParametroSeguridad;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroSeguridad;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroSeguridad;
	//protected JButton jButtonGenerarImportacionParametroSeguridad;
	//protected JButton jButtonCerrarImportacionParametroSeguridad;
	//protected JFileChooser jFileChooserImportacionParametroSeguridad;
	//protected File fileImportacionParametroSeguridad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroSeguridad;
	protected JButton jButtonDuplicarToolBarParametroSeguridad;
	protected JButton jButtonNuevoRelacionesToolBarParametroSeguridad;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroSeguridad;
	protected JButton jButtonCopiarToolBarParametroSeguridad;
	protected JButton jButtonVerFormToolBarParametroSeguridad;
	public JButton jButtonGuardarCambiosTablaToolBarParametroSeguridad;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroSeguridad;
	protected JButton jButtonCerrarToolBarParametroSeguridad;
	
	protected JButton jButtonRecargarInformacionToolBarParametroSeguridad;
	protected JButton jButtonProcesarInformacionToolBarParametroSeguridad;
	protected JButton jButtonAnterioresToolBarParametroSeguridad;
	protected JButton jButtonSiguientesToolBarParametroSeguridad;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroSeguridad;
	protected JButton jButtonAbrirOrderByToolBarParametroSeguridad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroSeguridad;
	protected JMenuItem jMenuItemDuplicarParametroSeguridad;
	protected JMenuItem jMenuItemNuevoRelacionesParametroSeguridad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroSeguridad;
	protected JMenuItem jMenuItemCopiarParametroSeguridad;
	protected JMenuItem jMenuItemVerFormParametroSeguridad;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroSeguridad;
	protected JMenuItem jMenuItemCerrarParametroSeguridad;
	protected JMenuItem jMenuItemDetalleCerrarParametroSeguridad;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroSeguridad;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroSeguridad;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroSeguridad;
	protected JMenuItem jMenuItemProcesarInformacionParametroSeguridad;
	protected JMenuItem jMenuItemAnterioresParametroSeguridad;
	protected JMenuItem jMenuItemSiguientesParametroSeguridad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroSeguridad;
	protected JMenuItem jMenuItemAbrirOrderByParametroSeguridad;
	protected JMenuItem jMenuItemMostrarOcultarParametroSeguridad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroSeguridad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroSeguridad;
	protected JCheckBox jCheckBoxSeleccionadosParametroSeguridad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroSeguridad;
	protected JCheckBox jCheckBoxConGraficoReporteParametroSeguridad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroSeguridad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroSeguridad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroSeguridad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroSeguridad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroSeguridad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroSeguridad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroSeguridad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroSeguridad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroSeguridad;
	protected JTextField jTextFieldValorCampoGeneralParametroSeguridad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroSeguridad;
	//public JList<Reporte> jListColumnasSelectReporteParametroSeguridad;
	//public JScrollPane jScrollColumnasSelectReporteParametroSeguridad;
	
	//public JLabel jLabelRelacionesSelectReporteParametroSeguridad;
	//public JList<Reporte> jListRelacionesSelectReporteParametroSeguridad;
	//public JScrollPane jScrollRelacionesSelectReporteParametroSeguridad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroSeguridad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroSeguridad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroSeguridad;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroSeguridad;
	
		
	//public JLabel jLabelArchivoImportacionParametroSeguridad;	
	//public JLabel jLabelPathArchivoImportacionParametroSeguridad;
	//protected JTextField jTextFieldPathArchivoImportacionParametroSeguridad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroSeguridad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroSeguridad;
	
	//public JLabel jLabelColumnaCategoriaValorParametroSeguridad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroSeguridad;
	
	//public JLabel jLabelColumnasValoresGraficoParametroSeguridad;
	//public JList<Reporte> jListColumnasValoresGraficoParametroSeguridad;
	//public JScrollPane jScrollColumnasValoresGraficoParametroSeguridad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroSeguridad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroSeguridad;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroSeguridad;
	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroSeguridadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroSeguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroSeguridadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroSeguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroSeguridadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroSeguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroSeguridadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroSeguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroSeguridad)	{
		this.jButtonRecargarInformacionParametroSeguridad = jButtonRecargarInformacionParametroSeguridad;
	}
	
	public JButton getjButtonProcesarInformacionParametroSeguridad() {
		return this.jButtonProcesarInformacionParametroSeguridad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroSeguridad)	{
		this.jButtonProcesarInformacionParametroSeguridad = jButtonProcesarInformacionParametroSeguridad;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroSeguridad() {
		return this.jButtonRecargarInformacionParametroSeguridad;
	}
	
	
	public List<ParametroSeguridad> getparametroseguridads() {
		return this.parametroseguridads;
	}

	public void setparametroseguridads(List<ParametroSeguridad> parametroseguridads) {
		this.parametroseguridads = parametroseguridads;
	}
	
	public List<ParametroSeguridad> getparametroseguridadsAux() {
		return this.parametroseguridadsAux;
	}

	public void setparametroseguridadsAux(List<ParametroSeguridad> parametroseguridadsAux) {
		this.parametroseguridadsAux = parametroseguridadsAux;
	}
	
	public List<ParametroSeguridad> getparametroseguridadsEliminados() {
		return this.parametroseguridadsEliminados;
	}

	public void setParametroSeguridadsEliminados(List<ParametroSeguridad> parametroseguridadsEliminados) {
		this.parametroseguridadsEliminados = parametroseguridadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroSeguridad() {
		return jComboBoxTiposSeleccionarParametroSeguridad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroSeguridad(
			JComboBox jComboBoxTiposSeleccionarParametroSeguridad) {
		this.jComboBoxTiposSeleccionarParametroSeguridad = jComboBoxTiposSeleccionarParametroSeguridad;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroSeguridad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroSeguridad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroSeguridad() {
		return jTextFieldValorCampoGeneralParametroSeguridad;
	}

	public void setjTextFieldValorCampoGeneralParametroSeguridad(
			JTextField jTextFieldValorCampoGeneralParametroSeguridad) {
		this.jTextFieldValorCampoGeneralParametroSeguridad = jTextFieldValorCampoGeneralParametroSeguridad;
	}

	public void setBorderResaltarValorCampoGeneralParametroSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroSeguridad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroSeguridad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroSeguridad() {
		return this.jCheckBoxSeleccionarTodosParametroSeguridad;
	}

	public void setjCheckBoxSeleccionarTodosParametroSeguridad(
			JCheckBox jCheckBoxSeleccionarTodosParametroSeguridad) {
		this.jCheckBoxSeleccionarTodosParametroSeguridad = jCheckBoxSeleccionarTodosParametroSeguridad;
	}

	public void setBorderResaltarSeleccionarTodosParametroSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroSeguridad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroSeguridad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroSeguridad() {
		return this.jCheckBoxSeleccionadosParametroSeguridad;
	}

	public void setjCheckBoxSeleccionadosParametroSeguridad(
			JCheckBox jCheckBoxSeleccionadosParametroSeguridad) {
		this.jCheckBoxSeleccionadosParametroSeguridad = jCheckBoxSeleccionadosParametroSeguridad;
	}
	
	public void setBorderResaltarSeleccionadosParametroSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroSeguridad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroSeguridad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroSeguridad() {
		return this.jComboBoxTiposArchivosReportesParametroSeguridad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroSeguridad(
			JComboBox jComboBoxTiposArchivosReportesParametroSeguridad) {
		this.jComboBoxTiposArchivosReportesParametroSeguridad = jComboBoxTiposArchivosReportesParametroSeguridad;
	}

	public void setBorderResaltarTiposArchivosReportesParametroSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroSeguridad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroSeguridad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroSeguridad() {
		return this.jComboBoxTiposReportesParametroSeguridad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroSeguridad(
			JComboBox jComboBoxTiposReportesParametroSeguridad) {
		this.jComboBoxTiposReportesParametroSeguridad = jComboBoxTiposReportesParametroSeguridad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroSeguridad() {
	//	return jComboBoxTiposReportesDinamicoParametroSeguridad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroSeguridad(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroSeguridad) {
	//	this.jComboBoxTiposReportesDinamicoParametroSeguridad = jComboBoxTiposReportesDinamicoParametroSeguridad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroSeguridad() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroSeguridad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroSeguridad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroSeguridad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroSeguridad = jComboBoxTiposArchivosReportesDinamicoParametroSeguridad;
	//}
	
	public void setBorderResaltarTiposReportesParametroSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroSeguridad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroSeguridad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroSeguridad() {
		return this.jComboBoxTiposGraficosReportesParametroSeguridad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroSeguridad(
			JComboBox jComboBoxTiposGraficosReportesParametroSeguridad) {
		this.jComboBoxTiposGraficosReportesParametroSeguridad = jComboBoxTiposGraficosReportesParametroSeguridad;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroSeguridad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroSeguridad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroSeguridad() {
		return this.jComboBoxTiposPaginacionParametroSeguridad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroSeguridad(
			JComboBox jComboBoxTiposPaginacionParametroSeguridad) {
		this.jComboBoxTiposPaginacionParametroSeguridad = jComboBoxTiposPaginacionParametroSeguridad;
	}
	
	public void setBorderResaltarTiposPaginacionParametroSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroSeguridad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroSeguridad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroSeguridad() {
		return this.jComboBoxTiposRelacionesParametroSeguridad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroSeguridad() {
		return this.jComboBoxTiposAccionesParametroSeguridad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroSeguridad(
			JComboBox jComboBoxTiposRelacionesParametroSeguridad) {
		this.jComboBoxTiposRelacionesParametroSeguridad = jComboBoxTiposRelacionesParametroSeguridad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroSeguridad(
			JComboBox jComboBoxTiposAccionesParametroSeguridad) {
		this.jComboBoxTiposAccionesParametroSeguridad = jComboBoxTiposAccionesParametroSeguridad;
	}
	
	public void setBorderResaltarTiposRelacionesParametroSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroSeguridad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroSeguridad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroSeguridad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroSeguridad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroSeguridad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroSeguridad() {
	//	return jCheckBoxConGraficoDinamicoParametroSeguridad;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroSeguridad(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroSeguridad) {
	//	this.jCheckBoxConGraficoDinamicoParametroSeguridad = jCheckBoxConGraficoDinamicoParametroSeguridad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroSeguridad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroSeguridad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroSeguridad .setBorder(borderResaltar);		
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
		this.parametroseguridadSessionBean=new ParametroSeguridadSessionBean();
		
		this.parametroseguridadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroseguridadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametroseguridadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroSeguridadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroSeguridadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroSeguridadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroSeguridadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroSeguridadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Seguridad MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroSeguridadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroSeguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroSeguridad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroSeguridad,this.jTtoolBarParametroSeguridad,
							"nuevo","nuevo","Nuevo"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroSeguridad,this.jTtoolBarParametroSeguridad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroSeguridad,this.jTtoolBarParametroSeguridad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroSeguridad,this.jTtoolBarParametroSeguridad,
							"duplicar","duplicar","Duplicar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroSeguridad,this.jTtoolBarParametroSeguridad,
							"copiar","copiar","Copiar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroSeguridad,this.jTtoolBarParametroSeguridad,
							"ver_form","ver_form","Ver"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroSeguridad,this.jTtoolBarParametroSeguridad,
							"recargar","recargar","Recargar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroSeguridad,this.jTtoolBarParametroSeguridad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroSeguridad,this.jTtoolBarParametroSeguridad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroSeguridad,this.jTtoolBarParametroSeguridad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroSeguridad,this.jTtoolBarParametroSeguridad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroSeguridad,this.jTtoolBarParametroSeguridad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroSeguridad,this.jTtoolBarParametroSeguridad,
							"cerrar","cerrar","Salir"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroSeguridad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroSeguridad;
			
				this.jButtonProcesarInformacionToolBarParametroSeguridad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroSeguridad;
				
		//protected JButton jButtonModificarToolBarParametroSeguridad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroSeguridad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroSeguridad=new JMenuMe("General");
		this.jmenuArchivoParametroSeguridad=new JMenuMe("Archivo");
		this.jmenuAccionesParametroSeguridad=new JMenuMe("Acciones");
		this.jmenuDatosParametroSeguridad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroSeguridad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroSeguridad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroSeguridad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroSeguridad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroSeguridad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroSeguridad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroSeguridad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroSeguridad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroSeguridad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroSeguridad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroSeguridad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroSeguridad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroSeguridad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroSeguridad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroSeguridad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroSeguridad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroSeguridad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroSeguridad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroSeguridad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroSeguridad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroSeguridad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroSeguridad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroSeguridad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroSeguridad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroSeguridad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroSeguridad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroSeguridad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroSeguridad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroSeguridad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroSeguridad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroSeguridad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroSeguridad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroSeguridad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroSeguridad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroSeguridad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroSeguridad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroSeguridad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroSeguridad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroSeguridad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroSeguridad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroSeguridad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroSeguridad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroSeguridad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroSeguridad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroSeguridad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroSeguridad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroSeguridad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroSeguridad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroSeguridad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroSeguridad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroSeguridad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroSeguridad.add(this.jMenuItemCerrarParametroSeguridad);
			
			this.jmenuAccionesParametroSeguridad.add(this.jMenuItemNuevoParametroSeguridad);
			this.jmenuAccionesParametroSeguridad.add(this.jMenuItemNuevoGuardarCambiosParametroSeguridad);
			this.jmenuAccionesParametroSeguridad.add(this.jMenuItemNuevoRelacionesParametroSeguridad);
			this.jmenuAccionesParametroSeguridad.add(this.jMenuItemGuardarCambiosTablaParametroSeguridad);		
			this.jmenuAccionesParametroSeguridad.add(this.jMenuItemDuplicarParametroSeguridad);		
			this.jmenuAccionesParametroSeguridad.add(this.jMenuItemCopiarParametroSeguridad);		
			this.jmenuAccionesParametroSeguridad.add(this.jMenuItemVerFormParametroSeguridad);		
			
			this.jmenuDatosParametroSeguridad.add(this.jMenuItemRecargarInformacionParametroSeguridad);				
			this.jmenuDatosParametroSeguridad.add(this.jMenuItemAnterioresParametroSeguridad);				
			this.jmenuDatosParametroSeguridad.add(this.jMenuItemSiguientesParametroSeguridad);				
			this.jmenuDatosParametroSeguridad.add(this.jMenuItemAbrirOrderByParametroSeguridad);				
			this.jmenuDatosParametroSeguridad.add(this.jMenuItemMostrarOcultarParametroSeguridad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroSeguridad.add(this.jMenuItemGuardarCambiosParametroSeguridad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroSeguridad.add(this.jmenuArchivoParametroSeguridad);		
			this.jmenuBarParametroSeguridad.add(this.jmenuAccionesParametroSeguridad);		
			this.jmenuBarParametroSeguridad.add(this.jmenuDatosParametroSeguridad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroSeguridad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroSeguridad() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasParametroSeguridad=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroSeguridad.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroSeguridad.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroSeguridad.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroSeguridad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroSeguridad,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroSeguridad = new ParametroSeguridadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Seguridad DATOS");
			this.jInternalFrameDetalleFormParametroSeguridad = new ParametroSeguridadDetalleFormJInternalFrame(jDesktopPane,this.parametroseguridadSessionBean.getConGuardarRelaciones(),this.parametroseguridadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroSeguridad = null;//new ParametroSeguridadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroSeguridad= new GridBagLayout();
		
		
		this.jTableDatosParametroSeguridad = new JTableMe();      
		
		String sToolTipParametroSeguridad="";
		sToolTipParametroSeguridad=ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroSeguridad+="(Seguridad.ParametroSeguridad)";
		}
		
		if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroSeguridad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroSeguridad.setToolTipText(sToolTipParametroSeguridad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroSeguridad);
		this.jTableDatosParametroSeguridad.setAutoCreateRowSorter(true);
		this.jTableDatosParametroSeguridad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroSeguridad.setRowSelectionAllowed(true);
		this.jTableDatosParametroSeguridad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroSeguridad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroSeguridad = new JButtonMe();
		this.jButtonDuplicarParametroSeguridad = new JButtonMe();
		this.jButtonCopiarParametroSeguridad = new JButtonMe();
		this.jButtonVerFormParametroSeguridad = new JButtonMe();
		this.jButtonNuevoRelacionesParametroSeguridad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroSeguridad = new JButtonMe();
		this.jButtonCerrarParametroSeguridad = new JButtonMe();
		
		this.jScrollPanelDatosParametroSeguridad = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroSeguridad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Seguridad";
		
		if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Seguridades" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroSeguridad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroSeguridad.setToolTipText("Acciones");
        this.jPanelAccionesParametroSeguridad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroSeguridad=new ReporteDinamicoJInternalFrame(ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroSeguridad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroSeguridad=new ImportacionJInternalFrame(ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroSeguridad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroSeguridad = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroSeguridad.setText("Orden");
		this.jButtonAbrirOrderByParametroSeguridad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroSeguridad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroSeguridad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroSeguridad,false,this);
			
			//this.cargarOrderByParametroSeguridad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroSeguridad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroSeguridad,true,this);
			
			//this.cargarOrderByParametroSeguridad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroSeguridad.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosParametroSeguridad.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosParametroSeguridad.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosParametroSeguridad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroSeguridad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroSeguridad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroSeguridad.setText("Nuevo");
		this.jButtonDuplicarParametroSeguridad.setText("Duplicar");
		this.jButtonCopiarParametroSeguridad.setText("Copiar");
		this.jButtonVerFormParametroSeguridad.setText("Ver");
		this.jButtonNuevoRelacionesParametroSeguridad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroSeguridad.setText("Guardar");
		this.jButtonCerrarParametroSeguridad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroSeguridad,"nuevo_button","Nuevo",this.parametroseguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroSeguridad,"duplicar_button","Duplicar",this.parametroseguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroSeguridad,"copiar_button","Copiar",this.parametroseguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroSeguridad,"ver_form","Ver",this.parametroseguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroSeguridad,"nuevorelaciones_button","Nuevo Rel",this.parametroseguridadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroSeguridad,"guardarcambiostabla_button","Guardar",this.parametroseguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroSeguridad,"cerrar_button","Salir",this.parametroseguridadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroSeguridad.setToolTipText("Nuevo"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroSeguridad.setToolTipText("Duplicar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroSeguridad.setToolTipText("Copiar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroSeguridad.setToolTipText("Ver"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroSeguridad.setToolTipText("Nuevo Rel"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroSeguridad.setToolTipText("Guardar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroSeguridad.setToolTipText("Salir"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroSeguridad";
		inputMap = this.jButtonNuevoParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroSeguridad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroSeguridad"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroSeguridad";
		inputMap = this.jButtonDuplicarParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroSeguridad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroSeguridad"));
		
		//COPIAR
		sMapKey = "CopiarParametroSeguridad";
		inputMap = this.jButtonCopiarParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroSeguridad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroSeguridad"));
		
		//VEr FORM
		sMapKey = "VerFormParametroSeguridad";
		inputMap = this.jButtonVerFormParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroSeguridad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroSeguridad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroSeguridad";
		inputMap = this.jButtonNuevoRelacionesParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroSeguridad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroSeguridad";
		inputMap = this.jButtonModificarParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroSeguridad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroSeguridad";
		inputMap = this.jButtonCerrarParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroSeguridad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroSeguridad";
		inputMap = this.jButtonGuardarCambiosTablaParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroSeguridad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroSeguridad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroSeguridad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroSeguridad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroSeguridad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroSeguridad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroSeguridad.setName("jPanelParametrosReportesParametroSeguridad"); 
		
		this.jPanelParametrosReportesAccionesParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroSeguridad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroSeguridad.setName("jPanelParametrosReportesAccionesParametroSeguridad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroSeguridad = new JButtonMe();
		this.jButtonRecargarInformacionParametroSeguridad.setText("Recargar");
		this.jButtonRecargarInformacionParametroSeguridad.setToolTipText("Recargar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroSeguridad,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroSeguridad = new JButtonMe();
		this.jButtonProcesarInformacionParametroSeguridad.setText("Procesar");
		this.jButtonProcesarInformacionParametroSeguridad.setToolTipText("Procesar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroSeguridad.setVisible(false);
			
		this.jButtonProcesarInformacionParametroSeguridad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroSeguridad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroSeguridad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroSeguridad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroSeguridad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroSeguridad.setText("TIPO");       
		this.jComboBoxTiposReportesParametroSeguridad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroSeguridad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroSeguridad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroSeguridad.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroSeguridad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroSeguridad.setText("Accion");
		this.jComboBoxTiposRelacionesParametroSeguridad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroSeguridad.setText("Accion");
		this.jComboBoxTiposAccionesParametroSeguridad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroSeguridad.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroSeguridad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroSeguridad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroSeguridad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroSeguridad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroSeguridad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroSeguridad = new JLabelMe();
		
		this.jLabelAccionesParametroSeguridad.setText("Acciones");		
		this.jLabelAccionesParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroSeguridad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroSeguridad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroSeguridad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroSeguridad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroSeguridad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroSeguridad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroSeguridad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroSeguridad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroSeguridad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroSeguridad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroSeguridad.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroSeguridad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroSeguridad = new JButtonMe();
		//this.jButtonAnterioresParametroSeguridad.setText("<<");
        this.jButtonAnterioresParametroSeguridad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroSeguridad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroSeguridad = new JButtonMe();
		//this.jButtonSiguientesParametroSeguridad.setText(">>");
        this.jButtonSiguientesParametroSeguridad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroSeguridad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroSeguridad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroSeguridad.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroSeguridad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroSeguridad,"nuevoguardarcambios_button","Nue",this.parametroseguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroSeguridad";
		inputMap = this.jButtonNuevoGuardarCambiosParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroSeguridad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroSeguridad";
		inputMap = this.jButtonRecargarInformacionParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroSeguridad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroSeguridad";
		inputMap = this.jButtonSiguientesParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroSeguridad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroSeguridad";
		inputMap = this.jButtonAnterioresParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroSeguridad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroSeguridad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroSeguridad.setMinimumSize(new Dimension(this.getWidth(),ParametroSeguridadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroSeguridadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroSeguridad.setMaximumSize(new Dimension(this.getWidth(),ParametroSeguridadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroSeguridadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroSeguridad.setPreferredSize(new Dimension(this.getWidth(),ParametroSeguridadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroSeguridadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroSeguridad = new GridBagLayout();

			this.jPanelPaginacionParametroSeguridad.setLayout(gridaBagLayoutPaginacionParametroSeguridad);						
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroSeguridad.gridy = 0;
			this.gridBagConstraintsParametroSeguridad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroSeguridad.add(this.jButtonAnterioresParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
					
						
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroSeguridad.gridy = 0;
			
			this.jPanelPaginacionParametroSeguridad.add(this.jButtonNuevoGuardarCambiosParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
						
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroSeguridad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroSeguridad.gridy = 0;
			this.jPanelPaginacionParametroSeguridad.add(this.jButtonSiguientesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroSeguridad.gridy = 1;
			this.gridBagConstraintsParametroSeguridad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroSeguridad.add(this.jButtonNuevoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
						
			
			
			if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
				this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroSeguridad.gridy = 1;
				this.gridBagConstraintsParametroSeguridad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroSeguridad.add(this.jButtonGuardarCambiosTablaParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
			}
			
			
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroSeguridad.gridy = 1;
			this.gridBagConstraintsParametroSeguridad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroSeguridad.add(this.jButtonDuplicarParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroSeguridad.gridy = 1;
			this.gridBagConstraintsParametroSeguridad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroSeguridad.add(this.jButtonCopiarParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroSeguridad.gridy = 1;
			this.gridBagConstraintsParametroSeguridad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroSeguridad.add(this.jButtonVerFormParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroSeguridad.gridy = 1;
			this.gridBagConstraintsParametroSeguridad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroSeguridad.add(this.jButtonCerrarParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		
		
		
		this.jButtonRecargarInformacionParametroSeguridad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroSeguridad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroSeguridad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroSeguridad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroSeguridad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroSeguridad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroSeguridad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroSeguridad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroSeguridad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroSeguridad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroSeguridad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroSeguridad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroSeguridad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroSeguridad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroSeguridad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroSeguridad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroSeguridad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroSeguridad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroSeguridad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroSeguridad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroSeguridad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroSeguridad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroSeguridad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroSeguridad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroSeguridad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroSeguridad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroSeguridad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroSeguridad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroSeguridad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroSeguridad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroSeguridad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroSeguridad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroSeguridad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroSeguridad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroSeguridad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroSeguridad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroSeguridad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroSeguridad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroSeguridad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroSeguridad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroSeguridad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroSeguridad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroSeguridad.setLayout(gridaBagParametrosReportesParametroSeguridad);
			this.jPanelParametrosReportesAccionesParametroSeguridad.setLayout(gridaBagParametrosReportesAccionesParametroSeguridad);
			
			
			this.jPanelParametrosAuxiliar1ParametroSeguridad.setLayout(gridaBagParametrosAuxiliar1ParametroSeguridad);
			this.jPanelParametrosAuxiliar2ParametroSeguridad.setLayout(gridaBagParametrosAuxiliar2ParametroSeguridad);
			this.jPanelParametrosAuxiliar3ParametroSeguridad.setLayout(gridaBagParametrosAuxiliar3ParametroSeguridad);
			this.jPanelParametrosAuxiliar4ParametroSeguridad.setLayout(gridaBagParametrosAuxiliar4ParametroSeguridad);
			//this.jPanelParametrosAuxiliar5ParametroSeguridad.setLayout(gridaBagParametrosAuxiliar2ParametroSeguridad);			
			
			
			
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroSeguridad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroSeguridad.add(this.jButtonRecargarInformacionParametroSeguridad, this.gridBagConstraintsParametroSeguridad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroSeguridad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroSeguridad.add(this.jComboBoxTiposPaginacionParametroSeguridad, this.gridBagConstraintsParametroSeguridad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroSeguridad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroSeguridad.add(this.jCheckBoxConAltoMaximoTablaParametroSeguridad, this.gridBagConstraintsParametroSeguridad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroSeguridad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroSeguridad.add(this.jComboBoxTiposArchivosReportesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroSeguridad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroSeguridad.add(this.jPanelParametrosAuxiliar1ParametroSeguridad, this.gridBagConstraintsParametroSeguridad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroSeguridad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroSeguridad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroSeguridad.add(this.jComboBoxTiposReportesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroSeguridad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroSeguridad.add(this.jPanelParametrosAuxiliar4ParametroSeguridad, this.gridBagConstraintsParametroSeguridad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroSeguridad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroSeguridad.add(this.jComboBoxTiposReportesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroSeguridad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroSeguridad.add(this.jCheckBoxGenerarReporteParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroSeguridad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroSeguridad.add(this.jPanelParametrosAuxiliar2ParametroSeguridad, this.gridBagConstraintsParametroSeguridad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroSeguridad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroSeguridad.add(this.jLabelAccionesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
				this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroSeguridad.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroSeguridad.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroSeguridad.add(this.jButtonAbrirOrderByParametroSeguridad, this.gridBagConstraintsParametroSeguridad);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroSeguridad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroSeguridad.add(this.jComboBoxTiposSeleccionarParametroSeguridad, this.gridBagConstraintsParametroSeguridad);			
			
			
			/*
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroSeguridad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroSeguridad.add(this.jCheckBoxSeleccionarTodosParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroSeguridad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroSeguridad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroSeguridad.add(this.jCheckBoxSeleccionarTodosParametroSeguridad, this.gridBagConstraintsParametroSeguridad);															
				
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroSeguridad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroSeguridad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroSeguridad.add(this.jCheckBoxSeleccionadosParametroSeguridad, this.gridBagConstraintsParametroSeguridad);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroSeguridad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroSeguridad.add(this.jPanelParametrosAuxiliar3ParametroSeguridad, this.gridBagConstraintsParametroSeguridad);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroSeguridad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroSeguridad.add(this.jComboBoxTiposAccionesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroSeguridad = new GridBagLayout();

			this.jScrollPanelDatosParametroSeguridad.setLayout(gridaBagLayoutDatosParametroSeguridad);
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroSeguridad.gridy = 0;
			this.gridBagConstraintsParametroSeguridad.gridx = 0;
			
			this.jScrollPanelDatosParametroSeguridad.add(this.jTableDatosParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroSeguridad.setViewportView(this.jTableDatosParametroSeguridad);
		this.jTableDatosParametroSeguridad.setFillsViewportHeight(true);
		this.jTableDatosParametroSeguridad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroSeguridad= new GridBagLayout();
		this.jPanelAccionesParametroSeguridad.setLayout(gridaBagLayoutAccionesParametroSeguridad);
		
		
		/*	
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroSeguridad.gridy = 0;
		this.gridBagConstraintsParametroSeguridad.gridx = 0;
			
		this.jPanelAccionesParametroSeguridad.add(this.jButtonNuevoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroSeguridad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroSeguridad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();						
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroSeguridad.gridx = 0;		
			//this.gridBagConstraintsParametroSeguridad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroSeguridad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroSeguridad, this.gridBagConstraintsParametroSeguridad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroSeguridad.gridx = 0;		
		//this.gridBagConstraintsParametroSeguridad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroSeguridad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroSeguridad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroSeguridad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);								
		
		
		/*
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroSeguridad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		*/		
		
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroSeguridad.gridx =0;
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroSeguridad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
				
		
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroSeguridad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroSeguridadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroSeguridad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroSeguridad = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroSeguridad.setLayout(gridaBagLayoutBusquedasParametrosParametroSeguridad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroSeguridad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroSeguridad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroSeguridad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroSeguridad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroSeguridad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
			
			
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroSeguridad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		
			
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroSeguridad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroSeguridad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroSeguridad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroSeguridad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroSeguridad.setName("jPanelReporteDinamicoParametroSeguridad"); 
		
		this.jPanelReporteDinamicoParametroSeguridad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroSeguridad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroSeguridad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroSeguridad.setLayout(gridaBagLayoutReporteDinamicoParametroSeguridad);
		
		
		this.jInternalFrameReporteDinamicoParametroSeguridad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroSeguridad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroSeguridad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroSeguridad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroSeguridad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroSeguridad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroSeguridad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroSeguridad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroSeguridad.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroSeguridad.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroSeguridad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroSeguridad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroSeguridad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroSeguridad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Seguridades"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroSeguridad = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroSeguridad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroSeguridad.add(this.jLabelColumnasSelectReporteParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroSeguridad = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroSeguridad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroSeguridad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroSeguridad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroSeguridad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroSeguridad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroSeguridad=new JScrollPane(this.jListColumnasSelectReporteParametroSeguridad);
			
			this.jScrollColumnasSelectReporteParametroSeguridad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroSeguridad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroSeguridad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroSeguridad.add(this.jListColumnasSelectReporteParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		this.jPanelReporteDinamicoParametroSeguridad.add(this.jScrollColumnasSelectReporteParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroSeguridad = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroSeguridad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroSeguridad = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroSeguridad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroSeguridad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroSeguridad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroSeguridad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroSeguridad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroSeguridad=new JScrollPane(this.jListRelacionesSelectReporteParametroSeguridad);
			
			this.jScrollRelacionesSelectReporteParametroSeguridad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroSeguridad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroSeguridad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroSeguridad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroSeguridad = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroSeguridad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroSeguridad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroSeguridad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroSeguridad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroSeguridad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroSeguridad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroSeguridad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroSeguridad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroSeguridad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroSeguridad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroSeguridad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroSeguridad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroSeguridad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroSeguridad.add(this.jLabelGenerarExcelReporteDinamicoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroSeguridad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroSeguridad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroSeguridad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroSeguridad.setToolTipText("Generar EXCEL"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		//this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroSeguridad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroSeguridad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroSeguridad.add(this.jButtonGenerarExcelReporteDinamicoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroSeguridad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroSeguridad.add(this.jComboBoxTiposReportesDinamicoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroSeguridad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroSeguridad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroSeguridad.add(this.jLabelTiposArchivoReporteDinamicoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroSeguridad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroSeguridad.add(this.jComboBoxTiposArchivosReportesDinamicoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroSeguridad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroSeguridad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroSeguridad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroSeguridad.setToolTipText("Generar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroSeguridad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroSeguridad.add(this.jButtonGenerarReporteDinamicoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroSeguridad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroSeguridad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroSeguridad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroSeguridad.setToolTipText("Cancelar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroSeguridad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroSeguridad.add(this.jButtonCerrarReporteDinamicoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroSeguridad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroSeguridad= new JScrollPane(jPanelReporteDinamicoParametroSeguridad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroSeguridad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroSeguridad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroSeguridad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Seguridades"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroSeguridad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroSeguridad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroSeguridad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroSeguridad);
		this.jInternalFrameReporteDinamicoParametroSeguridad.getContentPane().add(this.jScrollPanelReporteDinamicoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroSeguridad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroSeguridad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroSeguridad.setName("jPanelImportacionParametroSeguridad"); 
		
		this.jPanelImportacionParametroSeguridad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroSeguridad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroSeguridad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroSeguridad.setLayout(gridaBagLayoutImportacionParametroSeguridad);
		
		
		this.jInternalFrameImportacionParametroSeguridad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroSeguridad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroSeguridad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroSeguridad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroSeguridad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroSeguridad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroSeguridad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroSeguridad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroSeguridad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroSeguridad.setResizable(true);
	    this.jInternalFrameImportacionParametroSeguridad.setClosable(true);
	    this.jInternalFrameImportacionParametroSeguridad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroSeguridad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroSeguridad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroSeguridad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroSeguridad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroSeguridad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroSeguridad.setResizable(true);
	    this.jInternalFrameImportacionParametroSeguridad.setClosable(true);
	    this.jInternalFrameImportacionParametroSeguridad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroSeguridad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroSeguridad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroSeguridad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Seguridades"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroSeguridad = new JLabelMe();

		this.jLabelArchivoImportacionParametroSeguridad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroSeguridad.add(this.jLabelArchivoImportacionParametroSeguridad, this.gridBagConstraintsParametroSeguridad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroSeguridad = new JFileChooser();		
		this.jFileChooserImportacionParametroSeguridad.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroSeguridad = new JButtonMe();
		this.jButtonAbrirImportacionParametroSeguridad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroSeguridad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroSeguridad.setToolTipText("Generar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroSeguridad.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroSeguridad.add(this.jButtonAbrirImportacionParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroSeguridad = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroSeguridad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroSeguridad.add(this.jLabelPathArchivoImportacionParametroSeguridad, this.gridBagConstraintsParametroSeguridad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroSeguridad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroSeguridad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroSeguridad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroSeguridad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroSeguridad.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroSeguridad.add(this.jTextFieldPathArchivoImportacionParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroSeguridad = new JButtonMe();
		this.jButtonGenerarImportacionParametroSeguridad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroSeguridad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroSeguridad.setToolTipText("Generar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroSeguridad.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroSeguridad.add(this.jButtonGenerarImportacionParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroSeguridad = new JButtonMe();
		this.jButtonCerrarImportacionParametroSeguridad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroSeguridad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroSeguridad.setToolTipText("Cancelar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroSeguridad.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroSeguridad.add(this.jButtonCerrarImportacionParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroSeguridad = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroSeguridad= new JScrollPane(jPanelImportacionParametroSeguridad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroSeguridad.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroSeguridad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroSeguridad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroSeguridad);
		this.jInternalFrameImportacionParametroSeguridad.getContentPane().add(this.jScrollPanelImportacionParametroSeguridad, this.gridBagConstraintsParametroSeguridad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroSeguridad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroSeguridad = new JButtonMe();
			this.jButtonAbrirOrderByParametroSeguridad.setText("Orden");
			this.jButtonAbrirOrderByParametroSeguridad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroSeguridad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroSeguridad";
			inputMap = this.jButtonAbrirOrderByParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroSeguridad"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroSeguridad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroSeguridad.setName("jPanelOrderByParametroSeguridad"); 
			
			this.jPanelOrderByParametroSeguridad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroSeguridad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroSeguridad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroSeguridad.setLayout(gridaBagLayoutOrderByParametroSeguridad);
			
			
			this.jTableDatosParametroSeguridadOrderBy = new JTableMe();        
			this.jTableDatosParametroSeguridadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroSeguridadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroSeguridadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroSeguridadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroSeguridadOrderBy.setViewportView(this.jTableDatosParametroSeguridadOrderBy);
			this.jTableDatosParametroSeguridadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroSeguridadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroSeguridad= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroSeguridad= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroSeguridad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroSeguridad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroSeguridad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroSeguridad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroSeguridad.setTitle("Orden");
			this.jInternalFrameOrderByParametroSeguridad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroSeguridad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroSeguridad.setResizable(true);
			this.jInternalFrameOrderByParametroSeguridad.setClosable(true);
			this.jInternalFrameOrderByParametroSeguridad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroSeguridad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroSeguridad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroSeguridad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Seguridades"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroSeguridad.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroSeguridad.ipady =150;
				
			this.jPanelOrderByParametroSeguridad.add(jScrollPanelDatosParametroSeguridadOrderBy, this.gridBagConstraintsParametroSeguridad);//this.jTableDatosParametroSeguridadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroSeguridad = new JButtonMe();
			this.jButtonCerrarOrderByParametroSeguridad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroSeguridad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroSeguridad.setToolTipText("Cancelar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroSeguridad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroSeguridad.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroSeguridad.add(this.jButtonCerrarOrderByParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroSeguridad = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroSeguridad= new JScrollPane(jPanelOrderByParametroSeguridad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroSeguridad.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroSeguridad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroSeguridad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroSeguridad);
			
			this.jInternalFrameOrderByParametroSeguridad.getContentPane().add(this.jScrollPanelOrderByParametroSeguridad, this.gridBagConstraintsParametroSeguridad);			
		
		} else {
			this.jButtonAbrirOrderByParametroSeguridad = new JButtonMe();
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
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametroseguridadSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroSeguridad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroSeguridad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroSeguridad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroSeguridad.getRowHeight();//ParametroSeguridadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroSeguridadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroSeguridad.isSelected()) {
					iHeightTable=ParametroSeguridadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroSeguridadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroSeguridadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroSeguridadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroSeguridad.isSelected()) {
					iHeightTable=ParametroSeguridadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroSeguridadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroSeguridadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroSeguridad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroSeguridad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroSeguridad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroSeguridad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroSeguridad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroSeguridad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroSeguridad!=null && this.jInternalFrameOrderByParametroSeguridad.getjTableDatosOrderBy()!=null) {
			//if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroSeguridad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroSeguridad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroSeguridad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroSeguridad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroSeguridad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroSeguridad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroSeguridad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroSeguridad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroSeguridad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroSeguridad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametroseguridadLogic.getParametroSeguridads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroseguridads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroSeguridad> TraerParametroSeguridadBeans(List<ParametroSeguridad> parametroseguridads,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroSeguridad parametroseguridad:parametroseguridads) {
					
				if(!(ParametroSeguridadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroSeguridadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametroseguridad.setsDetalleGeneralEntityReporte(ParametroSeguridadConstantesFunciones.getParametroSeguridadDescripcion(parametroseguridad));
										
					parametroseguridad.setcon_cartera_descripcion(ParametroSeguridadConstantesFunciones.getcon_carteraDescripcion(parametroseguridad));parametroseguridad.setcon_copiar_clientes_descripcion(ParametroSeguridadConstantesFunciones.getcon_copiar_clientesDescripcion(parametroseguridad));parametroseguridad.setcon_copiar_proveedores_descripcion(ParametroSeguridadConstantesFunciones.getcon_copiar_proveedoresDescripcion(parametroseguridad));parametroseguridad.setcon_generar_cliente_prove_descripcion(ParametroSeguridadConstantesFunciones.getcon_generar_cliente_proveDescripcion(parametroseguridad));parametroseguridad.setcliente_con_secuencial_auto_descripcion(ParametroSeguridadConstantesFunciones.getcliente_con_secuencial_autoDescripcion(parametroseguridad));parametroseguridad.setprove_con_secuencial_auto_descripcion(ParametroSeguridadConstantesFunciones.getprove_con_secuencial_autoDescripcion(parametroseguridad));parametroseguridad.setcon_validar_grupos_descripcion(ParametroSeguridadConstantesFunciones.getcon_validar_gruposDescripcion(parametroseguridad));parametroseguridad.setacti_fijo_con_secuencial_auto_descripcion(ParametroSeguridadConstantesFunciones.getacti_fijo_con_secuencial_autoDescripcion(parametroseguridad));	
					
						
					
				} else  {
							
					//parametroseguridad.setsDetalleGeneralEntityReporte(parametroseguridad.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametroseguridadbeans.add(parametroseguridadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametroseguridads;
    }
	//PARA REPORTES FIN
}
