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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.CuentaContaDetaGrupoActiConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class CuentaContaDetaGrupoActiJInternalFrame extends CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCuentaContaDetaGrupoActi;
	
	protected JMenuBar jmenuBarCuentaContaDetaGrupoActi;
	
	protected JMenu jmenuCuentaContaDetaGrupoActi;
	protected JMenu jmenuDatosCuentaContaDetaGrupoActi;
	protected JMenu jmenuArchivoCuentaContaDetaGrupoActi;
	protected JMenu jmenuAccionesCuentaContaDetaGrupoActi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCuentaContaDetaGrupoActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaContaDetaGrupoActi;	
	protected GridBagConstraints gridBagConstraintsCuentaContaDetaGrupoActi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CuentaContaDetaGrupoActiDetalleFormJInternalFrame jInternalFrameDetalleFormCuentaContaDetaGrupoActi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCuentaContaDetaGrupoActi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected DetalleGrupoActivoFijoBeanSwingJInternalFrame detallegrupoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detallegrupoactivofijo="";
	
	public CuentaContaDetaGrupoActiSessionBean cuentacontadetagrupoactiSessionBean;
		
	
	
	public CuentaContableSessionBean cuentacontableSessionBean;
	public DetalleGrupoActivoFijoSessionBean detallegrupoactivofijoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactis;		
	public List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisEliminados;	
	public List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCuentaContaDetaGrupoActi;		
	protected JButton jButtonAbrirOrderByCuentaContaDetaGrupoActi;
	
	
	//protected JPanel jPanelOrderByCuentaContaDetaGrupoActi;
	//public JScrollPane jScrollPanelOrderByCuentaContaDetaGrupoActi;	
	//protected JButton jButtonCerrarOrderByCuentaContaDetaGrupoActi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CuentaContaDetaGrupoActiLogic cuentacontadetagrupoactiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCuentaContaDetaGrupoActi;
	public JScrollPane jScrollPanelDatosEdicionCuentaContaDetaGrupoActi;
	public JScrollPane jScrollPanelDatosGeneralCuentaContaDetaGrupoActi;
    
	
	
	//public JScrollPane jScrollPanelDatosCuentaContaDetaGrupoActiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCuentaContaDetaGrupoActi;
	//public JScrollPane jScrollPanelImportacionCuentaContaDetaGrupoActi;
	
	
	
	protected JPanel jPanelAccionesCuentaContaDetaGrupoActi;
	
    protected JPanel jPanelPaginacionCuentaContaDetaGrupoActi;
    protected JPanel jPanelParametrosReportesCuentaContaDetaGrupoActi;
	protected JPanel jPanelParametrosReportesAccionesCuentaContaDetaGrupoActi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CuentaContaDetaGrupoActi;
	protected JPanel jPanelParametrosAuxiliar2CuentaContaDetaGrupoActi;
	protected JPanel jPanelParametrosAuxiliar3CuentaContaDetaGrupoActi;
	protected JPanel jPanelParametrosAuxiliar4CuentaContaDetaGrupoActi;
	//protected JPanel jPanelParametrosAuxiliar5CuentaContaDetaGrupoActi;
	
	
	
	//protected JPanel jPanelReporteDinamicoCuentaContaDetaGrupoActi;
	//protected JPanel jPanelImportacionCuentaContaDetaGrupoActi;
	
	
	public JTable jTableDatosCuentaContaDetaGrupoActi;
	
	
	
	//public JTable jTableDatosCuentaContaDetaGrupoActiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCuentaContaDetaGrupoActi;
	protected JButton jButtonDuplicarCuentaContaDetaGrupoActi;
	protected JButton jButtonCopiarCuentaContaDetaGrupoActi;
	protected JButton jButtonVerFormCuentaContaDetaGrupoActi;
	protected JButton jButtonNuevoRelacionesCuentaContaDetaGrupoActi;
	protected JButton jButtonModificarCuentaContaDetaGrupoActi;
	
    protected JButton jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi;
	protected JButton jButtonCerrarCuentaContaDetaGrupoActi;
	
	
	protected JButton jButtonRecargarInformacionCuentaContaDetaGrupoActi;
	protected JButton jButtonProcesarInformacionCuentaContaDetaGrupoActi;
	
	
	protected JButton jButtonAnterioresCuentaContaDetaGrupoActi;
	protected JButton jButtonSiguientesCuentaContaDetaGrupoActi;
	protected JButton jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCuentaContaDetaGrupoActi;
	//protected JButton jButtonCerrarReporteDinamicoCuentaContaDetaGrupoActi;
	//protected JButton jButtonGenerarExcelReporteDinamicoCuentaContaDetaGrupoActi;	
	
	
	
	//protected JButton jButtonAbrirImportacionCuentaContaDetaGrupoActi;
	//protected JButton jButtonGenerarImportacionCuentaContaDetaGrupoActi;
	//protected JButton jButtonCerrarImportacionCuentaContaDetaGrupoActi;
	//protected JFileChooser jFileChooserImportacionCuentaContaDetaGrupoActi;
	//protected File fileImportacionCuentaContaDetaGrupoActi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonDuplicarToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonNuevoRelacionesToolBarCuentaContaDetaGrupoActi;
	
	
	public JButton jButtonGuardarCambiosToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonCopiarToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonVerFormToolBarCuentaContaDetaGrupoActi;
	public JButton jButtonGuardarCambiosTablaToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonCerrarToolBarCuentaContaDetaGrupoActi;
	
	protected JButton jButtonRecargarInformacionToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonProcesarInformacionToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonAnterioresToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonSiguientesToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonNuevoGuardarCambiosToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonAbrirOrderByToolBarCuentaContaDetaGrupoActi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemDuplicarCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemNuevoRelacionesCuentaContaDetaGrupoActi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemCopiarCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemVerFormCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemCerrarCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemDetalleCerrarCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaContaDetaGrupoActi;
	
	protected JMenuItem jMenuItemRecargarInformacionCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemProcesarInformacionCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemAnterioresCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemSiguientesCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemAbrirOrderByCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemMostrarOcultarCuentaContaDetaGrupoActi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentaContaDetaGrupoActi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi;
	protected JCheckBox jCheckBoxSeleccionadosCuentaContaDetaGrupoActi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCuentaContaDetaGrupoActi;
	protected JCheckBox jCheckBoxConGraficoReporteCuentaContaDetaGrupoActi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCuentaContaDetaGrupoActi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaContaDetaGrupoActi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCuentaContaDetaGrupoActi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCuentaContaDetaGrupoActi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaContaDetaGrupoActi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaContaDetaGrupoActi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi;
	protected JTextField jTextFieldValorCampoGeneralCuentaContaDetaGrupoActi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCuentaContaDetaGrupoActi;
	//public JList<Reporte> jListColumnasSelectReporteCuentaContaDetaGrupoActi;
	//public JScrollPane jScrollColumnasSelectReporteCuentaContaDetaGrupoActi;
	
	//public JLabel jLabelRelacionesSelectReporteCuentaContaDetaGrupoActi;
	//public JList<Reporte> jListRelacionesSelectReporteCuentaContaDetaGrupoActi;
	//public JScrollPane jScrollRelacionesSelectReporteCuentaContaDetaGrupoActi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCuentaContaDetaGrupoActi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCuentaContaDetaGrupoActi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCuentaContaDetaGrupoActi;
	//public JLabel jLabelTiposArchivoReporteDinamicoCuentaContaDetaGrupoActi;
	
		
	//public JLabel jLabelArchivoImportacionCuentaContaDetaGrupoActi;	
	//public JLabel jLabelPathArchivoImportacionCuentaContaDetaGrupoActi;
	//protected JTextField jTextFieldPathArchivoImportacionCuentaContaDetaGrupoActi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCuentaContaDetaGrupoActi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCuentaContaDetaGrupoActi;
	
	//public JLabel jLabelColumnaCategoriaValorCuentaContaDetaGrupoActi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCuentaContaDetaGrupoActi;
	
	//public JLabel jLabelColumnasValoresGraficoCuentaContaDetaGrupoActi;
	//public JList<Reporte> jListColumnasValoresGraficoCuentaContaDetaGrupoActi;
	//public JScrollPane jScrollColumnasValoresGraficoCuentaContaDetaGrupoActi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCuentaContaDetaGrupoActi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCuentaContaDetaGrupoActi;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCuentaContaDetaGrupoActi;
	public JPanel jPanelFK_IdCuentaContableCuentaContaDetaGrupoActi;
	public JButton jButtonFK_IdCuentaContableCuentaContaDetaGrupoActi;
	public JPanel jPanelFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi;
	public JButton jButtonFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActiUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActiBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActiArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaDetaGrupoActi;
	
	public JPanel jPanelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi;
	public JLabel jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi;
	public JButton jButtonid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActiUpdate= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActiBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CuentaContaDetaGrupoActiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CuentaContaDetaGrupoActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContaDetaGrupoActiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaContaDetaGrupoActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContaDetaGrupoActiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaContaDetaGrupoActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContaDetaGrupoActiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaContaDetaGrupoActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCuentaContaDetaGrupoActi)	{
		this.jButtonRecargarInformacionCuentaContaDetaGrupoActi = jButtonRecargarInformacionCuentaContaDetaGrupoActi;
	}
	
	public JButton getjButtonProcesarInformacionCuentaContaDetaGrupoActi() {
		return this.jButtonProcesarInformacionCuentaContaDetaGrupoActi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaContaDetaGrupoActi)	{
		this.jButtonProcesarInformacionCuentaContaDetaGrupoActi = jButtonProcesarInformacionCuentaContaDetaGrupoActi;
	}
	
	
	public JButton getjButtonRecargarInformacionCuentaContaDetaGrupoActi() {
		return this.jButtonRecargarInformacionCuentaContaDetaGrupoActi;
	}
	
	
	public List<CuentaContaDetaGrupoActi> getcuentacontadetagrupoactis() {
		return this.cuentacontadetagrupoactis;
	}

	public void setcuentacontadetagrupoactis(List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactis) {
		this.cuentacontadetagrupoactis = cuentacontadetagrupoactis;
	}
	
	public List<CuentaContaDetaGrupoActi> getcuentacontadetagrupoactisAux() {
		return this.cuentacontadetagrupoactisAux;
	}

	public void setcuentacontadetagrupoactisAux(List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisAux) {
		this.cuentacontadetagrupoactisAux = cuentacontadetagrupoactisAux;
	}
	
	public List<CuentaContaDetaGrupoActi> getcuentacontadetagrupoactisEliminados() {
		return this.cuentacontadetagrupoactisEliminados;
	}

	public void setCuentaContaDetaGrupoActisEliminados(List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactisEliminados) {
		this.cuentacontadetagrupoactisEliminados = cuentacontadetagrupoactisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCuentaContaDetaGrupoActi() {
		return jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCuentaContaDetaGrupoActi(
			JComboBox jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi) {
		this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi = jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi;
	}
	
	public void setBorderResaltarTiposSeleccionarCuentaContaDetaGrupoActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCuentaContaDetaGrupoActi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCuentaContaDetaGrupoActi() {
		return jTextFieldValorCampoGeneralCuentaContaDetaGrupoActi;
	}

	public void setjTextFieldValorCampoGeneralCuentaContaDetaGrupoActi(
			JTextField jTextFieldValorCampoGeneralCuentaContaDetaGrupoActi) {
		this.jTextFieldValorCampoGeneralCuentaContaDetaGrupoActi = jTextFieldValorCampoGeneralCuentaContaDetaGrupoActi;
	}

	public void setBorderResaltarValorCampoGeneralCuentaContaDetaGrupoActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaDetaGrupoActi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCuentaContaDetaGrupoActi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi() {
		return this.jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi;
	}

	public void setjCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi(
			JCheckBox jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi) {
		this.jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi = jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi;
	}

	public void setBorderResaltarSeleccionarTodosCuentaContaDetaGrupoActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaDetaGrupoActi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCuentaContaDetaGrupoActi() {
		return this.jCheckBoxSeleccionadosCuentaContaDetaGrupoActi;
	}

	public void setjCheckBoxSeleccionadosCuentaContaDetaGrupoActi(
			JCheckBox jCheckBoxSeleccionadosCuentaContaDetaGrupoActi) {
		this.jCheckBoxSeleccionadosCuentaContaDetaGrupoActi = jCheckBoxSeleccionadosCuentaContaDetaGrupoActi;
	}
	
	public void setBorderResaltarSeleccionadosCuentaContaDetaGrupoActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaDetaGrupoActi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCuentaContaDetaGrupoActi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi() {
		return this.jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi(
			JComboBox jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi) {
		this.jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi = jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi;
	}

	public void setBorderResaltarTiposArchivosReportesCuentaContaDetaGrupoActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaDetaGrupoActi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCuentaContaDetaGrupoActi() {
		return this.jComboBoxTiposReportesCuentaContaDetaGrupoActi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCuentaContaDetaGrupoActi(
			JComboBox jComboBoxTiposReportesCuentaContaDetaGrupoActi) {
		this.jComboBoxTiposReportesCuentaContaDetaGrupoActi = jComboBoxTiposReportesCuentaContaDetaGrupoActi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCuentaContaDetaGrupoActi() {
	//	return jComboBoxTiposReportesDinamicoCuentaContaDetaGrupoActi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCuentaContaDetaGrupoActi(
	//		JComboBox jComboBoxTiposReportesDinamicoCuentaContaDetaGrupoActi) {
	//	this.jComboBoxTiposReportesDinamicoCuentaContaDetaGrupoActi = jComboBoxTiposReportesDinamicoCuentaContaDetaGrupoActi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCuentaContaDetaGrupoActi() {
	//	return jComboBoxTiposArchivosReportesDinamicoCuentaContaDetaGrupoActi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCuentaContaDetaGrupoActi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaContaDetaGrupoActi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCuentaContaDetaGrupoActi = jComboBoxTiposArchivosReportesDinamicoCuentaContaDetaGrupoActi;
	//}
	
	public void setBorderResaltarTiposReportesCuentaContaDetaGrupoActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaDetaGrupoActi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCuentaContaDetaGrupoActi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi() {
		return this.jComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi(
			JComboBox jComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi) {
		this.jComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi = jComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi;
	}
	
	public void setBorderResaltarTiposGraficosReportesCuentaContaDetaGrupoActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaDetaGrupoActi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCuentaContaDetaGrupoActi() {
		return this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCuentaContaDetaGrupoActi(
			JComboBox jComboBoxTiposPaginacionCuentaContaDetaGrupoActi) {
		this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi = jComboBoxTiposPaginacionCuentaContaDetaGrupoActi;
	}
	
	public void setBorderResaltarTiposPaginacionCuentaContaDetaGrupoActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaDetaGrupoActi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCuentaContaDetaGrupoActi() {
		return this.jComboBoxTiposRelacionesCuentaContaDetaGrupoActi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaContaDetaGrupoActi() {
		return this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaContaDetaGrupoActi(
			JComboBox jComboBoxTiposRelacionesCuentaContaDetaGrupoActi) {
		this.jComboBoxTiposRelacionesCuentaContaDetaGrupoActi = jComboBoxTiposRelacionesCuentaContaDetaGrupoActi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaContaDetaGrupoActi(
			JComboBox jComboBoxTiposAccionesCuentaContaDetaGrupoActi) {
		this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi = jComboBoxTiposAccionesCuentaContaDetaGrupoActi;
	}
	
	public void setBorderResaltarTiposRelacionesCuentaContaDetaGrupoActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaDetaGrupoActi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCuentaContaDetaGrupoActi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCuentaContaDetaGrupoActi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContaDetaGrupoActi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCuentaContaDetaGrupoActi() {
	//	return jCheckBoxConGraficoDinamicoCuentaContaDetaGrupoActi;
	//}

	//public void setjCheckBoxConGraficoDinamicoCuentaContaDetaGrupoActi(
	//		JCheckBox jCheckBoxConGraficoDinamicoCuentaContaDetaGrupoActi) {
	//	this.jCheckBoxConGraficoDinamicoCuentaContaDetaGrupoActi = jCheckBoxConGraficoDinamicoCuentaContaDetaGrupoActi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCuentaContaDetaGrupoActi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCuentaContaDetaGrupoActi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCuentaContaDetaGrupoActi .setBorder(borderResaltar);		
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
		this.cuentacontadetagrupoactiSessionBean=new CuentaContaDetaGrupoActiSessionBean();
		
		this.cuentacontadetagrupoactiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentacontadetagrupoactiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CuentaContaDetaGrupoActiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CuentaContaDetaGrupoActiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaContaDetaGrupoActiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaContaDetaGrupoActiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaContaDetaGrupoActiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Conta Deta Grupo Acti MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
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
		
		CuentaContaDetaGrupoActiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CuentaContaDetaGrupoActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCuentaContaDetaGrupoActi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCuentaContaDetaGrupoActi,this.jTtoolBarCuentaContaDetaGrupoActi,
							"nuevo","nuevo","Nuevo"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCuentaContaDetaGrupoActi,this.jTtoolBarCuentaContaDetaGrupoActi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCuentaContaDetaGrupoActi,this.jTtoolBarCuentaContaDetaGrupoActi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCuentaContaDetaGrupoActi,this.jTtoolBarCuentaContaDetaGrupoActi,
							"duplicar","duplicar","Duplicar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCuentaContaDetaGrupoActi,this.jTtoolBarCuentaContaDetaGrupoActi,
							"copiar","copiar","Copiar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCuentaContaDetaGrupoActi,this.jTtoolBarCuentaContaDetaGrupoActi,
							"ver_form","ver_form","Ver"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaContaDetaGrupoActi,this.jTtoolBarCuentaContaDetaGrupoActi,
							"recargar","recargar","Recargar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaContaDetaGrupoActi,this.jTtoolBarCuentaContaDetaGrupoActi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaContaDetaGrupoActi,this.jTtoolBarCuentaContaDetaGrupoActi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCuentaContaDetaGrupoActi,this.jTtoolBarCuentaContaDetaGrupoActi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCuentaContaDetaGrupoActi,this.jTtoolBarCuentaContaDetaGrupoActi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCuentaContaDetaGrupoActi,this.jTtoolBarCuentaContaDetaGrupoActi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCuentaContaDetaGrupoActi,this.jTtoolBarCuentaContaDetaGrupoActi,
							"cerrar","cerrar","Salir"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCuentaContaDetaGrupoActi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCuentaContaDetaGrupoActi;
			
				this.jButtonProcesarInformacionToolBarCuentaContaDetaGrupoActi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCuentaContaDetaGrupoActi;
				
		//protected JButton jButtonModificarToolBarCuentaContaDetaGrupoActi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCuentaContaDetaGrupoActi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCuentaContaDetaGrupoActi=new JMenuMe("General");
		this.jmenuArchivoCuentaContaDetaGrupoActi=new JMenuMe("Archivo");
		this.jmenuAccionesCuentaContaDetaGrupoActi=new JMenuMe("Acciones");
		this.jmenuDatosCuentaContaDetaGrupoActi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaContaDetaGrupoActi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaContaDetaGrupoActi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaContaDetaGrupoActi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCuentaContaDetaGrupoActi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCuentaContaDetaGrupoActi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCuentaContaDetaGrupoActi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCuentaContaDetaGrupoActi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCuentaContaDetaGrupoActi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCuentaContaDetaGrupoActi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCuentaContaDetaGrupoActi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaContaDetaGrupoActi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaContaDetaGrupoActi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCuentaContaDetaGrupoActi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCuentaContaDetaGrupoActi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCuentaContaDetaGrupoActi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCuentaContaDetaGrupoActi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCuentaContaDetaGrupoActi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCuentaContaDetaGrupoActi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCuentaContaDetaGrupoActi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCuentaContaDetaGrupoActi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCuentaContaDetaGrupoActi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaContaDetaGrupoActi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaContaDetaGrupoActi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaContaDetaGrupoActi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCuentaContaDetaGrupoActi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCuentaContaDetaGrupoActi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCuentaContaDetaGrupoActi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCuentaContaDetaGrupoActi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCuentaContaDetaGrupoActi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCuentaContaDetaGrupoActi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCuentaContaDetaGrupoActi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCuentaContaDetaGrupoActi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCuentaContaDetaGrupoActi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCuentaContaDetaGrupoActi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCuentaContaDetaGrupoActi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCuentaContaDetaGrupoActi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCuentaContaDetaGrupoActi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCuentaContaDetaGrupoActi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCuentaContaDetaGrupoActi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaContaDetaGrupoActi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaContaDetaGrupoActi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaContaDetaGrupoActi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCuentaContaDetaGrupoActi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCuentaContaDetaGrupoActi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCuentaContaDetaGrupoActi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaContaDetaGrupoActi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaContaDetaGrupoActi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaContaDetaGrupoActi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCuentaContaDetaGrupoActi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCuentaContaDetaGrupoActi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCuentaContaDetaGrupoActi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCuentaContaDetaGrupoActi.add(this.jMenuItemCerrarCuentaContaDetaGrupoActi);
			
			this.jmenuAccionesCuentaContaDetaGrupoActi.add(this.jMenuItemNuevoCuentaContaDetaGrupoActi);
			this.jmenuAccionesCuentaContaDetaGrupoActi.add(this.jMenuItemNuevoGuardarCambiosCuentaContaDetaGrupoActi);
			this.jmenuAccionesCuentaContaDetaGrupoActi.add(this.jMenuItemNuevoRelacionesCuentaContaDetaGrupoActi);
			this.jmenuAccionesCuentaContaDetaGrupoActi.add(this.jMenuItemGuardarCambiosTablaCuentaContaDetaGrupoActi);		
			this.jmenuAccionesCuentaContaDetaGrupoActi.add(this.jMenuItemDuplicarCuentaContaDetaGrupoActi);		
			this.jmenuAccionesCuentaContaDetaGrupoActi.add(this.jMenuItemCopiarCuentaContaDetaGrupoActi);		
			this.jmenuAccionesCuentaContaDetaGrupoActi.add(this.jMenuItemVerFormCuentaContaDetaGrupoActi);		
			
			this.jmenuDatosCuentaContaDetaGrupoActi.add(this.jMenuItemRecargarInformacionCuentaContaDetaGrupoActi);				
			this.jmenuDatosCuentaContaDetaGrupoActi.add(this.jMenuItemAnterioresCuentaContaDetaGrupoActi);				
			this.jmenuDatosCuentaContaDetaGrupoActi.add(this.jMenuItemSiguientesCuentaContaDetaGrupoActi);				
			this.jmenuDatosCuentaContaDetaGrupoActi.add(this.jMenuItemAbrirOrderByCuentaContaDetaGrupoActi);				
			this.jmenuDatosCuentaContaDetaGrupoActi.add(this.jMenuItemMostrarOcultarCuentaContaDetaGrupoActi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCuentaContaDetaGrupoActi.add(this.jMenuItemGuardarCambiosCuentaContaDetaGrupoActi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCuentaContaDetaGrupoActi.add(this.jmenuArchivoCuentaContaDetaGrupoActi);		
			this.jmenuBarCuentaContaDetaGrupoActi.add(this.jmenuAccionesCuentaContaDetaGrupoActi);		
			this.jmenuBarCuentaContaDetaGrupoActi.add(this.jmenuDatosCuentaContaDetaGrupoActi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCuentaContaDetaGrupoActi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCuentaContaDetaGrupoActi() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableCuentaContaDetaGrupoActi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCuentaContaDetaGrupoActi.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableCuentaContaDetaGrupoActi= new JButtonMe();
		this.jButtonFK_IdCuentaContableCuentaContaDetaGrupoActi.setText("Buscar");
		this.jButtonFK_IdCuentaContableCuentaContaDetaGrupoActi.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCuentaContaDetaGrupoActi,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaDetaGrupoActi= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaDetaGrupoActi.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaDetaGrupoActi.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaDetaGrupoActi.setFocusable(false);

		this.jPanelFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setToolTipText("Buscar Por Detalle Grupo Activo Fijo ");
		this.jButtonFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi= new JButtonMe();
		this.jButtonFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setText("Buscar");
		this.jButtonFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setToolTipText("Buscar Por Detalle Grupo Activo Fijo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi,"buscar_button","Buscar Por Detalle Grupo Activo Fijo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi = new JLabelMe();
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setText("Detalle Grupo Activo Fijo :");
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setToolTipText("Detalle Grupo Activo Fijo");
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi= new JComboBoxMe();
		jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi=new JTabbedPane();


		this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCuentaContaDetaGrupoActi = new CuentaContaDetaGrupoActiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cuenta Conta Deta Grupo Acti DATOS");
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi = new CuentaContaDetaGrupoActiDetalleFormJInternalFrame(jDesktopPane,this.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones(),this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCuentaContaDetaGrupoActi = null;//new CuentaContaDetaGrupoActiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaContaDetaGrupoActi= new GridBagLayout();
		
		
		this.jTableDatosCuentaContaDetaGrupoActi = new JTableMe();      
		
		String sToolTipCuentaContaDetaGrupoActi="";
		sToolTipCuentaContaDetaGrupoActi=CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaContaDetaGrupoActi+="(ActivosFijos.CuentaContaDetaGrupoActi)";
		}
		
		if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaContaDetaGrupoActi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCuentaContaDetaGrupoActi.setToolTipText(sToolTipCuentaContaDetaGrupoActi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCuentaContaDetaGrupoActi);
		this.jTableDatosCuentaContaDetaGrupoActi.setAutoCreateRowSorter(true);
		this.jTableDatosCuentaContaDetaGrupoActi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCuentaContaDetaGrupoActi.setRowSelectionAllowed(true);
		this.jTableDatosCuentaContaDetaGrupoActi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCuentaContaDetaGrupoActi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonDuplicarCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonCopiarCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonVerFormCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonNuevoRelacionesCuentaContaDetaGrupoActi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonCerrarCuentaContaDetaGrupoActi = new JButtonMe();
		
		this.jScrollPanelDatosCuentaContaDetaGrupoActi = new JScrollPane();   
        this.jScrollPanelDatosGeneralCuentaContaDetaGrupoActi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCuentaContaDetaGrupoActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Conta Deta Grupo Acti";
		
		if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Conta Deta Grupo Actis" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaContaDetaGrupoActi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaContaDetaGrupoActi.setToolTipText("Acciones");
        this.jPanelAccionesCuentaContaDetaGrupoActi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi=new ReporteDinamicoJInternalFrame(CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCuentaContaDetaGrupoActi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCuentaContaDetaGrupoActi=new ImportacionJInternalFrame(CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCuentaContaDetaGrupoActi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCuentaContaDetaGrupoActi = new JButtonMe();
		
		this.jButtonAbrirOrderByCuentaContaDetaGrupoActi.setText("Orden");
		this.jButtonAbrirOrderByCuentaContaDetaGrupoActi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaContaDetaGrupoActi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCuentaContaDetaGrupoActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaContaDetaGrupoActi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaContaDetaGrupoActi,false,this);
			
			//this.cargarOrderByCuentaContaDetaGrupoActi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaContaDetaGrupoActi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaContaDetaGrupoActi,true,this);
			
			//this.cargarOrderByCuentaContaDetaGrupoActi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCuentaContaDetaGrupoActi.setText("Nuevo");
		this.jButtonDuplicarCuentaContaDetaGrupoActi.setText("Duplicar");
		this.jButtonCopiarCuentaContaDetaGrupoActi.setText("Copiar");
		this.jButtonVerFormCuentaContaDetaGrupoActi.setText("Ver");
		this.jButtonNuevoRelacionesCuentaContaDetaGrupoActi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi.setText("Guardar");
		this.jButtonCerrarCuentaContaDetaGrupoActi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaContaDetaGrupoActi,"nuevo_button","Nuevo",this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCuentaContaDetaGrupoActi,"duplicar_button","Duplicar",this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCuentaContaDetaGrupoActi,"copiar_button","Copiar",this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCuentaContaDetaGrupoActi,"ver_form","Ver",this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCuentaContaDetaGrupoActi,"nuevorelaciones_button","Nuevo Rel",this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi,"guardarcambiostabla_button","Guardar",this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaContaDetaGrupoActi,"cerrar_button","Salir",this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCuentaContaDetaGrupoActi.setToolTipText("Nuevo"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCuentaContaDetaGrupoActi.setToolTipText("Duplicar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCuentaContaDetaGrupoActi.setToolTipText("Copiar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCuentaContaDetaGrupoActi.setToolTipText("Ver"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCuentaContaDetaGrupoActi.setToolTipText("Nuevo Rel"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi.setToolTipText("Guardar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaContaDetaGrupoActi.setToolTipText("Salir"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaContaDetaGrupoActi";
		inputMap = this.jButtonNuevoCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaContaDetaGrupoActi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaContaDetaGrupoActi"));
		
		//DUPLICAR
		sMapKey = "DuplicarCuentaContaDetaGrupoActi";
		inputMap = this.jButtonDuplicarCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCuentaContaDetaGrupoActi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCuentaContaDetaGrupoActi"));
		
		//COPIAR
		sMapKey = "CopiarCuentaContaDetaGrupoActi";
		inputMap = this.jButtonCopiarCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCuentaContaDetaGrupoActi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCuentaContaDetaGrupoActi"));
		
		//VEr FORM
		sMapKey = "VerFormCuentaContaDetaGrupoActi";
		inputMap = this.jButtonVerFormCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCuentaContaDetaGrupoActi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCuentaContaDetaGrupoActi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCuentaContaDetaGrupoActi";
		inputMap = this.jButtonNuevoRelacionesCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCuentaContaDetaGrupoActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCuentaContaDetaGrupoActi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCuentaContaDetaGrupoActi";
		inputMap = this.jButtonModificarCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCuentaContaDetaGrupoActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCuentaContaDetaGrupoActi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCuentaContaDetaGrupoActi";
		inputMap = this.jButtonCerrarCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaContaDetaGrupoActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaContaDetaGrupoActi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaContaDetaGrupoActi";
		inputMap = this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaContaDetaGrupoActi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCuentaContaDetaGrupoActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCuentaContaDetaGrupoActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCuentaContaDetaGrupoActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CuentaContaDetaGrupoActi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CuentaContaDetaGrupoActi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CuentaContaDetaGrupoActi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CuentaContaDetaGrupoActi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CuentaContaDetaGrupoActi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCuentaContaDetaGrupoActi.setName("jPanelParametrosReportesCuentaContaDetaGrupoActi"); 
		
		this.jPanelParametrosReportesAccionesCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCuentaContaDetaGrupoActi.setName("jPanelParametrosReportesAccionesCuentaContaDetaGrupoActi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonRecargarInformacionCuentaContaDetaGrupoActi.setText("Recargar");
		this.jButtonRecargarInformacionCuentaContaDetaGrupoActi.setToolTipText("Recargar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCuentaContaDetaGrupoActi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonProcesarInformacionCuentaContaDetaGrupoActi.setText("Procesar");
		this.jButtonProcesarInformacionCuentaContaDetaGrupoActi.setToolTipText("Procesar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCuentaContaDetaGrupoActi.setVisible(false);
			
		this.jButtonProcesarInformacionCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCuentaContaDetaGrupoActi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi.setText("TIPO");       
		this.jComboBoxTiposReportesCuentaContaDetaGrupoActi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi.setText("Paginacion");
		this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCuentaContaDetaGrupoActi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCuentaContaDetaGrupoActi.setText("Accion");
		this.jComboBoxTiposRelacionesCuentaContaDetaGrupoActi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setText("Accion");
		this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi.setText("Accion");
		this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCuentaContaDetaGrupoActi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCuentaContaDetaGrupoActi = new JLabelMe();
		
		this.jLabelAccionesCuentaContaDetaGrupoActi.setText("Acciones");		
		this.jLabelAccionesCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCuentaContaDetaGrupoActi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCuentaContaDetaGrupoActi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCuentaContaDetaGrupoActi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCuentaContaDetaGrupoActi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCuentaContaDetaGrupoActi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCuentaContaDetaGrupoActi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCuentaContaDetaGrupoActi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCuentaContaDetaGrupoActi.setText("Graf.");
		this.jCheckBoxConGraficoReporteCuentaContaDetaGrupoActi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCuentaContaDetaGrupoActi = new JButtonMe();
		//this.jButtonAnterioresCuentaContaDetaGrupoActi.setText("<<");
        this.jButtonAnterioresCuentaContaDetaGrupoActi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCuentaContaDetaGrupoActi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCuentaContaDetaGrupoActi = new JButtonMe();
		//this.jButtonSiguientesCuentaContaDetaGrupoActi.setText(">>");
        this.jButtonSiguientesCuentaContaDetaGrupoActi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCuentaContaDetaGrupoActi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActi.setText("Nue");
        this.jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActi,"nuevoguardarcambios_button","Nue",this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCuentaContaDetaGrupoActi";
		inputMap = this.jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCuentaContaDetaGrupoActi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCuentaContaDetaGrupoActi";
		inputMap = this.jButtonRecargarInformacionCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCuentaContaDetaGrupoActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCuentaContaDetaGrupoActi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCuentaContaDetaGrupoActi";
		inputMap = this.jButtonSiguientesCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCuentaContaDetaGrupoActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCuentaContaDetaGrupoActi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCuentaContaDetaGrupoActi";
		inputMap = this.jButtonAnterioresCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCuentaContaDetaGrupoActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCuentaContaDetaGrupoActi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCuentaContaDetaGrupoActi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(this.getWidth(),CuentaContaDetaGrupoActiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaContaDetaGrupoActiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(this.getWidth(),CuentaContaDetaGrupoActiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaContaDetaGrupoActiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(this.getWidth(),CuentaContaDetaGrupoActiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaContaDetaGrupoActiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCuentaContaDetaGrupoActi = new GridBagLayout();

			this.jPanelPaginacionCuentaContaDetaGrupoActi.setLayout(gridaBagLayoutPaginacionCuentaContaDetaGrupoActi);						
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCuentaContaDetaGrupoActi.add(this.jButtonAnterioresCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
					
						
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
			
			this.jPanelPaginacionCuentaContaDetaGrupoActi.add(this.jButtonNuevoGuardarCambiosCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
						
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
			this.jPanelPaginacionCuentaContaDetaGrupoActi.add(this.jButtonSiguientesCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 1;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaContaDetaGrupoActi.add(this.jButtonNuevoCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
						
			
			
			if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
				this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 1;
				this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCuentaContaDetaGrupoActi.add(this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
			}
			
			
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 1;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaContaDetaGrupoActi.add(this.jButtonDuplicarCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 1;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaContaDetaGrupoActi.add(this.jButtonCopiarCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 1;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaContaDetaGrupoActi.add(this.jButtonVerFormCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 1;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCuentaContaDetaGrupoActi.add(this.jButtonCerrarCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		
		
		
		this.jButtonRecargarInformacionCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCuentaContaDetaGrupoActi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCuentaContaDetaGrupoActi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CuentaContaDetaGrupoActi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CuentaContaDetaGrupoActi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CuentaContaDetaGrupoActi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CuentaContaDetaGrupoActi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCuentaContaDetaGrupoActi.setLayout(gridaBagParametrosReportesCuentaContaDetaGrupoActi);
			this.jPanelParametrosReportesAccionesCuentaContaDetaGrupoActi.setLayout(gridaBagParametrosReportesAccionesCuentaContaDetaGrupoActi);
			
			
			this.jPanelParametrosAuxiliar1CuentaContaDetaGrupoActi.setLayout(gridaBagParametrosAuxiliar1CuentaContaDetaGrupoActi);
			this.jPanelParametrosAuxiliar2CuentaContaDetaGrupoActi.setLayout(gridaBagParametrosAuxiliar2CuentaContaDetaGrupoActi);
			this.jPanelParametrosAuxiliar3CuentaContaDetaGrupoActi.setLayout(gridaBagParametrosAuxiliar3CuentaContaDetaGrupoActi);
			this.jPanelParametrosAuxiliar4CuentaContaDetaGrupoActi.setLayout(gridaBagParametrosAuxiliar4CuentaContaDetaGrupoActi);
			//this.jPanelParametrosAuxiliar5CuentaContaDetaGrupoActi.setLayout(gridaBagParametrosAuxiliar2CuentaContaDetaGrupoActi);			
			
			
			
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaContaDetaGrupoActi.add(this.jButtonRecargarInformacionCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaContaDetaGrupoActi.add(this.jComboBoxTiposPaginacionCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaContaDetaGrupoActi.add(this.jCheckBoxConAltoMaximoTablaCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaContaDetaGrupoActi.add(this.jComboBoxTiposArchivosReportesCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContaDetaGrupoActi.add(this.jPanelParametrosAuxiliar1CuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CuentaContaDetaGrupoActi.add(this.jComboBoxTiposReportesCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContaDetaGrupoActi.add(this.jPanelParametrosAuxiliar4CuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContaDetaGrupoActi.add(this.jComboBoxTiposReportesCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaContaDetaGrupoActi.add(this.jCheckBoxGenerarReporteCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContaDetaGrupoActi.add(this.jPanelParametrosAuxiliar2CuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaContaDetaGrupoActi.add(this.jLabelAccionesCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
				this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCuentaContaDetaGrupoActi.add(this.jButtonAbrirOrderByCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaContaDetaGrupoActi.add(this.jComboBoxTiposSeleccionarCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);			
			
			
			/*
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaContaDetaGrupoActi.add(this.jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaContaDetaGrupoActi.add(this.jCheckBoxSeleccionarTodosCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);															
				
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaContaDetaGrupoActi.add(this.jCheckBoxSeleccionadosCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContaDetaGrupoActi.add(this.jPanelParametrosAuxiliar3CuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaContaDetaGrupoActi.add(this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
	
				
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaContaDetaGrupoActi.add(this.jTextFieldValorCampoGeneralCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCuentaContaDetaGrupoActi = new GridBagLayout();

			this.jScrollPanelDatosCuentaContaDetaGrupoActi.setLayout(gridaBagLayoutDatosCuentaContaDetaGrupoActi);
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
			
			this.jScrollPanelDatosCuentaContaDetaGrupoActi.add(this.jTableDatosCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCuentaContaDetaGrupoActi.setViewportView(this.jTableDatosCuentaContaDetaGrupoActi);
		this.jTableDatosCuentaContaDetaGrupoActi.setFillsViewportHeight(true);
		this.jTableDatosCuentaContaDetaGrupoActi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCuentaContaDetaGrupoActi= new GridBagLayout();
		this.jPanelAccionesCuentaContaDetaGrupoActi.setLayout(gridaBagLayoutAccionesCuentaContaDetaGrupoActi);
		
		
		/*	
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
			
		this.jPanelAccionesCuentaContaDetaGrupoActi.add(this.jButtonNuevoCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableCuentaContaDetaGrupoActi= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCuentaContaDetaGrupoActi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCuentaContaDetaGrupoActi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCuentaContaDetaGrupoActi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCuentaContaDetaGrupoActi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCuentaContaDetaGrupoActi.setLayout(gridaBagLayoutFK_IdCuentaContableCuentaContaDetaGrupoActi);

		gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
		gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
		jPanelFK_IdCuentaContableCuentaContaDetaGrupoActi.add(jLabelid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi, gridBagConstraintsCuentaContaDetaGrupoActi);

		gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
		gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 1;
		jPanelFK_IdCuentaContableCuentaContaDetaGrupoActi.add(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaDetaGrupoActi, gridBagConstraintsCuentaContaDetaGrupoActi);


		gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.NONE;
		gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
		gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
		jPanelFK_IdCuentaContableCuentaContaDetaGrupoActi.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaDetaGrupoActi, gridBagConstraintsCuentaContaDetaGrupoActi);

		gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 1;
		gridBagConstraintsCuentaContaDetaGrupoActi.gridx =1;
		jPanelFK_IdCuentaContableCuentaContaDetaGrupoActi.add(jButtonFK_IdCuentaContableCuentaContaDetaGrupoActi, gridBagConstraintsCuentaContaDetaGrupoActi);

		jTabbedPaneBusquedasCuentaContaDetaGrupoActi.addTab("1.-Por Cuenta Contable ", jPanelFK_IdCuentaContableCuentaContaDetaGrupoActi);
		jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.setLayout(gridaBagLayoutFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi);

		gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
		gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
		jPanelFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.add(jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi, gridBagConstraintsCuentaContaDetaGrupoActi);

		gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
		gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 1;
		jPanelFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.add(jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi, gridBagConstraintsCuentaContaDetaGrupoActi);

		gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 1;
		gridBagConstraintsCuentaContaDetaGrupoActi.gridx =1;
		jPanelFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi.add(jButtonFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi, gridBagConstraintsCuentaContaDetaGrupoActi);

		jTabbedPaneBusquedasCuentaContaDetaGrupoActi.addTab("2.-Por Detalle Grupo Activo Fijo ", jPanelFK_IdDetalleGrupoActivoFijoCuentaContaDetaGrupoActi);
		jTabbedPaneBusquedasCuentaContaDetaGrupoActi.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaContaDetaGrupoActi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaContaDetaGrupoActi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();						
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;		
			//this.gridBagConstraintsCuentaContaDetaGrupoActi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;		
		//this.gridBagConstraintsCuentaContaDetaGrupoActi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);								
		
		
		/*
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		*/		
		
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx =0;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaContaDetaGrupoActi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
				
		
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CuentaContaDetaGrupoActiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCuentaContaDetaGrupoActi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaContaDetaGrupoActi = new GridBagLayout();
			this.jPanelBusquedasParametrosCuentaContaDetaGrupoActi.setLayout(gridaBagLayoutBusquedasParametrosCuentaContaDetaGrupoActi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCuentaContaDetaGrupoActi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
			
			
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		
			
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCuentaContaDetaGrupoActi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCuentaContaDetaGrupoActi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCuentaContaDetaGrupoActi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCuentaContaDetaGrupoActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCuentaContaDetaGrupoActi.setName("jPanelReporteDinamicoCuentaContaDetaGrupoActi"); 
		
		this.jPanelReporteDinamicoCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCuentaContaDetaGrupoActi.setLayout(gridaBagLayoutReporteDinamicoCuentaContaDetaGrupoActi);
		
		
		this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCuentaContaDetaGrupoActi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaContaDetaGrupoActi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setResizable(true);
	    this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setClosable(true);
	    this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Conta Deta Grupo Actis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCuentaContaDetaGrupoActi = new JLabelMe();

		this.jLabelColumnasSelectReporteCuentaContaDetaGrupoActi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentaContaDetaGrupoActi.add(this.jLabelColumnasSelectReporteCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCuentaContaDetaGrupoActi = new JList<Reporte>();
		this.jListColumnasSelectReporteCuentaContaDetaGrupoActi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCuentaContaDetaGrupoActi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCuentaContaDetaGrupoActi=new JScrollPane(this.jListColumnasSelectReporteCuentaContaDetaGrupoActi);
			
			this.jScrollColumnasSelectReporteCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCuentaContaDetaGrupoActi.add(this.jListColumnasSelectReporteCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		this.jPanelReporteDinamicoCuentaContaDetaGrupoActi.add(this.jScrollColumnasSelectReporteCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCuentaContaDetaGrupoActi = new JLabelMe();

		this.jLabelRelacionesSelectReporteCuentaContaDetaGrupoActi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCuentaContaDetaGrupoActi = new JList<Reporte>();
		this.jListRelacionesSelectReporteCuentaContaDetaGrupoActi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCuentaContaDetaGrupoActi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCuentaContaDetaGrupoActi=new JScrollPane(this.jListRelacionesSelectReporteCuentaContaDetaGrupoActi);
			
			this.jScrollRelacionesSelectReporteCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCuentaContaDetaGrupoActi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCuentaContaDetaGrupoActi = new JComboBoxMe();
		this.jListColumnasValoresGraficoCuentaContaDetaGrupoActi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCuentaContaDetaGrupoActi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCuentaContaDetaGrupoActi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContaDetaGrupoActi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContaDetaGrupoActi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCuentaContaDetaGrupoActi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCuentaContaDetaGrupoActi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaContaDetaGrupoActi.add(this.jLabelGenerarExcelReporteDinamicoCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCuentaContaDetaGrupoActi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCuentaContaDetaGrupoActi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCuentaContaDetaGrupoActi.setToolTipText("Generar EXCEL"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCuentaContaDetaGrupoActi.add(this.jButtonGenerarExcelReporteDinamicoCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaContaDetaGrupoActi.add(this.jComboBoxTiposReportesDinamicoCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCuentaContaDetaGrupoActi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCuentaContaDetaGrupoActi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaContaDetaGrupoActi.add(this.jLabelTiposArchivoReporteDinamicoCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaContaDetaGrupoActi.add(this.jComboBoxTiposArchivosReportesDinamicoCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCuentaContaDetaGrupoActi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCuentaContaDetaGrupoActi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCuentaContaDetaGrupoActi.setToolTipText("Generar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaContaDetaGrupoActi.add(this.jButtonGenerarReporteDinamicoCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCuentaContaDetaGrupoActi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCuentaContaDetaGrupoActi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCuentaContaDetaGrupoActi.setToolTipText("Cancelar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaContaDetaGrupoActi.add(this.jButtonCerrarReporteDinamicoCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCuentaContaDetaGrupoActi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCuentaContaDetaGrupoActi= new JScrollPane(jPanelReporteDinamicoCuentaContaDetaGrupoActi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Conta Deta Grupo Actis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCuentaContaDetaGrupoActi);
		this.jInternalFrameReporteDinamicoCuentaContaDetaGrupoActi.getContentPane().add(this.jScrollPanelReporteDinamicoCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCuentaContaDetaGrupoActi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCuentaContaDetaGrupoActi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCuentaContaDetaGrupoActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCuentaContaDetaGrupoActi.setName("jPanelImportacionCuentaContaDetaGrupoActi"); 
		
		this.jPanelImportacionCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCuentaContaDetaGrupoActi.setLayout(gridaBagLayoutImportacionCuentaContaDetaGrupoActi);
		
		
		this.jInternalFrameImportacionCuentaContaDetaGrupoActi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCuentaContaDetaGrupoActi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCuentaContaDetaGrupoActi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaContaDetaGrupoActi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setResizable(true);
	    this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setClosable(true);
	    this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setResizable(true);
	    this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setClosable(true);
	    this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Conta Deta Grupo Actis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCuentaContaDetaGrupoActi = new JLabelMe();

		this.jLabelArchivoImportacionCuentaContaDetaGrupoActi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaContaDetaGrupoActi.add(this.jLabelArchivoImportacionCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCuentaContaDetaGrupoActi = new JFileChooser();		
		this.jFileChooserImportacionCuentaContaDetaGrupoActi.setToolTipText("ESCOGER ARCHIVO"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonAbrirImportacionCuentaContaDetaGrupoActi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCuentaContaDetaGrupoActi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCuentaContaDetaGrupoActi.setToolTipText("Generar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaContaDetaGrupoActi.add(this.jButtonAbrirImportacionCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCuentaContaDetaGrupoActi = new JLabelMe();

		this.jLabelPathArchivoImportacionCuentaContaDetaGrupoActi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaContaDetaGrupoActi.add(this.jLabelPathArchivoImportacionCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCuentaContaDetaGrupoActi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaContaDetaGrupoActi.add(this.jTextFieldPathArchivoImportacionCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonGenerarImportacionCuentaContaDetaGrupoActi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCuentaContaDetaGrupoActi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCuentaContaDetaGrupoActi.setToolTipText("Generar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaContaDetaGrupoActi.add(this.jButtonGenerarImportacionCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonCerrarImportacionCuentaContaDetaGrupoActi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCuentaContaDetaGrupoActi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCuentaContaDetaGrupoActi.setToolTipText("Cancelar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaContaDetaGrupoActi.add(this.jButtonCerrarImportacionCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCuentaContaDetaGrupoActi = new GridBagLayout();
		
		this.jScrollPanelImportacionCuentaContaDetaGrupoActi= new JScrollPane(jPanelImportacionCuentaContaDetaGrupoActi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy =iPosYImportacion;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx =iPosXImportacion;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCuentaContaDetaGrupoActi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCuentaContaDetaGrupoActi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCuentaContaDetaGrupoActi);
		this.jInternalFrameImportacionCuentaContaDetaGrupoActi.getContentPane().add(this.jScrollPanelImportacionCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCuentaContaDetaGrupoActi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCuentaContaDetaGrupoActi = new JButtonMe();
			this.jButtonAbrirOrderByCuentaContaDetaGrupoActi.setText("Orden");
			this.jButtonAbrirOrderByCuentaContaDetaGrupoActi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaContaDetaGrupoActi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCuentaContaDetaGrupoActi";
			inputMap = this.jButtonAbrirOrderByCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCuentaContaDetaGrupoActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCuentaContaDetaGrupoActi"));
		
		
			GridBagLayout gridaBagLayoutOrderByCuentaContaDetaGrupoActi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCuentaContaDetaGrupoActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCuentaContaDetaGrupoActi.setName("jPanelOrderByCuentaContaDetaGrupoActi"); 
			
			this.jPanelOrderByCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCuentaContaDetaGrupoActi.setLayout(gridaBagLayoutOrderByCuentaContaDetaGrupoActi);
			
			
			this.jTableDatosCuentaContaDetaGrupoActiOrderBy = new JTableMe();        
			this.jTableDatosCuentaContaDetaGrupoActiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCuentaContaDetaGrupoActiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCuentaContaDetaGrupoActiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCuentaContaDetaGrupoActiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCuentaContaDetaGrupoActiOrderBy.setViewportView(this.jTableDatosCuentaContaDetaGrupoActiOrderBy);
			this.jTableDatosCuentaContaDetaGrupoActiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCuentaContaDetaGrupoActiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCuentaContaDetaGrupoActi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCuentaContaDetaGrupoActi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setTitle("Orden");
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setResizable(true);
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setClosable(true);
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Conta Deta Grupo Actis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCuentaContaDetaGrupoActi.ipady =150;
				
			this.jPanelOrderByCuentaContaDetaGrupoActi.add(jScrollPanelDatosCuentaContaDetaGrupoActiOrderBy, this.gridBagConstraintsCuentaContaDetaGrupoActi);//this.jTableDatosCuentaContaDetaGrupoActiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCuentaContaDetaGrupoActi = new JButtonMe();
			this.jButtonCerrarOrderByCuentaContaDetaGrupoActi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCuentaContaDetaGrupoActi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCuentaContaDetaGrupoActi.setToolTipText("Cancelar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCuentaContaDetaGrupoActi.add(this.jButtonCerrarOrderByCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCuentaContaDetaGrupoActi = new GridBagLayout();
			
			this.jScrollPanelOrderByCuentaContaDetaGrupoActi= new JScrollPane(jPanelOrderByCuentaContaDetaGrupoActi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy =iPosYOrderBy;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCuentaContaDetaGrupoActi);
			
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getContentPane().add(this.jScrollPanelOrderByCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);			
		
		} else {
			this.jButtonAbrirOrderByCuentaContaDetaGrupoActi = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCuentaContaDetaGrupoActi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCuentaContaDetaGrupoActi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCuentaContaDetaGrupoActi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCuentaContaDetaGrupoActi.getRowHeight();//CuentaContaDetaGrupoActiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CuentaContaDetaGrupoActiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaContaDetaGrupoActi.isSelected()) {
					iHeightTable=CuentaContaDetaGrupoActiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaContaDetaGrupoActiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaContaDetaGrupoActiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CuentaContaDetaGrupoActiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaContaDetaGrupoActi.isSelected()) {
					iHeightTable=CuentaContaDetaGrupoActiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaContaDetaGrupoActiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaContaDetaGrupoActiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCuentaContaDetaGrupoActi!=null && this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjTableDatosOrderBy()!=null) {
			//if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCuentaContaDetaGrupoActi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentacontadetagrupoactis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CuentaContaDetaGrupoActi> TraerCuentaContaDetaGrupoActiBeans(List<CuentaContaDetaGrupoActi> cuentacontadetagrupoactis,ArrayList<Classe> classes)throws Exception {
		try {
			for(CuentaContaDetaGrupoActi cuentacontadetagrupoacti:cuentacontadetagrupoactis) {
					
				if(!(CuentaContaDetaGrupoActiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CuentaContaDetaGrupoActiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cuentacontadetagrupoacti.setsDetalleGeneralEntityReporte(CuentaContaDetaGrupoActiConstantesFunciones.getCuentaContaDetaGrupoActiDescripcion(cuentacontadetagrupoacti));
										
						
					
						
					
				} else  {
							
					//cuentacontadetagrupoacti.setsDetalleGeneralEntityReporte(cuentacontadetagrupoacti.getsDetalleGeneralEntityReporte());
										
				}
				
				//cuentacontadetagrupoactibeans.add(cuentacontadetagrupoactibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cuentacontadetagrupoactis;
    }
	//PARA REPORTES FIN
}
