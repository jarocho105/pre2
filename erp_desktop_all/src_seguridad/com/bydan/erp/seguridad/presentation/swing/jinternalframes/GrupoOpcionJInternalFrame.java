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
import com.bydan.erp.seguridad.util.GrupoOpcionConstantesFunciones;

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
public class GrupoOpcionJInternalFrame extends GrupoOpcionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarGrupoOpcion;
	
	protected JMenuBar jmenuBarGrupoOpcion;
	
	protected JMenu jmenuGrupoOpcion;
	protected JMenu jmenuDatosGrupoOpcion;
	protected JMenu jmenuArchivoGrupoOpcion;
	protected JMenu jmenuAccionesGrupoOpcion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosGrupoOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGrupoOpcion;	
	protected GridBagConstraints gridBagConstraintsGrupoOpcion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public GrupoOpcionDetalleFormJInternalFrame jInternalFrameDetalleFormGrupoOpcion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoGrupoOpcion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionGrupoOpcion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";
	
	public GrupoOpcionSessionBean grupoopcionSessionBean;
		
	
	
	public ModuloSessionBean moduloSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<GrupoOpcion> grupoopcions;		
	public List<GrupoOpcion> grupoopcionsEliminados;	
	public List<GrupoOpcion> grupoopcionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByGrupoOpcion;		
	protected JButton jButtonAbrirOrderByGrupoOpcion;
	
	
	//protected JPanel jPanelOrderByGrupoOpcion;
	//public JScrollPane jScrollPanelOrderByGrupoOpcion;	
	//protected JButton jButtonCerrarOrderByGrupoOpcion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public GrupoOpcionLogic grupoopcionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosGrupoOpcion;
	public JScrollPane jScrollPanelDatosEdicionGrupoOpcion;
	public JScrollPane jScrollPanelDatosGeneralGrupoOpcion;
    
	
	
	//public JScrollPane jScrollPanelDatosGrupoOpcionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoGrupoOpcion;
	//public JScrollPane jScrollPanelImportacionGrupoOpcion;
	
	
	
	protected JPanel jPanelAccionesGrupoOpcion;
	
    protected JPanel jPanelPaginacionGrupoOpcion;
    protected JPanel jPanelParametrosReportesGrupoOpcion;
	protected JPanel jPanelParametrosReportesAccionesGrupoOpcion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1GrupoOpcion;
	protected JPanel jPanelParametrosAuxiliar2GrupoOpcion;
	protected JPanel jPanelParametrosAuxiliar3GrupoOpcion;
	protected JPanel jPanelParametrosAuxiliar4GrupoOpcion;
	//protected JPanel jPanelParametrosAuxiliar5GrupoOpcion;
	
	
	
	//protected JPanel jPanelReporteDinamicoGrupoOpcion;
	//protected JPanel jPanelImportacionGrupoOpcion;
	
	
	public JTable jTableDatosGrupoOpcion;
	
	
	
	//public JTable jTableDatosGrupoOpcionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoGrupoOpcion;
	protected JButton jButtonDuplicarGrupoOpcion;
	protected JButton jButtonCopiarGrupoOpcion;
	protected JButton jButtonVerFormGrupoOpcion;
	protected JButton jButtonNuevoRelacionesGrupoOpcion;
	protected JButton jButtonModificarGrupoOpcion;
	
    protected JButton jButtonGuardarCambiosTablaGrupoOpcion;
	protected JButton jButtonCerrarGrupoOpcion;
	
	
	protected JButton jButtonRecargarInformacionGrupoOpcion;
	protected JButton jButtonProcesarInformacionGrupoOpcion;
	
	
	protected JButton jButtonAnterioresGrupoOpcion;
	protected JButton jButtonSiguientesGrupoOpcion;
	protected JButton jButtonNuevoGuardarCambiosGrupoOpcion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoGrupoOpcion;
	//protected JButton jButtonCerrarReporteDinamicoGrupoOpcion;
	//protected JButton jButtonGenerarExcelReporteDinamicoGrupoOpcion;	
	
	
	
	//protected JButton jButtonAbrirImportacionGrupoOpcion;
	//protected JButton jButtonGenerarImportacionGrupoOpcion;
	//protected JButton jButtonCerrarImportacionGrupoOpcion;
	//protected JFileChooser jFileChooserImportacionGrupoOpcion;
	//protected File fileImportacionGrupoOpcion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGrupoOpcion;
	protected JButton jButtonDuplicarToolBarGrupoOpcion;
	protected JButton jButtonNuevoRelacionesToolBarGrupoOpcion;
	
	
	public JButton jButtonGuardarCambiosToolBarGrupoOpcion;
	protected JButton jButtonCopiarToolBarGrupoOpcion;
	protected JButton jButtonVerFormToolBarGrupoOpcion;
	public JButton jButtonGuardarCambiosTablaToolBarGrupoOpcion;
	protected JButton jButtonMostrarOcultarTablaToolBarGrupoOpcion;
	protected JButton jButtonCerrarToolBarGrupoOpcion;
	
	protected JButton jButtonRecargarInformacionToolBarGrupoOpcion;
	protected JButton jButtonProcesarInformacionToolBarGrupoOpcion;
	protected JButton jButtonAnterioresToolBarGrupoOpcion;
	protected JButton jButtonSiguientesToolBarGrupoOpcion;
	protected JButton jButtonNuevoGuardarCambiosToolBarGrupoOpcion;
	protected JButton jButtonAbrirOrderByToolBarGrupoOpcion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGrupoOpcion;
	protected JMenuItem jMenuItemDuplicarGrupoOpcion;
	protected JMenuItem jMenuItemNuevoRelacionesGrupoOpcion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosGrupoOpcion;
	protected JMenuItem jMenuItemCopiarGrupoOpcion;
	protected JMenuItem jMenuItemVerFormGrupoOpcion;
	protected JMenuItem jMenuItemGuardarCambiosTablaGrupoOpcion;
	protected JMenuItem jMenuItemCerrarGrupoOpcion;
	protected JMenuItem jMenuItemDetalleCerrarGrupoOpcion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByGrupoOpcion;
	protected JMenuItem jMenuItemDetalleMostarOcultarGrupoOpcion;
	
	protected JMenuItem jMenuItemRecargarInformacionGrupoOpcion;
	protected JMenuItem jMenuItemProcesarInformacionGrupoOpcion;
	protected JMenuItem jMenuItemAnterioresGrupoOpcion;
	protected JMenuItem jMenuItemSiguientesGrupoOpcion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGrupoOpcion;
	protected JMenuItem jMenuItemAbrirOrderByGrupoOpcion;
	protected JMenuItem jMenuItemMostrarOcultarGrupoOpcion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGrupoOpcion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosGrupoOpcion;
	protected JCheckBox jCheckBoxSeleccionadosGrupoOpcion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaGrupoOpcion;
	protected JCheckBox jCheckBoxConGraficoReporteGrupoOpcion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesGrupoOpcion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesGrupoOpcion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoGrupoOpcion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoGrupoOpcion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesGrupoOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionGrupoOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGrupoOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGrupoOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarGrupoOpcion;
	protected JTextField jTextFieldValorCampoGeneralGrupoOpcion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteGrupoOpcion;
	//public JList<Reporte> jListColumnasSelectReporteGrupoOpcion;
	//public JScrollPane jScrollColumnasSelectReporteGrupoOpcion;
	
	//public JLabel jLabelRelacionesSelectReporteGrupoOpcion;
	//public JList<Reporte> jListRelacionesSelectReporteGrupoOpcion;
	//public JScrollPane jScrollRelacionesSelectReporteGrupoOpcion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoGrupoOpcion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoGrupoOpcion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoGrupoOpcion;
	//public JLabel jLabelTiposArchivoReporteDinamicoGrupoOpcion;
	
		
	//public JLabel jLabelArchivoImportacionGrupoOpcion;	
	//public JLabel jLabelPathArchivoImportacionGrupoOpcion;
	//protected JTextField jTextFieldPathArchivoImportacionGrupoOpcion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoGrupoOpcion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoGrupoOpcion;
	
	//public JLabel jLabelColumnaCategoriaValorGrupoOpcion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorGrupoOpcion;
	
	//public JLabel jLabelColumnasValoresGraficoGrupoOpcion;
	//public JList<Reporte> jListColumnasValoresGraficoGrupoOpcion;
	//public JScrollPane jScrollColumnasValoresGraficoGrupoOpcion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoGrupoOpcion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoGrupoOpcion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasGrupoOpcion;
	public JPanel jPanelBusquedaIdModuloPorNombreGrupoOpcion;
	public JButton jButtonBusquedaIdModuloPorNombreGrupoOpcion;
	
	public JPanel jPanelid_moduloBusquedaIdModuloPorNombreGrupoOpcion;
	public JLabel jLabelid_moduloBusquedaIdModuloPorNombreGrupoOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion;
	public JButton jButtonid_moduloBusquedaIdModuloPorNombreGrupoOpcion= new JButtonMe();
	public JButton jButtonid_moduloBusquedaIdModuloPorNombreGrupoOpcionUpdate= new JButtonMe();
	public JButton jButtonid_moduloBusquedaIdModuloPorNombreGrupoOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelnombre_principalBusquedaIdModuloPorNombreGrupoOpcion;
	public JLabel jLabelnombre_principalBusquedaIdModuloPorNombreGrupoOpcion;
	public JTextArea jTextAreanombre_principalBusquedaIdModuloPorNombreGrupoOpcion;
	public JButton jButtonnombre_principalBusquedaIdModuloPorNombreGrupoOpcionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public GrupoOpcionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("GrupoOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoOpcionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoOpcionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoOpcionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GrupoOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionGrupoOpcion)	{
		this.jButtonRecargarInformacionGrupoOpcion = jButtonRecargarInformacionGrupoOpcion;
	}
	
	public JButton getjButtonProcesarInformacionGrupoOpcion() {
		return this.jButtonProcesarInformacionGrupoOpcion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGrupoOpcion)	{
		this.jButtonProcesarInformacionGrupoOpcion = jButtonProcesarInformacionGrupoOpcion;
	}
	
	
	public JButton getjButtonRecargarInformacionGrupoOpcion() {
		return this.jButtonRecargarInformacionGrupoOpcion;
	}
	
	
	public List<GrupoOpcion> getgrupoopcions() {
		return this.grupoopcions;
	}

	public void setgrupoopcions(List<GrupoOpcion> grupoopcions) {
		this.grupoopcions = grupoopcions;
	}
	
	public List<GrupoOpcion> getgrupoopcionsAux() {
		return this.grupoopcionsAux;
	}

	public void setgrupoopcionsAux(List<GrupoOpcion> grupoopcionsAux) {
		this.grupoopcionsAux = grupoopcionsAux;
	}
	
	public List<GrupoOpcion> getgrupoopcionsEliminados() {
		return this.grupoopcionsEliminados;
	}

	public void setGrupoOpcionsEliminados(List<GrupoOpcion> grupoopcionsEliminados) {
		this.grupoopcionsEliminados = grupoopcionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarGrupoOpcion() {
		return jComboBoxTiposSeleccionarGrupoOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarGrupoOpcion(
			JComboBox jComboBoxTiposSeleccionarGrupoOpcion) {
		this.jComboBoxTiposSeleccionarGrupoOpcion = jComboBoxTiposSeleccionarGrupoOpcion;
	}
	
	public void setBorderResaltarTiposSeleccionarGrupoOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarGrupoOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarGrupoOpcion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralGrupoOpcion() {
		return jTextFieldValorCampoGeneralGrupoOpcion;
	}

	public void setjTextFieldValorCampoGeneralGrupoOpcion(
			JTextField jTextFieldValorCampoGeneralGrupoOpcion) {
		this.jTextFieldValorCampoGeneralGrupoOpcion = jTextFieldValorCampoGeneralGrupoOpcion;
	}

	public void setBorderResaltarValorCampoGeneralGrupoOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoOpcion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralGrupoOpcion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosGrupoOpcion() {
		return this.jCheckBoxSeleccionarTodosGrupoOpcion;
	}

	public void setjCheckBoxSeleccionarTodosGrupoOpcion(
			JCheckBox jCheckBoxSeleccionarTodosGrupoOpcion) {
		this.jCheckBoxSeleccionarTodosGrupoOpcion = jCheckBoxSeleccionarTodosGrupoOpcion;
	}

	public void setBorderResaltarSeleccionarTodosGrupoOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoOpcion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosGrupoOpcion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosGrupoOpcion() {
		return this.jCheckBoxSeleccionadosGrupoOpcion;
	}

	public void setjCheckBoxSeleccionadosGrupoOpcion(
			JCheckBox jCheckBoxSeleccionadosGrupoOpcion) {
		this.jCheckBoxSeleccionadosGrupoOpcion = jCheckBoxSeleccionadosGrupoOpcion;
	}
	
	public void setBorderResaltarSeleccionadosGrupoOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoOpcion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosGrupoOpcion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesGrupoOpcion() {
		return this.jComboBoxTiposArchivosReportesGrupoOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesGrupoOpcion(
			JComboBox jComboBoxTiposArchivosReportesGrupoOpcion) {
		this.jComboBoxTiposArchivosReportesGrupoOpcion = jComboBoxTiposArchivosReportesGrupoOpcion;
	}

	public void setBorderResaltarTiposArchivosReportesGrupoOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesGrupoOpcion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesGrupoOpcion() {
		return this.jComboBoxTiposReportesGrupoOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesGrupoOpcion(
			JComboBox jComboBoxTiposReportesGrupoOpcion) {
		this.jComboBoxTiposReportesGrupoOpcion = jComboBoxTiposReportesGrupoOpcion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoGrupoOpcion() {
	//	return jComboBoxTiposReportesDinamicoGrupoOpcion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoGrupoOpcion(
	//		JComboBox jComboBoxTiposReportesDinamicoGrupoOpcion) {
	//	this.jComboBoxTiposReportesDinamicoGrupoOpcion = jComboBoxTiposReportesDinamicoGrupoOpcion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoGrupoOpcion() {
	//	return jComboBoxTiposArchivosReportesDinamicoGrupoOpcion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoGrupoOpcion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoGrupoOpcion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoGrupoOpcion = jComboBoxTiposArchivosReportesDinamicoGrupoOpcion;
	//}
	
	public void setBorderResaltarTiposReportesGrupoOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesGrupoOpcion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesGrupoOpcion() {
		return this.jComboBoxTiposGraficosReportesGrupoOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesGrupoOpcion(
			JComboBox jComboBoxTiposGraficosReportesGrupoOpcion) {
		this.jComboBoxTiposGraficosReportesGrupoOpcion = jComboBoxTiposGraficosReportesGrupoOpcion;
	}
	
	public void setBorderResaltarTiposGraficosReportesGrupoOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesGrupoOpcion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionGrupoOpcion() {
		return this.jComboBoxTiposPaginacionGrupoOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionGrupoOpcion(
			JComboBox jComboBoxTiposPaginacionGrupoOpcion) {
		this.jComboBoxTiposPaginacionGrupoOpcion = jComboBoxTiposPaginacionGrupoOpcion;
	}
	
	public void setBorderResaltarTiposPaginacionGrupoOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionGrupoOpcion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesGrupoOpcion() {
		return this.jComboBoxTiposRelacionesGrupoOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGrupoOpcion() {
		return this.jComboBoxTiposAccionesGrupoOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGrupoOpcion(
			JComboBox jComboBoxTiposRelacionesGrupoOpcion) {
		this.jComboBoxTiposRelacionesGrupoOpcion = jComboBoxTiposRelacionesGrupoOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGrupoOpcion(
			JComboBox jComboBoxTiposAccionesGrupoOpcion) {
		this.jComboBoxTiposAccionesGrupoOpcion = jComboBoxTiposAccionesGrupoOpcion;
	}
	
	public void setBorderResaltarTiposRelacionesGrupoOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesGrupoOpcion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesGrupoOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesGrupoOpcion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoGrupoOpcion() {
	//	return jCheckBoxConGraficoDinamicoGrupoOpcion;
	//}

	//public void setjCheckBoxConGraficoDinamicoGrupoOpcion(
	//		JCheckBox jCheckBoxConGraficoDinamicoGrupoOpcion) {
	//	this.jCheckBoxConGraficoDinamicoGrupoOpcion = jCheckBoxConGraficoDinamicoGrupoOpcion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoGrupoOpcion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarGrupoOpcion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoGrupoOpcion .setBorder(borderResaltar);		
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
		this.grupoopcionSessionBean=new GrupoOpcionSessionBean();
		
		this.grupoopcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupoopcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.grupoopcionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=GrupoOpcionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=GrupoOpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GrupoOpcionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GrupoOpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GrupoOpcionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Grupo Opcion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
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
		
		GrupoOpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("GrupoOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarGrupoOpcion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarGrupoOpcion,this.jTtoolBarGrupoOpcion,
							"nuevo","nuevo","Nuevo"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarGrupoOpcion,this.jTtoolBarGrupoOpcion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarGrupoOpcion,this.jTtoolBarGrupoOpcion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarGrupoOpcion,this.jTtoolBarGrupoOpcion,
							"duplicar","duplicar","Duplicar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarGrupoOpcion,this.jTtoolBarGrupoOpcion,
							"copiar","copiar","Copiar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarGrupoOpcion,this.jTtoolBarGrupoOpcion,
							"ver_form","ver_form","Ver"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoOpcion,this.jTtoolBarGrupoOpcion,
							"recargar","recargar","Recargar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoOpcion,this.jTtoolBarGrupoOpcion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoOpcion,this.jTtoolBarGrupoOpcion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarGrupoOpcion,this.jTtoolBarGrupoOpcion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarGrupoOpcion,this.jTtoolBarGrupoOpcion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarGrupoOpcion,this.jTtoolBarGrupoOpcion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarGrupoOpcion,this.jTtoolBarGrupoOpcion,
							"cerrar","cerrar","Salir"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarGrupoOpcion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarGrupoOpcion;
			
				this.jButtonProcesarInformacionToolBarGrupoOpcion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarGrupoOpcion;
				
		//protected JButton jButtonModificarToolBarGrupoOpcion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarGrupoOpcion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuGrupoOpcion=new JMenuMe("General");
		this.jmenuArchivoGrupoOpcion=new JMenuMe("Archivo");
		this.jmenuAccionesGrupoOpcion=new JMenuMe("Acciones");
		this.jmenuDatosGrupoOpcion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGrupoOpcion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGrupoOpcion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGrupoOpcion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarGrupoOpcion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarGrupoOpcion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarGrupoOpcion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesGrupoOpcion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesGrupoOpcion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesGrupoOpcion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosGrupoOpcion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGrupoOpcion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGrupoOpcion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarGrupoOpcion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarGrupoOpcion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarGrupoOpcion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormGrupoOpcion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormGrupoOpcion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormGrupoOpcion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaGrupoOpcion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaGrupoOpcion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaGrupoOpcion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGrupoOpcion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGrupoOpcion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGrupoOpcion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionGrupoOpcion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionGrupoOpcion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionGrupoOpcion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionGrupoOpcion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionGrupoOpcion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionGrupoOpcion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresGrupoOpcion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresGrupoOpcion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresGrupoOpcion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesGrupoOpcion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesGrupoOpcion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesGrupoOpcion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByGrupoOpcion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByGrupoOpcion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByGrupoOpcion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGrupoOpcion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGrupoOpcion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGrupoOpcion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByGrupoOpcion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByGrupoOpcion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByGrupoOpcion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGrupoOpcion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGrupoOpcion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGrupoOpcion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosGrupoOpcion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosGrupoOpcion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosGrupoOpcion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoGrupoOpcion.add(this.jMenuItemCerrarGrupoOpcion);
			
			this.jmenuAccionesGrupoOpcion.add(this.jMenuItemNuevoGrupoOpcion);
			this.jmenuAccionesGrupoOpcion.add(this.jMenuItemNuevoGuardarCambiosGrupoOpcion);
			this.jmenuAccionesGrupoOpcion.add(this.jMenuItemNuevoRelacionesGrupoOpcion);
			this.jmenuAccionesGrupoOpcion.add(this.jMenuItemGuardarCambiosTablaGrupoOpcion);		
			this.jmenuAccionesGrupoOpcion.add(this.jMenuItemDuplicarGrupoOpcion);		
			this.jmenuAccionesGrupoOpcion.add(this.jMenuItemCopiarGrupoOpcion);		
			this.jmenuAccionesGrupoOpcion.add(this.jMenuItemVerFormGrupoOpcion);		
			
			this.jmenuDatosGrupoOpcion.add(this.jMenuItemRecargarInformacionGrupoOpcion);				
			this.jmenuDatosGrupoOpcion.add(this.jMenuItemAnterioresGrupoOpcion);				
			this.jmenuDatosGrupoOpcion.add(this.jMenuItemSiguientesGrupoOpcion);				
			this.jmenuDatosGrupoOpcion.add(this.jMenuItemAbrirOrderByGrupoOpcion);				
			this.jmenuDatosGrupoOpcion.add(this.jMenuItemMostrarOcultarGrupoOpcion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesGrupoOpcion.add(this.jMenuItemGuardarCambiosGrupoOpcion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarGrupoOpcion.add(this.jmenuArchivoGrupoOpcion);		
			this.jmenuBarGrupoOpcion.add(this.jmenuAccionesGrupoOpcion);		
			this.jmenuBarGrupoOpcion.add(this.jmenuDatosGrupoOpcion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarGrupoOpcion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasGrupoOpcion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaIdModuloPorNombreGrupoOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaIdModuloPorNombreGrupoOpcion.setToolTipText("Buscar Por Modulo Por Nombre Principal ");
		this.jButtonBusquedaIdModuloPorNombreGrupoOpcion= new JButtonMe();
		this.jButtonBusquedaIdModuloPorNombreGrupoOpcion.setText("Buscar");
		this.jButtonBusquedaIdModuloPorNombreGrupoOpcion.setToolTipText("Buscar Por Modulo Por Nombre Principal ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaIdModuloPorNombreGrupoOpcion,"buscar_button","Buscar Por Modulo Por Nombre Principal ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaIdModuloPorNombreGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moduloBusquedaIdModuloPorNombreGrupoOpcion = new JLabelMe();
		jLabelid_moduloBusquedaIdModuloPorNombreGrupoOpcion.setText("Modulo :");
		jLabelid_moduloBusquedaIdModuloPorNombreGrupoOpcion.setToolTipText("Modulo");
		jLabelid_moduloBusquedaIdModuloPorNombreGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaIdModuloPorNombreGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaIdModuloPorNombreGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloBusquedaIdModuloPorNombreGrupoOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion= new JComboBoxMe();
		jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelnombre_principalBusquedaIdModuloPorNombreGrupoOpcion = new JLabelMe();
		jLabelnombre_principalBusquedaIdModuloPorNombreGrupoOpcion.setText("Nombre Principal :");
		jLabelnombre_principalBusquedaIdModuloPorNombreGrupoOpcion.setToolTipText("Nombre Principal");
		jLabelnombre_principalBusquedaIdModuloPorNombreGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_principalBusquedaIdModuloPorNombreGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_principalBusquedaIdModuloPorNombreGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnombre_principalBusquedaIdModuloPorNombreGrupoOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombre_principalBusquedaIdModuloPorNombreGrupoOpcion= new JTextAreaMe();
		jTextAreanombre_principalBusquedaIdModuloPorNombreGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_principalBusquedaIdModuloPorNombreGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_principalBusquedaIdModuloPorNombreGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombre_principalBusquedaIdModuloPorNombreGrupoOpcion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasGrupoOpcion=new JTabbedPane();


		this.jTabbedPaneBusquedasGrupoOpcion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasGrupoOpcion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasGrupoOpcion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasGrupoOpcion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasGrupoOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleGrupoOpcion = new GrupoOpcionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Grupo Opcion DATOS");
			this.jInternalFrameDetalleFormGrupoOpcion = new GrupoOpcionDetalleFormJInternalFrame(jDesktopPane,this.grupoopcionSessionBean.getConGuardarRelaciones(),this.grupoopcionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormGrupoOpcion = null;//new GrupoOpcionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGrupoOpcion= new GridBagLayout();
		
		
		this.jTableDatosGrupoOpcion = new JTableMe();      
		
		String sToolTipGrupoOpcion="";
		sToolTipGrupoOpcion=GrupoOpcionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGrupoOpcion+="(Seguridad.GrupoOpcion)";
		}
		
		if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
			sToolTipGrupoOpcion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosGrupoOpcion.setToolTipText(sToolTipGrupoOpcion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosGrupoOpcion);
		this.jTableDatosGrupoOpcion.setAutoCreateRowSorter(true);
		this.jTableDatosGrupoOpcion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosGrupoOpcion.setRowSelectionAllowed(true);
		this.jTableDatosGrupoOpcion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosGrupoOpcion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoGrupoOpcion = new JButtonMe();
		this.jButtonDuplicarGrupoOpcion = new JButtonMe();
		this.jButtonCopiarGrupoOpcion = new JButtonMe();
		this.jButtonVerFormGrupoOpcion = new JButtonMe();
		this.jButtonNuevoRelacionesGrupoOpcion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaGrupoOpcion = new JButtonMe();
		this.jButtonCerrarGrupoOpcion = new JButtonMe();
		
		this.jScrollPanelDatosGrupoOpcion = new JScrollPane();   
        this.jScrollPanelDatosGeneralGrupoOpcion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesGrupoOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Grupo Opcion";
		
		if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Opcions" + this.sPath));
		} else {
			this.jScrollPanelDatosGrupoOpcion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGrupoOpcion.setToolTipText("Acciones");
        this.jPanelAccionesGrupoOpcion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoGrupoOpcion=new ReporteDinamicoJInternalFrame(GrupoOpcionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoGrupoOpcion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionGrupoOpcion=new ImportacionJInternalFrame(GrupoOpcionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionGrupoOpcion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByGrupoOpcion = new JButtonMe();
		
		this.jButtonAbrirOrderByGrupoOpcion.setText("Orden");
		this.jButtonAbrirOrderByGrupoOpcion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGrupoOpcion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByGrupoOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGrupoOpcion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoOpcion,false,this);
			
			//this.cargarOrderByGrupoOpcion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGrupoOpcion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoOpcion,true,this);
			
			//this.cargarOrderByGrupoOpcion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosGrupoOpcion.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosGrupoOpcion.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosGrupoOpcion.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosGrupoOpcion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosGrupoOpcion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosGrupoOpcion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoGrupoOpcion.setText("Nuevo");
		this.jButtonDuplicarGrupoOpcion.setText("Duplicar");
		this.jButtonCopiarGrupoOpcion.setText("Copiar");
		this.jButtonVerFormGrupoOpcion.setText("Ver");
		this.jButtonNuevoRelacionesGrupoOpcion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaGrupoOpcion.setText("Guardar");
		this.jButtonCerrarGrupoOpcion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGrupoOpcion,"nuevo_button","Nuevo",this.grupoopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarGrupoOpcion,"duplicar_button","Duplicar",this.grupoopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarGrupoOpcion,"copiar_button","Copiar",this.grupoopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormGrupoOpcion,"ver_form","Ver",this.grupoopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesGrupoOpcion,"nuevorelaciones_button","Nuevo Rel",this.grupoopcionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGrupoOpcion,"guardarcambiostabla_button","Guardar",this.grupoopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGrupoOpcion,"cerrar_button","Salir",this.grupoopcionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoGrupoOpcion.setToolTipText("Nuevo"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarGrupoOpcion.setToolTipText("Duplicar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarGrupoOpcion.setToolTipText("Copiar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormGrupoOpcion.setToolTipText("Ver"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesGrupoOpcion.setToolTipText("Nuevo Rel"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaGrupoOpcion.setToolTipText("Guardar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGrupoOpcion.setToolTipText("Salir"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGrupoOpcion";
		inputMap = this.jButtonNuevoGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGrupoOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGrupoOpcion"));
		
		//DUPLICAR
		sMapKey = "DuplicarGrupoOpcion";
		inputMap = this.jButtonDuplicarGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarGrupoOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarGrupoOpcion"));
		
		//COPIAR
		sMapKey = "CopiarGrupoOpcion";
		inputMap = this.jButtonCopiarGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarGrupoOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarGrupoOpcion"));
		
		//VEr FORM
		sMapKey = "VerFormGrupoOpcion";
		inputMap = this.jButtonVerFormGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormGrupoOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormGrupoOpcion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesGrupoOpcion";
		inputMap = this.jButtonNuevoRelacionesGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesGrupoOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesGrupoOpcion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarGrupoOpcion";
		inputMap = this.jButtonModificarGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarGrupoOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarGrupoOpcion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarGrupoOpcion";
		inputMap = this.jButtonCerrarGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGrupoOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGrupoOpcion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGrupoOpcion";
		inputMap = this.jButtonGuardarCambiosTablaGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGrupoOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGrupoOpcion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesGrupoOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesGrupoOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionGrupoOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1GrupoOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2GrupoOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3GrupoOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4GrupoOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5GrupoOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesGrupoOpcion.setName("jPanelParametrosReportesGrupoOpcion"); 
		
		this.jPanelParametrosReportesAccionesGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesGrupoOpcion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesGrupoOpcion.setName("jPanelParametrosReportesAccionesGrupoOpcion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionGrupoOpcion = new JButtonMe();
		this.jButtonRecargarInformacionGrupoOpcion.setText("Recargar");
		this.jButtonRecargarInformacionGrupoOpcion.setToolTipText("Recargar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionGrupoOpcion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionGrupoOpcion = new JButtonMe();
		this.jButtonProcesarInformacionGrupoOpcion.setText("Procesar");
		this.jButtonProcesarInformacionGrupoOpcion.setToolTipText("Procesar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionGrupoOpcion.setVisible(false);
			
		this.jButtonProcesarInformacionGrupoOpcion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGrupoOpcion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGrupoOpcion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesGrupoOpcion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoOpcion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesGrupoOpcion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesGrupoOpcion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoOpcion.setText("TIPO");       
		this.jComboBoxTiposReportesGrupoOpcion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesGrupoOpcion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoOpcion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesGrupoOpcion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionGrupoOpcion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionGrupoOpcion.setText("Paginacion");
		this.jComboBoxTiposPaginacionGrupoOpcion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesGrupoOpcion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesGrupoOpcion.setText("Accion");
		this.jComboBoxTiposRelacionesGrupoOpcion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesGrupoOpcion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGrupoOpcion.setText("Accion");
		this.jComboBoxTiposAccionesGrupoOpcion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarGrupoOpcion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarGrupoOpcion.setText("Accion");
		this.jComboBoxTiposSeleccionarGrupoOpcion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralGrupoOpcion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralGrupoOpcion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGrupoOpcion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGrupoOpcion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesGrupoOpcion = new JLabelMe();
		
		this.jLabelAccionesGrupoOpcion.setText("Acciones");		
		this.jLabelAccionesGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosGrupoOpcion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosGrupoOpcion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosGrupoOpcion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosGrupoOpcion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosGrupoOpcion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosGrupoOpcion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaGrupoOpcion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaGrupoOpcion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaGrupoOpcion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteGrupoOpcion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteGrupoOpcion.setText("Graf.");
		this.jCheckBoxConGraficoReporteGrupoOpcion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresGrupoOpcion = new JButtonMe();
		//this.jButtonAnterioresGrupoOpcion.setText("<<");
        this.jButtonAnterioresGrupoOpcion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresGrupoOpcion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesGrupoOpcion = new JButtonMe();
		//this.jButtonSiguientesGrupoOpcion.setText(">>");
        this.jButtonSiguientesGrupoOpcion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesGrupoOpcion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosGrupoOpcion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosGrupoOpcion.setText("Nue");
        this.jButtonNuevoGuardarCambiosGrupoOpcion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosGrupoOpcion,"nuevoguardarcambios_button","Nue",this.grupoopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosGrupoOpcion";
		inputMap = this.jButtonNuevoGuardarCambiosGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosGrupoOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosGrupoOpcion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionGrupoOpcion";
		inputMap = this.jButtonRecargarInformacionGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionGrupoOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionGrupoOpcion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesGrupoOpcion";
		inputMap = this.jButtonSiguientesGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesGrupoOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesGrupoOpcion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresGrupoOpcion";
		inputMap = this.jButtonAnterioresGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresGrupoOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresGrupoOpcion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasGrupoOpcion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesGrupoOpcion.setMinimumSize(new Dimension(this.getWidth(),GrupoOpcionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoOpcionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGrupoOpcion.setMaximumSize(new Dimension(this.getWidth(),GrupoOpcionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoOpcionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGrupoOpcion.setPreferredSize(new Dimension(this.getWidth(),GrupoOpcionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoOpcionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionGrupoOpcion = new GridBagLayout();

			this.jPanelPaginacionGrupoOpcion.setLayout(gridaBagLayoutPaginacionGrupoOpcion);						
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.gridy = 0;
			this.gridBagConstraintsGrupoOpcion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionGrupoOpcion.add(this.jButtonAnterioresGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
					
						
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGrupoOpcion.gridy = 0;
			
			this.jPanelPaginacionGrupoOpcion.add(this.jButtonNuevoGuardarCambiosGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
						
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsGrupoOpcion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGrupoOpcion.gridy = 0;
			this.jPanelPaginacionGrupoOpcion.add(this.jButtonSiguientesGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.gridy = 1;
			this.gridBagConstraintsGrupoOpcion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoOpcion.add(this.jButtonNuevoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
				this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGrupoOpcion.gridy = 1;
				this.gridBagConstraintsGrupoOpcion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionGrupoOpcion.add(this.jButtonNuevoRelacionesGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
			}
			
			
			if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
				this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGrupoOpcion.gridy = 1;
				this.gridBagConstraintsGrupoOpcion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionGrupoOpcion.add(this.jButtonGuardarCambiosTablaGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
			}
			
			
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.gridy = 1;
			this.gridBagConstraintsGrupoOpcion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoOpcion.add(this.jButtonDuplicarGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.gridy = 1;
			this.gridBagConstraintsGrupoOpcion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoOpcion.add(this.jButtonCopiarGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.gridy = 1;
			this.gridBagConstraintsGrupoOpcion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoOpcion.add(this.jButtonVerFormGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.gridy = 1;
			this.gridBagConstraintsGrupoOpcion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionGrupoOpcion.add(this.jButtonCerrarGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		
		
		
		this.jButtonRecargarInformacionGrupoOpcion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGrupoOpcion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGrupoOpcion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesGrupoOpcion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGrupoOpcion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGrupoOpcion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesGrupoOpcion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGrupoOpcion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGrupoOpcion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesGrupoOpcion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGrupoOpcion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGrupoOpcion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionGrupoOpcion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGrupoOpcion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGrupoOpcion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesGrupoOpcion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGrupoOpcion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGrupoOpcion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesGrupoOpcion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoOpcion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoOpcion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarGrupoOpcion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGrupoOpcion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGrupoOpcion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaGrupoOpcion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGrupoOpcion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGrupoOpcion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteGrupoOpcion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGrupoOpcion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGrupoOpcion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosGrupoOpcion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGrupoOpcion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGrupoOpcion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosGrupoOpcion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGrupoOpcion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGrupoOpcion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesGrupoOpcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesGrupoOpcion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1GrupoOpcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2GrupoOpcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3GrupoOpcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4GrupoOpcion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesGrupoOpcion.setLayout(gridaBagParametrosReportesGrupoOpcion);
			this.jPanelParametrosReportesAccionesGrupoOpcion.setLayout(gridaBagParametrosReportesAccionesGrupoOpcion);
			
			
			this.jPanelParametrosAuxiliar1GrupoOpcion.setLayout(gridaBagParametrosAuxiliar1GrupoOpcion);
			this.jPanelParametrosAuxiliar2GrupoOpcion.setLayout(gridaBagParametrosAuxiliar2GrupoOpcion);
			this.jPanelParametrosAuxiliar3GrupoOpcion.setLayout(gridaBagParametrosAuxiliar3GrupoOpcion);
			this.jPanelParametrosAuxiliar4GrupoOpcion.setLayout(gridaBagParametrosAuxiliar4GrupoOpcion);
			//this.jPanelParametrosAuxiliar5GrupoOpcion.setLayout(gridaBagParametrosAuxiliar2GrupoOpcion);			
			
			
			
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoOpcion.add(this.jButtonRecargarInformacionGrupoOpcion, this.gridBagConstraintsGrupoOpcion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoOpcion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoOpcion.add(this.jComboBoxTiposPaginacionGrupoOpcion, this.gridBagConstraintsGrupoOpcion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoOpcion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoOpcion.add(this.jCheckBoxConAltoMaximoTablaGrupoOpcion, this.gridBagConstraintsGrupoOpcion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoOpcion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoOpcion.add(this.jComboBoxTiposArchivosReportesGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoOpcion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoOpcion.add(this.jPanelParametrosAuxiliar1GrupoOpcion, this.gridBagConstraintsGrupoOpcion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoOpcion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4GrupoOpcion.add(this.jComboBoxTiposReportesGrupoOpcion, this.gridBagConstraintsGrupoOpcion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoOpcion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoOpcion.add(this.jPanelParametrosAuxiliar4GrupoOpcion, this.gridBagConstraintsGrupoOpcion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoOpcion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoOpcion.add(this.jComboBoxTiposReportesGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoOpcion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoOpcion.add(this.jCheckBoxGenerarReporteGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoOpcion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoOpcion.add(this.jPanelParametrosAuxiliar2GrupoOpcion, this.gridBagConstraintsGrupoOpcion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoOpcion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoOpcion.add(this.jLabelAccionesGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
				this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsGrupoOpcion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesGrupoOpcion.add(this.jButtonAbrirOrderByGrupoOpcion, this.gridBagConstraintsGrupoOpcion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoOpcion.add(this.jComboBoxTiposSeleccionarGrupoOpcion, this.gridBagConstraintsGrupoOpcion);			
			
			
			/*
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoOpcion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoOpcion.add(this.jCheckBoxSeleccionarTodosGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoOpcion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GrupoOpcion.add(this.jCheckBoxSeleccionarTodosGrupoOpcion, this.gridBagConstraintsGrupoOpcion);															
				
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoOpcion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GrupoOpcion.add(this.jCheckBoxSeleccionadosGrupoOpcion, this.gridBagConstraintsGrupoOpcion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoOpcion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoOpcion.add(this.jPanelParametrosAuxiliar3GrupoOpcion, this.gridBagConstraintsGrupoOpcion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoOpcion.add(this.jComboBoxTiposRelacionesGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
				
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoOpcion.add(this.jComboBoxTiposAccionesGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
	
				
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoOpcion.add(this.jTextFieldValorCampoGeneralGrupoOpcion, this.gridBagConstraintsGrupoOpcion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosGrupoOpcion = new GridBagLayout();

			this.jScrollPanelDatosGrupoOpcion.setLayout(gridaBagLayoutDatosGrupoOpcion);
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.gridy = 0;
			this.gridBagConstraintsGrupoOpcion.gridx = 0;
			
			this.jScrollPanelDatosGrupoOpcion.add(this.jTableDatosGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosGrupoOpcion.setViewportView(this.jTableDatosGrupoOpcion);
		this.jTableDatosGrupoOpcion.setFillsViewportHeight(true);
		this.jTableDatosGrupoOpcion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesGrupoOpcion= new GridBagLayout();
		this.jPanelAccionesGrupoOpcion.setLayout(gridaBagLayoutAccionesGrupoOpcion);
		
		
		/*	
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoOpcion.gridy = 0;
		this.gridBagConstraintsGrupoOpcion.gridx = 0;
			
		this.jPanelAccionesGrupoOpcion.add(this.jButtonNuevoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaIdModuloPorNombreGrupoOpcion= new GridBagLayout();
		gridaBagLayoutBusquedaIdModuloPorNombreGrupoOpcion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaIdModuloPorNombreGrupoOpcion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaIdModuloPorNombreGrupoOpcion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaIdModuloPorNombreGrupoOpcion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaIdModuloPorNombreGrupoOpcion.setLayout(gridaBagLayoutBusquedaIdModuloPorNombreGrupoOpcion);

		gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoOpcion.gridy = 0;
		gridBagConstraintsGrupoOpcion.gridx = 0;
		jPanelBusquedaIdModuloPorNombreGrupoOpcion.add(jLabelid_moduloBusquedaIdModuloPorNombreGrupoOpcion, gridBagConstraintsGrupoOpcion);

		gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoOpcion.gridy = 0;
		gridBagConstraintsGrupoOpcion.gridx = 1;
		jPanelBusquedaIdModuloPorNombreGrupoOpcion.add(jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion, gridBagConstraintsGrupoOpcion);


		gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoOpcion.gridy = 1;
		gridBagConstraintsGrupoOpcion.gridx = 0;
		jPanelBusquedaIdModuloPorNombreGrupoOpcion.add(jLabelnombre_principalBusquedaIdModuloPorNombreGrupoOpcion, gridBagConstraintsGrupoOpcion);

		gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoOpcion.gridy = 1;
		gridBagConstraintsGrupoOpcion.gridx = 1;
		jPanelBusquedaIdModuloPorNombreGrupoOpcion.add(jTextAreanombre_principalBusquedaIdModuloPorNombreGrupoOpcion, gridBagConstraintsGrupoOpcion);

		gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoOpcion.gridy = 2;
		gridBagConstraintsGrupoOpcion.gridx =1;
		jPanelBusquedaIdModuloPorNombreGrupoOpcion.add(jButtonBusquedaIdModuloPorNombreGrupoOpcion, gridBagConstraintsGrupoOpcion);

		jTabbedPaneBusquedasGrupoOpcion.addTab("1.-Por Modulo Por Nombre Principal ", jPanelBusquedaIdModuloPorNombreGrupoOpcion);
		jTabbedPaneBusquedasGrupoOpcion.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGrupoOpcion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGrupoOpcion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.grupoopcionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();						
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoOpcion.gridx = 0;		
			//this.gridBagConstraintsGrupoOpcion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGrupoOpcion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarGrupoOpcion, this.gridBagConstraintsGrupoOpcion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsGrupoOpcion.gridx = 0;		
		//this.gridBagConstraintsGrupoOpcion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsGrupoOpcion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsGrupoOpcion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoOpcion.gridx = 0;		
			this.gridBagConstraintsGrupoOpcion.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsGrupoOpcion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasGrupoOpcion, this.gridBagConstraintsGrupoOpcion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoOpcion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesGrupoOpcion, this.gridBagConstraintsGrupoOpcion);								
		
		
		/*
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoOpcion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		*/		
		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGrupoOpcion.gridx =0;
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGrupoOpcion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
				
		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoOpcion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(GrupoOpcionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosGrupoOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGrupoOpcion = new GridBagLayout();
			this.jPanelBusquedasParametrosGrupoOpcion.setLayout(gridaBagLayoutBusquedasParametrosGrupoOpcion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralGrupoOpcion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGrupoOpcion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoOpcion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoOpcion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoOpcion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
			
			
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoOpcion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		
			
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGrupoOpcion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralGrupoOpcion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoGrupoOpcion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoGrupoOpcion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoGrupoOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoGrupoOpcion.setName("jPanelReporteDinamicoGrupoOpcion"); 
		
		this.jPanelReporteDinamicoGrupoOpcion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGrupoOpcion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGrupoOpcion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoGrupoOpcion.setLayout(gridaBagLayoutReporteDinamicoGrupoOpcion);
		
		
		this.jInternalFrameReporteDinamicoGrupoOpcion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoGrupoOpcion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGrupoOpcion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoGrupoOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoGrupoOpcion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoGrupoOpcion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoGrupoOpcion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoGrupoOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoGrupoOpcion.setResizable(true);
	    this.jInternalFrameReporteDinamicoGrupoOpcion.setClosable(true);
	    this.jInternalFrameReporteDinamicoGrupoOpcion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoGrupoOpcion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGrupoOpcion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGrupoOpcion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Opcions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteGrupoOpcion = new JLabelMe();

		this.jLabelColumnasSelectReporteGrupoOpcion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGrupoOpcion.add(this.jLabelColumnasSelectReporteGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteGrupoOpcion = new JList<Reporte>();
		this.jListColumnasSelectReporteGrupoOpcion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteGrupoOpcion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteGrupoOpcion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGrupoOpcion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGrupoOpcion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteGrupoOpcion=new JScrollPane(this.jListColumnasSelectReporteGrupoOpcion);
			
			this.jScrollColumnasSelectReporteGrupoOpcion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGrupoOpcion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGrupoOpcion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGrupoOpcion.add(this.jListColumnasSelectReporteGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		this.jPanelReporteDinamicoGrupoOpcion.add(this.jScrollColumnasSelectReporteGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteGrupoOpcion = new JLabelMe();

		this.jLabelRelacionesSelectReporteGrupoOpcion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGrupoOpcion.add(this.jLabelRelacionesSelectReporteGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteGrupoOpcion = new JList<Reporte>();
		this.jListRelacionesSelectReporteGrupoOpcion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteGrupoOpcion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteGrupoOpcion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGrupoOpcion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGrupoOpcion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteGrupoOpcion=new JScrollPane(this.jListRelacionesSelectReporteGrupoOpcion);
			
			this.jScrollRelacionesSelectReporteGrupoOpcion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGrupoOpcion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGrupoOpcion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGrupoOpcion.add(this.jListRelacionesSelectReporteGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		this.jPanelReporteDinamicoGrupoOpcion.add(this.jScrollRelacionesSelectReporteGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoGrupoOpcion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoGrupoOpcion = new JComboBoxMe();
		this.jListColumnasValoresGraficoGrupoOpcion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoGrupoOpcion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoGrupoOpcion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoGrupoOpcion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGrupoOpcion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGrupoOpcion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoGrupoOpcion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoGrupoOpcion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoGrupoOpcion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGrupoOpcion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGrupoOpcion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoGrupoOpcion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoGrupoOpcion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGrupoOpcion.add(this.jLabelGenerarExcelReporteDinamicoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoGrupoOpcion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoGrupoOpcion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoGrupoOpcion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoGrupoOpcion.setToolTipText("Generar EXCEL"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		//this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsGrupoOpcion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsGrupoOpcion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoGrupoOpcion.add(this.jButtonGenerarExcelReporteDinamicoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoOpcion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoOpcion.add(this.jComboBoxTiposReportesDinamicoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoGrupoOpcion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoGrupoOpcion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGrupoOpcion.add(this.jLabelTiposArchivoReporteDinamicoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoOpcion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoOpcion.add(this.jComboBoxTiposArchivosReportesDinamicoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoGrupoOpcion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoGrupoOpcion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoGrupoOpcion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoGrupoOpcion.setToolTipText("Generar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoOpcion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoOpcion.add(this.jButtonGenerarReporteDinamicoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoGrupoOpcion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoGrupoOpcion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoGrupoOpcion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoGrupoOpcion.setToolTipText("Cancelar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoOpcion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoOpcion.add(this.jButtonCerrarReporteDinamicoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalGrupoOpcion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoGrupoOpcion= new JScrollPane(jPanelReporteDinamicoGrupoOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoGrupoOpcion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGrupoOpcion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGrupoOpcion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Opcions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsGrupoOpcion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoGrupoOpcion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoGrupoOpcion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalGrupoOpcion);
		this.jInternalFrameReporteDinamicoGrupoOpcion.getContentPane().add(this.jScrollPanelReporteDinamicoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionGrupoOpcion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionGrupoOpcion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionGrupoOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionGrupoOpcion.setName("jPanelImportacionGrupoOpcion"); 
		
		this.jPanelImportacionGrupoOpcion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGrupoOpcion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGrupoOpcion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionGrupoOpcion.setLayout(gridaBagLayoutImportacionGrupoOpcion);
		
		
		this.jInternalFrameImportacionGrupoOpcion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionGrupoOpcion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionGrupoOpcion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGrupoOpcion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionGrupoOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGrupoOpcion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGrupoOpcion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionGrupoOpcion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGrupoOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGrupoOpcion.setResizable(true);
	    this.jInternalFrameImportacionGrupoOpcion.setClosable(true);
	    this.jInternalFrameImportacionGrupoOpcion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionGrupoOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGrupoOpcion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGrupoOpcion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionGrupoOpcion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGrupoOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGrupoOpcion.setResizable(true);
	    this.jInternalFrameImportacionGrupoOpcion.setClosable(true);
	    this.jInternalFrameImportacionGrupoOpcion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionGrupoOpcion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGrupoOpcion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGrupoOpcion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Opcions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionGrupoOpcion = new JLabelMe();

		this.jLabelArchivoImportacionGrupoOpcion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoOpcion.gridy = iPosYImportacion;		
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGrupoOpcion.add(this.jLabelArchivoImportacionGrupoOpcion, this.gridBagConstraintsGrupoOpcion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionGrupoOpcion = new JFileChooser();		
		this.jFileChooserImportacionGrupoOpcion.setToolTipText("ESCOGER ARCHIVO"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionGrupoOpcion = new JButtonMe();
		this.jButtonAbrirImportacionGrupoOpcion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionGrupoOpcion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionGrupoOpcion.setToolTipText("Generar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoOpcion.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoOpcion.add(this.jButtonAbrirImportacionGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionGrupoOpcion = new JLabelMe();

		this.jLabelPathArchivoImportacionGrupoOpcion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoOpcion.gridy = iPosYImportacion;		
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGrupoOpcion.add(this.jLabelPathArchivoImportacionGrupoOpcion, this.gridBagConstraintsGrupoOpcion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionGrupoOpcion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionGrupoOpcion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGrupoOpcion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGrupoOpcion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoOpcion.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoOpcion.add(this.jTextFieldPathArchivoImportacionGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionGrupoOpcion = new JButtonMe();
		this.jButtonGenerarImportacionGrupoOpcion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionGrupoOpcion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionGrupoOpcion.setToolTipText("Generar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoOpcion.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoOpcion.add(this.jButtonGenerarImportacionGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionGrupoOpcion = new JButtonMe();
		this.jButtonCerrarImportacionGrupoOpcion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionGrupoOpcion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionGrupoOpcion.setToolTipText("Cancelar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoOpcion.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoOpcion.add(this.jButtonCerrarImportacionGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalGrupoOpcion = new GridBagLayout();
		
		this.jScrollPanelImportacionGrupoOpcion= new JScrollPane(jPanelImportacionGrupoOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy =iPosYImportacion;
		this.gridBagConstraintsGrupoOpcion.gridx =iPosXImportacion;
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionGrupoOpcion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionGrupoOpcion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalGrupoOpcion);
		this.jInternalFrameImportacionGrupoOpcion.getContentPane().add(this.jScrollPanelImportacionGrupoOpcion, this.gridBagConstraintsGrupoOpcion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByGrupoOpcion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByGrupoOpcion = new JButtonMe();
			this.jButtonAbrirOrderByGrupoOpcion.setText("Orden");
			this.jButtonAbrirOrderByGrupoOpcion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGrupoOpcion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByGrupoOpcion";
			inputMap = this.jButtonAbrirOrderByGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByGrupoOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByGrupoOpcion"));
		
		
			GridBagLayout gridaBagLayoutOrderByGrupoOpcion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByGrupoOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByGrupoOpcion.setName("jPanelOrderByGrupoOpcion"); 
			
			this.jPanelOrderByGrupoOpcion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGrupoOpcion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGrupoOpcion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByGrupoOpcion.setLayout(gridaBagLayoutOrderByGrupoOpcion);
			
			
			this.jTableDatosGrupoOpcionOrderBy = new JTableMe();        
			this.jTableDatosGrupoOpcionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosGrupoOpcionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosGrupoOpcionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosGrupoOpcionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosGrupoOpcionOrderBy.setViewportView(this.jTableDatosGrupoOpcionOrderBy);
			this.jTableDatosGrupoOpcionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosGrupoOpcionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByGrupoOpcion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByGrupoOpcion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByGrupoOpcion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteGrupoOpcion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByGrupoOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByGrupoOpcion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByGrupoOpcion.setTitle("Orden");
			this.jInternalFrameOrderByGrupoOpcion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByGrupoOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByGrupoOpcion.setResizable(true);
			this.jInternalFrameOrderByGrupoOpcion.setClosable(true);
			this.jInternalFrameOrderByGrupoOpcion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByGrupoOpcion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGrupoOpcion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGrupoOpcion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Opcions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsGrupoOpcion.gridx =iPosXOrderBy;
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsGrupoOpcion.ipady =150;
				
			this.jPanelOrderByGrupoOpcion.add(jScrollPanelDatosGrupoOpcionOrderBy, this.gridBagConstraintsGrupoOpcion);//this.jTableDatosGrupoOpcionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByGrupoOpcion = new JButtonMe();
			this.jButtonCerrarOrderByGrupoOpcion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByGrupoOpcion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByGrupoOpcion.setToolTipText("Cancelar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsGrupoOpcion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByGrupoOpcion.add(this.jButtonCerrarOrderByGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalGrupoOpcion = new GridBagLayout();
			
			this.jScrollPanelOrderByGrupoOpcion= new JScrollPane(jPanelOrderByGrupoOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.gridy =iPosYOrderBy;
			this.gridBagConstraintsGrupoOpcion.gridx =iPosXOrderBy;
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByGrupoOpcion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByGrupoOpcion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalGrupoOpcion);
			
			this.jInternalFrameOrderByGrupoOpcion.getContentPane().add(this.jScrollPanelOrderByGrupoOpcion, this.gridBagConstraintsGrupoOpcion);			
		
		} else {
			this.jButtonAbrirOrderByGrupoOpcion = new JButtonMe();
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
		int iWidthTableCalculado=0;//1530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.grupoopcionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosGrupoOpcion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosGrupoOpcion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosGrupoOpcion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosGrupoOpcion.getRowHeight();//GrupoOpcionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > GrupoOpcionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGrupoOpcion.isSelected()) {
					iHeightTable=GrupoOpcionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GrupoOpcionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GrupoOpcionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > GrupoOpcionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGrupoOpcion.isSelected()) {
					iHeightTable=GrupoOpcionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GrupoOpcionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GrupoOpcionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosGrupoOpcion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGrupoOpcion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGrupoOpcion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosGrupoOpcion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGrupoOpcion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGrupoOpcion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByGrupoOpcion!=null && this.jInternalFrameOrderByGrupoOpcion.getjTableDatosOrderBy()!=null) {
			//if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByGrupoOpcion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByGrupoOpcion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByGrupoOpcion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByGrupoOpcion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByGrupoOpcion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByGrupoOpcion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByGrupoOpcion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosGrupoOpcion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGrupoOpcion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGrupoOpcion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=grupoopcionLogic.getGrupoOpcions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=grupoopcions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<GrupoOpcion> TraerGrupoOpcionBeans(List<GrupoOpcion> grupoopcions,ArrayList<Classe> classes)throws Exception {
		try {
			for(GrupoOpcion grupoopcion:grupoopcions) {
					
				if(!(GrupoOpcionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || GrupoOpcionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					grupoopcion.setsDetalleGeneralEntityReporte(GrupoOpcionConstantesFunciones.getGrupoOpcionDescripcion(grupoopcion));
										
					grupoopcion.setestado_descripcion(GrupoOpcionConstantesFunciones.getestadoDescripcion(grupoopcion));	
					
					

					if(grupoopcion.getUsuarioOpcions()!=null && Funciones.existeClass(classes,UsuarioOpcion.class)) {
						try{grupoopcion.setusuarioopcionsDescripcionReporte(new JRBeanCollectionDataSource(UsuarioOpcionJInternalFrame.TraerUsuarioOpcionBeans(grupoopcion.getUsuarioOpcions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(grupoopcion.getOpcions()!=null && Funciones.existeClass(classes,Opcion.class)) {
						try{grupoopcion.setopcionsDescripcionReporte(new JRBeanCollectionDataSource(OpcionJInternalFrame.TraerOpcionBeans(grupoopcion.getOpcions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(grupoopcion.getPerfilOpcions()!=null && Funciones.existeClass(classes,PerfilOpcion.class)) {
						try{grupoopcion.setperfilopcionsDescripcionReporte(new JRBeanCollectionDataSource(PerfilOpcionJInternalFrame.TraerPerfilOpcionBeans(grupoopcion.getPerfilOpcions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//grupoopcion.setsDetalleGeneralEntityReporte(grupoopcion.getsDetalleGeneralEntityReporte());
										
				}
				
				//grupoopcionbeans.add(grupoopcionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return grupoopcions;
    }
	//PARA REPORTES FIN
}
