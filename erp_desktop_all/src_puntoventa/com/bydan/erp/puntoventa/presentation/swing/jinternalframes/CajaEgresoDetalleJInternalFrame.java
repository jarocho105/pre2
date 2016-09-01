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
import com.bydan.erp.puntoventa.util.CajaEgresoDetalleConstantesFunciones;

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
public class CajaEgresoDetalleJInternalFrame extends CajaEgresoDetalleBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCajaEgresoDetalle;
	
	protected JMenuBar jmenuBarCajaEgresoDetalle;
	
	protected JMenu jmenuCajaEgresoDetalle;
	protected JMenu jmenuDatosCajaEgresoDetalle;
	protected JMenu jmenuArchivoCajaEgresoDetalle;
	protected JMenu jmenuAccionesCajaEgresoDetalle;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCajaEgresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajaEgresoDetalle;	
	protected GridBagConstraints gridBagConstraintsCajaEgresoDetalle;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CajaEgresoDetalleDetalleFormJInternalFrame jInternalFrameDetalleFormCajaEgresoDetalle;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCajaEgresoDetalle;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCajaEgresoDetalle;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CajaEgresoBeanSwingJInternalFrame cajaegresoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cajaegreso="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";
	
	public CajaEgresoDetalleSessionBean cajaegresodetalleSessionBean;
		
	
	
	public CajaEgresoSessionBean cajaegresoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CajaEgresoDetalle> cajaegresodetalles;		
	public List<CajaEgresoDetalle> cajaegresodetallesEliminados;	
	public List<CajaEgresoDetalle> cajaegresodetallesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCajaEgresoDetalle;		
	protected JButton jButtonAbrirOrderByCajaEgresoDetalle;
	
	
	//protected JPanel jPanelOrderByCajaEgresoDetalle;
	//public JScrollPane jScrollPanelOrderByCajaEgresoDetalle;	
	//protected JButton jButtonCerrarOrderByCajaEgresoDetalle;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CajaEgresoDetalleLogic cajaegresodetalleLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCajaEgresoDetalle;
	public JScrollPane jScrollPanelDatosEdicionCajaEgresoDetalle;
	public JScrollPane jScrollPanelDatosGeneralCajaEgresoDetalle;
    
	
	
	//public JScrollPane jScrollPanelDatosCajaEgresoDetalleOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCajaEgresoDetalle;
	//public JScrollPane jScrollPanelImportacionCajaEgresoDetalle;
	
	
	
	protected JPanel jPanelAccionesCajaEgresoDetalle;
	
    protected JPanel jPanelPaginacionCajaEgresoDetalle;
    protected JPanel jPanelParametrosReportesCajaEgresoDetalle;
	protected JPanel jPanelParametrosReportesAccionesCajaEgresoDetalle;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CajaEgresoDetalle;
	protected JPanel jPanelParametrosAuxiliar2CajaEgresoDetalle;
	protected JPanel jPanelParametrosAuxiliar3CajaEgresoDetalle;
	protected JPanel jPanelParametrosAuxiliar4CajaEgresoDetalle;
	//protected JPanel jPanelParametrosAuxiliar5CajaEgresoDetalle;
	
	
	
	//protected JPanel jPanelReporteDinamicoCajaEgresoDetalle;
	//protected JPanel jPanelImportacionCajaEgresoDetalle;
	
	
	public JTable jTableDatosCajaEgresoDetalle;
	
	
	
	//public JTable jTableDatosCajaEgresoDetalleOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCajaEgresoDetalle;
	protected JButton jButtonDuplicarCajaEgresoDetalle;
	protected JButton jButtonCopiarCajaEgresoDetalle;
	protected JButton jButtonVerFormCajaEgresoDetalle;
	protected JButton jButtonNuevoRelacionesCajaEgresoDetalle;
	protected JButton jButtonModificarCajaEgresoDetalle;
	
    protected JButton jButtonGuardarCambiosTablaCajaEgresoDetalle;
	protected JButton jButtonCerrarCajaEgresoDetalle;
	
	
	protected JButton jButtonRecargarInformacionCajaEgresoDetalle;
	protected JButton jButtonProcesarInformacionCajaEgresoDetalle;
	
	
	protected JButton jButtonAnterioresCajaEgresoDetalle;
	protected JButton jButtonSiguientesCajaEgresoDetalle;
	protected JButton jButtonNuevoGuardarCambiosCajaEgresoDetalle;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCajaEgresoDetalle;
	//protected JButton jButtonCerrarReporteDinamicoCajaEgresoDetalle;
	//protected JButton jButtonGenerarExcelReporteDinamicoCajaEgresoDetalle;	
	
	
	
	//protected JButton jButtonAbrirImportacionCajaEgresoDetalle;
	//protected JButton jButtonGenerarImportacionCajaEgresoDetalle;
	//protected JButton jButtonCerrarImportacionCajaEgresoDetalle;
	//protected JFileChooser jFileChooserImportacionCajaEgresoDetalle;
	//protected File fileImportacionCajaEgresoDetalle;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajaEgresoDetalle;
	protected JButton jButtonDuplicarToolBarCajaEgresoDetalle;
	protected JButton jButtonNuevoRelacionesToolBarCajaEgresoDetalle;
	
	
	public JButton jButtonGuardarCambiosToolBarCajaEgresoDetalle;
	protected JButton jButtonCopiarToolBarCajaEgresoDetalle;
	protected JButton jButtonVerFormToolBarCajaEgresoDetalle;
	public JButton jButtonGuardarCambiosTablaToolBarCajaEgresoDetalle;
	protected JButton jButtonMostrarOcultarTablaToolBarCajaEgresoDetalle;
	protected JButton jButtonCerrarToolBarCajaEgresoDetalle;
	
	protected JButton jButtonRecargarInformacionToolBarCajaEgresoDetalle;
	protected JButton jButtonProcesarInformacionToolBarCajaEgresoDetalle;
	protected JButton jButtonAnterioresToolBarCajaEgresoDetalle;
	protected JButton jButtonSiguientesToolBarCajaEgresoDetalle;
	protected JButton jButtonNuevoGuardarCambiosToolBarCajaEgresoDetalle;
	protected JButton jButtonAbrirOrderByToolBarCajaEgresoDetalle;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajaEgresoDetalle;
	protected JMenuItem jMenuItemDuplicarCajaEgresoDetalle;
	protected JMenuItem jMenuItemNuevoRelacionesCajaEgresoDetalle;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCajaEgresoDetalle;
	protected JMenuItem jMenuItemCopiarCajaEgresoDetalle;
	protected JMenuItem jMenuItemVerFormCajaEgresoDetalle;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajaEgresoDetalle;
	protected JMenuItem jMenuItemCerrarCajaEgresoDetalle;
	protected JMenuItem jMenuItemDetalleCerrarCajaEgresoDetalle;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCajaEgresoDetalle;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajaEgresoDetalle;
	
	protected JMenuItem jMenuItemRecargarInformacionCajaEgresoDetalle;
	protected JMenuItem jMenuItemProcesarInformacionCajaEgresoDetalle;
	protected JMenuItem jMenuItemAnterioresCajaEgresoDetalle;
	protected JMenuItem jMenuItemSiguientesCajaEgresoDetalle;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajaEgresoDetalle;
	protected JMenuItem jMenuItemAbrirOrderByCajaEgresoDetalle;
	protected JMenuItem jMenuItemMostrarOcultarCajaEgresoDetalle;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajaEgresoDetalle;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCajaEgresoDetalle;
	protected JCheckBox jCheckBoxSeleccionadosCajaEgresoDetalle;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCajaEgresoDetalle;
	protected JCheckBox jCheckBoxConGraficoReporteCajaEgresoDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCajaEgresoDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCajaEgresoDetalle;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCajaEgresoDetalle;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCajaEgresoDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCajaEgresoDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCajaEgresoDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajaEgresoDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajaEgresoDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCajaEgresoDetalle;
	protected JTextField jTextFieldValorCampoGeneralCajaEgresoDetalle;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCajaEgresoDetalle;
	//public JList<Reporte> jListColumnasSelectReporteCajaEgresoDetalle;
	//public JScrollPane jScrollColumnasSelectReporteCajaEgresoDetalle;
	
	//public JLabel jLabelRelacionesSelectReporteCajaEgresoDetalle;
	//public JList<Reporte> jListRelacionesSelectReporteCajaEgresoDetalle;
	//public JScrollPane jScrollRelacionesSelectReporteCajaEgresoDetalle;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCajaEgresoDetalle;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCajaEgresoDetalle;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCajaEgresoDetalle;
	//public JLabel jLabelTiposArchivoReporteDinamicoCajaEgresoDetalle;
	
		
	//public JLabel jLabelArchivoImportacionCajaEgresoDetalle;	
	//public JLabel jLabelPathArchivoImportacionCajaEgresoDetalle;
	//protected JTextField jTextFieldPathArchivoImportacionCajaEgresoDetalle;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCajaEgresoDetalle;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCajaEgresoDetalle;
	
	//public JLabel jLabelColumnaCategoriaValorCajaEgresoDetalle;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCajaEgresoDetalle;
	
	//public JLabel jLabelColumnasValoresGraficoCajaEgresoDetalle;
	//public JList<Reporte> jListColumnasValoresGraficoCajaEgresoDetalle;
	//public JScrollPane jScrollColumnasValoresGraficoCajaEgresoDetalle;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCajaEgresoDetalle;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCajaEgresoDetalle;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCajaEgresoDetalle;
	public JPanel jPanelFK_IdCajaEgresoCajaEgresoDetalle;
	public JButton jButtonFK_IdCajaEgresoCajaEgresoDetalle;
	public JPanel jPanelFK_IdClienteCajaEgresoDetalle;
	public JButton jButtonFK_IdClienteCajaEgresoDetalle;
	public JPanel jPanelFK_IdFacturaCajaEgresoDetalle;
	public JButton jButtonFK_IdFacturaCajaEgresoDetalle;
	
	public JPanel jPanelid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle;
	public JLabel jLabelid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle;
	public JButton jButtonid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle= new JButtonMe();
	public JButton jButtonid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalleUpdate= new JButtonMe();
	public JButton jButtonid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteCajaEgresoDetalle;
	public JLabel jLabelid_clienteFK_IdClienteCajaEgresoDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle;
	public JButton jButtonid_clienteFK_IdClienteCajaEgresoDetalle= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteCajaEgresoDetalleUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteCajaEgresoDetalleBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteCajaEgresoDetalle;
	
	public JPanel jPanelid_facturaFK_IdFacturaCajaEgresoDetalle;
	public JLabel jLabelid_facturaFK_IdFacturaCajaEgresoDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle;
	public JButton jButtonid_facturaFK_IdFacturaCajaEgresoDetalle= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaCajaEgresoDetalleUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaCajaEgresoDetalleBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaCajaEgresoDetalle;
	
	
	
	
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
	public CajaEgresoDetalleJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CajaEgresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaEgresoDetalleJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaEgresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaEgresoDetalleJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaEgresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaEgresoDetalleJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CajaEgresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCajaEgresoDetalle)	{
		this.jButtonRecargarInformacionCajaEgresoDetalle = jButtonRecargarInformacionCajaEgresoDetalle;
	}
	
	public JButton getjButtonProcesarInformacionCajaEgresoDetalle() {
		return this.jButtonProcesarInformacionCajaEgresoDetalle;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajaEgresoDetalle)	{
		this.jButtonProcesarInformacionCajaEgresoDetalle = jButtonProcesarInformacionCajaEgresoDetalle;
	}
	
	
	public JButton getjButtonRecargarInformacionCajaEgresoDetalle() {
		return this.jButtonRecargarInformacionCajaEgresoDetalle;
	}
	
	
	public List<CajaEgresoDetalle> getcajaegresodetalles() {
		return this.cajaegresodetalles;
	}

	public void setcajaegresodetalles(List<CajaEgresoDetalle> cajaegresodetalles) {
		this.cajaegresodetalles = cajaegresodetalles;
	}
	
	public List<CajaEgresoDetalle> getcajaegresodetallesAux() {
		return this.cajaegresodetallesAux;
	}

	public void setcajaegresodetallesAux(List<CajaEgresoDetalle> cajaegresodetallesAux) {
		this.cajaegresodetallesAux = cajaegresodetallesAux;
	}
	
	public List<CajaEgresoDetalle> getcajaegresodetallesEliminados() {
		return this.cajaegresodetallesEliminados;
	}

	public void setCajaEgresoDetallesEliminados(List<CajaEgresoDetalle> cajaegresodetallesEliminados) {
		this.cajaegresodetallesEliminados = cajaegresodetallesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCajaEgresoDetalle() {
		return jComboBoxTiposSeleccionarCajaEgresoDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCajaEgresoDetalle(
			JComboBox jComboBoxTiposSeleccionarCajaEgresoDetalle) {
		this.jComboBoxTiposSeleccionarCajaEgresoDetalle = jComboBoxTiposSeleccionarCajaEgresoDetalle;
	}
	
	public void setBorderResaltarTiposSeleccionarCajaEgresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCajaEgresoDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCajaEgresoDetalle .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCajaEgresoDetalle() {
		return jTextFieldValorCampoGeneralCajaEgresoDetalle;
	}

	public void setjTextFieldValorCampoGeneralCajaEgresoDetalle(
			JTextField jTextFieldValorCampoGeneralCajaEgresoDetalle) {
		this.jTextFieldValorCampoGeneralCajaEgresoDetalle = jTextFieldValorCampoGeneralCajaEgresoDetalle;
	}

	public void setBorderResaltarValorCampoGeneralCajaEgresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgresoDetalle.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCajaEgresoDetalle .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCajaEgresoDetalle() {
		return this.jCheckBoxSeleccionarTodosCajaEgresoDetalle;
	}

	public void setjCheckBoxSeleccionarTodosCajaEgresoDetalle(
			JCheckBox jCheckBoxSeleccionarTodosCajaEgresoDetalle) {
		this.jCheckBoxSeleccionarTodosCajaEgresoDetalle = jCheckBoxSeleccionarTodosCajaEgresoDetalle;
	}

	public void setBorderResaltarSeleccionarTodosCajaEgresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgresoDetalle.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCajaEgresoDetalle .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCajaEgresoDetalle() {
		return this.jCheckBoxSeleccionadosCajaEgresoDetalle;
	}

	public void setjCheckBoxSeleccionadosCajaEgresoDetalle(
			JCheckBox jCheckBoxSeleccionadosCajaEgresoDetalle) {
		this.jCheckBoxSeleccionadosCajaEgresoDetalle = jCheckBoxSeleccionadosCajaEgresoDetalle;
	}
	
	public void setBorderResaltarSeleccionadosCajaEgresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgresoDetalle.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCajaEgresoDetalle .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCajaEgresoDetalle() {
		return this.jComboBoxTiposArchivosReportesCajaEgresoDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCajaEgresoDetalle(
			JComboBox jComboBoxTiposArchivosReportesCajaEgresoDetalle) {
		this.jComboBoxTiposArchivosReportesCajaEgresoDetalle = jComboBoxTiposArchivosReportesCajaEgresoDetalle;
	}

	public void setBorderResaltarTiposArchivosReportesCajaEgresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgresoDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCajaEgresoDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCajaEgresoDetalle() {
		return this.jComboBoxTiposReportesCajaEgresoDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCajaEgresoDetalle(
			JComboBox jComboBoxTiposReportesCajaEgresoDetalle) {
		this.jComboBoxTiposReportesCajaEgresoDetalle = jComboBoxTiposReportesCajaEgresoDetalle;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCajaEgresoDetalle() {
	//	return jComboBoxTiposReportesDinamicoCajaEgresoDetalle;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCajaEgresoDetalle(
	//		JComboBox jComboBoxTiposReportesDinamicoCajaEgresoDetalle) {
	//	this.jComboBoxTiposReportesDinamicoCajaEgresoDetalle = jComboBoxTiposReportesDinamicoCajaEgresoDetalle;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCajaEgresoDetalle() {
	//	return jComboBoxTiposArchivosReportesDinamicoCajaEgresoDetalle;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCajaEgresoDetalle(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCajaEgresoDetalle) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCajaEgresoDetalle = jComboBoxTiposArchivosReportesDinamicoCajaEgresoDetalle;
	//}
	
	public void setBorderResaltarTiposReportesCajaEgresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgresoDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCajaEgresoDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCajaEgresoDetalle() {
		return this.jComboBoxTiposGraficosReportesCajaEgresoDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCajaEgresoDetalle(
			JComboBox jComboBoxTiposGraficosReportesCajaEgresoDetalle) {
		this.jComboBoxTiposGraficosReportesCajaEgresoDetalle = jComboBoxTiposGraficosReportesCajaEgresoDetalle;
	}
	
	public void setBorderResaltarTiposGraficosReportesCajaEgresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgresoDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCajaEgresoDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCajaEgresoDetalle() {
		return this.jComboBoxTiposPaginacionCajaEgresoDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCajaEgresoDetalle(
			JComboBox jComboBoxTiposPaginacionCajaEgresoDetalle) {
		this.jComboBoxTiposPaginacionCajaEgresoDetalle = jComboBoxTiposPaginacionCajaEgresoDetalle;
	}
	
	public void setBorderResaltarTiposPaginacionCajaEgresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgresoDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCajaEgresoDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCajaEgresoDetalle() {
		return this.jComboBoxTiposRelacionesCajaEgresoDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajaEgresoDetalle() {
		return this.jComboBoxTiposAccionesCajaEgresoDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajaEgresoDetalle(
			JComboBox jComboBoxTiposRelacionesCajaEgresoDetalle) {
		this.jComboBoxTiposRelacionesCajaEgresoDetalle = jComboBoxTiposRelacionesCajaEgresoDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajaEgresoDetalle(
			JComboBox jComboBoxTiposAccionesCajaEgresoDetalle) {
		this.jComboBoxTiposAccionesCajaEgresoDetalle = jComboBoxTiposAccionesCajaEgresoDetalle;
	}
	
	public void setBorderResaltarTiposRelacionesCajaEgresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgresoDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCajaEgresoDetalle .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCajaEgresoDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaEgresoDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCajaEgresoDetalle .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCajaEgresoDetalle() {
	//	return jCheckBoxConGraficoDinamicoCajaEgresoDetalle;
	//}

	//public void setjCheckBoxConGraficoDinamicoCajaEgresoDetalle(
	//		JCheckBox jCheckBoxConGraficoDinamicoCajaEgresoDetalle) {
	//	this.jCheckBoxConGraficoDinamicoCajaEgresoDetalle = jCheckBoxConGraficoDinamicoCajaEgresoDetalle;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCajaEgresoDetalle() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCajaEgresoDetalle.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCajaEgresoDetalle .setBorder(borderResaltar);		
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
		this.cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
		
		this.cajaegresodetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajaegresodetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajaegresodetalleSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CajaEgresoDetalleJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CajaEgresoDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajaEgresoDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajaEgresoDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajaEgresoDetalleJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caja Egreso Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
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
		
		CajaEgresoDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CajaEgresoDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCajaEgresoDetalle= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCajaEgresoDetalle,this.jTtoolBarCajaEgresoDetalle,
							"nuevo","nuevo","Nuevo"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCajaEgresoDetalle,this.jTtoolBarCajaEgresoDetalle,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCajaEgresoDetalle,this.jTtoolBarCajaEgresoDetalle,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCajaEgresoDetalle,this.jTtoolBarCajaEgresoDetalle,
							"duplicar","duplicar","Duplicar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCajaEgresoDetalle,this.jTtoolBarCajaEgresoDetalle,
							"copiar","copiar","Copiar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCajaEgresoDetalle,this.jTtoolBarCajaEgresoDetalle,
							"ver_form","ver_form","Ver"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaEgresoDetalle,this.jTtoolBarCajaEgresoDetalle,
							"recargar","recargar","Recargar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaEgresoDetalle,this.jTtoolBarCajaEgresoDetalle,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaEgresoDetalle,this.jTtoolBarCajaEgresoDetalle,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCajaEgresoDetalle,this.jTtoolBarCajaEgresoDetalle,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCajaEgresoDetalle,this.jTtoolBarCajaEgresoDetalle,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCajaEgresoDetalle,this.jTtoolBarCajaEgresoDetalle,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCajaEgresoDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCajaEgresoDetalle,this.jTtoolBarCajaEgresoDetalle,
							"cerrar","cerrar","Salir"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCajaEgresoDetalle=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCajaEgresoDetalle;
			
				this.jButtonProcesarInformacionToolBarCajaEgresoDetalle=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCajaEgresoDetalle;
				
		//protected JButton jButtonModificarToolBarCajaEgresoDetalle;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCajaEgresoDetalle=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCajaEgresoDetalle=new JMenuMe("General");
		this.jmenuArchivoCajaEgresoDetalle=new JMenuMe("Archivo");
		this.jmenuAccionesCajaEgresoDetalle=new JMenuMe("Acciones");
		this.jmenuDatosCajaEgresoDetalle=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajaEgresoDetalle= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajaEgresoDetalle.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajaEgresoDetalle,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCajaEgresoDetalle= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCajaEgresoDetalle.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCajaEgresoDetalle,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCajaEgresoDetalle= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCajaEgresoDetalle.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCajaEgresoDetalle,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCajaEgresoDetalle= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajaEgresoDetalle.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajaEgresoDetalle,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCajaEgresoDetalle= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCajaEgresoDetalle.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCajaEgresoDetalle,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCajaEgresoDetalle= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCajaEgresoDetalle.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCajaEgresoDetalle,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCajaEgresoDetalle= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCajaEgresoDetalle.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCajaEgresoDetalle,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajaEgresoDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajaEgresoDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajaEgresoDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCajaEgresoDetalle= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCajaEgresoDetalle.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCajaEgresoDetalle,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCajaEgresoDetalle= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCajaEgresoDetalle.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCajaEgresoDetalle,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCajaEgresoDetalle= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCajaEgresoDetalle.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCajaEgresoDetalle,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCajaEgresoDetalle= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCajaEgresoDetalle.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCajaEgresoDetalle,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCajaEgresoDetalle= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCajaEgresoDetalle.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCajaEgresoDetalle,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajaEgresoDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajaEgresoDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajaEgresoDetalle,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCajaEgresoDetalle= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCajaEgresoDetalle.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCajaEgresoDetalle,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajaEgresoDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajaEgresoDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajaEgresoDetalle,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCajaEgresoDetalle= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCajaEgresoDetalle.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCajaEgresoDetalle,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCajaEgresoDetalle.add(this.jMenuItemCerrarCajaEgresoDetalle);
			
			this.jmenuAccionesCajaEgresoDetalle.add(this.jMenuItemNuevoCajaEgresoDetalle);
			this.jmenuAccionesCajaEgresoDetalle.add(this.jMenuItemNuevoGuardarCambiosCajaEgresoDetalle);
			this.jmenuAccionesCajaEgresoDetalle.add(this.jMenuItemNuevoRelacionesCajaEgresoDetalle);
			this.jmenuAccionesCajaEgresoDetalle.add(this.jMenuItemGuardarCambiosTablaCajaEgresoDetalle);		
			this.jmenuAccionesCajaEgresoDetalle.add(this.jMenuItemDuplicarCajaEgresoDetalle);		
			this.jmenuAccionesCajaEgresoDetalle.add(this.jMenuItemCopiarCajaEgresoDetalle);		
			this.jmenuAccionesCajaEgresoDetalle.add(this.jMenuItemVerFormCajaEgresoDetalle);		
			
			this.jmenuDatosCajaEgresoDetalle.add(this.jMenuItemRecargarInformacionCajaEgresoDetalle);				
			this.jmenuDatosCajaEgresoDetalle.add(this.jMenuItemAnterioresCajaEgresoDetalle);				
			this.jmenuDatosCajaEgresoDetalle.add(this.jMenuItemSiguientesCajaEgresoDetalle);				
			this.jmenuDatosCajaEgresoDetalle.add(this.jMenuItemAbrirOrderByCajaEgresoDetalle);				
			this.jmenuDatosCajaEgresoDetalle.add(this.jMenuItemMostrarOcultarCajaEgresoDetalle);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCajaEgresoDetalle.add(this.jMenuItemGuardarCambiosCajaEgresoDetalle);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCajaEgresoDetalle.add(this.jmenuArchivoCajaEgresoDetalle);		
			this.jmenuBarCajaEgresoDetalle.add(this.jmenuAccionesCajaEgresoDetalle);		
			this.jmenuBarCajaEgresoDetalle.add(this.jmenuDatosCajaEgresoDetalle);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCajaEgresoDetalle);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCajaEgresoDetalle() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCajaEgresoCajaEgresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCajaEgresoCajaEgresoDetalle.setToolTipText("Buscar Por Caja Egreso ");
		this.jButtonFK_IdCajaEgresoCajaEgresoDetalle= new JButtonMe();
		this.jButtonFK_IdCajaEgresoCajaEgresoDetalle.setText("Buscar");
		this.jButtonFK_IdCajaEgresoCajaEgresoDetalle.setToolTipText("Buscar Por Caja Egreso ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCajaEgresoCajaEgresoDetalle,"buscar_button","Buscar Por Caja Egreso ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCajaEgresoCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle = new JLabelMe();
		jLabelid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.setText("Caja Egreso :");
		jLabelid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.setToolTipText("Caja Egreso");
		jLabelid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle= new JComboBoxMe();
		jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteCajaEgresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteCajaEgresoDetalle.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteCajaEgresoDetalle= new JButtonMe();
		this.jButtonFK_IdClienteCajaEgresoDetalle.setText("Buscar");
		this.jButtonFK_IdClienteCajaEgresoDetalle.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteCajaEgresoDetalle,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteCajaEgresoDetalle = new JLabelMe();
		jLabelid_clienteFK_IdClienteCajaEgresoDetalle.setText("Cliente :");
		jLabelid_clienteFK_IdClienteCajaEgresoDetalle.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteCajaEgresoDetalle= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteCajaEgresoDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteCajaEgresoDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteCajaEgresoDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteCajaEgresoDetalle.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteCajaEgresoDetalle.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteCajaEgresoDetalle.setFocusable(false);

		this.jPanelFK_IdFacturaCajaEgresoDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaCajaEgresoDetalle.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaCajaEgresoDetalle= new JButtonMe();
		this.jButtonFK_IdFacturaCajaEgresoDetalle.setText("Buscar");
		this.jButtonFK_IdFacturaCajaEgresoDetalle.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaCajaEgresoDetalle,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaCajaEgresoDetalle = new JLabelMe();
		jLabelid_facturaFK_IdFacturaCajaEgresoDetalle.setText("Factura :");
		jLabelid_facturaFK_IdFacturaCajaEgresoDetalle.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaCajaEgresoDetalle= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaCajaEgresoDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaCajaEgresoDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaCajaEgresoDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaCajaEgresoDetalle.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaCajaEgresoDetalle.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaCajaEgresoDetalle.setFocusable(false);


		this.jTabbedPaneBusquedasCajaEgresoDetalle=new JTabbedPane();


		this.jTabbedPaneBusquedasCajaEgresoDetalle.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCajaEgresoDetalle.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCajaEgresoDetalle.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCajaEgresoDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCajaEgresoDetalle = new CajaEgresoDetalleDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Caja Egreso Detalle DATOS");
			this.jInternalFrameDetalleFormCajaEgresoDetalle = new CajaEgresoDetalleDetalleFormJInternalFrame(jDesktopPane,this.cajaegresodetalleSessionBean.getConGuardarRelaciones(),this.cajaegresodetalleSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCajaEgresoDetalle = null;//new CajaEgresoDetalleDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajaEgresoDetalle= new GridBagLayout();
		
		
		this.jTableDatosCajaEgresoDetalle = new JTableMe();      
		
		String sToolTipCajaEgresoDetalle="";
		sToolTipCajaEgresoDetalle=CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajaEgresoDetalle+="(PuntoVenta.CajaEgresoDetalle)";
		}
		
		if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajaEgresoDetalle+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCajaEgresoDetalle.setToolTipText(sToolTipCajaEgresoDetalle);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCajaEgresoDetalle);
		this.jTableDatosCajaEgresoDetalle.setAutoCreateRowSorter(true);
		this.jTableDatosCajaEgresoDetalle.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCajaEgresoDetalle.setRowSelectionAllowed(true);
		this.jTableDatosCajaEgresoDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCajaEgresoDetalle,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCajaEgresoDetalle = new JButtonMe();
		this.jButtonDuplicarCajaEgresoDetalle = new JButtonMe();
		this.jButtonCopiarCajaEgresoDetalle = new JButtonMe();
		this.jButtonVerFormCajaEgresoDetalle = new JButtonMe();
		this.jButtonNuevoRelacionesCajaEgresoDetalle = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCajaEgresoDetalle = new JButtonMe();
		this.jButtonCerrarCajaEgresoDetalle = new JButtonMe();
		
		this.jScrollPanelDatosCajaEgresoDetalle = new JScrollPane();   
        this.jScrollPanelDatosGeneralCajaEgresoDetalle = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCajaEgresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Caja Egreso Detalle";
		
		if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Egreso Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatosCajaEgresoDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajaEgresoDetalle.setToolTipText("Acciones");
        this.jPanelAccionesCajaEgresoDetalle.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCajaEgresoDetalle=new ReporteDinamicoJInternalFrame(CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCajaEgresoDetalle();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCajaEgresoDetalle=new ImportacionJInternalFrame(CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCajaEgresoDetalle();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCajaEgresoDetalle = new JButtonMe();
		
		this.jButtonAbrirOrderByCajaEgresoDetalle.setText("Orden");
		this.jButtonAbrirOrderByCajaEgresoDetalle.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajaEgresoDetalle,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCajaEgresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajaEgresoDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaEgresoDetalle,false,this);
			
			//this.cargarOrderByCajaEgresoDetalle(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajaEgresoDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaEgresoDetalle,true,this);
			
			//this.cargarOrderByCajaEgresoDetalle(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCajaEgresoDetalle.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosCajaEgresoDetalle.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosCajaEgresoDetalle.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosCajaEgresoDetalle.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajaEgresoDetalle.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajaEgresoDetalle.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCajaEgresoDetalle.setText("Nuevo");
		this.jButtonDuplicarCajaEgresoDetalle.setText("Duplicar");
		this.jButtonCopiarCajaEgresoDetalle.setText("Copiar");
		this.jButtonVerFormCajaEgresoDetalle.setText("Ver");
		this.jButtonNuevoRelacionesCajaEgresoDetalle.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCajaEgresoDetalle.setText("Guardar");
		this.jButtonCerrarCajaEgresoDetalle.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajaEgresoDetalle,"nuevo_button","Nuevo",this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCajaEgresoDetalle,"duplicar_button","Duplicar",this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCajaEgresoDetalle,"copiar_button","Copiar",this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCajaEgresoDetalle,"ver_form","Ver",this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCajaEgresoDetalle,"nuevorelaciones_button","Nuevo Rel",this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajaEgresoDetalle,"guardarcambiostabla_button","Guardar",this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajaEgresoDetalle,"cerrar_button","Salir",this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCajaEgresoDetalle.setToolTipText("Nuevo"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCajaEgresoDetalle.setToolTipText("Duplicar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCajaEgresoDetalle.setToolTipText("Copiar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCajaEgresoDetalle.setToolTipText("Ver"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCajaEgresoDetalle.setToolTipText("Nuevo Rel"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCajaEgresoDetalle.setToolTipText("Guardar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajaEgresoDetalle.setToolTipText("Salir"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajaEgresoDetalle";
		inputMap = this.jButtonNuevoCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajaEgresoDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajaEgresoDetalle"));
		
		//DUPLICAR
		sMapKey = "DuplicarCajaEgresoDetalle";
		inputMap = this.jButtonDuplicarCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCajaEgresoDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCajaEgresoDetalle"));
		
		//COPIAR
		sMapKey = "CopiarCajaEgresoDetalle";
		inputMap = this.jButtonCopiarCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCajaEgresoDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCajaEgresoDetalle"));
		
		//VEr FORM
		sMapKey = "VerFormCajaEgresoDetalle";
		inputMap = this.jButtonVerFormCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCajaEgresoDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCajaEgresoDetalle"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCajaEgresoDetalle";
		inputMap = this.jButtonNuevoRelacionesCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCajaEgresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCajaEgresoDetalle"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCajaEgresoDetalle";
		inputMap = this.jButtonModificarCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCajaEgresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCajaEgresoDetalle"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCajaEgresoDetalle";
		inputMap = this.jButtonCerrarCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajaEgresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajaEgresoDetalle"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajaEgresoDetalle";
		inputMap = this.jButtonGuardarCambiosTablaCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajaEgresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajaEgresoDetalle"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCajaEgresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCajaEgresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCajaEgresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CajaEgresoDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CajaEgresoDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CajaEgresoDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CajaEgresoDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CajaEgresoDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCajaEgresoDetalle.setName("jPanelParametrosReportesCajaEgresoDetalle"); 
		
		this.jPanelParametrosReportesAccionesCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCajaEgresoDetalle.setName("jPanelParametrosReportesAccionesCajaEgresoDetalle"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCajaEgresoDetalle = new JButtonMe();
		this.jButtonRecargarInformacionCajaEgresoDetalle.setText("Recargar");
		this.jButtonRecargarInformacionCajaEgresoDetalle.setToolTipText("Recargar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCajaEgresoDetalle,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCajaEgresoDetalle = new JButtonMe();
		this.jButtonProcesarInformacionCajaEgresoDetalle.setText("Procesar");
		this.jButtonProcesarInformacionCajaEgresoDetalle.setToolTipText("Procesar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCajaEgresoDetalle.setVisible(false);
			
		this.jButtonProcesarInformacionCajaEgresoDetalle.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajaEgresoDetalle.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajaEgresoDetalle.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCajaEgresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaEgresoDetalle.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCajaEgresoDetalle.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCajaEgresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaEgresoDetalle.setText("TIPO");       
		this.jComboBoxTiposReportesCajaEgresoDetalle.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCajaEgresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaEgresoDetalle.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCajaEgresoDetalle.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCajaEgresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCajaEgresoDetalle.setText("Paginacion");
		this.jComboBoxTiposPaginacionCajaEgresoDetalle.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCajaEgresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCajaEgresoDetalle.setText("Accion");
		this.jComboBoxTiposRelacionesCajaEgresoDetalle.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCajaEgresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajaEgresoDetalle.setText("Accion");
		this.jComboBoxTiposAccionesCajaEgresoDetalle.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCajaEgresoDetalle = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCajaEgresoDetalle.setText("Accion");
		this.jComboBoxTiposSeleccionarCajaEgresoDetalle.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCajaEgresoDetalle=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCajaEgresoDetalle.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajaEgresoDetalle.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajaEgresoDetalle.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCajaEgresoDetalle = new JLabelMe();
		
		this.jLabelAccionesCajaEgresoDetalle.setText("Acciones");		
		this.jLabelAccionesCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCajaEgresoDetalle = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCajaEgresoDetalle.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCajaEgresoDetalle.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCajaEgresoDetalle = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCajaEgresoDetalle.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCajaEgresoDetalle.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCajaEgresoDetalle = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCajaEgresoDetalle.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCajaEgresoDetalle.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCajaEgresoDetalle = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCajaEgresoDetalle.setText("Graf.");
		this.jCheckBoxConGraficoReporteCajaEgresoDetalle.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCajaEgresoDetalle = new JButtonMe();
		//this.jButtonAnterioresCajaEgresoDetalle.setText("<<");
        this.jButtonAnterioresCajaEgresoDetalle.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCajaEgresoDetalle,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCajaEgresoDetalle = new JButtonMe();
		//this.jButtonSiguientesCajaEgresoDetalle.setText(">>");
        this.jButtonSiguientesCajaEgresoDetalle.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCajaEgresoDetalle,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCajaEgresoDetalle = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCajaEgresoDetalle.setText("Nue");
        this.jButtonNuevoGuardarCambiosCajaEgresoDetalle.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCajaEgresoDetalle,"nuevoguardarcambios_button","Nue",this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCajaEgresoDetalle";
		inputMap = this.jButtonNuevoGuardarCambiosCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCajaEgresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCajaEgresoDetalle"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCajaEgresoDetalle";
		inputMap = this.jButtonRecargarInformacionCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCajaEgresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCajaEgresoDetalle"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCajaEgresoDetalle";
		inputMap = this.jButtonSiguientesCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCajaEgresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCajaEgresoDetalle"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCajaEgresoDetalle";
		inputMap = this.jButtonAnterioresCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCajaEgresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCajaEgresoDetalle"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCajaEgresoDetalle();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCajaEgresoDetalle.setMinimumSize(new Dimension(this.getWidth(),CajaEgresoDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaEgresoDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajaEgresoDetalle.setMaximumSize(new Dimension(this.getWidth(),CajaEgresoDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaEgresoDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajaEgresoDetalle.setPreferredSize(new Dimension(this.getWidth(),CajaEgresoDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaEgresoDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCajaEgresoDetalle = new GridBagLayout();

			this.jPanelPaginacionCajaEgresoDetalle.setLayout(gridaBagLayoutPaginacionCajaEgresoDetalle);						
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCajaEgresoDetalle.add(this.jButtonAnterioresCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
					
						
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
			
			this.jPanelPaginacionCajaEgresoDetalle.add(this.jButtonNuevoGuardarCambiosCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
						
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
			this.jPanelPaginacionCajaEgresoDetalle.add(this.jButtonSiguientesCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = 1;
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaEgresoDetalle.add(this.jButtonNuevoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
						
			
			
			if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
				this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCajaEgresoDetalle.gridy = 1;
				this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCajaEgresoDetalle.add(this.jButtonGuardarCambiosTablaCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
			}
			
			
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = 1;
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaEgresoDetalle.add(this.jButtonDuplicarCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = 1;
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaEgresoDetalle.add(this.jButtonCopiarCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = 1;
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaEgresoDetalle.add(this.jButtonVerFormCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = 1;
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCajaEgresoDetalle.add(this.jButtonCerrarCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
		
		
		this.jButtonRecargarInformacionCajaEgresoDetalle.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajaEgresoDetalle.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajaEgresoDetalle.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCajaEgresoDetalle.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajaEgresoDetalle.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajaEgresoDetalle.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCajaEgresoDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajaEgresoDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajaEgresoDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCajaEgresoDetalle.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajaEgresoDetalle.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajaEgresoDetalle.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCajaEgresoDetalle.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajaEgresoDetalle.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajaEgresoDetalle.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCajaEgresoDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajaEgresoDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajaEgresoDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCajaEgresoDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaEgresoDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaEgresoDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCajaEgresoDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajaEgresoDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajaEgresoDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCajaEgresoDetalle.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajaEgresoDetalle.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajaEgresoDetalle.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCajaEgresoDetalle.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajaEgresoDetalle.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajaEgresoDetalle.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCajaEgresoDetalle.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajaEgresoDetalle.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajaEgresoDetalle.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCajaEgresoDetalle.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajaEgresoDetalle.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajaEgresoDetalle.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCajaEgresoDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCajaEgresoDetalle = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CajaEgresoDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CajaEgresoDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CajaEgresoDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CajaEgresoDetalle = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCajaEgresoDetalle.setLayout(gridaBagParametrosReportesCajaEgresoDetalle);
			this.jPanelParametrosReportesAccionesCajaEgresoDetalle.setLayout(gridaBagParametrosReportesAccionesCajaEgresoDetalle);
			
			
			this.jPanelParametrosAuxiliar1CajaEgresoDetalle.setLayout(gridaBagParametrosAuxiliar1CajaEgresoDetalle);
			this.jPanelParametrosAuxiliar2CajaEgresoDetalle.setLayout(gridaBagParametrosAuxiliar2CajaEgresoDetalle);
			this.jPanelParametrosAuxiliar3CajaEgresoDetalle.setLayout(gridaBagParametrosAuxiliar3CajaEgresoDetalle);
			this.jPanelParametrosAuxiliar4CajaEgresoDetalle.setLayout(gridaBagParametrosAuxiliar4CajaEgresoDetalle);
			//this.jPanelParametrosAuxiliar5CajaEgresoDetalle.setLayout(gridaBagParametrosAuxiliar2CajaEgresoDetalle);			
			
			
			
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaEgresoDetalle.add(this.jButtonRecargarInformacionCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaEgresoDetalle.add(this.jComboBoxTiposPaginacionCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaEgresoDetalle.add(this.jCheckBoxConAltoMaximoTablaCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaEgresoDetalle.add(this.jComboBoxTiposArchivosReportesCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaEgresoDetalle.add(this.jPanelParametrosAuxiliar1CajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgresoDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CajaEgresoDetalle.add(this.jComboBoxTiposReportesCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);																		
			
			
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgresoDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CajaEgresoDetalle.add(this.jComboBoxTiposGraficosReportesCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaEgresoDetalle.add(this.jPanelParametrosAuxiliar4CajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaEgresoDetalle.add(this.jComboBoxTiposReportesCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaEgresoDetalle.add(this.jCheckBoxGenerarReporteCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaEgresoDetalle.add(this.jPanelParametrosAuxiliar2CajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgresoDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaEgresoDetalle.add(this.jLabelAccionesCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
				this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCajaEgresoDetalle.add(this.jButtonAbrirOrderByCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaEgresoDetalle.add(this.jComboBoxTiposSeleccionarCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);			
			
			
			/*
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgresoDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaEgresoDetalle.add(this.jCheckBoxSeleccionarTodosCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgresoDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaEgresoDetalle.add(this.jCheckBoxConGraficoReporteCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgresoDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaEgresoDetalle.add(this.jCheckBoxSeleccionarTodosCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);															
				
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgresoDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaEgresoDetalle.add(this.jCheckBoxSeleccionadosCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);															
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaEgresoDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaEgresoDetalle.add(this.jCheckBoxConGraficoReporteCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaEgresoDetalle.add(this.jPanelParametrosAuxiliar3CajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaEgresoDetalle.add(this.jComboBoxTiposAccionesCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
	
				
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaEgresoDetalle.add(this.jTextFieldValorCampoGeneralCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCajaEgresoDetalle = new GridBagLayout();

			this.jScrollPanelDatosCajaEgresoDetalle.setLayout(gridaBagLayoutDatosCajaEgresoDetalle);
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
			this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
			
			this.jScrollPanelDatosCajaEgresoDetalle.add(this.jTableDatosCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCajaEgresoDetalle.setViewportView(this.jTableDatosCajaEgresoDetalle);
		this.jTableDatosCajaEgresoDetalle.setFillsViewportHeight(true);
		this.jTableDatosCajaEgresoDetalle.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCajaEgresoDetalle= new GridBagLayout();
		this.jPanelAccionesCajaEgresoDetalle.setLayout(gridaBagLayoutAccionesCajaEgresoDetalle);
		
		
		/*	
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
			
		this.jPanelAccionesCajaEgresoDetalle.add(this.jButtonNuevoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCajaEgresoCajaEgresoDetalle= new GridBagLayout();
		gridaBagLayoutFK_IdCajaEgresoCajaEgresoDetalle.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCajaEgresoCajaEgresoDetalle.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCajaEgresoCajaEgresoDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCajaEgresoCajaEgresoDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCajaEgresoCajaEgresoDetalle.setLayout(gridaBagLayoutFK_IdCajaEgresoCajaEgresoDetalle);

		gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		gridBagConstraintsCajaEgresoDetalle.gridx = 0;
		jPanelFK_IdCajaEgresoCajaEgresoDetalle.add(jLabelid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle, gridBagConstraintsCajaEgresoDetalle);

		gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		gridBagConstraintsCajaEgresoDetalle.gridx = 1;
		jPanelFK_IdCajaEgresoCajaEgresoDetalle.add(jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle, gridBagConstraintsCajaEgresoDetalle);

		gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaEgresoDetalle.gridy = 1;
		gridBagConstraintsCajaEgresoDetalle.gridx =1;
		jPanelFK_IdCajaEgresoCajaEgresoDetalle.add(jButtonFK_IdCajaEgresoCajaEgresoDetalle, gridBagConstraintsCajaEgresoDetalle);

		jTabbedPaneBusquedasCajaEgresoDetalle.addTab("1.-Por Caja Egreso ", jPanelFK_IdCajaEgresoCajaEgresoDetalle);
		jTabbedPaneBusquedasCajaEgresoDetalle.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteCajaEgresoDetalle= new GridBagLayout();
		gridaBagLayoutFK_IdClienteCajaEgresoDetalle.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteCajaEgresoDetalle.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteCajaEgresoDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteCajaEgresoDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteCajaEgresoDetalle.setLayout(gridaBagLayoutFK_IdClienteCajaEgresoDetalle);

		gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		gridBagConstraintsCajaEgresoDetalle.gridx = 0;
		jPanelFK_IdClienteCajaEgresoDetalle.add(jLabelid_clienteFK_IdClienteCajaEgresoDetalle, gridBagConstraintsCajaEgresoDetalle);

		gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		gridBagConstraintsCajaEgresoDetalle.gridx = 1;
		jPanelFK_IdClienteCajaEgresoDetalle.add(jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle, gridBagConstraintsCajaEgresoDetalle);


		gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.NONE;
		gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		gridBagConstraintsCajaEgresoDetalle.gridx = 0;
		jPanelFK_IdClienteCajaEgresoDetalle.add(this.jButtonBuscarFK_IdClienteid_clienteCajaEgresoDetalle, gridBagConstraintsCajaEgresoDetalle);

		gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaEgresoDetalle.gridy = 1;
		gridBagConstraintsCajaEgresoDetalle.gridx =1;
		jPanelFK_IdClienteCajaEgresoDetalle.add(jButtonFK_IdClienteCajaEgresoDetalle, gridBagConstraintsCajaEgresoDetalle);

		jTabbedPaneBusquedasCajaEgresoDetalle.addTab("2.-Por Cliente ", jPanelFK_IdClienteCajaEgresoDetalle);
		jTabbedPaneBusquedasCajaEgresoDetalle.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdFacturaCajaEgresoDetalle= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaCajaEgresoDetalle.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaCajaEgresoDetalle.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaCajaEgresoDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaCajaEgresoDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaCajaEgresoDetalle.setLayout(gridaBagLayoutFK_IdFacturaCajaEgresoDetalle);

		gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		gridBagConstraintsCajaEgresoDetalle.gridx = 0;
		jPanelFK_IdFacturaCajaEgresoDetalle.add(jLabelid_facturaFK_IdFacturaCajaEgresoDetalle, gridBagConstraintsCajaEgresoDetalle);

		gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		gridBagConstraintsCajaEgresoDetalle.gridx = 1;
		jPanelFK_IdFacturaCajaEgresoDetalle.add(jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle, gridBagConstraintsCajaEgresoDetalle);


		gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.NONE;
		gridBagConstraintsCajaEgresoDetalle.gridy = 0;
		gridBagConstraintsCajaEgresoDetalle.gridx = 0;
		jPanelFK_IdFacturaCajaEgresoDetalle.add(this.jButtonBuscarFK_IdFacturaid_facturaCajaEgresoDetalle, gridBagConstraintsCajaEgresoDetalle);

		gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaEgresoDetalle.gridy = 1;
		gridBagConstraintsCajaEgresoDetalle.gridx =1;
		jPanelFK_IdFacturaCajaEgresoDetalle.add(jButtonFK_IdFacturaCajaEgresoDetalle, gridBagConstraintsCajaEgresoDetalle);

		jTabbedPaneBusquedasCajaEgresoDetalle.addTab("3.-Por Factura ", jPanelFK_IdFacturaCajaEgresoDetalle);
		jTabbedPaneBusquedasCajaEgresoDetalle.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajaEgresoDetalle = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajaEgresoDetalle);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();						
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;		
			//this.gridBagConstraintsCajaEgresoDetalle.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajaEgresoDetalle.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;		
		//this.gridBagConstraintsCajaEgresoDetalle.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCajaEgresoDetalle.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCajaEgresoDetalle);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;		
			this.gridBagConstraintsCajaEgresoDetalle.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCajaEgresoDetalle.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);								
		
		
		/*
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		*/		
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajaEgresoDetalle.gridx =0;
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajaEgresoDetalle.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
				
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CajaEgresoDetalleJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCajaEgresoDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajaEgresoDetalle = new GridBagLayout();
			this.jPanelBusquedasParametrosCajaEgresoDetalle.setLayout(gridaBagLayoutBusquedasParametrosCajaEgresoDetalle);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCajaEgresoDetalle=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajaEgresoDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaEgresoDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaEgresoDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
			
			
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
			
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCajaEgresoDetalle;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCajaEgresoDetalle() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCajaEgresoDetalle = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCajaEgresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCajaEgresoDetalle.setName("jPanelReporteDinamicoCajaEgresoDetalle"); 
		
		this.jPanelReporteDinamicoCajaEgresoDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajaEgresoDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajaEgresoDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCajaEgresoDetalle.setLayout(gridaBagLayoutReporteDinamicoCajaEgresoDetalle);
		
		
		this.jInternalFrameReporteDinamicoCajaEgresoDetalle= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCajaEgresoDetalle = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajaEgresoDetalle= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setResizable(true);
	    this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setClosable(true);
	    this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCajaEgresoDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajaEgresoDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajaEgresoDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Egreso Detalles"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCajaEgresoDetalle = new JLabelMe();

		this.jLabelColumnasSelectReporteCajaEgresoDetalle.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jLabelColumnasSelectReporteCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCajaEgresoDetalle = new JList<Reporte>();
		this.jListColumnasSelectReporteCajaEgresoDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCajaEgresoDetalle.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCajaEgresoDetalle.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajaEgresoDetalle.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajaEgresoDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCajaEgresoDetalle=new JScrollPane(this.jListColumnasSelectReporteCajaEgresoDetalle);
			
			this.jScrollColumnasSelectReporteCajaEgresoDetalle.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajaEgresoDetalle.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajaEgresoDetalle.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jListColumnasSelectReporteCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jScrollColumnasSelectReporteCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCajaEgresoDetalle = new JLabelMe();

		this.jLabelRelacionesSelectReporteCajaEgresoDetalle.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCajaEgresoDetalle = new JList<Reporte>();
		this.jListRelacionesSelectReporteCajaEgresoDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCajaEgresoDetalle.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCajaEgresoDetalle.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajaEgresoDetalle.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajaEgresoDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCajaEgresoDetalle=new JScrollPane(this.jListRelacionesSelectReporteCajaEgresoDetalle);
			
			this.jScrollRelacionesSelectReporteCajaEgresoDetalle.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajaEgresoDetalle.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajaEgresoDetalle.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCajaEgresoDetalle = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCajaEgresoDetalle = new JComboBoxMe();
		this.jListColumnasValoresGraficoCajaEgresoDetalle = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCajaEgresoDetalle = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCajaEgresoDetalle.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCajaEgresoDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajaEgresoDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajaEgresoDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCajaEgresoDetalle = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCajaEgresoDetalle.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCajaEgresoDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajaEgresoDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajaEgresoDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCajaEgresoDetalle = new JLabelMe();

		this.jLabelConGraficoDinamicoCajaEgresoDetalle.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jLabelConGraficoDinamicoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCajaEgresoDetalle = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCajaEgresoDetalle.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCajaEgresoDetalle.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCajaEgresoDetalle.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCajaEgresoDetalle.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCajaEgresoDetalle.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jCheckBoxConGraficoDinamicoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCajaEgresoDetalle = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCajaEgresoDetalle.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jLabelColumnaCategoriaGraficoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCajaEgresoDetalle = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCajaEgresoDetalle.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCajaEgresoDetalle.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCajaEgresoDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCajaEgresoDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCajaEgresoDetalle.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jComboBoxColumnaCategoriaGraficoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCajaEgresoDetalle = new JLabelMe();

		this.jLabelColumnaCategoriaValorCajaEgresoDetalle.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jLabelColumnaCategoriaValorCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCajaEgresoDetalle = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCajaEgresoDetalle.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCajaEgresoDetalle.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCajaEgresoDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCajaEgresoDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCajaEgresoDetalle.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jComboBoxColumnaCategoriaValorCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCajaEgresoDetalle = new JLabelMe();

		this.jLabelColumnasValoresGraficoCajaEgresoDetalle.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jLabelColumnasValoresGraficoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCajaEgresoDetalle = new JList<Reporte>();
		this.jListColumnasValoresGraficoCajaEgresoDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCajaEgresoDetalle.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCajaEgresoDetalle.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCajaEgresoDetalle.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCajaEgresoDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCajaEgresoDetalle=new JScrollPane(this.jListColumnasValoresGraficoCajaEgresoDetalle);
			
			this.jScrollColumnasValoresGraficoCajaEgresoDetalle.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCajaEgresoDetalle.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCajaEgresoDetalle.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jListColumnasSelectReporteCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jScrollColumnasValoresGraficoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCajaEgresoDetalle = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCajaEgresoDetalle.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jLabelTiposGraficosReportesDinamicoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCajaEgresoDetalle = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCajaEgresoDetalle.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCajaEgresoDetalle.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCajaEgresoDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCajaEgresoDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCajaEgresoDetalle.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jComboBoxTiposGraficosReportesDinamicoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCajaEgresoDetalle = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCajaEgresoDetalle.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jLabelGenerarExcelReporteDinamicoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCajaEgresoDetalle = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCajaEgresoDetalle.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCajaEgresoDetalle,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCajaEgresoDetalle.setToolTipText("Generar EXCEL"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jButtonGenerarExcelReporteDinamicoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jComboBoxTiposReportesDinamicoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCajaEgresoDetalle = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCajaEgresoDetalle.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jLabelTiposArchivoReporteDinamicoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jComboBoxTiposArchivosReportesDinamicoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCajaEgresoDetalle = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCajaEgresoDetalle.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCajaEgresoDetalle,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCajaEgresoDetalle.setToolTipText("Generar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jButtonGenerarReporteDinamicoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCajaEgresoDetalle = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCajaEgresoDetalle.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCajaEgresoDetalle,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCajaEgresoDetalle.setToolTipText("Cancelar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaEgresoDetalle.add(this.jButtonCerrarReporteDinamicoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCajaEgresoDetalle = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCajaEgresoDetalle= new JScrollPane(jPanelReporteDinamicoCajaEgresoDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCajaEgresoDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajaEgresoDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajaEgresoDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Egreso Detalles"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCajaEgresoDetalle.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCajaEgresoDetalle);
		this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getContentPane().add(this.jScrollPanelReporteDinamicoCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCajaEgresoDetalle() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCajaEgresoDetalle = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCajaEgresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCajaEgresoDetalle.setName("jPanelImportacionCajaEgresoDetalle"); 
		
		this.jPanelImportacionCajaEgresoDetalle.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajaEgresoDetalle.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajaEgresoDetalle.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCajaEgresoDetalle.setLayout(gridaBagLayoutImportacionCajaEgresoDetalle);
		
		
		this.jInternalFrameImportacionCajaEgresoDetalle= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCajaEgresoDetalle= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCajaEgresoDetalle = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajaEgresoDetalle= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCajaEgresoDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajaEgresoDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajaEgresoDetalle.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCajaEgresoDetalle.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajaEgresoDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajaEgresoDetalle.setResizable(true);
	    this.jInternalFrameImportacionCajaEgresoDetalle.setClosable(true);
	    this.jInternalFrameImportacionCajaEgresoDetalle.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCajaEgresoDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajaEgresoDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajaEgresoDetalle.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCajaEgresoDetalle.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajaEgresoDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajaEgresoDetalle.setResizable(true);
	    this.jInternalFrameImportacionCajaEgresoDetalle.setClosable(true);
	    this.jInternalFrameImportacionCajaEgresoDetalle.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCajaEgresoDetalle.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajaEgresoDetalle.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajaEgresoDetalle.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Egreso Detalles"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCajaEgresoDetalle = new JLabelMe();

		this.jLabelArchivoImportacionCajaEgresoDetalle.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajaEgresoDetalle.add(this.jLabelArchivoImportacionCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCajaEgresoDetalle = new JFileChooser();		
		this.jFileChooserImportacionCajaEgresoDetalle.setToolTipText("ESCOGER ARCHIVO"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCajaEgresoDetalle = new JButtonMe();
		this.jButtonAbrirImportacionCajaEgresoDetalle.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCajaEgresoDetalle,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCajaEgresoDetalle.setToolTipText("Generar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaEgresoDetalle.add(this.jButtonAbrirImportacionCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCajaEgresoDetalle = new JLabelMe();

		this.jLabelPathArchivoImportacionCajaEgresoDetalle.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCajaEgresoDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajaEgresoDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajaEgresoDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajaEgresoDetalle.add(this.jLabelPathArchivoImportacionCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCajaEgresoDetalle=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCajaEgresoDetalle.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajaEgresoDetalle.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajaEgresoDetalle.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaEgresoDetalle.add(this.jTextFieldPathArchivoImportacionCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCajaEgresoDetalle = new JButtonMe();
		this.jButtonGenerarImportacionCajaEgresoDetalle.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCajaEgresoDetalle,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCajaEgresoDetalle.setToolTipText("Generar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaEgresoDetalle.add(this.jButtonGenerarImportacionCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCajaEgresoDetalle = new JButtonMe();
		this.jButtonCerrarImportacionCajaEgresoDetalle.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCajaEgresoDetalle,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCajaEgresoDetalle.setToolTipText("Cancelar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaEgresoDetalle.add(this.jButtonCerrarImportacionCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCajaEgresoDetalle = new GridBagLayout();
		
		this.jScrollPanelImportacionCajaEgresoDetalle= new JScrollPane(jPanelImportacionCajaEgresoDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
		this.gridBagConstraintsCajaEgresoDetalle.gridy =iPosYImportacion;
		this.gridBagConstraintsCajaEgresoDetalle.gridx =iPosXImportacion;
		this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCajaEgresoDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCajaEgresoDetalle.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCajaEgresoDetalle);
		this.jInternalFrameImportacionCajaEgresoDetalle.getContentPane().add(this.jScrollPanelImportacionCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCajaEgresoDetalle(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCajaEgresoDetalle = new JButtonMe();
			this.jButtonAbrirOrderByCajaEgresoDetalle.setText("Orden");
			this.jButtonAbrirOrderByCajaEgresoDetalle.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajaEgresoDetalle,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCajaEgresoDetalle";
			inputMap = this.jButtonAbrirOrderByCajaEgresoDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCajaEgresoDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCajaEgresoDetalle"));
		
		
			GridBagLayout gridaBagLayoutOrderByCajaEgresoDetalle = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCajaEgresoDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCajaEgresoDetalle.setName("jPanelOrderByCajaEgresoDetalle"); 
			
			this.jPanelOrderByCajaEgresoDetalle.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajaEgresoDetalle.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajaEgresoDetalle.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCajaEgresoDetalle.setLayout(gridaBagLayoutOrderByCajaEgresoDetalle);
			
			
			this.jTableDatosCajaEgresoDetalleOrderBy = new JTableMe();        
			this.jTableDatosCajaEgresoDetalleOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCajaEgresoDetalleOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCajaEgresoDetalleOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCajaEgresoDetalleOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCajaEgresoDetalleOrderBy.setViewportView(this.jTableDatosCajaEgresoDetalleOrderBy);
			this.jTableDatosCajaEgresoDetalleOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCajaEgresoDetalleOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCajaEgresoDetalle= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCajaEgresoDetalle= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCajaEgresoDetalle = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCajaEgresoDetalle= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCajaEgresoDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCajaEgresoDetalle.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCajaEgresoDetalle.setTitle("Orden");
			this.jInternalFrameOrderByCajaEgresoDetalle.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCajaEgresoDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCajaEgresoDetalle.setResizable(true);
			this.jInternalFrameOrderByCajaEgresoDetalle.setClosable(true);
			this.jInternalFrameOrderByCajaEgresoDetalle.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCajaEgresoDetalle.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajaEgresoDetalle.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajaEgresoDetalle.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCajaEgresoDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Egreso Detalles"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCajaEgresoDetalle.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCajaEgresoDetalle.ipady =150;
				
			this.jPanelOrderByCajaEgresoDetalle.add(jScrollPanelDatosCajaEgresoDetalleOrderBy, this.gridBagConstraintsCajaEgresoDetalle);//this.jTableDatosCajaEgresoDetalleTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCajaEgresoDetalle = new JButtonMe();
			this.jButtonCerrarOrderByCajaEgresoDetalle.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCajaEgresoDetalle,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCajaEgresoDetalle.setToolTipText("Cancelar"+" "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCajaEgresoDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgresoDetalle.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCajaEgresoDetalle.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCajaEgresoDetalle.add(this.jButtonCerrarOrderByCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCajaEgresoDetalle = new GridBagLayout();
			
			this.jScrollPanelOrderByCajaEgresoDetalle= new JScrollPane(jPanelOrderByCajaEgresoDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCajaEgresoDetalle = new GridBagConstraints();
			this.gridBagConstraintsCajaEgresoDetalle.gridy =iPosYOrderBy;
			this.gridBagConstraintsCajaEgresoDetalle.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajaEgresoDetalle.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCajaEgresoDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCajaEgresoDetalle.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCajaEgresoDetalle);
			
			this.jInternalFrameOrderByCajaEgresoDetalle.getContentPane().add(this.jScrollPanelOrderByCajaEgresoDetalle, this.gridBagConstraintsCajaEgresoDetalle);			
		
		} else {
			this.jButtonAbrirOrderByCajaEgresoDetalle = new JButtonMe();
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
			&& this.cajaegresodetalleSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCajaEgresoDetalle.getRowHeight();//CajaEgresoDetalleConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CajaEgresoDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajaEgresoDetalle.isSelected()) {
					iHeightTable=CajaEgresoDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajaEgresoDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajaEgresoDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CajaEgresoDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajaEgresoDetalle.isSelected()) {
					iHeightTable=CajaEgresoDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajaEgresoDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajaEgresoDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCajaEgresoDetalle.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajaEgresoDetalle.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajaEgresoDetalle.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCajaEgresoDetalle.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajaEgresoDetalle.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajaEgresoDetalle.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCajaEgresoDetalle!=null && this.jInternalFrameOrderByCajaEgresoDetalle.getjTableDatosOrderBy()!=null) {
			//if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCajaEgresoDetalle.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCajaEgresoDetalle.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCajaEgresoDetalle.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCajaEgresoDetalle.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCajaEgresoDetalle.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCajaEgresoDetalle.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCajaEgresoDetalle.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCajaEgresoDetalle.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajaEgresoDetalle.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajaEgresoDetalle.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cajaegresodetalleLogic.getCajaEgresoDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajaegresodetalles.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CajaEgresoDetalle> TraerCajaEgresoDetalleBeans(List<CajaEgresoDetalle> cajaegresodetalles,ArrayList<Classe> classes)throws Exception {
		try {
			for(CajaEgresoDetalle cajaegresodetalle:cajaegresodetalles) {
					
				if(!(CajaEgresoDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CajaEgresoDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cajaegresodetalle.setsDetalleGeneralEntityReporte(CajaEgresoDetalleConstantesFunciones.getCajaEgresoDetalleDescripcion(cajaegresodetalle));
										
						
					
						
					
				} else  {
							
					//cajaegresodetalle.setsDetalleGeneralEntityReporte(cajaegresodetalle.getsDetalleGeneralEntityReporte());
										
				}
				
				//cajaegresodetallebeans.add(cajaegresodetallebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cajaegresodetalles;
    }
	//PARA REPORTES FIN
}
