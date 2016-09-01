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
import com.bydan.erp.tesoreria.util.report.ChequesPagosAutorizadosConstantesFunciones;

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
public class ChequesPagosAutorizadosJInternalFrame extends ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarChequesPagosAutorizados;
	
	protected JMenuBar jmenuBarChequesPagosAutorizados;
	
	protected JMenu jmenuChequesPagosAutorizados;
	protected JMenu jmenuDatosChequesPagosAutorizados;
	protected JMenu jmenuArchivoChequesPagosAutorizados;
	protected JMenu jmenuAccionesChequesPagosAutorizados;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosChequesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutChequesPagosAutorizados;	
	protected GridBagConstraints gridBagConstraintsChequesPagosAutorizados;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ChequesPagosAutorizadosDetalleFormJInternalFrame jInternalFrameDetalleFormChequesPagosAutorizados;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoChequesPagosAutorizados;	
	protected ImportacionJInternalFrame jInternalFrameImportacionChequesPagosAutorizados;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ChequesPagosAutorizadosSessionBean chequespagosautorizadosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ChequesPagosAutorizados> chequespagosautorizadoss;		
	public List<ChequesPagosAutorizados> chequespagosautorizadossEliminados;	
	public List<ChequesPagosAutorizados> chequespagosautorizadossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByChequesPagosAutorizados;		
	protected JButton jButtonAbrirOrderByChequesPagosAutorizados;
	
	
	//protected JPanel jPanelOrderByChequesPagosAutorizados;
	//public JScrollPane jScrollPanelOrderByChequesPagosAutorizados;	
	//protected JButton jButtonCerrarOrderByChequesPagosAutorizados;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ChequesPagosAutorizadosLogic chequespagosautorizadosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosChequesPagosAutorizados;
	public JScrollPane jScrollPanelDatosEdicionChequesPagosAutorizados;
	public JScrollPane jScrollPanelDatosGeneralChequesPagosAutorizados;
    
	
	
	//public JScrollPane jScrollPanelDatosChequesPagosAutorizadosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoChequesPagosAutorizados;
	//public JScrollPane jScrollPanelImportacionChequesPagosAutorizados;
	
	
	
	protected JPanel jPanelAccionesChequesPagosAutorizados;
	
    protected JPanel jPanelPaginacionChequesPagosAutorizados;
    protected JPanel jPanelParametrosReportesChequesPagosAutorizados;
	protected JPanel jPanelParametrosReportesAccionesChequesPagosAutorizados;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ChequesPagosAutorizados;
	protected JPanel jPanelParametrosAuxiliar2ChequesPagosAutorizados;
	protected JPanel jPanelParametrosAuxiliar3ChequesPagosAutorizados;
	protected JPanel jPanelParametrosAuxiliar4ChequesPagosAutorizados;
	//protected JPanel jPanelParametrosAuxiliar5ChequesPagosAutorizados;
	
	
	
	//protected JPanel jPanelReporteDinamicoChequesPagosAutorizados;
	//protected JPanel jPanelImportacionChequesPagosAutorizados;
	
	
	public JTable jTableDatosChequesPagosAutorizados;
	
	
	
	//public JTable jTableDatosChequesPagosAutorizadosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoChequesPagosAutorizados;
	protected JButton jButtonDuplicarChequesPagosAutorizados;
	protected JButton jButtonCopiarChequesPagosAutorizados;
	protected JButton jButtonVerFormChequesPagosAutorizados;
	protected JButton jButtonNuevoRelacionesChequesPagosAutorizados;
	protected JButton jButtonModificarChequesPagosAutorizados;
	
    protected JButton jButtonGuardarCambiosTablaChequesPagosAutorizados;
	protected JButton jButtonCerrarChequesPagosAutorizados;
	
	
	protected JButton jButtonRecargarInformacionChequesPagosAutorizados;
	protected JButton jButtonProcesarInformacionChequesPagosAutorizados;
	
	
	protected JButton jButtonAnterioresChequesPagosAutorizados;
	protected JButton jButtonSiguientesChequesPagosAutorizados;
	protected JButton jButtonNuevoGuardarCambiosChequesPagosAutorizados;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoChequesPagosAutorizados;
	//protected JButton jButtonCerrarReporteDinamicoChequesPagosAutorizados;
	//protected JButton jButtonGenerarExcelReporteDinamicoChequesPagosAutorizados;	
	
	
	
	//protected JButton jButtonAbrirImportacionChequesPagosAutorizados;
	//protected JButton jButtonGenerarImportacionChequesPagosAutorizados;
	//protected JButton jButtonCerrarImportacionChequesPagosAutorizados;
	//protected JFileChooser jFileChooserImportacionChequesPagosAutorizados;
	//protected File fileImportacionChequesPagosAutorizados;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarChequesPagosAutorizados;
	protected JButton jButtonDuplicarToolBarChequesPagosAutorizados;
	protected JButton jButtonNuevoRelacionesToolBarChequesPagosAutorizados;
	
	
	public JButton jButtonGuardarCambiosToolBarChequesPagosAutorizados;
	protected JButton jButtonCopiarToolBarChequesPagosAutorizados;
	protected JButton jButtonVerFormToolBarChequesPagosAutorizados;
	public JButton jButtonGuardarCambiosTablaToolBarChequesPagosAutorizados;
	protected JButton jButtonMostrarOcultarTablaToolBarChequesPagosAutorizados;
	protected JButton jButtonCerrarToolBarChequesPagosAutorizados;
	
	protected JButton jButtonRecargarInformacionToolBarChequesPagosAutorizados;
	protected JButton jButtonProcesarInformacionToolBarChequesPagosAutorizados;
	protected JButton jButtonAnterioresToolBarChequesPagosAutorizados;
	protected JButton jButtonSiguientesToolBarChequesPagosAutorizados;
	protected JButton jButtonNuevoGuardarCambiosToolBarChequesPagosAutorizados;
	protected JButton jButtonAbrirOrderByToolBarChequesPagosAutorizados;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoChequesPagosAutorizados;
	protected JMenuItem jMenuItemDuplicarChequesPagosAutorizados;
	protected JMenuItem jMenuItemNuevoRelacionesChequesPagosAutorizados;
	
	
	protected JMenuItem jMenuItemGuardarCambiosChequesPagosAutorizados;
	protected JMenuItem jMenuItemCopiarChequesPagosAutorizados;
	protected JMenuItem jMenuItemVerFormChequesPagosAutorizados;
	protected JMenuItem jMenuItemGuardarCambiosTablaChequesPagosAutorizados;
	protected JMenuItem jMenuItemCerrarChequesPagosAutorizados;
	protected JMenuItem jMenuItemDetalleCerrarChequesPagosAutorizados;
	protected JMenuItem jMenuItemDetalleAbrirOrderByChequesPagosAutorizados;
	protected JMenuItem jMenuItemDetalleMostarOcultarChequesPagosAutorizados;
	
	protected JMenuItem jMenuItemRecargarInformacionChequesPagosAutorizados;
	protected JMenuItem jMenuItemProcesarInformacionChequesPagosAutorizados;
	protected JMenuItem jMenuItemAnterioresChequesPagosAutorizados;
	protected JMenuItem jMenuItemSiguientesChequesPagosAutorizados;
	protected JMenuItem jMenuItemNuevoGuardarCambiosChequesPagosAutorizados;
	protected JMenuItem jMenuItemAbrirOrderByChequesPagosAutorizados;
	protected JMenuItem jMenuItemMostrarOcultarChequesPagosAutorizados;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesChequesPagosAutorizados;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosChequesPagosAutorizados;
	protected JCheckBox jCheckBoxSeleccionadosChequesPagosAutorizados;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaChequesPagosAutorizados;
	protected JCheckBox jCheckBoxConGraficoReporteChequesPagosAutorizados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesChequesPagosAutorizados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesChequesPagosAutorizados;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoChequesPagosAutorizados;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoChequesPagosAutorizados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesChequesPagosAutorizados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionChequesPagosAutorizados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesChequesPagosAutorizados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesChequesPagosAutorizados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarChequesPagosAutorizados;
	protected JTextField jTextFieldValorCampoGeneralChequesPagosAutorizados;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteChequesPagosAutorizados;
	//public JList<Reporte> jListColumnasSelectReporteChequesPagosAutorizados;
	//public JScrollPane jScrollColumnasSelectReporteChequesPagosAutorizados;
	
	//public JLabel jLabelRelacionesSelectReporteChequesPagosAutorizados;
	//public JList<Reporte> jListRelacionesSelectReporteChequesPagosAutorizados;
	//public JScrollPane jScrollRelacionesSelectReporteChequesPagosAutorizados;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoChequesPagosAutorizados;
	//protected JCheckBox jCheckBoxConGraficoDinamicoChequesPagosAutorizados;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoChequesPagosAutorizados;
	//public JLabel jLabelTiposArchivoReporteDinamicoChequesPagosAutorizados;
	
		
	//public JLabel jLabelArchivoImportacionChequesPagosAutorizados;	
	//public JLabel jLabelPathArchivoImportacionChequesPagosAutorizados;
	//protected JTextField jTextFieldPathArchivoImportacionChequesPagosAutorizados;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoChequesPagosAutorizados;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoChequesPagosAutorizados;
	
	//public JLabel jLabelColumnaCategoriaValorChequesPagosAutorizados;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorChequesPagosAutorizados;
	
	//public JLabel jLabelColumnasValoresGraficoChequesPagosAutorizados;
	//public JList<Reporte> jListColumnasValoresGraficoChequesPagosAutorizados;
	//public JScrollPane jScrollColumnasValoresGraficoChequesPagosAutorizados;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoChequesPagosAutorizados;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoChequesPagosAutorizados;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasChequesPagosAutorizados;
	public JPanel jPanelBusquedaChequesPagosAutorizadosChequesPagosAutorizados;
	public JButton jButtonBusquedaChequesPagosAutorizadosChequesPagosAutorizados;
	
	public JPanel jPanelfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados;
	public JLabel jLabelfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados;

	public JDateChooser jDateChooserfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados;
	public JButton jButtonfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizadosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados;
	public JLabel jLabelfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados;

	public JDateChooser jDateChooserfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados;
	public JButton jButtonfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizadosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1034;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ChequesPagosAutorizadosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ChequesPagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ChequesPagosAutorizadosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ChequesPagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ChequesPagosAutorizadosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ChequesPagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ChequesPagosAutorizadosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ChequesPagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionChequesPagosAutorizados)	{
		this.jButtonRecargarInformacionChequesPagosAutorizados = jButtonRecargarInformacionChequesPagosAutorizados;
	}
	
	public JButton getjButtonProcesarInformacionChequesPagosAutorizados() {
		return this.jButtonProcesarInformacionChequesPagosAutorizados;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionChequesPagosAutorizados)	{
		this.jButtonProcesarInformacionChequesPagosAutorizados = jButtonProcesarInformacionChequesPagosAutorizados;
	}
	
	
	public JButton getjButtonRecargarInformacionChequesPagosAutorizados() {
		return this.jButtonRecargarInformacionChequesPagosAutorizados;
	}
	
	
	public List<ChequesPagosAutorizados> getchequespagosautorizadoss() {
		return this.chequespagosautorizadoss;
	}

	public void setchequespagosautorizadoss(List<ChequesPagosAutorizados> chequespagosautorizadoss) {
		this.chequespagosautorizadoss = chequespagosautorizadoss;
	}
	
	public List<ChequesPagosAutorizados> getchequespagosautorizadossAux() {
		return this.chequespagosautorizadossAux;
	}

	public void setchequespagosautorizadossAux(List<ChequesPagosAutorizados> chequespagosautorizadossAux) {
		this.chequespagosautorizadossAux = chequespagosautorizadossAux;
	}
	
	public List<ChequesPagosAutorizados> getchequespagosautorizadossEliminados() {
		return this.chequespagosautorizadossEliminados;
	}

	public void setChequesPagosAutorizadossEliminados(List<ChequesPagosAutorizados> chequespagosautorizadossEliminados) {
		this.chequespagosautorizadossEliminados = chequespagosautorizadossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarChequesPagosAutorizados() {
		return jComboBoxTiposSeleccionarChequesPagosAutorizados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarChequesPagosAutorizados(
			JComboBox jComboBoxTiposSeleccionarChequesPagosAutorizados) {
		this.jComboBoxTiposSeleccionarChequesPagosAutorizados = jComboBoxTiposSeleccionarChequesPagosAutorizados;
	}
	
	public void setBorderResaltarTiposSeleccionarChequesPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarChequesPagosAutorizados.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarChequesPagosAutorizados .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralChequesPagosAutorizados() {
		return jTextFieldValorCampoGeneralChequesPagosAutorizados;
	}

	public void setjTextFieldValorCampoGeneralChequesPagosAutorizados(
			JTextField jTextFieldValorCampoGeneralChequesPagosAutorizados) {
		this.jTextFieldValorCampoGeneralChequesPagosAutorizados = jTextFieldValorCampoGeneralChequesPagosAutorizados;
	}

	public void setBorderResaltarValorCampoGeneralChequesPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequesPagosAutorizados.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralChequesPagosAutorizados .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosChequesPagosAutorizados() {
		return this.jCheckBoxSeleccionarTodosChequesPagosAutorizados;
	}

	public void setjCheckBoxSeleccionarTodosChequesPagosAutorizados(
			JCheckBox jCheckBoxSeleccionarTodosChequesPagosAutorizados) {
		this.jCheckBoxSeleccionarTodosChequesPagosAutorizados = jCheckBoxSeleccionarTodosChequesPagosAutorizados;
	}

	public void setBorderResaltarSeleccionarTodosChequesPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequesPagosAutorizados.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosChequesPagosAutorizados .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosChequesPagosAutorizados() {
		return this.jCheckBoxSeleccionadosChequesPagosAutorizados;
	}

	public void setjCheckBoxSeleccionadosChequesPagosAutorizados(
			JCheckBox jCheckBoxSeleccionadosChequesPagosAutorizados) {
		this.jCheckBoxSeleccionadosChequesPagosAutorizados = jCheckBoxSeleccionadosChequesPagosAutorizados;
	}
	
	public void setBorderResaltarSeleccionadosChequesPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequesPagosAutorizados.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosChequesPagosAutorizados .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesChequesPagosAutorizados() {
		return this.jComboBoxTiposArchivosReportesChequesPagosAutorizados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesChequesPagosAutorizados(
			JComboBox jComboBoxTiposArchivosReportesChequesPagosAutorizados) {
		this.jComboBoxTiposArchivosReportesChequesPagosAutorizados = jComboBoxTiposArchivosReportesChequesPagosAutorizados;
	}

	public void setBorderResaltarTiposArchivosReportesChequesPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequesPagosAutorizados.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesChequesPagosAutorizados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesChequesPagosAutorizados() {
		return this.jComboBoxTiposReportesChequesPagosAutorizados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesChequesPagosAutorizados(
			JComboBox jComboBoxTiposReportesChequesPagosAutorizados) {
		this.jComboBoxTiposReportesChequesPagosAutorizados = jComboBoxTiposReportesChequesPagosAutorizados;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoChequesPagosAutorizados() {
	//	return jComboBoxTiposReportesDinamicoChequesPagosAutorizados;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoChequesPagosAutorizados(
	//		JComboBox jComboBoxTiposReportesDinamicoChequesPagosAutorizados) {
	//	this.jComboBoxTiposReportesDinamicoChequesPagosAutorizados = jComboBoxTiposReportesDinamicoChequesPagosAutorizados;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoChequesPagosAutorizados() {
	//	return jComboBoxTiposArchivosReportesDinamicoChequesPagosAutorizados;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoChequesPagosAutorizados(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoChequesPagosAutorizados) {
	//	this.jComboBoxTiposArchivosReportesDinamicoChequesPagosAutorizados = jComboBoxTiposArchivosReportesDinamicoChequesPagosAutorizados;
	//}
	
	public void setBorderResaltarTiposReportesChequesPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequesPagosAutorizados.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesChequesPagosAutorizados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesChequesPagosAutorizados() {
		return this.jComboBoxTiposGraficosReportesChequesPagosAutorizados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesChequesPagosAutorizados(
			JComboBox jComboBoxTiposGraficosReportesChequesPagosAutorizados) {
		this.jComboBoxTiposGraficosReportesChequesPagosAutorizados = jComboBoxTiposGraficosReportesChequesPagosAutorizados;
	}
	
	public void setBorderResaltarTiposGraficosReportesChequesPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequesPagosAutorizados.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesChequesPagosAutorizados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionChequesPagosAutorizados() {
		return this.jComboBoxTiposPaginacionChequesPagosAutorizados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionChequesPagosAutorizados(
			JComboBox jComboBoxTiposPaginacionChequesPagosAutorizados) {
		this.jComboBoxTiposPaginacionChequesPagosAutorizados = jComboBoxTiposPaginacionChequesPagosAutorizados;
	}
	
	public void setBorderResaltarTiposPaginacionChequesPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequesPagosAutorizados.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionChequesPagosAutorizados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesChequesPagosAutorizados() {
		return this.jComboBoxTiposRelacionesChequesPagosAutorizados;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesChequesPagosAutorizados() {
		return this.jComboBoxTiposAccionesChequesPagosAutorizados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesChequesPagosAutorizados(
			JComboBox jComboBoxTiposRelacionesChequesPagosAutorizados) {
		this.jComboBoxTiposRelacionesChequesPagosAutorizados = jComboBoxTiposRelacionesChequesPagosAutorizados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesChequesPagosAutorizados(
			JComboBox jComboBoxTiposAccionesChequesPagosAutorizados) {
		this.jComboBoxTiposAccionesChequesPagosAutorizados = jComboBoxTiposAccionesChequesPagosAutorizados;
	}
	
	public void setBorderResaltarTiposRelacionesChequesPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequesPagosAutorizados.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesChequesPagosAutorizados .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesChequesPagosAutorizados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequesPagosAutorizados.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesChequesPagosAutorizados .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoChequesPagosAutorizados() {
	//	return jCheckBoxConGraficoDinamicoChequesPagosAutorizados;
	//}

	//public void setjCheckBoxConGraficoDinamicoChequesPagosAutorizados(
	//		JCheckBox jCheckBoxConGraficoDinamicoChequesPagosAutorizados) {
	//	this.jCheckBoxConGraficoDinamicoChequesPagosAutorizados = jCheckBoxConGraficoDinamicoChequesPagosAutorizados;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoChequesPagosAutorizados() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarChequesPagosAutorizados.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoChequesPagosAutorizados .setBorder(borderResaltar);		
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
		this.chequespagosautorizadosSessionBean=new ChequesPagosAutorizadosSessionBean();
		
		this.chequespagosautorizadosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.chequespagosautorizadosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ChequesPagosAutorizadosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ChequesPagosAutorizadosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ChequesPagosAutorizadosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ChequesPagosAutorizadosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ChequesPagosAutorizadosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cheques Pagos Autorizados MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
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
		
		ChequesPagosAutorizadosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ChequesPagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarChequesPagosAutorizados= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarChequesPagosAutorizados,this.jTtoolBarChequesPagosAutorizados,
							"nuevo","nuevo","Nuevo"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarChequesPagosAutorizados,this.jTtoolBarChequesPagosAutorizados,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarChequesPagosAutorizados,this.jTtoolBarChequesPagosAutorizados,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarChequesPagosAutorizados,this.jTtoolBarChequesPagosAutorizados,
							"duplicar","duplicar","Duplicar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarChequesPagosAutorizados,this.jTtoolBarChequesPagosAutorizados,
							"copiar","copiar","Copiar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarChequesPagosAutorizados,this.jTtoolBarChequesPagosAutorizados,
							"ver_form","ver_form","Ver"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarChequesPagosAutorizados,this.jTtoolBarChequesPagosAutorizados,
							"recargar","recargar","Buscar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarChequesPagosAutorizados,this.jTtoolBarChequesPagosAutorizados,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarChequesPagosAutorizados,this.jTtoolBarChequesPagosAutorizados,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarChequesPagosAutorizados,this.jTtoolBarChequesPagosAutorizados,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarChequesPagosAutorizados,this.jTtoolBarChequesPagosAutorizados,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarChequesPagosAutorizados,this.jTtoolBarChequesPagosAutorizados,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarChequesPagosAutorizados,this.jTtoolBarChequesPagosAutorizados,
							"cerrar","cerrar","Salir"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarChequesPagosAutorizados=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarChequesPagosAutorizados;
			
				this.jButtonProcesarInformacionToolBarChequesPagosAutorizados=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarChequesPagosAutorizados;
				
		//protected JButton jButtonModificarToolBarChequesPagosAutorizados;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarChequesPagosAutorizados=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuChequesPagosAutorizados=new JMenuMe("General");
		this.jmenuArchivoChequesPagosAutorizados=new JMenuMe("Archivo");
		this.jmenuAccionesChequesPagosAutorizados=new JMenuMe("Acciones");
		this.jmenuDatosChequesPagosAutorizados=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoChequesPagosAutorizados= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoChequesPagosAutorizados.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoChequesPagosAutorizados,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarChequesPagosAutorizados= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarChequesPagosAutorizados.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarChequesPagosAutorizados,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesChequesPagosAutorizados= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesChequesPagosAutorizados.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesChequesPagosAutorizados,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosChequesPagosAutorizados= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosChequesPagosAutorizados.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosChequesPagosAutorizados,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarChequesPagosAutorizados= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarChequesPagosAutorizados.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarChequesPagosAutorizados,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormChequesPagosAutorizados= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormChequesPagosAutorizados.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormChequesPagosAutorizados,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaChequesPagosAutorizados= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaChequesPagosAutorizados.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaChequesPagosAutorizados,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarChequesPagosAutorizados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarChequesPagosAutorizados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarChequesPagosAutorizados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionChequesPagosAutorizados= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionChequesPagosAutorizados.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionChequesPagosAutorizados,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionChequesPagosAutorizados= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionChequesPagosAutorizados.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionChequesPagosAutorizados,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresChequesPagosAutorizados= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresChequesPagosAutorizados.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresChequesPagosAutorizados,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesChequesPagosAutorizados= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesChequesPagosAutorizados.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesChequesPagosAutorizados,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByChequesPagosAutorizados= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByChequesPagosAutorizados.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByChequesPagosAutorizados,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarChequesPagosAutorizados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarChequesPagosAutorizados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarChequesPagosAutorizados,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByChequesPagosAutorizados= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByChequesPagosAutorizados.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByChequesPagosAutorizados,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarChequesPagosAutorizados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarChequesPagosAutorizados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarChequesPagosAutorizados,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosChequesPagosAutorizados= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosChequesPagosAutorizados.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosChequesPagosAutorizados,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoChequesPagosAutorizados.add(this.jMenuItemCerrarChequesPagosAutorizados);
			
			this.jmenuAccionesChequesPagosAutorizados.add(this.jMenuItemNuevoChequesPagosAutorizados);
			this.jmenuAccionesChequesPagosAutorizados.add(this.jMenuItemNuevoGuardarCambiosChequesPagosAutorizados);
			this.jmenuAccionesChequesPagosAutorizados.add(this.jMenuItemNuevoRelacionesChequesPagosAutorizados);
			this.jmenuAccionesChequesPagosAutorizados.add(this.jMenuItemGuardarCambiosTablaChequesPagosAutorizados);		
			this.jmenuAccionesChequesPagosAutorizados.add(this.jMenuItemDuplicarChequesPagosAutorizados);		
			this.jmenuAccionesChequesPagosAutorizados.add(this.jMenuItemCopiarChequesPagosAutorizados);		
			this.jmenuAccionesChequesPagosAutorizados.add(this.jMenuItemVerFormChequesPagosAutorizados);		
			
			this.jmenuDatosChequesPagosAutorizados.add(this.jMenuItemRecargarInformacionChequesPagosAutorizados);				
			this.jmenuDatosChequesPagosAutorizados.add(this.jMenuItemAnterioresChequesPagosAutorizados);				
			this.jmenuDatosChequesPagosAutorizados.add(this.jMenuItemSiguientesChequesPagosAutorizados);				
			this.jmenuDatosChequesPagosAutorizados.add(this.jMenuItemAbrirOrderByChequesPagosAutorizados);				
			this.jmenuDatosChequesPagosAutorizados.add(this.jMenuItemMostrarOcultarChequesPagosAutorizados);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesChequesPagosAutorizados.add(this.jMenuItemGuardarCambiosChequesPagosAutorizados);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarChequesPagosAutorizados.add(this.jmenuArchivoChequesPagosAutorizados);		
			this.jmenuBarChequesPagosAutorizados.add(this.jmenuAccionesChequesPagosAutorizados);		
			this.jmenuBarChequesPagosAutorizados.add(this.jmenuDatosChequesPagosAutorizados);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarChequesPagosAutorizados);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasChequesPagosAutorizados() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaChequesPagosAutorizadosChequesPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setToolTipText("Buscar Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaChequesPagosAutorizadosChequesPagosAutorizados= new JButtonMe();
		this.jButtonBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setText("Buscar");
		this.jButtonBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setToolTipText("Buscar Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaChequesPagosAutorizadosChequesPagosAutorizados,"buscar_button","Buscar Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaChequesPagosAutorizadosChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados = new JLabelMe();
		jLabelfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados= new JDateChooser();
		jDateChooserfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setDate(new Date());
		jDateChooserfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados = new JLabelMe();
		jLabelfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados= new JDateChooser();
		jDateChooserfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setDate(new Date());
		jDateChooserfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasChequesPagosAutorizados=new JTabbedPane();


		this.jTabbedPaneBusquedasChequesPagosAutorizados.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasChequesPagosAutorizados.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasChequesPagosAutorizados.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasChequesPagosAutorizados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleChequesPagosAutorizados = new ChequesPagosAutorizadosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cheques Pagos Autorizados DATOS");
			this.jInternalFrameDetalleFormChequesPagosAutorizados = new ChequesPagosAutorizadosDetalleFormJInternalFrame(jDesktopPane,this.chequespagosautorizadosSessionBean.getConGuardarRelaciones(),this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormChequesPagosAutorizados = null;//new ChequesPagosAutorizadosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutChequesPagosAutorizados= new GridBagLayout();
		
		
		this.jTableDatosChequesPagosAutorizados = new JTableMe();      
		
		String sToolTipChequesPagosAutorizados="";
		sToolTipChequesPagosAutorizados=ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipChequesPagosAutorizados+="(Tesoreria.ChequesPagosAutorizados)";
		}
		
		if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			sToolTipChequesPagosAutorizados+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosChequesPagosAutorizados.setToolTipText(sToolTipChequesPagosAutorizados);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosChequesPagosAutorizados);
		this.jTableDatosChequesPagosAutorizados.setAutoCreateRowSorter(true);
		this.jTableDatosChequesPagosAutorizados.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosChequesPagosAutorizados.setRowSelectionAllowed(true);
		this.jTableDatosChequesPagosAutorizados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoChequesPagosAutorizados = new JButtonMe();
		this.jButtonDuplicarChequesPagosAutorizados = new JButtonMe();
		this.jButtonCopiarChequesPagosAutorizados = new JButtonMe();
		this.jButtonVerFormChequesPagosAutorizados = new JButtonMe();
		this.jButtonNuevoRelacionesChequesPagosAutorizados = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaChequesPagosAutorizados = new JButtonMe();
		this.jButtonCerrarChequesPagosAutorizados = new JButtonMe();
		
		this.jScrollPanelDatosChequesPagosAutorizados = new JScrollPane();   
        this.jScrollPanelDatosGeneralChequesPagosAutorizados = new JScrollPane();
		
				
		
		
		this.jPanelAccionesChequesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cheques Pagos Autorizados";
		
		if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cheques Pagos Autorizadoses" + this.sPath));
		} else {
			this.jScrollPanelDatosChequesPagosAutorizados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesChequesPagosAutorizados.setToolTipText("Acciones");
        this.jPanelAccionesChequesPagosAutorizados.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoChequesPagosAutorizados=new ReporteDinamicoJInternalFrame(ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoChequesPagosAutorizados();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionChequesPagosAutorizados=new ImportacionJInternalFrame(ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionChequesPagosAutorizados();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByChequesPagosAutorizados = new JButtonMe();
		
		this.jButtonAbrirOrderByChequesPagosAutorizados.setText("Orden");
		this.jButtonAbrirOrderByChequesPagosAutorizados.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByChequesPagosAutorizados,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByChequesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByChequesPagosAutorizados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByChequesPagosAutorizados,false,this);
			
			//this.cargarOrderByChequesPagosAutorizados(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByChequesPagosAutorizados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByChequesPagosAutorizados,true,this);
			
			//this.cargarOrderByChequesPagosAutorizados(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosChequesPagosAutorizados.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosChequesPagosAutorizados.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosChequesPagosAutorizados.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosChequesPagosAutorizados.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosChequesPagosAutorizados.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosChequesPagosAutorizados.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoChequesPagosAutorizados.setText("Nuevo");
		this.jButtonDuplicarChequesPagosAutorizados.setText("Duplicar");
		this.jButtonCopiarChequesPagosAutorizados.setText("Copiar");
		this.jButtonVerFormChequesPagosAutorizados.setText("Ver");
		this.jButtonNuevoRelacionesChequesPagosAutorizados.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaChequesPagosAutorizados.setText("Guardar");
		this.jButtonCerrarChequesPagosAutorizados.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoChequesPagosAutorizados,"nuevo_button","Nuevo",this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarChequesPagosAutorizados,"duplicar_button","Duplicar",this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarChequesPagosAutorizados,"copiar_button","Copiar",this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormChequesPagosAutorizados,"ver_form","Ver",this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesChequesPagosAutorizados,"nuevorelaciones_button","Nuevo Rel",this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaChequesPagosAutorizados,"guardarcambiostabla_button","Guardar",this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarChequesPagosAutorizados,"cerrar_button","Salir",this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoChequesPagosAutorizados.setToolTipText("Nuevo"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarChequesPagosAutorizados.setToolTipText("Duplicar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarChequesPagosAutorizados.setToolTipText("Copiar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormChequesPagosAutorizados.setToolTipText("Ver"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesChequesPagosAutorizados.setToolTipText("Nuevo Rel"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaChequesPagosAutorizados.setToolTipText("Guardar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarChequesPagosAutorizados.setToolTipText("Salir"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoChequesPagosAutorizados";
		inputMap = this.jButtonNuevoChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoChequesPagosAutorizados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoChequesPagosAutorizados"));
		
		//DUPLICAR
		sMapKey = "DuplicarChequesPagosAutorizados";
		inputMap = this.jButtonDuplicarChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarChequesPagosAutorizados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarChequesPagosAutorizados"));
		
		//COPIAR
		sMapKey = "CopiarChequesPagosAutorizados";
		inputMap = this.jButtonCopiarChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarChequesPagosAutorizados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarChequesPagosAutorizados"));
		
		//VEr FORM
		sMapKey = "VerFormChequesPagosAutorizados";
		inputMap = this.jButtonVerFormChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormChequesPagosAutorizados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormChequesPagosAutorizados"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesChequesPagosAutorizados";
		inputMap = this.jButtonNuevoRelacionesChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesChequesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesChequesPagosAutorizados"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarChequesPagosAutorizados";
		inputMap = this.jButtonModificarChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarChequesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarChequesPagosAutorizados"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarChequesPagosAutorizados";
		inputMap = this.jButtonCerrarChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarChequesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarChequesPagosAutorizados"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaChequesPagosAutorizados";
		inputMap = this.jButtonGuardarCambiosTablaChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaChequesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaChequesPagosAutorizados"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesChequesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesChequesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionChequesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ChequesPagosAutorizados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ChequesPagosAutorizados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ChequesPagosAutorizados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ChequesPagosAutorizados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ChequesPagosAutorizados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesChequesPagosAutorizados.setName("jPanelParametrosReportesChequesPagosAutorizados"); 
		
		this.jPanelParametrosReportesAccionesChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesChequesPagosAutorizados.setName("jPanelParametrosReportesAccionesChequesPagosAutorizados"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionChequesPagosAutorizados = new JButtonMe();
		this.jButtonRecargarInformacionChequesPagosAutorizados.setText("Buscar");
		this.jButtonRecargarInformacionChequesPagosAutorizados.setToolTipText("Buscar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionChequesPagosAutorizados,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionChequesPagosAutorizados.setVisible(false);
		
		
		this.jButtonProcesarInformacionChequesPagosAutorizados = new JButtonMe();
		this.jButtonProcesarInformacionChequesPagosAutorizados.setText("Procesar");
		this.jButtonProcesarInformacionChequesPagosAutorizados.setToolTipText("Procesar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionChequesPagosAutorizados.setVisible(false);
			
		this.jButtonProcesarInformacionChequesPagosAutorizados.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionChequesPagosAutorizados.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionChequesPagosAutorizados.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesChequesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesChequesPagosAutorizados.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesChequesPagosAutorizados.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesChequesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesChequesPagosAutorizados.setText("TIPO");       
		this.jComboBoxTiposReportesChequesPagosAutorizados.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesChequesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesChequesPagosAutorizados.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesChequesPagosAutorizados.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionChequesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionChequesPagosAutorizados.setText("Paginacion");
		this.jComboBoxTiposPaginacionChequesPagosAutorizados.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesChequesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesChequesPagosAutorizados.setText("Accion");
		this.jComboBoxTiposRelacionesChequesPagosAutorizados.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesChequesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesChequesPagosAutorizados.setText("Accion");
		this.jComboBoxTiposAccionesChequesPagosAutorizados.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarChequesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarChequesPagosAutorizados.setText("Accion");
		this.jComboBoxTiposSeleccionarChequesPagosAutorizados.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralChequesPagosAutorizados=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralChequesPagosAutorizados.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralChequesPagosAutorizados.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralChequesPagosAutorizados.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesChequesPagosAutorizados = new JLabelMe();
		
		this.jLabelAccionesChequesPagosAutorizados.setText("Acciones");		
		this.jLabelAccionesChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosChequesPagosAutorizados = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosChequesPagosAutorizados.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosChequesPagosAutorizados.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosChequesPagosAutorizados = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosChequesPagosAutorizados.setText("Seleccionados");
		this.jCheckBoxSeleccionadosChequesPagosAutorizados.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaChequesPagosAutorizados = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaChequesPagosAutorizados.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaChequesPagosAutorizados.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteChequesPagosAutorizados = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteChequesPagosAutorizados.setText("Graf.");
		this.jCheckBoxConGraficoReporteChequesPagosAutorizados.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresChequesPagosAutorizados = new JButtonMe();
		//this.jButtonAnterioresChequesPagosAutorizados.setText("<<");
        this.jButtonAnterioresChequesPagosAutorizados.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresChequesPagosAutorizados,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesChequesPagosAutorizados = new JButtonMe();
		//this.jButtonSiguientesChequesPagosAutorizados.setText(">>");
        this.jButtonSiguientesChequesPagosAutorizados.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesChequesPagosAutorizados,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosChequesPagosAutorizados = new JButtonMe();
		this.jButtonNuevoGuardarCambiosChequesPagosAutorizados.setText("Nue");
        this.jButtonNuevoGuardarCambiosChequesPagosAutorizados.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosChequesPagosAutorizados,"nuevoguardarcambios_button","Nue",this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosChequesPagosAutorizados";
		inputMap = this.jButtonNuevoGuardarCambiosChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosChequesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosChequesPagosAutorizados"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionChequesPagosAutorizados";
		inputMap = this.jButtonRecargarInformacionChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionChequesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionChequesPagosAutorizados"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesChequesPagosAutorizados";
		inputMap = this.jButtonSiguientesChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesChequesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesChequesPagosAutorizados"));
		
		//ANTERIORES		
		sMapKey = "AnterioresChequesPagosAutorizados";
		inputMap = this.jButtonAnterioresChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresChequesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresChequesPagosAutorizados"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasChequesPagosAutorizados();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesChequesPagosAutorizados.setMinimumSize(new Dimension(this.getWidth(),ChequesPagosAutorizadosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ChequesPagosAutorizadosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesChequesPagosAutorizados.setMaximumSize(new Dimension(this.getWidth(),ChequesPagosAutorizadosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ChequesPagosAutorizadosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesChequesPagosAutorizados.setPreferredSize(new Dimension(this.getWidth(),ChequesPagosAutorizadosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ChequesPagosAutorizadosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionChequesPagosAutorizados = new GridBagLayout();

			this.jPanelPaginacionChequesPagosAutorizados.setLayout(gridaBagLayoutPaginacionChequesPagosAutorizados);						
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionChequesPagosAutorizados.add(this.jButtonAnterioresChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
					
						
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
			
			this.jPanelPaginacionChequesPagosAutorizados.add(this.jButtonNuevoGuardarCambiosChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
						
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
			this.jPanelPaginacionChequesPagosAutorizados.add(this.jButtonSiguientesChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = 1;
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionChequesPagosAutorizados.add(this.jButtonNuevoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
						
			
			
			if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
				this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsChequesPagosAutorizados.gridy = 1;
				this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionChequesPagosAutorizados.add(this.jButtonGuardarCambiosTablaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
			}
			
			
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = 1;
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionChequesPagosAutorizados.add(this.jButtonDuplicarChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = 1;
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionChequesPagosAutorizados.add(this.jButtonCopiarChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = 1;
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionChequesPagosAutorizados.add(this.jButtonVerFormChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = 1;
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionChequesPagosAutorizados.add(this.jButtonCerrarChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
		
		
		this.jButtonRecargarInformacionChequesPagosAutorizados.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionChequesPagosAutorizados.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionChequesPagosAutorizados.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesChequesPagosAutorizados.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesChequesPagosAutorizados.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesChequesPagosAutorizados.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesChequesPagosAutorizados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesChequesPagosAutorizados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesChequesPagosAutorizados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesChequesPagosAutorizados.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesChequesPagosAutorizados.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesChequesPagosAutorizados.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionChequesPagosAutorizados.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionChequesPagosAutorizados.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionChequesPagosAutorizados.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesChequesPagosAutorizados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesChequesPagosAutorizados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesChequesPagosAutorizados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesChequesPagosAutorizados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesChequesPagosAutorizados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesChequesPagosAutorizados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarChequesPagosAutorizados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarChequesPagosAutorizados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarChequesPagosAutorizados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaChequesPagosAutorizados.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaChequesPagosAutorizados.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaChequesPagosAutorizados.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteChequesPagosAutorizados.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteChequesPagosAutorizados.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteChequesPagosAutorizados.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosChequesPagosAutorizados.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosChequesPagosAutorizados.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosChequesPagosAutorizados.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosChequesPagosAutorizados.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosChequesPagosAutorizados.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosChequesPagosAutorizados.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesChequesPagosAutorizados = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesChequesPagosAutorizados = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ChequesPagosAutorizados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ChequesPagosAutorizados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ChequesPagosAutorizados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ChequesPagosAutorizados = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesChequesPagosAutorizados.setLayout(gridaBagParametrosReportesChequesPagosAutorizados);
			this.jPanelParametrosReportesAccionesChequesPagosAutorizados.setLayout(gridaBagParametrosReportesAccionesChequesPagosAutorizados);
			
			
			this.jPanelParametrosAuxiliar1ChequesPagosAutorizados.setLayout(gridaBagParametrosAuxiliar1ChequesPagosAutorizados);
			this.jPanelParametrosAuxiliar2ChequesPagosAutorizados.setLayout(gridaBagParametrosAuxiliar2ChequesPagosAutorizados);
			this.jPanelParametrosAuxiliar3ChequesPagosAutorizados.setLayout(gridaBagParametrosAuxiliar3ChequesPagosAutorizados);
			this.jPanelParametrosAuxiliar4ChequesPagosAutorizados.setLayout(gridaBagParametrosAuxiliar4ChequesPagosAutorizados);
			//this.jPanelParametrosAuxiliar5ChequesPagosAutorizados.setLayout(gridaBagParametrosAuxiliar2ChequesPagosAutorizados);			
			
			
			
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesChequesPagosAutorizados.add(this.jButtonRecargarInformacionChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ChequesPagosAutorizados.add(this.jComboBoxTiposPaginacionChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ChequesPagosAutorizados.add(this.jCheckBoxConAltoMaximoTablaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ChequesPagosAutorizados.add(this.jComboBoxTiposArchivosReportesChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesChequesPagosAutorizados.add(this.jPanelParametrosAuxiliar1ChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsChequesPagosAutorizados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ChequesPagosAutorizados.add(this.jComboBoxTiposReportesChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);																		
			
			
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsChequesPagosAutorizados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ChequesPagosAutorizados.add(this.jComboBoxTiposGraficosReportesChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesChequesPagosAutorizados.add(this.jPanelParametrosAuxiliar4ChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesChequesPagosAutorizados.add(this.jComboBoxTiposReportesChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesChequesPagosAutorizados.add(this.jCheckBoxGenerarReporteChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesChequesPagosAutorizados.add(this.jPanelParametrosAuxiliar2ChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsChequesPagosAutorizados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesChequesPagosAutorizados.add(this.jLabelAccionesChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
				this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsChequesPagosAutorizados.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesChequesPagosAutorizados.add(this.jButtonAbrirOrderByChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesChequesPagosAutorizados.add(this.jComboBoxTiposSeleccionarChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);			
			
			
			/*
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsChequesPagosAutorizados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesChequesPagosAutorizados.add(this.jCheckBoxSeleccionarTodosChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsChequesPagosAutorizados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesChequesPagosAutorizados.add(this.jCheckBoxConGraficoReporteChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsChequesPagosAutorizados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ChequesPagosAutorizados.add(this.jCheckBoxSeleccionarTodosChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);															
				
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsChequesPagosAutorizados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ChequesPagosAutorizados.add(this.jCheckBoxSeleccionadosChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);															
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsChequesPagosAutorizados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ChequesPagosAutorizados.add(this.jCheckBoxConGraficoReporteChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesChequesPagosAutorizados.add(this.jPanelParametrosAuxiliar3ChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesChequesPagosAutorizados.add(this.jComboBoxTiposAccionesChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosChequesPagosAutorizados = new GridBagLayout();

			this.jScrollPanelDatosChequesPagosAutorizados.setLayout(gridaBagLayoutDatosChequesPagosAutorizados);
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
			this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
			
			this.jScrollPanelDatosChequesPagosAutorizados.add(this.jTableDatosChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosChequesPagosAutorizados.setViewportView(this.jTableDatosChequesPagosAutorizados);
		this.jTableDatosChequesPagosAutorizados.setFillsViewportHeight(true);
		this.jTableDatosChequesPagosAutorizados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesChequesPagosAutorizados= new GridBagLayout();
		this.jPanelAccionesChequesPagosAutorizados.setLayout(gridaBagLayoutAccionesChequesPagosAutorizados);
		
		
		/*	
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
			
		this.jPanelAccionesChequesPagosAutorizados.add(this.jButtonNuevoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaChequesPagosAutorizadosChequesPagosAutorizados= new GridBagLayout();
		gridaBagLayoutBusquedaChequesPagosAutorizadosChequesPagosAutorizados.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaChequesPagosAutorizadosChequesPagosAutorizados.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaChequesPagosAutorizadosChequesPagosAutorizados.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaChequesPagosAutorizadosChequesPagosAutorizados.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaChequesPagosAutorizadosChequesPagosAutorizados.setLayout(gridaBagLayoutBusquedaChequesPagosAutorizadosChequesPagosAutorizados);

		gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		gridBagConstraintsChequesPagosAutorizados.gridx = 0;
		jPanelBusquedaChequesPagosAutorizadosChequesPagosAutorizados.add(jLabelfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados, gridBagConstraintsChequesPagosAutorizados);

		gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		gridBagConstraintsChequesPagosAutorizados.gridx = 1;
		jPanelBusquedaChequesPagosAutorizadosChequesPagosAutorizados.add(jDateChooserfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados, gridBagConstraintsChequesPagosAutorizados);


		gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsChequesPagosAutorizados.gridy = 1;
		gridBagConstraintsChequesPagosAutorizados.gridx = 0;
		jPanelBusquedaChequesPagosAutorizadosChequesPagosAutorizados.add(jLabelfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados, gridBagConstraintsChequesPagosAutorizados);

		gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsChequesPagosAutorizados.gridy = 1;
		gridBagConstraintsChequesPagosAutorizados.gridx = 1;
		jPanelBusquedaChequesPagosAutorizadosChequesPagosAutorizados.add(jDateChooserfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados, gridBagConstraintsChequesPagosAutorizados);

		gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsChequesPagosAutorizados.gridy = 2;
		gridBagConstraintsChequesPagosAutorizados.gridx =1;
		jPanelBusquedaChequesPagosAutorizadosChequesPagosAutorizados.add(jButtonBusquedaChequesPagosAutorizadosChequesPagosAutorizados, gridBagConstraintsChequesPagosAutorizados);

		jTabbedPaneBusquedasChequesPagosAutorizados.addTab("1.-Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaChequesPagosAutorizadosChequesPagosAutorizados);
		jTabbedPaneBusquedasChequesPagosAutorizados.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutChequesPagosAutorizados = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutChequesPagosAutorizados);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();						
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;		
			//this.gridBagConstraintsChequesPagosAutorizados.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsChequesPagosAutorizados.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyPrincipal++;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;		
		//this.gridBagConstraintsChequesPagosAutorizados.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsChequesPagosAutorizados.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsChequesPagosAutorizados);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;		
			this.gridBagConstraintsChequesPagosAutorizados.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsChequesPagosAutorizados.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);								
		
		
		/*
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		*/		
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy =iGridyPrincipal++;
		this.gridBagConstraintsChequesPagosAutorizados.gridx =0;
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsChequesPagosAutorizados.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
				
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ChequesPagosAutorizadosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosChequesPagosAutorizados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosChequesPagosAutorizados = new GridBagLayout();
			this.jPanelBusquedasParametrosChequesPagosAutorizados.setLayout(gridaBagLayoutBusquedasParametrosChequesPagosAutorizados);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralChequesPagosAutorizados=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralChequesPagosAutorizados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralChequesPagosAutorizados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralChequesPagosAutorizados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
			
			
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
			
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralChequesPagosAutorizados;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoChequesPagosAutorizados() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoChequesPagosAutorizados = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoChequesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoChequesPagosAutorizados.setName("jPanelReporteDinamicoChequesPagosAutorizados"); 
		
		this.jPanelReporteDinamicoChequesPagosAutorizados.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoChequesPagosAutorizados.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoChequesPagosAutorizados.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoChequesPagosAutorizados.setLayout(gridaBagLayoutReporteDinamicoChequesPagosAutorizados);
		
		
		this.jInternalFrameReporteDinamicoChequesPagosAutorizados= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoChequesPagosAutorizados = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteChequesPagosAutorizados= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setResizable(true);
	    this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setClosable(true);
	    this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoChequesPagosAutorizados.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoChequesPagosAutorizados.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoChequesPagosAutorizados.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cheques Pagos Autorizadoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteChequesPagosAutorizados = new JLabelMe();

		this.jLabelColumnasSelectReporteChequesPagosAutorizados.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jLabelColumnasSelectReporteChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteChequesPagosAutorizados = new JList<Reporte>();
		this.jListColumnasSelectReporteChequesPagosAutorizados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteChequesPagosAutorizados.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteChequesPagosAutorizados.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteChequesPagosAutorizados.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteChequesPagosAutorizados.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteChequesPagosAutorizados=new JScrollPane(this.jListColumnasSelectReporteChequesPagosAutorizados);
			
			this.jScrollColumnasSelectReporteChequesPagosAutorizados.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteChequesPagosAutorizados.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteChequesPagosAutorizados.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jListColumnasSelectReporteChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jScrollColumnasSelectReporteChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteChequesPagosAutorizados = new JLabelMe();

		this.jLabelRelacionesSelectReporteChequesPagosAutorizados.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteChequesPagosAutorizados = new JList<Reporte>();
		this.jListRelacionesSelectReporteChequesPagosAutorizados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteChequesPagosAutorizados.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteChequesPagosAutorizados.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteChequesPagosAutorizados.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteChequesPagosAutorizados.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteChequesPagosAutorizados=new JScrollPane(this.jListRelacionesSelectReporteChequesPagosAutorizados);
			
			this.jScrollRelacionesSelectReporteChequesPagosAutorizados.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteChequesPagosAutorizados.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteChequesPagosAutorizados.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoChequesPagosAutorizados = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoChequesPagosAutorizados = new JComboBoxMe();
		this.jListColumnasValoresGraficoChequesPagosAutorizados = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoChequesPagosAutorizados = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoChequesPagosAutorizados.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoChequesPagosAutorizados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoChequesPagosAutorizados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoChequesPagosAutorizados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoChequesPagosAutorizados = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoChequesPagosAutorizados.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoChequesPagosAutorizados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoChequesPagosAutorizados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoChequesPagosAutorizados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoChequesPagosAutorizados = new JLabelMe();

		this.jLabelConGraficoDinamicoChequesPagosAutorizados.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jLabelConGraficoDinamicoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoChequesPagosAutorizados = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoChequesPagosAutorizados.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoChequesPagosAutorizados.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoChequesPagosAutorizados.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoChequesPagosAutorizados.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoChequesPagosAutorizados.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jCheckBoxConGraficoDinamicoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoChequesPagosAutorizados = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoChequesPagosAutorizados.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jLabelColumnaCategoriaGraficoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoChequesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoChequesPagosAutorizados.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoChequesPagosAutorizados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoChequesPagosAutorizados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoChequesPagosAutorizados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoChequesPagosAutorizados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jComboBoxColumnaCategoriaGraficoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorChequesPagosAutorizados = new JLabelMe();

		this.jLabelColumnaCategoriaValorChequesPagosAutorizados.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jLabelColumnaCategoriaValorChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorChequesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorChequesPagosAutorizados.setText("Accion");
        this.jComboBoxColumnaCategoriaValorChequesPagosAutorizados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorChequesPagosAutorizados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorChequesPagosAutorizados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorChequesPagosAutorizados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jComboBoxColumnaCategoriaValorChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoChequesPagosAutorizados = new JLabelMe();

		this.jLabelColumnasValoresGraficoChequesPagosAutorizados.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jLabelColumnasValoresGraficoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoChequesPagosAutorizados = new JList<Reporte>();
		this.jListColumnasValoresGraficoChequesPagosAutorizados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoChequesPagosAutorizados.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoChequesPagosAutorizados.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoChequesPagosAutorizados.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoChequesPagosAutorizados.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoChequesPagosAutorizados=new JScrollPane(this.jListColumnasValoresGraficoChequesPagosAutorizados);
			
			this.jScrollColumnasValoresGraficoChequesPagosAutorizados.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoChequesPagosAutorizados.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoChequesPagosAutorizados.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jListColumnasSelectReporteChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jScrollColumnasValoresGraficoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoChequesPagosAutorizados = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoChequesPagosAutorizados.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jLabelTiposGraficosReportesDinamicoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoChequesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoChequesPagosAutorizados.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoChequesPagosAutorizados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoChequesPagosAutorizados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoChequesPagosAutorizados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoChequesPagosAutorizados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jComboBoxTiposGraficosReportesDinamicoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoChequesPagosAutorizados = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoChequesPagosAutorizados.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jLabelGenerarExcelReporteDinamicoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoChequesPagosAutorizados = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoChequesPagosAutorizados.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoChequesPagosAutorizados,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoChequesPagosAutorizados.setToolTipText("Generar EXCEL"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jButtonGenerarExcelReporteDinamicoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jComboBoxTiposReportesDinamicoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoChequesPagosAutorizados = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoChequesPagosAutorizados.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jLabelTiposArchivoReporteDinamicoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jComboBoxTiposArchivosReportesDinamicoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoChequesPagosAutorizados = new JButtonMe();
		this.jButtonGenerarReporteDinamicoChequesPagosAutorizados.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoChequesPagosAutorizados,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoChequesPagosAutorizados.setToolTipText("Generar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jButtonGenerarReporteDinamicoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoChequesPagosAutorizados = new JButtonMe();
		this.jButtonCerrarReporteDinamicoChequesPagosAutorizados.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoChequesPagosAutorizados,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoChequesPagosAutorizados.setToolTipText("Cancelar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoChequesPagosAutorizados.add(this.jButtonCerrarReporteDinamicoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalChequesPagosAutorizados = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoChequesPagosAutorizados= new JScrollPane(jPanelReporteDinamicoChequesPagosAutorizados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoChequesPagosAutorizados.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoChequesPagosAutorizados.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoChequesPagosAutorizados.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cheques Pagos Autorizadoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsChequesPagosAutorizados.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalChequesPagosAutorizados);
		this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getContentPane().add(this.jScrollPanelReporteDinamicoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionChequesPagosAutorizados() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionChequesPagosAutorizados = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionChequesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionChequesPagosAutorizados.setName("jPanelImportacionChequesPagosAutorizados"); 
		
		this.jPanelImportacionChequesPagosAutorizados.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionChequesPagosAutorizados.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionChequesPagosAutorizados.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionChequesPagosAutorizados.setLayout(gridaBagLayoutImportacionChequesPagosAutorizados);
		
		
		this.jInternalFrameImportacionChequesPagosAutorizados= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionChequesPagosAutorizados= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionChequesPagosAutorizados = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteChequesPagosAutorizados= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionChequesPagosAutorizados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionChequesPagosAutorizados.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionChequesPagosAutorizados.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionChequesPagosAutorizados.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionChequesPagosAutorizados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionChequesPagosAutorizados.setResizable(true);
	    this.jInternalFrameImportacionChequesPagosAutorizados.setClosable(true);
	    this.jInternalFrameImportacionChequesPagosAutorizados.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionChequesPagosAutorizados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionChequesPagosAutorizados.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionChequesPagosAutorizados.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionChequesPagosAutorizados.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionChequesPagosAutorizados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionChequesPagosAutorizados.setResizable(true);
	    this.jInternalFrameImportacionChequesPagosAutorizados.setClosable(true);
	    this.jInternalFrameImportacionChequesPagosAutorizados.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionChequesPagosAutorizados.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionChequesPagosAutorizados.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionChequesPagosAutorizados.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cheques Pagos Autorizadoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionChequesPagosAutorizados = new JLabelMe();

		this.jLabelArchivoImportacionChequesPagosAutorizados.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYImportacion;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXImportacion++;
			
		this.jPanelImportacionChequesPagosAutorizados.add(this.jLabelArchivoImportacionChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionChequesPagosAutorizados = new JFileChooser();		
		this.jFileChooserImportacionChequesPagosAutorizados.setToolTipText("ESCOGER ARCHIVO"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionChequesPagosAutorizados = new JButtonMe();
		this.jButtonAbrirImportacionChequesPagosAutorizados.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionChequesPagosAutorizados,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionChequesPagosAutorizados.setToolTipText("Generar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYImportacion;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionChequesPagosAutorizados.add(this.jButtonAbrirImportacionChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionChequesPagosAutorizados = new JLabelMe();

		this.jLabelPathArchivoImportacionChequesPagosAutorizados.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYImportacion;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXImportacion++;
			
		this.jPanelImportacionChequesPagosAutorizados.add(this.jLabelPathArchivoImportacionChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionChequesPagosAutorizados=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionChequesPagosAutorizados.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionChequesPagosAutorizados.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionChequesPagosAutorizados.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYImportacion;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionChequesPagosAutorizados.add(this.jTextFieldPathArchivoImportacionChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionChequesPagosAutorizados = new JButtonMe();
		this.jButtonGenerarImportacionChequesPagosAutorizados.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionChequesPagosAutorizados,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionChequesPagosAutorizados.setToolTipText("Generar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYImportacion;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionChequesPagosAutorizados.add(this.jButtonGenerarImportacionChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionChequesPagosAutorizados = new JButtonMe();
		this.jButtonCerrarImportacionChequesPagosAutorizados.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionChequesPagosAutorizados,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionChequesPagosAutorizados.setToolTipText("Cancelar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYImportacion;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionChequesPagosAutorizados.add(this.jButtonCerrarImportacionChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalChequesPagosAutorizados = new GridBagLayout();
		
		this.jScrollPanelImportacionChequesPagosAutorizados= new JScrollPane(jPanelImportacionChequesPagosAutorizados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy =iPosYImportacion;
		this.gridBagConstraintsChequesPagosAutorizados.gridx =iPosXImportacion;
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionChequesPagosAutorizados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionChequesPagosAutorizados.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalChequesPagosAutorizados);
		this.jInternalFrameImportacionChequesPagosAutorizados.getContentPane().add(this.jScrollPanelImportacionChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByChequesPagosAutorizados(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByChequesPagosAutorizados = new JButtonMe();
			this.jButtonAbrirOrderByChequesPagosAutorizados.setText("Orden");
			this.jButtonAbrirOrderByChequesPagosAutorizados.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByChequesPagosAutorizados,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByChequesPagosAutorizados";
			inputMap = this.jButtonAbrirOrderByChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByChequesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByChequesPagosAutorizados"));
		
		
			GridBagLayout gridaBagLayoutOrderByChequesPagosAutorizados = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByChequesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByChequesPagosAutorizados.setName("jPanelOrderByChequesPagosAutorizados"); 
			
			this.jPanelOrderByChequesPagosAutorizados.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByChequesPagosAutorizados.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByChequesPagosAutorizados.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByChequesPagosAutorizados.setLayout(gridaBagLayoutOrderByChequesPagosAutorizados);
			
			
			this.jTableDatosChequesPagosAutorizadosOrderBy = new JTableMe();        
			this.jTableDatosChequesPagosAutorizadosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosChequesPagosAutorizadosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosChequesPagosAutorizadosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosChequesPagosAutorizadosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosChequesPagosAutorizadosOrderBy.setViewportView(this.jTableDatosChequesPagosAutorizadosOrderBy);
			this.jTableDatosChequesPagosAutorizadosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosChequesPagosAutorizadosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByChequesPagosAutorizados= new OrderByJInternalFrame();
			this.jInternalFrameOrderByChequesPagosAutorizados= new OrderByJInternalFrame();
			this.jScrollPanelOrderByChequesPagosAutorizados = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteChequesPagosAutorizados= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByChequesPagosAutorizados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByChequesPagosAutorizados.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByChequesPagosAutorizados.setTitle("Orden");
			this.jInternalFrameOrderByChequesPagosAutorizados.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByChequesPagosAutorizados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByChequesPagosAutorizados.setResizable(true);
			this.jInternalFrameOrderByChequesPagosAutorizados.setClosable(true);
			this.jInternalFrameOrderByChequesPagosAutorizados.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByChequesPagosAutorizados.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByChequesPagosAutorizados.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByChequesPagosAutorizados.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cheques Pagos Autorizadoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.gridy =iPosYOrderBy++;
			this.gridBagConstraintsChequesPagosAutorizados.gridx =iPosXOrderBy;
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsChequesPagosAutorizados.ipady =150;
				
			this.jPanelOrderByChequesPagosAutorizados.add(jScrollPanelDatosChequesPagosAutorizadosOrderBy, this.gridBagConstraintsChequesPagosAutorizados);//this.jTableDatosChequesPagosAutorizadosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByChequesPagosAutorizados = new JButtonMe();
			this.jButtonCerrarOrderByChequesPagosAutorizados.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByChequesPagosAutorizados,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByChequesPagosAutorizados.setToolTipText("Cancelar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iPosYOrderBy++;
			this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXOrderBy;
									
			this.jPanelOrderByChequesPagosAutorizados.add(this.jButtonCerrarOrderByChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalChequesPagosAutorizados = new GridBagLayout();
			
			this.jScrollPanelOrderByChequesPagosAutorizados= new JScrollPane(jPanelOrderByChequesPagosAutorizados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.gridy =iPosYOrderBy;
			this.gridBagConstraintsChequesPagosAutorizados.gridx =iPosXOrderBy;
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByChequesPagosAutorizados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByChequesPagosAutorizados.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalChequesPagosAutorizados);
			
			this.jInternalFrameOrderByChequesPagosAutorizados.getContentPane().add(this.jScrollPanelOrderByChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);			
		
		} else {
			this.jButtonAbrirOrderByChequesPagosAutorizados = new JButtonMe();
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
		//	&& this.chequespagosautorizadosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosChequesPagosAutorizados.getRowHeight();//ChequesPagosAutorizadosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ChequesPagosAutorizadosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaChequesPagosAutorizados.isSelected()) {
					iHeightTable=ChequesPagosAutorizadosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ChequesPagosAutorizadosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ChequesPagosAutorizadosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ChequesPagosAutorizadosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaChequesPagosAutorizados.isSelected()) {
					iHeightTable=ChequesPagosAutorizadosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ChequesPagosAutorizadosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ChequesPagosAutorizadosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosChequesPagosAutorizados.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosChequesPagosAutorizados.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosChequesPagosAutorizados.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosChequesPagosAutorizados.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosChequesPagosAutorizados.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosChequesPagosAutorizados.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByChequesPagosAutorizados!=null && this.jInternalFrameOrderByChequesPagosAutorizados.getjTableDatosOrderBy()!=null) {
			//if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByChequesPagosAutorizados.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByChequesPagosAutorizados.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByChequesPagosAutorizados.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByChequesPagosAutorizados.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByChequesPagosAutorizados.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByChequesPagosAutorizados.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByChequesPagosAutorizados.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosChequesPagosAutorizados.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosChequesPagosAutorizados.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosChequesPagosAutorizados.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=chequespagosautorizadosLogic.getChequesPagosAutorizadoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=chequespagosautorizadoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ChequesPagosAutorizados> TraerChequesPagosAutorizadosBeans(List<ChequesPagosAutorizados> chequespagosautorizadoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ChequesPagosAutorizados chequespagosautorizados:chequespagosautorizadoss) {
					
				if(!(ChequesPagosAutorizadosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ChequesPagosAutorizadosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					chequespagosautorizados.setsDetalleGeneralEntityReporte(ChequesPagosAutorizadosConstantesFunciones.getChequesPagosAutorizadosDescripcion(chequespagosautorizados));
										
						
					
						
					
				} else  {
							
					//chequespagosautorizados.setsDetalleGeneralEntityReporte(chequespagosautorizados.getsDetalleGeneralEntityReporte());
										
				}
				
				//chequespagosautorizadosbeans.add(chequespagosautorizadosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return chequespagosautorizadoss;
    }
	//PARA REPORTES FIN
}
