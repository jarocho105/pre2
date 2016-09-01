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



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;





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
import com.bydan.erp.cartera.util.report.CobrarClientesSuspendidosConstantesFunciones;

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
public class CobrarClientesSuspendidosJInternalFrame extends CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCobrarClientesSuspendidos;
	
	protected JMenuBar jmenuBarCobrarClientesSuspendidos;
	
	protected JMenu jmenuCobrarClientesSuspendidos;
	protected JMenu jmenuDatosCobrarClientesSuspendidos;
	protected JMenu jmenuArchivoCobrarClientesSuspendidos;
	protected JMenu jmenuAccionesCobrarClientesSuspendidos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCobrarClientesSuspendidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarClientesSuspendidos;	
	protected GridBagConstraints gridBagConstraintsCobrarClientesSuspendidos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CobrarClientesSuspendidosDetalleFormJInternalFrame jInternalFrameDetalleFormCobrarClientesSuspendidos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCobrarClientesSuspendidos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCobrarClientesSuspendidos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public CobrarClientesSuspendidosSessionBean cobrarclientessuspendidosSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<CobrarClientesSuspendidos> cobrarclientessuspendidoss;		
	public List<CobrarClientesSuspendidos> cobrarclientessuspendidossEliminados;	
	public List<CobrarClientesSuspendidos> cobrarclientessuspendidossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCobrarClientesSuspendidos;		
	protected JButton jButtonAbrirOrderByCobrarClientesSuspendidos;
	
	
	//protected JPanel jPanelOrderByCobrarClientesSuspendidos;
	//public JScrollPane jScrollPanelOrderByCobrarClientesSuspendidos;	
	//protected JButton jButtonCerrarOrderByCobrarClientesSuspendidos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CobrarClientesSuspendidosLogic cobrarclientessuspendidosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCobrarClientesSuspendidos;
	public JScrollPane jScrollPanelDatosEdicionCobrarClientesSuspendidos;
	public JScrollPane jScrollPanelDatosGeneralCobrarClientesSuspendidos;
    
	
	
	//public JScrollPane jScrollPanelDatosCobrarClientesSuspendidosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCobrarClientesSuspendidos;
	//public JScrollPane jScrollPanelImportacionCobrarClientesSuspendidos;
	
	
	
	protected JPanel jPanelAccionesCobrarClientesSuspendidos;
	
    protected JPanel jPanelPaginacionCobrarClientesSuspendidos;
    protected JPanel jPanelParametrosReportesCobrarClientesSuspendidos;
	protected JPanel jPanelParametrosReportesAccionesCobrarClientesSuspendidos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CobrarClientesSuspendidos;
	protected JPanel jPanelParametrosAuxiliar2CobrarClientesSuspendidos;
	protected JPanel jPanelParametrosAuxiliar3CobrarClientesSuspendidos;
	protected JPanel jPanelParametrosAuxiliar4CobrarClientesSuspendidos;
	//protected JPanel jPanelParametrosAuxiliar5CobrarClientesSuspendidos;
	
	
	
	//protected JPanel jPanelReporteDinamicoCobrarClientesSuspendidos;
	//protected JPanel jPanelImportacionCobrarClientesSuspendidos;
	
	
	public JTable jTableDatosCobrarClientesSuspendidos;
	
	
	
	//public JTable jTableDatosCobrarClientesSuspendidosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCobrarClientesSuspendidos;
	protected JButton jButtonDuplicarCobrarClientesSuspendidos;
	protected JButton jButtonCopiarCobrarClientesSuspendidos;
	protected JButton jButtonVerFormCobrarClientesSuspendidos;
	protected JButton jButtonNuevoRelacionesCobrarClientesSuspendidos;
	protected JButton jButtonModificarCobrarClientesSuspendidos;
	
    protected JButton jButtonGuardarCambiosTablaCobrarClientesSuspendidos;
	protected JButton jButtonCerrarCobrarClientesSuspendidos;
	
	
	protected JButton jButtonRecargarInformacionCobrarClientesSuspendidos;
	protected JButton jButtonProcesarInformacionCobrarClientesSuspendidos;
	
	
	protected JButton jButtonAnterioresCobrarClientesSuspendidos;
	protected JButton jButtonSiguientesCobrarClientesSuspendidos;
	protected JButton jButtonNuevoGuardarCambiosCobrarClientesSuspendidos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCobrarClientesSuspendidos;
	//protected JButton jButtonCerrarReporteDinamicoCobrarClientesSuspendidos;
	//protected JButton jButtonGenerarExcelReporteDinamicoCobrarClientesSuspendidos;	
	
	
	
	//protected JButton jButtonAbrirImportacionCobrarClientesSuspendidos;
	//protected JButton jButtonGenerarImportacionCobrarClientesSuspendidos;
	//protected JButton jButtonCerrarImportacionCobrarClientesSuspendidos;
	//protected JFileChooser jFileChooserImportacionCobrarClientesSuspendidos;
	//protected File fileImportacionCobrarClientesSuspendidos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarClientesSuspendidos;
	protected JButton jButtonDuplicarToolBarCobrarClientesSuspendidos;
	protected JButton jButtonNuevoRelacionesToolBarCobrarClientesSuspendidos;
	
	
	public JButton jButtonGuardarCambiosToolBarCobrarClientesSuspendidos;
	protected JButton jButtonCopiarToolBarCobrarClientesSuspendidos;
	protected JButton jButtonVerFormToolBarCobrarClientesSuspendidos;
	public JButton jButtonGuardarCambiosTablaToolBarCobrarClientesSuspendidos;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarClientesSuspendidos;
	protected JButton jButtonCerrarToolBarCobrarClientesSuspendidos;
	
	protected JButton jButtonRecargarInformacionToolBarCobrarClientesSuspendidos;
	protected JButton jButtonProcesarInformacionToolBarCobrarClientesSuspendidos;
	protected JButton jButtonAnterioresToolBarCobrarClientesSuspendidos;
	protected JButton jButtonSiguientesToolBarCobrarClientesSuspendidos;
	protected JButton jButtonNuevoGuardarCambiosToolBarCobrarClientesSuspendidos;
	protected JButton jButtonAbrirOrderByToolBarCobrarClientesSuspendidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemDuplicarCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemNuevoRelacionesCobrarClientesSuspendidos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemCopiarCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemVerFormCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemCerrarCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemDetalleCerrarCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarClientesSuspendidos;
	
	protected JMenuItem jMenuItemRecargarInformacionCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemProcesarInformacionCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemAnterioresCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemSiguientesCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemAbrirOrderByCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemMostrarOcultarCobrarClientesSuspendidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarClientesSuspendidos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCobrarClientesSuspendidos;
	protected JCheckBox jCheckBoxSeleccionadosCobrarClientesSuspendidos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCobrarClientesSuspendidos;
	protected JCheckBox jCheckBoxConGraficoReporteCobrarClientesSuspendidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCobrarClientesSuspendidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCobrarClientesSuspendidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarClientesSuspendidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCobrarClientesSuspendidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCobrarClientesSuspendidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCobrarClientesSuspendidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarClientesSuspendidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarClientesSuspendidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCobrarClientesSuspendidos;
	protected JTextField jTextFieldValorCampoGeneralCobrarClientesSuspendidos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCobrarClientesSuspendidos;
	//public JList<Reporte> jListColumnasSelectReporteCobrarClientesSuspendidos;
	//public JScrollPane jScrollColumnasSelectReporteCobrarClientesSuspendidos;
	
	//public JLabel jLabelRelacionesSelectReporteCobrarClientesSuspendidos;
	//public JList<Reporte> jListRelacionesSelectReporteCobrarClientesSuspendidos;
	//public JScrollPane jScrollRelacionesSelectReporteCobrarClientesSuspendidos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCobrarClientesSuspendidos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCobrarClientesSuspendidos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCobrarClientesSuspendidos;
	//public JLabel jLabelTiposArchivoReporteDinamicoCobrarClientesSuspendidos;
	
		
	//public JLabel jLabelArchivoImportacionCobrarClientesSuspendidos;	
	//public JLabel jLabelPathArchivoImportacionCobrarClientesSuspendidos;
	//protected JTextField jTextFieldPathArchivoImportacionCobrarClientesSuspendidos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCobrarClientesSuspendidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCobrarClientesSuspendidos;
	
	//public JLabel jLabelColumnaCategoriaValorCobrarClientesSuspendidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCobrarClientesSuspendidos;
	
	//public JLabel jLabelColumnasValoresGraficoCobrarClientesSuspendidos;
	//public JList<Reporte> jListColumnasValoresGraficoCobrarClientesSuspendidos;
	//public JScrollPane jScrollColumnasValoresGraficoCobrarClientesSuspendidos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCobrarClientesSuspendidos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCobrarClientesSuspendidos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCobrarClientesSuspendidos;
	public JPanel jPanelBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos;
	public JButton jButtonBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos;
	
	public JPanel jPanelIdIdBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos;
	public JLabel jLabelidBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos;
	public JTextFieldMe jLabelidCobrarClientesSuspendidosBusquedaCobrarClientesSuspendidos;
	public JButton jButtonidBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1254;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CobrarClientesSuspendidosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CobrarClientesSuspendidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesSuspendidosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesSuspendidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesSuspendidosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesSuspendidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesSuspendidosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarClientesSuspendidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCobrarClientesSuspendidos)	{
		this.jButtonRecargarInformacionCobrarClientesSuspendidos = jButtonRecargarInformacionCobrarClientesSuspendidos;
	}
	
	public JButton getjButtonProcesarInformacionCobrarClientesSuspendidos() {
		return this.jButtonProcesarInformacionCobrarClientesSuspendidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarClientesSuspendidos)	{
		this.jButtonProcesarInformacionCobrarClientesSuspendidos = jButtonProcesarInformacionCobrarClientesSuspendidos;
	}
	
	
	public JButton getjButtonRecargarInformacionCobrarClientesSuspendidos() {
		return this.jButtonRecargarInformacionCobrarClientesSuspendidos;
	}
	
	
	public List<CobrarClientesSuspendidos> getcobrarclientessuspendidoss() {
		return this.cobrarclientessuspendidoss;
	}

	public void setcobrarclientessuspendidoss(List<CobrarClientesSuspendidos> cobrarclientessuspendidoss) {
		this.cobrarclientessuspendidoss = cobrarclientessuspendidoss;
	}
	
	public List<CobrarClientesSuspendidos> getcobrarclientessuspendidossAux() {
		return this.cobrarclientessuspendidossAux;
	}

	public void setcobrarclientessuspendidossAux(List<CobrarClientesSuspendidos> cobrarclientessuspendidossAux) {
		this.cobrarclientessuspendidossAux = cobrarclientessuspendidossAux;
	}
	
	public List<CobrarClientesSuspendidos> getcobrarclientessuspendidossEliminados() {
		return this.cobrarclientessuspendidossEliminados;
	}

	public void setCobrarClientesSuspendidossEliminados(List<CobrarClientesSuspendidos> cobrarclientessuspendidossEliminados) {
		this.cobrarclientessuspendidossEliminados = cobrarclientessuspendidossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCobrarClientesSuspendidos() {
		return jComboBoxTiposSeleccionarCobrarClientesSuspendidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCobrarClientesSuspendidos(
			JComboBox jComboBoxTiposSeleccionarCobrarClientesSuspendidos) {
		this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos = jComboBoxTiposSeleccionarCobrarClientesSuspendidos;
	}
	
	public void setBorderResaltarTiposSeleccionarCobrarClientesSuspendidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCobrarClientesSuspendidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCobrarClientesSuspendidos() {
		return jTextFieldValorCampoGeneralCobrarClientesSuspendidos;
	}

	public void setjTextFieldValorCampoGeneralCobrarClientesSuspendidos(
			JTextField jTextFieldValorCampoGeneralCobrarClientesSuspendidos) {
		this.jTextFieldValorCampoGeneralCobrarClientesSuspendidos = jTextFieldValorCampoGeneralCobrarClientesSuspendidos;
	}

	public void setBorderResaltarValorCampoGeneralCobrarClientesSuspendidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSuspendidos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCobrarClientesSuspendidos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCobrarClientesSuspendidos() {
		return this.jCheckBoxSeleccionarTodosCobrarClientesSuspendidos;
	}

	public void setjCheckBoxSeleccionarTodosCobrarClientesSuspendidos(
			JCheckBox jCheckBoxSeleccionarTodosCobrarClientesSuspendidos) {
		this.jCheckBoxSeleccionarTodosCobrarClientesSuspendidos = jCheckBoxSeleccionarTodosCobrarClientesSuspendidos;
	}

	public void setBorderResaltarSeleccionarTodosCobrarClientesSuspendidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSuspendidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCobrarClientesSuspendidos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCobrarClientesSuspendidos() {
		return this.jCheckBoxSeleccionadosCobrarClientesSuspendidos;
	}

	public void setjCheckBoxSeleccionadosCobrarClientesSuspendidos(
			JCheckBox jCheckBoxSeleccionadosCobrarClientesSuspendidos) {
		this.jCheckBoxSeleccionadosCobrarClientesSuspendidos = jCheckBoxSeleccionadosCobrarClientesSuspendidos;
	}
	
	public void setBorderResaltarSeleccionadosCobrarClientesSuspendidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSuspendidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCobrarClientesSuspendidos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCobrarClientesSuspendidos() {
		return this.jComboBoxTiposArchivosReportesCobrarClientesSuspendidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCobrarClientesSuspendidos(
			JComboBox jComboBoxTiposArchivosReportesCobrarClientesSuspendidos) {
		this.jComboBoxTiposArchivosReportesCobrarClientesSuspendidos = jComboBoxTiposArchivosReportesCobrarClientesSuspendidos;
	}

	public void setBorderResaltarTiposArchivosReportesCobrarClientesSuspendidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSuspendidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCobrarClientesSuspendidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCobrarClientesSuspendidos() {
		return this.jComboBoxTiposReportesCobrarClientesSuspendidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCobrarClientesSuspendidos(
			JComboBox jComboBoxTiposReportesCobrarClientesSuspendidos) {
		this.jComboBoxTiposReportesCobrarClientesSuspendidos = jComboBoxTiposReportesCobrarClientesSuspendidos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCobrarClientesSuspendidos() {
	//	return jComboBoxTiposReportesDinamicoCobrarClientesSuspendidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCobrarClientesSuspendidos(
	//		JComboBox jComboBoxTiposReportesDinamicoCobrarClientesSuspendidos) {
	//	this.jComboBoxTiposReportesDinamicoCobrarClientesSuspendidos = jComboBoxTiposReportesDinamicoCobrarClientesSuspendidos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCobrarClientesSuspendidos() {
	//	return jComboBoxTiposArchivosReportesDinamicoCobrarClientesSuspendidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCobrarClientesSuspendidos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarClientesSuspendidos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesSuspendidos = jComboBoxTiposArchivosReportesDinamicoCobrarClientesSuspendidos;
	//}
	
	public void setBorderResaltarTiposReportesCobrarClientesSuspendidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSuspendidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCobrarClientesSuspendidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCobrarClientesSuspendidos() {
		return this.jComboBoxTiposGraficosReportesCobrarClientesSuspendidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCobrarClientesSuspendidos(
			JComboBox jComboBoxTiposGraficosReportesCobrarClientesSuspendidos) {
		this.jComboBoxTiposGraficosReportesCobrarClientesSuspendidos = jComboBoxTiposGraficosReportesCobrarClientesSuspendidos;
	}
	
	public void setBorderResaltarTiposGraficosReportesCobrarClientesSuspendidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSuspendidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCobrarClientesSuspendidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCobrarClientesSuspendidos() {
		return this.jComboBoxTiposPaginacionCobrarClientesSuspendidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCobrarClientesSuspendidos(
			JComboBox jComboBoxTiposPaginacionCobrarClientesSuspendidos) {
		this.jComboBoxTiposPaginacionCobrarClientesSuspendidos = jComboBoxTiposPaginacionCobrarClientesSuspendidos;
	}
	
	public void setBorderResaltarTiposPaginacionCobrarClientesSuspendidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSuspendidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCobrarClientesSuspendidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCobrarClientesSuspendidos() {
		return this.jComboBoxTiposRelacionesCobrarClientesSuspendidos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarClientesSuspendidos() {
		return this.jComboBoxTiposAccionesCobrarClientesSuspendidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarClientesSuspendidos(
			JComboBox jComboBoxTiposRelacionesCobrarClientesSuspendidos) {
		this.jComboBoxTiposRelacionesCobrarClientesSuspendidos = jComboBoxTiposRelacionesCobrarClientesSuspendidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarClientesSuspendidos(
			JComboBox jComboBoxTiposAccionesCobrarClientesSuspendidos) {
		this.jComboBoxTiposAccionesCobrarClientesSuspendidos = jComboBoxTiposAccionesCobrarClientesSuspendidos;
	}
	
	public void setBorderResaltarTiposRelacionesCobrarClientesSuspendidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSuspendidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCobrarClientesSuspendidos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCobrarClientesSuspendidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSuspendidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCobrarClientesSuspendidos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCobrarClientesSuspendidos() {
	//	return jCheckBoxConGraficoDinamicoCobrarClientesSuspendidos;
	//}

	//public void setjCheckBoxConGraficoDinamicoCobrarClientesSuspendidos(
	//		JCheckBox jCheckBoxConGraficoDinamicoCobrarClientesSuspendidos) {
	//	this.jCheckBoxConGraficoDinamicoCobrarClientesSuspendidos = jCheckBoxConGraficoDinamicoCobrarClientesSuspendidos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCobrarClientesSuspendidos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCobrarClientesSuspendidos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCobrarClientesSuspendidos .setBorder(borderResaltar);		
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
		this.cobrarclientessuspendidosSessionBean=new CobrarClientesSuspendidosSessionBean();
		
		this.cobrarclientessuspendidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclientessuspendidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CobrarClientesSuspendidosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CobrarClientesSuspendidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarClientesSuspendidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarClientesSuspendidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarClientesSuspendidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Clientes Suspendidos MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
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
		
		CobrarClientesSuspendidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CobrarClientesSuspendidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCobrarClientesSuspendidos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCobrarClientesSuspendidos,this.jTtoolBarCobrarClientesSuspendidos,
							"nuevo","nuevo","Nuevo"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCobrarClientesSuspendidos,this.jTtoolBarCobrarClientesSuspendidos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCobrarClientesSuspendidos,this.jTtoolBarCobrarClientesSuspendidos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCobrarClientesSuspendidos,this.jTtoolBarCobrarClientesSuspendidos,
							"duplicar","duplicar","Duplicar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCobrarClientesSuspendidos,this.jTtoolBarCobrarClientesSuspendidos,
							"copiar","copiar","Copiar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCobrarClientesSuspendidos,this.jTtoolBarCobrarClientesSuspendidos,
							"ver_form","ver_form","Ver"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesSuspendidos,this.jTtoolBarCobrarClientesSuspendidos,
							"recargar","recargar","Buscar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesSuspendidos,this.jTtoolBarCobrarClientesSuspendidos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesSuspendidos,this.jTtoolBarCobrarClientesSuspendidos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCobrarClientesSuspendidos,this.jTtoolBarCobrarClientesSuspendidos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCobrarClientesSuspendidos,this.jTtoolBarCobrarClientesSuspendidos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCobrarClientesSuspendidos,this.jTtoolBarCobrarClientesSuspendidos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCobrarClientesSuspendidos,this.jTtoolBarCobrarClientesSuspendidos,
							"cerrar","cerrar","Salir"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCobrarClientesSuspendidos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCobrarClientesSuspendidos;
			
				this.jButtonProcesarInformacionToolBarCobrarClientesSuspendidos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCobrarClientesSuspendidos;
				
		//protected JButton jButtonModificarToolBarCobrarClientesSuspendidos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCobrarClientesSuspendidos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCobrarClientesSuspendidos=new JMenuMe("General");
		this.jmenuArchivoCobrarClientesSuspendidos=new JMenuMe("Archivo");
		this.jmenuAccionesCobrarClientesSuspendidos=new JMenuMe("Acciones");
		this.jmenuDatosCobrarClientesSuspendidos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarClientesSuspendidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarClientesSuspendidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarClientesSuspendidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCobrarClientesSuspendidos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCobrarClientesSuspendidos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCobrarClientesSuspendidos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCobrarClientesSuspendidos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCobrarClientesSuspendidos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCobrarClientesSuspendidos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCobrarClientesSuspendidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarClientesSuspendidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarClientesSuspendidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCobrarClientesSuspendidos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCobrarClientesSuspendidos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCobrarClientesSuspendidos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCobrarClientesSuspendidos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCobrarClientesSuspendidos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCobrarClientesSuspendidos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCobrarClientesSuspendidos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCobrarClientesSuspendidos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCobrarClientesSuspendidos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarClientesSuspendidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarClientesSuspendidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarClientesSuspendidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCobrarClientesSuspendidos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCobrarClientesSuspendidos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCobrarClientesSuspendidos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCobrarClientesSuspendidos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCobrarClientesSuspendidos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCobrarClientesSuspendidos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCobrarClientesSuspendidos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCobrarClientesSuspendidos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCobrarClientesSuspendidos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCobrarClientesSuspendidos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCobrarClientesSuspendidos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCobrarClientesSuspendidos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCobrarClientesSuspendidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCobrarClientesSuspendidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCobrarClientesSuspendidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarClientesSuspendidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarClientesSuspendidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarClientesSuspendidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCobrarClientesSuspendidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCobrarClientesSuspendidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCobrarClientesSuspendidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarClientesSuspendidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarClientesSuspendidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarClientesSuspendidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCobrarClientesSuspendidos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCobrarClientesSuspendidos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCobrarClientesSuspendidos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCobrarClientesSuspendidos.add(this.jMenuItemCerrarCobrarClientesSuspendidos);
			
			this.jmenuAccionesCobrarClientesSuspendidos.add(this.jMenuItemNuevoCobrarClientesSuspendidos);
			this.jmenuAccionesCobrarClientesSuspendidos.add(this.jMenuItemNuevoGuardarCambiosCobrarClientesSuspendidos);
			this.jmenuAccionesCobrarClientesSuspendidos.add(this.jMenuItemNuevoRelacionesCobrarClientesSuspendidos);
			this.jmenuAccionesCobrarClientesSuspendidos.add(this.jMenuItemGuardarCambiosTablaCobrarClientesSuspendidos);		
			this.jmenuAccionesCobrarClientesSuspendidos.add(this.jMenuItemDuplicarCobrarClientesSuspendidos);		
			this.jmenuAccionesCobrarClientesSuspendidos.add(this.jMenuItemCopiarCobrarClientesSuspendidos);		
			this.jmenuAccionesCobrarClientesSuspendidos.add(this.jMenuItemVerFormCobrarClientesSuspendidos);		
			
			this.jmenuDatosCobrarClientesSuspendidos.add(this.jMenuItemRecargarInformacionCobrarClientesSuspendidos);				
			this.jmenuDatosCobrarClientesSuspendidos.add(this.jMenuItemAnterioresCobrarClientesSuspendidos);				
			this.jmenuDatosCobrarClientesSuspendidos.add(this.jMenuItemSiguientesCobrarClientesSuspendidos);				
			this.jmenuDatosCobrarClientesSuspendidos.add(this.jMenuItemAbrirOrderByCobrarClientesSuspendidos);				
			this.jmenuDatosCobrarClientesSuspendidos.add(this.jMenuItemMostrarOcultarCobrarClientesSuspendidos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCobrarClientesSuspendidos.add(this.jMenuItemGuardarCambiosCobrarClientesSuspendidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCobrarClientesSuspendidos.add(this.jmenuArchivoCobrarClientesSuspendidos);		
			this.jmenuBarCobrarClientesSuspendidos.add(this.jmenuAccionesCobrarClientesSuspendidos);		
			this.jmenuBarCobrarClientesSuspendidos.add(this.jmenuDatosCobrarClientesSuspendidos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCobrarClientesSuspendidos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCobrarClientesSuspendidos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos= new JButtonMe();
		this.jButtonBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.setText("Buscar");
		this.jButtonBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos = new JLabelMe();
		jLabelidBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.setText("Id :");
		jLabelidBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-9),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-9),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-9),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidCobrarClientesSuspendidosBusquedaCobrarClientesSuspendidos= new JTextFieldMe();
		jLabelidCobrarClientesSuspendidosBusquedaCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarClientesSuspendidosBusquedaCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarClientesSuspendidosBusquedaCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidCobrarClientesSuspendidosBusquedaCobrarClientesSuspendidos.setVisible(false);




		this.jTabbedPaneBusquedasCobrarClientesSuspendidos=new JTabbedPane();


		this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCobrarClientesSuspendidos = new CobrarClientesSuspendidosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cobrar Clientes Suspendidos DATOS");
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos = new CobrarClientesSuspendidosDetalleFormJInternalFrame(jDesktopPane,this.cobrarclientessuspendidosSessionBean.getConGuardarRelaciones(),this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos = null;//new CobrarClientesSuspendidosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarClientesSuspendidos= new GridBagLayout();
		
		
		this.jTableDatosCobrarClientesSuspendidos = new JTableMe();      
		
		String sToolTipCobrarClientesSuspendidos="";
		sToolTipCobrarClientesSuspendidos=CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarClientesSuspendidos+="(Cartera.CobrarClientesSuspendidos)";
		}
		
		if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarClientesSuspendidos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCobrarClientesSuspendidos.setToolTipText(sToolTipCobrarClientesSuspendidos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCobrarClientesSuspendidos);
		this.jTableDatosCobrarClientesSuspendidos.setAutoCreateRowSorter(true);
		this.jTableDatosCobrarClientesSuspendidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCobrarClientesSuspendidos.setRowSelectionAllowed(true);
		this.jTableDatosCobrarClientesSuspendidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonDuplicarCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonCopiarCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonVerFormCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonNuevoRelacionesCobrarClientesSuspendidos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonCerrarCobrarClientesSuspendidos = new JButtonMe();
		
		this.jScrollPanelDatosCobrarClientesSuspendidos = new JScrollPane();   
        this.jScrollPanelDatosGeneralCobrarClientesSuspendidos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCobrarClientesSuspendidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Clientes Suspendidos";
		
		if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Suspendidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarClientesSuspendidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarClientesSuspendidos.setToolTipText("Acciones");
        this.jPanelAccionesCobrarClientesSuspendidos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos=new ReporteDinamicoJInternalFrame(CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCobrarClientesSuspendidos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCobrarClientesSuspendidos=new ImportacionJInternalFrame(CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCobrarClientesSuspendidos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCobrarClientesSuspendidos = new JButtonMe();
		
		this.jButtonAbrirOrderByCobrarClientesSuspendidos.setText("Orden");
		this.jButtonAbrirOrderByCobrarClientesSuspendidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarClientesSuspendidos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCobrarClientesSuspendidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarClientesSuspendidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesSuspendidos,false,this);
			
			//this.cargarOrderByCobrarClientesSuspendidos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarClientesSuspendidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesSuspendidos,true,this);
			
			//this.cargarOrderByCobrarClientesSuspendidos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCobrarClientesSuspendidos.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosCobrarClientesSuspendidos.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosCobrarClientesSuspendidos.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosCobrarClientesSuspendidos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarClientesSuspendidos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarClientesSuspendidos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCobrarClientesSuspendidos.setText("Nuevo");
		this.jButtonDuplicarCobrarClientesSuspendidos.setText("Duplicar");
		this.jButtonCopiarCobrarClientesSuspendidos.setText("Copiar");
		this.jButtonVerFormCobrarClientesSuspendidos.setText("Ver");
		this.jButtonNuevoRelacionesCobrarClientesSuspendidos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos.setText("Guardar");
		this.jButtonCerrarCobrarClientesSuspendidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarClientesSuspendidos,"nuevo_button","Nuevo",this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCobrarClientesSuspendidos,"duplicar_button","Duplicar",this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCobrarClientesSuspendidos,"copiar_button","Copiar",this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCobrarClientesSuspendidos,"ver_form","Ver",this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCobrarClientesSuspendidos,"nuevorelaciones_button","Nuevo Rel",this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos,"guardarcambiostabla_button","Guardar",this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarClientesSuspendidos,"cerrar_button","Salir",this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCobrarClientesSuspendidos.setToolTipText("Nuevo"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCobrarClientesSuspendidos.setToolTipText("Duplicar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCobrarClientesSuspendidos.setToolTipText("Copiar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCobrarClientesSuspendidos.setToolTipText("Ver"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCobrarClientesSuspendidos.setToolTipText("Nuevo Rel"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos.setToolTipText("Guardar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarClientesSuspendidos.setToolTipText("Salir"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarClientesSuspendidos";
		inputMap = this.jButtonNuevoCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarClientesSuspendidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarClientesSuspendidos"));
		
		//DUPLICAR
		sMapKey = "DuplicarCobrarClientesSuspendidos";
		inputMap = this.jButtonDuplicarCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCobrarClientesSuspendidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCobrarClientesSuspendidos"));
		
		//COPIAR
		sMapKey = "CopiarCobrarClientesSuspendidos";
		inputMap = this.jButtonCopiarCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCobrarClientesSuspendidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCobrarClientesSuspendidos"));
		
		//VEr FORM
		sMapKey = "VerFormCobrarClientesSuspendidos";
		inputMap = this.jButtonVerFormCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCobrarClientesSuspendidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCobrarClientesSuspendidos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCobrarClientesSuspendidos";
		inputMap = this.jButtonNuevoRelacionesCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCobrarClientesSuspendidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCobrarClientesSuspendidos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCobrarClientesSuspendidos";
		inputMap = this.jButtonModificarCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCobrarClientesSuspendidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCobrarClientesSuspendidos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCobrarClientesSuspendidos";
		inputMap = this.jButtonCerrarCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarClientesSuspendidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarClientesSuspendidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarClientesSuspendidos";
		inputMap = this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarClientesSuspendidos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCobrarClientesSuspendidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCobrarClientesSuspendidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCobrarClientesSuspendidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CobrarClientesSuspendidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CobrarClientesSuspendidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CobrarClientesSuspendidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CobrarClientesSuspendidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CobrarClientesSuspendidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCobrarClientesSuspendidos.setName("jPanelParametrosReportesCobrarClientesSuspendidos"); 
		
		this.jPanelParametrosReportesAccionesCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCobrarClientesSuspendidos.setName("jPanelParametrosReportesAccionesCobrarClientesSuspendidos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonRecargarInformacionCobrarClientesSuspendidos.setText("Buscar");
		this.jButtonRecargarInformacionCobrarClientesSuspendidos.setToolTipText("Buscar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCobrarClientesSuspendidos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCobrarClientesSuspendidos.setVisible(false);
		
		
		this.jButtonProcesarInformacionCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonProcesarInformacionCobrarClientesSuspendidos.setText("Procesar");
		this.jButtonProcesarInformacionCobrarClientesSuspendidos.setToolTipText("Procesar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCobrarClientesSuspendidos.setVisible(false);
			
		this.jButtonProcesarInformacionCobrarClientesSuspendidos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarClientesSuspendidos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarClientesSuspendidos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCobrarClientesSuspendidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesSuspendidos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCobrarClientesSuspendidos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCobrarClientesSuspendidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesSuspendidos.setText("TIPO");       
		this.jComboBoxTiposReportesCobrarClientesSuspendidos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCobrarClientesSuspendidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesSuspendidos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCobrarClientesSuspendidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCobrarClientesSuspendidos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCobrarClientesSuspendidos.setText("Paginacion");
		this.jComboBoxTiposPaginacionCobrarClientesSuspendidos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCobrarClientesSuspendidos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCobrarClientesSuspendidos.setText("Accion");
		this.jComboBoxTiposRelacionesCobrarClientesSuspendidos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCobrarClientesSuspendidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setText("Accion");
		this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos.setText("Accion");
		this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCobrarClientesSuspendidos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCobrarClientesSuspendidos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarClientesSuspendidos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarClientesSuspendidos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCobrarClientesSuspendidos = new JLabelMe();
		
		this.jLabelAccionesCobrarClientesSuspendidos.setText("Acciones");		
		this.jLabelAccionesCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCobrarClientesSuspendidos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCobrarClientesSuspendidos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCobrarClientesSuspendidos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCobrarClientesSuspendidos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCobrarClientesSuspendidos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCobrarClientesSuspendidos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCobrarClientesSuspendidos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCobrarClientesSuspendidos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCobrarClientesSuspendidos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCobrarClientesSuspendidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCobrarClientesSuspendidos.setText("Graf.");
		this.jCheckBoxConGraficoReporteCobrarClientesSuspendidos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCobrarClientesSuspendidos = new JButtonMe();
		//this.jButtonAnterioresCobrarClientesSuspendidos.setText("<<");
        this.jButtonAnterioresCobrarClientesSuspendidos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCobrarClientesSuspendidos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCobrarClientesSuspendidos = new JButtonMe();
		//this.jButtonSiguientesCobrarClientesSuspendidos.setText(">>");
        this.jButtonSiguientesCobrarClientesSuspendidos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCobrarClientesSuspendidos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCobrarClientesSuspendidos.setText("Nue");
        this.jButtonNuevoGuardarCambiosCobrarClientesSuspendidos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCobrarClientesSuspendidos,"nuevoguardarcambios_button","Nue",this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCobrarClientesSuspendidos";
		inputMap = this.jButtonNuevoGuardarCambiosCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCobrarClientesSuspendidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCobrarClientesSuspendidos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCobrarClientesSuspendidos";
		inputMap = this.jButtonRecargarInformacionCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCobrarClientesSuspendidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCobrarClientesSuspendidos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCobrarClientesSuspendidos";
		inputMap = this.jButtonSiguientesCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCobrarClientesSuspendidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCobrarClientesSuspendidos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCobrarClientesSuspendidos";
		inputMap = this.jButtonAnterioresCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCobrarClientesSuspendidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCobrarClientesSuspendidos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCobrarClientesSuspendidos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCobrarClientesSuspendidos.setMinimumSize(new Dimension(this.getWidth(),CobrarClientesSuspendidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesSuspendidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarClientesSuspendidos.setMaximumSize(new Dimension(this.getWidth(),CobrarClientesSuspendidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesSuspendidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarClientesSuspendidos.setPreferredSize(new Dimension(this.getWidth(),CobrarClientesSuspendidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesSuspendidosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCobrarClientesSuspendidos = new GridBagLayout();

			this.jPanelPaginacionCobrarClientesSuspendidos.setLayout(gridaBagLayoutPaginacionCobrarClientesSuspendidos);						
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCobrarClientesSuspendidos.add(this.jButtonAnterioresCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
					
						
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
			
			this.jPanelPaginacionCobrarClientesSuspendidos.add(this.jButtonNuevoGuardarCambiosCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
						
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
			this.jPanelPaginacionCobrarClientesSuspendidos.add(this.jButtonSiguientesCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 1;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesSuspendidos.add(this.jButtonNuevoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
						
			
			
			if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 1;
				this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCobrarClientesSuspendidos.add(this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
			}
			
			
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 1;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesSuspendidos.add(this.jButtonDuplicarCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 1;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesSuspendidos.add(this.jButtonCopiarCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 1;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesSuspendidos.add(this.jButtonVerFormCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 1;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCobrarClientesSuspendidos.add(this.jButtonCerrarCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
		
		
		this.jButtonRecargarInformacionCobrarClientesSuspendidos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarClientesSuspendidos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarClientesSuspendidos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCobrarClientesSuspendidos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarClientesSuspendidos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarClientesSuspendidos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCobrarClientesSuspendidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarClientesSuspendidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarClientesSuspendidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCobrarClientesSuspendidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarClientesSuspendidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarClientesSuspendidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCobrarClientesSuspendidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarClientesSuspendidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarClientesSuspendidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCobrarClientesSuspendidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarClientesSuspendidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarClientesSuspendidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCobrarClientesSuspendidos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarClientesSuspendidos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarClientesSuspendidos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCobrarClientesSuspendidos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarClientesSuspendidos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarClientesSuspendidos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCobrarClientesSuspendidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarClientesSuspendidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarClientesSuspendidos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCobrarClientesSuspendidos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarClientesSuspendidos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarClientesSuspendidos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCobrarClientesSuspendidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCobrarClientesSuspendidos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CobrarClientesSuspendidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CobrarClientesSuspendidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CobrarClientesSuspendidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CobrarClientesSuspendidos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCobrarClientesSuspendidos.setLayout(gridaBagParametrosReportesCobrarClientesSuspendidos);
			this.jPanelParametrosReportesAccionesCobrarClientesSuspendidos.setLayout(gridaBagParametrosReportesAccionesCobrarClientesSuspendidos);
			
			
			this.jPanelParametrosAuxiliar1CobrarClientesSuspendidos.setLayout(gridaBagParametrosAuxiliar1CobrarClientesSuspendidos);
			this.jPanelParametrosAuxiliar2CobrarClientesSuspendidos.setLayout(gridaBagParametrosAuxiliar2CobrarClientesSuspendidos);
			this.jPanelParametrosAuxiliar3CobrarClientesSuspendidos.setLayout(gridaBagParametrosAuxiliar3CobrarClientesSuspendidos);
			this.jPanelParametrosAuxiliar4CobrarClientesSuspendidos.setLayout(gridaBagParametrosAuxiliar4CobrarClientesSuspendidos);
			//this.jPanelParametrosAuxiliar5CobrarClientesSuspendidos.setLayout(gridaBagParametrosAuxiliar2CobrarClientesSuspendidos);			
			
			
			
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesSuspendidos.add(this.jButtonRecargarInformacionCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesSuspendidos.add(this.jComboBoxTiposPaginacionCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesSuspendidos.add(this.jCheckBoxConAltoMaximoTablaCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesSuspendidos.add(this.jComboBoxTiposArchivosReportesCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesSuspendidos.add(this.jPanelParametrosAuxiliar1CobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CobrarClientesSuspendidos.add(this.jComboBoxTiposReportesCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);																		
			
			
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CobrarClientesSuspendidos.add(this.jComboBoxTiposGraficosReportesCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesSuspendidos.add(this.jPanelParametrosAuxiliar4CobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesSuspendidos.add(this.jComboBoxTiposReportesCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesSuspendidos.add(this.jCheckBoxGenerarReporteCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesSuspendidos.add(this.jPanelParametrosAuxiliar2CobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesSuspendidos.add(this.jLabelAccionesCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCobrarClientesSuspendidos.add(this.jButtonAbrirOrderByCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesSuspendidos.add(this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);			
			
			
			/*
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesSuspendidos.add(this.jCheckBoxSeleccionarTodosCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesSuspendidos.add(this.jCheckBoxConGraficoReporteCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarClientesSuspendidos.add(this.jCheckBoxSeleccionarTodosCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);															
				
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarClientesSuspendidos.add(this.jCheckBoxSeleccionadosCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);															
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarClientesSuspendidos.add(this.jCheckBoxConGraficoReporteCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesSuspendidos.add(this.jPanelParametrosAuxiliar3CobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesSuspendidos.add(this.jComboBoxTiposAccionesCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCobrarClientesSuspendidos = new GridBagLayout();

			this.jScrollPanelDatosCobrarClientesSuspendidos.setLayout(gridaBagLayoutDatosCobrarClientesSuspendidos);
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
			
			this.jScrollPanelDatosCobrarClientesSuspendidos.add(this.jTableDatosCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCobrarClientesSuspendidos.setViewportView(this.jTableDatosCobrarClientesSuspendidos);
		this.jTableDatosCobrarClientesSuspendidos.setFillsViewportHeight(true);
		this.jTableDatosCobrarClientesSuspendidos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCobrarClientesSuspendidos= new GridBagLayout();
		this.jPanelAccionesCobrarClientesSuspendidos.setLayout(gridaBagLayoutAccionesCobrarClientesSuspendidos);
		
		
		/*	
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
			
		this.jPanelAccionesCobrarClientesSuspendidos.add(this.jButtonNuevoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos= new GridBagLayout();
		gridaBagLayoutBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.setLayout(gridaBagLayoutBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos);

		gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
		gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
		jPanelBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.add(jLabelidBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos, gridBagConstraintsCobrarClientesSuspendidos);

		gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
		gridBagConstraintsCobrarClientesSuspendidos.gridx = 1;
		jPanelBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.add(jLabelidCobrarClientesSuspendidosBusquedaCobrarClientesSuspendidos, gridBagConstraintsCobrarClientesSuspendidos);

		gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesSuspendidos.gridy = 1;
		gridBagConstraintsCobrarClientesSuspendidos.gridx =1;
		jPanelBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.add(jButtonBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos, gridBagConstraintsCobrarClientesSuspendidos);

		jTabbedPaneBusquedasCobrarClientesSuspendidos.addTab("1.-Por Id ", jPanelBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos);
		jTabbedPaneBusquedasCobrarClientesSuspendidos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarClientesSuspendidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarClientesSuspendidos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();						
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;		
			//this.gridBagConstraintsCobrarClientesSuspendidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;		
		//this.gridBagConstraintsCobrarClientesSuspendidos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCobrarClientesSuspendidos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;		
			this.gridBagConstraintsCobrarClientesSuspendidos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);								
		
		
		/*
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		*/		
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx =0;
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarClientesSuspendidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
				
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CobrarClientesSuspendidosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCobrarClientesSuspendidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarClientesSuspendidos = new GridBagLayout();
			this.jPanelBusquedasParametrosCobrarClientesSuspendidos.setLayout(gridaBagLayoutBusquedasParametrosCobrarClientesSuspendidos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCobrarClientesSuspendidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarClientesSuspendidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesSuspendidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesSuspendidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
			
			
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
			
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCobrarClientesSuspendidos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCobrarClientesSuspendidos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCobrarClientesSuspendidos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCobrarClientesSuspendidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.setName("jPanelReporteDinamicoCobrarClientesSuspendidos"); 
		
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.setLayout(gridaBagLayoutReporteDinamicoCobrarClientesSuspendidos);
		
		
		this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCobrarClientesSuspendidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarClientesSuspendidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setResizable(true);
	    this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setClosable(true);
	    this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCobrarClientesSuspendidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarClientesSuspendidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarClientesSuspendidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Suspendidoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCobrarClientesSuspendidos = new JLabelMe();

		this.jLabelColumnasSelectReporteCobrarClientesSuspendidos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jLabelColumnasSelectReporteCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCobrarClientesSuspendidos = new JList<Reporte>();
		this.jListColumnasSelectReporteCobrarClientesSuspendidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCobrarClientesSuspendidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCobrarClientesSuspendidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarClientesSuspendidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarClientesSuspendidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCobrarClientesSuspendidos=new JScrollPane(this.jListColumnasSelectReporteCobrarClientesSuspendidos);
			
			this.jScrollColumnasSelectReporteCobrarClientesSuspendidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarClientesSuspendidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarClientesSuspendidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jListColumnasSelectReporteCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jScrollColumnasSelectReporteCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCobrarClientesSuspendidos = new JLabelMe();

		this.jLabelRelacionesSelectReporteCobrarClientesSuspendidos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCobrarClientesSuspendidos = new JList<Reporte>();
		this.jListRelacionesSelectReporteCobrarClientesSuspendidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCobrarClientesSuspendidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCobrarClientesSuspendidos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarClientesSuspendidos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarClientesSuspendidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCobrarClientesSuspendidos=new JScrollPane(this.jListRelacionesSelectReporteCobrarClientesSuspendidos);
			
			this.jScrollRelacionesSelectReporteCobrarClientesSuspendidos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarClientesSuspendidos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarClientesSuspendidos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCobrarClientesSuspendidos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCobrarClientesSuspendidos = new JComboBoxMe();
		this.jListColumnasValoresGraficoCobrarClientesSuspendidos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCobrarClientesSuspendidos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCobrarClientesSuspendidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCobrarClientesSuspendidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarClientesSuspendidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarClientesSuspendidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesSuspendidos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesSuspendidos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesSuspendidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesSuspendidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesSuspendidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCobrarClientesSuspendidos = new JLabelMe();

		this.jLabelConGraficoDinamicoCobrarClientesSuspendidos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jLabelConGraficoDinamicoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCobrarClientesSuspendidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCobrarClientesSuspendidos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCobrarClientesSuspendidos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCobrarClientesSuspendidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarClientesSuspendidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarClientesSuspendidos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jCheckBoxConGraficoDinamicoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCobrarClientesSuspendidos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCobrarClientesSuspendidos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jLabelColumnaCategoriaGraficoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCobrarClientesSuspendidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarClientesSuspendidos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCobrarClientesSuspendidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCobrarClientesSuspendidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarClientesSuspendidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarClientesSuspendidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jComboBoxColumnaCategoriaGraficoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCobrarClientesSuspendidos = new JLabelMe();

		this.jLabelColumnaCategoriaValorCobrarClientesSuspendidos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jLabelColumnaCategoriaValorCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCobrarClientesSuspendidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCobrarClientesSuspendidos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCobrarClientesSuspendidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCobrarClientesSuspendidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarClientesSuspendidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarClientesSuspendidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jComboBoxColumnaCategoriaValorCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCobrarClientesSuspendidos = new JLabelMe();

		this.jLabelColumnasValoresGraficoCobrarClientesSuspendidos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jLabelColumnasValoresGraficoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCobrarClientesSuspendidos = new JList<Reporte>();
		this.jListColumnasValoresGraficoCobrarClientesSuspendidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCobrarClientesSuspendidos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCobrarClientesSuspendidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarClientesSuspendidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarClientesSuspendidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCobrarClientesSuspendidos=new JScrollPane(this.jListColumnasValoresGraficoCobrarClientesSuspendidos);
			
			this.jScrollColumnasValoresGraficoCobrarClientesSuspendidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarClientesSuspendidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarClientesSuspendidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jListColumnasSelectReporteCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jScrollColumnasValoresGraficoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCobrarClientesSuspendidos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCobrarClientesSuspendidos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jLabelTiposGraficosReportesDinamicoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCobrarClientesSuspendidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarClientesSuspendidos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCobrarClientesSuspendidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCobrarClientesSuspendidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarClientesSuspendidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarClientesSuspendidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jComboBoxTiposGraficosReportesDinamicoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesSuspendidos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCobrarClientesSuspendidos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jLabelGenerarExcelReporteDinamicoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesSuspendidos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCobrarClientesSuspendidos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesSuspendidos.setToolTipText("Generar EXCEL"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jButtonGenerarExcelReporteDinamicoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jComboBoxTiposReportesDinamicoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesSuspendidos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCobrarClientesSuspendidos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jLabelTiposArchivoReporteDinamicoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCobrarClientesSuspendidos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCobrarClientesSuspendidos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCobrarClientesSuspendidos.setToolTipText("Generar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jButtonGenerarReporteDinamicoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCobrarClientesSuspendidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCobrarClientesSuspendidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCobrarClientesSuspendidos.setToolTipText("Cancelar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesSuspendidos.add(this.jButtonCerrarReporteDinamicoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCobrarClientesSuspendidos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCobrarClientesSuspendidos= new JScrollPane(jPanelReporteDinamicoCobrarClientesSuspendidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCobrarClientesSuspendidos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarClientesSuspendidos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarClientesSuspendidos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Suspendidoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCobrarClientesSuspendidos);
		this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getContentPane().add(this.jScrollPanelReporteDinamicoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCobrarClientesSuspendidos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCobrarClientesSuspendidos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCobrarClientesSuspendidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCobrarClientesSuspendidos.setName("jPanelImportacionCobrarClientesSuspendidos"); 
		
		this.jPanelImportacionCobrarClientesSuspendidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarClientesSuspendidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarClientesSuspendidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCobrarClientesSuspendidos.setLayout(gridaBagLayoutImportacionCobrarClientesSuspendidos);
		
		
		this.jInternalFrameImportacionCobrarClientesSuspendidos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCobrarClientesSuspendidos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCobrarClientesSuspendidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarClientesSuspendidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCobrarClientesSuspendidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarClientesSuspendidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarClientesSuspendidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCobrarClientesSuspendidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarClientesSuspendidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarClientesSuspendidos.setResizable(true);
	    this.jInternalFrameImportacionCobrarClientesSuspendidos.setClosable(true);
	    this.jInternalFrameImportacionCobrarClientesSuspendidos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCobrarClientesSuspendidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarClientesSuspendidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarClientesSuspendidos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCobrarClientesSuspendidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarClientesSuspendidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarClientesSuspendidos.setResizable(true);
	    this.jInternalFrameImportacionCobrarClientesSuspendidos.setClosable(true);
	    this.jInternalFrameImportacionCobrarClientesSuspendidos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCobrarClientesSuspendidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarClientesSuspendidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarClientesSuspendidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Suspendidoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCobrarClientesSuspendidos = new JLabelMe();

		this.jLabelArchivoImportacionCobrarClientesSuspendidos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarClientesSuspendidos.add(this.jLabelArchivoImportacionCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCobrarClientesSuspendidos = new JFileChooser();		
		this.jFileChooserImportacionCobrarClientesSuspendidos.setToolTipText("ESCOGER ARCHIVO"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonAbrirImportacionCobrarClientesSuspendidos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCobrarClientesSuspendidos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCobrarClientesSuspendidos.setToolTipText("Generar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesSuspendidos.add(this.jButtonAbrirImportacionCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCobrarClientesSuspendidos = new JLabelMe();

		this.jLabelPathArchivoImportacionCobrarClientesSuspendidos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarClientesSuspendidos.add(this.jLabelPathArchivoImportacionCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCobrarClientesSuspendidos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCobrarClientesSuspendidos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarClientesSuspendidos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarClientesSuspendidos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesSuspendidos.add(this.jTextFieldPathArchivoImportacionCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonGenerarImportacionCobrarClientesSuspendidos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCobrarClientesSuspendidos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCobrarClientesSuspendidos.setToolTipText("Generar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesSuspendidos.add(this.jButtonGenerarImportacionCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonCerrarImportacionCobrarClientesSuspendidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCobrarClientesSuspendidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCobrarClientesSuspendidos.setToolTipText("Cancelar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesSuspendidos.add(this.jButtonCerrarImportacionCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCobrarClientesSuspendidos = new GridBagLayout();
		
		this.jScrollPanelImportacionCobrarClientesSuspendidos= new JScrollPane(jPanelImportacionCobrarClientesSuspendidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy =iPosYImportacion;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx =iPosXImportacion;
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCobrarClientesSuspendidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCobrarClientesSuspendidos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCobrarClientesSuspendidos);
		this.jInternalFrameImportacionCobrarClientesSuspendidos.getContentPane().add(this.jScrollPanelImportacionCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCobrarClientesSuspendidos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCobrarClientesSuspendidos = new JButtonMe();
			this.jButtonAbrirOrderByCobrarClientesSuspendidos.setText("Orden");
			this.jButtonAbrirOrderByCobrarClientesSuspendidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarClientesSuspendidos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCobrarClientesSuspendidos";
			inputMap = this.jButtonAbrirOrderByCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCobrarClientesSuspendidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCobrarClientesSuspendidos"));
		
		
			GridBagLayout gridaBagLayoutOrderByCobrarClientesSuspendidos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCobrarClientesSuspendidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCobrarClientesSuspendidos.setName("jPanelOrderByCobrarClientesSuspendidos"); 
			
			this.jPanelOrderByCobrarClientesSuspendidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarClientesSuspendidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarClientesSuspendidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCobrarClientesSuspendidos.setLayout(gridaBagLayoutOrderByCobrarClientesSuspendidos);
			
			
			this.jTableDatosCobrarClientesSuspendidosOrderBy = new JTableMe();        
			this.jTableDatosCobrarClientesSuspendidosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCobrarClientesSuspendidosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCobrarClientesSuspendidosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCobrarClientesSuspendidosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCobrarClientesSuspendidosOrderBy.setViewportView(this.jTableDatosCobrarClientesSuspendidosOrderBy);
			this.jTableDatosCobrarClientesSuspendidosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCobrarClientesSuspendidosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCobrarClientesSuspendidos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCobrarClientesSuspendidos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCobrarClientesSuspendidos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCobrarClientesSuspendidos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCobrarClientesSuspendidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCobrarClientesSuspendidos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCobrarClientesSuspendidos.setTitle("Orden");
			this.jInternalFrameOrderByCobrarClientesSuspendidos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCobrarClientesSuspendidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCobrarClientesSuspendidos.setResizable(true);
			this.jInternalFrameOrderByCobrarClientesSuspendidos.setClosable(true);
			this.jInternalFrameOrderByCobrarClientesSuspendidos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCobrarClientesSuspendidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarClientesSuspendidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarClientesSuspendidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Suspendidoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCobrarClientesSuspendidos.ipady =150;
				
			this.jPanelOrderByCobrarClientesSuspendidos.add(jScrollPanelDatosCobrarClientesSuspendidosOrderBy, this.gridBagConstraintsCobrarClientesSuspendidos);//this.jTableDatosCobrarClientesSuspendidosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCobrarClientesSuspendidos = new JButtonMe();
			this.jButtonCerrarOrderByCobrarClientesSuspendidos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCobrarClientesSuspendidos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCobrarClientesSuspendidos.setToolTipText("Cancelar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCobrarClientesSuspendidos.add(this.jButtonCerrarOrderByCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCobrarClientesSuspendidos = new GridBagLayout();
			
			this.jScrollPanelOrderByCobrarClientesSuspendidos= new JScrollPane(jPanelOrderByCobrarClientesSuspendidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy =iPosYOrderBy;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCobrarClientesSuspendidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCobrarClientesSuspendidos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCobrarClientesSuspendidos);
			
			this.jInternalFrameOrderByCobrarClientesSuspendidos.getContentPane().add(this.jScrollPanelOrderByCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);			
		
		} else {
			this.jButtonAbrirOrderByCobrarClientesSuspendidos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.cobrarclientessuspendidosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCobrarClientesSuspendidos.getRowHeight();//CobrarClientesSuspendidosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CobrarClientesSuspendidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarClientesSuspendidos.isSelected()) {
					iHeightTable=CobrarClientesSuspendidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarClientesSuspendidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarClientesSuspendidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CobrarClientesSuspendidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarClientesSuspendidos.isSelected()) {
					iHeightTable=CobrarClientesSuspendidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarClientesSuspendidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarClientesSuspendidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCobrarClientesSuspendidos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarClientesSuspendidos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarClientesSuspendidos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCobrarClientesSuspendidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarClientesSuspendidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarClientesSuspendidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCobrarClientesSuspendidos!=null && this.jInternalFrameOrderByCobrarClientesSuspendidos.getjTableDatosOrderBy()!=null) {
			//if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCobrarClientesSuspendidos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCobrarClientesSuspendidos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCobrarClientesSuspendidos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCobrarClientesSuspendidos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCobrarClientesSuspendidos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCobrarClientesSuspendidos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCobrarClientesSuspendidos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCobrarClientesSuspendidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarClientesSuspendidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarClientesSuspendidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclientessuspendidoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CobrarClientesSuspendidos> TraerCobrarClientesSuspendidosBeans(List<CobrarClientesSuspendidos> cobrarclientessuspendidoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(CobrarClientesSuspendidos cobrarclientessuspendidos:cobrarclientessuspendidoss) {
					
				if(!(CobrarClientesSuspendidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CobrarClientesSuspendidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cobrarclientessuspendidos.setsDetalleGeneralEntityReporte(CobrarClientesSuspendidosConstantesFunciones.getCobrarClientesSuspendidosDescripcion(cobrarclientessuspendidos));
										
						
					
						
					
				} else  {
							
					//cobrarclientessuspendidos.setsDetalleGeneralEntityReporte(cobrarclientessuspendidos.getsDetalleGeneralEntityReporte());
										
				}
				
				//cobrarclientessuspendidosbeans.add(cobrarclientessuspendidosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cobrarclientessuspendidoss;
    }
	//PARA REPORTES FIN
}
