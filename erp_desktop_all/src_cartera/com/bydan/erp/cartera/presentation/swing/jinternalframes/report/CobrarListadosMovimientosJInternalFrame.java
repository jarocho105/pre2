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
import com.bydan.erp.cartera.util.report.CobrarListadosMovimientosConstantesFunciones;

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
public class CobrarListadosMovimientosJInternalFrame extends CobrarListadosMovimientosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCobrarListadosMovimientos;
	
	protected JMenuBar jmenuBarCobrarListadosMovimientos;
	
	protected JMenu jmenuCobrarListadosMovimientos;
	protected JMenu jmenuDatosCobrarListadosMovimientos;
	protected JMenu jmenuArchivoCobrarListadosMovimientos;
	protected JMenu jmenuAccionesCobrarListadosMovimientos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCobrarListadosMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarListadosMovimientos;	
	protected GridBagConstraints gridBagConstraintsCobrarListadosMovimientos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CobrarListadosMovimientosDetalleFormJInternalFrame jInternalFrameDetalleFormCobrarListadosMovimientos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCobrarListadosMovimientos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCobrarListadosMovimientos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public CobrarListadosMovimientosSessionBean cobrarlistadosmovimientosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CobrarListadosMovimientos> cobrarlistadosmovimientoss;		
	public List<CobrarListadosMovimientos> cobrarlistadosmovimientossEliminados;	
	public List<CobrarListadosMovimientos> cobrarlistadosmovimientossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCobrarListadosMovimientos;		
	protected JButton jButtonAbrirOrderByCobrarListadosMovimientos;
	
	
	//protected JPanel jPanelOrderByCobrarListadosMovimientos;
	//public JScrollPane jScrollPanelOrderByCobrarListadosMovimientos;	
	//protected JButton jButtonCerrarOrderByCobrarListadosMovimientos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CobrarListadosMovimientosLogic cobrarlistadosmovimientosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCobrarListadosMovimientos;
	public JScrollPane jScrollPanelDatosEdicionCobrarListadosMovimientos;
	public JScrollPane jScrollPanelDatosGeneralCobrarListadosMovimientos;
    
	
	
	//public JScrollPane jScrollPanelDatosCobrarListadosMovimientosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCobrarListadosMovimientos;
	//public JScrollPane jScrollPanelImportacionCobrarListadosMovimientos;
	
	
	
	protected JPanel jPanelAccionesCobrarListadosMovimientos;
	
    protected JPanel jPanelPaginacionCobrarListadosMovimientos;
    protected JPanel jPanelParametrosReportesCobrarListadosMovimientos;
	protected JPanel jPanelParametrosReportesAccionesCobrarListadosMovimientos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CobrarListadosMovimientos;
	protected JPanel jPanelParametrosAuxiliar2CobrarListadosMovimientos;
	protected JPanel jPanelParametrosAuxiliar3CobrarListadosMovimientos;
	protected JPanel jPanelParametrosAuxiliar4CobrarListadosMovimientos;
	//protected JPanel jPanelParametrosAuxiliar5CobrarListadosMovimientos;
	
	
	
	//protected JPanel jPanelReporteDinamicoCobrarListadosMovimientos;
	//protected JPanel jPanelImportacionCobrarListadosMovimientos;
	
	
	public JTable jTableDatosCobrarListadosMovimientos;
	
	
	
	//public JTable jTableDatosCobrarListadosMovimientosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCobrarListadosMovimientos;
	protected JButton jButtonDuplicarCobrarListadosMovimientos;
	protected JButton jButtonCopiarCobrarListadosMovimientos;
	protected JButton jButtonVerFormCobrarListadosMovimientos;
	protected JButton jButtonNuevoRelacionesCobrarListadosMovimientos;
	protected JButton jButtonModificarCobrarListadosMovimientos;
	
    protected JButton jButtonGuardarCambiosTablaCobrarListadosMovimientos;
	protected JButton jButtonCerrarCobrarListadosMovimientos;
	
	
	protected JButton jButtonRecargarInformacionCobrarListadosMovimientos;
	protected JButton jButtonProcesarInformacionCobrarListadosMovimientos;
	
	
	protected JButton jButtonAnterioresCobrarListadosMovimientos;
	protected JButton jButtonSiguientesCobrarListadosMovimientos;
	protected JButton jButtonNuevoGuardarCambiosCobrarListadosMovimientos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCobrarListadosMovimientos;
	//protected JButton jButtonCerrarReporteDinamicoCobrarListadosMovimientos;
	//protected JButton jButtonGenerarExcelReporteDinamicoCobrarListadosMovimientos;	
	
	
	
	//protected JButton jButtonAbrirImportacionCobrarListadosMovimientos;
	//protected JButton jButtonGenerarImportacionCobrarListadosMovimientos;
	//protected JButton jButtonCerrarImportacionCobrarListadosMovimientos;
	//protected JFileChooser jFileChooserImportacionCobrarListadosMovimientos;
	//protected File fileImportacionCobrarListadosMovimientos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarListadosMovimientos;
	protected JButton jButtonDuplicarToolBarCobrarListadosMovimientos;
	protected JButton jButtonNuevoRelacionesToolBarCobrarListadosMovimientos;
	
	
	public JButton jButtonGuardarCambiosToolBarCobrarListadosMovimientos;
	protected JButton jButtonCopiarToolBarCobrarListadosMovimientos;
	protected JButton jButtonVerFormToolBarCobrarListadosMovimientos;
	public JButton jButtonGuardarCambiosTablaToolBarCobrarListadosMovimientos;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarListadosMovimientos;
	protected JButton jButtonCerrarToolBarCobrarListadosMovimientos;
	
	protected JButton jButtonRecargarInformacionToolBarCobrarListadosMovimientos;
	protected JButton jButtonProcesarInformacionToolBarCobrarListadosMovimientos;
	protected JButton jButtonAnterioresToolBarCobrarListadosMovimientos;
	protected JButton jButtonSiguientesToolBarCobrarListadosMovimientos;
	protected JButton jButtonNuevoGuardarCambiosToolBarCobrarListadosMovimientos;
	protected JButton jButtonAbrirOrderByToolBarCobrarListadosMovimientos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarListadosMovimientos;
	protected JMenuItem jMenuItemDuplicarCobrarListadosMovimientos;
	protected JMenuItem jMenuItemNuevoRelacionesCobrarListadosMovimientos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCobrarListadosMovimientos;
	protected JMenuItem jMenuItemCopiarCobrarListadosMovimientos;
	protected JMenuItem jMenuItemVerFormCobrarListadosMovimientos;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarListadosMovimientos;
	protected JMenuItem jMenuItemCerrarCobrarListadosMovimientos;
	protected JMenuItem jMenuItemDetalleCerrarCobrarListadosMovimientos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCobrarListadosMovimientos;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarListadosMovimientos;
	
	protected JMenuItem jMenuItemRecargarInformacionCobrarListadosMovimientos;
	protected JMenuItem jMenuItemProcesarInformacionCobrarListadosMovimientos;
	protected JMenuItem jMenuItemAnterioresCobrarListadosMovimientos;
	protected JMenuItem jMenuItemSiguientesCobrarListadosMovimientos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarListadosMovimientos;
	protected JMenuItem jMenuItemAbrirOrderByCobrarListadosMovimientos;
	protected JMenuItem jMenuItemMostrarOcultarCobrarListadosMovimientos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarListadosMovimientos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCobrarListadosMovimientos;
	protected JCheckBox jCheckBoxSeleccionadosCobrarListadosMovimientos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCobrarListadosMovimientos;
	protected JCheckBox jCheckBoxConGraficoReporteCobrarListadosMovimientos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCobrarListadosMovimientos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCobrarListadosMovimientos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarListadosMovimientos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCobrarListadosMovimientos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCobrarListadosMovimientos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCobrarListadosMovimientos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarListadosMovimientos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarListadosMovimientos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCobrarListadosMovimientos;
	protected JTextField jTextFieldValorCampoGeneralCobrarListadosMovimientos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCobrarListadosMovimientos;
	//public JList<Reporte> jListColumnasSelectReporteCobrarListadosMovimientos;
	//public JScrollPane jScrollColumnasSelectReporteCobrarListadosMovimientos;
	
	//public JLabel jLabelRelacionesSelectReporteCobrarListadosMovimientos;
	//public JList<Reporte> jListRelacionesSelectReporteCobrarListadosMovimientos;
	//public JScrollPane jScrollRelacionesSelectReporteCobrarListadosMovimientos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCobrarListadosMovimientos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCobrarListadosMovimientos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCobrarListadosMovimientos;
	//public JLabel jLabelTiposArchivoReporteDinamicoCobrarListadosMovimientos;
	
		
	//public JLabel jLabelArchivoImportacionCobrarListadosMovimientos;	
	//public JLabel jLabelPathArchivoImportacionCobrarListadosMovimientos;
	//protected JTextField jTextFieldPathArchivoImportacionCobrarListadosMovimientos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCobrarListadosMovimientos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCobrarListadosMovimientos;
	
	//public JLabel jLabelColumnaCategoriaValorCobrarListadosMovimientos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCobrarListadosMovimientos;
	
	//public JLabel jLabelColumnasValoresGraficoCobrarListadosMovimientos;
	//public JList<Reporte> jListColumnasValoresGraficoCobrarListadosMovimientos;
	//public JScrollPane jScrollColumnasValoresGraficoCobrarListadosMovimientos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCobrarListadosMovimientos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCobrarListadosMovimientos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCobrarListadosMovimientos;
	public JPanel jPanelBusquedaCobrarListadosMovimientosCobrarListadosMovimientos;
	public JButton jButtonBusquedaCobrarListadosMovimientosCobrarListadosMovimientos;
	
	public JPanel jPanelfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos;
	public JLabel jLabelfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos;
	public JButton jButtonfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos;
	public JLabel jLabelfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos;
	public JButton jButtonfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=660;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CobrarListadosMovimientosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CobrarListadosMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarListadosMovimientosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarListadosMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarListadosMovimientosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarListadosMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarListadosMovimientosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarListadosMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCobrarListadosMovimientos)	{
		this.jButtonRecargarInformacionCobrarListadosMovimientos = jButtonRecargarInformacionCobrarListadosMovimientos;
	}
	
	public JButton getjButtonProcesarInformacionCobrarListadosMovimientos() {
		return this.jButtonProcesarInformacionCobrarListadosMovimientos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarListadosMovimientos)	{
		this.jButtonProcesarInformacionCobrarListadosMovimientos = jButtonProcesarInformacionCobrarListadosMovimientos;
	}
	
	
	public JButton getjButtonRecargarInformacionCobrarListadosMovimientos() {
		return this.jButtonRecargarInformacionCobrarListadosMovimientos;
	}
	
	
	public List<CobrarListadosMovimientos> getcobrarlistadosmovimientoss() {
		return this.cobrarlistadosmovimientoss;
	}

	public void setcobrarlistadosmovimientoss(List<CobrarListadosMovimientos> cobrarlistadosmovimientoss) {
		this.cobrarlistadosmovimientoss = cobrarlistadosmovimientoss;
	}
	
	public List<CobrarListadosMovimientos> getcobrarlistadosmovimientossAux() {
		return this.cobrarlistadosmovimientossAux;
	}

	public void setcobrarlistadosmovimientossAux(List<CobrarListadosMovimientos> cobrarlistadosmovimientossAux) {
		this.cobrarlistadosmovimientossAux = cobrarlistadosmovimientossAux;
	}
	
	public List<CobrarListadosMovimientos> getcobrarlistadosmovimientossEliminados() {
		return this.cobrarlistadosmovimientossEliminados;
	}

	public void setCobrarListadosMovimientossEliminados(List<CobrarListadosMovimientos> cobrarlistadosmovimientossEliminados) {
		this.cobrarlistadosmovimientossEliminados = cobrarlistadosmovimientossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCobrarListadosMovimientos() {
		return jComboBoxTiposSeleccionarCobrarListadosMovimientos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCobrarListadosMovimientos(
			JComboBox jComboBoxTiposSeleccionarCobrarListadosMovimientos) {
		this.jComboBoxTiposSeleccionarCobrarListadosMovimientos = jComboBoxTiposSeleccionarCobrarListadosMovimientos;
	}
	
	public void setBorderResaltarTiposSeleccionarCobrarListadosMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCobrarListadosMovimientos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCobrarListadosMovimientos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCobrarListadosMovimientos() {
		return jTextFieldValorCampoGeneralCobrarListadosMovimientos;
	}

	public void setjTextFieldValorCampoGeneralCobrarListadosMovimientos(
			JTextField jTextFieldValorCampoGeneralCobrarListadosMovimientos) {
		this.jTextFieldValorCampoGeneralCobrarListadosMovimientos = jTextFieldValorCampoGeneralCobrarListadosMovimientos;
	}

	public void setBorderResaltarValorCampoGeneralCobrarListadosMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadosMovimientos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCobrarListadosMovimientos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCobrarListadosMovimientos() {
		return this.jCheckBoxSeleccionarTodosCobrarListadosMovimientos;
	}

	public void setjCheckBoxSeleccionarTodosCobrarListadosMovimientos(
			JCheckBox jCheckBoxSeleccionarTodosCobrarListadosMovimientos) {
		this.jCheckBoxSeleccionarTodosCobrarListadosMovimientos = jCheckBoxSeleccionarTodosCobrarListadosMovimientos;
	}

	public void setBorderResaltarSeleccionarTodosCobrarListadosMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadosMovimientos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCobrarListadosMovimientos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCobrarListadosMovimientos() {
		return this.jCheckBoxSeleccionadosCobrarListadosMovimientos;
	}

	public void setjCheckBoxSeleccionadosCobrarListadosMovimientos(
			JCheckBox jCheckBoxSeleccionadosCobrarListadosMovimientos) {
		this.jCheckBoxSeleccionadosCobrarListadosMovimientos = jCheckBoxSeleccionadosCobrarListadosMovimientos;
	}
	
	public void setBorderResaltarSeleccionadosCobrarListadosMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadosMovimientos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCobrarListadosMovimientos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCobrarListadosMovimientos() {
		return this.jComboBoxTiposArchivosReportesCobrarListadosMovimientos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCobrarListadosMovimientos(
			JComboBox jComboBoxTiposArchivosReportesCobrarListadosMovimientos) {
		this.jComboBoxTiposArchivosReportesCobrarListadosMovimientos = jComboBoxTiposArchivosReportesCobrarListadosMovimientos;
	}

	public void setBorderResaltarTiposArchivosReportesCobrarListadosMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadosMovimientos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCobrarListadosMovimientos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCobrarListadosMovimientos() {
		return this.jComboBoxTiposReportesCobrarListadosMovimientos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCobrarListadosMovimientos(
			JComboBox jComboBoxTiposReportesCobrarListadosMovimientos) {
		this.jComboBoxTiposReportesCobrarListadosMovimientos = jComboBoxTiposReportesCobrarListadosMovimientos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCobrarListadosMovimientos() {
	//	return jComboBoxTiposReportesDinamicoCobrarListadosMovimientos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCobrarListadosMovimientos(
	//		JComboBox jComboBoxTiposReportesDinamicoCobrarListadosMovimientos) {
	//	this.jComboBoxTiposReportesDinamicoCobrarListadosMovimientos = jComboBoxTiposReportesDinamicoCobrarListadosMovimientos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCobrarListadosMovimientos() {
	//	return jComboBoxTiposArchivosReportesDinamicoCobrarListadosMovimientos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCobrarListadosMovimientos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarListadosMovimientos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCobrarListadosMovimientos = jComboBoxTiposArchivosReportesDinamicoCobrarListadosMovimientos;
	//}
	
	public void setBorderResaltarTiposReportesCobrarListadosMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadosMovimientos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCobrarListadosMovimientos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCobrarListadosMovimientos() {
		return this.jComboBoxTiposGraficosReportesCobrarListadosMovimientos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCobrarListadosMovimientos(
			JComboBox jComboBoxTiposGraficosReportesCobrarListadosMovimientos) {
		this.jComboBoxTiposGraficosReportesCobrarListadosMovimientos = jComboBoxTiposGraficosReportesCobrarListadosMovimientos;
	}
	
	public void setBorderResaltarTiposGraficosReportesCobrarListadosMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadosMovimientos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCobrarListadosMovimientos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCobrarListadosMovimientos() {
		return this.jComboBoxTiposPaginacionCobrarListadosMovimientos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCobrarListadosMovimientos(
			JComboBox jComboBoxTiposPaginacionCobrarListadosMovimientos) {
		this.jComboBoxTiposPaginacionCobrarListadosMovimientos = jComboBoxTiposPaginacionCobrarListadosMovimientos;
	}
	
	public void setBorderResaltarTiposPaginacionCobrarListadosMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadosMovimientos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCobrarListadosMovimientos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCobrarListadosMovimientos() {
		return this.jComboBoxTiposRelacionesCobrarListadosMovimientos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarListadosMovimientos() {
		return this.jComboBoxTiposAccionesCobrarListadosMovimientos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarListadosMovimientos(
			JComboBox jComboBoxTiposRelacionesCobrarListadosMovimientos) {
		this.jComboBoxTiposRelacionesCobrarListadosMovimientos = jComboBoxTiposRelacionesCobrarListadosMovimientos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarListadosMovimientos(
			JComboBox jComboBoxTiposAccionesCobrarListadosMovimientos) {
		this.jComboBoxTiposAccionesCobrarListadosMovimientos = jComboBoxTiposAccionesCobrarListadosMovimientos;
	}
	
	public void setBorderResaltarTiposRelacionesCobrarListadosMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadosMovimientos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCobrarListadosMovimientos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCobrarListadosMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadosMovimientos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCobrarListadosMovimientos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCobrarListadosMovimientos() {
	//	return jCheckBoxConGraficoDinamicoCobrarListadosMovimientos;
	//}

	//public void setjCheckBoxConGraficoDinamicoCobrarListadosMovimientos(
	//		JCheckBox jCheckBoxConGraficoDinamicoCobrarListadosMovimientos) {
	//	this.jCheckBoxConGraficoDinamicoCobrarListadosMovimientos = jCheckBoxConGraficoDinamicoCobrarListadosMovimientos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCobrarListadosMovimientos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCobrarListadosMovimientos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCobrarListadosMovimientos .setBorder(borderResaltar);		
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
		this.cobrarlistadosmovimientosSessionBean=new CobrarListadosMovimientosSessionBean();
		
		this.cobrarlistadosmovimientosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarlistadosmovimientosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CobrarListadosMovimientosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CobrarListadosMovimientosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarListadosMovimientosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarListadosMovimientosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarListadosMovimientosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Listados Movimientos MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
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
		
		CobrarListadosMovimientosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CobrarListadosMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCobrarListadosMovimientos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCobrarListadosMovimientos,this.jTtoolBarCobrarListadosMovimientos,
							"nuevo","nuevo","Nuevo"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCobrarListadosMovimientos,this.jTtoolBarCobrarListadosMovimientos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCobrarListadosMovimientos,this.jTtoolBarCobrarListadosMovimientos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCobrarListadosMovimientos,this.jTtoolBarCobrarListadosMovimientos,
							"duplicar","duplicar","Duplicar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCobrarListadosMovimientos,this.jTtoolBarCobrarListadosMovimientos,
							"copiar","copiar","Copiar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCobrarListadosMovimientos,this.jTtoolBarCobrarListadosMovimientos,
							"ver_form","ver_form","Ver"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarListadosMovimientos,this.jTtoolBarCobrarListadosMovimientos,
							"recargar","recargar","Buscar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarListadosMovimientos,this.jTtoolBarCobrarListadosMovimientos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarListadosMovimientos,this.jTtoolBarCobrarListadosMovimientos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCobrarListadosMovimientos,this.jTtoolBarCobrarListadosMovimientos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCobrarListadosMovimientos,this.jTtoolBarCobrarListadosMovimientos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCobrarListadosMovimientos,this.jTtoolBarCobrarListadosMovimientos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCobrarListadosMovimientos,this.jTtoolBarCobrarListadosMovimientos,
							"cerrar","cerrar","Salir"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCobrarListadosMovimientos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCobrarListadosMovimientos;
			
				this.jButtonProcesarInformacionToolBarCobrarListadosMovimientos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCobrarListadosMovimientos;
				
		//protected JButton jButtonModificarToolBarCobrarListadosMovimientos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCobrarListadosMovimientos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCobrarListadosMovimientos=new JMenuMe("General");
		this.jmenuArchivoCobrarListadosMovimientos=new JMenuMe("Archivo");
		this.jmenuAccionesCobrarListadosMovimientos=new JMenuMe("Acciones");
		this.jmenuDatosCobrarListadosMovimientos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarListadosMovimientos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarListadosMovimientos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarListadosMovimientos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCobrarListadosMovimientos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCobrarListadosMovimientos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCobrarListadosMovimientos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCobrarListadosMovimientos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCobrarListadosMovimientos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCobrarListadosMovimientos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCobrarListadosMovimientos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarListadosMovimientos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarListadosMovimientos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCobrarListadosMovimientos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCobrarListadosMovimientos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCobrarListadosMovimientos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCobrarListadosMovimientos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCobrarListadosMovimientos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCobrarListadosMovimientos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCobrarListadosMovimientos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCobrarListadosMovimientos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCobrarListadosMovimientos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarListadosMovimientos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarListadosMovimientos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarListadosMovimientos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCobrarListadosMovimientos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCobrarListadosMovimientos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCobrarListadosMovimientos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCobrarListadosMovimientos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCobrarListadosMovimientos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCobrarListadosMovimientos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCobrarListadosMovimientos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCobrarListadosMovimientos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCobrarListadosMovimientos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCobrarListadosMovimientos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCobrarListadosMovimientos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCobrarListadosMovimientos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCobrarListadosMovimientos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCobrarListadosMovimientos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCobrarListadosMovimientos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarListadosMovimientos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarListadosMovimientos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarListadosMovimientos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCobrarListadosMovimientos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCobrarListadosMovimientos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCobrarListadosMovimientos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarListadosMovimientos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarListadosMovimientos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarListadosMovimientos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCobrarListadosMovimientos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCobrarListadosMovimientos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCobrarListadosMovimientos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCobrarListadosMovimientos.add(this.jMenuItemCerrarCobrarListadosMovimientos);
			
			this.jmenuAccionesCobrarListadosMovimientos.add(this.jMenuItemNuevoCobrarListadosMovimientos);
			this.jmenuAccionesCobrarListadosMovimientos.add(this.jMenuItemNuevoGuardarCambiosCobrarListadosMovimientos);
			this.jmenuAccionesCobrarListadosMovimientos.add(this.jMenuItemNuevoRelacionesCobrarListadosMovimientos);
			this.jmenuAccionesCobrarListadosMovimientos.add(this.jMenuItemGuardarCambiosTablaCobrarListadosMovimientos);		
			this.jmenuAccionesCobrarListadosMovimientos.add(this.jMenuItemDuplicarCobrarListadosMovimientos);		
			this.jmenuAccionesCobrarListadosMovimientos.add(this.jMenuItemCopiarCobrarListadosMovimientos);		
			this.jmenuAccionesCobrarListadosMovimientos.add(this.jMenuItemVerFormCobrarListadosMovimientos);		
			
			this.jmenuDatosCobrarListadosMovimientos.add(this.jMenuItemRecargarInformacionCobrarListadosMovimientos);				
			this.jmenuDatosCobrarListadosMovimientos.add(this.jMenuItemAnterioresCobrarListadosMovimientos);				
			this.jmenuDatosCobrarListadosMovimientos.add(this.jMenuItemSiguientesCobrarListadosMovimientos);				
			this.jmenuDatosCobrarListadosMovimientos.add(this.jMenuItemAbrirOrderByCobrarListadosMovimientos);				
			this.jmenuDatosCobrarListadosMovimientos.add(this.jMenuItemMostrarOcultarCobrarListadosMovimientos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCobrarListadosMovimientos.add(this.jMenuItemGuardarCambiosCobrarListadosMovimientos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCobrarListadosMovimientos.add(this.jmenuArchivoCobrarListadosMovimientos);		
			this.jmenuBarCobrarListadosMovimientos.add(this.jmenuAccionesCobrarListadosMovimientos);		
			this.jmenuBarCobrarListadosMovimientos.add(this.jmenuDatosCobrarListadosMovimientos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCobrarListadosMovimientos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCobrarListadosMovimientos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCobrarListadosMovimientosCobrarListadosMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaCobrarListadosMovimientosCobrarListadosMovimientos= new JButtonMe();
		this.jButtonBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setText("Buscar");
		this.jButtonBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCobrarListadosMovimientosCobrarListadosMovimientos,"buscar_button","Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCobrarListadosMovimientosCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasCobrarListadosMovimientos=new JTabbedPane();


		this.jTabbedPaneBusquedasCobrarListadosMovimientos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCobrarListadosMovimientos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCobrarListadosMovimientos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCobrarListadosMovimientos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCobrarListadosMovimientos = new CobrarListadosMovimientosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cobrar Listados Movimientos DATOS");
			this.jInternalFrameDetalleFormCobrarListadosMovimientos = new CobrarListadosMovimientosDetalleFormJInternalFrame(jDesktopPane,this.cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones(),this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCobrarListadosMovimientos = null;//new CobrarListadosMovimientosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarListadosMovimientos= new GridBagLayout();
		
		
		this.jTableDatosCobrarListadosMovimientos = new JTableMe();      
		
		String sToolTipCobrarListadosMovimientos="";
		sToolTipCobrarListadosMovimientos=CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarListadosMovimientos+="(Cartera.CobrarListadosMovimientos)";
		}
		
		if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarListadosMovimientos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCobrarListadosMovimientos.setToolTipText(sToolTipCobrarListadosMovimientos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCobrarListadosMovimientos);
		this.jTableDatosCobrarListadosMovimientos.setAutoCreateRowSorter(true);
		this.jTableDatosCobrarListadosMovimientos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCobrarListadosMovimientos.setRowSelectionAllowed(true);
		this.jTableDatosCobrarListadosMovimientos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCobrarListadosMovimientos = new JButtonMe();
		this.jButtonDuplicarCobrarListadosMovimientos = new JButtonMe();
		this.jButtonCopiarCobrarListadosMovimientos = new JButtonMe();
		this.jButtonVerFormCobrarListadosMovimientos = new JButtonMe();
		this.jButtonNuevoRelacionesCobrarListadosMovimientos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCobrarListadosMovimientos = new JButtonMe();
		this.jButtonCerrarCobrarListadosMovimientos = new JButtonMe();
		
		this.jScrollPanelDatosCobrarListadosMovimientos = new JScrollPane();   
        this.jScrollPanelDatosGeneralCobrarListadosMovimientos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCobrarListadosMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Listados Movimientos";
		
		if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Listados Movimientoses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarListadosMovimientos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarListadosMovimientos.setToolTipText("Acciones");
        this.jPanelAccionesCobrarListadosMovimientos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCobrarListadosMovimientos=new ReporteDinamicoJInternalFrame(CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCobrarListadosMovimientos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCobrarListadosMovimientos=new ImportacionJInternalFrame(CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCobrarListadosMovimientos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCobrarListadosMovimientos = new JButtonMe();
		
		this.jButtonAbrirOrderByCobrarListadosMovimientos.setText("Orden");
		this.jButtonAbrirOrderByCobrarListadosMovimientos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarListadosMovimientos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCobrarListadosMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarListadosMovimientos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarListadosMovimientos,false,this);
			
			//this.cargarOrderByCobrarListadosMovimientos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarListadosMovimientos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarListadosMovimientos,true,this);
			
			//this.cargarOrderByCobrarListadosMovimientos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCobrarListadosMovimientos.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosCobrarListadosMovimientos.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosCobrarListadosMovimientos.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosCobrarListadosMovimientos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarListadosMovimientos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarListadosMovimientos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCobrarListadosMovimientos.setText("Nuevo");
		this.jButtonDuplicarCobrarListadosMovimientos.setText("Duplicar");
		this.jButtonCopiarCobrarListadosMovimientos.setText("Copiar");
		this.jButtonVerFormCobrarListadosMovimientos.setText("Ver");
		this.jButtonNuevoRelacionesCobrarListadosMovimientos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCobrarListadosMovimientos.setText("Guardar");
		this.jButtonCerrarCobrarListadosMovimientos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarListadosMovimientos,"nuevo_button","Nuevo",this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCobrarListadosMovimientos,"duplicar_button","Duplicar",this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCobrarListadosMovimientos,"copiar_button","Copiar",this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCobrarListadosMovimientos,"ver_form","Ver",this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCobrarListadosMovimientos,"nuevorelaciones_button","Nuevo Rel",this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarListadosMovimientos,"guardarcambiostabla_button","Guardar",this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarListadosMovimientos,"cerrar_button","Salir",this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCobrarListadosMovimientos.setToolTipText("Nuevo"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCobrarListadosMovimientos.setToolTipText("Duplicar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCobrarListadosMovimientos.setToolTipText("Copiar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCobrarListadosMovimientos.setToolTipText("Ver"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCobrarListadosMovimientos.setToolTipText("Nuevo Rel"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCobrarListadosMovimientos.setToolTipText("Guardar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarListadosMovimientos.setToolTipText("Salir"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarListadosMovimientos";
		inputMap = this.jButtonNuevoCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarListadosMovimientos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarListadosMovimientos"));
		
		//DUPLICAR
		sMapKey = "DuplicarCobrarListadosMovimientos";
		inputMap = this.jButtonDuplicarCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCobrarListadosMovimientos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCobrarListadosMovimientos"));
		
		//COPIAR
		sMapKey = "CopiarCobrarListadosMovimientos";
		inputMap = this.jButtonCopiarCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCobrarListadosMovimientos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCobrarListadosMovimientos"));
		
		//VEr FORM
		sMapKey = "VerFormCobrarListadosMovimientos";
		inputMap = this.jButtonVerFormCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCobrarListadosMovimientos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCobrarListadosMovimientos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCobrarListadosMovimientos";
		inputMap = this.jButtonNuevoRelacionesCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCobrarListadosMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCobrarListadosMovimientos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCobrarListadosMovimientos";
		inputMap = this.jButtonModificarCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCobrarListadosMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCobrarListadosMovimientos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCobrarListadosMovimientos";
		inputMap = this.jButtonCerrarCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarListadosMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarListadosMovimientos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarListadosMovimientos";
		inputMap = this.jButtonGuardarCambiosTablaCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarListadosMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarListadosMovimientos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCobrarListadosMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCobrarListadosMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCobrarListadosMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CobrarListadosMovimientos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CobrarListadosMovimientos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CobrarListadosMovimientos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CobrarListadosMovimientos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CobrarListadosMovimientos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCobrarListadosMovimientos.setName("jPanelParametrosReportesCobrarListadosMovimientos"); 
		
		this.jPanelParametrosReportesAccionesCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCobrarListadosMovimientos.setName("jPanelParametrosReportesAccionesCobrarListadosMovimientos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCobrarListadosMovimientos = new JButtonMe();
		this.jButtonRecargarInformacionCobrarListadosMovimientos.setText("Buscar");
		this.jButtonRecargarInformacionCobrarListadosMovimientos.setToolTipText("Buscar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCobrarListadosMovimientos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCobrarListadosMovimientos.setVisible(false);
		
		
		this.jButtonProcesarInformacionCobrarListadosMovimientos = new JButtonMe();
		this.jButtonProcesarInformacionCobrarListadosMovimientos.setText("Procesar");
		this.jButtonProcesarInformacionCobrarListadosMovimientos.setToolTipText("Procesar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCobrarListadosMovimientos.setVisible(false);
			
		this.jButtonProcesarInformacionCobrarListadosMovimientos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarListadosMovimientos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarListadosMovimientos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCobrarListadosMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarListadosMovimientos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCobrarListadosMovimientos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCobrarListadosMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarListadosMovimientos.setText("TIPO");       
		this.jComboBoxTiposReportesCobrarListadosMovimientos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCobrarListadosMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarListadosMovimientos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCobrarListadosMovimientos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCobrarListadosMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCobrarListadosMovimientos.setText("Paginacion");
		this.jComboBoxTiposPaginacionCobrarListadosMovimientos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCobrarListadosMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCobrarListadosMovimientos.setText("Accion");
		this.jComboBoxTiposRelacionesCobrarListadosMovimientos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCobrarListadosMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarListadosMovimientos.setText("Accion");
		this.jComboBoxTiposAccionesCobrarListadosMovimientos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCobrarListadosMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCobrarListadosMovimientos.setText("Accion");
		this.jComboBoxTiposSeleccionarCobrarListadosMovimientos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCobrarListadosMovimientos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCobrarListadosMovimientos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarListadosMovimientos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarListadosMovimientos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCobrarListadosMovimientos = new JLabelMe();
		
		this.jLabelAccionesCobrarListadosMovimientos.setText("Acciones");		
		this.jLabelAccionesCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCobrarListadosMovimientos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCobrarListadosMovimientos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCobrarListadosMovimientos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCobrarListadosMovimientos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCobrarListadosMovimientos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCobrarListadosMovimientos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCobrarListadosMovimientos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCobrarListadosMovimientos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCobrarListadosMovimientos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCobrarListadosMovimientos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCobrarListadosMovimientos.setText("Graf.");
		this.jCheckBoxConGraficoReporteCobrarListadosMovimientos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCobrarListadosMovimientos = new JButtonMe();
		//this.jButtonAnterioresCobrarListadosMovimientos.setText("<<");
        this.jButtonAnterioresCobrarListadosMovimientos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCobrarListadosMovimientos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCobrarListadosMovimientos = new JButtonMe();
		//this.jButtonSiguientesCobrarListadosMovimientos.setText(">>");
        this.jButtonSiguientesCobrarListadosMovimientos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCobrarListadosMovimientos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCobrarListadosMovimientos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCobrarListadosMovimientos.setText("Nue");
        this.jButtonNuevoGuardarCambiosCobrarListadosMovimientos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCobrarListadosMovimientos,"nuevoguardarcambios_button","Nue",this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCobrarListadosMovimientos";
		inputMap = this.jButtonNuevoGuardarCambiosCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCobrarListadosMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCobrarListadosMovimientos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCobrarListadosMovimientos";
		inputMap = this.jButtonRecargarInformacionCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCobrarListadosMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCobrarListadosMovimientos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCobrarListadosMovimientos";
		inputMap = this.jButtonSiguientesCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCobrarListadosMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCobrarListadosMovimientos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCobrarListadosMovimientos";
		inputMap = this.jButtonAnterioresCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCobrarListadosMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCobrarListadosMovimientos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCobrarListadosMovimientos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCobrarListadosMovimientos.setMinimumSize(new Dimension(this.getWidth(),CobrarListadosMovimientosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarListadosMovimientosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarListadosMovimientos.setMaximumSize(new Dimension(this.getWidth(),CobrarListadosMovimientosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarListadosMovimientosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarListadosMovimientos.setPreferredSize(new Dimension(this.getWidth(),CobrarListadosMovimientosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarListadosMovimientosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCobrarListadosMovimientos = new GridBagLayout();

			this.jPanelPaginacionCobrarListadosMovimientos.setLayout(gridaBagLayoutPaginacionCobrarListadosMovimientos);						
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCobrarListadosMovimientos.add(this.jButtonAnterioresCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
					
						
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
			
			this.jPanelPaginacionCobrarListadosMovimientos.add(this.jButtonNuevoGuardarCambiosCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
						
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
			this.jPanelPaginacionCobrarListadosMovimientos.add(this.jButtonSiguientesCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = 1;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarListadosMovimientos.add(this.jButtonNuevoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
						
			
			
			if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
				this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCobrarListadosMovimientos.gridy = 1;
				this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCobrarListadosMovimientos.add(this.jButtonGuardarCambiosTablaCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
			}
			
			
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = 1;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarListadosMovimientos.add(this.jButtonDuplicarCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = 1;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarListadosMovimientos.add(this.jButtonCopiarCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = 1;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarListadosMovimientos.add(this.jButtonVerFormCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = 1;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCobrarListadosMovimientos.add(this.jButtonCerrarCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
		
		
		this.jButtonRecargarInformacionCobrarListadosMovimientos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarListadosMovimientos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarListadosMovimientos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCobrarListadosMovimientos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarListadosMovimientos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarListadosMovimientos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCobrarListadosMovimientos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarListadosMovimientos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarListadosMovimientos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCobrarListadosMovimientos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarListadosMovimientos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarListadosMovimientos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCobrarListadosMovimientos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarListadosMovimientos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarListadosMovimientos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCobrarListadosMovimientos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarListadosMovimientos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarListadosMovimientos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCobrarListadosMovimientos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarListadosMovimientos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarListadosMovimientos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCobrarListadosMovimientos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarListadosMovimientos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarListadosMovimientos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCobrarListadosMovimientos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarListadosMovimientos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarListadosMovimientos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCobrarListadosMovimientos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarListadosMovimientos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarListadosMovimientos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCobrarListadosMovimientos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarListadosMovimientos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarListadosMovimientos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCobrarListadosMovimientos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarListadosMovimientos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarListadosMovimientos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCobrarListadosMovimientos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCobrarListadosMovimientos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CobrarListadosMovimientos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CobrarListadosMovimientos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CobrarListadosMovimientos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CobrarListadosMovimientos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCobrarListadosMovimientos.setLayout(gridaBagParametrosReportesCobrarListadosMovimientos);
			this.jPanelParametrosReportesAccionesCobrarListadosMovimientos.setLayout(gridaBagParametrosReportesAccionesCobrarListadosMovimientos);
			
			
			this.jPanelParametrosAuxiliar1CobrarListadosMovimientos.setLayout(gridaBagParametrosAuxiliar1CobrarListadosMovimientos);
			this.jPanelParametrosAuxiliar2CobrarListadosMovimientos.setLayout(gridaBagParametrosAuxiliar2CobrarListadosMovimientos);
			this.jPanelParametrosAuxiliar3CobrarListadosMovimientos.setLayout(gridaBagParametrosAuxiliar3CobrarListadosMovimientos);
			this.jPanelParametrosAuxiliar4CobrarListadosMovimientos.setLayout(gridaBagParametrosAuxiliar4CobrarListadosMovimientos);
			//this.jPanelParametrosAuxiliar5CobrarListadosMovimientos.setLayout(gridaBagParametrosAuxiliar2CobrarListadosMovimientos);			
			
			
			
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarListadosMovimientos.add(this.jButtonRecargarInformacionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarListadosMovimientos.add(this.jComboBoxTiposPaginacionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarListadosMovimientos.add(this.jCheckBoxConAltoMaximoTablaCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarListadosMovimientos.add(this.jComboBoxTiposArchivosReportesCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarListadosMovimientos.add(this.jPanelParametrosAuxiliar1CobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CobrarListadosMovimientos.add(this.jComboBoxTiposReportesCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);																		
			
			
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CobrarListadosMovimientos.add(this.jComboBoxTiposGraficosReportesCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarListadosMovimientos.add(this.jPanelParametrosAuxiliar4CobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarListadosMovimientos.add(this.jComboBoxTiposReportesCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarListadosMovimientos.add(this.jCheckBoxGenerarReporteCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarListadosMovimientos.add(this.jPanelParametrosAuxiliar2CobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarListadosMovimientos.add(this.jLabelAccionesCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
				this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCobrarListadosMovimientos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCobrarListadosMovimientos.add(this.jButtonAbrirOrderByCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarListadosMovimientos.add(this.jComboBoxTiposSeleccionarCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);			
			
			
			/*
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarListadosMovimientos.add(this.jCheckBoxSeleccionarTodosCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarListadosMovimientos.add(this.jCheckBoxConGraficoReporteCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarListadosMovimientos.add(this.jCheckBoxSeleccionarTodosCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);															
				
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarListadosMovimientos.add(this.jCheckBoxSeleccionadosCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);															
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarListadosMovimientos.add(this.jCheckBoxConGraficoReporteCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarListadosMovimientos.add(this.jPanelParametrosAuxiliar3CobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarListadosMovimientos.add(this.jComboBoxTiposAccionesCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCobrarListadosMovimientos = new GridBagLayout();

			this.jScrollPanelDatosCobrarListadosMovimientos.setLayout(gridaBagLayoutDatosCobrarListadosMovimientos);
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
			
			this.jScrollPanelDatosCobrarListadosMovimientos.add(this.jTableDatosCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCobrarListadosMovimientos.setViewportView(this.jTableDatosCobrarListadosMovimientos);
		this.jTableDatosCobrarListadosMovimientos.setFillsViewportHeight(true);
		this.jTableDatosCobrarListadosMovimientos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCobrarListadosMovimientos= new GridBagLayout();
		this.jPanelAccionesCobrarListadosMovimientos.setLayout(gridaBagLayoutAccionesCobrarListadosMovimientos);
		
		
		/*	
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
			
		this.jPanelAccionesCobrarListadosMovimientos.add(this.jButtonNuevoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCobrarListadosMovimientosCobrarListadosMovimientos= new GridBagLayout();
		gridaBagLayoutBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.setLayout(gridaBagLayoutBusquedaCobrarListadosMovimientosCobrarListadosMovimientos);

		gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
		jPanelBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.add(jLabelfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos, gridBagConstraintsCobrarListadosMovimientos);

		gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		gridBagConstraintsCobrarListadosMovimientos.gridx = 1;
		jPanelBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.add(jDateChooserfecha_emision_desdeBusquedaCobrarListadosMovimientosCobrarListadosMovimientos, gridBagConstraintsCobrarListadosMovimientos);


		gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarListadosMovimientos.gridy = 1;
		gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
		jPanelBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.add(jLabelfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos, gridBagConstraintsCobrarListadosMovimientos);

		gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarListadosMovimientos.gridy = 1;
		gridBagConstraintsCobrarListadosMovimientos.gridx = 1;
		jPanelBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.add(jDateChooserfecha_emision_hastaBusquedaCobrarListadosMovimientosCobrarListadosMovimientos, gridBagConstraintsCobrarListadosMovimientos);

		gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarListadosMovimientos.gridy = 2;
		gridBagConstraintsCobrarListadosMovimientos.gridx =1;
		jPanelBusquedaCobrarListadosMovimientosCobrarListadosMovimientos.add(jButtonBusquedaCobrarListadosMovimientosCobrarListadosMovimientos, gridBagConstraintsCobrarListadosMovimientos);

		jTabbedPaneBusquedasCobrarListadosMovimientos.addTab("1.-Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaCobrarListadosMovimientosCobrarListadosMovimientos);
		jTabbedPaneBusquedasCobrarListadosMovimientos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarListadosMovimientos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarListadosMovimientos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();						
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;		
			//this.gridBagConstraintsCobrarListadosMovimientos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;		
		//this.gridBagConstraintsCobrarListadosMovimientos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCobrarListadosMovimientos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;		
			this.gridBagConstraintsCobrarListadosMovimientos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);								
		
		
		/*
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		*/		
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx =0;
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarListadosMovimientos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
				
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CobrarListadosMovimientosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCobrarListadosMovimientos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarListadosMovimientos = new GridBagLayout();
			this.jPanelBusquedasParametrosCobrarListadosMovimientos.setLayout(gridaBagLayoutBusquedasParametrosCobrarListadosMovimientos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCobrarListadosMovimientos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarListadosMovimientos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarListadosMovimientos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarListadosMovimientos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
			
			
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
			
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCobrarListadosMovimientos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCobrarListadosMovimientos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCobrarListadosMovimientos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCobrarListadosMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCobrarListadosMovimientos.setName("jPanelReporteDinamicoCobrarListadosMovimientos"); 
		
		this.jPanelReporteDinamicoCobrarListadosMovimientos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarListadosMovimientos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarListadosMovimientos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCobrarListadosMovimientos.setLayout(gridaBagLayoutReporteDinamicoCobrarListadosMovimientos);
		
		
		this.jInternalFrameReporteDinamicoCobrarListadosMovimientos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCobrarListadosMovimientos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarListadosMovimientos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setResizable(true);
	    this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setClosable(true);
	    this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCobrarListadosMovimientos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarListadosMovimientos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarListadosMovimientos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Listados Movimientoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCobrarListadosMovimientos = new JLabelMe();

		this.jLabelColumnasSelectReporteCobrarListadosMovimientos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jLabelColumnasSelectReporteCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCobrarListadosMovimientos = new JList<Reporte>();
		this.jListColumnasSelectReporteCobrarListadosMovimientos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCobrarListadosMovimientos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCobrarListadosMovimientos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarListadosMovimientos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarListadosMovimientos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCobrarListadosMovimientos=new JScrollPane(this.jListColumnasSelectReporteCobrarListadosMovimientos);
			
			this.jScrollColumnasSelectReporteCobrarListadosMovimientos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarListadosMovimientos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarListadosMovimientos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jListColumnasSelectReporteCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jScrollColumnasSelectReporteCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCobrarListadosMovimientos = new JLabelMe();

		this.jLabelRelacionesSelectReporteCobrarListadosMovimientos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCobrarListadosMovimientos = new JList<Reporte>();
		this.jListRelacionesSelectReporteCobrarListadosMovimientos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCobrarListadosMovimientos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCobrarListadosMovimientos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarListadosMovimientos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarListadosMovimientos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCobrarListadosMovimientos=new JScrollPane(this.jListRelacionesSelectReporteCobrarListadosMovimientos);
			
			this.jScrollRelacionesSelectReporteCobrarListadosMovimientos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarListadosMovimientos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarListadosMovimientos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCobrarListadosMovimientos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCobrarListadosMovimientos = new JComboBoxMe();
		this.jListColumnasValoresGraficoCobrarListadosMovimientos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCobrarListadosMovimientos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCobrarListadosMovimientos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCobrarListadosMovimientos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarListadosMovimientos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarListadosMovimientos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCobrarListadosMovimientos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarListadosMovimientos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarListadosMovimientos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarListadosMovimientos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarListadosMovimientos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCobrarListadosMovimientos = new JLabelMe();

		this.jLabelConGraficoDinamicoCobrarListadosMovimientos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jLabelConGraficoDinamicoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCobrarListadosMovimientos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCobrarListadosMovimientos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCobrarListadosMovimientos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCobrarListadosMovimientos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarListadosMovimientos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarListadosMovimientos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jCheckBoxConGraficoDinamicoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCobrarListadosMovimientos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCobrarListadosMovimientos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jLabelColumnaCategoriaGraficoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCobrarListadosMovimientos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarListadosMovimientos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCobrarListadosMovimientos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCobrarListadosMovimientos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarListadosMovimientos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarListadosMovimientos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jComboBoxColumnaCategoriaGraficoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCobrarListadosMovimientos = new JLabelMe();

		this.jLabelColumnaCategoriaValorCobrarListadosMovimientos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jLabelColumnaCategoriaValorCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCobrarListadosMovimientos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCobrarListadosMovimientos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCobrarListadosMovimientos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCobrarListadosMovimientos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarListadosMovimientos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarListadosMovimientos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jComboBoxColumnaCategoriaValorCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCobrarListadosMovimientos = new JLabelMe();

		this.jLabelColumnasValoresGraficoCobrarListadosMovimientos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jLabelColumnasValoresGraficoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCobrarListadosMovimientos = new JList<Reporte>();
		this.jListColumnasValoresGraficoCobrarListadosMovimientos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCobrarListadosMovimientos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCobrarListadosMovimientos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarListadosMovimientos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarListadosMovimientos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCobrarListadosMovimientos=new JScrollPane(this.jListColumnasValoresGraficoCobrarListadosMovimientos);
			
			this.jScrollColumnasValoresGraficoCobrarListadosMovimientos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarListadosMovimientos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarListadosMovimientos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jListColumnasSelectReporteCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jScrollColumnasValoresGraficoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCobrarListadosMovimientos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCobrarListadosMovimientos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jLabelTiposGraficosReportesDinamicoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCobrarListadosMovimientos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarListadosMovimientos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCobrarListadosMovimientos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCobrarListadosMovimientos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarListadosMovimientos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarListadosMovimientos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jComboBoxTiposGraficosReportesDinamicoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCobrarListadosMovimientos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCobrarListadosMovimientos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jLabelGenerarExcelReporteDinamicoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCobrarListadosMovimientos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCobrarListadosMovimientos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCobrarListadosMovimientos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCobrarListadosMovimientos.setToolTipText("Generar EXCEL"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jButtonGenerarExcelReporteDinamicoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jComboBoxTiposReportesDinamicoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCobrarListadosMovimientos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCobrarListadosMovimientos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jLabelTiposArchivoReporteDinamicoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jComboBoxTiposArchivosReportesDinamicoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCobrarListadosMovimientos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCobrarListadosMovimientos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCobrarListadosMovimientos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCobrarListadosMovimientos.setToolTipText("Generar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jButtonGenerarReporteDinamicoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCobrarListadosMovimientos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCobrarListadosMovimientos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCobrarListadosMovimientos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCobrarListadosMovimientos.setToolTipText("Cancelar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarListadosMovimientos.add(this.jButtonCerrarReporteDinamicoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCobrarListadosMovimientos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCobrarListadosMovimientos= new JScrollPane(jPanelReporteDinamicoCobrarListadosMovimientos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCobrarListadosMovimientos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarListadosMovimientos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarListadosMovimientos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Listados Movimientoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCobrarListadosMovimientos);
		this.jInternalFrameReporteDinamicoCobrarListadosMovimientos.getContentPane().add(this.jScrollPanelReporteDinamicoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCobrarListadosMovimientos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCobrarListadosMovimientos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCobrarListadosMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCobrarListadosMovimientos.setName("jPanelImportacionCobrarListadosMovimientos"); 
		
		this.jPanelImportacionCobrarListadosMovimientos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarListadosMovimientos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarListadosMovimientos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCobrarListadosMovimientos.setLayout(gridaBagLayoutImportacionCobrarListadosMovimientos);
		
		
		this.jInternalFrameImportacionCobrarListadosMovimientos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCobrarListadosMovimientos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCobrarListadosMovimientos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarListadosMovimientos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCobrarListadosMovimientos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarListadosMovimientos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarListadosMovimientos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCobrarListadosMovimientos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarListadosMovimientos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarListadosMovimientos.setResizable(true);
	    this.jInternalFrameImportacionCobrarListadosMovimientos.setClosable(true);
	    this.jInternalFrameImportacionCobrarListadosMovimientos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCobrarListadosMovimientos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarListadosMovimientos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarListadosMovimientos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCobrarListadosMovimientos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarListadosMovimientos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarListadosMovimientos.setResizable(true);
	    this.jInternalFrameImportacionCobrarListadosMovimientos.setClosable(true);
	    this.jInternalFrameImportacionCobrarListadosMovimientos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCobrarListadosMovimientos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarListadosMovimientos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarListadosMovimientos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Listados Movimientoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCobrarListadosMovimientos = new JLabelMe();

		this.jLabelArchivoImportacionCobrarListadosMovimientos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarListadosMovimientos.add(this.jLabelArchivoImportacionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCobrarListadosMovimientos = new JFileChooser();		
		this.jFileChooserImportacionCobrarListadosMovimientos.setToolTipText("ESCOGER ARCHIVO"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCobrarListadosMovimientos = new JButtonMe();
		this.jButtonAbrirImportacionCobrarListadosMovimientos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCobrarListadosMovimientos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCobrarListadosMovimientos.setToolTipText("Generar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarListadosMovimientos.add(this.jButtonAbrirImportacionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCobrarListadosMovimientos = new JLabelMe();

		this.jLabelPathArchivoImportacionCobrarListadosMovimientos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarListadosMovimientos.add(this.jLabelPathArchivoImportacionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCobrarListadosMovimientos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCobrarListadosMovimientos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarListadosMovimientos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarListadosMovimientos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarListadosMovimientos.add(this.jTextFieldPathArchivoImportacionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCobrarListadosMovimientos = new JButtonMe();
		this.jButtonGenerarImportacionCobrarListadosMovimientos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCobrarListadosMovimientos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCobrarListadosMovimientos.setToolTipText("Generar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarListadosMovimientos.add(this.jButtonGenerarImportacionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCobrarListadosMovimientos = new JButtonMe();
		this.jButtonCerrarImportacionCobrarListadosMovimientos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCobrarListadosMovimientos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCobrarListadosMovimientos.setToolTipText("Cancelar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarListadosMovimientos.add(this.jButtonCerrarImportacionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCobrarListadosMovimientos = new GridBagLayout();
		
		this.jScrollPanelImportacionCobrarListadosMovimientos= new JScrollPane(jPanelImportacionCobrarListadosMovimientos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy =iPosYImportacion;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx =iPosXImportacion;
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCobrarListadosMovimientos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCobrarListadosMovimientos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCobrarListadosMovimientos);
		this.jInternalFrameImportacionCobrarListadosMovimientos.getContentPane().add(this.jScrollPanelImportacionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCobrarListadosMovimientos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCobrarListadosMovimientos = new JButtonMe();
			this.jButtonAbrirOrderByCobrarListadosMovimientos.setText("Orden");
			this.jButtonAbrirOrderByCobrarListadosMovimientos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarListadosMovimientos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCobrarListadosMovimientos";
			inputMap = this.jButtonAbrirOrderByCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCobrarListadosMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCobrarListadosMovimientos"));
		
		
			GridBagLayout gridaBagLayoutOrderByCobrarListadosMovimientos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCobrarListadosMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCobrarListadosMovimientos.setName("jPanelOrderByCobrarListadosMovimientos"); 
			
			this.jPanelOrderByCobrarListadosMovimientos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarListadosMovimientos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarListadosMovimientos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCobrarListadosMovimientos.setLayout(gridaBagLayoutOrderByCobrarListadosMovimientos);
			
			
			this.jTableDatosCobrarListadosMovimientosOrderBy = new JTableMe();        
			this.jTableDatosCobrarListadosMovimientosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCobrarListadosMovimientosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCobrarListadosMovimientosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCobrarListadosMovimientosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCobrarListadosMovimientosOrderBy.setViewportView(this.jTableDatosCobrarListadosMovimientosOrderBy);
			this.jTableDatosCobrarListadosMovimientosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCobrarListadosMovimientosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCobrarListadosMovimientos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCobrarListadosMovimientos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCobrarListadosMovimientos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCobrarListadosMovimientos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCobrarListadosMovimientos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCobrarListadosMovimientos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCobrarListadosMovimientos.setTitle("Orden");
			this.jInternalFrameOrderByCobrarListadosMovimientos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCobrarListadosMovimientos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCobrarListadosMovimientos.setResizable(true);
			this.jInternalFrameOrderByCobrarListadosMovimientos.setClosable(true);
			this.jInternalFrameOrderByCobrarListadosMovimientos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCobrarListadosMovimientos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarListadosMovimientos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarListadosMovimientos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Listados Movimientoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCobrarListadosMovimientos.ipady =150;
				
			this.jPanelOrderByCobrarListadosMovimientos.add(jScrollPanelDatosCobrarListadosMovimientosOrderBy, this.gridBagConstraintsCobrarListadosMovimientos);//this.jTableDatosCobrarListadosMovimientosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCobrarListadosMovimientos = new JButtonMe();
			this.jButtonCerrarOrderByCobrarListadosMovimientos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCobrarListadosMovimientos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCobrarListadosMovimientos.setToolTipText("Cancelar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCobrarListadosMovimientos.add(this.jButtonCerrarOrderByCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCobrarListadosMovimientos = new GridBagLayout();
			
			this.jScrollPanelOrderByCobrarListadosMovimientos= new JScrollPane(jPanelOrderByCobrarListadosMovimientos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.gridy =iPosYOrderBy;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCobrarListadosMovimientos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCobrarListadosMovimientos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCobrarListadosMovimientos);
			
			this.jInternalFrameOrderByCobrarListadosMovimientos.getContentPane().add(this.jScrollPanelOrderByCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);			
		
		} else {
			this.jButtonAbrirOrderByCobrarListadosMovimientos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCobrarListadosMovimientos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCobrarListadosMovimientos.getRowHeight();//CobrarListadosMovimientosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CobrarListadosMovimientosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarListadosMovimientos.isSelected()) {
					iHeightTable=CobrarListadosMovimientosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarListadosMovimientosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarListadosMovimientosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CobrarListadosMovimientosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarListadosMovimientos.isSelected()) {
					iHeightTable=CobrarListadosMovimientosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarListadosMovimientosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarListadosMovimientosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCobrarListadosMovimientos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarListadosMovimientos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarListadosMovimientos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCobrarListadosMovimientos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarListadosMovimientos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarListadosMovimientos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCobrarListadosMovimientos!=null && this.jInternalFrameOrderByCobrarListadosMovimientos.getjTableDatosOrderBy()!=null) {
			//if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCobrarListadosMovimientos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCobrarListadosMovimientos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCobrarListadosMovimientos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCobrarListadosMovimientos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCobrarListadosMovimientos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCobrarListadosMovimientos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCobrarListadosMovimientos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCobrarListadosMovimientos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarListadosMovimientos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarListadosMovimientos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cobrarlistadosmovimientosLogic.getCobrarListadosMovimientoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarlistadosmovimientoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CobrarListadosMovimientos> TraerCobrarListadosMovimientosBeans(List<CobrarListadosMovimientos> cobrarlistadosmovimientoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(CobrarListadosMovimientos cobrarlistadosmovimientos:cobrarlistadosmovimientoss) {
					
				if(!(CobrarListadosMovimientosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CobrarListadosMovimientosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
					|| CobrarListadosMovimientosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_REPORTE)
				   ) {
					
					cobrarlistadosmovimientos.setsDetalleGeneralEntityReporte(CobrarListadosMovimientosConstantesFunciones.getCobrarListadosMovimientosDescripcion(cobrarlistadosmovimientos));
										
						
					
						
					
				} else  {
							
					//cobrarlistadosmovimientos.setsDetalleGeneralEntityReporte(cobrarlistadosmovimientos.getsDetalleGeneralEntityReporte());
										
				}
				
				//cobrarlistadosmovimientosbeans.add(cobrarlistadosmovimientosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cobrarlistadosmovimientoss;
    }
	//PARA REPORTES FIN
}
