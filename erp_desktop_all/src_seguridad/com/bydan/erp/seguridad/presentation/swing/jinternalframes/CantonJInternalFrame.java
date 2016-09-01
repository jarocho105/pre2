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


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

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
import com.bydan.erp.seguridad.util.CantonConstantesFunciones;

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
public class CantonJInternalFrame extends CantonBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCanton;
	
	protected JMenuBar jmenuBarCanton;
	
	protected JMenu jmenuCanton;
	protected JMenu jmenuDatosCanton;
	protected JMenu jmenuArchivoCanton;
	protected JMenu jmenuAccionesCanton;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCanton = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCanton;	
	protected GridBagConstraints gridBagConstraintsCanton;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CantonDetalleFormJInternalFrame jInternalFrameDetalleFormCanton;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCanton;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCanton;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";
	
	public CantonSessionBean cantonSessionBean;
		
	
	
	public ProvinciaSessionBean provinciaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Canton> cantons;		
	public List<Canton> cantonsEliminados;	
	public List<Canton> cantonsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCanton;		
	protected JButton jButtonAbrirOrderByCanton;
	
	
	//protected JPanel jPanelOrderByCanton;
	//public JScrollPane jScrollPanelOrderByCanton;	
	//protected JButton jButtonCerrarOrderByCanton;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CantonLogic cantonLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCanton;
	public JScrollPane jScrollPanelDatosEdicionCanton;
	public JScrollPane jScrollPanelDatosGeneralCanton;
    
	
	
	//public JScrollPane jScrollPanelDatosCantonOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCanton;
	//public JScrollPane jScrollPanelImportacionCanton;
	
	
	
	protected JPanel jPanelAccionesCanton;
	
    protected JPanel jPanelPaginacionCanton;
    protected JPanel jPanelParametrosReportesCanton;
	protected JPanel jPanelParametrosReportesAccionesCanton;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Canton;
	protected JPanel jPanelParametrosAuxiliar2Canton;
	protected JPanel jPanelParametrosAuxiliar3Canton;
	protected JPanel jPanelParametrosAuxiliar4Canton;
	//protected JPanel jPanelParametrosAuxiliar5Canton;
	
	
	
	//protected JPanel jPanelReporteDinamicoCanton;
	//protected JPanel jPanelImportacionCanton;
	
	
	public JTable jTableDatosCanton;
	
	
	
	//public JTable jTableDatosCantonOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCanton;
	protected JButton jButtonDuplicarCanton;
	protected JButton jButtonCopiarCanton;
	protected JButton jButtonVerFormCanton;
	protected JButton jButtonNuevoRelacionesCanton;
	protected JButton jButtonModificarCanton;
	
    protected JButton jButtonGuardarCambiosTablaCanton;
	protected JButton jButtonCerrarCanton;
	
	
	protected JButton jButtonRecargarInformacionCanton;
	protected JButton jButtonProcesarInformacionCanton;
	
	
	protected JButton jButtonAnterioresCanton;
	protected JButton jButtonSiguientesCanton;
	protected JButton jButtonNuevoGuardarCambiosCanton;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCanton;
	//protected JButton jButtonCerrarReporteDinamicoCanton;
	//protected JButton jButtonGenerarExcelReporteDinamicoCanton;	
	
	
	
	//protected JButton jButtonAbrirImportacionCanton;
	//protected JButton jButtonGenerarImportacionCanton;
	//protected JButton jButtonCerrarImportacionCanton;
	//protected JFileChooser jFileChooserImportacionCanton;
	//protected File fileImportacionCanton;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCanton;
	protected JButton jButtonDuplicarToolBarCanton;
	protected JButton jButtonNuevoRelacionesToolBarCanton;
	
	
	public JButton jButtonGuardarCambiosToolBarCanton;
	protected JButton jButtonCopiarToolBarCanton;
	protected JButton jButtonVerFormToolBarCanton;
	public JButton jButtonGuardarCambiosTablaToolBarCanton;
	protected JButton jButtonMostrarOcultarTablaToolBarCanton;
	protected JButton jButtonCerrarToolBarCanton;
	
	protected JButton jButtonRecargarInformacionToolBarCanton;
	protected JButton jButtonProcesarInformacionToolBarCanton;
	protected JButton jButtonAnterioresToolBarCanton;
	protected JButton jButtonSiguientesToolBarCanton;
	protected JButton jButtonNuevoGuardarCambiosToolBarCanton;
	protected JButton jButtonAbrirOrderByToolBarCanton;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCanton;
	protected JMenuItem jMenuItemDuplicarCanton;
	protected JMenuItem jMenuItemNuevoRelacionesCanton;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCanton;
	protected JMenuItem jMenuItemCopiarCanton;
	protected JMenuItem jMenuItemVerFormCanton;
	protected JMenuItem jMenuItemGuardarCambiosTablaCanton;
	protected JMenuItem jMenuItemCerrarCanton;
	protected JMenuItem jMenuItemDetalleCerrarCanton;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCanton;
	protected JMenuItem jMenuItemDetalleMostarOcultarCanton;
	
	protected JMenuItem jMenuItemRecargarInformacionCanton;
	protected JMenuItem jMenuItemProcesarInformacionCanton;
	protected JMenuItem jMenuItemAnterioresCanton;
	protected JMenuItem jMenuItemSiguientesCanton;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCanton;
	protected JMenuItem jMenuItemAbrirOrderByCanton;
	protected JMenuItem jMenuItemMostrarOcultarCanton;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCanton;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCanton;
	protected JCheckBox jCheckBoxSeleccionadosCanton;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCanton;
	protected JCheckBox jCheckBoxConGraficoReporteCanton;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCanton;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCanton;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCanton;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCanton;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCanton;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCanton;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCanton;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCanton;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCanton;
	protected JTextField jTextFieldValorCampoGeneralCanton;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCanton;
	//public JList<Reporte> jListColumnasSelectReporteCanton;
	//public JScrollPane jScrollColumnasSelectReporteCanton;
	
	//public JLabel jLabelRelacionesSelectReporteCanton;
	//public JList<Reporte> jListRelacionesSelectReporteCanton;
	//public JScrollPane jScrollRelacionesSelectReporteCanton;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCanton;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCanton;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCanton;
	//public JLabel jLabelTiposArchivoReporteDinamicoCanton;
	
		
	//public JLabel jLabelArchivoImportacionCanton;	
	//public JLabel jLabelPathArchivoImportacionCanton;
	//protected JTextField jTextFieldPathArchivoImportacionCanton;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCanton;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCanton;
	
	//public JLabel jLabelColumnaCategoriaValorCanton;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCanton;
	
	//public JLabel jLabelColumnasValoresGraficoCanton;
	//public JList<Reporte> jListColumnasValoresGraficoCanton;
	//public JScrollPane jScrollColumnasValoresGraficoCanton;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCanton;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCanton;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCanton;
	public JPanel jPanelFK_IdProvinciaCanton;
	public JButton jButtonFK_IdProvinciaCanton;
	
	public JPanel jPanelid_provinciaFK_IdProvinciaCanton;
	public JLabel jLabelid_provinciaFK_IdProvinciaCanton;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaFK_IdProvinciaCanton;
	public JButton jButtonid_provinciaFK_IdProvinciaCanton= new JButtonMe();
	public JButton jButtonid_provinciaFK_IdProvinciaCantonUpdate= new JButtonMe();
	public JButton jButtonid_provinciaFK_IdProvinciaCantonBusqueda= new JButtonMe();

	
	
	
	
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
	public CantonJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Canton No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CantonJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Canton No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CantonJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Canton No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CantonJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Canton No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCanton)	{
		this.jButtonRecargarInformacionCanton = jButtonRecargarInformacionCanton;
	}
	
	public JButton getjButtonProcesarInformacionCanton() {
		return this.jButtonProcesarInformacionCanton;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCanton)	{
		this.jButtonProcesarInformacionCanton = jButtonProcesarInformacionCanton;
	}
	
	
	public JButton getjButtonRecargarInformacionCanton() {
		return this.jButtonRecargarInformacionCanton;
	}
	
	
	public List<Canton> getcantons() {
		return this.cantons;
	}

	public void setcantons(List<Canton> cantons) {
		this.cantons = cantons;
	}
	
	public List<Canton> getcantonsAux() {
		return this.cantonsAux;
	}

	public void setcantonsAux(List<Canton> cantonsAux) {
		this.cantonsAux = cantonsAux;
	}
	
	public List<Canton> getcantonsEliminados() {
		return this.cantonsEliminados;
	}

	public void setCantonsEliminados(List<Canton> cantonsEliminados) {
		this.cantonsEliminados = cantonsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCanton() {
		return jComboBoxTiposSeleccionarCanton;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCanton(
			JComboBox jComboBoxTiposSeleccionarCanton) {
		this.jComboBoxTiposSeleccionarCanton = jComboBoxTiposSeleccionarCanton;
	}
	
	public void setBorderResaltarTiposSeleccionarCanton() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCanton.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCanton .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCanton() {
		return jTextFieldValorCampoGeneralCanton;
	}

	public void setjTextFieldValorCampoGeneralCanton(
			JTextField jTextFieldValorCampoGeneralCanton) {
		this.jTextFieldValorCampoGeneralCanton = jTextFieldValorCampoGeneralCanton;
	}

	public void setBorderResaltarValorCampoGeneralCanton() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCanton.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCanton .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCanton() {
		return this.jCheckBoxSeleccionarTodosCanton;
	}

	public void setjCheckBoxSeleccionarTodosCanton(
			JCheckBox jCheckBoxSeleccionarTodosCanton) {
		this.jCheckBoxSeleccionarTodosCanton = jCheckBoxSeleccionarTodosCanton;
	}

	public void setBorderResaltarSeleccionarTodosCanton() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCanton.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCanton .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCanton() {
		return this.jCheckBoxSeleccionadosCanton;
	}

	public void setjCheckBoxSeleccionadosCanton(
			JCheckBox jCheckBoxSeleccionadosCanton) {
		this.jCheckBoxSeleccionadosCanton = jCheckBoxSeleccionadosCanton;
	}
	
	public void setBorderResaltarSeleccionadosCanton() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCanton.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCanton .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCanton() {
		return this.jComboBoxTiposArchivosReportesCanton;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCanton(
			JComboBox jComboBoxTiposArchivosReportesCanton) {
		this.jComboBoxTiposArchivosReportesCanton = jComboBoxTiposArchivosReportesCanton;
	}

	public void setBorderResaltarTiposArchivosReportesCanton() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCanton.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCanton .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCanton() {
		return this.jComboBoxTiposReportesCanton;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCanton(
			JComboBox jComboBoxTiposReportesCanton) {
		this.jComboBoxTiposReportesCanton = jComboBoxTiposReportesCanton;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCanton() {
	//	return jComboBoxTiposReportesDinamicoCanton;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCanton(
	//		JComboBox jComboBoxTiposReportesDinamicoCanton) {
	//	this.jComboBoxTiposReportesDinamicoCanton = jComboBoxTiposReportesDinamicoCanton;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCanton() {
	//	return jComboBoxTiposArchivosReportesDinamicoCanton;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCanton(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCanton) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCanton = jComboBoxTiposArchivosReportesDinamicoCanton;
	//}
	
	public void setBorderResaltarTiposReportesCanton() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCanton.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCanton .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCanton() {
		return this.jComboBoxTiposGraficosReportesCanton;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCanton(
			JComboBox jComboBoxTiposGraficosReportesCanton) {
		this.jComboBoxTiposGraficosReportesCanton = jComboBoxTiposGraficosReportesCanton;
	}
	
	public void setBorderResaltarTiposGraficosReportesCanton() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCanton.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCanton .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCanton() {
		return this.jComboBoxTiposPaginacionCanton;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCanton(
			JComboBox jComboBoxTiposPaginacionCanton) {
		this.jComboBoxTiposPaginacionCanton = jComboBoxTiposPaginacionCanton;
	}
	
	public void setBorderResaltarTiposPaginacionCanton() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCanton.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCanton .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCanton() {
		return this.jComboBoxTiposRelacionesCanton;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCanton() {
		return this.jComboBoxTiposAccionesCanton;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCanton(
			JComboBox jComboBoxTiposRelacionesCanton) {
		this.jComboBoxTiposRelacionesCanton = jComboBoxTiposRelacionesCanton;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCanton(
			JComboBox jComboBoxTiposAccionesCanton) {
		this.jComboBoxTiposAccionesCanton = jComboBoxTiposAccionesCanton;
	}
	
	public void setBorderResaltarTiposRelacionesCanton() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCanton.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCanton .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCanton() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCanton.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCanton .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCanton() {
	//	return jCheckBoxConGraficoDinamicoCanton;
	//}

	//public void setjCheckBoxConGraficoDinamicoCanton(
	//		JCheckBox jCheckBoxConGraficoDinamicoCanton) {
	//	this.jCheckBoxConGraficoDinamicoCanton = jCheckBoxConGraficoDinamicoCanton;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCanton() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCanton.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCanton .setBorder(borderResaltar);		
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
		this.cantonSessionBean=new CantonSessionBean();
		
		this.cantonSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cantonSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cantonSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CantonJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CantonJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CantonJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CantonJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CantonJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Canton MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
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
		
		CantonJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Canton No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCanton= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCanton,this.jTtoolBarCanton,
							"nuevo","nuevo","Nuevo"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCanton,this.jTtoolBarCanton,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCanton,this.jTtoolBarCanton,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCanton,this.jTtoolBarCanton,
							"duplicar","duplicar","Duplicar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCanton,this.jTtoolBarCanton,
							"copiar","copiar","Copiar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCanton,this.jTtoolBarCanton,
							"ver_form","ver_form","Ver"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCanton,this.jTtoolBarCanton,
							"recargar","recargar","Recargar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCanton,this.jTtoolBarCanton,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCanton,this.jTtoolBarCanton,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCanton,this.jTtoolBarCanton,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCanton,this.jTtoolBarCanton,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCanton,this.jTtoolBarCanton,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCanton,this.jTtoolBarCanton,
							"cerrar","cerrar","Salir"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCanton=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCanton;
			
				this.jButtonProcesarInformacionToolBarCanton=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCanton;
				
		//protected JButton jButtonModificarToolBarCanton;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCanton=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCanton=new JMenuMe("General");
		this.jmenuArchivoCanton=new JMenuMe("Archivo");
		this.jmenuAccionesCanton=new JMenuMe("Acciones");
		this.jmenuDatosCanton=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCanton= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCanton.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCanton,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCanton= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCanton.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCanton,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCanton= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCanton.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCanton,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCanton= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCanton.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCanton,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCanton= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCanton.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCanton,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCanton= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCanton.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCanton,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCanton= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCanton.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCanton,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCanton= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCanton.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCanton,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCanton= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCanton.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCanton,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCanton= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCanton.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCanton,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCanton= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCanton.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCanton,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCanton= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCanton.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCanton,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCanton= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCanton.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCanton,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCanton= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCanton.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCanton,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCanton= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCanton.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCanton,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCanton= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCanton.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCanton,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCanton= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCanton.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCanton,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCanton.add(this.jMenuItemCerrarCanton);
			
			this.jmenuAccionesCanton.add(this.jMenuItemNuevoCanton);
			this.jmenuAccionesCanton.add(this.jMenuItemNuevoGuardarCambiosCanton);
			this.jmenuAccionesCanton.add(this.jMenuItemNuevoRelacionesCanton);
			this.jmenuAccionesCanton.add(this.jMenuItemGuardarCambiosTablaCanton);		
			this.jmenuAccionesCanton.add(this.jMenuItemDuplicarCanton);		
			this.jmenuAccionesCanton.add(this.jMenuItemCopiarCanton);		
			this.jmenuAccionesCanton.add(this.jMenuItemVerFormCanton);		
			
			this.jmenuDatosCanton.add(this.jMenuItemRecargarInformacionCanton);				
			this.jmenuDatosCanton.add(this.jMenuItemAnterioresCanton);				
			this.jmenuDatosCanton.add(this.jMenuItemSiguientesCanton);				
			this.jmenuDatosCanton.add(this.jMenuItemAbrirOrderByCanton);				
			this.jmenuDatosCanton.add(this.jMenuItemMostrarOcultarCanton);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCanton.add(this.jMenuItemGuardarCambiosCanton);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCanton, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCanton, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCanton, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCanton.add(this.jmenuArchivoCanton);		
			this.jmenuBarCanton.add(this.jmenuAccionesCanton);		
			this.jmenuBarCanton.add(this.jmenuDatosCanton);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCanton);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCanton() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdProvinciaCanton=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProvinciaCanton.setToolTipText("Buscar Por Provincia ");
		this.jButtonFK_IdProvinciaCanton= new JButtonMe();
		this.jButtonFK_IdProvinciaCanton.setText("Buscar");
		this.jButtonFK_IdProvinciaCanton.setToolTipText("Buscar Por Provincia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProvinciaCanton,"buscar_button","Buscar Por Provincia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProvinciaCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_provinciaFK_IdProvinciaCanton = new JLabelMe();
		jLabelid_provinciaFK_IdProvinciaCanton.setText("Provincia :");
		jLabelid_provinciaFK_IdProvinciaCanton.setToolTipText("Provincia");
		jLabelid_provinciaFK_IdProvinciaCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaFK_IdProvinciaCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaFK_IdProvinciaCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaFK_IdProvinciaCanton,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_provinciaFK_IdProvinciaCanton= new JComboBoxMe();
		jComboBoxid_provinciaFK_IdProvinciaCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaFK_IdProvinciaCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaFK_IdProvinciaCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaFK_IdProvinciaCanton,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCanton=new JTabbedPane();


		this.jTabbedPaneBusquedasCanton.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCanton.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCanton.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCanton.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCanton,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCanton = new CantonDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Canton DATOS");
			this.jInternalFrameDetalleFormCanton = new CantonDetalleFormJInternalFrame(jDesktopPane,this.cantonSessionBean.getConGuardarRelaciones(),this.cantonSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCanton = null;//new CantonDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCanton= new GridBagLayout();
		
		
		this.jTableDatosCanton = new JTableMe();      
		
		String sToolTipCanton="";
		sToolTipCanton=CantonConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCanton+="(Seguridad.Canton)";
		}
		
		if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
			sToolTipCanton+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCanton.setToolTipText(sToolTipCanton);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCanton);
		this.jTableDatosCanton.setAutoCreateRowSorter(true);
		this.jTableDatosCanton.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCanton.setRowSelectionAllowed(true);
		this.jTableDatosCanton.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCanton,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCanton = new JButtonMe();
		this.jButtonDuplicarCanton = new JButtonMe();
		this.jButtonCopiarCanton = new JButtonMe();
		this.jButtonVerFormCanton = new JButtonMe();
		this.jButtonNuevoRelacionesCanton = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCanton = new JButtonMe();
		this.jButtonCerrarCanton = new JButtonMe();
		
		this.jScrollPanelDatosCanton = new JScrollPane();   
        this.jScrollPanelDatosGeneralCanton = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCanton = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Canton";
		
		if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cantones" + this.sPath));
		} else {
			this.jScrollPanelDatosCanton.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCanton.setToolTipText("Acciones");
        this.jPanelAccionesCanton.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCanton, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCanton, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCanton=new ReporteDinamicoJInternalFrame(CantonConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCanton();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCanton=new ImportacionJInternalFrame(CantonConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCanton();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCanton = new JButtonMe();
		
		this.jButtonAbrirOrderByCanton.setText("Orden");
		this.jButtonAbrirOrderByCanton.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCanton,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCanton.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCanton=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCanton,false,this);
			
			//this.cargarOrderByCanton(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCanton=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCanton,true,this);
			
			//this.cargarOrderByCanton(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCanton.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosCanton.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosCanton.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosCanton.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCanton.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCanton.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCanton.setText("Nuevo");
		this.jButtonDuplicarCanton.setText("Duplicar");
		this.jButtonCopiarCanton.setText("Copiar");
		this.jButtonVerFormCanton.setText("Ver");
		this.jButtonNuevoRelacionesCanton.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCanton.setText("Guardar");
		this.jButtonCerrarCanton.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCanton,"nuevo_button","Nuevo",this.cantonSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCanton,"duplicar_button","Duplicar",this.cantonSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCanton,"copiar_button","Copiar",this.cantonSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCanton,"ver_form","Ver",this.cantonSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCanton,"nuevorelaciones_button","Nuevo Rel",this.cantonSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCanton,"guardarcambiostabla_button","Guardar",this.cantonSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCanton,"cerrar_button","Salir",this.cantonSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCanton, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCanton.setToolTipText("Nuevo"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCanton.setToolTipText("Duplicar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCanton.setToolTipText("Copiar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCanton.setToolTipText("Ver"+" "+CantonConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCanton.setToolTipText("Nuevo Rel"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCanton.setToolTipText("Guardar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCanton.setToolTipText("Salir"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCanton";
		inputMap = this.jButtonNuevoCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCanton.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCanton"));
		
		//DUPLICAR
		sMapKey = "DuplicarCanton";
		inputMap = this.jButtonDuplicarCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCanton.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCanton"));
		
		//COPIAR
		sMapKey = "CopiarCanton";
		inputMap = this.jButtonCopiarCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCanton.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCanton"));
		
		//VEr FORM
		sMapKey = "VerFormCanton";
		inputMap = this.jButtonVerFormCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCanton.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCanton"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCanton";
		inputMap = this.jButtonNuevoRelacionesCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCanton.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCanton"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCanton";
		inputMap = this.jButtonModificarCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCanton.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCanton"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCanton";
		inputMap = this.jButtonCerrarCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCanton.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCanton"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCanton";
		inputMap = this.jButtonGuardarCambiosTablaCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCanton.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCanton"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCanton = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCanton = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCanton = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Canton= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Canton= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Canton= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Canton= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Canton= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCanton.setName("jPanelParametrosReportesCanton"); 
		
		this.jPanelParametrosReportesAccionesCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCanton.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCanton.setName("jPanelParametrosReportesAccionesCanton"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCanton, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCanton, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCanton = new JButtonMe();
		this.jButtonRecargarInformacionCanton.setText("Recargar");
		this.jButtonRecargarInformacionCanton.setToolTipText("Recargar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCanton,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCanton = new JButtonMe();
		this.jButtonProcesarInformacionCanton.setText("Procesar");
		this.jButtonProcesarInformacionCanton.setToolTipText("Procesar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCanton.setVisible(false);
			
		this.jButtonProcesarInformacionCanton.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCanton.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCanton.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCanton = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCanton.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCanton.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCanton = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCanton.setText("TIPO");       
		this.jComboBoxTiposReportesCanton.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCanton = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCanton.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCanton.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCanton = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCanton.setText("Paginacion");
		this.jComboBoxTiposPaginacionCanton.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCanton = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCanton.setText("Accion");
		this.jComboBoxTiposRelacionesCanton.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCanton = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCanton.setText("Accion");
		this.jComboBoxTiposAccionesCanton.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCanton = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCanton.setText("Accion");
		this.jComboBoxTiposSeleccionarCanton.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCanton=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCanton.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCanton.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCanton.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCanton = new JLabelMe();
		
		this.jLabelAccionesCanton.setText("Acciones");		
		this.jLabelAccionesCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCanton = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCanton.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCanton.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCanton = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCanton.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCanton.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCanton = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCanton.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCanton.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCanton = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCanton.setText("Graf.");
		this.jCheckBoxConGraficoReporteCanton.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCanton = new JButtonMe();
		//this.jButtonAnterioresCanton.setText("<<");
        this.jButtonAnterioresCanton.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCanton,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCanton = new JButtonMe();
		//this.jButtonSiguientesCanton.setText(">>");
        this.jButtonSiguientesCanton.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCanton,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCanton = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCanton.setText("Nue");
        this.jButtonNuevoGuardarCambiosCanton.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCanton,"nuevoguardarcambios_button","Nue",this.cantonSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCanton";
		inputMap = this.jButtonNuevoGuardarCambiosCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCanton.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCanton"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCanton";
		inputMap = this.jButtonRecargarInformacionCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCanton.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCanton"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCanton";
		inputMap = this.jButtonSiguientesCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCanton.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCanton"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCanton";
		inputMap = this.jButtonAnterioresCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCanton.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCanton"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCanton();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCanton.setMinimumSize(new Dimension(this.getWidth(),CantonBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CantonBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCanton.setMaximumSize(new Dimension(this.getWidth(),CantonBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CantonBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCanton.setPreferredSize(new Dimension(this.getWidth(),CantonBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CantonBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCanton = new GridBagLayout();

			this.jPanelPaginacionCanton.setLayout(gridaBagLayoutPaginacionCanton);						
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.gridy = 0;
			this.gridBagConstraintsCanton.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCanton.add(this.jButtonAnterioresCanton, this.gridBagConstraintsCanton);
					
						
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCanton.gridy = 0;
			
			this.jPanelPaginacionCanton.add(this.jButtonNuevoGuardarCambiosCanton, this.gridBagConstraintsCanton);
						
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCanton.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCanton.gridy = 0;
			this.jPanelPaginacionCanton.add(this.jButtonSiguientesCanton, this.gridBagConstraintsCanton);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.gridy = 1;
			this.gridBagConstraintsCanton.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCanton.add(this.jButtonNuevoCanton, this.gridBagConstraintsCanton);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCanton = new GridBagConstraints();
				this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCanton.gridy = 1;
				this.gridBagConstraintsCanton.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCanton.add(this.jButtonNuevoRelacionesCanton, this.gridBagConstraintsCanton);
			}
			
			
			if(!this.cantonSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCanton = new GridBagConstraints();
				this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCanton.gridy = 1;
				this.gridBagConstraintsCanton.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCanton.add(this.jButtonGuardarCambiosTablaCanton, this.gridBagConstraintsCanton);
			}
			
			
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.gridy = 1;
			this.gridBagConstraintsCanton.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCanton.add(this.jButtonDuplicarCanton, this.gridBagConstraintsCanton);
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.gridy = 1;
			this.gridBagConstraintsCanton.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCanton.add(this.jButtonCopiarCanton, this.gridBagConstraintsCanton);
		
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.gridy = 1;
			this.gridBagConstraintsCanton.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCanton.add(this.jButtonVerFormCanton, this.gridBagConstraintsCanton);
		
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.gridy = 1;
			this.gridBagConstraintsCanton.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCanton.add(this.jButtonCerrarCanton, this.gridBagConstraintsCanton);
		
		
		
		this.jButtonRecargarInformacionCanton.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCanton.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCanton.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCanton, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCanton.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCanton.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCanton.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCanton.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCanton.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCanton.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCanton.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCanton.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCanton.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCanton.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCanton.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCanton.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCanton.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCanton.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCanton.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCanton.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCanton.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCanton.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCanton.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCanton.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCanton.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCanton.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCanton.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCanton.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCanton.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCanton.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCanton.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCanton, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCanton.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCanton.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCanton.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCanton.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCanton.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCanton.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCanton = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCanton = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Canton = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Canton = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Canton = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Canton = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCanton.setLayout(gridaBagParametrosReportesCanton);
			this.jPanelParametrosReportesAccionesCanton.setLayout(gridaBagParametrosReportesAccionesCanton);
			
			
			this.jPanelParametrosAuxiliar1Canton.setLayout(gridaBagParametrosAuxiliar1Canton);
			this.jPanelParametrosAuxiliar2Canton.setLayout(gridaBagParametrosAuxiliar2Canton);
			this.jPanelParametrosAuxiliar3Canton.setLayout(gridaBagParametrosAuxiliar3Canton);
			this.jPanelParametrosAuxiliar4Canton.setLayout(gridaBagParametrosAuxiliar4Canton);
			//this.jPanelParametrosAuxiliar5Canton.setLayout(gridaBagParametrosAuxiliar2Canton);			
			
			
			
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCanton.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCanton.add(this.jButtonRecargarInformacionCanton, this.gridBagConstraintsCanton);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCanton.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCanton.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Canton.add(this.jComboBoxTiposPaginacionCanton, this.gridBagConstraintsCanton);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCanton.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCanton.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Canton.add(this.jCheckBoxConAltoMaximoTablaCanton, this.gridBagConstraintsCanton);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCanton.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCanton.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Canton.add(this.jComboBoxTiposArchivosReportesCanton, this.gridBagConstraintsCanton);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCanton.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCanton.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCanton.add(this.jPanelParametrosAuxiliar1Canton, this.gridBagConstraintsCanton);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCanton.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Canton.add(this.jComboBoxTiposReportesCanton, this.gridBagConstraintsCanton);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCanton.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCanton.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCanton.add(this.jPanelParametrosAuxiliar4Canton, this.gridBagConstraintsCanton);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCanton.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCanton.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCanton.add(this.jComboBoxTiposReportesCanton, this.gridBagConstraintsCanton);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCanton.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCanton.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCanton.add(this.jCheckBoxGenerarReporteCanton, this.gridBagConstraintsCanton);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCanton.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCanton.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCanton.add(this.jPanelParametrosAuxiliar2Canton, this.gridBagConstraintsCanton);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCanton.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCanton.add(this.jLabelAccionesCanton, this.gridBagConstraintsCanton);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCanton = new GridBagConstraints();
				this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCanton.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCanton.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCanton.add(this.jButtonAbrirOrderByCanton, this.gridBagConstraintsCanton);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCanton.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCanton.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCanton.add(this.jComboBoxTiposSeleccionarCanton, this.gridBagConstraintsCanton);			
			
			
			/*
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCanton.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCanton.add(this.jCheckBoxSeleccionarTodosCanton, this.gridBagConstraintsCanton);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCanton.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Canton.add(this.jCheckBoxSeleccionarTodosCanton, this.gridBagConstraintsCanton);															
				
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCanton.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Canton.add(this.jCheckBoxSeleccionadosCanton, this.gridBagConstraintsCanton);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCanton.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCanton.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCanton.add(this.jPanelParametrosAuxiliar3Canton, this.gridBagConstraintsCanton);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCanton.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCanton.add(this.jComboBoxTiposRelacionesCanton, this.gridBagConstraintsCanton);
				
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCanton.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCanton.add(this.jComboBoxTiposAccionesCanton, this.gridBagConstraintsCanton);
	
				
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCanton.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCanton.add(this.jTextFieldValorCampoGeneralCanton, this.gridBagConstraintsCanton);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCanton = new GridBagLayout();

			this.jScrollPanelDatosCanton.setLayout(gridaBagLayoutDatosCanton);
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.gridy = 0;
			this.gridBagConstraintsCanton.gridx = 0;
			
			this.jScrollPanelDatosCanton.add(this.jTableDatosCanton, this.gridBagConstraintsCanton);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCanton.setViewportView(this.jTableDatosCanton);
		this.jTableDatosCanton.setFillsViewportHeight(true);
		this.jTableDatosCanton.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCanton= new GridBagLayout();
		this.jPanelAccionesCanton.setLayout(gridaBagLayoutAccionesCanton);
		
		
		/*	
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCanton.gridy = 0;
		this.gridBagConstraintsCanton.gridx = 0;
			
		this.jPanelAccionesCanton.add(this.jButtonNuevoCanton, this.gridBagConstraintsCanton);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdProvinciaCanton= new GridBagLayout();
		gridaBagLayoutFK_IdProvinciaCanton.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProvinciaCanton.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProvinciaCanton.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProvinciaCanton.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProvinciaCanton.setLayout(gridaBagLayoutFK_IdProvinciaCanton);

		gridBagConstraintsCanton = new GridBagConstraints();
		gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCanton.gridy = 0;
		gridBagConstraintsCanton.gridx = 0;
		jPanelFK_IdProvinciaCanton.add(jLabelid_provinciaFK_IdProvinciaCanton, gridBagConstraintsCanton);

		gridBagConstraintsCanton = new GridBagConstraints();
		gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCanton.gridy = 0;
		gridBagConstraintsCanton.gridx = 1;
		jPanelFK_IdProvinciaCanton.add(jComboBoxid_provinciaFK_IdProvinciaCanton, gridBagConstraintsCanton);

		gridBagConstraintsCanton = new GridBagConstraints();
		gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCanton.gridy = 1;
		gridBagConstraintsCanton.gridx =1;
		jPanelFK_IdProvinciaCanton.add(jButtonFK_IdProvinciaCanton, gridBagConstraintsCanton);

		jTabbedPaneBusquedasCanton.addTab("1.-Por Provincia ", jPanelFK_IdProvinciaCanton);
		jTabbedPaneBusquedasCanton.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCanton = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCanton);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cantonSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCanton = new GridBagConstraints();						
			this.gridBagConstraintsCanton.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCanton.gridx = 0;		
			//this.gridBagConstraintsCanton.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCanton.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCanton, this.gridBagConstraintsCanton);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCanton.gridx = 0;		
		//this.gridBagConstraintsCanton.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCanton.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCanton.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCanton);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCanton.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCanton.gridx = 0;		
			this.gridBagConstraintsCanton.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCanton.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCanton, this.gridBagConstraintsCanton);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCanton.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCanton, this.gridBagConstraintsCanton);								
		
		
		/*
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCanton.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCanton, this.gridBagConstraintsCanton);
		*/		
		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCanton.gridx =0;
		this.gridBagConstraintsCanton.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCanton.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCanton, this.gridBagConstraintsCanton);
				
		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCanton.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCanton, this.gridBagConstraintsCanton);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(CantonJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCanton= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCanton = new GridBagLayout();
			this.jPanelBusquedasParametrosCanton.setLayout(gridaBagLayoutBusquedasParametrosCanton);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCanton=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCanton.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCanton.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCanton.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCanton.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCanton, this.gridBagConstraintsCanton);
			
			
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCanton.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCanton, this.gridBagConstraintsCanton);
		
			
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCanton.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCanton, this.gridBagConstraintsCanton);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCanton;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCanton() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCanton = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCanton = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCanton.setName("jPanelReporteDinamicoCanton"); 
		
		this.jPanelReporteDinamicoCanton.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCanton.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCanton.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCanton.setLayout(gridaBagLayoutReporteDinamicoCanton);
		
		
		this.jInternalFrameReporteDinamicoCanton= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCanton = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCanton= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCanton.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCanton.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCanton.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCanton.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCanton.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCanton.setResizable(true);
	    this.jInternalFrameReporteDinamicoCanton.setClosable(true);
	    this.jInternalFrameReporteDinamicoCanton.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCanton.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCanton.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCanton.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cantones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCanton = new JLabelMe();

		this.jLabelColumnasSelectReporteCanton.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCanton.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCanton.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCanton.add(this.jLabelColumnasSelectReporteCanton, this.gridBagConstraintsCanton);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCanton = new JList<Reporte>();
		this.jListColumnasSelectReporteCanton.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCanton.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCanton.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCanton.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCanton.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCanton=new JScrollPane(this.jListColumnasSelectReporteCanton);
			
			this.jScrollColumnasSelectReporteCanton.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCanton.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCanton.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCanton.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCanton.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCanton.add(this.jListColumnasSelectReporteCanton, this.gridBagConstraintsCanton);
		this.jPanelReporteDinamicoCanton.add(this.jScrollColumnasSelectReporteCanton, this.gridBagConstraintsCanton);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCanton = new JLabelMe();

		this.jLabelRelacionesSelectReporteCanton.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCanton.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCanton.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCanton.add(this.jLabelRelacionesSelectReporteCanton, this.gridBagConstraintsCanton);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCanton = new JList<Reporte>();
		this.jListRelacionesSelectReporteCanton.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCanton.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCanton.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCanton.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCanton.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCanton=new JScrollPane(this.jListRelacionesSelectReporteCanton);
			
			this.jScrollRelacionesSelectReporteCanton.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCanton.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCanton.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCanton.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCanton.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCanton.add(this.jListRelacionesSelectReporteCanton, this.gridBagConstraintsCanton);
		this.jPanelReporteDinamicoCanton.add(this.jScrollRelacionesSelectReporteCanton, this.gridBagConstraintsCanton);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCanton = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCanton = new JComboBoxMe();
		this.jListColumnasValoresGraficoCanton = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCanton = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCanton.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCanton.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCanton.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCanton.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCanton = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCanton.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCanton.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCanton.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCanton.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCanton = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCanton.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCanton.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCanton.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCanton.add(this.jLabelGenerarExcelReporteDinamicoCanton, this.gridBagConstraintsCanton);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCanton = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCanton.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCanton,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCanton.setToolTipText("Generar EXCEL"+" "+CantonConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCanton = new GridBagConstraints();
		//this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCanton.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCanton.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCanton.add(this.jButtonGenerarExcelReporteDinamicoCanton, this.gridBagConstraintsCanton);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCanton.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCanton.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCanton.add(this.jComboBoxTiposReportesDinamicoCanton, this.gridBagConstraintsCanton);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCanton = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCanton.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCanton.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCanton.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCanton.add(this.jLabelTiposArchivoReporteDinamicoCanton, this.gridBagConstraintsCanton);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCanton.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCanton.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCanton.add(this.jComboBoxTiposArchivosReportesDinamicoCanton, this.gridBagConstraintsCanton);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCanton = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCanton.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCanton,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCanton.setToolTipText("Generar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCanton.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCanton.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCanton.add(this.jButtonGenerarReporteDinamicoCanton, this.gridBagConstraintsCanton);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCanton = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCanton.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCanton,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCanton.setToolTipText("Cancelar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCanton.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCanton.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCanton.add(this.jButtonCerrarReporteDinamicoCanton, this.gridBagConstraintsCanton);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCanton = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCanton= new JScrollPane(jPanelReporteDinamicoCanton,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCanton.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCanton.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCanton.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cantones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCanton.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCanton.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCanton.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCanton.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCanton);
		this.jInternalFrameReporteDinamicoCanton.getContentPane().add(this.jScrollPanelReporteDinamicoCanton, this.gridBagConstraintsCanton);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCanton() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCanton = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCanton = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCanton.setName("jPanelImportacionCanton"); 
		
		this.jPanelImportacionCanton.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCanton.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCanton.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCanton.setLayout(gridaBagLayoutImportacionCanton);
		
		
		this.jInternalFrameImportacionCanton= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCanton= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCanton = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCanton= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCanton.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCanton.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCanton.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCanton.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCanton.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCanton.setResizable(true);
	    this.jInternalFrameImportacionCanton.setClosable(true);
	    this.jInternalFrameImportacionCanton.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCanton.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCanton.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCanton.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCanton.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCanton.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCanton.setResizable(true);
	    this.jInternalFrameImportacionCanton.setClosable(true);
	    this.jInternalFrameImportacionCanton.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCanton.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCanton.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCanton.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cantones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCanton = new JLabelMe();

		this.jLabelArchivoImportacionCanton.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCanton.gridy = iPosYImportacion;		
		this.gridBagConstraintsCanton.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCanton.add(this.jLabelArchivoImportacionCanton, this.gridBagConstraintsCanton);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCanton = new JFileChooser();		
		this.jFileChooserImportacionCanton.setToolTipText("ESCOGER ARCHIVO"+" "+CantonConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCanton = new JButtonMe();
		this.jButtonAbrirImportacionCanton.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCanton,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCanton.setToolTipText("Generar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCanton.gridy = iPosYImportacion;
		this.gridBagConstraintsCanton.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCanton.add(this.jButtonAbrirImportacionCanton, this.gridBagConstraintsCanton);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCanton = new JLabelMe();

		this.jLabelPathArchivoImportacionCanton.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCanton.gridy = iPosYImportacion;		
		this.gridBagConstraintsCanton.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCanton.add(this.jLabelPathArchivoImportacionCanton, this.gridBagConstraintsCanton);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCanton=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCanton.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCanton.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCanton.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCanton.gridy = iPosYImportacion;
		this.gridBagConstraintsCanton.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCanton.add(this.jTextFieldPathArchivoImportacionCanton, this.gridBagConstraintsCanton);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCanton = new JButtonMe();
		this.jButtonGenerarImportacionCanton.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCanton,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCanton.setToolTipText("Generar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCanton.gridy = iPosYImportacion;
		this.gridBagConstraintsCanton.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCanton.add(this.jButtonGenerarImportacionCanton, this.gridBagConstraintsCanton);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCanton = new JButtonMe();
		this.jButtonCerrarImportacionCanton.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCanton,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCanton.setToolTipText("Cancelar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCanton.gridy = iPosYImportacion;
		this.gridBagConstraintsCanton.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCanton.add(this.jButtonCerrarImportacionCanton, this.gridBagConstraintsCanton);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCanton = new GridBagLayout();
		
		this.jScrollPanelImportacionCanton= new JScrollPane(jPanelImportacionCanton,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy =iPosYImportacion;
		this.gridBagConstraintsCanton.gridx =iPosXImportacion;
		this.gridBagConstraintsCanton.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCanton.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCanton.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCanton);
		this.jInternalFrameImportacionCanton.getContentPane().add(this.jScrollPanelImportacionCanton, this.gridBagConstraintsCanton);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCanton(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCanton = new JButtonMe();
			this.jButtonAbrirOrderByCanton.setText("Orden");
			this.jButtonAbrirOrderByCanton.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCanton,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCanton";
			inputMap = this.jButtonAbrirOrderByCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCanton.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCanton"));
		
		
			GridBagLayout gridaBagLayoutOrderByCanton = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCanton = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCanton.setName("jPanelOrderByCanton"); 
			
			this.jPanelOrderByCanton.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCanton.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCanton.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCanton.setLayout(gridaBagLayoutOrderByCanton);
			
			
			this.jTableDatosCantonOrderBy = new JTableMe();        
			this.jTableDatosCantonOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCantonOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCantonOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCantonOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCantonOrderBy.setViewportView(this.jTableDatosCantonOrderBy);
			this.jTableDatosCantonOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCantonOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCanton= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCanton= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCanton = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCanton= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCanton.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCanton.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCanton.setTitle("Orden");
			this.jInternalFrameOrderByCanton.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCanton.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCanton.setResizable(true);
			this.jInternalFrameOrderByCanton.setClosable(true);
			this.jInternalFrameOrderByCanton.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCanton.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCanton.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCanton.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cantones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCanton.gridx =iPosXOrderBy;
			this.gridBagConstraintsCanton.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCanton.ipady =150;
				
			this.jPanelOrderByCanton.add(jScrollPanelDatosCantonOrderBy, this.gridBagConstraintsCanton);//this.jTableDatosCantonTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCanton = new JButtonMe();
			this.jButtonCerrarOrderByCanton.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCanton,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCanton.setToolTipText("Cancelar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCanton.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCanton.add(this.jButtonCerrarOrderByCanton, this.gridBagConstraintsCanton);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCanton = new GridBagLayout();
			
			this.jScrollPanelOrderByCanton= new JScrollPane(jPanelOrderByCanton,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.gridy =iPosYOrderBy;
			this.gridBagConstraintsCanton.gridx =iPosXOrderBy;
			this.gridBagConstraintsCanton.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCanton.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCanton.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCanton);
			
			this.jInternalFrameOrderByCanton.getContentPane().add(this.jScrollPanelOrderByCanton, this.gridBagConstraintsCanton);			
		
		} else {
			this.jButtonAbrirOrderByCanton = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cantonSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCanton.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCanton.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCanton.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCanton.getRowHeight();//CantonConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cantonSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CantonConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCanton.isSelected()) {
					iHeightTable=CantonConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CantonConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CantonConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CantonConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCanton.isSelected()) {
					iHeightTable=CantonConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CantonConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CantonConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCanton.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCanton.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCanton.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCanton.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCanton.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCanton.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCanton!=null && this.jInternalFrameOrderByCanton.getjTableDatosOrderBy()!=null) {
			//if(!this.cantonSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCanton.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCanton.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCanton.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCanton.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCanton.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCanton.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCanton.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCanton.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCanton.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCanton.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cantonLogic.getCantons().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cantons.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Canton> TraerCantonBeans(List<Canton> cantons,ArrayList<Classe> classes)throws Exception {
		try {
			for(Canton canton:cantons) {
					
				if(!(CantonConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CantonConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					canton.setsDetalleGeneralEntityReporte(CantonConstantesFunciones.getCantonDescripcion(canton));
										
					canton.setes_activo_descripcion(CantonConstantesFunciones.getes_activoDescripcion(canton));	
					
					

					if(canton.getBarrios()!=null && Funciones.existeClass(classes,Barrio.class)) {
						try{canton.setbarriosDescripcionReporte(new JRBeanCollectionDataSource(BarrioJInternalFrame.TraerBarrioBeans(canton.getBarrios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(canton.getParroquias()!=null && Funciones.existeClass(classes,Parroquia.class)) {
						try{canton.setparroquiasDescripcionReporte(new JRBeanCollectionDataSource(ParroquiaJInternalFrame.TraerParroquiaBeans(canton.getParroquias(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//canton.setsDetalleGeneralEntityReporte(canton.getsDetalleGeneralEntityReporte());
										
				}
				
				//cantonbeans.add(cantonbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cantons;
    }
	//PARA REPORTES FIN
}
