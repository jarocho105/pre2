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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.HerramientaConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class HerramientaJInternalFrame extends HerramientaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarHerramienta;
	
	protected JMenuBar jmenuBarHerramienta;
	
	protected JMenu jmenuHerramienta;
	protected JMenu jmenuDatosHerramienta;
	protected JMenu jmenuArchivoHerramienta;
	protected JMenu jmenuAccionesHerramienta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosHerramienta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHerramienta;	
	protected GridBagConstraints gridBagConstraintsHerramienta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public HerramientaDetalleFormJInternalFrame jInternalFrameDetalleFormHerramienta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoHerramienta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionHerramienta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public HerramientaSessionBean herramientaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Herramienta> herramientas;		
	public List<Herramienta> herramientasEliminados;	
	public List<Herramienta> herramientasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByHerramienta;		
	protected JButton jButtonAbrirOrderByHerramienta;
	
	
	//protected JPanel jPanelOrderByHerramienta;
	//public JScrollPane jScrollPanelOrderByHerramienta;	
	//protected JButton jButtonCerrarOrderByHerramienta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public HerramientaLogic herramientaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosHerramienta;
	public JScrollPane jScrollPanelDatosEdicionHerramienta;
	public JScrollPane jScrollPanelDatosGeneralHerramienta;
    
	
	
	//public JScrollPane jScrollPanelDatosHerramientaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoHerramienta;
	//public JScrollPane jScrollPanelImportacionHerramienta;
	
	
	
	protected JPanel jPanelAccionesHerramienta;
	
    protected JPanel jPanelPaginacionHerramienta;
    protected JPanel jPanelParametrosReportesHerramienta;
	protected JPanel jPanelParametrosReportesAccionesHerramienta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Herramienta;
	protected JPanel jPanelParametrosAuxiliar2Herramienta;
	protected JPanel jPanelParametrosAuxiliar3Herramienta;
	protected JPanel jPanelParametrosAuxiliar4Herramienta;
	//protected JPanel jPanelParametrosAuxiliar5Herramienta;
	
	
	
	//protected JPanel jPanelReporteDinamicoHerramienta;
	//protected JPanel jPanelImportacionHerramienta;
	
	
	public JTable jTableDatosHerramienta;
	
	
	
	//public JTable jTableDatosHerramientaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoHerramienta;
	protected JButton jButtonDuplicarHerramienta;
	protected JButton jButtonCopiarHerramienta;
	protected JButton jButtonVerFormHerramienta;
	protected JButton jButtonNuevoRelacionesHerramienta;
	protected JButton jButtonModificarHerramienta;
	
    protected JButton jButtonGuardarCambiosTablaHerramienta;
	protected JButton jButtonCerrarHerramienta;
	
	
	protected JButton jButtonRecargarInformacionHerramienta;
	protected JButton jButtonProcesarInformacionHerramienta;
	
	
	protected JButton jButtonAnterioresHerramienta;
	protected JButton jButtonSiguientesHerramienta;
	protected JButton jButtonNuevoGuardarCambiosHerramienta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoHerramienta;
	//protected JButton jButtonCerrarReporteDinamicoHerramienta;
	//protected JButton jButtonGenerarExcelReporteDinamicoHerramienta;	
	
	
	
	//protected JButton jButtonAbrirImportacionHerramienta;
	//protected JButton jButtonGenerarImportacionHerramienta;
	//protected JButton jButtonCerrarImportacionHerramienta;
	//protected JFileChooser jFileChooserImportacionHerramienta;
	//protected File fileImportacionHerramienta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHerramienta;
	protected JButton jButtonDuplicarToolBarHerramienta;
	protected JButton jButtonNuevoRelacionesToolBarHerramienta;
	
	
	public JButton jButtonGuardarCambiosToolBarHerramienta;
	protected JButton jButtonCopiarToolBarHerramienta;
	protected JButton jButtonVerFormToolBarHerramienta;
	public JButton jButtonGuardarCambiosTablaToolBarHerramienta;
	protected JButton jButtonMostrarOcultarTablaToolBarHerramienta;
	protected JButton jButtonCerrarToolBarHerramienta;
	
	protected JButton jButtonRecargarInformacionToolBarHerramienta;
	protected JButton jButtonProcesarInformacionToolBarHerramienta;
	protected JButton jButtonAnterioresToolBarHerramienta;
	protected JButton jButtonSiguientesToolBarHerramienta;
	protected JButton jButtonNuevoGuardarCambiosToolBarHerramienta;
	protected JButton jButtonAbrirOrderByToolBarHerramienta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHerramienta;
	protected JMenuItem jMenuItemDuplicarHerramienta;
	protected JMenuItem jMenuItemNuevoRelacionesHerramienta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosHerramienta;
	protected JMenuItem jMenuItemCopiarHerramienta;
	protected JMenuItem jMenuItemVerFormHerramienta;
	protected JMenuItem jMenuItemGuardarCambiosTablaHerramienta;
	protected JMenuItem jMenuItemCerrarHerramienta;
	protected JMenuItem jMenuItemDetalleCerrarHerramienta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByHerramienta;
	protected JMenuItem jMenuItemDetalleMostarOcultarHerramienta;
	
	protected JMenuItem jMenuItemRecargarInformacionHerramienta;
	protected JMenuItem jMenuItemProcesarInformacionHerramienta;
	protected JMenuItem jMenuItemAnterioresHerramienta;
	protected JMenuItem jMenuItemSiguientesHerramienta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHerramienta;
	protected JMenuItem jMenuItemAbrirOrderByHerramienta;
	protected JMenuItem jMenuItemMostrarOcultarHerramienta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHerramienta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosHerramienta;
	protected JCheckBox jCheckBoxSeleccionadosHerramienta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaHerramienta;
	protected JCheckBox jCheckBoxConGraficoReporteHerramienta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesHerramienta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesHerramienta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoHerramienta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoHerramienta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesHerramienta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionHerramienta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHerramienta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHerramienta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarHerramienta;
	protected JTextField jTextFieldValorCampoGeneralHerramienta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteHerramienta;
	//public JList<Reporte> jListColumnasSelectReporteHerramienta;
	//public JScrollPane jScrollColumnasSelectReporteHerramienta;
	
	//public JLabel jLabelRelacionesSelectReporteHerramienta;
	//public JList<Reporte> jListRelacionesSelectReporteHerramienta;
	//public JScrollPane jScrollRelacionesSelectReporteHerramienta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoHerramienta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoHerramienta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoHerramienta;
	//public JLabel jLabelTiposArchivoReporteDinamicoHerramienta;
	
		
	//public JLabel jLabelArchivoImportacionHerramienta;	
	//public JLabel jLabelPathArchivoImportacionHerramienta;
	//protected JTextField jTextFieldPathArchivoImportacionHerramienta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoHerramienta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoHerramienta;
	
	//public JLabel jLabelColumnaCategoriaValorHerramienta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorHerramienta;
	
	//public JLabel jLabelColumnasValoresGraficoHerramienta;
	//public JList<Reporte> jListColumnasValoresGraficoHerramienta;
	//public JScrollPane jScrollColumnasValoresGraficoHerramienta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoHerramienta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoHerramienta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasHerramienta;
	
	
	
	
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
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public HerramientaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Herramienta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HerramientaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Herramienta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HerramientaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Herramienta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HerramientaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Herramienta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionHerramienta)	{
		this.jButtonRecargarInformacionHerramienta = jButtonRecargarInformacionHerramienta;
	}
	
	public JButton getjButtonProcesarInformacionHerramienta() {
		return this.jButtonProcesarInformacionHerramienta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHerramienta)	{
		this.jButtonProcesarInformacionHerramienta = jButtonProcesarInformacionHerramienta;
	}
	
	
	public JButton getjButtonRecargarInformacionHerramienta() {
		return this.jButtonRecargarInformacionHerramienta;
	}
	
	
	public List<Herramienta> getherramientas() {
		return this.herramientas;
	}

	public void setherramientas(List<Herramienta> herramientas) {
		this.herramientas = herramientas;
	}
	
	public List<Herramienta> getherramientasAux() {
		return this.herramientasAux;
	}

	public void setherramientasAux(List<Herramienta> herramientasAux) {
		this.herramientasAux = herramientasAux;
	}
	
	public List<Herramienta> getherramientasEliminados() {
		return this.herramientasEliminados;
	}

	public void setHerramientasEliminados(List<Herramienta> herramientasEliminados) {
		this.herramientasEliminados = herramientasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarHerramienta() {
		return jComboBoxTiposSeleccionarHerramienta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarHerramienta(
			JComboBox jComboBoxTiposSeleccionarHerramienta) {
		this.jComboBoxTiposSeleccionarHerramienta = jComboBoxTiposSeleccionarHerramienta;
	}
	
	public void setBorderResaltarTiposSeleccionarHerramienta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarHerramienta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarHerramienta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralHerramienta() {
		return jTextFieldValorCampoGeneralHerramienta;
	}

	public void setjTextFieldValorCampoGeneralHerramienta(
			JTextField jTextFieldValorCampoGeneralHerramienta) {
		this.jTextFieldValorCampoGeneralHerramienta = jTextFieldValorCampoGeneralHerramienta;
	}

	public void setBorderResaltarValorCampoGeneralHerramienta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHerramienta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralHerramienta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosHerramienta() {
		return this.jCheckBoxSeleccionarTodosHerramienta;
	}

	public void setjCheckBoxSeleccionarTodosHerramienta(
			JCheckBox jCheckBoxSeleccionarTodosHerramienta) {
		this.jCheckBoxSeleccionarTodosHerramienta = jCheckBoxSeleccionarTodosHerramienta;
	}

	public void setBorderResaltarSeleccionarTodosHerramienta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHerramienta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosHerramienta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosHerramienta() {
		return this.jCheckBoxSeleccionadosHerramienta;
	}

	public void setjCheckBoxSeleccionadosHerramienta(
			JCheckBox jCheckBoxSeleccionadosHerramienta) {
		this.jCheckBoxSeleccionadosHerramienta = jCheckBoxSeleccionadosHerramienta;
	}
	
	public void setBorderResaltarSeleccionadosHerramienta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHerramienta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosHerramienta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesHerramienta() {
		return this.jComboBoxTiposArchivosReportesHerramienta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesHerramienta(
			JComboBox jComboBoxTiposArchivosReportesHerramienta) {
		this.jComboBoxTiposArchivosReportesHerramienta = jComboBoxTiposArchivosReportesHerramienta;
	}

	public void setBorderResaltarTiposArchivosReportesHerramienta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHerramienta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesHerramienta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesHerramienta() {
		return this.jComboBoxTiposReportesHerramienta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesHerramienta(
			JComboBox jComboBoxTiposReportesHerramienta) {
		this.jComboBoxTiposReportesHerramienta = jComboBoxTiposReportesHerramienta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoHerramienta() {
	//	return jComboBoxTiposReportesDinamicoHerramienta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoHerramienta(
	//		JComboBox jComboBoxTiposReportesDinamicoHerramienta) {
	//	this.jComboBoxTiposReportesDinamicoHerramienta = jComboBoxTiposReportesDinamicoHerramienta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoHerramienta() {
	//	return jComboBoxTiposArchivosReportesDinamicoHerramienta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoHerramienta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoHerramienta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoHerramienta = jComboBoxTiposArchivosReportesDinamicoHerramienta;
	//}
	
	public void setBorderResaltarTiposReportesHerramienta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHerramienta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesHerramienta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesHerramienta() {
		return this.jComboBoxTiposGraficosReportesHerramienta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesHerramienta(
			JComboBox jComboBoxTiposGraficosReportesHerramienta) {
		this.jComboBoxTiposGraficosReportesHerramienta = jComboBoxTiposGraficosReportesHerramienta;
	}
	
	public void setBorderResaltarTiposGraficosReportesHerramienta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHerramienta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesHerramienta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionHerramienta() {
		return this.jComboBoxTiposPaginacionHerramienta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionHerramienta(
			JComboBox jComboBoxTiposPaginacionHerramienta) {
		this.jComboBoxTiposPaginacionHerramienta = jComboBoxTiposPaginacionHerramienta;
	}
	
	public void setBorderResaltarTiposPaginacionHerramienta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHerramienta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionHerramienta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesHerramienta() {
		return this.jComboBoxTiposRelacionesHerramienta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHerramienta() {
		return this.jComboBoxTiposAccionesHerramienta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHerramienta(
			JComboBox jComboBoxTiposRelacionesHerramienta) {
		this.jComboBoxTiposRelacionesHerramienta = jComboBoxTiposRelacionesHerramienta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHerramienta(
			JComboBox jComboBoxTiposAccionesHerramienta) {
		this.jComboBoxTiposAccionesHerramienta = jComboBoxTiposAccionesHerramienta;
	}
	
	public void setBorderResaltarTiposRelacionesHerramienta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHerramienta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesHerramienta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesHerramienta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHerramienta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesHerramienta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoHerramienta() {
	//	return jCheckBoxConGraficoDinamicoHerramienta;
	//}

	//public void setjCheckBoxConGraficoDinamicoHerramienta(
	//		JCheckBox jCheckBoxConGraficoDinamicoHerramienta) {
	//	this.jCheckBoxConGraficoDinamicoHerramienta = jCheckBoxConGraficoDinamicoHerramienta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoHerramienta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarHerramienta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoHerramienta .setBorder(borderResaltar);		
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
		this.herramientaSessionBean=new HerramientaSessionBean();
		
		this.herramientaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.herramientaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.herramientaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=HerramientaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=HerramientaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HerramientaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HerramientaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HerramientaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Herramienta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
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
		
		HerramientaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Herramienta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarHerramienta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarHerramienta,this.jTtoolBarHerramienta,
							"nuevo","nuevo","Nuevo"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarHerramienta,this.jTtoolBarHerramienta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarHerramienta,this.jTtoolBarHerramienta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarHerramienta,this.jTtoolBarHerramienta,
							"duplicar","duplicar","Duplicar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarHerramienta,this.jTtoolBarHerramienta,
							"copiar","copiar","Copiar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarHerramienta,this.jTtoolBarHerramienta,
							"ver_form","ver_form","Ver"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHerramienta,this.jTtoolBarHerramienta,
							"recargar","recargar","Recargar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHerramienta,this.jTtoolBarHerramienta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHerramienta,this.jTtoolBarHerramienta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarHerramienta,this.jTtoolBarHerramienta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarHerramienta,this.jTtoolBarHerramienta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarHerramienta,this.jTtoolBarHerramienta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarHerramienta,this.jTtoolBarHerramienta,
							"cerrar","cerrar","Salir"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarHerramienta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarHerramienta;
			
				this.jButtonProcesarInformacionToolBarHerramienta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarHerramienta;
				
		//protected JButton jButtonModificarToolBarHerramienta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarHerramienta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuHerramienta=new JMenuMe("General");
		this.jmenuArchivoHerramienta=new JMenuMe("Archivo");
		this.jmenuAccionesHerramienta=new JMenuMe("Acciones");
		this.jmenuDatosHerramienta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHerramienta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHerramienta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHerramienta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarHerramienta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarHerramienta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarHerramienta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesHerramienta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesHerramienta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesHerramienta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosHerramienta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHerramienta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHerramienta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarHerramienta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarHerramienta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarHerramienta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormHerramienta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormHerramienta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormHerramienta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaHerramienta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaHerramienta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaHerramienta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHerramienta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHerramienta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHerramienta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionHerramienta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionHerramienta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionHerramienta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionHerramienta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionHerramienta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionHerramienta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresHerramienta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresHerramienta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresHerramienta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesHerramienta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesHerramienta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesHerramienta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByHerramienta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByHerramienta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByHerramienta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHerramienta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHerramienta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHerramienta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByHerramienta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByHerramienta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByHerramienta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHerramienta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHerramienta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHerramienta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosHerramienta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosHerramienta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosHerramienta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoHerramienta.add(this.jMenuItemCerrarHerramienta);
			
			this.jmenuAccionesHerramienta.add(this.jMenuItemNuevoHerramienta);
			this.jmenuAccionesHerramienta.add(this.jMenuItemNuevoGuardarCambiosHerramienta);
			this.jmenuAccionesHerramienta.add(this.jMenuItemNuevoRelacionesHerramienta);
			this.jmenuAccionesHerramienta.add(this.jMenuItemGuardarCambiosTablaHerramienta);		
			this.jmenuAccionesHerramienta.add(this.jMenuItemDuplicarHerramienta);		
			this.jmenuAccionesHerramienta.add(this.jMenuItemCopiarHerramienta);		
			this.jmenuAccionesHerramienta.add(this.jMenuItemVerFormHerramienta);		
			
			this.jmenuDatosHerramienta.add(this.jMenuItemRecargarInformacionHerramienta);				
			this.jmenuDatosHerramienta.add(this.jMenuItemAnterioresHerramienta);				
			this.jmenuDatosHerramienta.add(this.jMenuItemSiguientesHerramienta);				
			this.jmenuDatosHerramienta.add(this.jMenuItemAbrirOrderByHerramienta);				
			this.jmenuDatosHerramienta.add(this.jMenuItemMostrarOcultarHerramienta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesHerramienta.add(this.jMenuItemGuardarCambiosHerramienta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarHerramienta.add(this.jmenuArchivoHerramienta);		
			this.jmenuBarHerramienta.add(this.jmenuAccionesHerramienta);		
			this.jmenuBarHerramienta.add(this.jmenuDatosHerramienta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarHerramienta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasHerramienta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasHerramienta=new JTabbedPane();


		this.jTabbedPaneBusquedasHerramienta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasHerramienta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasHerramienta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasHerramienta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasHerramienta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleHerramienta = new HerramientaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Herramienta DATOS");
			this.jInternalFrameDetalleFormHerramienta = new HerramientaDetalleFormJInternalFrame(jDesktopPane,this.herramientaSessionBean.getConGuardarRelaciones(),this.herramientaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormHerramienta = null;//new HerramientaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHerramienta= new GridBagLayout();
		
		
		this.jTableDatosHerramienta = new JTableMe();      
		
		String sToolTipHerramienta="";
		sToolTipHerramienta=HerramientaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHerramienta+="(Nomina.Herramienta)";
		}
		
		if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
			sToolTipHerramienta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosHerramienta.setToolTipText(sToolTipHerramienta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosHerramienta);
		this.jTableDatosHerramienta.setAutoCreateRowSorter(true);
		this.jTableDatosHerramienta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosHerramienta.setRowSelectionAllowed(true);
		this.jTableDatosHerramienta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosHerramienta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoHerramienta = new JButtonMe();
		this.jButtonDuplicarHerramienta = new JButtonMe();
		this.jButtonCopiarHerramienta = new JButtonMe();
		this.jButtonVerFormHerramienta = new JButtonMe();
		this.jButtonNuevoRelacionesHerramienta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaHerramienta = new JButtonMe();
		this.jButtonCerrarHerramienta = new JButtonMe();
		
		this.jScrollPanelDatosHerramienta = new JScrollPane();   
        this.jScrollPanelDatosGeneralHerramienta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesHerramienta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Herramienta";
		
		if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Herramientas" + this.sPath));
		} else {
			this.jScrollPanelDatosHerramienta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHerramienta.setToolTipText("Acciones");
        this.jPanelAccionesHerramienta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoHerramienta=new ReporteDinamicoJInternalFrame(HerramientaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoHerramienta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionHerramienta=new ImportacionJInternalFrame(HerramientaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionHerramienta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByHerramienta = new JButtonMe();
		
		this.jButtonAbrirOrderByHerramienta.setText("Orden");
		this.jButtonAbrirOrderByHerramienta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHerramienta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByHerramienta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHerramienta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHerramienta,false,this);
			
			//this.cargarOrderByHerramienta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHerramienta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHerramienta,true,this);
			
			//this.cargarOrderByHerramienta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosHerramienta.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosHerramienta.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosHerramienta.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosHerramienta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosHerramienta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosHerramienta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoHerramienta.setText("Nuevo");
		this.jButtonDuplicarHerramienta.setText("Duplicar");
		this.jButtonCopiarHerramienta.setText("Copiar");
		this.jButtonVerFormHerramienta.setText("Ver");
		this.jButtonNuevoRelacionesHerramienta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaHerramienta.setText("Guardar");
		this.jButtonCerrarHerramienta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHerramienta,"nuevo_button","Nuevo",this.herramientaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarHerramienta,"duplicar_button","Duplicar",this.herramientaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarHerramienta,"copiar_button","Copiar",this.herramientaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormHerramienta,"ver_form","Ver",this.herramientaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesHerramienta,"nuevorelaciones_button","Nuevo Rel",this.herramientaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHerramienta,"guardarcambiostabla_button","Guardar",this.herramientaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHerramienta,"cerrar_button","Salir",this.herramientaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoHerramienta.setToolTipText("Nuevo"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarHerramienta.setToolTipText("Duplicar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarHerramienta.setToolTipText("Copiar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormHerramienta.setToolTipText("Ver"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesHerramienta.setToolTipText("Nuevo Rel"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaHerramienta.setToolTipText("Guardar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHerramienta.setToolTipText("Salir"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHerramienta";
		inputMap = this.jButtonNuevoHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHerramienta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHerramienta"));
		
		//DUPLICAR
		sMapKey = "DuplicarHerramienta";
		inputMap = this.jButtonDuplicarHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarHerramienta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarHerramienta"));
		
		//COPIAR
		sMapKey = "CopiarHerramienta";
		inputMap = this.jButtonCopiarHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarHerramienta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarHerramienta"));
		
		//VEr FORM
		sMapKey = "VerFormHerramienta";
		inputMap = this.jButtonVerFormHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormHerramienta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormHerramienta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesHerramienta";
		inputMap = this.jButtonNuevoRelacionesHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesHerramienta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesHerramienta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarHerramienta";
		inputMap = this.jButtonModificarHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarHerramienta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarHerramienta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarHerramienta";
		inputMap = this.jButtonCerrarHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHerramienta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHerramienta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHerramienta";
		inputMap = this.jButtonGuardarCambiosTablaHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHerramienta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHerramienta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesHerramienta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesHerramienta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionHerramienta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Herramienta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Herramienta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Herramienta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Herramienta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Herramienta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesHerramienta.setName("jPanelParametrosReportesHerramienta"); 
		
		this.jPanelParametrosReportesAccionesHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesHerramienta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesHerramienta.setName("jPanelParametrosReportesAccionesHerramienta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionHerramienta = new JButtonMe();
		this.jButtonRecargarInformacionHerramienta.setText("Recargar");
		this.jButtonRecargarInformacionHerramienta.setToolTipText("Recargar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionHerramienta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionHerramienta = new JButtonMe();
		this.jButtonProcesarInformacionHerramienta.setText("Procesar");
		this.jButtonProcesarInformacionHerramienta.setToolTipText("Procesar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionHerramienta.setVisible(false);
			
		this.jButtonProcesarInformacionHerramienta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHerramienta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHerramienta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesHerramienta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHerramienta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesHerramienta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesHerramienta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHerramienta.setText("TIPO");       
		this.jComboBoxTiposReportesHerramienta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesHerramienta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHerramienta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesHerramienta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionHerramienta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionHerramienta.setText("Paginacion");
		this.jComboBoxTiposPaginacionHerramienta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesHerramienta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesHerramienta.setText("Accion");
		this.jComboBoxTiposRelacionesHerramienta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesHerramienta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHerramienta.setText("Accion");
		this.jComboBoxTiposAccionesHerramienta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarHerramienta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarHerramienta.setText("Accion");
		this.jComboBoxTiposSeleccionarHerramienta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralHerramienta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralHerramienta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHerramienta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHerramienta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesHerramienta = new JLabelMe();
		
		this.jLabelAccionesHerramienta.setText("Acciones");		
		this.jLabelAccionesHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosHerramienta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosHerramienta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosHerramienta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosHerramienta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosHerramienta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosHerramienta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaHerramienta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaHerramienta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaHerramienta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteHerramienta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteHerramienta.setText("Graf.");
		this.jCheckBoxConGraficoReporteHerramienta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresHerramienta = new JButtonMe();
		//this.jButtonAnterioresHerramienta.setText("<<");
        this.jButtonAnterioresHerramienta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresHerramienta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesHerramienta = new JButtonMe();
		//this.jButtonSiguientesHerramienta.setText(">>");
        this.jButtonSiguientesHerramienta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesHerramienta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosHerramienta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosHerramienta.setText("Nue");
        this.jButtonNuevoGuardarCambiosHerramienta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosHerramienta,"nuevoguardarcambios_button","Nue",this.herramientaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosHerramienta";
		inputMap = this.jButtonNuevoGuardarCambiosHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosHerramienta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosHerramienta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionHerramienta";
		inputMap = this.jButtonRecargarInformacionHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionHerramienta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionHerramienta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesHerramienta";
		inputMap = this.jButtonSiguientesHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesHerramienta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesHerramienta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresHerramienta";
		inputMap = this.jButtonAnterioresHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresHerramienta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresHerramienta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasHerramienta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesHerramienta.setMinimumSize(new Dimension(this.getWidth(),HerramientaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HerramientaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHerramienta.setMaximumSize(new Dimension(this.getWidth(),HerramientaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HerramientaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHerramienta.setPreferredSize(new Dimension(this.getWidth(),HerramientaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HerramientaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionHerramienta = new GridBagLayout();

			this.jPanelPaginacionHerramienta.setLayout(gridaBagLayoutPaginacionHerramienta);						
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHerramienta.gridy = 0;
			this.gridBagConstraintsHerramienta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionHerramienta.add(this.jButtonAnterioresHerramienta, this.gridBagConstraintsHerramienta);
					
						
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHerramienta.gridy = 0;
			
			this.jPanelPaginacionHerramienta.add(this.jButtonNuevoGuardarCambiosHerramienta, this.gridBagConstraintsHerramienta);
						
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsHerramienta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHerramienta.gridy = 0;
			this.jPanelPaginacionHerramienta.add(this.jButtonSiguientesHerramienta, this.gridBagConstraintsHerramienta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHerramienta.gridy = 1;
			this.gridBagConstraintsHerramienta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHerramienta.add(this.jButtonNuevoHerramienta, this.gridBagConstraintsHerramienta);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsHerramienta = new GridBagConstraints();
				this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsHerramienta.gridy = 1;
				this.gridBagConstraintsHerramienta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionHerramienta.add(this.jButtonNuevoRelacionesHerramienta, this.gridBagConstraintsHerramienta);
			}
			
			
			if(!this.herramientaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsHerramienta = new GridBagConstraints();
				this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsHerramienta.gridy = 1;
				this.gridBagConstraintsHerramienta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionHerramienta.add(this.jButtonGuardarCambiosTablaHerramienta, this.gridBagConstraintsHerramienta);
			}
			
			
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHerramienta.gridy = 1;
			this.gridBagConstraintsHerramienta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHerramienta.add(this.jButtonDuplicarHerramienta, this.gridBagConstraintsHerramienta);
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHerramienta.gridy = 1;
			this.gridBagConstraintsHerramienta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHerramienta.add(this.jButtonCopiarHerramienta, this.gridBagConstraintsHerramienta);
		
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHerramienta.gridy = 1;
			this.gridBagConstraintsHerramienta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHerramienta.add(this.jButtonVerFormHerramienta, this.gridBagConstraintsHerramienta);
		
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHerramienta.gridy = 1;
			this.gridBagConstraintsHerramienta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionHerramienta.add(this.jButtonCerrarHerramienta, this.gridBagConstraintsHerramienta);
		
		
		
		this.jButtonRecargarInformacionHerramienta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHerramienta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHerramienta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesHerramienta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHerramienta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHerramienta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesHerramienta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHerramienta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHerramienta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesHerramienta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHerramienta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHerramienta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionHerramienta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHerramienta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHerramienta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesHerramienta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHerramienta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHerramienta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesHerramienta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHerramienta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHerramienta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarHerramienta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHerramienta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHerramienta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaHerramienta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHerramienta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHerramienta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteHerramienta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHerramienta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHerramienta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosHerramienta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHerramienta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHerramienta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosHerramienta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHerramienta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHerramienta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesHerramienta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesHerramienta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Herramienta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Herramienta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Herramienta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Herramienta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesHerramienta.setLayout(gridaBagParametrosReportesHerramienta);
			this.jPanelParametrosReportesAccionesHerramienta.setLayout(gridaBagParametrosReportesAccionesHerramienta);
			
			
			this.jPanelParametrosAuxiliar1Herramienta.setLayout(gridaBagParametrosAuxiliar1Herramienta);
			this.jPanelParametrosAuxiliar2Herramienta.setLayout(gridaBagParametrosAuxiliar2Herramienta);
			this.jPanelParametrosAuxiliar3Herramienta.setLayout(gridaBagParametrosAuxiliar3Herramienta);
			this.jPanelParametrosAuxiliar4Herramienta.setLayout(gridaBagParametrosAuxiliar4Herramienta);
			//this.jPanelParametrosAuxiliar5Herramienta.setLayout(gridaBagParametrosAuxiliar2Herramienta);			
			
			
			
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHerramienta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHerramienta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHerramienta.add(this.jButtonRecargarInformacionHerramienta, this.gridBagConstraintsHerramienta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHerramienta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHerramienta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Herramienta.add(this.jComboBoxTiposPaginacionHerramienta, this.gridBagConstraintsHerramienta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHerramienta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHerramienta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Herramienta.add(this.jCheckBoxConAltoMaximoTablaHerramienta, this.gridBagConstraintsHerramienta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHerramienta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHerramienta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Herramienta.add(this.jComboBoxTiposArchivosReportesHerramienta, this.gridBagConstraintsHerramienta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHerramienta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHerramienta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHerramienta.add(this.jPanelParametrosAuxiliar1Herramienta, this.gridBagConstraintsHerramienta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHerramienta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHerramienta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Herramienta.add(this.jComboBoxTiposReportesHerramienta, this.gridBagConstraintsHerramienta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHerramienta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHerramienta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHerramienta.add(this.jPanelParametrosAuxiliar4Herramienta, this.gridBagConstraintsHerramienta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHerramienta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsHerramienta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHerramienta.add(this.jComboBoxTiposReportesHerramienta, this.gridBagConstraintsHerramienta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHerramienta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHerramienta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHerramienta.add(this.jCheckBoxGenerarReporteHerramienta, this.gridBagConstraintsHerramienta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHerramienta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHerramienta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHerramienta.add(this.jPanelParametrosAuxiliar2Herramienta, this.gridBagConstraintsHerramienta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHerramienta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHerramienta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHerramienta.add(this.jLabelAccionesHerramienta, this.gridBagConstraintsHerramienta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsHerramienta = new GridBagConstraints();
				this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsHerramienta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsHerramienta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesHerramienta.add(this.jButtonAbrirOrderByHerramienta, this.gridBagConstraintsHerramienta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsHerramienta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHerramienta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHerramienta.add(this.jComboBoxTiposSeleccionarHerramienta, this.gridBagConstraintsHerramienta);			
			
			
			/*
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHerramienta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHerramienta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHerramienta.add(this.jCheckBoxSeleccionarTodosHerramienta, this.gridBagConstraintsHerramienta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHerramienta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHerramienta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Herramienta.add(this.jCheckBoxSeleccionarTodosHerramienta, this.gridBagConstraintsHerramienta);															
				
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHerramienta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHerramienta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Herramienta.add(this.jCheckBoxSeleccionadosHerramienta, this.gridBagConstraintsHerramienta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHerramienta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHerramienta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHerramienta.add(this.jPanelParametrosAuxiliar3Herramienta, this.gridBagConstraintsHerramienta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHerramienta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHerramienta.add(this.jComboBoxTiposRelacionesHerramienta, this.gridBagConstraintsHerramienta);
				
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHerramienta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHerramienta.add(this.jComboBoxTiposAccionesHerramienta, this.gridBagConstraintsHerramienta);
	
				
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHerramienta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHerramienta.add(this.jTextFieldValorCampoGeneralHerramienta, this.gridBagConstraintsHerramienta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosHerramienta = new GridBagLayout();

			this.jScrollPanelDatosHerramienta.setLayout(gridaBagLayoutDatosHerramienta);
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHerramienta.gridy = 0;
			this.gridBagConstraintsHerramienta.gridx = 0;
			
			this.jScrollPanelDatosHerramienta.add(this.jTableDatosHerramienta, this.gridBagConstraintsHerramienta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosHerramienta.setViewportView(this.jTableDatosHerramienta);
		this.jTableDatosHerramienta.setFillsViewportHeight(true);
		this.jTableDatosHerramienta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesHerramienta= new GridBagLayout();
		this.jPanelAccionesHerramienta.setLayout(gridaBagLayoutAccionesHerramienta);
		
		
		/*	
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHerramienta.gridy = 0;
		this.gridBagConstraintsHerramienta.gridx = 0;
			
		this.jPanelAccionesHerramienta.add(this.jButtonNuevoHerramienta, this.gridBagConstraintsHerramienta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHerramienta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHerramienta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.herramientaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHerramienta = new GridBagConstraints();						
			this.gridBagConstraintsHerramienta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHerramienta.gridx = 0;		
			//this.gridBagConstraintsHerramienta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHerramienta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarHerramienta, this.gridBagConstraintsHerramienta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsHerramienta.gridx = 0;		
		//this.gridBagConstraintsHerramienta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsHerramienta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsHerramienta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHerramienta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesHerramienta, this.gridBagConstraintsHerramienta);								
		
		
		/*
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHerramienta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesHerramienta, this.gridBagConstraintsHerramienta);
		*/		
		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHerramienta.gridx =0;
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHerramienta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHerramienta, this.gridBagConstraintsHerramienta);
				
		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHerramienta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionHerramienta, this.gridBagConstraintsHerramienta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(HerramientaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosHerramienta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHerramienta = new GridBagLayout();
			this.jPanelBusquedasParametrosHerramienta.setLayout(gridaBagLayoutBusquedasParametrosHerramienta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralHerramienta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHerramienta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHerramienta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHerramienta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHerramienta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHerramienta, this.gridBagConstraintsHerramienta);
			
			
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHerramienta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHerramienta, this.gridBagConstraintsHerramienta);
		
			
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHerramienta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHerramienta, this.gridBagConstraintsHerramienta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralHerramienta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoHerramienta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoHerramienta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoHerramienta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoHerramienta.setName("jPanelReporteDinamicoHerramienta"); 
		
		this.jPanelReporteDinamicoHerramienta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHerramienta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHerramienta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoHerramienta.setLayout(gridaBagLayoutReporteDinamicoHerramienta);
		
		
		this.jInternalFrameReporteDinamicoHerramienta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoHerramienta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHerramienta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoHerramienta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoHerramienta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoHerramienta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoHerramienta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoHerramienta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoHerramienta.setResizable(true);
	    this.jInternalFrameReporteDinamicoHerramienta.setClosable(true);
	    this.jInternalFrameReporteDinamicoHerramienta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoHerramienta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHerramienta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHerramienta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Herramientas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteHerramienta = new JLabelMe();

		this.jLabelColumnasSelectReporteHerramienta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHerramienta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHerramienta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHerramienta.add(this.jLabelColumnasSelectReporteHerramienta, this.gridBagConstraintsHerramienta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteHerramienta = new JList<Reporte>();
		this.jListColumnasSelectReporteHerramienta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteHerramienta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteHerramienta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHerramienta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHerramienta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteHerramienta=new JScrollPane(this.jListColumnasSelectReporteHerramienta);
			
			this.jScrollColumnasSelectReporteHerramienta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHerramienta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHerramienta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHerramienta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHerramienta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoHerramienta.add(this.jListColumnasSelectReporteHerramienta, this.gridBagConstraintsHerramienta);
		this.jPanelReporteDinamicoHerramienta.add(this.jScrollColumnasSelectReporteHerramienta, this.gridBagConstraintsHerramienta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteHerramienta = new JLabelMe();

		this.jLabelRelacionesSelectReporteHerramienta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHerramienta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHerramienta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHerramienta.add(this.jLabelRelacionesSelectReporteHerramienta, this.gridBagConstraintsHerramienta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteHerramienta = new JList<Reporte>();
		this.jListRelacionesSelectReporteHerramienta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteHerramienta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteHerramienta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHerramienta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHerramienta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteHerramienta=new JScrollPane(this.jListRelacionesSelectReporteHerramienta);
			
			this.jScrollRelacionesSelectReporteHerramienta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHerramienta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHerramienta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHerramienta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHerramienta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoHerramienta.add(this.jListRelacionesSelectReporteHerramienta, this.gridBagConstraintsHerramienta);
		this.jPanelReporteDinamicoHerramienta.add(this.jScrollRelacionesSelectReporteHerramienta, this.gridBagConstraintsHerramienta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoHerramienta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoHerramienta = new JComboBoxMe();
		this.jListColumnasValoresGraficoHerramienta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoHerramienta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoHerramienta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoHerramienta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHerramienta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHerramienta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoHerramienta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoHerramienta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoHerramienta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHerramienta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHerramienta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoHerramienta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoHerramienta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHerramienta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHerramienta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHerramienta.add(this.jLabelGenerarExcelReporteDinamicoHerramienta, this.gridBagConstraintsHerramienta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoHerramienta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoHerramienta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoHerramienta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoHerramienta.setToolTipText("Generar EXCEL"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsHerramienta = new GridBagConstraints();
		//this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsHerramienta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsHerramienta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoHerramienta.add(this.jButtonGenerarExcelReporteDinamicoHerramienta, this.gridBagConstraintsHerramienta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHerramienta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHerramienta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHerramienta.add(this.jComboBoxTiposReportesDinamicoHerramienta, this.gridBagConstraintsHerramienta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoHerramienta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoHerramienta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHerramienta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHerramienta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHerramienta.add(this.jLabelTiposArchivoReporteDinamicoHerramienta, this.gridBagConstraintsHerramienta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHerramienta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHerramienta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHerramienta.add(this.jComboBoxTiposArchivosReportesDinamicoHerramienta, this.gridBagConstraintsHerramienta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoHerramienta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoHerramienta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoHerramienta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoHerramienta.setToolTipText("Generar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHerramienta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHerramienta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHerramienta.add(this.jButtonGenerarReporteDinamicoHerramienta, this.gridBagConstraintsHerramienta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoHerramienta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoHerramienta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoHerramienta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoHerramienta.setToolTipText("Cancelar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHerramienta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHerramienta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHerramienta.add(this.jButtonCerrarReporteDinamicoHerramienta, this.gridBagConstraintsHerramienta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalHerramienta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoHerramienta= new JScrollPane(jPanelReporteDinamicoHerramienta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoHerramienta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHerramienta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHerramienta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Herramientas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsHerramienta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoHerramienta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoHerramienta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalHerramienta);
		this.jInternalFrameReporteDinamicoHerramienta.getContentPane().add(this.jScrollPanelReporteDinamicoHerramienta, this.gridBagConstraintsHerramienta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionHerramienta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionHerramienta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionHerramienta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionHerramienta.setName("jPanelImportacionHerramienta"); 
		
		this.jPanelImportacionHerramienta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHerramienta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHerramienta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionHerramienta.setLayout(gridaBagLayoutImportacionHerramienta);
		
		
		this.jInternalFrameImportacionHerramienta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionHerramienta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionHerramienta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHerramienta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionHerramienta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHerramienta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHerramienta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionHerramienta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHerramienta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHerramienta.setResizable(true);
	    this.jInternalFrameImportacionHerramienta.setClosable(true);
	    this.jInternalFrameImportacionHerramienta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionHerramienta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHerramienta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHerramienta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionHerramienta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHerramienta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHerramienta.setResizable(true);
	    this.jInternalFrameImportacionHerramienta.setClosable(true);
	    this.jInternalFrameImportacionHerramienta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionHerramienta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHerramienta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHerramienta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Herramientas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionHerramienta = new JLabelMe();

		this.jLabelArchivoImportacionHerramienta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHerramienta.gridy = iPosYImportacion;		
		this.gridBagConstraintsHerramienta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHerramienta.add(this.jLabelArchivoImportacionHerramienta, this.gridBagConstraintsHerramienta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionHerramienta = new JFileChooser();		
		this.jFileChooserImportacionHerramienta.setToolTipText("ESCOGER ARCHIVO"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionHerramienta = new JButtonMe();
		this.jButtonAbrirImportacionHerramienta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionHerramienta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionHerramienta.setToolTipText("Generar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHerramienta.gridy = iPosYImportacion;
		this.gridBagConstraintsHerramienta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHerramienta.add(this.jButtonAbrirImportacionHerramienta, this.gridBagConstraintsHerramienta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionHerramienta = new JLabelMe();

		this.jLabelPathArchivoImportacionHerramienta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHerramienta.gridy = iPosYImportacion;		
		this.gridBagConstraintsHerramienta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHerramienta.add(this.jLabelPathArchivoImportacionHerramienta, this.gridBagConstraintsHerramienta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionHerramienta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionHerramienta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHerramienta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHerramienta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHerramienta.gridy = iPosYImportacion;
		this.gridBagConstraintsHerramienta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHerramienta.add(this.jTextFieldPathArchivoImportacionHerramienta, this.gridBagConstraintsHerramienta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionHerramienta = new JButtonMe();
		this.jButtonGenerarImportacionHerramienta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionHerramienta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionHerramienta.setToolTipText("Generar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHerramienta.gridy = iPosYImportacion;
		this.gridBagConstraintsHerramienta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHerramienta.add(this.jButtonGenerarImportacionHerramienta, this.gridBagConstraintsHerramienta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionHerramienta = new JButtonMe();
		this.jButtonCerrarImportacionHerramienta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionHerramienta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionHerramienta.setToolTipText("Cancelar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHerramienta.gridy = iPosYImportacion;
		this.gridBagConstraintsHerramienta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHerramienta.add(this.jButtonCerrarImportacionHerramienta, this.gridBagConstraintsHerramienta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalHerramienta = new GridBagLayout();
		
		this.jScrollPanelImportacionHerramienta= new JScrollPane(jPanelImportacionHerramienta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy =iPosYImportacion;
		this.gridBagConstraintsHerramienta.gridx =iPosXImportacion;
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionHerramienta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionHerramienta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalHerramienta);
		this.jInternalFrameImportacionHerramienta.getContentPane().add(this.jScrollPanelImportacionHerramienta, this.gridBagConstraintsHerramienta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByHerramienta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByHerramienta = new JButtonMe();
			this.jButtonAbrirOrderByHerramienta.setText("Orden");
			this.jButtonAbrirOrderByHerramienta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHerramienta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByHerramienta";
			inputMap = this.jButtonAbrirOrderByHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByHerramienta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByHerramienta"));
		
		
			GridBagLayout gridaBagLayoutOrderByHerramienta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByHerramienta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByHerramienta.setName("jPanelOrderByHerramienta"); 
			
			this.jPanelOrderByHerramienta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHerramienta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHerramienta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByHerramienta.setLayout(gridaBagLayoutOrderByHerramienta);
			
			
			this.jTableDatosHerramientaOrderBy = new JTableMe();        
			this.jTableDatosHerramientaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosHerramientaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosHerramientaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosHerramientaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosHerramientaOrderBy.setViewportView(this.jTableDatosHerramientaOrderBy);
			this.jTableDatosHerramientaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosHerramientaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByHerramienta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByHerramienta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByHerramienta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteHerramienta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByHerramienta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByHerramienta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByHerramienta.setTitle("Orden");
			this.jInternalFrameOrderByHerramienta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByHerramienta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByHerramienta.setResizable(true);
			this.jInternalFrameOrderByHerramienta.setClosable(true);
			this.jInternalFrameOrderByHerramienta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByHerramienta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHerramienta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHerramienta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Herramientas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsHerramienta.gridx =iPosXOrderBy;
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsHerramienta.ipady =150;
				
			this.jPanelOrderByHerramienta.add(jScrollPanelDatosHerramientaOrderBy, this.gridBagConstraintsHerramienta);//this.jTableDatosHerramientaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByHerramienta = new JButtonMe();
			this.jButtonCerrarOrderByHerramienta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByHerramienta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByHerramienta.setToolTipText("Cancelar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHerramienta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsHerramienta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByHerramienta.add(this.jButtonCerrarOrderByHerramienta, this.gridBagConstraintsHerramienta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalHerramienta = new GridBagLayout();
			
			this.jScrollPanelOrderByHerramienta= new JScrollPane(jPanelOrderByHerramienta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.gridy =iPosYOrderBy;
			this.gridBagConstraintsHerramienta.gridx =iPosXOrderBy;
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByHerramienta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByHerramienta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalHerramienta);
			
			this.jInternalFrameOrderByHerramienta.getContentPane().add(this.jScrollPanelOrderByHerramienta, this.gridBagConstraintsHerramienta);			
		
		} else {
			this.jButtonAbrirOrderByHerramienta = new JButtonMe();
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
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.herramientaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosHerramienta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosHerramienta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosHerramienta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosHerramienta.getRowHeight();//HerramientaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > HerramientaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHerramienta.isSelected()) {
					iHeightTable=HerramientaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HerramientaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HerramientaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > HerramientaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHerramienta.isSelected()) {
					iHeightTable=HerramientaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HerramientaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HerramientaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosHerramienta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHerramienta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHerramienta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosHerramienta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHerramienta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHerramienta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByHerramienta!=null && this.jInternalFrameOrderByHerramienta.getjTableDatosOrderBy()!=null) {
			//if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByHerramienta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByHerramienta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByHerramienta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByHerramienta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByHerramienta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByHerramienta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByHerramienta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosHerramienta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHerramienta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHerramienta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=herramientaLogic.getHerramientas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=herramientas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Herramienta> TraerHerramientaBeans(List<Herramienta> herramientas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Herramienta herramienta:herramientas) {
					
				if(!(HerramientaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || HerramientaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					herramienta.setsDetalleGeneralEntityReporte(HerramientaConstantesFunciones.getHerramientaDescripcion(herramienta));
										
						
					
					

					if(herramienta.getEmpleadoHerras()!=null && Funciones.existeClass(classes,EmpleadoHerra.class)) {
						try{herramienta.setempleadoherrasDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoHerraJInternalFrame.TraerEmpleadoHerraBeans(herramienta.getEmpleadoHerras(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//herramienta.setsDetalleGeneralEntityReporte(herramienta.getsDetalleGeneralEntityReporte());
										
				}
				
				//herramientabeans.add(herramientabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return herramientas;
    }
	//PARA REPORTES FIN
}
