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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.tesoreria.util.report.PagosAutorizadosProcesoConstantesFunciones;

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
public class PagosAutorizadosProcesoJInternalFrame extends PagosAutorizadosProcesoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPagosAutorizadosProceso;
	
	protected JMenuBar jmenuBarPagosAutorizadosProceso;
	
	protected JMenu jmenuPagosAutorizadosProceso;
	protected JMenu jmenuDatosPagosAutorizadosProceso;
	protected JMenu jmenuArchivoPagosAutorizadosProceso;
	protected JMenu jmenuAccionesPagosAutorizadosProceso;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPagosAutorizadosProceso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPagosAutorizadosProceso;	
	protected GridBagConstraints gridBagConstraintsPagosAutorizadosProceso;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PagosAutorizadosProcesoDetalleFormJInternalFrame jInternalFrameDetalleFormPagosAutorizadosProceso;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPagosAutorizadosProceso;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPagosAutorizadosProceso;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public PagosAutorizadosProcesoSessionBean pagosautorizadosprocesoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PagosAutorizadosProceso> pagosautorizadosprocesos;		
	public List<PagosAutorizadosProceso> pagosautorizadosprocesosEliminados;	
	public List<PagosAutorizadosProceso> pagosautorizadosprocesosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPagosAutorizadosProceso;		
	protected JButton jButtonAbrirOrderByPagosAutorizadosProceso;
	
	
	//protected JPanel jPanelOrderByPagosAutorizadosProceso;
	//public JScrollPane jScrollPanelOrderByPagosAutorizadosProceso;	
	//protected JButton jButtonCerrarOrderByPagosAutorizadosProceso;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PagosAutorizadosProcesoLogic pagosautorizadosprocesoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPagosAutorizadosProceso;
	public JScrollPane jScrollPanelDatosEdicionPagosAutorizadosProceso;
	public JScrollPane jScrollPanelDatosGeneralPagosAutorizadosProceso;
    
	
	
	//public JScrollPane jScrollPanelDatosPagosAutorizadosProcesoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPagosAutorizadosProceso;
	//public JScrollPane jScrollPanelImportacionPagosAutorizadosProceso;
	
	
	
	protected JPanel jPanelAccionesPagosAutorizadosProceso;
	
    protected JPanel jPanelPaginacionPagosAutorizadosProceso;
    protected JPanel jPanelParametrosReportesPagosAutorizadosProceso;
	protected JPanel jPanelParametrosReportesAccionesPagosAutorizadosProceso;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PagosAutorizadosProceso;
	protected JPanel jPanelParametrosAuxiliar2PagosAutorizadosProceso;
	protected JPanel jPanelParametrosAuxiliar3PagosAutorizadosProceso;
	protected JPanel jPanelParametrosAuxiliar4PagosAutorizadosProceso;
	//protected JPanel jPanelParametrosAuxiliar5PagosAutorizadosProceso;
	
	
	
	//protected JPanel jPanelReporteDinamicoPagosAutorizadosProceso;
	//protected JPanel jPanelImportacionPagosAutorizadosProceso;
	
	
	public JTable jTableDatosPagosAutorizadosProceso;
	
	
	
	//public JTable jTableDatosPagosAutorizadosProcesoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPagosAutorizadosProceso;
	protected JButton jButtonDuplicarPagosAutorizadosProceso;
	protected JButton jButtonCopiarPagosAutorizadosProceso;
	protected JButton jButtonVerFormPagosAutorizadosProceso;
	protected JButton jButtonNuevoRelacionesPagosAutorizadosProceso;
	protected JButton jButtonModificarPagosAutorizadosProceso;
	
    protected JButton jButtonGuardarCambiosTablaPagosAutorizadosProceso;
	protected JButton jButtonCerrarPagosAutorizadosProceso;
	
	
	protected JButton jButtonRecargarInformacionPagosAutorizadosProceso;
	protected JButton jButtonProcesarInformacionPagosAutorizadosProceso;
	
	
	protected JButton jButtonAnterioresPagosAutorizadosProceso;
	protected JButton jButtonSiguientesPagosAutorizadosProceso;
	protected JButton jButtonNuevoGuardarCambiosPagosAutorizadosProceso;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPagosAutorizadosProceso;
	//protected JButton jButtonCerrarReporteDinamicoPagosAutorizadosProceso;
	//protected JButton jButtonGenerarExcelReporteDinamicoPagosAutorizadosProceso;	
	
	
	
	//protected JButton jButtonAbrirImportacionPagosAutorizadosProceso;
	//protected JButton jButtonGenerarImportacionPagosAutorizadosProceso;
	//protected JButton jButtonCerrarImportacionPagosAutorizadosProceso;
	//protected JFileChooser jFileChooserImportacionPagosAutorizadosProceso;
	//protected File fileImportacionPagosAutorizadosProceso;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPagosAutorizadosProceso;
	protected JButton jButtonDuplicarToolBarPagosAutorizadosProceso;
	protected JButton jButtonNuevoRelacionesToolBarPagosAutorizadosProceso;
	
	
	public JButton jButtonGuardarCambiosToolBarPagosAutorizadosProceso;
	protected JButton jButtonCopiarToolBarPagosAutorizadosProceso;
	protected JButton jButtonVerFormToolBarPagosAutorizadosProceso;
	public JButton jButtonGuardarCambiosTablaToolBarPagosAutorizadosProceso;
	protected JButton jButtonMostrarOcultarTablaToolBarPagosAutorizadosProceso;
	protected JButton jButtonCerrarToolBarPagosAutorizadosProceso;
	
	protected JButton jButtonRecargarInformacionToolBarPagosAutorizadosProceso;
	protected JButton jButtonProcesarInformacionToolBarPagosAutorizadosProceso;
	protected JButton jButtonAnterioresToolBarPagosAutorizadosProceso;
	protected JButton jButtonSiguientesToolBarPagosAutorizadosProceso;
	protected JButton jButtonNuevoGuardarCambiosToolBarPagosAutorizadosProceso;
	protected JButton jButtonAbrirOrderByToolBarPagosAutorizadosProceso;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPagosAutorizadosProceso;
	protected JMenuItem jMenuItemDuplicarPagosAutorizadosProceso;
	protected JMenuItem jMenuItemNuevoRelacionesPagosAutorizadosProceso;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPagosAutorizadosProceso;
	protected JMenuItem jMenuItemCopiarPagosAutorizadosProceso;
	protected JMenuItem jMenuItemVerFormPagosAutorizadosProceso;
	protected JMenuItem jMenuItemGuardarCambiosTablaPagosAutorizadosProceso;
	protected JMenuItem jMenuItemCerrarPagosAutorizadosProceso;
	protected JMenuItem jMenuItemDetalleCerrarPagosAutorizadosProceso;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPagosAutorizadosProceso;
	protected JMenuItem jMenuItemDetalleMostarOcultarPagosAutorizadosProceso;
	
	protected JMenuItem jMenuItemRecargarInformacionPagosAutorizadosProceso;
	protected JMenuItem jMenuItemProcesarInformacionPagosAutorizadosProceso;
	protected JMenuItem jMenuItemAnterioresPagosAutorizadosProceso;
	protected JMenuItem jMenuItemSiguientesPagosAutorizadosProceso;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPagosAutorizadosProceso;
	protected JMenuItem jMenuItemAbrirOrderByPagosAutorizadosProceso;
	protected JMenuItem jMenuItemMostrarOcultarPagosAutorizadosProceso;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPagosAutorizadosProceso;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPagosAutorizadosProceso;
	protected JCheckBox jCheckBoxSeleccionadosPagosAutorizadosProceso;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPagosAutorizadosProceso;
	protected JCheckBox jCheckBoxConGraficoReportePagosAutorizadosProceso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPagosAutorizadosProceso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPagosAutorizadosProceso;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPagosAutorizadosProceso;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPagosAutorizadosProceso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPagosAutorizadosProceso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPagosAutorizadosProceso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPagosAutorizadosProceso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPagosAutorizadosProceso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPagosAutorizadosProceso;
	protected JTextField jTextFieldValorCampoGeneralPagosAutorizadosProceso;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePagosAutorizadosProceso;
	//public JList<Reporte> jListColumnasSelectReportePagosAutorizadosProceso;
	//public JScrollPane jScrollColumnasSelectReportePagosAutorizadosProceso;
	
	//public JLabel jLabelRelacionesSelectReportePagosAutorizadosProceso;
	//public JList<Reporte> jListRelacionesSelectReportePagosAutorizadosProceso;
	//public JScrollPane jScrollRelacionesSelectReportePagosAutorizadosProceso;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPagosAutorizadosProceso;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPagosAutorizadosProceso;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPagosAutorizadosProceso;
	//public JLabel jLabelTiposArchivoReporteDinamicoPagosAutorizadosProceso;
	
		
	//public JLabel jLabelArchivoImportacionPagosAutorizadosProceso;	
	//public JLabel jLabelPathArchivoImportacionPagosAutorizadosProceso;
	//protected JTextField jTextFieldPathArchivoImportacionPagosAutorizadosProceso;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPagosAutorizadosProceso;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPagosAutorizadosProceso;
	
	//public JLabel jLabelColumnaCategoriaValorPagosAutorizadosProceso;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPagosAutorizadosProceso;
	
	//public JLabel jLabelColumnasValoresGraficoPagosAutorizadosProceso;
	//public JList<Reporte> jListColumnasValoresGraficoPagosAutorizadosProceso;
	//public JScrollPane jScrollColumnasValoresGraficoPagosAutorizadosProceso;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPagosAutorizadosProceso;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPagosAutorizadosProceso;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPagosAutorizadosProceso;
	public JPanel jPanelBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso;
	public JButton jButtonBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso;
	
	public JPanel jPanelid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso;
	public JLabel jLabelid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso;
	public JButton jButtonid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProcesoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProcesoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PagosAutorizadosProcesoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PagosAutorizadosProceso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutorizadosProcesoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagosAutorizadosProceso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutorizadosProcesoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagosAutorizadosProceso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutorizadosProcesoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PagosAutorizadosProceso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPagosAutorizadosProceso)	{
		this.jButtonRecargarInformacionPagosAutorizadosProceso = jButtonRecargarInformacionPagosAutorizadosProceso;
	}
	
	public JButton getjButtonProcesarInformacionPagosAutorizadosProceso() {
		return this.jButtonProcesarInformacionPagosAutorizadosProceso;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPagosAutorizadosProceso)	{
		this.jButtonProcesarInformacionPagosAutorizadosProceso = jButtonProcesarInformacionPagosAutorizadosProceso;
	}
	
	
	public JButton getjButtonRecargarInformacionPagosAutorizadosProceso() {
		return this.jButtonRecargarInformacionPagosAutorizadosProceso;
	}
	
	
	public List<PagosAutorizadosProceso> getpagosautorizadosprocesos() {
		return this.pagosautorizadosprocesos;
	}

	public void setpagosautorizadosprocesos(List<PagosAutorizadosProceso> pagosautorizadosprocesos) {
		this.pagosautorizadosprocesos = pagosautorizadosprocesos;
	}
	
	public List<PagosAutorizadosProceso> getpagosautorizadosprocesosAux() {
		return this.pagosautorizadosprocesosAux;
	}

	public void setpagosautorizadosprocesosAux(List<PagosAutorizadosProceso> pagosautorizadosprocesosAux) {
		this.pagosautorizadosprocesosAux = pagosautorizadosprocesosAux;
	}
	
	public List<PagosAutorizadosProceso> getpagosautorizadosprocesosEliminados() {
		return this.pagosautorizadosprocesosEliminados;
	}

	public void setPagosAutorizadosProcesosEliminados(List<PagosAutorizadosProceso> pagosautorizadosprocesosEliminados) {
		this.pagosautorizadosprocesosEliminados = pagosautorizadosprocesosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPagosAutorizadosProceso() {
		return jComboBoxTiposSeleccionarPagosAutorizadosProceso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPagosAutorizadosProceso(
			JComboBox jComboBoxTiposSeleccionarPagosAutorizadosProceso) {
		this.jComboBoxTiposSeleccionarPagosAutorizadosProceso = jComboBoxTiposSeleccionarPagosAutorizadosProceso;
	}
	
	public void setBorderResaltarTiposSeleccionarPagosAutorizadosProceso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPagosAutorizadosProceso.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPagosAutorizadosProceso .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPagosAutorizadosProceso() {
		return jTextFieldValorCampoGeneralPagosAutorizadosProceso;
	}

	public void setjTextFieldValorCampoGeneralPagosAutorizadosProceso(
			JTextField jTextFieldValorCampoGeneralPagosAutorizadosProceso) {
		this.jTextFieldValorCampoGeneralPagosAutorizadosProceso = jTextFieldValorCampoGeneralPagosAutorizadosProceso;
	}

	public void setBorderResaltarValorCampoGeneralPagosAutorizadosProceso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizadosProceso.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPagosAutorizadosProceso .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPagosAutorizadosProceso() {
		return this.jCheckBoxSeleccionarTodosPagosAutorizadosProceso;
	}

	public void setjCheckBoxSeleccionarTodosPagosAutorizadosProceso(
			JCheckBox jCheckBoxSeleccionarTodosPagosAutorizadosProceso) {
		this.jCheckBoxSeleccionarTodosPagosAutorizadosProceso = jCheckBoxSeleccionarTodosPagosAutorizadosProceso;
	}

	public void setBorderResaltarSeleccionarTodosPagosAutorizadosProceso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizadosProceso.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPagosAutorizadosProceso .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPagosAutorizadosProceso() {
		return this.jCheckBoxSeleccionadosPagosAutorizadosProceso;
	}

	public void setjCheckBoxSeleccionadosPagosAutorizadosProceso(
			JCheckBox jCheckBoxSeleccionadosPagosAutorizadosProceso) {
		this.jCheckBoxSeleccionadosPagosAutorizadosProceso = jCheckBoxSeleccionadosPagosAutorizadosProceso;
	}
	
	public void setBorderResaltarSeleccionadosPagosAutorizadosProceso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizadosProceso.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPagosAutorizadosProceso .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPagosAutorizadosProceso() {
		return this.jComboBoxTiposArchivosReportesPagosAutorizadosProceso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPagosAutorizadosProceso(
			JComboBox jComboBoxTiposArchivosReportesPagosAutorizadosProceso) {
		this.jComboBoxTiposArchivosReportesPagosAutorizadosProceso = jComboBoxTiposArchivosReportesPagosAutorizadosProceso;
	}

	public void setBorderResaltarTiposArchivosReportesPagosAutorizadosProceso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizadosProceso.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPagosAutorizadosProceso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPagosAutorizadosProceso() {
		return this.jComboBoxTiposReportesPagosAutorizadosProceso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPagosAutorizadosProceso(
			JComboBox jComboBoxTiposReportesPagosAutorizadosProceso) {
		this.jComboBoxTiposReportesPagosAutorizadosProceso = jComboBoxTiposReportesPagosAutorizadosProceso;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPagosAutorizadosProceso() {
	//	return jComboBoxTiposReportesDinamicoPagosAutorizadosProceso;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPagosAutorizadosProceso(
	//		JComboBox jComboBoxTiposReportesDinamicoPagosAutorizadosProceso) {
	//	this.jComboBoxTiposReportesDinamicoPagosAutorizadosProceso = jComboBoxTiposReportesDinamicoPagosAutorizadosProceso;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPagosAutorizadosProceso() {
	//	return jComboBoxTiposArchivosReportesDinamicoPagosAutorizadosProceso;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPagosAutorizadosProceso(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPagosAutorizadosProceso) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPagosAutorizadosProceso = jComboBoxTiposArchivosReportesDinamicoPagosAutorizadosProceso;
	//}
	
	public void setBorderResaltarTiposReportesPagosAutorizadosProceso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizadosProceso.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPagosAutorizadosProceso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPagosAutorizadosProceso() {
		return this.jComboBoxTiposGraficosReportesPagosAutorizadosProceso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPagosAutorizadosProceso(
			JComboBox jComboBoxTiposGraficosReportesPagosAutorizadosProceso) {
		this.jComboBoxTiposGraficosReportesPagosAutorizadosProceso = jComboBoxTiposGraficosReportesPagosAutorizadosProceso;
	}
	
	public void setBorderResaltarTiposGraficosReportesPagosAutorizadosProceso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizadosProceso.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPagosAutorizadosProceso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPagosAutorizadosProceso() {
		return this.jComboBoxTiposPaginacionPagosAutorizadosProceso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPagosAutorizadosProceso(
			JComboBox jComboBoxTiposPaginacionPagosAutorizadosProceso) {
		this.jComboBoxTiposPaginacionPagosAutorizadosProceso = jComboBoxTiposPaginacionPagosAutorizadosProceso;
	}
	
	public void setBorderResaltarTiposPaginacionPagosAutorizadosProceso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizadosProceso.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPagosAutorizadosProceso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPagosAutorizadosProceso() {
		return this.jComboBoxTiposRelacionesPagosAutorizadosProceso;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPagosAutorizadosProceso() {
		return this.jComboBoxTiposAccionesPagosAutorizadosProceso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPagosAutorizadosProceso(
			JComboBox jComboBoxTiposRelacionesPagosAutorizadosProceso) {
		this.jComboBoxTiposRelacionesPagosAutorizadosProceso = jComboBoxTiposRelacionesPagosAutorizadosProceso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPagosAutorizadosProceso(
			JComboBox jComboBoxTiposAccionesPagosAutorizadosProceso) {
		this.jComboBoxTiposAccionesPagosAutorizadosProceso = jComboBoxTiposAccionesPagosAutorizadosProceso;
	}
	
	public void setBorderResaltarTiposRelacionesPagosAutorizadosProceso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizadosProceso.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPagosAutorizadosProceso .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPagosAutorizadosProceso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosAutorizadosProceso.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPagosAutorizadosProceso .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPagosAutorizadosProceso() {
	//	return jCheckBoxConGraficoDinamicoPagosAutorizadosProceso;
	//}

	//public void setjCheckBoxConGraficoDinamicoPagosAutorizadosProceso(
	//		JCheckBox jCheckBoxConGraficoDinamicoPagosAutorizadosProceso) {
	//	this.jCheckBoxConGraficoDinamicoPagosAutorizadosProceso = jCheckBoxConGraficoDinamicoPagosAutorizadosProceso;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPagosAutorizadosProceso() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPagosAutorizadosProceso.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPagosAutorizadosProceso .setBorder(borderResaltar);		
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
		this.pagosautorizadosprocesoSessionBean=new PagosAutorizadosProcesoSessionBean();
		
		this.pagosautorizadosprocesoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pagosautorizadosprocesoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PagosAutorizadosProcesoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PagosAutorizadosProcesoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PagosAutorizadosProcesoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PagosAutorizadosProcesoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PagosAutorizadosProcesoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pagos Autorizados Proceso MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
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
		
		PagosAutorizadosProcesoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PagosAutorizadosProceso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPagosAutorizadosProceso= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPagosAutorizadosProceso,this.jTtoolBarPagosAutorizadosProceso,
							"nuevo","nuevo","Nuevo"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPagosAutorizadosProceso,this.jTtoolBarPagosAutorizadosProceso,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPagosAutorizadosProceso,this.jTtoolBarPagosAutorizadosProceso,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPagosAutorizadosProceso,this.jTtoolBarPagosAutorizadosProceso,
							"duplicar","duplicar","Duplicar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPagosAutorizadosProceso,this.jTtoolBarPagosAutorizadosProceso,
							"copiar","copiar","Copiar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPagosAutorizadosProceso,this.jTtoolBarPagosAutorizadosProceso,
							"ver_form","ver_form","Ver"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPagosAutorizadosProceso,this.jTtoolBarPagosAutorizadosProceso,
							"recargar","recargar","Buscar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPagosAutorizadosProceso,this.jTtoolBarPagosAutorizadosProceso,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPagosAutorizadosProceso,this.jTtoolBarPagosAutorizadosProceso,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPagosAutorizadosProceso,this.jTtoolBarPagosAutorizadosProceso,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPagosAutorizadosProceso,this.jTtoolBarPagosAutorizadosProceso,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPagosAutorizadosProceso,this.jTtoolBarPagosAutorizadosProceso,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPagosAutorizadosProceso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPagosAutorizadosProceso,this.jTtoolBarPagosAutorizadosProceso,
							"cerrar","cerrar","Salir"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPagosAutorizadosProceso=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPagosAutorizadosProceso;
			
				this.jButtonProcesarInformacionToolBarPagosAutorizadosProceso=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPagosAutorizadosProceso;
				
		//protected JButton jButtonModificarToolBarPagosAutorizadosProceso;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPagosAutorizadosProceso=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPagosAutorizadosProceso=new JMenuMe("General");
		this.jmenuArchivoPagosAutorizadosProceso=new JMenuMe("Archivo");
		this.jmenuAccionesPagosAutorizadosProceso=new JMenuMe("Acciones");
		this.jmenuDatosPagosAutorizadosProceso=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPagosAutorizadosProceso= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPagosAutorizadosProceso.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPagosAutorizadosProceso,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPagosAutorizadosProceso= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPagosAutorizadosProceso.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPagosAutorizadosProceso,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPagosAutorizadosProceso= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPagosAutorizadosProceso.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPagosAutorizadosProceso,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPagosAutorizadosProceso= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPagosAutorizadosProceso.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPagosAutorizadosProceso,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPagosAutorizadosProceso= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPagosAutorizadosProceso.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPagosAutorizadosProceso,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPagosAutorizadosProceso= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPagosAutorizadosProceso.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPagosAutorizadosProceso,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPagosAutorizadosProceso= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPagosAutorizadosProceso.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPagosAutorizadosProceso,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPagosAutorizadosProceso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPagosAutorizadosProceso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPagosAutorizadosProceso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPagosAutorizadosProceso= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPagosAutorizadosProceso.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPagosAutorizadosProceso,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPagosAutorizadosProceso= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPagosAutorizadosProceso.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPagosAutorizadosProceso,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPagosAutorizadosProceso= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPagosAutorizadosProceso.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPagosAutorizadosProceso,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPagosAutorizadosProceso= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPagosAutorizadosProceso.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPagosAutorizadosProceso,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPagosAutorizadosProceso= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPagosAutorizadosProceso.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPagosAutorizadosProceso,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPagosAutorizadosProceso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPagosAutorizadosProceso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPagosAutorizadosProceso,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPagosAutorizadosProceso= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPagosAutorizadosProceso.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPagosAutorizadosProceso,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPagosAutorizadosProceso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPagosAutorizadosProceso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPagosAutorizadosProceso,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPagosAutorizadosProceso= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPagosAutorizadosProceso.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPagosAutorizadosProceso,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPagosAutorizadosProceso.add(this.jMenuItemCerrarPagosAutorizadosProceso);
			
			this.jmenuAccionesPagosAutorizadosProceso.add(this.jMenuItemNuevoPagosAutorizadosProceso);
			this.jmenuAccionesPagosAutorizadosProceso.add(this.jMenuItemNuevoGuardarCambiosPagosAutorizadosProceso);
			this.jmenuAccionesPagosAutorizadosProceso.add(this.jMenuItemNuevoRelacionesPagosAutorizadosProceso);
			this.jmenuAccionesPagosAutorizadosProceso.add(this.jMenuItemGuardarCambiosTablaPagosAutorizadosProceso);		
			this.jmenuAccionesPagosAutorizadosProceso.add(this.jMenuItemDuplicarPagosAutorizadosProceso);		
			this.jmenuAccionesPagosAutorizadosProceso.add(this.jMenuItemCopiarPagosAutorizadosProceso);		
			this.jmenuAccionesPagosAutorizadosProceso.add(this.jMenuItemVerFormPagosAutorizadosProceso);		
			
			this.jmenuDatosPagosAutorizadosProceso.add(this.jMenuItemRecargarInformacionPagosAutorizadosProceso);				
			this.jmenuDatosPagosAutorizadosProceso.add(this.jMenuItemAnterioresPagosAutorizadosProceso);				
			this.jmenuDatosPagosAutorizadosProceso.add(this.jMenuItemSiguientesPagosAutorizadosProceso);				
			this.jmenuDatosPagosAutorizadosProceso.add(this.jMenuItemAbrirOrderByPagosAutorizadosProceso);				
			this.jmenuDatosPagosAutorizadosProceso.add(this.jMenuItemMostrarOcultarPagosAutorizadosProceso);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPagosAutorizadosProceso.add(this.jMenuItemGuardarCambiosPagosAutorizadosProceso);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPagosAutorizadosProceso.add(this.jmenuArchivoPagosAutorizadosProceso);		
			this.jmenuBarPagosAutorizadosProceso.add(this.jmenuAccionesPagosAutorizadosProceso);		
			this.jmenuBarPagosAutorizadosProceso.add(this.jmenuDatosPagosAutorizadosProceso);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPagosAutorizadosProceso);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPagosAutorizadosProceso() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setToolTipText("Buscar Por Ejercicio ");
		this.jButtonBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso= new JButtonMe();
		this.jButtonBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setText("Buscar");
		this.jButtonBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setToolTipText("Buscar Por Ejercicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso,"buscar_button","Buscar Por Ejercicio ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso = new JLabelMe();
		jLabelid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPagosAutorizadosProceso=new JTabbedPane();


		this.jTabbedPaneBusquedasPagosAutorizadosProceso.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasPagosAutorizadosProceso.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasPagosAutorizadosProceso.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPagosAutorizadosProceso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePagosAutorizadosProceso = new PagosAutorizadosProcesoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pagos Autorizados Proceso DATOS");
			this.jInternalFrameDetalleFormPagosAutorizadosProceso = new PagosAutorizadosProcesoDetalleFormJInternalFrame(jDesktopPane,this.pagosautorizadosprocesoSessionBean.getConGuardarRelaciones(),this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPagosAutorizadosProceso = null;//new PagosAutorizadosProcesoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPagosAutorizadosProceso= new GridBagLayout();
		
		
		this.jTableDatosPagosAutorizadosProceso = new JTableMe();      
		
		String sToolTipPagosAutorizadosProceso="";
		sToolTipPagosAutorizadosProceso=PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPagosAutorizadosProceso+="(Tesoreria.PagosAutorizadosProceso)";
		}
		
		if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPagosAutorizadosProceso+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPagosAutorizadosProceso.setToolTipText(sToolTipPagosAutorizadosProceso);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPagosAutorizadosProceso);
		this.jTableDatosPagosAutorizadosProceso.setAutoCreateRowSorter(true);
		this.jTableDatosPagosAutorizadosProceso.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPagosAutorizadosProceso.setRowSelectionAllowed(true);
		this.jTableDatosPagosAutorizadosProceso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPagosAutorizadosProceso,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPagosAutorizadosProceso = new JButtonMe();
		this.jButtonDuplicarPagosAutorizadosProceso = new JButtonMe();
		this.jButtonCopiarPagosAutorizadosProceso = new JButtonMe();
		this.jButtonVerFormPagosAutorizadosProceso = new JButtonMe();
		this.jButtonNuevoRelacionesPagosAutorizadosProceso = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPagosAutorizadosProceso = new JButtonMe();
		this.jButtonCerrarPagosAutorizadosProceso = new JButtonMe();
		
		this.jScrollPanelDatosPagosAutorizadosProceso = new JScrollPane();   
        this.jScrollPanelDatosGeneralPagosAutorizadosProceso = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPagosAutorizadosProceso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Pagos Autorizados Proceso";
		
		if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Autorizados Procesos" + this.sPath));
		} else {
			this.jScrollPanelDatosPagosAutorizadosProceso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPagosAutorizadosProceso.setToolTipText("Acciones");
        this.jPanelAccionesPagosAutorizadosProceso.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPagosAutorizadosProceso=new ReporteDinamicoJInternalFrame(PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPagosAutorizadosProceso();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPagosAutorizadosProceso=new ImportacionJInternalFrame(PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPagosAutorizadosProceso();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPagosAutorizadosProceso = new JButtonMe();
		
		this.jButtonAbrirOrderByPagosAutorizadosProceso.setText("Orden");
		this.jButtonAbrirOrderByPagosAutorizadosProceso.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPagosAutorizadosProceso,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPagosAutorizadosProceso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPagosAutorizadosProceso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagosAutorizadosProceso,false,this);
			
			//this.cargarOrderByPagosAutorizadosProceso(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPagosAutorizadosProceso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagosAutorizadosProceso,true,this);
			
			//this.cargarOrderByPagosAutorizadosProceso(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPagosAutorizadosProceso.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosPagosAutorizadosProceso.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosPagosAutorizadosProceso.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosPagosAutorizadosProceso.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPagosAutorizadosProceso.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPagosAutorizadosProceso.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPagosAutorizadosProceso.setText("Nuevo");
		this.jButtonDuplicarPagosAutorizadosProceso.setText("Duplicar");
		this.jButtonCopiarPagosAutorizadosProceso.setText("Copiar");
		this.jButtonVerFormPagosAutorizadosProceso.setText("Ver");
		this.jButtonNuevoRelacionesPagosAutorizadosProceso.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPagosAutorizadosProceso.setText("Guardar");
		this.jButtonCerrarPagosAutorizadosProceso.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPagosAutorizadosProceso,"nuevo_button","Nuevo",this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPagosAutorizadosProceso,"duplicar_button","Duplicar",this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPagosAutorizadosProceso,"copiar_button","Copiar",this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPagosAutorizadosProceso,"ver_form","Ver",this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPagosAutorizadosProceso,"nuevorelaciones_button","Nuevo Rel",this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPagosAutorizadosProceso,"guardarcambiostabla_button","Guardar",this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPagosAutorizadosProceso,"cerrar_button","Salir",this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPagosAutorizadosProceso.setToolTipText("Nuevo"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPagosAutorizadosProceso.setToolTipText("Duplicar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPagosAutorizadosProceso.setToolTipText("Copiar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPagosAutorizadosProceso.setToolTipText("Ver"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPagosAutorizadosProceso.setToolTipText("Nuevo Rel"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPagosAutorizadosProceso.setToolTipText("Guardar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPagosAutorizadosProceso.setToolTipText("Salir"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPagosAutorizadosProceso";
		inputMap = this.jButtonNuevoPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPagosAutorizadosProceso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPagosAutorizadosProceso"));
		
		//DUPLICAR
		sMapKey = "DuplicarPagosAutorizadosProceso";
		inputMap = this.jButtonDuplicarPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPagosAutorizadosProceso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPagosAutorizadosProceso"));
		
		//COPIAR
		sMapKey = "CopiarPagosAutorizadosProceso";
		inputMap = this.jButtonCopiarPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPagosAutorizadosProceso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPagosAutorizadosProceso"));
		
		//VEr FORM
		sMapKey = "VerFormPagosAutorizadosProceso";
		inputMap = this.jButtonVerFormPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPagosAutorizadosProceso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPagosAutorizadosProceso"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPagosAutorizadosProceso";
		inputMap = this.jButtonNuevoRelacionesPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPagosAutorizadosProceso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPagosAutorizadosProceso"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPagosAutorizadosProceso";
		inputMap = this.jButtonModificarPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPagosAutorizadosProceso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPagosAutorizadosProceso"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPagosAutorizadosProceso";
		inputMap = this.jButtonCerrarPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPagosAutorizadosProceso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPagosAutorizadosProceso"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPagosAutorizadosProceso";
		inputMap = this.jButtonGuardarCambiosTablaPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPagosAutorizadosProceso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPagosAutorizadosProceso"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPagosAutorizadosProceso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPagosAutorizadosProceso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPagosAutorizadosProceso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PagosAutorizadosProceso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PagosAutorizadosProceso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PagosAutorizadosProceso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PagosAutorizadosProceso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PagosAutorizadosProceso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPagosAutorizadosProceso.setName("jPanelParametrosReportesPagosAutorizadosProceso"); 
		
		this.jPanelParametrosReportesAccionesPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPagosAutorizadosProceso.setName("jPanelParametrosReportesAccionesPagosAutorizadosProceso"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPagosAutorizadosProceso = new JButtonMe();
		this.jButtonRecargarInformacionPagosAutorizadosProceso.setText("Buscar");
		this.jButtonRecargarInformacionPagosAutorizadosProceso.setToolTipText("Buscar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPagosAutorizadosProceso,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionPagosAutorizadosProceso.setVisible(false);
		
		
		this.jButtonProcesarInformacionPagosAutorizadosProceso = new JButtonMe();
		this.jButtonProcesarInformacionPagosAutorizadosProceso.setText("Procesar");
		this.jButtonProcesarInformacionPagosAutorizadosProceso.setToolTipText("Procesar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPagosAutorizadosProceso.setVisible(false);
			
		this.jButtonProcesarInformacionPagosAutorizadosProceso.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPagosAutorizadosProceso.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPagosAutorizadosProceso.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPagosAutorizadosProceso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPagosAutorizadosProceso.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPagosAutorizadosProceso.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPagosAutorizadosProceso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPagosAutorizadosProceso.setText("TIPO");       
		this.jComboBoxTiposReportesPagosAutorizadosProceso.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPagosAutorizadosProceso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPagosAutorizadosProceso.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPagosAutorizadosProceso.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPagosAutorizadosProceso = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPagosAutorizadosProceso.setText("Paginacion");
		this.jComboBoxTiposPaginacionPagosAutorizadosProceso.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPagosAutorizadosProceso = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPagosAutorizadosProceso.setText("Accion");
		this.jComboBoxTiposRelacionesPagosAutorizadosProceso.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPagosAutorizadosProceso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPagosAutorizadosProceso.setText("Accion");
		this.jComboBoxTiposAccionesPagosAutorizadosProceso.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPagosAutorizadosProceso = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPagosAutorizadosProceso.setText("Accion");
		this.jComboBoxTiposSeleccionarPagosAutorizadosProceso.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPagosAutorizadosProceso=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPagosAutorizadosProceso.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPagosAutorizadosProceso.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPagosAutorizadosProceso.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPagosAutorizadosProceso = new JLabelMe();
		
		this.jLabelAccionesPagosAutorizadosProceso.setText("Acciones");		
		this.jLabelAccionesPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPagosAutorizadosProceso = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPagosAutorizadosProceso.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPagosAutorizadosProceso.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPagosAutorizadosProceso = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPagosAutorizadosProceso.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPagosAutorizadosProceso.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPagosAutorizadosProceso = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPagosAutorizadosProceso.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPagosAutorizadosProceso.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePagosAutorizadosProceso = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePagosAutorizadosProceso.setText("Graf.");
		this.jCheckBoxConGraficoReportePagosAutorizadosProceso.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPagosAutorizadosProceso = new JButtonMe();
		//this.jButtonAnterioresPagosAutorizadosProceso.setText("<<");
        this.jButtonAnterioresPagosAutorizadosProceso.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPagosAutorizadosProceso,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPagosAutorizadosProceso = new JButtonMe();
		//this.jButtonSiguientesPagosAutorizadosProceso.setText(">>");
        this.jButtonSiguientesPagosAutorizadosProceso.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPagosAutorizadosProceso,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPagosAutorizadosProceso = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPagosAutorizadosProceso.setText("Nue");
        this.jButtonNuevoGuardarCambiosPagosAutorizadosProceso.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPagosAutorizadosProceso,"nuevoguardarcambios_button","Nue",this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPagosAutorizadosProceso";
		inputMap = this.jButtonNuevoGuardarCambiosPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPagosAutorizadosProceso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPagosAutorizadosProceso"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPagosAutorizadosProceso";
		inputMap = this.jButtonRecargarInformacionPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPagosAutorizadosProceso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPagosAutorizadosProceso"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPagosAutorizadosProceso";
		inputMap = this.jButtonSiguientesPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPagosAutorizadosProceso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPagosAutorizadosProceso"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPagosAutorizadosProceso";
		inputMap = this.jButtonAnterioresPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPagosAutorizadosProceso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPagosAutorizadosProceso"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPagosAutorizadosProceso();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPagosAutorizadosProceso.setMinimumSize(new Dimension(this.getWidth(),PagosAutorizadosProcesoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PagosAutorizadosProcesoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPagosAutorizadosProceso.setMaximumSize(new Dimension(this.getWidth(),PagosAutorizadosProcesoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PagosAutorizadosProcesoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPagosAutorizadosProceso.setPreferredSize(new Dimension(this.getWidth(),PagosAutorizadosProcesoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PagosAutorizadosProcesoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPagosAutorizadosProceso = new GridBagLayout();

			this.jPanelPaginacionPagosAutorizadosProceso.setLayout(gridaBagLayoutPaginacionPagosAutorizadosProceso);						
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPagosAutorizadosProceso.add(this.jButtonAnterioresPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
					
						
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
			
			this.jPanelPaginacionPagosAutorizadosProceso.add(this.jButtonNuevoGuardarCambiosPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
						
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
			this.jPanelPaginacionPagosAutorizadosProceso.add(this.jButtonSiguientesPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = 1;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagosAutorizadosProceso.add(this.jButtonNuevoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
						
			
			
			if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
				this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPagosAutorizadosProceso.gridy = 1;
				this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPagosAutorizadosProceso.add(this.jButtonGuardarCambiosTablaPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
			}
			
			
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = 1;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagosAutorizadosProceso.add(this.jButtonDuplicarPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = 1;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagosAutorizadosProceso.add(this.jButtonCopiarPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = 1;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagosAutorizadosProceso.add(this.jButtonVerFormPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = 1;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPagosAutorizadosProceso.add(this.jButtonCerrarPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
		
		
		this.jButtonRecargarInformacionPagosAutorizadosProceso.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPagosAutorizadosProceso.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPagosAutorizadosProceso.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPagosAutorizadosProceso.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPagosAutorizadosProceso.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPagosAutorizadosProceso.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPagosAutorizadosProceso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPagosAutorizadosProceso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPagosAutorizadosProceso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPagosAutorizadosProceso.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPagosAutorizadosProceso.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPagosAutorizadosProceso.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPagosAutorizadosProceso.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPagosAutorizadosProceso.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPagosAutorizadosProceso.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPagosAutorizadosProceso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPagosAutorizadosProceso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPagosAutorizadosProceso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPagosAutorizadosProceso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagosAutorizadosProceso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagosAutorizadosProceso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPagosAutorizadosProceso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPagosAutorizadosProceso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPagosAutorizadosProceso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPagosAutorizadosProceso.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPagosAutorizadosProceso.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPagosAutorizadosProceso.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePagosAutorizadosProceso.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePagosAutorizadosProceso.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePagosAutorizadosProceso.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPagosAutorizadosProceso.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPagosAutorizadosProceso.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPagosAutorizadosProceso.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPagosAutorizadosProceso.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPagosAutorizadosProceso.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPagosAutorizadosProceso.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPagosAutorizadosProceso = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPagosAutorizadosProceso = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PagosAutorizadosProceso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PagosAutorizadosProceso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PagosAutorizadosProceso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PagosAutorizadosProceso = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPagosAutorizadosProceso.setLayout(gridaBagParametrosReportesPagosAutorizadosProceso);
			this.jPanelParametrosReportesAccionesPagosAutorizadosProceso.setLayout(gridaBagParametrosReportesAccionesPagosAutorizadosProceso);
			
			
			this.jPanelParametrosAuxiliar1PagosAutorizadosProceso.setLayout(gridaBagParametrosAuxiliar1PagosAutorizadosProceso);
			this.jPanelParametrosAuxiliar2PagosAutorizadosProceso.setLayout(gridaBagParametrosAuxiliar2PagosAutorizadosProceso);
			this.jPanelParametrosAuxiliar3PagosAutorizadosProceso.setLayout(gridaBagParametrosAuxiliar3PagosAutorizadosProceso);
			this.jPanelParametrosAuxiliar4PagosAutorizadosProceso.setLayout(gridaBagParametrosAuxiliar4PagosAutorizadosProceso);
			//this.jPanelParametrosAuxiliar5PagosAutorizadosProceso.setLayout(gridaBagParametrosAuxiliar2PagosAutorizadosProceso);			
			
			
			
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPagosAutorizadosProceso.add(this.jButtonRecargarInformacionPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PagosAutorizadosProceso.add(this.jComboBoxTiposPaginacionPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PagosAutorizadosProceso.add(this.jCheckBoxConAltoMaximoTablaPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PagosAutorizadosProceso.add(this.jComboBoxTiposArchivosReportesPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosAutorizadosProceso.add(this.jPanelParametrosAuxiliar1PagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PagosAutorizadosProceso.add(this.jComboBoxTiposReportesPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);																		
			
			
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PagosAutorizadosProceso.add(this.jComboBoxTiposGraficosReportesPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosAutorizadosProceso.add(this.jPanelParametrosAuxiliar4PagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosAutorizadosProceso.add(this.jComboBoxTiposReportesPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagosAutorizadosProceso.add(this.jCheckBoxGenerarReportePagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosAutorizadosProceso.add(this.jPanelParametrosAuxiliar2PagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagosAutorizadosProceso.add(this.jLabelAccionesPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
				this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPagosAutorizadosProceso.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPagosAutorizadosProceso.add(this.jButtonAbrirOrderByPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPagosAutorizadosProceso.add(this.jComboBoxTiposSeleccionarPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);			
			
			
			/*
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagosAutorizadosProceso.add(this.jCheckBoxSeleccionarTodosPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagosAutorizadosProceso.add(this.jCheckBoxConGraficoReportePagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PagosAutorizadosProceso.add(this.jCheckBoxSeleccionarTodosPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);															
				
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PagosAutorizadosProceso.add(this.jCheckBoxSeleccionadosPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);															
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PagosAutorizadosProceso.add(this.jCheckBoxConGraficoReportePagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosAutorizadosProceso.add(this.jPanelParametrosAuxiliar3PagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPagosAutorizadosProceso.add(this.jComboBoxTiposAccionesPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPagosAutorizadosProceso = new GridBagLayout();

			this.jScrollPanelDatosPagosAutorizadosProceso.setLayout(gridaBagLayoutDatosPagosAutorizadosProceso);
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
			
			this.jScrollPanelDatosPagosAutorizadosProceso.add(this.jTableDatosPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPagosAutorizadosProceso.setViewportView(this.jTableDatosPagosAutorizadosProceso);
		this.jTableDatosPagosAutorizadosProceso.setFillsViewportHeight(true);
		this.jTableDatosPagosAutorizadosProceso.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPagosAutorizadosProceso= new GridBagLayout();
		this.jPanelAccionesPagosAutorizadosProceso.setLayout(gridaBagLayoutAccionesPagosAutorizadosProceso);
		
		
		/*	
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
			
		this.jPanelAccionesPagosAutorizadosProceso.add(this.jButtonNuevoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso= new GridBagLayout();
		gridaBagLayoutBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.setLayout(gridaBagLayoutBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso);

		gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
		jPanelBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.add(jLabelid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso, gridBagConstraintsPagosAutorizadosProceso);

		gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagosAutorizadosProceso.gridy = 0;
		gridBagConstraintsPagosAutorizadosProceso.gridx = 1;
		jPanelBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.add(jComboBoxid_ejercicioBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso, gridBagConstraintsPagosAutorizadosProceso);

		gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagosAutorizadosProceso.gridy = 1;
		gridBagConstraintsPagosAutorizadosProceso.gridx =1;
		jPanelBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso.add(jButtonBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso, gridBagConstraintsPagosAutorizadosProceso);

		jTabbedPaneBusquedasPagosAutorizadosProceso.addTab("1.-Por Ejercicio ", jPanelBusquedaPagosAutorizadosProcesoPagosAutorizadosProceso);
		jTabbedPaneBusquedasPagosAutorizadosProceso.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPagosAutorizadosProceso = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPagosAutorizadosProceso);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();						
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;		
			//this.gridBagConstraintsPagosAutorizadosProceso.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;		
		//this.gridBagConstraintsPagosAutorizadosProceso.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPagosAutorizadosProceso);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;		
			this.gridBagConstraintsPagosAutorizadosProceso.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPagosAutorizadosProceso.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);								
		
		
		/*
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		*/		
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx =0;
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPagosAutorizadosProceso.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
				
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PagosAutorizadosProcesoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPagosAutorizadosProceso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPagosAutorizadosProceso = new GridBagLayout();
			this.jPanelBusquedasParametrosPagosAutorizadosProceso.setLayout(gridaBagLayoutBusquedasParametrosPagosAutorizadosProceso);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPagosAutorizadosProceso=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPagosAutorizadosProceso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagosAutorizadosProceso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagosAutorizadosProceso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
			
			
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
			
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPagosAutorizadosProceso;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPagosAutorizadosProceso() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPagosAutorizadosProceso = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPagosAutorizadosProceso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPagosAutorizadosProceso.setName("jPanelReporteDinamicoPagosAutorizadosProceso"); 
		
		this.jPanelReporteDinamicoPagosAutorizadosProceso.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPagosAutorizadosProceso.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPagosAutorizadosProceso.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPagosAutorizadosProceso.setLayout(gridaBagLayoutReporteDinamicoPagosAutorizadosProceso);
		
		
		this.jInternalFrameReporteDinamicoPagosAutorizadosProceso= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPagosAutorizadosProceso = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePagosAutorizadosProceso= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setResizable(true);
	    this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setClosable(true);
	    this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPagosAutorizadosProceso.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPagosAutorizadosProceso.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPagosAutorizadosProceso.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Autorizados Procesos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePagosAutorizadosProceso = new JLabelMe();

		this.jLabelColumnasSelectReportePagosAutorizadosProceso.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jLabelColumnasSelectReportePagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePagosAutorizadosProceso = new JList<Reporte>();
		this.jListColumnasSelectReportePagosAutorizadosProceso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePagosAutorizadosProceso.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePagosAutorizadosProceso.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePagosAutorizadosProceso.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePagosAutorizadosProceso.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePagosAutorizadosProceso=new JScrollPane(this.jListColumnasSelectReportePagosAutorizadosProceso);
			
			this.jScrollColumnasSelectReportePagosAutorizadosProceso.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePagosAutorizadosProceso.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePagosAutorizadosProceso.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jListColumnasSelectReportePagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jScrollColumnasSelectReportePagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePagosAutorizadosProceso = new JLabelMe();

		this.jLabelRelacionesSelectReportePagosAutorizadosProceso.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePagosAutorizadosProceso = new JList<Reporte>();
		this.jListRelacionesSelectReportePagosAutorizadosProceso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePagosAutorizadosProceso.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePagosAutorizadosProceso.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePagosAutorizadosProceso.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePagosAutorizadosProceso.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePagosAutorizadosProceso=new JScrollPane(this.jListRelacionesSelectReportePagosAutorizadosProceso);
			
			this.jScrollRelacionesSelectReportePagosAutorizadosProceso.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePagosAutorizadosProceso.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePagosAutorizadosProceso.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPagosAutorizadosProceso = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPagosAutorizadosProceso = new JComboBoxMe();
		this.jListColumnasValoresGraficoPagosAutorizadosProceso = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPagosAutorizadosProceso = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPagosAutorizadosProceso.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPagosAutorizadosProceso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPagosAutorizadosProceso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPagosAutorizadosProceso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPagosAutorizadosProceso = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPagosAutorizadosProceso.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPagosAutorizadosProceso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPagosAutorizadosProceso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPagosAutorizadosProceso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPagosAutorizadosProceso = new JLabelMe();

		this.jLabelConGraficoDinamicoPagosAutorizadosProceso.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jLabelConGraficoDinamicoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPagosAutorizadosProceso = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPagosAutorizadosProceso.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPagosAutorizadosProceso.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPagosAutorizadosProceso.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPagosAutorizadosProceso.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPagosAutorizadosProceso.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jCheckBoxConGraficoDinamicoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPagosAutorizadosProceso = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPagosAutorizadosProceso.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jLabelColumnaCategoriaGraficoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPagosAutorizadosProceso = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPagosAutorizadosProceso.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPagosAutorizadosProceso.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPagosAutorizadosProceso.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPagosAutorizadosProceso.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPagosAutorizadosProceso.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jComboBoxColumnaCategoriaGraficoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPagosAutorizadosProceso = new JLabelMe();

		this.jLabelColumnaCategoriaValorPagosAutorizadosProceso.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jLabelColumnaCategoriaValorPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPagosAutorizadosProceso = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPagosAutorizadosProceso.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPagosAutorizadosProceso.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPagosAutorizadosProceso.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPagosAutorizadosProceso.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPagosAutorizadosProceso.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jComboBoxColumnaCategoriaValorPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPagosAutorizadosProceso = new JLabelMe();

		this.jLabelColumnasValoresGraficoPagosAutorizadosProceso.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jLabelColumnasValoresGraficoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPagosAutorizadosProceso = new JList<Reporte>();
		this.jListColumnasValoresGraficoPagosAutorizadosProceso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPagosAutorizadosProceso.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPagosAutorizadosProceso.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPagosAutorizadosProceso.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPagosAutorizadosProceso.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPagosAutorizadosProceso=new JScrollPane(this.jListColumnasValoresGraficoPagosAutorizadosProceso);
			
			this.jScrollColumnasValoresGraficoPagosAutorizadosProceso.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPagosAutorizadosProceso.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPagosAutorizadosProceso.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jListColumnasSelectReportePagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jScrollColumnasValoresGraficoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPagosAutorizadosProceso = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPagosAutorizadosProceso.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jLabelTiposGraficosReportesDinamicoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPagosAutorizadosProceso = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPagosAutorizadosProceso.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPagosAutorizadosProceso.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPagosAutorizadosProceso.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPagosAutorizadosProceso.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPagosAutorizadosProceso.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jComboBoxTiposGraficosReportesDinamicoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPagosAutorizadosProceso = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPagosAutorizadosProceso.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jLabelGenerarExcelReporteDinamicoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPagosAutorizadosProceso = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPagosAutorizadosProceso.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPagosAutorizadosProceso,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPagosAutorizadosProceso.setToolTipText("Generar EXCEL"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jButtonGenerarExcelReporteDinamicoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jComboBoxTiposReportesDinamicoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPagosAutorizadosProceso = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPagosAutorizadosProceso.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jLabelTiposArchivoReporteDinamicoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jComboBoxTiposArchivosReportesDinamicoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPagosAutorizadosProceso = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPagosAutorizadosProceso.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPagosAutorizadosProceso,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPagosAutorizadosProceso.setToolTipText("Generar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jButtonGenerarReporteDinamicoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPagosAutorizadosProceso = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPagosAutorizadosProceso.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPagosAutorizadosProceso,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPagosAutorizadosProceso.setToolTipText("Cancelar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagosAutorizadosProceso.add(this.jButtonCerrarReporteDinamicoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPagosAutorizadosProceso = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPagosAutorizadosProceso= new JScrollPane(jPanelReporteDinamicoPagosAutorizadosProceso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPagosAutorizadosProceso.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPagosAutorizadosProceso.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPagosAutorizadosProceso.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Autorizados Procesos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPagosAutorizadosProceso);
		this.jInternalFrameReporteDinamicoPagosAutorizadosProceso.getContentPane().add(this.jScrollPanelReporteDinamicoPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPagosAutorizadosProceso() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPagosAutorizadosProceso = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPagosAutorizadosProceso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPagosAutorizadosProceso.setName("jPanelImportacionPagosAutorizadosProceso"); 
		
		this.jPanelImportacionPagosAutorizadosProceso.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPagosAutorizadosProceso.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPagosAutorizadosProceso.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPagosAutorizadosProceso.setLayout(gridaBagLayoutImportacionPagosAutorizadosProceso);
		
		
		this.jInternalFrameImportacionPagosAutorizadosProceso= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPagosAutorizadosProceso= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPagosAutorizadosProceso = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePagosAutorizadosProceso= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPagosAutorizadosProceso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPagosAutorizadosProceso.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPagosAutorizadosProceso.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPagosAutorizadosProceso.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPagosAutorizadosProceso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPagosAutorizadosProceso.setResizable(true);
	    this.jInternalFrameImportacionPagosAutorizadosProceso.setClosable(true);
	    this.jInternalFrameImportacionPagosAutorizadosProceso.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPagosAutorizadosProceso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPagosAutorizadosProceso.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPagosAutorizadosProceso.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPagosAutorizadosProceso.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPagosAutorizadosProceso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPagosAutorizadosProceso.setResizable(true);
	    this.jInternalFrameImportacionPagosAutorizadosProceso.setClosable(true);
	    this.jInternalFrameImportacionPagosAutorizadosProceso.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPagosAutorizadosProceso.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPagosAutorizadosProceso.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPagosAutorizadosProceso.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Autorizados Procesos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPagosAutorizadosProceso = new JLabelMe();

		this.jLabelArchivoImportacionPagosAutorizadosProceso.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYImportacion;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPagosAutorizadosProceso.add(this.jLabelArchivoImportacionPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPagosAutorizadosProceso = new JFileChooser();		
		this.jFileChooserImportacionPagosAutorizadosProceso.setToolTipText("ESCOGER ARCHIVO"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPagosAutorizadosProceso = new JButtonMe();
		this.jButtonAbrirImportacionPagosAutorizadosProceso.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPagosAutorizadosProceso,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPagosAutorizadosProceso.setToolTipText("Generar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYImportacion;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagosAutorizadosProceso.add(this.jButtonAbrirImportacionPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPagosAutorizadosProceso = new JLabelMe();

		this.jLabelPathArchivoImportacionPagosAutorizadosProceso.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPagosAutorizadosProceso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPagosAutorizadosProceso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPagosAutorizadosProceso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYImportacion;		
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPagosAutorizadosProceso.add(this.jLabelPathArchivoImportacionPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPagosAutorizadosProceso=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPagosAutorizadosProceso.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPagosAutorizadosProceso.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPagosAutorizadosProceso.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYImportacion;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagosAutorizadosProceso.add(this.jTextFieldPathArchivoImportacionPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPagosAutorizadosProceso = new JButtonMe();
		this.jButtonGenerarImportacionPagosAutorizadosProceso.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPagosAutorizadosProceso,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPagosAutorizadosProceso.setToolTipText("Generar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYImportacion;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagosAutorizadosProceso.add(this.jButtonGenerarImportacionPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPagosAutorizadosProceso = new JButtonMe();
		this.jButtonCerrarImportacionPagosAutorizadosProceso.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPagosAutorizadosProceso,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPagosAutorizadosProceso.setToolTipText("Cancelar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYImportacion;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagosAutorizadosProceso.add(this.jButtonCerrarImportacionPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPagosAutorizadosProceso = new GridBagLayout();
		
		this.jScrollPanelImportacionPagosAutorizadosProceso= new JScrollPane(jPanelImportacionPagosAutorizadosProceso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizadosProceso.gridy =iPosYImportacion;
		this.gridBagConstraintsPagosAutorizadosProceso.gridx =iPosXImportacion;
		this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPagosAutorizadosProceso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPagosAutorizadosProceso.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPagosAutorizadosProceso);
		this.jInternalFrameImportacionPagosAutorizadosProceso.getContentPane().add(this.jScrollPanelImportacionPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPagosAutorizadosProceso(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPagosAutorizadosProceso = new JButtonMe();
			this.jButtonAbrirOrderByPagosAutorizadosProceso.setText("Orden");
			this.jButtonAbrirOrderByPagosAutorizadosProceso.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPagosAutorizadosProceso,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPagosAutorizadosProceso";
			inputMap = this.jButtonAbrirOrderByPagosAutorizadosProceso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPagosAutorizadosProceso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPagosAutorizadosProceso"));
		
		
			GridBagLayout gridaBagLayoutOrderByPagosAutorizadosProceso = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPagosAutorizadosProceso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPagosAutorizadosProceso.setName("jPanelOrderByPagosAutorizadosProceso"); 
			
			this.jPanelOrderByPagosAutorizadosProceso.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPagosAutorizadosProceso.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPagosAutorizadosProceso.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPagosAutorizadosProceso.setLayout(gridaBagLayoutOrderByPagosAutorizadosProceso);
			
			
			this.jTableDatosPagosAutorizadosProcesoOrderBy = new JTableMe();        
			this.jTableDatosPagosAutorizadosProcesoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPagosAutorizadosProcesoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPagosAutorizadosProcesoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPagosAutorizadosProcesoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPagosAutorizadosProcesoOrderBy.setViewportView(this.jTableDatosPagosAutorizadosProcesoOrderBy);
			this.jTableDatosPagosAutorizadosProcesoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPagosAutorizadosProcesoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPagosAutorizadosProceso= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPagosAutorizadosProceso= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPagosAutorizadosProceso = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePagosAutorizadosProceso= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPagosAutorizadosProceso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPagosAutorizadosProceso.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPagosAutorizadosProceso.setTitle("Orden");
			this.jInternalFrameOrderByPagosAutorizadosProceso.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPagosAutorizadosProceso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPagosAutorizadosProceso.setResizable(true);
			this.jInternalFrameOrderByPagosAutorizadosProceso.setClosable(true);
			this.jInternalFrameOrderByPagosAutorizadosProceso.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPagosAutorizadosProceso.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPagosAutorizadosProceso.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPagosAutorizadosProceso.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPagosAutorizadosProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Autorizados Procesos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx =iPosXOrderBy;
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPagosAutorizadosProceso.ipady =150;
				
			this.jPanelOrderByPagosAutorizadosProceso.add(jScrollPanelDatosPagosAutorizadosProcesoOrderBy, this.gridBagConstraintsPagosAutorizadosProceso);//this.jTableDatosPagosAutorizadosProcesoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPagosAutorizadosProceso = new JButtonMe();
			this.jButtonCerrarOrderByPagosAutorizadosProceso.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPagosAutorizadosProceso,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPagosAutorizadosProceso.setToolTipText("Cancelar"+" "+PagosAutorizadosProcesoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPagosAutorizadosProceso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizadosProceso.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPagosAutorizadosProceso.add(this.jButtonCerrarOrderByPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPagosAutorizadosProceso = new GridBagLayout();
			
			this.jScrollPanelOrderByPagosAutorizadosProceso= new JScrollPane(jPanelOrderByPagosAutorizadosProceso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPagosAutorizadosProceso = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizadosProceso.gridy =iPosYOrderBy;
			this.gridBagConstraintsPagosAutorizadosProceso.gridx =iPosXOrderBy;
			this.gridBagConstraintsPagosAutorizadosProceso.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPagosAutorizadosProceso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPagosAutorizadosProceso.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPagosAutorizadosProceso);
			
			this.jInternalFrameOrderByPagosAutorizadosProceso.getContentPane().add(this.jScrollPanelOrderByPagosAutorizadosProceso, this.gridBagConstraintsPagosAutorizadosProceso);			
		
		} else {
			this.jButtonAbrirOrderByPagosAutorizadosProceso = new JButtonMe();
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
		//	&& this.pagosautorizadosprocesoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPagosAutorizadosProceso.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosPagosAutorizadosProceso.getRowHeight();//PagosAutorizadosProcesoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PagosAutorizadosProcesoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPagosAutorizadosProceso.isSelected()) {
					iHeightTable=PagosAutorizadosProcesoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PagosAutorizadosProcesoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PagosAutorizadosProcesoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PagosAutorizadosProcesoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPagosAutorizadosProceso.isSelected()) {
					iHeightTable=PagosAutorizadosProcesoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PagosAutorizadosProcesoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PagosAutorizadosProcesoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPagosAutorizadosProceso.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPagosAutorizadosProceso.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPagosAutorizadosProceso.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPagosAutorizadosProceso.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPagosAutorizadosProceso.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPagosAutorizadosProceso.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPagosAutorizadosProceso!=null && this.jInternalFrameOrderByPagosAutorizadosProceso.getjTableDatosOrderBy()!=null) {
			//if(!this.pagosautorizadosprocesoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPagosAutorizadosProceso.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPagosAutorizadosProceso.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPagosAutorizadosProceso.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPagosAutorizadosProceso.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPagosAutorizadosProceso.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPagosAutorizadosProceso.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPagosAutorizadosProceso.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPagosAutorizadosProceso.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPagosAutorizadosProceso.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPagosAutorizadosProceso.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=pagosautorizadosprocesoLogic.getPagosAutorizadosProcesos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pagosautorizadosprocesos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PagosAutorizadosProceso> TraerPagosAutorizadosProcesoBeans(List<PagosAutorizadosProceso> pagosautorizadosprocesos,ArrayList<Classe> classes)throws Exception {
		try {
			for(PagosAutorizadosProceso pagosautorizadosproceso:pagosautorizadosprocesos) {
					
				if(!(PagosAutorizadosProcesoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PagosAutorizadosProcesoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					pagosautorizadosproceso.setsDetalleGeneralEntityReporte(PagosAutorizadosProcesoConstantesFunciones.getPagosAutorizadosProcesoDescripcion(pagosautorizadosproceso));
										
						
					
						
					
				} else  {
							
					//pagosautorizadosproceso.setsDetalleGeneralEntityReporte(pagosautorizadosproceso.getsDetalleGeneralEntityReporte());
										
				}
				
				//pagosautorizadosprocesobeans.add(pagosautorizadosprocesobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return pagosautorizadosprocesos;
    }
	//PARA REPORTES FIN
}
