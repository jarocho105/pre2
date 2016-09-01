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
import com.bydan.erp.contabilidad.util.DetalleCuentaFlujoCajaConstantesFunciones;

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
public class DetalleCuentaFlujoCajaJInternalFrame extends DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleCuentaFlujoCaja;
	
	protected JMenuBar jmenuBarDetalleCuentaFlujoCaja;
	
	protected JMenu jmenuDetalleCuentaFlujoCaja;
	protected JMenu jmenuDatosDetalleCuentaFlujoCaja;
	protected JMenu jmenuArchivoDetalleCuentaFlujoCaja;
	protected JMenu jmenuAccionesDetalleCuentaFlujoCaja;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleCuentaFlujoCaja;	
	protected GridBagConstraints gridBagConstraintsDetalleCuentaFlujoCaja;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleCuentaFlujoCajaDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleCuentaFlujoCaja;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleCuentaFlujoCaja;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoOperacionBeanSwingJInternalFrame tipooperacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipooperacion="";

	protected CuentaFlujoCajaBeanSwingJInternalFrame cuentaflujocajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentaflujocaja="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public DetalleCuentaFlujoCajaSessionBean detallecuentaflujocajaSessionBean;
		
	
	
	public TipoOperacionSessionBean tipooperacionSessionBean;
	public CuentaFlujoCajaSessionBean cuentaflujocajaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleCuentaFlujoCaja> detallecuentaflujocajas;		
	public List<DetalleCuentaFlujoCaja> detallecuentaflujocajasEliminados;	
	public List<DetalleCuentaFlujoCaja> detallecuentaflujocajasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleCuentaFlujoCaja;		
	protected JButton jButtonAbrirOrderByDetalleCuentaFlujoCaja;
	
	
	//protected JPanel jPanelOrderByDetalleCuentaFlujoCaja;
	//public JScrollPane jScrollPanelOrderByDetalleCuentaFlujoCaja;	
	//protected JButton jButtonCerrarOrderByDetalleCuentaFlujoCaja;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleCuentaFlujoCajaLogic detallecuentaflujocajaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleCuentaFlujoCaja;
	public JScrollPane jScrollPanelDatosEdicionDetalleCuentaFlujoCaja;
	public JScrollPane jScrollPanelDatosGeneralDetalleCuentaFlujoCaja;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleCuentaFlujoCajaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleCuentaFlujoCaja;
	//public JScrollPane jScrollPanelImportacionDetalleCuentaFlujoCaja;
	
	
	
	protected JPanel jPanelAccionesDetalleCuentaFlujoCaja;
	
    protected JPanel jPanelPaginacionDetalleCuentaFlujoCaja;
    protected JPanel jPanelParametrosReportesDetalleCuentaFlujoCaja;
	protected JPanel jPanelParametrosReportesAccionesDetalleCuentaFlujoCaja;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleCuentaFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar2DetalleCuentaFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar3DetalleCuentaFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar4DetalleCuentaFlujoCaja;
	//protected JPanel jPanelParametrosAuxiliar5DetalleCuentaFlujoCaja;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleCuentaFlujoCaja;
	//protected JPanel jPanelImportacionDetalleCuentaFlujoCaja;
	
	
	public JTable jTableDatosDetalleCuentaFlujoCaja;
	
	
	
	//public JTable jTableDatosDetalleCuentaFlujoCajaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleCuentaFlujoCaja;
	protected JButton jButtonDuplicarDetalleCuentaFlujoCaja;
	protected JButton jButtonCopiarDetalleCuentaFlujoCaja;
	protected JButton jButtonVerFormDetalleCuentaFlujoCaja;
	protected JButton jButtonNuevoRelacionesDetalleCuentaFlujoCaja;
	protected JButton jButtonModificarDetalleCuentaFlujoCaja;
	
    protected JButton jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja;
	protected JButton jButtonCerrarDetalleCuentaFlujoCaja;
	
	
	protected JButton jButtonRecargarInformacionDetalleCuentaFlujoCaja;
	protected JButton jButtonProcesarInformacionDetalleCuentaFlujoCaja;
	
	
	protected JButton jButtonAnterioresDetalleCuentaFlujoCaja;
	protected JButton jButtonSiguientesDetalleCuentaFlujoCaja;
	protected JButton jButtonNuevoGuardarCambiosDetalleCuentaFlujoCaja;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleCuentaFlujoCaja;
	//protected JButton jButtonCerrarReporteDinamicoDetalleCuentaFlujoCaja;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleCuentaFlujoCaja;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleCuentaFlujoCaja;
	//protected JButton jButtonGenerarImportacionDetalleCuentaFlujoCaja;
	//protected JButton jButtonCerrarImportacionDetalleCuentaFlujoCaja;
	//protected JFileChooser jFileChooserImportacionDetalleCuentaFlujoCaja;
	//protected File fileImportacionDetalleCuentaFlujoCaja;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonDuplicarToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonNuevoRelacionesToolBarDetalleCuentaFlujoCaja;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonCopiarToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonVerFormToolBarDetalleCuentaFlujoCaja;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonCerrarToolBarDetalleCuentaFlujoCaja;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonProcesarInformacionToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonAnterioresToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonSiguientesToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonAbrirOrderByToolBarDetalleCuentaFlujoCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemDuplicarDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleCuentaFlujoCaja;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemCopiarDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemVerFormDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemCerrarDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemDetalleCerrarDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleCuentaFlujoCaja;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemProcesarInformacionDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemAnterioresDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemSiguientesDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemAbrirOrderByDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemMostrarOcultarDetalleCuentaFlujoCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleCuentaFlujoCaja;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja;
	protected JCheckBox jCheckBoxSeleccionadosDetalleCuentaFlujoCaja;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleCuentaFlujoCaja;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleCuentaFlujoCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleCuentaFlujoCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja;
	protected JTextField jTextFieldValorCampoGeneralDetalleCuentaFlujoCaja;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleCuentaFlujoCaja;
	//public JList<Reporte> jListColumnasSelectReporteDetalleCuentaFlujoCaja;
	//public JScrollPane jScrollColumnasSelectReporteDetalleCuentaFlujoCaja;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleCuentaFlujoCaja;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleCuentaFlujoCaja;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleCuentaFlujoCaja;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleCuentaFlujoCaja;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleCuentaFlujoCaja;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleCuentaFlujoCaja;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleCuentaFlujoCaja;
	
		
	//public JLabel jLabelArchivoImportacionDetalleCuentaFlujoCaja;	
	//public JLabel jLabelPathArchivoImportacionDetalleCuentaFlujoCaja;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleCuentaFlujoCaja;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleCuentaFlujoCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleCuentaFlujoCaja;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleCuentaFlujoCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleCuentaFlujoCaja;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleCuentaFlujoCaja;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleCuentaFlujoCaja;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleCuentaFlujoCaja;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleCuentaFlujoCaja;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleCuentaFlujoCaja;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleCuentaFlujoCaja;
	public JPanel jPanelFK_IdCuentaContableDetalleCuentaFlujoCaja;
	public JButton jButtonFK_IdCuentaContableDetalleCuentaFlujoCaja;
	public JPanel jPanelFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja;
	public JButton jButtonFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja;
	public JPanel jPanelFK_IdTipoOperacionDetalleCuentaFlujoCaja;
	public JButton jButtonFK_IdTipoOperacionDetalleCuentaFlujoCaja;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCajaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCajaArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja;
	public JLabel jLabelid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja;
	public JButton jButtonid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja= new JButtonMe();
	public JButton jButtonid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja;
	public JLabel jLabelid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja;
	public JButton jButtonid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja= new JButtonMe();
	public JButton jButtonid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCajaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleCuentaFlujoCajaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleCuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCuentaFlujoCajaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCuentaFlujoCajaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCuentaFlujoCajaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleCuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleCuentaFlujoCaja)	{
		this.jButtonRecargarInformacionDetalleCuentaFlujoCaja = jButtonRecargarInformacionDetalleCuentaFlujoCaja;
	}
	
	public JButton getjButtonProcesarInformacionDetalleCuentaFlujoCaja() {
		return this.jButtonProcesarInformacionDetalleCuentaFlujoCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleCuentaFlujoCaja)	{
		this.jButtonProcesarInformacionDetalleCuentaFlujoCaja = jButtonProcesarInformacionDetalleCuentaFlujoCaja;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleCuentaFlujoCaja() {
		return this.jButtonRecargarInformacionDetalleCuentaFlujoCaja;
	}
	
	
	public List<DetalleCuentaFlujoCaja> getdetallecuentaflujocajas() {
		return this.detallecuentaflujocajas;
	}

	public void setdetallecuentaflujocajas(List<DetalleCuentaFlujoCaja> detallecuentaflujocajas) {
		this.detallecuentaflujocajas = detallecuentaflujocajas;
	}
	
	public List<DetalleCuentaFlujoCaja> getdetallecuentaflujocajasAux() {
		return this.detallecuentaflujocajasAux;
	}

	public void setdetallecuentaflujocajasAux(List<DetalleCuentaFlujoCaja> detallecuentaflujocajasAux) {
		this.detallecuentaflujocajasAux = detallecuentaflujocajasAux;
	}
	
	public List<DetalleCuentaFlujoCaja> getdetallecuentaflujocajasEliminados() {
		return this.detallecuentaflujocajasEliminados;
	}

	public void setDetalleCuentaFlujoCajasEliminados(List<DetalleCuentaFlujoCaja> detallecuentaflujocajasEliminados) {
		this.detallecuentaflujocajasEliminados = detallecuentaflujocajasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleCuentaFlujoCaja() {
		return jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleCuentaFlujoCaja(
			JComboBox jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja) {
		this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja = jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleCuentaFlujoCaja() {
		return jTextFieldValorCampoGeneralDetalleCuentaFlujoCaja;
	}

	public void setjTextFieldValorCampoGeneralDetalleCuentaFlujoCaja(
			JTextField jTextFieldValorCampoGeneralDetalleCuentaFlujoCaja) {
		this.jTextFieldValorCampoGeneralDetalleCuentaFlujoCaja = jTextFieldValorCampoGeneralDetalleCuentaFlujoCaja;
	}

	public void setBorderResaltarValorCampoGeneralDetalleCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleCuentaFlujoCaja .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja() {
		return this.jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja;
	}

	public void setjCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja(
			JCheckBox jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja) {
		this.jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja = jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja;
	}

	public void setBorderResaltarSeleccionarTodosDetalleCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleCuentaFlujoCaja() {
		return this.jCheckBoxSeleccionadosDetalleCuentaFlujoCaja;
	}

	public void setjCheckBoxSeleccionadosDetalleCuentaFlujoCaja(
			JCheckBox jCheckBoxSeleccionadosDetalleCuentaFlujoCaja) {
		this.jCheckBoxSeleccionadosDetalleCuentaFlujoCaja = jCheckBoxSeleccionadosDetalleCuentaFlujoCaja;
	}
	
	public void setBorderResaltarSeleccionadosDetalleCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja() {
		return this.jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja(
			JComboBox jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja) {
		this.jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja = jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleCuentaFlujoCaja() {
		return this.jComboBoxTiposReportesDetalleCuentaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleCuentaFlujoCaja(
			JComboBox jComboBoxTiposReportesDetalleCuentaFlujoCaja) {
		this.jComboBoxTiposReportesDetalleCuentaFlujoCaja = jComboBoxTiposReportesDetalleCuentaFlujoCaja;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleCuentaFlujoCaja() {
	//	return jComboBoxTiposReportesDinamicoDetalleCuentaFlujoCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleCuentaFlujoCaja(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleCuentaFlujoCaja) {
	//	this.jComboBoxTiposReportesDinamicoDetalleCuentaFlujoCaja = jComboBoxTiposReportesDinamicoDetalleCuentaFlujoCaja;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleCuentaFlujoCaja() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleCuentaFlujoCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleCuentaFlujoCaja(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleCuentaFlujoCaja) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleCuentaFlujoCaja = jComboBoxTiposArchivosReportesDinamicoDetalleCuentaFlujoCaja;
	//}
	
	public void setBorderResaltarTiposReportesDetalleCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja() {
		return this.jComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja(
			JComboBox jComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja) {
		this.jComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja = jComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleCuentaFlujoCaja() {
		return this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleCuentaFlujoCaja(
			JComboBox jComboBoxTiposPaginacionDetalleCuentaFlujoCaja) {
		this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja = jComboBoxTiposPaginacionDetalleCuentaFlujoCaja;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleCuentaFlujoCaja() {
		return this.jComboBoxTiposRelacionesDetalleCuentaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleCuentaFlujoCaja() {
		return this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleCuentaFlujoCaja(
			JComboBox jComboBoxTiposRelacionesDetalleCuentaFlujoCaja) {
		this.jComboBoxTiposRelacionesDetalleCuentaFlujoCaja = jComboBoxTiposRelacionesDetalleCuentaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleCuentaFlujoCaja(
			JComboBox jComboBoxTiposAccionesDetalleCuentaFlujoCaja) {
		this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja = jComboBoxTiposAccionesDetalleCuentaFlujoCaja;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleCuentaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCuentaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleCuentaFlujoCaja() {
	//	return jCheckBoxConGraficoDinamicoDetalleCuentaFlujoCaja;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleCuentaFlujoCaja(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleCuentaFlujoCaja) {
	//	this.jCheckBoxConGraficoDinamicoDetalleCuentaFlujoCaja = jCheckBoxConGraficoDinamicoDetalleCuentaFlujoCaja;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleCuentaFlujoCaja() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleCuentaFlujoCaja.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleCuentaFlujoCaja .setBorder(borderResaltar);		
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
		this.detallecuentaflujocajaSessionBean=new DetalleCuentaFlujoCajaSessionBean();
		
		this.detallecuentaflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallecuentaflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleCuentaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleCuentaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleCuentaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleCuentaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleCuentaFlujoCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Cuenta Flujo Caja MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleCuentaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleCuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCuentaFlujoCaja= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
							"nuevo","nuevo","Nuevo"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
							"duplicar","duplicar","Duplicar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
							"copiar","copiar","Copiar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
							"ver_form","ver_form","Ver"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
							"recargar","recargar","Recargar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
							"cerrar","cerrar","Salir"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleCuentaFlujoCaja=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleCuentaFlujoCaja;
			
				this.jButtonProcesarInformacionToolBarDetalleCuentaFlujoCaja=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleCuentaFlujoCaja;
				
		//protected JButton jButtonModificarToolBarDetalleCuentaFlujoCaja;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleCuentaFlujoCaja=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleCuentaFlujoCaja=new JMenuMe("General");
		this.jmenuArchivoDetalleCuentaFlujoCaja=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleCuentaFlujoCaja=new JMenuMe("Acciones");
		this.jmenuDatosDetalleCuentaFlujoCaja=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleCuentaFlujoCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleCuentaFlujoCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleCuentaFlujoCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleCuentaFlujoCaja= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleCuentaFlujoCaja.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleCuentaFlujoCaja,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleCuentaFlujoCaja= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleCuentaFlujoCaja.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleCuentaFlujoCaja,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleCuentaFlujoCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleCuentaFlujoCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleCuentaFlujoCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleCuentaFlujoCaja= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleCuentaFlujoCaja.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleCuentaFlujoCaja,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleCuentaFlujoCaja= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleCuentaFlujoCaja.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleCuentaFlujoCaja,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleCuentaFlujoCaja= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleCuentaFlujoCaja.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleCuentaFlujoCaja,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleCuentaFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleCuentaFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleCuentaFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleCuentaFlujoCaja= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleCuentaFlujoCaja.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleCuentaFlujoCaja,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleCuentaFlujoCaja= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleCuentaFlujoCaja.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleCuentaFlujoCaja,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleCuentaFlujoCaja= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleCuentaFlujoCaja.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleCuentaFlujoCaja,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleCuentaFlujoCaja= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleCuentaFlujoCaja.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleCuentaFlujoCaja,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleCuentaFlujoCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleCuentaFlujoCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleCuentaFlujoCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleCuentaFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleCuentaFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleCuentaFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleCuentaFlujoCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleCuentaFlujoCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleCuentaFlujoCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleCuentaFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleCuentaFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleCuentaFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleCuentaFlujoCaja= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleCuentaFlujoCaja.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleCuentaFlujoCaja,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleCuentaFlujoCaja.add(this.jMenuItemCerrarDetalleCuentaFlujoCaja);
			
			this.jmenuAccionesDetalleCuentaFlujoCaja.add(this.jMenuItemNuevoDetalleCuentaFlujoCaja);
			this.jmenuAccionesDetalleCuentaFlujoCaja.add(this.jMenuItemNuevoGuardarCambiosDetalleCuentaFlujoCaja);
			this.jmenuAccionesDetalleCuentaFlujoCaja.add(this.jMenuItemNuevoRelacionesDetalleCuentaFlujoCaja);
			this.jmenuAccionesDetalleCuentaFlujoCaja.add(this.jMenuItemGuardarCambiosTablaDetalleCuentaFlujoCaja);		
			this.jmenuAccionesDetalleCuentaFlujoCaja.add(this.jMenuItemDuplicarDetalleCuentaFlujoCaja);		
			this.jmenuAccionesDetalleCuentaFlujoCaja.add(this.jMenuItemCopiarDetalleCuentaFlujoCaja);		
			this.jmenuAccionesDetalleCuentaFlujoCaja.add(this.jMenuItemVerFormDetalleCuentaFlujoCaja);		
			
			this.jmenuDatosDetalleCuentaFlujoCaja.add(this.jMenuItemRecargarInformacionDetalleCuentaFlujoCaja);				
			this.jmenuDatosDetalleCuentaFlujoCaja.add(this.jMenuItemAnterioresDetalleCuentaFlujoCaja);				
			this.jmenuDatosDetalleCuentaFlujoCaja.add(this.jMenuItemSiguientesDetalleCuentaFlujoCaja);				
			this.jmenuDatosDetalleCuentaFlujoCaja.add(this.jMenuItemAbrirOrderByDetalleCuentaFlujoCaja);				
			this.jmenuDatosDetalleCuentaFlujoCaja.add(this.jMenuItemMostrarOcultarDetalleCuentaFlujoCaja);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleCuentaFlujoCaja.add(this.jMenuItemGuardarCambiosDetalleCuentaFlujoCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCuentaFlujoCaja.add(this.jmenuArchivoDetalleCuentaFlujoCaja);		
			this.jmenuBarDetalleCuentaFlujoCaja.add(this.jmenuAccionesDetalleCuentaFlujoCaja);		
			this.jmenuBarDetalleCuentaFlujoCaja.add(this.jmenuDatosDetalleCuentaFlujoCaja);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleCuentaFlujoCaja);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleCuentaFlujoCaja() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableDetalleCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDetalleCuentaFlujoCaja.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableDetalleCuentaFlujoCaja= new JButtonMe();
		this.jButtonFK_IdCuentaContableDetalleCuentaFlujoCaja.setText("Buscar");
		this.jButtonFK_IdCuentaContableDetalleCuentaFlujoCaja.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDetalleCuentaFlujoCaja,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setToolTipText("Buscar Por Cuenta Flujo Caja ");
		this.jButtonFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja= new JButtonMe();
		this.jButtonFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setText("Buscar");
		this.jButtonFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setToolTipText("Buscar Por Cuenta Flujo Caja ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja,"buscar_button","Buscar Por Cuenta Flujo Caja ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja = new JLabelMe();
		jLabelid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setText("Cuenta Flujo Caja :");
		jLabelid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setToolTipText("Cuenta Flujo Caja");
		jLabelid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja= new JComboBoxMe();
		jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoOperacionDetalleCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoOperacionDetalleCuentaFlujoCaja.setToolTipText("Buscar Por Tipo Operacion ");
		this.jButtonFK_IdTipoOperacionDetalleCuentaFlujoCaja= new JButtonMe();
		this.jButtonFK_IdTipoOperacionDetalleCuentaFlujoCaja.setText("Buscar");
		this.jButtonFK_IdTipoOperacionDetalleCuentaFlujoCaja.setToolTipText("Buscar Por Tipo Operacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoOperacionDetalleCuentaFlujoCaja,"buscar_button","Buscar Por Tipo Operacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoOperacionDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja = new JLabelMe();
		jLabelid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.setText("Tipo Operacion :");
		jLabelid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.setToolTipText("Tipo Operacion");
		jLabelid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja= new JComboBoxMe();
		jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleCuentaFlujoCaja = new DetalleCuentaFlujoCajaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Cuenta Flujo Caja DATOS");
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja = new DetalleCuentaFlujoCajaDetalleFormJInternalFrame(jDesktopPane,this.detallecuentaflujocajaSessionBean.getConGuardarRelaciones(),this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja = null;//new DetalleCuentaFlujoCajaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleCuentaFlujoCaja= new GridBagLayout();
		
		
		this.jTableDatosDetalleCuentaFlujoCaja = new JTableMe();      
		
		String sToolTipDetalleCuentaFlujoCaja="";
		sToolTipDetalleCuentaFlujoCaja=DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleCuentaFlujoCaja+="(Contabilidad.DetalleCuentaFlujoCaja)";
		}
		
		if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleCuentaFlujoCaja+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleCuentaFlujoCaja.setToolTipText(sToolTipDetalleCuentaFlujoCaja);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleCuentaFlujoCaja);
		this.jTableDatosDetalleCuentaFlujoCaja.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleCuentaFlujoCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleCuentaFlujoCaja.setRowSelectionAllowed(true);
		this.jTableDatosDetalleCuentaFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonDuplicarDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonCopiarDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonVerFormDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleCuentaFlujoCaja = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonCerrarDetalleCuentaFlujoCaja = new JButtonMe();
		
		this.jScrollPanelDatosDetalleCuentaFlujoCaja = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleCuentaFlujoCaja = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Cuenta Flujo Caja";
		
		if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cuenta Flujo Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleCuentaFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleCuentaFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesDetalleCuentaFlujoCaja.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja=new ReporteDinamicoJInternalFrame(DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleCuentaFlujoCaja();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleCuentaFlujoCaja=new ImportacionJInternalFrame(DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleCuentaFlujoCaja();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleCuentaFlujoCaja = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleCuentaFlujoCaja.setText("Orden");
		this.jButtonAbrirOrderByDetalleCuentaFlujoCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleCuentaFlujoCaja,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleCuentaFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleCuentaFlujoCaja,false,this);
			
			//this.cargarOrderByDetalleCuentaFlujoCaja(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleCuentaFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleCuentaFlujoCaja,true,this);
			
			//this.cargarOrderByDetalleCuentaFlujoCaja(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleCuentaFlujoCaja.setText("Nuevo");
		this.jButtonDuplicarDetalleCuentaFlujoCaja.setText("Duplicar");
		this.jButtonCopiarDetalleCuentaFlujoCaja.setText("Copiar");
		this.jButtonVerFormDetalleCuentaFlujoCaja.setText("Ver");
		this.jButtonNuevoRelacionesDetalleCuentaFlujoCaja.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja.setText("Guardar");
		this.jButtonCerrarDetalleCuentaFlujoCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleCuentaFlujoCaja,"nuevo_button","Nuevo",this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleCuentaFlujoCaja,"duplicar_button","Duplicar",this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleCuentaFlujoCaja,"copiar_button","Copiar",this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleCuentaFlujoCaja,"ver_form","Ver",this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleCuentaFlujoCaja,"nuevorelaciones_button","Nuevo Rel",this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja,"guardarcambiostabla_button","Guardar",this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleCuentaFlujoCaja,"cerrar_button","Salir",this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleCuentaFlujoCaja.setToolTipText("Nuevo"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleCuentaFlujoCaja.setToolTipText("Duplicar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleCuentaFlujoCaja.setToolTipText("Copiar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleCuentaFlujoCaja.setToolTipText("Ver"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleCuentaFlujoCaja.setToolTipText("Nuevo Rel"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja.setToolTipText("Guardar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleCuentaFlujoCaja.setToolTipText("Salir"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleCuentaFlujoCaja";
		inputMap = this.jButtonNuevoDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleCuentaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleCuentaFlujoCaja"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleCuentaFlujoCaja";
		inputMap = this.jButtonDuplicarDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleCuentaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleCuentaFlujoCaja"));
		
		//COPIAR
		sMapKey = "CopiarDetalleCuentaFlujoCaja";
		inputMap = this.jButtonCopiarDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleCuentaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleCuentaFlujoCaja"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleCuentaFlujoCaja";
		inputMap = this.jButtonVerFormDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleCuentaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleCuentaFlujoCaja"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleCuentaFlujoCaja";
		inputMap = this.jButtonNuevoRelacionesDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleCuentaFlujoCaja"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleCuentaFlujoCaja";
		inputMap = this.jButtonModificarDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleCuentaFlujoCaja"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleCuentaFlujoCaja";
		inputMap = this.jButtonCerrarDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleCuentaFlujoCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleCuentaFlujoCaja";
		inputMap = this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleCuentaFlujoCaja"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleCuentaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleCuentaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleCuentaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleCuentaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleCuentaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleCuentaFlujoCaja.setName("jPanelParametrosReportesDetalleCuentaFlujoCaja"); 
		
		this.jPanelParametrosReportesAccionesDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleCuentaFlujoCaja.setName("jPanelParametrosReportesAccionesDetalleCuentaFlujoCaja"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonRecargarInformacionDetalleCuentaFlujoCaja.setText("Recargar");
		this.jButtonRecargarInformacionDetalleCuentaFlujoCaja.setToolTipText("Recargar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleCuentaFlujoCaja,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonProcesarInformacionDetalleCuentaFlujoCaja.setText("Procesar");
		this.jButtonProcesarInformacionDetalleCuentaFlujoCaja.setToolTipText("Procesar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleCuentaFlujoCaja.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleCuentaFlujoCaja.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleCuentaFlujoCaja.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleCuentaFlujoCaja.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setText("Accion");
		this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleCuentaFlujoCaja=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleCuentaFlujoCaja = new JLabelMe();
		
		this.jLabelAccionesDetalleCuentaFlujoCaja.setText("Acciones");		
		this.jLabelAccionesDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleCuentaFlujoCaja = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleCuentaFlujoCaja.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleCuentaFlujoCaja.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleCuentaFlujoCaja = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleCuentaFlujoCaja.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleCuentaFlujoCaja.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleCuentaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleCuentaFlujoCaja.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleCuentaFlujoCaja.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleCuentaFlujoCaja = new JButtonMe();
		//this.jButtonAnterioresDetalleCuentaFlujoCaja.setText("<<");
        this.jButtonAnterioresDetalleCuentaFlujoCaja.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleCuentaFlujoCaja,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleCuentaFlujoCaja = new JButtonMe();
		//this.jButtonSiguientesDetalleCuentaFlujoCaja.setText(">>");
        this.jButtonSiguientesDetalleCuentaFlujoCaja.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleCuentaFlujoCaja,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleCuentaFlujoCaja.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleCuentaFlujoCaja.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleCuentaFlujoCaja,"nuevoguardarcambios_button","Nue",this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleCuentaFlujoCaja";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleCuentaFlujoCaja"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleCuentaFlujoCaja";
		inputMap = this.jButtonRecargarInformacionDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleCuentaFlujoCaja"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleCuentaFlujoCaja";
		inputMap = this.jButtonSiguientesDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleCuentaFlujoCaja"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleCuentaFlujoCaja";
		inputMap = this.jButtonAnterioresDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleCuentaFlujoCaja"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleCuentaFlujoCaja();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(this.getWidth(),DetalleCuentaFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleCuentaFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(this.getWidth(),DetalleCuentaFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleCuentaFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(this.getWidth(),DetalleCuentaFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleCuentaFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleCuentaFlujoCaja = new GridBagLayout();

			this.jPanelPaginacionDetalleCuentaFlujoCaja.setLayout(gridaBagLayoutPaginacionDetalleCuentaFlujoCaja);						
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleCuentaFlujoCaja.add(this.jButtonAnterioresDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
					
						
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
			
			this.jPanelPaginacionDetalleCuentaFlujoCaja.add(this.jButtonNuevoGuardarCambiosDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
						
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
			this.jPanelPaginacionDetalleCuentaFlujoCaja.add(this.jButtonSiguientesDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 1;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCuentaFlujoCaja.add(this.jButtonNuevoDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
						
			
			
			if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 1;
				this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleCuentaFlujoCaja.add(this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
			}
			
			
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 1;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCuentaFlujoCaja.add(this.jButtonDuplicarDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 1;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCuentaFlujoCaja.add(this.jButtonCopiarDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 1;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCuentaFlujoCaja.add(this.jButtonVerFormDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 1;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleCuentaFlujoCaja.add(this.jButtonCerrarDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		
		
		
		this.jButtonRecargarInformacionDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleCuentaFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleCuentaFlujoCaja = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleCuentaFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleCuentaFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleCuentaFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleCuentaFlujoCaja = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleCuentaFlujoCaja.setLayout(gridaBagParametrosReportesDetalleCuentaFlujoCaja);
			this.jPanelParametrosReportesAccionesDetalleCuentaFlujoCaja.setLayout(gridaBagParametrosReportesAccionesDetalleCuentaFlujoCaja);
			
			
			this.jPanelParametrosAuxiliar1DetalleCuentaFlujoCaja.setLayout(gridaBagParametrosAuxiliar1DetalleCuentaFlujoCaja);
			this.jPanelParametrosAuxiliar2DetalleCuentaFlujoCaja.setLayout(gridaBagParametrosAuxiliar2DetalleCuentaFlujoCaja);
			this.jPanelParametrosAuxiliar3DetalleCuentaFlujoCaja.setLayout(gridaBagParametrosAuxiliar3DetalleCuentaFlujoCaja);
			this.jPanelParametrosAuxiliar4DetalleCuentaFlujoCaja.setLayout(gridaBagParametrosAuxiliar4DetalleCuentaFlujoCaja);
			//this.jPanelParametrosAuxiliar5DetalleCuentaFlujoCaja.setLayout(gridaBagParametrosAuxiliar2DetalleCuentaFlujoCaja);			
			
			
			
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCuentaFlujoCaja.add(this.jButtonRecargarInformacionDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleCuentaFlujoCaja.add(this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleCuentaFlujoCaja.add(this.jCheckBoxConAltoMaximoTablaDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleCuentaFlujoCaja.add(this.jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCuentaFlujoCaja.add(this.jPanelParametrosAuxiliar1DetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleCuentaFlujoCaja.add(this.jComboBoxTiposReportesDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCuentaFlujoCaja.add(this.jPanelParametrosAuxiliar4DetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCuentaFlujoCaja.add(this.jComboBoxTiposReportesDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCuentaFlujoCaja.add(this.jCheckBoxGenerarReporteDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCuentaFlujoCaja.add(this.jPanelParametrosAuxiliar2DetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCuentaFlujoCaja.add(this.jLabelAccionesDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleCuentaFlujoCaja.add(this.jButtonAbrirOrderByDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCuentaFlujoCaja.add(this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);			
			
			
			/*
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCuentaFlujoCaja.add(this.jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleCuentaFlujoCaja.add(this.jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);															
				
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleCuentaFlujoCaja.add(this.jCheckBoxSeleccionadosDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCuentaFlujoCaja.add(this.jPanelParametrosAuxiliar3DetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCuentaFlujoCaja.add(this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
	
				
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCuentaFlujoCaja.add(this.jTextFieldValorCampoGeneralDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleCuentaFlujoCaja = new GridBagLayout();

			this.jScrollPanelDatosDetalleCuentaFlujoCaja.setLayout(gridaBagLayoutDatosDetalleCuentaFlujoCaja);
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
			
			this.jScrollPanelDatosDetalleCuentaFlujoCaja.add(this.jTableDatosDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleCuentaFlujoCaja.setViewportView(this.jTableDatosDetalleCuentaFlujoCaja);
		this.jTableDatosDetalleCuentaFlujoCaja.setFillsViewportHeight(true);
		this.jTableDatosDetalleCuentaFlujoCaja.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleCuentaFlujoCaja= new GridBagLayout();
		this.jPanelAccionesDetalleCuentaFlujoCaja.setLayout(gridaBagLayoutAccionesDetalleCuentaFlujoCaja);
		
		
		/*	
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
			
		this.jPanelAccionesDetalleCuentaFlujoCaja.add(this.jButtonNuevoDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableDetalleCuentaFlujoCaja= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDetalleCuentaFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDetalleCuentaFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDetalleCuentaFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDetalleCuentaFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDetalleCuentaFlujoCaja.setLayout(gridaBagLayoutFK_IdCuentaContableDetalleCuentaFlujoCaja);

		gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
		jPanelFK_IdCuentaContableDetalleCuentaFlujoCaja.add(jLabelid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja, gridBagConstraintsDetalleCuentaFlujoCaja);

		gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 1;
		jPanelFK_IdCuentaContableDetalleCuentaFlujoCaja.add(jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja, gridBagConstraintsDetalleCuentaFlujoCaja);

		gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 1;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridx =1;
		jPanelFK_IdCuentaContableDetalleCuentaFlujoCaja.add(jButtonFK_IdCuentaContableDetalleCuentaFlujoCaja, gridBagConstraintsDetalleCuentaFlujoCaja);

		jTabbedPaneBusquedasDetalleCuentaFlujoCaja.addTab("1.-Por Cuenta Contable ", jPanelFK_IdCuentaContableDetalleCuentaFlujoCaja);
		jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setLayout(gridaBagLayoutFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja);

		gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
		jPanelFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.add(jLabelid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja, gridBagConstraintsDetalleCuentaFlujoCaja);

		gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 1;
		jPanelFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.add(jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja, gridBagConstraintsDetalleCuentaFlujoCaja);

		gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 1;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridx =1;
		jPanelFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.add(jButtonFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja, gridBagConstraintsDetalleCuentaFlujoCaja);

		jTabbedPaneBusquedasDetalleCuentaFlujoCaja.addTab("2.-Por Cuenta Flujo Caja ", jPanelFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja);
		jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoOperacionDetalleCuentaFlujoCaja= new GridBagLayout();
		gridaBagLayoutFK_IdTipoOperacionDetalleCuentaFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoOperacionDetalleCuentaFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoOperacionDetalleCuentaFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoOperacionDetalleCuentaFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoOperacionDetalleCuentaFlujoCaja.setLayout(gridaBagLayoutFK_IdTipoOperacionDetalleCuentaFlujoCaja);

		gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
		jPanelFK_IdTipoOperacionDetalleCuentaFlujoCaja.add(jLabelid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja, gridBagConstraintsDetalleCuentaFlujoCaja);

		gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 1;
		jPanelFK_IdTipoOperacionDetalleCuentaFlujoCaja.add(jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja, gridBagConstraintsDetalleCuentaFlujoCaja);

		gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 1;
		gridBagConstraintsDetalleCuentaFlujoCaja.gridx =1;
		jPanelFK_IdTipoOperacionDetalleCuentaFlujoCaja.add(jButtonFK_IdTipoOperacionDetalleCuentaFlujoCaja, gridBagConstraintsDetalleCuentaFlujoCaja);

		jTabbedPaneBusquedasDetalleCuentaFlujoCaja.addTab("3.-Por Tipo Operacion ", jPanelFK_IdTipoOperacionDetalleCuentaFlujoCaja);
		jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleCuentaFlujoCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleCuentaFlujoCaja);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();						
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;		
			//this.gridBagConstraintsDetalleCuentaFlujoCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;		
		//this.gridBagConstraintsDetalleCuentaFlujoCaja.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);								
		
		
		/*
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		*/		
		
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx =0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleCuentaFlujoCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
				
		
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleCuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleCuentaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleCuentaFlujoCaja = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleCuentaFlujoCaja.setLayout(gridaBagLayoutBusquedasParametrosDetalleCuentaFlujoCaja);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleCuentaFlujoCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
			
			
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		
			
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleCuentaFlujoCaja;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleCuentaFlujoCaja() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleCuentaFlujoCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleCuentaFlujoCaja.setName("jPanelReporteDinamicoDetalleCuentaFlujoCaja"); 
		
		this.jPanelReporteDinamicoDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleCuentaFlujoCaja.setLayout(gridaBagLayoutReporteDinamicoDetalleCuentaFlujoCaja);
		
		
		this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleCuentaFlujoCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleCuentaFlujoCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cuenta Flujo Cajas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleCuentaFlujoCaja = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleCuentaFlujoCaja.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleCuentaFlujoCaja.add(this.jLabelColumnasSelectReporteDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleCuentaFlujoCaja = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleCuentaFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleCuentaFlujoCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleCuentaFlujoCaja=new JScrollPane(this.jListColumnasSelectReporteDetalleCuentaFlujoCaja);
			
			this.jScrollColumnasSelectReporteDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleCuentaFlujoCaja.add(this.jListColumnasSelectReporteDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		this.jPanelReporteDinamicoDetalleCuentaFlujoCaja.add(this.jScrollColumnasSelectReporteDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleCuentaFlujoCaja = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleCuentaFlujoCaja.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleCuentaFlujoCaja = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleCuentaFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleCuentaFlujoCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleCuentaFlujoCaja=new JScrollPane(this.jListRelacionesSelectReporteDetalleCuentaFlujoCaja);
			
			this.jScrollRelacionesSelectReporteDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleCuentaFlujoCaja = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleCuentaFlujoCaja = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleCuentaFlujoCaja = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleCuentaFlujoCaja = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleCuentaFlujoCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCuentaFlujoCaja = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCuentaFlujoCaja.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleCuentaFlujoCaja = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleCuentaFlujoCaja.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCuentaFlujoCaja.add(this.jLabelGenerarExcelReporteDinamicoDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleCuentaFlujoCaja.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleCuentaFlujoCaja,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleCuentaFlujoCaja.setToolTipText("Generar EXCEL"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleCuentaFlujoCaja.add(this.jButtonGenerarExcelReporteDinamicoDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCuentaFlujoCaja.add(this.jComboBoxTiposReportesDinamicoDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleCuentaFlujoCaja = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleCuentaFlujoCaja.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCuentaFlujoCaja.add(this.jLabelTiposArchivoReporteDinamicoDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCuentaFlujoCaja.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleCuentaFlujoCaja.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleCuentaFlujoCaja,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleCuentaFlujoCaja.setToolTipText("Generar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCuentaFlujoCaja.add(this.jButtonGenerarReporteDinamicoDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleCuentaFlujoCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleCuentaFlujoCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleCuentaFlujoCaja.setToolTipText("Cancelar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCuentaFlujoCaja.add(this.jButtonCerrarReporteDinamicoDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleCuentaFlujoCaja = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleCuentaFlujoCaja= new JScrollPane(jPanelReporteDinamicoDetalleCuentaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cuenta Flujo Cajas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleCuentaFlujoCaja);
		this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleCuentaFlujoCaja() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleCuentaFlujoCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleCuentaFlujoCaja.setName("jPanelImportacionDetalleCuentaFlujoCaja"); 
		
		this.jPanelImportacionDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleCuentaFlujoCaja.setLayout(gridaBagLayoutImportacionDetalleCuentaFlujoCaja);
		
		
		this.jInternalFrameImportacionDetalleCuentaFlujoCaja= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleCuentaFlujoCaja= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleCuentaFlujoCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleCuentaFlujoCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setResizable(true);
	    this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setClosable(true);
	    this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setResizable(true);
	    this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setClosable(true);
	    this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cuenta Flujo Cajas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleCuentaFlujoCaja = new JLabelMe();

		this.jLabelArchivoImportacionDetalleCuentaFlujoCaja.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleCuentaFlujoCaja.add(this.jLabelArchivoImportacionDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleCuentaFlujoCaja = new JFileChooser();		
		this.jFileChooserImportacionDetalleCuentaFlujoCaja.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonAbrirImportacionDetalleCuentaFlujoCaja.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleCuentaFlujoCaja,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleCuentaFlujoCaja.setToolTipText("Generar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCuentaFlujoCaja.add(this.jButtonAbrirImportacionDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleCuentaFlujoCaja = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleCuentaFlujoCaja.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleCuentaFlujoCaja.add(this.jLabelPathArchivoImportacionDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleCuentaFlujoCaja=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCuentaFlujoCaja.add(this.jTextFieldPathArchivoImportacionDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonGenerarImportacionDetalleCuentaFlujoCaja.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleCuentaFlujoCaja,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleCuentaFlujoCaja.setToolTipText("Generar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCuentaFlujoCaja.add(this.jButtonGenerarImportacionDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonCerrarImportacionDetalleCuentaFlujoCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleCuentaFlujoCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleCuentaFlujoCaja.setToolTipText("Cancelar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCuentaFlujoCaja.add(this.jButtonCerrarImportacionDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleCuentaFlujoCaja = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleCuentaFlujoCaja= new JScrollPane(jPanelImportacionDetalleCuentaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleCuentaFlujoCaja.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleCuentaFlujoCaja);
		this.jInternalFrameImportacionDetalleCuentaFlujoCaja.getContentPane().add(this.jScrollPanelImportacionDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleCuentaFlujoCaja(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleCuentaFlujoCaja = new JButtonMe();
			this.jButtonAbrirOrderByDetalleCuentaFlujoCaja.setText("Orden");
			this.jButtonAbrirOrderByDetalleCuentaFlujoCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleCuentaFlujoCaja,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleCuentaFlujoCaja";
			inputMap = this.jButtonAbrirOrderByDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleCuentaFlujoCaja"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleCuentaFlujoCaja = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleCuentaFlujoCaja.setName("jPanelOrderByDetalleCuentaFlujoCaja"); 
			
			this.jPanelOrderByDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleCuentaFlujoCaja.setLayout(gridaBagLayoutOrderByDetalleCuentaFlujoCaja);
			
			
			this.jTableDatosDetalleCuentaFlujoCajaOrderBy = new JTableMe();        
			this.jTableDatosDetalleCuentaFlujoCajaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleCuentaFlujoCajaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleCuentaFlujoCajaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleCuentaFlujoCajaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleCuentaFlujoCajaOrderBy.setViewportView(this.jTableDatosDetalleCuentaFlujoCajaOrderBy);
			this.jTableDatosDetalleCuentaFlujoCajaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleCuentaFlujoCajaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleCuentaFlujoCaja = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleCuentaFlujoCaja= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setTitle("Orden");
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setResizable(true);
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setClosable(true);
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cuenta Flujo Cajas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleCuentaFlujoCaja.ipady =150;
				
			this.jPanelOrderByDetalleCuentaFlujoCaja.add(jScrollPanelDatosDetalleCuentaFlujoCajaOrderBy, this.gridBagConstraintsDetalleCuentaFlujoCaja);//this.jTableDatosDetalleCuentaFlujoCajaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleCuentaFlujoCaja = new JButtonMe();
			this.jButtonCerrarOrderByDetalleCuentaFlujoCaja.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleCuentaFlujoCaja,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleCuentaFlujoCaja.setToolTipText("Cancelar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleCuentaFlujoCaja.add(this.jButtonCerrarOrderByDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleCuentaFlujoCaja = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleCuentaFlujoCaja= new JScrollPane(jPanelOrderByDetalleCuentaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleCuentaFlujoCaja);
			
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getContentPane().add(this.jScrollPanelOrderByDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);			
		
		} else {
			this.jButtonAbrirOrderByDetalleCuentaFlujoCaja = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallecuentaflujocajaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleCuentaFlujoCaja.getRowHeight();//DetalleCuentaFlujoCajaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleCuentaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleCuentaFlujoCaja.isSelected()) {
					iHeightTable=DetalleCuentaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleCuentaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleCuentaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleCuentaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleCuentaFlujoCaja.isSelected()) {
					iHeightTable=DetalleCuentaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleCuentaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleCuentaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleCuentaFlujoCaja!=null && this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjTableDatosOrderBy()!=null) {
			//if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallecuentaflujocajas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleCuentaFlujoCaja> TraerDetalleCuentaFlujoCajaBeans(List<DetalleCuentaFlujoCaja> detallecuentaflujocajas,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleCuentaFlujoCaja detallecuentaflujocaja:detallecuentaflujocajas) {
					
				if(!(DetalleCuentaFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleCuentaFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallecuentaflujocaja.setsDetalleGeneralEntityReporte(DetalleCuentaFlujoCajaConstantesFunciones.getDetalleCuentaFlujoCajaDescripcion(detallecuentaflujocaja));
										
					detallecuentaflujocaja.setesta_activo_descripcion(DetalleCuentaFlujoCajaConstantesFunciones.getesta_activoDescripcion(detallecuentaflujocaja));	
					
						
					
				} else  {
							
					//detallecuentaflujocaja.setsDetalleGeneralEntityReporte(detallecuentaflujocaja.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallecuentaflujocajabeans.add(detallecuentaflujocajabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallecuentaflujocajas;
    }
	//PARA REPORTES FIN
}
