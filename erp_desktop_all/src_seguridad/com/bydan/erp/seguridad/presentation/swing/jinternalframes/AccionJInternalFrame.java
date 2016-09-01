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
import com.bydan.erp.seguridad.util.AccionConstantesFunciones;

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
public class AccionJInternalFrame extends AccionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAccion;
	
	protected JMenuBar jmenuBarAccion;
	
	protected JMenu jmenuAccion;
	protected JMenu jmenuDatosAccion;
	protected JMenu jmenuArchivoAccion;
	protected JMenu jmenuAccionesAccion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAccion;	
	protected GridBagConstraints gridBagConstraintsAccion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AccionDetalleFormJInternalFrame jInternalFrameDetalleFormAccion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAccion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAccion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_opcion="";
	
	public AccionSessionBean accionSessionBean;
		
	
	
	public OpcionSessionBean opcionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Accion> accions;		
	public List<Accion> accionsEliminados;	
	public List<Accion> accionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAccion;		
	protected JButton jButtonAbrirOrderByAccion;
	
	
	//protected JPanel jPanelOrderByAccion;
	//public JScrollPane jScrollPanelOrderByAccion;	
	//protected JButton jButtonCerrarOrderByAccion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AccionLogic accionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAccion;
	public JScrollPane jScrollPanelDatosEdicionAccion;
	public JScrollPane jScrollPanelDatosGeneralAccion;
    
	
	
	//public JScrollPane jScrollPanelDatosAccionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAccion;
	//public JScrollPane jScrollPanelImportacionAccion;
	
	
	
	protected JPanel jPanelAccionesAccion;
	
    protected JPanel jPanelPaginacionAccion;
    protected JPanel jPanelParametrosReportesAccion;
	protected JPanel jPanelParametrosReportesAccionesAccion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Accion;
	protected JPanel jPanelParametrosAuxiliar2Accion;
	protected JPanel jPanelParametrosAuxiliar3Accion;
	protected JPanel jPanelParametrosAuxiliar4Accion;
	//protected JPanel jPanelParametrosAuxiliar5Accion;
	
	
	
	//protected JPanel jPanelReporteDinamicoAccion;
	//protected JPanel jPanelImportacionAccion;
	
	
	public JTable jTableDatosAccion;
	
	
	
	//public JTable jTableDatosAccionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAccion;
	protected JButton jButtonDuplicarAccion;
	protected JButton jButtonCopiarAccion;
	protected JButton jButtonVerFormAccion;
	protected JButton jButtonNuevoRelacionesAccion;
	protected JButton jButtonModificarAccion;
	
    protected JButton jButtonGuardarCambiosTablaAccion;
	protected JButton jButtonCerrarAccion;
	
	
	protected JButton jButtonRecargarInformacionAccion;
	protected JButton jButtonProcesarInformacionAccion;
	
	
	protected JButton jButtonAnterioresAccion;
	protected JButton jButtonSiguientesAccion;
	protected JButton jButtonNuevoGuardarCambiosAccion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAccion;
	//protected JButton jButtonCerrarReporteDinamicoAccion;
	//protected JButton jButtonGenerarExcelReporteDinamicoAccion;	
	
	
	
	//protected JButton jButtonAbrirImportacionAccion;
	//protected JButton jButtonGenerarImportacionAccion;
	//protected JButton jButtonCerrarImportacionAccion;
	//protected JFileChooser jFileChooserImportacionAccion;
	//protected File fileImportacionAccion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAccion;
	protected JButton jButtonDuplicarToolBarAccion;
	protected JButton jButtonNuevoRelacionesToolBarAccion;
	
	
	public JButton jButtonGuardarCambiosToolBarAccion;
	protected JButton jButtonCopiarToolBarAccion;
	protected JButton jButtonVerFormToolBarAccion;
	public JButton jButtonGuardarCambiosTablaToolBarAccion;
	protected JButton jButtonMostrarOcultarTablaToolBarAccion;
	protected JButton jButtonCerrarToolBarAccion;
	
	protected JButton jButtonRecargarInformacionToolBarAccion;
	protected JButton jButtonProcesarInformacionToolBarAccion;
	protected JButton jButtonAnterioresToolBarAccion;
	protected JButton jButtonSiguientesToolBarAccion;
	protected JButton jButtonNuevoGuardarCambiosToolBarAccion;
	protected JButton jButtonAbrirOrderByToolBarAccion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAccion;
	protected JMenuItem jMenuItemDuplicarAccion;
	protected JMenuItem jMenuItemNuevoRelacionesAccion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAccion;
	protected JMenuItem jMenuItemCopiarAccion;
	protected JMenuItem jMenuItemVerFormAccion;
	protected JMenuItem jMenuItemGuardarCambiosTablaAccion;
	protected JMenuItem jMenuItemCerrarAccion;
	protected JMenuItem jMenuItemDetalleCerrarAccion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAccion;
	protected JMenuItem jMenuItemDetalleMostarOcultarAccion;
	
	protected JMenuItem jMenuItemRecargarInformacionAccion;
	protected JMenuItem jMenuItemProcesarInformacionAccion;
	protected JMenuItem jMenuItemAnterioresAccion;
	protected JMenuItem jMenuItemSiguientesAccion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAccion;
	protected JMenuItem jMenuItemAbrirOrderByAccion;
	protected JMenuItem jMenuItemMostrarOcultarAccion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAccion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAccion;
	protected JCheckBox jCheckBoxSeleccionadosAccion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAccion;
	protected JCheckBox jCheckBoxConGraficoReporteAccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAccion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAccion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAccion;
	protected JTextField jTextFieldValorCampoGeneralAccion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAccion;
	//public JList<Reporte> jListColumnasSelectReporteAccion;
	//public JScrollPane jScrollColumnasSelectReporteAccion;
	
	//public JLabel jLabelRelacionesSelectReporteAccion;
	//public JList<Reporte> jListRelacionesSelectReporteAccion;
	//public JScrollPane jScrollRelacionesSelectReporteAccion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAccion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAccion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAccion;
	//public JLabel jLabelTiposArchivoReporteDinamicoAccion;
	
		
	//public JLabel jLabelArchivoImportacionAccion;	
	//public JLabel jLabelPathArchivoImportacionAccion;
	//protected JTextField jTextFieldPathArchivoImportacionAccion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAccion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAccion;
	
	//public JLabel jLabelColumnaCategoriaValorAccion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAccion;
	
	//public JLabel jLabelColumnasValoresGraficoAccion;
	//public JList<Reporte> jListColumnasValoresGraficoAccion;
	//public JScrollPane jScrollColumnasValoresGraficoAccion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAccion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAccion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAccion;
	public JPanel jPanelFK_IdOpcionAccion;
	public JButton jButtonFK_IdOpcionAccion;
	
	public JPanel jPanelid_opcionFK_IdOpcionAccion;
	public JLabel jLabelid_opcionFK_IdOpcionAccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_opcionFK_IdOpcionAccion;
	public JButton jButtonid_opcionFK_IdOpcionAccion= new JButtonMe();
	public JButton jButtonid_opcionFK_IdOpcionAccionUpdate= new JButtonMe();
	public JButton jButtonid_opcionFK_IdOpcionAccionBusqueda= new JButtonMe();
	public JButton jButtonid_opcionFK_IdOpcionAccionArbol= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AccionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Accion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AccionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Accion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AccionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Accion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AccionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Accion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAccion)	{
		this.jButtonRecargarInformacionAccion = jButtonRecargarInformacionAccion;
	}
	
	public JButton getjButtonProcesarInformacionAccion() {
		return this.jButtonProcesarInformacionAccion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAccion)	{
		this.jButtonProcesarInformacionAccion = jButtonProcesarInformacionAccion;
	}
	
	
	public JButton getjButtonRecargarInformacionAccion() {
		return this.jButtonRecargarInformacionAccion;
	}
	
	
	public List<Accion> getaccions() {
		return this.accions;
	}

	public void setaccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getaccionsAux() {
		return this.accionsAux;
	}

	public void setaccionsAux(List<Accion> accionsAux) {
		this.accionsAux = accionsAux;
	}
	
	public List<Accion> getaccionsEliminados() {
		return this.accionsEliminados;
	}

	public void setAccionsEliminados(List<Accion> accionsEliminados) {
		this.accionsEliminados = accionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAccion() {
		return jComboBoxTiposSeleccionarAccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAccion(
			JComboBox jComboBoxTiposSeleccionarAccion) {
		this.jComboBoxTiposSeleccionarAccion = jComboBoxTiposSeleccionarAccion;
	}
	
	public void setBorderResaltarTiposSeleccionarAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAccion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAccion() {
		return jTextFieldValorCampoGeneralAccion;
	}

	public void setjTextFieldValorCampoGeneralAccion(
			JTextField jTextFieldValorCampoGeneralAccion) {
		this.jTextFieldValorCampoGeneralAccion = jTextFieldValorCampoGeneralAccion;
	}

	public void setBorderResaltarValorCampoGeneralAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAccion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAccion() {
		return this.jCheckBoxSeleccionarTodosAccion;
	}

	public void setjCheckBoxSeleccionarTodosAccion(
			JCheckBox jCheckBoxSeleccionarTodosAccion) {
		this.jCheckBoxSeleccionarTodosAccion = jCheckBoxSeleccionarTodosAccion;
	}

	public void setBorderResaltarSeleccionarTodosAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAccion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAccion() {
		return this.jCheckBoxSeleccionadosAccion;
	}

	public void setjCheckBoxSeleccionadosAccion(
			JCheckBox jCheckBoxSeleccionadosAccion) {
		this.jCheckBoxSeleccionadosAccion = jCheckBoxSeleccionadosAccion;
	}
	
	public void setBorderResaltarSeleccionadosAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAccion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAccion() {
		return this.jComboBoxTiposArchivosReportesAccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAccion(
			JComboBox jComboBoxTiposArchivosReportesAccion) {
		this.jComboBoxTiposArchivosReportesAccion = jComboBoxTiposArchivosReportesAccion;
	}

	public void setBorderResaltarTiposArchivosReportesAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAccion() {
		return this.jComboBoxTiposReportesAccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAccion(
			JComboBox jComboBoxTiposReportesAccion) {
		this.jComboBoxTiposReportesAccion = jComboBoxTiposReportesAccion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAccion() {
	//	return jComboBoxTiposReportesDinamicoAccion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAccion(
	//		JComboBox jComboBoxTiposReportesDinamicoAccion) {
	//	this.jComboBoxTiposReportesDinamicoAccion = jComboBoxTiposReportesDinamicoAccion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAccion() {
	//	return jComboBoxTiposArchivosReportesDinamicoAccion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAccion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAccion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAccion = jComboBoxTiposArchivosReportesDinamicoAccion;
	//}
	
	public void setBorderResaltarTiposReportesAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAccion() {
		return this.jComboBoxTiposGraficosReportesAccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAccion(
			JComboBox jComboBoxTiposGraficosReportesAccion) {
		this.jComboBoxTiposGraficosReportesAccion = jComboBoxTiposGraficosReportesAccion;
	}
	
	public void setBorderResaltarTiposGraficosReportesAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAccion() {
		return this.jComboBoxTiposPaginacionAccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAccion(
			JComboBox jComboBoxTiposPaginacionAccion) {
		this.jComboBoxTiposPaginacionAccion = jComboBoxTiposPaginacionAccion;
	}
	
	public void setBorderResaltarTiposPaginacionAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAccion() {
		return this.jComboBoxTiposRelacionesAccion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAccion() {
		return this.jComboBoxTiposAccionesAccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAccion(
			JComboBox jComboBoxTiposRelacionesAccion) {
		this.jComboBoxTiposRelacionesAccion = jComboBoxTiposRelacionesAccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAccion(
			JComboBox jComboBoxTiposAccionesAccion) {
		this.jComboBoxTiposAccionesAccion = jComboBoxTiposAccionesAccion;
	}
	
	public void setBorderResaltarTiposRelacionesAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAccion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAccion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAccion() {
	//	return jCheckBoxConGraficoDinamicoAccion;
	//}

	//public void setjCheckBoxConGraficoDinamicoAccion(
	//		JCheckBox jCheckBoxConGraficoDinamicoAccion) {
	//	this.jCheckBoxConGraficoDinamicoAccion = jCheckBoxConGraficoDinamicoAccion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAccion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAccion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAccion .setBorder(borderResaltar);		
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
		this.accionSessionBean=new AccionSessionBean();
		
		this.accionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.accionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.accionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AccionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AccionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AccionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Accion MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.accionSessionBean.getEsGuardarRelacionado()) {
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
		
		AccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Accion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAccion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAccion,this.jTtoolBarAccion,
							"nuevo","nuevo","Nuevo"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAccion,this.jTtoolBarAccion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAccion,this.jTtoolBarAccion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAccion,this.jTtoolBarAccion,
							"duplicar","duplicar","Duplicar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAccion,this.jTtoolBarAccion,
							"copiar","copiar","Copiar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAccion,this.jTtoolBarAccion,
							"ver_form","ver_form","Ver"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAccion,this.jTtoolBarAccion,
							"recargar","recargar","Recargar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAccion,this.jTtoolBarAccion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAccion,this.jTtoolBarAccion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAccion,this.jTtoolBarAccion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAccion,this.jTtoolBarAccion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAccion,this.jTtoolBarAccion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAccion,this.jTtoolBarAccion,
							"cerrar","cerrar","Salir"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAccion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAccion;
			
				this.jButtonProcesarInformacionToolBarAccion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAccion;
				
		//protected JButton jButtonModificarToolBarAccion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAccion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAccion=new JMenuMe("General");
		this.jmenuArchivoAccion=new JMenuMe("Archivo");
		this.jmenuAccionesAccion=new JMenuMe("Acciones");
		this.jmenuDatosAccion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAccion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAccion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAccion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAccion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAccion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAccion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAccion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAccion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAccion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAccion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAccion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAccion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAccion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAccion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAccion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAccion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAccion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAccion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAccion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAccion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAccion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAccion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAccion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAccion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAccion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAccion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAccion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAccion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAccion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAccion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAccion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAccion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAccion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAccion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAccion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAccion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAccion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAccion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAccion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAccion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAccion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAccion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAccion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAccion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAccion.add(this.jMenuItemCerrarAccion);
			
			this.jmenuAccionesAccion.add(this.jMenuItemNuevoAccion);
			this.jmenuAccionesAccion.add(this.jMenuItemNuevoGuardarCambiosAccion);
			this.jmenuAccionesAccion.add(this.jMenuItemNuevoRelacionesAccion);
			this.jmenuAccionesAccion.add(this.jMenuItemGuardarCambiosTablaAccion);		
			this.jmenuAccionesAccion.add(this.jMenuItemDuplicarAccion);		
			this.jmenuAccionesAccion.add(this.jMenuItemCopiarAccion);		
			this.jmenuAccionesAccion.add(this.jMenuItemVerFormAccion);		
			
			this.jmenuDatosAccion.add(this.jMenuItemRecargarInformacionAccion);				
			this.jmenuDatosAccion.add(this.jMenuItemAnterioresAccion);				
			this.jmenuDatosAccion.add(this.jMenuItemSiguientesAccion);				
			this.jmenuDatosAccion.add(this.jMenuItemAbrirOrderByAccion);				
			this.jmenuDatosAccion.add(this.jMenuItemMostrarOcultarAccion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAccion.add(this.jMenuItemGuardarCambiosAccion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAccion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAccion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAccion.add(this.jmenuArchivoAccion);		
			this.jmenuBarAccion.add(this.jmenuAccionesAccion);		
			this.jmenuBarAccion.add(this.jmenuDatosAccion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAccion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAccion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdOpcionAccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdOpcionAccion.setToolTipText("Buscar Por Opcion ");
		this.jButtonFK_IdOpcionAccion= new JButtonMe();
		this.jButtonFK_IdOpcionAccion.setText("Buscar");
		this.jButtonFK_IdOpcionAccion.setToolTipText("Buscar Por Opcion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdOpcionAccion,"buscar_button","Buscar Por Opcion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdOpcionAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_opcionFK_IdOpcionAccion = new JLabelMe();
		jLabelid_opcionFK_IdOpcionAccion.setText("Opcion :");
		jLabelid_opcionFK_IdOpcionAccion.setToolTipText("Opcion");
		jLabelid_opcionFK_IdOpcionAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_opcionFK_IdOpcionAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_opcionFK_IdOpcionAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_opcionFK_IdOpcionAccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_opcionFK_IdOpcionAccion= new JComboBoxMe();
		jComboBoxid_opcionFK_IdOpcionAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionFK_IdOpcionAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionFK_IdOpcionAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_opcionFK_IdOpcionAccion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasAccion=new JTabbedPane();


		this.jTabbedPaneBusquedasAccion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAccion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAccion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAccion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAccion = new AccionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Accion DATOS");
			this.jInternalFrameDetalleFormAccion = new AccionDetalleFormJInternalFrame(jDesktopPane,this.accionSessionBean.getConGuardarRelaciones(),this.accionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAccion = null;//new AccionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAccion= new GridBagLayout();
		
		
		this.jTableDatosAccion = new JTableMe();      
		
		String sToolTipAccion="";
		sToolTipAccion=AccionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAccion+="(Seguridad.Accion)";
		}
		
		if(!this.accionSessionBean.getEsGuardarRelacionado()) {
			sToolTipAccion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAccion.setToolTipText(sToolTipAccion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAccion);
		this.jTableDatosAccion.setAutoCreateRowSorter(true);
		this.jTableDatosAccion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAccion.setRowSelectionAllowed(true);
		this.jTableDatosAccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAccion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAccion = new JButtonMe();
		this.jButtonDuplicarAccion = new JButtonMe();
		this.jButtonCopiarAccion = new JButtonMe();
		this.jButtonVerFormAccion = new JButtonMe();
		this.jButtonNuevoRelacionesAccion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAccion = new JButtonMe();
		this.jButtonCerrarAccion = new JButtonMe();
		
		this.jScrollPanelDatosAccion = new JScrollPane();   
        this.jScrollPanelDatosGeneralAccion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Accion";
		
		if(!this.accionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Acciones" + this.sPath));
		} else {
			this.jScrollPanelDatosAccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAccion.setToolTipText("Acciones");
        this.jPanelAccionesAccion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAccion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAccion=new ReporteDinamicoJInternalFrame(AccionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAccion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAccion=new ImportacionJInternalFrame(AccionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAccion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAccion = new JButtonMe();
		
		this.jButtonAbrirOrderByAccion.setText("Orden");
		this.jButtonAbrirOrderByAccion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAccion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAccion,false,this);
			
			//this.cargarOrderByAccion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAccion,true,this);
			
			//this.cargarOrderByAccion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAccion.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosAccion.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosAccion.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosAccion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAccion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAccion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAccion.setText("Nuevo");
		this.jButtonDuplicarAccion.setText("Duplicar");
		this.jButtonCopiarAccion.setText("Copiar");
		this.jButtonVerFormAccion.setText("Ver");
		this.jButtonNuevoRelacionesAccion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAccion.setText("Guardar");
		this.jButtonCerrarAccion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAccion,"nuevo_button","Nuevo",this.accionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAccion,"duplicar_button","Duplicar",this.accionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAccion,"copiar_button","Copiar",this.accionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAccion,"ver_form","Ver",this.accionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAccion,"nuevorelaciones_button","Nuevo Rel",this.accionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAccion,"guardarcambiostabla_button","Guardar",this.accionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAccion,"cerrar_button","Salir",this.accionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAccion.setToolTipText("Nuevo"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAccion.setToolTipText("Duplicar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAccion.setToolTipText("Copiar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAccion.setToolTipText("Ver"+" "+AccionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAccion.setToolTipText("Nuevo Rel"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAccion.setToolTipText("Guardar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAccion.setToolTipText("Salir"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAccion";
		inputMap = this.jButtonNuevoAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAccion"));
		
		//DUPLICAR
		sMapKey = "DuplicarAccion";
		inputMap = this.jButtonDuplicarAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAccion"));
		
		//COPIAR
		sMapKey = "CopiarAccion";
		inputMap = this.jButtonCopiarAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAccion"));
		
		//VEr FORM
		sMapKey = "VerFormAccion";
		inputMap = this.jButtonVerFormAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAccion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAccion";
		inputMap = this.jButtonNuevoRelacionesAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAccion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAccion";
		inputMap = this.jButtonModificarAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAccion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAccion";
		inputMap = this.jButtonCerrarAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAccion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAccion";
		inputMap = this.jButtonGuardarCambiosTablaAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAccion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Accion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Accion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Accion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Accion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Accion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAccion.setName("jPanelParametrosReportesAccion"); 
		
		this.jPanelParametrosReportesAccionesAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAccion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAccion.setName("jPanelParametrosReportesAccionesAccion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAccion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAccion = new JButtonMe();
		this.jButtonRecargarInformacionAccion.setText("Recargar");
		this.jButtonRecargarInformacionAccion.setToolTipText("Recargar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAccion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAccion = new JButtonMe();
		this.jButtonProcesarInformacionAccion.setText("Procesar");
		this.jButtonProcesarInformacionAccion.setToolTipText("Procesar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAccion.setVisible(false);
			
		this.jButtonProcesarInformacionAccion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAccion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAccion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAccion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAccion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAccion.setText("TIPO");       
		this.jComboBoxTiposReportesAccion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAccion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAccion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAccion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAccion.setText("Paginacion");
		this.jComboBoxTiposPaginacionAccion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAccion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAccion.setText("Accion");
		this.jComboBoxTiposRelacionesAccion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAccion.setText("Accion");
		this.jComboBoxTiposAccionesAccion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAccion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAccion.setText("Accion");
		this.jComboBoxTiposSeleccionarAccion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAccion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAccion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAccion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAccion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAccion = new JLabelMe();
		
		this.jLabelAccionesAccion.setText("Acciones");		
		this.jLabelAccionesAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAccion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAccion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAccion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAccion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAccion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAccion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAccion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAccion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAccion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAccion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAccion.setText("Graf.");
		this.jCheckBoxConGraficoReporteAccion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAccion = new JButtonMe();
		//this.jButtonAnterioresAccion.setText("<<");
        this.jButtonAnterioresAccion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAccion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAccion = new JButtonMe();
		//this.jButtonSiguientesAccion.setText(">>");
        this.jButtonSiguientesAccion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAccion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAccion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAccion.setText("Nue");
        this.jButtonNuevoGuardarCambiosAccion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAccion,"nuevoguardarcambios_button","Nue",this.accionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAccion";
		inputMap = this.jButtonNuevoGuardarCambiosAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAccion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAccion";
		inputMap = this.jButtonRecargarInformacionAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAccion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAccion";
		inputMap = this.jButtonSiguientesAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAccion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAccion";
		inputMap = this.jButtonAnterioresAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAccion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAccion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAccion.setMinimumSize(new Dimension(this.getWidth(),AccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AccionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAccion.setMaximumSize(new Dimension(this.getWidth(),AccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AccionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAccion.setPreferredSize(new Dimension(this.getWidth(),AccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AccionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAccion = new GridBagLayout();

			this.jPanelPaginacionAccion.setLayout(gridaBagLayoutPaginacionAccion);						
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.gridy = 0;
			this.gridBagConstraintsAccion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAccion.add(this.jButtonAnterioresAccion, this.gridBagConstraintsAccion);
					
						
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAccion.gridy = 0;
			
			this.jPanelPaginacionAccion.add(this.jButtonNuevoGuardarCambiosAccion, this.gridBagConstraintsAccion);
						
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAccion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAccion.gridy = 0;
			this.jPanelPaginacionAccion.add(this.jButtonSiguientesAccion, this.gridBagConstraintsAccion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.gridy = 1;
			this.gridBagConstraintsAccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAccion.add(this.jButtonNuevoAccion, this.gridBagConstraintsAccion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsAccion = new GridBagConstraints();
				this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAccion.gridy = 1;
				this.gridBagConstraintsAccion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionAccion.add(this.jButtonNuevoRelacionesAccion, this.gridBagConstraintsAccion);
			}
			
			
			if(!this.accionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAccion = new GridBagConstraints();
				this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAccion.gridy = 1;
				this.gridBagConstraintsAccion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAccion.add(this.jButtonGuardarCambiosTablaAccion, this.gridBagConstraintsAccion);
			}
			
			
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.gridy = 1;
			this.gridBagConstraintsAccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAccion.add(this.jButtonDuplicarAccion, this.gridBagConstraintsAccion);
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.gridy = 1;
			this.gridBagConstraintsAccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAccion.add(this.jButtonCopiarAccion, this.gridBagConstraintsAccion);
		
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.gridy = 1;
			this.gridBagConstraintsAccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAccion.add(this.jButtonVerFormAccion, this.gridBagConstraintsAccion);
		
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.gridy = 1;
			this.gridBagConstraintsAccion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAccion.add(this.jButtonCerrarAccion, this.gridBagConstraintsAccion);
		
		
		
		this.jButtonRecargarInformacionAccion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAccion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAccion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAccion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAccion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAccion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAccion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAccion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAccion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAccion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAccion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAccion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAccion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAccion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAccion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAccion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAccion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAccion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAccion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAccion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAccion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAccion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAccion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAccion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAccion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Accion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Accion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Accion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Accion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAccion.setLayout(gridaBagParametrosReportesAccion);
			this.jPanelParametrosReportesAccionesAccion.setLayout(gridaBagParametrosReportesAccionesAccion);
			
			
			this.jPanelParametrosAuxiliar1Accion.setLayout(gridaBagParametrosAuxiliar1Accion);
			this.jPanelParametrosAuxiliar2Accion.setLayout(gridaBagParametrosAuxiliar2Accion);
			this.jPanelParametrosAuxiliar3Accion.setLayout(gridaBagParametrosAuxiliar3Accion);
			this.jPanelParametrosAuxiliar4Accion.setLayout(gridaBagParametrosAuxiliar4Accion);
			//this.jPanelParametrosAuxiliar5Accion.setLayout(gridaBagParametrosAuxiliar2Accion);			
			
			
			
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAccion.add(this.jButtonRecargarInformacionAccion, this.gridBagConstraintsAccion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Accion.add(this.jComboBoxTiposPaginacionAccion, this.gridBagConstraintsAccion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Accion.add(this.jCheckBoxConAltoMaximoTablaAccion, this.gridBagConstraintsAccion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Accion.add(this.jComboBoxTiposArchivosReportesAccion, this.gridBagConstraintsAccion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAccion.add(this.jPanelParametrosAuxiliar1Accion, this.gridBagConstraintsAccion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Accion.add(this.jComboBoxTiposReportesAccion, this.gridBagConstraintsAccion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAccion.add(this.jPanelParametrosAuxiliar4Accion, this.gridBagConstraintsAccion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAccion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAccion.add(this.jComboBoxTiposReportesAccion, this.gridBagConstraintsAccion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAccion.add(this.jCheckBoxGenerarReporteAccion, this.gridBagConstraintsAccion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAccion.add(this.jPanelParametrosAuxiliar2Accion, this.gridBagConstraintsAccion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAccion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAccion.add(this.jLabelAccionesAccion, this.gridBagConstraintsAccion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAccion = new GridBagConstraints();
				this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAccion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAccion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAccion.add(this.jButtonAbrirOrderByAccion, this.gridBagConstraintsAccion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAccion.add(this.jComboBoxTiposSeleccionarAccion, this.gridBagConstraintsAccion);			
			
			
			/*
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAccion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAccion.add(this.jCheckBoxSeleccionarTodosAccion, this.gridBagConstraintsAccion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Accion.add(this.jCheckBoxSeleccionarTodosAccion, this.gridBagConstraintsAccion);															
				
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Accion.add(this.jCheckBoxSeleccionadosAccion, this.gridBagConstraintsAccion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAccion.add(this.jPanelParametrosAuxiliar3Accion, this.gridBagConstraintsAccion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAccion.add(this.jComboBoxTiposRelacionesAccion, this.gridBagConstraintsAccion);
				
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAccion.add(this.jComboBoxTiposAccionesAccion, this.gridBagConstraintsAccion);
	
				
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAccion.add(this.jTextFieldValorCampoGeneralAccion, this.gridBagConstraintsAccion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAccion = new GridBagLayout();

			this.jScrollPanelDatosAccion.setLayout(gridaBagLayoutDatosAccion);
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.gridy = 0;
			this.gridBagConstraintsAccion.gridx = 0;
			
			this.jScrollPanelDatosAccion.add(this.jTableDatosAccion, this.gridBagConstraintsAccion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAccion.setViewportView(this.jTableDatosAccion);
		this.jTableDatosAccion.setFillsViewportHeight(true);
		this.jTableDatosAccion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAccion= new GridBagLayout();
		this.jPanelAccionesAccion.setLayout(gridaBagLayoutAccionesAccion);
		
		
		/*	
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccion.gridy = 0;
		this.gridBagConstraintsAccion.gridx = 0;
			
		this.jPanelAccionesAccion.add(this.jButtonNuevoAccion, this.gridBagConstraintsAccion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdOpcionAccion= new GridBagLayout();
		gridaBagLayoutFK_IdOpcionAccion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdOpcionAccion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdOpcionAccion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdOpcionAccion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdOpcionAccion.setLayout(gridaBagLayoutFK_IdOpcionAccion);

		gridBagConstraintsAccion = new GridBagConstraints();
		gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccion.gridy = 0;
		gridBagConstraintsAccion.gridx = 0;
		jPanelFK_IdOpcionAccion.add(jLabelid_opcionFK_IdOpcionAccion, gridBagConstraintsAccion);

		gridBagConstraintsAccion = new GridBagConstraints();
		gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccion.gridy = 0;
		gridBagConstraintsAccion.gridx = 1;
		jPanelFK_IdOpcionAccion.add(jComboBoxid_opcionFK_IdOpcionAccion, gridBagConstraintsAccion);

		gridBagConstraintsAccion = new GridBagConstraints();
		gridBagConstraintsAccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccion.gridy = 1;
		gridBagConstraintsAccion.gridx =1;
		jPanelFK_IdOpcionAccion.add(jButtonFK_IdOpcionAccion, gridBagConstraintsAccion);

		jTabbedPaneBusquedasAccion.addTab("1.-Por Opcion ", jPanelFK_IdOpcionAccion);
		jTabbedPaneBusquedasAccion.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAccion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAccion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.accionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAccion = new GridBagConstraints();						
			this.gridBagConstraintsAccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAccion.gridx = 0;		
			//this.gridBagConstraintsAccion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAccion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAccion, this.gridBagConstraintsAccion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAccion.gridx = 0;		
		//this.gridBagConstraintsAccion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAccion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAccion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAccion.gridx = 0;		
			this.gridBagConstraintsAccion.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAccion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAccion, this.gridBagConstraintsAccion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAccion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAccion, this.gridBagConstraintsAccion);								
		
		
		/*
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAccion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAccion, this.gridBagConstraintsAccion);
		*/		
		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAccion.gridx =0;
		this.gridBagConstraintsAccion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAccion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAccion, this.gridBagConstraintsAccion);
				
		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAccion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAccion, this.gridBagConstraintsAccion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(AccionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAccion = new GridBagLayout();
			this.jPanelBusquedasParametrosAccion.setLayout(gridaBagLayoutBusquedasParametrosAccion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAccion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAccion, this.gridBagConstraintsAccion);
			
			
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAccion, this.gridBagConstraintsAccion);
		
			
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAccion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAccion, this.gridBagConstraintsAccion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAccion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAccion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAccion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAccion.setName("jPanelReporteDinamicoAccion"); 
		
		this.jPanelReporteDinamicoAccion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAccion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAccion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAccion.setLayout(gridaBagLayoutReporteDinamicoAccion);
		
		
		this.jInternalFrameReporteDinamicoAccion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAccion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAccion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAccion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAccion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAccion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAccion.setResizable(true);
	    this.jInternalFrameReporteDinamicoAccion.setClosable(true);
	    this.jInternalFrameReporteDinamicoAccion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAccion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAccion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAccion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Acciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAccion = new JLabelMe();

		this.jLabelColumnasSelectReporteAccion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAccion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAccion.add(this.jLabelColumnasSelectReporteAccion, this.gridBagConstraintsAccion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAccion = new JList<Reporte>();
		this.jListColumnasSelectReporteAccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAccion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAccion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAccion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAccion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAccion=new JScrollPane(this.jListColumnasSelectReporteAccion);
			
			this.jScrollColumnasSelectReporteAccion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAccion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAccion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAccion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAccion.add(this.jListColumnasSelectReporteAccion, this.gridBagConstraintsAccion);
		this.jPanelReporteDinamicoAccion.add(this.jScrollColumnasSelectReporteAccion, this.gridBagConstraintsAccion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAccion = new JLabelMe();

		this.jLabelRelacionesSelectReporteAccion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAccion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAccion.add(this.jLabelRelacionesSelectReporteAccion, this.gridBagConstraintsAccion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAccion = new JList<Reporte>();
		this.jListRelacionesSelectReporteAccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAccion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAccion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAccion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAccion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAccion=new JScrollPane(this.jListRelacionesSelectReporteAccion);
			
			this.jScrollRelacionesSelectReporteAccion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAccion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAccion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAccion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAccion.add(this.jListRelacionesSelectReporteAccion, this.gridBagConstraintsAccion);
		this.jPanelReporteDinamicoAccion.add(this.jScrollRelacionesSelectReporteAccion, this.gridBagConstraintsAccion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoAccion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAccion = new JComboBoxMe();
		this.jListColumnasValoresGraficoAccion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAccion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAccion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAccion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAccion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAccion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAccion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAccion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAccion.add(this.jLabelGenerarExcelReporteDinamicoAccion, this.gridBagConstraintsAccion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAccion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAccion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAccion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAccion.setToolTipText("Generar EXCEL"+" "+AccionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAccion = new GridBagConstraints();
		//this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAccion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAccion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAccion.add(this.jButtonGenerarExcelReporteDinamicoAccion, this.gridBagConstraintsAccion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAccion.add(this.jComboBoxTiposReportesDinamicoAccion, this.gridBagConstraintsAccion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAccion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAccion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAccion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAccion.add(this.jLabelTiposArchivoReporteDinamicoAccion, this.gridBagConstraintsAccion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAccion.add(this.jComboBoxTiposArchivosReportesDinamicoAccion, this.gridBagConstraintsAccion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAccion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAccion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAccion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAccion.setToolTipText("Generar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAccion.add(this.jButtonGenerarReporteDinamicoAccion, this.gridBagConstraintsAccion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAccion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAccion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAccion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAccion.setToolTipText("Cancelar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAccion.add(this.jButtonCerrarReporteDinamicoAccion, this.gridBagConstraintsAccion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAccion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAccion= new JScrollPane(jPanelReporteDinamicoAccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAccion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAccion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAccion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Acciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAccion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAccion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAccion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAccion);
		this.jInternalFrameReporteDinamicoAccion.getContentPane().add(this.jScrollPanelReporteDinamicoAccion, this.gridBagConstraintsAccion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAccion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAccion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAccion.setName("jPanelImportacionAccion"); 
		
		this.jPanelImportacionAccion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAccion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAccion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAccion.setLayout(gridaBagLayoutImportacionAccion);
		
		
		this.jInternalFrameImportacionAccion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAccion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAccion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAccion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAccion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAccion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAccion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAccion.setResizable(true);
	    this.jInternalFrameImportacionAccion.setClosable(true);
	    this.jInternalFrameImportacionAccion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAccion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAccion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAccion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAccion.setResizable(true);
	    this.jInternalFrameImportacionAccion.setClosable(true);
	    this.jInternalFrameImportacionAccion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAccion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAccion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAccion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Acciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAccion = new JLabelMe();

		this.jLabelArchivoImportacionAccion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccion.gridy = iPosYImportacion;		
		this.gridBagConstraintsAccion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAccion.add(this.jLabelArchivoImportacionAccion, this.gridBagConstraintsAccion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAccion = new JFileChooser();		
		this.jFileChooserImportacionAccion.setToolTipText("ESCOGER ARCHIVO"+" "+AccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAccion = new JButtonMe();
		this.jButtonAbrirImportacionAccion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAccion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAccion.setToolTipText("Generar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccion.gridy = iPosYImportacion;
		this.gridBagConstraintsAccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAccion.add(this.jButtonAbrirImportacionAccion, this.gridBagConstraintsAccion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAccion = new JLabelMe();

		this.jLabelPathArchivoImportacionAccion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccion.gridy = iPosYImportacion;		
		this.gridBagConstraintsAccion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAccion.add(this.jLabelPathArchivoImportacionAccion, this.gridBagConstraintsAccion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAccion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAccion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAccion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAccion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccion.gridy = iPosYImportacion;
		this.gridBagConstraintsAccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAccion.add(this.jTextFieldPathArchivoImportacionAccion, this.gridBagConstraintsAccion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAccion = new JButtonMe();
		this.jButtonGenerarImportacionAccion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAccion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAccion.setToolTipText("Generar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccion.gridy = iPosYImportacion;
		this.gridBagConstraintsAccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAccion.add(this.jButtonGenerarImportacionAccion, this.gridBagConstraintsAccion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAccion = new JButtonMe();
		this.jButtonCerrarImportacionAccion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAccion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAccion.setToolTipText("Cancelar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccion.gridy = iPosYImportacion;
		this.gridBagConstraintsAccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAccion.add(this.jButtonCerrarImportacionAccion, this.gridBagConstraintsAccion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAccion = new GridBagLayout();
		
		this.jScrollPanelImportacionAccion= new JScrollPane(jPanelImportacionAccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAccion = new GridBagConstraints();
		this.gridBagConstraintsAccion.gridy =iPosYImportacion;
		this.gridBagConstraintsAccion.gridx =iPosXImportacion;
		this.gridBagConstraintsAccion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAccion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAccion);
		this.jInternalFrameImportacionAccion.getContentPane().add(this.jScrollPanelImportacionAccion, this.gridBagConstraintsAccion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAccion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAccion = new JButtonMe();
			this.jButtonAbrirOrderByAccion.setText("Orden");
			this.jButtonAbrirOrderByAccion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAccion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAccion";
			inputMap = this.jButtonAbrirOrderByAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAccion"));
		
		
			GridBagLayout gridaBagLayoutOrderByAccion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAccion.setName("jPanelOrderByAccion"); 
			
			this.jPanelOrderByAccion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAccion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAccion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAccion.setLayout(gridaBagLayoutOrderByAccion);
			
			
			this.jTableDatosAccionOrderBy = new JTableMe();        
			this.jTableDatosAccionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAccionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAccionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAccionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAccionOrderBy.setViewportView(this.jTableDatosAccionOrderBy);
			this.jTableDatosAccionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAccionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAccion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAccion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAccion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAccion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAccion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAccion.setTitle("Orden");
			this.jInternalFrameOrderByAccion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAccion.setResizable(true);
			this.jInternalFrameOrderByAccion.setClosable(true);
			this.jInternalFrameOrderByAccion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAccion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAccion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAccion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Acciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAccion.gridx =iPosXOrderBy;
			this.gridBagConstraintsAccion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAccion.ipady =150;
				
			this.jPanelOrderByAccion.add(jScrollPanelDatosAccionOrderBy, this.gridBagConstraintsAccion);//this.jTableDatosAccionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAccion = new JButtonMe();
			this.jButtonCerrarOrderByAccion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAccion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAccion.setToolTipText("Cancelar"+" "+AccionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAccion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAccion.add(this.jButtonCerrarOrderByAccion, this.gridBagConstraintsAccion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAccion = new GridBagLayout();
			
			this.jScrollPanelOrderByAccion= new JScrollPane(jPanelOrderByAccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAccion = new GridBagConstraints();
			this.gridBagConstraintsAccion.gridy =iPosYOrderBy;
			this.gridBagConstraintsAccion.gridx =iPosXOrderBy;
			this.gridBagConstraintsAccion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAccion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAccion);
			
			this.jInternalFrameOrderByAccion.getContentPane().add(this.jScrollPanelOrderByAccion, this.gridBagConstraintsAccion);			
		
		} else {
			this.jButtonAbrirOrderByAccion = new JButtonMe();
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
		int iWidthTableCalculado=0;//1830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.accionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAccion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAccion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAccion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAccion.getRowHeight();//AccionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.accionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAccion.isSelected()) {
					iHeightTable=AccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAccion.isSelected()) {
					iHeightTable=AccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAccion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAccion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAccion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAccion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAccion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAccion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAccion!=null && this.jInternalFrameOrderByAccion.getjTableDatosOrderBy()!=null) {
			//if(!this.accionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAccion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAccion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAccion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAccion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAccion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAccion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAccion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAccion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAccion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAccion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=accionLogic.getAccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=accions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Accion> TraerAccionBeans(List<Accion> accions,ArrayList<Classe> classes)throws Exception {
		try {
			for(Accion accion:accions) {
					
				if(!(AccionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AccionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					accion.setsDetalleGeneralEntityReporte(AccionConstantesFunciones.getAccionDescripcion(accion));
										
					accion.setsolo_form_descripcion(AccionConstantesFunciones.getsolo_formDescripcion(accion));accion.setestado_descripcion(AccionConstantesFunciones.getestadoDescripcion(accion));	
					
					

					if(accion.getPerfils()!=null && Funciones.existeClass(classes,Perfil.class)) {
						try{accion.setperfilsDescripcionReporte(new JRBeanCollectionDataSource(PerfilJInternalFrame.TraerPerfilBeans(accion.getPerfils(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(accion.getPerfilAccions()!=null && Funciones.existeClass(classes,PerfilAccion.class)) {
						try{accion.setperfilaccionsDescripcionReporte(new JRBeanCollectionDataSource(PerfilAccionJInternalFrame.TraerPerfilAccionBeans(accion.getPerfilAccions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//accion.setsDetalleGeneralEntityReporte(accion.getsDetalleGeneralEntityReporte());
										
				}
				
				//accionbeans.add(accionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return accions;
    }
	//PARA REPORTES FIN
}
