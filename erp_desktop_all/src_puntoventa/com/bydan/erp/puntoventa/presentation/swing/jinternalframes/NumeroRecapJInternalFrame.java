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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.NumeroRecapConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class NumeroRecapJInternalFrame extends NumeroRecapBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarNumeroRecap;
	
	protected JMenuBar jmenuBarNumeroRecap;
	
	protected JMenu jmenuNumeroRecap;
	protected JMenu jmenuDatosNumeroRecap;
	protected JMenu jmenuArchivoNumeroRecap;
	protected JMenu jmenuAccionesNumeroRecap;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosNumeroRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNumeroRecap;	
	protected GridBagConstraints gridBagConstraintsNumeroRecap;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public NumeroRecapDetalleFormJInternalFrame jInternalFrameDetalleFormNumeroRecap;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoNumeroRecap;	
	protected ImportacionJInternalFrame jInternalFrameImportacionNumeroRecap;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ConexionBeanSwingJInternalFrame conexionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_conexion="";
	
	public NumeroRecapSessionBean numerorecapSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ConexionSessionBean conexionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<NumeroRecap> numerorecaps;		
	public List<NumeroRecap> numerorecapsEliminados;	
	public List<NumeroRecap> numerorecapsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByNumeroRecap;		
	protected JButton jButtonAbrirOrderByNumeroRecap;
	
	
	//protected JPanel jPanelOrderByNumeroRecap;
	//public JScrollPane jScrollPanelOrderByNumeroRecap;	
	//protected JButton jButtonCerrarOrderByNumeroRecap;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public NumeroRecapLogic numerorecapLogic;
	
	
	
	public JScrollPane jScrollPanelDatosNumeroRecap;
	public JScrollPane jScrollPanelDatosEdicionNumeroRecap;
	public JScrollPane jScrollPanelDatosGeneralNumeroRecap;
    
	
	
	//public JScrollPane jScrollPanelDatosNumeroRecapOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoNumeroRecap;
	//public JScrollPane jScrollPanelImportacionNumeroRecap;
	
	
	
	protected JPanel jPanelAccionesNumeroRecap;
	
    protected JPanel jPanelPaginacionNumeroRecap;
    protected JPanel jPanelParametrosReportesNumeroRecap;
	protected JPanel jPanelParametrosReportesAccionesNumeroRecap;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1NumeroRecap;
	protected JPanel jPanelParametrosAuxiliar2NumeroRecap;
	protected JPanel jPanelParametrosAuxiliar3NumeroRecap;
	protected JPanel jPanelParametrosAuxiliar4NumeroRecap;
	//protected JPanel jPanelParametrosAuxiliar5NumeroRecap;
	
	
	
	//protected JPanel jPanelReporteDinamicoNumeroRecap;
	//protected JPanel jPanelImportacionNumeroRecap;
	
	
	public JTable jTableDatosNumeroRecap;
	
	
	
	//public JTable jTableDatosNumeroRecapOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoNumeroRecap;
	protected JButton jButtonDuplicarNumeroRecap;
	protected JButton jButtonCopiarNumeroRecap;
	protected JButton jButtonVerFormNumeroRecap;
	protected JButton jButtonNuevoRelacionesNumeroRecap;
	protected JButton jButtonModificarNumeroRecap;
	
    protected JButton jButtonGuardarCambiosTablaNumeroRecap;
	protected JButton jButtonCerrarNumeroRecap;
	
	
	protected JButton jButtonRecargarInformacionNumeroRecap;
	protected JButton jButtonProcesarInformacionNumeroRecap;
	
	
	protected JButton jButtonAnterioresNumeroRecap;
	protected JButton jButtonSiguientesNumeroRecap;
	protected JButton jButtonNuevoGuardarCambiosNumeroRecap;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoNumeroRecap;
	//protected JButton jButtonCerrarReporteDinamicoNumeroRecap;
	//protected JButton jButtonGenerarExcelReporteDinamicoNumeroRecap;	
	
	
	
	//protected JButton jButtonAbrirImportacionNumeroRecap;
	//protected JButton jButtonGenerarImportacionNumeroRecap;
	//protected JButton jButtonCerrarImportacionNumeroRecap;
	//protected JFileChooser jFileChooserImportacionNumeroRecap;
	//protected File fileImportacionNumeroRecap;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNumeroRecap;
	protected JButton jButtonDuplicarToolBarNumeroRecap;
	protected JButton jButtonNuevoRelacionesToolBarNumeroRecap;
	
	
	public JButton jButtonGuardarCambiosToolBarNumeroRecap;
	protected JButton jButtonCopiarToolBarNumeroRecap;
	protected JButton jButtonVerFormToolBarNumeroRecap;
	public JButton jButtonGuardarCambiosTablaToolBarNumeroRecap;
	protected JButton jButtonMostrarOcultarTablaToolBarNumeroRecap;
	protected JButton jButtonCerrarToolBarNumeroRecap;
	
	protected JButton jButtonRecargarInformacionToolBarNumeroRecap;
	protected JButton jButtonProcesarInformacionToolBarNumeroRecap;
	protected JButton jButtonAnterioresToolBarNumeroRecap;
	protected JButton jButtonSiguientesToolBarNumeroRecap;
	protected JButton jButtonNuevoGuardarCambiosToolBarNumeroRecap;
	protected JButton jButtonAbrirOrderByToolBarNumeroRecap;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNumeroRecap;
	protected JMenuItem jMenuItemDuplicarNumeroRecap;
	protected JMenuItem jMenuItemNuevoRelacionesNumeroRecap;
	
	
	protected JMenuItem jMenuItemGuardarCambiosNumeroRecap;
	protected JMenuItem jMenuItemCopiarNumeroRecap;
	protected JMenuItem jMenuItemVerFormNumeroRecap;
	protected JMenuItem jMenuItemGuardarCambiosTablaNumeroRecap;
	protected JMenuItem jMenuItemCerrarNumeroRecap;
	protected JMenuItem jMenuItemDetalleCerrarNumeroRecap;
	protected JMenuItem jMenuItemDetalleAbrirOrderByNumeroRecap;
	protected JMenuItem jMenuItemDetalleMostarOcultarNumeroRecap;
	
	protected JMenuItem jMenuItemRecargarInformacionNumeroRecap;
	protected JMenuItem jMenuItemProcesarInformacionNumeroRecap;
	protected JMenuItem jMenuItemAnterioresNumeroRecap;
	protected JMenuItem jMenuItemSiguientesNumeroRecap;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNumeroRecap;
	protected JMenuItem jMenuItemAbrirOrderByNumeroRecap;
	protected JMenuItem jMenuItemMostrarOcultarNumeroRecap;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNumeroRecap;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosNumeroRecap;
	protected JCheckBox jCheckBoxSeleccionadosNumeroRecap;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaNumeroRecap;
	protected JCheckBox jCheckBoxConGraficoReporteNumeroRecap;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesNumeroRecap;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesNumeroRecap;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoNumeroRecap;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoNumeroRecap;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesNumeroRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionNumeroRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNumeroRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNumeroRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarNumeroRecap;
	protected JTextField jTextFieldValorCampoGeneralNumeroRecap;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteNumeroRecap;
	//public JList<Reporte> jListColumnasSelectReporteNumeroRecap;
	//public JScrollPane jScrollColumnasSelectReporteNumeroRecap;
	
	//public JLabel jLabelRelacionesSelectReporteNumeroRecap;
	//public JList<Reporte> jListRelacionesSelectReporteNumeroRecap;
	//public JScrollPane jScrollRelacionesSelectReporteNumeroRecap;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoNumeroRecap;
	//protected JCheckBox jCheckBoxConGraficoDinamicoNumeroRecap;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoNumeroRecap;
	//public JLabel jLabelTiposArchivoReporteDinamicoNumeroRecap;
	
		
	//public JLabel jLabelArchivoImportacionNumeroRecap;	
	//public JLabel jLabelPathArchivoImportacionNumeroRecap;
	//protected JTextField jTextFieldPathArchivoImportacionNumeroRecap;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoNumeroRecap;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoNumeroRecap;
	
	//public JLabel jLabelColumnaCategoriaValorNumeroRecap;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorNumeroRecap;
	
	//public JLabel jLabelColumnasValoresGraficoNumeroRecap;
	//public JList<Reporte> jListColumnasValoresGraficoNumeroRecap;
	//public JScrollPane jScrollColumnasValoresGraficoNumeroRecap;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoNumeroRecap;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoNumeroRecap;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasNumeroRecap;
	public JPanel jPanelFK_IdConexionNumeroRecap;
	public JButton jButtonFK_IdConexionNumeroRecap;
	
	public JPanel jPanelid_conexionFK_IdConexionNumeroRecap;
	public JLabel jLabelid_conexionFK_IdConexionNumeroRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_conexionFK_IdConexionNumeroRecap;
	public JButton jButtonid_conexionFK_IdConexionNumeroRecap= new JButtonMe();
	public JButton jButtonid_conexionFK_IdConexionNumeroRecapUpdate= new JButtonMe();
	public JButton jButtonid_conexionFK_IdConexionNumeroRecapBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public NumeroRecapJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("NumeroRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NumeroRecapJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NumeroRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NumeroRecapJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NumeroRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NumeroRecapJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NumeroRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionNumeroRecap)	{
		this.jButtonRecargarInformacionNumeroRecap = jButtonRecargarInformacionNumeroRecap;
	}
	
	public JButton getjButtonProcesarInformacionNumeroRecap() {
		return this.jButtonProcesarInformacionNumeroRecap;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNumeroRecap)	{
		this.jButtonProcesarInformacionNumeroRecap = jButtonProcesarInformacionNumeroRecap;
	}
	
	
	public JButton getjButtonRecargarInformacionNumeroRecap() {
		return this.jButtonRecargarInformacionNumeroRecap;
	}
	
	
	public List<NumeroRecap> getnumerorecaps() {
		return this.numerorecaps;
	}

	public void setnumerorecaps(List<NumeroRecap> numerorecaps) {
		this.numerorecaps = numerorecaps;
	}
	
	public List<NumeroRecap> getnumerorecapsAux() {
		return this.numerorecapsAux;
	}

	public void setnumerorecapsAux(List<NumeroRecap> numerorecapsAux) {
		this.numerorecapsAux = numerorecapsAux;
	}
	
	public List<NumeroRecap> getnumerorecapsEliminados() {
		return this.numerorecapsEliminados;
	}

	public void setNumeroRecapsEliminados(List<NumeroRecap> numerorecapsEliminados) {
		this.numerorecapsEliminados = numerorecapsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarNumeroRecap() {
		return jComboBoxTiposSeleccionarNumeroRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarNumeroRecap(
			JComboBox jComboBoxTiposSeleccionarNumeroRecap) {
		this.jComboBoxTiposSeleccionarNumeroRecap = jComboBoxTiposSeleccionarNumeroRecap;
	}
	
	public void setBorderResaltarTiposSeleccionarNumeroRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarNumeroRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarNumeroRecap .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralNumeroRecap() {
		return jTextFieldValorCampoGeneralNumeroRecap;
	}

	public void setjTextFieldValorCampoGeneralNumeroRecap(
			JTextField jTextFieldValorCampoGeneralNumeroRecap) {
		this.jTextFieldValorCampoGeneralNumeroRecap = jTextFieldValorCampoGeneralNumeroRecap;
	}

	public void setBorderResaltarValorCampoGeneralNumeroRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroRecap.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralNumeroRecap .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosNumeroRecap() {
		return this.jCheckBoxSeleccionarTodosNumeroRecap;
	}

	public void setjCheckBoxSeleccionarTodosNumeroRecap(
			JCheckBox jCheckBoxSeleccionarTodosNumeroRecap) {
		this.jCheckBoxSeleccionarTodosNumeroRecap = jCheckBoxSeleccionarTodosNumeroRecap;
	}

	public void setBorderResaltarSeleccionarTodosNumeroRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroRecap.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosNumeroRecap .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosNumeroRecap() {
		return this.jCheckBoxSeleccionadosNumeroRecap;
	}

	public void setjCheckBoxSeleccionadosNumeroRecap(
			JCheckBox jCheckBoxSeleccionadosNumeroRecap) {
		this.jCheckBoxSeleccionadosNumeroRecap = jCheckBoxSeleccionadosNumeroRecap;
	}
	
	public void setBorderResaltarSeleccionadosNumeroRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroRecap.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosNumeroRecap .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesNumeroRecap() {
		return this.jComboBoxTiposArchivosReportesNumeroRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesNumeroRecap(
			JComboBox jComboBoxTiposArchivosReportesNumeroRecap) {
		this.jComboBoxTiposArchivosReportesNumeroRecap = jComboBoxTiposArchivosReportesNumeroRecap;
	}

	public void setBorderResaltarTiposArchivosReportesNumeroRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesNumeroRecap .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesNumeroRecap() {
		return this.jComboBoxTiposReportesNumeroRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesNumeroRecap(
			JComboBox jComboBoxTiposReportesNumeroRecap) {
		this.jComboBoxTiposReportesNumeroRecap = jComboBoxTiposReportesNumeroRecap;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoNumeroRecap() {
	//	return jComboBoxTiposReportesDinamicoNumeroRecap;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoNumeroRecap(
	//		JComboBox jComboBoxTiposReportesDinamicoNumeroRecap) {
	//	this.jComboBoxTiposReportesDinamicoNumeroRecap = jComboBoxTiposReportesDinamicoNumeroRecap;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoNumeroRecap() {
	//	return jComboBoxTiposArchivosReportesDinamicoNumeroRecap;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoNumeroRecap(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoNumeroRecap) {
	//	this.jComboBoxTiposArchivosReportesDinamicoNumeroRecap = jComboBoxTiposArchivosReportesDinamicoNumeroRecap;
	//}
	
	public void setBorderResaltarTiposReportesNumeroRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesNumeroRecap .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesNumeroRecap() {
		return this.jComboBoxTiposGraficosReportesNumeroRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesNumeroRecap(
			JComboBox jComboBoxTiposGraficosReportesNumeroRecap) {
		this.jComboBoxTiposGraficosReportesNumeroRecap = jComboBoxTiposGraficosReportesNumeroRecap;
	}
	
	public void setBorderResaltarTiposGraficosReportesNumeroRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesNumeroRecap .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionNumeroRecap() {
		return this.jComboBoxTiposPaginacionNumeroRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionNumeroRecap(
			JComboBox jComboBoxTiposPaginacionNumeroRecap) {
		this.jComboBoxTiposPaginacionNumeroRecap = jComboBoxTiposPaginacionNumeroRecap;
	}
	
	public void setBorderResaltarTiposPaginacionNumeroRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionNumeroRecap .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesNumeroRecap() {
		return this.jComboBoxTiposRelacionesNumeroRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNumeroRecap() {
		return this.jComboBoxTiposAccionesNumeroRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNumeroRecap(
			JComboBox jComboBoxTiposRelacionesNumeroRecap) {
		this.jComboBoxTiposRelacionesNumeroRecap = jComboBoxTiposRelacionesNumeroRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNumeroRecap(
			JComboBox jComboBoxTiposAccionesNumeroRecap) {
		this.jComboBoxTiposAccionesNumeroRecap = jComboBoxTiposAccionesNumeroRecap;
	}
	
	public void setBorderResaltarTiposRelacionesNumeroRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesNumeroRecap .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesNumeroRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesNumeroRecap .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoNumeroRecap() {
	//	return jCheckBoxConGraficoDinamicoNumeroRecap;
	//}

	//public void setjCheckBoxConGraficoDinamicoNumeroRecap(
	//		JCheckBox jCheckBoxConGraficoDinamicoNumeroRecap) {
	//	this.jCheckBoxConGraficoDinamicoNumeroRecap = jCheckBoxConGraficoDinamicoNumeroRecap;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoNumeroRecap() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarNumeroRecap.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoNumeroRecap .setBorder(borderResaltar);		
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
		this.numerorecapSessionBean=new NumeroRecapSessionBean();
		
		this.numerorecapSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.numerorecapSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.numerorecapSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=NumeroRecapJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=NumeroRecapJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NumeroRecapJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NumeroRecapJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NumeroRecapJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Numero Recap MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
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
		
		NumeroRecapJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("NumeroRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarNumeroRecap= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarNumeroRecap,this.jTtoolBarNumeroRecap,
							"nuevo","nuevo","Nuevo"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarNumeroRecap,this.jTtoolBarNumeroRecap,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarNumeroRecap,this.jTtoolBarNumeroRecap,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarNumeroRecap,this.jTtoolBarNumeroRecap,
							"duplicar","duplicar","Duplicar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarNumeroRecap,this.jTtoolBarNumeroRecap,
							"copiar","copiar","Copiar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarNumeroRecap,this.jTtoolBarNumeroRecap,
							"ver_form","ver_form","Ver"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNumeroRecap,this.jTtoolBarNumeroRecap,
							"recargar","recargar","Recargar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNumeroRecap,this.jTtoolBarNumeroRecap,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNumeroRecap,this.jTtoolBarNumeroRecap,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarNumeroRecap,this.jTtoolBarNumeroRecap,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarNumeroRecap,this.jTtoolBarNumeroRecap,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarNumeroRecap,this.jTtoolBarNumeroRecap,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarNumeroRecap,this.jTtoolBarNumeroRecap,
							"cerrar","cerrar","Salir"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarNumeroRecap=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarNumeroRecap;
			
				this.jButtonProcesarInformacionToolBarNumeroRecap=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarNumeroRecap;
				
		//protected JButton jButtonModificarToolBarNumeroRecap;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarNumeroRecap=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuNumeroRecap=new JMenuMe("General");
		this.jmenuArchivoNumeroRecap=new JMenuMe("Archivo");
		this.jmenuAccionesNumeroRecap=new JMenuMe("Acciones");
		this.jmenuDatosNumeroRecap=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNumeroRecap= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNumeroRecap.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNumeroRecap,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarNumeroRecap= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarNumeroRecap.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarNumeroRecap,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesNumeroRecap= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesNumeroRecap.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesNumeroRecap,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosNumeroRecap= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNumeroRecap.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNumeroRecap,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarNumeroRecap= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarNumeroRecap.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarNumeroRecap,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormNumeroRecap= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormNumeroRecap.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormNumeroRecap,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaNumeroRecap= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaNumeroRecap.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaNumeroRecap,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNumeroRecap= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNumeroRecap.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNumeroRecap,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionNumeroRecap= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionNumeroRecap.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionNumeroRecap,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionNumeroRecap= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionNumeroRecap.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionNumeroRecap,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresNumeroRecap= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresNumeroRecap.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresNumeroRecap,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesNumeroRecap= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesNumeroRecap.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesNumeroRecap,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByNumeroRecap= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByNumeroRecap.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByNumeroRecap,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNumeroRecap= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNumeroRecap.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNumeroRecap,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByNumeroRecap= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByNumeroRecap.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByNumeroRecap,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNumeroRecap= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNumeroRecap.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNumeroRecap,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosNumeroRecap= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosNumeroRecap.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosNumeroRecap,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoNumeroRecap.add(this.jMenuItemCerrarNumeroRecap);
			
			this.jmenuAccionesNumeroRecap.add(this.jMenuItemNuevoNumeroRecap);
			this.jmenuAccionesNumeroRecap.add(this.jMenuItemNuevoGuardarCambiosNumeroRecap);
			this.jmenuAccionesNumeroRecap.add(this.jMenuItemNuevoRelacionesNumeroRecap);
			this.jmenuAccionesNumeroRecap.add(this.jMenuItemGuardarCambiosTablaNumeroRecap);		
			this.jmenuAccionesNumeroRecap.add(this.jMenuItemDuplicarNumeroRecap);		
			this.jmenuAccionesNumeroRecap.add(this.jMenuItemCopiarNumeroRecap);		
			this.jmenuAccionesNumeroRecap.add(this.jMenuItemVerFormNumeroRecap);		
			
			this.jmenuDatosNumeroRecap.add(this.jMenuItemRecargarInformacionNumeroRecap);				
			this.jmenuDatosNumeroRecap.add(this.jMenuItemAnterioresNumeroRecap);				
			this.jmenuDatosNumeroRecap.add(this.jMenuItemSiguientesNumeroRecap);				
			this.jmenuDatosNumeroRecap.add(this.jMenuItemAbrirOrderByNumeroRecap);				
			this.jmenuDatosNumeroRecap.add(this.jMenuItemMostrarOcultarNumeroRecap);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesNumeroRecap.add(this.jMenuItemGuardarCambiosNumeroRecap);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarNumeroRecap.add(this.jmenuArchivoNumeroRecap);		
			this.jmenuBarNumeroRecap.add(this.jmenuAccionesNumeroRecap);		
			this.jmenuBarNumeroRecap.add(this.jmenuDatosNumeroRecap);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarNumeroRecap);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasNumeroRecap() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdConexionNumeroRecap=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdConexionNumeroRecap.setToolTipText("Buscar Por Conexion ");
		this.jButtonFK_IdConexionNumeroRecap= new JButtonMe();
		this.jButtonFK_IdConexionNumeroRecap.setText("Buscar");
		this.jButtonFK_IdConexionNumeroRecap.setToolTipText("Buscar Por Conexion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdConexionNumeroRecap,"buscar_button","Buscar Por Conexion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdConexionNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_conexionFK_IdConexionNumeroRecap = new JLabelMe();
		jLabelid_conexionFK_IdConexionNumeroRecap.setText("Conexion :");
		jLabelid_conexionFK_IdConexionNumeroRecap.setToolTipText("Conexion");
		jLabelid_conexionFK_IdConexionNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_conexionFK_IdConexionNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_conexionFK_IdConexionNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_conexionFK_IdConexionNumeroRecap,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_conexionFK_IdConexionNumeroRecap= new JComboBoxMe();
		jComboBoxid_conexionFK_IdConexionNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_conexionFK_IdConexionNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_conexionFK_IdConexionNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_conexionFK_IdConexionNumeroRecap,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasNumeroRecap=new JTabbedPane();


		this.jTabbedPaneBusquedasNumeroRecap.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNumeroRecap.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNumeroRecap.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasNumeroRecap.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasNumeroRecap,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleNumeroRecap = new NumeroRecapDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Numero Recap DATOS");
			this.jInternalFrameDetalleFormNumeroRecap = new NumeroRecapDetalleFormJInternalFrame(jDesktopPane,this.numerorecapSessionBean.getConGuardarRelaciones(),this.numerorecapSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormNumeroRecap = null;//new NumeroRecapDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNumeroRecap= new GridBagLayout();
		
		
		this.jTableDatosNumeroRecap = new JTableMe();      
		
		String sToolTipNumeroRecap="";
		sToolTipNumeroRecap=NumeroRecapConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNumeroRecap+="(PuntoVenta.NumeroRecap)";
		}
		
		if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
			sToolTipNumeroRecap+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosNumeroRecap.setToolTipText(sToolTipNumeroRecap);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosNumeroRecap);
		this.jTableDatosNumeroRecap.setAutoCreateRowSorter(true);
		this.jTableDatosNumeroRecap.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosNumeroRecap.setRowSelectionAllowed(true);
		this.jTableDatosNumeroRecap.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosNumeroRecap,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoNumeroRecap = new JButtonMe();
		this.jButtonDuplicarNumeroRecap = new JButtonMe();
		this.jButtonCopiarNumeroRecap = new JButtonMe();
		this.jButtonVerFormNumeroRecap = new JButtonMe();
		this.jButtonNuevoRelacionesNumeroRecap = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaNumeroRecap = new JButtonMe();
		this.jButtonCerrarNumeroRecap = new JButtonMe();
		
		this.jScrollPanelDatosNumeroRecap = new JScrollPane();   
        this.jScrollPanelDatosGeneralNumeroRecap = new JScrollPane();
		
				
		
		
		this.jPanelAccionesNumeroRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Numero Recap";
		
		if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Numero Recapes" + this.sPath));
		} else {
			this.jScrollPanelDatosNumeroRecap.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNumeroRecap.setToolTipText("Acciones");
        this.jPanelAccionesNumeroRecap.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoNumeroRecap=new ReporteDinamicoJInternalFrame(NumeroRecapConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoNumeroRecap();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionNumeroRecap=new ImportacionJInternalFrame(NumeroRecapConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionNumeroRecap();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByNumeroRecap = new JButtonMe();
		
		this.jButtonAbrirOrderByNumeroRecap.setText("Orden");
		this.jButtonAbrirOrderByNumeroRecap.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNumeroRecap,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByNumeroRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNumeroRecap=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNumeroRecap,false,this);
			
			//this.cargarOrderByNumeroRecap(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNumeroRecap=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNumeroRecap,true,this);
			
			//this.cargarOrderByNumeroRecap(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosNumeroRecap.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosNumeroRecap.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosNumeroRecap.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosNumeroRecap.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosNumeroRecap.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosNumeroRecap.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoNumeroRecap.setText("Nuevo");
		this.jButtonDuplicarNumeroRecap.setText("Duplicar");
		this.jButtonCopiarNumeroRecap.setText("Copiar");
		this.jButtonVerFormNumeroRecap.setText("Ver");
		this.jButtonNuevoRelacionesNumeroRecap.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaNumeroRecap.setText("Guardar");
		this.jButtonCerrarNumeroRecap.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNumeroRecap,"nuevo_button","Nuevo",this.numerorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarNumeroRecap,"duplicar_button","Duplicar",this.numerorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarNumeroRecap,"copiar_button","Copiar",this.numerorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormNumeroRecap,"ver_form","Ver",this.numerorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesNumeroRecap,"nuevorelaciones_button","Nuevo Rel",this.numerorecapSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNumeroRecap,"guardarcambiostabla_button","Guardar",this.numerorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNumeroRecap,"cerrar_button","Salir",this.numerorecapSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoNumeroRecap.setToolTipText("Nuevo"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarNumeroRecap.setToolTipText("Duplicar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarNumeroRecap.setToolTipText("Copiar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormNumeroRecap.setToolTipText("Ver"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesNumeroRecap.setToolTipText("Nuevo Rel"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaNumeroRecap.setToolTipText("Guardar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNumeroRecap.setToolTipText("Salir"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNumeroRecap";
		inputMap = this.jButtonNuevoNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNumeroRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNumeroRecap"));
		
		//DUPLICAR
		sMapKey = "DuplicarNumeroRecap";
		inputMap = this.jButtonDuplicarNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarNumeroRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarNumeroRecap"));
		
		//COPIAR
		sMapKey = "CopiarNumeroRecap";
		inputMap = this.jButtonCopiarNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarNumeroRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarNumeroRecap"));
		
		//VEr FORM
		sMapKey = "VerFormNumeroRecap";
		inputMap = this.jButtonVerFormNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormNumeroRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormNumeroRecap"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesNumeroRecap";
		inputMap = this.jButtonNuevoRelacionesNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesNumeroRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesNumeroRecap"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarNumeroRecap";
		inputMap = this.jButtonModificarNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarNumeroRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarNumeroRecap"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarNumeroRecap";
		inputMap = this.jButtonCerrarNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNumeroRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNumeroRecap"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNumeroRecap";
		inputMap = this.jButtonGuardarCambiosTablaNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNumeroRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNumeroRecap"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesNumeroRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesNumeroRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionNumeroRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1NumeroRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2NumeroRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3NumeroRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4NumeroRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5NumeroRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesNumeroRecap.setName("jPanelParametrosReportesNumeroRecap"); 
		
		this.jPanelParametrosReportesAccionesNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesNumeroRecap.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesNumeroRecap.setName("jPanelParametrosReportesAccionesNumeroRecap"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionNumeroRecap = new JButtonMe();
		this.jButtonRecargarInformacionNumeroRecap.setText("Recargar");
		this.jButtonRecargarInformacionNumeroRecap.setToolTipText("Recargar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionNumeroRecap,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionNumeroRecap = new JButtonMe();
		this.jButtonProcesarInformacionNumeroRecap.setText("Procesar");
		this.jButtonProcesarInformacionNumeroRecap.setToolTipText("Procesar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionNumeroRecap.setVisible(false);
			
		this.jButtonProcesarInformacionNumeroRecap.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNumeroRecap.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNumeroRecap.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesNumeroRecap = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNumeroRecap.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesNumeroRecap.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesNumeroRecap = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNumeroRecap.setText("TIPO");       
		this.jComboBoxTiposReportesNumeroRecap.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesNumeroRecap = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNumeroRecap.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesNumeroRecap.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionNumeroRecap = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionNumeroRecap.setText("Paginacion");
		this.jComboBoxTiposPaginacionNumeroRecap.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesNumeroRecap = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesNumeroRecap.setText("Accion");
		this.jComboBoxTiposRelacionesNumeroRecap.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesNumeroRecap = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNumeroRecap.setText("Accion");
		this.jComboBoxTiposAccionesNumeroRecap.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarNumeroRecap = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarNumeroRecap.setText("Accion");
		this.jComboBoxTiposSeleccionarNumeroRecap.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralNumeroRecap=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralNumeroRecap.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNumeroRecap.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNumeroRecap.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesNumeroRecap = new JLabelMe();
		
		this.jLabelAccionesNumeroRecap.setText("Acciones");		
		this.jLabelAccionesNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosNumeroRecap = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosNumeroRecap.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosNumeroRecap.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosNumeroRecap = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosNumeroRecap.setText("Seleccionados");
		this.jCheckBoxSeleccionadosNumeroRecap.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaNumeroRecap = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaNumeroRecap.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaNumeroRecap.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteNumeroRecap = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteNumeroRecap.setText("Graf.");
		this.jCheckBoxConGraficoReporteNumeroRecap.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresNumeroRecap = new JButtonMe();
		//this.jButtonAnterioresNumeroRecap.setText("<<");
        this.jButtonAnterioresNumeroRecap.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresNumeroRecap,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesNumeroRecap = new JButtonMe();
		//this.jButtonSiguientesNumeroRecap.setText(">>");
        this.jButtonSiguientesNumeroRecap.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesNumeroRecap,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosNumeroRecap = new JButtonMe();
		this.jButtonNuevoGuardarCambiosNumeroRecap.setText("Nue");
        this.jButtonNuevoGuardarCambiosNumeroRecap.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosNumeroRecap,"nuevoguardarcambios_button","Nue",this.numerorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosNumeroRecap";
		inputMap = this.jButtonNuevoGuardarCambiosNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosNumeroRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosNumeroRecap"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionNumeroRecap";
		inputMap = this.jButtonRecargarInformacionNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionNumeroRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionNumeroRecap"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesNumeroRecap";
		inputMap = this.jButtonSiguientesNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesNumeroRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesNumeroRecap"));
		
		//ANTERIORES		
		sMapKey = "AnterioresNumeroRecap";
		inputMap = this.jButtonAnterioresNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresNumeroRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresNumeroRecap"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasNumeroRecap();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesNumeroRecap.setMinimumSize(new Dimension(this.getWidth(),NumeroRecapBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NumeroRecapBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNumeroRecap.setMaximumSize(new Dimension(this.getWidth(),NumeroRecapBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NumeroRecapBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNumeroRecap.setPreferredSize(new Dimension(this.getWidth(),NumeroRecapBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NumeroRecapBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionNumeroRecap = new GridBagLayout();

			this.jPanelPaginacionNumeroRecap.setLayout(gridaBagLayoutPaginacionNumeroRecap);						
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.gridy = 0;
			this.gridBagConstraintsNumeroRecap.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionNumeroRecap.add(this.jButtonAnterioresNumeroRecap, this.gridBagConstraintsNumeroRecap);
					
						
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNumeroRecap.gridy = 0;
			
			this.jPanelPaginacionNumeroRecap.add(this.jButtonNuevoGuardarCambiosNumeroRecap, this.gridBagConstraintsNumeroRecap);
						
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsNumeroRecap.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNumeroRecap.gridy = 0;
			this.jPanelPaginacionNumeroRecap.add(this.jButtonSiguientesNumeroRecap, this.gridBagConstraintsNumeroRecap);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.gridy = 1;
			this.gridBagConstraintsNumeroRecap.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNumeroRecap.add(this.jButtonNuevoNumeroRecap, this.gridBagConstraintsNumeroRecap);
						
			
			
			if(!this.numerorecapSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
				this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNumeroRecap.gridy = 1;
				this.gridBagConstraintsNumeroRecap.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionNumeroRecap.add(this.jButtonGuardarCambiosTablaNumeroRecap, this.gridBagConstraintsNumeroRecap);
			}
			
			
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.gridy = 1;
			this.gridBagConstraintsNumeroRecap.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNumeroRecap.add(this.jButtonDuplicarNumeroRecap, this.gridBagConstraintsNumeroRecap);
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.gridy = 1;
			this.gridBagConstraintsNumeroRecap.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNumeroRecap.add(this.jButtonCopiarNumeroRecap, this.gridBagConstraintsNumeroRecap);
		
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.gridy = 1;
			this.gridBagConstraintsNumeroRecap.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNumeroRecap.add(this.jButtonVerFormNumeroRecap, this.gridBagConstraintsNumeroRecap);
		
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.gridy = 1;
			this.gridBagConstraintsNumeroRecap.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionNumeroRecap.add(this.jButtonCerrarNumeroRecap, this.gridBagConstraintsNumeroRecap);
		
		
		
		this.jButtonRecargarInformacionNumeroRecap.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNumeroRecap.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNumeroRecap.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesNumeroRecap.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNumeroRecap.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNumeroRecap.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesNumeroRecap.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNumeroRecap.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNumeroRecap.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesNumeroRecap.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNumeroRecap.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNumeroRecap.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionNumeroRecap.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNumeroRecap.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNumeroRecap.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesNumeroRecap.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNumeroRecap.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNumeroRecap.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesNumeroRecap.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNumeroRecap.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNumeroRecap.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarNumeroRecap.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNumeroRecap.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNumeroRecap.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaNumeroRecap.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNumeroRecap.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNumeroRecap.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteNumeroRecap.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNumeroRecap.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNumeroRecap.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosNumeroRecap.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNumeroRecap.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNumeroRecap.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosNumeroRecap.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNumeroRecap.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNumeroRecap.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesNumeroRecap = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesNumeroRecap = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1NumeroRecap = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2NumeroRecap = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3NumeroRecap = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4NumeroRecap = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesNumeroRecap.setLayout(gridaBagParametrosReportesNumeroRecap);
			this.jPanelParametrosReportesAccionesNumeroRecap.setLayout(gridaBagParametrosReportesAccionesNumeroRecap);
			
			
			this.jPanelParametrosAuxiliar1NumeroRecap.setLayout(gridaBagParametrosAuxiliar1NumeroRecap);
			this.jPanelParametrosAuxiliar2NumeroRecap.setLayout(gridaBagParametrosAuxiliar2NumeroRecap);
			this.jPanelParametrosAuxiliar3NumeroRecap.setLayout(gridaBagParametrosAuxiliar3NumeroRecap);
			this.jPanelParametrosAuxiliar4NumeroRecap.setLayout(gridaBagParametrosAuxiliar4NumeroRecap);
			//this.jPanelParametrosAuxiliar5NumeroRecap.setLayout(gridaBagParametrosAuxiliar2NumeroRecap);			
			
			
			
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNumeroRecap.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNumeroRecap.add(this.jButtonRecargarInformacionNumeroRecap, this.gridBagConstraintsNumeroRecap);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroRecap.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroRecap.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NumeroRecap.add(this.jComboBoxTiposPaginacionNumeroRecap, this.gridBagConstraintsNumeroRecap);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroRecap.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroRecap.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NumeroRecap.add(this.jCheckBoxConAltoMaximoTablaNumeroRecap, this.gridBagConstraintsNumeroRecap);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroRecap.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroRecap.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NumeroRecap.add(this.jComboBoxTiposArchivosReportesNumeroRecap, this.gridBagConstraintsNumeroRecap);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroRecap.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNumeroRecap.add(this.jPanelParametrosAuxiliar1NumeroRecap, this.gridBagConstraintsNumeroRecap);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNumeroRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4NumeroRecap.add(this.jComboBoxTiposReportesNumeroRecap, this.gridBagConstraintsNumeroRecap);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroRecap.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNumeroRecap.add(this.jPanelParametrosAuxiliar4NumeroRecap, this.gridBagConstraintsNumeroRecap);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroRecap.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroRecap.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNumeroRecap.add(this.jComboBoxTiposReportesNumeroRecap, this.gridBagConstraintsNumeroRecap);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroRecap.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNumeroRecap.add(this.jCheckBoxGenerarReporteNumeroRecap, this.gridBagConstraintsNumeroRecap);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroRecap.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNumeroRecap.add(this.jPanelParametrosAuxiliar2NumeroRecap, this.gridBagConstraintsNumeroRecap);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNumeroRecap.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNumeroRecap.add(this.jLabelAccionesNumeroRecap, this.gridBagConstraintsNumeroRecap);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
				this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsNumeroRecap.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsNumeroRecap.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesNumeroRecap.add(this.jButtonAbrirOrderByNumeroRecap, this.gridBagConstraintsNumeroRecap);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsNumeroRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroRecap.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNumeroRecap.add(this.jComboBoxTiposSeleccionarNumeroRecap, this.gridBagConstraintsNumeroRecap);			
			
			
			/*
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNumeroRecap.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNumeroRecap.add(this.jCheckBoxSeleccionarTodosNumeroRecap, this.gridBagConstraintsNumeroRecap);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNumeroRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NumeroRecap.add(this.jCheckBoxSeleccionarTodosNumeroRecap, this.gridBagConstraintsNumeroRecap);															
				
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNumeroRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NumeroRecap.add(this.jCheckBoxSeleccionadosNumeroRecap, this.gridBagConstraintsNumeroRecap);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroRecap.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNumeroRecap.add(this.jPanelParametrosAuxiliar3NumeroRecap, this.gridBagConstraintsNumeroRecap);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroRecap.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNumeroRecap.add(this.jComboBoxTiposAccionesNumeroRecap, this.gridBagConstraintsNumeroRecap);
	
				
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroRecap.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNumeroRecap.add(this.jTextFieldValorCampoGeneralNumeroRecap, this.gridBagConstraintsNumeroRecap);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosNumeroRecap = new GridBagLayout();

			this.jScrollPanelDatosNumeroRecap.setLayout(gridaBagLayoutDatosNumeroRecap);
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.gridy = 0;
			this.gridBagConstraintsNumeroRecap.gridx = 0;
			
			this.jScrollPanelDatosNumeroRecap.add(this.jTableDatosNumeroRecap, this.gridBagConstraintsNumeroRecap);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosNumeroRecap.setViewportView(this.jTableDatosNumeroRecap);
		this.jTableDatosNumeroRecap.setFillsViewportHeight(true);
		this.jTableDatosNumeroRecap.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNumeroRecap= new GridBagLayout();
		this.jPanelAccionesNumeroRecap.setLayout(gridaBagLayoutAccionesNumeroRecap);
		
		
		/*	
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroRecap.gridy = 0;
		this.gridBagConstraintsNumeroRecap.gridx = 0;
			
		this.jPanelAccionesNumeroRecap.add(this.jButtonNuevoNumeroRecap, this.gridBagConstraintsNumeroRecap);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdConexionNumeroRecap= new GridBagLayout();
		gridaBagLayoutFK_IdConexionNumeroRecap.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdConexionNumeroRecap.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdConexionNumeroRecap.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdConexionNumeroRecap.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdConexionNumeroRecap.setLayout(gridaBagLayoutFK_IdConexionNumeroRecap);

		gridBagConstraintsNumeroRecap = new GridBagConstraints();
		gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNumeroRecap.gridy = 0;
		gridBagConstraintsNumeroRecap.gridx = 0;
		jPanelFK_IdConexionNumeroRecap.add(jLabelid_conexionFK_IdConexionNumeroRecap, gridBagConstraintsNumeroRecap);

		gridBagConstraintsNumeroRecap = new GridBagConstraints();
		gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNumeroRecap.gridy = 0;
		gridBagConstraintsNumeroRecap.gridx = 1;
		jPanelFK_IdConexionNumeroRecap.add(jComboBoxid_conexionFK_IdConexionNumeroRecap, gridBagConstraintsNumeroRecap);

		gridBagConstraintsNumeroRecap = new GridBagConstraints();
		gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNumeroRecap.gridy = 1;
		gridBagConstraintsNumeroRecap.gridx =1;
		jPanelFK_IdConexionNumeroRecap.add(jButtonFK_IdConexionNumeroRecap, gridBagConstraintsNumeroRecap);

		jTabbedPaneBusquedasNumeroRecap.addTab("1.-Por Conexion ", jPanelFK_IdConexionNumeroRecap);
		jTabbedPaneBusquedasNumeroRecap.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNumeroRecap = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNumeroRecap);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.numerorecapSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();						
			this.gridBagConstraintsNumeroRecap.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNumeroRecap.gridx = 0;		
			//this.gridBagConstraintsNumeroRecap.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNumeroRecap.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarNumeroRecap, this.gridBagConstraintsNumeroRecap);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy = iGridyPrincipal++;
		this.gridBagConstraintsNumeroRecap.gridx = 0;		
		//this.gridBagConstraintsNumeroRecap.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsNumeroRecap.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsNumeroRecap);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsNumeroRecap.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNumeroRecap.gridx = 0;		
			this.gridBagConstraintsNumeroRecap.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsNumeroRecap.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasNumeroRecap, this.gridBagConstraintsNumeroRecap);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNumeroRecap.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesNumeroRecap, this.gridBagConstraintsNumeroRecap);								
		
		
		/*
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNumeroRecap.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesNumeroRecap, this.gridBagConstraintsNumeroRecap);
		*/		
		
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNumeroRecap.gridx =0;
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNumeroRecap.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNumeroRecap, this.gridBagConstraintsNumeroRecap);
				
		
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNumeroRecap.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionNumeroRecap, this.gridBagConstraintsNumeroRecap);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(NumeroRecapJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosNumeroRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNumeroRecap = new GridBagLayout();
			this.jPanelBusquedasParametrosNumeroRecap.setLayout(gridaBagLayoutBusquedasParametrosNumeroRecap);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralNumeroRecap=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNumeroRecap.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNumeroRecap.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNumeroRecap.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNumeroRecap.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNumeroRecap, this.gridBagConstraintsNumeroRecap);
			
			
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNumeroRecap.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNumeroRecap, this.gridBagConstraintsNumeroRecap);
		
			
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNumeroRecap.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNumeroRecap, this.gridBagConstraintsNumeroRecap);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralNumeroRecap;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoNumeroRecap() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoNumeroRecap = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoNumeroRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoNumeroRecap.setName("jPanelReporteDinamicoNumeroRecap"); 
		
		this.jPanelReporteDinamicoNumeroRecap.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNumeroRecap.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNumeroRecap.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoNumeroRecap.setLayout(gridaBagLayoutReporteDinamicoNumeroRecap);
		
		
		this.jInternalFrameReporteDinamicoNumeroRecap= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoNumeroRecap = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNumeroRecap= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoNumeroRecap.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoNumeroRecap.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoNumeroRecap.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoNumeroRecap.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoNumeroRecap.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoNumeroRecap.setResizable(true);
	    this.jInternalFrameReporteDinamicoNumeroRecap.setClosable(true);
	    this.jInternalFrameReporteDinamicoNumeroRecap.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoNumeroRecap.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNumeroRecap.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNumeroRecap.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Numero Recapes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteNumeroRecap = new JLabelMe();

		this.jLabelColumnasSelectReporteNumeroRecap.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNumeroRecap.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNumeroRecap.add(this.jLabelColumnasSelectReporteNumeroRecap, this.gridBagConstraintsNumeroRecap);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteNumeroRecap = new JList<Reporte>();
		this.jListColumnasSelectReporteNumeroRecap.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteNumeroRecap.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteNumeroRecap.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNumeroRecap.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNumeroRecap.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteNumeroRecap=new JScrollPane(this.jListColumnasSelectReporteNumeroRecap);
			
			this.jScrollColumnasSelectReporteNumeroRecap.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNumeroRecap.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNumeroRecap.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNumeroRecap.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNumeroRecap.add(this.jListColumnasSelectReporteNumeroRecap, this.gridBagConstraintsNumeroRecap);
		this.jPanelReporteDinamicoNumeroRecap.add(this.jScrollColumnasSelectReporteNumeroRecap, this.gridBagConstraintsNumeroRecap);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteNumeroRecap = new JLabelMe();

		this.jLabelRelacionesSelectReporteNumeroRecap.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteNumeroRecap = new JList<Reporte>();
		this.jListRelacionesSelectReporteNumeroRecap.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteNumeroRecap.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteNumeroRecap.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNumeroRecap.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNumeroRecap.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteNumeroRecap=new JScrollPane(this.jListRelacionesSelectReporteNumeroRecap);
			
			this.jScrollRelacionesSelectReporteNumeroRecap.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNumeroRecap.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNumeroRecap.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoNumeroRecap = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoNumeroRecap = new JComboBoxMe();
		this.jListColumnasValoresGraficoNumeroRecap = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoNumeroRecap = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoNumeroRecap.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoNumeroRecap.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNumeroRecap.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNumeroRecap.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoNumeroRecap = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoNumeroRecap.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoNumeroRecap.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNumeroRecap.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNumeroRecap.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoNumeroRecap = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoNumeroRecap.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNumeroRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNumeroRecap.add(this.jLabelGenerarExcelReporteDinamicoNumeroRecap, this.gridBagConstraintsNumeroRecap);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoNumeroRecap = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoNumeroRecap.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoNumeroRecap,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoNumeroRecap.setToolTipText("Generar EXCEL"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		//this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsNumeroRecap.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsNumeroRecap.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoNumeroRecap.add(this.jButtonGenerarExcelReporteDinamicoNumeroRecap, this.gridBagConstraintsNumeroRecap);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroRecap.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNumeroRecap.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNumeroRecap.add(this.jComboBoxTiposReportesDinamicoNumeroRecap, this.gridBagConstraintsNumeroRecap);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoNumeroRecap = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoNumeroRecap.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNumeroRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNumeroRecap.add(this.jLabelTiposArchivoReporteDinamicoNumeroRecap, this.gridBagConstraintsNumeroRecap);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroRecap.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNumeroRecap.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNumeroRecap.add(this.jComboBoxTiposArchivosReportesDinamicoNumeroRecap, this.gridBagConstraintsNumeroRecap);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoNumeroRecap = new JButtonMe();
		this.jButtonGenerarReporteDinamicoNumeroRecap.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoNumeroRecap,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoNumeroRecap.setToolTipText("Generar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroRecap.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNumeroRecap.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNumeroRecap.add(this.jButtonGenerarReporteDinamicoNumeroRecap, this.gridBagConstraintsNumeroRecap);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoNumeroRecap = new JButtonMe();
		this.jButtonCerrarReporteDinamicoNumeroRecap.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoNumeroRecap,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoNumeroRecap.setToolTipText("Cancelar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroRecap.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNumeroRecap.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNumeroRecap.add(this.jButtonCerrarReporteDinamicoNumeroRecap, this.gridBagConstraintsNumeroRecap);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalNumeroRecap = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoNumeroRecap= new JScrollPane(jPanelReporteDinamicoNumeroRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoNumeroRecap.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNumeroRecap.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNumeroRecap.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Numero Recapes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsNumeroRecap.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoNumeroRecap.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoNumeroRecap.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalNumeroRecap);
		this.jInternalFrameReporteDinamicoNumeroRecap.getContentPane().add(this.jScrollPanelReporteDinamicoNumeroRecap, this.gridBagConstraintsNumeroRecap);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionNumeroRecap() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionNumeroRecap = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionNumeroRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionNumeroRecap.setName("jPanelImportacionNumeroRecap"); 
		
		this.jPanelImportacionNumeroRecap.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNumeroRecap.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNumeroRecap.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionNumeroRecap.setLayout(gridaBagLayoutImportacionNumeroRecap);
		
		
		this.jInternalFrameImportacionNumeroRecap= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionNumeroRecap= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionNumeroRecap = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNumeroRecap= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionNumeroRecap.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNumeroRecap.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNumeroRecap.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionNumeroRecap.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNumeroRecap.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNumeroRecap.setResizable(true);
	    this.jInternalFrameImportacionNumeroRecap.setClosable(true);
	    this.jInternalFrameImportacionNumeroRecap.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionNumeroRecap.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNumeroRecap.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNumeroRecap.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionNumeroRecap.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNumeroRecap.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNumeroRecap.setResizable(true);
	    this.jInternalFrameImportacionNumeroRecap.setClosable(true);
	    this.jInternalFrameImportacionNumeroRecap.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionNumeroRecap.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNumeroRecap.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNumeroRecap.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Numero Recapes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionNumeroRecap = new JLabelMe();

		this.jLabelArchivoImportacionNumeroRecap.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroRecap.gridy = iPosYImportacion;		
		this.gridBagConstraintsNumeroRecap.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNumeroRecap.add(this.jLabelArchivoImportacionNumeroRecap, this.gridBagConstraintsNumeroRecap);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionNumeroRecap = new JFileChooser();		
		this.jFileChooserImportacionNumeroRecap.setToolTipText("ESCOGER ARCHIVO"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionNumeroRecap = new JButtonMe();
		this.jButtonAbrirImportacionNumeroRecap.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionNumeroRecap,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionNumeroRecap.setToolTipText("Generar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroRecap.gridy = iPosYImportacion;
		this.gridBagConstraintsNumeroRecap.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNumeroRecap.add(this.jButtonAbrirImportacionNumeroRecap, this.gridBagConstraintsNumeroRecap);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionNumeroRecap = new JLabelMe();

		this.jLabelPathArchivoImportacionNumeroRecap.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroRecap.gridy = iPosYImportacion;		
		this.gridBagConstraintsNumeroRecap.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNumeroRecap.add(this.jLabelPathArchivoImportacionNumeroRecap, this.gridBagConstraintsNumeroRecap);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionNumeroRecap=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionNumeroRecap.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNumeroRecap.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNumeroRecap.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroRecap.gridy = iPosYImportacion;
		this.gridBagConstraintsNumeroRecap.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNumeroRecap.add(this.jTextFieldPathArchivoImportacionNumeroRecap, this.gridBagConstraintsNumeroRecap);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionNumeroRecap = new JButtonMe();
		this.jButtonGenerarImportacionNumeroRecap.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionNumeroRecap,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionNumeroRecap.setToolTipText("Generar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroRecap.gridy = iPosYImportacion;
		this.gridBagConstraintsNumeroRecap.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNumeroRecap.add(this.jButtonGenerarImportacionNumeroRecap, this.gridBagConstraintsNumeroRecap);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionNumeroRecap = new JButtonMe();
		this.jButtonCerrarImportacionNumeroRecap.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionNumeroRecap,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionNumeroRecap.setToolTipText("Cancelar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroRecap.gridy = iPosYImportacion;
		this.gridBagConstraintsNumeroRecap.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNumeroRecap.add(this.jButtonCerrarImportacionNumeroRecap, this.gridBagConstraintsNumeroRecap);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalNumeroRecap = new GridBagLayout();
		
		this.jScrollPanelImportacionNumeroRecap= new JScrollPane(jPanelImportacionNumeroRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy =iPosYImportacion;
		this.gridBagConstraintsNumeroRecap.gridx =iPosXImportacion;
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionNumeroRecap.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionNumeroRecap.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalNumeroRecap);
		this.jInternalFrameImportacionNumeroRecap.getContentPane().add(this.jScrollPanelImportacionNumeroRecap, this.gridBagConstraintsNumeroRecap);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByNumeroRecap(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByNumeroRecap = new JButtonMe();
			this.jButtonAbrirOrderByNumeroRecap.setText("Orden");
			this.jButtonAbrirOrderByNumeroRecap.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNumeroRecap,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByNumeroRecap";
			inputMap = this.jButtonAbrirOrderByNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByNumeroRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByNumeroRecap"));
		
		
			GridBagLayout gridaBagLayoutOrderByNumeroRecap = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByNumeroRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByNumeroRecap.setName("jPanelOrderByNumeroRecap"); 
			
			this.jPanelOrderByNumeroRecap.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNumeroRecap.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNumeroRecap.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByNumeroRecap.setLayout(gridaBagLayoutOrderByNumeroRecap);
			
			
			this.jTableDatosNumeroRecapOrderBy = new JTableMe();        
			this.jTableDatosNumeroRecapOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosNumeroRecapOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosNumeroRecapOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosNumeroRecapOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosNumeroRecapOrderBy.setViewportView(this.jTableDatosNumeroRecapOrderBy);
			this.jTableDatosNumeroRecapOrderBy.setFillsViewportHeight(true);
			this.jTableDatosNumeroRecapOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByNumeroRecap= new OrderByJInternalFrame();
			this.jInternalFrameOrderByNumeroRecap= new OrderByJInternalFrame();
			this.jScrollPanelOrderByNumeroRecap = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteNumeroRecap= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByNumeroRecap.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByNumeroRecap.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByNumeroRecap.setTitle("Orden");
			this.jInternalFrameOrderByNumeroRecap.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByNumeroRecap.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByNumeroRecap.setResizable(true);
			this.jInternalFrameOrderByNumeroRecap.setClosable(true);
			this.jInternalFrameOrderByNumeroRecap.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByNumeroRecap.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNumeroRecap.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNumeroRecap.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Numero Recapes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.gridy =iPosYOrderBy++;
			this.gridBagConstraintsNumeroRecap.gridx =iPosXOrderBy;
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsNumeroRecap.ipady =150;
				
			this.jPanelOrderByNumeroRecap.add(jScrollPanelDatosNumeroRecapOrderBy, this.gridBagConstraintsNumeroRecap);//this.jTableDatosNumeroRecapTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByNumeroRecap = new JButtonMe();
			this.jButtonCerrarOrderByNumeroRecap.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByNumeroRecap,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByNumeroRecap.setToolTipText("Cancelar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.gridy = iPosYOrderBy++;
			this.gridBagConstraintsNumeroRecap.gridx = iPosXOrderBy;
									
			this.jPanelOrderByNumeroRecap.add(this.jButtonCerrarOrderByNumeroRecap, this.gridBagConstraintsNumeroRecap);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalNumeroRecap = new GridBagLayout();
			
			this.jScrollPanelOrderByNumeroRecap= new JScrollPane(jPanelOrderByNumeroRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.gridy =iPosYOrderBy;
			this.gridBagConstraintsNumeroRecap.gridx =iPosXOrderBy;
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByNumeroRecap.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByNumeroRecap.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalNumeroRecap);
			
			this.jInternalFrameOrderByNumeroRecap.getContentPane().add(this.jScrollPanelOrderByNumeroRecap, this.gridBagConstraintsNumeroRecap);			
		
		} else {
			this.jButtonAbrirOrderByNumeroRecap = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.numerorecapSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosNumeroRecap.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosNumeroRecap.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosNumeroRecap.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosNumeroRecap.getRowHeight();//NumeroRecapConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > NumeroRecapConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNumeroRecap.isSelected()) {
					iHeightTable=NumeroRecapConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NumeroRecapConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NumeroRecapConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > NumeroRecapConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNumeroRecap.isSelected()) {
					iHeightTable=NumeroRecapConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NumeroRecapConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NumeroRecapConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosNumeroRecap.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNumeroRecap.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNumeroRecap.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosNumeroRecap.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNumeroRecap.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNumeroRecap.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByNumeroRecap!=null && this.jInternalFrameOrderByNumeroRecap.getjTableDatosOrderBy()!=null) {
			//if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByNumeroRecap.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByNumeroRecap.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByNumeroRecap.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByNumeroRecap.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByNumeroRecap.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByNumeroRecap.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByNumeroRecap.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosNumeroRecap.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNumeroRecap.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNumeroRecap.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=numerorecapLogic.getNumeroRecaps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=numerorecaps.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<NumeroRecap> TraerNumeroRecapBeans(List<NumeroRecap> numerorecaps,ArrayList<Classe> classes)throws Exception {
		try {
			for(NumeroRecap numerorecap:numerorecaps) {
					
				if(!(NumeroRecapConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || NumeroRecapConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					numerorecap.setsDetalleGeneralEntityReporte(NumeroRecapConstantesFunciones.getNumeroRecapDescripcion(numerorecap));
										
						
					
						
					
				} else  {
							
					//numerorecap.setsDetalleGeneralEntityReporte(numerorecap.getsDetalleGeneralEntityReporte());
										
				}
				
				//numerorecapbeans.add(numerorecapbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return numerorecaps;
    }
	//PARA REPORTES FIN
}
