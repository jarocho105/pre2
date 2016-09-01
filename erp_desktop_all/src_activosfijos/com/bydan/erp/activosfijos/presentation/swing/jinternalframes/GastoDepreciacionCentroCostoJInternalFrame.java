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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
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
import com.bydan.erp.activosfijos.util.GastoDepreciacionCentroCostoConstantesFunciones;

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
public class GastoDepreciacionCentroCostoJInternalFrame extends GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarGastoDepreciacionCentroCosto;
	
	protected JMenuBar jmenuBarGastoDepreciacionCentroCosto;
	
	protected JMenu jmenuGastoDepreciacionCentroCosto;
	protected JMenu jmenuDatosGastoDepreciacionCentroCosto;
	protected JMenu jmenuArchivoGastoDepreciacionCentroCosto;
	protected JMenu jmenuAccionesGastoDepreciacionCentroCosto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosGastoDepreciacionCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGastoDepreciacionCentroCosto;	
	protected GridBagConstraints gridBagConstraintsGastoDepreciacionCentroCosto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public GastoDepreciacionCentroCostoDetalleFormJInternalFrame jInternalFrameDetalleFormGastoDepreciacionCentroCosto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionGastoDepreciacionCentroCosto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public GastoDepreciacionCentroCostoSessionBean gastodepreciacioncentrocostoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostos;		
	public List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosEliminados;	
	public List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByGastoDepreciacionCentroCosto;		
	protected JButton jButtonAbrirOrderByGastoDepreciacionCentroCosto;
	
	
	//protected JPanel jPanelOrderByGastoDepreciacionCentroCosto;
	//public JScrollPane jScrollPanelOrderByGastoDepreciacionCentroCosto;	
	//protected JButton jButtonCerrarOrderByGastoDepreciacionCentroCosto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public GastoDepreciacionCentroCostoLogic gastodepreciacioncentrocostoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosGastoDepreciacionCentroCosto;
	public JScrollPane jScrollPanelDatosEdicionGastoDepreciacionCentroCosto;
	public JScrollPane jScrollPanelDatosGeneralGastoDepreciacionCentroCosto;
    
	
	
	//public JScrollPane jScrollPanelDatosGastoDepreciacionCentroCostoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoGastoDepreciacionCentroCosto;
	//public JScrollPane jScrollPanelImportacionGastoDepreciacionCentroCosto;
	
	
	
	protected JPanel jPanelAccionesGastoDepreciacionCentroCosto;
	
    protected JPanel jPanelPaginacionGastoDepreciacionCentroCosto;
    protected JPanel jPanelParametrosReportesGastoDepreciacionCentroCosto;
	protected JPanel jPanelParametrosReportesAccionesGastoDepreciacionCentroCosto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1GastoDepreciacionCentroCosto;
	protected JPanel jPanelParametrosAuxiliar2GastoDepreciacionCentroCosto;
	protected JPanel jPanelParametrosAuxiliar3GastoDepreciacionCentroCosto;
	protected JPanel jPanelParametrosAuxiliar4GastoDepreciacionCentroCosto;
	//protected JPanel jPanelParametrosAuxiliar5GastoDepreciacionCentroCosto;
	
	
	
	//protected JPanel jPanelReporteDinamicoGastoDepreciacionCentroCosto;
	//protected JPanel jPanelImportacionGastoDepreciacionCentroCosto;
	
	
	public JTable jTableDatosGastoDepreciacionCentroCosto;
	
	
	
	//public JTable jTableDatosGastoDepreciacionCentroCostoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoGastoDepreciacionCentroCosto;
	protected JButton jButtonDuplicarGastoDepreciacionCentroCosto;
	protected JButton jButtonCopiarGastoDepreciacionCentroCosto;
	protected JButton jButtonVerFormGastoDepreciacionCentroCosto;
	protected JButton jButtonNuevoRelacionesGastoDepreciacionCentroCosto;
	protected JButton jButtonModificarGastoDepreciacionCentroCosto;
	
    protected JButton jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto;
	protected JButton jButtonCerrarGastoDepreciacionCentroCosto;
	
	
	protected JButton jButtonRecargarInformacionGastoDepreciacionCentroCosto;
	protected JButton jButtonProcesarInformacionGastoDepreciacionCentroCosto;
	
	
	protected JButton jButtonAnterioresGastoDepreciacionCentroCosto;
	protected JButton jButtonSiguientesGastoDepreciacionCentroCosto;
	protected JButton jButtonNuevoGuardarCambiosGastoDepreciacionCentroCosto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoGastoDepreciacionCentroCosto;
	//protected JButton jButtonCerrarReporteDinamicoGastoDepreciacionCentroCosto;
	//protected JButton jButtonGenerarExcelReporteDinamicoGastoDepreciacionCentroCosto;	
	
	
	
	//protected JButton jButtonAbrirImportacionGastoDepreciacionCentroCosto;
	//protected JButton jButtonGenerarImportacionGastoDepreciacionCentroCosto;
	//protected JButton jButtonCerrarImportacionGastoDepreciacionCentroCosto;
	//protected JFileChooser jFileChooserImportacionGastoDepreciacionCentroCosto;
	//protected File fileImportacionGastoDepreciacionCentroCosto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonDuplicarToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonNuevoRelacionesToolBarGastoDepreciacionCentroCosto;
	
	
	public JButton jButtonGuardarCambiosToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonCopiarToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonVerFormToolBarGastoDepreciacionCentroCosto;
	public JButton jButtonGuardarCambiosTablaToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonMostrarOcultarTablaToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonCerrarToolBarGastoDepreciacionCentroCosto;
	
	protected JButton jButtonRecargarInformacionToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonProcesarInformacionToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonAnterioresToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonSiguientesToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonNuevoGuardarCambiosToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonAbrirOrderByToolBarGastoDepreciacionCentroCosto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemDuplicarGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemNuevoRelacionesGastoDepreciacionCentroCosto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemCopiarGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemVerFormGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemGuardarCambiosTablaGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemCerrarGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemDetalleCerrarGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemDetalleMostarOcultarGastoDepreciacionCentroCosto;
	
	protected JMenuItem jMenuItemRecargarInformacionGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemProcesarInformacionGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemAnterioresGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemSiguientesGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemAbrirOrderByGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemMostrarOcultarGastoDepreciacionCentroCosto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGastoDepreciacionCentroCosto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto;
	protected JCheckBox jCheckBoxSeleccionadosGastoDepreciacionCentroCosto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaGastoDepreciacionCentroCosto;
	protected JCheckBox jCheckBoxConGraficoReporteGastoDepreciacionCentroCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesGastoDepreciacionCentroCosto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoGastoDepreciacionCentroCosto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoGastoDepreciacionCentroCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionGastoDepreciacionCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGastoDepreciacionCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGastoDepreciacionCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto;
	protected JTextField jTextFieldValorCampoGeneralGastoDepreciacionCentroCosto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteGastoDepreciacionCentroCosto;
	//public JList<Reporte> jListColumnasSelectReporteGastoDepreciacionCentroCosto;
	//public JScrollPane jScrollColumnasSelectReporteGastoDepreciacionCentroCosto;
	
	//public JLabel jLabelRelacionesSelectReporteGastoDepreciacionCentroCosto;
	//public JList<Reporte> jListRelacionesSelectReporteGastoDepreciacionCentroCosto;
	//public JScrollPane jScrollRelacionesSelectReporteGastoDepreciacionCentroCosto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoGastoDepreciacionCentroCosto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoGastoDepreciacionCentroCosto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoGastoDepreciacionCentroCosto;
	//public JLabel jLabelTiposArchivoReporteDinamicoGastoDepreciacionCentroCosto;
	
		
	//public JLabel jLabelArchivoImportacionGastoDepreciacionCentroCosto;	
	//public JLabel jLabelPathArchivoImportacionGastoDepreciacionCentroCosto;
	//protected JTextField jTextFieldPathArchivoImportacionGastoDepreciacionCentroCosto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoGastoDepreciacionCentroCosto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoGastoDepreciacionCentroCosto;
	
	//public JLabel jLabelColumnaCategoriaValorGastoDepreciacionCentroCosto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorGastoDepreciacionCentroCosto;
	
	//public JLabel jLabelColumnasValoresGraficoGastoDepreciacionCentroCosto;
	//public JList<Reporte> jListColumnasValoresGraficoGastoDepreciacionCentroCosto;
	//public JScrollPane jScrollColumnasValoresGraficoGastoDepreciacionCentroCosto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoGastoDepreciacionCentroCosto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoGastoDepreciacionCentroCosto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasGastoDepreciacionCentroCosto;
	public JPanel jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto;
	public JButton jButtonFK_IdCentroCostoGastoDepreciacionCentroCosto;
	public JPanel jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto;
	public JButton jButtonFK_IdCuentaContableGastoDepreciacionCentroCosto;
	public JPanel jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto;
	public JButton jButtonFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto;
	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto;
	public JButton jButtonid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCostoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCostoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoGastoDepreciacionCentroCosto;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCostoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCostoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableGastoDepreciacionCentroCosto;
	
	public JPanel jPanelid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto;
	public JLabel jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto;
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCostoBusqueda= new JButtonMe();

	
	
	
	
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
	public GastoDepreciacionCentroCostoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("GastoDepreciacionCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoDepreciacionCentroCostoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GastoDepreciacionCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoDepreciacionCentroCostoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GastoDepreciacionCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoDepreciacionCentroCostoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GastoDepreciacionCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionGastoDepreciacionCentroCosto)	{
		this.jButtonRecargarInformacionGastoDepreciacionCentroCosto = jButtonRecargarInformacionGastoDepreciacionCentroCosto;
	}
	
	public JButton getjButtonProcesarInformacionGastoDepreciacionCentroCosto() {
		return this.jButtonProcesarInformacionGastoDepreciacionCentroCosto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGastoDepreciacionCentroCosto)	{
		this.jButtonProcesarInformacionGastoDepreciacionCentroCosto = jButtonProcesarInformacionGastoDepreciacionCentroCosto;
	}
	
	
	public JButton getjButtonRecargarInformacionGastoDepreciacionCentroCosto() {
		return this.jButtonRecargarInformacionGastoDepreciacionCentroCosto;
	}
	
	
	public List<GastoDepreciacionCentroCosto> getgastodepreciacioncentrocostos() {
		return this.gastodepreciacioncentrocostos;
	}

	public void setgastodepreciacioncentrocostos(List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostos) {
		this.gastodepreciacioncentrocostos = gastodepreciacioncentrocostos;
	}
	
	public List<GastoDepreciacionCentroCosto> getgastodepreciacioncentrocostosAux() {
		return this.gastodepreciacioncentrocostosAux;
	}

	public void setgastodepreciacioncentrocostosAux(List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosAux) {
		this.gastodepreciacioncentrocostosAux = gastodepreciacioncentrocostosAux;
	}
	
	public List<GastoDepreciacionCentroCosto> getgastodepreciacioncentrocostosEliminados() {
		return this.gastodepreciacioncentrocostosEliminados;
	}

	public void setGastoDepreciacionCentroCostosEliminados(List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosEliminados) {
		this.gastodepreciacioncentrocostosEliminados = gastodepreciacioncentrocostosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarGastoDepreciacionCentroCosto() {
		return jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarGastoDepreciacionCentroCosto(
			JComboBox jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto) {
		this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto = jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto;
	}
	
	public void setBorderResaltarTiposSeleccionarGastoDepreciacionCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarGastoDepreciacionCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralGastoDepreciacionCentroCosto() {
		return jTextFieldValorCampoGeneralGastoDepreciacionCentroCosto;
	}

	public void setjTextFieldValorCampoGeneralGastoDepreciacionCentroCosto(
			JTextField jTextFieldValorCampoGeneralGastoDepreciacionCentroCosto) {
		this.jTextFieldValorCampoGeneralGastoDepreciacionCentroCosto = jTextFieldValorCampoGeneralGastoDepreciacionCentroCosto;
	}

	public void setBorderResaltarValorCampoGeneralGastoDepreciacionCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacionCentroCosto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralGastoDepreciacionCentroCosto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto() {
		return this.jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto;
	}

	public void setjCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto(
			JCheckBox jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto) {
		this.jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto = jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto;
	}

	public void setBorderResaltarSeleccionarTodosGastoDepreciacionCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacionCentroCosto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosGastoDepreciacionCentroCosto() {
		return this.jCheckBoxSeleccionadosGastoDepreciacionCentroCosto;
	}

	public void setjCheckBoxSeleccionadosGastoDepreciacionCentroCosto(
			JCheckBox jCheckBoxSeleccionadosGastoDepreciacionCentroCosto) {
		this.jCheckBoxSeleccionadosGastoDepreciacionCentroCosto = jCheckBoxSeleccionadosGastoDepreciacionCentroCosto;
	}
	
	public void setBorderResaltarSeleccionadosGastoDepreciacionCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacionCentroCosto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosGastoDepreciacionCentroCosto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto() {
		return this.jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto(
			JComboBox jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto) {
		this.jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto = jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto;
	}

	public void setBorderResaltarTiposArchivosReportesGastoDepreciacionCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacionCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesGastoDepreciacionCentroCosto() {
		return this.jComboBoxTiposReportesGastoDepreciacionCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesGastoDepreciacionCentroCosto(
			JComboBox jComboBoxTiposReportesGastoDepreciacionCentroCosto) {
		this.jComboBoxTiposReportesGastoDepreciacionCentroCosto = jComboBoxTiposReportesGastoDepreciacionCentroCosto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoGastoDepreciacionCentroCosto() {
	//	return jComboBoxTiposReportesDinamicoGastoDepreciacionCentroCosto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoGastoDepreciacionCentroCosto(
	//		JComboBox jComboBoxTiposReportesDinamicoGastoDepreciacionCentroCosto) {
	//	this.jComboBoxTiposReportesDinamicoGastoDepreciacionCentroCosto = jComboBoxTiposReportesDinamicoGastoDepreciacionCentroCosto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoGastoDepreciacionCentroCosto() {
	//	return jComboBoxTiposArchivosReportesDinamicoGastoDepreciacionCentroCosto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoGastoDepreciacionCentroCosto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoGastoDepreciacionCentroCosto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoGastoDepreciacionCentroCosto = jComboBoxTiposArchivosReportesDinamicoGastoDepreciacionCentroCosto;
	//}
	
	public void setBorderResaltarTiposReportesGastoDepreciacionCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacionCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesGastoDepreciacionCentroCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto() {
		return this.jComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto(
			JComboBox jComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto) {
		this.jComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto = jComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto;
	}
	
	public void setBorderResaltarTiposGraficosReportesGastoDepreciacionCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacionCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionGastoDepreciacionCentroCosto() {
		return this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionGastoDepreciacionCentroCosto(
			JComboBox jComboBoxTiposPaginacionGastoDepreciacionCentroCosto) {
		this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto = jComboBoxTiposPaginacionGastoDepreciacionCentroCosto;
	}
	
	public void setBorderResaltarTiposPaginacionGastoDepreciacionCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacionCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesGastoDepreciacionCentroCosto() {
		return this.jComboBoxTiposRelacionesGastoDepreciacionCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGastoDepreciacionCentroCosto() {
		return this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGastoDepreciacionCentroCosto(
			JComboBox jComboBoxTiposRelacionesGastoDepreciacionCentroCosto) {
		this.jComboBoxTiposRelacionesGastoDepreciacionCentroCosto = jComboBoxTiposRelacionesGastoDepreciacionCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGastoDepreciacionCentroCosto(
			JComboBox jComboBoxTiposAccionesGastoDepreciacionCentroCosto) {
		this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto = jComboBoxTiposAccionesGastoDepreciacionCentroCosto;
	}
	
	public void setBorderResaltarTiposRelacionesGastoDepreciacionCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacionCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesGastoDepreciacionCentroCosto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesGastoDepreciacionCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacionCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoGastoDepreciacionCentroCosto() {
	//	return jCheckBoxConGraficoDinamicoGastoDepreciacionCentroCosto;
	//}

	//public void setjCheckBoxConGraficoDinamicoGastoDepreciacionCentroCosto(
	//		JCheckBox jCheckBoxConGraficoDinamicoGastoDepreciacionCentroCosto) {
	//	this.jCheckBoxConGraficoDinamicoGastoDepreciacionCentroCosto = jCheckBoxConGraficoDinamicoGastoDepreciacionCentroCosto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoGastoDepreciacionCentroCosto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarGastoDepreciacionCentroCosto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoGastoDepreciacionCentroCosto .setBorder(borderResaltar);		
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
		this.gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
		
		this.gastodepreciacioncentrocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.gastodepreciacioncentrocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=GastoDepreciacionCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=GastoDepreciacionCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GastoDepreciacionCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GastoDepreciacionCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GastoDepreciacionCentroCostoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Gasto Depreciacion Centro Costo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
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
		
		GastoDepreciacionCentroCostoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("GastoDepreciacionCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarGastoDepreciacionCentroCosto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarGastoDepreciacionCentroCosto,this.jTtoolBarGastoDepreciacionCentroCosto,
							"nuevo","nuevo","Nuevo"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarGastoDepreciacionCentroCosto,this.jTtoolBarGastoDepreciacionCentroCosto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarGastoDepreciacionCentroCosto,this.jTtoolBarGastoDepreciacionCentroCosto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarGastoDepreciacionCentroCosto,this.jTtoolBarGastoDepreciacionCentroCosto,
							"duplicar","duplicar","Duplicar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarGastoDepreciacionCentroCosto,this.jTtoolBarGastoDepreciacionCentroCosto,
							"copiar","copiar","Copiar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarGastoDepreciacionCentroCosto,this.jTtoolBarGastoDepreciacionCentroCosto,
							"ver_form","ver_form","Ver"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGastoDepreciacionCentroCosto,this.jTtoolBarGastoDepreciacionCentroCosto,
							"recargar","recargar","Recargar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGastoDepreciacionCentroCosto,this.jTtoolBarGastoDepreciacionCentroCosto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGastoDepreciacionCentroCosto,this.jTtoolBarGastoDepreciacionCentroCosto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarGastoDepreciacionCentroCosto,this.jTtoolBarGastoDepreciacionCentroCosto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarGastoDepreciacionCentroCosto,this.jTtoolBarGastoDepreciacionCentroCosto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarGastoDepreciacionCentroCosto,this.jTtoolBarGastoDepreciacionCentroCosto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarGastoDepreciacionCentroCosto,this.jTtoolBarGastoDepreciacionCentroCosto,
							"cerrar","cerrar","Salir"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarGastoDepreciacionCentroCosto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarGastoDepreciacionCentroCosto;
			
				this.jButtonProcesarInformacionToolBarGastoDepreciacionCentroCosto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarGastoDepreciacionCentroCosto;
				
		//protected JButton jButtonModificarToolBarGastoDepreciacionCentroCosto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarGastoDepreciacionCentroCosto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuGastoDepreciacionCentroCosto=new JMenuMe("General");
		this.jmenuArchivoGastoDepreciacionCentroCosto=new JMenuMe("Archivo");
		this.jmenuAccionesGastoDepreciacionCentroCosto=new JMenuMe("Acciones");
		this.jmenuDatosGastoDepreciacionCentroCosto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGastoDepreciacionCentroCosto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGastoDepreciacionCentroCosto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGastoDepreciacionCentroCosto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarGastoDepreciacionCentroCosto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarGastoDepreciacionCentroCosto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarGastoDepreciacionCentroCosto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesGastoDepreciacionCentroCosto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesGastoDepreciacionCentroCosto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesGastoDepreciacionCentroCosto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosGastoDepreciacionCentroCosto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGastoDepreciacionCentroCosto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGastoDepreciacionCentroCosto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarGastoDepreciacionCentroCosto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarGastoDepreciacionCentroCosto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarGastoDepreciacionCentroCosto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormGastoDepreciacionCentroCosto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormGastoDepreciacionCentroCosto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormGastoDepreciacionCentroCosto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaGastoDepreciacionCentroCosto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaGastoDepreciacionCentroCosto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaGastoDepreciacionCentroCosto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGastoDepreciacionCentroCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGastoDepreciacionCentroCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGastoDepreciacionCentroCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionGastoDepreciacionCentroCosto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionGastoDepreciacionCentroCosto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionGastoDepreciacionCentroCosto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionGastoDepreciacionCentroCosto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionGastoDepreciacionCentroCosto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionGastoDepreciacionCentroCosto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresGastoDepreciacionCentroCosto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresGastoDepreciacionCentroCosto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresGastoDepreciacionCentroCosto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesGastoDepreciacionCentroCosto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesGastoDepreciacionCentroCosto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesGastoDepreciacionCentroCosto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByGastoDepreciacionCentroCosto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByGastoDepreciacionCentroCosto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByGastoDepreciacionCentroCosto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGastoDepreciacionCentroCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGastoDepreciacionCentroCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGastoDepreciacionCentroCosto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByGastoDepreciacionCentroCosto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByGastoDepreciacionCentroCosto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByGastoDepreciacionCentroCosto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGastoDepreciacionCentroCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGastoDepreciacionCentroCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGastoDepreciacionCentroCosto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosGastoDepreciacionCentroCosto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosGastoDepreciacionCentroCosto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosGastoDepreciacionCentroCosto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoGastoDepreciacionCentroCosto.add(this.jMenuItemCerrarGastoDepreciacionCentroCosto);
			
			this.jmenuAccionesGastoDepreciacionCentroCosto.add(this.jMenuItemNuevoGastoDepreciacionCentroCosto);
			this.jmenuAccionesGastoDepreciacionCentroCosto.add(this.jMenuItemNuevoGuardarCambiosGastoDepreciacionCentroCosto);
			this.jmenuAccionesGastoDepreciacionCentroCosto.add(this.jMenuItemNuevoRelacionesGastoDepreciacionCentroCosto);
			this.jmenuAccionesGastoDepreciacionCentroCosto.add(this.jMenuItemGuardarCambiosTablaGastoDepreciacionCentroCosto);		
			this.jmenuAccionesGastoDepreciacionCentroCosto.add(this.jMenuItemDuplicarGastoDepreciacionCentroCosto);		
			this.jmenuAccionesGastoDepreciacionCentroCosto.add(this.jMenuItemCopiarGastoDepreciacionCentroCosto);		
			this.jmenuAccionesGastoDepreciacionCentroCosto.add(this.jMenuItemVerFormGastoDepreciacionCentroCosto);		
			
			this.jmenuDatosGastoDepreciacionCentroCosto.add(this.jMenuItemRecargarInformacionGastoDepreciacionCentroCosto);				
			this.jmenuDatosGastoDepreciacionCentroCosto.add(this.jMenuItemAnterioresGastoDepreciacionCentroCosto);				
			this.jmenuDatosGastoDepreciacionCentroCosto.add(this.jMenuItemSiguientesGastoDepreciacionCentroCosto);				
			this.jmenuDatosGastoDepreciacionCentroCosto.add(this.jMenuItemAbrirOrderByGastoDepreciacionCentroCosto);				
			this.jmenuDatosGastoDepreciacionCentroCosto.add(this.jMenuItemMostrarOcultarGastoDepreciacionCentroCosto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesGastoDepreciacionCentroCosto.add(this.jMenuItemGuardarCambiosGastoDepreciacionCentroCosto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarGastoDepreciacionCentroCosto.add(this.jmenuArchivoGastoDepreciacionCentroCosto);		
			this.jmenuBarGastoDepreciacionCentroCosto.add(this.jmenuAccionesGastoDepreciacionCentroCosto);		
			this.jmenuBarGastoDepreciacionCentroCosto.add(this.jmenuDatosGastoDepreciacionCentroCosto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarGastoDepreciacionCentroCosto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasGastoDepreciacionCentroCosto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoGastoDepreciacionCentroCosto= new JButtonMe();
		this.jButtonFK_IdCentroCostoGastoDepreciacionCentroCosto.setText("Buscar");
		this.jButtonFK_IdCentroCostoGastoDepreciacionCentroCosto.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoGastoDepreciacionCentroCosto,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoGastoDepreciacionCentroCosto= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoGastoDepreciacionCentroCosto.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoGastoDepreciacionCentroCosto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoGastoDepreciacionCentroCosto.setFocusable(false);

		this.jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableGastoDepreciacionCentroCosto= new JButtonMe();
		this.jButtonFK_IdCuentaContableGastoDepreciacionCentroCosto.setText("Buscar");
		this.jButtonFK_IdCuentaContableGastoDepreciacionCentroCosto.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableGastoDepreciacionCentroCosto,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableGastoDepreciacionCentroCosto= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableGastoDepreciacionCentroCosto.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableGastoDepreciacionCentroCosto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableGastoDepreciacionCentroCosto.setFocusable(false);

		this.jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setToolTipText("Buscar Por Detalle Activo Fijo ");
		this.jButtonFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto= new JButtonMe();
		this.jButtonFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setText("Buscar");
		this.jButtonFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setToolTipText("Buscar Por Detalle Activo Fijo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto,"buscar_button","Buscar Por Detalle Activo Fijo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto = new JLabelMe();
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setText("Detalle Activo Fijo :");
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setToolTipText("Detalle Activo Fijo");
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto=new JTabbedPane();


		this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleGastoDepreciacionCentroCosto = new GastoDepreciacionCentroCostoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Gasto Depreciacion Centro Costo DATOS");
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto = new GastoDepreciacionCentroCostoDetalleFormJInternalFrame(jDesktopPane,this.gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones(),this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto = null;//new GastoDepreciacionCentroCostoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGastoDepreciacionCentroCosto= new GridBagLayout();
		
		
		this.jTableDatosGastoDepreciacionCentroCosto = new JTableMe();      
		
		String sToolTipGastoDepreciacionCentroCosto="";
		sToolTipGastoDepreciacionCentroCosto=GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGastoDepreciacionCentroCosto+="(ActivosFijos.GastoDepreciacionCentroCosto)";
		}
		
		if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
			sToolTipGastoDepreciacionCentroCosto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosGastoDepreciacionCentroCosto.setToolTipText(sToolTipGastoDepreciacionCentroCosto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosGastoDepreciacionCentroCosto);
		this.jTableDatosGastoDepreciacionCentroCosto.setAutoCreateRowSorter(true);
		this.jTableDatosGastoDepreciacionCentroCosto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosGastoDepreciacionCentroCosto.setRowSelectionAllowed(true);
		this.jTableDatosGastoDepreciacionCentroCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonDuplicarGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonCopiarGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonVerFormGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonNuevoRelacionesGastoDepreciacionCentroCosto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonCerrarGastoDepreciacionCentroCosto = new JButtonMe();
		
		this.jScrollPanelDatosGastoDepreciacionCentroCosto = new JScrollPane();   
        this.jScrollPanelDatosGeneralGastoDepreciacionCentroCosto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesGastoDepreciacionCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Gasto Depreciacion Centro Costo";
		
		if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Depreciacion Centro Costos" + this.sPath));
		} else {
			this.jScrollPanelDatosGastoDepreciacionCentroCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGastoDepreciacionCentroCosto.setToolTipText("Acciones");
        this.jPanelAccionesGastoDepreciacionCentroCosto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto=new ReporteDinamicoJInternalFrame(GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoGastoDepreciacionCentroCosto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionGastoDepreciacionCentroCosto=new ImportacionJInternalFrame(GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionGastoDepreciacionCentroCosto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByGastoDepreciacionCentroCosto = new JButtonMe();
		
		this.jButtonAbrirOrderByGastoDepreciacionCentroCosto.setText("Orden");
		this.jButtonAbrirOrderByGastoDepreciacionCentroCosto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGastoDepreciacionCentroCosto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByGastoDepreciacionCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGastoDepreciacionCentroCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGastoDepreciacionCentroCosto,false,this);
			
			//this.cargarOrderByGastoDepreciacionCentroCosto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGastoDepreciacionCentroCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGastoDepreciacionCentroCosto,true,this);
			
			//this.cargarOrderByGastoDepreciacionCentroCosto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoGastoDepreciacionCentroCosto.setText("Nuevo");
		this.jButtonDuplicarGastoDepreciacionCentroCosto.setText("Duplicar");
		this.jButtonCopiarGastoDepreciacionCentroCosto.setText("Copiar");
		this.jButtonVerFormGastoDepreciacionCentroCosto.setText("Ver");
		this.jButtonNuevoRelacionesGastoDepreciacionCentroCosto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto.setText("Guardar");
		this.jButtonCerrarGastoDepreciacionCentroCosto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGastoDepreciacionCentroCosto,"nuevo_button","Nuevo",this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarGastoDepreciacionCentroCosto,"duplicar_button","Duplicar",this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarGastoDepreciacionCentroCosto,"copiar_button","Copiar",this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormGastoDepreciacionCentroCosto,"ver_form","Ver",this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesGastoDepreciacionCentroCosto,"nuevorelaciones_button","Nuevo Rel",this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto,"guardarcambiostabla_button","Guardar",this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGastoDepreciacionCentroCosto,"cerrar_button","Salir",this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoGastoDepreciacionCentroCosto.setToolTipText("Nuevo"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarGastoDepreciacionCentroCosto.setToolTipText("Duplicar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarGastoDepreciacionCentroCosto.setToolTipText("Copiar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormGastoDepreciacionCentroCosto.setToolTipText("Ver"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesGastoDepreciacionCentroCosto.setToolTipText("Nuevo Rel"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto.setToolTipText("Guardar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGastoDepreciacionCentroCosto.setToolTipText("Salir"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGastoDepreciacionCentroCosto";
		inputMap = this.jButtonNuevoGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGastoDepreciacionCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGastoDepreciacionCentroCosto"));
		
		//DUPLICAR
		sMapKey = "DuplicarGastoDepreciacionCentroCosto";
		inputMap = this.jButtonDuplicarGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarGastoDepreciacionCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarGastoDepreciacionCentroCosto"));
		
		//COPIAR
		sMapKey = "CopiarGastoDepreciacionCentroCosto";
		inputMap = this.jButtonCopiarGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarGastoDepreciacionCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarGastoDepreciacionCentroCosto"));
		
		//VEr FORM
		sMapKey = "VerFormGastoDepreciacionCentroCosto";
		inputMap = this.jButtonVerFormGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormGastoDepreciacionCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormGastoDepreciacionCentroCosto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesGastoDepreciacionCentroCosto";
		inputMap = this.jButtonNuevoRelacionesGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesGastoDepreciacionCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesGastoDepreciacionCentroCosto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarGastoDepreciacionCentroCosto";
		inputMap = this.jButtonModificarGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarGastoDepreciacionCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarGastoDepreciacionCentroCosto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarGastoDepreciacionCentroCosto";
		inputMap = this.jButtonCerrarGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGastoDepreciacionCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGastoDepreciacionCentroCosto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGastoDepreciacionCentroCosto";
		inputMap = this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGastoDepreciacionCentroCosto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesGastoDepreciacionCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesGastoDepreciacionCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionGastoDepreciacionCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1GastoDepreciacionCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2GastoDepreciacionCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3GastoDepreciacionCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4GastoDepreciacionCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5GastoDepreciacionCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesGastoDepreciacionCentroCosto.setName("jPanelParametrosReportesGastoDepreciacionCentroCosto"); 
		
		this.jPanelParametrosReportesAccionesGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesGastoDepreciacionCentroCosto.setName("jPanelParametrosReportesAccionesGastoDepreciacionCentroCosto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonRecargarInformacionGastoDepreciacionCentroCosto.setText("Recargar");
		this.jButtonRecargarInformacionGastoDepreciacionCentroCosto.setToolTipText("Recargar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionGastoDepreciacionCentroCosto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonProcesarInformacionGastoDepreciacionCentroCosto.setText("Procesar");
		this.jButtonProcesarInformacionGastoDepreciacionCentroCosto.setToolTipText("Procesar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionGastoDepreciacionCentroCosto.setVisible(false);
			
		this.jButtonProcesarInformacionGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesGastoDepreciacionCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto.setText("TIPO");       
		this.jComboBoxTiposReportesGastoDepreciacionCentroCosto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto.setText("Paginacion");
		this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesGastoDepreciacionCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesGastoDepreciacionCentroCosto.setText("Accion");
		this.jComboBoxTiposRelacionesGastoDepreciacionCentroCosto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setText("Accion");
		this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto.setText("Accion");
		this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralGastoDepreciacionCentroCosto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesGastoDepreciacionCentroCosto = new JLabelMe();
		
		this.jLabelAccionesGastoDepreciacionCentroCosto.setText("Acciones");		
		this.jLabelAccionesGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosGastoDepreciacionCentroCosto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosGastoDepreciacionCentroCosto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosGastoDepreciacionCentroCosto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaGastoDepreciacionCentroCosto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaGastoDepreciacionCentroCosto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaGastoDepreciacionCentroCosto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteGastoDepreciacionCentroCosto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteGastoDepreciacionCentroCosto.setText("Graf.");
		this.jCheckBoxConGraficoReporteGastoDepreciacionCentroCosto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresGastoDepreciacionCentroCosto = new JButtonMe();
		//this.jButtonAnterioresGastoDepreciacionCentroCosto.setText("<<");
        this.jButtonAnterioresGastoDepreciacionCentroCosto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresGastoDepreciacionCentroCosto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesGastoDepreciacionCentroCosto = new JButtonMe();
		//this.jButtonSiguientesGastoDepreciacionCentroCosto.setText(">>");
        this.jButtonSiguientesGastoDepreciacionCentroCosto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesGastoDepreciacionCentroCosto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosGastoDepreciacionCentroCosto.setText("Nue");
        this.jButtonNuevoGuardarCambiosGastoDepreciacionCentroCosto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosGastoDepreciacionCentroCosto,"nuevoguardarcambios_button","Nue",this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosGastoDepreciacionCentroCosto";
		inputMap = this.jButtonNuevoGuardarCambiosGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosGastoDepreciacionCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosGastoDepreciacionCentroCosto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionGastoDepreciacionCentroCosto";
		inputMap = this.jButtonRecargarInformacionGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionGastoDepreciacionCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionGastoDepreciacionCentroCosto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesGastoDepreciacionCentroCosto";
		inputMap = this.jButtonSiguientesGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesGastoDepreciacionCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesGastoDepreciacionCentroCosto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresGastoDepreciacionCentroCosto";
		inputMap = this.jButtonAnterioresGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresGastoDepreciacionCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresGastoDepreciacionCentroCosto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasGastoDepreciacionCentroCosto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(this.getWidth(),GastoDepreciacionCentroCostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GastoDepreciacionCentroCostoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(this.getWidth(),GastoDepreciacionCentroCostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GastoDepreciacionCentroCostoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(this.getWidth(),GastoDepreciacionCentroCostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GastoDepreciacionCentroCostoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionGastoDepreciacionCentroCosto = new GridBagLayout();

			this.jPanelPaginacionGastoDepreciacionCentroCosto.setLayout(gridaBagLayoutPaginacionGastoDepreciacionCentroCosto);						
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionGastoDepreciacionCentroCosto.add(this.jButtonAnterioresGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
					
						
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
			
			this.jPanelPaginacionGastoDepreciacionCentroCosto.add(this.jButtonNuevoGuardarCambiosGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
						
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
			this.jPanelPaginacionGastoDepreciacionCentroCosto.add(this.jButtonSiguientesGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 1;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGastoDepreciacionCentroCosto.add(this.jButtonNuevoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
						
			
			
			if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
				this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 1;
				this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionGastoDepreciacionCentroCosto.add(this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
			}
			
			
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 1;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGastoDepreciacionCentroCosto.add(this.jButtonDuplicarGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 1;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGastoDepreciacionCentroCosto.add(this.jButtonCopiarGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 1;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGastoDepreciacionCentroCosto.add(this.jButtonVerFormGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 1;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionGastoDepreciacionCentroCosto.add(this.jButtonCerrarGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
		
		
		this.jButtonRecargarInformacionGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesGastoDepreciacionCentroCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesGastoDepreciacionCentroCosto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1GastoDepreciacionCentroCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2GastoDepreciacionCentroCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3GastoDepreciacionCentroCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4GastoDepreciacionCentroCosto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesGastoDepreciacionCentroCosto.setLayout(gridaBagParametrosReportesGastoDepreciacionCentroCosto);
			this.jPanelParametrosReportesAccionesGastoDepreciacionCentroCosto.setLayout(gridaBagParametrosReportesAccionesGastoDepreciacionCentroCosto);
			
			
			this.jPanelParametrosAuxiliar1GastoDepreciacionCentroCosto.setLayout(gridaBagParametrosAuxiliar1GastoDepreciacionCentroCosto);
			this.jPanelParametrosAuxiliar2GastoDepreciacionCentroCosto.setLayout(gridaBagParametrosAuxiliar2GastoDepreciacionCentroCosto);
			this.jPanelParametrosAuxiliar3GastoDepreciacionCentroCosto.setLayout(gridaBagParametrosAuxiliar3GastoDepreciacionCentroCosto);
			this.jPanelParametrosAuxiliar4GastoDepreciacionCentroCosto.setLayout(gridaBagParametrosAuxiliar4GastoDepreciacionCentroCosto);
			//this.jPanelParametrosAuxiliar5GastoDepreciacionCentroCosto.setLayout(gridaBagParametrosAuxiliar2GastoDepreciacionCentroCosto);			
			
			
			
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGastoDepreciacionCentroCosto.add(this.jButtonRecargarInformacionGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GastoDepreciacionCentroCosto.add(this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GastoDepreciacionCentroCosto.add(this.jCheckBoxConAltoMaximoTablaGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GastoDepreciacionCentroCosto.add(this.jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGastoDepreciacionCentroCosto.add(this.jPanelParametrosAuxiliar1GastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4GastoDepreciacionCentroCosto.add(this.jComboBoxTiposReportesGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);																		
			
			
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4GastoDepreciacionCentroCosto.add(this.jComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGastoDepreciacionCentroCosto.add(this.jPanelParametrosAuxiliar4GastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGastoDepreciacionCentroCosto.add(this.jComboBoxTiposReportesGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGastoDepreciacionCentroCosto.add(this.jCheckBoxGenerarReporteGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGastoDepreciacionCentroCosto.add(this.jPanelParametrosAuxiliar2GastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGastoDepreciacionCentroCosto.add(this.jLabelAccionesGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
				this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesGastoDepreciacionCentroCosto.add(this.jButtonAbrirOrderByGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGastoDepreciacionCentroCosto.add(this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);			
			
			
			/*
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGastoDepreciacionCentroCosto.add(this.jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGastoDepreciacionCentroCosto.add(this.jCheckBoxConGraficoReporteGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GastoDepreciacionCentroCosto.add(this.jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);															
				
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GastoDepreciacionCentroCosto.add(this.jCheckBoxSeleccionadosGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);															
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GastoDepreciacionCentroCosto.add(this.jCheckBoxConGraficoReporteGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGastoDepreciacionCentroCosto.add(this.jPanelParametrosAuxiliar3GastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGastoDepreciacionCentroCosto.add(this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	
				
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGastoDepreciacionCentroCosto.add(this.jTextFieldValorCampoGeneralGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosGastoDepreciacionCentroCosto = new GridBagLayout();

			this.jScrollPanelDatosGastoDepreciacionCentroCosto.setLayout(gridaBagLayoutDatosGastoDepreciacionCentroCosto);
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
			
			this.jScrollPanelDatosGastoDepreciacionCentroCosto.add(this.jTableDatosGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosGastoDepreciacionCentroCosto.setViewportView(this.jTableDatosGastoDepreciacionCentroCosto);
		this.jTableDatosGastoDepreciacionCentroCosto.setFillsViewportHeight(true);
		this.jTableDatosGastoDepreciacionCentroCosto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesGastoDepreciacionCentroCosto= new GridBagLayout();
		this.jPanelAccionesGastoDepreciacionCentroCosto.setLayout(gridaBagLayoutAccionesGastoDepreciacionCentroCosto);
		
		
		/*	
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
			
		this.jPanelAccionesGastoDepreciacionCentroCosto.add(this.jButtonNuevoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCentroCostoGastoDepreciacionCentroCosto= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoGastoDepreciacionCentroCosto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoGastoDepreciacionCentroCosto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoGastoDepreciacionCentroCosto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoGastoDepreciacionCentroCosto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto.setLayout(gridaBagLayoutFK_IdCentroCostoGastoDepreciacionCentroCosto);

		gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
		jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto.add(jLabelid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto, gridBagConstraintsGastoDepreciacionCentroCosto);

		gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 1;
		jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto.add(jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto, gridBagConstraintsGastoDepreciacionCentroCosto);


		gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.NONE;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
		jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoGastoDepreciacionCentroCosto, gridBagConstraintsGastoDepreciacionCentroCosto);

		gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 1;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridx =1;
		jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto.add(jButtonFK_IdCentroCostoGastoDepreciacionCentroCosto, gridBagConstraintsGastoDepreciacionCentroCosto);

		jTabbedPaneBusquedasGastoDepreciacionCentroCosto.addTab("1.-Por Centro Costo ", jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto);
		jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableGastoDepreciacionCentroCosto= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableGastoDepreciacionCentroCosto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableGastoDepreciacionCentroCosto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableGastoDepreciacionCentroCosto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableGastoDepreciacionCentroCosto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto.setLayout(gridaBagLayoutFK_IdCuentaContableGastoDepreciacionCentroCosto);

		gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
		jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto.add(jLabelid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto, gridBagConstraintsGastoDepreciacionCentroCosto);

		gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 1;
		jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto.add(jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto, gridBagConstraintsGastoDepreciacionCentroCosto);


		gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.NONE;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
		jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableGastoDepreciacionCentroCosto, gridBagConstraintsGastoDepreciacionCentroCosto);

		gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 1;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridx =1;
		jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto.add(jButtonFK_IdCuentaContableGastoDepreciacionCentroCosto, gridBagConstraintsGastoDepreciacionCentroCosto);

		jTabbedPaneBusquedasGastoDepreciacionCentroCosto.addTab("2.-Por Cuenta Contable ", jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto);
		jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setLayout(gridaBagLayoutFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto);

		gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
		jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.add(jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto, gridBagConstraintsGastoDepreciacionCentroCosto);

		gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 1;
		jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.add(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto, gridBagConstraintsGastoDepreciacionCentroCosto);

		gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 1;
		gridBagConstraintsGastoDepreciacionCentroCosto.gridx =1;
		jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.add(jButtonFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto, gridBagConstraintsGastoDepreciacionCentroCosto);

		jTabbedPaneBusquedasGastoDepreciacionCentroCosto.addTab("3.-Por Detalle Activo Fijo ", jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto);
		jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGastoDepreciacionCentroCosto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGastoDepreciacionCentroCosto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();						
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;		
			//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;		
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);								
		
		
		/*
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		*/		
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
				
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(GastoDepreciacionCentroCostoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosGastoDepreciacionCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGastoDepreciacionCentroCosto = new GridBagLayout();
			this.jPanelBusquedasParametrosGastoDepreciacionCentroCosto.setLayout(gridaBagLayoutBusquedasParametrosGastoDepreciacionCentroCosto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralGastoDepreciacionCentroCosto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
			
			
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
			
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralGastoDepreciacionCentroCosto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoGastoDepreciacionCentroCosto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoGastoDepreciacionCentroCosto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.setName("jPanelReporteDinamicoGastoDepreciacionCentroCosto"); 
		
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.setLayout(gridaBagLayoutReporteDinamicoGastoDepreciacionCentroCosto);
		
		
		this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoGastoDepreciacionCentroCosto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGastoDepreciacionCentroCosto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setResizable(true);
	    this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setClosable(true);
	    this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Depreciacion Centro Costos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteGastoDepreciacionCentroCosto = new JLabelMe();

		this.jLabelColumnasSelectReporteGastoDepreciacionCentroCosto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jLabelColumnasSelectReporteGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteGastoDepreciacionCentroCosto = new JList<Reporte>();
		this.jListColumnasSelectReporteGastoDepreciacionCentroCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteGastoDepreciacionCentroCosto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteGastoDepreciacionCentroCosto=new JScrollPane(this.jListColumnasSelectReporteGastoDepreciacionCentroCosto);
			
			this.jScrollColumnasSelectReporteGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jListColumnasSelectReporteGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jScrollColumnasSelectReporteGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteGastoDepreciacionCentroCosto = new JLabelMe();

		this.jLabelRelacionesSelectReporteGastoDepreciacionCentroCosto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteGastoDepreciacionCentroCosto = new JList<Reporte>();
		this.jListRelacionesSelectReporteGastoDepreciacionCentroCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteGastoDepreciacionCentroCosto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteGastoDepreciacionCentroCosto=new JScrollPane(this.jListRelacionesSelectReporteGastoDepreciacionCentroCosto);
			
			this.jScrollRelacionesSelectReporteGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoGastoDepreciacionCentroCosto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoGastoDepreciacionCentroCosto = new JComboBoxMe();
		this.jListColumnasValoresGraficoGastoDepreciacionCentroCosto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoGastoDepreciacionCentroCosto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoGastoDepreciacionCentroCosto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoGastoDepreciacionCentroCosto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoGastoDepreciacionCentroCosto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoGastoDepreciacionCentroCosto = new JLabelMe();

		this.jLabelConGraficoDinamicoGastoDepreciacionCentroCosto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jLabelConGraficoDinamicoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoGastoDepreciacionCentroCosto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoGastoDepreciacionCentroCosto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoGastoDepreciacionCentroCosto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jCheckBoxConGraficoDinamicoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoGastoDepreciacionCentroCosto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoGastoDepreciacionCentroCosto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jLabelColumnaCategoriaGraficoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoGastoDepreciacionCentroCosto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoGastoDepreciacionCentroCosto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoGastoDepreciacionCentroCosto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jComboBoxColumnaCategoriaGraficoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorGastoDepreciacionCentroCosto = new JLabelMe();

		this.jLabelColumnaCategoriaValorGastoDepreciacionCentroCosto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jLabelColumnaCategoriaValorGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorGastoDepreciacionCentroCosto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorGastoDepreciacionCentroCosto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorGastoDepreciacionCentroCosto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jComboBoxColumnaCategoriaValorGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoGastoDepreciacionCentroCosto = new JLabelMe();

		this.jLabelColumnasValoresGraficoGastoDepreciacionCentroCosto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jLabelColumnasValoresGraficoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoGastoDepreciacionCentroCosto = new JList<Reporte>();
		this.jListColumnasValoresGraficoGastoDepreciacionCentroCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoGastoDepreciacionCentroCosto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoGastoDepreciacionCentroCosto=new JScrollPane(this.jListColumnasValoresGraficoGastoDepreciacionCentroCosto);
			
			this.jScrollColumnasValoresGraficoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jListColumnasSelectReporteGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jScrollColumnasValoresGraficoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoGastoDepreciacionCentroCosto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoGastoDepreciacionCentroCosto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jLabelTiposGraficosReportesDinamicoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoGastoDepreciacionCentroCosto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoGastoDepreciacionCentroCosto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoGastoDepreciacionCentroCosto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jComboBoxTiposGraficosReportesDinamicoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoGastoDepreciacionCentroCosto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoGastoDepreciacionCentroCosto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jLabelGenerarExcelReporteDinamicoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoGastoDepreciacionCentroCosto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoGastoDepreciacionCentroCosto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoGastoDepreciacionCentroCosto.setToolTipText("Generar EXCEL"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jButtonGenerarExcelReporteDinamicoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jComboBoxTiposReportesDinamicoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoGastoDepreciacionCentroCosto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoGastoDepreciacionCentroCosto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jLabelTiposArchivoReporteDinamicoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jComboBoxTiposArchivosReportesDinamicoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoGastoDepreciacionCentroCosto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoGastoDepreciacionCentroCosto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoGastoDepreciacionCentroCosto.setToolTipText("Generar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jButtonGenerarReporteDinamicoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoGastoDepreciacionCentroCosto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoGastoDepreciacionCentroCosto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoGastoDepreciacionCentroCosto.setToolTipText("Cancelar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGastoDepreciacionCentroCosto.add(this.jButtonCerrarReporteDinamicoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalGastoDepreciacionCentroCosto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoGastoDepreciacionCentroCosto= new JScrollPane(jPanelReporteDinamicoGastoDepreciacionCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Depreciacion Centro Costos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalGastoDepreciacionCentroCosto);
		this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getContentPane().add(this.jScrollPanelReporteDinamicoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionGastoDepreciacionCentroCosto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionGastoDepreciacionCentroCosto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionGastoDepreciacionCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionGastoDepreciacionCentroCosto.setName("jPanelImportacionGastoDepreciacionCentroCosto"); 
		
		this.jPanelImportacionGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionGastoDepreciacionCentroCosto.setLayout(gridaBagLayoutImportacionGastoDepreciacionCentroCosto);
		
		
		this.jInternalFrameImportacionGastoDepreciacionCentroCosto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionGastoDepreciacionCentroCosto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionGastoDepreciacionCentroCosto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGastoDepreciacionCentroCosto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setResizable(true);
	    this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setClosable(true);
	    this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setResizable(true);
	    this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setClosable(true);
	    this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Depreciacion Centro Costos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionGastoDepreciacionCentroCosto = new JLabelMe();

		this.jLabelArchivoImportacionGastoDepreciacionCentroCosto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYImportacion;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGastoDepreciacionCentroCosto.add(this.jLabelArchivoImportacionGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionGastoDepreciacionCentroCosto = new JFileChooser();		
		this.jFileChooserImportacionGastoDepreciacionCentroCosto.setToolTipText("ESCOGER ARCHIVO"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonAbrirImportacionGastoDepreciacionCentroCosto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionGastoDepreciacionCentroCosto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionGastoDepreciacionCentroCosto.setToolTipText("Generar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGastoDepreciacionCentroCosto.add(this.jButtonAbrirImportacionGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionGastoDepreciacionCentroCosto = new JLabelMe();

		this.jLabelPathArchivoImportacionGastoDepreciacionCentroCosto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYImportacion;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGastoDepreciacionCentroCosto.add(this.jLabelPathArchivoImportacionGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionGastoDepreciacionCentroCosto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGastoDepreciacionCentroCosto.add(this.jTextFieldPathArchivoImportacionGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonGenerarImportacionGastoDepreciacionCentroCosto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionGastoDepreciacionCentroCosto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionGastoDepreciacionCentroCosto.setToolTipText("Generar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGastoDepreciacionCentroCosto.add(this.jButtonGenerarImportacionGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonCerrarImportacionGastoDepreciacionCentroCosto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionGastoDepreciacionCentroCosto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionGastoDepreciacionCentroCosto.setToolTipText("Cancelar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGastoDepreciacionCentroCosto.add(this.jButtonCerrarImportacionGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalGastoDepreciacionCentroCosto = new GridBagLayout();
		
		this.jScrollPanelImportacionGastoDepreciacionCentroCosto= new JScrollPane(jPanelImportacionGastoDepreciacionCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy =iPosYImportacion;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =iPosXImportacion;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionGastoDepreciacionCentroCosto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalGastoDepreciacionCentroCosto);
		this.jInternalFrameImportacionGastoDepreciacionCentroCosto.getContentPane().add(this.jScrollPanelImportacionGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByGastoDepreciacionCentroCosto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByGastoDepreciacionCentroCosto = new JButtonMe();
			this.jButtonAbrirOrderByGastoDepreciacionCentroCosto.setText("Orden");
			this.jButtonAbrirOrderByGastoDepreciacionCentroCosto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGastoDepreciacionCentroCosto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByGastoDepreciacionCentroCosto";
			inputMap = this.jButtonAbrirOrderByGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByGastoDepreciacionCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByGastoDepreciacionCentroCosto"));
		
		
			GridBagLayout gridaBagLayoutOrderByGastoDepreciacionCentroCosto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByGastoDepreciacionCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByGastoDepreciacionCentroCosto.setName("jPanelOrderByGastoDepreciacionCentroCosto"); 
			
			this.jPanelOrderByGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByGastoDepreciacionCentroCosto.setLayout(gridaBagLayoutOrderByGastoDepreciacionCentroCosto);
			
			
			this.jTableDatosGastoDepreciacionCentroCostoOrderBy = new JTableMe();        
			this.jTableDatosGastoDepreciacionCentroCostoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosGastoDepreciacionCentroCostoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosGastoDepreciacionCentroCostoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosGastoDepreciacionCentroCostoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosGastoDepreciacionCentroCostoOrderBy.setViewportView(this.jTableDatosGastoDepreciacionCentroCostoOrderBy);
			this.jTableDatosGastoDepreciacionCentroCostoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosGastoDepreciacionCentroCostoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByGastoDepreciacionCentroCosto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteGastoDepreciacionCentroCosto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setTitle("Orden");
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setResizable(true);
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setClosable(true);
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Depreciacion Centro Costos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =iPosXOrderBy;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsGastoDepreciacionCentroCosto.ipady =150;
				
			this.jPanelOrderByGastoDepreciacionCentroCosto.add(jScrollPanelDatosGastoDepreciacionCentroCostoOrderBy, this.gridBagConstraintsGastoDepreciacionCentroCosto);//this.jTableDatosGastoDepreciacionCentroCostoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByGastoDepreciacionCentroCosto = new JButtonMe();
			this.jButtonCerrarOrderByGastoDepreciacionCentroCosto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByGastoDepreciacionCentroCosto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByGastoDepreciacionCentroCosto.setToolTipText("Cancelar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByGastoDepreciacionCentroCosto.add(this.jButtonCerrarOrderByGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalGastoDepreciacionCentroCosto = new GridBagLayout();
			
			this.jScrollPanelOrderByGastoDepreciacionCentroCosto= new JScrollPane(jPanelOrderByGastoDepreciacionCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy =iPosYOrderBy;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =iPosXOrderBy;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalGastoDepreciacionCentroCosto);
			
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getContentPane().add(this.jScrollPanelOrderByGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);			
		
		} else {
			this.jButtonAbrirOrderByGastoDepreciacionCentroCosto = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosGastoDepreciacionCentroCosto.getRowHeight();//GastoDepreciacionCentroCostoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > GastoDepreciacionCentroCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGastoDepreciacionCentroCosto.isSelected()) {
					iHeightTable=GastoDepreciacionCentroCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GastoDepreciacionCentroCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GastoDepreciacionCentroCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > GastoDepreciacionCentroCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGastoDepreciacionCentroCosto.isSelected()) {
					iHeightTable=GastoDepreciacionCentroCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GastoDepreciacionCentroCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GastoDepreciacionCentroCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByGastoDepreciacionCentroCosto!=null && this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjTableDatosOrderBy()!=null) {
			//if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=gastodepreciacioncentrocostos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<GastoDepreciacionCentroCosto> TraerGastoDepreciacionCentroCostoBeans(List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostos,ArrayList<Classe> classes)throws Exception {
		try {
			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto:gastodepreciacioncentrocostos) {
					
				if(!(GastoDepreciacionCentroCostoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || GastoDepreciacionCentroCostoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					gastodepreciacioncentrocosto.setsDetalleGeneralEntityReporte(GastoDepreciacionCentroCostoConstantesFunciones.getGastoDepreciacionCentroCostoDescripcion(gastodepreciacioncentrocosto));
										
						
					
						
					
				} else  {
							
					//gastodepreciacioncentrocosto.setsDetalleGeneralEntityReporte(gastodepreciacioncentrocosto.getsDetalleGeneralEntityReporte());
										
				}
				
				//gastodepreciacioncentrocostobeans.add(gastodepreciacioncentrocostobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return gastodepreciacioncentrocostos;
    }
	//PARA REPORTES FIN
}
