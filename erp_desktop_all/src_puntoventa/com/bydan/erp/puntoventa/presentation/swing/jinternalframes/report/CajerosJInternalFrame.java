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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.CajerosConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class CajerosJInternalFrame extends CajerosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCajeros;
	
	protected JMenuBar jmenuBarCajeros;
	
	protected JMenu jmenuCajeros;
	protected JMenu jmenuDatosCajeros;
	protected JMenu jmenuArchivoCajeros;
	protected JMenu jmenuAccionesCajeros;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCajeros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajeros;	
	protected GridBagConstraints gridBagConstraintsCajeros;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CajerosDetalleFormJInternalFrame jInternalFrameDetalleFormCajeros;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCajeros;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCajeros;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";
	
	public CajerosSessionBean cajerosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public CajaSessionBean cajaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Cajeros> cajeross;		
	public List<Cajeros> cajerossEliminados;	
	public List<Cajeros> cajerossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCajeros;		
	protected JButton jButtonAbrirOrderByCajeros;
	
	
	//protected JPanel jPanelOrderByCajeros;
	//public JScrollPane jScrollPanelOrderByCajeros;	
	//protected JButton jButtonCerrarOrderByCajeros;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CajerosLogic cajerosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCajeros;
	public JScrollPane jScrollPanelDatosEdicionCajeros;
	public JScrollPane jScrollPanelDatosGeneralCajeros;
    
	
	
	//public JScrollPane jScrollPanelDatosCajerosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCajeros;
	//public JScrollPane jScrollPanelImportacionCajeros;
	
	
	
	protected JPanel jPanelAccionesCajeros;
	
    protected JPanel jPanelPaginacionCajeros;
    protected JPanel jPanelParametrosReportesCajeros;
	protected JPanel jPanelParametrosReportesAccionesCajeros;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Cajeros;
	protected JPanel jPanelParametrosAuxiliar2Cajeros;
	protected JPanel jPanelParametrosAuxiliar3Cajeros;
	protected JPanel jPanelParametrosAuxiliar4Cajeros;
	//protected JPanel jPanelParametrosAuxiliar5Cajeros;
	
	
	
	//protected JPanel jPanelReporteDinamicoCajeros;
	//protected JPanel jPanelImportacionCajeros;
	
	
	public JTable jTableDatosCajeros;
	
	
	
	//public JTable jTableDatosCajerosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCajeros;
	protected JButton jButtonDuplicarCajeros;
	protected JButton jButtonCopiarCajeros;
	protected JButton jButtonVerFormCajeros;
	protected JButton jButtonNuevoRelacionesCajeros;
	protected JButton jButtonModificarCajeros;
	
    protected JButton jButtonGuardarCambiosTablaCajeros;
	protected JButton jButtonCerrarCajeros;
	
	
	protected JButton jButtonRecargarInformacionCajeros;
	protected JButton jButtonProcesarInformacionCajeros;
	
	
	protected JButton jButtonAnterioresCajeros;
	protected JButton jButtonSiguientesCajeros;
	protected JButton jButtonNuevoGuardarCambiosCajeros;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCajeros;
	//protected JButton jButtonCerrarReporteDinamicoCajeros;
	//protected JButton jButtonGenerarExcelReporteDinamicoCajeros;	
	
	
	
	//protected JButton jButtonAbrirImportacionCajeros;
	//protected JButton jButtonGenerarImportacionCajeros;
	//protected JButton jButtonCerrarImportacionCajeros;
	//protected JFileChooser jFileChooserImportacionCajeros;
	//protected File fileImportacionCajeros;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajeros;
	protected JButton jButtonDuplicarToolBarCajeros;
	protected JButton jButtonNuevoRelacionesToolBarCajeros;
	
	
	public JButton jButtonGuardarCambiosToolBarCajeros;
	protected JButton jButtonCopiarToolBarCajeros;
	protected JButton jButtonVerFormToolBarCajeros;
	public JButton jButtonGuardarCambiosTablaToolBarCajeros;
	protected JButton jButtonMostrarOcultarTablaToolBarCajeros;
	protected JButton jButtonCerrarToolBarCajeros;
	
	protected JButton jButtonRecargarInformacionToolBarCajeros;
	protected JButton jButtonProcesarInformacionToolBarCajeros;
	protected JButton jButtonAnterioresToolBarCajeros;
	protected JButton jButtonSiguientesToolBarCajeros;
	protected JButton jButtonNuevoGuardarCambiosToolBarCajeros;
	protected JButton jButtonAbrirOrderByToolBarCajeros;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajeros;
	protected JMenuItem jMenuItemDuplicarCajeros;
	protected JMenuItem jMenuItemNuevoRelacionesCajeros;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCajeros;
	protected JMenuItem jMenuItemCopiarCajeros;
	protected JMenuItem jMenuItemVerFormCajeros;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajeros;
	protected JMenuItem jMenuItemCerrarCajeros;
	protected JMenuItem jMenuItemDetalleCerrarCajeros;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCajeros;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajeros;
	
	protected JMenuItem jMenuItemRecargarInformacionCajeros;
	protected JMenuItem jMenuItemProcesarInformacionCajeros;
	protected JMenuItem jMenuItemAnterioresCajeros;
	protected JMenuItem jMenuItemSiguientesCajeros;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajeros;
	protected JMenuItem jMenuItemAbrirOrderByCajeros;
	protected JMenuItem jMenuItemMostrarOcultarCajeros;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajeros;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCajeros;
	protected JCheckBox jCheckBoxSeleccionadosCajeros;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCajeros;
	protected JCheckBox jCheckBoxConGraficoReporteCajeros;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCajeros;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCajeros;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCajeros;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCajeros;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCajeros;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCajeros;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajeros;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajeros;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCajeros;
	protected JTextField jTextFieldValorCampoGeneralCajeros;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCajeros;
	//public JList<Reporte> jListColumnasSelectReporteCajeros;
	//public JScrollPane jScrollColumnasSelectReporteCajeros;
	
	//public JLabel jLabelRelacionesSelectReporteCajeros;
	//public JList<Reporte> jListRelacionesSelectReporteCajeros;
	//public JScrollPane jScrollRelacionesSelectReporteCajeros;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCajeros;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCajeros;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCajeros;
	//public JLabel jLabelTiposArchivoReporteDinamicoCajeros;
	
		
	//public JLabel jLabelArchivoImportacionCajeros;	
	//public JLabel jLabelPathArchivoImportacionCajeros;
	//protected JTextField jTextFieldPathArchivoImportacionCajeros;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCajeros;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCajeros;
	
	//public JLabel jLabelColumnaCategoriaValorCajeros;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCajeros;
	
	//public JLabel jLabelColumnasValoresGraficoCajeros;
	//public JList<Reporte> jListColumnasValoresGraficoCajeros;
	//public JScrollPane jScrollColumnasValoresGraficoCajeros;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCajeros;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCajeros;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCajeros;
	public JPanel jPanelBusquedaCajerosCajeros;
	public JButton jButtonBusquedaCajerosCajeros;
	
	public JPanel jPanelfecha_inicioBusquedaCajerosCajeros;
	public JLabel jLabelfecha_inicioBusquedaCajerosCajeros;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaCajerosCajeros;

	public JDateChooser jDateChooserfecha_inicioBusquedaCajerosCajeros;
	public JButton jButtonfecha_inicioBusquedaCajerosCajerosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_finBusquedaCajerosCajeros;
	public JLabel jLabelfecha_finBusquedaCajerosCajeros;
	//public JFormattedTextField jDateChooserfecha_finBusquedaCajerosCajeros;

	public JDateChooser jDateChooserfecha_finBusquedaCajerosCajeros;
	public JButton jButtonfecha_finBusquedaCajerosCajerosBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CajerosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Cajeros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajerosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cajeros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajerosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cajeros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajerosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Cajeros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCajeros)	{
		this.jButtonRecargarInformacionCajeros = jButtonRecargarInformacionCajeros;
	}
	
	public JButton getjButtonProcesarInformacionCajeros() {
		return this.jButtonProcesarInformacionCajeros;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajeros)	{
		this.jButtonProcesarInformacionCajeros = jButtonProcesarInformacionCajeros;
	}
	
	
	public JButton getjButtonRecargarInformacionCajeros() {
		return this.jButtonRecargarInformacionCajeros;
	}
	
	
	public List<Cajeros> getcajeross() {
		return this.cajeross;
	}

	public void setcajeross(List<Cajeros> cajeross) {
		this.cajeross = cajeross;
	}
	
	public List<Cajeros> getcajerossAux() {
		return this.cajerossAux;
	}

	public void setcajerossAux(List<Cajeros> cajerossAux) {
		this.cajerossAux = cajerossAux;
	}
	
	public List<Cajeros> getcajerossEliminados() {
		return this.cajerossEliminados;
	}

	public void setCajerossEliminados(List<Cajeros> cajerossEliminados) {
		this.cajerossEliminados = cajerossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCajeros() {
		return jComboBoxTiposSeleccionarCajeros;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCajeros(
			JComboBox jComboBoxTiposSeleccionarCajeros) {
		this.jComboBoxTiposSeleccionarCajeros = jComboBoxTiposSeleccionarCajeros;
	}
	
	public void setBorderResaltarTiposSeleccionarCajeros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCajeros.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCajeros .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCajeros() {
		return jTextFieldValorCampoGeneralCajeros;
	}

	public void setjTextFieldValorCampoGeneralCajeros(
			JTextField jTextFieldValorCampoGeneralCajeros) {
		this.jTextFieldValorCampoGeneralCajeros = jTextFieldValorCampoGeneralCajeros;
	}

	public void setBorderResaltarValorCampoGeneralCajeros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeros.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCajeros .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCajeros() {
		return this.jCheckBoxSeleccionarTodosCajeros;
	}

	public void setjCheckBoxSeleccionarTodosCajeros(
			JCheckBox jCheckBoxSeleccionarTodosCajeros) {
		this.jCheckBoxSeleccionarTodosCajeros = jCheckBoxSeleccionarTodosCajeros;
	}

	public void setBorderResaltarSeleccionarTodosCajeros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeros.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCajeros .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCajeros() {
		return this.jCheckBoxSeleccionadosCajeros;
	}

	public void setjCheckBoxSeleccionadosCajeros(
			JCheckBox jCheckBoxSeleccionadosCajeros) {
		this.jCheckBoxSeleccionadosCajeros = jCheckBoxSeleccionadosCajeros;
	}
	
	public void setBorderResaltarSeleccionadosCajeros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeros.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCajeros .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCajeros() {
		return this.jComboBoxTiposArchivosReportesCajeros;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCajeros(
			JComboBox jComboBoxTiposArchivosReportesCajeros) {
		this.jComboBoxTiposArchivosReportesCajeros = jComboBoxTiposArchivosReportesCajeros;
	}

	public void setBorderResaltarTiposArchivosReportesCajeros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeros.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCajeros .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCajeros() {
		return this.jComboBoxTiposReportesCajeros;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCajeros(
			JComboBox jComboBoxTiposReportesCajeros) {
		this.jComboBoxTiposReportesCajeros = jComboBoxTiposReportesCajeros;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCajeros() {
	//	return jComboBoxTiposReportesDinamicoCajeros;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCajeros(
	//		JComboBox jComboBoxTiposReportesDinamicoCajeros) {
	//	this.jComboBoxTiposReportesDinamicoCajeros = jComboBoxTiposReportesDinamicoCajeros;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCajeros() {
	//	return jComboBoxTiposArchivosReportesDinamicoCajeros;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCajeros(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCajeros) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCajeros = jComboBoxTiposArchivosReportesDinamicoCajeros;
	//}
	
	public void setBorderResaltarTiposReportesCajeros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeros.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCajeros .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCajeros() {
		return this.jComboBoxTiposGraficosReportesCajeros;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCajeros(
			JComboBox jComboBoxTiposGraficosReportesCajeros) {
		this.jComboBoxTiposGraficosReportesCajeros = jComboBoxTiposGraficosReportesCajeros;
	}
	
	public void setBorderResaltarTiposGraficosReportesCajeros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeros.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCajeros .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCajeros() {
		return this.jComboBoxTiposPaginacionCajeros;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCajeros(
			JComboBox jComboBoxTiposPaginacionCajeros) {
		this.jComboBoxTiposPaginacionCajeros = jComboBoxTiposPaginacionCajeros;
	}
	
	public void setBorderResaltarTiposPaginacionCajeros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeros.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCajeros .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCajeros() {
		return this.jComboBoxTiposRelacionesCajeros;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajeros() {
		return this.jComboBoxTiposAccionesCajeros;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajeros(
			JComboBox jComboBoxTiposRelacionesCajeros) {
		this.jComboBoxTiposRelacionesCajeros = jComboBoxTiposRelacionesCajeros;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajeros(
			JComboBox jComboBoxTiposAccionesCajeros) {
		this.jComboBoxTiposAccionesCajeros = jComboBoxTiposAccionesCajeros;
	}
	
	public void setBorderResaltarTiposRelacionesCajeros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeros.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCajeros .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCajeros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajeros.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCajeros .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCajeros() {
	//	return jCheckBoxConGraficoDinamicoCajeros;
	//}

	//public void setjCheckBoxConGraficoDinamicoCajeros(
	//		JCheckBox jCheckBoxConGraficoDinamicoCajeros) {
	//	this.jCheckBoxConGraficoDinamicoCajeros = jCheckBoxConGraficoDinamicoCajeros;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCajeros() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCajeros.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCajeros .setBorder(borderResaltar);		
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
		this.cajerosSessionBean=new CajerosSessionBean();
		
		this.cajerosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajerosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajerosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CajerosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CajerosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajerosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajerosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajerosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cajeros MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {
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
		
		CajerosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Cajeros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCajeros= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCajeros,this.jTtoolBarCajeros,
							"nuevo","nuevo","Nuevo"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCajeros,this.jTtoolBarCajeros,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCajeros,this.jTtoolBarCajeros,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCajeros,this.jTtoolBarCajeros,
							"duplicar","duplicar","Duplicar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCajeros,this.jTtoolBarCajeros,
							"copiar","copiar","Copiar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCajeros,this.jTtoolBarCajeros,
							"ver_form","ver_form","Ver"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajeros,this.jTtoolBarCajeros,
							"recargar","recargar","Buscar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajeros,this.jTtoolBarCajeros,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajeros,this.jTtoolBarCajeros,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCajeros,this.jTtoolBarCajeros,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCajeros,this.jTtoolBarCajeros,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCajeros,this.jTtoolBarCajeros,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCajeros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCajeros,this.jTtoolBarCajeros,
							"cerrar","cerrar","Salir"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCajeros=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCajeros;
			
				this.jButtonProcesarInformacionToolBarCajeros=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCajeros;
				
		//protected JButton jButtonModificarToolBarCajeros;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCajeros=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCajeros=new JMenuMe("General");
		this.jmenuArchivoCajeros=new JMenuMe("Archivo");
		this.jmenuAccionesCajeros=new JMenuMe("Acciones");
		this.jmenuDatosCajeros=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajeros= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajeros.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajeros,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCajeros= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCajeros.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCajeros,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCajeros= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCajeros.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCajeros,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCajeros= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajeros.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajeros,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCajeros= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCajeros.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCajeros,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCajeros= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCajeros.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCajeros,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCajeros= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCajeros.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCajeros,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajeros= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajeros.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajeros,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCajeros= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCajeros.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCajeros,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCajeros= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCajeros.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCajeros,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCajeros= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCajeros.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCajeros,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCajeros= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCajeros.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCajeros,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCajeros= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCajeros.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCajeros,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajeros= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajeros.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajeros,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCajeros= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCajeros.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCajeros,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajeros= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajeros.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajeros,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCajeros= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCajeros.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCajeros,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCajeros.add(this.jMenuItemCerrarCajeros);
			
			this.jmenuAccionesCajeros.add(this.jMenuItemNuevoCajeros);
			this.jmenuAccionesCajeros.add(this.jMenuItemNuevoGuardarCambiosCajeros);
			this.jmenuAccionesCajeros.add(this.jMenuItemNuevoRelacionesCajeros);
			this.jmenuAccionesCajeros.add(this.jMenuItemGuardarCambiosTablaCajeros);		
			this.jmenuAccionesCajeros.add(this.jMenuItemDuplicarCajeros);		
			this.jmenuAccionesCajeros.add(this.jMenuItemCopiarCajeros);		
			this.jmenuAccionesCajeros.add(this.jMenuItemVerFormCajeros);		
			
			this.jmenuDatosCajeros.add(this.jMenuItemRecargarInformacionCajeros);				
			this.jmenuDatosCajeros.add(this.jMenuItemAnterioresCajeros);				
			this.jmenuDatosCajeros.add(this.jMenuItemSiguientesCajeros);				
			this.jmenuDatosCajeros.add(this.jMenuItemAbrirOrderByCajeros);				
			this.jmenuDatosCajeros.add(this.jMenuItemMostrarOcultarCajeros);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCajeros.add(this.jMenuItemGuardarCambiosCajeros);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCajeros.add(this.jmenuArchivoCajeros);		
			this.jmenuBarCajeros.add(this.jmenuAccionesCajeros);		
			this.jmenuBarCajeros.add(this.jmenuDatosCajeros);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCajeros);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCajeros() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCajerosCajeros=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCajerosCajeros.setToolTipText("Buscar Por Fecha Inicio Por Fecha Fin ");
		this.jButtonBusquedaCajerosCajeros= new JButtonMe();
		this.jButtonBusquedaCajerosCajeros.setText("Buscar");
		this.jButtonBusquedaCajerosCajeros.setToolTipText("Buscar Por Fecha Inicio Por Fecha Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCajerosCajeros,"buscar_button","Buscar Por Fecha Inicio Por Fecha Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCajerosCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_inicioBusquedaCajerosCajeros = new JLabelMe();
		jLabelfecha_inicioBusquedaCajerosCajeros.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaCajerosCajeros.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaCajerosCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaCajerosCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaCajerosCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaCajerosCajeros,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaCajerosCajeros= new JDateChooser();
		jDateChooserfecha_inicioBusquedaCajerosCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaCajerosCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaCajerosCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaCajerosCajeros,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaCajerosCajeros.setDate(new Date());
		jDateChooserfecha_inicioBusquedaCajerosCajeros.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaCajerosCajeros.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_finBusquedaCajerosCajeros = new JLabelMe();
		jLabelfecha_finBusquedaCajerosCajeros.setText("Fecha Fin :");
		jLabelfecha_finBusquedaCajerosCajeros.setToolTipText("Fecha Fin");
		jLabelfecha_finBusquedaCajerosCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaCajerosCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaCajerosCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_finBusquedaCajerosCajeros,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_finBusquedaCajerosCajeros= new JDateChooser();
		jDateChooserfecha_finBusquedaCajerosCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaCajerosCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaCajerosCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finBusquedaCajerosCajeros,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_finBusquedaCajerosCajeros.setDate(new Date());
		jDateChooserfecha_finBusquedaCajerosCajeros.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_finBusquedaCajerosCajeros.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasCajeros=new JTabbedPane();


		this.jTabbedPaneBusquedasCajeros.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCajeros.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCajeros.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCajeros.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCajeros,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCajeros = new CajerosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cajeros DATOS");
			this.jInternalFrameDetalleFormCajeros = new CajerosDetalleFormJInternalFrame(jDesktopPane,this.cajerosSessionBean.getConGuardarRelaciones(),this.cajerosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCajeros = null;//new CajerosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajeros= new GridBagLayout();
		
		
		this.jTableDatosCajeros = new JTableMe();      
		
		String sToolTipCajeros="";
		sToolTipCajeros=CajerosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajeros+="(PuntoVenta.Cajeros)";
		}
		
		if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajeros+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCajeros.setToolTipText(sToolTipCajeros);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCajeros);
		this.jTableDatosCajeros.setAutoCreateRowSorter(true);
		this.jTableDatosCajeros.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCajeros.setRowSelectionAllowed(true);
		this.jTableDatosCajeros.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCajeros,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCajeros = new JButtonMe();
		this.jButtonDuplicarCajeros = new JButtonMe();
		this.jButtonCopiarCajeros = new JButtonMe();
		this.jButtonVerFormCajeros = new JButtonMe();
		this.jButtonNuevoRelacionesCajeros = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCajeros = new JButtonMe();
		this.jButtonCerrarCajeros = new JButtonMe();
		
		this.jScrollPanelDatosCajeros = new JScrollPane();   
        this.jScrollPanelDatosGeneralCajeros = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCajeros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cajeros";
		
		if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajeroses" + this.sPath));
		} else {
			this.jScrollPanelDatosCajeros.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajeros.setToolTipText("Acciones");
        this.jPanelAccionesCajeros.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajeros, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajeros, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCajeros=new ReporteDinamicoJInternalFrame(CajerosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCajeros();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCajeros=new ImportacionJInternalFrame(CajerosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCajeros();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCajeros = new JButtonMe();
		
		this.jButtonAbrirOrderByCajeros.setText("Orden");
		this.jButtonAbrirOrderByCajeros.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajeros,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCajeros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajeros=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajeros,false,this);
			
			//this.cargarOrderByCajeros(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajeros=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajeros,true,this);
			
			//this.cargarOrderByCajeros(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCajeros.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosCajeros.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosCajeros.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosCajeros.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajeros.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajeros.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCajeros.setText("Nuevo");
		this.jButtonDuplicarCajeros.setText("Duplicar");
		this.jButtonCopiarCajeros.setText("Copiar");
		this.jButtonVerFormCajeros.setText("Ver");
		this.jButtonNuevoRelacionesCajeros.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCajeros.setText("Guardar");
		this.jButtonCerrarCajeros.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajeros,"nuevo_button","Nuevo",this.cajerosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCajeros,"duplicar_button","Duplicar",this.cajerosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCajeros,"copiar_button","Copiar",this.cajerosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCajeros,"ver_form","Ver",this.cajerosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCajeros,"nuevorelaciones_button","Nuevo Rel",this.cajerosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajeros,"guardarcambiostabla_button","Guardar",this.cajerosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajeros,"cerrar_button","Salir",this.cajerosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCajeros, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCajeros.setToolTipText("Nuevo"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCajeros.setToolTipText("Duplicar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCajeros.setToolTipText("Copiar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCajeros.setToolTipText("Ver"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCajeros.setToolTipText("Nuevo Rel"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCajeros.setToolTipText("Guardar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajeros.setToolTipText("Salir"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajeros";
		inputMap = this.jButtonNuevoCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajeros.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajeros"));
		
		//DUPLICAR
		sMapKey = "DuplicarCajeros";
		inputMap = this.jButtonDuplicarCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCajeros.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCajeros"));
		
		//COPIAR
		sMapKey = "CopiarCajeros";
		inputMap = this.jButtonCopiarCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCajeros.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCajeros"));
		
		//VEr FORM
		sMapKey = "VerFormCajeros";
		inputMap = this.jButtonVerFormCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCajeros.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCajeros"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCajeros";
		inputMap = this.jButtonNuevoRelacionesCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCajeros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCajeros"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCajeros";
		inputMap = this.jButtonModificarCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCajeros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCajeros"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCajeros";
		inputMap = this.jButtonCerrarCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajeros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajeros"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajeros";
		inputMap = this.jButtonGuardarCambiosTablaCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajeros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajeros"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCajeros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCajeros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCajeros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Cajeros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Cajeros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Cajeros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Cajeros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Cajeros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCajeros.setName("jPanelParametrosReportesCajeros"); 
		
		this.jPanelParametrosReportesAccionesCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCajeros.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCajeros.setName("jPanelParametrosReportesAccionesCajeros"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCajeros, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCajeros, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCajeros = new JButtonMe();
		this.jButtonRecargarInformacionCajeros.setText("Buscar");
		this.jButtonRecargarInformacionCajeros.setToolTipText("Buscar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCajeros,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCajeros.setVisible(false);
		
		
		this.jButtonProcesarInformacionCajeros = new JButtonMe();
		this.jButtonProcesarInformacionCajeros.setText("Procesar");
		this.jButtonProcesarInformacionCajeros.setToolTipText("Procesar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCajeros.setVisible(false);
			
		this.jButtonProcesarInformacionCajeros.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajeros.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajeros.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCajeros = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajeros.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCajeros.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCajeros = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajeros.setText("TIPO");       
		this.jComboBoxTiposReportesCajeros.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCajeros = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajeros.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCajeros.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCajeros = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCajeros.setText("Paginacion");
		this.jComboBoxTiposPaginacionCajeros.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCajeros = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCajeros.setText("Accion");
		this.jComboBoxTiposRelacionesCajeros.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCajeros = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajeros.setText("Accion");
		this.jComboBoxTiposAccionesCajeros.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCajeros = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCajeros.setText("Accion");
		this.jComboBoxTiposSeleccionarCajeros.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCajeros=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCajeros.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajeros.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajeros.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCajeros = new JLabelMe();
		
		this.jLabelAccionesCajeros.setText("Acciones");		
		this.jLabelAccionesCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCajeros = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCajeros.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCajeros.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCajeros = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCajeros.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCajeros.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCajeros = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCajeros.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCajeros.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCajeros = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCajeros.setText("Graf.");
		this.jCheckBoxConGraficoReporteCajeros.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCajeros = new JButtonMe();
		//this.jButtonAnterioresCajeros.setText("<<");
        this.jButtonAnterioresCajeros.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCajeros,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCajeros = new JButtonMe();
		//this.jButtonSiguientesCajeros.setText(">>");
        this.jButtonSiguientesCajeros.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCajeros,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCajeros = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCajeros.setText("Nue");
        this.jButtonNuevoGuardarCambiosCajeros.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCajeros,"nuevoguardarcambios_button","Nue",this.cajerosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCajeros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCajeros";
		inputMap = this.jButtonNuevoGuardarCambiosCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCajeros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCajeros"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCajeros";
		inputMap = this.jButtonRecargarInformacionCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCajeros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCajeros"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCajeros";
		inputMap = this.jButtonSiguientesCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCajeros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCajeros"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCajeros";
		inputMap = this.jButtonAnterioresCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCajeros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCajeros"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCajeros();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCajeros.setMinimumSize(new Dimension(this.getWidth(),CajerosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajerosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajeros.setMaximumSize(new Dimension(this.getWidth(),CajerosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajerosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajeros.setPreferredSize(new Dimension(this.getWidth(),CajerosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajerosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCajeros = new GridBagLayout();

			this.jPanelPaginacionCajeros.setLayout(gridaBagLayoutPaginacionCajeros);						
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy = 0;
			this.gridBagConstraintsCajeros.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCajeros.add(this.jButtonAnterioresCajeros, this.gridBagConstraintsCajeros);
					
						
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajeros.gridy = 0;
			
			this.jPanelPaginacionCajeros.add(this.jButtonNuevoGuardarCambiosCajeros, this.gridBagConstraintsCajeros);
						
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCajeros.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajeros.gridy = 0;
			this.jPanelPaginacionCajeros.add(this.jButtonSiguientesCajeros, this.gridBagConstraintsCajeros);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy = 1;
			this.gridBagConstraintsCajeros.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajeros.add(this.jButtonNuevoCajeros, this.gridBagConstraintsCajeros);
						
			
			
			if(!this.cajerosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCajeros = new GridBagConstraints();
				this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCajeros.gridy = 1;
				this.gridBagConstraintsCajeros.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCajeros.add(this.jButtonGuardarCambiosTablaCajeros, this.gridBagConstraintsCajeros);
			}
			
			
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy = 1;
			this.gridBagConstraintsCajeros.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajeros.add(this.jButtonDuplicarCajeros, this.gridBagConstraintsCajeros);
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy = 1;
			this.gridBagConstraintsCajeros.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajeros.add(this.jButtonCopiarCajeros, this.gridBagConstraintsCajeros);
		
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy = 1;
			this.gridBagConstraintsCajeros.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajeros.add(this.jButtonVerFormCajeros, this.gridBagConstraintsCajeros);
		
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy = 1;
			this.gridBagConstraintsCajeros.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCajeros.add(this.jButtonCerrarCajeros, this.gridBagConstraintsCajeros);
		
		
		
		this.jButtonRecargarInformacionCajeros.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajeros.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajeros.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCajeros, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCajeros.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajeros.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajeros.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCajeros.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajeros.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajeros.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCajeros.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajeros.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajeros.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCajeros.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajeros.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajeros.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCajeros.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajeros.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajeros.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCajeros.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajeros.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajeros.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCajeros.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajeros.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajeros.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCajeros.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajeros.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajeros.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCajeros.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajeros.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajeros.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCajeros, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCajeros.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajeros.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajeros.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCajeros.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajeros.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajeros.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCajeros = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCajeros = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Cajeros = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Cajeros = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Cajeros = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Cajeros = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCajeros.setLayout(gridaBagParametrosReportesCajeros);
			this.jPanelParametrosReportesAccionesCajeros.setLayout(gridaBagParametrosReportesAccionesCajeros);
			
			
			this.jPanelParametrosAuxiliar1Cajeros.setLayout(gridaBagParametrosAuxiliar1Cajeros);
			this.jPanelParametrosAuxiliar2Cajeros.setLayout(gridaBagParametrosAuxiliar2Cajeros);
			this.jPanelParametrosAuxiliar3Cajeros.setLayout(gridaBagParametrosAuxiliar3Cajeros);
			this.jPanelParametrosAuxiliar4Cajeros.setLayout(gridaBagParametrosAuxiliar4Cajeros);
			//this.jPanelParametrosAuxiliar5Cajeros.setLayout(gridaBagParametrosAuxiliar2Cajeros);			
			
			
			
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajeros.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajeros.add(this.jButtonRecargarInformacionCajeros, this.gridBagConstraintsCajeros);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeros.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajeros.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cajeros.add(this.jComboBoxTiposPaginacionCajeros, this.gridBagConstraintsCajeros);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeros.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajeros.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cajeros.add(this.jCheckBoxConAltoMaximoTablaCajeros, this.gridBagConstraintsCajeros);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeros.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajeros.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cajeros.add(this.jComboBoxTiposArchivosReportesCajeros, this.gridBagConstraintsCajeros);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajeros.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajeros.add(this.jPanelParametrosAuxiliar1Cajeros, this.gridBagConstraintsCajeros);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajeros.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Cajeros.add(this.jComboBoxTiposReportesCajeros, this.gridBagConstraintsCajeros);																		
			
			
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajeros.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Cajeros.add(this.jComboBoxTiposGraficosReportesCajeros, this.gridBagConstraintsCajeros);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajeros.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajeros.add(this.jPanelParametrosAuxiliar4Cajeros, this.gridBagConstraintsCajeros);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeros.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajeros.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajeros.add(this.jComboBoxTiposReportesCajeros, this.gridBagConstraintsCajeros);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajeros.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajeros.add(this.jCheckBoxGenerarReporteCajeros, this.gridBagConstraintsCajeros);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajeros.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajeros.add(this.jPanelParametrosAuxiliar2Cajeros, this.gridBagConstraintsCajeros);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajeros.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajeros.add(this.jLabelAccionesCajeros, this.gridBagConstraintsCajeros);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCajeros = new GridBagConstraints();
				this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCajeros.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCajeros.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCajeros.add(this.jButtonAbrirOrderByCajeros, this.gridBagConstraintsCajeros);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCajeros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajeros.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajeros.add(this.jComboBoxTiposSeleccionarCajeros, this.gridBagConstraintsCajeros);			
			
			
			/*
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajeros.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajeros.add(this.jCheckBoxSeleccionarTodosCajeros, this.gridBagConstraintsCajeros);
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajeros.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajeros.add(this.jCheckBoxConGraficoReporteCajeros, this.gridBagConstraintsCajeros);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajeros.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Cajeros.add(this.jCheckBoxSeleccionarTodosCajeros, this.gridBagConstraintsCajeros);															
				
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajeros.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Cajeros.add(this.jCheckBoxSeleccionadosCajeros, this.gridBagConstraintsCajeros);															
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajeros.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Cajeros.add(this.jCheckBoxConGraficoReporteCajeros, this.gridBagConstraintsCajeros);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajeros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajeros.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajeros.add(this.jPanelParametrosAuxiliar3Cajeros, this.gridBagConstraintsCajeros);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajeros.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajeros.add(this.jComboBoxTiposAccionesCajeros, this.gridBagConstraintsCajeros);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCajeros = new GridBagLayout();

			this.jScrollPanelDatosCajeros.setLayout(gridaBagLayoutDatosCajeros);
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy = 0;
			this.gridBagConstraintsCajeros.gridx = 0;
			
			this.jScrollPanelDatosCajeros.add(this.jTableDatosCajeros, this.gridBagConstraintsCajeros);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCajeros.setViewportView(this.jTableDatosCajeros);
		this.jTableDatosCajeros.setFillsViewportHeight(true);
		this.jTableDatosCajeros.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCajeros= new GridBagLayout();
		this.jPanelAccionesCajeros.setLayout(gridaBagLayoutAccionesCajeros);
		
		
		/*	
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeros.gridy = 0;
		this.gridBagConstraintsCajeros.gridx = 0;
			
		this.jPanelAccionesCajeros.add(this.jButtonNuevoCajeros, this.gridBagConstraintsCajeros);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCajerosCajeros= new GridBagLayout();
		gridaBagLayoutBusquedaCajerosCajeros.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCajerosCajeros.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCajerosCajeros.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCajerosCajeros.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCajerosCajeros.setLayout(gridaBagLayoutBusquedaCajerosCajeros);

		gridBagConstraintsCajeros = new GridBagConstraints();
		gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeros.gridy = 0;
		gridBagConstraintsCajeros.gridx = 0;
		jPanelBusquedaCajerosCajeros.add(jLabelfecha_inicioBusquedaCajerosCajeros, gridBagConstraintsCajeros);

		gridBagConstraintsCajeros = new GridBagConstraints();
		gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeros.gridy = 0;
		gridBagConstraintsCajeros.gridx = 1;
		jPanelBusquedaCajerosCajeros.add(jDateChooserfecha_inicioBusquedaCajerosCajeros, gridBagConstraintsCajeros);


		gridBagConstraintsCajeros = new GridBagConstraints();
		gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeros.gridy = 1;
		gridBagConstraintsCajeros.gridx = 0;
		jPanelBusquedaCajerosCajeros.add(jLabelfecha_finBusquedaCajerosCajeros, gridBagConstraintsCajeros);

		gridBagConstraintsCajeros = new GridBagConstraints();
		gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeros.gridy = 1;
		gridBagConstraintsCajeros.gridx = 1;
		jPanelBusquedaCajerosCajeros.add(jDateChooserfecha_finBusquedaCajerosCajeros, gridBagConstraintsCajeros);

		gridBagConstraintsCajeros = new GridBagConstraints();
		gridBagConstraintsCajeros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajeros.gridy = 2;
		gridBagConstraintsCajeros.gridx =1;
		jPanelBusquedaCajerosCajeros.add(jButtonBusquedaCajerosCajeros, gridBagConstraintsCajeros);

		jTabbedPaneBusquedasCajeros.addTab("1.-Por Fecha Inicio Por Fecha Fin ", jPanelBusquedaCajerosCajeros);
		jTabbedPaneBusquedasCajeros.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajeros = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajeros);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajerosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajeros = new GridBagConstraints();						
			this.gridBagConstraintsCajeros.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajeros.gridx = 0;		
			//this.gridBagConstraintsCajeros.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajeros.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCajeros, this.gridBagConstraintsCajeros);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCajeros.gridx = 0;		
		//this.gridBagConstraintsCajeros.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeros.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCajeros.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCajeros);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCajeros.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajeros.gridx = 0;		
			this.gridBagConstraintsCajeros.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCajeros.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCajeros, this.gridBagConstraintsCajeros);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajeros.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCajeros, this.gridBagConstraintsCajeros);								
		
		
		/*
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajeros.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCajeros, this.gridBagConstraintsCajeros);
		*/		
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajeros.gridx =0;
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajeros.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajeros, this.gridBagConstraintsCajeros);
				
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajeros.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCajeros, this.gridBagConstraintsCajeros);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CajerosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCajeros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajeros = new GridBagLayout();
			this.jPanelBusquedasParametrosCajeros.setLayout(gridaBagLayoutBusquedasParametrosCajeros);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCajeros=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajeros.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajeros.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajeros.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajeros.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajeros, this.gridBagConstraintsCajeros);
			
			
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajeros.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajeros, this.gridBagConstraintsCajeros);
		
			
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajeros.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajeros, this.gridBagConstraintsCajeros);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCajeros;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCajeros() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCajeros = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCajeros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCajeros.setName("jPanelReporteDinamicoCajeros"); 
		
		this.jPanelReporteDinamicoCajeros.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajeros.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajeros.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCajeros.setLayout(gridaBagLayoutReporteDinamicoCajeros);
		
		
		this.jInternalFrameReporteDinamicoCajeros= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCajeros = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajeros= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCajeros.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCajeros.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCajeros.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCajeros.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCajeros.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCajeros.setResizable(true);
	    this.jInternalFrameReporteDinamicoCajeros.setClosable(true);
	    this.jInternalFrameReporteDinamicoCajeros.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCajeros.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajeros.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajeros.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajeroses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCajeros = new JLabelMe();

		this.jLabelColumnasSelectReporteCajeros.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajeros.add(this.jLabelColumnasSelectReporteCajeros, this.gridBagConstraintsCajeros);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCajeros = new JList<Reporte>();
		this.jListColumnasSelectReporteCajeros.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCajeros.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCajeros.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajeros.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajeros.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCajeros=new JScrollPane(this.jListColumnasSelectReporteCajeros);
			
			this.jScrollColumnasSelectReporteCajeros.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajeros.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajeros.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCajeros.add(this.jListColumnasSelectReporteCajeros, this.gridBagConstraintsCajeros);
		this.jPanelReporteDinamicoCajeros.add(this.jScrollColumnasSelectReporteCajeros, this.gridBagConstraintsCajeros);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCajeros = new JLabelMe();

		this.jLabelRelacionesSelectReporteCajeros.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCajeros = new JList<Reporte>();
		this.jListRelacionesSelectReporteCajeros.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCajeros.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCajeros.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajeros.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajeros.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCajeros=new JScrollPane(this.jListRelacionesSelectReporteCajeros);
			
			this.jScrollRelacionesSelectReporteCajeros.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajeros.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajeros.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCajeros = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCajeros = new JComboBoxMe();
		this.jListColumnasValoresGraficoCajeros = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCajeros = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCajeros.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCajeros.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajeros.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajeros.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCajeros = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCajeros.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCajeros.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajeros.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajeros.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCajeros = new JLabelMe();

		this.jLabelConGraficoDinamicoCajeros.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajeros.add(this.jLabelConGraficoDinamicoCajeros, this.gridBagConstraintsCajeros);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCajeros = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCajeros.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCajeros.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCajeros.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCajeros.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCajeros.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajeros.add(this.jCheckBoxConGraficoDinamicoCajeros, this.gridBagConstraintsCajeros);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCajeros = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCajeros.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajeros.add(this.jLabelColumnaCategoriaGraficoCajeros, this.gridBagConstraintsCajeros);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCajeros = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCajeros.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCajeros.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCajeros.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCajeros.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCajeros.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCajeros.add(this.jComboBoxColumnaCategoriaGraficoCajeros, this.gridBagConstraintsCajeros);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCajeros = new JLabelMe();

		this.jLabelColumnaCategoriaValorCajeros.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajeros.add(this.jLabelColumnaCategoriaValorCajeros, this.gridBagConstraintsCajeros);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCajeros = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCajeros.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCajeros.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCajeros.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCajeros.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCajeros.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCajeros.add(this.jComboBoxColumnaCategoriaValorCajeros, this.gridBagConstraintsCajeros);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCajeros = new JLabelMe();

		this.jLabelColumnasValoresGraficoCajeros.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajeros.add(this.jLabelColumnasValoresGraficoCajeros, this.gridBagConstraintsCajeros);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCajeros = new JList<Reporte>();
		this.jListColumnasValoresGraficoCajeros.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCajeros.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCajeros.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCajeros.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCajeros.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCajeros=new JScrollPane(this.jListColumnasValoresGraficoCajeros);
			
			this.jScrollColumnasValoresGraficoCajeros.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCajeros.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCajeros.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCajeros.add(this.jListColumnasSelectReporteCajeros, this.gridBagConstraintsCajeros);
		this.jPanelReporteDinamicoCajeros.add(this.jScrollColumnasValoresGraficoCajeros, this.gridBagConstraintsCajeros);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCajeros = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCajeros.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajeros.add(this.jLabelTiposGraficosReportesDinamicoCajeros, this.gridBagConstraintsCajeros);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCajeros = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCajeros.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCajeros.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCajeros.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCajeros.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCajeros.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajeros.add(this.jComboBoxTiposGraficosReportesDinamicoCajeros, this.gridBagConstraintsCajeros);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCajeros = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCajeros.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajeros.add(this.jLabelGenerarExcelReporteDinamicoCajeros, this.gridBagConstraintsCajeros);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCajeros = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCajeros.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCajeros,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCajeros.setToolTipText("Generar EXCEL"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCajeros = new GridBagConstraints();
		//this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCajeros.add(this.jButtonGenerarExcelReporteDinamicoCajeros, this.gridBagConstraintsCajeros);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajeros.add(this.jComboBoxTiposReportesDinamicoCajeros, this.gridBagConstraintsCajeros);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCajeros = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCajeros.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajeros.add(this.jLabelTiposArchivoReporteDinamicoCajeros, this.gridBagConstraintsCajeros);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajeros.add(this.jComboBoxTiposArchivosReportesDinamicoCajeros, this.gridBagConstraintsCajeros);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCajeros = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCajeros.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCajeros,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCajeros.setToolTipText("Generar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajeros.add(this.jButtonGenerarReporteDinamicoCajeros, this.gridBagConstraintsCajeros);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCajeros = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCajeros.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCajeros,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCajeros.setToolTipText("Cancelar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeros.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajeros.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajeros.add(this.jButtonCerrarReporteDinamicoCajeros, this.gridBagConstraintsCajeros);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCajeros = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCajeros= new JScrollPane(jPanelReporteDinamicoCajeros,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCajeros.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajeros.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajeros.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajeroses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCajeros.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCajeros.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCajeros.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCajeros);
		this.jInternalFrameReporteDinamicoCajeros.getContentPane().add(this.jScrollPanelReporteDinamicoCajeros, this.gridBagConstraintsCajeros);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCajeros() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCajeros = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCajeros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCajeros.setName("jPanelImportacionCajeros"); 
		
		this.jPanelImportacionCajeros.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajeros.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajeros.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCajeros.setLayout(gridaBagLayoutImportacionCajeros);
		
		
		this.jInternalFrameImportacionCajeros= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCajeros= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCajeros = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajeros= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCajeros.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajeros.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajeros.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCajeros.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajeros.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajeros.setResizable(true);
	    this.jInternalFrameImportacionCajeros.setClosable(true);
	    this.jInternalFrameImportacionCajeros.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCajeros.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajeros.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajeros.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCajeros.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajeros.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajeros.setResizable(true);
	    this.jInternalFrameImportacionCajeros.setClosable(true);
	    this.jInternalFrameImportacionCajeros.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCajeros.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajeros.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajeros.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajeroses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCajeros = new JLabelMe();

		this.jLabelArchivoImportacionCajeros.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajeros.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajeros.add(this.jLabelArchivoImportacionCajeros, this.gridBagConstraintsCajeros);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCajeros = new JFileChooser();		
		this.jFileChooserImportacionCajeros.setToolTipText("ESCOGER ARCHIVO"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCajeros = new JButtonMe();
		this.jButtonAbrirImportacionCajeros.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCajeros,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCajeros.setToolTipText("Generar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeros.gridy = iPosYImportacion;
		this.gridBagConstraintsCajeros.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajeros.add(this.jButtonAbrirImportacionCajeros, this.gridBagConstraintsCajeros);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCajeros = new JLabelMe();

		this.jLabelPathArchivoImportacionCajeros.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCajeros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajeros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajeros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeros.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajeros.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajeros.add(this.jLabelPathArchivoImportacionCajeros, this.gridBagConstraintsCajeros);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCajeros=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCajeros.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajeros.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajeros.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeros.gridy = iPosYImportacion;
		this.gridBagConstraintsCajeros.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajeros.add(this.jTextFieldPathArchivoImportacionCajeros, this.gridBagConstraintsCajeros);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCajeros = new JButtonMe();
		this.jButtonGenerarImportacionCajeros.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCajeros,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCajeros.setToolTipText("Generar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeros.gridy = iPosYImportacion;
		this.gridBagConstraintsCajeros.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajeros.add(this.jButtonGenerarImportacionCajeros, this.gridBagConstraintsCajeros);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCajeros = new JButtonMe();
		this.jButtonCerrarImportacionCajeros.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCajeros,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCajeros.setToolTipText("Cancelar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeros.gridy = iPosYImportacion;
		this.gridBagConstraintsCajeros.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajeros.add(this.jButtonCerrarImportacionCajeros, this.gridBagConstraintsCajeros);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCajeros = new GridBagLayout();
		
		this.jScrollPanelImportacionCajeros= new JScrollPane(jPanelImportacionCajeros,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCajeros = new GridBagConstraints();
		this.gridBagConstraintsCajeros.gridy =iPosYImportacion;
		this.gridBagConstraintsCajeros.gridx =iPosXImportacion;
		this.gridBagConstraintsCajeros.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCajeros.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCajeros.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCajeros);
		this.jInternalFrameImportacionCajeros.getContentPane().add(this.jScrollPanelImportacionCajeros, this.gridBagConstraintsCajeros);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCajeros(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCajeros = new JButtonMe();
			this.jButtonAbrirOrderByCajeros.setText("Orden");
			this.jButtonAbrirOrderByCajeros.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajeros,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCajeros";
			inputMap = this.jButtonAbrirOrderByCajeros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCajeros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCajeros"));
		
		
			GridBagLayout gridaBagLayoutOrderByCajeros = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCajeros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCajeros.setName("jPanelOrderByCajeros"); 
			
			this.jPanelOrderByCajeros.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajeros.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajeros.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCajeros.setLayout(gridaBagLayoutOrderByCajeros);
			
			
			this.jTableDatosCajerosOrderBy = new JTableMe();        
			this.jTableDatosCajerosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCajerosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCajerosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCajerosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCajerosOrderBy.setViewportView(this.jTableDatosCajerosOrderBy);
			this.jTableDatosCajerosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCajerosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCajeros= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCajeros= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCajeros = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCajeros= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCajeros.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCajeros.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCajeros.setTitle("Orden");
			this.jInternalFrameOrderByCajeros.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCajeros.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCajeros.setResizable(true);
			this.jInternalFrameOrderByCajeros.setClosable(true);
			this.jInternalFrameOrderByCajeros.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCajeros.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajeros.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajeros.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCajeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajeroses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCajeros.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCajeros.ipady =150;
				
			this.jPanelOrderByCajeros.add(jScrollPanelDatosCajerosOrderBy, this.gridBagConstraintsCajeros);//this.jTableDatosCajerosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCajeros = new JButtonMe();
			this.jButtonCerrarOrderByCajeros.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCajeros,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCajeros.setToolTipText("Cancelar"+" "+CajerosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCajeros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeros.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCajeros.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCajeros.add(this.jButtonCerrarOrderByCajeros, this.gridBagConstraintsCajeros);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCajeros = new GridBagLayout();
			
			this.jScrollPanelOrderByCajeros= new JScrollPane(jPanelOrderByCajeros,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCajeros = new GridBagConstraints();
			this.gridBagConstraintsCajeros.gridy =iPosYOrderBy;
			this.gridBagConstraintsCajeros.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajeros.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCajeros.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCajeros.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCajeros);
			
			this.jInternalFrameOrderByCajeros.getContentPane().add(this.jScrollPanelOrderByCajeros, this.gridBagConstraintsCajeros);			
		
		} else {
			this.jButtonAbrirOrderByCajeros = new JButtonMe();
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
		int iWidthTableCalculado=0;//1430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.cajerosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCajeros.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCajeros.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCajeros.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCajeros.getRowHeight();//CajerosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CajerosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajeros.isSelected()) {
					iHeightTable=CajerosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajerosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajerosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CajerosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajeros.isSelected()) {
					iHeightTable=CajerosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajerosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajerosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCajeros.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajeros.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajeros.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCajeros.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajeros.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajeros.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCajeros!=null && this.jInternalFrameOrderByCajeros.getjTableDatosOrderBy()!=null) {
			//if(!this.cajerosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCajeros.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCajeros.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCajeros.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCajeros.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCajeros.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCajeros.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCajeros.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCajeros.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajeros.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajeros.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cajerosLogic.getCajeross().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajeross.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Cajeros> TraerCajerosBeans(List<Cajeros> cajeross,ArrayList<Classe> classes)throws Exception {
		try {
			for(Cajeros cajeros:cajeross) {
					
				if(!(CajerosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CajerosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cajeros.setsDetalleGeneralEntityReporte(CajerosConstantesFunciones.getCajerosDescripcion(cajeros));
										
						
					
						
					
				} else  {
							
					//cajeros.setsDetalleGeneralEntityReporte(cajeros.getsDetalleGeneralEntityReporte());
										
				}
				
				//cajerosbeans.add(cajerosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cajeross;
    }
	//PARA REPORTES FIN
}
