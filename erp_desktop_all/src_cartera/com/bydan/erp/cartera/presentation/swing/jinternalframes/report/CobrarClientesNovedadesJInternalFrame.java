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
import com.bydan.erp.cartera.util.report.CobrarClientesNovedadesConstantesFunciones;

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
public class CobrarClientesNovedadesJInternalFrame extends CobrarClientesNovedadesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCobrarClientesNovedades;
	
	protected JMenuBar jmenuBarCobrarClientesNovedades;
	
	protected JMenu jmenuCobrarClientesNovedades;
	protected JMenu jmenuDatosCobrarClientesNovedades;
	protected JMenu jmenuArchivoCobrarClientesNovedades;
	protected JMenu jmenuAccionesCobrarClientesNovedades;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCobrarClientesNovedades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarClientesNovedades;	
	protected GridBagConstraints gridBagConstraintsCobrarClientesNovedades;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CobrarClientesNovedadesDetalleFormJInternalFrame jInternalFrameDetalleFormCobrarClientesNovedades;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCobrarClientesNovedades;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCobrarClientesNovedades;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public CobrarClientesNovedadesSessionBean cobrarclientesnovedadesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CobrarClientesNovedades> cobrarclientesnovedadess;		
	public List<CobrarClientesNovedades> cobrarclientesnovedadessEliminados;	
	public List<CobrarClientesNovedades> cobrarclientesnovedadessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCobrarClientesNovedades;		
	protected JButton jButtonAbrirOrderByCobrarClientesNovedades;
	
	
	//protected JPanel jPanelOrderByCobrarClientesNovedades;
	//public JScrollPane jScrollPanelOrderByCobrarClientesNovedades;	
	//protected JButton jButtonCerrarOrderByCobrarClientesNovedades;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CobrarClientesNovedadesLogic cobrarclientesnovedadesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCobrarClientesNovedades;
	public JScrollPane jScrollPanelDatosEdicionCobrarClientesNovedades;
	public JScrollPane jScrollPanelDatosGeneralCobrarClientesNovedades;
    
	
	
	//public JScrollPane jScrollPanelDatosCobrarClientesNovedadesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCobrarClientesNovedades;
	//public JScrollPane jScrollPanelImportacionCobrarClientesNovedades;
	
	
	
	protected JPanel jPanelAccionesCobrarClientesNovedades;
	
    protected JPanel jPanelPaginacionCobrarClientesNovedades;
    protected JPanel jPanelParametrosReportesCobrarClientesNovedades;
	protected JPanel jPanelParametrosReportesAccionesCobrarClientesNovedades;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CobrarClientesNovedades;
	protected JPanel jPanelParametrosAuxiliar2CobrarClientesNovedades;
	protected JPanel jPanelParametrosAuxiliar3CobrarClientesNovedades;
	protected JPanel jPanelParametrosAuxiliar4CobrarClientesNovedades;
	//protected JPanel jPanelParametrosAuxiliar5CobrarClientesNovedades;
	
	
	
	//protected JPanel jPanelReporteDinamicoCobrarClientesNovedades;
	//protected JPanel jPanelImportacionCobrarClientesNovedades;
	
	
	public JTable jTableDatosCobrarClientesNovedades;
	
	
	
	//public JTable jTableDatosCobrarClientesNovedadesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCobrarClientesNovedades;
	protected JButton jButtonDuplicarCobrarClientesNovedades;
	protected JButton jButtonCopiarCobrarClientesNovedades;
	protected JButton jButtonVerFormCobrarClientesNovedades;
	protected JButton jButtonNuevoRelacionesCobrarClientesNovedades;
	protected JButton jButtonModificarCobrarClientesNovedades;
	
    protected JButton jButtonGuardarCambiosTablaCobrarClientesNovedades;
	protected JButton jButtonCerrarCobrarClientesNovedades;
	
	
	protected JButton jButtonRecargarInformacionCobrarClientesNovedades;
	protected JButton jButtonProcesarInformacionCobrarClientesNovedades;
	
	
	protected JButton jButtonAnterioresCobrarClientesNovedades;
	protected JButton jButtonSiguientesCobrarClientesNovedades;
	protected JButton jButtonNuevoGuardarCambiosCobrarClientesNovedades;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCobrarClientesNovedades;
	//protected JButton jButtonCerrarReporteDinamicoCobrarClientesNovedades;
	//protected JButton jButtonGenerarExcelReporteDinamicoCobrarClientesNovedades;	
	
	
	
	//protected JButton jButtonAbrirImportacionCobrarClientesNovedades;
	//protected JButton jButtonGenerarImportacionCobrarClientesNovedades;
	//protected JButton jButtonCerrarImportacionCobrarClientesNovedades;
	//protected JFileChooser jFileChooserImportacionCobrarClientesNovedades;
	//protected File fileImportacionCobrarClientesNovedades;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarClientesNovedades;
	protected JButton jButtonDuplicarToolBarCobrarClientesNovedades;
	protected JButton jButtonNuevoRelacionesToolBarCobrarClientesNovedades;
	
	
	public JButton jButtonGuardarCambiosToolBarCobrarClientesNovedades;
	protected JButton jButtonCopiarToolBarCobrarClientesNovedades;
	protected JButton jButtonVerFormToolBarCobrarClientesNovedades;
	public JButton jButtonGuardarCambiosTablaToolBarCobrarClientesNovedades;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarClientesNovedades;
	protected JButton jButtonCerrarToolBarCobrarClientesNovedades;
	
	protected JButton jButtonRecargarInformacionToolBarCobrarClientesNovedades;
	protected JButton jButtonProcesarInformacionToolBarCobrarClientesNovedades;
	protected JButton jButtonAnterioresToolBarCobrarClientesNovedades;
	protected JButton jButtonSiguientesToolBarCobrarClientesNovedades;
	protected JButton jButtonNuevoGuardarCambiosToolBarCobrarClientesNovedades;
	protected JButton jButtonAbrirOrderByToolBarCobrarClientesNovedades;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarClientesNovedades;
	protected JMenuItem jMenuItemDuplicarCobrarClientesNovedades;
	protected JMenuItem jMenuItemNuevoRelacionesCobrarClientesNovedades;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCobrarClientesNovedades;
	protected JMenuItem jMenuItemCopiarCobrarClientesNovedades;
	protected JMenuItem jMenuItemVerFormCobrarClientesNovedades;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarClientesNovedades;
	protected JMenuItem jMenuItemCerrarCobrarClientesNovedades;
	protected JMenuItem jMenuItemDetalleCerrarCobrarClientesNovedades;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCobrarClientesNovedades;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarClientesNovedades;
	
	protected JMenuItem jMenuItemRecargarInformacionCobrarClientesNovedades;
	protected JMenuItem jMenuItemProcesarInformacionCobrarClientesNovedades;
	protected JMenuItem jMenuItemAnterioresCobrarClientesNovedades;
	protected JMenuItem jMenuItemSiguientesCobrarClientesNovedades;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarClientesNovedades;
	protected JMenuItem jMenuItemAbrirOrderByCobrarClientesNovedades;
	protected JMenuItem jMenuItemMostrarOcultarCobrarClientesNovedades;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarClientesNovedades;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCobrarClientesNovedades;
	protected JCheckBox jCheckBoxSeleccionadosCobrarClientesNovedades;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCobrarClientesNovedades;
	protected JCheckBox jCheckBoxConGraficoReporteCobrarClientesNovedades;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCobrarClientesNovedades;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCobrarClientesNovedades;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarClientesNovedades;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCobrarClientesNovedades;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCobrarClientesNovedades;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCobrarClientesNovedades;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarClientesNovedades;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarClientesNovedades;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCobrarClientesNovedades;
	protected JTextField jTextFieldValorCampoGeneralCobrarClientesNovedades;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCobrarClientesNovedades;
	//public JList<Reporte> jListColumnasSelectReporteCobrarClientesNovedades;
	//public JScrollPane jScrollColumnasSelectReporteCobrarClientesNovedades;
	
	//public JLabel jLabelRelacionesSelectReporteCobrarClientesNovedades;
	//public JList<Reporte> jListRelacionesSelectReporteCobrarClientesNovedades;
	//public JScrollPane jScrollRelacionesSelectReporteCobrarClientesNovedades;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCobrarClientesNovedades;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCobrarClientesNovedades;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCobrarClientesNovedades;
	//public JLabel jLabelTiposArchivoReporteDinamicoCobrarClientesNovedades;
	
		
	//public JLabel jLabelArchivoImportacionCobrarClientesNovedades;	
	//public JLabel jLabelPathArchivoImportacionCobrarClientesNovedades;
	//protected JTextField jTextFieldPathArchivoImportacionCobrarClientesNovedades;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCobrarClientesNovedades;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCobrarClientesNovedades;
	
	//public JLabel jLabelColumnaCategoriaValorCobrarClientesNovedades;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCobrarClientesNovedades;
	
	//public JLabel jLabelColumnasValoresGraficoCobrarClientesNovedades;
	//public JList<Reporte> jListColumnasValoresGraficoCobrarClientesNovedades;
	//public JScrollPane jScrollColumnasValoresGraficoCobrarClientesNovedades;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCobrarClientesNovedades;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCobrarClientesNovedades;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCobrarClientesNovedades;
	public JPanel jPanelBusquedaCobrarClientesNovedadesCobrarClientesNovedades;
	public JButton jButtonBusquedaCobrarClientesNovedadesCobrarClientesNovedades;
	
	public JPanel jPanelfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades;
	public JLabel jLabelfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades;
	//public JFormattedTextField jDateChooserfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades;

	public JDateChooser jDateChooserfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades;
	public JButton jButtonfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedadesBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=990;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CobrarClientesNovedadesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CobrarClientesNovedades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesNovedadesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesNovedades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesNovedadesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesNovedades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesNovedadesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarClientesNovedades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCobrarClientesNovedades)	{
		this.jButtonRecargarInformacionCobrarClientesNovedades = jButtonRecargarInformacionCobrarClientesNovedades;
	}
	
	public JButton getjButtonProcesarInformacionCobrarClientesNovedades() {
		return this.jButtonProcesarInformacionCobrarClientesNovedades;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarClientesNovedades)	{
		this.jButtonProcesarInformacionCobrarClientesNovedades = jButtonProcesarInformacionCobrarClientesNovedades;
	}
	
	
	public JButton getjButtonRecargarInformacionCobrarClientesNovedades() {
		return this.jButtonRecargarInformacionCobrarClientesNovedades;
	}
	
	
	public List<CobrarClientesNovedades> getcobrarclientesnovedadess() {
		return this.cobrarclientesnovedadess;
	}

	public void setcobrarclientesnovedadess(List<CobrarClientesNovedades> cobrarclientesnovedadess) {
		this.cobrarclientesnovedadess = cobrarclientesnovedadess;
	}
	
	public List<CobrarClientesNovedades> getcobrarclientesnovedadessAux() {
		return this.cobrarclientesnovedadessAux;
	}

	public void setcobrarclientesnovedadessAux(List<CobrarClientesNovedades> cobrarclientesnovedadessAux) {
		this.cobrarclientesnovedadessAux = cobrarclientesnovedadessAux;
	}
	
	public List<CobrarClientesNovedades> getcobrarclientesnovedadessEliminados() {
		return this.cobrarclientesnovedadessEliminados;
	}

	public void setCobrarClientesNovedadessEliminados(List<CobrarClientesNovedades> cobrarclientesnovedadessEliminados) {
		this.cobrarclientesnovedadessEliminados = cobrarclientesnovedadessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCobrarClientesNovedades() {
		return jComboBoxTiposSeleccionarCobrarClientesNovedades;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCobrarClientesNovedades(
			JComboBox jComboBoxTiposSeleccionarCobrarClientesNovedades) {
		this.jComboBoxTiposSeleccionarCobrarClientesNovedades = jComboBoxTiposSeleccionarCobrarClientesNovedades;
	}
	
	public void setBorderResaltarTiposSeleccionarCobrarClientesNovedades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCobrarClientesNovedades.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCobrarClientesNovedades .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCobrarClientesNovedades() {
		return jTextFieldValorCampoGeneralCobrarClientesNovedades;
	}

	public void setjTextFieldValorCampoGeneralCobrarClientesNovedades(
			JTextField jTextFieldValorCampoGeneralCobrarClientesNovedades) {
		this.jTextFieldValorCampoGeneralCobrarClientesNovedades = jTextFieldValorCampoGeneralCobrarClientesNovedades;
	}

	public void setBorderResaltarValorCampoGeneralCobrarClientesNovedades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesNovedades.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCobrarClientesNovedades .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCobrarClientesNovedades() {
		return this.jCheckBoxSeleccionarTodosCobrarClientesNovedades;
	}

	public void setjCheckBoxSeleccionarTodosCobrarClientesNovedades(
			JCheckBox jCheckBoxSeleccionarTodosCobrarClientesNovedades) {
		this.jCheckBoxSeleccionarTodosCobrarClientesNovedades = jCheckBoxSeleccionarTodosCobrarClientesNovedades;
	}

	public void setBorderResaltarSeleccionarTodosCobrarClientesNovedades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesNovedades.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCobrarClientesNovedades .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCobrarClientesNovedades() {
		return this.jCheckBoxSeleccionadosCobrarClientesNovedades;
	}

	public void setjCheckBoxSeleccionadosCobrarClientesNovedades(
			JCheckBox jCheckBoxSeleccionadosCobrarClientesNovedades) {
		this.jCheckBoxSeleccionadosCobrarClientesNovedades = jCheckBoxSeleccionadosCobrarClientesNovedades;
	}
	
	public void setBorderResaltarSeleccionadosCobrarClientesNovedades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesNovedades.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCobrarClientesNovedades .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCobrarClientesNovedades() {
		return this.jComboBoxTiposArchivosReportesCobrarClientesNovedades;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCobrarClientesNovedades(
			JComboBox jComboBoxTiposArchivosReportesCobrarClientesNovedades) {
		this.jComboBoxTiposArchivosReportesCobrarClientesNovedades = jComboBoxTiposArchivosReportesCobrarClientesNovedades;
	}

	public void setBorderResaltarTiposArchivosReportesCobrarClientesNovedades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesNovedades.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCobrarClientesNovedades .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCobrarClientesNovedades() {
		return this.jComboBoxTiposReportesCobrarClientesNovedades;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCobrarClientesNovedades(
			JComboBox jComboBoxTiposReportesCobrarClientesNovedades) {
		this.jComboBoxTiposReportesCobrarClientesNovedades = jComboBoxTiposReportesCobrarClientesNovedades;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCobrarClientesNovedades() {
	//	return jComboBoxTiposReportesDinamicoCobrarClientesNovedades;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCobrarClientesNovedades(
	//		JComboBox jComboBoxTiposReportesDinamicoCobrarClientesNovedades) {
	//	this.jComboBoxTiposReportesDinamicoCobrarClientesNovedades = jComboBoxTiposReportesDinamicoCobrarClientesNovedades;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCobrarClientesNovedades() {
	//	return jComboBoxTiposArchivosReportesDinamicoCobrarClientesNovedades;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCobrarClientesNovedades(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarClientesNovedades) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesNovedades = jComboBoxTiposArchivosReportesDinamicoCobrarClientesNovedades;
	//}
	
	public void setBorderResaltarTiposReportesCobrarClientesNovedades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesNovedades.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCobrarClientesNovedades .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCobrarClientesNovedades() {
		return this.jComboBoxTiposGraficosReportesCobrarClientesNovedades;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCobrarClientesNovedades(
			JComboBox jComboBoxTiposGraficosReportesCobrarClientesNovedades) {
		this.jComboBoxTiposGraficosReportesCobrarClientesNovedades = jComboBoxTiposGraficosReportesCobrarClientesNovedades;
	}
	
	public void setBorderResaltarTiposGraficosReportesCobrarClientesNovedades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesNovedades.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCobrarClientesNovedades .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCobrarClientesNovedades() {
		return this.jComboBoxTiposPaginacionCobrarClientesNovedades;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCobrarClientesNovedades(
			JComboBox jComboBoxTiposPaginacionCobrarClientesNovedades) {
		this.jComboBoxTiposPaginacionCobrarClientesNovedades = jComboBoxTiposPaginacionCobrarClientesNovedades;
	}
	
	public void setBorderResaltarTiposPaginacionCobrarClientesNovedades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesNovedades.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCobrarClientesNovedades .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCobrarClientesNovedades() {
		return this.jComboBoxTiposRelacionesCobrarClientesNovedades;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarClientesNovedades() {
		return this.jComboBoxTiposAccionesCobrarClientesNovedades;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarClientesNovedades(
			JComboBox jComboBoxTiposRelacionesCobrarClientesNovedades) {
		this.jComboBoxTiposRelacionesCobrarClientesNovedades = jComboBoxTiposRelacionesCobrarClientesNovedades;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarClientesNovedades(
			JComboBox jComboBoxTiposAccionesCobrarClientesNovedades) {
		this.jComboBoxTiposAccionesCobrarClientesNovedades = jComboBoxTiposAccionesCobrarClientesNovedades;
	}
	
	public void setBorderResaltarTiposRelacionesCobrarClientesNovedades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesNovedades.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCobrarClientesNovedades .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCobrarClientesNovedades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesNovedades.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCobrarClientesNovedades .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCobrarClientesNovedades() {
	//	return jCheckBoxConGraficoDinamicoCobrarClientesNovedades;
	//}

	//public void setjCheckBoxConGraficoDinamicoCobrarClientesNovedades(
	//		JCheckBox jCheckBoxConGraficoDinamicoCobrarClientesNovedades) {
	//	this.jCheckBoxConGraficoDinamicoCobrarClientesNovedades = jCheckBoxConGraficoDinamicoCobrarClientesNovedades;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCobrarClientesNovedades() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCobrarClientesNovedades.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCobrarClientesNovedades .setBorder(borderResaltar);		
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
		this.cobrarclientesnovedadesSessionBean=new CobrarClientesNovedadesSessionBean();
		
		this.cobrarclientesnovedadesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclientesnovedadesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CobrarClientesNovedadesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CobrarClientesNovedadesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarClientesNovedadesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarClientesNovedadesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarClientesNovedadesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Clientes Novedades MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
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
		
		CobrarClientesNovedadesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CobrarClientesNovedades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCobrarClientesNovedades= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCobrarClientesNovedades,this.jTtoolBarCobrarClientesNovedades,
							"nuevo","nuevo","Nuevo"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCobrarClientesNovedades,this.jTtoolBarCobrarClientesNovedades,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCobrarClientesNovedades,this.jTtoolBarCobrarClientesNovedades,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCobrarClientesNovedades,this.jTtoolBarCobrarClientesNovedades,
							"duplicar","duplicar","Duplicar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCobrarClientesNovedades,this.jTtoolBarCobrarClientesNovedades,
							"copiar","copiar","Copiar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCobrarClientesNovedades,this.jTtoolBarCobrarClientesNovedades,
							"ver_form","ver_form","Ver"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesNovedades,this.jTtoolBarCobrarClientesNovedades,
							"recargar","recargar","Buscar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesNovedades,this.jTtoolBarCobrarClientesNovedades,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesNovedades,this.jTtoolBarCobrarClientesNovedades,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCobrarClientesNovedades,this.jTtoolBarCobrarClientesNovedades,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCobrarClientesNovedades,this.jTtoolBarCobrarClientesNovedades,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCobrarClientesNovedades,this.jTtoolBarCobrarClientesNovedades,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCobrarClientesNovedades,this.jTtoolBarCobrarClientesNovedades,
							"cerrar","cerrar","Salir"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCobrarClientesNovedades=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCobrarClientesNovedades;
			
				this.jButtonProcesarInformacionToolBarCobrarClientesNovedades=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCobrarClientesNovedades;
				
		//protected JButton jButtonModificarToolBarCobrarClientesNovedades;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCobrarClientesNovedades=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCobrarClientesNovedades=new JMenuMe("General");
		this.jmenuArchivoCobrarClientesNovedades=new JMenuMe("Archivo");
		this.jmenuAccionesCobrarClientesNovedades=new JMenuMe("Acciones");
		this.jmenuDatosCobrarClientesNovedades=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarClientesNovedades= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarClientesNovedades.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarClientesNovedades,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCobrarClientesNovedades= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCobrarClientesNovedades.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCobrarClientesNovedades,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCobrarClientesNovedades= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCobrarClientesNovedades.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCobrarClientesNovedades,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCobrarClientesNovedades= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarClientesNovedades.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarClientesNovedades,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCobrarClientesNovedades= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCobrarClientesNovedades.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCobrarClientesNovedades,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCobrarClientesNovedades= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCobrarClientesNovedades.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCobrarClientesNovedades,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCobrarClientesNovedades= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCobrarClientesNovedades.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCobrarClientesNovedades,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarClientesNovedades= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarClientesNovedades.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarClientesNovedades,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCobrarClientesNovedades= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCobrarClientesNovedades.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCobrarClientesNovedades,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCobrarClientesNovedades= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCobrarClientesNovedades.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCobrarClientesNovedades,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCobrarClientesNovedades= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCobrarClientesNovedades.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCobrarClientesNovedades,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCobrarClientesNovedades= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCobrarClientesNovedades.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCobrarClientesNovedades,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCobrarClientesNovedades= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCobrarClientesNovedades.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCobrarClientesNovedades,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarClientesNovedades= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarClientesNovedades.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarClientesNovedades,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCobrarClientesNovedades= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCobrarClientesNovedades.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCobrarClientesNovedades,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarClientesNovedades= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarClientesNovedades.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarClientesNovedades,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCobrarClientesNovedades= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCobrarClientesNovedades.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCobrarClientesNovedades,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCobrarClientesNovedades.add(this.jMenuItemCerrarCobrarClientesNovedades);
			
			this.jmenuAccionesCobrarClientesNovedades.add(this.jMenuItemNuevoCobrarClientesNovedades);
			this.jmenuAccionesCobrarClientesNovedades.add(this.jMenuItemNuevoGuardarCambiosCobrarClientesNovedades);
			this.jmenuAccionesCobrarClientesNovedades.add(this.jMenuItemNuevoRelacionesCobrarClientesNovedades);
			this.jmenuAccionesCobrarClientesNovedades.add(this.jMenuItemGuardarCambiosTablaCobrarClientesNovedades);		
			this.jmenuAccionesCobrarClientesNovedades.add(this.jMenuItemDuplicarCobrarClientesNovedades);		
			this.jmenuAccionesCobrarClientesNovedades.add(this.jMenuItemCopiarCobrarClientesNovedades);		
			this.jmenuAccionesCobrarClientesNovedades.add(this.jMenuItemVerFormCobrarClientesNovedades);		
			
			this.jmenuDatosCobrarClientesNovedades.add(this.jMenuItemRecargarInformacionCobrarClientesNovedades);				
			this.jmenuDatosCobrarClientesNovedades.add(this.jMenuItemAnterioresCobrarClientesNovedades);				
			this.jmenuDatosCobrarClientesNovedades.add(this.jMenuItemSiguientesCobrarClientesNovedades);				
			this.jmenuDatosCobrarClientesNovedades.add(this.jMenuItemAbrirOrderByCobrarClientesNovedades);				
			this.jmenuDatosCobrarClientesNovedades.add(this.jMenuItemMostrarOcultarCobrarClientesNovedades);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCobrarClientesNovedades.add(this.jMenuItemGuardarCambiosCobrarClientesNovedades);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCobrarClientesNovedades.add(this.jmenuArchivoCobrarClientesNovedades);		
			this.jmenuBarCobrarClientesNovedades.add(this.jmenuAccionesCobrarClientesNovedades);		
			this.jmenuBarCobrarClientesNovedades.add(this.jmenuDatosCobrarClientesNovedades);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCobrarClientesNovedades);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCobrarClientesNovedades() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCobrarClientesNovedadesCobrarClientesNovedades=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCobrarClientesNovedadesCobrarClientesNovedades.setToolTipText("Buscar Por Feha Atencion Hasta ");
		this.jButtonBusquedaCobrarClientesNovedadesCobrarClientesNovedades= new JButtonMe();
		this.jButtonBusquedaCobrarClientesNovedadesCobrarClientesNovedades.setText("Buscar");
		this.jButtonBusquedaCobrarClientesNovedadesCobrarClientesNovedades.setToolTipText("Buscar Por Feha Atencion Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCobrarClientesNovedadesCobrarClientesNovedades,"buscar_button","Buscar Por Feha Atencion Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCobrarClientesNovedadesCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades = new JLabelMe();
		jLabelfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades.setText("Feha Atencion Hasta :");
		jLabelfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades.setToolTipText("Feha Atencion Hasta");
		jLabelfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades= new JDateChooser();
		jDateChooserfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades.setDate(new Date());
		jDateChooserfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasCobrarClientesNovedades=new JTabbedPane();


		this.jTabbedPaneBusquedasCobrarClientesNovedades.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrarClientesNovedades.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrarClientesNovedades.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCobrarClientesNovedades.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCobrarClientesNovedades = new CobrarClientesNovedadesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cobrar Clientes Novedades DATOS");
			this.jInternalFrameDetalleFormCobrarClientesNovedades = new CobrarClientesNovedadesDetalleFormJInternalFrame(jDesktopPane,this.cobrarclientesnovedadesSessionBean.getConGuardarRelaciones(),this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCobrarClientesNovedades = null;//new CobrarClientesNovedadesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarClientesNovedades= new GridBagLayout();
		
		
		this.jTableDatosCobrarClientesNovedades = new JTableMe();      
		
		String sToolTipCobrarClientesNovedades="";
		sToolTipCobrarClientesNovedades=CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarClientesNovedades+="(Cartera.CobrarClientesNovedades)";
		}
		
		if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarClientesNovedades+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCobrarClientesNovedades.setToolTipText(sToolTipCobrarClientesNovedades);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCobrarClientesNovedades);
		this.jTableDatosCobrarClientesNovedades.setAutoCreateRowSorter(true);
		this.jTableDatosCobrarClientesNovedades.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCobrarClientesNovedades.setRowSelectionAllowed(true);
		this.jTableDatosCobrarClientesNovedades.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCobrarClientesNovedades = new JButtonMe();
		this.jButtonDuplicarCobrarClientesNovedades = new JButtonMe();
		this.jButtonCopiarCobrarClientesNovedades = new JButtonMe();
		this.jButtonVerFormCobrarClientesNovedades = new JButtonMe();
		this.jButtonNuevoRelacionesCobrarClientesNovedades = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesNovedades = new JButtonMe();
		this.jButtonCerrarCobrarClientesNovedades = new JButtonMe();
		
		this.jScrollPanelDatosCobrarClientesNovedades = new JScrollPane();   
        this.jScrollPanelDatosGeneralCobrarClientesNovedades = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCobrarClientesNovedades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Clientes Novedades";
		
		if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Novedadeses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarClientesNovedades.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarClientesNovedades.setToolTipText("Acciones");
        this.jPanelAccionesCobrarClientesNovedades.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCobrarClientesNovedades=new ReporteDinamicoJInternalFrame(CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCobrarClientesNovedades();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCobrarClientesNovedades=new ImportacionJInternalFrame(CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCobrarClientesNovedades();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCobrarClientesNovedades = new JButtonMe();
		
		this.jButtonAbrirOrderByCobrarClientesNovedades.setText("Orden");
		this.jButtonAbrirOrderByCobrarClientesNovedades.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarClientesNovedades,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCobrarClientesNovedades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarClientesNovedades=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesNovedades,false,this);
			
			//this.cargarOrderByCobrarClientesNovedades(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarClientesNovedades=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesNovedades,true,this);
			
			//this.cargarOrderByCobrarClientesNovedades(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCobrarClientesNovedades.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosCobrarClientesNovedades.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosCobrarClientesNovedades.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosCobrarClientesNovedades.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarClientesNovedades.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarClientesNovedades.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCobrarClientesNovedades.setText("Nuevo");
		this.jButtonDuplicarCobrarClientesNovedades.setText("Duplicar");
		this.jButtonCopiarCobrarClientesNovedades.setText("Copiar");
		this.jButtonVerFormCobrarClientesNovedades.setText("Ver");
		this.jButtonNuevoRelacionesCobrarClientesNovedades.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesNovedades.setText("Guardar");
		this.jButtonCerrarCobrarClientesNovedades.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarClientesNovedades,"nuevo_button","Nuevo",this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCobrarClientesNovedades,"duplicar_button","Duplicar",this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCobrarClientesNovedades,"copiar_button","Copiar",this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCobrarClientesNovedades,"ver_form","Ver",this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCobrarClientesNovedades,"nuevorelaciones_button","Nuevo Rel",this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarClientesNovedades,"guardarcambiostabla_button","Guardar",this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarClientesNovedades,"cerrar_button","Salir",this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCobrarClientesNovedades.setToolTipText("Nuevo"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCobrarClientesNovedades.setToolTipText("Duplicar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCobrarClientesNovedades.setToolTipText("Copiar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCobrarClientesNovedades.setToolTipText("Ver"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCobrarClientesNovedades.setToolTipText("Nuevo Rel"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesNovedades.setToolTipText("Guardar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarClientesNovedades.setToolTipText("Salir"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarClientesNovedades";
		inputMap = this.jButtonNuevoCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarClientesNovedades.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarClientesNovedades"));
		
		//DUPLICAR
		sMapKey = "DuplicarCobrarClientesNovedades";
		inputMap = this.jButtonDuplicarCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCobrarClientesNovedades.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCobrarClientesNovedades"));
		
		//COPIAR
		sMapKey = "CopiarCobrarClientesNovedades";
		inputMap = this.jButtonCopiarCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCobrarClientesNovedades.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCobrarClientesNovedades"));
		
		//VEr FORM
		sMapKey = "VerFormCobrarClientesNovedades";
		inputMap = this.jButtonVerFormCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCobrarClientesNovedades.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCobrarClientesNovedades"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCobrarClientesNovedades";
		inputMap = this.jButtonNuevoRelacionesCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCobrarClientesNovedades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCobrarClientesNovedades"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCobrarClientesNovedades";
		inputMap = this.jButtonModificarCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCobrarClientesNovedades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCobrarClientesNovedades"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCobrarClientesNovedades";
		inputMap = this.jButtonCerrarCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarClientesNovedades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarClientesNovedades"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarClientesNovedades";
		inputMap = this.jButtonGuardarCambiosTablaCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarClientesNovedades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarClientesNovedades"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCobrarClientesNovedades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCobrarClientesNovedades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCobrarClientesNovedades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CobrarClientesNovedades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CobrarClientesNovedades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CobrarClientesNovedades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CobrarClientesNovedades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CobrarClientesNovedades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCobrarClientesNovedades.setName("jPanelParametrosReportesCobrarClientesNovedades"); 
		
		this.jPanelParametrosReportesAccionesCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCobrarClientesNovedades.setName("jPanelParametrosReportesAccionesCobrarClientesNovedades"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCobrarClientesNovedades = new JButtonMe();
		this.jButtonRecargarInformacionCobrarClientesNovedades.setText("Buscar");
		this.jButtonRecargarInformacionCobrarClientesNovedades.setToolTipText("Buscar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCobrarClientesNovedades,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCobrarClientesNovedades.setVisible(false);
		
		
		this.jButtonProcesarInformacionCobrarClientesNovedades = new JButtonMe();
		this.jButtonProcesarInformacionCobrarClientesNovedades.setText("Procesar");
		this.jButtonProcesarInformacionCobrarClientesNovedades.setToolTipText("Procesar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCobrarClientesNovedades.setVisible(false);
			
		this.jButtonProcesarInformacionCobrarClientesNovedades.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarClientesNovedades.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarClientesNovedades.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCobrarClientesNovedades = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesNovedades.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCobrarClientesNovedades.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCobrarClientesNovedades = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesNovedades.setText("TIPO");       
		this.jComboBoxTiposReportesCobrarClientesNovedades.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCobrarClientesNovedades = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesNovedades.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCobrarClientesNovedades.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCobrarClientesNovedades = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCobrarClientesNovedades.setText("Paginacion");
		this.jComboBoxTiposPaginacionCobrarClientesNovedades.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCobrarClientesNovedades = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCobrarClientesNovedades.setText("Accion");
		this.jComboBoxTiposRelacionesCobrarClientesNovedades.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCobrarClientesNovedades = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarClientesNovedades.setText("Accion");
		this.jComboBoxTiposAccionesCobrarClientesNovedades.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCobrarClientesNovedades = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCobrarClientesNovedades.setText("Accion");
		this.jComboBoxTiposSeleccionarCobrarClientesNovedades.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCobrarClientesNovedades=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCobrarClientesNovedades.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarClientesNovedades.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarClientesNovedades.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCobrarClientesNovedades = new JLabelMe();
		
		this.jLabelAccionesCobrarClientesNovedades.setText("Acciones");		
		this.jLabelAccionesCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCobrarClientesNovedades = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCobrarClientesNovedades.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCobrarClientesNovedades.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCobrarClientesNovedades = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCobrarClientesNovedades.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCobrarClientesNovedades.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCobrarClientesNovedades = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCobrarClientesNovedades.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCobrarClientesNovedades.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCobrarClientesNovedades = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCobrarClientesNovedades.setText("Graf.");
		this.jCheckBoxConGraficoReporteCobrarClientesNovedades.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCobrarClientesNovedades = new JButtonMe();
		//this.jButtonAnterioresCobrarClientesNovedades.setText("<<");
        this.jButtonAnterioresCobrarClientesNovedades.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCobrarClientesNovedades,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCobrarClientesNovedades = new JButtonMe();
		//this.jButtonSiguientesCobrarClientesNovedades.setText(">>");
        this.jButtonSiguientesCobrarClientesNovedades.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCobrarClientesNovedades,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCobrarClientesNovedades = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCobrarClientesNovedades.setText("Nue");
        this.jButtonNuevoGuardarCambiosCobrarClientesNovedades.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCobrarClientesNovedades,"nuevoguardarcambios_button","Nue",this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCobrarClientesNovedades";
		inputMap = this.jButtonNuevoGuardarCambiosCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCobrarClientesNovedades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCobrarClientesNovedades"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCobrarClientesNovedades";
		inputMap = this.jButtonRecargarInformacionCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCobrarClientesNovedades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCobrarClientesNovedades"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCobrarClientesNovedades";
		inputMap = this.jButtonSiguientesCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCobrarClientesNovedades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCobrarClientesNovedades"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCobrarClientesNovedades";
		inputMap = this.jButtonAnterioresCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCobrarClientesNovedades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCobrarClientesNovedades"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCobrarClientesNovedades();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCobrarClientesNovedades.setMinimumSize(new Dimension(this.getWidth(),CobrarClientesNovedadesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesNovedadesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarClientesNovedades.setMaximumSize(new Dimension(this.getWidth(),CobrarClientesNovedadesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesNovedadesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarClientesNovedades.setPreferredSize(new Dimension(this.getWidth(),CobrarClientesNovedadesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesNovedadesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCobrarClientesNovedades = new GridBagLayout();

			this.jPanelPaginacionCobrarClientesNovedades.setLayout(gridaBagLayoutPaginacionCobrarClientesNovedades);						
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCobrarClientesNovedades.add(this.jButtonAnterioresCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
					
						
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
			
			this.jPanelPaginacionCobrarClientesNovedades.add(this.jButtonNuevoGuardarCambiosCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
						
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
			this.jPanelPaginacionCobrarClientesNovedades.add(this.jButtonSiguientesCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = 1;
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesNovedades.add(this.jButtonNuevoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
						
			
			
			if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCobrarClientesNovedades.gridy = 1;
				this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCobrarClientesNovedades.add(this.jButtonGuardarCambiosTablaCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
			}
			
			
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = 1;
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesNovedades.add(this.jButtonDuplicarCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = 1;
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesNovedades.add(this.jButtonCopiarCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = 1;
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesNovedades.add(this.jButtonVerFormCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = 1;
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCobrarClientesNovedades.add(this.jButtonCerrarCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		
		
		
		this.jButtonRecargarInformacionCobrarClientesNovedades.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarClientesNovedades.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarClientesNovedades.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCobrarClientesNovedades.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarClientesNovedades.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarClientesNovedades.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCobrarClientesNovedades.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarClientesNovedades.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarClientesNovedades.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCobrarClientesNovedades.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarClientesNovedades.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarClientesNovedades.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCobrarClientesNovedades.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarClientesNovedades.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarClientesNovedades.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCobrarClientesNovedades.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarClientesNovedades.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarClientesNovedades.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCobrarClientesNovedades.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesNovedades.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesNovedades.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCobrarClientesNovedades.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarClientesNovedades.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarClientesNovedades.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCobrarClientesNovedades.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarClientesNovedades.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarClientesNovedades.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCobrarClientesNovedades.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarClientesNovedades.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarClientesNovedades.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCobrarClientesNovedades.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarClientesNovedades.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarClientesNovedades.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCobrarClientesNovedades.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarClientesNovedades.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarClientesNovedades.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCobrarClientesNovedades = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCobrarClientesNovedades = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CobrarClientesNovedades = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CobrarClientesNovedades = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CobrarClientesNovedades = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CobrarClientesNovedades = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCobrarClientesNovedades.setLayout(gridaBagParametrosReportesCobrarClientesNovedades);
			this.jPanelParametrosReportesAccionesCobrarClientesNovedades.setLayout(gridaBagParametrosReportesAccionesCobrarClientesNovedades);
			
			
			this.jPanelParametrosAuxiliar1CobrarClientesNovedades.setLayout(gridaBagParametrosAuxiliar1CobrarClientesNovedades);
			this.jPanelParametrosAuxiliar2CobrarClientesNovedades.setLayout(gridaBagParametrosAuxiliar2CobrarClientesNovedades);
			this.jPanelParametrosAuxiliar3CobrarClientesNovedades.setLayout(gridaBagParametrosAuxiliar3CobrarClientesNovedades);
			this.jPanelParametrosAuxiliar4CobrarClientesNovedades.setLayout(gridaBagParametrosAuxiliar4CobrarClientesNovedades);
			//this.jPanelParametrosAuxiliar5CobrarClientesNovedades.setLayout(gridaBagParametrosAuxiliar2CobrarClientesNovedades);			
			
			
			
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesNovedades.add(this.jButtonRecargarInformacionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesNovedades.add(this.jComboBoxTiposPaginacionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesNovedades.add(this.jCheckBoxConAltoMaximoTablaCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesNovedades.add(this.jComboBoxTiposArchivosReportesCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesNovedades.add(this.jPanelParametrosAuxiliar1CobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesNovedades.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CobrarClientesNovedades.add(this.jComboBoxTiposReportesCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesNovedades.add(this.jPanelParametrosAuxiliar4CobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesNovedades.add(this.jComboBoxTiposReportesCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesNovedades.add(this.jCheckBoxGenerarReporteCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesNovedades.add(this.jPanelParametrosAuxiliar2CobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesNovedades.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesNovedades.add(this.jLabelAccionesCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCobrarClientesNovedades.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCobrarClientesNovedades.add(this.jButtonAbrirOrderByCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesNovedades.add(this.jComboBoxTiposSeleccionarCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);			
			
			
			/*
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesNovedades.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesNovedades.add(this.jCheckBoxSeleccionarTodosCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesNovedades.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarClientesNovedades.add(this.jCheckBoxSeleccionarTodosCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);															
				
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesNovedades.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarClientesNovedades.add(this.jCheckBoxSeleccionadosCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesNovedades.add(this.jPanelParametrosAuxiliar3CobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesNovedades.add(this.jComboBoxTiposAccionesCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCobrarClientesNovedades = new GridBagLayout();

			this.jScrollPanelDatosCobrarClientesNovedades.setLayout(gridaBagLayoutDatosCobrarClientesNovedades);
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
			this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
			
			this.jScrollPanelDatosCobrarClientesNovedades.add(this.jTableDatosCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCobrarClientesNovedades.setViewportView(this.jTableDatosCobrarClientesNovedades);
		this.jTableDatosCobrarClientesNovedades.setFillsViewportHeight(true);
		this.jTableDatosCobrarClientesNovedades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCobrarClientesNovedades= new GridBagLayout();
		this.jPanelAccionesCobrarClientesNovedades.setLayout(gridaBagLayoutAccionesCobrarClientesNovedades);
		
		
		/*	
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
			
		this.jPanelAccionesCobrarClientesNovedades.add(this.jButtonNuevoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCobrarClientesNovedadesCobrarClientesNovedades= new GridBagLayout();
		gridaBagLayoutBusquedaCobrarClientesNovedadesCobrarClientesNovedades.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCobrarClientesNovedadesCobrarClientesNovedades.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCobrarClientesNovedadesCobrarClientesNovedades.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCobrarClientesNovedadesCobrarClientesNovedades.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCobrarClientesNovedadesCobrarClientesNovedades.setLayout(gridaBagLayoutBusquedaCobrarClientesNovedadesCobrarClientesNovedades);

		gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		gridBagConstraintsCobrarClientesNovedades.gridx = 0;
		jPanelBusquedaCobrarClientesNovedadesCobrarClientesNovedades.add(jLabelfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades, gridBagConstraintsCobrarClientesNovedades);

		gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		gridBagConstraintsCobrarClientesNovedades.gridx = 1;
		jPanelBusquedaCobrarClientesNovedadesCobrarClientesNovedades.add(jDateChooserfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades, gridBagConstraintsCobrarClientesNovedades);

		gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesNovedades.gridy = 1;
		gridBagConstraintsCobrarClientesNovedades.gridx =1;
		jPanelBusquedaCobrarClientesNovedadesCobrarClientesNovedades.add(jButtonBusquedaCobrarClientesNovedadesCobrarClientesNovedades, gridBagConstraintsCobrarClientesNovedades);

		jTabbedPaneBusquedasCobrarClientesNovedades.addTab("1.-Por Feha Atencion Hasta ", jPanelBusquedaCobrarClientesNovedadesCobrarClientesNovedades);
		jTabbedPaneBusquedasCobrarClientesNovedades.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarClientesNovedades = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarClientesNovedades);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();						
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;		
			//this.gridBagConstraintsCobrarClientesNovedades.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarClientesNovedades.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;		
		//this.gridBagConstraintsCobrarClientesNovedades.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCobrarClientesNovedades.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCobrarClientesNovedades);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;		
			this.gridBagConstraintsCobrarClientesNovedades.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCobrarClientesNovedades.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);								
		
		
		/*
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		*/		
		
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesNovedades.gridx =0;
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarClientesNovedades.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
				
		
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CobrarClientesNovedadesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCobrarClientesNovedades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarClientesNovedades = new GridBagLayout();
			this.jPanelBusquedasParametrosCobrarClientesNovedades.setLayout(gridaBagLayoutBusquedasParametrosCobrarClientesNovedades);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCobrarClientesNovedades=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarClientesNovedades.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesNovedades.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesNovedades.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
			
			
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		
			
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCobrarClientesNovedades;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCobrarClientesNovedades() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCobrarClientesNovedades = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCobrarClientesNovedades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCobrarClientesNovedades.setName("jPanelReporteDinamicoCobrarClientesNovedades"); 
		
		this.jPanelReporteDinamicoCobrarClientesNovedades.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarClientesNovedades.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarClientesNovedades.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCobrarClientesNovedades.setLayout(gridaBagLayoutReporteDinamicoCobrarClientesNovedades);
		
		
		this.jInternalFrameReporteDinamicoCobrarClientesNovedades= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCobrarClientesNovedades = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarClientesNovedades= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setResizable(true);
	    this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setClosable(true);
	    this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCobrarClientesNovedades.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarClientesNovedades.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarClientesNovedades.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Novedadeses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCobrarClientesNovedades = new JLabelMe();

		this.jLabelColumnasSelectReporteCobrarClientesNovedades.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarClientesNovedades.add(this.jLabelColumnasSelectReporteCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCobrarClientesNovedades = new JList<Reporte>();
		this.jListColumnasSelectReporteCobrarClientesNovedades.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCobrarClientesNovedades.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCobrarClientesNovedades.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarClientesNovedades.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarClientesNovedades.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCobrarClientesNovedades=new JScrollPane(this.jListColumnasSelectReporteCobrarClientesNovedades);
			
			this.jScrollColumnasSelectReporteCobrarClientesNovedades.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarClientesNovedades.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarClientesNovedades.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCobrarClientesNovedades.add(this.jListColumnasSelectReporteCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		this.jPanelReporteDinamicoCobrarClientesNovedades.add(this.jScrollColumnasSelectReporteCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCobrarClientesNovedades = new JLabelMe();

		this.jLabelRelacionesSelectReporteCobrarClientesNovedades.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCobrarClientesNovedades = new JList<Reporte>();
		this.jListRelacionesSelectReporteCobrarClientesNovedades.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCobrarClientesNovedades.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCobrarClientesNovedades.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarClientesNovedades.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarClientesNovedades.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCobrarClientesNovedades=new JScrollPane(this.jListRelacionesSelectReporteCobrarClientesNovedades);
			
			this.jScrollRelacionesSelectReporteCobrarClientesNovedades.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarClientesNovedades.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarClientesNovedades.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCobrarClientesNovedades = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCobrarClientesNovedades = new JComboBoxMe();
		this.jListColumnasValoresGraficoCobrarClientesNovedades = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCobrarClientesNovedades = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCobrarClientesNovedades.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCobrarClientesNovedades.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarClientesNovedades.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarClientesNovedades.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesNovedades = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesNovedades.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesNovedades.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesNovedades.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesNovedades.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesNovedades = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCobrarClientesNovedades.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesNovedades.add(this.jLabelGenerarExcelReporteDinamicoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesNovedades = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesNovedades.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCobrarClientesNovedades,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesNovedades.setToolTipText("Generar EXCEL"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCobrarClientesNovedades.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCobrarClientesNovedades.add(this.jButtonGenerarExcelReporteDinamicoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesNovedades.add(this.jComboBoxTiposReportesDinamicoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesNovedades = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCobrarClientesNovedades.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesNovedades.add(this.jLabelTiposArchivoReporteDinamicoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesNovedades.add(this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCobrarClientesNovedades = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCobrarClientesNovedades.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCobrarClientesNovedades,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCobrarClientesNovedades.setToolTipText("Generar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesNovedades.add(this.jButtonGenerarReporteDinamicoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCobrarClientesNovedades = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCobrarClientesNovedades.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCobrarClientesNovedades,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCobrarClientesNovedades.setToolTipText("Cancelar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesNovedades.add(this.jButtonCerrarReporteDinamicoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCobrarClientesNovedades = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCobrarClientesNovedades= new JScrollPane(jPanelReporteDinamicoCobrarClientesNovedades,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCobrarClientesNovedades.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarClientesNovedades.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarClientesNovedades.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Novedadeses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesNovedades.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCobrarClientesNovedades);
		this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getContentPane().add(this.jScrollPanelReporteDinamicoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCobrarClientesNovedades() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCobrarClientesNovedades = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCobrarClientesNovedades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCobrarClientesNovedades.setName("jPanelImportacionCobrarClientesNovedades"); 
		
		this.jPanelImportacionCobrarClientesNovedades.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarClientesNovedades.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarClientesNovedades.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCobrarClientesNovedades.setLayout(gridaBagLayoutImportacionCobrarClientesNovedades);
		
		
		this.jInternalFrameImportacionCobrarClientesNovedades= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCobrarClientesNovedades= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCobrarClientesNovedades = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarClientesNovedades= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCobrarClientesNovedades.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarClientesNovedades.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarClientesNovedades.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCobrarClientesNovedades.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarClientesNovedades.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarClientesNovedades.setResizable(true);
	    this.jInternalFrameImportacionCobrarClientesNovedades.setClosable(true);
	    this.jInternalFrameImportacionCobrarClientesNovedades.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCobrarClientesNovedades.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarClientesNovedades.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarClientesNovedades.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCobrarClientesNovedades.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarClientesNovedades.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarClientesNovedades.setResizable(true);
	    this.jInternalFrameImportacionCobrarClientesNovedades.setClosable(true);
	    this.jInternalFrameImportacionCobrarClientesNovedades.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCobrarClientesNovedades.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarClientesNovedades.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarClientesNovedades.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Novedadeses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCobrarClientesNovedades = new JLabelMe();

		this.jLabelArchivoImportacionCobrarClientesNovedades.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarClientesNovedades.add(this.jLabelArchivoImportacionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCobrarClientesNovedades = new JFileChooser();		
		this.jFileChooserImportacionCobrarClientesNovedades.setToolTipText("ESCOGER ARCHIVO"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCobrarClientesNovedades = new JButtonMe();
		this.jButtonAbrirImportacionCobrarClientesNovedades.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCobrarClientesNovedades,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCobrarClientesNovedades.setToolTipText("Generar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesNovedades.add(this.jButtonAbrirImportacionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCobrarClientesNovedades = new JLabelMe();

		this.jLabelPathArchivoImportacionCobrarClientesNovedades.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarClientesNovedades.add(this.jLabelPathArchivoImportacionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCobrarClientesNovedades=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCobrarClientesNovedades.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarClientesNovedades.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarClientesNovedades.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesNovedades.add(this.jTextFieldPathArchivoImportacionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCobrarClientesNovedades = new JButtonMe();
		this.jButtonGenerarImportacionCobrarClientesNovedades.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCobrarClientesNovedades,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCobrarClientesNovedades.setToolTipText("Generar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesNovedades.add(this.jButtonGenerarImportacionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCobrarClientesNovedades = new JButtonMe();
		this.jButtonCerrarImportacionCobrarClientesNovedades.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCobrarClientesNovedades,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCobrarClientesNovedades.setToolTipText("Cancelar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesNovedades.add(this.jButtonCerrarImportacionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCobrarClientesNovedades = new GridBagLayout();
		
		this.jScrollPanelImportacionCobrarClientesNovedades= new JScrollPane(jPanelImportacionCobrarClientesNovedades,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy =iPosYImportacion;
		this.gridBagConstraintsCobrarClientesNovedades.gridx =iPosXImportacion;
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCobrarClientesNovedades.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCobrarClientesNovedades.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCobrarClientesNovedades);
		this.jInternalFrameImportacionCobrarClientesNovedades.getContentPane().add(this.jScrollPanelImportacionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCobrarClientesNovedades(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCobrarClientesNovedades = new JButtonMe();
			this.jButtonAbrirOrderByCobrarClientesNovedades.setText("Orden");
			this.jButtonAbrirOrderByCobrarClientesNovedades.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarClientesNovedades,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCobrarClientesNovedades";
			inputMap = this.jButtonAbrirOrderByCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCobrarClientesNovedades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCobrarClientesNovedades"));
		
		
			GridBagLayout gridaBagLayoutOrderByCobrarClientesNovedades = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCobrarClientesNovedades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCobrarClientesNovedades.setName("jPanelOrderByCobrarClientesNovedades"); 
			
			this.jPanelOrderByCobrarClientesNovedades.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarClientesNovedades.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarClientesNovedades.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCobrarClientesNovedades.setLayout(gridaBagLayoutOrderByCobrarClientesNovedades);
			
			
			this.jTableDatosCobrarClientesNovedadesOrderBy = new JTableMe();        
			this.jTableDatosCobrarClientesNovedadesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCobrarClientesNovedadesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCobrarClientesNovedadesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCobrarClientesNovedadesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCobrarClientesNovedadesOrderBy.setViewportView(this.jTableDatosCobrarClientesNovedadesOrderBy);
			this.jTableDatosCobrarClientesNovedadesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCobrarClientesNovedadesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCobrarClientesNovedades= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCobrarClientesNovedades= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCobrarClientesNovedades = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCobrarClientesNovedades= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCobrarClientesNovedades.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCobrarClientesNovedades.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCobrarClientesNovedades.setTitle("Orden");
			this.jInternalFrameOrderByCobrarClientesNovedades.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCobrarClientesNovedades.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCobrarClientesNovedades.setResizable(true);
			this.jInternalFrameOrderByCobrarClientesNovedades.setClosable(true);
			this.jInternalFrameOrderByCobrarClientesNovedades.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCobrarClientesNovedades.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarClientesNovedades.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarClientesNovedades.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Novedadeses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCobrarClientesNovedades.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCobrarClientesNovedades.ipady =150;
				
			this.jPanelOrderByCobrarClientesNovedades.add(jScrollPanelDatosCobrarClientesNovedadesOrderBy, this.gridBagConstraintsCobrarClientesNovedades);//this.jTableDatosCobrarClientesNovedadesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCobrarClientesNovedades = new JButtonMe();
			this.jButtonCerrarOrderByCobrarClientesNovedades.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCobrarClientesNovedades,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCobrarClientesNovedades.setToolTipText("Cancelar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCobrarClientesNovedades.add(this.jButtonCerrarOrderByCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCobrarClientesNovedades = new GridBagLayout();
			
			this.jScrollPanelOrderByCobrarClientesNovedades= new JScrollPane(jPanelOrderByCobrarClientesNovedades,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.gridy =iPosYOrderBy;
			this.gridBagConstraintsCobrarClientesNovedades.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCobrarClientesNovedades.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCobrarClientesNovedades.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCobrarClientesNovedades);
			
			this.jInternalFrameOrderByCobrarClientesNovedades.getContentPane().add(this.jScrollPanelOrderByCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);			
		
		} else {
			this.jButtonAbrirOrderByCobrarClientesNovedades = new JButtonMe();
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
		int iWidthTableCalculado=0;//2230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.cobrarclientesnovedadesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCobrarClientesNovedades.getRowHeight();//CobrarClientesNovedadesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CobrarClientesNovedadesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarClientesNovedades.isSelected()) {
					iHeightTable=CobrarClientesNovedadesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarClientesNovedadesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarClientesNovedadesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CobrarClientesNovedadesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarClientesNovedades.isSelected()) {
					iHeightTable=CobrarClientesNovedadesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarClientesNovedadesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarClientesNovedadesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCobrarClientesNovedades.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarClientesNovedades.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarClientesNovedades.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCobrarClientesNovedades.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarClientesNovedades.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarClientesNovedades.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCobrarClientesNovedades!=null && this.jInternalFrameOrderByCobrarClientesNovedades.getjTableDatosOrderBy()!=null) {
			//if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCobrarClientesNovedades.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCobrarClientesNovedades.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCobrarClientesNovedades.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCobrarClientesNovedades.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCobrarClientesNovedades.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCobrarClientesNovedades.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCobrarClientesNovedades.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCobrarClientesNovedades.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarClientesNovedades.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarClientesNovedades.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclientesnovedadess.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CobrarClientesNovedades> TraerCobrarClientesNovedadesBeans(List<CobrarClientesNovedades> cobrarclientesnovedadess,ArrayList<Classe> classes)throws Exception {
		try {
			for(CobrarClientesNovedades cobrarclientesnovedades:cobrarclientesnovedadess) {
					
				if(!(CobrarClientesNovedadesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CobrarClientesNovedadesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
					|| CobrarClientesNovedadesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_REPORTE)
				   ) {
					
					cobrarclientesnovedades.setsDetalleGeneralEntityReporte(CobrarClientesNovedadesConstantesFunciones.getCobrarClientesNovedadesDescripcion(cobrarclientesnovedades));
										
					cobrarclientesnovedades.setesta_activo_descripcion(CobrarClientesNovedadesConstantesFunciones.getesta_activoDescripcion(cobrarclientesnovedades));	
					
						
					
				} else  {
							
					//cobrarclientesnovedades.setsDetalleGeneralEntityReporte(cobrarclientesnovedades.getsDetalleGeneralEntityReporte());
										
				}
				
				//cobrarclientesnovedadesbeans.add(cobrarclientesnovedadesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cobrarclientesnovedadess;
    }
	//PARA REPORTES FIN
}
