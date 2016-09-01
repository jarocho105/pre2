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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

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
import com.bydan.erp.nomina.util.ProfesionConstantesFunciones;

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
public class ProfesionJInternalFrame extends ProfesionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProfesion;
	
	protected JMenuBar jmenuBarProfesion;
	
	protected JMenu jmenuProfesion;
	protected JMenu jmenuDatosProfesion;
	protected JMenu jmenuArchivoProfesion;
	protected JMenu jmenuAccionesProfesion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProfesion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProfesion;	
	protected GridBagConstraints gridBagConstraintsProfesion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProfesionDetalleFormJInternalFrame jInternalFrameDetalleFormProfesion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProfesion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProfesion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ProfesionSessionBean profesionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Profesion> profesions;		
	public List<Profesion> profesionsEliminados;	
	public List<Profesion> profesionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProfesion;		
	protected JButton jButtonAbrirOrderByProfesion;
	
	
	//protected JPanel jPanelOrderByProfesion;
	//public JScrollPane jScrollPanelOrderByProfesion;	
	//protected JButton jButtonCerrarOrderByProfesion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProfesionLogic profesionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProfesion;
	public JScrollPane jScrollPanelDatosEdicionProfesion;
	public JScrollPane jScrollPanelDatosGeneralProfesion;
    
	
	
	//public JScrollPane jScrollPanelDatosProfesionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProfesion;
	//public JScrollPane jScrollPanelImportacionProfesion;
	
	
	
	protected JPanel jPanelAccionesProfesion;
	
    protected JPanel jPanelPaginacionProfesion;
    protected JPanel jPanelParametrosReportesProfesion;
	protected JPanel jPanelParametrosReportesAccionesProfesion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Profesion;
	protected JPanel jPanelParametrosAuxiliar2Profesion;
	protected JPanel jPanelParametrosAuxiliar3Profesion;
	protected JPanel jPanelParametrosAuxiliar4Profesion;
	//protected JPanel jPanelParametrosAuxiliar5Profesion;
	
	
	
	//protected JPanel jPanelReporteDinamicoProfesion;
	//protected JPanel jPanelImportacionProfesion;
	
	
	public JTable jTableDatosProfesion;
	
	
	
	//public JTable jTableDatosProfesionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProfesion;
	protected JButton jButtonDuplicarProfesion;
	protected JButton jButtonCopiarProfesion;
	protected JButton jButtonVerFormProfesion;
	protected JButton jButtonNuevoRelacionesProfesion;
	protected JButton jButtonModificarProfesion;
	
    protected JButton jButtonGuardarCambiosTablaProfesion;
	protected JButton jButtonCerrarProfesion;
	
	
	protected JButton jButtonRecargarInformacionProfesion;
	protected JButton jButtonProcesarInformacionProfesion;
	
	
	protected JButton jButtonAnterioresProfesion;
	protected JButton jButtonSiguientesProfesion;
	protected JButton jButtonNuevoGuardarCambiosProfesion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProfesion;
	//protected JButton jButtonCerrarReporteDinamicoProfesion;
	//protected JButton jButtonGenerarExcelReporteDinamicoProfesion;	
	
	
	
	//protected JButton jButtonAbrirImportacionProfesion;
	//protected JButton jButtonGenerarImportacionProfesion;
	//protected JButton jButtonCerrarImportacionProfesion;
	//protected JFileChooser jFileChooserImportacionProfesion;
	//protected File fileImportacionProfesion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProfesion;
	protected JButton jButtonDuplicarToolBarProfesion;
	protected JButton jButtonNuevoRelacionesToolBarProfesion;
	
	
	public JButton jButtonGuardarCambiosToolBarProfesion;
	protected JButton jButtonCopiarToolBarProfesion;
	protected JButton jButtonVerFormToolBarProfesion;
	public JButton jButtonGuardarCambiosTablaToolBarProfesion;
	protected JButton jButtonMostrarOcultarTablaToolBarProfesion;
	protected JButton jButtonCerrarToolBarProfesion;
	
	protected JButton jButtonRecargarInformacionToolBarProfesion;
	protected JButton jButtonProcesarInformacionToolBarProfesion;
	protected JButton jButtonAnterioresToolBarProfesion;
	protected JButton jButtonSiguientesToolBarProfesion;
	protected JButton jButtonNuevoGuardarCambiosToolBarProfesion;
	protected JButton jButtonAbrirOrderByToolBarProfesion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProfesion;
	protected JMenuItem jMenuItemDuplicarProfesion;
	protected JMenuItem jMenuItemNuevoRelacionesProfesion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProfesion;
	protected JMenuItem jMenuItemCopiarProfesion;
	protected JMenuItem jMenuItemVerFormProfesion;
	protected JMenuItem jMenuItemGuardarCambiosTablaProfesion;
	protected JMenuItem jMenuItemCerrarProfesion;
	protected JMenuItem jMenuItemDetalleCerrarProfesion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProfesion;
	protected JMenuItem jMenuItemDetalleMostarOcultarProfesion;
	
	protected JMenuItem jMenuItemRecargarInformacionProfesion;
	protected JMenuItem jMenuItemProcesarInformacionProfesion;
	protected JMenuItem jMenuItemAnterioresProfesion;
	protected JMenuItem jMenuItemSiguientesProfesion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProfesion;
	protected JMenuItem jMenuItemAbrirOrderByProfesion;
	protected JMenuItem jMenuItemMostrarOcultarProfesion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProfesion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProfesion;
	protected JCheckBox jCheckBoxSeleccionadosProfesion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProfesion;
	protected JCheckBox jCheckBoxConGraficoReporteProfesion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProfesion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProfesion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProfesion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProfesion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProfesion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProfesion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProfesion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProfesion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProfesion;
	protected JTextField jTextFieldValorCampoGeneralProfesion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProfesion;
	//public JList<Reporte> jListColumnasSelectReporteProfesion;
	//public JScrollPane jScrollColumnasSelectReporteProfesion;
	
	//public JLabel jLabelRelacionesSelectReporteProfesion;
	//public JList<Reporte> jListRelacionesSelectReporteProfesion;
	//public JScrollPane jScrollRelacionesSelectReporteProfesion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProfesion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProfesion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProfesion;
	//public JLabel jLabelTiposArchivoReporteDinamicoProfesion;
	
		
	//public JLabel jLabelArchivoImportacionProfesion;	
	//public JLabel jLabelPathArchivoImportacionProfesion;
	//protected JTextField jTextFieldPathArchivoImportacionProfesion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProfesion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProfesion;
	
	//public JLabel jLabelColumnaCategoriaValorProfesion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProfesion;
	
	//public JLabel jLabelColumnasValoresGraficoProfesion;
	//public JList<Reporte> jListColumnasValoresGraficoProfesion;
	//public JScrollPane jScrollColumnasValoresGraficoProfesion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProfesion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProfesion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProfesion;
	public JPanel jPanelBusquedaPorCodigoProfesion;
	public JButton jButtonBusquedaPorCodigoProfesion;
	public JPanel jPanelBusquedaPorNombreProfesion;
	public JButton jButtonBusquedaPorNombreProfesion;
	
	public JPanel jPanelcodigoBusquedaPorCodigoProfesion;
	public JLabel jLabelcodigoBusquedaPorCodigoProfesion;
	public JTextField jTextFieldcodigoBusquedaPorCodigoProfesion;
	public JButton jButtoncodigoBusquedaPorCodigoProfesionBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreProfesion;
	public JLabel jLabelnombreBusquedaPorNombreProfesion;
	public JTextArea jTextAreanombreBusquedaPorNombreProfesion;
	public JButton jButtonnombreBusquedaPorNombreProfesionBusqueda= new JButtonMe();

	
	
	
	
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
	public ProfesionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Profesion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProfesionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Profesion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProfesionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Profesion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProfesionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Profesion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProfesion)	{
		this.jButtonRecargarInformacionProfesion = jButtonRecargarInformacionProfesion;
	}
	
	public JButton getjButtonProcesarInformacionProfesion() {
		return this.jButtonProcesarInformacionProfesion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProfesion)	{
		this.jButtonProcesarInformacionProfesion = jButtonProcesarInformacionProfesion;
	}
	
	
	public JButton getjButtonRecargarInformacionProfesion() {
		return this.jButtonRecargarInformacionProfesion;
	}
	
	
	public List<Profesion> getprofesions() {
		return this.profesions;
	}

	public void setprofesions(List<Profesion> profesions) {
		this.profesions = profesions;
	}
	
	public List<Profesion> getprofesionsAux() {
		return this.profesionsAux;
	}

	public void setprofesionsAux(List<Profesion> profesionsAux) {
		this.profesionsAux = profesionsAux;
	}
	
	public List<Profesion> getprofesionsEliminados() {
		return this.profesionsEliminados;
	}

	public void setProfesionsEliminados(List<Profesion> profesionsEliminados) {
		this.profesionsEliminados = profesionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProfesion() {
		return jComboBoxTiposSeleccionarProfesion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProfesion(
			JComboBox jComboBoxTiposSeleccionarProfesion) {
		this.jComboBoxTiposSeleccionarProfesion = jComboBoxTiposSeleccionarProfesion;
	}
	
	public void setBorderResaltarTiposSeleccionarProfesion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProfesion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProfesion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProfesion() {
		return jTextFieldValorCampoGeneralProfesion;
	}

	public void setjTextFieldValorCampoGeneralProfesion(
			JTextField jTextFieldValorCampoGeneralProfesion) {
		this.jTextFieldValorCampoGeneralProfesion = jTextFieldValorCampoGeneralProfesion;
	}

	public void setBorderResaltarValorCampoGeneralProfesion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProfesion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProfesion() {
		return this.jCheckBoxSeleccionarTodosProfesion;
	}

	public void setjCheckBoxSeleccionarTodosProfesion(
			JCheckBox jCheckBoxSeleccionarTodosProfesion) {
		this.jCheckBoxSeleccionarTodosProfesion = jCheckBoxSeleccionarTodosProfesion;
	}

	public void setBorderResaltarSeleccionarTodosProfesion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProfesion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProfesion() {
		return this.jCheckBoxSeleccionadosProfesion;
	}

	public void setjCheckBoxSeleccionadosProfesion(
			JCheckBox jCheckBoxSeleccionadosProfesion) {
		this.jCheckBoxSeleccionadosProfesion = jCheckBoxSeleccionadosProfesion;
	}
	
	public void setBorderResaltarSeleccionadosProfesion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProfesion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProfesion() {
		return this.jComboBoxTiposArchivosReportesProfesion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProfesion(
			JComboBox jComboBoxTiposArchivosReportesProfesion) {
		this.jComboBoxTiposArchivosReportesProfesion = jComboBoxTiposArchivosReportesProfesion;
	}

	public void setBorderResaltarTiposArchivosReportesProfesion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProfesion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProfesion() {
		return this.jComboBoxTiposReportesProfesion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProfesion(
			JComboBox jComboBoxTiposReportesProfesion) {
		this.jComboBoxTiposReportesProfesion = jComboBoxTiposReportesProfesion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProfesion() {
	//	return jComboBoxTiposReportesDinamicoProfesion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProfesion(
	//		JComboBox jComboBoxTiposReportesDinamicoProfesion) {
	//	this.jComboBoxTiposReportesDinamicoProfesion = jComboBoxTiposReportesDinamicoProfesion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProfesion() {
	//	return jComboBoxTiposArchivosReportesDinamicoProfesion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProfesion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProfesion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProfesion = jComboBoxTiposArchivosReportesDinamicoProfesion;
	//}
	
	public void setBorderResaltarTiposReportesProfesion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProfesion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProfesion() {
		return this.jComboBoxTiposGraficosReportesProfesion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProfesion(
			JComboBox jComboBoxTiposGraficosReportesProfesion) {
		this.jComboBoxTiposGraficosReportesProfesion = jComboBoxTiposGraficosReportesProfesion;
	}
	
	public void setBorderResaltarTiposGraficosReportesProfesion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProfesion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProfesion() {
		return this.jComboBoxTiposPaginacionProfesion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProfesion(
			JComboBox jComboBoxTiposPaginacionProfesion) {
		this.jComboBoxTiposPaginacionProfesion = jComboBoxTiposPaginacionProfesion;
	}
	
	public void setBorderResaltarTiposPaginacionProfesion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProfesion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProfesion() {
		return this.jComboBoxTiposRelacionesProfesion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProfesion() {
		return this.jComboBoxTiposAccionesProfesion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProfesion(
			JComboBox jComboBoxTiposRelacionesProfesion) {
		this.jComboBoxTiposRelacionesProfesion = jComboBoxTiposRelacionesProfesion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProfesion(
			JComboBox jComboBoxTiposAccionesProfesion) {
		this.jComboBoxTiposAccionesProfesion = jComboBoxTiposAccionesProfesion;
	}
	
	public void setBorderResaltarTiposRelacionesProfesion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProfesion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProfesion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProfesion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProfesion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProfesion() {
	//	return jCheckBoxConGraficoDinamicoProfesion;
	//}

	//public void setjCheckBoxConGraficoDinamicoProfesion(
	//		JCheckBox jCheckBoxConGraficoDinamicoProfesion) {
	//	this.jCheckBoxConGraficoDinamicoProfesion = jCheckBoxConGraficoDinamicoProfesion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProfesion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProfesion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProfesion .setBorder(borderResaltar);		
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
		this.profesionSessionBean=new ProfesionSessionBean();
		
		this.profesionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.profesionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.profesionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProfesionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProfesionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProfesionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProfesionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProfesionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Profesion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
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
		
		ProfesionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Profesion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProfesion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProfesion,this.jTtoolBarProfesion,
							"nuevo","nuevo","Nuevo"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProfesion,this.jTtoolBarProfesion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProfesion,this.jTtoolBarProfesion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProfesion,this.jTtoolBarProfesion,
							"duplicar","duplicar","Duplicar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProfesion,this.jTtoolBarProfesion,
							"copiar","copiar","Copiar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProfesion,this.jTtoolBarProfesion,
							"ver_form","ver_form","Ver"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProfesion,this.jTtoolBarProfesion,
							"recargar","recargar","Recargar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProfesion,this.jTtoolBarProfesion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProfesion,this.jTtoolBarProfesion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProfesion,this.jTtoolBarProfesion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProfesion,this.jTtoolBarProfesion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProfesion,this.jTtoolBarProfesion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProfesion,this.jTtoolBarProfesion,
							"cerrar","cerrar","Salir"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProfesion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProfesion;
			
				this.jButtonProcesarInformacionToolBarProfesion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProfesion;
				
		//protected JButton jButtonModificarToolBarProfesion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProfesion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProfesion=new JMenuMe("General");
		this.jmenuArchivoProfesion=new JMenuMe("Archivo");
		this.jmenuAccionesProfesion=new JMenuMe("Acciones");
		this.jmenuDatosProfesion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProfesion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProfesion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProfesion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProfesion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProfesion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProfesion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProfesion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProfesion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProfesion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProfesion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProfesion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProfesion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProfesion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProfesion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProfesion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProfesion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProfesion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProfesion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProfesion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProfesion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProfesion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProfesion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProfesion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProfesion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProfesion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProfesion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProfesion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProfesion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProfesion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProfesion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProfesion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProfesion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProfesion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProfesion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProfesion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProfesion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProfesion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProfesion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProfesion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProfesion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProfesion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProfesion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProfesion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProfesion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProfesion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProfesion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProfesion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProfesion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProfesion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProfesion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProfesion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProfesion.add(this.jMenuItemCerrarProfesion);
			
			this.jmenuAccionesProfesion.add(this.jMenuItemNuevoProfesion);
			this.jmenuAccionesProfesion.add(this.jMenuItemNuevoGuardarCambiosProfesion);
			this.jmenuAccionesProfesion.add(this.jMenuItemNuevoRelacionesProfesion);
			this.jmenuAccionesProfesion.add(this.jMenuItemGuardarCambiosTablaProfesion);		
			this.jmenuAccionesProfesion.add(this.jMenuItemDuplicarProfesion);		
			this.jmenuAccionesProfesion.add(this.jMenuItemCopiarProfesion);		
			this.jmenuAccionesProfesion.add(this.jMenuItemVerFormProfesion);		
			
			this.jmenuDatosProfesion.add(this.jMenuItemRecargarInformacionProfesion);				
			this.jmenuDatosProfesion.add(this.jMenuItemAnterioresProfesion);				
			this.jmenuDatosProfesion.add(this.jMenuItemSiguientesProfesion);				
			this.jmenuDatosProfesion.add(this.jMenuItemAbrirOrderByProfesion);				
			this.jmenuDatosProfesion.add(this.jMenuItemMostrarOcultarProfesion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProfesion.add(this.jMenuItemGuardarCambiosProfesion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProfesion.add(this.jmenuArchivoProfesion);		
			this.jmenuBarProfesion.add(this.jmenuAccionesProfesion);		
			this.jmenuBarProfesion.add(this.jmenuDatosProfesion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProfesion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProfesion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoProfesion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoProfesion.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoProfesion= new JButtonMe();
		this.jButtonBusquedaPorCodigoProfesion.setText("Buscar");
		this.jButtonBusquedaPorCodigoProfesion.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoProfesion,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoProfesion = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoProfesion.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoProfesion.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoProfesion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoProfesion= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoProfesion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreProfesion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreProfesion.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreProfesion= new JButtonMe();
		this.jButtonBusquedaPorNombreProfesion.setText("Buscar");
		this.jButtonBusquedaPorNombreProfesion.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreProfesion,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreProfesion = new JLabelMe();
		jLabelnombreBusquedaPorNombreProfesion.setText("Nombre :");
		jLabelnombreBusquedaPorNombreProfesion.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreProfesion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreProfesion= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreProfesion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProfesion=new JTabbedPane();


		this.jTabbedPaneBusquedasProfesion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProfesion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProfesion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProfesion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProfesion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProfesion = new ProfesionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Profesion DATOS");
			this.jInternalFrameDetalleFormProfesion = new ProfesionDetalleFormJInternalFrame(jDesktopPane,this.profesionSessionBean.getConGuardarRelaciones(),this.profesionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProfesion = null;//new ProfesionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProfesion= new GridBagLayout();
		
		
		this.jTableDatosProfesion = new JTableMe();      
		
		String sToolTipProfesion="";
		sToolTipProfesion=ProfesionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProfesion+="(Nomina.Profesion)";
		}
		
		if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
			sToolTipProfesion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProfesion.setToolTipText(sToolTipProfesion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProfesion);
		this.jTableDatosProfesion.setAutoCreateRowSorter(true);
		this.jTableDatosProfesion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProfesion.setRowSelectionAllowed(true);
		this.jTableDatosProfesion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProfesion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProfesion = new JButtonMe();
		this.jButtonDuplicarProfesion = new JButtonMe();
		this.jButtonCopiarProfesion = new JButtonMe();
		this.jButtonVerFormProfesion = new JButtonMe();
		this.jButtonNuevoRelacionesProfesion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProfesion = new JButtonMe();
		this.jButtonCerrarProfesion = new JButtonMe();
		
		this.jScrollPanelDatosProfesion = new JScrollPane();   
        this.jScrollPanelDatosGeneralProfesion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProfesion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Profesion";
		
		if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Profesiones" + this.sPath));
		} else {
			this.jScrollPanelDatosProfesion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProfesion.setToolTipText("Acciones");
        this.jPanelAccionesProfesion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProfesion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProfesion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProfesion=new ReporteDinamicoJInternalFrame(ProfesionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProfesion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProfesion=new ImportacionJInternalFrame(ProfesionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProfesion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProfesion = new JButtonMe();
		
		this.jButtonAbrirOrderByProfesion.setText("Orden");
		this.jButtonAbrirOrderByProfesion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProfesion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProfesion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProfesion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProfesion,false,this);
			
			//this.cargarOrderByProfesion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProfesion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProfesion,true,this);
			
			//this.cargarOrderByProfesion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProfesion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosProfesion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosProfesion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosProfesion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProfesion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProfesion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProfesion.setText("Nuevo");
		this.jButtonDuplicarProfesion.setText("Duplicar");
		this.jButtonCopiarProfesion.setText("Copiar");
		this.jButtonVerFormProfesion.setText("Ver");
		this.jButtonNuevoRelacionesProfesion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProfesion.setText("Guardar");
		this.jButtonCerrarProfesion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProfesion,"nuevo_button","Nuevo",this.profesionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProfesion,"duplicar_button","Duplicar",this.profesionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProfesion,"copiar_button","Copiar",this.profesionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProfesion,"ver_form","Ver",this.profesionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProfesion,"nuevorelaciones_button","Nuevo Rel",this.profesionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProfesion,"guardarcambiostabla_button","Guardar",this.profesionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProfesion,"cerrar_button","Salir",this.profesionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProfesion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProfesion.setToolTipText("Nuevo"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProfesion.setToolTipText("Duplicar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProfesion.setToolTipText("Copiar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProfesion.setToolTipText("Ver"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProfesion.setToolTipText("Nuevo Rel"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProfesion.setToolTipText("Guardar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProfesion.setToolTipText("Salir"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProfesion";
		inputMap = this.jButtonNuevoProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProfesion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProfesion"));
		
		//DUPLICAR
		sMapKey = "DuplicarProfesion";
		inputMap = this.jButtonDuplicarProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProfesion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProfesion"));
		
		//COPIAR
		sMapKey = "CopiarProfesion";
		inputMap = this.jButtonCopiarProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProfesion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProfesion"));
		
		//VEr FORM
		sMapKey = "VerFormProfesion";
		inputMap = this.jButtonVerFormProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProfesion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProfesion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProfesion";
		inputMap = this.jButtonNuevoRelacionesProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProfesion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProfesion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProfesion";
		inputMap = this.jButtonModificarProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProfesion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProfesion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProfesion";
		inputMap = this.jButtonCerrarProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProfesion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProfesion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProfesion";
		inputMap = this.jButtonGuardarCambiosTablaProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProfesion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProfesion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProfesion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProfesion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProfesion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Profesion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Profesion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Profesion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Profesion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Profesion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProfesion.setName("jPanelParametrosReportesProfesion"); 
		
		this.jPanelParametrosReportesAccionesProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProfesion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProfesion.setName("jPanelParametrosReportesAccionesProfesion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProfesion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProfesion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProfesion = new JButtonMe();
		this.jButtonRecargarInformacionProfesion.setText("Recargar");
		this.jButtonRecargarInformacionProfesion.setToolTipText("Recargar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProfesion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProfesion = new JButtonMe();
		this.jButtonProcesarInformacionProfesion.setText("Procesar");
		this.jButtonProcesarInformacionProfesion.setToolTipText("Procesar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProfesion.setVisible(false);
			
		this.jButtonProcesarInformacionProfesion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProfesion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProfesion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProfesion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProfesion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProfesion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProfesion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProfesion.setText("TIPO");       
		this.jComboBoxTiposReportesProfesion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProfesion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProfesion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProfesion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProfesion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProfesion.setText("Paginacion");
		this.jComboBoxTiposPaginacionProfesion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProfesion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProfesion.setText("Accion");
		this.jComboBoxTiposRelacionesProfesion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProfesion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProfesion.setText("Accion");
		this.jComboBoxTiposAccionesProfesion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProfesion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProfesion.setText("Accion");
		this.jComboBoxTiposSeleccionarProfesion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProfesion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProfesion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProfesion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProfesion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProfesion = new JLabelMe();
		
		this.jLabelAccionesProfesion.setText("Acciones");		
		this.jLabelAccionesProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProfesion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProfesion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProfesion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProfesion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProfesion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProfesion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProfesion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProfesion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProfesion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProfesion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProfesion.setText("Graf.");
		this.jCheckBoxConGraficoReporteProfesion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProfesion = new JButtonMe();
		//this.jButtonAnterioresProfesion.setText("<<");
        this.jButtonAnterioresProfesion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProfesion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProfesion = new JButtonMe();
		//this.jButtonSiguientesProfesion.setText(">>");
        this.jButtonSiguientesProfesion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProfesion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProfesion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProfesion.setText("Nue");
        this.jButtonNuevoGuardarCambiosProfesion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProfesion,"nuevoguardarcambios_button","Nue",this.profesionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProfesion";
		inputMap = this.jButtonNuevoGuardarCambiosProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProfesion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProfesion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProfesion";
		inputMap = this.jButtonRecargarInformacionProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProfesion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProfesion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProfesion";
		inputMap = this.jButtonSiguientesProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProfesion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProfesion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProfesion";
		inputMap = this.jButtonAnterioresProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProfesion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProfesion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProfesion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProfesion.setMinimumSize(new Dimension(this.getWidth(),ProfesionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProfesionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProfesion.setMaximumSize(new Dimension(this.getWidth(),ProfesionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProfesionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProfesion.setPreferredSize(new Dimension(this.getWidth(),ProfesionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProfesionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProfesion = new GridBagLayout();

			this.jPanelPaginacionProfesion.setLayout(gridaBagLayoutPaginacionProfesion);						
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.gridy = 0;
			this.gridBagConstraintsProfesion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProfesion.add(this.jButtonAnterioresProfesion, this.gridBagConstraintsProfesion);
					
						
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProfesion.gridy = 0;
			
			this.jPanelPaginacionProfesion.add(this.jButtonNuevoGuardarCambiosProfesion, this.gridBagConstraintsProfesion);
						
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProfesion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProfesion.gridy = 0;
			this.jPanelPaginacionProfesion.add(this.jButtonSiguientesProfesion, this.gridBagConstraintsProfesion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.gridy = 1;
			this.gridBagConstraintsProfesion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProfesion.add(this.jButtonNuevoProfesion, this.gridBagConstraintsProfesion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsProfesion = new GridBagConstraints();
				this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProfesion.gridy = 1;
				this.gridBagConstraintsProfesion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionProfesion.add(this.jButtonNuevoRelacionesProfesion, this.gridBagConstraintsProfesion);
			}
			
			
			if(!this.profesionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProfesion = new GridBagConstraints();
				this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProfesion.gridy = 1;
				this.gridBagConstraintsProfesion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProfesion.add(this.jButtonGuardarCambiosTablaProfesion, this.gridBagConstraintsProfesion);
			}
			
			
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.gridy = 1;
			this.gridBagConstraintsProfesion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProfesion.add(this.jButtonDuplicarProfesion, this.gridBagConstraintsProfesion);
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.gridy = 1;
			this.gridBagConstraintsProfesion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProfesion.add(this.jButtonCopiarProfesion, this.gridBagConstraintsProfesion);
		
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.gridy = 1;
			this.gridBagConstraintsProfesion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProfesion.add(this.jButtonVerFormProfesion, this.gridBagConstraintsProfesion);
		
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.gridy = 1;
			this.gridBagConstraintsProfesion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProfesion.add(this.jButtonCerrarProfesion, this.gridBagConstraintsProfesion);
		
		
		
		this.jButtonRecargarInformacionProfesion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProfesion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProfesion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProfesion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProfesion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProfesion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProfesion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProfesion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProfesion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProfesion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProfesion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProfesion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProfesion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProfesion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProfesion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProfesion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProfesion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProfesion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProfesion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProfesion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProfesion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProfesion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProfesion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProfesion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProfesion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProfesion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProfesion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProfesion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProfesion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProfesion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProfesion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProfesion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProfesion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProfesion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProfesion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProfesion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProfesion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProfesion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProfesion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProfesion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Profesion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Profesion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Profesion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Profesion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProfesion.setLayout(gridaBagParametrosReportesProfesion);
			this.jPanelParametrosReportesAccionesProfesion.setLayout(gridaBagParametrosReportesAccionesProfesion);
			
			
			this.jPanelParametrosAuxiliar1Profesion.setLayout(gridaBagParametrosAuxiliar1Profesion);
			this.jPanelParametrosAuxiliar2Profesion.setLayout(gridaBagParametrosAuxiliar2Profesion);
			this.jPanelParametrosAuxiliar3Profesion.setLayout(gridaBagParametrosAuxiliar3Profesion);
			this.jPanelParametrosAuxiliar4Profesion.setLayout(gridaBagParametrosAuxiliar4Profesion);
			//this.jPanelParametrosAuxiliar5Profesion.setLayout(gridaBagParametrosAuxiliar2Profesion);			
			
			
			
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProfesion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProfesion.add(this.jButtonRecargarInformacionProfesion, this.gridBagConstraintsProfesion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProfesion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Profesion.add(this.jComboBoxTiposPaginacionProfesion, this.gridBagConstraintsProfesion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProfesion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Profesion.add(this.jCheckBoxConAltoMaximoTablaProfesion, this.gridBagConstraintsProfesion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProfesion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Profesion.add(this.jComboBoxTiposArchivosReportesProfesion, this.gridBagConstraintsProfesion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProfesion.add(this.jPanelParametrosAuxiliar1Profesion, this.gridBagConstraintsProfesion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProfesion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Profesion.add(this.jComboBoxTiposReportesProfesion, this.gridBagConstraintsProfesion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProfesion.add(this.jPanelParametrosAuxiliar4Profesion, this.gridBagConstraintsProfesion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProfesion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProfesion.add(this.jComboBoxTiposReportesProfesion, this.gridBagConstraintsProfesion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProfesion.add(this.jCheckBoxGenerarReporteProfesion, this.gridBagConstraintsProfesion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProfesion.add(this.jPanelParametrosAuxiliar2Profesion, this.gridBagConstraintsProfesion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProfesion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProfesion.add(this.jLabelAccionesProfesion, this.gridBagConstraintsProfesion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProfesion = new GridBagConstraints();
				this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProfesion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProfesion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProfesion.add(this.jButtonAbrirOrderByProfesion, this.gridBagConstraintsProfesion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProfesion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProfesion.add(this.jComboBoxTiposSeleccionarProfesion, this.gridBagConstraintsProfesion);			
			
			
			/*
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProfesion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProfesion.add(this.jCheckBoxSeleccionarTodosProfesion, this.gridBagConstraintsProfesion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProfesion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Profesion.add(this.jCheckBoxSeleccionarTodosProfesion, this.gridBagConstraintsProfesion);															
				
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProfesion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Profesion.add(this.jCheckBoxSeleccionadosProfesion, this.gridBagConstraintsProfesion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProfesion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProfesion.add(this.jPanelParametrosAuxiliar3Profesion, this.gridBagConstraintsProfesion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProfesion.add(this.jComboBoxTiposRelacionesProfesion, this.gridBagConstraintsProfesion);
				
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProfesion.add(this.jComboBoxTiposAccionesProfesion, this.gridBagConstraintsProfesion);
	
				
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProfesion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProfesion.add(this.jTextFieldValorCampoGeneralProfesion, this.gridBagConstraintsProfesion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProfesion = new GridBagLayout();

			this.jScrollPanelDatosProfesion.setLayout(gridaBagLayoutDatosProfesion);
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.gridy = 0;
			this.gridBagConstraintsProfesion.gridx = 0;
			
			this.jScrollPanelDatosProfesion.add(this.jTableDatosProfesion, this.gridBagConstraintsProfesion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProfesion.setViewportView(this.jTableDatosProfesion);
		this.jTableDatosProfesion.setFillsViewportHeight(true);
		this.jTableDatosProfesion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProfesion= new GridBagLayout();
		this.jPanelAccionesProfesion.setLayout(gridaBagLayoutAccionesProfesion);
		
		
		/*	
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesion.gridy = 0;
		this.gridBagConstraintsProfesion.gridx = 0;
			
		this.jPanelAccionesProfesion.add(this.jButtonNuevoProfesion, this.gridBagConstraintsProfesion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoProfesion= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoProfesion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoProfesion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoProfesion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoProfesion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoProfesion.setLayout(gridaBagLayoutBusquedaPorCodigoProfesion);

		gridBagConstraintsProfesion = new GridBagConstraints();
		gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProfesion.gridy = 0;
		gridBagConstraintsProfesion.gridx = 0;
		jPanelBusquedaPorCodigoProfesion.add(jLabelcodigoBusquedaPorCodigoProfesion, gridBagConstraintsProfesion);

		gridBagConstraintsProfesion = new GridBagConstraints();
		gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProfesion.gridy = 0;
		gridBagConstraintsProfesion.gridx = 1;
		jPanelBusquedaPorCodigoProfesion.add(jTextFieldcodigoBusquedaPorCodigoProfesion, gridBagConstraintsProfesion);

		gridBagConstraintsProfesion = new GridBagConstraints();
		gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProfesion.gridy = 1;
		gridBagConstraintsProfesion.gridx =1;
		jPanelBusquedaPorCodigoProfesion.add(jButtonBusquedaPorCodigoProfesion, gridBagConstraintsProfesion);

		jTabbedPaneBusquedasProfesion.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoProfesion);
		jTabbedPaneBusquedasProfesion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreProfesion= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreProfesion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreProfesion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreProfesion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreProfesion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreProfesion.setLayout(gridaBagLayoutBusquedaPorNombreProfesion);

		gridBagConstraintsProfesion = new GridBagConstraints();
		gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProfesion.gridy = 0;
		gridBagConstraintsProfesion.gridx = 0;
		jPanelBusquedaPorNombreProfesion.add(jLabelnombreBusquedaPorNombreProfesion, gridBagConstraintsProfesion);

		gridBagConstraintsProfesion = new GridBagConstraints();
		gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProfesion.gridy = 0;
		gridBagConstraintsProfesion.gridx = 1;
		jPanelBusquedaPorNombreProfesion.add(jTextAreanombreBusquedaPorNombreProfesion, gridBagConstraintsProfesion);

		gridBagConstraintsProfesion = new GridBagConstraints();
		gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProfesion.gridy = 1;
		gridBagConstraintsProfesion.gridx =1;
		jPanelBusquedaPorNombreProfesion.add(jButtonBusquedaPorNombreProfesion, gridBagConstraintsProfesion);

		jTabbedPaneBusquedasProfesion.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreProfesion);
		jTabbedPaneBusquedasProfesion.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProfesion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProfesion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.profesionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProfesion = new GridBagConstraints();						
			this.gridBagConstraintsProfesion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProfesion.gridx = 0;		
			//this.gridBagConstraintsProfesion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProfesion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProfesion, this.gridBagConstraintsProfesion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProfesion.gridx = 0;		
		//this.gridBagConstraintsProfesion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProfesion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProfesion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProfesion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProfesion.gridx = 0;		
			this.gridBagConstraintsProfesion.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProfesion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProfesion, this.gridBagConstraintsProfesion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProfesion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProfesion, this.gridBagConstraintsProfesion);								
		
		
		/*
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProfesion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProfesion, this.gridBagConstraintsProfesion);
		*/		
		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProfesion.gridx =0;
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProfesion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProfesion, this.gridBagConstraintsProfesion);
				
		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProfesion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProfesion, this.gridBagConstraintsProfesion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ProfesionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProfesion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProfesion = new GridBagLayout();
			this.jPanelBusquedasParametrosProfesion.setLayout(gridaBagLayoutBusquedasParametrosProfesion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProfesion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProfesion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProfesion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProfesion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProfesion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProfesion, this.gridBagConstraintsProfesion);
			
			
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProfesion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProfesion, this.gridBagConstraintsProfesion);
		
			
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProfesion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProfesion, this.gridBagConstraintsProfesion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProfesion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProfesion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProfesion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProfesion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProfesion.setName("jPanelReporteDinamicoProfesion"); 
		
		this.jPanelReporteDinamicoProfesion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProfesion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProfesion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProfesion.setLayout(gridaBagLayoutReporteDinamicoProfesion);
		
		
		this.jInternalFrameReporteDinamicoProfesion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProfesion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProfesion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProfesion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProfesion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProfesion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProfesion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProfesion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProfesion.setResizable(true);
	    this.jInternalFrameReporteDinamicoProfesion.setClosable(true);
	    this.jInternalFrameReporteDinamicoProfesion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProfesion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProfesion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProfesion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Profesiones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProfesion = new JLabelMe();

		this.jLabelColumnasSelectReporteProfesion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProfesion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProfesion.add(this.jLabelColumnasSelectReporteProfesion, this.gridBagConstraintsProfesion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProfesion = new JList<Reporte>();
		this.jListColumnasSelectReporteProfesion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProfesion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProfesion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProfesion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProfesion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProfesion=new JScrollPane(this.jListColumnasSelectReporteProfesion);
			
			this.jScrollColumnasSelectReporteProfesion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProfesion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProfesion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProfesion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProfesion.add(this.jListColumnasSelectReporteProfesion, this.gridBagConstraintsProfesion);
		this.jPanelReporteDinamicoProfesion.add(this.jScrollColumnasSelectReporteProfesion, this.gridBagConstraintsProfesion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProfesion = new JLabelMe();

		this.jLabelRelacionesSelectReporteProfesion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProfesion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProfesion.add(this.jLabelRelacionesSelectReporteProfesion, this.gridBagConstraintsProfesion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProfesion = new JList<Reporte>();
		this.jListRelacionesSelectReporteProfesion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProfesion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProfesion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProfesion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProfesion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProfesion=new JScrollPane(this.jListRelacionesSelectReporteProfesion);
			
			this.jScrollRelacionesSelectReporteProfesion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProfesion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProfesion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProfesion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProfesion.add(this.jListRelacionesSelectReporteProfesion, this.gridBagConstraintsProfesion);
		this.jPanelReporteDinamicoProfesion.add(this.jScrollRelacionesSelectReporteProfesion, this.gridBagConstraintsProfesion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoProfesion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProfesion = new JComboBoxMe();
		this.jListColumnasValoresGraficoProfesion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProfesion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProfesion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProfesion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProfesion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProfesion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProfesion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProfesion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProfesion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProfesion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProfesion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProfesion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProfesion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProfesion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProfesion.add(this.jLabelGenerarExcelReporteDinamicoProfesion, this.gridBagConstraintsProfesion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProfesion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProfesion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProfesion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProfesion.setToolTipText("Generar EXCEL"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProfesion = new GridBagConstraints();
		//this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProfesion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProfesion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProfesion.add(this.jButtonGenerarExcelReporteDinamicoProfesion, this.gridBagConstraintsProfesion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProfesion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProfesion.add(this.jComboBoxTiposReportesDinamicoProfesion, this.gridBagConstraintsProfesion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProfesion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProfesion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProfesion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProfesion.add(this.jLabelTiposArchivoReporteDinamicoProfesion, this.gridBagConstraintsProfesion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProfesion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProfesion.add(this.jComboBoxTiposArchivosReportesDinamicoProfesion, this.gridBagConstraintsProfesion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProfesion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProfesion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProfesion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProfesion.setToolTipText("Generar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProfesion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProfesion.add(this.jButtonGenerarReporteDinamicoProfesion, this.gridBagConstraintsProfesion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProfesion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProfesion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProfesion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProfesion.setToolTipText("Cancelar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProfesion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProfesion.add(this.jButtonCerrarReporteDinamicoProfesion, this.gridBagConstraintsProfesion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProfesion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProfesion= new JScrollPane(jPanelReporteDinamicoProfesion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProfesion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProfesion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProfesion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Profesiones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProfesion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProfesion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProfesion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProfesion);
		this.jInternalFrameReporteDinamicoProfesion.getContentPane().add(this.jScrollPanelReporteDinamicoProfesion, this.gridBagConstraintsProfesion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProfesion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProfesion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProfesion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProfesion.setName("jPanelImportacionProfesion"); 
		
		this.jPanelImportacionProfesion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProfesion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProfesion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProfesion.setLayout(gridaBagLayoutImportacionProfesion);
		
		
		this.jInternalFrameImportacionProfesion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProfesion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProfesion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProfesion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProfesion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProfesion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProfesion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProfesion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProfesion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProfesion.setResizable(true);
	    this.jInternalFrameImportacionProfesion.setClosable(true);
	    this.jInternalFrameImportacionProfesion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProfesion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProfesion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProfesion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProfesion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProfesion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProfesion.setResizable(true);
	    this.jInternalFrameImportacionProfesion.setClosable(true);
	    this.jInternalFrameImportacionProfesion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProfesion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProfesion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProfesion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Profesiones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProfesion = new JLabelMe();

		this.jLabelArchivoImportacionProfesion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesion.gridy = iPosYImportacion;		
		this.gridBagConstraintsProfesion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProfesion.add(this.jLabelArchivoImportacionProfesion, this.gridBagConstraintsProfesion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProfesion = new JFileChooser();		
		this.jFileChooserImportacionProfesion.setToolTipText("ESCOGER ARCHIVO"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProfesion = new JButtonMe();
		this.jButtonAbrirImportacionProfesion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProfesion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProfesion.setToolTipText("Generar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesion.gridy = iPosYImportacion;
		this.gridBagConstraintsProfesion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProfesion.add(this.jButtonAbrirImportacionProfesion, this.gridBagConstraintsProfesion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProfesion = new JLabelMe();

		this.jLabelPathArchivoImportacionProfesion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesion.gridy = iPosYImportacion;		
		this.gridBagConstraintsProfesion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProfesion.add(this.jLabelPathArchivoImportacionProfesion, this.gridBagConstraintsProfesion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProfesion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProfesion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProfesion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProfesion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesion.gridy = iPosYImportacion;
		this.gridBagConstraintsProfesion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProfesion.add(this.jTextFieldPathArchivoImportacionProfesion, this.gridBagConstraintsProfesion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProfesion = new JButtonMe();
		this.jButtonGenerarImportacionProfesion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProfesion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProfesion.setToolTipText("Generar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesion.gridy = iPosYImportacion;
		this.gridBagConstraintsProfesion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProfesion.add(this.jButtonGenerarImportacionProfesion, this.gridBagConstraintsProfesion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProfesion = new JButtonMe();
		this.jButtonCerrarImportacionProfesion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProfesion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProfesion.setToolTipText("Cancelar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesion.gridy = iPosYImportacion;
		this.gridBagConstraintsProfesion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProfesion.add(this.jButtonCerrarImportacionProfesion, this.gridBagConstraintsProfesion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProfesion = new GridBagLayout();
		
		this.jScrollPanelImportacionProfesion= new JScrollPane(jPanelImportacionProfesion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy =iPosYImportacion;
		this.gridBagConstraintsProfesion.gridx =iPosXImportacion;
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProfesion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProfesion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProfesion);
		this.jInternalFrameImportacionProfesion.getContentPane().add(this.jScrollPanelImportacionProfesion, this.gridBagConstraintsProfesion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProfesion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProfesion = new JButtonMe();
			this.jButtonAbrirOrderByProfesion.setText("Orden");
			this.jButtonAbrirOrderByProfesion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProfesion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProfesion";
			inputMap = this.jButtonAbrirOrderByProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProfesion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProfesion"));
		
		
			GridBagLayout gridaBagLayoutOrderByProfesion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProfesion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProfesion.setName("jPanelOrderByProfesion"); 
			
			this.jPanelOrderByProfesion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProfesion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProfesion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProfesion.setLayout(gridaBagLayoutOrderByProfesion);
			
			
			this.jTableDatosProfesionOrderBy = new JTableMe();        
			this.jTableDatosProfesionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProfesionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProfesionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProfesionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProfesionOrderBy.setViewportView(this.jTableDatosProfesionOrderBy);
			this.jTableDatosProfesionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProfesionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProfesion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProfesion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProfesion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProfesion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProfesion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProfesion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProfesion.setTitle("Orden");
			this.jInternalFrameOrderByProfesion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProfesion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProfesion.setResizable(true);
			this.jInternalFrameOrderByProfesion.setClosable(true);
			this.jInternalFrameOrderByProfesion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProfesion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProfesion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProfesion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Profesiones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProfesion.gridx =iPosXOrderBy;
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProfesion.ipady =150;
				
			this.jPanelOrderByProfesion.add(jScrollPanelDatosProfesionOrderBy, this.gridBagConstraintsProfesion);//this.jTableDatosProfesionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProfesion = new JButtonMe();
			this.jButtonCerrarOrderByProfesion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProfesion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProfesion.setToolTipText("Cancelar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProfesion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProfesion.add(this.jButtonCerrarOrderByProfesion, this.gridBagConstraintsProfesion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProfesion = new GridBagLayout();
			
			this.jScrollPanelOrderByProfesion= new JScrollPane(jPanelOrderByProfesion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.gridy =iPosYOrderBy;
			this.gridBagConstraintsProfesion.gridx =iPosXOrderBy;
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProfesion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProfesion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProfesion);
			
			this.jInternalFrameOrderByProfesion.getContentPane().add(this.jScrollPanelOrderByProfesion, this.gridBagConstraintsProfesion);			
		
		} else {
			this.jButtonAbrirOrderByProfesion = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.profesionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProfesion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProfesion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProfesion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProfesion.getRowHeight();//ProfesionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.profesionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProfesionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProfesion.isSelected()) {
					iHeightTable=ProfesionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProfesionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProfesionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProfesionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProfesion.isSelected()) {
					iHeightTable=ProfesionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProfesionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProfesionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProfesion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProfesion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProfesion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProfesion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProfesion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProfesion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProfesion!=null && this.jInternalFrameOrderByProfesion.getjTableDatosOrderBy()!=null) {
			//if(!this.profesionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProfesion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProfesion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProfesion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProfesion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProfesion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProfesion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProfesion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProfesion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProfesion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProfesion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=profesionLogic.getProfesions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=profesions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Profesion> TraerProfesionBeans(List<Profesion> profesions,ArrayList<Classe> classes)throws Exception {
		try {
			for(Profesion profesion:profesions) {
					
				if(!(ProfesionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProfesionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					profesion.setsDetalleGeneralEntityReporte(ProfesionConstantesFunciones.getProfesionDescripcion(profesion));
										
						
					
					

					if(profesion.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{profesion.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(profesion.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(profesion.getProfesionEmpleas()!=null && Funciones.existeClass(classes,ProfesionEmplea.class)) {
						try{profesion.setprofesionempleasDescripcionReporte(new JRBeanCollectionDataSource(ProfesionEmpleaJInternalFrame.TraerProfesionEmpleaBeans(profesion.getProfesionEmpleas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(profesion.getReferencias()!=null && Funciones.existeClass(classes,Referencia.class)) {
						try{profesion.setreferenciasDescripcionReporte(new JRBeanCollectionDataSource(ReferenciaJInternalFrame.TraerReferenciaBeans(profesion.getReferencias(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//profesion.setsDetalleGeneralEntityReporte(profesion.getsDetalleGeneralEntityReporte());
										
				}
				
				//profesionbeans.add(profesionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return profesions;
    }
	//PARA REPORTES FIN
}
