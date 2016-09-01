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
import com.bydan.erp.tesoreria.util.report.PagosAutomaticosConstantesFunciones;

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
public class PagosAutomaticosJInternalFrame extends PagosAutomaticosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPagosAutomaticos;
	
	protected JMenuBar jmenuBarPagosAutomaticos;
	
	protected JMenu jmenuPagosAutomaticos;
	protected JMenu jmenuDatosPagosAutomaticos;
	protected JMenu jmenuArchivoPagosAutomaticos;
	protected JMenu jmenuAccionesPagosAutomaticos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPagosAutomaticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPagosAutomaticos;	
	protected GridBagConstraints gridBagConstraintsPagosAutomaticos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PagosAutomaticosDetalleFormJInternalFrame jInternalFrameDetalleFormPagosAutomaticos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPagosAutomaticos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPagosAutomaticos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public PagosAutomaticosSessionBean pagosautomaticosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PagosAutomaticos> pagosautomaticoss;		
	public List<PagosAutomaticos> pagosautomaticossEliminados;	
	public List<PagosAutomaticos> pagosautomaticossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPagosAutomaticos;		
	protected JButton jButtonAbrirOrderByPagosAutomaticos;
	
	
	//protected JPanel jPanelOrderByPagosAutomaticos;
	//public JScrollPane jScrollPanelOrderByPagosAutomaticos;	
	//protected JButton jButtonCerrarOrderByPagosAutomaticos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PagosAutomaticosLogic pagosautomaticosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPagosAutomaticos;
	public JScrollPane jScrollPanelDatosEdicionPagosAutomaticos;
	public JScrollPane jScrollPanelDatosGeneralPagosAutomaticos;
    
	
	
	//public JScrollPane jScrollPanelDatosPagosAutomaticosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPagosAutomaticos;
	//public JScrollPane jScrollPanelImportacionPagosAutomaticos;
	
	
	
	protected JPanel jPanelAccionesPagosAutomaticos;
	
    protected JPanel jPanelPaginacionPagosAutomaticos;
    protected JPanel jPanelParametrosReportesPagosAutomaticos;
	protected JPanel jPanelParametrosReportesAccionesPagosAutomaticos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PagosAutomaticos;
	protected JPanel jPanelParametrosAuxiliar2PagosAutomaticos;
	protected JPanel jPanelParametrosAuxiliar3PagosAutomaticos;
	protected JPanel jPanelParametrosAuxiliar4PagosAutomaticos;
	//protected JPanel jPanelParametrosAuxiliar5PagosAutomaticos;
	
	
	
	//protected JPanel jPanelReporteDinamicoPagosAutomaticos;
	//protected JPanel jPanelImportacionPagosAutomaticos;
	
	
	public JTable jTableDatosPagosAutomaticos;
	
	
	
	//public JTable jTableDatosPagosAutomaticosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPagosAutomaticos;
	protected JButton jButtonDuplicarPagosAutomaticos;
	protected JButton jButtonCopiarPagosAutomaticos;
	protected JButton jButtonVerFormPagosAutomaticos;
	protected JButton jButtonNuevoRelacionesPagosAutomaticos;
	protected JButton jButtonModificarPagosAutomaticos;
	
    protected JButton jButtonGuardarCambiosTablaPagosAutomaticos;
	protected JButton jButtonCerrarPagosAutomaticos;
	
	
	protected JButton jButtonRecargarInformacionPagosAutomaticos;
	protected JButton jButtonProcesarInformacionPagosAutomaticos;
	
	
	protected JButton jButtonAnterioresPagosAutomaticos;
	protected JButton jButtonSiguientesPagosAutomaticos;
	protected JButton jButtonNuevoGuardarCambiosPagosAutomaticos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPagosAutomaticos;
	//protected JButton jButtonCerrarReporteDinamicoPagosAutomaticos;
	//protected JButton jButtonGenerarExcelReporteDinamicoPagosAutomaticos;	
	
	
	
	//protected JButton jButtonAbrirImportacionPagosAutomaticos;
	//protected JButton jButtonGenerarImportacionPagosAutomaticos;
	//protected JButton jButtonCerrarImportacionPagosAutomaticos;
	//protected JFileChooser jFileChooserImportacionPagosAutomaticos;
	//protected File fileImportacionPagosAutomaticos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPagosAutomaticos;
	protected JButton jButtonDuplicarToolBarPagosAutomaticos;
	protected JButton jButtonNuevoRelacionesToolBarPagosAutomaticos;
	
	
	public JButton jButtonGuardarCambiosToolBarPagosAutomaticos;
	protected JButton jButtonCopiarToolBarPagosAutomaticos;
	protected JButton jButtonVerFormToolBarPagosAutomaticos;
	public JButton jButtonGuardarCambiosTablaToolBarPagosAutomaticos;
	protected JButton jButtonMostrarOcultarTablaToolBarPagosAutomaticos;
	protected JButton jButtonCerrarToolBarPagosAutomaticos;
	
	protected JButton jButtonRecargarInformacionToolBarPagosAutomaticos;
	protected JButton jButtonProcesarInformacionToolBarPagosAutomaticos;
	protected JButton jButtonAnterioresToolBarPagosAutomaticos;
	protected JButton jButtonSiguientesToolBarPagosAutomaticos;
	protected JButton jButtonNuevoGuardarCambiosToolBarPagosAutomaticos;
	protected JButton jButtonAbrirOrderByToolBarPagosAutomaticos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPagosAutomaticos;
	protected JMenuItem jMenuItemDuplicarPagosAutomaticos;
	protected JMenuItem jMenuItemNuevoRelacionesPagosAutomaticos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPagosAutomaticos;
	protected JMenuItem jMenuItemCopiarPagosAutomaticos;
	protected JMenuItem jMenuItemVerFormPagosAutomaticos;
	protected JMenuItem jMenuItemGuardarCambiosTablaPagosAutomaticos;
	protected JMenuItem jMenuItemCerrarPagosAutomaticos;
	protected JMenuItem jMenuItemDetalleCerrarPagosAutomaticos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPagosAutomaticos;
	protected JMenuItem jMenuItemDetalleMostarOcultarPagosAutomaticos;
	
	protected JMenuItem jMenuItemRecargarInformacionPagosAutomaticos;
	protected JMenuItem jMenuItemProcesarInformacionPagosAutomaticos;
	protected JMenuItem jMenuItemAnterioresPagosAutomaticos;
	protected JMenuItem jMenuItemSiguientesPagosAutomaticos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPagosAutomaticos;
	protected JMenuItem jMenuItemAbrirOrderByPagosAutomaticos;
	protected JMenuItem jMenuItemMostrarOcultarPagosAutomaticos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPagosAutomaticos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPagosAutomaticos;
	protected JCheckBox jCheckBoxSeleccionadosPagosAutomaticos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPagosAutomaticos;
	protected JCheckBox jCheckBoxConGraficoReportePagosAutomaticos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPagosAutomaticos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPagosAutomaticos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPagosAutomaticos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPagosAutomaticos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPagosAutomaticos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPagosAutomaticos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPagosAutomaticos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPagosAutomaticos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPagosAutomaticos;
	protected JTextField jTextFieldValorCampoGeneralPagosAutomaticos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePagosAutomaticos;
	//public JList<Reporte> jListColumnasSelectReportePagosAutomaticos;
	//public JScrollPane jScrollColumnasSelectReportePagosAutomaticos;
	
	//public JLabel jLabelRelacionesSelectReportePagosAutomaticos;
	//public JList<Reporte> jListRelacionesSelectReportePagosAutomaticos;
	//public JScrollPane jScrollRelacionesSelectReportePagosAutomaticos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPagosAutomaticos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPagosAutomaticos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPagosAutomaticos;
	//public JLabel jLabelTiposArchivoReporteDinamicoPagosAutomaticos;
	
		
	//public JLabel jLabelArchivoImportacionPagosAutomaticos;	
	//public JLabel jLabelPathArchivoImportacionPagosAutomaticos;
	//protected JTextField jTextFieldPathArchivoImportacionPagosAutomaticos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPagosAutomaticos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPagosAutomaticos;
	
	//public JLabel jLabelColumnaCategoriaValorPagosAutomaticos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPagosAutomaticos;
	
	//public JLabel jLabelColumnasValoresGraficoPagosAutomaticos;
	//public JList<Reporte> jListColumnasValoresGraficoPagosAutomaticos;
	//public JScrollPane jScrollColumnasValoresGraficoPagosAutomaticos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPagosAutomaticos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPagosAutomaticos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPagosAutomaticos;
	public JPanel jPanelBusquedaPagosAutomaticosPagosAutomaticos;
	public JButton jButtonBusquedaPagosAutomaticosPagosAutomaticos;
	
	public JPanel jPanelfecha_corteBusquedaPagosAutomaticosPagosAutomaticos;
	public JLabel jLabelfecha_corteBusquedaPagosAutomaticosPagosAutomaticos;
	//public JFormattedTextField jDateChooserfecha_corteBusquedaPagosAutomaticosPagosAutomaticos;

	public JDateChooser jDateChooserfecha_corteBusquedaPagosAutomaticosPagosAutomaticos;
	public JButton jButtonfecha_corteBusquedaPagosAutomaticosPagosAutomaticosBusqueda= new JButtonMe();

	
	
	
	
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
	public PagosAutomaticosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PagosAutomaticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutomaticosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagosAutomaticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutomaticosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagosAutomaticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutomaticosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PagosAutomaticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPagosAutomaticos)	{
		this.jButtonRecargarInformacionPagosAutomaticos = jButtonRecargarInformacionPagosAutomaticos;
	}
	
	public JButton getjButtonProcesarInformacionPagosAutomaticos() {
		return this.jButtonProcesarInformacionPagosAutomaticos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPagosAutomaticos)	{
		this.jButtonProcesarInformacionPagosAutomaticos = jButtonProcesarInformacionPagosAutomaticos;
	}
	
	
	public JButton getjButtonRecargarInformacionPagosAutomaticos() {
		return this.jButtonRecargarInformacionPagosAutomaticos;
	}
	
	
	public List<PagosAutomaticos> getpagosautomaticoss() {
		return this.pagosautomaticoss;
	}

	public void setpagosautomaticoss(List<PagosAutomaticos> pagosautomaticoss) {
		this.pagosautomaticoss = pagosautomaticoss;
	}
	
	public List<PagosAutomaticos> getpagosautomaticossAux() {
		return this.pagosautomaticossAux;
	}

	public void setpagosautomaticossAux(List<PagosAutomaticos> pagosautomaticossAux) {
		this.pagosautomaticossAux = pagosautomaticossAux;
	}
	
	public List<PagosAutomaticos> getpagosautomaticossEliminados() {
		return this.pagosautomaticossEliminados;
	}

	public void setPagosAutomaticossEliminados(List<PagosAutomaticos> pagosautomaticossEliminados) {
		this.pagosautomaticossEliminados = pagosautomaticossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPagosAutomaticos() {
		return jComboBoxTiposSeleccionarPagosAutomaticos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPagosAutomaticos(
			JComboBox jComboBoxTiposSeleccionarPagosAutomaticos) {
		this.jComboBoxTiposSeleccionarPagosAutomaticos = jComboBoxTiposSeleccionarPagosAutomaticos;
	}
	
	public void setBorderResaltarTiposSeleccionarPagosAutomaticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPagosAutomaticos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPagosAutomaticos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPagosAutomaticos() {
		return jTextFieldValorCampoGeneralPagosAutomaticos;
	}

	public void setjTextFieldValorCampoGeneralPagosAutomaticos(
			JTextField jTextFieldValorCampoGeneralPagosAutomaticos) {
		this.jTextFieldValorCampoGeneralPagosAutomaticos = jTextFieldValorCampoGeneralPagosAutomaticos;
	}

	public void setBorderResaltarValorCampoGeneralPagosAutomaticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutomaticos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPagosAutomaticos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPagosAutomaticos() {
		return this.jCheckBoxSeleccionarTodosPagosAutomaticos;
	}

	public void setjCheckBoxSeleccionarTodosPagosAutomaticos(
			JCheckBox jCheckBoxSeleccionarTodosPagosAutomaticos) {
		this.jCheckBoxSeleccionarTodosPagosAutomaticos = jCheckBoxSeleccionarTodosPagosAutomaticos;
	}

	public void setBorderResaltarSeleccionarTodosPagosAutomaticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutomaticos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPagosAutomaticos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPagosAutomaticos() {
		return this.jCheckBoxSeleccionadosPagosAutomaticos;
	}

	public void setjCheckBoxSeleccionadosPagosAutomaticos(
			JCheckBox jCheckBoxSeleccionadosPagosAutomaticos) {
		this.jCheckBoxSeleccionadosPagosAutomaticos = jCheckBoxSeleccionadosPagosAutomaticos;
	}
	
	public void setBorderResaltarSeleccionadosPagosAutomaticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutomaticos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPagosAutomaticos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPagosAutomaticos() {
		return this.jComboBoxTiposArchivosReportesPagosAutomaticos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPagosAutomaticos(
			JComboBox jComboBoxTiposArchivosReportesPagosAutomaticos) {
		this.jComboBoxTiposArchivosReportesPagosAutomaticos = jComboBoxTiposArchivosReportesPagosAutomaticos;
	}

	public void setBorderResaltarTiposArchivosReportesPagosAutomaticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutomaticos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPagosAutomaticos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPagosAutomaticos() {
		return this.jComboBoxTiposReportesPagosAutomaticos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPagosAutomaticos(
			JComboBox jComboBoxTiposReportesPagosAutomaticos) {
		this.jComboBoxTiposReportesPagosAutomaticos = jComboBoxTiposReportesPagosAutomaticos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPagosAutomaticos() {
	//	return jComboBoxTiposReportesDinamicoPagosAutomaticos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPagosAutomaticos(
	//		JComboBox jComboBoxTiposReportesDinamicoPagosAutomaticos) {
	//	this.jComboBoxTiposReportesDinamicoPagosAutomaticos = jComboBoxTiposReportesDinamicoPagosAutomaticos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPagosAutomaticos() {
	//	return jComboBoxTiposArchivosReportesDinamicoPagosAutomaticos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPagosAutomaticos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPagosAutomaticos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPagosAutomaticos = jComboBoxTiposArchivosReportesDinamicoPagosAutomaticos;
	//}
	
	public void setBorderResaltarTiposReportesPagosAutomaticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutomaticos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPagosAutomaticos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPagosAutomaticos() {
		return this.jComboBoxTiposGraficosReportesPagosAutomaticos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPagosAutomaticos(
			JComboBox jComboBoxTiposGraficosReportesPagosAutomaticos) {
		this.jComboBoxTiposGraficosReportesPagosAutomaticos = jComboBoxTiposGraficosReportesPagosAutomaticos;
	}
	
	public void setBorderResaltarTiposGraficosReportesPagosAutomaticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutomaticos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPagosAutomaticos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPagosAutomaticos() {
		return this.jComboBoxTiposPaginacionPagosAutomaticos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPagosAutomaticos(
			JComboBox jComboBoxTiposPaginacionPagosAutomaticos) {
		this.jComboBoxTiposPaginacionPagosAutomaticos = jComboBoxTiposPaginacionPagosAutomaticos;
	}
	
	public void setBorderResaltarTiposPaginacionPagosAutomaticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutomaticos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPagosAutomaticos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPagosAutomaticos() {
		return this.jComboBoxTiposRelacionesPagosAutomaticos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPagosAutomaticos() {
		return this.jComboBoxTiposAccionesPagosAutomaticos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPagosAutomaticos(
			JComboBox jComboBoxTiposRelacionesPagosAutomaticos) {
		this.jComboBoxTiposRelacionesPagosAutomaticos = jComboBoxTiposRelacionesPagosAutomaticos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPagosAutomaticos(
			JComboBox jComboBoxTiposAccionesPagosAutomaticos) {
		this.jComboBoxTiposAccionesPagosAutomaticos = jComboBoxTiposAccionesPagosAutomaticos;
	}
	
	public void setBorderResaltarTiposRelacionesPagosAutomaticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutomaticos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPagosAutomaticos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPagosAutomaticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutomaticos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPagosAutomaticos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPagosAutomaticos() {
	//	return jCheckBoxConGraficoDinamicoPagosAutomaticos;
	//}

	//public void setjCheckBoxConGraficoDinamicoPagosAutomaticos(
	//		JCheckBox jCheckBoxConGraficoDinamicoPagosAutomaticos) {
	//	this.jCheckBoxConGraficoDinamicoPagosAutomaticos = jCheckBoxConGraficoDinamicoPagosAutomaticos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPagosAutomaticos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPagosAutomaticos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPagosAutomaticos .setBorder(borderResaltar);		
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
		this.pagosautomaticosSessionBean=new PagosAutomaticosSessionBean();
		
		this.pagosautomaticosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pagosautomaticosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pagosautomaticosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PagosAutomaticosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PagosAutomaticosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PagosAutomaticosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PagosAutomaticosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PagosAutomaticosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pagos Automaticos MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
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
		
		PagosAutomaticosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PagosAutomaticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPagosAutomaticos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPagosAutomaticos,this.jTtoolBarPagosAutomaticos,
							"nuevo","nuevo","Nuevo"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPagosAutomaticos,this.jTtoolBarPagosAutomaticos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPagosAutomaticos,this.jTtoolBarPagosAutomaticos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPagosAutomaticos,this.jTtoolBarPagosAutomaticos,
							"duplicar","duplicar","Duplicar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPagosAutomaticos,this.jTtoolBarPagosAutomaticos,
							"copiar","copiar","Copiar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPagosAutomaticos,this.jTtoolBarPagosAutomaticos,
							"ver_form","ver_form","Ver"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPagosAutomaticos,this.jTtoolBarPagosAutomaticos,
							"recargar","recargar","Buscar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPagosAutomaticos,this.jTtoolBarPagosAutomaticos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPagosAutomaticos,this.jTtoolBarPagosAutomaticos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPagosAutomaticos,this.jTtoolBarPagosAutomaticos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPagosAutomaticos,this.jTtoolBarPagosAutomaticos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPagosAutomaticos,this.jTtoolBarPagosAutomaticos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPagosAutomaticos,this.jTtoolBarPagosAutomaticos,
							"cerrar","cerrar","Salir"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPagosAutomaticos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPagosAutomaticos;
			
				this.jButtonProcesarInformacionToolBarPagosAutomaticos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPagosAutomaticos;
				
		//protected JButton jButtonModificarToolBarPagosAutomaticos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPagosAutomaticos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPagosAutomaticos=new JMenuMe("General");
		this.jmenuArchivoPagosAutomaticos=new JMenuMe("Archivo");
		this.jmenuAccionesPagosAutomaticos=new JMenuMe("Acciones");
		this.jmenuDatosPagosAutomaticos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPagosAutomaticos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPagosAutomaticos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPagosAutomaticos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPagosAutomaticos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPagosAutomaticos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPagosAutomaticos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPagosAutomaticos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPagosAutomaticos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPagosAutomaticos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPagosAutomaticos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPagosAutomaticos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPagosAutomaticos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPagosAutomaticos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPagosAutomaticos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPagosAutomaticos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPagosAutomaticos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPagosAutomaticos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPagosAutomaticos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPagosAutomaticos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPagosAutomaticos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPagosAutomaticos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPagosAutomaticos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPagosAutomaticos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPagosAutomaticos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPagosAutomaticos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPagosAutomaticos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPagosAutomaticos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPagosAutomaticos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPagosAutomaticos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPagosAutomaticos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPagosAutomaticos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPagosAutomaticos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPagosAutomaticos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPagosAutomaticos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPagosAutomaticos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPagosAutomaticos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPagosAutomaticos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPagosAutomaticos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPagosAutomaticos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPagosAutomaticos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPagosAutomaticos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPagosAutomaticos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPagosAutomaticos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPagosAutomaticos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPagosAutomaticos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPagosAutomaticos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPagosAutomaticos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPagosAutomaticos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPagosAutomaticos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPagosAutomaticos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPagosAutomaticos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPagosAutomaticos.add(this.jMenuItemCerrarPagosAutomaticos);
			
			this.jmenuAccionesPagosAutomaticos.add(this.jMenuItemNuevoPagosAutomaticos);
			this.jmenuAccionesPagosAutomaticos.add(this.jMenuItemNuevoGuardarCambiosPagosAutomaticos);
			this.jmenuAccionesPagosAutomaticos.add(this.jMenuItemNuevoRelacionesPagosAutomaticos);
			this.jmenuAccionesPagosAutomaticos.add(this.jMenuItemGuardarCambiosTablaPagosAutomaticos);		
			this.jmenuAccionesPagosAutomaticos.add(this.jMenuItemDuplicarPagosAutomaticos);		
			this.jmenuAccionesPagosAutomaticos.add(this.jMenuItemCopiarPagosAutomaticos);		
			this.jmenuAccionesPagosAutomaticos.add(this.jMenuItemVerFormPagosAutomaticos);		
			
			this.jmenuDatosPagosAutomaticos.add(this.jMenuItemRecargarInformacionPagosAutomaticos);				
			this.jmenuDatosPagosAutomaticos.add(this.jMenuItemAnterioresPagosAutomaticos);				
			this.jmenuDatosPagosAutomaticos.add(this.jMenuItemSiguientesPagosAutomaticos);				
			this.jmenuDatosPagosAutomaticos.add(this.jMenuItemAbrirOrderByPagosAutomaticos);				
			this.jmenuDatosPagosAutomaticos.add(this.jMenuItemMostrarOcultarPagosAutomaticos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPagosAutomaticos.add(this.jMenuItemGuardarCambiosPagosAutomaticos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPagosAutomaticos.add(this.jmenuArchivoPagosAutomaticos);		
			this.jmenuBarPagosAutomaticos.add(this.jmenuAccionesPagosAutomaticos);		
			this.jmenuBarPagosAutomaticos.add(this.jmenuDatosPagosAutomaticos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPagosAutomaticos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPagosAutomaticos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPagosAutomaticosPagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPagosAutomaticosPagosAutomaticos.setToolTipText("Buscar Por Fecha Corte Base ");
		this.jButtonBusquedaPagosAutomaticosPagosAutomaticos= new JButtonMe();
		this.jButtonBusquedaPagosAutomaticosPagosAutomaticos.setText("Buscar");
		this.jButtonBusquedaPagosAutomaticosPagosAutomaticos.setToolTipText("Buscar Por Fecha Corte Base ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPagosAutomaticosPagosAutomaticos,"buscar_button","Buscar Por Fecha Corte Base ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPagosAutomaticosPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_corteBusquedaPagosAutomaticosPagosAutomaticos = new JLabelMe();
		jLabelfecha_corteBusquedaPagosAutomaticosPagosAutomaticos.setText("Fecha Corte Base :");
		jLabelfecha_corteBusquedaPagosAutomaticosPagosAutomaticos.setToolTipText("Fecha Corte Base");
		jLabelfecha_corteBusquedaPagosAutomaticosPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_corteBusquedaPagosAutomaticosPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_corteBusquedaPagosAutomaticosPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_corteBusquedaPagosAutomaticosPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_corteBusquedaPagosAutomaticosPagosAutomaticos= new JDateChooser();
		jDateChooserfecha_corteBusquedaPagosAutomaticosPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_corteBusquedaPagosAutomaticosPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_corteBusquedaPagosAutomaticosPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_corteBusquedaPagosAutomaticosPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_corteBusquedaPagosAutomaticosPagosAutomaticos.setDate(new Date());
		jDateChooserfecha_corteBusquedaPagosAutomaticosPagosAutomaticos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_corteBusquedaPagosAutomaticosPagosAutomaticos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasPagosAutomaticos=new JTabbedPane();


		this.jTabbedPaneBusquedasPagosAutomaticos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasPagosAutomaticos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasPagosAutomaticos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPagosAutomaticos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePagosAutomaticos = new PagosAutomaticosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pagos Automaticos DATOS");
			this.jInternalFrameDetalleFormPagosAutomaticos = new PagosAutomaticosDetalleFormJInternalFrame(jDesktopPane,this.pagosautomaticosSessionBean.getConGuardarRelaciones(),this.pagosautomaticosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPagosAutomaticos = null;//new PagosAutomaticosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPagosAutomaticos= new GridBagLayout();
		
		
		this.jTableDatosPagosAutomaticos = new JTableMe();      
		
		String sToolTipPagosAutomaticos="";
		sToolTipPagosAutomaticos=PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPagosAutomaticos+="(Tesoreria.PagosAutomaticos)";
		}
		
		if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
			sToolTipPagosAutomaticos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPagosAutomaticos.setToolTipText(sToolTipPagosAutomaticos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPagosAutomaticos);
		this.jTableDatosPagosAutomaticos.setAutoCreateRowSorter(true);
		this.jTableDatosPagosAutomaticos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPagosAutomaticos.setRowSelectionAllowed(true);
		this.jTableDatosPagosAutomaticos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPagosAutomaticos = new JButtonMe();
		this.jButtonDuplicarPagosAutomaticos = new JButtonMe();
		this.jButtonCopiarPagosAutomaticos = new JButtonMe();
		this.jButtonVerFormPagosAutomaticos = new JButtonMe();
		this.jButtonNuevoRelacionesPagosAutomaticos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPagosAutomaticos = new JButtonMe();
		this.jButtonCerrarPagosAutomaticos = new JButtonMe();
		
		this.jScrollPanelDatosPagosAutomaticos = new JScrollPane();   
        this.jScrollPanelDatosGeneralPagosAutomaticos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPagosAutomaticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Pagos Automaticos";
		
		if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Automaticoses" + this.sPath));
		} else {
			this.jScrollPanelDatosPagosAutomaticos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPagosAutomaticos.setToolTipText("Acciones");
        this.jPanelAccionesPagosAutomaticos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPagosAutomaticos=new ReporteDinamicoJInternalFrame(PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPagosAutomaticos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPagosAutomaticos=new ImportacionJInternalFrame(PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPagosAutomaticos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPagosAutomaticos = new JButtonMe();
		
		this.jButtonAbrirOrderByPagosAutomaticos.setText("Orden");
		this.jButtonAbrirOrderByPagosAutomaticos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPagosAutomaticos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPagosAutomaticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPagosAutomaticos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagosAutomaticos,false,this);
			
			//this.cargarOrderByPagosAutomaticos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPagosAutomaticos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagosAutomaticos,true,this);
			
			//this.cargarOrderByPagosAutomaticos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPagosAutomaticos.setMinimumSize(new Dimension(400,50));//1630
		this.jTableDatosPagosAutomaticos.setMaximumSize(new Dimension(400,50));//1630
		this.jTableDatosPagosAutomaticos.setPreferredSize(new Dimension(400,50));//1630
		
		this.jScrollPanelDatosPagosAutomaticos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPagosAutomaticos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPagosAutomaticos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPagosAutomaticos.setText("Nuevo");
		this.jButtonDuplicarPagosAutomaticos.setText("Duplicar");
		this.jButtonCopiarPagosAutomaticos.setText("Copiar");
		this.jButtonVerFormPagosAutomaticos.setText("Ver");
		this.jButtonNuevoRelacionesPagosAutomaticos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPagosAutomaticos.setText("Guardar");
		this.jButtonCerrarPagosAutomaticos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPagosAutomaticos,"nuevo_button","Nuevo",this.pagosautomaticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPagosAutomaticos,"duplicar_button","Duplicar",this.pagosautomaticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPagosAutomaticos,"copiar_button","Copiar",this.pagosautomaticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPagosAutomaticos,"ver_form","Ver",this.pagosautomaticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPagosAutomaticos,"nuevorelaciones_button","Nuevo Rel",this.pagosautomaticosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPagosAutomaticos,"guardarcambiostabla_button","Guardar",this.pagosautomaticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPagosAutomaticos,"cerrar_button","Salir",this.pagosautomaticosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPagosAutomaticos.setToolTipText("Nuevo"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPagosAutomaticos.setToolTipText("Duplicar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPagosAutomaticos.setToolTipText("Copiar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPagosAutomaticos.setToolTipText("Ver"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPagosAutomaticos.setToolTipText("Nuevo Rel"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPagosAutomaticos.setToolTipText("Guardar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPagosAutomaticos.setToolTipText("Salir"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPagosAutomaticos";
		inputMap = this.jButtonNuevoPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPagosAutomaticos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPagosAutomaticos"));
		
		//DUPLICAR
		sMapKey = "DuplicarPagosAutomaticos";
		inputMap = this.jButtonDuplicarPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPagosAutomaticos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPagosAutomaticos"));
		
		//COPIAR
		sMapKey = "CopiarPagosAutomaticos";
		inputMap = this.jButtonCopiarPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPagosAutomaticos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPagosAutomaticos"));
		
		//VEr FORM
		sMapKey = "VerFormPagosAutomaticos";
		inputMap = this.jButtonVerFormPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPagosAutomaticos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPagosAutomaticos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPagosAutomaticos";
		inputMap = this.jButtonNuevoRelacionesPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPagosAutomaticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPagosAutomaticos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPagosAutomaticos";
		inputMap = this.jButtonModificarPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPagosAutomaticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPagosAutomaticos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPagosAutomaticos";
		inputMap = this.jButtonCerrarPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPagosAutomaticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPagosAutomaticos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPagosAutomaticos";
		inputMap = this.jButtonGuardarCambiosTablaPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPagosAutomaticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPagosAutomaticos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPagosAutomaticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPagosAutomaticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPagosAutomaticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PagosAutomaticos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PagosAutomaticos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PagosAutomaticos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PagosAutomaticos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PagosAutomaticos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPagosAutomaticos.setName("jPanelParametrosReportesPagosAutomaticos"); 
		
		this.jPanelParametrosReportesAccionesPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPagosAutomaticos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPagosAutomaticos.setName("jPanelParametrosReportesAccionesPagosAutomaticos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPagosAutomaticos = new JButtonMe();
		this.jButtonRecargarInformacionPagosAutomaticos.setText("Buscar");
		this.jButtonRecargarInformacionPagosAutomaticos.setToolTipText("Buscar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPagosAutomaticos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionPagosAutomaticos.setVisible(false);
		
		
		this.jButtonProcesarInformacionPagosAutomaticos = new JButtonMe();
		this.jButtonProcesarInformacionPagosAutomaticos.setText("Procesar");
		this.jButtonProcesarInformacionPagosAutomaticos.setToolTipText("Procesar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPagosAutomaticos.setVisible(false);
			
		this.jButtonProcesarInformacionPagosAutomaticos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPagosAutomaticos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPagosAutomaticos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPagosAutomaticos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPagosAutomaticos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPagosAutomaticos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPagosAutomaticos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPagosAutomaticos.setText("TIPO");       
		this.jComboBoxTiposReportesPagosAutomaticos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPagosAutomaticos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPagosAutomaticos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPagosAutomaticos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPagosAutomaticos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPagosAutomaticos.setText("Paginacion");
		this.jComboBoxTiposPaginacionPagosAutomaticos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPagosAutomaticos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPagosAutomaticos.setText("Accion");
		this.jComboBoxTiposRelacionesPagosAutomaticos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPagosAutomaticos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPagosAutomaticos.setText("Accion");
		this.jComboBoxTiposAccionesPagosAutomaticos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPagosAutomaticos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPagosAutomaticos.setText("Accion");
		this.jComboBoxTiposSeleccionarPagosAutomaticos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPagosAutomaticos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPagosAutomaticos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPagosAutomaticos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPagosAutomaticos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPagosAutomaticos = new JLabelMe();
		
		this.jLabelAccionesPagosAutomaticos.setText("Acciones");		
		this.jLabelAccionesPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPagosAutomaticos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPagosAutomaticos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPagosAutomaticos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPagosAutomaticos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPagosAutomaticos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPagosAutomaticos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPagosAutomaticos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPagosAutomaticos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPagosAutomaticos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePagosAutomaticos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePagosAutomaticos.setText("Graf.");
		this.jCheckBoxConGraficoReportePagosAutomaticos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPagosAutomaticos = new JButtonMe();
		//this.jButtonAnterioresPagosAutomaticos.setText("<<");
        this.jButtonAnterioresPagosAutomaticos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPagosAutomaticos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPagosAutomaticos = new JButtonMe();
		//this.jButtonSiguientesPagosAutomaticos.setText(">>");
        this.jButtonSiguientesPagosAutomaticos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPagosAutomaticos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPagosAutomaticos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPagosAutomaticos.setText("Nue");
        this.jButtonNuevoGuardarCambiosPagosAutomaticos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPagosAutomaticos,"nuevoguardarcambios_button","Nue",this.pagosautomaticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPagosAutomaticos";
		inputMap = this.jButtonNuevoGuardarCambiosPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPagosAutomaticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPagosAutomaticos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPagosAutomaticos";
		inputMap = this.jButtonRecargarInformacionPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPagosAutomaticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPagosAutomaticos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPagosAutomaticos";
		inputMap = this.jButtonSiguientesPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPagosAutomaticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPagosAutomaticos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPagosAutomaticos";
		inputMap = this.jButtonAnterioresPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPagosAutomaticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPagosAutomaticos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPagosAutomaticos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPagosAutomaticos.setMinimumSize(new Dimension(this.getWidth(),PagosAutomaticosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PagosAutomaticosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPagosAutomaticos.setMaximumSize(new Dimension(this.getWidth(),PagosAutomaticosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PagosAutomaticosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPagosAutomaticos.setPreferredSize(new Dimension(this.getWidth(),PagosAutomaticosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PagosAutomaticosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPagosAutomaticos = new GridBagLayout();

			this.jPanelPaginacionPagosAutomaticos.setLayout(gridaBagLayoutPaginacionPagosAutomaticos);						
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy = 0;
			this.gridBagConstraintsPagosAutomaticos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPagosAutomaticos.add(this.jButtonAnterioresPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
					
						
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPagosAutomaticos.gridy = 0;
			
			this.jPanelPaginacionPagosAutomaticos.add(this.jButtonNuevoGuardarCambiosPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
						
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPagosAutomaticos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPagosAutomaticos.gridy = 0;
			this.jPanelPaginacionPagosAutomaticos.add(this.jButtonSiguientesPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy = 1;
			this.gridBagConstraintsPagosAutomaticos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagosAutomaticos.add(this.jButtonNuevoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
						
			
			
			if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
				this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPagosAutomaticos.gridy = 1;
				this.gridBagConstraintsPagosAutomaticos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPagosAutomaticos.add(this.jButtonGuardarCambiosTablaPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
			}
			
			
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy = 1;
			this.gridBagConstraintsPagosAutomaticos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagosAutomaticos.add(this.jButtonDuplicarPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy = 1;
			this.gridBagConstraintsPagosAutomaticos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagosAutomaticos.add(this.jButtonCopiarPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy = 1;
			this.gridBagConstraintsPagosAutomaticos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagosAutomaticos.add(this.jButtonVerFormPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy = 1;
			this.gridBagConstraintsPagosAutomaticos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPagosAutomaticos.add(this.jButtonCerrarPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
		
		
		this.jButtonRecargarInformacionPagosAutomaticos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPagosAutomaticos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPagosAutomaticos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPagosAutomaticos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPagosAutomaticos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPagosAutomaticos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPagosAutomaticos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPagosAutomaticos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPagosAutomaticos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPagosAutomaticos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPagosAutomaticos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPagosAutomaticos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPagosAutomaticos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPagosAutomaticos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPagosAutomaticos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPagosAutomaticos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPagosAutomaticos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPagosAutomaticos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPagosAutomaticos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagosAutomaticos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagosAutomaticos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPagosAutomaticos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPagosAutomaticos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPagosAutomaticos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPagosAutomaticos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPagosAutomaticos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPagosAutomaticos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePagosAutomaticos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePagosAutomaticos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePagosAutomaticos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPagosAutomaticos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPagosAutomaticos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPagosAutomaticos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPagosAutomaticos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPagosAutomaticos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPagosAutomaticos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPagosAutomaticos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPagosAutomaticos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PagosAutomaticos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PagosAutomaticos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PagosAutomaticos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PagosAutomaticos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPagosAutomaticos.setLayout(gridaBagParametrosReportesPagosAutomaticos);
			this.jPanelParametrosReportesAccionesPagosAutomaticos.setLayout(gridaBagParametrosReportesAccionesPagosAutomaticos);
			
			
			this.jPanelParametrosAuxiliar1PagosAutomaticos.setLayout(gridaBagParametrosAuxiliar1PagosAutomaticos);
			this.jPanelParametrosAuxiliar2PagosAutomaticos.setLayout(gridaBagParametrosAuxiliar2PagosAutomaticos);
			this.jPanelParametrosAuxiliar3PagosAutomaticos.setLayout(gridaBagParametrosAuxiliar3PagosAutomaticos);
			this.jPanelParametrosAuxiliar4PagosAutomaticos.setLayout(gridaBagParametrosAuxiliar4PagosAutomaticos);
			//this.jPanelParametrosAuxiliar5PagosAutomaticos.setLayout(gridaBagParametrosAuxiliar2PagosAutomaticos);			
			
			
			
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutomaticos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPagosAutomaticos.add(this.jButtonRecargarInformacionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutomaticos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PagosAutomaticos.add(this.jComboBoxTiposPaginacionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutomaticos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PagosAutomaticos.add(this.jCheckBoxConAltoMaximoTablaPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutomaticos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PagosAutomaticos.add(this.jComboBoxTiposArchivosReportesPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutomaticos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosAutomaticos.add(this.jPanelParametrosAuxiliar1PagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutomaticos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PagosAutomaticos.add(this.jComboBoxTiposReportesPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);																		
			
			
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutomaticos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PagosAutomaticos.add(this.jComboBoxTiposGraficosReportesPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutomaticos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosAutomaticos.add(this.jPanelParametrosAuxiliar4PagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutomaticos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosAutomaticos.add(this.jComboBoxTiposReportesPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutomaticos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagosAutomaticos.add(this.jCheckBoxGenerarReportePagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutomaticos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosAutomaticos.add(this.jPanelParametrosAuxiliar2PagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutomaticos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagosAutomaticos.add(this.jLabelAccionesPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
				this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPagosAutomaticos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPagosAutomaticos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPagosAutomaticos.add(this.jButtonAbrirOrderByPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutomaticos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPagosAutomaticos.add(this.jComboBoxTiposSeleccionarPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);			
			
			
			/*
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutomaticos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagosAutomaticos.add(this.jCheckBoxSeleccionarTodosPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutomaticos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagosAutomaticos.add(this.jCheckBoxConGraficoReportePagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutomaticos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PagosAutomaticos.add(this.jCheckBoxSeleccionarTodosPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);															
				
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutomaticos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PagosAutomaticos.add(this.jCheckBoxSeleccionadosPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);															
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutomaticos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PagosAutomaticos.add(this.jCheckBoxConGraficoReportePagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutomaticos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosAutomaticos.add(this.jPanelParametrosAuxiliar3PagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutomaticos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPagosAutomaticos.add(this.jComboBoxTiposAccionesPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPagosAutomaticos = new GridBagLayout();

			this.jScrollPanelDatosPagosAutomaticos.setLayout(gridaBagLayoutDatosPagosAutomaticos);
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy = 0;
			this.gridBagConstraintsPagosAutomaticos.gridx = 0;
			
			this.jScrollPanelDatosPagosAutomaticos.add(this.jTableDatosPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPagosAutomaticos.setViewportView(this.jTableDatosPagosAutomaticos);
		this.jTableDatosPagosAutomaticos.setFillsViewportHeight(true);
		this.jTableDatosPagosAutomaticos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPagosAutomaticos= new GridBagLayout();
		this.jPanelAccionesPagosAutomaticos.setLayout(gridaBagLayoutAccionesPagosAutomaticos);
		
		
		/*	
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 0;
			
		this.jPanelAccionesPagosAutomaticos.add(this.jButtonNuevoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPagosAutomaticosPagosAutomaticos= new GridBagLayout();
		gridaBagLayoutBusquedaPagosAutomaticosPagosAutomaticos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPagosAutomaticosPagosAutomaticos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPagosAutomaticosPagosAutomaticos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPagosAutomaticosPagosAutomaticos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPagosAutomaticosPagosAutomaticos.setLayout(gridaBagLayoutBusquedaPagosAutomaticosPagosAutomaticos);

		gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagosAutomaticos.gridy = 0;
		gridBagConstraintsPagosAutomaticos.gridx = 0;
		jPanelBusquedaPagosAutomaticosPagosAutomaticos.add(jLabelfecha_corteBusquedaPagosAutomaticosPagosAutomaticos, gridBagConstraintsPagosAutomaticos);

		gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagosAutomaticos.gridy = 0;
		gridBagConstraintsPagosAutomaticos.gridx = 1;
		jPanelBusquedaPagosAutomaticosPagosAutomaticos.add(jDateChooserfecha_corteBusquedaPagosAutomaticosPagosAutomaticos, gridBagConstraintsPagosAutomaticos);

		gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagosAutomaticos.gridy = 1;
		gridBagConstraintsPagosAutomaticos.gridx =1;
		jPanelBusquedaPagosAutomaticosPagosAutomaticos.add(jButtonBusquedaPagosAutomaticosPagosAutomaticos, gridBagConstraintsPagosAutomaticos);

		jTabbedPaneBusquedasPagosAutomaticos.addTab("1.-Por Fecha Corte Base ", jPanelBusquedaPagosAutomaticosPagosAutomaticos);
		jTabbedPaneBusquedasPagosAutomaticos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPagosAutomaticos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();						
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPagosAutomaticos.gridx = 0;		
			//this.gridBagConstraintsPagosAutomaticos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPagosAutomaticos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPagosAutomaticos.gridx = 0;		
		//this.gridBagConstraintsPagosAutomaticos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPagosAutomaticos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPagosAutomaticos.gridx = 0;		
			this.gridBagConstraintsPagosAutomaticos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPagosAutomaticos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutomaticos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);								
		
		
		/*
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutomaticos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		*/		
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPagosAutomaticos.gridx =0;
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPagosAutomaticos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
				
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutomaticos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PagosAutomaticosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPagosAutomaticos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPagosAutomaticos = new GridBagLayout();
			this.jPanelBusquedasParametrosPagosAutomaticos.setLayout(gridaBagLayoutBusquedasParametrosPagosAutomaticos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPagosAutomaticos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPagosAutomaticos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagosAutomaticos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagosAutomaticos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutomaticos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
			
			
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutomaticos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
			
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutomaticos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPagosAutomaticos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPagosAutomaticos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPagosAutomaticos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPagosAutomaticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPagosAutomaticos.setName("jPanelReporteDinamicoPagosAutomaticos"); 
		
		this.jPanelReporteDinamicoPagosAutomaticos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPagosAutomaticos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPagosAutomaticos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPagosAutomaticos.setLayout(gridaBagLayoutReporteDinamicoPagosAutomaticos);
		
		
		this.jInternalFrameReporteDinamicoPagosAutomaticos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPagosAutomaticos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePagosAutomaticos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPagosAutomaticos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPagosAutomaticos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPagosAutomaticos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPagosAutomaticos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPagosAutomaticos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPagosAutomaticos.setResizable(true);
	    this.jInternalFrameReporteDinamicoPagosAutomaticos.setClosable(true);
	    this.jInternalFrameReporteDinamicoPagosAutomaticos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPagosAutomaticos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPagosAutomaticos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPagosAutomaticos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Automaticoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePagosAutomaticos = new JLabelMe();

		this.jLabelColumnasSelectReportePagosAutomaticos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jLabelColumnasSelectReportePagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePagosAutomaticos = new JList<Reporte>();
		this.jListColumnasSelectReportePagosAutomaticos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePagosAutomaticos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePagosAutomaticos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePagosAutomaticos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePagosAutomaticos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePagosAutomaticos=new JScrollPane(this.jListColumnasSelectReportePagosAutomaticos);
			
			this.jScrollColumnasSelectReportePagosAutomaticos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePagosAutomaticos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePagosAutomaticos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPagosAutomaticos.add(this.jListColumnasSelectReportePagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jScrollColumnasSelectReportePagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePagosAutomaticos = new JLabelMe();

		this.jLabelRelacionesSelectReportePagosAutomaticos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePagosAutomaticos = new JList<Reporte>();
		this.jListRelacionesSelectReportePagosAutomaticos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePagosAutomaticos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePagosAutomaticos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePagosAutomaticos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePagosAutomaticos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePagosAutomaticos=new JScrollPane(this.jListRelacionesSelectReportePagosAutomaticos);
			
			this.jScrollRelacionesSelectReportePagosAutomaticos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePagosAutomaticos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePagosAutomaticos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPagosAutomaticos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPagosAutomaticos = new JComboBoxMe();
		this.jListColumnasValoresGraficoPagosAutomaticos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPagosAutomaticos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPagosAutomaticos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPagosAutomaticos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPagosAutomaticos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPagosAutomaticos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPagosAutomaticos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPagosAutomaticos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPagosAutomaticos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPagosAutomaticos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPagosAutomaticos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPagosAutomaticos = new JLabelMe();

		this.jLabelConGraficoDinamicoPagosAutomaticos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jLabelConGraficoDinamicoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPagosAutomaticos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPagosAutomaticos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPagosAutomaticos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPagosAutomaticos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPagosAutomaticos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPagosAutomaticos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jCheckBoxConGraficoDinamicoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPagosAutomaticos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPagosAutomaticos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jLabelColumnaCategoriaGraficoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPagosAutomaticos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPagosAutomaticos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPagosAutomaticos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPagosAutomaticos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPagosAutomaticos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPagosAutomaticos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jComboBoxColumnaCategoriaGraficoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPagosAutomaticos = new JLabelMe();

		this.jLabelColumnaCategoriaValorPagosAutomaticos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jLabelColumnaCategoriaValorPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPagosAutomaticos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPagosAutomaticos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPagosAutomaticos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPagosAutomaticos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPagosAutomaticos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPagosAutomaticos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jComboBoxColumnaCategoriaValorPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPagosAutomaticos = new JLabelMe();

		this.jLabelColumnasValoresGraficoPagosAutomaticos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jLabelColumnasValoresGraficoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPagosAutomaticos = new JList<Reporte>();
		this.jListColumnasValoresGraficoPagosAutomaticos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPagosAutomaticos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPagosAutomaticos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPagosAutomaticos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPagosAutomaticos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPagosAutomaticos=new JScrollPane(this.jListColumnasValoresGraficoPagosAutomaticos);
			
			this.jScrollColumnasValoresGraficoPagosAutomaticos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPagosAutomaticos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPagosAutomaticos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPagosAutomaticos.add(this.jListColumnasSelectReportePagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jScrollColumnasValoresGraficoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPagosAutomaticos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPagosAutomaticos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jLabelTiposGraficosReportesDinamicoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPagosAutomaticos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPagosAutomaticos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPagosAutomaticos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPagosAutomaticos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPagosAutomaticos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPagosAutomaticos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jComboBoxTiposGraficosReportesDinamicoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPagosAutomaticos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPagosAutomaticos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jLabelGenerarExcelReporteDinamicoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPagosAutomaticos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPagosAutomaticos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPagosAutomaticos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPagosAutomaticos.setToolTipText("Generar EXCEL"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPagosAutomaticos.add(this.jButtonGenerarExcelReporteDinamicoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jComboBoxTiposReportesDinamicoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPagosAutomaticos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPagosAutomaticos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jLabelTiposArchivoReporteDinamicoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jComboBoxTiposArchivosReportesDinamicoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPagosAutomaticos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPagosAutomaticos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPagosAutomaticos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPagosAutomaticos.setToolTipText("Generar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jButtonGenerarReporteDinamicoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPagosAutomaticos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPagosAutomaticos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPagosAutomaticos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPagosAutomaticos.setToolTipText("Cancelar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagosAutomaticos.add(this.jButtonCerrarReporteDinamicoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPagosAutomaticos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPagosAutomaticos= new JScrollPane(jPanelReporteDinamicoPagosAutomaticos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPagosAutomaticos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPagosAutomaticos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPagosAutomaticos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Automaticoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPagosAutomaticos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPagosAutomaticos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPagosAutomaticos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPagosAutomaticos);
		this.jInternalFrameReporteDinamicoPagosAutomaticos.getContentPane().add(this.jScrollPanelReporteDinamicoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPagosAutomaticos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPagosAutomaticos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPagosAutomaticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPagosAutomaticos.setName("jPanelImportacionPagosAutomaticos"); 
		
		this.jPanelImportacionPagosAutomaticos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPagosAutomaticos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPagosAutomaticos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPagosAutomaticos.setLayout(gridaBagLayoutImportacionPagosAutomaticos);
		
		
		this.jInternalFrameImportacionPagosAutomaticos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPagosAutomaticos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPagosAutomaticos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePagosAutomaticos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPagosAutomaticos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPagosAutomaticos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPagosAutomaticos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPagosAutomaticos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPagosAutomaticos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPagosAutomaticos.setResizable(true);
	    this.jInternalFrameImportacionPagosAutomaticos.setClosable(true);
	    this.jInternalFrameImportacionPagosAutomaticos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPagosAutomaticos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPagosAutomaticos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPagosAutomaticos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPagosAutomaticos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPagosAutomaticos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPagosAutomaticos.setResizable(true);
	    this.jInternalFrameImportacionPagosAutomaticos.setClosable(true);
	    this.jInternalFrameImportacionPagosAutomaticos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPagosAutomaticos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPagosAutomaticos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPagosAutomaticos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Automaticoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPagosAutomaticos = new JLabelMe();

		this.jLabelArchivoImportacionPagosAutomaticos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYImportacion;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPagosAutomaticos.add(this.jLabelArchivoImportacionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPagosAutomaticos = new JFileChooser();		
		this.jFileChooserImportacionPagosAutomaticos.setToolTipText("ESCOGER ARCHIVO"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPagosAutomaticos = new JButtonMe();
		this.jButtonAbrirImportacionPagosAutomaticos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPagosAutomaticos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPagosAutomaticos.setToolTipText("Generar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYImportacion;
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagosAutomaticos.add(this.jButtonAbrirImportacionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPagosAutomaticos = new JLabelMe();

		this.jLabelPathArchivoImportacionPagosAutomaticos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYImportacion;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPagosAutomaticos.add(this.jLabelPathArchivoImportacionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPagosAutomaticos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPagosAutomaticos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPagosAutomaticos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPagosAutomaticos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYImportacion;
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagosAutomaticos.add(this.jTextFieldPathArchivoImportacionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPagosAutomaticos = new JButtonMe();
		this.jButtonGenerarImportacionPagosAutomaticos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPagosAutomaticos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPagosAutomaticos.setToolTipText("Generar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYImportacion;
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagosAutomaticos.add(this.jButtonGenerarImportacionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPagosAutomaticos = new JButtonMe();
		this.jButtonCerrarImportacionPagosAutomaticos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPagosAutomaticos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPagosAutomaticos.setToolTipText("Cancelar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = iPosYImportacion;
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagosAutomaticos.add(this.jButtonCerrarImportacionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPagosAutomaticos = new GridBagLayout();
		
		this.jScrollPanelImportacionPagosAutomaticos= new JScrollPane(jPanelImportacionPagosAutomaticos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy =iPosYImportacion;
		this.gridBagConstraintsPagosAutomaticos.gridx =iPosXImportacion;
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPagosAutomaticos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPagosAutomaticos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPagosAutomaticos);
		this.jInternalFrameImportacionPagosAutomaticos.getContentPane().add(this.jScrollPanelImportacionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPagosAutomaticos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPagosAutomaticos = new JButtonMe();
			this.jButtonAbrirOrderByPagosAutomaticos.setText("Orden");
			this.jButtonAbrirOrderByPagosAutomaticos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPagosAutomaticos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPagosAutomaticos";
			inputMap = this.jButtonAbrirOrderByPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPagosAutomaticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPagosAutomaticos"));
		
		
			GridBagLayout gridaBagLayoutOrderByPagosAutomaticos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPagosAutomaticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPagosAutomaticos.setName("jPanelOrderByPagosAutomaticos"); 
			
			this.jPanelOrderByPagosAutomaticos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPagosAutomaticos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPagosAutomaticos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPagosAutomaticos.setLayout(gridaBagLayoutOrderByPagosAutomaticos);
			
			
			this.jTableDatosPagosAutomaticosOrderBy = new JTableMe();        
			this.jTableDatosPagosAutomaticosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPagosAutomaticosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPagosAutomaticosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPagosAutomaticosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPagosAutomaticosOrderBy.setViewportView(this.jTableDatosPagosAutomaticosOrderBy);
			this.jTableDatosPagosAutomaticosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPagosAutomaticosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPagosAutomaticos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPagosAutomaticos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPagosAutomaticos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePagosAutomaticos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPagosAutomaticos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPagosAutomaticos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPagosAutomaticos.setTitle("Orden");
			this.jInternalFrameOrderByPagosAutomaticos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPagosAutomaticos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPagosAutomaticos.setResizable(true);
			this.jInternalFrameOrderByPagosAutomaticos.setClosable(true);
			this.jInternalFrameOrderByPagosAutomaticos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPagosAutomaticos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPagosAutomaticos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPagosAutomaticos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Automaticoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPagosAutomaticos.gridx =iPosXOrderBy;
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPagosAutomaticos.ipady =150;
				
			this.jPanelOrderByPagosAutomaticos.add(jScrollPanelDatosPagosAutomaticosOrderBy, this.gridBagConstraintsPagosAutomaticos);//this.jTableDatosPagosAutomaticosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPagosAutomaticos = new JButtonMe();
			this.jButtonCerrarOrderByPagosAutomaticos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPagosAutomaticos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPagosAutomaticos.setToolTipText("Cancelar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPagosAutomaticos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPagosAutomaticos.add(this.jButtonCerrarOrderByPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPagosAutomaticos = new GridBagLayout();
			
			this.jScrollPanelOrderByPagosAutomaticos= new JScrollPane(jPanelOrderByPagosAutomaticos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.gridy =iPosYOrderBy;
			this.gridBagConstraintsPagosAutomaticos.gridx =iPosXOrderBy;
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPagosAutomaticos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPagosAutomaticos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPagosAutomaticos);
			
			this.jInternalFrameOrderByPagosAutomaticos.getContentPane().add(this.jScrollPanelOrderByPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);			
		
		} else {
			this.jButtonAbrirOrderByPagosAutomaticos = new JButtonMe();
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
		//	&& this.pagosautomaticosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPagosAutomaticos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPagosAutomaticos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosPagosAutomaticos.getRowHeight();//PagosAutomaticosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PagosAutomaticosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPagosAutomaticos.isSelected()) {
					iHeightTable=PagosAutomaticosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PagosAutomaticosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PagosAutomaticosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PagosAutomaticosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPagosAutomaticos.isSelected()) {
					iHeightTable=PagosAutomaticosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PagosAutomaticosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PagosAutomaticosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPagosAutomaticos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPagosAutomaticos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPagosAutomaticos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPagosAutomaticos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPagosAutomaticos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPagosAutomaticos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPagosAutomaticos!=null && this.jInternalFrameOrderByPagosAutomaticos.getjTableDatosOrderBy()!=null) {
			//if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPagosAutomaticos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPagosAutomaticos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPagosAutomaticos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPagosAutomaticos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPagosAutomaticos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPagosAutomaticos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPagosAutomaticos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPagosAutomaticos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPagosAutomaticos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPagosAutomaticos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=pagosautomaticosLogic.getPagosAutomaticoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pagosautomaticoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PagosAutomaticos> TraerPagosAutomaticosBeans(List<PagosAutomaticos> pagosautomaticoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(PagosAutomaticos pagosautomaticos:pagosautomaticoss) {
					
				if(!(PagosAutomaticosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PagosAutomaticosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					pagosautomaticos.setsDetalleGeneralEntityReporte(PagosAutomaticosConstantesFunciones.getPagosAutomaticosDescripcion(pagosautomaticos));
										
					pagosautomaticos.setesta_autorizado_descripcion(PagosAutomaticosConstantesFunciones.getesta_autorizadoDescripcion(pagosautomaticos));	
					
						
					
				} else  {
							
					//pagosautomaticos.setsDetalleGeneralEntityReporte(pagosautomaticos.getsDetalleGeneralEntityReporte());
										
				}
				
				//pagosautomaticosbeans.add(pagosautomaticosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return pagosautomaticoss;
    }
	//PARA REPORTES FIN
}
