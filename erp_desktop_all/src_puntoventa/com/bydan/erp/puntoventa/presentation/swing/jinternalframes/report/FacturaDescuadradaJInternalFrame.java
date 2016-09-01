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

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.puntoventa.util.report.FacturaDescuadradaConstantesFunciones;

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
public class FacturaDescuadradaJInternalFrame extends FacturaDescuadradaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFacturaDescuadrada;
	
	protected JMenuBar jmenuBarFacturaDescuadrada;
	
	protected JMenu jmenuFacturaDescuadrada;
	protected JMenu jmenuDatosFacturaDescuadrada;
	protected JMenu jmenuArchivoFacturaDescuadrada;
	protected JMenu jmenuAccionesFacturaDescuadrada;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFacturaDescuadrada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturaDescuadrada;	
	protected GridBagConstraints gridBagConstraintsFacturaDescuadrada;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FacturaDescuadradaDetalleFormJInternalFrame jInternalFrameDetalleFormFacturaDescuadrada;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFacturaDescuadrada;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFacturaDescuadrada;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public FacturaDescuadradaSessionBean facturadescuadradaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FacturaDescuadrada> facturadescuadradas;		
	public List<FacturaDescuadrada> facturadescuadradasEliminados;	
	public List<FacturaDescuadrada> facturadescuadradasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFacturaDescuadrada;		
	protected JButton jButtonAbrirOrderByFacturaDescuadrada;
	
	
	//protected JPanel jPanelOrderByFacturaDescuadrada;
	//public JScrollPane jScrollPanelOrderByFacturaDescuadrada;	
	//protected JButton jButtonCerrarOrderByFacturaDescuadrada;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FacturaDescuadradaLogic facturadescuadradaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFacturaDescuadrada;
	public JScrollPane jScrollPanelDatosEdicionFacturaDescuadrada;
	public JScrollPane jScrollPanelDatosGeneralFacturaDescuadrada;
    
	
	
	//public JScrollPane jScrollPanelDatosFacturaDescuadradaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFacturaDescuadrada;
	//public JScrollPane jScrollPanelImportacionFacturaDescuadrada;
	
	
	
	protected JPanel jPanelAccionesFacturaDescuadrada;
	
    protected JPanel jPanelPaginacionFacturaDescuadrada;
    protected JPanel jPanelParametrosReportesFacturaDescuadrada;
	protected JPanel jPanelParametrosReportesAccionesFacturaDescuadrada;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FacturaDescuadrada;
	protected JPanel jPanelParametrosAuxiliar2FacturaDescuadrada;
	protected JPanel jPanelParametrosAuxiliar3FacturaDescuadrada;
	protected JPanel jPanelParametrosAuxiliar4FacturaDescuadrada;
	//protected JPanel jPanelParametrosAuxiliar5FacturaDescuadrada;
	
	
	
	//protected JPanel jPanelReporteDinamicoFacturaDescuadrada;
	//protected JPanel jPanelImportacionFacturaDescuadrada;
	
	
	public JTable jTableDatosFacturaDescuadrada;
	
	
	
	//public JTable jTableDatosFacturaDescuadradaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFacturaDescuadrada;
	protected JButton jButtonDuplicarFacturaDescuadrada;
	protected JButton jButtonCopiarFacturaDescuadrada;
	protected JButton jButtonVerFormFacturaDescuadrada;
	protected JButton jButtonNuevoRelacionesFacturaDescuadrada;
	protected JButton jButtonModificarFacturaDescuadrada;
	
    protected JButton jButtonGuardarCambiosTablaFacturaDescuadrada;
	protected JButton jButtonCerrarFacturaDescuadrada;
	
	
	protected JButton jButtonRecargarInformacionFacturaDescuadrada;
	protected JButton jButtonProcesarInformacionFacturaDescuadrada;
	
	
	protected JButton jButtonAnterioresFacturaDescuadrada;
	protected JButton jButtonSiguientesFacturaDescuadrada;
	protected JButton jButtonNuevoGuardarCambiosFacturaDescuadrada;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFacturaDescuadrada;
	//protected JButton jButtonCerrarReporteDinamicoFacturaDescuadrada;
	//protected JButton jButtonGenerarExcelReporteDinamicoFacturaDescuadrada;	
	
	
	
	//protected JButton jButtonAbrirImportacionFacturaDescuadrada;
	//protected JButton jButtonGenerarImportacionFacturaDescuadrada;
	//protected JButton jButtonCerrarImportacionFacturaDescuadrada;
	//protected JFileChooser jFileChooserImportacionFacturaDescuadrada;
	//protected File fileImportacionFacturaDescuadrada;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturaDescuadrada;
	protected JButton jButtonDuplicarToolBarFacturaDescuadrada;
	protected JButton jButtonNuevoRelacionesToolBarFacturaDescuadrada;
	
	
	public JButton jButtonGuardarCambiosToolBarFacturaDescuadrada;
	protected JButton jButtonCopiarToolBarFacturaDescuadrada;
	protected JButton jButtonVerFormToolBarFacturaDescuadrada;
	public JButton jButtonGuardarCambiosTablaToolBarFacturaDescuadrada;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturaDescuadrada;
	protected JButton jButtonCerrarToolBarFacturaDescuadrada;
	
	protected JButton jButtonRecargarInformacionToolBarFacturaDescuadrada;
	protected JButton jButtonProcesarInformacionToolBarFacturaDescuadrada;
	protected JButton jButtonAnterioresToolBarFacturaDescuadrada;
	protected JButton jButtonSiguientesToolBarFacturaDescuadrada;
	protected JButton jButtonNuevoGuardarCambiosToolBarFacturaDescuadrada;
	protected JButton jButtonAbrirOrderByToolBarFacturaDescuadrada;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturaDescuadrada;
	protected JMenuItem jMenuItemDuplicarFacturaDescuadrada;
	protected JMenuItem jMenuItemNuevoRelacionesFacturaDescuadrada;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFacturaDescuadrada;
	protected JMenuItem jMenuItemCopiarFacturaDescuadrada;
	protected JMenuItem jMenuItemVerFormFacturaDescuadrada;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturaDescuadrada;
	protected JMenuItem jMenuItemCerrarFacturaDescuadrada;
	protected JMenuItem jMenuItemDetalleCerrarFacturaDescuadrada;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFacturaDescuadrada;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturaDescuadrada;
	
	protected JMenuItem jMenuItemRecargarInformacionFacturaDescuadrada;
	protected JMenuItem jMenuItemProcesarInformacionFacturaDescuadrada;
	protected JMenuItem jMenuItemAnterioresFacturaDescuadrada;
	protected JMenuItem jMenuItemSiguientesFacturaDescuadrada;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturaDescuadrada;
	protected JMenuItem jMenuItemAbrirOrderByFacturaDescuadrada;
	protected JMenuItem jMenuItemMostrarOcultarFacturaDescuadrada;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturaDescuadrada;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFacturaDescuadrada;
	protected JCheckBox jCheckBoxSeleccionadosFacturaDescuadrada;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFacturaDescuadrada;
	protected JCheckBox jCheckBoxConGraficoReporteFacturaDescuadrada;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFacturaDescuadrada;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFacturaDescuadrada;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFacturaDescuadrada;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFacturaDescuadrada;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFacturaDescuadrada;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFacturaDescuadrada;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturaDescuadrada;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturaDescuadrada;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFacturaDescuadrada;
	protected JTextField jTextFieldValorCampoGeneralFacturaDescuadrada;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFacturaDescuadrada;
	//public JList<Reporte> jListColumnasSelectReporteFacturaDescuadrada;
	//public JScrollPane jScrollColumnasSelectReporteFacturaDescuadrada;
	
	//public JLabel jLabelRelacionesSelectReporteFacturaDescuadrada;
	//public JList<Reporte> jListRelacionesSelectReporteFacturaDescuadrada;
	//public JScrollPane jScrollRelacionesSelectReporteFacturaDescuadrada;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFacturaDescuadrada;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFacturaDescuadrada;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFacturaDescuadrada;
	//public JLabel jLabelTiposArchivoReporteDinamicoFacturaDescuadrada;
	
		
	//public JLabel jLabelArchivoImportacionFacturaDescuadrada;	
	//public JLabel jLabelPathArchivoImportacionFacturaDescuadrada;
	//protected JTextField jTextFieldPathArchivoImportacionFacturaDescuadrada;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFacturaDescuadrada;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFacturaDescuadrada;
	
	//public JLabel jLabelColumnaCategoriaValorFacturaDescuadrada;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFacturaDescuadrada;
	
	//public JLabel jLabelColumnasValoresGraficoFacturaDescuadrada;
	//public JList<Reporte> jListColumnasValoresGraficoFacturaDescuadrada;
	//public JScrollPane jScrollColumnasValoresGraficoFacturaDescuadrada;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFacturaDescuadrada;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFacturaDescuadrada;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFacturaDescuadrada;
	public JPanel jPanelBusquedaFacturaDescuadradaFacturaDescuadrada;
	public JButton jButtonBusquedaFacturaDescuadradaFacturaDescuadrada;
	
	public JPanel jPanelfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada;
	public JLabel jLabelfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada;

	public JDateChooser jDateChooserfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada;
	public JButton jButtonfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadradaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada;
	public JLabel jLabelfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada;
	//public JFormattedTextField jDateChooserfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada;

	public JDateChooser jDateChooserfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada;
	public JButton jButtonfecha_finBusquedaFacturaDescuadradaFacturaDescuadradaBusqueda= new JButtonMe();

	
	
	
	
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
	public FacturaDescuadradaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FacturaDescuadrada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDescuadradaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaDescuadrada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDescuadradaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaDescuadrada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDescuadradaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturaDescuadrada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFacturaDescuadrada)	{
		this.jButtonRecargarInformacionFacturaDescuadrada = jButtonRecargarInformacionFacturaDescuadrada;
	}
	
	public JButton getjButtonProcesarInformacionFacturaDescuadrada() {
		return this.jButtonProcesarInformacionFacturaDescuadrada;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturaDescuadrada)	{
		this.jButtonProcesarInformacionFacturaDescuadrada = jButtonProcesarInformacionFacturaDescuadrada;
	}
	
	
	public JButton getjButtonRecargarInformacionFacturaDescuadrada() {
		return this.jButtonRecargarInformacionFacturaDescuadrada;
	}
	
	
	public List<FacturaDescuadrada> getfacturadescuadradas() {
		return this.facturadescuadradas;
	}

	public void setfacturadescuadradas(List<FacturaDescuadrada> facturadescuadradas) {
		this.facturadescuadradas = facturadescuadradas;
	}
	
	public List<FacturaDescuadrada> getfacturadescuadradasAux() {
		return this.facturadescuadradasAux;
	}

	public void setfacturadescuadradasAux(List<FacturaDescuadrada> facturadescuadradasAux) {
		this.facturadescuadradasAux = facturadescuadradasAux;
	}
	
	public List<FacturaDescuadrada> getfacturadescuadradasEliminados() {
		return this.facturadescuadradasEliminados;
	}

	public void setFacturaDescuadradasEliminados(List<FacturaDescuadrada> facturadescuadradasEliminados) {
		this.facturadescuadradasEliminados = facturadescuadradasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFacturaDescuadrada() {
		return jComboBoxTiposSeleccionarFacturaDescuadrada;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFacturaDescuadrada(
			JComboBox jComboBoxTiposSeleccionarFacturaDescuadrada) {
		this.jComboBoxTiposSeleccionarFacturaDescuadrada = jComboBoxTiposSeleccionarFacturaDescuadrada;
	}
	
	public void setBorderResaltarTiposSeleccionarFacturaDescuadrada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFacturaDescuadrada.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFacturaDescuadrada .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFacturaDescuadrada() {
		return jTextFieldValorCampoGeneralFacturaDescuadrada;
	}

	public void setjTextFieldValorCampoGeneralFacturaDescuadrada(
			JTextField jTextFieldValorCampoGeneralFacturaDescuadrada) {
		this.jTextFieldValorCampoGeneralFacturaDescuadrada = jTextFieldValorCampoGeneralFacturaDescuadrada;
	}

	public void setBorderResaltarValorCampoGeneralFacturaDescuadrada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDescuadrada.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFacturaDescuadrada .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFacturaDescuadrada() {
		return this.jCheckBoxSeleccionarTodosFacturaDescuadrada;
	}

	public void setjCheckBoxSeleccionarTodosFacturaDescuadrada(
			JCheckBox jCheckBoxSeleccionarTodosFacturaDescuadrada) {
		this.jCheckBoxSeleccionarTodosFacturaDescuadrada = jCheckBoxSeleccionarTodosFacturaDescuadrada;
	}

	public void setBorderResaltarSeleccionarTodosFacturaDescuadrada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDescuadrada.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFacturaDescuadrada .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFacturaDescuadrada() {
		return this.jCheckBoxSeleccionadosFacturaDescuadrada;
	}

	public void setjCheckBoxSeleccionadosFacturaDescuadrada(
			JCheckBox jCheckBoxSeleccionadosFacturaDescuadrada) {
		this.jCheckBoxSeleccionadosFacturaDescuadrada = jCheckBoxSeleccionadosFacturaDescuadrada;
	}
	
	public void setBorderResaltarSeleccionadosFacturaDescuadrada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDescuadrada.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFacturaDescuadrada .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFacturaDescuadrada() {
		return this.jComboBoxTiposArchivosReportesFacturaDescuadrada;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFacturaDescuadrada(
			JComboBox jComboBoxTiposArchivosReportesFacturaDescuadrada) {
		this.jComboBoxTiposArchivosReportesFacturaDescuadrada = jComboBoxTiposArchivosReportesFacturaDescuadrada;
	}

	public void setBorderResaltarTiposArchivosReportesFacturaDescuadrada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDescuadrada.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFacturaDescuadrada .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFacturaDescuadrada() {
		return this.jComboBoxTiposReportesFacturaDescuadrada;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFacturaDescuadrada(
			JComboBox jComboBoxTiposReportesFacturaDescuadrada) {
		this.jComboBoxTiposReportesFacturaDescuadrada = jComboBoxTiposReportesFacturaDescuadrada;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFacturaDescuadrada() {
	//	return jComboBoxTiposReportesDinamicoFacturaDescuadrada;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFacturaDescuadrada(
	//		JComboBox jComboBoxTiposReportesDinamicoFacturaDescuadrada) {
	//	this.jComboBoxTiposReportesDinamicoFacturaDescuadrada = jComboBoxTiposReportesDinamicoFacturaDescuadrada;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFacturaDescuadrada() {
	//	return jComboBoxTiposArchivosReportesDinamicoFacturaDescuadrada;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFacturaDescuadrada(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFacturaDescuadrada) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFacturaDescuadrada = jComboBoxTiposArchivosReportesDinamicoFacturaDescuadrada;
	//}
	
	public void setBorderResaltarTiposReportesFacturaDescuadrada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDescuadrada.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFacturaDescuadrada .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFacturaDescuadrada() {
		return this.jComboBoxTiposGraficosReportesFacturaDescuadrada;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFacturaDescuadrada(
			JComboBox jComboBoxTiposGraficosReportesFacturaDescuadrada) {
		this.jComboBoxTiposGraficosReportesFacturaDescuadrada = jComboBoxTiposGraficosReportesFacturaDescuadrada;
	}
	
	public void setBorderResaltarTiposGraficosReportesFacturaDescuadrada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDescuadrada.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFacturaDescuadrada .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFacturaDescuadrada() {
		return this.jComboBoxTiposPaginacionFacturaDescuadrada;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFacturaDescuadrada(
			JComboBox jComboBoxTiposPaginacionFacturaDescuadrada) {
		this.jComboBoxTiposPaginacionFacturaDescuadrada = jComboBoxTiposPaginacionFacturaDescuadrada;
	}
	
	public void setBorderResaltarTiposPaginacionFacturaDescuadrada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDescuadrada.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFacturaDescuadrada .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFacturaDescuadrada() {
		return this.jComboBoxTiposRelacionesFacturaDescuadrada;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturaDescuadrada() {
		return this.jComboBoxTiposAccionesFacturaDescuadrada;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturaDescuadrada(
			JComboBox jComboBoxTiposRelacionesFacturaDescuadrada) {
		this.jComboBoxTiposRelacionesFacturaDescuadrada = jComboBoxTiposRelacionesFacturaDescuadrada;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturaDescuadrada(
			JComboBox jComboBoxTiposAccionesFacturaDescuadrada) {
		this.jComboBoxTiposAccionesFacturaDescuadrada = jComboBoxTiposAccionesFacturaDescuadrada;
	}
	
	public void setBorderResaltarTiposRelacionesFacturaDescuadrada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDescuadrada.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFacturaDescuadrada .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFacturaDescuadrada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDescuadrada.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFacturaDescuadrada .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFacturaDescuadrada() {
	//	return jCheckBoxConGraficoDinamicoFacturaDescuadrada;
	//}

	//public void setjCheckBoxConGraficoDinamicoFacturaDescuadrada(
	//		JCheckBox jCheckBoxConGraficoDinamicoFacturaDescuadrada) {
	//	this.jCheckBoxConGraficoDinamicoFacturaDescuadrada = jCheckBoxConGraficoDinamicoFacturaDescuadrada;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFacturaDescuadrada() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFacturaDescuadrada.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFacturaDescuadrada .setBorder(borderResaltar);		
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
		this.facturadescuadradaSessionBean=new FacturaDescuadradaSessionBean();
		
		this.facturadescuadradaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturadescuadradaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturadescuadradaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FacturaDescuadradaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FacturaDescuadradaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturaDescuadradaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturaDescuadradaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturaDescuadradaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Factura Descuadrada MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
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
		
		FacturaDescuadradaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FacturaDescuadrada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFacturaDescuadrada= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFacturaDescuadrada,this.jTtoolBarFacturaDescuadrada,
							"nuevo","nuevo","Nuevo"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFacturaDescuadrada,this.jTtoolBarFacturaDescuadrada,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFacturaDescuadrada,this.jTtoolBarFacturaDescuadrada,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFacturaDescuadrada,this.jTtoolBarFacturaDescuadrada,
							"duplicar","duplicar","Duplicar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFacturaDescuadrada,this.jTtoolBarFacturaDescuadrada,
							"copiar","copiar","Copiar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFacturaDescuadrada,this.jTtoolBarFacturaDescuadrada,
							"ver_form","ver_form","Ver"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaDescuadrada,this.jTtoolBarFacturaDescuadrada,
							"recargar","recargar","Buscar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaDescuadrada,this.jTtoolBarFacturaDescuadrada,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaDescuadrada,this.jTtoolBarFacturaDescuadrada,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFacturaDescuadrada,this.jTtoolBarFacturaDescuadrada,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFacturaDescuadrada,this.jTtoolBarFacturaDescuadrada,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFacturaDescuadrada,this.jTtoolBarFacturaDescuadrada,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFacturaDescuadrada,this.jTtoolBarFacturaDescuadrada,
							"cerrar","cerrar","Salir"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFacturaDescuadrada=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFacturaDescuadrada;
			
				this.jButtonProcesarInformacionToolBarFacturaDescuadrada=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFacturaDescuadrada;
				
		//protected JButton jButtonModificarToolBarFacturaDescuadrada;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFacturaDescuadrada=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFacturaDescuadrada=new JMenuMe("General");
		this.jmenuArchivoFacturaDescuadrada=new JMenuMe("Archivo");
		this.jmenuAccionesFacturaDescuadrada=new JMenuMe("Acciones");
		this.jmenuDatosFacturaDescuadrada=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturaDescuadrada= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturaDescuadrada.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturaDescuadrada,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFacturaDescuadrada= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFacturaDescuadrada.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFacturaDescuadrada,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFacturaDescuadrada= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFacturaDescuadrada.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFacturaDescuadrada,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFacturaDescuadrada= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturaDescuadrada.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturaDescuadrada,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFacturaDescuadrada= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFacturaDescuadrada.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFacturaDescuadrada,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFacturaDescuadrada= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFacturaDescuadrada.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFacturaDescuadrada,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFacturaDescuadrada= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFacturaDescuadrada.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFacturaDescuadrada,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturaDescuadrada= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturaDescuadrada.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturaDescuadrada,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFacturaDescuadrada= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFacturaDescuadrada.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFacturaDescuadrada,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFacturaDescuadrada= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFacturaDescuadrada.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFacturaDescuadrada,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFacturaDescuadrada= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFacturaDescuadrada.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFacturaDescuadrada,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFacturaDescuadrada= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFacturaDescuadrada.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFacturaDescuadrada,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFacturaDescuadrada= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFacturaDescuadrada.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFacturaDescuadrada,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturaDescuadrada= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturaDescuadrada.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturaDescuadrada,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFacturaDescuadrada= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFacturaDescuadrada.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFacturaDescuadrada,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturaDescuadrada= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturaDescuadrada.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturaDescuadrada,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFacturaDescuadrada= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFacturaDescuadrada.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFacturaDescuadrada,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFacturaDescuadrada.add(this.jMenuItemCerrarFacturaDescuadrada);
			
			this.jmenuAccionesFacturaDescuadrada.add(this.jMenuItemNuevoFacturaDescuadrada);
			this.jmenuAccionesFacturaDescuadrada.add(this.jMenuItemNuevoGuardarCambiosFacturaDescuadrada);
			this.jmenuAccionesFacturaDescuadrada.add(this.jMenuItemNuevoRelacionesFacturaDescuadrada);
			this.jmenuAccionesFacturaDescuadrada.add(this.jMenuItemGuardarCambiosTablaFacturaDescuadrada);		
			this.jmenuAccionesFacturaDescuadrada.add(this.jMenuItemDuplicarFacturaDescuadrada);		
			this.jmenuAccionesFacturaDescuadrada.add(this.jMenuItemCopiarFacturaDescuadrada);		
			this.jmenuAccionesFacturaDescuadrada.add(this.jMenuItemVerFormFacturaDescuadrada);		
			
			this.jmenuDatosFacturaDescuadrada.add(this.jMenuItemRecargarInformacionFacturaDescuadrada);				
			this.jmenuDatosFacturaDescuadrada.add(this.jMenuItemAnterioresFacturaDescuadrada);				
			this.jmenuDatosFacturaDescuadrada.add(this.jMenuItemSiguientesFacturaDescuadrada);				
			this.jmenuDatosFacturaDescuadrada.add(this.jMenuItemAbrirOrderByFacturaDescuadrada);				
			this.jmenuDatosFacturaDescuadrada.add(this.jMenuItemMostrarOcultarFacturaDescuadrada);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFacturaDescuadrada.add(this.jMenuItemGuardarCambiosFacturaDescuadrada);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFacturaDescuadrada.add(this.jmenuArchivoFacturaDescuadrada);		
			this.jmenuBarFacturaDescuadrada.add(this.jmenuAccionesFacturaDescuadrada);		
			this.jmenuBarFacturaDescuadrada.add(this.jmenuDatosFacturaDescuadrada);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFacturaDescuadrada);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFacturaDescuadrada() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaFacturaDescuadradaFacturaDescuadrada=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaFacturaDescuadradaFacturaDescuadrada.setToolTipText("Buscar Por Fecha Inicio Por Fecha Fin ");
		this.jButtonBusquedaFacturaDescuadradaFacturaDescuadrada= new JButtonMe();
		this.jButtonBusquedaFacturaDescuadradaFacturaDescuadrada.setText("Buscar");
		this.jButtonBusquedaFacturaDescuadradaFacturaDescuadrada.setToolTipText("Buscar Por Fecha Inicio Por Fecha Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaFacturaDescuadradaFacturaDescuadrada,"buscar_button","Buscar Por Fecha Inicio Por Fecha Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaFacturaDescuadradaFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada = new JLabelMe();
		jLabelfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada= new JDateChooser();
		jDateChooserfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada.setDate(new Date());
		jDateChooserfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada = new JLabelMe();
		jLabelfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada.setText("Fecha Fin :");
		jLabelfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada.setToolTipText("Fecha Fin");
		jLabelfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada= new JDateChooser();
		jDateChooserfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada.setDate(new Date());
		jDateChooserfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasFacturaDescuadrada=new JTabbedPane();


		this.jTabbedPaneBusquedasFacturaDescuadrada.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFacturaDescuadrada.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFacturaDescuadrada.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFacturaDescuadrada.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFacturaDescuadrada = new FacturaDescuadradaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Factura Descuadrada DATOS");
			this.jInternalFrameDetalleFormFacturaDescuadrada = new FacturaDescuadradaDetalleFormJInternalFrame(jDesktopPane,this.facturadescuadradaSessionBean.getConGuardarRelaciones(),this.facturadescuadradaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFacturaDescuadrada = null;//new FacturaDescuadradaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturaDescuadrada= new GridBagLayout();
		
		
		this.jTableDatosFacturaDescuadrada = new JTableMe();      
		
		String sToolTipFacturaDescuadrada="";
		sToolTipFacturaDescuadrada=FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturaDescuadrada+="(PuntoVenta.FacturaDescuadrada)";
		}
		
		if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturaDescuadrada+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFacturaDescuadrada.setToolTipText(sToolTipFacturaDescuadrada);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFacturaDescuadrada);
		this.jTableDatosFacturaDescuadrada.setAutoCreateRowSorter(true);
		this.jTableDatosFacturaDescuadrada.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFacturaDescuadrada.setRowSelectionAllowed(true);
		this.jTableDatosFacturaDescuadrada.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFacturaDescuadrada = new JButtonMe();
		this.jButtonDuplicarFacturaDescuadrada = new JButtonMe();
		this.jButtonCopiarFacturaDescuadrada = new JButtonMe();
		this.jButtonVerFormFacturaDescuadrada = new JButtonMe();
		this.jButtonNuevoRelacionesFacturaDescuadrada = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFacturaDescuadrada = new JButtonMe();
		this.jButtonCerrarFacturaDescuadrada = new JButtonMe();
		
		this.jScrollPanelDatosFacturaDescuadrada = new JScrollPane();   
        this.jScrollPanelDatosGeneralFacturaDescuadrada = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFacturaDescuadrada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Factura Descuadrada";
		
		if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Descuadradas" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturaDescuadrada.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturaDescuadrada.setToolTipText("Acciones");
        this.jPanelAccionesFacturaDescuadrada.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFacturaDescuadrada=new ReporteDinamicoJInternalFrame(FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFacturaDescuadrada();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFacturaDescuadrada=new ImportacionJInternalFrame(FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFacturaDescuadrada();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFacturaDescuadrada = new JButtonMe();
		
		this.jButtonAbrirOrderByFacturaDescuadrada.setText("Orden");
		this.jButtonAbrirOrderByFacturaDescuadrada.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturaDescuadrada,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFacturaDescuadrada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturaDescuadrada=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaDescuadrada,false,this);
			
			//this.cargarOrderByFacturaDescuadrada(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturaDescuadrada=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaDescuadrada,true,this);
			
			//this.cargarOrderByFacturaDescuadrada(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFacturaDescuadrada.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosFacturaDescuadrada.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosFacturaDescuadrada.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosFacturaDescuadrada.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturaDescuadrada.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturaDescuadrada.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFacturaDescuadrada.setText("Nuevo");
		this.jButtonDuplicarFacturaDescuadrada.setText("Duplicar");
		this.jButtonCopiarFacturaDescuadrada.setText("Copiar");
		this.jButtonVerFormFacturaDescuadrada.setText("Ver");
		this.jButtonNuevoRelacionesFacturaDescuadrada.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFacturaDescuadrada.setText("Guardar");
		this.jButtonCerrarFacturaDescuadrada.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturaDescuadrada,"nuevo_button","Nuevo",this.facturadescuadradaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFacturaDescuadrada,"duplicar_button","Duplicar",this.facturadescuadradaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFacturaDescuadrada,"copiar_button","Copiar",this.facturadescuadradaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFacturaDescuadrada,"ver_form","Ver",this.facturadescuadradaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFacturaDescuadrada,"nuevorelaciones_button","Nuevo Rel",this.facturadescuadradaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturaDescuadrada,"guardarcambiostabla_button","Guardar",this.facturadescuadradaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturaDescuadrada,"cerrar_button","Salir",this.facturadescuadradaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFacturaDescuadrada.setToolTipText("Nuevo"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFacturaDescuadrada.setToolTipText("Duplicar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFacturaDescuadrada.setToolTipText("Copiar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFacturaDescuadrada.setToolTipText("Ver"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFacturaDescuadrada.setToolTipText("Nuevo Rel"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFacturaDescuadrada.setToolTipText("Guardar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturaDescuadrada.setToolTipText("Salir"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturaDescuadrada";
		inputMap = this.jButtonNuevoFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturaDescuadrada.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturaDescuadrada"));
		
		//DUPLICAR
		sMapKey = "DuplicarFacturaDescuadrada";
		inputMap = this.jButtonDuplicarFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFacturaDescuadrada.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFacturaDescuadrada"));
		
		//COPIAR
		sMapKey = "CopiarFacturaDescuadrada";
		inputMap = this.jButtonCopiarFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFacturaDescuadrada.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFacturaDescuadrada"));
		
		//VEr FORM
		sMapKey = "VerFormFacturaDescuadrada";
		inputMap = this.jButtonVerFormFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFacturaDescuadrada.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFacturaDescuadrada"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFacturaDescuadrada";
		inputMap = this.jButtonNuevoRelacionesFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFacturaDescuadrada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFacturaDescuadrada"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFacturaDescuadrada";
		inputMap = this.jButtonModificarFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFacturaDescuadrada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFacturaDescuadrada"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFacturaDescuadrada";
		inputMap = this.jButtonCerrarFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturaDescuadrada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturaDescuadrada"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturaDescuadrada";
		inputMap = this.jButtonGuardarCambiosTablaFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturaDescuadrada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturaDescuadrada"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFacturaDescuadrada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFacturaDescuadrada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFacturaDescuadrada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FacturaDescuadrada= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FacturaDescuadrada= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FacturaDescuadrada= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FacturaDescuadrada= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FacturaDescuadrada= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFacturaDescuadrada.setName("jPanelParametrosReportesFacturaDescuadrada"); 
		
		this.jPanelParametrosReportesAccionesFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFacturaDescuadrada.setName("jPanelParametrosReportesAccionesFacturaDescuadrada"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFacturaDescuadrada = new JButtonMe();
		this.jButtonRecargarInformacionFacturaDescuadrada.setText("Buscar");
		this.jButtonRecargarInformacionFacturaDescuadrada.setToolTipText("Buscar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFacturaDescuadrada,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionFacturaDescuadrada.setVisible(false);
		
		
		this.jButtonProcesarInformacionFacturaDescuadrada = new JButtonMe();
		this.jButtonProcesarInformacionFacturaDescuadrada.setText("Procesar");
		this.jButtonProcesarInformacionFacturaDescuadrada.setToolTipText("Procesar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFacturaDescuadrada.setVisible(false);
			
		this.jButtonProcesarInformacionFacturaDescuadrada.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturaDescuadrada.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturaDescuadrada.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFacturaDescuadrada = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaDescuadrada.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFacturaDescuadrada.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFacturaDescuadrada = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaDescuadrada.setText("TIPO");       
		this.jComboBoxTiposReportesFacturaDescuadrada.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFacturaDescuadrada = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaDescuadrada.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFacturaDescuadrada.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFacturaDescuadrada = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFacturaDescuadrada.setText("Paginacion");
		this.jComboBoxTiposPaginacionFacturaDescuadrada.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFacturaDescuadrada = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFacturaDescuadrada.setText("Accion");
		this.jComboBoxTiposRelacionesFacturaDescuadrada.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFacturaDescuadrada = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturaDescuadrada.setText("Accion");
		this.jComboBoxTiposAccionesFacturaDescuadrada.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFacturaDescuadrada = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFacturaDescuadrada.setText("Accion");
		this.jComboBoxTiposSeleccionarFacturaDescuadrada.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFacturaDescuadrada=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFacturaDescuadrada.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturaDescuadrada.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturaDescuadrada.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFacturaDescuadrada = new JLabelMe();
		
		this.jLabelAccionesFacturaDescuadrada.setText("Acciones");		
		this.jLabelAccionesFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFacturaDescuadrada = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFacturaDescuadrada.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFacturaDescuadrada.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFacturaDescuadrada = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFacturaDescuadrada.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFacturaDescuadrada.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFacturaDescuadrada = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFacturaDescuadrada.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFacturaDescuadrada.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFacturaDescuadrada = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFacturaDescuadrada.setText("Graf.");
		this.jCheckBoxConGraficoReporteFacturaDescuadrada.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFacturaDescuadrada = new JButtonMe();
		//this.jButtonAnterioresFacturaDescuadrada.setText("<<");
        this.jButtonAnterioresFacturaDescuadrada.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFacturaDescuadrada,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFacturaDescuadrada = new JButtonMe();
		//this.jButtonSiguientesFacturaDescuadrada.setText(">>");
        this.jButtonSiguientesFacturaDescuadrada.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFacturaDescuadrada,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFacturaDescuadrada = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFacturaDescuadrada.setText("Nue");
        this.jButtonNuevoGuardarCambiosFacturaDescuadrada.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFacturaDescuadrada,"nuevoguardarcambios_button","Nue",this.facturadescuadradaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFacturaDescuadrada";
		inputMap = this.jButtonNuevoGuardarCambiosFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFacturaDescuadrada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFacturaDescuadrada"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFacturaDescuadrada";
		inputMap = this.jButtonRecargarInformacionFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFacturaDescuadrada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFacturaDescuadrada"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFacturaDescuadrada";
		inputMap = this.jButtonSiguientesFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFacturaDescuadrada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFacturaDescuadrada"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFacturaDescuadrada";
		inputMap = this.jButtonAnterioresFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFacturaDescuadrada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFacturaDescuadrada"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFacturaDescuadrada();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFacturaDescuadrada.setMinimumSize(new Dimension(this.getWidth(),FacturaDescuadradaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaDescuadradaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturaDescuadrada.setMaximumSize(new Dimension(this.getWidth(),FacturaDescuadradaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaDescuadradaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturaDescuadrada.setPreferredSize(new Dimension(this.getWidth(),FacturaDescuadradaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaDescuadradaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFacturaDescuadrada = new GridBagLayout();

			this.jPanelPaginacionFacturaDescuadrada.setLayout(gridaBagLayoutPaginacionFacturaDescuadrada);						
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
			this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFacturaDescuadrada.add(this.jButtonAnterioresFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
					
						
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
			
			this.jPanelPaginacionFacturaDescuadrada.add(this.jButtonNuevoGuardarCambiosFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
						
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
			this.jPanelPaginacionFacturaDescuadrada.add(this.jButtonSiguientesFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy = 1;
			this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturaDescuadrada.add(this.jButtonNuevoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
						
			
			
			if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
				this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFacturaDescuadrada.gridy = 1;
				this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFacturaDescuadrada.add(this.jButtonGuardarCambiosTablaFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
			}
			
			
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy = 1;
			this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturaDescuadrada.add(this.jButtonDuplicarFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy = 1;
			this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturaDescuadrada.add(this.jButtonCopiarFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy = 1;
			this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturaDescuadrada.add(this.jButtonVerFormFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy = 1;
			this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFacturaDescuadrada.add(this.jButtonCerrarFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
		
		
		this.jButtonRecargarInformacionFacturaDescuadrada.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturaDescuadrada.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturaDescuadrada.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFacturaDescuadrada.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturaDescuadrada.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturaDescuadrada.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFacturaDescuadrada.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturaDescuadrada.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturaDescuadrada.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFacturaDescuadrada.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturaDescuadrada.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturaDescuadrada.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFacturaDescuadrada.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturaDescuadrada.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturaDescuadrada.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFacturaDescuadrada.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturaDescuadrada.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturaDescuadrada.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFacturaDescuadrada.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaDescuadrada.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaDescuadrada.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFacturaDescuadrada.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturaDescuadrada.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturaDescuadrada.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFacturaDescuadrada.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturaDescuadrada.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturaDescuadrada.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFacturaDescuadrada.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturaDescuadrada.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturaDescuadrada.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFacturaDescuadrada.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturaDescuadrada.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturaDescuadrada.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFacturaDescuadrada.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturaDescuadrada.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturaDescuadrada.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFacturaDescuadrada = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFacturaDescuadrada = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FacturaDescuadrada = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FacturaDescuadrada = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FacturaDescuadrada = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FacturaDescuadrada = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFacturaDescuadrada.setLayout(gridaBagParametrosReportesFacturaDescuadrada);
			this.jPanelParametrosReportesAccionesFacturaDescuadrada.setLayout(gridaBagParametrosReportesAccionesFacturaDescuadrada);
			
			
			this.jPanelParametrosAuxiliar1FacturaDescuadrada.setLayout(gridaBagParametrosAuxiliar1FacturaDescuadrada);
			this.jPanelParametrosAuxiliar2FacturaDescuadrada.setLayout(gridaBagParametrosAuxiliar2FacturaDescuadrada);
			this.jPanelParametrosAuxiliar3FacturaDescuadrada.setLayout(gridaBagParametrosAuxiliar3FacturaDescuadrada);
			this.jPanelParametrosAuxiliar4FacturaDescuadrada.setLayout(gridaBagParametrosAuxiliar4FacturaDescuadrada);
			//this.jPanelParametrosAuxiliar5FacturaDescuadrada.setLayout(gridaBagParametrosAuxiliar2FacturaDescuadrada);			
			
			
			
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDescuadrada.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaDescuadrada.add(this.jButtonRecargarInformacionFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDescuadrada.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaDescuadrada.add(this.jComboBoxTiposPaginacionFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDescuadrada.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaDescuadrada.add(this.jCheckBoxConAltoMaximoTablaFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDescuadrada.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaDescuadrada.add(this.jComboBoxTiposArchivosReportesFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDescuadrada.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaDescuadrada.add(this.jPanelParametrosAuxiliar1FacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDescuadrada.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FacturaDescuadrada.add(this.jComboBoxTiposReportesFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);																		
			
			
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDescuadrada.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FacturaDescuadrada.add(this.jComboBoxTiposGraficosReportesFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDescuadrada.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaDescuadrada.add(this.jPanelParametrosAuxiliar4FacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDescuadrada.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaDescuadrada.add(this.jComboBoxTiposReportesFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDescuadrada.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaDescuadrada.add(this.jCheckBoxGenerarReporteFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDescuadrada.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaDescuadrada.add(this.jPanelParametrosAuxiliar2FacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDescuadrada.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaDescuadrada.add(this.jLabelAccionesFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
				this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFacturaDescuadrada.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFacturaDescuadrada.add(this.jButtonAbrirOrderByFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDescuadrada.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaDescuadrada.add(this.jComboBoxTiposSeleccionarFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);			
			
			
			/*
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDescuadrada.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaDescuadrada.add(this.jCheckBoxSeleccionarTodosFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDescuadrada.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaDescuadrada.add(this.jCheckBoxConGraficoReporteFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDescuadrada.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaDescuadrada.add(this.jCheckBoxSeleccionarTodosFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);															
				
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDescuadrada.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaDescuadrada.add(this.jCheckBoxSeleccionadosFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);															
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDescuadrada.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaDescuadrada.add(this.jCheckBoxConGraficoReporteFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDescuadrada.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaDescuadrada.add(this.jPanelParametrosAuxiliar3FacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDescuadrada.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaDescuadrada.add(this.jComboBoxTiposAccionesFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFacturaDescuadrada = new GridBagLayout();

			this.jScrollPanelDatosFacturaDescuadrada.setLayout(gridaBagLayoutDatosFacturaDescuadrada);
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
			this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
			
			this.jScrollPanelDatosFacturaDescuadrada.add(this.jTableDatosFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFacturaDescuadrada.setViewportView(this.jTableDatosFacturaDescuadrada);
		this.jTableDatosFacturaDescuadrada.setFillsViewportHeight(true);
		this.jTableDatosFacturaDescuadrada.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFacturaDescuadrada= new GridBagLayout();
		this.jPanelAccionesFacturaDescuadrada.setLayout(gridaBagLayoutAccionesFacturaDescuadrada);
		
		
		/*	
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
			
		this.jPanelAccionesFacturaDescuadrada.add(this.jButtonNuevoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaFacturaDescuadradaFacturaDescuadrada= new GridBagLayout();
		gridaBagLayoutBusquedaFacturaDescuadradaFacturaDescuadrada.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaFacturaDescuadradaFacturaDescuadrada.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaFacturaDescuadradaFacturaDescuadrada.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaFacturaDescuadradaFacturaDescuadrada.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaFacturaDescuadradaFacturaDescuadrada.setLayout(gridaBagLayoutBusquedaFacturaDescuadradaFacturaDescuadrada);

		gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaDescuadrada.gridy = 0;
		gridBagConstraintsFacturaDescuadrada.gridx = 0;
		jPanelBusquedaFacturaDescuadradaFacturaDescuadrada.add(jLabelfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada, gridBagConstraintsFacturaDescuadrada);

		gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaDescuadrada.gridy = 0;
		gridBagConstraintsFacturaDescuadrada.gridx = 1;
		jPanelBusquedaFacturaDescuadradaFacturaDescuadrada.add(jDateChooserfecha_inicioBusquedaFacturaDescuadradaFacturaDescuadrada, gridBagConstraintsFacturaDescuadrada);


		gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaDescuadrada.gridy = 1;
		gridBagConstraintsFacturaDescuadrada.gridx = 0;
		jPanelBusquedaFacturaDescuadradaFacturaDescuadrada.add(jLabelfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada, gridBagConstraintsFacturaDescuadrada);

		gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaDescuadrada.gridy = 1;
		gridBagConstraintsFacturaDescuadrada.gridx = 1;
		jPanelBusquedaFacturaDescuadradaFacturaDescuadrada.add(jDateChooserfecha_finBusquedaFacturaDescuadradaFacturaDescuadrada, gridBagConstraintsFacturaDescuadrada);

		gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaDescuadrada.gridy = 2;
		gridBagConstraintsFacturaDescuadrada.gridx =1;
		jPanelBusquedaFacturaDescuadradaFacturaDescuadrada.add(jButtonBusquedaFacturaDescuadradaFacturaDescuadrada, gridBagConstraintsFacturaDescuadrada);

		jTabbedPaneBusquedasFacturaDescuadrada.addTab("1.-Por Fecha Inicio Por Fecha Fin ", jPanelBusquedaFacturaDescuadradaFacturaDescuadrada);
		jTabbedPaneBusquedasFacturaDescuadrada.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturaDescuadrada = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturaDescuadrada);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();						
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaDescuadrada.gridx = 0;		
			//this.gridBagConstraintsFacturaDescuadrada.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturaDescuadrada.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 0;		
		//this.gridBagConstraintsFacturaDescuadrada.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFacturaDescuadrada.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFacturaDescuadrada);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaDescuadrada.gridx = 0;		
			this.gridBagConstraintsFacturaDescuadrada.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFacturaDescuadrada.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);								
		
		
		/*
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		*/		
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturaDescuadrada.gridx =0;
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturaDescuadrada.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
				
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FacturaDescuadradaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFacturaDescuadrada= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturaDescuadrada = new GridBagLayout();
			this.jPanelBusquedasParametrosFacturaDescuadrada.setLayout(gridaBagLayoutBusquedasParametrosFacturaDescuadrada);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFacturaDescuadrada=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturaDescuadrada.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaDescuadrada.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaDescuadrada.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
			
			
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
			
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDescuadrada.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFacturaDescuadrada;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFacturaDescuadrada() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFacturaDescuadrada = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFacturaDescuadrada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFacturaDescuadrada.setName("jPanelReporteDinamicoFacturaDescuadrada"); 
		
		this.jPanelReporteDinamicoFacturaDescuadrada.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturaDescuadrada.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturaDescuadrada.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFacturaDescuadrada.setLayout(gridaBagLayoutReporteDinamicoFacturaDescuadrada);
		
		
		this.jInternalFrameReporteDinamicoFacturaDescuadrada= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFacturaDescuadrada = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturaDescuadrada= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFacturaDescuadrada.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFacturaDescuadrada.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFacturaDescuadrada.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFacturaDescuadrada.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFacturaDescuadrada.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFacturaDescuadrada.setResizable(true);
	    this.jInternalFrameReporteDinamicoFacturaDescuadrada.setClosable(true);
	    this.jInternalFrameReporteDinamicoFacturaDescuadrada.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFacturaDescuadrada.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturaDescuadrada.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturaDescuadrada.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Descuadradas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFacturaDescuadrada = new JLabelMe();

		this.jLabelColumnasSelectReporteFacturaDescuadrada.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jLabelColumnasSelectReporteFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFacturaDescuadrada = new JList<Reporte>();
		this.jListColumnasSelectReporteFacturaDescuadrada.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFacturaDescuadrada.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFacturaDescuadrada.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturaDescuadrada.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturaDescuadrada.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFacturaDescuadrada=new JScrollPane(this.jListColumnasSelectReporteFacturaDescuadrada);
			
			this.jScrollColumnasSelectReporteFacturaDescuadrada.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturaDescuadrada.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturaDescuadrada.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jListColumnasSelectReporteFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jScrollColumnasSelectReporteFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFacturaDescuadrada = new JLabelMe();

		this.jLabelRelacionesSelectReporteFacturaDescuadrada.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFacturaDescuadrada = new JList<Reporte>();
		this.jListRelacionesSelectReporteFacturaDescuadrada.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFacturaDescuadrada.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFacturaDescuadrada.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturaDescuadrada.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturaDescuadrada.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFacturaDescuadrada=new JScrollPane(this.jListRelacionesSelectReporteFacturaDescuadrada);
			
			this.jScrollRelacionesSelectReporteFacturaDescuadrada.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturaDescuadrada.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturaDescuadrada.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFacturaDescuadrada = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFacturaDescuadrada = new JComboBoxMe();
		this.jListColumnasValoresGraficoFacturaDescuadrada = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFacturaDescuadrada = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFacturaDescuadrada.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFacturaDescuadrada.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturaDescuadrada.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturaDescuadrada.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFacturaDescuadrada = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFacturaDescuadrada.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFacturaDescuadrada.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturaDescuadrada.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturaDescuadrada.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFacturaDescuadrada = new JLabelMe();

		this.jLabelConGraficoDinamicoFacturaDescuadrada.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jLabelConGraficoDinamicoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFacturaDescuadrada = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFacturaDescuadrada.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFacturaDescuadrada.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFacturaDescuadrada.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturaDescuadrada.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturaDescuadrada.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jCheckBoxConGraficoDinamicoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFacturaDescuadrada = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFacturaDescuadrada.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jLabelColumnaCategoriaGraficoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFacturaDescuadrada = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturaDescuadrada.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFacturaDescuadrada.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFacturaDescuadrada.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturaDescuadrada.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturaDescuadrada.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jComboBoxColumnaCategoriaGraficoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFacturaDescuadrada = new JLabelMe();

		this.jLabelColumnaCategoriaValorFacturaDescuadrada.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jLabelColumnaCategoriaValorFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFacturaDescuadrada = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFacturaDescuadrada.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFacturaDescuadrada.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFacturaDescuadrada.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturaDescuadrada.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturaDescuadrada.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jComboBoxColumnaCategoriaValorFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFacturaDescuadrada = new JLabelMe();

		this.jLabelColumnasValoresGraficoFacturaDescuadrada.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jLabelColumnasValoresGraficoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFacturaDescuadrada = new JList<Reporte>();
		this.jListColumnasValoresGraficoFacturaDescuadrada.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFacturaDescuadrada.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFacturaDescuadrada.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturaDescuadrada.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturaDescuadrada.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFacturaDescuadrada=new JScrollPane(this.jListColumnasValoresGraficoFacturaDescuadrada);
			
			this.jScrollColumnasValoresGraficoFacturaDescuadrada.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturaDescuadrada.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturaDescuadrada.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jListColumnasSelectReporteFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jScrollColumnasValoresGraficoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFacturaDescuadrada = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFacturaDescuadrada.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jLabelTiposGraficosReportesDinamicoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFacturaDescuadrada = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturaDescuadrada.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFacturaDescuadrada.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFacturaDescuadrada.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturaDescuadrada.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturaDescuadrada.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jComboBoxTiposGraficosReportesDinamicoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFacturaDescuadrada = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFacturaDescuadrada.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jLabelGenerarExcelReporteDinamicoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFacturaDescuadrada = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFacturaDescuadrada.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFacturaDescuadrada,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFacturaDescuadrada.setToolTipText("Generar EXCEL"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jButtonGenerarExcelReporteDinamicoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jComboBoxTiposReportesDinamicoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFacturaDescuadrada = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFacturaDescuadrada.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jLabelTiposArchivoReporteDinamicoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jComboBoxTiposArchivosReportesDinamicoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFacturaDescuadrada = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFacturaDescuadrada.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFacturaDescuadrada,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFacturaDescuadrada.setToolTipText("Generar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jButtonGenerarReporteDinamicoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFacturaDescuadrada = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFacturaDescuadrada.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFacturaDescuadrada,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFacturaDescuadrada.setToolTipText("Cancelar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaDescuadrada.add(this.jButtonCerrarReporteDinamicoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFacturaDescuadrada = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFacturaDescuadrada= new JScrollPane(jPanelReporteDinamicoFacturaDescuadrada,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFacturaDescuadrada.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturaDescuadrada.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturaDescuadrada.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Descuadradas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFacturaDescuadrada.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFacturaDescuadrada.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFacturaDescuadrada.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFacturaDescuadrada);
		this.jInternalFrameReporteDinamicoFacturaDescuadrada.getContentPane().add(this.jScrollPanelReporteDinamicoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFacturaDescuadrada() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFacturaDescuadrada = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFacturaDescuadrada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFacturaDescuadrada.setName("jPanelImportacionFacturaDescuadrada"); 
		
		this.jPanelImportacionFacturaDescuadrada.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturaDescuadrada.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturaDescuadrada.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFacturaDescuadrada.setLayout(gridaBagLayoutImportacionFacturaDescuadrada);
		
		
		this.jInternalFrameImportacionFacturaDescuadrada= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFacturaDescuadrada= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFacturaDescuadrada = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturaDescuadrada= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFacturaDescuadrada.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturaDescuadrada.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturaDescuadrada.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFacturaDescuadrada.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturaDescuadrada.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturaDescuadrada.setResizable(true);
	    this.jInternalFrameImportacionFacturaDescuadrada.setClosable(true);
	    this.jInternalFrameImportacionFacturaDescuadrada.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFacturaDescuadrada.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturaDescuadrada.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturaDescuadrada.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFacturaDescuadrada.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturaDescuadrada.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturaDescuadrada.setResizable(true);
	    this.jInternalFrameImportacionFacturaDescuadrada.setClosable(true);
	    this.jInternalFrameImportacionFacturaDescuadrada.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFacturaDescuadrada.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturaDescuadrada.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturaDescuadrada.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Descuadradas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFacturaDescuadrada = new JLabelMe();

		this.jLabelArchivoImportacionFacturaDescuadrada.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturaDescuadrada.add(this.jLabelArchivoImportacionFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFacturaDescuadrada = new JFileChooser();		
		this.jFileChooserImportacionFacturaDescuadrada.setToolTipText("ESCOGER ARCHIVO"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFacturaDescuadrada = new JButtonMe();
		this.jButtonAbrirImportacionFacturaDescuadrada.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFacturaDescuadrada,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFacturaDescuadrada.setToolTipText("Generar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaDescuadrada.add(this.jButtonAbrirImportacionFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFacturaDescuadrada = new JLabelMe();

		this.jLabelPathArchivoImportacionFacturaDescuadrada.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturaDescuadrada.add(this.jLabelPathArchivoImportacionFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFacturaDescuadrada=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFacturaDescuadrada.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturaDescuadrada.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturaDescuadrada.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaDescuadrada.add(this.jTextFieldPathArchivoImportacionFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFacturaDescuadrada = new JButtonMe();
		this.jButtonGenerarImportacionFacturaDescuadrada.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFacturaDescuadrada,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFacturaDescuadrada.setToolTipText("Generar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaDescuadrada.add(this.jButtonGenerarImportacionFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFacturaDescuadrada = new JButtonMe();
		this.jButtonCerrarImportacionFacturaDescuadrada.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFacturaDescuadrada,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFacturaDescuadrada.setToolTipText("Cancelar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaDescuadrada.add(this.jButtonCerrarImportacionFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFacturaDescuadrada = new GridBagLayout();
		
		this.jScrollPanelImportacionFacturaDescuadrada= new JScrollPane(jPanelImportacionFacturaDescuadrada,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy =iPosYImportacion;
		this.gridBagConstraintsFacturaDescuadrada.gridx =iPosXImportacion;
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFacturaDescuadrada.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFacturaDescuadrada.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFacturaDescuadrada);
		this.jInternalFrameImportacionFacturaDescuadrada.getContentPane().add(this.jScrollPanelImportacionFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFacturaDescuadrada(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFacturaDescuadrada = new JButtonMe();
			this.jButtonAbrirOrderByFacturaDescuadrada.setText("Orden");
			this.jButtonAbrirOrderByFacturaDescuadrada.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturaDescuadrada,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFacturaDescuadrada";
			inputMap = this.jButtonAbrirOrderByFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFacturaDescuadrada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFacturaDescuadrada"));
		
		
			GridBagLayout gridaBagLayoutOrderByFacturaDescuadrada = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFacturaDescuadrada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFacturaDescuadrada.setName("jPanelOrderByFacturaDescuadrada"); 
			
			this.jPanelOrderByFacturaDescuadrada.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturaDescuadrada.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturaDescuadrada.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFacturaDescuadrada.setLayout(gridaBagLayoutOrderByFacturaDescuadrada);
			
			
			this.jTableDatosFacturaDescuadradaOrderBy = new JTableMe();        
			this.jTableDatosFacturaDescuadradaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFacturaDescuadradaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFacturaDescuadradaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFacturaDescuadradaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFacturaDescuadradaOrderBy.setViewportView(this.jTableDatosFacturaDescuadradaOrderBy);
			this.jTableDatosFacturaDescuadradaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFacturaDescuadradaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFacturaDescuadrada= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFacturaDescuadrada= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFacturaDescuadrada = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFacturaDescuadrada= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFacturaDescuadrada.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFacturaDescuadrada.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFacturaDescuadrada.setTitle("Orden");
			this.jInternalFrameOrderByFacturaDescuadrada.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFacturaDescuadrada.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFacturaDescuadrada.setResizable(true);
			this.jInternalFrameOrderByFacturaDescuadrada.setClosable(true);
			this.jInternalFrameOrderByFacturaDescuadrada.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFacturaDescuadrada.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturaDescuadrada.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturaDescuadrada.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Descuadradas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFacturaDescuadrada.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFacturaDescuadrada.ipady =150;
				
			this.jPanelOrderByFacturaDescuadrada.add(jScrollPanelDatosFacturaDescuadradaOrderBy, this.gridBagConstraintsFacturaDescuadrada);//this.jTableDatosFacturaDescuadradaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFacturaDescuadrada = new JButtonMe();
			this.jButtonCerrarOrderByFacturaDescuadrada.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFacturaDescuadrada,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFacturaDescuadrada.setToolTipText("Cancelar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFacturaDescuadrada.add(this.jButtonCerrarOrderByFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFacturaDescuadrada = new GridBagLayout();
			
			this.jScrollPanelOrderByFacturaDescuadrada= new JScrollPane(jPanelOrderByFacturaDescuadrada,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.gridy =iPosYOrderBy;
			this.gridBagConstraintsFacturaDescuadrada.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFacturaDescuadrada.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFacturaDescuadrada.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFacturaDescuadrada);
			
			this.jInternalFrameOrderByFacturaDescuadrada.getContentPane().add(this.jScrollPanelOrderByFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);			
		
		} else {
			this.jButtonAbrirOrderByFacturaDescuadrada = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.facturadescuadradaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFacturaDescuadrada.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFacturaDescuadrada.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFacturaDescuadrada.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosFacturaDescuadrada.getRowHeight();//FacturaDescuadradaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FacturaDescuadradaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturaDescuadrada.isSelected()) {
					iHeightTable=FacturaDescuadradaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturaDescuadradaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturaDescuadradaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FacturaDescuadradaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturaDescuadrada.isSelected()) {
					iHeightTable=FacturaDescuadradaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturaDescuadradaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturaDescuadradaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFacturaDescuadrada.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturaDescuadrada.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturaDescuadrada.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFacturaDescuadrada.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturaDescuadrada.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturaDescuadrada.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFacturaDescuadrada!=null && this.jInternalFrameOrderByFacturaDescuadrada.getjTableDatosOrderBy()!=null) {
			//if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFacturaDescuadrada.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFacturaDescuadrada.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFacturaDescuadrada.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFacturaDescuadrada.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFacturaDescuadrada.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFacturaDescuadrada.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFacturaDescuadrada.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFacturaDescuadrada.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturaDescuadrada.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturaDescuadrada.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=facturadescuadradaLogic.getFacturaDescuadradas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturadescuadradas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FacturaDescuadrada> TraerFacturaDescuadradaBeans(List<FacturaDescuadrada> facturadescuadradas,ArrayList<Classe> classes)throws Exception {
		try {
			for(FacturaDescuadrada facturadescuadrada:facturadescuadradas) {
					
				if(!(FacturaDescuadradaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FacturaDescuadradaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					facturadescuadrada.setsDetalleGeneralEntityReporte(FacturaDescuadradaConstantesFunciones.getFacturaDescuadradaDescripcion(facturadescuadrada));
										
						
					
						
					
				} else  {
							
					//facturadescuadrada.setsDetalleGeneralEntityReporte(facturadescuadrada.getsDetalleGeneralEntityReporte());
										
				}
				
				//facturadescuadradabeans.add(facturadescuadradabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return facturadescuadradas;
    }
	//PARA REPORTES FIN
}
