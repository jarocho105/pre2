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
import com.bydan.erp.seguridad.util.PerfilAccionConstantesFunciones;

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
public class PerfilAccionJInternalFrame extends PerfilAccionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPerfilAccion;
	
	protected JMenuBar jmenuBarPerfilAccion;
	
	protected JMenu jmenuPerfilAccion;
	protected JMenu jmenuDatosPerfilAccion;
	protected JMenu jmenuArchivoPerfilAccion;
	protected JMenu jmenuAccionesPerfilAccion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPerfilAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPerfilAccion;	
	protected GridBagConstraints gridBagConstraintsPerfilAccion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PerfilAccionDetalleFormJInternalFrame jInternalFrameDetalleFormPerfilAccion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPerfilAccion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPerfilAccion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_perfil="";

	protected AccionBeanSwingJInternalFrame accionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_accion="";
	
	public PerfilAccionSessionBean perfilaccionSessionBean;
		
	
	
	public PerfilSessionBean perfilSessionBean;
	public AccionSessionBean accionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PerfilAccion> perfilaccions;		
	public List<PerfilAccion> perfilaccionsEliminados;	
	public List<PerfilAccion> perfilaccionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPerfilAccion;		
	protected JButton jButtonAbrirOrderByPerfilAccion;
	
	
	//protected JPanel jPanelOrderByPerfilAccion;
	//public JScrollPane jScrollPanelOrderByPerfilAccion;	
	//protected JButton jButtonCerrarOrderByPerfilAccion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PerfilAccionLogic perfilaccionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPerfilAccion;
	public JScrollPane jScrollPanelDatosEdicionPerfilAccion;
	public JScrollPane jScrollPanelDatosGeneralPerfilAccion;
    
	
	
	//public JScrollPane jScrollPanelDatosPerfilAccionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPerfilAccion;
	//public JScrollPane jScrollPanelImportacionPerfilAccion;
	
	
	
	protected JPanel jPanelAccionesPerfilAccion;
	
    protected JPanel jPanelPaginacionPerfilAccion;
    protected JPanel jPanelParametrosReportesPerfilAccion;
	protected JPanel jPanelParametrosReportesAccionesPerfilAccion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PerfilAccion;
	protected JPanel jPanelParametrosAuxiliar2PerfilAccion;
	protected JPanel jPanelParametrosAuxiliar3PerfilAccion;
	protected JPanel jPanelParametrosAuxiliar4PerfilAccion;
	//protected JPanel jPanelParametrosAuxiliar5PerfilAccion;
	
	
	
	//protected JPanel jPanelReporteDinamicoPerfilAccion;
	//protected JPanel jPanelImportacionPerfilAccion;
	
	
	public JTable jTableDatosPerfilAccion;
	
	
	
	//public JTable jTableDatosPerfilAccionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPerfilAccion;
	protected JButton jButtonDuplicarPerfilAccion;
	protected JButton jButtonCopiarPerfilAccion;
	protected JButton jButtonVerFormPerfilAccion;
	protected JButton jButtonNuevoRelacionesPerfilAccion;
	protected JButton jButtonModificarPerfilAccion;
	
    protected JButton jButtonGuardarCambiosTablaPerfilAccion;
	protected JButton jButtonCerrarPerfilAccion;
	
	
	protected JButton jButtonRecargarInformacionPerfilAccion;
	protected JButton jButtonProcesarInformacionPerfilAccion;
	
	
	protected JButton jButtonAnterioresPerfilAccion;
	protected JButton jButtonSiguientesPerfilAccion;
	protected JButton jButtonNuevoGuardarCambiosPerfilAccion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPerfilAccion;
	//protected JButton jButtonCerrarReporteDinamicoPerfilAccion;
	//protected JButton jButtonGenerarExcelReporteDinamicoPerfilAccion;	
	
	
	
	//protected JButton jButtonAbrirImportacionPerfilAccion;
	//protected JButton jButtonGenerarImportacionPerfilAccion;
	//protected JButton jButtonCerrarImportacionPerfilAccion;
	//protected JFileChooser jFileChooserImportacionPerfilAccion;
	//protected File fileImportacionPerfilAccion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPerfilAccion;
	protected JButton jButtonDuplicarToolBarPerfilAccion;
	protected JButton jButtonNuevoRelacionesToolBarPerfilAccion;
	
	
	public JButton jButtonGuardarCambiosToolBarPerfilAccion;
	protected JButton jButtonCopiarToolBarPerfilAccion;
	protected JButton jButtonVerFormToolBarPerfilAccion;
	public JButton jButtonGuardarCambiosTablaToolBarPerfilAccion;
	protected JButton jButtonMostrarOcultarTablaToolBarPerfilAccion;
	protected JButton jButtonCerrarToolBarPerfilAccion;
	
	protected JButton jButtonRecargarInformacionToolBarPerfilAccion;
	protected JButton jButtonProcesarInformacionToolBarPerfilAccion;
	protected JButton jButtonAnterioresToolBarPerfilAccion;
	protected JButton jButtonSiguientesToolBarPerfilAccion;
	protected JButton jButtonNuevoGuardarCambiosToolBarPerfilAccion;
	protected JButton jButtonAbrirOrderByToolBarPerfilAccion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPerfilAccion;
	protected JMenuItem jMenuItemDuplicarPerfilAccion;
	protected JMenuItem jMenuItemNuevoRelacionesPerfilAccion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPerfilAccion;
	protected JMenuItem jMenuItemCopiarPerfilAccion;
	protected JMenuItem jMenuItemVerFormPerfilAccion;
	protected JMenuItem jMenuItemGuardarCambiosTablaPerfilAccion;
	protected JMenuItem jMenuItemCerrarPerfilAccion;
	protected JMenuItem jMenuItemDetalleCerrarPerfilAccion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPerfilAccion;
	protected JMenuItem jMenuItemDetalleMostarOcultarPerfilAccion;
	
	protected JMenuItem jMenuItemRecargarInformacionPerfilAccion;
	protected JMenuItem jMenuItemProcesarInformacionPerfilAccion;
	protected JMenuItem jMenuItemAnterioresPerfilAccion;
	protected JMenuItem jMenuItemSiguientesPerfilAccion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPerfilAccion;
	protected JMenuItem jMenuItemAbrirOrderByPerfilAccion;
	protected JMenuItem jMenuItemMostrarOcultarPerfilAccion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPerfilAccion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPerfilAccion;
	protected JCheckBox jCheckBoxSeleccionadosPerfilAccion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPerfilAccion;
	protected JCheckBox jCheckBoxConGraficoReportePerfilAccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPerfilAccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPerfilAccion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPerfilAccion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPerfilAccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPerfilAccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPerfilAccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPerfilAccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPerfilAccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPerfilAccion;
	protected JTextField jTextFieldValorCampoGeneralPerfilAccion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePerfilAccion;
	//public JList<Reporte> jListColumnasSelectReportePerfilAccion;
	//public JScrollPane jScrollColumnasSelectReportePerfilAccion;
	
	//public JLabel jLabelRelacionesSelectReportePerfilAccion;
	//public JList<Reporte> jListRelacionesSelectReportePerfilAccion;
	//public JScrollPane jScrollRelacionesSelectReportePerfilAccion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPerfilAccion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPerfilAccion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPerfilAccion;
	//public JLabel jLabelTiposArchivoReporteDinamicoPerfilAccion;
	
		
	//public JLabel jLabelArchivoImportacionPerfilAccion;	
	//public JLabel jLabelPathArchivoImportacionPerfilAccion;
	//protected JTextField jTextFieldPathArchivoImportacionPerfilAccion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPerfilAccion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPerfilAccion;
	
	//public JLabel jLabelColumnaCategoriaValorPerfilAccion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPerfilAccion;
	
	//public JLabel jLabelColumnasValoresGraficoPerfilAccion;
	//public JList<Reporte> jListColumnasValoresGraficoPerfilAccion;
	//public JScrollPane jScrollColumnasValoresGraficoPerfilAccion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPerfilAccion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPerfilAccion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPerfilAccion;
	public JPanel jPanelFK_IdAccionPerfilAccion;
	public JButton jButtonFK_IdAccionPerfilAccion;
	public JPanel jPanelFK_IdPerfilPerfilAccion;
	public JButton jButtonFK_IdPerfilPerfilAccion;
	
	public JPanel jPanelid_accionFK_IdAccionPerfilAccion;
	public JLabel jLabelid_accionFK_IdAccionPerfilAccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_accionFK_IdAccionPerfilAccion;
	public JButton jButtonid_accionFK_IdAccionPerfilAccion= new JButtonMe();
	public JButton jButtonid_accionFK_IdAccionPerfilAccionUpdate= new JButtonMe();
	public JButton jButtonid_accionFK_IdAccionPerfilAccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_perfilFK_IdPerfilPerfilAccion;
	public JLabel jLabelid_perfilFK_IdPerfilPerfilAccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_perfilFK_IdPerfilPerfilAccion;
	public JButton jButtonid_perfilFK_IdPerfilPerfilAccion= new JButtonMe();
	public JButton jButtonid_perfilFK_IdPerfilPerfilAccionUpdate= new JButtonMe();
	public JButton jButtonid_perfilFK_IdPerfilPerfilAccionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdPerfilid_perfilPerfilAccion;
	
	
	
	
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
	public PerfilAccionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PerfilAccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilAccionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilAccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilAccionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilAccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilAccionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PerfilAccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPerfilAccion)	{
		this.jButtonRecargarInformacionPerfilAccion = jButtonRecargarInformacionPerfilAccion;
	}
	
	public JButton getjButtonProcesarInformacionPerfilAccion() {
		return this.jButtonProcesarInformacionPerfilAccion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPerfilAccion)	{
		this.jButtonProcesarInformacionPerfilAccion = jButtonProcesarInformacionPerfilAccion;
	}
	
	
	public JButton getjButtonRecargarInformacionPerfilAccion() {
		return this.jButtonRecargarInformacionPerfilAccion;
	}
	
	
	public List<PerfilAccion> getperfilaccions() {
		return this.perfilaccions;
	}

	public void setperfilaccions(List<PerfilAccion> perfilaccions) {
		this.perfilaccions = perfilaccions;
	}
	
	public List<PerfilAccion> getperfilaccionsAux() {
		return this.perfilaccionsAux;
	}

	public void setperfilaccionsAux(List<PerfilAccion> perfilaccionsAux) {
		this.perfilaccionsAux = perfilaccionsAux;
	}
	
	public List<PerfilAccion> getperfilaccionsEliminados() {
		return this.perfilaccionsEliminados;
	}

	public void setPerfilAccionsEliminados(List<PerfilAccion> perfilaccionsEliminados) {
		this.perfilaccionsEliminados = perfilaccionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPerfilAccion() {
		return jComboBoxTiposSeleccionarPerfilAccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPerfilAccion(
			JComboBox jComboBoxTiposSeleccionarPerfilAccion) {
		this.jComboBoxTiposSeleccionarPerfilAccion = jComboBoxTiposSeleccionarPerfilAccion;
	}
	
	public void setBorderResaltarTiposSeleccionarPerfilAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPerfilAccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPerfilAccion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPerfilAccion() {
		return jTextFieldValorCampoGeneralPerfilAccion;
	}

	public void setjTextFieldValorCampoGeneralPerfilAccion(
			JTextField jTextFieldValorCampoGeneralPerfilAccion) {
		this.jTextFieldValorCampoGeneralPerfilAccion = jTextFieldValorCampoGeneralPerfilAccion;
	}

	public void setBorderResaltarValorCampoGeneralPerfilAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilAccion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPerfilAccion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPerfilAccion() {
		return this.jCheckBoxSeleccionarTodosPerfilAccion;
	}

	public void setjCheckBoxSeleccionarTodosPerfilAccion(
			JCheckBox jCheckBoxSeleccionarTodosPerfilAccion) {
		this.jCheckBoxSeleccionarTodosPerfilAccion = jCheckBoxSeleccionarTodosPerfilAccion;
	}

	public void setBorderResaltarSeleccionarTodosPerfilAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilAccion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPerfilAccion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPerfilAccion() {
		return this.jCheckBoxSeleccionadosPerfilAccion;
	}

	public void setjCheckBoxSeleccionadosPerfilAccion(
			JCheckBox jCheckBoxSeleccionadosPerfilAccion) {
		this.jCheckBoxSeleccionadosPerfilAccion = jCheckBoxSeleccionadosPerfilAccion;
	}
	
	public void setBorderResaltarSeleccionadosPerfilAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilAccion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPerfilAccion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPerfilAccion() {
		return this.jComboBoxTiposArchivosReportesPerfilAccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPerfilAccion(
			JComboBox jComboBoxTiposArchivosReportesPerfilAccion) {
		this.jComboBoxTiposArchivosReportesPerfilAccion = jComboBoxTiposArchivosReportesPerfilAccion;
	}

	public void setBorderResaltarTiposArchivosReportesPerfilAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilAccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPerfilAccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPerfilAccion() {
		return this.jComboBoxTiposReportesPerfilAccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPerfilAccion(
			JComboBox jComboBoxTiposReportesPerfilAccion) {
		this.jComboBoxTiposReportesPerfilAccion = jComboBoxTiposReportesPerfilAccion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPerfilAccion() {
	//	return jComboBoxTiposReportesDinamicoPerfilAccion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPerfilAccion(
	//		JComboBox jComboBoxTiposReportesDinamicoPerfilAccion) {
	//	this.jComboBoxTiposReportesDinamicoPerfilAccion = jComboBoxTiposReportesDinamicoPerfilAccion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPerfilAccion() {
	//	return jComboBoxTiposArchivosReportesDinamicoPerfilAccion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPerfilAccion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPerfilAccion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPerfilAccion = jComboBoxTiposArchivosReportesDinamicoPerfilAccion;
	//}
	
	public void setBorderResaltarTiposReportesPerfilAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilAccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPerfilAccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPerfilAccion() {
		return this.jComboBoxTiposGraficosReportesPerfilAccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPerfilAccion(
			JComboBox jComboBoxTiposGraficosReportesPerfilAccion) {
		this.jComboBoxTiposGraficosReportesPerfilAccion = jComboBoxTiposGraficosReportesPerfilAccion;
	}
	
	public void setBorderResaltarTiposGraficosReportesPerfilAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilAccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPerfilAccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPerfilAccion() {
		return this.jComboBoxTiposPaginacionPerfilAccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPerfilAccion(
			JComboBox jComboBoxTiposPaginacionPerfilAccion) {
		this.jComboBoxTiposPaginacionPerfilAccion = jComboBoxTiposPaginacionPerfilAccion;
	}
	
	public void setBorderResaltarTiposPaginacionPerfilAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilAccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPerfilAccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPerfilAccion() {
		return this.jComboBoxTiposRelacionesPerfilAccion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPerfilAccion() {
		return this.jComboBoxTiposAccionesPerfilAccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPerfilAccion(
			JComboBox jComboBoxTiposRelacionesPerfilAccion) {
		this.jComboBoxTiposRelacionesPerfilAccion = jComboBoxTiposRelacionesPerfilAccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPerfilAccion(
			JComboBox jComboBoxTiposAccionesPerfilAccion) {
		this.jComboBoxTiposAccionesPerfilAccion = jComboBoxTiposAccionesPerfilAccion;
	}
	
	public void setBorderResaltarTiposRelacionesPerfilAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilAccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPerfilAccion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPerfilAccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilAccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPerfilAccion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPerfilAccion() {
	//	return jCheckBoxConGraficoDinamicoPerfilAccion;
	//}

	//public void setjCheckBoxConGraficoDinamicoPerfilAccion(
	//		JCheckBox jCheckBoxConGraficoDinamicoPerfilAccion) {
	//	this.jCheckBoxConGraficoDinamicoPerfilAccion = jCheckBoxConGraficoDinamicoPerfilAccion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPerfilAccion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPerfilAccion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPerfilAccion .setBorder(borderResaltar);		
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
		this.perfilaccionSessionBean=new PerfilAccionSessionBean();
		
		this.perfilaccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfilaccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.perfilaccionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PerfilAccionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PerfilAccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PerfilAccionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PerfilAccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PerfilAccionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Perfil Accion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
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
		
		PerfilAccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PerfilAccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPerfilAccion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPerfilAccion,this.jTtoolBarPerfilAccion,
							"nuevo","nuevo","Nuevo"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPerfilAccion,this.jTtoolBarPerfilAccion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPerfilAccion,this.jTtoolBarPerfilAccion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPerfilAccion,this.jTtoolBarPerfilAccion,
							"duplicar","duplicar","Duplicar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPerfilAccion,this.jTtoolBarPerfilAccion,
							"copiar","copiar","Copiar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPerfilAccion,this.jTtoolBarPerfilAccion,
							"ver_form","ver_form","Ver"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPerfilAccion,this.jTtoolBarPerfilAccion,
							"recargar","recargar","Recargar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPerfilAccion,this.jTtoolBarPerfilAccion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPerfilAccion,this.jTtoolBarPerfilAccion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPerfilAccion,this.jTtoolBarPerfilAccion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPerfilAccion,this.jTtoolBarPerfilAccion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPerfilAccion,this.jTtoolBarPerfilAccion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPerfilAccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPerfilAccion,this.jTtoolBarPerfilAccion,
							"cerrar","cerrar","Salir"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPerfilAccion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPerfilAccion;
			
				this.jButtonProcesarInformacionToolBarPerfilAccion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPerfilAccion;
				
		//protected JButton jButtonModificarToolBarPerfilAccion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPerfilAccion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPerfilAccion=new JMenuMe("General");
		this.jmenuArchivoPerfilAccion=new JMenuMe("Archivo");
		this.jmenuAccionesPerfilAccion=new JMenuMe("Acciones");
		this.jmenuDatosPerfilAccion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPerfilAccion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPerfilAccion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPerfilAccion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPerfilAccion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPerfilAccion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPerfilAccion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPerfilAccion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPerfilAccion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPerfilAccion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPerfilAccion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPerfilAccion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPerfilAccion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPerfilAccion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPerfilAccion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPerfilAccion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPerfilAccion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPerfilAccion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPerfilAccion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPerfilAccion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPerfilAccion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPerfilAccion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPerfilAccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPerfilAccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPerfilAccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPerfilAccion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPerfilAccion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPerfilAccion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPerfilAccion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPerfilAccion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPerfilAccion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPerfilAccion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPerfilAccion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPerfilAccion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPerfilAccion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPerfilAccion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPerfilAccion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPerfilAccion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPerfilAccion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPerfilAccion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPerfilAccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPerfilAccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPerfilAccion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPerfilAccion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPerfilAccion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPerfilAccion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPerfilAccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPerfilAccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPerfilAccion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPerfilAccion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPerfilAccion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPerfilAccion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPerfilAccion.add(this.jMenuItemCerrarPerfilAccion);
			
			this.jmenuAccionesPerfilAccion.add(this.jMenuItemNuevoPerfilAccion);
			this.jmenuAccionesPerfilAccion.add(this.jMenuItemNuevoGuardarCambiosPerfilAccion);
			this.jmenuAccionesPerfilAccion.add(this.jMenuItemNuevoRelacionesPerfilAccion);
			this.jmenuAccionesPerfilAccion.add(this.jMenuItemGuardarCambiosTablaPerfilAccion);		
			this.jmenuAccionesPerfilAccion.add(this.jMenuItemDuplicarPerfilAccion);		
			this.jmenuAccionesPerfilAccion.add(this.jMenuItemCopiarPerfilAccion);		
			this.jmenuAccionesPerfilAccion.add(this.jMenuItemVerFormPerfilAccion);		
			
			this.jmenuDatosPerfilAccion.add(this.jMenuItemRecargarInformacionPerfilAccion);				
			this.jmenuDatosPerfilAccion.add(this.jMenuItemAnterioresPerfilAccion);				
			this.jmenuDatosPerfilAccion.add(this.jMenuItemSiguientesPerfilAccion);				
			this.jmenuDatosPerfilAccion.add(this.jMenuItemAbrirOrderByPerfilAccion);				
			this.jmenuDatosPerfilAccion.add(this.jMenuItemMostrarOcultarPerfilAccion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPerfilAccion.add(this.jMenuItemGuardarCambiosPerfilAccion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPerfilAccion.add(this.jmenuArchivoPerfilAccion);		
			this.jmenuBarPerfilAccion.add(this.jmenuAccionesPerfilAccion);		
			this.jmenuBarPerfilAccion.add(this.jmenuDatosPerfilAccion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPerfilAccion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPerfilAccion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAccionPerfilAccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAccionPerfilAccion.setToolTipText("Buscar Por Accion ");
		this.jButtonFK_IdAccionPerfilAccion= new JButtonMe();
		this.jButtonFK_IdAccionPerfilAccion.setText("Buscar");
		this.jButtonFK_IdAccionPerfilAccion.setToolTipText("Buscar Por Accion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAccionPerfilAccion,"buscar_button","Buscar Por Accion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAccionPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_accionFK_IdAccionPerfilAccion = new JLabelMe();
		jLabelid_accionFK_IdAccionPerfilAccion.setText("Accion :");
		jLabelid_accionFK_IdAccionPerfilAccion.setToolTipText("Accion");
		jLabelid_accionFK_IdAccionPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_accionFK_IdAccionPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_accionFK_IdAccionPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_accionFK_IdAccionPerfilAccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_accionFK_IdAccionPerfilAccion= new JComboBoxMe();
		jComboBoxid_accionFK_IdAccionPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_accionFK_IdAccionPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_accionFK_IdAccionPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_accionFK_IdAccionPerfilAccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPerfilPerfilAccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPerfilPerfilAccion.setToolTipText("Buscar Por Perfil ");
		this.jButtonFK_IdPerfilPerfilAccion= new JButtonMe();
		this.jButtonFK_IdPerfilPerfilAccion.setText("Buscar");
		this.jButtonFK_IdPerfilPerfilAccion.setToolTipText("Buscar Por Perfil ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPerfilPerfilAccion,"buscar_button","Buscar Por Perfil ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPerfilPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_perfilFK_IdPerfilPerfilAccion = new JLabelMe();
		jLabelid_perfilFK_IdPerfilPerfilAccion.setText("Perfil :");
		jLabelid_perfilFK_IdPerfilPerfilAccion.setToolTipText("Perfil");
		jLabelid_perfilFK_IdPerfilPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_perfilFK_IdPerfilPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_perfilFK_IdPerfilPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_perfilFK_IdPerfilPerfilAccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_perfilFK_IdPerfilPerfilAccion= new JComboBoxMe();
		jComboBoxid_perfilFK_IdPerfilPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilFK_IdPerfilPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilFK_IdPerfilPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_perfilFK_IdPerfilPerfilAccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdPerfilid_perfilPerfilAccion= new JButtonMe();
		this.jButtonBuscarFK_IdPerfilid_perfilPerfilAccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdPerfilid_perfilPerfilAccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdPerfilid_perfilPerfilAccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdPerfilid_perfilPerfilAccion.setText("Buscar");
		this.jButtonBuscarFK_IdPerfilid_perfilPerfilAccion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdPerfilid_perfilPerfilAccion.setFocusable(false);


		this.jTabbedPaneBusquedasPerfilAccion=new JTabbedPane();


		this.jTabbedPaneBusquedasPerfilAccion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPerfilAccion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPerfilAccion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPerfilAccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPerfilAccion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePerfilAccion = new PerfilAccionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Perfil Accion DATOS");
			this.jInternalFrameDetalleFormPerfilAccion = new PerfilAccionDetalleFormJInternalFrame(jDesktopPane,this.perfilaccionSessionBean.getConGuardarRelaciones(),this.perfilaccionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPerfilAccion = null;//new PerfilAccionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPerfilAccion= new GridBagLayout();
		
		
		this.jTableDatosPerfilAccion = new JTableMe();      
		
		String sToolTipPerfilAccion="";
		sToolTipPerfilAccion=PerfilAccionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPerfilAccion+="(Seguridad.PerfilAccion)";
		}
		
		if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
			sToolTipPerfilAccion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPerfilAccion.setToolTipText(sToolTipPerfilAccion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPerfilAccion);
		this.jTableDatosPerfilAccion.setAutoCreateRowSorter(true);
		this.jTableDatosPerfilAccion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPerfilAccion.setRowSelectionAllowed(true);
		this.jTableDatosPerfilAccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPerfilAccion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPerfilAccion = new JButtonMe();
		this.jButtonDuplicarPerfilAccion = new JButtonMe();
		this.jButtonCopiarPerfilAccion = new JButtonMe();
		this.jButtonVerFormPerfilAccion = new JButtonMe();
		this.jButtonNuevoRelacionesPerfilAccion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPerfilAccion = new JButtonMe();
		this.jButtonCerrarPerfilAccion = new JButtonMe();
		
		this.jScrollPanelDatosPerfilAccion = new JScrollPane();   
        this.jScrollPanelDatosGeneralPerfilAccion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPerfilAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Perfil Accion";
		
		if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Acciones" + this.sPath));
		} else {
			this.jScrollPanelDatosPerfilAccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPerfilAccion.setToolTipText("Acciones");
        this.jPanelAccionesPerfilAccion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPerfilAccion=new ReporteDinamicoJInternalFrame(PerfilAccionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPerfilAccion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPerfilAccion=new ImportacionJInternalFrame(PerfilAccionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPerfilAccion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPerfilAccion = new JButtonMe();
		
		this.jButtonAbrirOrderByPerfilAccion.setText("Orden");
		this.jButtonAbrirOrderByPerfilAccion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPerfilAccion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPerfilAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPerfilAccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfilAccion,false,this);
			
			//this.cargarOrderByPerfilAccion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPerfilAccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfilAccion,true,this);
			
			//this.cargarOrderByPerfilAccion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPerfilAccion.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosPerfilAccion.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosPerfilAccion.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosPerfilAccion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPerfilAccion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPerfilAccion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPerfilAccion.setText("Nuevo");
		this.jButtonDuplicarPerfilAccion.setText("Duplicar");
		this.jButtonCopiarPerfilAccion.setText("Copiar");
		this.jButtonVerFormPerfilAccion.setText("Ver");
		this.jButtonNuevoRelacionesPerfilAccion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPerfilAccion.setText("Guardar");
		this.jButtonCerrarPerfilAccion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPerfilAccion,"nuevo_button","Nuevo",this.perfilaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPerfilAccion,"duplicar_button","Duplicar",this.perfilaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPerfilAccion,"copiar_button","Copiar",this.perfilaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPerfilAccion,"ver_form","Ver",this.perfilaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPerfilAccion,"nuevorelaciones_button","Nuevo Rel",this.perfilaccionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPerfilAccion,"guardarcambiostabla_button","Guardar",this.perfilaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPerfilAccion,"cerrar_button","Salir",this.perfilaccionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPerfilAccion.setToolTipText("Nuevo"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPerfilAccion.setToolTipText("Duplicar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPerfilAccion.setToolTipText("Copiar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPerfilAccion.setToolTipText("Ver"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPerfilAccion.setToolTipText("Nuevo Rel"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPerfilAccion.setToolTipText("Guardar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPerfilAccion.setToolTipText("Salir"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPerfilAccion";
		inputMap = this.jButtonNuevoPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPerfilAccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPerfilAccion"));
		
		//DUPLICAR
		sMapKey = "DuplicarPerfilAccion";
		inputMap = this.jButtonDuplicarPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPerfilAccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPerfilAccion"));
		
		//COPIAR
		sMapKey = "CopiarPerfilAccion";
		inputMap = this.jButtonCopiarPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPerfilAccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPerfilAccion"));
		
		//VEr FORM
		sMapKey = "VerFormPerfilAccion";
		inputMap = this.jButtonVerFormPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPerfilAccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPerfilAccion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPerfilAccion";
		inputMap = this.jButtonNuevoRelacionesPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPerfilAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPerfilAccion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPerfilAccion";
		inputMap = this.jButtonModificarPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPerfilAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPerfilAccion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPerfilAccion";
		inputMap = this.jButtonCerrarPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPerfilAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPerfilAccion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPerfilAccion";
		inputMap = this.jButtonGuardarCambiosTablaPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPerfilAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPerfilAccion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPerfilAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPerfilAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPerfilAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PerfilAccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PerfilAccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PerfilAccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PerfilAccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PerfilAccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPerfilAccion.setName("jPanelParametrosReportesPerfilAccion"); 
		
		this.jPanelParametrosReportesAccionesPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPerfilAccion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPerfilAccion.setName("jPanelParametrosReportesAccionesPerfilAccion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPerfilAccion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPerfilAccion = new JButtonMe();
		this.jButtonRecargarInformacionPerfilAccion.setText("Recargar");
		this.jButtonRecargarInformacionPerfilAccion.setToolTipText("Recargar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPerfilAccion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPerfilAccion = new JButtonMe();
		this.jButtonProcesarInformacionPerfilAccion.setText("Procesar");
		this.jButtonProcesarInformacionPerfilAccion.setToolTipText("Procesar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPerfilAccion.setVisible(false);
			
		this.jButtonProcesarInformacionPerfilAccion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPerfilAccion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPerfilAccion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPerfilAccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPerfilAccion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPerfilAccion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPerfilAccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPerfilAccion.setText("TIPO");       
		this.jComboBoxTiposReportesPerfilAccion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPerfilAccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPerfilAccion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPerfilAccion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPerfilAccion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPerfilAccion.setText("Paginacion");
		this.jComboBoxTiposPaginacionPerfilAccion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPerfilAccion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPerfilAccion.setText("Accion");
		this.jComboBoxTiposRelacionesPerfilAccion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPerfilAccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPerfilAccion.setText("Accion");
		this.jComboBoxTiposAccionesPerfilAccion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPerfilAccion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPerfilAccion.setText("Accion");
		this.jComboBoxTiposSeleccionarPerfilAccion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPerfilAccion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPerfilAccion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPerfilAccion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPerfilAccion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPerfilAccion = new JLabelMe();
		
		this.jLabelAccionesPerfilAccion.setText("Acciones");		
		this.jLabelAccionesPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPerfilAccion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPerfilAccion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPerfilAccion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPerfilAccion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPerfilAccion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPerfilAccion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPerfilAccion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPerfilAccion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPerfilAccion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePerfilAccion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePerfilAccion.setText("Graf.");
		this.jCheckBoxConGraficoReportePerfilAccion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPerfilAccion = new JButtonMe();
		//this.jButtonAnterioresPerfilAccion.setText("<<");
        this.jButtonAnterioresPerfilAccion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPerfilAccion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPerfilAccion = new JButtonMe();
		//this.jButtonSiguientesPerfilAccion.setText(">>");
        this.jButtonSiguientesPerfilAccion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPerfilAccion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPerfilAccion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPerfilAccion.setText("Nue");
        this.jButtonNuevoGuardarCambiosPerfilAccion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPerfilAccion,"nuevoguardarcambios_button","Nue",this.perfilaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPerfilAccion";
		inputMap = this.jButtonNuevoGuardarCambiosPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPerfilAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPerfilAccion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPerfilAccion";
		inputMap = this.jButtonRecargarInformacionPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPerfilAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPerfilAccion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPerfilAccion";
		inputMap = this.jButtonSiguientesPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPerfilAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPerfilAccion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPerfilAccion";
		inputMap = this.jButtonAnterioresPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPerfilAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPerfilAccion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPerfilAccion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPerfilAccion.setMinimumSize(new Dimension(this.getWidth(),PerfilAccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilAccionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPerfilAccion.setMaximumSize(new Dimension(this.getWidth(),PerfilAccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilAccionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPerfilAccion.setPreferredSize(new Dimension(this.getWidth(),PerfilAccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilAccionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPerfilAccion = new GridBagLayout();

			this.jPanelPaginacionPerfilAccion.setLayout(gridaBagLayoutPaginacionPerfilAccion);						
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.gridy = 0;
			this.gridBagConstraintsPerfilAccion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPerfilAccion.add(this.jButtonAnterioresPerfilAccion, this.gridBagConstraintsPerfilAccion);
					
						
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPerfilAccion.gridy = 0;
			
			this.jPanelPaginacionPerfilAccion.add(this.jButtonNuevoGuardarCambiosPerfilAccion, this.gridBagConstraintsPerfilAccion);
						
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPerfilAccion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPerfilAccion.gridy = 0;
			this.jPanelPaginacionPerfilAccion.add(this.jButtonSiguientesPerfilAccion, this.gridBagConstraintsPerfilAccion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.gridy = 1;
			this.gridBagConstraintsPerfilAccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfilAccion.add(this.jButtonNuevoPerfilAccion, this.gridBagConstraintsPerfilAccion);
						
			
			
			if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
				this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPerfilAccion.gridy = 1;
				this.gridBagConstraintsPerfilAccion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPerfilAccion.add(this.jButtonGuardarCambiosTablaPerfilAccion, this.gridBagConstraintsPerfilAccion);
			}
			
			
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.gridy = 1;
			this.gridBagConstraintsPerfilAccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfilAccion.add(this.jButtonDuplicarPerfilAccion, this.gridBagConstraintsPerfilAccion);
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.gridy = 1;
			this.gridBagConstraintsPerfilAccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfilAccion.add(this.jButtonCopiarPerfilAccion, this.gridBagConstraintsPerfilAccion);
		
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.gridy = 1;
			this.gridBagConstraintsPerfilAccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfilAccion.add(this.jButtonVerFormPerfilAccion, this.gridBagConstraintsPerfilAccion);
		
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.gridy = 1;
			this.gridBagConstraintsPerfilAccion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPerfilAccion.add(this.jButtonCerrarPerfilAccion, this.gridBagConstraintsPerfilAccion);
		
		
		
		this.jButtonRecargarInformacionPerfilAccion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPerfilAccion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPerfilAccion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPerfilAccion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPerfilAccion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPerfilAccion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPerfilAccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPerfilAccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPerfilAccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPerfilAccion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPerfilAccion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPerfilAccion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPerfilAccion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPerfilAccion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPerfilAccion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPerfilAccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPerfilAccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPerfilAccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPerfilAccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfilAccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfilAccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPerfilAccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPerfilAccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPerfilAccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPerfilAccion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPerfilAccion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPerfilAccion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePerfilAccion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePerfilAccion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePerfilAccion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPerfilAccion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPerfilAccion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPerfilAccion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPerfilAccion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPerfilAccion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPerfilAccion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPerfilAccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPerfilAccion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PerfilAccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PerfilAccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PerfilAccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PerfilAccion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPerfilAccion.setLayout(gridaBagParametrosReportesPerfilAccion);
			this.jPanelParametrosReportesAccionesPerfilAccion.setLayout(gridaBagParametrosReportesAccionesPerfilAccion);
			
			
			this.jPanelParametrosAuxiliar1PerfilAccion.setLayout(gridaBagParametrosAuxiliar1PerfilAccion);
			this.jPanelParametrosAuxiliar2PerfilAccion.setLayout(gridaBagParametrosAuxiliar2PerfilAccion);
			this.jPanelParametrosAuxiliar3PerfilAccion.setLayout(gridaBagParametrosAuxiliar3PerfilAccion);
			this.jPanelParametrosAuxiliar4PerfilAccion.setLayout(gridaBagParametrosAuxiliar4PerfilAccion);
			//this.jPanelParametrosAuxiliar5PerfilAccion.setLayout(gridaBagParametrosAuxiliar2PerfilAccion);			
			
			
			
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPerfilAccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfilAccion.add(this.jButtonRecargarInformacionPerfilAccion, this.gridBagConstraintsPerfilAccion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilAccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilAccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PerfilAccion.add(this.jComboBoxTiposPaginacionPerfilAccion, this.gridBagConstraintsPerfilAccion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilAccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilAccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PerfilAccion.add(this.jCheckBoxConAltoMaximoTablaPerfilAccion, this.gridBagConstraintsPerfilAccion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilAccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilAccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PerfilAccion.add(this.jComboBoxTiposArchivosReportesPerfilAccion, this.gridBagConstraintsPerfilAccion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilAccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilAccion.add(this.jPanelParametrosAuxiliar1PerfilAccion, this.gridBagConstraintsPerfilAccion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPerfilAccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PerfilAccion.add(this.jComboBoxTiposReportesPerfilAccion, this.gridBagConstraintsPerfilAccion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilAccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilAccion.add(this.jPanelParametrosAuxiliar4PerfilAccion, this.gridBagConstraintsPerfilAccion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilAccion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilAccion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilAccion.add(this.jComboBoxTiposReportesPerfilAccion, this.gridBagConstraintsPerfilAccion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilAccion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPerfilAccion.add(this.jCheckBoxGenerarReportePerfilAccion, this.gridBagConstraintsPerfilAccion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilAccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilAccion.add(this.jPanelParametrosAuxiliar2PerfilAccion, this.gridBagConstraintsPerfilAccion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPerfilAccion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPerfilAccion.add(this.jLabelAccionesPerfilAccion, this.gridBagConstraintsPerfilAccion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
				this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPerfilAccion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPerfilAccion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPerfilAccion.add(this.jButtonAbrirOrderByPerfilAccion, this.gridBagConstraintsPerfilAccion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPerfilAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilAccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfilAccion.add(this.jComboBoxTiposSeleccionarPerfilAccion, this.gridBagConstraintsPerfilAccion);			
			
			
			/*
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPerfilAccion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPerfilAccion.add(this.jCheckBoxSeleccionarTodosPerfilAccion, this.gridBagConstraintsPerfilAccion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPerfilAccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PerfilAccion.add(this.jCheckBoxSeleccionarTodosPerfilAccion, this.gridBagConstraintsPerfilAccion);															
				
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPerfilAccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PerfilAccion.add(this.jCheckBoxSeleccionadosPerfilAccion, this.gridBagConstraintsPerfilAccion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilAccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilAccion.add(this.jPanelParametrosAuxiliar3PerfilAccion, this.gridBagConstraintsPerfilAccion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilAccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfilAccion.add(this.jComboBoxTiposAccionesPerfilAccion, this.gridBagConstraintsPerfilAccion);
	
				
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilAccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfilAccion.add(this.jTextFieldValorCampoGeneralPerfilAccion, this.gridBagConstraintsPerfilAccion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPerfilAccion = new GridBagLayout();

			this.jScrollPanelDatosPerfilAccion.setLayout(gridaBagLayoutDatosPerfilAccion);
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.gridy = 0;
			this.gridBagConstraintsPerfilAccion.gridx = 0;
			
			this.jScrollPanelDatosPerfilAccion.add(this.jTableDatosPerfilAccion, this.gridBagConstraintsPerfilAccion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPerfilAccion.setViewportView(this.jTableDatosPerfilAccion);
		this.jTableDatosPerfilAccion.setFillsViewportHeight(true);
		this.jTableDatosPerfilAccion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPerfilAccion= new GridBagLayout();
		this.jPanelAccionesPerfilAccion.setLayout(gridaBagLayoutAccionesPerfilAccion);
		
		
		/*	
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilAccion.gridy = 0;
		this.gridBagConstraintsPerfilAccion.gridx = 0;
			
		this.jPanelAccionesPerfilAccion.add(this.jButtonNuevoPerfilAccion, this.gridBagConstraintsPerfilAccion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAccionPerfilAccion= new GridBagLayout();
		gridaBagLayoutFK_IdAccionPerfilAccion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAccionPerfilAccion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAccionPerfilAccion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAccionPerfilAccion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAccionPerfilAccion.setLayout(gridaBagLayoutFK_IdAccionPerfilAccion);

		gridBagConstraintsPerfilAccion = new GridBagConstraints();
		gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilAccion.gridy = 0;
		gridBagConstraintsPerfilAccion.gridx = 0;
		jPanelFK_IdAccionPerfilAccion.add(jLabelid_accionFK_IdAccionPerfilAccion, gridBagConstraintsPerfilAccion);

		gridBagConstraintsPerfilAccion = new GridBagConstraints();
		gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilAccion.gridy = 0;
		gridBagConstraintsPerfilAccion.gridx = 1;
		jPanelFK_IdAccionPerfilAccion.add(jComboBoxid_accionFK_IdAccionPerfilAccion, gridBagConstraintsPerfilAccion);

		gridBagConstraintsPerfilAccion = new GridBagConstraints();
		gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilAccion.gridy = 1;
		gridBagConstraintsPerfilAccion.gridx =1;
		jPanelFK_IdAccionPerfilAccion.add(jButtonFK_IdAccionPerfilAccion, gridBagConstraintsPerfilAccion);

		jTabbedPaneBusquedasPerfilAccion.addTab("1.-Por Accion ", jPanelFK_IdAccionPerfilAccion);
		jTabbedPaneBusquedasPerfilAccion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPerfilPerfilAccion= new GridBagLayout();
		gridaBagLayoutFK_IdPerfilPerfilAccion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPerfilPerfilAccion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPerfilPerfilAccion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPerfilPerfilAccion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPerfilPerfilAccion.setLayout(gridaBagLayoutFK_IdPerfilPerfilAccion);

		gridBagConstraintsPerfilAccion = new GridBagConstraints();
		gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilAccion.gridy = 0;
		gridBagConstraintsPerfilAccion.gridx = 0;
		jPanelFK_IdPerfilPerfilAccion.add(jLabelid_perfilFK_IdPerfilPerfilAccion, gridBagConstraintsPerfilAccion);

		gridBagConstraintsPerfilAccion = new GridBagConstraints();
		gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilAccion.gridy = 0;
		gridBagConstraintsPerfilAccion.gridx = 1;
		jPanelFK_IdPerfilPerfilAccion.add(jComboBoxid_perfilFK_IdPerfilPerfilAccion, gridBagConstraintsPerfilAccion);


		gridBagConstraintsPerfilAccion = new GridBagConstraints();
		gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPerfilAccion.fill = GridBagConstraints.NONE;
		gridBagConstraintsPerfilAccion.gridy = 0;
		gridBagConstraintsPerfilAccion.gridx = 0;
		jPanelFK_IdPerfilPerfilAccion.add(this.jButtonBuscarFK_IdPerfilid_perfilPerfilAccion, gridBagConstraintsPerfilAccion);

		gridBagConstraintsPerfilAccion = new GridBagConstraints();
		gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilAccion.gridy = 1;
		gridBagConstraintsPerfilAccion.gridx =1;
		jPanelFK_IdPerfilPerfilAccion.add(jButtonFK_IdPerfilPerfilAccion, gridBagConstraintsPerfilAccion);

		jTabbedPaneBusquedasPerfilAccion.addTab("2.-Por Perfil ", jPanelFK_IdPerfilPerfilAccion);
		jTabbedPaneBusquedasPerfilAccion.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPerfilAccion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPerfilAccion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.perfilaccionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();						
			this.gridBagConstraintsPerfilAccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPerfilAccion.gridx = 0;		
			//this.gridBagConstraintsPerfilAccion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPerfilAccion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPerfilAccion, this.gridBagConstraintsPerfilAccion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPerfilAccion.gridx = 0;		
		//this.gridBagConstraintsPerfilAccion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPerfilAccion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPerfilAccion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPerfilAccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPerfilAccion.gridx = 0;		
			this.gridBagConstraintsPerfilAccion.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPerfilAccion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPerfilAccion, this.gridBagConstraintsPerfilAccion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilAccion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPerfilAccion, this.gridBagConstraintsPerfilAccion);								
		
		
		/*
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilAccion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPerfilAccion, this.gridBagConstraintsPerfilAccion);
		*/		
		
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPerfilAccion.gridx =0;
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPerfilAccion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPerfilAccion, this.gridBagConstraintsPerfilAccion);
				
		
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilAccion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPerfilAccion, this.gridBagConstraintsPerfilAccion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PerfilAccionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPerfilAccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPerfilAccion = new GridBagLayout();
			this.jPanelBusquedasParametrosPerfilAccion.setLayout(gridaBagLayoutBusquedasParametrosPerfilAccion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPerfilAccion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPerfilAccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfilAccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfilAccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilAccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPerfilAccion, this.gridBagConstraintsPerfilAccion);
			
			
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilAccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPerfilAccion, this.gridBagConstraintsPerfilAccion);
		
			
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPerfilAccion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPerfilAccion, this.gridBagConstraintsPerfilAccion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPerfilAccion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPerfilAccion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPerfilAccion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPerfilAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPerfilAccion.setName("jPanelReporteDinamicoPerfilAccion"); 
		
		this.jPanelReporteDinamicoPerfilAccion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPerfilAccion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPerfilAccion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPerfilAccion.setLayout(gridaBagLayoutReporteDinamicoPerfilAccion);
		
		
		this.jInternalFrameReporteDinamicoPerfilAccion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPerfilAccion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePerfilAccion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPerfilAccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPerfilAccion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPerfilAccion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPerfilAccion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPerfilAccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPerfilAccion.setResizable(true);
	    this.jInternalFrameReporteDinamicoPerfilAccion.setClosable(true);
	    this.jInternalFrameReporteDinamicoPerfilAccion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPerfilAccion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPerfilAccion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPerfilAccion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Acciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePerfilAccion = new JLabelMe();

		this.jLabelColumnasSelectReportePerfilAccion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilAccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfilAccion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPerfilAccion.add(this.jLabelColumnasSelectReportePerfilAccion, this.gridBagConstraintsPerfilAccion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePerfilAccion = new JList<Reporte>();
		this.jListColumnasSelectReportePerfilAccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePerfilAccion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePerfilAccion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePerfilAccion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePerfilAccion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePerfilAccion=new JScrollPane(this.jListColumnasSelectReportePerfilAccion);
			
			this.jScrollColumnasSelectReportePerfilAccion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePerfilAccion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePerfilAccion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilAccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfilAccion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPerfilAccion.add(this.jListColumnasSelectReportePerfilAccion, this.gridBagConstraintsPerfilAccion);
		this.jPanelReporteDinamicoPerfilAccion.add(this.jScrollColumnasSelectReportePerfilAccion, this.gridBagConstraintsPerfilAccion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePerfilAccion = new JLabelMe();

		this.jLabelRelacionesSelectReportePerfilAccion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePerfilAccion = new JList<Reporte>();
		this.jListRelacionesSelectReportePerfilAccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePerfilAccion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePerfilAccion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePerfilAccion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePerfilAccion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePerfilAccion=new JScrollPane(this.jListRelacionesSelectReportePerfilAccion);
			
			this.jScrollRelacionesSelectReportePerfilAccion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePerfilAccion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePerfilAccion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPerfilAccion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPerfilAccion = new JComboBoxMe();
		this.jListColumnasValoresGraficoPerfilAccion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPerfilAccion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPerfilAccion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPerfilAccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPerfilAccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPerfilAccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPerfilAccion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPerfilAccion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPerfilAccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPerfilAccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPerfilAccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPerfilAccion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPerfilAccion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilAccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfilAccion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPerfilAccion.add(this.jLabelGenerarExcelReporteDinamicoPerfilAccion, this.gridBagConstraintsPerfilAccion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPerfilAccion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPerfilAccion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPerfilAccion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPerfilAccion.setToolTipText("Generar EXCEL"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPerfilAccion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPerfilAccion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPerfilAccion.add(this.jButtonGenerarExcelReporteDinamicoPerfilAccion, this.gridBagConstraintsPerfilAccion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilAccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfilAccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfilAccion.add(this.jComboBoxTiposReportesDinamicoPerfilAccion, this.gridBagConstraintsPerfilAccion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPerfilAccion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPerfilAccion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilAccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfilAccion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPerfilAccion.add(this.jLabelTiposArchivoReporteDinamicoPerfilAccion, this.gridBagConstraintsPerfilAccion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilAccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfilAccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfilAccion.add(this.jComboBoxTiposArchivosReportesDinamicoPerfilAccion, this.gridBagConstraintsPerfilAccion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPerfilAccion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPerfilAccion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPerfilAccion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPerfilAccion.setToolTipText("Generar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilAccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfilAccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfilAccion.add(this.jButtonGenerarReporteDinamicoPerfilAccion, this.gridBagConstraintsPerfilAccion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPerfilAccion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPerfilAccion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPerfilAccion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPerfilAccion.setToolTipText("Cancelar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilAccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfilAccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfilAccion.add(this.jButtonCerrarReporteDinamicoPerfilAccion, this.gridBagConstraintsPerfilAccion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPerfilAccion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPerfilAccion= new JScrollPane(jPanelReporteDinamicoPerfilAccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPerfilAccion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPerfilAccion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPerfilAccion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Acciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPerfilAccion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPerfilAccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPerfilAccion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPerfilAccion);
		this.jInternalFrameReporteDinamicoPerfilAccion.getContentPane().add(this.jScrollPanelReporteDinamicoPerfilAccion, this.gridBagConstraintsPerfilAccion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPerfilAccion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPerfilAccion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPerfilAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPerfilAccion.setName("jPanelImportacionPerfilAccion"); 
		
		this.jPanelImportacionPerfilAccion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPerfilAccion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPerfilAccion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPerfilAccion.setLayout(gridaBagLayoutImportacionPerfilAccion);
		
		
		this.jInternalFrameImportacionPerfilAccion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPerfilAccion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPerfilAccion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePerfilAccion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPerfilAccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPerfilAccion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPerfilAccion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPerfilAccion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPerfilAccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPerfilAccion.setResizable(true);
	    this.jInternalFrameImportacionPerfilAccion.setClosable(true);
	    this.jInternalFrameImportacionPerfilAccion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPerfilAccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPerfilAccion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPerfilAccion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPerfilAccion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPerfilAccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPerfilAccion.setResizable(true);
	    this.jInternalFrameImportacionPerfilAccion.setClosable(true);
	    this.jInternalFrameImportacionPerfilAccion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPerfilAccion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPerfilAccion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPerfilAccion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Acciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPerfilAccion = new JLabelMe();

		this.jLabelArchivoImportacionPerfilAccion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilAccion.gridy = iPosYImportacion;		
		this.gridBagConstraintsPerfilAccion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPerfilAccion.add(this.jLabelArchivoImportacionPerfilAccion, this.gridBagConstraintsPerfilAccion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPerfilAccion = new JFileChooser();		
		this.jFileChooserImportacionPerfilAccion.setToolTipText("ESCOGER ARCHIVO"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPerfilAccion = new JButtonMe();
		this.jButtonAbrirImportacionPerfilAccion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPerfilAccion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPerfilAccion.setToolTipText("Generar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilAccion.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfilAccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfilAccion.add(this.jButtonAbrirImportacionPerfilAccion, this.gridBagConstraintsPerfilAccion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPerfilAccion = new JLabelMe();

		this.jLabelPathArchivoImportacionPerfilAccion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPerfilAccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPerfilAccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPerfilAccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilAccion.gridy = iPosYImportacion;		
		this.gridBagConstraintsPerfilAccion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPerfilAccion.add(this.jLabelPathArchivoImportacionPerfilAccion, this.gridBagConstraintsPerfilAccion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPerfilAccion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPerfilAccion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPerfilAccion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPerfilAccion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilAccion.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfilAccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfilAccion.add(this.jTextFieldPathArchivoImportacionPerfilAccion, this.gridBagConstraintsPerfilAccion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPerfilAccion = new JButtonMe();
		this.jButtonGenerarImportacionPerfilAccion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPerfilAccion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPerfilAccion.setToolTipText("Generar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilAccion.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfilAccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfilAccion.add(this.jButtonGenerarImportacionPerfilAccion, this.gridBagConstraintsPerfilAccion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPerfilAccion = new JButtonMe();
		this.jButtonCerrarImportacionPerfilAccion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPerfilAccion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPerfilAccion.setToolTipText("Cancelar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilAccion.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfilAccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfilAccion.add(this.jButtonCerrarImportacionPerfilAccion, this.gridBagConstraintsPerfilAccion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPerfilAccion = new GridBagLayout();
		
		this.jScrollPanelImportacionPerfilAccion= new JScrollPane(jPanelImportacionPerfilAccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
		this.gridBagConstraintsPerfilAccion.gridy =iPosYImportacion;
		this.gridBagConstraintsPerfilAccion.gridx =iPosXImportacion;
		this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPerfilAccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPerfilAccion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPerfilAccion);
		this.jInternalFrameImportacionPerfilAccion.getContentPane().add(this.jScrollPanelImportacionPerfilAccion, this.gridBagConstraintsPerfilAccion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPerfilAccion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPerfilAccion = new JButtonMe();
			this.jButtonAbrirOrderByPerfilAccion.setText("Orden");
			this.jButtonAbrirOrderByPerfilAccion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPerfilAccion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPerfilAccion";
			inputMap = this.jButtonAbrirOrderByPerfilAccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPerfilAccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPerfilAccion"));
		
		
			GridBagLayout gridaBagLayoutOrderByPerfilAccion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPerfilAccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPerfilAccion.setName("jPanelOrderByPerfilAccion"); 
			
			this.jPanelOrderByPerfilAccion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPerfilAccion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPerfilAccion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPerfilAccion.setLayout(gridaBagLayoutOrderByPerfilAccion);
			
			
			this.jTableDatosPerfilAccionOrderBy = new JTableMe();        
			this.jTableDatosPerfilAccionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPerfilAccionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPerfilAccionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPerfilAccionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPerfilAccionOrderBy.setViewportView(this.jTableDatosPerfilAccionOrderBy);
			this.jTableDatosPerfilAccionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPerfilAccionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPerfilAccion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPerfilAccion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPerfilAccion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePerfilAccion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPerfilAccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPerfilAccion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPerfilAccion.setTitle("Orden");
			this.jInternalFrameOrderByPerfilAccion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPerfilAccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPerfilAccion.setResizable(true);
			this.jInternalFrameOrderByPerfilAccion.setClosable(true);
			this.jInternalFrameOrderByPerfilAccion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPerfilAccion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPerfilAccion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPerfilAccion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPerfilAccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Acciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPerfilAccion.gridx =iPosXOrderBy;
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPerfilAccion.ipady =150;
				
			this.jPanelOrderByPerfilAccion.add(jScrollPanelDatosPerfilAccionOrderBy, this.gridBagConstraintsPerfilAccion);//this.jTableDatosPerfilAccionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPerfilAccion = new JButtonMe();
			this.jButtonCerrarOrderByPerfilAccion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPerfilAccion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPerfilAccion.setToolTipText("Cancelar"+" "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPerfilAccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilAccion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPerfilAccion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPerfilAccion.add(this.jButtonCerrarOrderByPerfilAccion, this.gridBagConstraintsPerfilAccion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPerfilAccion = new GridBagLayout();
			
			this.jScrollPanelOrderByPerfilAccion= new JScrollPane(jPanelOrderByPerfilAccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPerfilAccion = new GridBagConstraints();
			this.gridBagConstraintsPerfilAccion.gridy =iPosYOrderBy;
			this.gridBagConstraintsPerfilAccion.gridx =iPosXOrderBy;
			this.gridBagConstraintsPerfilAccion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPerfilAccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPerfilAccion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPerfilAccion);
			
			this.jInternalFrameOrderByPerfilAccion.getContentPane().add(this.jScrollPanelOrderByPerfilAccion, this.gridBagConstraintsPerfilAccion);			
		
		} else {
			this.jButtonAbrirOrderByPerfilAccion = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.perfilaccionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPerfilAccion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPerfilAccion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPerfilAccion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPerfilAccion.getRowHeight();//PerfilAccionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PerfilAccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPerfilAccion.isSelected()) {
					iHeightTable=PerfilAccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PerfilAccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PerfilAccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PerfilAccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPerfilAccion.isSelected()) {
					iHeightTable=PerfilAccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PerfilAccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PerfilAccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPerfilAccion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPerfilAccion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPerfilAccion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPerfilAccion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPerfilAccion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPerfilAccion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPerfilAccion!=null && this.jInternalFrameOrderByPerfilAccion.getjTableDatosOrderBy()!=null) {
			//if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPerfilAccion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPerfilAccion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPerfilAccion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPerfilAccion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPerfilAccion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPerfilAccion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPerfilAccion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPerfilAccion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPerfilAccion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPerfilAccion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=perfilaccionLogic.getPerfilAccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=perfilaccions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PerfilAccion> TraerPerfilAccionBeans(List<PerfilAccion> perfilaccions,ArrayList<Classe> classes)throws Exception {
		try {
			for(PerfilAccion perfilaccion:perfilaccions) {
					
				if(!(PerfilAccionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PerfilAccionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					perfilaccion.setsDetalleGeneralEntityReporte(PerfilAccionConstantesFunciones.getPerfilAccionDescripcion(perfilaccion));
										
					perfilaccion.setejecusion_descripcion(PerfilAccionConstantesFunciones.getejecusionDescripcion(perfilaccion));perfilaccion.setestado_descripcion(PerfilAccionConstantesFunciones.getestadoDescripcion(perfilaccion));	
					
						
					
				} else  {
							
					//perfilaccion.setsDetalleGeneralEntityReporte(perfilaccion.getsDetalleGeneralEntityReporte());
										
				}
				
				//perfilaccionbeans.add(perfilaccionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return perfilaccions;
    }
	//PARA REPORTES FIN
}
