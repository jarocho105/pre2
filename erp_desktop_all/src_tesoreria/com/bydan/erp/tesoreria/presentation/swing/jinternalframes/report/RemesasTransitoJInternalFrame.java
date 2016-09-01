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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.RemesasTransitoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
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
public class RemesasTransitoJInternalFrame extends RemesasTransitoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRemesasTransito;
	
	protected JMenuBar jmenuBarRemesasTransito;
	
	protected JMenu jmenuRemesasTransito;
	protected JMenu jmenuDatosRemesasTransito;
	protected JMenu jmenuArchivoRemesasTransito;
	protected JMenu jmenuAccionesRemesasTransito;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRemesasTransito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRemesasTransito;	
	protected GridBagConstraints gridBagConstraintsRemesasTransito;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RemesasTransitoDetalleFormJInternalFrame jInternalFrameDetalleFormRemesasTransito;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRemesasTransito;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRemesasTransito;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public RemesasTransitoSessionBean remesastransitoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RemesasTransito> remesastransitos;		
	public List<RemesasTransito> remesastransitosEliminados;	
	public List<RemesasTransito> remesastransitosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRemesasTransito;		
	protected JButton jButtonAbrirOrderByRemesasTransito;
	
	
	//protected JPanel jPanelOrderByRemesasTransito;
	//public JScrollPane jScrollPanelOrderByRemesasTransito;	
	//protected JButton jButtonCerrarOrderByRemesasTransito;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RemesasTransitoLogic remesastransitoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRemesasTransito;
	public JScrollPane jScrollPanelDatosEdicionRemesasTransito;
	public JScrollPane jScrollPanelDatosGeneralRemesasTransito;
    
	
	
	//public JScrollPane jScrollPanelDatosRemesasTransitoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRemesasTransito;
	//public JScrollPane jScrollPanelImportacionRemesasTransito;
	
	
	
	protected JPanel jPanelAccionesRemesasTransito;
	
    protected JPanel jPanelPaginacionRemesasTransito;
    protected JPanel jPanelParametrosReportesRemesasTransito;
	protected JPanel jPanelParametrosReportesAccionesRemesasTransito;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RemesasTransito;
	protected JPanel jPanelParametrosAuxiliar2RemesasTransito;
	protected JPanel jPanelParametrosAuxiliar3RemesasTransito;
	protected JPanel jPanelParametrosAuxiliar4RemesasTransito;
	//protected JPanel jPanelParametrosAuxiliar5RemesasTransito;
	
	
	
	//protected JPanel jPanelReporteDinamicoRemesasTransito;
	//protected JPanel jPanelImportacionRemesasTransito;
	
	
	public JTable jTableDatosRemesasTransito;
	
	
	
	//public JTable jTableDatosRemesasTransitoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRemesasTransito;
	protected JButton jButtonDuplicarRemesasTransito;
	protected JButton jButtonCopiarRemesasTransito;
	protected JButton jButtonVerFormRemesasTransito;
	protected JButton jButtonNuevoRelacionesRemesasTransito;
	protected JButton jButtonModificarRemesasTransito;
	
    protected JButton jButtonGuardarCambiosTablaRemesasTransito;
	protected JButton jButtonCerrarRemesasTransito;
	
	
	protected JButton jButtonRecargarInformacionRemesasTransito;
	protected JButton jButtonProcesarInformacionRemesasTransito;
	
	
	protected JButton jButtonAnterioresRemesasTransito;
	protected JButton jButtonSiguientesRemesasTransito;
	protected JButton jButtonNuevoGuardarCambiosRemesasTransito;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRemesasTransito;
	//protected JButton jButtonCerrarReporteDinamicoRemesasTransito;
	//protected JButton jButtonGenerarExcelReporteDinamicoRemesasTransito;	
	
	
	
	//protected JButton jButtonAbrirImportacionRemesasTransito;
	//protected JButton jButtonGenerarImportacionRemesasTransito;
	//protected JButton jButtonCerrarImportacionRemesasTransito;
	//protected JFileChooser jFileChooserImportacionRemesasTransito;
	//protected File fileImportacionRemesasTransito;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRemesasTransito;
	protected JButton jButtonDuplicarToolBarRemesasTransito;
	protected JButton jButtonNuevoRelacionesToolBarRemesasTransito;
	
	
	public JButton jButtonGuardarCambiosToolBarRemesasTransito;
	protected JButton jButtonCopiarToolBarRemesasTransito;
	protected JButton jButtonVerFormToolBarRemesasTransito;
	public JButton jButtonGuardarCambiosTablaToolBarRemesasTransito;
	protected JButton jButtonMostrarOcultarTablaToolBarRemesasTransito;
	protected JButton jButtonCerrarToolBarRemesasTransito;
	
	protected JButton jButtonRecargarInformacionToolBarRemesasTransito;
	protected JButton jButtonProcesarInformacionToolBarRemesasTransito;
	protected JButton jButtonAnterioresToolBarRemesasTransito;
	protected JButton jButtonSiguientesToolBarRemesasTransito;
	protected JButton jButtonNuevoGuardarCambiosToolBarRemesasTransito;
	protected JButton jButtonAbrirOrderByToolBarRemesasTransito;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRemesasTransito;
	protected JMenuItem jMenuItemDuplicarRemesasTransito;
	protected JMenuItem jMenuItemNuevoRelacionesRemesasTransito;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRemesasTransito;
	protected JMenuItem jMenuItemCopiarRemesasTransito;
	protected JMenuItem jMenuItemVerFormRemesasTransito;
	protected JMenuItem jMenuItemGuardarCambiosTablaRemesasTransito;
	protected JMenuItem jMenuItemCerrarRemesasTransito;
	protected JMenuItem jMenuItemDetalleCerrarRemesasTransito;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRemesasTransito;
	protected JMenuItem jMenuItemDetalleMostarOcultarRemesasTransito;
	
	protected JMenuItem jMenuItemRecargarInformacionRemesasTransito;
	protected JMenuItem jMenuItemProcesarInformacionRemesasTransito;
	protected JMenuItem jMenuItemAnterioresRemesasTransito;
	protected JMenuItem jMenuItemSiguientesRemesasTransito;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRemesasTransito;
	protected JMenuItem jMenuItemAbrirOrderByRemesasTransito;
	protected JMenuItem jMenuItemMostrarOcultarRemesasTransito;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRemesasTransito;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRemesasTransito;
	protected JCheckBox jCheckBoxSeleccionadosRemesasTransito;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRemesasTransito;
	protected JCheckBox jCheckBoxConGraficoReporteRemesasTransito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRemesasTransito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRemesasTransito;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRemesasTransito;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRemesasTransito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRemesasTransito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRemesasTransito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRemesasTransito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRemesasTransito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRemesasTransito;
	protected JTextField jTextFieldValorCampoGeneralRemesasTransito;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRemesasTransito;
	//public JList<Reporte> jListColumnasSelectReporteRemesasTransito;
	//public JScrollPane jScrollColumnasSelectReporteRemesasTransito;
	
	//public JLabel jLabelRelacionesSelectReporteRemesasTransito;
	//public JList<Reporte> jListRelacionesSelectReporteRemesasTransito;
	//public JScrollPane jScrollRelacionesSelectReporteRemesasTransito;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRemesasTransito;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRemesasTransito;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRemesasTransito;
	//public JLabel jLabelTiposArchivoReporteDinamicoRemesasTransito;
	
		
	//public JLabel jLabelArchivoImportacionRemesasTransito;	
	//public JLabel jLabelPathArchivoImportacionRemesasTransito;
	//protected JTextField jTextFieldPathArchivoImportacionRemesasTransito;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRemesasTransito;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRemesasTransito;
	
	//public JLabel jLabelColumnaCategoriaValorRemesasTransito;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRemesasTransito;
	
	//public JLabel jLabelColumnasValoresGraficoRemesasTransito;
	//public JList<Reporte> jListColumnasValoresGraficoRemesasTransito;
	//public JScrollPane jScrollColumnasValoresGraficoRemesasTransito;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRemesasTransito;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRemesasTransito;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRemesasTransito;
	public JPanel jPanelBusquedaRemesasTransitoRemesasTransito;
	public JButton jButtonBusquedaRemesasTransitoRemesasTransito;
	
	public JPanel jPanelIdIdBusquedaRemesasTransitoRemesasTransito;
	public JLabel jLabelidBusquedaRemesasTransitoRemesasTransito;
	public JTextFieldMe jLabelidRemesasTransitoBusquedaRemesasTransito;
	public JButton jButtonidBusquedaRemesasTransitoRemesasTransitoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RemesasTransitoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RemesasTransito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RemesasTransitoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RemesasTransito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RemesasTransitoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RemesasTransito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RemesasTransitoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RemesasTransito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRemesasTransito)	{
		this.jButtonRecargarInformacionRemesasTransito = jButtonRecargarInformacionRemesasTransito;
	}
	
	public JButton getjButtonProcesarInformacionRemesasTransito() {
		return this.jButtonProcesarInformacionRemesasTransito;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRemesasTransito)	{
		this.jButtonProcesarInformacionRemesasTransito = jButtonProcesarInformacionRemesasTransito;
	}
	
	
	public JButton getjButtonRecargarInformacionRemesasTransito() {
		return this.jButtonRecargarInformacionRemesasTransito;
	}
	
	
	public List<RemesasTransito> getremesastransitos() {
		return this.remesastransitos;
	}

	public void setremesastransitos(List<RemesasTransito> remesastransitos) {
		this.remesastransitos = remesastransitos;
	}
	
	public List<RemesasTransito> getremesastransitosAux() {
		return this.remesastransitosAux;
	}

	public void setremesastransitosAux(List<RemesasTransito> remesastransitosAux) {
		this.remesastransitosAux = remesastransitosAux;
	}
	
	public List<RemesasTransito> getremesastransitosEliminados() {
		return this.remesastransitosEliminados;
	}

	public void setRemesasTransitosEliminados(List<RemesasTransito> remesastransitosEliminados) {
		this.remesastransitosEliminados = remesastransitosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRemesasTransito() {
		return jComboBoxTiposSeleccionarRemesasTransito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRemesasTransito(
			JComboBox jComboBoxTiposSeleccionarRemesasTransito) {
		this.jComboBoxTiposSeleccionarRemesasTransito = jComboBoxTiposSeleccionarRemesasTransito;
	}
	
	public void setBorderResaltarTiposSeleccionarRemesasTransito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRemesasTransito.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRemesasTransito .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRemesasTransito() {
		return jTextFieldValorCampoGeneralRemesasTransito;
	}

	public void setjTextFieldValorCampoGeneralRemesasTransito(
			JTextField jTextFieldValorCampoGeneralRemesasTransito) {
		this.jTextFieldValorCampoGeneralRemesasTransito = jTextFieldValorCampoGeneralRemesasTransito;
	}

	public void setBorderResaltarValorCampoGeneralRemesasTransito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRemesasTransito.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRemesasTransito .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRemesasTransito() {
		return this.jCheckBoxSeleccionarTodosRemesasTransito;
	}

	public void setjCheckBoxSeleccionarTodosRemesasTransito(
			JCheckBox jCheckBoxSeleccionarTodosRemesasTransito) {
		this.jCheckBoxSeleccionarTodosRemesasTransito = jCheckBoxSeleccionarTodosRemesasTransito;
	}

	public void setBorderResaltarSeleccionarTodosRemesasTransito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRemesasTransito.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRemesasTransito .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRemesasTransito() {
		return this.jCheckBoxSeleccionadosRemesasTransito;
	}

	public void setjCheckBoxSeleccionadosRemesasTransito(
			JCheckBox jCheckBoxSeleccionadosRemesasTransito) {
		this.jCheckBoxSeleccionadosRemesasTransito = jCheckBoxSeleccionadosRemesasTransito;
	}
	
	public void setBorderResaltarSeleccionadosRemesasTransito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRemesasTransito.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRemesasTransito .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRemesasTransito() {
		return this.jComboBoxTiposArchivosReportesRemesasTransito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRemesasTransito(
			JComboBox jComboBoxTiposArchivosReportesRemesasTransito) {
		this.jComboBoxTiposArchivosReportesRemesasTransito = jComboBoxTiposArchivosReportesRemesasTransito;
	}

	public void setBorderResaltarTiposArchivosReportesRemesasTransito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRemesasTransito.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRemesasTransito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRemesasTransito() {
		return this.jComboBoxTiposReportesRemesasTransito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRemesasTransito(
			JComboBox jComboBoxTiposReportesRemesasTransito) {
		this.jComboBoxTiposReportesRemesasTransito = jComboBoxTiposReportesRemesasTransito;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRemesasTransito() {
	//	return jComboBoxTiposReportesDinamicoRemesasTransito;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRemesasTransito(
	//		JComboBox jComboBoxTiposReportesDinamicoRemesasTransito) {
	//	this.jComboBoxTiposReportesDinamicoRemesasTransito = jComboBoxTiposReportesDinamicoRemesasTransito;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRemesasTransito() {
	//	return jComboBoxTiposArchivosReportesDinamicoRemesasTransito;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRemesasTransito(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRemesasTransito) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRemesasTransito = jComboBoxTiposArchivosReportesDinamicoRemesasTransito;
	//}
	
	public void setBorderResaltarTiposReportesRemesasTransito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRemesasTransito.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRemesasTransito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRemesasTransito() {
		return this.jComboBoxTiposGraficosReportesRemesasTransito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRemesasTransito(
			JComboBox jComboBoxTiposGraficosReportesRemesasTransito) {
		this.jComboBoxTiposGraficosReportesRemesasTransito = jComboBoxTiposGraficosReportesRemesasTransito;
	}
	
	public void setBorderResaltarTiposGraficosReportesRemesasTransito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRemesasTransito.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRemesasTransito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRemesasTransito() {
		return this.jComboBoxTiposPaginacionRemesasTransito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRemesasTransito(
			JComboBox jComboBoxTiposPaginacionRemesasTransito) {
		this.jComboBoxTiposPaginacionRemesasTransito = jComboBoxTiposPaginacionRemesasTransito;
	}
	
	public void setBorderResaltarTiposPaginacionRemesasTransito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRemesasTransito.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRemesasTransito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRemesasTransito() {
		return this.jComboBoxTiposRelacionesRemesasTransito;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRemesasTransito() {
		return this.jComboBoxTiposAccionesRemesasTransito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRemesasTransito(
			JComboBox jComboBoxTiposRelacionesRemesasTransito) {
		this.jComboBoxTiposRelacionesRemesasTransito = jComboBoxTiposRelacionesRemesasTransito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRemesasTransito(
			JComboBox jComboBoxTiposAccionesRemesasTransito) {
		this.jComboBoxTiposAccionesRemesasTransito = jComboBoxTiposAccionesRemesasTransito;
	}
	
	public void setBorderResaltarTiposRelacionesRemesasTransito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRemesasTransito.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRemesasTransito .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRemesasTransito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRemesasTransito.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRemesasTransito .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRemesasTransito() {
	//	return jCheckBoxConGraficoDinamicoRemesasTransito;
	//}

	//public void setjCheckBoxConGraficoDinamicoRemesasTransito(
	//		JCheckBox jCheckBoxConGraficoDinamicoRemesasTransito) {
	//	this.jCheckBoxConGraficoDinamicoRemesasTransito = jCheckBoxConGraficoDinamicoRemesasTransito;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRemesasTransito() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRemesasTransito.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRemesasTransito .setBorder(borderResaltar);		
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
		this.remesastransitoSessionBean=new RemesasTransitoSessionBean();
		
		this.remesastransitoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.remesastransitoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.remesastransitoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RemesasTransitoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RemesasTransitoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RemesasTransitoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RemesasTransitoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RemesasTransitoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Remesas Transito MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
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
		
		RemesasTransitoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RemesasTransito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRemesasTransito= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRemesasTransito,this.jTtoolBarRemesasTransito,
							"nuevo","nuevo","Nuevo"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRemesasTransito,this.jTtoolBarRemesasTransito,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRemesasTransito,this.jTtoolBarRemesasTransito,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRemesasTransito,this.jTtoolBarRemesasTransito,
							"duplicar","duplicar","Duplicar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRemesasTransito,this.jTtoolBarRemesasTransito,
							"copiar","copiar","Copiar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRemesasTransito,this.jTtoolBarRemesasTransito,
							"ver_form","ver_form","Ver"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRemesasTransito,this.jTtoolBarRemesasTransito,
							"recargar","recargar","Buscar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRemesasTransito,this.jTtoolBarRemesasTransito,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRemesasTransito,this.jTtoolBarRemesasTransito,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRemesasTransito,this.jTtoolBarRemesasTransito,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRemesasTransito,this.jTtoolBarRemesasTransito,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRemesasTransito,this.jTtoolBarRemesasTransito,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRemesasTransito,this.jTtoolBarRemesasTransito,
							"cerrar","cerrar","Salir"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRemesasTransito=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRemesasTransito;
			
				this.jButtonProcesarInformacionToolBarRemesasTransito=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRemesasTransito;
				
		//protected JButton jButtonModificarToolBarRemesasTransito;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRemesasTransito=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRemesasTransito=new JMenuMe("General");
		this.jmenuArchivoRemesasTransito=new JMenuMe("Archivo");
		this.jmenuAccionesRemesasTransito=new JMenuMe("Acciones");
		this.jmenuDatosRemesasTransito=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRemesasTransito= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRemesasTransito.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRemesasTransito,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRemesasTransito= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRemesasTransito.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRemesasTransito,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRemesasTransito= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRemesasTransito.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRemesasTransito,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRemesasTransito= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRemesasTransito.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRemesasTransito,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRemesasTransito= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRemesasTransito.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRemesasTransito,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRemesasTransito= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRemesasTransito.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRemesasTransito,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRemesasTransito= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRemesasTransito.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRemesasTransito,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRemesasTransito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRemesasTransito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRemesasTransito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRemesasTransito= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRemesasTransito.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRemesasTransito,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRemesasTransito= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRemesasTransito.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRemesasTransito,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRemesasTransito= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRemesasTransito.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRemesasTransito,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRemesasTransito= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRemesasTransito.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRemesasTransito,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRemesasTransito= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRemesasTransito.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRemesasTransito,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRemesasTransito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRemesasTransito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRemesasTransito,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRemesasTransito= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRemesasTransito.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRemesasTransito,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRemesasTransito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRemesasTransito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRemesasTransito,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRemesasTransito= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRemesasTransito.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRemesasTransito,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRemesasTransito.add(this.jMenuItemCerrarRemesasTransito);
			
			this.jmenuAccionesRemesasTransito.add(this.jMenuItemNuevoRemesasTransito);
			this.jmenuAccionesRemesasTransito.add(this.jMenuItemNuevoGuardarCambiosRemesasTransito);
			this.jmenuAccionesRemesasTransito.add(this.jMenuItemNuevoRelacionesRemesasTransito);
			this.jmenuAccionesRemesasTransito.add(this.jMenuItemGuardarCambiosTablaRemesasTransito);		
			this.jmenuAccionesRemesasTransito.add(this.jMenuItemDuplicarRemesasTransito);		
			this.jmenuAccionesRemesasTransito.add(this.jMenuItemCopiarRemesasTransito);		
			this.jmenuAccionesRemesasTransito.add(this.jMenuItemVerFormRemesasTransito);		
			
			this.jmenuDatosRemesasTransito.add(this.jMenuItemRecargarInformacionRemesasTransito);				
			this.jmenuDatosRemesasTransito.add(this.jMenuItemAnterioresRemesasTransito);				
			this.jmenuDatosRemesasTransito.add(this.jMenuItemSiguientesRemesasTransito);				
			this.jmenuDatosRemesasTransito.add(this.jMenuItemAbrirOrderByRemesasTransito);				
			this.jmenuDatosRemesasTransito.add(this.jMenuItemMostrarOcultarRemesasTransito);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRemesasTransito.add(this.jMenuItemGuardarCambiosRemesasTransito);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRemesasTransito.add(this.jmenuArchivoRemesasTransito);		
			this.jmenuBarRemesasTransito.add(this.jmenuAccionesRemesasTransito);		
			this.jmenuBarRemesasTransito.add(this.jmenuDatosRemesasTransito);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRemesasTransito);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRemesasTransito() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaRemesasTransitoRemesasTransito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaRemesasTransitoRemesasTransito.setToolTipText("Buscar Por  ");
		this.jButtonBusquedaRemesasTransitoRemesasTransito= new JButtonMe();
		this.jButtonBusquedaRemesasTransitoRemesasTransito.setText("Buscar");
		this.jButtonBusquedaRemesasTransitoRemesasTransito.setToolTipText("Buscar Por  ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaRemesasTransitoRemesasTransito,"buscar_button","Buscar Por  ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaRemesasTransitoRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaRemesasTransitoRemesasTransito = new JLabelMe();
		jLabelidBusquedaRemesasTransitoRemesasTransito.setText("Id :");
		jLabelidBusquedaRemesasTransitoRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaRemesasTransitoRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaRemesasTransitoRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaRemesasTransitoRemesasTransito,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidRemesasTransitoBusquedaRemesasTransito= new JTextFieldMe();
		jLabelidRemesasTransitoBusquedaRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRemesasTransitoBusquedaRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRemesasTransitoBusquedaRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidRemesasTransitoBusquedaRemesasTransito.setVisible(false);




		this.jTabbedPaneBusquedasRemesasTransito=new JTabbedPane();


		this.jTabbedPaneBusquedasRemesasTransito.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasRemesasTransito.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasRemesasTransito.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRemesasTransito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRemesasTransito,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRemesasTransito = new RemesasTransitoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Remesas Transito DATOS");
			this.jInternalFrameDetalleFormRemesasTransito = new RemesasTransitoDetalleFormJInternalFrame(jDesktopPane,this.remesastransitoSessionBean.getConGuardarRelaciones(),this.remesastransitoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRemesasTransito = null;//new RemesasTransitoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRemesasTransito= new GridBagLayout();
		
		
		this.jTableDatosRemesasTransito = new JTableMe();      
		
		String sToolTipRemesasTransito="";
		sToolTipRemesasTransito=RemesasTransitoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRemesasTransito+="(Tesoreria.RemesasTransito)";
		}
		
		if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
			sToolTipRemesasTransito+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRemesasTransito.setToolTipText(sToolTipRemesasTransito);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRemesasTransito);
		this.jTableDatosRemesasTransito.setAutoCreateRowSorter(true);
		this.jTableDatosRemesasTransito.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRemesasTransito.setRowSelectionAllowed(true);
		this.jTableDatosRemesasTransito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRemesasTransito,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRemesasTransito = new JButtonMe();
		this.jButtonDuplicarRemesasTransito = new JButtonMe();
		this.jButtonCopiarRemesasTransito = new JButtonMe();
		this.jButtonVerFormRemesasTransito = new JButtonMe();
		this.jButtonNuevoRelacionesRemesasTransito = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRemesasTransito = new JButtonMe();
		this.jButtonCerrarRemesasTransito = new JButtonMe();
		
		this.jScrollPanelDatosRemesasTransito = new JScrollPane();   
        this.jScrollPanelDatosGeneralRemesasTransito = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRemesasTransito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Remesas Transito";
		
		if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Remesas Transitos" + this.sPath));
		} else {
			this.jScrollPanelDatosRemesasTransito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRemesasTransito.setToolTipText("Acciones");
        this.jPanelAccionesRemesasTransito.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRemesasTransito=new ReporteDinamicoJInternalFrame(RemesasTransitoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRemesasTransito();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRemesasTransito=new ImportacionJInternalFrame(RemesasTransitoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRemesasTransito();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRemesasTransito = new JButtonMe();
		
		this.jButtonAbrirOrderByRemesasTransito.setText("Orden");
		this.jButtonAbrirOrderByRemesasTransito.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRemesasTransito,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRemesasTransito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRemesasTransito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRemesasTransito,false,this);
			
			//this.cargarOrderByRemesasTransito(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRemesasTransito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRemesasTransito,true,this);
			
			//this.cargarOrderByRemesasTransito(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRemesasTransito.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosRemesasTransito.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosRemesasTransito.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosRemesasTransito.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRemesasTransito.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRemesasTransito.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRemesasTransito.setText("Nuevo");
		this.jButtonDuplicarRemesasTransito.setText("Duplicar");
		this.jButtonCopiarRemesasTransito.setText("Copiar");
		this.jButtonVerFormRemesasTransito.setText("Ver");
		this.jButtonNuevoRelacionesRemesasTransito.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRemesasTransito.setText("Guardar");
		this.jButtonCerrarRemesasTransito.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRemesasTransito,"nuevo_button","Nuevo",this.remesastransitoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRemesasTransito,"duplicar_button","Duplicar",this.remesastransitoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRemesasTransito,"copiar_button","Copiar",this.remesastransitoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRemesasTransito,"ver_form","Ver",this.remesastransitoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRemesasTransito,"nuevorelaciones_button","Nuevo Rel",this.remesastransitoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRemesasTransito,"guardarcambiostabla_button","Guardar",this.remesastransitoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRemesasTransito,"cerrar_button","Salir",this.remesastransitoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRemesasTransito.setToolTipText("Nuevo"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRemesasTransito.setToolTipText("Duplicar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRemesasTransito.setToolTipText("Copiar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRemesasTransito.setToolTipText("Ver"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRemesasTransito.setToolTipText("Nuevo Rel"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRemesasTransito.setToolTipText("Guardar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRemesasTransito.setToolTipText("Salir"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRemesasTransito";
		inputMap = this.jButtonNuevoRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRemesasTransito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRemesasTransito"));
		
		//DUPLICAR
		sMapKey = "DuplicarRemesasTransito";
		inputMap = this.jButtonDuplicarRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRemesasTransito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRemesasTransito"));
		
		//COPIAR
		sMapKey = "CopiarRemesasTransito";
		inputMap = this.jButtonCopiarRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRemesasTransito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRemesasTransito"));
		
		//VEr FORM
		sMapKey = "VerFormRemesasTransito";
		inputMap = this.jButtonVerFormRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRemesasTransito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRemesasTransito"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRemesasTransito";
		inputMap = this.jButtonNuevoRelacionesRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRemesasTransito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRemesasTransito"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRemesasTransito";
		inputMap = this.jButtonModificarRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRemesasTransito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRemesasTransito"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRemesasTransito";
		inputMap = this.jButtonCerrarRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRemesasTransito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRemesasTransito"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRemesasTransito";
		inputMap = this.jButtonGuardarCambiosTablaRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRemesasTransito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRemesasTransito"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRemesasTransito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRemesasTransito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRemesasTransito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RemesasTransito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RemesasTransito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RemesasTransito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RemesasTransito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RemesasTransito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRemesasTransito.setName("jPanelParametrosReportesRemesasTransito"); 
		
		this.jPanelParametrosReportesAccionesRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRemesasTransito.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRemesasTransito.setName("jPanelParametrosReportesAccionesRemesasTransito"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRemesasTransito = new JButtonMe();
		this.jButtonRecargarInformacionRemesasTransito.setText("Buscar");
		this.jButtonRecargarInformacionRemesasTransito.setToolTipText("Buscar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRemesasTransito,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionRemesasTransito.setVisible(false);
		
		
		this.jButtonProcesarInformacionRemesasTransito = new JButtonMe();
		this.jButtonProcesarInformacionRemesasTransito.setText("Procesar");
		this.jButtonProcesarInformacionRemesasTransito.setToolTipText("Procesar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRemesasTransito.setVisible(false);
			
		this.jButtonProcesarInformacionRemesasTransito.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRemesasTransito.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRemesasTransito.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRemesasTransito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRemesasTransito.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRemesasTransito.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRemesasTransito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRemesasTransito.setText("TIPO");       
		this.jComboBoxTiposReportesRemesasTransito.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRemesasTransito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRemesasTransito.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRemesasTransito.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRemesasTransito = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRemesasTransito.setText("Paginacion");
		this.jComboBoxTiposPaginacionRemesasTransito.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRemesasTransito = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRemesasTransito.setText("Accion");
		this.jComboBoxTiposRelacionesRemesasTransito.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRemesasTransito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRemesasTransito.setText("Accion");
		this.jComboBoxTiposAccionesRemesasTransito.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRemesasTransito = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRemesasTransito.setText("Accion");
		this.jComboBoxTiposSeleccionarRemesasTransito.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRemesasTransito=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRemesasTransito.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRemesasTransito.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRemesasTransito.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRemesasTransito = new JLabelMe();
		
		this.jLabelAccionesRemesasTransito.setText("Acciones");		
		this.jLabelAccionesRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRemesasTransito = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRemesasTransito.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRemesasTransito.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRemesasTransito = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRemesasTransito.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRemesasTransito.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRemesasTransito = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRemesasTransito.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRemesasTransito.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRemesasTransito = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRemesasTransito.setText("Graf.");
		this.jCheckBoxConGraficoReporteRemesasTransito.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRemesasTransito = new JButtonMe();
		//this.jButtonAnterioresRemesasTransito.setText("<<");
        this.jButtonAnterioresRemesasTransito.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRemesasTransito,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRemesasTransito = new JButtonMe();
		//this.jButtonSiguientesRemesasTransito.setText(">>");
        this.jButtonSiguientesRemesasTransito.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRemesasTransito,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRemesasTransito = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRemesasTransito.setText("Nue");
        this.jButtonNuevoGuardarCambiosRemesasTransito.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRemesasTransito,"nuevoguardarcambios_button","Nue",this.remesastransitoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRemesasTransito";
		inputMap = this.jButtonNuevoGuardarCambiosRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRemesasTransito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRemesasTransito"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRemesasTransito";
		inputMap = this.jButtonRecargarInformacionRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRemesasTransito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRemesasTransito"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRemesasTransito";
		inputMap = this.jButtonSiguientesRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRemesasTransito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRemesasTransito"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRemesasTransito";
		inputMap = this.jButtonAnterioresRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRemesasTransito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRemesasTransito"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRemesasTransito();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRemesasTransito.setMinimumSize(new Dimension(this.getWidth(),RemesasTransitoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RemesasTransitoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRemesasTransito.setMaximumSize(new Dimension(this.getWidth(),RemesasTransitoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RemesasTransitoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRemesasTransito.setPreferredSize(new Dimension(this.getWidth(),RemesasTransitoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RemesasTransitoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRemesasTransito = new GridBagLayout();

			this.jPanelPaginacionRemesasTransito.setLayout(gridaBagLayoutPaginacionRemesasTransito);						
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy = 0;
			this.gridBagConstraintsRemesasTransito.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRemesasTransito.add(this.jButtonAnterioresRemesasTransito, this.gridBagConstraintsRemesasTransito);
					
						
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRemesasTransito.gridy = 0;
			
			this.jPanelPaginacionRemesasTransito.add(this.jButtonNuevoGuardarCambiosRemesasTransito, this.gridBagConstraintsRemesasTransito);
						
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRemesasTransito.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRemesasTransito.gridy = 0;
			this.jPanelPaginacionRemesasTransito.add(this.jButtonSiguientesRemesasTransito, this.gridBagConstraintsRemesasTransito);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy = 1;
			this.gridBagConstraintsRemesasTransito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRemesasTransito.add(this.jButtonNuevoRemesasTransito, this.gridBagConstraintsRemesasTransito);
						
			
			
			if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
				this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRemesasTransito.gridy = 1;
				this.gridBagConstraintsRemesasTransito.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRemesasTransito.add(this.jButtonGuardarCambiosTablaRemesasTransito, this.gridBagConstraintsRemesasTransito);
			}
			
			
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy = 1;
			this.gridBagConstraintsRemesasTransito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRemesasTransito.add(this.jButtonDuplicarRemesasTransito, this.gridBagConstraintsRemesasTransito);
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy = 1;
			this.gridBagConstraintsRemesasTransito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRemesasTransito.add(this.jButtonCopiarRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy = 1;
			this.gridBagConstraintsRemesasTransito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRemesasTransito.add(this.jButtonVerFormRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy = 1;
			this.gridBagConstraintsRemesasTransito.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRemesasTransito.add(this.jButtonCerrarRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
		
		
		this.jButtonRecargarInformacionRemesasTransito.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRemesasTransito.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRemesasTransito.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRemesasTransito.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRemesasTransito.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRemesasTransito.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRemesasTransito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRemesasTransito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRemesasTransito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRemesasTransito.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRemesasTransito.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRemesasTransito.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRemesasTransito.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRemesasTransito.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRemesasTransito.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRemesasTransito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRemesasTransito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRemesasTransito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRemesasTransito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRemesasTransito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRemesasTransito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRemesasTransito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRemesasTransito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRemesasTransito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRemesasTransito.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRemesasTransito.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRemesasTransito.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRemesasTransito.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRemesasTransito.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRemesasTransito.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRemesasTransito.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRemesasTransito.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRemesasTransito.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRemesasTransito.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRemesasTransito.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRemesasTransito.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRemesasTransito = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRemesasTransito = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RemesasTransito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RemesasTransito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RemesasTransito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RemesasTransito = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRemesasTransito.setLayout(gridaBagParametrosReportesRemesasTransito);
			this.jPanelParametrosReportesAccionesRemesasTransito.setLayout(gridaBagParametrosReportesAccionesRemesasTransito);
			
			
			this.jPanelParametrosAuxiliar1RemesasTransito.setLayout(gridaBagParametrosAuxiliar1RemesasTransito);
			this.jPanelParametrosAuxiliar2RemesasTransito.setLayout(gridaBagParametrosAuxiliar2RemesasTransito);
			this.jPanelParametrosAuxiliar3RemesasTransito.setLayout(gridaBagParametrosAuxiliar3RemesasTransito);
			this.jPanelParametrosAuxiliar4RemesasTransito.setLayout(gridaBagParametrosAuxiliar4RemesasTransito);
			//this.jPanelParametrosAuxiliar5RemesasTransito.setLayout(gridaBagParametrosAuxiliar2RemesasTransito);			
			
			
			
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRemesasTransito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRemesasTransito.add(this.jButtonRecargarInformacionRemesasTransito, this.gridBagConstraintsRemesasTransito);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRemesasTransito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRemesasTransito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RemesasTransito.add(this.jComboBoxTiposPaginacionRemesasTransito, this.gridBagConstraintsRemesasTransito);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRemesasTransito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRemesasTransito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RemesasTransito.add(this.jCheckBoxConAltoMaximoTablaRemesasTransito, this.gridBagConstraintsRemesasTransito);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRemesasTransito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRemesasTransito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RemesasTransito.add(this.jComboBoxTiposArchivosReportesRemesasTransito, this.gridBagConstraintsRemesasTransito);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRemesasTransito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRemesasTransito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRemesasTransito.add(this.jPanelParametrosAuxiliar1RemesasTransito, this.gridBagConstraintsRemesasTransito);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRemesasTransito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RemesasTransito.add(this.jComboBoxTiposReportesRemesasTransito, this.gridBagConstraintsRemesasTransito);																		
			
			
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRemesasTransito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4RemesasTransito.add(this.jComboBoxTiposGraficosReportesRemesasTransito, this.gridBagConstraintsRemesasTransito);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRemesasTransito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRemesasTransito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRemesasTransito.add(this.jPanelParametrosAuxiliar4RemesasTransito, this.gridBagConstraintsRemesasTransito);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRemesasTransito.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRemesasTransito.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRemesasTransito.add(this.jComboBoxTiposReportesRemesasTransito, this.gridBagConstraintsRemesasTransito);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRemesasTransito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRemesasTransito.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRemesasTransito.add(this.jCheckBoxGenerarReporteRemesasTransito, this.gridBagConstraintsRemesasTransito);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRemesasTransito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRemesasTransito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRemesasTransito.add(this.jPanelParametrosAuxiliar2RemesasTransito, this.gridBagConstraintsRemesasTransito);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRemesasTransito.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRemesasTransito.add(this.jLabelAccionesRemesasTransito, this.gridBagConstraintsRemesasTransito);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
				this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRemesasTransito.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRemesasTransito.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRemesasTransito.add(this.jButtonAbrirOrderByRemesasTransito, this.gridBagConstraintsRemesasTransito);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRemesasTransito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRemesasTransito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRemesasTransito.add(this.jComboBoxTiposSeleccionarRemesasTransito, this.gridBagConstraintsRemesasTransito);			
			
			
			/*
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRemesasTransito.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRemesasTransito.add(this.jCheckBoxSeleccionarTodosRemesasTransito, this.gridBagConstraintsRemesasTransito);
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRemesasTransito.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRemesasTransito.add(this.jCheckBoxConGraficoReporteRemesasTransito, this.gridBagConstraintsRemesasTransito);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRemesasTransito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RemesasTransito.add(this.jCheckBoxSeleccionarTodosRemesasTransito, this.gridBagConstraintsRemesasTransito);															
				
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRemesasTransito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RemesasTransito.add(this.jCheckBoxSeleccionadosRemesasTransito, this.gridBagConstraintsRemesasTransito);															
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRemesasTransito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RemesasTransito.add(this.jCheckBoxConGraficoReporteRemesasTransito, this.gridBagConstraintsRemesasTransito);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRemesasTransito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRemesasTransito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRemesasTransito.add(this.jPanelParametrosAuxiliar3RemesasTransito, this.gridBagConstraintsRemesasTransito);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRemesasTransito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRemesasTransito.add(this.jComboBoxTiposAccionesRemesasTransito, this.gridBagConstraintsRemesasTransito);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRemesasTransito = new GridBagLayout();

			this.jScrollPanelDatosRemesasTransito.setLayout(gridaBagLayoutDatosRemesasTransito);
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy = 0;
			this.gridBagConstraintsRemesasTransito.gridx = 0;
			
			this.jScrollPanelDatosRemesasTransito.add(this.jTableDatosRemesasTransito, this.gridBagConstraintsRemesasTransito);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRemesasTransito.setViewportView(this.jTableDatosRemesasTransito);
		this.jTableDatosRemesasTransito.setFillsViewportHeight(true);
		this.jTableDatosRemesasTransito.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRemesasTransito= new GridBagLayout();
		this.jPanelAccionesRemesasTransito.setLayout(gridaBagLayoutAccionesRemesasTransito);
		
		
		/*	
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRemesasTransito.gridy = 0;
		this.gridBagConstraintsRemesasTransito.gridx = 0;
			
		this.jPanelAccionesRemesasTransito.add(this.jButtonNuevoRemesasTransito, this.gridBagConstraintsRemesasTransito);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaRemesasTransitoRemesasTransito= new GridBagLayout();
		gridaBagLayoutBusquedaRemesasTransitoRemesasTransito.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaRemesasTransitoRemesasTransito.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaRemesasTransitoRemesasTransito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaRemesasTransitoRemesasTransito.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaRemesasTransitoRemesasTransito.setLayout(gridaBagLayoutBusquedaRemesasTransitoRemesasTransito);

		gridBagConstraintsRemesasTransito = new GridBagConstraints();
		gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRemesasTransito.gridy = 0;
		gridBagConstraintsRemesasTransito.gridx = 0;
		jPanelBusquedaRemesasTransitoRemesasTransito.add(jLabelidBusquedaRemesasTransitoRemesasTransito, gridBagConstraintsRemesasTransito);

		gridBagConstraintsRemesasTransito = new GridBagConstraints();
		gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRemesasTransito.gridy = 0;
		gridBagConstraintsRemesasTransito.gridx = 1;
		jPanelBusquedaRemesasTransitoRemesasTransito.add(jLabelidRemesasTransitoBusquedaRemesasTransito, gridBagConstraintsRemesasTransito);

		gridBagConstraintsRemesasTransito = new GridBagConstraints();
		gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRemesasTransito.gridy = 1;
		gridBagConstraintsRemesasTransito.gridx =1;
		jPanelBusquedaRemesasTransitoRemesasTransito.add(jButtonBusquedaRemesasTransitoRemesasTransito, gridBagConstraintsRemesasTransito);

		jTabbedPaneBusquedasRemesasTransito.addTab("1.-Por  ", jPanelBusquedaRemesasTransitoRemesasTransito);
		jTabbedPaneBusquedasRemesasTransito.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRemesasTransito = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRemesasTransito);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.remesastransitoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();						
			this.gridBagConstraintsRemesasTransito.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRemesasTransito.gridx = 0;		
			//this.gridBagConstraintsRemesasTransito.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRemesasTransito.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRemesasTransito, this.gridBagConstraintsRemesasTransito);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRemesasTransito.gridx = 0;		
		//this.gridBagConstraintsRemesasTransito.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRemesasTransito.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRemesasTransito);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRemesasTransito.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRemesasTransito.gridx = 0;		
			this.gridBagConstraintsRemesasTransito.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRemesasTransito.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRemesasTransito, this.gridBagConstraintsRemesasTransito);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRemesasTransito.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRemesasTransito, this.gridBagConstraintsRemesasTransito);								
		
		
		/*
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRemesasTransito.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRemesasTransito, this.gridBagConstraintsRemesasTransito);
		*/		
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRemesasTransito.gridx =0;
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRemesasTransito.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRemesasTransito, this.gridBagConstraintsRemesasTransito);
				
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRemesasTransito.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRemesasTransito, this.gridBagConstraintsRemesasTransito);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RemesasTransitoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRemesasTransito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRemesasTransito = new GridBagLayout();
			this.jPanelBusquedasParametrosRemesasTransito.setLayout(gridaBagLayoutBusquedasParametrosRemesasTransito);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRemesasTransito=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRemesasTransito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRemesasTransito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRemesasTransito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRemesasTransito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRemesasTransito, this.gridBagConstraintsRemesasTransito);
			
			
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRemesasTransito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
			
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRemesasTransito.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRemesasTransito, this.gridBagConstraintsRemesasTransito);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRemesasTransito;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRemesasTransito() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRemesasTransito = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRemesasTransito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRemesasTransito.setName("jPanelReporteDinamicoRemesasTransito"); 
		
		this.jPanelReporteDinamicoRemesasTransito.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRemesasTransito.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRemesasTransito.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRemesasTransito.setLayout(gridaBagLayoutReporteDinamicoRemesasTransito);
		
		
		this.jInternalFrameReporteDinamicoRemesasTransito= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRemesasTransito = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRemesasTransito= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRemesasTransito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRemesasTransito.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRemesasTransito.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRemesasTransito.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRemesasTransito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRemesasTransito.setResizable(true);
	    this.jInternalFrameReporteDinamicoRemesasTransito.setClosable(true);
	    this.jInternalFrameReporteDinamicoRemesasTransito.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRemesasTransito.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRemesasTransito.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRemesasTransito.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Remesas Transitos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRemesasTransito = new JLabelMe();

		this.jLabelColumnasSelectReporteRemesasTransito.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRemesasTransito.add(this.jLabelColumnasSelectReporteRemesasTransito, this.gridBagConstraintsRemesasTransito);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRemesasTransito = new JList<Reporte>();
		this.jListColumnasSelectReporteRemesasTransito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRemesasTransito.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRemesasTransito.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRemesasTransito.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRemesasTransito.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRemesasTransito=new JScrollPane(this.jListColumnasSelectReporteRemesasTransito);
			
			this.jScrollColumnasSelectReporteRemesasTransito.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRemesasTransito.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRemesasTransito.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRemesasTransito.add(this.jListColumnasSelectReporteRemesasTransito, this.gridBagConstraintsRemesasTransito);
		this.jPanelReporteDinamicoRemesasTransito.add(this.jScrollColumnasSelectReporteRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRemesasTransito = new JLabelMe();

		this.jLabelRelacionesSelectReporteRemesasTransito.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRemesasTransito = new JList<Reporte>();
		this.jListRelacionesSelectReporteRemesasTransito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRemesasTransito.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRemesasTransito.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRemesasTransito.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRemesasTransito.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRemesasTransito=new JScrollPane(this.jListRelacionesSelectReporteRemesasTransito);
			
			this.jScrollRelacionesSelectReporteRemesasTransito.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRemesasTransito.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRemesasTransito.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRemesasTransito = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRemesasTransito = new JComboBoxMe();
		this.jListColumnasValoresGraficoRemesasTransito = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRemesasTransito = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRemesasTransito.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRemesasTransito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRemesasTransito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRemesasTransito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRemesasTransito = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRemesasTransito.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRemesasTransito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRemesasTransito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRemesasTransito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoRemesasTransito = new JLabelMe();

		this.jLabelConGraficoDinamicoRemesasTransito.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRemesasTransito.add(this.jLabelConGraficoDinamicoRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoRemesasTransito = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoRemesasTransito.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoRemesasTransito.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoRemesasTransito.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRemesasTransito.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRemesasTransito.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRemesasTransito.add(this.jCheckBoxConGraficoDinamicoRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoRemesasTransito = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoRemesasTransito.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRemesasTransito.add(this.jLabelColumnaCategoriaGraficoRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoRemesasTransito = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRemesasTransito.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoRemesasTransito.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoRemesasTransito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRemesasTransito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRemesasTransito.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoRemesasTransito.add(this.jComboBoxColumnaCategoriaGraficoRemesasTransito, this.gridBagConstraintsRemesasTransito);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorRemesasTransito = new JLabelMe();

		this.jLabelColumnaCategoriaValorRemesasTransito.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRemesasTransito.add(this.jLabelColumnaCategoriaValorRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorRemesasTransito = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorRemesasTransito.setText("Accion");
        this.jComboBoxColumnaCategoriaValorRemesasTransito.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorRemesasTransito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRemesasTransito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRemesasTransito.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoRemesasTransito.add(this.jComboBoxColumnaCategoriaValorRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoRemesasTransito = new JLabelMe();

		this.jLabelColumnasValoresGraficoRemesasTransito.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRemesasTransito.add(this.jLabelColumnasValoresGraficoRemesasTransito, this.gridBagConstraintsRemesasTransito);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoRemesasTransito = new JList<Reporte>();
		this.jListColumnasValoresGraficoRemesasTransito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoRemesasTransito.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoRemesasTransito.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRemesasTransito.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRemesasTransito.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoRemesasTransito=new JScrollPane(this.jListColumnasValoresGraficoRemesasTransito);
			
			this.jScrollColumnasValoresGraficoRemesasTransito.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRemesasTransito.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRemesasTransito.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoRemesasTransito.add(this.jListColumnasSelectReporteRemesasTransito, this.gridBagConstraintsRemesasTransito);
		this.jPanelReporteDinamicoRemesasTransito.add(this.jScrollColumnasValoresGraficoRemesasTransito, this.gridBagConstraintsRemesasTransito);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoRemesasTransito = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoRemesasTransito.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRemesasTransito.add(this.jLabelTiposGraficosReportesDinamicoRemesasTransito, this.gridBagConstraintsRemesasTransito);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoRemesasTransito = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRemesasTransito.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoRemesasTransito.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoRemesasTransito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRemesasTransito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRemesasTransito.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRemesasTransito.add(this.jComboBoxTiposGraficosReportesDinamicoRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRemesasTransito = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRemesasTransito.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRemesasTransito.add(this.jLabelGenerarExcelReporteDinamicoRemesasTransito, this.gridBagConstraintsRemesasTransito);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRemesasTransito = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRemesasTransito.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRemesasTransito,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRemesasTransito.setToolTipText("Generar EXCEL"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		//this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRemesasTransito.add(this.jButtonGenerarExcelReporteDinamicoRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRemesasTransito.add(this.jComboBoxTiposReportesDinamicoRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRemesasTransito = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRemesasTransito.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRemesasTransito.add(this.jLabelTiposArchivoReporteDinamicoRemesasTransito, this.gridBagConstraintsRemesasTransito);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRemesasTransito.add(this.jComboBoxTiposArchivosReportesDinamicoRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRemesasTransito = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRemesasTransito.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRemesasTransito,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRemesasTransito.setToolTipText("Generar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRemesasTransito.add(this.jButtonGenerarReporteDinamicoRemesasTransito, this.gridBagConstraintsRemesasTransito);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRemesasTransito = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRemesasTransito.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRemesasTransito,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRemesasTransito.setToolTipText("Cancelar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRemesasTransito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRemesasTransito.add(this.jButtonCerrarReporteDinamicoRemesasTransito, this.gridBagConstraintsRemesasTransito);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRemesasTransito = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRemesasTransito= new JScrollPane(jPanelReporteDinamicoRemesasTransito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRemesasTransito.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRemesasTransito.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRemesasTransito.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Remesas Transitos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRemesasTransito.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRemesasTransito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRemesasTransito.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRemesasTransito);
		this.jInternalFrameReporteDinamicoRemesasTransito.getContentPane().add(this.jScrollPanelReporteDinamicoRemesasTransito, this.gridBagConstraintsRemesasTransito);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRemesasTransito() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRemesasTransito = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRemesasTransito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRemesasTransito.setName("jPanelImportacionRemesasTransito"); 
		
		this.jPanelImportacionRemesasTransito.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRemesasTransito.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRemesasTransito.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRemesasTransito.setLayout(gridaBagLayoutImportacionRemesasTransito);
		
		
		this.jInternalFrameImportacionRemesasTransito= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRemesasTransito= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRemesasTransito = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRemesasTransito= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRemesasTransito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRemesasTransito.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRemesasTransito.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRemesasTransito.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRemesasTransito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRemesasTransito.setResizable(true);
	    this.jInternalFrameImportacionRemesasTransito.setClosable(true);
	    this.jInternalFrameImportacionRemesasTransito.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRemesasTransito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRemesasTransito.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRemesasTransito.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRemesasTransito.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRemesasTransito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRemesasTransito.setResizable(true);
	    this.jInternalFrameImportacionRemesasTransito.setClosable(true);
	    this.jInternalFrameImportacionRemesasTransito.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRemesasTransito.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRemesasTransito.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRemesasTransito.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Remesas Transitos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRemesasTransito = new JLabelMe();

		this.jLabelArchivoImportacionRemesasTransito.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYImportacion;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRemesasTransito.add(this.jLabelArchivoImportacionRemesasTransito, this.gridBagConstraintsRemesasTransito);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRemesasTransito = new JFileChooser();		
		this.jFileChooserImportacionRemesasTransito.setToolTipText("ESCOGER ARCHIVO"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRemesasTransito = new JButtonMe();
		this.jButtonAbrirImportacionRemesasTransito.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRemesasTransito,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRemesasTransito.setToolTipText("Generar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYImportacion;
		this.gridBagConstraintsRemesasTransito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRemesasTransito.add(this.jButtonAbrirImportacionRemesasTransito, this.gridBagConstraintsRemesasTransito);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRemesasTransito = new JLabelMe();

		this.jLabelPathArchivoImportacionRemesasTransito.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYImportacion;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRemesasTransito.add(this.jLabelPathArchivoImportacionRemesasTransito, this.gridBagConstraintsRemesasTransito);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRemesasTransito=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRemesasTransito.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRemesasTransito.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRemesasTransito.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYImportacion;
		this.gridBagConstraintsRemesasTransito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRemesasTransito.add(this.jTextFieldPathArchivoImportacionRemesasTransito, this.gridBagConstraintsRemesasTransito);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRemesasTransito = new JButtonMe();
		this.jButtonGenerarImportacionRemesasTransito.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRemesasTransito,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRemesasTransito.setToolTipText("Generar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYImportacion;
		this.gridBagConstraintsRemesasTransito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRemesasTransito.add(this.jButtonGenerarImportacionRemesasTransito, this.gridBagConstraintsRemesasTransito);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRemesasTransito = new JButtonMe();
		this.jButtonCerrarImportacionRemesasTransito.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRemesasTransito,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRemesasTransito.setToolTipText("Cancelar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRemesasTransito.gridy = iPosYImportacion;
		this.gridBagConstraintsRemesasTransito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRemesasTransito.add(this.jButtonCerrarImportacionRemesasTransito, this.gridBagConstraintsRemesasTransito);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRemesasTransito = new GridBagLayout();
		
		this.jScrollPanelImportacionRemesasTransito= new JScrollPane(jPanelImportacionRemesasTransito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy =iPosYImportacion;
		this.gridBagConstraintsRemesasTransito.gridx =iPosXImportacion;
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRemesasTransito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRemesasTransito.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRemesasTransito);
		this.jInternalFrameImportacionRemesasTransito.getContentPane().add(this.jScrollPanelImportacionRemesasTransito, this.gridBagConstraintsRemesasTransito);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRemesasTransito(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRemesasTransito = new JButtonMe();
			this.jButtonAbrirOrderByRemesasTransito.setText("Orden");
			this.jButtonAbrirOrderByRemesasTransito.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRemesasTransito,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRemesasTransito";
			inputMap = this.jButtonAbrirOrderByRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRemesasTransito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRemesasTransito"));
		
		
			GridBagLayout gridaBagLayoutOrderByRemesasTransito = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRemesasTransito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRemesasTransito.setName("jPanelOrderByRemesasTransito"); 
			
			this.jPanelOrderByRemesasTransito.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRemesasTransito.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRemesasTransito.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRemesasTransito.setLayout(gridaBagLayoutOrderByRemesasTransito);
			
			
			this.jTableDatosRemesasTransitoOrderBy = new JTableMe();        
			this.jTableDatosRemesasTransitoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRemesasTransitoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRemesasTransitoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRemesasTransitoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRemesasTransitoOrderBy.setViewportView(this.jTableDatosRemesasTransitoOrderBy);
			this.jTableDatosRemesasTransitoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRemesasTransitoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRemesasTransito= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRemesasTransito= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRemesasTransito = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRemesasTransito= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRemesasTransito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRemesasTransito.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRemesasTransito.setTitle("Orden");
			this.jInternalFrameOrderByRemesasTransito.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRemesasTransito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRemesasTransito.setResizable(true);
			this.jInternalFrameOrderByRemesasTransito.setClosable(true);
			this.jInternalFrameOrderByRemesasTransito.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRemesasTransito.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRemesasTransito.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRemesasTransito.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Remesas Transitos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRemesasTransito.gridx =iPosXOrderBy;
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRemesasTransito.ipady =150;
				
			this.jPanelOrderByRemesasTransito.add(jScrollPanelDatosRemesasTransitoOrderBy, this.gridBagConstraintsRemesasTransito);//this.jTableDatosRemesasTransitoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRemesasTransito = new JButtonMe();
			this.jButtonCerrarOrderByRemesasTransito.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRemesasTransito,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRemesasTransito.setToolTipText("Cancelar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRemesasTransito.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRemesasTransito.add(this.jButtonCerrarOrderByRemesasTransito, this.gridBagConstraintsRemesasTransito);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRemesasTransito = new GridBagLayout();
			
			this.jScrollPanelOrderByRemesasTransito= new JScrollPane(jPanelOrderByRemesasTransito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.gridy =iPosYOrderBy;
			this.gridBagConstraintsRemesasTransito.gridx =iPosXOrderBy;
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRemesasTransito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRemesasTransito.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRemesasTransito);
			
			this.jInternalFrameOrderByRemesasTransito.getContentPane().add(this.jScrollPanelOrderByRemesasTransito, this.gridBagConstraintsRemesasTransito);			
		
		} else {
			this.jButtonAbrirOrderByRemesasTransito = new JButtonMe();
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
		int iWidthTableCalculado=0;//2630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.remesastransitoSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosRemesasTransito.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRemesasTransito.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRemesasTransito.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosRemesasTransito.getRowHeight();//RemesasTransitoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RemesasTransitoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRemesasTransito.isSelected()) {
					iHeightTable=RemesasTransitoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RemesasTransitoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RemesasTransitoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RemesasTransitoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRemesasTransito.isSelected()) {
					iHeightTable=RemesasTransitoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RemesasTransitoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RemesasTransitoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRemesasTransito.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRemesasTransito.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRemesasTransito.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRemesasTransito.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRemesasTransito.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRemesasTransito.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRemesasTransito!=null && this.jInternalFrameOrderByRemesasTransito.getjTableDatosOrderBy()!=null) {
			//if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRemesasTransito.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRemesasTransito.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRemesasTransito.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRemesasTransito.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRemesasTransito.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRemesasTransito.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRemesasTransito.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRemesasTransito.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRemesasTransito.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRemesasTransito.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=remesastransitoLogic.getRemesasTransitos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=remesastransitos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RemesasTransito> TraerRemesasTransitoBeans(List<RemesasTransito> remesastransitos,ArrayList<Classe> classes)throws Exception {
		try {
			for(RemesasTransito remesastransito:remesastransitos) {
					
				if(!(RemesasTransitoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RemesasTransitoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					remesastransito.setsDetalleGeneralEntityReporte(RemesasTransitoConstantesFunciones.getRemesasTransitoDescripcion(remesastransito));
										
						
					
						
					
				} else  {
							
					//remesastransito.setsDetalleGeneralEntityReporte(remesastransito.getsDetalleGeneralEntityReporte());
										
				}
				
				//remesastransitobeans.add(remesastransitobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return remesastransitos;
    }
	//PARA REPORTES FIN
}
