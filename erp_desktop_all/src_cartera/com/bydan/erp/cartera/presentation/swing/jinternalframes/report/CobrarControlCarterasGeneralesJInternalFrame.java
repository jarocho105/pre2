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
import com.bydan.erp.cartera.util.report.CobrarControlCarterasGeneralesConstantesFunciones;

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
public class CobrarControlCarterasGeneralesJInternalFrame extends CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCobrarControlCarterasGenerales;
	
	protected JMenuBar jmenuBarCobrarControlCarterasGenerales;
	
	protected JMenu jmenuCobrarControlCarterasGenerales;
	protected JMenu jmenuDatosCobrarControlCarterasGenerales;
	protected JMenu jmenuArchivoCobrarControlCarterasGenerales;
	protected JMenu jmenuAccionesCobrarControlCarterasGenerales;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCobrarControlCarterasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarControlCarterasGenerales;	
	protected GridBagConstraints gridBagConstraintsCobrarControlCarterasGenerales;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CobrarControlCarterasGeneralesDetalleFormJInternalFrame jInternalFrameDetalleFormCobrarControlCarterasGenerales;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCobrarControlCarterasGenerales;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCobrarControlCarterasGenerales;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public CobrarControlCarterasGeneralesSessionBean cobrarcontrolcarterasgeneralesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneraless;		
	public List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessEliminados;	
	public List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCobrarControlCarterasGenerales;		
	protected JButton jButtonAbrirOrderByCobrarControlCarterasGenerales;
	
	
	//protected JPanel jPanelOrderByCobrarControlCarterasGenerales;
	//public JScrollPane jScrollPanelOrderByCobrarControlCarterasGenerales;	
	//protected JButton jButtonCerrarOrderByCobrarControlCarterasGenerales;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CobrarControlCarterasGeneralesLogic cobrarcontrolcarterasgeneralesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCobrarControlCarterasGenerales;
	public JScrollPane jScrollPanelDatosEdicionCobrarControlCarterasGenerales;
	public JScrollPane jScrollPanelDatosGeneralCobrarControlCarterasGenerales;
    
	
	
	//public JScrollPane jScrollPanelDatosCobrarControlCarterasGeneralesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCobrarControlCarterasGenerales;
	//public JScrollPane jScrollPanelImportacionCobrarControlCarterasGenerales;
	
	
	
	protected JPanel jPanelAccionesCobrarControlCarterasGenerales;
	
    protected JPanel jPanelPaginacionCobrarControlCarterasGenerales;
    protected JPanel jPanelParametrosReportesCobrarControlCarterasGenerales;
	protected JPanel jPanelParametrosReportesAccionesCobrarControlCarterasGenerales;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CobrarControlCarterasGenerales;
	protected JPanel jPanelParametrosAuxiliar2CobrarControlCarterasGenerales;
	protected JPanel jPanelParametrosAuxiliar3CobrarControlCarterasGenerales;
	protected JPanel jPanelParametrosAuxiliar4CobrarControlCarterasGenerales;
	//protected JPanel jPanelParametrosAuxiliar5CobrarControlCarterasGenerales;
	
	
	
	//protected JPanel jPanelReporteDinamicoCobrarControlCarterasGenerales;
	//protected JPanel jPanelImportacionCobrarControlCarterasGenerales;
	
	
	public JTable jTableDatosCobrarControlCarterasGenerales;
	
	
	
	//public JTable jTableDatosCobrarControlCarterasGeneralesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCobrarControlCarterasGenerales;
	protected JButton jButtonDuplicarCobrarControlCarterasGenerales;
	protected JButton jButtonCopiarCobrarControlCarterasGenerales;
	protected JButton jButtonVerFormCobrarControlCarterasGenerales;
	protected JButton jButtonNuevoRelacionesCobrarControlCarterasGenerales;
	protected JButton jButtonModificarCobrarControlCarterasGenerales;
	
    protected JButton jButtonGuardarCambiosTablaCobrarControlCarterasGenerales;
	protected JButton jButtonCerrarCobrarControlCarterasGenerales;
	
	
	protected JButton jButtonRecargarInformacionCobrarControlCarterasGenerales;
	protected JButton jButtonProcesarInformacionCobrarControlCarterasGenerales;
	
	
	protected JButton jButtonAnterioresCobrarControlCarterasGenerales;
	protected JButton jButtonSiguientesCobrarControlCarterasGenerales;
	protected JButton jButtonNuevoGuardarCambiosCobrarControlCarterasGenerales;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCobrarControlCarterasGenerales;
	//protected JButton jButtonCerrarReporteDinamicoCobrarControlCarterasGenerales;
	//protected JButton jButtonGenerarExcelReporteDinamicoCobrarControlCarterasGenerales;	
	
	
	
	//protected JButton jButtonAbrirImportacionCobrarControlCarterasGenerales;
	//protected JButton jButtonGenerarImportacionCobrarControlCarterasGenerales;
	//protected JButton jButtonCerrarImportacionCobrarControlCarterasGenerales;
	//protected JFileChooser jFileChooserImportacionCobrarControlCarterasGenerales;
	//protected File fileImportacionCobrarControlCarterasGenerales;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonDuplicarToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonNuevoRelacionesToolBarCobrarControlCarterasGenerales;
	
	
	public JButton jButtonGuardarCambiosToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonCopiarToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonVerFormToolBarCobrarControlCarterasGenerales;
	public JButton jButtonGuardarCambiosTablaToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonCerrarToolBarCobrarControlCarterasGenerales;
	
	protected JButton jButtonRecargarInformacionToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonProcesarInformacionToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonAnterioresToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonSiguientesToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonNuevoGuardarCambiosToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonAbrirOrderByToolBarCobrarControlCarterasGenerales;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemDuplicarCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemNuevoRelacionesCobrarControlCarterasGenerales;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemCopiarCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemVerFormCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemCerrarCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemDetalleCerrarCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarControlCarterasGenerales;
	
	protected JMenuItem jMenuItemRecargarInformacionCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemProcesarInformacionCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemAnterioresCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemSiguientesCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemAbrirOrderByCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemMostrarOcultarCobrarControlCarterasGenerales;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarControlCarterasGenerales;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales;
	protected JCheckBox jCheckBoxSeleccionadosCobrarControlCarterasGenerales;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCobrarControlCarterasGenerales;
	protected JCheckBox jCheckBoxConGraficoReporteCobrarControlCarterasGenerales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCobrarControlCarterasGenerales;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarControlCarterasGenerales;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCobrarControlCarterasGenerales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCobrarControlCarterasGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCobrarControlCarterasGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarControlCarterasGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarControlCarterasGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCobrarControlCarterasGenerales;
	protected JTextField jTextFieldValorCampoGeneralCobrarControlCarterasGenerales;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCobrarControlCarterasGenerales;
	//public JList<Reporte> jListColumnasSelectReporteCobrarControlCarterasGenerales;
	//public JScrollPane jScrollColumnasSelectReporteCobrarControlCarterasGenerales;
	
	//public JLabel jLabelRelacionesSelectReporteCobrarControlCarterasGenerales;
	//public JList<Reporte> jListRelacionesSelectReporteCobrarControlCarterasGenerales;
	//public JScrollPane jScrollRelacionesSelectReporteCobrarControlCarterasGenerales;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCobrarControlCarterasGenerales;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCobrarControlCarterasGenerales;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCobrarControlCarterasGenerales;
	//public JLabel jLabelTiposArchivoReporteDinamicoCobrarControlCarterasGenerales;
	
		
	//public JLabel jLabelArchivoImportacionCobrarControlCarterasGenerales;	
	//public JLabel jLabelPathArchivoImportacionCobrarControlCarterasGenerales;
	//protected JTextField jTextFieldPathArchivoImportacionCobrarControlCarterasGenerales;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCobrarControlCarterasGenerales;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCobrarControlCarterasGenerales;
	
	//public JLabel jLabelColumnaCategoriaValorCobrarControlCarterasGenerales;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCobrarControlCarterasGenerales;
	
	//public JLabel jLabelColumnasValoresGraficoCobrarControlCarterasGenerales;
	//public JList<Reporte> jListColumnasValoresGraficoCobrarControlCarterasGenerales;
	//public JScrollPane jScrollColumnasValoresGraficoCobrarControlCarterasGenerales;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCobrarControlCarterasGenerales;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCobrarControlCarterasGenerales;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCobrarControlCarterasGenerales;
	public JPanel jPanelBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales;
	public JButton jButtonBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales;
	
	public JPanel jPanelfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales;
	public JLabel jLabelfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales;
	public JButton jButtonfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1012;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CobrarControlCarterasGeneralesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CobrarControlCarterasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarControlCarterasGeneralesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarControlCarterasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarControlCarterasGeneralesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarControlCarterasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarControlCarterasGeneralesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarControlCarterasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCobrarControlCarterasGenerales)	{
		this.jButtonRecargarInformacionCobrarControlCarterasGenerales = jButtonRecargarInformacionCobrarControlCarterasGenerales;
	}
	
	public JButton getjButtonProcesarInformacionCobrarControlCarterasGenerales() {
		return this.jButtonProcesarInformacionCobrarControlCarterasGenerales;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarControlCarterasGenerales)	{
		this.jButtonProcesarInformacionCobrarControlCarterasGenerales = jButtonProcesarInformacionCobrarControlCarterasGenerales;
	}
	
	
	public JButton getjButtonRecargarInformacionCobrarControlCarterasGenerales() {
		return this.jButtonRecargarInformacionCobrarControlCarterasGenerales;
	}
	
	
	public List<CobrarControlCarterasGenerales> getcobrarcontrolcarterasgeneraless() {
		return this.cobrarcontrolcarterasgeneraless;
	}

	public void setcobrarcontrolcarterasgeneraless(List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneraless) {
		this.cobrarcontrolcarterasgeneraless = cobrarcontrolcarterasgeneraless;
	}
	
	public List<CobrarControlCarterasGenerales> getcobrarcontrolcarterasgeneralessAux() {
		return this.cobrarcontrolcarterasgeneralessAux;
	}

	public void setcobrarcontrolcarterasgeneralessAux(List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessAux) {
		this.cobrarcontrolcarterasgeneralessAux = cobrarcontrolcarterasgeneralessAux;
	}
	
	public List<CobrarControlCarterasGenerales> getcobrarcontrolcarterasgeneralessEliminados() {
		return this.cobrarcontrolcarterasgeneralessEliminados;
	}

	public void setCobrarControlCarterasGeneralessEliminados(List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessEliminados) {
		this.cobrarcontrolcarterasgeneralessEliminados = cobrarcontrolcarterasgeneralessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCobrarControlCarterasGenerales() {
		return jComboBoxTiposSeleccionarCobrarControlCarterasGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCobrarControlCarterasGenerales(
			JComboBox jComboBoxTiposSeleccionarCobrarControlCarterasGenerales) {
		this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales = jComboBoxTiposSeleccionarCobrarControlCarterasGenerales;
	}
	
	public void setBorderResaltarTiposSeleccionarCobrarControlCarterasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCobrarControlCarterasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCobrarControlCarterasGenerales() {
		return jTextFieldValorCampoGeneralCobrarControlCarterasGenerales;
	}

	public void setjTextFieldValorCampoGeneralCobrarControlCarterasGenerales(
			JTextField jTextFieldValorCampoGeneralCobrarControlCarterasGenerales) {
		this.jTextFieldValorCampoGeneralCobrarControlCarterasGenerales = jTextFieldValorCampoGeneralCobrarControlCarterasGenerales;
	}

	public void setBorderResaltarValorCampoGeneralCobrarControlCarterasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarControlCarterasGenerales.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCobrarControlCarterasGenerales .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCobrarControlCarterasGenerales() {
		return this.jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales;
	}

	public void setjCheckBoxSeleccionarTodosCobrarControlCarterasGenerales(
			JCheckBox jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales) {
		this.jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales = jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales;
	}

	public void setBorderResaltarSeleccionarTodosCobrarControlCarterasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarControlCarterasGenerales.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCobrarControlCarterasGenerales() {
		return this.jCheckBoxSeleccionadosCobrarControlCarterasGenerales;
	}

	public void setjCheckBoxSeleccionadosCobrarControlCarterasGenerales(
			JCheckBox jCheckBoxSeleccionadosCobrarControlCarterasGenerales) {
		this.jCheckBoxSeleccionadosCobrarControlCarterasGenerales = jCheckBoxSeleccionadosCobrarControlCarterasGenerales;
	}
	
	public void setBorderResaltarSeleccionadosCobrarControlCarterasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarControlCarterasGenerales.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCobrarControlCarterasGenerales .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCobrarControlCarterasGenerales() {
		return this.jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCobrarControlCarterasGenerales(
			JComboBox jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales) {
		this.jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales = jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales;
	}

	public void setBorderResaltarTiposArchivosReportesCobrarControlCarterasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarControlCarterasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCobrarControlCarterasGenerales() {
		return this.jComboBoxTiposReportesCobrarControlCarterasGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCobrarControlCarterasGenerales(
			JComboBox jComboBoxTiposReportesCobrarControlCarterasGenerales) {
		this.jComboBoxTiposReportesCobrarControlCarterasGenerales = jComboBoxTiposReportesCobrarControlCarterasGenerales;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCobrarControlCarterasGenerales() {
	//	return jComboBoxTiposReportesDinamicoCobrarControlCarterasGenerales;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCobrarControlCarterasGenerales(
	//		JComboBox jComboBoxTiposReportesDinamicoCobrarControlCarterasGenerales) {
	//	this.jComboBoxTiposReportesDinamicoCobrarControlCarterasGenerales = jComboBoxTiposReportesDinamicoCobrarControlCarterasGenerales;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCobrarControlCarterasGenerales() {
	//	return jComboBoxTiposArchivosReportesDinamicoCobrarControlCarterasGenerales;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCobrarControlCarterasGenerales(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarControlCarterasGenerales) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCobrarControlCarterasGenerales = jComboBoxTiposArchivosReportesDinamicoCobrarControlCarterasGenerales;
	//}
	
	public void setBorderResaltarTiposReportesCobrarControlCarterasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarControlCarterasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCobrarControlCarterasGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCobrarControlCarterasGenerales() {
		return this.jComboBoxTiposGraficosReportesCobrarControlCarterasGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCobrarControlCarterasGenerales(
			JComboBox jComboBoxTiposGraficosReportesCobrarControlCarterasGenerales) {
		this.jComboBoxTiposGraficosReportesCobrarControlCarterasGenerales = jComboBoxTiposGraficosReportesCobrarControlCarterasGenerales;
	}
	
	public void setBorderResaltarTiposGraficosReportesCobrarControlCarterasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarControlCarterasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCobrarControlCarterasGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCobrarControlCarterasGenerales() {
		return this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCobrarControlCarterasGenerales(
			JComboBox jComboBoxTiposPaginacionCobrarControlCarterasGenerales) {
		this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales = jComboBoxTiposPaginacionCobrarControlCarterasGenerales;
	}
	
	public void setBorderResaltarTiposPaginacionCobrarControlCarterasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarControlCarterasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCobrarControlCarterasGenerales() {
		return this.jComboBoxTiposRelacionesCobrarControlCarterasGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarControlCarterasGenerales() {
		return this.jComboBoxTiposAccionesCobrarControlCarterasGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarControlCarterasGenerales(
			JComboBox jComboBoxTiposRelacionesCobrarControlCarterasGenerales) {
		this.jComboBoxTiposRelacionesCobrarControlCarterasGenerales = jComboBoxTiposRelacionesCobrarControlCarterasGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarControlCarterasGenerales(
			JComboBox jComboBoxTiposAccionesCobrarControlCarterasGenerales) {
		this.jComboBoxTiposAccionesCobrarControlCarterasGenerales = jComboBoxTiposAccionesCobrarControlCarterasGenerales;
	}
	
	public void setBorderResaltarTiposRelacionesCobrarControlCarterasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarControlCarterasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCobrarControlCarterasGenerales .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCobrarControlCarterasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarControlCarterasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCobrarControlCarterasGenerales .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCobrarControlCarterasGenerales() {
	//	return jCheckBoxConGraficoDinamicoCobrarControlCarterasGenerales;
	//}

	//public void setjCheckBoxConGraficoDinamicoCobrarControlCarterasGenerales(
	//		JCheckBox jCheckBoxConGraficoDinamicoCobrarControlCarterasGenerales) {
	//	this.jCheckBoxConGraficoDinamicoCobrarControlCarterasGenerales = jCheckBoxConGraficoDinamicoCobrarControlCarterasGenerales;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCobrarControlCarterasGenerales() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCobrarControlCarterasGenerales.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCobrarControlCarterasGenerales .setBorder(borderResaltar);		
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
		this.cobrarcontrolcarterasgeneralesSessionBean=new CobrarControlCarterasGeneralesSessionBean();
		
		this.cobrarcontrolcarterasgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarcontrolcarterasgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CobrarControlCarterasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CobrarControlCarterasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarControlCarterasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarControlCarterasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarControlCarterasGeneralesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Control Carteras Generales MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
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
		
		CobrarControlCarterasGeneralesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CobrarControlCarterasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCobrarControlCarterasGenerales= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCobrarControlCarterasGenerales,this.jTtoolBarCobrarControlCarterasGenerales,
							"nuevo","nuevo","Nuevo"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCobrarControlCarterasGenerales,this.jTtoolBarCobrarControlCarterasGenerales,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCobrarControlCarterasGenerales,this.jTtoolBarCobrarControlCarterasGenerales,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCobrarControlCarterasGenerales,this.jTtoolBarCobrarControlCarterasGenerales,
							"duplicar","duplicar","Duplicar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCobrarControlCarterasGenerales,this.jTtoolBarCobrarControlCarterasGenerales,
							"copiar","copiar","Copiar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCobrarControlCarterasGenerales,this.jTtoolBarCobrarControlCarterasGenerales,
							"ver_form","ver_form","Ver"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarControlCarterasGenerales,this.jTtoolBarCobrarControlCarterasGenerales,
							"recargar","recargar","Buscar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarControlCarterasGenerales,this.jTtoolBarCobrarControlCarterasGenerales,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarControlCarterasGenerales,this.jTtoolBarCobrarControlCarterasGenerales,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCobrarControlCarterasGenerales,this.jTtoolBarCobrarControlCarterasGenerales,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCobrarControlCarterasGenerales,this.jTtoolBarCobrarControlCarterasGenerales,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCobrarControlCarterasGenerales,this.jTtoolBarCobrarControlCarterasGenerales,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCobrarControlCarterasGenerales,this.jTtoolBarCobrarControlCarterasGenerales,
							"cerrar","cerrar","Salir"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCobrarControlCarterasGenerales=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCobrarControlCarterasGenerales;
			
				this.jButtonProcesarInformacionToolBarCobrarControlCarterasGenerales=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCobrarControlCarterasGenerales;
				
		//protected JButton jButtonModificarToolBarCobrarControlCarterasGenerales;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCobrarControlCarterasGenerales=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCobrarControlCarterasGenerales=new JMenuMe("General");
		this.jmenuArchivoCobrarControlCarterasGenerales=new JMenuMe("Archivo");
		this.jmenuAccionesCobrarControlCarterasGenerales=new JMenuMe("Acciones");
		this.jmenuDatosCobrarControlCarterasGenerales=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarControlCarterasGenerales= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarControlCarterasGenerales.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarControlCarterasGenerales,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCobrarControlCarterasGenerales= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCobrarControlCarterasGenerales.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCobrarControlCarterasGenerales,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCobrarControlCarterasGenerales= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCobrarControlCarterasGenerales.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCobrarControlCarterasGenerales,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCobrarControlCarterasGenerales= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarControlCarterasGenerales.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarControlCarterasGenerales,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCobrarControlCarterasGenerales= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCobrarControlCarterasGenerales.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCobrarControlCarterasGenerales,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCobrarControlCarterasGenerales= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCobrarControlCarterasGenerales.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCobrarControlCarterasGenerales,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCobrarControlCarterasGenerales= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCobrarControlCarterasGenerales.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCobrarControlCarterasGenerales,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarControlCarterasGenerales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarControlCarterasGenerales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarControlCarterasGenerales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCobrarControlCarterasGenerales= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCobrarControlCarterasGenerales.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCobrarControlCarterasGenerales,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCobrarControlCarterasGenerales= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCobrarControlCarterasGenerales.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCobrarControlCarterasGenerales,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCobrarControlCarterasGenerales= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCobrarControlCarterasGenerales.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCobrarControlCarterasGenerales,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCobrarControlCarterasGenerales= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCobrarControlCarterasGenerales.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCobrarControlCarterasGenerales,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCobrarControlCarterasGenerales= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCobrarControlCarterasGenerales.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCobrarControlCarterasGenerales,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarControlCarterasGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarControlCarterasGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarControlCarterasGenerales,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCobrarControlCarterasGenerales= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCobrarControlCarterasGenerales.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCobrarControlCarterasGenerales,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarControlCarterasGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarControlCarterasGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarControlCarterasGenerales,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCobrarControlCarterasGenerales= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCobrarControlCarterasGenerales.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCobrarControlCarterasGenerales,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCobrarControlCarterasGenerales.add(this.jMenuItemCerrarCobrarControlCarterasGenerales);
			
			this.jmenuAccionesCobrarControlCarterasGenerales.add(this.jMenuItemNuevoCobrarControlCarterasGenerales);
			this.jmenuAccionesCobrarControlCarterasGenerales.add(this.jMenuItemNuevoGuardarCambiosCobrarControlCarterasGenerales);
			this.jmenuAccionesCobrarControlCarterasGenerales.add(this.jMenuItemNuevoRelacionesCobrarControlCarterasGenerales);
			this.jmenuAccionesCobrarControlCarterasGenerales.add(this.jMenuItemGuardarCambiosTablaCobrarControlCarterasGenerales);		
			this.jmenuAccionesCobrarControlCarterasGenerales.add(this.jMenuItemDuplicarCobrarControlCarterasGenerales);		
			this.jmenuAccionesCobrarControlCarterasGenerales.add(this.jMenuItemCopiarCobrarControlCarterasGenerales);		
			this.jmenuAccionesCobrarControlCarterasGenerales.add(this.jMenuItemVerFormCobrarControlCarterasGenerales);		
			
			this.jmenuDatosCobrarControlCarterasGenerales.add(this.jMenuItemRecargarInformacionCobrarControlCarterasGenerales);				
			this.jmenuDatosCobrarControlCarterasGenerales.add(this.jMenuItemAnterioresCobrarControlCarterasGenerales);				
			this.jmenuDatosCobrarControlCarterasGenerales.add(this.jMenuItemSiguientesCobrarControlCarterasGenerales);				
			this.jmenuDatosCobrarControlCarterasGenerales.add(this.jMenuItemAbrirOrderByCobrarControlCarterasGenerales);				
			this.jmenuDatosCobrarControlCarterasGenerales.add(this.jMenuItemMostrarOcultarCobrarControlCarterasGenerales);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCobrarControlCarterasGenerales.add(this.jMenuItemGuardarCambiosCobrarControlCarterasGenerales);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCobrarControlCarterasGenerales.add(this.jmenuArchivoCobrarControlCarterasGenerales);		
			this.jmenuBarCobrarControlCarterasGenerales.add(this.jmenuAccionesCobrarControlCarterasGenerales);		
			this.jmenuBarCobrarControlCarterasGenerales.add(this.jmenuDatosCobrarControlCarterasGenerales);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCobrarControlCarterasGenerales);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCobrarControlCarterasGenerales() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.setToolTipText("Buscar Por Fecha Emision Hasta ");
		this.jButtonBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales= new JButtonMe();
		this.jButtonBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.setText("Buscar");
		this.jButtonBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.setToolTipText("Buscar Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales,"buscar_button","Buscar Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasCobrarControlCarterasGenerales=new JTabbedPane();


		this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCobrarControlCarterasGenerales = new CobrarControlCarterasGeneralesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cobrar Control Carteras Generales DATOS");
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales = new CobrarControlCarterasGeneralesDetalleFormJInternalFrame(jDesktopPane,this.cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones(),this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales = null;//new CobrarControlCarterasGeneralesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarControlCarterasGenerales= new GridBagLayout();
		
		
		this.jTableDatosCobrarControlCarterasGenerales = new JTableMe();      
		
		String sToolTipCobrarControlCarterasGenerales="";
		sToolTipCobrarControlCarterasGenerales=CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarControlCarterasGenerales+="(Cartera.CobrarControlCarterasGenerales)";
		}
		
		if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarControlCarterasGenerales+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCobrarControlCarterasGenerales.setToolTipText(sToolTipCobrarControlCarterasGenerales);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCobrarControlCarterasGenerales);
		this.jTableDatosCobrarControlCarterasGenerales.setAutoCreateRowSorter(true);
		this.jTableDatosCobrarControlCarterasGenerales.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCobrarControlCarterasGenerales.setRowSelectionAllowed(true);
		this.jTableDatosCobrarControlCarterasGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonDuplicarCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonCopiarCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonVerFormCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonNuevoRelacionesCobrarControlCarterasGenerales = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonCerrarCobrarControlCarterasGenerales = new JButtonMe();
		
		this.jScrollPanelDatosCobrarControlCarterasGenerales = new JScrollPane();   
        this.jScrollPanelDatosGeneralCobrarControlCarterasGenerales = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCobrarControlCarterasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Control Carteras Generales";
		
		if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Control Carteras Generaleses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarControlCarterasGenerales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarControlCarterasGenerales.setToolTipText("Acciones");
        this.jPanelAccionesCobrarControlCarterasGenerales.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales=new ReporteDinamicoJInternalFrame(CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCobrarControlCarterasGenerales();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCobrarControlCarterasGenerales=new ImportacionJInternalFrame(CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCobrarControlCarterasGenerales();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCobrarControlCarterasGenerales = new JButtonMe();
		
		this.jButtonAbrirOrderByCobrarControlCarterasGenerales.setText("Orden");
		this.jButtonAbrirOrderByCobrarControlCarterasGenerales.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarControlCarterasGenerales,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCobrarControlCarterasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarControlCarterasGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarControlCarterasGenerales,false,this);
			
			//this.cargarOrderByCobrarControlCarterasGenerales(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarControlCarterasGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarControlCarterasGenerales,true,this);
			
			//this.cargarOrderByCobrarControlCarterasGenerales(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCobrarControlCarterasGenerales.setMinimumSize(new Dimension(400,50));//2130
		this.jTableDatosCobrarControlCarterasGenerales.setMaximumSize(new Dimension(400,50));//2130
		this.jTableDatosCobrarControlCarterasGenerales.setPreferredSize(new Dimension(400,50));//2130
		
		this.jScrollPanelDatosCobrarControlCarterasGenerales.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarControlCarterasGenerales.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarControlCarterasGenerales.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCobrarControlCarterasGenerales.setText("Nuevo");
		this.jButtonDuplicarCobrarControlCarterasGenerales.setText("Duplicar");
		this.jButtonCopiarCobrarControlCarterasGenerales.setText("Copiar");
		this.jButtonVerFormCobrarControlCarterasGenerales.setText("Ver");
		this.jButtonNuevoRelacionesCobrarControlCarterasGenerales.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales.setText("Guardar");
		this.jButtonCerrarCobrarControlCarterasGenerales.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarControlCarterasGenerales,"nuevo_button","Nuevo",this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCobrarControlCarterasGenerales,"duplicar_button","Duplicar",this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCobrarControlCarterasGenerales,"copiar_button","Copiar",this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCobrarControlCarterasGenerales,"ver_form","Ver",this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCobrarControlCarterasGenerales,"nuevorelaciones_button","Nuevo Rel",this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales,"guardarcambiostabla_button","Guardar",this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarControlCarterasGenerales,"cerrar_button","Salir",this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCobrarControlCarterasGenerales.setToolTipText("Nuevo"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCobrarControlCarterasGenerales.setToolTipText("Duplicar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCobrarControlCarterasGenerales.setToolTipText("Copiar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCobrarControlCarterasGenerales.setToolTipText("Ver"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCobrarControlCarterasGenerales.setToolTipText("Nuevo Rel"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales.setToolTipText("Guardar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarControlCarterasGenerales.setToolTipText("Salir"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarControlCarterasGenerales";
		inputMap = this.jButtonNuevoCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarControlCarterasGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarControlCarterasGenerales"));
		
		//DUPLICAR
		sMapKey = "DuplicarCobrarControlCarterasGenerales";
		inputMap = this.jButtonDuplicarCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCobrarControlCarterasGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCobrarControlCarterasGenerales"));
		
		//COPIAR
		sMapKey = "CopiarCobrarControlCarterasGenerales";
		inputMap = this.jButtonCopiarCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCobrarControlCarterasGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCobrarControlCarterasGenerales"));
		
		//VEr FORM
		sMapKey = "VerFormCobrarControlCarterasGenerales";
		inputMap = this.jButtonVerFormCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCobrarControlCarterasGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCobrarControlCarterasGenerales"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCobrarControlCarterasGenerales";
		inputMap = this.jButtonNuevoRelacionesCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCobrarControlCarterasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCobrarControlCarterasGenerales"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCobrarControlCarterasGenerales";
		inputMap = this.jButtonModificarCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCobrarControlCarterasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCobrarControlCarterasGenerales"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCobrarControlCarterasGenerales";
		inputMap = this.jButtonCerrarCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarControlCarterasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarControlCarterasGenerales"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarControlCarterasGenerales";
		inputMap = this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarControlCarterasGenerales"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCobrarControlCarterasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCobrarControlCarterasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCobrarControlCarterasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CobrarControlCarterasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CobrarControlCarterasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CobrarControlCarterasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CobrarControlCarterasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CobrarControlCarterasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCobrarControlCarterasGenerales.setName("jPanelParametrosReportesCobrarControlCarterasGenerales"); 
		
		this.jPanelParametrosReportesAccionesCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCobrarControlCarterasGenerales.setName("jPanelParametrosReportesAccionesCobrarControlCarterasGenerales"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonRecargarInformacionCobrarControlCarterasGenerales.setText("Buscar");
		this.jButtonRecargarInformacionCobrarControlCarterasGenerales.setToolTipText("Buscar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCobrarControlCarterasGenerales,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCobrarControlCarterasGenerales.setVisible(false);
		
		
		this.jButtonProcesarInformacionCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonProcesarInformacionCobrarControlCarterasGenerales.setText("Procesar");
		this.jButtonProcesarInformacionCobrarControlCarterasGenerales.setToolTipText("Procesar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCobrarControlCarterasGenerales.setVisible(false);
			
		this.jButtonProcesarInformacionCobrarControlCarterasGenerales.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarControlCarterasGenerales.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarControlCarterasGenerales.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCobrarControlCarterasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales.setText("TIPO");       
		this.jComboBoxTiposReportesCobrarControlCarterasGenerales.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCobrarControlCarterasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCobrarControlCarterasGenerales.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales.setText("Paginacion");
		this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCobrarControlCarterasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCobrarControlCarterasGenerales.setText("Accion");
		this.jComboBoxTiposRelacionesCobrarControlCarterasGenerales.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCobrarControlCarterasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setText("Accion");
		this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales.setText("Accion");
		this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCobrarControlCarterasGenerales=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCobrarControlCarterasGenerales.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarControlCarterasGenerales.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarControlCarterasGenerales.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCobrarControlCarterasGenerales = new JLabelMe();
		
		this.jLabelAccionesCobrarControlCarterasGenerales.setText("Acciones");		
		this.jLabelAccionesCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCobrarControlCarterasGenerales = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCobrarControlCarterasGenerales.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCobrarControlCarterasGenerales.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCobrarControlCarterasGenerales = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCobrarControlCarterasGenerales.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCobrarControlCarterasGenerales.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCobrarControlCarterasGenerales = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCobrarControlCarterasGenerales.setText("Graf.");
		this.jCheckBoxConGraficoReporteCobrarControlCarterasGenerales.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCobrarControlCarterasGenerales = new JButtonMe();
		//this.jButtonAnterioresCobrarControlCarterasGenerales.setText("<<");
        this.jButtonAnterioresCobrarControlCarterasGenerales.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCobrarControlCarterasGenerales,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCobrarControlCarterasGenerales = new JButtonMe();
		//this.jButtonSiguientesCobrarControlCarterasGenerales.setText(">>");
        this.jButtonSiguientesCobrarControlCarterasGenerales.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCobrarControlCarterasGenerales,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCobrarControlCarterasGenerales.setText("Nue");
        this.jButtonNuevoGuardarCambiosCobrarControlCarterasGenerales.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCobrarControlCarterasGenerales,"nuevoguardarcambios_button","Nue",this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCobrarControlCarterasGenerales";
		inputMap = this.jButtonNuevoGuardarCambiosCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCobrarControlCarterasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCobrarControlCarterasGenerales"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCobrarControlCarterasGenerales";
		inputMap = this.jButtonRecargarInformacionCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCobrarControlCarterasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCobrarControlCarterasGenerales"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCobrarControlCarterasGenerales";
		inputMap = this.jButtonSiguientesCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCobrarControlCarterasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCobrarControlCarterasGenerales"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCobrarControlCarterasGenerales";
		inputMap = this.jButtonAnterioresCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCobrarControlCarterasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCobrarControlCarterasGenerales"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCobrarControlCarterasGenerales();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCobrarControlCarterasGenerales.setMinimumSize(new Dimension(this.getWidth(),CobrarControlCarterasGeneralesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarControlCarterasGeneralesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarControlCarterasGenerales.setMaximumSize(new Dimension(this.getWidth(),CobrarControlCarterasGeneralesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarControlCarterasGeneralesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarControlCarterasGenerales.setPreferredSize(new Dimension(this.getWidth(),CobrarControlCarterasGeneralesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarControlCarterasGeneralesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCobrarControlCarterasGenerales = new GridBagLayout();

			this.jPanelPaginacionCobrarControlCarterasGenerales.setLayout(gridaBagLayoutPaginacionCobrarControlCarterasGenerales);						
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCobrarControlCarterasGenerales.add(this.jButtonAnterioresCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
					
						
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
			
			this.jPanelPaginacionCobrarControlCarterasGenerales.add(this.jButtonNuevoGuardarCambiosCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
						
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
			this.jPanelPaginacionCobrarControlCarterasGenerales.add(this.jButtonSiguientesCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 1;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarControlCarterasGenerales.add(this.jButtonNuevoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
						
			
			
			if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
				this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 1;
				this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCobrarControlCarterasGenerales.add(this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
			}
			
			
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 1;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarControlCarterasGenerales.add(this.jButtonDuplicarCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 1;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarControlCarterasGenerales.add(this.jButtonCopiarCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 1;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarControlCarterasGenerales.add(this.jButtonVerFormCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 1;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCobrarControlCarterasGenerales.add(this.jButtonCerrarCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
		
		
		this.jButtonRecargarInformacionCobrarControlCarterasGenerales.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarControlCarterasGenerales.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarControlCarterasGenerales.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCobrarControlCarterasGenerales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarControlCarterasGenerales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarControlCarterasGenerales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCobrarControlCarterasGenerales.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarControlCarterasGenerales.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarControlCarterasGenerales.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCobrarControlCarterasGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarControlCarterasGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarControlCarterasGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCobrarControlCarterasGenerales.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarControlCarterasGenerales.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarControlCarterasGenerales.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCobrarControlCarterasGenerales.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarControlCarterasGenerales.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarControlCarterasGenerales.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCobrarControlCarterasGenerales.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarControlCarterasGenerales.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarControlCarterasGenerales.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCobrarControlCarterasGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCobrarControlCarterasGenerales = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CobrarControlCarterasGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CobrarControlCarterasGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CobrarControlCarterasGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CobrarControlCarterasGenerales = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCobrarControlCarterasGenerales.setLayout(gridaBagParametrosReportesCobrarControlCarterasGenerales);
			this.jPanelParametrosReportesAccionesCobrarControlCarterasGenerales.setLayout(gridaBagParametrosReportesAccionesCobrarControlCarterasGenerales);
			
			
			this.jPanelParametrosAuxiliar1CobrarControlCarterasGenerales.setLayout(gridaBagParametrosAuxiliar1CobrarControlCarterasGenerales);
			this.jPanelParametrosAuxiliar2CobrarControlCarterasGenerales.setLayout(gridaBagParametrosAuxiliar2CobrarControlCarterasGenerales);
			this.jPanelParametrosAuxiliar3CobrarControlCarterasGenerales.setLayout(gridaBagParametrosAuxiliar3CobrarControlCarterasGenerales);
			this.jPanelParametrosAuxiliar4CobrarControlCarterasGenerales.setLayout(gridaBagParametrosAuxiliar4CobrarControlCarterasGenerales);
			//this.jPanelParametrosAuxiliar5CobrarControlCarterasGenerales.setLayout(gridaBagParametrosAuxiliar2CobrarControlCarterasGenerales);			
			
			
			
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarControlCarterasGenerales.add(this.jButtonRecargarInformacionCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarControlCarterasGenerales.add(this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarControlCarterasGenerales.add(this.jCheckBoxConAltoMaximoTablaCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarControlCarterasGenerales.add(this.jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarControlCarterasGenerales.add(this.jPanelParametrosAuxiliar1CobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CobrarControlCarterasGenerales.add(this.jComboBoxTiposReportesCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);																		
			
			
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CobrarControlCarterasGenerales.add(this.jComboBoxTiposGraficosReportesCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarControlCarterasGenerales.add(this.jPanelParametrosAuxiliar4CobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarControlCarterasGenerales.add(this.jComboBoxTiposReportesCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarControlCarterasGenerales.add(this.jCheckBoxGenerarReporteCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarControlCarterasGenerales.add(this.jPanelParametrosAuxiliar2CobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarControlCarterasGenerales.add(this.jLabelAccionesCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
				this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCobrarControlCarterasGenerales.add(this.jButtonAbrirOrderByCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarControlCarterasGenerales.add(this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);			
			
			
			/*
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarControlCarterasGenerales.add(this.jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarControlCarterasGenerales.add(this.jCheckBoxConGraficoReporteCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarControlCarterasGenerales.add(this.jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);															
				
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarControlCarterasGenerales.add(this.jCheckBoxSeleccionadosCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);															
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarControlCarterasGenerales.add(this.jCheckBoxConGraficoReporteCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarControlCarterasGenerales.add(this.jPanelParametrosAuxiliar3CobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarControlCarterasGenerales.add(this.jComboBoxTiposAccionesCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCobrarControlCarterasGenerales = new GridBagLayout();

			this.jScrollPanelDatosCobrarControlCarterasGenerales.setLayout(gridaBagLayoutDatosCobrarControlCarterasGenerales);
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
			
			this.jScrollPanelDatosCobrarControlCarterasGenerales.add(this.jTableDatosCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCobrarControlCarterasGenerales.setViewportView(this.jTableDatosCobrarControlCarterasGenerales);
		this.jTableDatosCobrarControlCarterasGenerales.setFillsViewportHeight(true);
		this.jTableDatosCobrarControlCarterasGenerales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCobrarControlCarterasGenerales= new GridBagLayout();
		this.jPanelAccionesCobrarControlCarterasGenerales.setLayout(gridaBagLayoutAccionesCobrarControlCarterasGenerales);
		
		
		/*	
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
			
		this.jPanelAccionesCobrarControlCarterasGenerales.add(this.jButtonNuevoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales= new GridBagLayout();
		gridaBagLayoutBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.setLayout(gridaBagLayoutBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales);

		gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
		jPanelBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.add(jLabelfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales, gridBagConstraintsCobrarControlCarterasGenerales);

		gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
		jPanelBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.add(jDateChooserfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales, gridBagConstraintsCobrarControlCarterasGenerales);

		gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarControlCarterasGenerales.gridy = 1;
		gridBagConstraintsCobrarControlCarterasGenerales.gridx =1;
		jPanelBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.add(jButtonBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales, gridBagConstraintsCobrarControlCarterasGenerales);

		jTabbedPaneBusquedasCobrarControlCarterasGenerales.addTab("1.-Por Fecha Emision Hasta ", jPanelBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales);
		jTabbedPaneBusquedasCobrarControlCarterasGenerales.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarControlCarterasGenerales);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();						
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;		
			//this.gridBagConstraintsCobrarControlCarterasGenerales.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;		
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCobrarControlCarterasGenerales);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;		
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);								
		
		
		/*
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		*/		
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarControlCarterasGenerales.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
				
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CobrarControlCarterasGeneralesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCobrarControlCarterasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarControlCarterasGenerales = new GridBagLayout();
			this.jPanelBusquedasParametrosCobrarControlCarterasGenerales.setLayout(gridaBagLayoutBusquedasParametrosCobrarControlCarterasGenerales);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCobrarControlCarterasGenerales=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarControlCarterasGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarControlCarterasGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarControlCarterasGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
			
			
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
			
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCobrarControlCarterasGenerales;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCobrarControlCarterasGenerales() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCobrarControlCarterasGenerales = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.setName("jPanelReporteDinamicoCobrarControlCarterasGenerales"); 
		
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.setLayout(gridaBagLayoutReporteDinamicoCobrarControlCarterasGenerales);
		
		
		this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCobrarControlCarterasGenerales = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarControlCarterasGenerales= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setResizable(true);
	    this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setClosable(true);
	    this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Control Carteras Generaleses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCobrarControlCarterasGenerales = new JLabelMe();

		this.jLabelColumnasSelectReporteCobrarControlCarterasGenerales.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jLabelColumnasSelectReporteCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCobrarControlCarterasGenerales = new JList<Reporte>();
		this.jListColumnasSelectReporteCobrarControlCarterasGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCobrarControlCarterasGenerales.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCobrarControlCarterasGenerales.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarControlCarterasGenerales.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarControlCarterasGenerales.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCobrarControlCarterasGenerales=new JScrollPane(this.jListColumnasSelectReporteCobrarControlCarterasGenerales);
			
			this.jScrollColumnasSelectReporteCobrarControlCarterasGenerales.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarControlCarterasGenerales.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarControlCarterasGenerales.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jListColumnasSelectReporteCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jScrollColumnasSelectReporteCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCobrarControlCarterasGenerales = new JLabelMe();

		this.jLabelRelacionesSelectReporteCobrarControlCarterasGenerales.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCobrarControlCarterasGenerales = new JList<Reporte>();
		this.jListRelacionesSelectReporteCobrarControlCarterasGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCobrarControlCarterasGenerales.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCobrarControlCarterasGenerales.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarControlCarterasGenerales.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarControlCarterasGenerales.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCobrarControlCarterasGenerales=new JScrollPane(this.jListRelacionesSelectReporteCobrarControlCarterasGenerales);
			
			this.jScrollRelacionesSelectReporteCobrarControlCarterasGenerales.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarControlCarterasGenerales.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarControlCarterasGenerales.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCobrarControlCarterasGenerales = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCobrarControlCarterasGenerales = new JComboBoxMe();
		this.jListColumnasValoresGraficoCobrarControlCarterasGenerales = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCobrarControlCarterasGenerales = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCobrarControlCarterasGenerales.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCobrarControlCarterasGenerales = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarControlCarterasGenerales.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCobrarControlCarterasGenerales = new JLabelMe();

		this.jLabelConGraficoDinamicoCobrarControlCarterasGenerales.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jLabelConGraficoDinamicoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCobrarControlCarterasGenerales = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCobrarControlCarterasGenerales.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCobrarControlCarterasGenerales.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jCheckBoxConGraficoDinamicoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCobrarControlCarterasGenerales = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCobrarControlCarterasGenerales.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jLabelColumnaCategoriaGraficoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCobrarControlCarterasGenerales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarControlCarterasGenerales.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCobrarControlCarterasGenerales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jComboBoxColumnaCategoriaGraficoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCobrarControlCarterasGenerales = new JLabelMe();

		this.jLabelColumnaCategoriaValorCobrarControlCarterasGenerales.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jLabelColumnaCategoriaValorCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCobrarControlCarterasGenerales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCobrarControlCarterasGenerales.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCobrarControlCarterasGenerales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCobrarControlCarterasGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarControlCarterasGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarControlCarterasGenerales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jComboBoxColumnaCategoriaValorCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCobrarControlCarterasGenerales = new JLabelMe();

		this.jLabelColumnasValoresGraficoCobrarControlCarterasGenerales.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jLabelColumnasValoresGraficoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCobrarControlCarterasGenerales = new JList<Reporte>();
		this.jListColumnasValoresGraficoCobrarControlCarterasGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCobrarControlCarterasGenerales.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCobrarControlCarterasGenerales=new JScrollPane(this.jListColumnasValoresGraficoCobrarControlCarterasGenerales);
			
			this.jScrollColumnasValoresGraficoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jListColumnasSelectReporteCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jScrollColumnasValoresGraficoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCobrarControlCarterasGenerales = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCobrarControlCarterasGenerales.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jLabelTiposGraficosReportesDinamicoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCobrarControlCarterasGenerales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarControlCarterasGenerales.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCobrarControlCarterasGenerales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jComboBoxTiposGraficosReportesDinamicoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCobrarControlCarterasGenerales = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCobrarControlCarterasGenerales.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jLabelGenerarExcelReporteDinamicoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCobrarControlCarterasGenerales.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCobrarControlCarterasGenerales,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCobrarControlCarterasGenerales.setToolTipText("Generar EXCEL"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jButtonGenerarExcelReporteDinamicoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jComboBoxTiposReportesDinamicoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCobrarControlCarterasGenerales = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCobrarControlCarterasGenerales.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jLabelTiposArchivoReporteDinamicoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jComboBoxTiposArchivosReportesDinamicoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCobrarControlCarterasGenerales.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCobrarControlCarterasGenerales,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCobrarControlCarterasGenerales.setToolTipText("Generar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jButtonGenerarReporteDinamicoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCobrarControlCarterasGenerales.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCobrarControlCarterasGenerales,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCobrarControlCarterasGenerales.setToolTipText("Cancelar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarControlCarterasGenerales.add(this.jButtonCerrarReporteDinamicoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCobrarControlCarterasGenerales = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCobrarControlCarterasGenerales= new JScrollPane(jPanelReporteDinamicoCobrarControlCarterasGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Control Carteras Generaleses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCobrarControlCarterasGenerales);
		this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getContentPane().add(this.jScrollPanelReporteDinamicoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCobrarControlCarterasGenerales() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCobrarControlCarterasGenerales = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCobrarControlCarterasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCobrarControlCarterasGenerales.setName("jPanelImportacionCobrarControlCarterasGenerales"); 
		
		this.jPanelImportacionCobrarControlCarterasGenerales.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarControlCarterasGenerales.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarControlCarterasGenerales.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCobrarControlCarterasGenerales.setLayout(gridaBagLayoutImportacionCobrarControlCarterasGenerales);
		
		
		this.jInternalFrameImportacionCobrarControlCarterasGenerales= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCobrarControlCarterasGenerales= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCobrarControlCarterasGenerales = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarControlCarterasGenerales= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCobrarControlCarterasGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarControlCarterasGenerales.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarControlCarterasGenerales.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCobrarControlCarterasGenerales.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarControlCarterasGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarControlCarterasGenerales.setResizable(true);
	    this.jInternalFrameImportacionCobrarControlCarterasGenerales.setClosable(true);
	    this.jInternalFrameImportacionCobrarControlCarterasGenerales.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCobrarControlCarterasGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarControlCarterasGenerales.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarControlCarterasGenerales.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCobrarControlCarterasGenerales.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarControlCarterasGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarControlCarterasGenerales.setResizable(true);
	    this.jInternalFrameImportacionCobrarControlCarterasGenerales.setClosable(true);
	    this.jInternalFrameImportacionCobrarControlCarterasGenerales.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCobrarControlCarterasGenerales.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarControlCarterasGenerales.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarControlCarterasGenerales.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Control Carteras Generaleses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCobrarControlCarterasGenerales = new JLabelMe();

		this.jLabelArchivoImportacionCobrarControlCarterasGenerales.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarControlCarterasGenerales.add(this.jLabelArchivoImportacionCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCobrarControlCarterasGenerales = new JFileChooser();		
		this.jFileChooserImportacionCobrarControlCarterasGenerales.setToolTipText("ESCOGER ARCHIVO"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonAbrirImportacionCobrarControlCarterasGenerales.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCobrarControlCarterasGenerales,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCobrarControlCarterasGenerales.setToolTipText("Generar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarControlCarterasGenerales.add(this.jButtonAbrirImportacionCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCobrarControlCarterasGenerales = new JLabelMe();

		this.jLabelPathArchivoImportacionCobrarControlCarterasGenerales.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarControlCarterasGenerales.add(this.jLabelPathArchivoImportacionCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCobrarControlCarterasGenerales=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCobrarControlCarterasGenerales.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarControlCarterasGenerales.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarControlCarterasGenerales.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarControlCarterasGenerales.add(this.jTextFieldPathArchivoImportacionCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonGenerarImportacionCobrarControlCarterasGenerales.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCobrarControlCarterasGenerales,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCobrarControlCarterasGenerales.setToolTipText("Generar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarControlCarterasGenerales.add(this.jButtonGenerarImportacionCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonCerrarImportacionCobrarControlCarterasGenerales.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCobrarControlCarterasGenerales,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCobrarControlCarterasGenerales.setToolTipText("Cancelar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarControlCarterasGenerales.add(this.jButtonCerrarImportacionCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCobrarControlCarterasGenerales = new GridBagLayout();
		
		this.jScrollPanelImportacionCobrarControlCarterasGenerales= new JScrollPane(jPanelImportacionCobrarControlCarterasGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy =iPosYImportacion;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =iPosXImportacion;
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCobrarControlCarterasGenerales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCobrarControlCarterasGenerales.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCobrarControlCarterasGenerales);
		this.jInternalFrameImportacionCobrarControlCarterasGenerales.getContentPane().add(this.jScrollPanelImportacionCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCobrarControlCarterasGenerales(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCobrarControlCarterasGenerales = new JButtonMe();
			this.jButtonAbrirOrderByCobrarControlCarterasGenerales.setText("Orden");
			this.jButtonAbrirOrderByCobrarControlCarterasGenerales.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarControlCarterasGenerales,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCobrarControlCarterasGenerales";
			inputMap = this.jButtonAbrirOrderByCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCobrarControlCarterasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCobrarControlCarterasGenerales"));
		
		
			GridBagLayout gridaBagLayoutOrderByCobrarControlCarterasGenerales = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCobrarControlCarterasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCobrarControlCarterasGenerales.setName("jPanelOrderByCobrarControlCarterasGenerales"); 
			
			this.jPanelOrderByCobrarControlCarterasGenerales.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarControlCarterasGenerales.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarControlCarterasGenerales.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCobrarControlCarterasGenerales.setLayout(gridaBagLayoutOrderByCobrarControlCarterasGenerales);
			
			
			this.jTableDatosCobrarControlCarterasGeneralesOrderBy = new JTableMe();        
			this.jTableDatosCobrarControlCarterasGeneralesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCobrarControlCarterasGeneralesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCobrarControlCarterasGeneralesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCobrarControlCarterasGeneralesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCobrarControlCarterasGeneralesOrderBy.setViewportView(this.jTableDatosCobrarControlCarterasGeneralesOrderBy);
			this.jTableDatosCobrarControlCarterasGeneralesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCobrarControlCarterasGeneralesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCobrarControlCarterasGenerales= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCobrarControlCarterasGenerales= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCobrarControlCarterasGenerales = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCobrarControlCarterasGenerales= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.setTitle("Orden");
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.setResizable(true);
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.setClosable(true);
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCobrarControlCarterasGenerales.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarControlCarterasGenerales.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarControlCarterasGenerales.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Control Carteras Generaleses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCobrarControlCarterasGenerales.ipady =150;
				
			this.jPanelOrderByCobrarControlCarterasGenerales.add(jScrollPanelDatosCobrarControlCarterasGeneralesOrderBy, this.gridBagConstraintsCobrarControlCarterasGenerales);//this.jTableDatosCobrarControlCarterasGeneralesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCobrarControlCarterasGenerales = new JButtonMe();
			this.jButtonCerrarOrderByCobrarControlCarterasGenerales.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCobrarControlCarterasGenerales,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCobrarControlCarterasGenerales.setToolTipText("Cancelar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCobrarControlCarterasGenerales.add(this.jButtonCerrarOrderByCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCobrarControlCarterasGenerales = new GridBagLayout();
			
			this.jScrollPanelOrderByCobrarControlCarterasGenerales= new JScrollPane(jPanelOrderByCobrarControlCarterasGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy =iPosYOrderBy;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCobrarControlCarterasGenerales);
			
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.getContentPane().add(this.jScrollPanelOrderByCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);			
		
		} else {
			this.jButtonAbrirOrderByCobrarControlCarterasGenerales = new JButtonMe();
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
		int iWidthTableCalculado=0;//4330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCobrarControlCarterasGenerales.getRowHeight();//CobrarControlCarterasGeneralesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CobrarControlCarterasGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarControlCarterasGenerales.isSelected()) {
					iHeightTable=CobrarControlCarterasGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarControlCarterasGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarControlCarterasGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CobrarControlCarterasGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarControlCarterasGenerales.isSelected()) {
					iHeightTable=CobrarControlCarterasGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarControlCarterasGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarControlCarterasGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCobrarControlCarterasGenerales.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarControlCarterasGenerales.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarControlCarterasGenerales.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCobrarControlCarterasGenerales.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarControlCarterasGenerales.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarControlCarterasGenerales.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCobrarControlCarterasGenerales!=null && this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjTableDatosOrderBy()!=null) {
			//if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCobrarControlCarterasGenerales.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarControlCarterasGenerales.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarControlCarterasGenerales.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarcontrolcarterasgeneraless.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CobrarControlCarterasGenerales> TraerCobrarControlCarterasGeneralesBeans(List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneraless,ArrayList<Classe> classes)throws Exception {
		try {
			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneraless) {
					
				if(!(CobrarControlCarterasGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CobrarControlCarterasGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cobrarcontrolcarterasgenerales.setsDetalleGeneralEntityReporte(CobrarControlCarterasGeneralesConstantesFunciones.getCobrarControlCarterasGeneralesDescripcion(cobrarcontrolcarterasgenerales));
										
						
					
						
					
				} else  {
							
					//cobrarcontrolcarterasgenerales.setsDetalleGeneralEntityReporte(cobrarcontrolcarterasgenerales.getsDetalleGeneralEntityReporte());
										
				}
				
				//cobrarcontrolcarterasgeneralesbeans.add(cobrarcontrolcarterasgeneralesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cobrarcontrolcarterasgeneraless;
    }
	//PARA REPORTES FIN
}
