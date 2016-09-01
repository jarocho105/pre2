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
import com.bydan.erp.tesoreria.util.report.PagosAutorizadosConstantesFunciones;

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
public class PagosAutorizadosJInternalFrame extends PagosAutorizadosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPagosAutorizados;
	
	protected JMenuBar jmenuBarPagosAutorizados;
	
	protected JMenu jmenuPagosAutorizados;
	protected JMenu jmenuDatosPagosAutorizados;
	protected JMenu jmenuArchivoPagosAutorizados;
	protected JMenu jmenuAccionesPagosAutorizados;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPagosAutorizados;	
	protected GridBagConstraints gridBagConstraintsPagosAutorizados;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PagosAutorizadosDetalleFormJInternalFrame jInternalFrameDetalleFormPagosAutorizados;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPagosAutorizados;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPagosAutorizados;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public PagosAutorizadosSessionBean pagosautorizadosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PagosAutorizados> pagosautorizadoss;		
	public List<PagosAutorizados> pagosautorizadossEliminados;	
	public List<PagosAutorizados> pagosautorizadossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPagosAutorizados;		
	protected JButton jButtonAbrirOrderByPagosAutorizados;
	
	
	//protected JPanel jPanelOrderByPagosAutorizados;
	//public JScrollPane jScrollPanelOrderByPagosAutorizados;	
	//protected JButton jButtonCerrarOrderByPagosAutorizados;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PagosAutorizadosLogic pagosautorizadosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPagosAutorizados;
	public JScrollPane jScrollPanelDatosEdicionPagosAutorizados;
	public JScrollPane jScrollPanelDatosGeneralPagosAutorizados;
    
	
	
	//public JScrollPane jScrollPanelDatosPagosAutorizadosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPagosAutorizados;
	//public JScrollPane jScrollPanelImportacionPagosAutorizados;
	
	
	
	protected JPanel jPanelAccionesPagosAutorizados;
	
    protected JPanel jPanelPaginacionPagosAutorizados;
    protected JPanel jPanelParametrosReportesPagosAutorizados;
	protected JPanel jPanelParametrosReportesAccionesPagosAutorizados;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PagosAutorizados;
	protected JPanel jPanelParametrosAuxiliar2PagosAutorizados;
	protected JPanel jPanelParametrosAuxiliar3PagosAutorizados;
	protected JPanel jPanelParametrosAuxiliar4PagosAutorizados;
	//protected JPanel jPanelParametrosAuxiliar5PagosAutorizados;
	
	
	
	//protected JPanel jPanelReporteDinamicoPagosAutorizados;
	//protected JPanel jPanelImportacionPagosAutorizados;
	
	
	public JTable jTableDatosPagosAutorizados;
	
	
	
	//public JTable jTableDatosPagosAutorizadosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPagosAutorizados;
	protected JButton jButtonDuplicarPagosAutorizados;
	protected JButton jButtonCopiarPagosAutorizados;
	protected JButton jButtonVerFormPagosAutorizados;
	protected JButton jButtonNuevoRelacionesPagosAutorizados;
	protected JButton jButtonModificarPagosAutorizados;
	
    protected JButton jButtonGuardarCambiosTablaPagosAutorizados;
	protected JButton jButtonCerrarPagosAutorizados;
	
	
	protected JButton jButtonRecargarInformacionPagosAutorizados;
	protected JButton jButtonProcesarInformacionPagosAutorizados;
	
	
	protected JButton jButtonAnterioresPagosAutorizados;
	protected JButton jButtonSiguientesPagosAutorizados;
	protected JButton jButtonNuevoGuardarCambiosPagosAutorizados;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPagosAutorizados;
	//protected JButton jButtonCerrarReporteDinamicoPagosAutorizados;
	//protected JButton jButtonGenerarExcelReporteDinamicoPagosAutorizados;	
	
	
	
	//protected JButton jButtonAbrirImportacionPagosAutorizados;
	//protected JButton jButtonGenerarImportacionPagosAutorizados;
	//protected JButton jButtonCerrarImportacionPagosAutorizados;
	//protected JFileChooser jFileChooserImportacionPagosAutorizados;
	//protected File fileImportacionPagosAutorizados;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPagosAutorizados;
	protected JButton jButtonDuplicarToolBarPagosAutorizados;
	protected JButton jButtonNuevoRelacionesToolBarPagosAutorizados;
	
	
	public JButton jButtonGuardarCambiosToolBarPagosAutorizados;
	protected JButton jButtonCopiarToolBarPagosAutorizados;
	protected JButton jButtonVerFormToolBarPagosAutorizados;
	public JButton jButtonGuardarCambiosTablaToolBarPagosAutorizados;
	protected JButton jButtonMostrarOcultarTablaToolBarPagosAutorizados;
	protected JButton jButtonCerrarToolBarPagosAutorizados;
	
	protected JButton jButtonRecargarInformacionToolBarPagosAutorizados;
	protected JButton jButtonProcesarInformacionToolBarPagosAutorizados;
	protected JButton jButtonAnterioresToolBarPagosAutorizados;
	protected JButton jButtonSiguientesToolBarPagosAutorizados;
	protected JButton jButtonNuevoGuardarCambiosToolBarPagosAutorizados;
	protected JButton jButtonAbrirOrderByToolBarPagosAutorizados;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPagosAutorizados;
	protected JMenuItem jMenuItemDuplicarPagosAutorizados;
	protected JMenuItem jMenuItemNuevoRelacionesPagosAutorizados;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPagosAutorizados;
	protected JMenuItem jMenuItemCopiarPagosAutorizados;
	protected JMenuItem jMenuItemVerFormPagosAutorizados;
	protected JMenuItem jMenuItemGuardarCambiosTablaPagosAutorizados;
	protected JMenuItem jMenuItemCerrarPagosAutorizados;
	protected JMenuItem jMenuItemDetalleCerrarPagosAutorizados;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPagosAutorizados;
	protected JMenuItem jMenuItemDetalleMostarOcultarPagosAutorizados;
	
	protected JMenuItem jMenuItemRecargarInformacionPagosAutorizados;
	protected JMenuItem jMenuItemProcesarInformacionPagosAutorizados;
	protected JMenuItem jMenuItemAnterioresPagosAutorizados;
	protected JMenuItem jMenuItemSiguientesPagosAutorizados;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPagosAutorizados;
	protected JMenuItem jMenuItemAbrirOrderByPagosAutorizados;
	protected JMenuItem jMenuItemMostrarOcultarPagosAutorizados;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPagosAutorizados;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPagosAutorizados;
	protected JCheckBox jCheckBoxSeleccionadosPagosAutorizados;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPagosAutorizados;
	protected JCheckBox jCheckBoxConGraficoReportePagosAutorizados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPagosAutorizados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPagosAutorizados;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPagosAutorizados;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPagosAutorizados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPagosAutorizados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPagosAutorizados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPagosAutorizados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPagosAutorizados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPagosAutorizados;
	protected JTextField jTextFieldValorCampoGeneralPagosAutorizados;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePagosAutorizados;
	//public JList<Reporte> jListColumnasSelectReportePagosAutorizados;
	//public JScrollPane jScrollColumnasSelectReportePagosAutorizados;
	
	//public JLabel jLabelRelacionesSelectReportePagosAutorizados;
	//public JList<Reporte> jListRelacionesSelectReportePagosAutorizados;
	//public JScrollPane jScrollRelacionesSelectReportePagosAutorizados;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPagosAutorizados;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPagosAutorizados;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPagosAutorizados;
	//public JLabel jLabelTiposArchivoReporteDinamicoPagosAutorizados;
	
		
	//public JLabel jLabelArchivoImportacionPagosAutorizados;	
	//public JLabel jLabelPathArchivoImportacionPagosAutorizados;
	//protected JTextField jTextFieldPathArchivoImportacionPagosAutorizados;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPagosAutorizados;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPagosAutorizados;
	
	//public JLabel jLabelColumnaCategoriaValorPagosAutorizados;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPagosAutorizados;
	
	//public JLabel jLabelColumnasValoresGraficoPagosAutorizados;
	//public JList<Reporte> jListColumnasValoresGraficoPagosAutorizados;
	//public JScrollPane jScrollColumnasValoresGraficoPagosAutorizados;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPagosAutorizados;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPagosAutorizados;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPagosAutorizados;
	public JPanel jPanelBusquedaPagosAutorizadosPagosAutorizados;
	public JButton jButtonBusquedaPagosAutorizadosPagosAutorizados;
	
	public JPanel jPanelfecha_corteBusquedaPagosAutorizadosPagosAutorizados;
	public JLabel jLabelfecha_corteBusquedaPagosAutorizadosPagosAutorizados;
	//public JFormattedTextField jDateChooserfecha_corteBusquedaPagosAutorizadosPagosAutorizados;

	public JDateChooser jDateChooserfecha_corteBusquedaPagosAutorizadosPagosAutorizados;
	public JButton jButtonfecha_corteBusquedaPagosAutorizadosPagosAutorizadosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PagosAutorizadosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutorizadosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutorizadosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutorizadosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPagosAutorizados)	{
		this.jButtonRecargarInformacionPagosAutorizados = jButtonRecargarInformacionPagosAutorizados;
	}
	
	public JButton getjButtonProcesarInformacionPagosAutorizados() {
		return this.jButtonProcesarInformacionPagosAutorizados;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPagosAutorizados)	{
		this.jButtonProcesarInformacionPagosAutorizados = jButtonProcesarInformacionPagosAutorizados;
	}
	
	
	public JButton getjButtonRecargarInformacionPagosAutorizados() {
		return this.jButtonRecargarInformacionPagosAutorizados;
	}
	
	
	public List<PagosAutorizados> getpagosautorizadoss() {
		return this.pagosautorizadoss;
	}

	public void setpagosautorizadoss(List<PagosAutorizados> pagosautorizadoss) {
		this.pagosautorizadoss = pagosautorizadoss;
	}
	
	public List<PagosAutorizados> getpagosautorizadossAux() {
		return this.pagosautorizadossAux;
	}

	public void setpagosautorizadossAux(List<PagosAutorizados> pagosautorizadossAux) {
		this.pagosautorizadossAux = pagosautorizadossAux;
	}
	
	public List<PagosAutorizados> getpagosautorizadossEliminados() {
		return this.pagosautorizadossEliminados;
	}

	public void setPagosAutorizadossEliminados(List<PagosAutorizados> pagosautorizadossEliminados) {
		this.pagosautorizadossEliminados = pagosautorizadossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPagosAutorizados() {
		return jComboBoxTiposSeleccionarPagosAutorizados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPagosAutorizados(
			JComboBox jComboBoxTiposSeleccionarPagosAutorizados) {
		this.jComboBoxTiposSeleccionarPagosAutorizados = jComboBoxTiposSeleccionarPagosAutorizados;
	}
	
	public void setBorderResaltarTiposSeleccionarPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPagosAutorizados.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPagosAutorizados .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPagosAutorizados() {
		return jTextFieldValorCampoGeneralPagosAutorizados;
	}

	public void setjTextFieldValorCampoGeneralPagosAutorizados(
			JTextField jTextFieldValorCampoGeneralPagosAutorizados) {
		this.jTextFieldValorCampoGeneralPagosAutorizados = jTextFieldValorCampoGeneralPagosAutorizados;
	}

	public void setBorderResaltarValorCampoGeneralPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizados.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPagosAutorizados .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPagosAutorizados() {
		return this.jCheckBoxSeleccionarTodosPagosAutorizados;
	}

	public void setjCheckBoxSeleccionarTodosPagosAutorizados(
			JCheckBox jCheckBoxSeleccionarTodosPagosAutorizados) {
		this.jCheckBoxSeleccionarTodosPagosAutorizados = jCheckBoxSeleccionarTodosPagosAutorizados;
	}

	public void setBorderResaltarSeleccionarTodosPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizados.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPagosAutorizados .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPagosAutorizados() {
		return this.jCheckBoxSeleccionadosPagosAutorizados;
	}

	public void setjCheckBoxSeleccionadosPagosAutorizados(
			JCheckBox jCheckBoxSeleccionadosPagosAutorizados) {
		this.jCheckBoxSeleccionadosPagosAutorizados = jCheckBoxSeleccionadosPagosAutorizados;
	}
	
	public void setBorderResaltarSeleccionadosPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizados.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPagosAutorizados .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPagosAutorizados() {
		return this.jComboBoxTiposArchivosReportesPagosAutorizados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPagosAutorizados(
			JComboBox jComboBoxTiposArchivosReportesPagosAutorizados) {
		this.jComboBoxTiposArchivosReportesPagosAutorizados = jComboBoxTiposArchivosReportesPagosAutorizados;
	}

	public void setBorderResaltarTiposArchivosReportesPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizados.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPagosAutorizados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPagosAutorizados() {
		return this.jComboBoxTiposReportesPagosAutorizados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPagosAutorizados(
			JComboBox jComboBoxTiposReportesPagosAutorizados) {
		this.jComboBoxTiposReportesPagosAutorizados = jComboBoxTiposReportesPagosAutorizados;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPagosAutorizados() {
	//	return jComboBoxTiposReportesDinamicoPagosAutorizados;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPagosAutorizados(
	//		JComboBox jComboBoxTiposReportesDinamicoPagosAutorizados) {
	//	this.jComboBoxTiposReportesDinamicoPagosAutorizados = jComboBoxTiposReportesDinamicoPagosAutorizados;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPagosAutorizados() {
	//	return jComboBoxTiposArchivosReportesDinamicoPagosAutorizados;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPagosAutorizados(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPagosAutorizados) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPagosAutorizados = jComboBoxTiposArchivosReportesDinamicoPagosAutorizados;
	//}
	
	public void setBorderResaltarTiposReportesPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizados.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPagosAutorizados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPagosAutorizados() {
		return this.jComboBoxTiposGraficosReportesPagosAutorizados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPagosAutorizados(
			JComboBox jComboBoxTiposGraficosReportesPagosAutorizados) {
		this.jComboBoxTiposGraficosReportesPagosAutorizados = jComboBoxTiposGraficosReportesPagosAutorizados;
	}
	
	public void setBorderResaltarTiposGraficosReportesPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizados.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPagosAutorizados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPagosAutorizados() {
		return this.jComboBoxTiposPaginacionPagosAutorizados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPagosAutorizados(
			JComboBox jComboBoxTiposPaginacionPagosAutorizados) {
		this.jComboBoxTiposPaginacionPagosAutorizados = jComboBoxTiposPaginacionPagosAutorizados;
	}
	
	public void setBorderResaltarTiposPaginacionPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizados.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPagosAutorizados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPagosAutorizados() {
		return this.jComboBoxTiposRelacionesPagosAutorizados;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPagosAutorizados() {
		return this.jComboBoxTiposAccionesPagosAutorizados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPagosAutorizados(
			JComboBox jComboBoxTiposRelacionesPagosAutorizados) {
		this.jComboBoxTiposRelacionesPagosAutorizados = jComboBoxTiposRelacionesPagosAutorizados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPagosAutorizados(
			JComboBox jComboBoxTiposAccionesPagosAutorizados) {
		this.jComboBoxTiposAccionesPagosAutorizados = jComboBoxTiposAccionesPagosAutorizados;
	}
	
	public void setBorderResaltarTiposRelacionesPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizados.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPagosAutorizados .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizados.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPagosAutorizados .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPagosAutorizados() {
	//	return jCheckBoxConGraficoDinamicoPagosAutorizados;
	//}

	//public void setjCheckBoxConGraficoDinamicoPagosAutorizados(
	//		JCheckBox jCheckBoxConGraficoDinamicoPagosAutorizados) {
	//	this.jCheckBoxConGraficoDinamicoPagosAutorizados = jCheckBoxConGraficoDinamicoPagosAutorizados;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPagosAutorizados() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPagosAutorizados.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPagosAutorizados .setBorder(borderResaltar);		
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
		this.pagosautorizadosSessionBean=new PagosAutorizadosSessionBean();
		
		this.pagosautorizadosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pagosautorizadosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pagosautorizadosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PagosAutorizadosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PagosAutorizadosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PagosAutorizadosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PagosAutorizadosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PagosAutorizadosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pagos Autorizados MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
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
		
		PagosAutorizadosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPagosAutorizados= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPagosAutorizados,this.jTtoolBarPagosAutorizados,
							"nuevo","nuevo","Nuevo"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPagosAutorizados,this.jTtoolBarPagosAutorizados,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPagosAutorizados,this.jTtoolBarPagosAutorizados,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPagosAutorizados,this.jTtoolBarPagosAutorizados,
							"duplicar","duplicar","Duplicar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPagosAutorizados,this.jTtoolBarPagosAutorizados,
							"copiar","copiar","Copiar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPagosAutorizados,this.jTtoolBarPagosAutorizados,
							"ver_form","ver_form","Ver"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPagosAutorizados,this.jTtoolBarPagosAutorizados,
							"recargar","recargar","Buscar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPagosAutorizados,this.jTtoolBarPagosAutorizados,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPagosAutorizados,this.jTtoolBarPagosAutorizados,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPagosAutorizados,this.jTtoolBarPagosAutorizados,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPagosAutorizados,this.jTtoolBarPagosAutorizados,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPagosAutorizados,this.jTtoolBarPagosAutorizados,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPagosAutorizados,this.jTtoolBarPagosAutorizados,
							"cerrar","cerrar","Salir"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPagosAutorizados=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPagosAutorizados;
			
				this.jButtonProcesarInformacionToolBarPagosAutorizados=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPagosAutorizados;
				
		//protected JButton jButtonModificarToolBarPagosAutorizados;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPagosAutorizados=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPagosAutorizados=new JMenuMe("General");
		this.jmenuArchivoPagosAutorizados=new JMenuMe("Archivo");
		this.jmenuAccionesPagosAutorizados=new JMenuMe("Acciones");
		this.jmenuDatosPagosAutorizados=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPagosAutorizados= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPagosAutorizados.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPagosAutorizados,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPagosAutorizados= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPagosAutorizados.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPagosAutorizados,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPagosAutorizados= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPagosAutorizados.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPagosAutorizados,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPagosAutorizados= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPagosAutorizados.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPagosAutorizados,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPagosAutorizados= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPagosAutorizados.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPagosAutorizados,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPagosAutorizados= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPagosAutorizados.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPagosAutorizados,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPagosAutorizados= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPagosAutorizados.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPagosAutorizados,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPagosAutorizados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPagosAutorizados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPagosAutorizados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPagosAutorizados= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPagosAutorizados.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPagosAutorizados,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPagosAutorizados= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPagosAutorizados.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPagosAutorizados,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPagosAutorizados= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPagosAutorizados.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPagosAutorizados,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPagosAutorizados= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPagosAutorizados.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPagosAutorizados,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPagosAutorizados= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPagosAutorizados.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPagosAutorizados,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPagosAutorizados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPagosAutorizados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPagosAutorizados,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPagosAutorizados= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPagosAutorizados.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPagosAutorizados,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPagosAutorizados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPagosAutorizados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPagosAutorizados,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPagosAutorizados= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPagosAutorizados.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPagosAutorizados,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPagosAutorizados.add(this.jMenuItemCerrarPagosAutorizados);
			
			this.jmenuAccionesPagosAutorizados.add(this.jMenuItemNuevoPagosAutorizados);
			this.jmenuAccionesPagosAutorizados.add(this.jMenuItemNuevoGuardarCambiosPagosAutorizados);
			this.jmenuAccionesPagosAutorizados.add(this.jMenuItemNuevoRelacionesPagosAutorizados);
			this.jmenuAccionesPagosAutorizados.add(this.jMenuItemGuardarCambiosTablaPagosAutorizados);		
			this.jmenuAccionesPagosAutorizados.add(this.jMenuItemDuplicarPagosAutorizados);		
			this.jmenuAccionesPagosAutorizados.add(this.jMenuItemCopiarPagosAutorizados);		
			this.jmenuAccionesPagosAutorizados.add(this.jMenuItemVerFormPagosAutorizados);		
			
			this.jmenuDatosPagosAutorizados.add(this.jMenuItemRecargarInformacionPagosAutorizados);				
			this.jmenuDatosPagosAutorizados.add(this.jMenuItemAnterioresPagosAutorizados);				
			this.jmenuDatosPagosAutorizados.add(this.jMenuItemSiguientesPagosAutorizados);				
			this.jmenuDatosPagosAutorizados.add(this.jMenuItemAbrirOrderByPagosAutorizados);				
			this.jmenuDatosPagosAutorizados.add(this.jMenuItemMostrarOcultarPagosAutorizados);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPagosAutorizados.add(this.jMenuItemGuardarCambiosPagosAutorizados);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPagosAutorizados.add(this.jmenuArchivoPagosAutorizados);		
			this.jmenuBarPagosAutorizados.add(this.jmenuAccionesPagosAutorizados);		
			this.jmenuBarPagosAutorizados.add(this.jmenuDatosPagosAutorizados);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPagosAutorizados);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPagosAutorizados() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPagosAutorizadosPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPagosAutorizadosPagosAutorizados.setToolTipText("Buscar Por Fecha Corte Base ");
		this.jButtonBusquedaPagosAutorizadosPagosAutorizados= new JButtonMe();
		this.jButtonBusquedaPagosAutorizadosPagosAutorizados.setText("Buscar");
		this.jButtonBusquedaPagosAutorizadosPagosAutorizados.setToolTipText("Buscar Por Fecha Corte Base ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPagosAutorizadosPagosAutorizados,"buscar_button","Buscar Por Fecha Corte Base ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPagosAutorizadosPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_corteBusquedaPagosAutorizadosPagosAutorizados = new JLabelMe();
		jLabelfecha_corteBusquedaPagosAutorizadosPagosAutorizados.setText("Fecha Corte Base :");
		jLabelfecha_corteBusquedaPagosAutorizadosPagosAutorizados.setToolTipText("Fecha Corte Base");
		jLabelfecha_corteBusquedaPagosAutorizadosPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_corteBusquedaPagosAutorizadosPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_corteBusquedaPagosAutorizadosPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_corteBusquedaPagosAutorizadosPagosAutorizados,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_corteBusquedaPagosAutorizadosPagosAutorizados= new JDateChooser();
		jDateChooserfecha_corteBusquedaPagosAutorizadosPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_corteBusquedaPagosAutorizadosPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_corteBusquedaPagosAutorizadosPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_corteBusquedaPagosAutorizadosPagosAutorizados,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_corteBusquedaPagosAutorizadosPagosAutorizados.setDate(new Date());
		jDateChooserfecha_corteBusquedaPagosAutorizadosPagosAutorizados.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_corteBusquedaPagosAutorizadosPagosAutorizados.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasPagosAutorizados=new JTabbedPane();


		this.jTabbedPaneBusquedasPagosAutorizados.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasPagosAutorizados.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasPagosAutorizados.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPagosAutorizados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPagosAutorizados,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePagosAutorizados = new PagosAutorizadosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pagos Autorizados DATOS");
			this.jInternalFrameDetalleFormPagosAutorizados = new PagosAutorizadosDetalleFormJInternalFrame(jDesktopPane,this.pagosautorizadosSessionBean.getConGuardarRelaciones(),this.pagosautorizadosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPagosAutorizados = null;//new PagosAutorizadosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPagosAutorizados= new GridBagLayout();
		
		
		this.jTableDatosPagosAutorizados = new JTableMe();      
		
		String sToolTipPagosAutorizados="";
		sToolTipPagosAutorizados=PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPagosAutorizados+="(Tesoreria.PagosAutorizados)";
		}
		
		if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			sToolTipPagosAutorizados+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPagosAutorizados.setToolTipText(sToolTipPagosAutorizados);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPagosAutorizados);
		this.jTableDatosPagosAutorizados.setAutoCreateRowSorter(true);
		this.jTableDatosPagosAutorizados.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPagosAutorizados.setRowSelectionAllowed(true);
		this.jTableDatosPagosAutorizados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPagosAutorizados,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPagosAutorizados = new JButtonMe();
		this.jButtonDuplicarPagosAutorizados = new JButtonMe();
		this.jButtonCopiarPagosAutorizados = new JButtonMe();
		this.jButtonVerFormPagosAutorizados = new JButtonMe();
		this.jButtonNuevoRelacionesPagosAutorizados = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPagosAutorizados = new JButtonMe();
		this.jButtonCerrarPagosAutorizados = new JButtonMe();
		
		this.jScrollPanelDatosPagosAutorizados = new JScrollPane();   
        this.jScrollPanelDatosGeneralPagosAutorizados = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Pagos Autorizados";
		
		if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Autorizadoses" + this.sPath));
		} else {
			this.jScrollPanelDatosPagosAutorizados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPagosAutorizados.setToolTipText("Acciones");
        this.jPanelAccionesPagosAutorizados.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPagosAutorizados=new ReporteDinamicoJInternalFrame(PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPagosAutorizados();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPagosAutorizados=new ImportacionJInternalFrame(PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPagosAutorizados();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPagosAutorizados = new JButtonMe();
		
		this.jButtonAbrirOrderByPagosAutorizados.setText("Orden");
		this.jButtonAbrirOrderByPagosAutorizados.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPagosAutorizados,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPagosAutorizados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagosAutorizados,false,this);
			
			//this.cargarOrderByPagosAutorizados(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPagosAutorizados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagosAutorizados,true,this);
			
			//this.cargarOrderByPagosAutorizados(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPagosAutorizados.setMinimumSize(new Dimension(400,50));//1630
		this.jTableDatosPagosAutorizados.setMaximumSize(new Dimension(400,50));//1630
		this.jTableDatosPagosAutorizados.setPreferredSize(new Dimension(400,50));//1630
		
		this.jScrollPanelDatosPagosAutorizados.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPagosAutorizados.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPagosAutorizados.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPagosAutorizados.setText("Nuevo");
		this.jButtonDuplicarPagosAutorizados.setText("Duplicar");
		this.jButtonCopiarPagosAutorizados.setText("Copiar");
		this.jButtonVerFormPagosAutorizados.setText("Ver");
		this.jButtonNuevoRelacionesPagosAutorizados.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPagosAutorizados.setText("Guardar");
		this.jButtonCerrarPagosAutorizados.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPagosAutorizados,"nuevo_button","Nuevo",this.pagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPagosAutorizados,"duplicar_button","Duplicar",this.pagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPagosAutorizados,"copiar_button","Copiar",this.pagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPagosAutorizados,"ver_form","Ver",this.pagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPagosAutorizados,"nuevorelaciones_button","Nuevo Rel",this.pagosautorizadosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPagosAutorizados,"guardarcambiostabla_button","Guardar",this.pagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPagosAutorizados,"cerrar_button","Salir",this.pagosautorizadosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPagosAutorizados.setToolTipText("Nuevo"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPagosAutorizados.setToolTipText("Duplicar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPagosAutorizados.setToolTipText("Copiar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPagosAutorizados.setToolTipText("Ver"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPagosAutorizados.setToolTipText("Nuevo Rel"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPagosAutorizados.setToolTipText("Guardar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPagosAutorizados.setToolTipText("Salir"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPagosAutorizados";
		inputMap = this.jButtonNuevoPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPagosAutorizados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPagosAutorizados"));
		
		//DUPLICAR
		sMapKey = "DuplicarPagosAutorizados";
		inputMap = this.jButtonDuplicarPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPagosAutorizados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPagosAutorizados"));
		
		//COPIAR
		sMapKey = "CopiarPagosAutorizados";
		inputMap = this.jButtonCopiarPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPagosAutorizados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPagosAutorizados"));
		
		//VEr FORM
		sMapKey = "VerFormPagosAutorizados";
		inputMap = this.jButtonVerFormPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPagosAutorizados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPagosAutorizados"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPagosAutorizados";
		inputMap = this.jButtonNuevoRelacionesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPagosAutorizados"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPagosAutorizados";
		inputMap = this.jButtonModificarPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPagosAutorizados"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPagosAutorizados";
		inputMap = this.jButtonCerrarPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPagosAutorizados"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPagosAutorizados";
		inputMap = this.jButtonGuardarCambiosTablaPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPagosAutorizados"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PagosAutorizados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PagosAutorizados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PagosAutorizados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PagosAutorizados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PagosAutorizados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPagosAutorizados.setName("jPanelParametrosReportesPagosAutorizados"); 
		
		this.jPanelParametrosReportesAccionesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPagosAutorizados.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPagosAutorizados.setName("jPanelParametrosReportesAccionesPagosAutorizados"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPagosAutorizados = new JButtonMe();
		this.jButtonRecargarInformacionPagosAutorizados.setText("Buscar");
		this.jButtonRecargarInformacionPagosAutorizados.setToolTipText("Buscar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPagosAutorizados,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionPagosAutorizados.setVisible(false);
		
		
		this.jButtonProcesarInformacionPagosAutorizados = new JButtonMe();
		this.jButtonProcesarInformacionPagosAutorizados.setText("Procesar");
		this.jButtonProcesarInformacionPagosAutorizados.setToolTipText("Procesar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPagosAutorizados.setVisible(false);
			
		this.jButtonProcesarInformacionPagosAutorizados.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPagosAutorizados.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPagosAutorizados.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPagosAutorizados.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPagosAutorizados.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPagosAutorizados.setText("TIPO");       
		this.jComboBoxTiposReportesPagosAutorizados.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPagosAutorizados.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPagosAutorizados.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPagosAutorizados.setText("Paginacion");
		this.jComboBoxTiposPaginacionPagosAutorizados.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPagosAutorizados.setText("Accion");
		this.jComboBoxTiposRelacionesPagosAutorizados.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPagosAutorizados.setText("Accion");
		this.jComboBoxTiposAccionesPagosAutorizados.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPagosAutorizados.setText("Accion");
		this.jComboBoxTiposSeleccionarPagosAutorizados.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPagosAutorizados=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPagosAutorizados.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPagosAutorizados.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPagosAutorizados.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPagosAutorizados = new JLabelMe();
		
		this.jLabelAccionesPagosAutorizados.setText("Acciones");		
		this.jLabelAccionesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPagosAutorizados = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPagosAutorizados.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPagosAutorizados.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPagosAutorizados = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPagosAutorizados.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPagosAutorizados.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPagosAutorizados = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPagosAutorizados.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPagosAutorizados.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePagosAutorizados = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePagosAutorizados.setText("Graf.");
		this.jCheckBoxConGraficoReportePagosAutorizados.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPagosAutorizados = new JButtonMe();
		//this.jButtonAnterioresPagosAutorizados.setText("<<");
        this.jButtonAnterioresPagosAutorizados.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPagosAutorizados,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPagosAutorizados = new JButtonMe();
		//this.jButtonSiguientesPagosAutorizados.setText(">>");
        this.jButtonSiguientesPagosAutorizados.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPagosAutorizados,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPagosAutorizados = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPagosAutorizados.setText("Nue");
        this.jButtonNuevoGuardarCambiosPagosAutorizados.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPagosAutorizados,"nuevoguardarcambios_button","Nue",this.pagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPagosAutorizados";
		inputMap = this.jButtonNuevoGuardarCambiosPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPagosAutorizados"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPagosAutorizados";
		inputMap = this.jButtonRecargarInformacionPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPagosAutorizados"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPagosAutorizados";
		inputMap = this.jButtonSiguientesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPagosAutorizados"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPagosAutorizados";
		inputMap = this.jButtonAnterioresPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPagosAutorizados"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPagosAutorizados();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPagosAutorizados.setMinimumSize(new Dimension(this.getWidth(),PagosAutorizadosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PagosAutorizadosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPagosAutorizados.setMaximumSize(new Dimension(this.getWidth(),PagosAutorizadosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PagosAutorizadosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPagosAutorizados.setPreferredSize(new Dimension(this.getWidth(),PagosAutorizadosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PagosAutorizadosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPagosAutorizados = new GridBagLayout();

			this.jPanelPaginacionPagosAutorizados.setLayout(gridaBagLayoutPaginacionPagosAutorizados);						
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy = 0;
			this.gridBagConstraintsPagosAutorizados.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPagosAutorizados.add(this.jButtonAnterioresPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
					
						
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPagosAutorizados.gridy = 0;
			
			this.jPanelPaginacionPagosAutorizados.add(this.jButtonNuevoGuardarCambiosPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
						
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPagosAutorizados.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPagosAutorizados.gridy = 0;
			this.jPanelPaginacionPagosAutorizados.add(this.jButtonSiguientesPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy = 1;
			this.gridBagConstraintsPagosAutorizados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagosAutorizados.add(this.jButtonNuevoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
						
			
			
			if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
				this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPagosAutorizados.gridy = 1;
				this.gridBagConstraintsPagosAutorizados.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPagosAutorizados.add(this.jButtonGuardarCambiosTablaPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
			}
			
			
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy = 1;
			this.gridBagConstraintsPagosAutorizados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagosAutorizados.add(this.jButtonDuplicarPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy = 1;
			this.gridBagConstraintsPagosAutorizados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagosAutorizados.add(this.jButtonCopiarPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy = 1;
			this.gridBagConstraintsPagosAutorizados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagosAutorizados.add(this.jButtonVerFormPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy = 1;
			this.gridBagConstraintsPagosAutorizados.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPagosAutorizados.add(this.jButtonCerrarPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
		
		
		this.jButtonRecargarInformacionPagosAutorizados.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPagosAutorizados.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPagosAutorizados.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPagosAutorizados.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPagosAutorizados.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPagosAutorizados.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPagosAutorizados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPagosAutorizados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPagosAutorizados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPagosAutorizados.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPagosAutorizados.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPagosAutorizados.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPagosAutorizados.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPagosAutorizados.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPagosAutorizados.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPagosAutorizados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPagosAutorizados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPagosAutorizados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPagosAutorizados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagosAutorizados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagosAutorizados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPagosAutorizados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPagosAutorizados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPagosAutorizados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPagosAutorizados.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPagosAutorizados.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPagosAutorizados.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePagosAutorizados.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePagosAutorizados.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePagosAutorizados.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPagosAutorizados.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPagosAutorizados.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPagosAutorizados.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPagosAutorizados.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPagosAutorizados.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPagosAutorizados.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPagosAutorizados = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPagosAutorizados = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PagosAutorizados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PagosAutorizados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PagosAutorizados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PagosAutorizados = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPagosAutorizados.setLayout(gridaBagParametrosReportesPagosAutorizados);
			this.jPanelParametrosReportesAccionesPagosAutorizados.setLayout(gridaBagParametrosReportesAccionesPagosAutorizados);
			
			
			this.jPanelParametrosAuxiliar1PagosAutorizados.setLayout(gridaBagParametrosAuxiliar1PagosAutorizados);
			this.jPanelParametrosAuxiliar2PagosAutorizados.setLayout(gridaBagParametrosAuxiliar2PagosAutorizados);
			this.jPanelParametrosAuxiliar3PagosAutorizados.setLayout(gridaBagParametrosAuxiliar3PagosAutorizados);
			this.jPanelParametrosAuxiliar4PagosAutorizados.setLayout(gridaBagParametrosAuxiliar4PagosAutorizados);
			//this.jPanelParametrosAuxiliar5PagosAutorizados.setLayout(gridaBagParametrosAuxiliar2PagosAutorizados);			
			
			
			
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPagosAutorizados.add(this.jButtonRecargarInformacionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PagosAutorizados.add(this.jComboBoxTiposPaginacionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PagosAutorizados.add(this.jCheckBoxConAltoMaximoTablaPagosAutorizados, this.gridBagConstraintsPagosAutorizados);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PagosAutorizados.add(this.jComboBoxTiposArchivosReportesPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosAutorizados.add(this.jPanelParametrosAuxiliar1PagosAutorizados, this.gridBagConstraintsPagosAutorizados);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PagosAutorizados.add(this.jComboBoxTiposReportesPagosAutorizados, this.gridBagConstraintsPagosAutorizados);																		
			
			
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PagosAutorizados.add(this.jComboBoxTiposGraficosReportesPagosAutorizados, this.gridBagConstraintsPagosAutorizados);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosAutorizados.add(this.jPanelParametrosAuxiliar4PagosAutorizados, this.gridBagConstraintsPagosAutorizados);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizados.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosAutorizados.add(this.jComboBoxTiposReportesPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizados.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagosAutorizados.add(this.jCheckBoxGenerarReportePagosAutorizados, this.gridBagConstraintsPagosAutorizados);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosAutorizados.add(this.jPanelParametrosAuxiliar2PagosAutorizados, this.gridBagConstraintsPagosAutorizados);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagosAutorizados.add(this.jLabelAccionesPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
				this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPagosAutorizados.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPagosAutorizados.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPagosAutorizados.add(this.jButtonAbrirOrderByPagosAutorizados, this.gridBagConstraintsPagosAutorizados);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPagosAutorizados.add(this.jComboBoxTiposSeleccionarPagosAutorizados, this.gridBagConstraintsPagosAutorizados);			
			
			
			/*
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagosAutorizados.add(this.jCheckBoxSeleccionarTodosPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagosAutorizados.add(this.jCheckBoxConGraficoReportePagosAutorizados, this.gridBagConstraintsPagosAutorizados);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PagosAutorizados.add(this.jCheckBoxSeleccionarTodosPagosAutorizados, this.gridBagConstraintsPagosAutorizados);															
				
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PagosAutorizados.add(this.jCheckBoxSeleccionadosPagosAutorizados, this.gridBagConstraintsPagosAutorizados);															
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PagosAutorizados.add(this.jCheckBoxConGraficoReportePagosAutorizados, this.gridBagConstraintsPagosAutorizados);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosAutorizados.add(this.jPanelParametrosAuxiliar3PagosAutorizados, this.gridBagConstraintsPagosAutorizados);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPagosAutorizados.add(this.jComboBoxTiposAccionesPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPagosAutorizados = new GridBagLayout();

			this.jScrollPanelDatosPagosAutorizados.setLayout(gridaBagLayoutDatosPagosAutorizados);
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy = 0;
			this.gridBagConstraintsPagosAutorizados.gridx = 0;
			
			this.jScrollPanelDatosPagosAutorizados.add(this.jTableDatosPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPagosAutorizados.setViewportView(this.jTableDatosPagosAutorizados);
		this.jTableDatosPagosAutorizados.setFillsViewportHeight(true);
		this.jTableDatosPagosAutorizados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPagosAutorizados= new GridBagLayout();
		this.jPanelAccionesPagosAutorizados.setLayout(gridaBagLayoutAccionesPagosAutorizados);
		
		
		/*	
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 0;
			
		this.jPanelAccionesPagosAutorizados.add(this.jButtonNuevoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPagosAutorizadosPagosAutorizados= new GridBagLayout();
		gridaBagLayoutBusquedaPagosAutorizadosPagosAutorizados.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPagosAutorizadosPagosAutorizados.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPagosAutorizadosPagosAutorizados.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPagosAutorizadosPagosAutorizados.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPagosAutorizadosPagosAutorizados.setLayout(gridaBagLayoutBusquedaPagosAutorizadosPagosAutorizados);

		gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagosAutorizados.gridy = 0;
		gridBagConstraintsPagosAutorizados.gridx = 0;
		jPanelBusquedaPagosAutorizadosPagosAutorizados.add(jLabelfecha_corteBusquedaPagosAutorizadosPagosAutorizados, gridBagConstraintsPagosAutorizados);

		gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagosAutorizados.gridy = 0;
		gridBagConstraintsPagosAutorizados.gridx = 1;
		jPanelBusquedaPagosAutorizadosPagosAutorizados.add(jDateChooserfecha_corteBusquedaPagosAutorizadosPagosAutorizados, gridBagConstraintsPagosAutorizados);

		gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagosAutorizados.gridy = 1;
		gridBagConstraintsPagosAutorizados.gridx =1;
		jPanelBusquedaPagosAutorizadosPagosAutorizados.add(jButtonBusquedaPagosAutorizadosPagosAutorizados, gridBagConstraintsPagosAutorizados);

		jTabbedPaneBusquedasPagosAutorizados.addTab("1.-Por Fecha Corte Base ", jPanelBusquedaPagosAutorizadosPagosAutorizados);
		jTabbedPaneBusquedasPagosAutorizados.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPagosAutorizados = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPagosAutorizados);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();						
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPagosAutorizados.gridx = 0;		
			//this.gridBagConstraintsPagosAutorizados.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPagosAutorizados.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPagosAutorizados, this.gridBagConstraintsPagosAutorizados);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPagosAutorizados.gridx = 0;		
		//this.gridBagConstraintsPagosAutorizados.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPagosAutorizados.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPagosAutorizados);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPagosAutorizados.gridx = 0;		
			this.gridBagConstraintsPagosAutorizados.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPagosAutorizados.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPagosAutorizados, this.gridBagConstraintsPagosAutorizados);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizados.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPagosAutorizados, this.gridBagConstraintsPagosAutorizados);								
		
		
		/*
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizados.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		*/		
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPagosAutorizados.gridx =0;
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPagosAutorizados.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
				
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizados.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PagosAutorizadosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPagosAutorizados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPagosAutorizados = new GridBagLayout();
			this.jPanelBusquedasParametrosPagosAutorizados.setLayout(gridaBagLayoutBusquedasParametrosPagosAutorizados);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPagosAutorizados=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPagosAutorizados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagosAutorizados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagosAutorizados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
			
			
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
			
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizados.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPagosAutorizados;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPagosAutorizados() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPagosAutorizados = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPagosAutorizados.setName("jPanelReporteDinamicoPagosAutorizados"); 
		
		this.jPanelReporteDinamicoPagosAutorizados.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPagosAutorizados.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPagosAutorizados.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPagosAutorizados.setLayout(gridaBagLayoutReporteDinamicoPagosAutorizados);
		
		
		this.jInternalFrameReporteDinamicoPagosAutorizados= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPagosAutorizados = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePagosAutorizados= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPagosAutorizados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPagosAutorizados.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPagosAutorizados.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPagosAutorizados.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPagosAutorizados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPagosAutorizados.setResizable(true);
	    this.jInternalFrameReporteDinamicoPagosAutorizados.setClosable(true);
	    this.jInternalFrameReporteDinamicoPagosAutorizados.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPagosAutorizados.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPagosAutorizados.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPagosAutorizados.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Autorizadoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePagosAutorizados = new JLabelMe();

		this.jLabelColumnasSelectReportePagosAutorizados.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jLabelColumnasSelectReportePagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePagosAutorizados = new JList<Reporte>();
		this.jListColumnasSelectReportePagosAutorizados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePagosAutorizados.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePagosAutorizados.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePagosAutorizados.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePagosAutorizados.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePagosAutorizados=new JScrollPane(this.jListColumnasSelectReportePagosAutorizados);
			
			this.jScrollColumnasSelectReportePagosAutorizados.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePagosAutorizados.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePagosAutorizados.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPagosAutorizados.add(this.jListColumnasSelectReportePagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jScrollColumnasSelectReportePagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePagosAutorizados = new JLabelMe();

		this.jLabelRelacionesSelectReportePagosAutorizados.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePagosAutorizados = new JList<Reporte>();
		this.jListRelacionesSelectReportePagosAutorizados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePagosAutorizados.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePagosAutorizados.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePagosAutorizados.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePagosAutorizados.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePagosAutorizados=new JScrollPane(this.jListRelacionesSelectReportePagosAutorizados);
			
			this.jScrollRelacionesSelectReportePagosAutorizados.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePagosAutorizados.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePagosAutorizados.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPagosAutorizados = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPagosAutorizados = new JComboBoxMe();
		this.jListColumnasValoresGraficoPagosAutorizados = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPagosAutorizados = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPagosAutorizados.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPagosAutorizados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPagosAutorizados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPagosAutorizados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPagosAutorizados = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPagosAutorizados.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPagosAutorizados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPagosAutorizados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPagosAutorizados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPagosAutorizados = new JLabelMe();

		this.jLabelConGraficoDinamicoPagosAutorizados.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jLabelConGraficoDinamicoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPagosAutorizados = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPagosAutorizados.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPagosAutorizados.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPagosAutorizados.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPagosAutorizados.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPagosAutorizados.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jCheckBoxConGraficoDinamicoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPagosAutorizados = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPagosAutorizados.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jLabelColumnaCategoriaGraficoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPagosAutorizados.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPagosAutorizados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPagosAutorizados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPagosAutorizados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPagosAutorizados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jComboBoxColumnaCategoriaGraficoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPagosAutorizados = new JLabelMe();

		this.jLabelColumnaCategoriaValorPagosAutorizados.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jLabelColumnaCategoriaValorPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPagosAutorizados.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPagosAutorizados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPagosAutorizados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPagosAutorizados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPagosAutorizados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jComboBoxColumnaCategoriaValorPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPagosAutorizados = new JLabelMe();

		this.jLabelColumnasValoresGraficoPagosAutorizados.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jLabelColumnasValoresGraficoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPagosAutorizados = new JList<Reporte>();
		this.jListColumnasValoresGraficoPagosAutorizados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPagosAutorizados.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPagosAutorizados.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPagosAutorizados.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPagosAutorizados.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPagosAutorizados=new JScrollPane(this.jListColumnasValoresGraficoPagosAutorizados);
			
			this.jScrollColumnasValoresGraficoPagosAutorizados.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPagosAutorizados.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPagosAutorizados.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPagosAutorizados.add(this.jListColumnasSelectReportePagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jScrollColumnasValoresGraficoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPagosAutorizados = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPagosAutorizados.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jLabelTiposGraficosReportesDinamicoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPagosAutorizados.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPagosAutorizados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPagosAutorizados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPagosAutorizados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPagosAutorizados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jComboBoxTiposGraficosReportesDinamicoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPagosAutorizados = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPagosAutorizados.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jLabelGenerarExcelReporteDinamicoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPagosAutorizados = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPagosAutorizados.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPagosAutorizados,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPagosAutorizados.setToolTipText("Generar EXCEL"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPagosAutorizados.add(this.jButtonGenerarExcelReporteDinamicoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jComboBoxTiposReportesDinamicoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPagosAutorizados = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPagosAutorizados.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jLabelTiposArchivoReporteDinamicoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jComboBoxTiposArchivosReportesDinamicoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPagosAutorizados = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPagosAutorizados.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPagosAutorizados,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPagosAutorizados.setToolTipText("Generar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jButtonGenerarReporteDinamicoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPagosAutorizados = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPagosAutorizados.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPagosAutorizados,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPagosAutorizados.setToolTipText("Cancelar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagosAutorizados.add(this.jButtonCerrarReporteDinamicoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPagosAutorizados = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPagosAutorizados= new JScrollPane(jPanelReporteDinamicoPagosAutorizados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPagosAutorizados.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPagosAutorizados.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPagosAutorizados.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Autorizadoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPagosAutorizados.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPagosAutorizados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPagosAutorizados.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPagosAutorizados);
		this.jInternalFrameReporteDinamicoPagosAutorizados.getContentPane().add(this.jScrollPanelReporteDinamicoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPagosAutorizados() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPagosAutorizados = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPagosAutorizados.setName("jPanelImportacionPagosAutorizados"); 
		
		this.jPanelImportacionPagosAutorizados.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPagosAutorizados.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPagosAutorizados.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPagosAutorizados.setLayout(gridaBagLayoutImportacionPagosAutorizados);
		
		
		this.jInternalFrameImportacionPagosAutorizados= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPagosAutorizados= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPagosAutorizados = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePagosAutorizados= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPagosAutorizados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPagosAutorizados.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPagosAutorizados.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPagosAutorizados.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPagosAutorizados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPagosAutorizados.setResizable(true);
	    this.jInternalFrameImportacionPagosAutorizados.setClosable(true);
	    this.jInternalFrameImportacionPagosAutorizados.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPagosAutorizados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPagosAutorizados.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPagosAutorizados.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPagosAutorizados.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPagosAutorizados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPagosAutorizados.setResizable(true);
	    this.jInternalFrameImportacionPagosAutorizados.setClosable(true);
	    this.jInternalFrameImportacionPagosAutorizados.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPagosAutorizados.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPagosAutorizados.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPagosAutorizados.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Autorizadoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPagosAutorizados = new JLabelMe();

		this.jLabelArchivoImportacionPagosAutorizados.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYImportacion;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPagosAutorizados.add(this.jLabelArchivoImportacionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPagosAutorizados = new JFileChooser();		
		this.jFileChooserImportacionPagosAutorizados.setToolTipText("ESCOGER ARCHIVO"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPagosAutorizados = new JButtonMe();
		this.jButtonAbrirImportacionPagosAutorizados.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPagosAutorizados,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPagosAutorizados.setToolTipText("Generar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYImportacion;
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagosAutorizados.add(this.jButtonAbrirImportacionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPagosAutorizados = new JLabelMe();

		this.jLabelPathArchivoImportacionPagosAutorizados.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYImportacion;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPagosAutorizados.add(this.jLabelPathArchivoImportacionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPagosAutorizados=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPagosAutorizados.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPagosAutorizados.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPagosAutorizados.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYImportacion;
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagosAutorizados.add(this.jTextFieldPathArchivoImportacionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPagosAutorizados = new JButtonMe();
		this.jButtonGenerarImportacionPagosAutorizados.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPagosAutorizados,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPagosAutorizados.setToolTipText("Generar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYImportacion;
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagosAutorizados.add(this.jButtonGenerarImportacionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPagosAutorizados = new JButtonMe();
		this.jButtonCerrarImportacionPagosAutorizados.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPagosAutorizados,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPagosAutorizados.setToolTipText("Cancelar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizados.gridy = iPosYImportacion;
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagosAutorizados.add(this.jButtonCerrarImportacionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPagosAutorizados = new GridBagLayout();
		
		this.jScrollPanelImportacionPagosAutorizados= new JScrollPane(jPanelImportacionPagosAutorizados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy =iPosYImportacion;
		this.gridBagConstraintsPagosAutorizados.gridx =iPosXImportacion;
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPagosAutorizados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPagosAutorizados.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPagosAutorizados);
		this.jInternalFrameImportacionPagosAutorizados.getContentPane().add(this.jScrollPanelImportacionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPagosAutorizados(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPagosAutorizados = new JButtonMe();
			this.jButtonAbrirOrderByPagosAutorizados.setText("Orden");
			this.jButtonAbrirOrderByPagosAutorizados.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPagosAutorizados,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPagosAutorizados";
			inputMap = this.jButtonAbrirOrderByPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPagosAutorizados"));
		
		
			GridBagLayout gridaBagLayoutOrderByPagosAutorizados = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPagosAutorizados.setName("jPanelOrderByPagosAutorizados"); 
			
			this.jPanelOrderByPagosAutorizados.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPagosAutorizados.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPagosAutorizados.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPagosAutorizados.setLayout(gridaBagLayoutOrderByPagosAutorizados);
			
			
			this.jTableDatosPagosAutorizadosOrderBy = new JTableMe();        
			this.jTableDatosPagosAutorizadosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPagosAutorizadosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPagosAutorizadosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPagosAutorizadosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPagosAutorizadosOrderBy.setViewportView(this.jTableDatosPagosAutorizadosOrderBy);
			this.jTableDatosPagosAutorizadosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPagosAutorizadosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPagosAutorizados= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPagosAutorizados= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPagosAutorizados = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePagosAutorizados= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPagosAutorizados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPagosAutorizados.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPagosAutorizados.setTitle("Orden");
			this.jInternalFrameOrderByPagosAutorizados.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPagosAutorizados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPagosAutorizados.setResizable(true);
			this.jInternalFrameOrderByPagosAutorizados.setClosable(true);
			this.jInternalFrameOrderByPagosAutorizados.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPagosAutorizados.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPagosAutorizados.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPagosAutorizados.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Autorizadoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPagosAutorizados.gridx =iPosXOrderBy;
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPagosAutorizados.ipady =150;
				
			this.jPanelOrderByPagosAutorizados.add(jScrollPanelDatosPagosAutorizadosOrderBy, this.gridBagConstraintsPagosAutorizados);//this.jTableDatosPagosAutorizadosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPagosAutorizados = new JButtonMe();
			this.jButtonCerrarOrderByPagosAutorizados.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPagosAutorizados,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPagosAutorizados.setToolTipText("Cancelar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPagosAutorizados.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPagosAutorizados.add(this.jButtonCerrarOrderByPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPagosAutorizados = new GridBagLayout();
			
			this.jScrollPanelOrderByPagosAutorizados= new JScrollPane(jPanelOrderByPagosAutorizados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.gridy =iPosYOrderBy;
			this.gridBagConstraintsPagosAutorizados.gridx =iPosXOrderBy;
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPagosAutorizados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPagosAutorizados.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPagosAutorizados);
			
			this.jInternalFrameOrderByPagosAutorizados.getContentPane().add(this.jScrollPanelOrderByPagosAutorizados, this.gridBagConstraintsPagosAutorizados);			
		
		} else {
			this.jButtonAbrirOrderByPagosAutorizados = new JButtonMe();
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
		int iWidthTableCalculado=0;//3330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.pagosautorizadosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPagosAutorizados.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPagosAutorizados.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPagosAutorizados.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosPagosAutorizados.getRowHeight();//PagosAutorizadosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PagosAutorizadosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPagosAutorizados.isSelected()) {
					iHeightTable=PagosAutorizadosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PagosAutorizadosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PagosAutorizadosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PagosAutorizadosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPagosAutorizados.isSelected()) {
					iHeightTable=PagosAutorizadosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PagosAutorizadosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PagosAutorizadosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPagosAutorizados.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPagosAutorizados.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPagosAutorizados.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPagosAutorizados.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPagosAutorizados.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPagosAutorizados.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPagosAutorizados!=null && this.jInternalFrameOrderByPagosAutorizados.getjTableDatosOrderBy()!=null) {
			//if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPagosAutorizados.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPagosAutorizados.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPagosAutorizados.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPagosAutorizados.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPagosAutorizados.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPagosAutorizados.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPagosAutorizados.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPagosAutorizados.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPagosAutorizados.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPagosAutorizados.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=pagosautorizadosLogic.getPagosAutorizadoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pagosautorizadoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PagosAutorizados> TraerPagosAutorizadosBeans(List<PagosAutorizados> pagosautorizadoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(PagosAutorizados pagosautorizados:pagosautorizadoss) {
					
				if(!(PagosAutorizadosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PagosAutorizadosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					pagosautorizados.setsDetalleGeneralEntityReporte(PagosAutorizadosConstantesFunciones.getPagosAutorizadosDescripcion(pagosautorizados));
										
					pagosautorizados.setesta_autorizado_descripcion(PagosAutorizadosConstantesFunciones.getesta_autorizadoDescripcion(pagosautorizados));	
					
						
					
				} else  {
							
					//pagosautorizados.setsDetalleGeneralEntityReporte(pagosautorizados.getsDetalleGeneralEntityReporte());
										
				}
				
				//pagosautorizadosbeans.add(pagosautorizadosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return pagosautorizadoss;
    }
	//PARA REPORTES FIN
}
