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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.ControlProveedoresConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class ControlProveedoresJInternalFrame extends ControlProveedoresBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarControlProveedores;
	
	protected JMenuBar jmenuBarControlProveedores;
	
	protected JMenu jmenuControlProveedores;
	protected JMenu jmenuDatosControlProveedores;
	protected JMenu jmenuArchivoControlProveedores;
	protected JMenu jmenuAccionesControlProveedores;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosControlProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutControlProveedores;	
	protected GridBagConstraints gridBagConstraintsControlProveedores;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ControlProveedoresDetalleFormJInternalFrame jInternalFrameDetalleFormControlProveedores;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoControlProveedores;	
	protected ImportacionJInternalFrame jInternalFrameImportacionControlProveedores;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ControlProveedoresSessionBean controlproveedoresSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ControlProveedores> controlproveedoress;		
	public List<ControlProveedores> controlproveedoressEliminados;	
	public List<ControlProveedores> controlproveedoressAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByControlProveedores;		
	protected JButton jButtonAbrirOrderByControlProveedores;
	
	
	//protected JPanel jPanelOrderByControlProveedores;
	//public JScrollPane jScrollPanelOrderByControlProveedores;	
	//protected JButton jButtonCerrarOrderByControlProveedores;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ControlProveedoresLogic controlproveedoresLogic;
	
	
	
	public JScrollPane jScrollPanelDatosControlProveedores;
	public JScrollPane jScrollPanelDatosEdicionControlProveedores;
	public JScrollPane jScrollPanelDatosGeneralControlProveedores;
    
	
	
	//public JScrollPane jScrollPanelDatosControlProveedoresOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoControlProveedores;
	//public JScrollPane jScrollPanelImportacionControlProveedores;
	
	
	
	protected JPanel jPanelAccionesControlProveedores;
	
    protected JPanel jPanelPaginacionControlProveedores;
    protected JPanel jPanelParametrosReportesControlProveedores;
	protected JPanel jPanelParametrosReportesAccionesControlProveedores;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ControlProveedores;
	protected JPanel jPanelParametrosAuxiliar2ControlProveedores;
	protected JPanel jPanelParametrosAuxiliar3ControlProveedores;
	protected JPanel jPanelParametrosAuxiliar4ControlProveedores;
	//protected JPanel jPanelParametrosAuxiliar5ControlProveedores;
	
	
	
	//protected JPanel jPanelReporteDinamicoControlProveedores;
	//protected JPanel jPanelImportacionControlProveedores;
	
	
	public JTable jTableDatosControlProveedores;
	
	
	
	//public JTable jTableDatosControlProveedoresOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoControlProveedores;
	protected JButton jButtonDuplicarControlProveedores;
	protected JButton jButtonCopiarControlProveedores;
	protected JButton jButtonVerFormControlProveedores;
	protected JButton jButtonNuevoRelacionesControlProveedores;
	protected JButton jButtonModificarControlProveedores;
	
    protected JButton jButtonGuardarCambiosTablaControlProveedores;
	protected JButton jButtonCerrarControlProveedores;
	
	
	protected JButton jButtonRecargarInformacionControlProveedores;
	protected JButton jButtonProcesarInformacionControlProveedores;
	
	
	protected JButton jButtonAnterioresControlProveedores;
	protected JButton jButtonSiguientesControlProveedores;
	protected JButton jButtonNuevoGuardarCambiosControlProveedores;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoControlProveedores;
	//protected JButton jButtonCerrarReporteDinamicoControlProveedores;
	//protected JButton jButtonGenerarExcelReporteDinamicoControlProveedores;	
	
	
	
	//protected JButton jButtonAbrirImportacionControlProveedores;
	//protected JButton jButtonGenerarImportacionControlProveedores;
	//protected JButton jButtonCerrarImportacionControlProveedores;
	//protected JFileChooser jFileChooserImportacionControlProveedores;
	//protected File fileImportacionControlProveedores;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarControlProveedores;
	protected JButton jButtonDuplicarToolBarControlProveedores;
	protected JButton jButtonNuevoRelacionesToolBarControlProveedores;
	
	
	public JButton jButtonGuardarCambiosToolBarControlProveedores;
	protected JButton jButtonCopiarToolBarControlProveedores;
	protected JButton jButtonVerFormToolBarControlProveedores;
	public JButton jButtonGuardarCambiosTablaToolBarControlProveedores;
	protected JButton jButtonMostrarOcultarTablaToolBarControlProveedores;
	protected JButton jButtonCerrarToolBarControlProveedores;
	
	protected JButton jButtonRecargarInformacionToolBarControlProveedores;
	protected JButton jButtonProcesarInformacionToolBarControlProveedores;
	protected JButton jButtonAnterioresToolBarControlProveedores;
	protected JButton jButtonSiguientesToolBarControlProveedores;
	protected JButton jButtonNuevoGuardarCambiosToolBarControlProveedores;
	protected JButton jButtonAbrirOrderByToolBarControlProveedores;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoControlProveedores;
	protected JMenuItem jMenuItemDuplicarControlProveedores;
	protected JMenuItem jMenuItemNuevoRelacionesControlProveedores;
	
	
	protected JMenuItem jMenuItemGuardarCambiosControlProveedores;
	protected JMenuItem jMenuItemCopiarControlProveedores;
	protected JMenuItem jMenuItemVerFormControlProveedores;
	protected JMenuItem jMenuItemGuardarCambiosTablaControlProveedores;
	protected JMenuItem jMenuItemCerrarControlProveedores;
	protected JMenuItem jMenuItemDetalleCerrarControlProveedores;
	protected JMenuItem jMenuItemDetalleAbrirOrderByControlProveedores;
	protected JMenuItem jMenuItemDetalleMostarOcultarControlProveedores;
	
	protected JMenuItem jMenuItemRecargarInformacionControlProveedores;
	protected JMenuItem jMenuItemProcesarInformacionControlProveedores;
	protected JMenuItem jMenuItemAnterioresControlProveedores;
	protected JMenuItem jMenuItemSiguientesControlProveedores;
	protected JMenuItem jMenuItemNuevoGuardarCambiosControlProveedores;
	protected JMenuItem jMenuItemAbrirOrderByControlProveedores;
	protected JMenuItem jMenuItemMostrarOcultarControlProveedores;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesControlProveedores;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosControlProveedores;
	protected JCheckBox jCheckBoxSeleccionadosControlProveedores;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaControlProveedores;
	protected JCheckBox jCheckBoxConGraficoReporteControlProveedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesControlProveedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesControlProveedores;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoControlProveedores;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoControlProveedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesControlProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionControlProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesControlProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesControlProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarControlProveedores;
	protected JTextField jTextFieldValorCampoGeneralControlProveedores;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteControlProveedores;
	//public JList<Reporte> jListColumnasSelectReporteControlProveedores;
	//public JScrollPane jScrollColumnasSelectReporteControlProveedores;
	
	//public JLabel jLabelRelacionesSelectReporteControlProveedores;
	//public JList<Reporte> jListRelacionesSelectReporteControlProveedores;
	//public JScrollPane jScrollRelacionesSelectReporteControlProveedores;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoControlProveedores;
	//protected JCheckBox jCheckBoxConGraficoDinamicoControlProveedores;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoControlProveedores;
	//public JLabel jLabelTiposArchivoReporteDinamicoControlProveedores;
	
		
	//public JLabel jLabelArchivoImportacionControlProveedores;	
	//public JLabel jLabelPathArchivoImportacionControlProveedores;
	//protected JTextField jTextFieldPathArchivoImportacionControlProveedores;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoControlProveedores;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoControlProveedores;
	
	//public JLabel jLabelColumnaCategoriaValorControlProveedores;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorControlProveedores;
	
	//public JLabel jLabelColumnasValoresGraficoControlProveedores;
	//public JList<Reporte> jListColumnasValoresGraficoControlProveedores;
	//public JScrollPane jScrollColumnasValoresGraficoControlProveedores;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoControlProveedores;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoControlProveedores;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasControlProveedores;
	public JPanel jPanelBusquedaControlProveedoresControlProveedores;
	public JButton jButtonBusquedaControlProveedoresControlProveedores;
	
	public JPanel jPanelfecha_emision_hastaBusquedaControlProveedoresControlProveedores;
	public JLabel jLabelfecha_emision_hastaBusquedaControlProveedoresControlProveedores;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaControlProveedoresControlProveedores;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaControlProveedoresControlProveedores;
	public JButton jButtonfecha_emision_hastaBusquedaControlProveedoresControlProveedoresBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=924;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ControlProveedoresJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ControlProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ControlProveedoresJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ControlProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ControlProveedoresJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ControlProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ControlProveedoresJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ControlProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionControlProveedores)	{
		this.jButtonRecargarInformacionControlProveedores = jButtonRecargarInformacionControlProveedores;
	}
	
	public JButton getjButtonProcesarInformacionControlProveedores() {
		return this.jButtonProcesarInformacionControlProveedores;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionControlProveedores)	{
		this.jButtonProcesarInformacionControlProveedores = jButtonProcesarInformacionControlProveedores;
	}
	
	
	public JButton getjButtonRecargarInformacionControlProveedores() {
		return this.jButtonRecargarInformacionControlProveedores;
	}
	
	
	public List<ControlProveedores> getcontrolproveedoress() {
		return this.controlproveedoress;
	}

	public void setcontrolproveedoress(List<ControlProveedores> controlproveedoress) {
		this.controlproveedoress = controlproveedoress;
	}
	
	public List<ControlProveedores> getcontrolproveedoressAux() {
		return this.controlproveedoressAux;
	}

	public void setcontrolproveedoressAux(List<ControlProveedores> controlproveedoressAux) {
		this.controlproveedoressAux = controlproveedoressAux;
	}
	
	public List<ControlProveedores> getcontrolproveedoressEliminados() {
		return this.controlproveedoressEliminados;
	}

	public void setControlProveedoressEliminados(List<ControlProveedores> controlproveedoressEliminados) {
		this.controlproveedoressEliminados = controlproveedoressEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarControlProveedores() {
		return jComboBoxTiposSeleccionarControlProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarControlProveedores(
			JComboBox jComboBoxTiposSeleccionarControlProveedores) {
		this.jComboBoxTiposSeleccionarControlProveedores = jComboBoxTiposSeleccionarControlProveedores;
	}
	
	public void setBorderResaltarTiposSeleccionarControlProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarControlProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarControlProveedores .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralControlProveedores() {
		return jTextFieldValorCampoGeneralControlProveedores;
	}

	public void setjTextFieldValorCampoGeneralControlProveedores(
			JTextField jTextFieldValorCampoGeneralControlProveedores) {
		this.jTextFieldValorCampoGeneralControlProveedores = jTextFieldValorCampoGeneralControlProveedores;
	}

	public void setBorderResaltarValorCampoGeneralControlProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlProveedores.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralControlProveedores .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosControlProveedores() {
		return this.jCheckBoxSeleccionarTodosControlProveedores;
	}

	public void setjCheckBoxSeleccionarTodosControlProveedores(
			JCheckBox jCheckBoxSeleccionarTodosControlProveedores) {
		this.jCheckBoxSeleccionarTodosControlProveedores = jCheckBoxSeleccionarTodosControlProveedores;
	}

	public void setBorderResaltarSeleccionarTodosControlProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlProveedores.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosControlProveedores .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosControlProveedores() {
		return this.jCheckBoxSeleccionadosControlProveedores;
	}

	public void setjCheckBoxSeleccionadosControlProveedores(
			JCheckBox jCheckBoxSeleccionadosControlProveedores) {
		this.jCheckBoxSeleccionadosControlProveedores = jCheckBoxSeleccionadosControlProveedores;
	}
	
	public void setBorderResaltarSeleccionadosControlProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlProveedores.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosControlProveedores .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesControlProveedores() {
		return this.jComboBoxTiposArchivosReportesControlProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesControlProveedores(
			JComboBox jComboBoxTiposArchivosReportesControlProveedores) {
		this.jComboBoxTiposArchivosReportesControlProveedores = jComboBoxTiposArchivosReportesControlProveedores;
	}

	public void setBorderResaltarTiposArchivosReportesControlProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesControlProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesControlProveedores() {
		return this.jComboBoxTiposReportesControlProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesControlProveedores(
			JComboBox jComboBoxTiposReportesControlProveedores) {
		this.jComboBoxTiposReportesControlProveedores = jComboBoxTiposReportesControlProveedores;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoControlProveedores() {
	//	return jComboBoxTiposReportesDinamicoControlProveedores;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoControlProveedores(
	//		JComboBox jComboBoxTiposReportesDinamicoControlProveedores) {
	//	this.jComboBoxTiposReportesDinamicoControlProveedores = jComboBoxTiposReportesDinamicoControlProveedores;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoControlProveedores() {
	//	return jComboBoxTiposArchivosReportesDinamicoControlProveedores;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoControlProveedores(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoControlProveedores) {
	//	this.jComboBoxTiposArchivosReportesDinamicoControlProveedores = jComboBoxTiposArchivosReportesDinamicoControlProveedores;
	//}
	
	public void setBorderResaltarTiposReportesControlProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesControlProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesControlProveedores() {
		return this.jComboBoxTiposGraficosReportesControlProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesControlProveedores(
			JComboBox jComboBoxTiposGraficosReportesControlProveedores) {
		this.jComboBoxTiposGraficosReportesControlProveedores = jComboBoxTiposGraficosReportesControlProveedores;
	}
	
	public void setBorderResaltarTiposGraficosReportesControlProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesControlProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionControlProveedores() {
		return this.jComboBoxTiposPaginacionControlProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionControlProveedores(
			JComboBox jComboBoxTiposPaginacionControlProveedores) {
		this.jComboBoxTiposPaginacionControlProveedores = jComboBoxTiposPaginacionControlProveedores;
	}
	
	public void setBorderResaltarTiposPaginacionControlProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionControlProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesControlProveedores() {
		return this.jComboBoxTiposRelacionesControlProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesControlProveedores() {
		return this.jComboBoxTiposAccionesControlProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesControlProveedores(
			JComboBox jComboBoxTiposRelacionesControlProveedores) {
		this.jComboBoxTiposRelacionesControlProveedores = jComboBoxTiposRelacionesControlProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesControlProveedores(
			JComboBox jComboBoxTiposAccionesControlProveedores) {
		this.jComboBoxTiposAccionesControlProveedores = jComboBoxTiposAccionesControlProveedores;
	}
	
	public void setBorderResaltarTiposRelacionesControlProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesControlProveedores .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesControlProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesControlProveedores .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoControlProveedores() {
	//	return jCheckBoxConGraficoDinamicoControlProveedores;
	//}

	//public void setjCheckBoxConGraficoDinamicoControlProveedores(
	//		JCheckBox jCheckBoxConGraficoDinamicoControlProveedores) {
	//	this.jCheckBoxConGraficoDinamicoControlProveedores = jCheckBoxConGraficoDinamicoControlProveedores;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoControlProveedores() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarControlProveedores.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoControlProveedores .setBorder(borderResaltar);		
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
		this.controlproveedoresSessionBean=new ControlProveedoresSessionBean();
		
		this.controlproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.controlproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.controlproveedoresSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ControlProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ControlProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ControlProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ControlProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ControlProveedoresJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Control Proveedores MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
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
		
		ControlProveedoresJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ControlProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarControlProveedores= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarControlProveedores,this.jTtoolBarControlProveedores,
							"nuevo","nuevo","Nuevo"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarControlProveedores,this.jTtoolBarControlProveedores,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarControlProveedores,this.jTtoolBarControlProveedores,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarControlProveedores,this.jTtoolBarControlProveedores,
							"duplicar","duplicar","Duplicar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarControlProveedores,this.jTtoolBarControlProveedores,
							"copiar","copiar","Copiar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarControlProveedores,this.jTtoolBarControlProveedores,
							"ver_form","ver_form","Ver"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarControlProveedores,this.jTtoolBarControlProveedores,
							"recargar","recargar","Buscar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarControlProveedores,this.jTtoolBarControlProveedores,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarControlProveedores,this.jTtoolBarControlProveedores,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarControlProveedores,this.jTtoolBarControlProveedores,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarControlProveedores,this.jTtoolBarControlProveedores,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarControlProveedores,this.jTtoolBarControlProveedores,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarControlProveedores,this.jTtoolBarControlProveedores,
							"cerrar","cerrar","Salir"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarControlProveedores=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarControlProveedores;
			
				this.jButtonProcesarInformacionToolBarControlProveedores=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarControlProveedores;
				
		//protected JButton jButtonModificarToolBarControlProveedores;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarControlProveedores=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuControlProveedores=new JMenuMe("General");
		this.jmenuArchivoControlProveedores=new JMenuMe("Archivo");
		this.jmenuAccionesControlProveedores=new JMenuMe("Acciones");
		this.jmenuDatosControlProveedores=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoControlProveedores= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoControlProveedores.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoControlProveedores,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarControlProveedores= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarControlProveedores.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarControlProveedores,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesControlProveedores= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesControlProveedores.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesControlProveedores,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosControlProveedores= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosControlProveedores.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosControlProveedores,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarControlProveedores= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarControlProveedores.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarControlProveedores,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormControlProveedores= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormControlProveedores.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormControlProveedores,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaControlProveedores= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaControlProveedores.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaControlProveedores,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarControlProveedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarControlProveedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarControlProveedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionControlProveedores= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionControlProveedores.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionControlProveedores,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionControlProveedores= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionControlProveedores.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionControlProveedores,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresControlProveedores= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresControlProveedores.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresControlProveedores,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesControlProveedores= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesControlProveedores.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesControlProveedores,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByControlProveedores= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByControlProveedores.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByControlProveedores,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarControlProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarControlProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarControlProveedores,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByControlProveedores= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByControlProveedores.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByControlProveedores,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarControlProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarControlProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarControlProveedores,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosControlProveedores= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosControlProveedores.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosControlProveedores,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoControlProveedores.add(this.jMenuItemCerrarControlProveedores);
			
			this.jmenuAccionesControlProveedores.add(this.jMenuItemNuevoControlProveedores);
			this.jmenuAccionesControlProveedores.add(this.jMenuItemNuevoGuardarCambiosControlProveedores);
			this.jmenuAccionesControlProveedores.add(this.jMenuItemNuevoRelacionesControlProveedores);
			this.jmenuAccionesControlProveedores.add(this.jMenuItemGuardarCambiosTablaControlProveedores);		
			this.jmenuAccionesControlProveedores.add(this.jMenuItemDuplicarControlProveedores);		
			this.jmenuAccionesControlProveedores.add(this.jMenuItemCopiarControlProveedores);		
			this.jmenuAccionesControlProveedores.add(this.jMenuItemVerFormControlProveedores);		
			
			this.jmenuDatosControlProveedores.add(this.jMenuItemRecargarInformacionControlProveedores);				
			this.jmenuDatosControlProveedores.add(this.jMenuItemAnterioresControlProveedores);				
			this.jmenuDatosControlProveedores.add(this.jMenuItemSiguientesControlProveedores);				
			this.jmenuDatosControlProveedores.add(this.jMenuItemAbrirOrderByControlProveedores);				
			this.jmenuDatosControlProveedores.add(this.jMenuItemMostrarOcultarControlProveedores);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesControlProveedores.add(this.jMenuItemGuardarCambiosControlProveedores);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarControlProveedores.add(this.jmenuArchivoControlProveedores);		
			this.jmenuBarControlProveedores.add(this.jmenuAccionesControlProveedores);		
			this.jmenuBarControlProveedores.add(this.jmenuDatosControlProveedores);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarControlProveedores);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasControlProveedores() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaControlProveedoresControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaControlProveedoresControlProveedores.setToolTipText("Buscar Por Fecha  Emisionhasta ");
		this.jButtonBusquedaControlProveedoresControlProveedores= new JButtonMe();
		this.jButtonBusquedaControlProveedoresControlProveedores.setText("Buscar");
		this.jButtonBusquedaControlProveedoresControlProveedores.setToolTipText("Buscar Por Fecha  Emisionhasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaControlProveedoresControlProveedores,"buscar_button","Buscar Por Fecha  Emisionhasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaControlProveedoresControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_emision_hastaBusquedaControlProveedoresControlProveedores = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaControlProveedoresControlProveedores.setText("Fecha  Emisionhasta :");
		jLabelfecha_emision_hastaBusquedaControlProveedoresControlProveedores.setToolTipText("Fecha  Emisionhasta");
		jLabelfecha_emision_hastaBusquedaControlProveedoresControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaControlProveedoresControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaControlProveedoresControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaControlProveedoresControlProveedores,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaControlProveedoresControlProveedores= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaControlProveedoresControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaControlProveedoresControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaControlProveedoresControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaControlProveedoresControlProveedores,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaControlProveedoresControlProveedores.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaControlProveedoresControlProveedores.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaControlProveedoresControlProveedores.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasControlProveedores=new JTabbedPane();


		this.jTabbedPaneBusquedasControlProveedores.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasControlProveedores.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasControlProveedores.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasControlProveedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasControlProveedores,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleControlProveedores = new ControlProveedoresDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Control Proveedores DATOS");
			this.jInternalFrameDetalleFormControlProveedores = new ControlProveedoresDetalleFormJInternalFrame(jDesktopPane,this.controlproveedoresSessionBean.getConGuardarRelaciones(),this.controlproveedoresSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormControlProveedores = null;//new ControlProveedoresDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutControlProveedores= new GridBagLayout();
		
		
		this.jTableDatosControlProveedores = new JTableMe();      
		
		String sToolTipControlProveedores="";
		sToolTipControlProveedores=ControlProveedoresConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipControlProveedores+="(Cartera.ControlProveedores)";
		}
		
		if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
			sToolTipControlProveedores+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosControlProveedores.setToolTipText(sToolTipControlProveedores);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosControlProveedores);
		this.jTableDatosControlProveedores.setAutoCreateRowSorter(true);
		this.jTableDatosControlProveedores.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosControlProveedores.setRowSelectionAllowed(true);
		this.jTableDatosControlProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosControlProveedores,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoControlProveedores = new JButtonMe();
		this.jButtonDuplicarControlProveedores = new JButtonMe();
		this.jButtonCopiarControlProveedores = new JButtonMe();
		this.jButtonVerFormControlProveedores = new JButtonMe();
		this.jButtonNuevoRelacionesControlProveedores = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaControlProveedores = new JButtonMe();
		this.jButtonCerrarControlProveedores = new JButtonMe();
		
		this.jScrollPanelDatosControlProveedores = new JScrollPane();   
        this.jScrollPanelDatosGeneralControlProveedores = new JScrollPane();
		
				
		
		
		this.jPanelAccionesControlProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Control Proveedores";
		
		if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Control Proveedoreses" + this.sPath));
		} else {
			this.jScrollPanelDatosControlProveedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesControlProveedores.setToolTipText("Acciones");
        this.jPanelAccionesControlProveedores.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoControlProveedores=new ReporteDinamicoJInternalFrame(ControlProveedoresConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoControlProveedores();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionControlProveedores=new ImportacionJInternalFrame(ControlProveedoresConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionControlProveedores();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByControlProveedores = new JButtonMe();
		
		this.jButtonAbrirOrderByControlProveedores.setText("Orden");
		this.jButtonAbrirOrderByControlProveedores.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByControlProveedores,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByControlProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByControlProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByControlProveedores,false,this);
			
			//this.cargarOrderByControlProveedores(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByControlProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByControlProveedores,true,this);
			
			//this.cargarOrderByControlProveedores(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosControlProveedores.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosControlProveedores.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosControlProveedores.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosControlProveedores.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosControlProveedores.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosControlProveedores.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoControlProveedores.setText("Nuevo");
		this.jButtonDuplicarControlProveedores.setText("Duplicar");
		this.jButtonCopiarControlProveedores.setText("Copiar");
		this.jButtonVerFormControlProveedores.setText("Ver");
		this.jButtonNuevoRelacionesControlProveedores.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaControlProveedores.setText("Guardar");
		this.jButtonCerrarControlProveedores.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoControlProveedores,"nuevo_button","Nuevo",this.controlproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarControlProveedores,"duplicar_button","Duplicar",this.controlproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarControlProveedores,"copiar_button","Copiar",this.controlproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormControlProveedores,"ver_form","Ver",this.controlproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesControlProveedores,"nuevorelaciones_button","Nuevo Rel",this.controlproveedoresSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaControlProveedores,"guardarcambiostabla_button","Guardar",this.controlproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarControlProveedores,"cerrar_button","Salir",this.controlproveedoresSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoControlProveedores.setToolTipText("Nuevo"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarControlProveedores.setToolTipText("Duplicar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarControlProveedores.setToolTipText("Copiar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormControlProveedores.setToolTipText("Ver"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesControlProveedores.setToolTipText("Nuevo Rel"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaControlProveedores.setToolTipText("Guardar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarControlProveedores.setToolTipText("Salir"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoControlProveedores";
		inputMap = this.jButtonNuevoControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoControlProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoControlProveedores"));
		
		//DUPLICAR
		sMapKey = "DuplicarControlProveedores";
		inputMap = this.jButtonDuplicarControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarControlProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarControlProveedores"));
		
		//COPIAR
		sMapKey = "CopiarControlProveedores";
		inputMap = this.jButtonCopiarControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarControlProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarControlProveedores"));
		
		//VEr FORM
		sMapKey = "VerFormControlProveedores";
		inputMap = this.jButtonVerFormControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormControlProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormControlProveedores"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesControlProveedores";
		inputMap = this.jButtonNuevoRelacionesControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesControlProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesControlProveedores"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarControlProveedores";
		inputMap = this.jButtonModificarControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarControlProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarControlProveedores"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarControlProveedores";
		inputMap = this.jButtonCerrarControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarControlProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarControlProveedores"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaControlProveedores";
		inputMap = this.jButtonGuardarCambiosTablaControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaControlProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaControlProveedores"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesControlProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesControlProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionControlProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ControlProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ControlProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ControlProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ControlProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ControlProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesControlProveedores.setName("jPanelParametrosReportesControlProveedores"); 
		
		this.jPanelParametrosReportesAccionesControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesControlProveedores.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesControlProveedores.setName("jPanelParametrosReportesAccionesControlProveedores"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionControlProveedores = new JButtonMe();
		this.jButtonRecargarInformacionControlProveedores.setText("Buscar");
		this.jButtonRecargarInformacionControlProveedores.setToolTipText("Buscar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionControlProveedores,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionControlProveedores.setVisible(false);
		
		
		this.jButtonProcesarInformacionControlProveedores = new JButtonMe();
		this.jButtonProcesarInformacionControlProveedores.setText("Procesar");
		this.jButtonProcesarInformacionControlProveedores.setToolTipText("Procesar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionControlProveedores.setVisible(false);
			
		this.jButtonProcesarInformacionControlProveedores.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionControlProveedores.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionControlProveedores.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesControlProveedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesControlProveedores.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesControlProveedores.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesControlProveedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesControlProveedores.setText("TIPO");       
		this.jComboBoxTiposReportesControlProveedores.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesControlProveedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesControlProveedores.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesControlProveedores.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionControlProveedores = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionControlProveedores.setText("Paginacion");
		this.jComboBoxTiposPaginacionControlProveedores.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesControlProveedores = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesControlProveedores.setText("Accion");
		this.jComboBoxTiposRelacionesControlProveedores.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesControlProveedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesControlProveedores.setText("Accion");
		this.jComboBoxTiposAccionesControlProveedores.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarControlProveedores = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarControlProveedores.setText("Accion");
		this.jComboBoxTiposSeleccionarControlProveedores.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralControlProveedores=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralControlProveedores.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralControlProveedores.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralControlProveedores.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesControlProveedores = new JLabelMe();
		
		this.jLabelAccionesControlProveedores.setText("Acciones");		
		this.jLabelAccionesControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosControlProveedores = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosControlProveedores.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosControlProveedores.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosControlProveedores = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosControlProveedores.setText("Seleccionados");
		this.jCheckBoxSeleccionadosControlProveedores.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaControlProveedores = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaControlProveedores.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaControlProveedores.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteControlProveedores = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteControlProveedores.setText("Graf.");
		this.jCheckBoxConGraficoReporteControlProveedores.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresControlProveedores = new JButtonMe();
		//this.jButtonAnterioresControlProveedores.setText("<<");
        this.jButtonAnterioresControlProveedores.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresControlProveedores,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesControlProveedores = new JButtonMe();
		//this.jButtonSiguientesControlProveedores.setText(">>");
        this.jButtonSiguientesControlProveedores.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesControlProveedores,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosControlProveedores = new JButtonMe();
		this.jButtonNuevoGuardarCambiosControlProveedores.setText("Nue");
        this.jButtonNuevoGuardarCambiosControlProveedores.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosControlProveedores,"nuevoguardarcambios_button","Nue",this.controlproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosControlProveedores";
		inputMap = this.jButtonNuevoGuardarCambiosControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosControlProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosControlProveedores"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionControlProveedores";
		inputMap = this.jButtonRecargarInformacionControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionControlProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionControlProveedores"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesControlProveedores";
		inputMap = this.jButtonSiguientesControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesControlProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesControlProveedores"));
		
		//ANTERIORES		
		sMapKey = "AnterioresControlProveedores";
		inputMap = this.jButtonAnterioresControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresControlProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresControlProveedores"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasControlProveedores();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesControlProveedores.setMinimumSize(new Dimension(this.getWidth(),ControlProveedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ControlProveedoresBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesControlProveedores.setMaximumSize(new Dimension(this.getWidth(),ControlProveedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ControlProveedoresBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesControlProveedores.setPreferredSize(new Dimension(this.getWidth(),ControlProveedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ControlProveedoresBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionControlProveedores = new GridBagLayout();

			this.jPanelPaginacionControlProveedores.setLayout(gridaBagLayoutPaginacionControlProveedores);						
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy = 0;
			this.gridBagConstraintsControlProveedores.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionControlProveedores.add(this.jButtonAnterioresControlProveedores, this.gridBagConstraintsControlProveedores);
					
						
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsControlProveedores.gridy = 0;
			
			this.jPanelPaginacionControlProveedores.add(this.jButtonNuevoGuardarCambiosControlProveedores, this.gridBagConstraintsControlProveedores);
						
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsControlProveedores.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsControlProveedores.gridy = 0;
			this.jPanelPaginacionControlProveedores.add(this.jButtonSiguientesControlProveedores, this.gridBagConstraintsControlProveedores);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy = 1;
			this.gridBagConstraintsControlProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionControlProveedores.add(this.jButtonNuevoControlProveedores, this.gridBagConstraintsControlProveedores);
						
			
			
			if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsControlProveedores = new GridBagConstraints();
				this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsControlProveedores.gridy = 1;
				this.gridBagConstraintsControlProveedores.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionControlProveedores.add(this.jButtonGuardarCambiosTablaControlProveedores, this.gridBagConstraintsControlProveedores);
			}
			
			
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy = 1;
			this.gridBagConstraintsControlProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionControlProveedores.add(this.jButtonDuplicarControlProveedores, this.gridBagConstraintsControlProveedores);
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy = 1;
			this.gridBagConstraintsControlProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionControlProveedores.add(this.jButtonCopiarControlProveedores, this.gridBagConstraintsControlProveedores);
		
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy = 1;
			this.gridBagConstraintsControlProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionControlProveedores.add(this.jButtonVerFormControlProveedores, this.gridBagConstraintsControlProveedores);
		
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy = 1;
			this.gridBagConstraintsControlProveedores.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionControlProveedores.add(this.jButtonCerrarControlProveedores, this.gridBagConstraintsControlProveedores);
		
		
		
		this.jButtonRecargarInformacionControlProveedores.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionControlProveedores.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionControlProveedores.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesControlProveedores.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesControlProveedores.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesControlProveedores.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesControlProveedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesControlProveedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesControlProveedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesControlProveedores.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesControlProveedores.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesControlProveedores.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionControlProveedores.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionControlProveedores.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionControlProveedores.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesControlProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesControlProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesControlProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesControlProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesControlProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesControlProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarControlProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarControlProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarControlProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaControlProveedores.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaControlProveedores.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaControlProveedores.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteControlProveedores.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteControlProveedores.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteControlProveedores.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosControlProveedores.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosControlProveedores.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosControlProveedores.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosControlProveedores.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosControlProveedores.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosControlProveedores.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesControlProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesControlProveedores = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ControlProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ControlProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ControlProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ControlProveedores = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesControlProveedores.setLayout(gridaBagParametrosReportesControlProveedores);
			this.jPanelParametrosReportesAccionesControlProveedores.setLayout(gridaBagParametrosReportesAccionesControlProveedores);
			
			
			this.jPanelParametrosAuxiliar1ControlProveedores.setLayout(gridaBagParametrosAuxiliar1ControlProveedores);
			this.jPanelParametrosAuxiliar2ControlProveedores.setLayout(gridaBagParametrosAuxiliar2ControlProveedores);
			this.jPanelParametrosAuxiliar3ControlProveedores.setLayout(gridaBagParametrosAuxiliar3ControlProveedores);
			this.jPanelParametrosAuxiliar4ControlProveedores.setLayout(gridaBagParametrosAuxiliar4ControlProveedores);
			//this.jPanelParametrosAuxiliar5ControlProveedores.setLayout(gridaBagParametrosAuxiliar2ControlProveedores);			
			
			
			
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsControlProveedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesControlProveedores.add(this.jButtonRecargarInformacionControlProveedores, this.gridBagConstraintsControlProveedores);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlProveedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsControlProveedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ControlProveedores.add(this.jComboBoxTiposPaginacionControlProveedores, this.gridBagConstraintsControlProveedores);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlProveedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsControlProveedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ControlProveedores.add(this.jCheckBoxConAltoMaximoTablaControlProveedores, this.gridBagConstraintsControlProveedores);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlProveedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsControlProveedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ControlProveedores.add(this.jComboBoxTiposArchivosReportesControlProveedores, this.gridBagConstraintsControlProveedores);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsControlProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesControlProveedores.add(this.jPanelParametrosAuxiliar1ControlProveedores, this.gridBagConstraintsControlProveedores);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsControlProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ControlProveedores.add(this.jComboBoxTiposReportesControlProveedores, this.gridBagConstraintsControlProveedores);																		
			
			
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsControlProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ControlProveedores.add(this.jComboBoxTiposGraficosReportesControlProveedores, this.gridBagConstraintsControlProveedores);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsControlProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesControlProveedores.add(this.jPanelParametrosAuxiliar4ControlProveedores, this.gridBagConstraintsControlProveedores);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlProveedores.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsControlProveedores.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesControlProveedores.add(this.jComboBoxTiposReportesControlProveedores, this.gridBagConstraintsControlProveedores);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsControlProveedores.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesControlProveedores.add(this.jCheckBoxGenerarReporteControlProveedores, this.gridBagConstraintsControlProveedores);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsControlProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesControlProveedores.add(this.jPanelParametrosAuxiliar2ControlProveedores, this.gridBagConstraintsControlProveedores);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsControlProveedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesControlProveedores.add(this.jLabelAccionesControlProveedores, this.gridBagConstraintsControlProveedores);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsControlProveedores = new GridBagConstraints();
				this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsControlProveedores.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsControlProveedores.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesControlProveedores.add(this.jButtonAbrirOrderByControlProveedores, this.gridBagConstraintsControlProveedores);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsControlProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsControlProveedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesControlProveedores.add(this.jComboBoxTiposSeleccionarControlProveedores, this.gridBagConstraintsControlProveedores);			
			
			
			/*
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsControlProveedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesControlProveedores.add(this.jCheckBoxSeleccionarTodosControlProveedores, this.gridBagConstraintsControlProveedores);
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsControlProveedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesControlProveedores.add(this.jCheckBoxConGraficoReporteControlProveedores, this.gridBagConstraintsControlProveedores);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsControlProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ControlProveedores.add(this.jCheckBoxSeleccionarTodosControlProveedores, this.gridBagConstraintsControlProveedores);															
				
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsControlProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ControlProveedores.add(this.jCheckBoxSeleccionadosControlProveedores, this.gridBagConstraintsControlProveedores);															
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsControlProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ControlProveedores.add(this.jCheckBoxConGraficoReporteControlProveedores, this.gridBagConstraintsControlProveedores);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsControlProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesControlProveedores.add(this.jPanelParametrosAuxiliar3ControlProveedores, this.gridBagConstraintsControlProveedores);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsControlProveedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesControlProveedores.add(this.jComboBoxTiposAccionesControlProveedores, this.gridBagConstraintsControlProveedores);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosControlProveedores = new GridBagLayout();

			this.jScrollPanelDatosControlProveedores.setLayout(gridaBagLayoutDatosControlProveedores);
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy = 0;
			this.gridBagConstraintsControlProveedores.gridx = 0;
			
			this.jScrollPanelDatosControlProveedores.add(this.jTableDatosControlProveedores, this.gridBagConstraintsControlProveedores);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosControlProveedores.setViewportView(this.jTableDatosControlProveedores);
		this.jTableDatosControlProveedores.setFillsViewportHeight(true);
		this.jTableDatosControlProveedores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesControlProveedores= new GridBagLayout();
		this.jPanelAccionesControlProveedores.setLayout(gridaBagLayoutAccionesControlProveedores);
		
		
		/*	
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 0;
			
		this.jPanelAccionesControlProveedores.add(this.jButtonNuevoControlProveedores, this.gridBagConstraintsControlProveedores);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaControlProveedoresControlProveedores= new GridBagLayout();
		gridaBagLayoutBusquedaControlProveedoresControlProveedores.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaControlProveedoresControlProveedores.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaControlProveedoresControlProveedores.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaControlProveedoresControlProveedores.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaControlProveedoresControlProveedores.setLayout(gridaBagLayoutBusquedaControlProveedoresControlProveedores);

		gridBagConstraintsControlProveedores = new GridBagConstraints();
		gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsControlProveedores.gridy = 0;
		gridBagConstraintsControlProveedores.gridx = 0;
		jPanelBusquedaControlProveedoresControlProveedores.add(jLabelfecha_emision_hastaBusquedaControlProveedoresControlProveedores, gridBagConstraintsControlProveedores);

		gridBagConstraintsControlProveedores = new GridBagConstraints();
		gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsControlProveedores.gridy = 0;
		gridBagConstraintsControlProveedores.gridx = 1;
		jPanelBusquedaControlProveedoresControlProveedores.add(jDateChooserfecha_emision_hastaBusquedaControlProveedoresControlProveedores, gridBagConstraintsControlProveedores);

		gridBagConstraintsControlProveedores = new GridBagConstraints();
		gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsControlProveedores.gridy = 1;
		gridBagConstraintsControlProveedores.gridx =1;
		jPanelBusquedaControlProveedoresControlProveedores.add(jButtonBusquedaControlProveedoresControlProveedores, gridBagConstraintsControlProveedores);

		jTabbedPaneBusquedasControlProveedores.addTab("1.-Por Fecha  Emisionhasta ", jPanelBusquedaControlProveedoresControlProveedores);
		jTabbedPaneBusquedasControlProveedores.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutControlProveedores = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutControlProveedores);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();						
			this.gridBagConstraintsControlProveedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsControlProveedores.gridx = 0;		
			//this.gridBagConstraintsControlProveedores.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsControlProveedores.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarControlProveedores, this.gridBagConstraintsControlProveedores);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy = iGridyPrincipal++;
		this.gridBagConstraintsControlProveedores.gridx = 0;		
		//this.gridBagConstraintsControlProveedores.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsControlProveedores.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsControlProveedores);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsControlProveedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsControlProveedores.gridx = 0;		
			this.gridBagConstraintsControlProveedores.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsControlProveedores.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasControlProveedores, this.gridBagConstraintsControlProveedores);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsControlProveedores.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesControlProveedores, this.gridBagConstraintsControlProveedores);								
		
		
		/*
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsControlProveedores.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesControlProveedores, this.gridBagConstraintsControlProveedores);
		*/		
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy =iGridyPrincipal++;
		this.gridBagConstraintsControlProveedores.gridx =0;
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsControlProveedores.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosControlProveedores, this.gridBagConstraintsControlProveedores);
				
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsControlProveedores.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionControlProveedores, this.gridBagConstraintsControlProveedores);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ControlProveedoresJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosControlProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosControlProveedores = new GridBagLayout();
			this.jPanelBusquedasParametrosControlProveedores.setLayout(gridaBagLayoutBusquedasParametrosControlProveedores);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralControlProveedores=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralControlProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralControlProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralControlProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsControlProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposControlProveedores, this.gridBagConstraintsControlProveedores);
			
			
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsControlProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosControlProveedores, this.gridBagConstraintsControlProveedores);
		
			
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsControlProveedores.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesControlProveedores, this.gridBagConstraintsControlProveedores);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralControlProveedores;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoControlProveedores() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoControlProveedores = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoControlProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoControlProveedores.setName("jPanelReporteDinamicoControlProveedores"); 
		
		this.jPanelReporteDinamicoControlProveedores.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoControlProveedores.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoControlProveedores.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoControlProveedores.setLayout(gridaBagLayoutReporteDinamicoControlProveedores);
		
		
		this.jInternalFrameReporteDinamicoControlProveedores= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoControlProveedores = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteControlProveedores= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoControlProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoControlProveedores.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoControlProveedores.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoControlProveedores.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoControlProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoControlProveedores.setResizable(true);
	    this.jInternalFrameReporteDinamicoControlProveedores.setClosable(true);
	    this.jInternalFrameReporteDinamicoControlProveedores.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoControlProveedores.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoControlProveedores.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoControlProveedores.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Control Proveedoreses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteControlProveedores = new JLabelMe();

		this.jLabelColumnasSelectReporteControlProveedores.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoControlProveedores.add(this.jLabelColumnasSelectReporteControlProveedores, this.gridBagConstraintsControlProveedores);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteControlProveedores = new JList<Reporte>();
		this.jListColumnasSelectReporteControlProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteControlProveedores.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteControlProveedores.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteControlProveedores.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteControlProveedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteControlProveedores=new JScrollPane(this.jListColumnasSelectReporteControlProveedores);
			
			this.jScrollColumnasSelectReporteControlProveedores.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteControlProveedores.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteControlProveedores.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoControlProveedores.add(this.jListColumnasSelectReporteControlProveedores, this.gridBagConstraintsControlProveedores);
		this.jPanelReporteDinamicoControlProveedores.add(this.jScrollColumnasSelectReporteControlProveedores, this.gridBagConstraintsControlProveedores);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteControlProveedores = new JLabelMe();

		this.jLabelRelacionesSelectReporteControlProveedores.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteControlProveedores = new JList<Reporte>();
		this.jListRelacionesSelectReporteControlProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteControlProveedores.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteControlProveedores.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteControlProveedores.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteControlProveedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteControlProveedores=new JScrollPane(this.jListRelacionesSelectReporteControlProveedores);
			
			this.jScrollRelacionesSelectReporteControlProveedores.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteControlProveedores.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteControlProveedores.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoControlProveedores = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoControlProveedores = new JComboBoxMe();
		this.jListColumnasValoresGraficoControlProveedores = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoControlProveedores = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoControlProveedores.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoControlProveedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoControlProveedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoControlProveedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoControlProveedores = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoControlProveedores.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoControlProveedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoControlProveedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoControlProveedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoControlProveedores = new JLabelMe();

		this.jLabelConGraficoDinamicoControlProveedores.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoControlProveedores.add(this.jLabelConGraficoDinamicoControlProveedores, this.gridBagConstraintsControlProveedores);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoControlProveedores = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoControlProveedores.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoControlProveedores.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoControlProveedores.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoControlProveedores.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoControlProveedores.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoControlProveedores.add(this.jCheckBoxConGraficoDinamicoControlProveedores, this.gridBagConstraintsControlProveedores);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoControlProveedores = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoControlProveedores.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoControlProveedores.add(this.jLabelColumnaCategoriaGraficoControlProveedores, this.gridBagConstraintsControlProveedores);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoControlProveedores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoControlProveedores.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoControlProveedores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoControlProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoControlProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoControlProveedores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoControlProveedores.add(this.jComboBoxColumnaCategoriaGraficoControlProveedores, this.gridBagConstraintsControlProveedores);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorControlProveedores = new JLabelMe();

		this.jLabelColumnaCategoriaValorControlProveedores.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoControlProveedores.add(this.jLabelColumnaCategoriaValorControlProveedores, this.gridBagConstraintsControlProveedores);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorControlProveedores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorControlProveedores.setText("Accion");
        this.jComboBoxColumnaCategoriaValorControlProveedores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorControlProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorControlProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorControlProveedores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoControlProveedores.add(this.jComboBoxColumnaCategoriaValorControlProveedores, this.gridBagConstraintsControlProveedores);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoControlProveedores = new JLabelMe();

		this.jLabelColumnasValoresGraficoControlProveedores.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoControlProveedores.add(this.jLabelColumnasValoresGraficoControlProveedores, this.gridBagConstraintsControlProveedores);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoControlProveedores = new JList<Reporte>();
		this.jListColumnasValoresGraficoControlProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoControlProveedores.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoControlProveedores.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoControlProveedores.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoControlProveedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoControlProveedores=new JScrollPane(this.jListColumnasValoresGraficoControlProveedores);
			
			this.jScrollColumnasValoresGraficoControlProveedores.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoControlProveedores.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoControlProveedores.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoControlProveedores.add(this.jListColumnasSelectReporteControlProveedores, this.gridBagConstraintsControlProveedores);
		this.jPanelReporteDinamicoControlProveedores.add(this.jScrollColumnasValoresGraficoControlProveedores, this.gridBagConstraintsControlProveedores);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoControlProveedores = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoControlProveedores.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoControlProveedores.add(this.jLabelTiposGraficosReportesDinamicoControlProveedores, this.gridBagConstraintsControlProveedores);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoControlProveedores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoControlProveedores.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoControlProveedores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoControlProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoControlProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoControlProveedores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoControlProveedores.add(this.jComboBoxTiposGraficosReportesDinamicoControlProveedores, this.gridBagConstraintsControlProveedores);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoControlProveedores = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoControlProveedores.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoControlProveedores.add(this.jLabelGenerarExcelReporteDinamicoControlProveedores, this.gridBagConstraintsControlProveedores);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoControlProveedores = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoControlProveedores.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoControlProveedores,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoControlProveedores.setToolTipText("Generar EXCEL"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoControlProveedores.add(this.jButtonGenerarExcelReporteDinamicoControlProveedores, this.gridBagConstraintsControlProveedores);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoControlProveedores.add(this.jComboBoxTiposReportesDinamicoControlProveedores, this.gridBagConstraintsControlProveedores);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoControlProveedores = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoControlProveedores.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoControlProveedores.add(this.jLabelTiposArchivoReporteDinamicoControlProveedores, this.gridBagConstraintsControlProveedores);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoControlProveedores.add(this.jComboBoxTiposArchivosReportesDinamicoControlProveedores, this.gridBagConstraintsControlProveedores);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoControlProveedores = new JButtonMe();
		this.jButtonGenerarReporteDinamicoControlProveedores.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoControlProveedores,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoControlProveedores.setToolTipText("Generar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoControlProveedores.add(this.jButtonGenerarReporteDinamicoControlProveedores, this.gridBagConstraintsControlProveedores);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoControlProveedores = new JButtonMe();
		this.jButtonCerrarReporteDinamicoControlProveedores.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoControlProveedores,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoControlProveedores.setToolTipText("Cancelar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsControlProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoControlProveedores.add(this.jButtonCerrarReporteDinamicoControlProveedores, this.gridBagConstraintsControlProveedores);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalControlProveedores = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoControlProveedores= new JScrollPane(jPanelReporteDinamicoControlProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoControlProveedores.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoControlProveedores.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoControlProveedores.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Control Proveedoreses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsControlProveedores.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoControlProveedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoControlProveedores.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalControlProveedores);
		this.jInternalFrameReporteDinamicoControlProveedores.getContentPane().add(this.jScrollPanelReporteDinamicoControlProveedores, this.gridBagConstraintsControlProveedores);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionControlProveedores() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionControlProveedores = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionControlProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionControlProveedores.setName("jPanelImportacionControlProveedores"); 
		
		this.jPanelImportacionControlProveedores.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionControlProveedores.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionControlProveedores.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionControlProveedores.setLayout(gridaBagLayoutImportacionControlProveedores);
		
		
		this.jInternalFrameImportacionControlProveedores= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionControlProveedores= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionControlProveedores = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteControlProveedores= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionControlProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionControlProveedores.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionControlProveedores.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionControlProveedores.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionControlProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionControlProveedores.setResizable(true);
	    this.jInternalFrameImportacionControlProveedores.setClosable(true);
	    this.jInternalFrameImportacionControlProveedores.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionControlProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionControlProveedores.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionControlProveedores.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionControlProveedores.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionControlProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionControlProveedores.setResizable(true);
	    this.jInternalFrameImportacionControlProveedores.setClosable(true);
	    this.jInternalFrameImportacionControlProveedores.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionControlProveedores.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionControlProveedores.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionControlProveedores.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Control Proveedoreses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionControlProveedores = new JLabelMe();

		this.jLabelArchivoImportacionControlProveedores.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYImportacion;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXImportacion++;
			
		this.jPanelImportacionControlProveedores.add(this.jLabelArchivoImportacionControlProveedores, this.gridBagConstraintsControlProveedores);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionControlProveedores = new JFileChooser();		
		this.jFileChooserImportacionControlProveedores.setToolTipText("ESCOGER ARCHIVO"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionControlProveedores = new JButtonMe();
		this.jButtonAbrirImportacionControlProveedores.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionControlProveedores,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionControlProveedores.setToolTipText("Generar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsControlProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionControlProveedores.add(this.jButtonAbrirImportacionControlProveedores, this.gridBagConstraintsControlProveedores);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionControlProveedores = new JLabelMe();

		this.jLabelPathArchivoImportacionControlProveedores.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYImportacion;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXImportacion++;
			
		this.jPanelImportacionControlProveedores.add(this.jLabelPathArchivoImportacionControlProveedores, this.gridBagConstraintsControlProveedores);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionControlProveedores=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionControlProveedores.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionControlProveedores.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionControlProveedores.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsControlProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionControlProveedores.add(this.jTextFieldPathArchivoImportacionControlProveedores, this.gridBagConstraintsControlProveedores);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionControlProveedores = new JButtonMe();
		this.jButtonGenerarImportacionControlProveedores.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionControlProveedores,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionControlProveedores.setToolTipText("Generar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsControlProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionControlProveedores.add(this.jButtonGenerarImportacionControlProveedores, this.gridBagConstraintsControlProveedores);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionControlProveedores = new JButtonMe();
		this.jButtonCerrarImportacionControlProveedores.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionControlProveedores,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionControlProveedores.setToolTipText("Cancelar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsControlProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionControlProveedores.add(this.jButtonCerrarImportacionControlProveedores, this.gridBagConstraintsControlProveedores);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalControlProveedores = new GridBagLayout();
		
		this.jScrollPanelImportacionControlProveedores= new JScrollPane(jPanelImportacionControlProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy =iPosYImportacion;
		this.gridBagConstraintsControlProveedores.gridx =iPosXImportacion;
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionControlProveedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionControlProveedores.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalControlProveedores);
		this.jInternalFrameImportacionControlProveedores.getContentPane().add(this.jScrollPanelImportacionControlProveedores, this.gridBagConstraintsControlProveedores);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByControlProveedores(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByControlProveedores = new JButtonMe();
			this.jButtonAbrirOrderByControlProveedores.setText("Orden");
			this.jButtonAbrirOrderByControlProveedores.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByControlProveedores,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByControlProveedores";
			inputMap = this.jButtonAbrirOrderByControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByControlProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByControlProveedores"));
		
		
			GridBagLayout gridaBagLayoutOrderByControlProveedores = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByControlProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByControlProveedores.setName("jPanelOrderByControlProveedores"); 
			
			this.jPanelOrderByControlProveedores.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByControlProveedores.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByControlProveedores.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByControlProveedores.setLayout(gridaBagLayoutOrderByControlProveedores);
			
			
			this.jTableDatosControlProveedoresOrderBy = new JTableMe();        
			this.jTableDatosControlProveedoresOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosControlProveedoresOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosControlProveedoresOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosControlProveedoresOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosControlProveedoresOrderBy.setViewportView(this.jTableDatosControlProveedoresOrderBy);
			this.jTableDatosControlProveedoresOrderBy.setFillsViewportHeight(true);
			this.jTableDatosControlProveedoresOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByControlProveedores= new OrderByJInternalFrame();
			this.jInternalFrameOrderByControlProveedores= new OrderByJInternalFrame();
			this.jScrollPanelOrderByControlProveedores = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteControlProveedores= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByControlProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByControlProveedores.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByControlProveedores.setTitle("Orden");
			this.jInternalFrameOrderByControlProveedores.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByControlProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByControlProveedores.setResizable(true);
			this.jInternalFrameOrderByControlProveedores.setClosable(true);
			this.jInternalFrameOrderByControlProveedores.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByControlProveedores.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByControlProveedores.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByControlProveedores.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Control Proveedoreses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.gridy =iPosYOrderBy++;
			this.gridBagConstraintsControlProveedores.gridx =iPosXOrderBy;
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsControlProveedores.ipady =150;
				
			this.jPanelOrderByControlProveedores.add(jScrollPanelDatosControlProveedoresOrderBy, this.gridBagConstraintsControlProveedores);//this.jTableDatosControlProveedoresTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByControlProveedores = new JButtonMe();
			this.jButtonCerrarOrderByControlProveedores.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByControlProveedores,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByControlProveedores.setToolTipText("Cancelar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.gridy = iPosYOrderBy++;
			this.gridBagConstraintsControlProveedores.gridx = iPosXOrderBy;
									
			this.jPanelOrderByControlProveedores.add(this.jButtonCerrarOrderByControlProveedores, this.gridBagConstraintsControlProveedores);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalControlProveedores = new GridBagLayout();
			
			this.jScrollPanelOrderByControlProveedores= new JScrollPane(jPanelOrderByControlProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.gridy =iPosYOrderBy;
			this.gridBagConstraintsControlProveedores.gridx =iPosXOrderBy;
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByControlProveedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByControlProveedores.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalControlProveedores);
			
			this.jInternalFrameOrderByControlProveedores.getContentPane().add(this.jScrollPanelOrderByControlProveedores, this.gridBagConstraintsControlProveedores);			
		
		} else {
			this.jButtonAbrirOrderByControlProveedores = new JButtonMe();
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
		int iWidthTableCalculado=0;//3530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.controlproveedoresSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosControlProveedores.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosControlProveedores.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosControlProveedores.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosControlProveedores.getRowHeight();//ControlProveedoresConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ControlProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaControlProveedores.isSelected()) {
					iHeightTable=ControlProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ControlProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ControlProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ControlProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaControlProveedores.isSelected()) {
					iHeightTable=ControlProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ControlProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ControlProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosControlProveedores.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosControlProveedores.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosControlProveedores.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosControlProveedores.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosControlProveedores.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosControlProveedores.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByControlProveedores!=null && this.jInternalFrameOrderByControlProveedores.getjTableDatosOrderBy()!=null) {
			//if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByControlProveedores.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByControlProveedores.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByControlProveedores.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByControlProveedores.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByControlProveedores.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByControlProveedores.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByControlProveedores.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosControlProveedores.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosControlProveedores.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosControlProveedores.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=controlproveedoresLogic.getControlProveedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=controlproveedoress.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ControlProveedores> TraerControlProveedoresBeans(List<ControlProveedores> controlproveedoress,ArrayList<Classe> classes)throws Exception {
		try {
			for(ControlProveedores controlproveedores:controlproveedoress) {
					
				if(!(ControlProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ControlProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					controlproveedores.setsDetalleGeneralEntityReporte(ControlProveedoresConstantesFunciones.getControlProveedoresDescripcion(controlproveedores));
										
						
					
						
					
				} else  {
							
					//controlproveedores.setsDetalleGeneralEntityReporte(controlproveedores.getsDetalleGeneralEntityReporte());
										
				}
				
				//controlproveedoresbeans.add(controlproveedoresbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return controlproveedoress;
    }
	//PARA REPORTES FIN
}
