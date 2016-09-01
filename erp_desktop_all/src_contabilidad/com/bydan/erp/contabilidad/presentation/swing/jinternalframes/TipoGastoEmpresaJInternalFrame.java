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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoGastoEmpresaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoGastoEmpresaJInternalFrame extends TipoGastoEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoGastoEmpresa;
	
	protected JMenuBar jmenuBarTipoGastoEmpresa;
	
	protected JMenu jmenuTipoGastoEmpresa;
	protected JMenu jmenuDatosTipoGastoEmpresa;
	protected JMenu jmenuArchivoTipoGastoEmpresa;
	protected JMenu jmenuAccionesTipoGastoEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGastoEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoGastoEmpresa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoGastoEmpresaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoGastoEmpresa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoGastoEmpresa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoGastoEmpresa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablegastoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablegasto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefiscalbienBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefiscalbien="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefiscalservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefiscalservicio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableretencionbienBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableretencionbien="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableretencionservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableretencionservicio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableivabienBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableivabien="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableivaservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableivaservicio="";
	
	public TipoGastoEmpresaSessionBean tipogastoempresaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public CuentaContableSessionBean cuentacontablegastoSessionBean;
	public CuentaContableSessionBean cuentacontablefiscalbienSessionBean;
	public CuentaContableSessionBean cuentacontablefiscalservicioSessionBean;
	public CuentaContableSessionBean cuentacontableretencionbienSessionBean;
	public CuentaContableSessionBean cuentacontableretencionservicioSessionBean;
	public CuentaContableSessionBean cuentacontableivabienSessionBean;
	public CuentaContableSessionBean cuentacontableivaservicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoGastoEmpresa> tipogastoempresas;		
	public List<TipoGastoEmpresa> tipogastoempresasEliminados;	
	public List<TipoGastoEmpresa> tipogastoempresasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoGastoEmpresa;		
	protected JButton jButtonAbrirOrderByTipoGastoEmpresa;
	
	
	//protected JPanel jPanelOrderByTipoGastoEmpresa;
	//public JScrollPane jScrollPanelOrderByTipoGastoEmpresa;	
	//protected JButton jButtonCerrarOrderByTipoGastoEmpresa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoGastoEmpresaLogic tipogastoempresaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoGastoEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoGastoEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoGastoEmpresa;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoGastoEmpresaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoGastoEmpresa;
	//public JScrollPane jScrollPanelImportacionTipoGastoEmpresa;
	
	
	
	protected JPanel jPanelAccionesTipoGastoEmpresa;
	
    protected JPanel jPanelPaginacionTipoGastoEmpresa;
    protected JPanel jPanelParametrosReportesTipoGastoEmpresa;
	protected JPanel jPanelParametrosReportesAccionesTipoGastoEmpresa;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralTipoGastoEmpresa;
	protected Integer iXPanelCamposIniciogeneralTipoGastoEmpresa=0;
	protected Integer iYPanelCamposIniciogeneralTipoGastoEmpresa=0;

	protected JPanel jPanelCamposIniciocuenta_contableTipoGastoEmpresa;
	protected Integer iXPanelCamposIniciocuenta_contableTipoGastoEmpresa=0;
	protected Integer iYPanelCamposIniciocuenta_contableTipoGastoEmpresa=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoGastoEmpresa;
	protected JPanel jPanelParametrosAuxiliar2TipoGastoEmpresa;
	protected JPanel jPanelParametrosAuxiliar3TipoGastoEmpresa;
	protected JPanel jPanelParametrosAuxiliar4TipoGastoEmpresa;
	//protected JPanel jPanelParametrosAuxiliar5TipoGastoEmpresa;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoGastoEmpresa;
	//protected JPanel jPanelImportacionTipoGastoEmpresa;
	
	
	public JTable jTableDatosTipoGastoEmpresa;
	
	
	
	//public JTable jTableDatosTipoGastoEmpresaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoGastoEmpresa;
	protected JButton jButtonDuplicarTipoGastoEmpresa;
	protected JButton jButtonCopiarTipoGastoEmpresa;
	protected JButton jButtonVerFormTipoGastoEmpresa;
	protected JButton jButtonNuevoRelacionesTipoGastoEmpresa;
	protected JButton jButtonModificarTipoGastoEmpresa;
	
    protected JButton jButtonGuardarCambiosTablaTipoGastoEmpresa;
	protected JButton jButtonCerrarTipoGastoEmpresa;
	
	
	protected JButton jButtonRecargarInformacionTipoGastoEmpresa;
	protected JButton jButtonProcesarInformacionTipoGastoEmpresa;
	
	
	protected JButton jButtonAnterioresTipoGastoEmpresa;
	protected JButton jButtonSiguientesTipoGastoEmpresa;
	protected JButton jButtonNuevoGuardarCambiosTipoGastoEmpresa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoGastoEmpresa;
	//protected JButton jButtonCerrarReporteDinamicoTipoGastoEmpresa;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoGastoEmpresa;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoGastoEmpresa;
	//protected JButton jButtonGenerarImportacionTipoGastoEmpresa;
	//protected JButton jButtonCerrarImportacionTipoGastoEmpresa;
	//protected JFileChooser jFileChooserImportacionTipoGastoEmpresa;
	//protected File fileImportacionTipoGastoEmpresa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGastoEmpresa;
	protected JButton jButtonDuplicarToolBarTipoGastoEmpresa;
	protected JButton jButtonNuevoRelacionesToolBarTipoGastoEmpresa;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoGastoEmpresa;
	protected JButton jButtonCopiarToolBarTipoGastoEmpresa;
	protected JButton jButtonVerFormToolBarTipoGastoEmpresa;
	public JButton jButtonGuardarCambiosTablaToolBarTipoGastoEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGastoEmpresa;
	protected JButton jButtonCerrarToolBarTipoGastoEmpresa;
	
	protected JButton jButtonRecargarInformacionToolBarTipoGastoEmpresa;
	protected JButton jButtonProcesarInformacionToolBarTipoGastoEmpresa;
	protected JButton jButtonAnterioresToolBarTipoGastoEmpresa;
	protected JButton jButtonSiguientesToolBarTipoGastoEmpresa;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoGastoEmpresa;
	protected JButton jButtonAbrirOrderByToolBarTipoGastoEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGastoEmpresa;
	protected JMenuItem jMenuItemDuplicarTipoGastoEmpresa;
	protected JMenuItem jMenuItemNuevoRelacionesTipoGastoEmpresa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoGastoEmpresa;
	protected JMenuItem jMenuItemCopiarTipoGastoEmpresa;
	protected JMenuItem jMenuItemVerFormTipoGastoEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGastoEmpresa;
	protected JMenuItem jMenuItemCerrarTipoGastoEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoGastoEmpresa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoGastoEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGastoEmpresa;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoGastoEmpresa;
	protected JMenuItem jMenuItemProcesarInformacionTipoGastoEmpresa;
	protected JMenuItem jMenuItemAnterioresTipoGastoEmpresa;
	protected JMenuItem jMenuItemSiguientesTipoGastoEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGastoEmpresa;
	protected JMenuItem jMenuItemAbrirOrderByTipoGastoEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoGastoEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGastoEmpresa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoGastoEmpresa;
	protected JCheckBox jCheckBoxSeleccionadosTipoGastoEmpresa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoGastoEmpresa;
	protected JCheckBox jCheckBoxConGraficoReporteTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoGastoEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGastoEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoGastoEmpresa;
	protected JTextField jTextFieldValorCampoGeneralTipoGastoEmpresa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoGastoEmpresa;
	//public JList<Reporte> jListColumnasSelectReporteTipoGastoEmpresa;
	//public JScrollPane jScrollColumnasSelectReporteTipoGastoEmpresa;
	
	//public JLabel jLabelRelacionesSelectReporteTipoGastoEmpresa;
	//public JList<Reporte> jListRelacionesSelectReporteTipoGastoEmpresa;
	//public JScrollPane jScrollRelacionesSelectReporteTipoGastoEmpresa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoGastoEmpresa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoGastoEmpresa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoGastoEmpresa;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoGastoEmpresa;
	
		
	//public JLabel jLabelArchivoImportacionTipoGastoEmpresa;	
	//public JLabel jLabelPathArchivoImportacionTipoGastoEmpresa;
	//protected JTextField jTextFieldPathArchivoImportacionTipoGastoEmpresa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoGastoEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoGastoEmpresa;
	
	//public JLabel jLabelColumnaCategoriaValorTipoGastoEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoGastoEmpresa;
	
	//public JLabel jLabelColumnasValoresGraficoTipoGastoEmpresa;
	//public JList<Reporte> jListColumnasValoresGraficoTipoGastoEmpresa;
	//public JScrollPane jScrollColumnasValoresGraficoTipoGastoEmpresa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoGastoEmpresa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoGastoEmpresa;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoGastoEmpresa;
	public JPanel jPanelBusquedaPorNombreTipoGastoEmpresa;
	public JButton jButtonBusquedaPorNombreTipoGastoEmpresa;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoGastoEmpresa;
	public JLabel jLabelnombreBusquedaPorNombreTipoGastoEmpresa;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoGastoEmpresa;
	public JButton jButtonnombreBusquedaPorNombreTipoGastoEmpresaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoGastoEmpresaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoGastoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoEmpresaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGastoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoEmpresaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGastoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoEmpresaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGastoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoGastoEmpresa)	{
		this.jButtonRecargarInformacionTipoGastoEmpresa = jButtonRecargarInformacionTipoGastoEmpresa;
	}
	
	public JButton getjButtonProcesarInformacionTipoGastoEmpresa() {
		return this.jButtonProcesarInformacionTipoGastoEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGastoEmpresa)	{
		this.jButtonProcesarInformacionTipoGastoEmpresa = jButtonProcesarInformacionTipoGastoEmpresa;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoGastoEmpresa() {
		return this.jButtonRecargarInformacionTipoGastoEmpresa;
	}
	
	
	public List<TipoGastoEmpresa> gettipogastoempresas() {
		return this.tipogastoempresas;
	}

	public void settipogastoempresas(List<TipoGastoEmpresa> tipogastoempresas) {
		this.tipogastoempresas = tipogastoempresas;
	}
	
	public List<TipoGastoEmpresa> gettipogastoempresasAux() {
		return this.tipogastoempresasAux;
	}

	public void settipogastoempresasAux(List<TipoGastoEmpresa> tipogastoempresasAux) {
		this.tipogastoempresasAux = tipogastoempresasAux;
	}
	
	public List<TipoGastoEmpresa> gettipogastoempresasEliminados() {
		return this.tipogastoempresasEliminados;
	}

	public void setTipoGastoEmpresasEliminados(List<TipoGastoEmpresa> tipogastoempresasEliminados) {
		this.tipogastoempresasEliminados = tipogastoempresasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoGastoEmpresa() {
		return jComboBoxTiposSeleccionarTipoGastoEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoGastoEmpresa(
			JComboBox jComboBoxTiposSeleccionarTipoGastoEmpresa) {
		this.jComboBoxTiposSeleccionarTipoGastoEmpresa = jComboBoxTiposSeleccionarTipoGastoEmpresa;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoGastoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoGastoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoGastoEmpresa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoGastoEmpresa() {
		return jTextFieldValorCampoGeneralTipoGastoEmpresa;
	}

	public void setjTextFieldValorCampoGeneralTipoGastoEmpresa(
			JTextField jTextFieldValorCampoGeneralTipoGastoEmpresa) {
		this.jTextFieldValorCampoGeneralTipoGastoEmpresa = jTextFieldValorCampoGeneralTipoGastoEmpresa;
	}

	public void setBorderResaltarValorCampoGeneralTipoGastoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoEmpresa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoGastoEmpresa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoGastoEmpresa() {
		return this.jCheckBoxSeleccionarTodosTipoGastoEmpresa;
	}

	public void setjCheckBoxSeleccionarTodosTipoGastoEmpresa(
			JCheckBox jCheckBoxSeleccionarTodosTipoGastoEmpresa) {
		this.jCheckBoxSeleccionarTodosTipoGastoEmpresa = jCheckBoxSeleccionarTodosTipoGastoEmpresa;
	}

	public void setBorderResaltarSeleccionarTodosTipoGastoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoGastoEmpresa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoGastoEmpresa() {
		return this.jCheckBoxSeleccionadosTipoGastoEmpresa;
	}

	public void setjCheckBoxSeleccionadosTipoGastoEmpresa(
			JCheckBox jCheckBoxSeleccionadosTipoGastoEmpresa) {
		this.jCheckBoxSeleccionadosTipoGastoEmpresa = jCheckBoxSeleccionadosTipoGastoEmpresa;
	}
	
	public void setBorderResaltarSeleccionadosTipoGastoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoGastoEmpresa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoGastoEmpresa() {
		return this.jComboBoxTiposArchivosReportesTipoGastoEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoGastoEmpresa(
			JComboBox jComboBoxTiposArchivosReportesTipoGastoEmpresa) {
		this.jComboBoxTiposArchivosReportesTipoGastoEmpresa = jComboBoxTiposArchivosReportesTipoGastoEmpresa;
	}

	public void setBorderResaltarTiposArchivosReportesTipoGastoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoGastoEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoGastoEmpresa() {
		return this.jComboBoxTiposReportesTipoGastoEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoGastoEmpresa(
			JComboBox jComboBoxTiposReportesTipoGastoEmpresa) {
		this.jComboBoxTiposReportesTipoGastoEmpresa = jComboBoxTiposReportesTipoGastoEmpresa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoGastoEmpresa() {
	//	return jComboBoxTiposReportesDinamicoTipoGastoEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoGastoEmpresa(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoGastoEmpresa) {
	//	this.jComboBoxTiposReportesDinamicoTipoGastoEmpresa = jComboBoxTiposReportesDinamicoTipoGastoEmpresa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoGastoEmpresa() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoGastoEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoGastoEmpresa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGastoEmpresa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoGastoEmpresa = jComboBoxTiposArchivosReportesDinamicoTipoGastoEmpresa;
	//}
	
	public void setBorderResaltarTiposReportesTipoGastoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoGastoEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoGastoEmpresa() {
		return this.jComboBoxTiposGraficosReportesTipoGastoEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoGastoEmpresa(
			JComboBox jComboBoxTiposGraficosReportesTipoGastoEmpresa) {
		this.jComboBoxTiposGraficosReportesTipoGastoEmpresa = jComboBoxTiposGraficosReportesTipoGastoEmpresa;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoGastoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoGastoEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoGastoEmpresa() {
		return this.jComboBoxTiposPaginacionTipoGastoEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoGastoEmpresa(
			JComboBox jComboBoxTiposPaginacionTipoGastoEmpresa) {
		this.jComboBoxTiposPaginacionTipoGastoEmpresa = jComboBoxTiposPaginacionTipoGastoEmpresa;
	}
	
	public void setBorderResaltarTiposPaginacionTipoGastoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoGastoEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoGastoEmpresa() {
		return this.jComboBoxTiposRelacionesTipoGastoEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGastoEmpresa() {
		return this.jComboBoxTiposAccionesTipoGastoEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGastoEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoGastoEmpresa) {
		this.jComboBoxTiposRelacionesTipoGastoEmpresa = jComboBoxTiposRelacionesTipoGastoEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGastoEmpresa(
			JComboBox jComboBoxTiposAccionesTipoGastoEmpresa) {
		this.jComboBoxTiposAccionesTipoGastoEmpresa = jComboBoxTiposAccionesTipoGastoEmpresa;
	}
	
	public void setBorderResaltarTiposRelacionesTipoGastoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoGastoEmpresa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoGastoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoGastoEmpresa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoGastoEmpresa() {
	//	return jCheckBoxConGraficoDinamicoTipoGastoEmpresa;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoGastoEmpresa(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoGastoEmpresa) {
	//	this.jCheckBoxConGraficoDinamicoTipoGastoEmpresa = jCheckBoxConGraficoDinamicoTipoGastoEmpresa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoGastoEmpresa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoGastoEmpresa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoGastoEmpresa .setBorder(borderResaltar);		
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
		this.tipogastoempresaSessionBean=new TipoGastoEmpresaSessionBean();
		
		this.tipogastoempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogastoempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogastoempresaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoGastoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoGastoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGastoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGastoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGastoEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Gasto Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipogastoempresaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoGastoEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoGastoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoGastoEmpresa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoGastoEmpresa,this.jTtoolBarTipoGastoEmpresa,
							"nuevo","nuevo","Nuevo"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoGastoEmpresa,this.jTtoolBarTipoGastoEmpresa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoGastoEmpresa,this.jTtoolBarTipoGastoEmpresa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoGastoEmpresa,this.jTtoolBarTipoGastoEmpresa,
							"duplicar","duplicar","Duplicar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoGastoEmpresa,this.jTtoolBarTipoGastoEmpresa,
							"copiar","copiar","Copiar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoGastoEmpresa,this.jTtoolBarTipoGastoEmpresa,
							"ver_form","ver_form","Ver"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGastoEmpresa,this.jTtoolBarTipoGastoEmpresa,
							"recargar","recargar","Recargar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGastoEmpresa,this.jTtoolBarTipoGastoEmpresa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGastoEmpresa,this.jTtoolBarTipoGastoEmpresa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoGastoEmpresa,this.jTtoolBarTipoGastoEmpresa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoGastoEmpresa,this.jTtoolBarTipoGastoEmpresa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoGastoEmpresa,this.jTtoolBarTipoGastoEmpresa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoGastoEmpresa,this.jTtoolBarTipoGastoEmpresa,
							"cerrar","cerrar","Salir"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoGastoEmpresa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoGastoEmpresa;
			
				this.jButtonProcesarInformacionToolBarTipoGastoEmpresa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoGastoEmpresa;
				
		//protected JButton jButtonModificarToolBarTipoGastoEmpresa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoGastoEmpresa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoGastoEmpresa=new JMenuMe("General");
		this.jmenuArchivoTipoGastoEmpresa=new JMenuMe("Archivo");
		this.jmenuAccionesTipoGastoEmpresa=new JMenuMe("Acciones");
		this.jmenuDatosTipoGastoEmpresa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGastoEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGastoEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGastoEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoGastoEmpresa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoGastoEmpresa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoGastoEmpresa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoGastoEmpresa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoGastoEmpresa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoGastoEmpresa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoGastoEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGastoEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGastoEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoGastoEmpresa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoGastoEmpresa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoGastoEmpresa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoGastoEmpresa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoGastoEmpresa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoGastoEmpresa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoGastoEmpresa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoGastoEmpresa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoGastoEmpresa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGastoEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGastoEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGastoEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoGastoEmpresa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoGastoEmpresa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoGastoEmpresa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoGastoEmpresa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoGastoEmpresa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoGastoEmpresa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoGastoEmpresa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoGastoEmpresa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoGastoEmpresa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoGastoEmpresa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoGastoEmpresa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoGastoEmpresa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoGastoEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoGastoEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoGastoEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGastoEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGastoEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGastoEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoGastoEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoGastoEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoGastoEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGastoEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGastoEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGastoEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoGastoEmpresa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoGastoEmpresa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoGastoEmpresa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoGastoEmpresa.add(this.jMenuItemCerrarTipoGastoEmpresa);
			
			this.jmenuAccionesTipoGastoEmpresa.add(this.jMenuItemNuevoTipoGastoEmpresa);
			this.jmenuAccionesTipoGastoEmpresa.add(this.jMenuItemNuevoGuardarCambiosTipoGastoEmpresa);
			this.jmenuAccionesTipoGastoEmpresa.add(this.jMenuItemNuevoRelacionesTipoGastoEmpresa);
			this.jmenuAccionesTipoGastoEmpresa.add(this.jMenuItemGuardarCambiosTablaTipoGastoEmpresa);		
			this.jmenuAccionesTipoGastoEmpresa.add(this.jMenuItemDuplicarTipoGastoEmpresa);		
			this.jmenuAccionesTipoGastoEmpresa.add(this.jMenuItemCopiarTipoGastoEmpresa);		
			this.jmenuAccionesTipoGastoEmpresa.add(this.jMenuItemVerFormTipoGastoEmpresa);		
			
			this.jmenuDatosTipoGastoEmpresa.add(this.jMenuItemRecargarInformacionTipoGastoEmpresa);				
			this.jmenuDatosTipoGastoEmpresa.add(this.jMenuItemAnterioresTipoGastoEmpresa);				
			this.jmenuDatosTipoGastoEmpresa.add(this.jMenuItemSiguientesTipoGastoEmpresa);				
			this.jmenuDatosTipoGastoEmpresa.add(this.jMenuItemAbrirOrderByTipoGastoEmpresa);				
			this.jmenuDatosTipoGastoEmpresa.add(this.jMenuItemMostrarOcultarTipoGastoEmpresa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoGastoEmpresa.add(this.jMenuItemGuardarCambiosTipoGastoEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoGastoEmpresa.add(this.jmenuArchivoTipoGastoEmpresa);		
			this.jmenuBarTipoGastoEmpresa.add(this.jmenuAccionesTipoGastoEmpresa);		
			this.jmenuBarTipoGastoEmpresa.add(this.jmenuDatosTipoGastoEmpresa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoGastoEmpresa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoGastoEmpresa() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoGastoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoGastoEmpresa.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoGastoEmpresa= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoGastoEmpresa.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoGastoEmpresa.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoGastoEmpresa,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoGastoEmpresa = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoGastoEmpresa.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoGastoEmpresa.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoGastoEmpresa= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoGastoEmpresa=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoGastoEmpresa.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoGastoEmpresa.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoGastoEmpresa.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoGastoEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoGastoEmpresa = new TipoGastoEmpresaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Gasto Empresa DATOS");
			this.jInternalFrameDetalleFormTipoGastoEmpresa = new TipoGastoEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipogastoempresaSessionBean.getConGuardarRelaciones(),this.tipogastoempresaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoGastoEmpresa = null;//new TipoGastoEmpresaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGastoEmpresa= new GridBagLayout();
		
		
		this.jTableDatosTipoGastoEmpresa = new JTableMe();      
		
		String sToolTipTipoGastoEmpresa="";
		sToolTipTipoGastoEmpresa=TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGastoEmpresa+="(Contabilidad.TipoGastoEmpresa)";
		}
		
		if(!this.tipogastoempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGastoEmpresa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoGastoEmpresa.setToolTipText(sToolTipTipoGastoEmpresa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoGastoEmpresa);
		this.jTableDatosTipoGastoEmpresa.setAutoCreateRowSorter(true);
		this.jTableDatosTipoGastoEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoGastoEmpresa.setRowSelectionAllowed(true);
		this.jTableDatosTipoGastoEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoGastoEmpresa = new JButtonMe();
		this.jButtonDuplicarTipoGastoEmpresa = new JButtonMe();
		this.jButtonCopiarTipoGastoEmpresa = new JButtonMe();
		this.jButtonVerFormTipoGastoEmpresa = new JButtonMe();
		this.jButtonNuevoRelacionesTipoGastoEmpresa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoGastoEmpresa = new JButtonMe();
		this.jButtonCerrarTipoGastoEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoGastoEmpresa = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoGastoEmpresa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Tipo Gasto Empresa";
		
		if(!this.tipogastoempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGastoEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGastoEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoGastoEmpresa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralTipoGastoEmpresa.setName("jPanelCamposFingeneralTipoGastoEmpresa");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa.setName("jPanelCamposFincuenta_contableTipoGastoEmpresa");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoTipoGastoEmpresa=new ReporteDinamicoJInternalFrame(TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoGastoEmpresa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoGastoEmpresa=new ImportacionJInternalFrame(TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoGastoEmpresa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoGastoEmpresa = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoGastoEmpresa.setText("Orden");
		this.jButtonAbrirOrderByTipoGastoEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGastoEmpresa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoGastoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGastoEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGastoEmpresa,false,this);
			
			//this.cargarOrderByTipoGastoEmpresa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGastoEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGastoEmpresa,true,this);
			
			//this.cargarOrderByTipoGastoEmpresa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoGastoEmpresa.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosTipoGastoEmpresa.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosTipoGastoEmpresa.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosTipoGastoEmpresa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGastoEmpresa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGastoEmpresa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoGastoEmpresa.setText("Nuevo");
		this.jButtonDuplicarTipoGastoEmpresa.setText("Duplicar");
		this.jButtonCopiarTipoGastoEmpresa.setText("Copiar");
		this.jButtonVerFormTipoGastoEmpresa.setText("Ver");
		this.jButtonNuevoRelacionesTipoGastoEmpresa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoGastoEmpresa.setText("Guardar");
		this.jButtonCerrarTipoGastoEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGastoEmpresa,"nuevo_button","Nuevo",this.tipogastoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoGastoEmpresa,"duplicar_button","Duplicar",this.tipogastoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoGastoEmpresa,"copiar_button","Copiar",this.tipogastoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoGastoEmpresa,"ver_form","Ver",this.tipogastoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoGastoEmpresa,"nuevorelaciones_button","Nuevo Rel",this.tipogastoempresaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGastoEmpresa,"guardarcambiostabla_button","Guardar",this.tipogastoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGastoEmpresa,"cerrar_button","Salir",this.tipogastoempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoGastoEmpresa.setToolTipText("Nuevo"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoGastoEmpresa.setToolTipText("Duplicar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoGastoEmpresa.setToolTipText("Copiar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoGastoEmpresa.setToolTipText("Ver"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoGastoEmpresa.setToolTipText("Nuevo Rel"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoGastoEmpresa.setToolTipText("Guardar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGastoEmpresa.setToolTipText("Salir"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGastoEmpresa";
		inputMap = this.jButtonNuevoTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGastoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGastoEmpresa"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoGastoEmpresa";
		inputMap = this.jButtonDuplicarTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoGastoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoGastoEmpresa"));
		
		//COPIAR
		sMapKey = "CopiarTipoGastoEmpresa";
		inputMap = this.jButtonCopiarTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoGastoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoGastoEmpresa"));
		
		//VEr FORM
		sMapKey = "VerFormTipoGastoEmpresa";
		inputMap = this.jButtonVerFormTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoGastoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoGastoEmpresa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoGastoEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoGastoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoGastoEmpresa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoGastoEmpresa";
		inputMap = this.jButtonModificarTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoGastoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoGastoEmpresa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoGastoEmpresa";
		inputMap = this.jButtonCerrarTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGastoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGastoEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGastoEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGastoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGastoEmpresa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoGastoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoGastoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoGastoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoGastoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoGastoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoGastoEmpresa.setName("jPanelParametrosReportesTipoGastoEmpresa"); 
		
		this.jPanelParametrosReportesAccionesTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoGastoEmpresa.setName("jPanelParametrosReportesAccionesTipoGastoEmpresa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoGastoEmpresa = new JButtonMe();
		this.jButtonRecargarInformacionTipoGastoEmpresa.setText("Recargar");
		this.jButtonRecargarInformacionTipoGastoEmpresa.setToolTipText("Recargar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoGastoEmpresa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoGastoEmpresa = new JButtonMe();
		this.jButtonProcesarInformacionTipoGastoEmpresa.setText("Procesar");
		this.jButtonProcesarInformacionTipoGastoEmpresa.setToolTipText("Procesar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoGastoEmpresa.setVisible(false);
			
		this.jButtonProcesarInformacionTipoGastoEmpresa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGastoEmpresa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGastoEmpresa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoGastoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGastoEmpresa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoGastoEmpresa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoGastoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGastoEmpresa.setText("TIPO");       
		this.jComboBoxTiposReportesTipoGastoEmpresa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoGastoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGastoEmpresa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoGastoEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoGastoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoGastoEmpresa.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoGastoEmpresa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoGastoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoGastoEmpresa.setText("Accion");
		this.jComboBoxTiposRelacionesTipoGastoEmpresa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoGastoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGastoEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoGastoEmpresa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoGastoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoGastoEmpresa.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoGastoEmpresa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoGastoEmpresa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoGastoEmpresa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGastoEmpresa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGastoEmpresa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoGastoEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoGastoEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoGastoEmpresa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoGastoEmpresa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoGastoEmpresa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoGastoEmpresa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoGastoEmpresa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoGastoEmpresa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoGastoEmpresa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoGastoEmpresa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoGastoEmpresa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoGastoEmpresa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoGastoEmpresa.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoGastoEmpresa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoGastoEmpresa = new JButtonMe();
		//this.jButtonAnterioresTipoGastoEmpresa.setText("<<");
        this.jButtonAnterioresTipoGastoEmpresa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoGastoEmpresa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoGastoEmpresa = new JButtonMe();
		//this.jButtonSiguientesTipoGastoEmpresa.setText(">>");
        this.jButtonSiguientesTipoGastoEmpresa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoGastoEmpresa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoGastoEmpresa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoGastoEmpresa.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoGastoEmpresa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoGastoEmpresa,"nuevoguardarcambios_button","Nue",this.tipogastoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoGastoEmpresa";
		inputMap = this.jButtonNuevoGuardarCambiosTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoGastoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoGastoEmpresa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoGastoEmpresa";
		inputMap = this.jButtonRecargarInformacionTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoGastoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoGastoEmpresa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoGastoEmpresa";
		inputMap = this.jButtonSiguientesTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoGastoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoGastoEmpresa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoGastoEmpresa";
		inputMap = this.jButtonAnterioresTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoGastoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoGastoEmpresa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoGastoEmpresa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoGastoEmpresa.setMinimumSize(new Dimension(this.getWidth(),TipoGastoEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGastoEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGastoEmpresa.setMaximumSize(new Dimension(this.getWidth(),TipoGastoEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGastoEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGastoEmpresa.setPreferredSize(new Dimension(this.getWidth(),TipoGastoEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGastoEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoGastoEmpresa = new GridBagLayout();

			this.jPanelPaginacionTipoGastoEmpresa.setLayout(gridaBagLayoutPaginacionTipoGastoEmpresa);						
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoGastoEmpresa.add(this.jButtonAnterioresTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
					
						
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
			
			this.jPanelPaginacionTipoGastoEmpresa.add(this.jButtonNuevoGuardarCambiosTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
						
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
			this.jPanelPaginacionTipoGastoEmpresa.add(this.jButtonSiguientesTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = 1;
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGastoEmpresa.add(this.jButtonNuevoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
						
			
			
			if(!this.tipogastoempresaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGastoEmpresa.gridy = 1;
				this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoGastoEmpresa.add(this.jButtonGuardarCambiosTablaTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
			}
			
			
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = 1;
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGastoEmpresa.add(this.jButtonDuplicarTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = 1;
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGastoEmpresa.add(this.jButtonCopiarTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = 1;
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGastoEmpresa.add(this.jButtonVerFormTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = 1;
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoGastoEmpresa.add(this.jButtonCerrarTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		
		
		
		this.jButtonRecargarInformacionTipoGastoEmpresa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGastoEmpresa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGastoEmpresa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoGastoEmpresa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGastoEmpresa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGastoEmpresa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoGastoEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGastoEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGastoEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoGastoEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGastoEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGastoEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoGastoEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGastoEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGastoEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoGastoEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGastoEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGastoEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoGastoEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGastoEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGastoEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoGastoEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGastoEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGastoEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoGastoEmpresa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGastoEmpresa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGastoEmpresa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoGastoEmpresa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGastoEmpresa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGastoEmpresa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoGastoEmpresa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGastoEmpresa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGastoEmpresa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoGastoEmpresa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGastoEmpresa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGastoEmpresa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoGastoEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoGastoEmpresa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoGastoEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoGastoEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoGastoEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoGastoEmpresa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoGastoEmpresa.setLayout(gridaBagParametrosReportesTipoGastoEmpresa);
			this.jPanelParametrosReportesAccionesTipoGastoEmpresa.setLayout(gridaBagParametrosReportesAccionesTipoGastoEmpresa);
			
			
			this.jPanelParametrosAuxiliar1TipoGastoEmpresa.setLayout(gridaBagParametrosAuxiliar1TipoGastoEmpresa);
			this.jPanelParametrosAuxiliar2TipoGastoEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoGastoEmpresa);
			this.jPanelParametrosAuxiliar3TipoGastoEmpresa.setLayout(gridaBagParametrosAuxiliar3TipoGastoEmpresa);
			this.jPanelParametrosAuxiliar4TipoGastoEmpresa.setLayout(gridaBagParametrosAuxiliar4TipoGastoEmpresa);
			//this.jPanelParametrosAuxiliar5TipoGastoEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoGastoEmpresa);			
			
			
			
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGastoEmpresa.add(this.jButtonRecargarInformacionTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGastoEmpresa.add(this.jComboBoxTiposPaginacionTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGastoEmpresa.add(this.jCheckBoxConAltoMaximoTablaTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGastoEmpresa.add(this.jComboBoxTiposArchivosReportesTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGastoEmpresa.add(this.jPanelParametrosAuxiliar1TipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoGastoEmpresa.add(this.jComboBoxTiposReportesTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGastoEmpresa.add(this.jPanelParametrosAuxiliar4TipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGastoEmpresa.add(this.jComboBoxTiposReportesTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGastoEmpresa.add(this.jCheckBoxGenerarReporteTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGastoEmpresa.add(this.jPanelParametrosAuxiliar2TipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGastoEmpresa.add(this.jLabelAccionesTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoGastoEmpresa.add(this.jButtonAbrirOrderByTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGastoEmpresa.add(this.jComboBoxTiposSeleccionarTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);			
			
			
			/*
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGastoEmpresa.add(this.jCheckBoxSeleccionarTodosTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGastoEmpresa.add(this.jCheckBoxSeleccionarTodosTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);															
				
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGastoEmpresa.add(this.jCheckBoxSeleccionadosTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGastoEmpresa.add(this.jPanelParametrosAuxiliar3TipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGastoEmpresa.add(this.jComboBoxTiposRelacionesTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
				
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGastoEmpresa.add(this.jComboBoxTiposAccionesTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
	
				
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGastoEmpresa.add(this.jTextFieldValorCampoGeneralTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralTipoGastoEmpresa= new GridBagLayout();
		this.jPanelCamposIniciogeneralTipoGastoEmpresa.setLayout(gridaBagLayoutCamposIniciogeneralTipoGastoEmpresa);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableTipoGastoEmpresa= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa.setLayout(gridaBagLayoutCamposIniciocuenta_contableTipoGastoEmpresa);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoGastoEmpresa = new GridBagLayout();

			this.jScrollPanelDatosTipoGastoEmpresa.setLayout(gridaBagLayoutDatosTipoGastoEmpresa);
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
			this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
			
			this.jScrollPanelDatosTipoGastoEmpresa.add(this.jTableDatosTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoGastoEmpresa.setViewportView(this.jTableDatosTipoGastoEmpresa);
		this.jTableDatosTipoGastoEmpresa.setFillsViewportHeight(true);
		this.jTableDatosTipoGastoEmpresa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoGastoEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoGastoEmpresa.setLayout(gridaBagLayoutAccionesTipoGastoEmpresa);
		
		
		/*	
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
			
		this.jPanelAccionesTipoGastoEmpresa.add(this.jButtonNuevoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoGastoEmpresa= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoGastoEmpresa.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoGastoEmpresa.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoGastoEmpresa.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoGastoEmpresa.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoGastoEmpresa.setLayout(gridaBagLayoutBusquedaPorNombreTipoGastoEmpresa);

		gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		gridBagConstraintsTipoGastoEmpresa.gridx = 0;
		jPanelBusquedaPorNombreTipoGastoEmpresa.add(jLabelnombreBusquedaPorNombreTipoGastoEmpresa, gridBagConstraintsTipoGastoEmpresa);

		gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		gridBagConstraintsTipoGastoEmpresa.gridx = 1;
		jPanelBusquedaPorNombreTipoGastoEmpresa.add(jTextAreanombreBusquedaPorNombreTipoGastoEmpresa, gridBagConstraintsTipoGastoEmpresa);

		gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGastoEmpresa.gridy = 1;
		gridBagConstraintsTipoGastoEmpresa.gridx =1;
		jPanelBusquedaPorNombreTipoGastoEmpresa.add(jButtonBusquedaPorNombreTipoGastoEmpresa, gridBagConstraintsTipoGastoEmpresa);

		jTabbedPaneBusquedasTipoGastoEmpresa.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoGastoEmpresa);
		jTabbedPaneBusquedasTipoGastoEmpresa.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGastoEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGastoEmpresa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogastoempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoGastoEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGastoEmpresa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;		
		//this.gridBagConstraintsTipoGastoEmpresa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoGastoEmpresa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;		
			this.gridBagConstraintsTipoGastoEmpresa.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoGastoEmpresa.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);								
		
		
		/*
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		*/		
		
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGastoEmpresa.gridx =0;
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGastoEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
				
		
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoGastoEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoGastoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGastoEmpresa = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoGastoEmpresa.setLayout(gridaBagLayoutBusquedasParametrosTipoGastoEmpresa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoGastoEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGastoEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGastoEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGastoEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
			
			
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		
			
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoGastoEmpresa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoGastoEmpresa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoGastoEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoGastoEmpresa.setName("jPanelReporteDinamicoTipoGastoEmpresa"); 
		
		this.jPanelReporteDinamicoTipoGastoEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGastoEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGastoEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoGastoEmpresa.setLayout(gridaBagLayoutReporteDinamicoTipoGastoEmpresa);
		
		
		this.jInternalFrameReporteDinamicoTipoGastoEmpresa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoGastoEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGastoEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoGastoEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoGastoEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoGastoEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoGastoEmpresa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoGastoEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoGastoEmpresa.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoGastoEmpresa.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoGastoEmpresa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoGastoEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGastoEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGastoEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Empresas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoGastoEmpresa = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoGastoEmpresa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGastoEmpresa.add(this.jLabelColumnasSelectReporteTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoGastoEmpresa = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoGastoEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoGastoEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoGastoEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGastoEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGastoEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoGastoEmpresa=new JScrollPane(this.jListColumnasSelectReporteTipoGastoEmpresa);
			
			this.jScrollColumnasSelectReporteTipoGastoEmpresa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGastoEmpresa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGastoEmpresa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGastoEmpresa.add(this.jListColumnasSelectReporteTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		this.jPanelReporteDinamicoTipoGastoEmpresa.add(this.jScrollColumnasSelectReporteTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoGastoEmpresa = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoGastoEmpresa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoGastoEmpresa = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoGastoEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoGastoEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoGastoEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGastoEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGastoEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoGastoEmpresa=new JScrollPane(this.jListRelacionesSelectReporteTipoGastoEmpresa);
			
			this.jScrollRelacionesSelectReporteTipoGastoEmpresa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGastoEmpresa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGastoEmpresa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoGastoEmpresa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoGastoEmpresa = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoGastoEmpresa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoGastoEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoGastoEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoGastoEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGastoEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGastoEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoGastoEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGastoEmpresa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGastoEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGastoEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGastoEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoGastoEmpresa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoGastoEmpresa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGastoEmpresa.add(this.jLabelGenerarExcelReporteDinamicoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoGastoEmpresa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoGastoEmpresa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoGastoEmpresa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoGastoEmpresa.setToolTipText("Generar EXCEL"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoGastoEmpresa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoGastoEmpresa.add(this.jButtonGenerarExcelReporteDinamicoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGastoEmpresa.add(this.jComboBoxTiposReportesDinamicoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoGastoEmpresa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoGastoEmpresa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGastoEmpresa.add(this.jLabelTiposArchivoReporteDinamicoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGastoEmpresa.add(this.jComboBoxTiposArchivosReportesDinamicoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoGastoEmpresa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoGastoEmpresa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoGastoEmpresa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoGastoEmpresa.setToolTipText("Generar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGastoEmpresa.add(this.jButtonGenerarReporteDinamicoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoGastoEmpresa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoGastoEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoGastoEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoGastoEmpresa.setToolTipText("Cancelar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGastoEmpresa.add(this.jButtonCerrarReporteDinamicoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoGastoEmpresa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoGastoEmpresa= new JScrollPane(jPanelReporteDinamicoTipoGastoEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoGastoEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGastoEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGastoEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Empresas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoGastoEmpresa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoGastoEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoGastoEmpresa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoGastoEmpresa);
		this.jInternalFrameReporteDinamicoTipoGastoEmpresa.getContentPane().add(this.jScrollPanelReporteDinamicoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoGastoEmpresa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoGastoEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoGastoEmpresa.setName("jPanelImportacionTipoGastoEmpresa"); 
		
		this.jPanelImportacionTipoGastoEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGastoEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGastoEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoGastoEmpresa.setLayout(gridaBagLayoutImportacionTipoGastoEmpresa);
		
		
		this.jInternalFrameImportacionTipoGastoEmpresa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoGastoEmpresa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoGastoEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGastoEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoGastoEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGastoEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGastoEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoGastoEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGastoEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGastoEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoGastoEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoGastoEmpresa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoGastoEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGastoEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGastoEmpresa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoGastoEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGastoEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGastoEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoGastoEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoGastoEmpresa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoGastoEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGastoEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGastoEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Empresas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoGastoEmpresa = new JLabelMe();

		this.jLabelArchivoImportacionTipoGastoEmpresa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGastoEmpresa.add(this.jLabelArchivoImportacionTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoGastoEmpresa = new JFileChooser();		
		this.jFileChooserImportacionTipoGastoEmpresa.setToolTipText("ESCOGER ARCHIVO"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoGastoEmpresa = new JButtonMe();
		this.jButtonAbrirImportacionTipoGastoEmpresa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoGastoEmpresa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoGastoEmpresa.setToolTipText("Generar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGastoEmpresa.add(this.jButtonAbrirImportacionTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoGastoEmpresa = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoGastoEmpresa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGastoEmpresa.add(this.jLabelPathArchivoImportacionTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoGastoEmpresa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoGastoEmpresa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGastoEmpresa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGastoEmpresa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGastoEmpresa.add(this.jTextFieldPathArchivoImportacionTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoGastoEmpresa = new JButtonMe();
		this.jButtonGenerarImportacionTipoGastoEmpresa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoGastoEmpresa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoGastoEmpresa.setToolTipText("Generar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGastoEmpresa.add(this.jButtonGenerarImportacionTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoGastoEmpresa = new JButtonMe();
		this.jButtonCerrarImportacionTipoGastoEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoGastoEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoGastoEmpresa.setToolTipText("Cancelar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGastoEmpresa.add(this.jButtonCerrarImportacionTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoGastoEmpresa = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoGastoEmpresa= new JScrollPane(jPanelImportacionTipoGastoEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoGastoEmpresa.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoGastoEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoGastoEmpresa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoGastoEmpresa);
		this.jInternalFrameImportacionTipoGastoEmpresa.getContentPane().add(this.jScrollPanelImportacionTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoGastoEmpresa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoGastoEmpresa = new JButtonMe();
			this.jButtonAbrirOrderByTipoGastoEmpresa.setText("Orden");
			this.jButtonAbrirOrderByTipoGastoEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGastoEmpresa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoGastoEmpresa";
			inputMap = this.jButtonAbrirOrderByTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoGastoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoGastoEmpresa"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoGastoEmpresa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoGastoEmpresa.setName("jPanelOrderByTipoGastoEmpresa"); 
			
			this.jPanelOrderByTipoGastoEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGastoEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGastoEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoGastoEmpresa.setLayout(gridaBagLayoutOrderByTipoGastoEmpresa);
			
			
			this.jTableDatosTipoGastoEmpresaOrderBy = new JTableMe();        
			this.jTableDatosTipoGastoEmpresaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoGastoEmpresaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoGastoEmpresaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoGastoEmpresaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoGastoEmpresaOrderBy.setViewportView(this.jTableDatosTipoGastoEmpresaOrderBy);
			this.jTableDatosTipoGastoEmpresaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoGastoEmpresaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoGastoEmpresa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoGastoEmpresa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoGastoEmpresa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoGastoEmpresa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoGastoEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoGastoEmpresa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoGastoEmpresa.setTitle("Orden");
			this.jInternalFrameOrderByTipoGastoEmpresa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoGastoEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoGastoEmpresa.setResizable(true);
			this.jInternalFrameOrderByTipoGastoEmpresa.setClosable(true);
			this.jInternalFrameOrderByTipoGastoEmpresa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoGastoEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGastoEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGastoEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Empresas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoGastoEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoGastoEmpresa.ipady =150;
				
			this.jPanelOrderByTipoGastoEmpresa.add(jScrollPanelDatosTipoGastoEmpresaOrderBy, this.gridBagConstraintsTipoGastoEmpresa);//this.jTableDatosTipoGastoEmpresaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoGastoEmpresa = new JButtonMe();
			this.jButtonCerrarOrderByTipoGastoEmpresa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoGastoEmpresa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoGastoEmpresa.setToolTipText("Cancelar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoGastoEmpresa.add(this.jButtonCerrarOrderByTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoGastoEmpresa = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoGastoEmpresa= new JScrollPane(jPanelOrderByTipoGastoEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoGastoEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoGastoEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoGastoEmpresa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoGastoEmpresa);
			
			this.jInternalFrameOrderByTipoGastoEmpresa.getContentPane().add(this.jScrollPanelOrderByTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);			
		
		} else {
			this.jButtonAbrirOrderByTipoGastoEmpresa = new JButtonMe();
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
		int iWidthTableCalculado=0;//2530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipogastoempresaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoGastoEmpresa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoGastoEmpresa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoGastoEmpresa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoGastoEmpresa.getRowHeight();//TipoGastoEmpresaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipogastoempresaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoGastoEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGastoEmpresa.isSelected()) {
					iHeightTable=TipoGastoEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGastoEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGastoEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoGastoEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGastoEmpresa.isSelected()) {
					iHeightTable=TipoGastoEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGastoEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGastoEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoGastoEmpresa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGastoEmpresa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGastoEmpresa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoGastoEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGastoEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGastoEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoGastoEmpresa!=null && this.jInternalFrameOrderByTipoGastoEmpresa.getjTableDatosOrderBy()!=null) {
			//if(!this.tipogastoempresaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoGastoEmpresa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoGastoEmpresa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoGastoEmpresa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoGastoEmpresa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoGastoEmpresa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoGastoEmpresa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoGastoEmpresa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoGastoEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGastoEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGastoEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipogastoempresaLogic.getTipoGastoEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogastoempresas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoGastoEmpresa> TraerTipoGastoEmpresaBeans(List<TipoGastoEmpresa> tipogastoempresas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoGastoEmpresa tipogastoempresa:tipogastoempresas) {
					
				if(!(TipoGastoEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoGastoEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipogastoempresa.setsDetalleGeneralEntityReporte(TipoGastoEmpresaConstantesFunciones.getTipoGastoEmpresaDescripcion(tipogastoempresa));
										
						
					
						
					
				} else  {
							
					//tipogastoempresa.setsDetalleGeneralEntityReporte(tipogastoempresa.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipogastoempresabeans.add(tipogastoempresabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipogastoempresas;
    }
	//PARA REPORTES FIN
}
