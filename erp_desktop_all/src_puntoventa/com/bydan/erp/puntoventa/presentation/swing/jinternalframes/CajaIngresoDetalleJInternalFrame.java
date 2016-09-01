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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.CajaIngresoDetalleConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class CajaIngresoDetalleJInternalFrame extends CajaIngresoDetalleBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCajaIngresoDetalle;
	
	protected JMenuBar jmenuBarCajaIngresoDetalle;
	
	protected JMenu jmenuCajaIngresoDetalle;
	protected JMenu jmenuDatosCajaIngresoDetalle;
	protected JMenu jmenuArchivoCajaIngresoDetalle;
	protected JMenu jmenuAccionesCajaIngresoDetalle;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCajaIngresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajaIngresoDetalle;	
	protected GridBagConstraints gridBagConstraintsCajaIngresoDetalle;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CajaIngresoDetalleDetalleFormJInternalFrame jInternalFrameDetalleFormCajaIngresoDetalle;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCajaIngresoDetalle;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCajaIngresoDetalle;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CajaIngresoBeanSwingJInternalFrame cajaingresoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cajaingreso="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";
	
	public CajaIngresoDetalleSessionBean cajaingresodetalleSessionBean;
		
	
	
	public CajaIngresoSessionBean cajaingresoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CajaIngresoDetalle> cajaingresodetalles;		
	public List<CajaIngresoDetalle> cajaingresodetallesEliminados;	
	public List<CajaIngresoDetalle> cajaingresodetallesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCajaIngresoDetalle;		
	protected JButton jButtonAbrirOrderByCajaIngresoDetalle;
	
	
	//protected JPanel jPanelOrderByCajaIngresoDetalle;
	//public JScrollPane jScrollPanelOrderByCajaIngresoDetalle;	
	//protected JButton jButtonCerrarOrderByCajaIngresoDetalle;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CajaIngresoDetalleLogic cajaingresodetalleLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCajaIngresoDetalle;
	public JScrollPane jScrollPanelDatosEdicionCajaIngresoDetalle;
	public JScrollPane jScrollPanelDatosGeneralCajaIngresoDetalle;
    
	
	
	//public JScrollPane jScrollPanelDatosCajaIngresoDetalleOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCajaIngresoDetalle;
	//public JScrollPane jScrollPanelImportacionCajaIngresoDetalle;
	
	
	
	protected JPanel jPanelAccionesCajaIngresoDetalle;
	
    protected JPanel jPanelPaginacionCajaIngresoDetalle;
    protected JPanel jPanelParametrosReportesCajaIngresoDetalle;
	protected JPanel jPanelParametrosReportesAccionesCajaIngresoDetalle;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CajaIngresoDetalle;
	protected JPanel jPanelParametrosAuxiliar2CajaIngresoDetalle;
	protected JPanel jPanelParametrosAuxiliar3CajaIngresoDetalle;
	protected JPanel jPanelParametrosAuxiliar4CajaIngresoDetalle;
	//protected JPanel jPanelParametrosAuxiliar5CajaIngresoDetalle;
	
	
	
	//protected JPanel jPanelReporteDinamicoCajaIngresoDetalle;
	//protected JPanel jPanelImportacionCajaIngresoDetalle;
	
	
	public JTable jTableDatosCajaIngresoDetalle;
	
	
	
	//public JTable jTableDatosCajaIngresoDetalleOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCajaIngresoDetalle;
	protected JButton jButtonDuplicarCajaIngresoDetalle;
	protected JButton jButtonCopiarCajaIngresoDetalle;
	protected JButton jButtonVerFormCajaIngresoDetalle;
	protected JButton jButtonNuevoRelacionesCajaIngresoDetalle;
	protected JButton jButtonModificarCajaIngresoDetalle;
	
    protected JButton jButtonGuardarCambiosTablaCajaIngresoDetalle;
	protected JButton jButtonCerrarCajaIngresoDetalle;
	
	
	protected JButton jButtonRecargarInformacionCajaIngresoDetalle;
	protected JButton jButtonProcesarInformacionCajaIngresoDetalle;
	
	
	protected JButton jButtonAnterioresCajaIngresoDetalle;
	protected JButton jButtonSiguientesCajaIngresoDetalle;
	protected JButton jButtonNuevoGuardarCambiosCajaIngresoDetalle;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCajaIngresoDetalle;
	//protected JButton jButtonCerrarReporteDinamicoCajaIngresoDetalle;
	//protected JButton jButtonGenerarExcelReporteDinamicoCajaIngresoDetalle;	
	
	
	
	//protected JButton jButtonAbrirImportacionCajaIngresoDetalle;
	//protected JButton jButtonGenerarImportacionCajaIngresoDetalle;
	//protected JButton jButtonCerrarImportacionCajaIngresoDetalle;
	//protected JFileChooser jFileChooserImportacionCajaIngresoDetalle;
	//protected File fileImportacionCajaIngresoDetalle;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajaIngresoDetalle;
	protected JButton jButtonDuplicarToolBarCajaIngresoDetalle;
	protected JButton jButtonNuevoRelacionesToolBarCajaIngresoDetalle;
	
	
	public JButton jButtonGuardarCambiosToolBarCajaIngresoDetalle;
	protected JButton jButtonCopiarToolBarCajaIngresoDetalle;
	protected JButton jButtonVerFormToolBarCajaIngresoDetalle;
	public JButton jButtonGuardarCambiosTablaToolBarCajaIngresoDetalle;
	protected JButton jButtonMostrarOcultarTablaToolBarCajaIngresoDetalle;
	protected JButton jButtonCerrarToolBarCajaIngresoDetalle;
	
	protected JButton jButtonRecargarInformacionToolBarCajaIngresoDetalle;
	protected JButton jButtonProcesarInformacionToolBarCajaIngresoDetalle;
	protected JButton jButtonAnterioresToolBarCajaIngresoDetalle;
	protected JButton jButtonSiguientesToolBarCajaIngresoDetalle;
	protected JButton jButtonNuevoGuardarCambiosToolBarCajaIngresoDetalle;
	protected JButton jButtonAbrirOrderByToolBarCajaIngresoDetalle;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajaIngresoDetalle;
	protected JMenuItem jMenuItemDuplicarCajaIngresoDetalle;
	protected JMenuItem jMenuItemNuevoRelacionesCajaIngresoDetalle;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCajaIngresoDetalle;
	protected JMenuItem jMenuItemCopiarCajaIngresoDetalle;
	protected JMenuItem jMenuItemVerFormCajaIngresoDetalle;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajaIngresoDetalle;
	protected JMenuItem jMenuItemCerrarCajaIngresoDetalle;
	protected JMenuItem jMenuItemDetalleCerrarCajaIngresoDetalle;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCajaIngresoDetalle;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajaIngresoDetalle;
	
	protected JMenuItem jMenuItemRecargarInformacionCajaIngresoDetalle;
	protected JMenuItem jMenuItemProcesarInformacionCajaIngresoDetalle;
	protected JMenuItem jMenuItemAnterioresCajaIngresoDetalle;
	protected JMenuItem jMenuItemSiguientesCajaIngresoDetalle;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajaIngresoDetalle;
	protected JMenuItem jMenuItemAbrirOrderByCajaIngresoDetalle;
	protected JMenuItem jMenuItemMostrarOcultarCajaIngresoDetalle;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajaIngresoDetalle;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCajaIngresoDetalle;
	protected JCheckBox jCheckBoxSeleccionadosCajaIngresoDetalle;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCajaIngresoDetalle;
	protected JCheckBox jCheckBoxConGraficoReporteCajaIngresoDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCajaIngresoDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCajaIngresoDetalle;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCajaIngresoDetalle;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCajaIngresoDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCajaIngresoDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCajaIngresoDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajaIngresoDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajaIngresoDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCajaIngresoDetalle;
	protected JTextField jTextFieldValorCampoGeneralCajaIngresoDetalle;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCajaIngresoDetalle;
	//public JList<Reporte> jListColumnasSelectReporteCajaIngresoDetalle;
	//public JScrollPane jScrollColumnasSelectReporteCajaIngresoDetalle;
	
	//public JLabel jLabelRelacionesSelectReporteCajaIngresoDetalle;
	//public JList<Reporte> jListRelacionesSelectReporteCajaIngresoDetalle;
	//public JScrollPane jScrollRelacionesSelectReporteCajaIngresoDetalle;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCajaIngresoDetalle;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCajaIngresoDetalle;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCajaIngresoDetalle;
	//public JLabel jLabelTiposArchivoReporteDinamicoCajaIngresoDetalle;
	
		
	//public JLabel jLabelArchivoImportacionCajaIngresoDetalle;	
	//public JLabel jLabelPathArchivoImportacionCajaIngresoDetalle;
	//protected JTextField jTextFieldPathArchivoImportacionCajaIngresoDetalle;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCajaIngresoDetalle;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCajaIngresoDetalle;
	
	//public JLabel jLabelColumnaCategoriaValorCajaIngresoDetalle;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCajaIngresoDetalle;
	
	//public JLabel jLabelColumnasValoresGraficoCajaIngresoDetalle;
	//public JList<Reporte> jListColumnasValoresGraficoCajaIngresoDetalle;
	//public JScrollPane jScrollColumnasValoresGraficoCajaIngresoDetalle;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCajaIngresoDetalle;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCajaIngresoDetalle;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCajaIngresoDetalle;
	public JPanel jPanelFK_IdCajaIngresoCajaIngresoDetalle;
	public JButton jButtonFK_IdCajaIngresoCajaIngresoDetalle;
	public JPanel jPanelFK_IdClienteCajaIngresoDetalle;
	public JButton jButtonFK_IdClienteCajaIngresoDetalle;
	public JPanel jPanelFK_IdFacturaCajaIngresoDetalle;
	public JButton jButtonFK_IdFacturaCajaIngresoDetalle;
	
	public JPanel jPanelid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle;
	public JLabel jLabelid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle;
	public JButton jButtonid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle= new JButtonMe();
	public JButton jButtonid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalleUpdate= new JButtonMe();
	public JButton jButtonid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteCajaIngresoDetalle;
	public JLabel jLabelid_clienteFK_IdClienteCajaIngresoDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle;
	public JButton jButtonid_clienteFK_IdClienteCajaIngresoDetalle= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteCajaIngresoDetalleUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteCajaIngresoDetalleBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteCajaIngresoDetalle;
	
	public JPanel jPanelid_facturaFK_IdFacturaCajaIngresoDetalle;
	public JLabel jLabelid_facturaFK_IdFacturaCajaIngresoDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle;
	public JButton jButtonid_facturaFK_IdFacturaCajaIngresoDetalle= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaCajaIngresoDetalleUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaCajaIngresoDetalleBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaCajaIngresoDetalle;
	
	
	
	
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
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CajaIngresoDetalleJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CajaIngresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaIngresoDetalleJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaIngresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaIngresoDetalleJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaIngresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaIngresoDetalleJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CajaIngresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCajaIngresoDetalle)	{
		this.jButtonRecargarInformacionCajaIngresoDetalle = jButtonRecargarInformacionCajaIngresoDetalle;
	}
	
	public JButton getjButtonProcesarInformacionCajaIngresoDetalle() {
		return this.jButtonProcesarInformacionCajaIngresoDetalle;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajaIngresoDetalle)	{
		this.jButtonProcesarInformacionCajaIngresoDetalle = jButtonProcesarInformacionCajaIngresoDetalle;
	}
	
	
	public JButton getjButtonRecargarInformacionCajaIngresoDetalle() {
		return this.jButtonRecargarInformacionCajaIngresoDetalle;
	}
	
	
	public List<CajaIngresoDetalle> getcajaingresodetalles() {
		return this.cajaingresodetalles;
	}

	public void setcajaingresodetalles(List<CajaIngresoDetalle> cajaingresodetalles) {
		this.cajaingresodetalles = cajaingresodetalles;
	}
	
	public List<CajaIngresoDetalle> getcajaingresodetallesAux() {
		return this.cajaingresodetallesAux;
	}

	public void setcajaingresodetallesAux(List<CajaIngresoDetalle> cajaingresodetallesAux) {
		this.cajaingresodetallesAux = cajaingresodetallesAux;
	}
	
	public List<CajaIngresoDetalle> getcajaingresodetallesEliminados() {
		return this.cajaingresodetallesEliminados;
	}

	public void setCajaIngresoDetallesEliminados(List<CajaIngresoDetalle> cajaingresodetallesEliminados) {
		this.cajaingresodetallesEliminados = cajaingresodetallesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCajaIngresoDetalle() {
		return jComboBoxTiposSeleccionarCajaIngresoDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCajaIngresoDetalle(
			JComboBox jComboBoxTiposSeleccionarCajaIngresoDetalle) {
		this.jComboBoxTiposSeleccionarCajaIngresoDetalle = jComboBoxTiposSeleccionarCajaIngresoDetalle;
	}
	
	public void setBorderResaltarTiposSeleccionarCajaIngresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCajaIngresoDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCajaIngresoDetalle .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCajaIngresoDetalle() {
		return jTextFieldValorCampoGeneralCajaIngresoDetalle;
	}

	public void setjTextFieldValorCampoGeneralCajaIngresoDetalle(
			JTextField jTextFieldValorCampoGeneralCajaIngresoDetalle) {
		this.jTextFieldValorCampoGeneralCajaIngresoDetalle = jTextFieldValorCampoGeneralCajaIngresoDetalle;
	}

	public void setBorderResaltarValorCampoGeneralCajaIngresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngresoDetalle.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCajaIngresoDetalle .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCajaIngresoDetalle() {
		return this.jCheckBoxSeleccionarTodosCajaIngresoDetalle;
	}

	public void setjCheckBoxSeleccionarTodosCajaIngresoDetalle(
			JCheckBox jCheckBoxSeleccionarTodosCajaIngresoDetalle) {
		this.jCheckBoxSeleccionarTodosCajaIngresoDetalle = jCheckBoxSeleccionarTodosCajaIngresoDetalle;
	}

	public void setBorderResaltarSeleccionarTodosCajaIngresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngresoDetalle.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCajaIngresoDetalle .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCajaIngresoDetalle() {
		return this.jCheckBoxSeleccionadosCajaIngresoDetalle;
	}

	public void setjCheckBoxSeleccionadosCajaIngresoDetalle(
			JCheckBox jCheckBoxSeleccionadosCajaIngresoDetalle) {
		this.jCheckBoxSeleccionadosCajaIngresoDetalle = jCheckBoxSeleccionadosCajaIngresoDetalle;
	}
	
	public void setBorderResaltarSeleccionadosCajaIngresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngresoDetalle.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCajaIngresoDetalle .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCajaIngresoDetalle() {
		return this.jComboBoxTiposArchivosReportesCajaIngresoDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCajaIngresoDetalle(
			JComboBox jComboBoxTiposArchivosReportesCajaIngresoDetalle) {
		this.jComboBoxTiposArchivosReportesCajaIngresoDetalle = jComboBoxTiposArchivosReportesCajaIngresoDetalle;
	}

	public void setBorderResaltarTiposArchivosReportesCajaIngresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngresoDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCajaIngresoDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCajaIngresoDetalle() {
		return this.jComboBoxTiposReportesCajaIngresoDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCajaIngresoDetalle(
			JComboBox jComboBoxTiposReportesCajaIngresoDetalle) {
		this.jComboBoxTiposReportesCajaIngresoDetalle = jComboBoxTiposReportesCajaIngresoDetalle;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCajaIngresoDetalle() {
	//	return jComboBoxTiposReportesDinamicoCajaIngresoDetalle;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCajaIngresoDetalle(
	//		JComboBox jComboBoxTiposReportesDinamicoCajaIngresoDetalle) {
	//	this.jComboBoxTiposReportesDinamicoCajaIngresoDetalle = jComboBoxTiposReportesDinamicoCajaIngresoDetalle;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCajaIngresoDetalle() {
	//	return jComboBoxTiposArchivosReportesDinamicoCajaIngresoDetalle;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCajaIngresoDetalle(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCajaIngresoDetalle) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCajaIngresoDetalle = jComboBoxTiposArchivosReportesDinamicoCajaIngresoDetalle;
	//}
	
	public void setBorderResaltarTiposReportesCajaIngresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngresoDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCajaIngresoDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCajaIngresoDetalle() {
		return this.jComboBoxTiposGraficosReportesCajaIngresoDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCajaIngresoDetalle(
			JComboBox jComboBoxTiposGraficosReportesCajaIngresoDetalle) {
		this.jComboBoxTiposGraficosReportesCajaIngresoDetalle = jComboBoxTiposGraficosReportesCajaIngresoDetalle;
	}
	
	public void setBorderResaltarTiposGraficosReportesCajaIngresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngresoDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCajaIngresoDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCajaIngresoDetalle() {
		return this.jComboBoxTiposPaginacionCajaIngresoDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCajaIngresoDetalle(
			JComboBox jComboBoxTiposPaginacionCajaIngresoDetalle) {
		this.jComboBoxTiposPaginacionCajaIngresoDetalle = jComboBoxTiposPaginacionCajaIngresoDetalle;
	}
	
	public void setBorderResaltarTiposPaginacionCajaIngresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngresoDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCajaIngresoDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCajaIngresoDetalle() {
		return this.jComboBoxTiposRelacionesCajaIngresoDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajaIngresoDetalle() {
		return this.jComboBoxTiposAccionesCajaIngresoDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajaIngresoDetalle(
			JComboBox jComboBoxTiposRelacionesCajaIngresoDetalle) {
		this.jComboBoxTiposRelacionesCajaIngresoDetalle = jComboBoxTiposRelacionesCajaIngresoDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajaIngresoDetalle(
			JComboBox jComboBoxTiposAccionesCajaIngresoDetalle) {
		this.jComboBoxTiposAccionesCajaIngresoDetalle = jComboBoxTiposAccionesCajaIngresoDetalle;
	}
	
	public void setBorderResaltarTiposRelacionesCajaIngresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngresoDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCajaIngresoDetalle .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCajaIngresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaIngresoDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCajaIngresoDetalle .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCajaIngresoDetalle() {
	//	return jCheckBoxConGraficoDinamicoCajaIngresoDetalle;
	//}

	//public void setjCheckBoxConGraficoDinamicoCajaIngresoDetalle(
	//		JCheckBox jCheckBoxConGraficoDinamicoCajaIngresoDetalle) {
	//	this.jCheckBoxConGraficoDinamicoCajaIngresoDetalle = jCheckBoxConGraficoDinamicoCajaIngresoDetalle;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCajaIngresoDetalle() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCajaIngresoDetalle.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCajaIngresoDetalle .setBorder(borderResaltar);		
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
		this.cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
		
		this.cajaingresodetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajaingresodetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajaingresodetalleSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CajaIngresoDetalleJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CajaIngresoDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajaIngresoDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajaIngresoDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajaIngresoDetalleJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caja Ingreso Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
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
		
		CajaIngresoDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CajaIngresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCajaIngresoDetalle= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCajaIngresoDetalle,this.jTtoolBarCajaIngresoDetalle,
							"nuevo","nuevo","Nuevo"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCajaIngresoDetalle,this.jTtoolBarCajaIngresoDetalle,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCajaIngresoDetalle,this.jTtoolBarCajaIngresoDetalle,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCajaIngresoDetalle,this.jTtoolBarCajaIngresoDetalle,
							"duplicar","duplicar","Duplicar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCajaIngresoDetalle,this.jTtoolBarCajaIngresoDetalle,
							"copiar","copiar","Copiar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCajaIngresoDetalle,this.jTtoolBarCajaIngresoDetalle,
							"ver_form","ver_form","Ver"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaIngresoDetalle,this.jTtoolBarCajaIngresoDetalle,
							"recargar","recargar","Recargar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaIngresoDetalle,this.jTtoolBarCajaIngresoDetalle,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaIngresoDetalle,this.jTtoolBarCajaIngresoDetalle,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCajaIngresoDetalle,this.jTtoolBarCajaIngresoDetalle,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCajaIngresoDetalle,this.jTtoolBarCajaIngresoDetalle,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCajaIngresoDetalle,this.jTtoolBarCajaIngresoDetalle,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCajaIngresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCajaIngresoDetalle,this.jTtoolBarCajaIngresoDetalle,
							"cerrar","cerrar","Salir"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCajaIngresoDetalle=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCajaIngresoDetalle;
			
				this.jButtonProcesarInformacionToolBarCajaIngresoDetalle=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCajaIngresoDetalle;
				
		//protected JButton jButtonModificarToolBarCajaIngresoDetalle;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCajaIngresoDetalle=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCajaIngresoDetalle=new JMenuMe("General");
		this.jmenuArchivoCajaIngresoDetalle=new JMenuMe("Archivo");
		this.jmenuAccionesCajaIngresoDetalle=new JMenuMe("Acciones");
		this.jmenuDatosCajaIngresoDetalle=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajaIngresoDetalle= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajaIngresoDetalle.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajaIngresoDetalle,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCajaIngresoDetalle= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCajaIngresoDetalle.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCajaIngresoDetalle,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCajaIngresoDetalle= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCajaIngresoDetalle.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCajaIngresoDetalle,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCajaIngresoDetalle= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajaIngresoDetalle.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajaIngresoDetalle,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCajaIngresoDetalle= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCajaIngresoDetalle.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCajaIngresoDetalle,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCajaIngresoDetalle= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCajaIngresoDetalle.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCajaIngresoDetalle,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCajaIngresoDetalle= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCajaIngresoDetalle.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCajaIngresoDetalle,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajaIngresoDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajaIngresoDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajaIngresoDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCajaIngresoDetalle= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCajaIngresoDetalle.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCajaIngresoDetalle,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCajaIngresoDetalle= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCajaIngresoDetalle.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCajaIngresoDetalle,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCajaIngresoDetalle= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCajaIngresoDetalle.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCajaIngresoDetalle,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCajaIngresoDetalle= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCajaIngresoDetalle.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCajaIngresoDetalle,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCajaIngresoDetalle= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCajaIngresoDetalle.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCajaIngresoDetalle,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajaIngresoDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajaIngresoDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajaIngresoDetalle,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCajaIngresoDetalle= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCajaIngresoDetalle.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCajaIngresoDetalle,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajaIngresoDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajaIngresoDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajaIngresoDetalle,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCajaIngresoDetalle= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCajaIngresoDetalle.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCajaIngresoDetalle,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCajaIngresoDetalle.add(this.jMenuItemCerrarCajaIngresoDetalle);
			
			this.jmenuAccionesCajaIngresoDetalle.add(this.jMenuItemNuevoCajaIngresoDetalle);
			this.jmenuAccionesCajaIngresoDetalle.add(this.jMenuItemNuevoGuardarCambiosCajaIngresoDetalle);
			this.jmenuAccionesCajaIngresoDetalle.add(this.jMenuItemNuevoRelacionesCajaIngresoDetalle);
			this.jmenuAccionesCajaIngresoDetalle.add(this.jMenuItemGuardarCambiosTablaCajaIngresoDetalle);		
			this.jmenuAccionesCajaIngresoDetalle.add(this.jMenuItemDuplicarCajaIngresoDetalle);		
			this.jmenuAccionesCajaIngresoDetalle.add(this.jMenuItemCopiarCajaIngresoDetalle);		
			this.jmenuAccionesCajaIngresoDetalle.add(this.jMenuItemVerFormCajaIngresoDetalle);		
			
			this.jmenuDatosCajaIngresoDetalle.add(this.jMenuItemRecargarInformacionCajaIngresoDetalle);				
			this.jmenuDatosCajaIngresoDetalle.add(this.jMenuItemAnterioresCajaIngresoDetalle);				
			this.jmenuDatosCajaIngresoDetalle.add(this.jMenuItemSiguientesCajaIngresoDetalle);				
			this.jmenuDatosCajaIngresoDetalle.add(this.jMenuItemAbrirOrderByCajaIngresoDetalle);				
			this.jmenuDatosCajaIngresoDetalle.add(this.jMenuItemMostrarOcultarCajaIngresoDetalle);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCajaIngresoDetalle.add(this.jMenuItemGuardarCambiosCajaIngresoDetalle);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCajaIngresoDetalle.add(this.jmenuArchivoCajaIngresoDetalle);		
			this.jmenuBarCajaIngresoDetalle.add(this.jmenuAccionesCajaIngresoDetalle);		
			this.jmenuBarCajaIngresoDetalle.add(this.jmenuDatosCajaIngresoDetalle);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCajaIngresoDetalle);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCajaIngresoDetalle() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCajaIngresoCajaIngresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCajaIngresoCajaIngresoDetalle.setToolTipText("Buscar Por Caja Ingreso ");
		this.jButtonFK_IdCajaIngresoCajaIngresoDetalle= new JButtonMe();
		this.jButtonFK_IdCajaIngresoCajaIngresoDetalle.setText("Buscar");
		this.jButtonFK_IdCajaIngresoCajaIngresoDetalle.setToolTipText("Buscar Por Caja Ingreso ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCajaIngresoCajaIngresoDetalle,"buscar_button","Buscar Por Caja Ingreso ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCajaIngresoCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle = new JLabelMe();
		jLabelid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.setText("Caja Ingreso :");
		jLabelid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.setToolTipText("Caja Ingreso");
		jLabelid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle= new JComboBoxMe();
		jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteCajaIngresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteCajaIngresoDetalle.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteCajaIngresoDetalle= new JButtonMe();
		this.jButtonFK_IdClienteCajaIngresoDetalle.setText("Buscar");
		this.jButtonFK_IdClienteCajaIngresoDetalle.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteCajaIngresoDetalle,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteCajaIngresoDetalle = new JLabelMe();
		jLabelid_clienteFK_IdClienteCajaIngresoDetalle.setText("Cliente :");
		jLabelid_clienteFK_IdClienteCajaIngresoDetalle.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteCajaIngresoDetalle= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteCajaIngresoDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteCajaIngresoDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteCajaIngresoDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteCajaIngresoDetalle.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteCajaIngresoDetalle.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteCajaIngresoDetalle.setFocusable(false);

		this.jPanelFK_IdFacturaCajaIngresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaCajaIngresoDetalle.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaCajaIngresoDetalle= new JButtonMe();
		this.jButtonFK_IdFacturaCajaIngresoDetalle.setText("Buscar");
		this.jButtonFK_IdFacturaCajaIngresoDetalle.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaCajaIngresoDetalle,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaCajaIngresoDetalle = new JLabelMe();
		jLabelid_facturaFK_IdFacturaCajaIngresoDetalle.setText("Factura :");
		jLabelid_facturaFK_IdFacturaCajaIngresoDetalle.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaCajaIngresoDetalle= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaCajaIngresoDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaCajaIngresoDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaCajaIngresoDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaCajaIngresoDetalle.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaCajaIngresoDetalle.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaCajaIngresoDetalle.setFocusable(false);


		this.jTabbedPaneBusquedasCajaIngresoDetalle=new JTabbedPane();


		this.jTabbedPaneBusquedasCajaIngresoDetalle.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCajaIngresoDetalle.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCajaIngresoDetalle.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCajaIngresoDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCajaIngresoDetalle = new CajaIngresoDetalleDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Caja Ingreso Detalle DATOS");
			this.jInternalFrameDetalleFormCajaIngresoDetalle = new CajaIngresoDetalleDetalleFormJInternalFrame(jDesktopPane,this.cajaingresodetalleSessionBean.getConGuardarRelaciones(),this.cajaingresodetalleSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCajaIngresoDetalle = null;//new CajaIngresoDetalleDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajaIngresoDetalle= new GridBagLayout();
		
		
		this.jTableDatosCajaIngresoDetalle = new JTableMe();      
		
		String sToolTipCajaIngresoDetalle="";
		sToolTipCajaIngresoDetalle=CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajaIngresoDetalle+="(PuntoVenta.CajaIngresoDetalle)";
		}
		
		if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajaIngresoDetalle+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCajaIngresoDetalle.setToolTipText(sToolTipCajaIngresoDetalle);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCajaIngresoDetalle);
		this.jTableDatosCajaIngresoDetalle.setAutoCreateRowSorter(true);
		this.jTableDatosCajaIngresoDetalle.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCajaIngresoDetalle.setRowSelectionAllowed(true);
		this.jTableDatosCajaIngresoDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCajaIngresoDetalle,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCajaIngresoDetalle = new JButtonMe();
		this.jButtonDuplicarCajaIngresoDetalle = new JButtonMe();
		this.jButtonCopiarCajaIngresoDetalle = new JButtonMe();
		this.jButtonVerFormCajaIngresoDetalle = new JButtonMe();
		this.jButtonNuevoRelacionesCajaIngresoDetalle = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCajaIngresoDetalle = new JButtonMe();
		this.jButtonCerrarCajaIngresoDetalle = new JButtonMe();
		
		this.jScrollPanelDatosCajaIngresoDetalle = new JScrollPane();   
        this.jScrollPanelDatosGeneralCajaIngresoDetalle = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCajaIngresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Caja Ingreso Detalle";
		
		if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Ingreso Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatosCajaIngresoDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajaIngresoDetalle.setToolTipText("Acciones");
        this.jPanelAccionesCajaIngresoDetalle.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCajaIngresoDetalle=new ReporteDinamicoJInternalFrame(CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCajaIngresoDetalle();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCajaIngresoDetalle=new ImportacionJInternalFrame(CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCajaIngresoDetalle();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCajaIngresoDetalle = new JButtonMe();
		
		this.jButtonAbrirOrderByCajaIngresoDetalle.setText("Orden");
		this.jButtonAbrirOrderByCajaIngresoDetalle.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajaIngresoDetalle,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCajaIngresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajaIngresoDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaIngresoDetalle,false,this);
			
			//this.cargarOrderByCajaIngresoDetalle(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajaIngresoDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaIngresoDetalle,true,this);
			
			//this.cargarOrderByCajaIngresoDetalle(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCajaIngresoDetalle.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosCajaIngresoDetalle.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosCajaIngresoDetalle.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosCajaIngresoDetalle.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajaIngresoDetalle.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajaIngresoDetalle.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCajaIngresoDetalle.setText("Nuevo");
		this.jButtonDuplicarCajaIngresoDetalle.setText("Duplicar");
		this.jButtonCopiarCajaIngresoDetalle.setText("Copiar");
		this.jButtonVerFormCajaIngresoDetalle.setText("Ver");
		this.jButtonNuevoRelacionesCajaIngresoDetalle.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCajaIngresoDetalle.setText("Guardar");
		this.jButtonCerrarCajaIngresoDetalle.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajaIngresoDetalle,"nuevo_button","Nuevo",this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCajaIngresoDetalle,"duplicar_button","Duplicar",this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCajaIngresoDetalle,"copiar_button","Copiar",this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCajaIngresoDetalle,"ver_form","Ver",this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCajaIngresoDetalle,"nuevorelaciones_button","Nuevo Rel",this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajaIngresoDetalle,"guardarcambiostabla_button","Guardar",this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajaIngresoDetalle,"cerrar_button","Salir",this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCajaIngresoDetalle.setToolTipText("Nuevo"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCajaIngresoDetalle.setToolTipText("Duplicar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCajaIngresoDetalle.setToolTipText("Copiar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCajaIngresoDetalle.setToolTipText("Ver"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCajaIngresoDetalle.setToolTipText("Nuevo Rel"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCajaIngresoDetalle.setToolTipText("Guardar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajaIngresoDetalle.setToolTipText("Salir"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajaIngresoDetalle";
		inputMap = this.jButtonNuevoCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajaIngresoDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajaIngresoDetalle"));
		
		//DUPLICAR
		sMapKey = "DuplicarCajaIngresoDetalle";
		inputMap = this.jButtonDuplicarCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCajaIngresoDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCajaIngresoDetalle"));
		
		//COPIAR
		sMapKey = "CopiarCajaIngresoDetalle";
		inputMap = this.jButtonCopiarCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCajaIngresoDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCajaIngresoDetalle"));
		
		//VEr FORM
		sMapKey = "VerFormCajaIngresoDetalle";
		inputMap = this.jButtonVerFormCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCajaIngresoDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCajaIngresoDetalle"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCajaIngresoDetalle";
		inputMap = this.jButtonNuevoRelacionesCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCajaIngresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCajaIngresoDetalle"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCajaIngresoDetalle";
		inputMap = this.jButtonModificarCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCajaIngresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCajaIngresoDetalle"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCajaIngresoDetalle";
		inputMap = this.jButtonCerrarCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajaIngresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajaIngresoDetalle"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajaIngresoDetalle";
		inputMap = this.jButtonGuardarCambiosTablaCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajaIngresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajaIngresoDetalle"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCajaIngresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCajaIngresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCajaIngresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CajaIngresoDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CajaIngresoDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CajaIngresoDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CajaIngresoDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CajaIngresoDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCajaIngresoDetalle.setName("jPanelParametrosReportesCajaIngresoDetalle"); 
		
		this.jPanelParametrosReportesAccionesCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCajaIngresoDetalle.setName("jPanelParametrosReportesAccionesCajaIngresoDetalle"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCajaIngresoDetalle = new JButtonMe();
		this.jButtonRecargarInformacionCajaIngresoDetalle.setText("Recargar");
		this.jButtonRecargarInformacionCajaIngresoDetalle.setToolTipText("Recargar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCajaIngresoDetalle,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCajaIngresoDetalle = new JButtonMe();
		this.jButtonProcesarInformacionCajaIngresoDetalle.setText("Procesar");
		this.jButtonProcesarInformacionCajaIngresoDetalle.setToolTipText("Procesar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCajaIngresoDetalle.setVisible(false);
			
		this.jButtonProcesarInformacionCajaIngresoDetalle.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajaIngresoDetalle.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajaIngresoDetalle.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCajaIngresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaIngresoDetalle.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCajaIngresoDetalle.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCajaIngresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaIngresoDetalle.setText("TIPO");       
		this.jComboBoxTiposReportesCajaIngresoDetalle.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCajaIngresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaIngresoDetalle.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCajaIngresoDetalle.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCajaIngresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCajaIngresoDetalle.setText("Paginacion");
		this.jComboBoxTiposPaginacionCajaIngresoDetalle.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCajaIngresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCajaIngresoDetalle.setText("Accion");
		this.jComboBoxTiposRelacionesCajaIngresoDetalle.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCajaIngresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajaIngresoDetalle.setText("Accion");
		this.jComboBoxTiposAccionesCajaIngresoDetalle.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCajaIngresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCajaIngresoDetalle.setText("Accion");
		this.jComboBoxTiposSeleccionarCajaIngresoDetalle.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCajaIngresoDetalle=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCajaIngresoDetalle.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajaIngresoDetalle.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajaIngresoDetalle.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCajaIngresoDetalle = new JLabelMe();
		
		this.jLabelAccionesCajaIngresoDetalle.setText("Acciones");		
		this.jLabelAccionesCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCajaIngresoDetalle = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCajaIngresoDetalle.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCajaIngresoDetalle.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCajaIngresoDetalle = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCajaIngresoDetalle.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCajaIngresoDetalle.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCajaIngresoDetalle = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCajaIngresoDetalle.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCajaIngresoDetalle.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCajaIngresoDetalle = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCajaIngresoDetalle.setText("Graf.");
		this.jCheckBoxConGraficoReporteCajaIngresoDetalle.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCajaIngresoDetalle = new JButtonMe();
		//this.jButtonAnterioresCajaIngresoDetalle.setText("<<");
        this.jButtonAnterioresCajaIngresoDetalle.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCajaIngresoDetalle,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCajaIngresoDetalle = new JButtonMe();
		//this.jButtonSiguientesCajaIngresoDetalle.setText(">>");
        this.jButtonSiguientesCajaIngresoDetalle.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCajaIngresoDetalle,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCajaIngresoDetalle = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCajaIngresoDetalle.setText("Nue");
        this.jButtonNuevoGuardarCambiosCajaIngresoDetalle.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCajaIngresoDetalle,"nuevoguardarcambios_button","Nue",this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCajaIngresoDetalle";
		inputMap = this.jButtonNuevoGuardarCambiosCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCajaIngresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCajaIngresoDetalle"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCajaIngresoDetalle";
		inputMap = this.jButtonRecargarInformacionCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCajaIngresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCajaIngresoDetalle"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCajaIngresoDetalle";
		inputMap = this.jButtonSiguientesCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCajaIngresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCajaIngresoDetalle"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCajaIngresoDetalle";
		inputMap = this.jButtonAnterioresCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCajaIngresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCajaIngresoDetalle"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCajaIngresoDetalle();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCajaIngresoDetalle.setMinimumSize(new Dimension(this.getWidth(),CajaIngresoDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaIngresoDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajaIngresoDetalle.setMaximumSize(new Dimension(this.getWidth(),CajaIngresoDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaIngresoDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajaIngresoDetalle.setPreferredSize(new Dimension(this.getWidth(),CajaIngresoDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaIngresoDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCajaIngresoDetalle = new GridBagLayout();

			this.jPanelPaginacionCajaIngresoDetalle.setLayout(gridaBagLayoutPaginacionCajaIngresoDetalle);						
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCajaIngresoDetalle.add(this.jButtonAnterioresCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
					
						
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
			
			this.jPanelPaginacionCajaIngresoDetalle.add(this.jButtonNuevoGuardarCambiosCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
						
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
			this.jPanelPaginacionCajaIngresoDetalle.add(this.jButtonSiguientesCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = 1;
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaIngresoDetalle.add(this.jButtonNuevoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
						
			
			
			if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
				this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCajaIngresoDetalle.gridy = 1;
				this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCajaIngresoDetalle.add(this.jButtonGuardarCambiosTablaCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
			}
			
			
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = 1;
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaIngresoDetalle.add(this.jButtonDuplicarCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = 1;
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaIngresoDetalle.add(this.jButtonCopiarCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = 1;
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaIngresoDetalle.add(this.jButtonVerFormCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = 1;
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCajaIngresoDetalle.add(this.jButtonCerrarCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
		
		
		this.jButtonRecargarInformacionCajaIngresoDetalle.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajaIngresoDetalle.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajaIngresoDetalle.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCajaIngresoDetalle.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajaIngresoDetalle.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajaIngresoDetalle.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCajaIngresoDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajaIngresoDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajaIngresoDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCajaIngresoDetalle.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajaIngresoDetalle.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajaIngresoDetalle.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCajaIngresoDetalle.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajaIngresoDetalle.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajaIngresoDetalle.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCajaIngresoDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajaIngresoDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajaIngresoDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCajaIngresoDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaIngresoDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaIngresoDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCajaIngresoDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajaIngresoDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajaIngresoDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCajaIngresoDetalle.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajaIngresoDetalle.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajaIngresoDetalle.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCajaIngresoDetalle.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajaIngresoDetalle.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajaIngresoDetalle.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCajaIngresoDetalle.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajaIngresoDetalle.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajaIngresoDetalle.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCajaIngresoDetalle.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajaIngresoDetalle.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajaIngresoDetalle.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCajaIngresoDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCajaIngresoDetalle = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CajaIngresoDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CajaIngresoDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CajaIngresoDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CajaIngresoDetalle = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCajaIngresoDetalle.setLayout(gridaBagParametrosReportesCajaIngresoDetalle);
			this.jPanelParametrosReportesAccionesCajaIngresoDetalle.setLayout(gridaBagParametrosReportesAccionesCajaIngresoDetalle);
			
			
			this.jPanelParametrosAuxiliar1CajaIngresoDetalle.setLayout(gridaBagParametrosAuxiliar1CajaIngresoDetalle);
			this.jPanelParametrosAuxiliar2CajaIngresoDetalle.setLayout(gridaBagParametrosAuxiliar2CajaIngresoDetalle);
			this.jPanelParametrosAuxiliar3CajaIngresoDetalle.setLayout(gridaBagParametrosAuxiliar3CajaIngresoDetalle);
			this.jPanelParametrosAuxiliar4CajaIngresoDetalle.setLayout(gridaBagParametrosAuxiliar4CajaIngresoDetalle);
			//this.jPanelParametrosAuxiliar5CajaIngresoDetalle.setLayout(gridaBagParametrosAuxiliar2CajaIngresoDetalle);			
			
			
			
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaIngresoDetalle.add(this.jButtonRecargarInformacionCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaIngresoDetalle.add(this.jComboBoxTiposPaginacionCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaIngresoDetalle.add(this.jCheckBoxConAltoMaximoTablaCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaIngresoDetalle.add(this.jComboBoxTiposArchivosReportesCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaIngresoDetalle.add(this.jPanelParametrosAuxiliar1CajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaIngresoDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CajaIngresoDetalle.add(this.jComboBoxTiposReportesCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);																		
			
			
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaIngresoDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CajaIngresoDetalle.add(this.jComboBoxTiposGraficosReportesCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaIngresoDetalle.add(this.jPanelParametrosAuxiliar4CajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaIngresoDetalle.add(this.jComboBoxTiposReportesCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaIngresoDetalle.add(this.jCheckBoxGenerarReporteCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaIngresoDetalle.add(this.jPanelParametrosAuxiliar2CajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaIngresoDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaIngresoDetalle.add(this.jLabelAccionesCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
				this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCajaIngresoDetalle.add(this.jButtonAbrirOrderByCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaIngresoDetalle.add(this.jComboBoxTiposSeleccionarCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);			
			
			
			/*
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaIngresoDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaIngresoDetalle.add(this.jCheckBoxSeleccionarTodosCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaIngresoDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaIngresoDetalle.add(this.jCheckBoxConGraficoReporteCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaIngresoDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaIngresoDetalle.add(this.jCheckBoxSeleccionarTodosCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);															
				
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaIngresoDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaIngresoDetalle.add(this.jCheckBoxSeleccionadosCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);															
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaIngresoDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaIngresoDetalle.add(this.jCheckBoxConGraficoReporteCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaIngresoDetalle.add(this.jPanelParametrosAuxiliar3CajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaIngresoDetalle.add(this.jComboBoxTiposAccionesCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
	
				
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaIngresoDetalle.add(this.jTextFieldValorCampoGeneralCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCajaIngresoDetalle = new GridBagLayout();

			this.jScrollPanelDatosCajaIngresoDetalle.setLayout(gridaBagLayoutDatosCajaIngresoDetalle);
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
			this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
			
			this.jScrollPanelDatosCajaIngresoDetalle.add(this.jTableDatosCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCajaIngresoDetalle.setViewportView(this.jTableDatosCajaIngresoDetalle);
		this.jTableDatosCajaIngresoDetalle.setFillsViewportHeight(true);
		this.jTableDatosCajaIngresoDetalle.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCajaIngresoDetalle= new GridBagLayout();
		this.jPanelAccionesCajaIngresoDetalle.setLayout(gridaBagLayoutAccionesCajaIngresoDetalle);
		
		
		/*	
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
			
		this.jPanelAccionesCajaIngresoDetalle.add(this.jButtonNuevoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCajaIngresoCajaIngresoDetalle= new GridBagLayout();
		gridaBagLayoutFK_IdCajaIngresoCajaIngresoDetalle.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCajaIngresoCajaIngresoDetalle.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCajaIngresoCajaIngresoDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCajaIngresoCajaIngresoDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCajaIngresoCajaIngresoDetalle.setLayout(gridaBagLayoutFK_IdCajaIngresoCajaIngresoDetalle);

		gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		gridBagConstraintsCajaIngresoDetalle.gridx = 0;
		jPanelFK_IdCajaIngresoCajaIngresoDetalle.add(jLabelid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle, gridBagConstraintsCajaIngresoDetalle);

		gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		gridBagConstraintsCajaIngresoDetalle.gridx = 1;
		jPanelFK_IdCajaIngresoCajaIngresoDetalle.add(jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle, gridBagConstraintsCajaIngresoDetalle);

		gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaIngresoDetalle.gridy = 1;
		gridBagConstraintsCajaIngresoDetalle.gridx =1;
		jPanelFK_IdCajaIngresoCajaIngresoDetalle.add(jButtonFK_IdCajaIngresoCajaIngresoDetalle, gridBagConstraintsCajaIngresoDetalle);

		jTabbedPaneBusquedasCajaIngresoDetalle.addTab("1.-Por Caja Ingreso ", jPanelFK_IdCajaIngresoCajaIngresoDetalle);
		jTabbedPaneBusquedasCajaIngresoDetalle.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteCajaIngresoDetalle= new GridBagLayout();
		gridaBagLayoutFK_IdClienteCajaIngresoDetalle.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteCajaIngresoDetalle.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteCajaIngresoDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteCajaIngresoDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteCajaIngresoDetalle.setLayout(gridaBagLayoutFK_IdClienteCajaIngresoDetalle);

		gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		gridBagConstraintsCajaIngresoDetalle.gridx = 0;
		jPanelFK_IdClienteCajaIngresoDetalle.add(jLabelid_clienteFK_IdClienteCajaIngresoDetalle, gridBagConstraintsCajaIngresoDetalle);

		gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		gridBagConstraintsCajaIngresoDetalle.gridx = 1;
		jPanelFK_IdClienteCajaIngresoDetalle.add(jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle, gridBagConstraintsCajaIngresoDetalle);


		gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.NONE;
		gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		gridBagConstraintsCajaIngresoDetalle.gridx = 0;
		jPanelFK_IdClienteCajaIngresoDetalle.add(this.jButtonBuscarFK_IdClienteid_clienteCajaIngresoDetalle, gridBagConstraintsCajaIngresoDetalle);

		gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaIngresoDetalle.gridy = 1;
		gridBagConstraintsCajaIngresoDetalle.gridx =1;
		jPanelFK_IdClienteCajaIngresoDetalle.add(jButtonFK_IdClienteCajaIngresoDetalle, gridBagConstraintsCajaIngresoDetalle);

		jTabbedPaneBusquedasCajaIngresoDetalle.addTab("2.-Por Cliente ", jPanelFK_IdClienteCajaIngresoDetalle);
		jTabbedPaneBusquedasCajaIngresoDetalle.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdFacturaCajaIngresoDetalle= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaCajaIngresoDetalle.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaCajaIngresoDetalle.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaCajaIngresoDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaCajaIngresoDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaCajaIngresoDetalle.setLayout(gridaBagLayoutFK_IdFacturaCajaIngresoDetalle);

		gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		gridBagConstraintsCajaIngresoDetalle.gridx = 0;
		jPanelFK_IdFacturaCajaIngresoDetalle.add(jLabelid_facturaFK_IdFacturaCajaIngresoDetalle, gridBagConstraintsCajaIngresoDetalle);

		gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		gridBagConstraintsCajaIngresoDetalle.gridx = 1;
		jPanelFK_IdFacturaCajaIngresoDetalle.add(jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle, gridBagConstraintsCajaIngresoDetalle);


		gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.NONE;
		gridBagConstraintsCajaIngresoDetalle.gridy = 0;
		gridBagConstraintsCajaIngresoDetalle.gridx = 0;
		jPanelFK_IdFacturaCajaIngresoDetalle.add(this.jButtonBuscarFK_IdFacturaid_facturaCajaIngresoDetalle, gridBagConstraintsCajaIngresoDetalle);

		gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaIngresoDetalle.gridy = 1;
		gridBagConstraintsCajaIngresoDetalle.gridx =1;
		jPanelFK_IdFacturaCajaIngresoDetalle.add(jButtonFK_IdFacturaCajaIngresoDetalle, gridBagConstraintsCajaIngresoDetalle);

		jTabbedPaneBusquedasCajaIngresoDetalle.addTab("3.-Por Factura ", jPanelFK_IdFacturaCajaIngresoDetalle);
		jTabbedPaneBusquedasCajaIngresoDetalle.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajaIngresoDetalle = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajaIngresoDetalle);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();						
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;		
			//this.gridBagConstraintsCajaIngresoDetalle.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajaIngresoDetalle.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;		
		//this.gridBagConstraintsCajaIngresoDetalle.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCajaIngresoDetalle.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCajaIngresoDetalle);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;		
			this.gridBagConstraintsCajaIngresoDetalle.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCajaIngresoDetalle.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);								
		
		
		/*
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		*/		
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajaIngresoDetalle.gridx =0;
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajaIngresoDetalle.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
				
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CajaIngresoDetalleJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCajaIngresoDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajaIngresoDetalle = new GridBagLayout();
			this.jPanelBusquedasParametrosCajaIngresoDetalle.setLayout(gridaBagLayoutBusquedasParametrosCajaIngresoDetalle);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCajaIngresoDetalle=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajaIngresoDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaIngresoDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaIngresoDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
			
			
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
			
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCajaIngresoDetalle;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCajaIngresoDetalle() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCajaIngresoDetalle = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCajaIngresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCajaIngresoDetalle.setName("jPanelReporteDinamicoCajaIngresoDetalle"); 
		
		this.jPanelReporteDinamicoCajaIngresoDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajaIngresoDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajaIngresoDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCajaIngresoDetalle.setLayout(gridaBagLayoutReporteDinamicoCajaIngresoDetalle);
		
		
		this.jInternalFrameReporteDinamicoCajaIngresoDetalle= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCajaIngresoDetalle = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajaIngresoDetalle= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setResizable(true);
	    this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setClosable(true);
	    this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCajaIngresoDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajaIngresoDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajaIngresoDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Ingreso Detalles"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCajaIngresoDetalle = new JLabelMe();

		this.jLabelColumnasSelectReporteCajaIngresoDetalle.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jLabelColumnasSelectReporteCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCajaIngresoDetalle = new JList<Reporte>();
		this.jListColumnasSelectReporteCajaIngresoDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCajaIngresoDetalle.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCajaIngresoDetalle.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajaIngresoDetalle.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajaIngresoDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCajaIngresoDetalle=new JScrollPane(this.jListColumnasSelectReporteCajaIngresoDetalle);
			
			this.jScrollColumnasSelectReporteCajaIngresoDetalle.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajaIngresoDetalle.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajaIngresoDetalle.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jListColumnasSelectReporteCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jScrollColumnasSelectReporteCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCajaIngresoDetalle = new JLabelMe();

		this.jLabelRelacionesSelectReporteCajaIngresoDetalle.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCajaIngresoDetalle = new JList<Reporte>();
		this.jListRelacionesSelectReporteCajaIngresoDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCajaIngresoDetalle.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCajaIngresoDetalle.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajaIngresoDetalle.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajaIngresoDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCajaIngresoDetalle=new JScrollPane(this.jListRelacionesSelectReporteCajaIngresoDetalle);
			
			this.jScrollRelacionesSelectReporteCajaIngresoDetalle.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajaIngresoDetalle.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajaIngresoDetalle.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCajaIngresoDetalle = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCajaIngresoDetalle = new JComboBoxMe();
		this.jListColumnasValoresGraficoCajaIngresoDetalle = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCajaIngresoDetalle = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCajaIngresoDetalle.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCajaIngresoDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajaIngresoDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajaIngresoDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCajaIngresoDetalle = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCajaIngresoDetalle.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCajaIngresoDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajaIngresoDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajaIngresoDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCajaIngresoDetalle = new JLabelMe();

		this.jLabelConGraficoDinamicoCajaIngresoDetalle.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jLabelConGraficoDinamicoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCajaIngresoDetalle = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCajaIngresoDetalle.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCajaIngresoDetalle.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCajaIngresoDetalle.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCajaIngresoDetalle.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCajaIngresoDetalle.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jCheckBoxConGraficoDinamicoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCajaIngresoDetalle = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCajaIngresoDetalle.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jLabelColumnaCategoriaGraficoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCajaIngresoDetalle = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCajaIngresoDetalle.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCajaIngresoDetalle.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCajaIngresoDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCajaIngresoDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCajaIngresoDetalle.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jComboBoxColumnaCategoriaGraficoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCajaIngresoDetalle = new JLabelMe();

		this.jLabelColumnaCategoriaValorCajaIngresoDetalle.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jLabelColumnaCategoriaValorCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCajaIngresoDetalle = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCajaIngresoDetalle.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCajaIngresoDetalle.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCajaIngresoDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCajaIngresoDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCajaIngresoDetalle.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jComboBoxColumnaCategoriaValorCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCajaIngresoDetalle = new JLabelMe();

		this.jLabelColumnasValoresGraficoCajaIngresoDetalle.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jLabelColumnasValoresGraficoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCajaIngresoDetalle = new JList<Reporte>();
		this.jListColumnasValoresGraficoCajaIngresoDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCajaIngresoDetalle.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCajaIngresoDetalle.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCajaIngresoDetalle.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCajaIngresoDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCajaIngresoDetalle=new JScrollPane(this.jListColumnasValoresGraficoCajaIngresoDetalle);
			
			this.jScrollColumnasValoresGraficoCajaIngresoDetalle.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCajaIngresoDetalle.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCajaIngresoDetalle.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jListColumnasSelectReporteCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jScrollColumnasValoresGraficoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCajaIngresoDetalle = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCajaIngresoDetalle.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jLabelTiposGraficosReportesDinamicoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCajaIngresoDetalle = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCajaIngresoDetalle.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCajaIngresoDetalle.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCajaIngresoDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCajaIngresoDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCajaIngresoDetalle.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jComboBoxTiposGraficosReportesDinamicoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCajaIngresoDetalle = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCajaIngresoDetalle.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jLabelGenerarExcelReporteDinamicoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCajaIngresoDetalle = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCajaIngresoDetalle.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCajaIngresoDetalle,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCajaIngresoDetalle.setToolTipText("Generar EXCEL"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jButtonGenerarExcelReporteDinamicoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jComboBoxTiposReportesDinamicoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCajaIngresoDetalle = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCajaIngresoDetalle.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jLabelTiposArchivoReporteDinamicoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jComboBoxTiposArchivosReportesDinamicoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCajaIngresoDetalle = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCajaIngresoDetalle.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCajaIngresoDetalle,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCajaIngresoDetalle.setToolTipText("Generar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jButtonGenerarReporteDinamicoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCajaIngresoDetalle = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCajaIngresoDetalle.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCajaIngresoDetalle,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCajaIngresoDetalle.setToolTipText("Cancelar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaIngresoDetalle.add(this.jButtonCerrarReporteDinamicoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCajaIngresoDetalle = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCajaIngresoDetalle= new JScrollPane(jPanelReporteDinamicoCajaIngresoDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCajaIngresoDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajaIngresoDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajaIngresoDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Ingreso Detalles"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCajaIngresoDetalle.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCajaIngresoDetalle);
		this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getContentPane().add(this.jScrollPanelReporteDinamicoCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCajaIngresoDetalle() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCajaIngresoDetalle = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCajaIngresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCajaIngresoDetalle.setName("jPanelImportacionCajaIngresoDetalle"); 
		
		this.jPanelImportacionCajaIngresoDetalle.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajaIngresoDetalle.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajaIngresoDetalle.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCajaIngresoDetalle.setLayout(gridaBagLayoutImportacionCajaIngresoDetalle);
		
		
		this.jInternalFrameImportacionCajaIngresoDetalle= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCajaIngresoDetalle= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCajaIngresoDetalle = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajaIngresoDetalle= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCajaIngresoDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajaIngresoDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajaIngresoDetalle.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCajaIngresoDetalle.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajaIngresoDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajaIngresoDetalle.setResizable(true);
	    this.jInternalFrameImportacionCajaIngresoDetalle.setClosable(true);
	    this.jInternalFrameImportacionCajaIngresoDetalle.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCajaIngresoDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajaIngresoDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajaIngresoDetalle.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCajaIngresoDetalle.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajaIngresoDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajaIngresoDetalle.setResizable(true);
	    this.jInternalFrameImportacionCajaIngresoDetalle.setClosable(true);
	    this.jInternalFrameImportacionCajaIngresoDetalle.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCajaIngresoDetalle.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajaIngresoDetalle.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajaIngresoDetalle.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Ingreso Detalles"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCajaIngresoDetalle = new JLabelMe();

		this.jLabelArchivoImportacionCajaIngresoDetalle.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajaIngresoDetalle.add(this.jLabelArchivoImportacionCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCajaIngresoDetalle = new JFileChooser();		
		this.jFileChooserImportacionCajaIngresoDetalle.setToolTipText("ESCOGER ARCHIVO"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCajaIngresoDetalle = new JButtonMe();
		this.jButtonAbrirImportacionCajaIngresoDetalle.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCajaIngresoDetalle,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCajaIngresoDetalle.setToolTipText("Generar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaIngresoDetalle.add(this.jButtonAbrirImportacionCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCajaIngresoDetalle = new JLabelMe();

		this.jLabelPathArchivoImportacionCajaIngresoDetalle.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCajaIngresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajaIngresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajaIngresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajaIngresoDetalle.add(this.jLabelPathArchivoImportacionCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCajaIngresoDetalle=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCajaIngresoDetalle.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajaIngresoDetalle.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajaIngresoDetalle.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaIngresoDetalle.add(this.jTextFieldPathArchivoImportacionCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCajaIngresoDetalle = new JButtonMe();
		this.jButtonGenerarImportacionCajaIngresoDetalle.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCajaIngresoDetalle,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCajaIngresoDetalle.setToolTipText("Generar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaIngresoDetalle.add(this.jButtonGenerarImportacionCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCajaIngresoDetalle = new JButtonMe();
		this.jButtonCerrarImportacionCajaIngresoDetalle.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCajaIngresoDetalle,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCajaIngresoDetalle.setToolTipText("Cancelar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaIngresoDetalle.add(this.jButtonCerrarImportacionCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCajaIngresoDetalle = new GridBagLayout();
		
		this.jScrollPanelImportacionCajaIngresoDetalle= new JScrollPane(jPanelImportacionCajaIngresoDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaIngresoDetalle.gridy =iPosYImportacion;
		this.gridBagConstraintsCajaIngresoDetalle.gridx =iPosXImportacion;
		this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCajaIngresoDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCajaIngresoDetalle.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCajaIngresoDetalle);
		this.jInternalFrameImportacionCajaIngresoDetalle.getContentPane().add(this.jScrollPanelImportacionCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCajaIngresoDetalle(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCajaIngresoDetalle = new JButtonMe();
			this.jButtonAbrirOrderByCajaIngresoDetalle.setText("Orden");
			this.jButtonAbrirOrderByCajaIngresoDetalle.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajaIngresoDetalle,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCajaIngresoDetalle";
			inputMap = this.jButtonAbrirOrderByCajaIngresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCajaIngresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCajaIngresoDetalle"));
		
		
			GridBagLayout gridaBagLayoutOrderByCajaIngresoDetalle = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCajaIngresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCajaIngresoDetalle.setName("jPanelOrderByCajaIngresoDetalle"); 
			
			this.jPanelOrderByCajaIngresoDetalle.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajaIngresoDetalle.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajaIngresoDetalle.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCajaIngresoDetalle.setLayout(gridaBagLayoutOrderByCajaIngresoDetalle);
			
			
			this.jTableDatosCajaIngresoDetalleOrderBy = new JTableMe();        
			this.jTableDatosCajaIngresoDetalleOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCajaIngresoDetalleOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCajaIngresoDetalleOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCajaIngresoDetalleOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCajaIngresoDetalleOrderBy.setViewportView(this.jTableDatosCajaIngresoDetalleOrderBy);
			this.jTableDatosCajaIngresoDetalleOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCajaIngresoDetalleOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCajaIngresoDetalle= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCajaIngresoDetalle= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCajaIngresoDetalle = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCajaIngresoDetalle= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCajaIngresoDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCajaIngresoDetalle.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCajaIngresoDetalle.setTitle("Orden");
			this.jInternalFrameOrderByCajaIngresoDetalle.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCajaIngresoDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCajaIngresoDetalle.setResizable(true);
			this.jInternalFrameOrderByCajaIngresoDetalle.setClosable(true);
			this.jInternalFrameOrderByCajaIngresoDetalle.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCajaIngresoDetalle.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajaIngresoDetalle.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajaIngresoDetalle.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCajaIngresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Ingreso Detalles"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCajaIngresoDetalle.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCajaIngresoDetalle.ipady =150;
				
			this.jPanelOrderByCajaIngresoDetalle.add(jScrollPanelDatosCajaIngresoDetalleOrderBy, this.gridBagConstraintsCajaIngresoDetalle);//this.jTableDatosCajaIngresoDetalleTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCajaIngresoDetalle = new JButtonMe();
			this.jButtonCerrarOrderByCajaIngresoDetalle.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCajaIngresoDetalle,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCajaIngresoDetalle.setToolTipText("Cancelar"+" "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCajaIngresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngresoDetalle.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCajaIngresoDetalle.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCajaIngresoDetalle.add(this.jButtonCerrarOrderByCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCajaIngresoDetalle = new GridBagLayout();
			
			this.jScrollPanelOrderByCajaIngresoDetalle= new JScrollPane(jPanelOrderByCajaIngresoDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCajaIngresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaIngresoDetalle.gridy =iPosYOrderBy;
			this.gridBagConstraintsCajaIngresoDetalle.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajaIngresoDetalle.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCajaIngresoDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCajaIngresoDetalle.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCajaIngresoDetalle);
			
			this.jInternalFrameOrderByCajaIngresoDetalle.getContentPane().add(this.jScrollPanelOrderByCajaIngresoDetalle, this.gridBagConstraintsCajaIngresoDetalle);			
		
		} else {
			this.jButtonAbrirOrderByCajaIngresoDetalle = new JButtonMe();
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
		int iWidthTableCalculado=0;//1530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cajaingresodetalleSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCajaIngresoDetalle.getRowHeight();//CajaIngresoDetalleConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CajaIngresoDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajaIngresoDetalle.isSelected()) {
					iHeightTable=CajaIngresoDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajaIngresoDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajaIngresoDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CajaIngresoDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajaIngresoDetalle.isSelected()) {
					iHeightTable=CajaIngresoDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajaIngresoDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajaIngresoDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCajaIngresoDetalle.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajaIngresoDetalle.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajaIngresoDetalle.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCajaIngresoDetalle.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajaIngresoDetalle.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajaIngresoDetalle.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCajaIngresoDetalle!=null && this.jInternalFrameOrderByCajaIngresoDetalle.getjTableDatosOrderBy()!=null) {
			//if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCajaIngresoDetalle.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCajaIngresoDetalle.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCajaIngresoDetalle.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCajaIngresoDetalle.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCajaIngresoDetalle.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCajaIngresoDetalle.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCajaIngresoDetalle.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCajaIngresoDetalle.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajaIngresoDetalle.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajaIngresoDetalle.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cajaingresodetalleLogic.getCajaIngresoDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajaingresodetalles.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CajaIngresoDetalle> TraerCajaIngresoDetalleBeans(List<CajaIngresoDetalle> cajaingresodetalles,ArrayList<Classe> classes)throws Exception {
		try {
			for(CajaIngresoDetalle cajaingresodetalle:cajaingresodetalles) {
					
				if(!(CajaIngresoDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CajaIngresoDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cajaingresodetalle.setsDetalleGeneralEntityReporte(CajaIngresoDetalleConstantesFunciones.getCajaIngresoDetalleDescripcion(cajaingresodetalle));
										
						
					
						
					
				} else  {
							
					//cajaingresodetalle.setsDetalleGeneralEntityReporte(cajaingresodetalle.getsDetalleGeneralEntityReporte());
										
				}
				
				//cajaingresodetallebeans.add(cajaingresodetallebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cajaingresodetalles;
    }
	//PARA REPORTES FIN
}
