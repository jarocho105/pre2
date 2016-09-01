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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.LiquidacionImporConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class LiquidacionImporJInternalFrame extends LiquidacionImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarLiquidacionImpor;
	
	protected JMenuBar jmenuBarLiquidacionImpor;
	
	protected JMenu jmenuLiquidacionImpor;
	protected JMenu jmenuDatosLiquidacionImpor;
	protected JMenu jmenuArchivoLiquidacionImpor;
	protected JMenu jmenuAccionesLiquidacionImpor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutLiquidacionImpor;	
	protected GridBagConstraints gridBagConstraintsLiquidacionImpor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public LiquidacionImporDetalleFormJInternalFrame jInternalFrameDetalleFormLiquidacionImpor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoLiquidacionImpor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionLiquidacionImpor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected PuertoBeanSwingJInternalFrame puertoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_puerto="";
	
	public LiquidacionImporSessionBean liquidacionimporSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public PaisSessionBean paisSessionBean;
	public PuertoSessionBean puertoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<LiquidacionImpor> liquidacionimpors;		
	public List<LiquidacionImpor> liquidacionimporsEliminados;	
	public List<LiquidacionImpor> liquidacionimporsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByLiquidacionImpor;		
	protected JButton jButtonAbrirOrderByLiquidacionImpor;
	
	
	//protected JPanel jPanelOrderByLiquidacionImpor;
	//public JScrollPane jScrollPanelOrderByLiquidacionImpor;	
	//protected JButton jButtonCerrarOrderByLiquidacionImpor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public LiquidacionImporLogic liquidacionimporLogic;
	
	
	
	public JScrollPane jScrollPanelDatosLiquidacionImpor;
	public JScrollPane jScrollPanelDatosEdicionLiquidacionImpor;
	public JScrollPane jScrollPanelDatosGeneralLiquidacionImpor;
    
	
	
	//public JScrollPane jScrollPanelDatosLiquidacionImporOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoLiquidacionImpor;
	//public JScrollPane jScrollPanelImportacionLiquidacionImpor;
	
	
	
	protected JPanel jPanelAccionesLiquidacionImpor;
	
    protected JPanel jPanelPaginacionLiquidacionImpor;
    protected JPanel jPanelParametrosReportesLiquidacionImpor;
	protected JPanel jPanelParametrosReportesAccionesLiquidacionImpor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1LiquidacionImpor;
	protected JPanel jPanelParametrosAuxiliar2LiquidacionImpor;
	protected JPanel jPanelParametrosAuxiliar3LiquidacionImpor;
	protected JPanel jPanelParametrosAuxiliar4LiquidacionImpor;
	//protected JPanel jPanelParametrosAuxiliar5LiquidacionImpor;
	
	
	
	//protected JPanel jPanelReporteDinamicoLiquidacionImpor;
	//protected JPanel jPanelImportacionLiquidacionImpor;
	
	
	public JTable jTableDatosLiquidacionImpor;
	
	
	
	//public JTable jTableDatosLiquidacionImporOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoLiquidacionImpor;
	protected JButton jButtonDuplicarLiquidacionImpor;
	protected JButton jButtonCopiarLiquidacionImpor;
	protected JButton jButtonVerFormLiquidacionImpor;
	protected JButton jButtonNuevoRelacionesLiquidacionImpor;
	protected JButton jButtonModificarLiquidacionImpor;
	
    protected JButton jButtonGuardarCambiosTablaLiquidacionImpor;
	protected JButton jButtonCerrarLiquidacionImpor;
	
	
	protected JButton jButtonRecargarInformacionLiquidacionImpor;
	protected JButton jButtonProcesarInformacionLiquidacionImpor;
	
	
	protected JButton jButtonAnterioresLiquidacionImpor;
	protected JButton jButtonSiguientesLiquidacionImpor;
	protected JButton jButtonNuevoGuardarCambiosLiquidacionImpor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoLiquidacionImpor;
	//protected JButton jButtonCerrarReporteDinamicoLiquidacionImpor;
	//protected JButton jButtonGenerarExcelReporteDinamicoLiquidacionImpor;	
	
	
	
	//protected JButton jButtonAbrirImportacionLiquidacionImpor;
	//protected JButton jButtonGenerarImportacionLiquidacionImpor;
	//protected JButton jButtonCerrarImportacionLiquidacionImpor;
	//protected JFileChooser jFileChooserImportacionLiquidacionImpor;
	//protected File fileImportacionLiquidacionImpor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarLiquidacionImpor;
	protected JButton jButtonDuplicarToolBarLiquidacionImpor;
	protected JButton jButtonNuevoRelacionesToolBarLiquidacionImpor;
	
	
	public JButton jButtonGuardarCambiosToolBarLiquidacionImpor;
	protected JButton jButtonCopiarToolBarLiquidacionImpor;
	protected JButton jButtonVerFormToolBarLiquidacionImpor;
	public JButton jButtonGuardarCambiosTablaToolBarLiquidacionImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarLiquidacionImpor;
	protected JButton jButtonCerrarToolBarLiquidacionImpor;
	
	protected JButton jButtonRecargarInformacionToolBarLiquidacionImpor;
	protected JButton jButtonProcesarInformacionToolBarLiquidacionImpor;
	protected JButton jButtonAnterioresToolBarLiquidacionImpor;
	protected JButton jButtonSiguientesToolBarLiquidacionImpor;
	protected JButton jButtonNuevoGuardarCambiosToolBarLiquidacionImpor;
	protected JButton jButtonAbrirOrderByToolBarLiquidacionImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoLiquidacionImpor;
	protected JMenuItem jMenuItemDuplicarLiquidacionImpor;
	protected JMenuItem jMenuItemNuevoRelacionesLiquidacionImpor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosLiquidacionImpor;
	protected JMenuItem jMenuItemCopiarLiquidacionImpor;
	protected JMenuItem jMenuItemVerFormLiquidacionImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaLiquidacionImpor;
	protected JMenuItem jMenuItemCerrarLiquidacionImpor;
	protected JMenuItem jMenuItemDetalleCerrarLiquidacionImpor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByLiquidacionImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarLiquidacionImpor;
	
	protected JMenuItem jMenuItemRecargarInformacionLiquidacionImpor;
	protected JMenuItem jMenuItemProcesarInformacionLiquidacionImpor;
	protected JMenuItem jMenuItemAnterioresLiquidacionImpor;
	protected JMenuItem jMenuItemSiguientesLiquidacionImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosLiquidacionImpor;
	protected JMenuItem jMenuItemAbrirOrderByLiquidacionImpor;
	protected JMenuItem jMenuItemMostrarOcultarLiquidacionImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesLiquidacionImpor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosLiquidacionImpor;
	protected JCheckBox jCheckBoxSeleccionadosLiquidacionImpor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaLiquidacionImpor;
	protected JCheckBox jCheckBoxConGraficoReporteLiquidacionImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesLiquidacionImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesLiquidacionImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoLiquidacionImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoLiquidacionImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarLiquidacionImpor;
	protected JTextField jTextFieldValorCampoGeneralLiquidacionImpor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteLiquidacionImpor;
	//public JList<Reporte> jListColumnasSelectReporteLiquidacionImpor;
	//public JScrollPane jScrollColumnasSelectReporteLiquidacionImpor;
	
	//public JLabel jLabelRelacionesSelectReporteLiquidacionImpor;
	//public JList<Reporte> jListRelacionesSelectReporteLiquidacionImpor;
	//public JScrollPane jScrollRelacionesSelectReporteLiquidacionImpor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoLiquidacionImpor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoLiquidacionImpor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoLiquidacionImpor;
	//public JLabel jLabelTiposArchivoReporteDinamicoLiquidacionImpor;
	
		
	//public JLabel jLabelArchivoImportacionLiquidacionImpor;	
	//public JLabel jLabelPathArchivoImportacionLiquidacionImpor;
	//protected JTextField jTextFieldPathArchivoImportacionLiquidacionImpor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoLiquidacionImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoLiquidacionImpor;
	
	//public JLabel jLabelColumnaCategoriaValorLiquidacionImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorLiquidacionImpor;
	
	//public JLabel jLabelColumnasValoresGraficoLiquidacionImpor;
	//public JList<Reporte> jListColumnasValoresGraficoLiquidacionImpor;
	//public JScrollPane jScrollColumnasValoresGraficoLiquidacionImpor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoLiquidacionImpor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoLiquidacionImpor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasLiquidacionImpor;
	public JPanel jPanelFK_IdCentroCostoLiquidacionImpor;
	public JButton jButtonFK_IdCentroCostoLiquidacionImpor;
	public JPanel jPanelFK_IdCuentaContableLiquidacionImpor;
	public JButton jButtonFK_IdCuentaContableLiquidacionImpor;
	public JPanel jPanelFK_IdPaisLiquidacionImpor;
	public JButton jButtonFK_IdPaisLiquidacionImpor;
	public JPanel jPanelFK_IdPuertoLiquidacionImpor;
	public JButton jButtonFK_IdPuertoLiquidacionImpor;
	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoLiquidacionImpor;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor;
	public JButton jButtonid_centro_costoFK_IdCentroCostoLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoLiquidacionImporBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoLiquidacionImporArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableLiquidacionImpor;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableLiquidacionImporBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableLiquidacionImporArbol= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisLiquidacionImpor;
	public JLabel jLabelid_paisFK_IdPaisLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisLiquidacionImpor;
	public JButton jButtonid_paisFK_IdPaisLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisLiquidacionImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_puertoFK_IdPuertoLiquidacionImpor;
	public JLabel jLabelid_puertoFK_IdPuertoLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_puertoFK_IdPuertoLiquidacionImpor;
	public JButton jButtonid_puertoFK_IdPuertoLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_puertoFK_IdPuertoLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_puertoFK_IdPuertoLiquidacionImporBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=484;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public LiquidacionImporJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("LiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LiquidacionImporJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LiquidacionImporJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LiquidacionImporJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("LiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionLiquidacionImpor)	{
		this.jButtonRecargarInformacionLiquidacionImpor = jButtonRecargarInformacionLiquidacionImpor;
	}
	
	public JButton getjButtonProcesarInformacionLiquidacionImpor() {
		return this.jButtonProcesarInformacionLiquidacionImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionLiquidacionImpor)	{
		this.jButtonProcesarInformacionLiquidacionImpor = jButtonProcesarInformacionLiquidacionImpor;
	}
	
	
	public JButton getjButtonRecargarInformacionLiquidacionImpor() {
		return this.jButtonRecargarInformacionLiquidacionImpor;
	}
	
	
	public List<LiquidacionImpor> getliquidacionimpors() {
		return this.liquidacionimpors;
	}

	public void setliquidacionimpors(List<LiquidacionImpor> liquidacionimpors) {
		this.liquidacionimpors = liquidacionimpors;
	}
	
	public List<LiquidacionImpor> getliquidacionimporsAux() {
		return this.liquidacionimporsAux;
	}

	public void setliquidacionimporsAux(List<LiquidacionImpor> liquidacionimporsAux) {
		this.liquidacionimporsAux = liquidacionimporsAux;
	}
	
	public List<LiquidacionImpor> getliquidacionimporsEliminados() {
		return this.liquidacionimporsEliminados;
	}

	public void setLiquidacionImporsEliminados(List<LiquidacionImpor> liquidacionimporsEliminados) {
		this.liquidacionimporsEliminados = liquidacionimporsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarLiquidacionImpor() {
		return jComboBoxTiposSeleccionarLiquidacionImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarLiquidacionImpor(
			JComboBox jComboBoxTiposSeleccionarLiquidacionImpor) {
		this.jComboBoxTiposSeleccionarLiquidacionImpor = jComboBoxTiposSeleccionarLiquidacionImpor;
	}
	
	public void setBorderResaltarTiposSeleccionarLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarLiquidacionImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralLiquidacionImpor() {
		return jTextFieldValorCampoGeneralLiquidacionImpor;
	}

	public void setjTextFieldValorCampoGeneralLiquidacionImpor(
			JTextField jTextFieldValorCampoGeneralLiquidacionImpor) {
		this.jTextFieldValorCampoGeneralLiquidacionImpor = jTextFieldValorCampoGeneralLiquidacionImpor;
	}

	public void setBorderResaltarValorCampoGeneralLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralLiquidacionImpor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosLiquidacionImpor() {
		return this.jCheckBoxSeleccionarTodosLiquidacionImpor;
	}

	public void setjCheckBoxSeleccionarTodosLiquidacionImpor(
			JCheckBox jCheckBoxSeleccionarTodosLiquidacionImpor) {
		this.jCheckBoxSeleccionarTodosLiquidacionImpor = jCheckBoxSeleccionarTodosLiquidacionImpor;
	}

	public void setBorderResaltarSeleccionarTodosLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosLiquidacionImpor() {
		return this.jCheckBoxSeleccionadosLiquidacionImpor;
	}

	public void setjCheckBoxSeleccionadosLiquidacionImpor(
			JCheckBox jCheckBoxSeleccionadosLiquidacionImpor) {
		this.jCheckBoxSeleccionadosLiquidacionImpor = jCheckBoxSeleccionadosLiquidacionImpor;
	}
	
	public void setBorderResaltarSeleccionadosLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesLiquidacionImpor() {
		return this.jComboBoxTiposArchivosReportesLiquidacionImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesLiquidacionImpor(
			JComboBox jComboBoxTiposArchivosReportesLiquidacionImpor) {
		this.jComboBoxTiposArchivosReportesLiquidacionImpor = jComboBoxTiposArchivosReportesLiquidacionImpor;
	}

	public void setBorderResaltarTiposArchivosReportesLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesLiquidacionImpor() {
		return this.jComboBoxTiposReportesLiquidacionImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesLiquidacionImpor(
			JComboBox jComboBoxTiposReportesLiquidacionImpor) {
		this.jComboBoxTiposReportesLiquidacionImpor = jComboBoxTiposReportesLiquidacionImpor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoLiquidacionImpor() {
	//	return jComboBoxTiposReportesDinamicoLiquidacionImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoLiquidacionImpor(
	//		JComboBox jComboBoxTiposReportesDinamicoLiquidacionImpor) {
	//	this.jComboBoxTiposReportesDinamicoLiquidacionImpor = jComboBoxTiposReportesDinamicoLiquidacionImpor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoLiquidacionImpor() {
	//	return jComboBoxTiposArchivosReportesDinamicoLiquidacionImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoLiquidacionImpor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoLiquidacionImpor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoLiquidacionImpor = jComboBoxTiposArchivosReportesDinamicoLiquidacionImpor;
	//}
	
	public void setBorderResaltarTiposReportesLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesLiquidacionImpor() {
		return this.jComboBoxTiposGraficosReportesLiquidacionImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesLiquidacionImpor(
			JComboBox jComboBoxTiposGraficosReportesLiquidacionImpor) {
		this.jComboBoxTiposGraficosReportesLiquidacionImpor = jComboBoxTiposGraficosReportesLiquidacionImpor;
	}
	
	public void setBorderResaltarTiposGraficosReportesLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionLiquidacionImpor() {
		return this.jComboBoxTiposPaginacionLiquidacionImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionLiquidacionImpor(
			JComboBox jComboBoxTiposPaginacionLiquidacionImpor) {
		this.jComboBoxTiposPaginacionLiquidacionImpor = jComboBoxTiposPaginacionLiquidacionImpor;
	}
	
	public void setBorderResaltarTiposPaginacionLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesLiquidacionImpor() {
		return this.jComboBoxTiposRelacionesLiquidacionImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesLiquidacionImpor() {
		return this.jComboBoxTiposAccionesLiquidacionImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesLiquidacionImpor(
			JComboBox jComboBoxTiposRelacionesLiquidacionImpor) {
		this.jComboBoxTiposRelacionesLiquidacionImpor = jComboBoxTiposRelacionesLiquidacionImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesLiquidacionImpor(
			JComboBox jComboBoxTiposAccionesLiquidacionImpor) {
		this.jComboBoxTiposAccionesLiquidacionImpor = jComboBoxTiposAccionesLiquidacionImpor;
	}
	
	public void setBorderResaltarTiposRelacionesLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoLiquidacionImpor() {
	//	return jCheckBoxConGraficoDinamicoLiquidacionImpor;
	//}

	//public void setjCheckBoxConGraficoDinamicoLiquidacionImpor(
	//		JCheckBox jCheckBoxConGraficoDinamicoLiquidacionImpor) {
	//	this.jCheckBoxConGraficoDinamicoLiquidacionImpor = jCheckBoxConGraficoDinamicoLiquidacionImpor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoLiquidacionImpor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarLiquidacionImpor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoLiquidacionImpor .setBorder(borderResaltar);		
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
		this.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
		
		this.liquidacionimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.liquidacionimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.liquidacionimporSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=LiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=LiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		LiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		LiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		LiquidacionImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Liquidacion Impor MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
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
		
		LiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("LiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarLiquidacionImpor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarLiquidacionImpor,this.jTtoolBarLiquidacionImpor,
							"nuevo","nuevo","Nuevo"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarLiquidacionImpor,this.jTtoolBarLiquidacionImpor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarLiquidacionImpor,this.jTtoolBarLiquidacionImpor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarLiquidacionImpor,this.jTtoolBarLiquidacionImpor,
							"duplicar","duplicar","Duplicar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarLiquidacionImpor,this.jTtoolBarLiquidacionImpor,
							"copiar","copiar","Copiar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarLiquidacionImpor,this.jTtoolBarLiquidacionImpor,
							"ver_form","ver_form","Ver"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLiquidacionImpor,this.jTtoolBarLiquidacionImpor,
							"recargar","recargar","Recargar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLiquidacionImpor,this.jTtoolBarLiquidacionImpor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLiquidacionImpor,this.jTtoolBarLiquidacionImpor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarLiquidacionImpor,this.jTtoolBarLiquidacionImpor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarLiquidacionImpor,this.jTtoolBarLiquidacionImpor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarLiquidacionImpor,this.jTtoolBarLiquidacionImpor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarLiquidacionImpor,this.jTtoolBarLiquidacionImpor,
							"cerrar","cerrar","Salir"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarLiquidacionImpor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarLiquidacionImpor;
			
				this.jButtonProcesarInformacionToolBarLiquidacionImpor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarLiquidacionImpor;
				
		//protected JButton jButtonModificarToolBarLiquidacionImpor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarLiquidacionImpor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuLiquidacionImpor=new JMenuMe("General");
		this.jmenuArchivoLiquidacionImpor=new JMenuMe("Archivo");
		this.jmenuAccionesLiquidacionImpor=new JMenuMe("Acciones");
		this.jmenuDatosLiquidacionImpor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoLiquidacionImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoLiquidacionImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoLiquidacionImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarLiquidacionImpor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarLiquidacionImpor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarLiquidacionImpor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesLiquidacionImpor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesLiquidacionImpor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesLiquidacionImpor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosLiquidacionImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosLiquidacionImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosLiquidacionImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarLiquidacionImpor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarLiquidacionImpor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarLiquidacionImpor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormLiquidacionImpor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormLiquidacionImpor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormLiquidacionImpor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaLiquidacionImpor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaLiquidacionImpor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaLiquidacionImpor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarLiquidacionImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarLiquidacionImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarLiquidacionImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionLiquidacionImpor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionLiquidacionImpor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionLiquidacionImpor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionLiquidacionImpor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionLiquidacionImpor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionLiquidacionImpor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresLiquidacionImpor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresLiquidacionImpor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresLiquidacionImpor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesLiquidacionImpor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesLiquidacionImpor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesLiquidacionImpor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByLiquidacionImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByLiquidacionImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByLiquidacionImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarLiquidacionImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarLiquidacionImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarLiquidacionImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByLiquidacionImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByLiquidacionImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByLiquidacionImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarLiquidacionImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarLiquidacionImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarLiquidacionImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosLiquidacionImpor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosLiquidacionImpor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosLiquidacionImpor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoLiquidacionImpor.add(this.jMenuItemCerrarLiquidacionImpor);
			
			this.jmenuAccionesLiquidacionImpor.add(this.jMenuItemNuevoLiquidacionImpor);
			this.jmenuAccionesLiquidacionImpor.add(this.jMenuItemNuevoGuardarCambiosLiquidacionImpor);
			this.jmenuAccionesLiquidacionImpor.add(this.jMenuItemNuevoRelacionesLiquidacionImpor);
			this.jmenuAccionesLiquidacionImpor.add(this.jMenuItemGuardarCambiosTablaLiquidacionImpor);		
			this.jmenuAccionesLiquidacionImpor.add(this.jMenuItemDuplicarLiquidacionImpor);		
			this.jmenuAccionesLiquidacionImpor.add(this.jMenuItemCopiarLiquidacionImpor);		
			this.jmenuAccionesLiquidacionImpor.add(this.jMenuItemVerFormLiquidacionImpor);		
			
			this.jmenuDatosLiquidacionImpor.add(this.jMenuItemRecargarInformacionLiquidacionImpor);				
			this.jmenuDatosLiquidacionImpor.add(this.jMenuItemAnterioresLiquidacionImpor);				
			this.jmenuDatosLiquidacionImpor.add(this.jMenuItemSiguientesLiquidacionImpor);				
			this.jmenuDatosLiquidacionImpor.add(this.jMenuItemAbrirOrderByLiquidacionImpor);				
			this.jmenuDatosLiquidacionImpor.add(this.jMenuItemMostrarOcultarLiquidacionImpor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesLiquidacionImpor.add(this.jMenuItemGuardarCambiosLiquidacionImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarLiquidacionImpor.add(this.jmenuArchivoLiquidacionImpor);		
			this.jmenuBarLiquidacionImpor.add(this.jmenuAccionesLiquidacionImpor);		
			this.jmenuBarLiquidacionImpor.add(this.jmenuDatosLiquidacionImpor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarLiquidacionImpor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasLiquidacionImpor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCentroCostoLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoLiquidacionImpor.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoLiquidacionImpor= new JButtonMe();
		this.jButtonFK_IdCentroCostoLiquidacionImpor.setText("Buscar");
		this.jButtonFK_IdCentroCostoLiquidacionImpor.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoLiquidacionImpor,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoLiquidacionImpor = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoLiquidacionImpor.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoLiquidacionImpor.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableLiquidacionImpor.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableLiquidacionImpor= new JButtonMe();
		this.jButtonFK_IdCuentaContableLiquidacionImpor.setText("Buscar");
		this.jButtonFK_IdCuentaContableLiquidacionImpor.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableLiquidacionImpor,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableLiquidacionImpor = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisLiquidacionImpor.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisLiquidacionImpor= new JButtonMe();
		this.jButtonFK_IdPaisLiquidacionImpor.setText("Buscar");
		this.jButtonFK_IdPaisLiquidacionImpor.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisLiquidacionImpor,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisLiquidacionImpor = new JLabelMe();
		jLabelid_paisFK_IdPaisLiquidacionImpor.setText("Pais :");
		jLabelid_paisFK_IdPaisLiquidacionImpor.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPuertoLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPuertoLiquidacionImpor.setToolTipText("Buscar Por Puerto ");
		this.jButtonFK_IdPuertoLiquidacionImpor= new JButtonMe();
		this.jButtonFK_IdPuertoLiquidacionImpor.setText("Buscar");
		this.jButtonFK_IdPuertoLiquidacionImpor.setToolTipText("Buscar Por Puerto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPuertoLiquidacionImpor,"buscar_button","Buscar Por Puerto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPuertoLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_puertoFK_IdPuertoLiquidacionImpor = new JLabelMe();
		jLabelid_puertoFK_IdPuertoLiquidacionImpor.setText("Puerto :");
		jLabelid_puertoFK_IdPuertoLiquidacionImpor.setToolTipText("Puerto");
		jLabelid_puertoFK_IdPuertoLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_puertoFK_IdPuertoLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_puertoFK_IdPuertoLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_puertoFK_IdPuertoLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_puertoFK_IdPuertoLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_puertoFK_IdPuertoLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puertoFK_IdPuertoLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puertoFK_IdPuertoLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_puertoFK_IdPuertoLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasLiquidacionImpor=new JTabbedPane();


		this.jTabbedPaneBusquedasLiquidacionImpor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasLiquidacionImpor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasLiquidacionImpor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasLiquidacionImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleLiquidacionImpor = new LiquidacionImporDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Liquidacion Impor DATOS");
			this.jInternalFrameDetalleFormLiquidacionImpor = new LiquidacionImporDetalleFormJInternalFrame(jDesktopPane,this.liquidacionimporSessionBean.getConGuardarRelaciones(),this.liquidacionimporSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormLiquidacionImpor = null;//new LiquidacionImporDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutLiquidacionImpor= new GridBagLayout();
		
		
		this.jTableDatosLiquidacionImpor = new JTableMe();      
		
		String sToolTipLiquidacionImpor="";
		sToolTipLiquidacionImpor=LiquidacionImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipLiquidacionImpor+="(Importaciones.LiquidacionImpor)";
		}
		
		if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipLiquidacionImpor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosLiquidacionImpor.setToolTipText(sToolTipLiquidacionImpor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosLiquidacionImpor);
		this.jTableDatosLiquidacionImpor.setAutoCreateRowSorter(true);
		this.jTableDatosLiquidacionImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosLiquidacionImpor.setRowSelectionAllowed(true);
		this.jTableDatosLiquidacionImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoLiquidacionImpor = new JButtonMe();
		this.jButtonDuplicarLiquidacionImpor = new JButtonMe();
		this.jButtonCopiarLiquidacionImpor = new JButtonMe();
		this.jButtonVerFormLiquidacionImpor = new JButtonMe();
		this.jButtonNuevoRelacionesLiquidacionImpor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaLiquidacionImpor = new JButtonMe();
		this.jButtonCerrarLiquidacionImpor = new JButtonMe();
		
		this.jScrollPanelDatosLiquidacionImpor = new JScrollPane();   
        this.jScrollPanelDatosGeneralLiquidacionImpor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Liquidacion Impor";
		
		if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Liquidacion Impores" + this.sPath));
		} else {
			this.jScrollPanelDatosLiquidacionImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesLiquidacionImpor.setToolTipText("Acciones");
        this.jPanelAccionesLiquidacionImpor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoLiquidacionImpor=new ReporteDinamicoJInternalFrame(LiquidacionImporConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoLiquidacionImpor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionLiquidacionImpor=new ImportacionJInternalFrame(LiquidacionImporConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionLiquidacionImpor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByLiquidacionImpor = new JButtonMe();
		
		this.jButtonAbrirOrderByLiquidacionImpor.setText("Orden");
		this.jButtonAbrirOrderByLiquidacionImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByLiquidacionImpor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByLiquidacionImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLiquidacionImpor,false,this);
			
			//this.cargarOrderByLiquidacionImpor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByLiquidacionImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLiquidacionImpor,true,this);
			
			//this.cargarOrderByLiquidacionImpor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosLiquidacionImpor.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosLiquidacionImpor.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosLiquidacionImpor.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosLiquidacionImpor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosLiquidacionImpor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosLiquidacionImpor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoLiquidacionImpor.setText("Nuevo");
		this.jButtonDuplicarLiquidacionImpor.setText("Duplicar");
		this.jButtonCopiarLiquidacionImpor.setText("Copiar");
		this.jButtonVerFormLiquidacionImpor.setText("Ver");
		this.jButtonNuevoRelacionesLiquidacionImpor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaLiquidacionImpor.setText("Guardar");
		this.jButtonCerrarLiquidacionImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoLiquidacionImpor,"nuevo_button","Nuevo",this.liquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarLiquidacionImpor,"duplicar_button","Duplicar",this.liquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarLiquidacionImpor,"copiar_button","Copiar",this.liquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormLiquidacionImpor,"ver_form","Ver",this.liquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesLiquidacionImpor,"nuevorelaciones_button","Nuevo Rel",this.liquidacionimporSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaLiquidacionImpor,"guardarcambiostabla_button","Guardar",this.liquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarLiquidacionImpor,"cerrar_button","Salir",this.liquidacionimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoLiquidacionImpor.setToolTipText("Nuevo"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarLiquidacionImpor.setToolTipText("Duplicar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarLiquidacionImpor.setToolTipText("Copiar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormLiquidacionImpor.setToolTipText("Ver"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesLiquidacionImpor.setToolTipText("Nuevo Rel"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaLiquidacionImpor.setToolTipText("Guardar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarLiquidacionImpor.setToolTipText("Salir"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoLiquidacionImpor";
		inputMap = this.jButtonNuevoLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoLiquidacionImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoLiquidacionImpor"));
		
		//DUPLICAR
		sMapKey = "DuplicarLiquidacionImpor";
		inputMap = this.jButtonDuplicarLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarLiquidacionImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarLiquidacionImpor"));
		
		//COPIAR
		sMapKey = "CopiarLiquidacionImpor";
		inputMap = this.jButtonCopiarLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarLiquidacionImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarLiquidacionImpor"));
		
		//VEr FORM
		sMapKey = "VerFormLiquidacionImpor";
		inputMap = this.jButtonVerFormLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormLiquidacionImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormLiquidacionImpor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesLiquidacionImpor";
		inputMap = this.jButtonNuevoRelacionesLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesLiquidacionImpor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarLiquidacionImpor";
		inputMap = this.jButtonModificarLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarLiquidacionImpor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarLiquidacionImpor";
		inputMap = this.jButtonCerrarLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarLiquidacionImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaLiquidacionImpor";
		inputMap = this.jButtonGuardarCambiosTablaLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaLiquidacionImpor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1LiquidacionImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2LiquidacionImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3LiquidacionImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4LiquidacionImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5LiquidacionImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesLiquidacionImpor.setName("jPanelParametrosReportesLiquidacionImpor"); 
		
		this.jPanelParametrosReportesAccionesLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesLiquidacionImpor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesLiquidacionImpor.setName("jPanelParametrosReportesAccionesLiquidacionImpor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionLiquidacionImpor = new JButtonMe();
		this.jButtonRecargarInformacionLiquidacionImpor.setText("Recargar");
		this.jButtonRecargarInformacionLiquidacionImpor.setToolTipText("Recargar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionLiquidacionImpor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionLiquidacionImpor = new JButtonMe();
		this.jButtonProcesarInformacionLiquidacionImpor.setText("Procesar");
		this.jButtonProcesarInformacionLiquidacionImpor.setToolTipText("Procesar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionLiquidacionImpor.setVisible(false);
			
		this.jButtonProcesarInformacionLiquidacionImpor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionLiquidacionImpor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionLiquidacionImpor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLiquidacionImpor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesLiquidacionImpor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLiquidacionImpor.setText("TIPO");       
		this.jComboBoxTiposReportesLiquidacionImpor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLiquidacionImpor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesLiquidacionImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionLiquidacionImpor.setText("Paginacion");
		this.jComboBoxTiposPaginacionLiquidacionImpor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesLiquidacionImpor.setText("Accion");
		this.jComboBoxTiposRelacionesLiquidacionImpor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesLiquidacionImpor.setText("Accion");
		this.jComboBoxTiposAccionesLiquidacionImpor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarLiquidacionImpor.setText("Accion");
		this.jComboBoxTiposSeleccionarLiquidacionImpor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralLiquidacionImpor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralLiquidacionImpor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralLiquidacionImpor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralLiquidacionImpor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesLiquidacionImpor = new JLabelMe();
		
		this.jLabelAccionesLiquidacionImpor.setText("Acciones");		
		this.jLabelAccionesLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosLiquidacionImpor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosLiquidacionImpor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosLiquidacionImpor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosLiquidacionImpor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosLiquidacionImpor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosLiquidacionImpor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaLiquidacionImpor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaLiquidacionImpor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaLiquidacionImpor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteLiquidacionImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteLiquidacionImpor.setText("Graf.");
		this.jCheckBoxConGraficoReporteLiquidacionImpor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresLiquidacionImpor = new JButtonMe();
		//this.jButtonAnterioresLiquidacionImpor.setText("<<");
        this.jButtonAnterioresLiquidacionImpor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresLiquidacionImpor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesLiquidacionImpor = new JButtonMe();
		//this.jButtonSiguientesLiquidacionImpor.setText(">>");
        this.jButtonSiguientesLiquidacionImpor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesLiquidacionImpor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosLiquidacionImpor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosLiquidacionImpor.setText("Nue");
        this.jButtonNuevoGuardarCambiosLiquidacionImpor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosLiquidacionImpor,"nuevoguardarcambios_button","Nue",this.liquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosLiquidacionImpor";
		inputMap = this.jButtonNuevoGuardarCambiosLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosLiquidacionImpor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionLiquidacionImpor";
		inputMap = this.jButtonRecargarInformacionLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionLiquidacionImpor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesLiquidacionImpor";
		inputMap = this.jButtonSiguientesLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesLiquidacionImpor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresLiquidacionImpor";
		inputMap = this.jButtonAnterioresLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresLiquidacionImpor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasLiquidacionImpor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesLiquidacionImpor.setMinimumSize(new Dimension(this.getWidth(),LiquidacionImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LiquidacionImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesLiquidacionImpor.setMaximumSize(new Dimension(this.getWidth(),LiquidacionImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LiquidacionImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesLiquidacionImpor.setPreferredSize(new Dimension(this.getWidth(),LiquidacionImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LiquidacionImporBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionLiquidacionImpor = new GridBagLayout();

			this.jPanelPaginacionLiquidacionImpor.setLayout(gridaBagLayoutPaginacionLiquidacionImpor);						
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy = 0;
			this.gridBagConstraintsLiquidacionImpor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionLiquidacionImpor.add(this.jButtonAnterioresLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
					
						
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsLiquidacionImpor.gridy = 0;
			
			this.jPanelPaginacionLiquidacionImpor.add(this.jButtonNuevoGuardarCambiosLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
						
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsLiquidacionImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsLiquidacionImpor.gridy = 0;
			this.jPanelPaginacionLiquidacionImpor.add(this.jButtonSiguientesLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy = 1;
			this.gridBagConstraintsLiquidacionImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLiquidacionImpor.add(this.jButtonNuevoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
				this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsLiquidacionImpor.gridy = 1;
				this.gridBagConstraintsLiquidacionImpor.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionLiquidacionImpor.add(this.jButtonNuevoRelacionesLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
			}
			
			
			if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
				this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsLiquidacionImpor.gridy = 1;
				this.gridBagConstraintsLiquidacionImpor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionLiquidacionImpor.add(this.jButtonGuardarCambiosTablaLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
			}
			
			
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy = 1;
			this.gridBagConstraintsLiquidacionImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLiquidacionImpor.add(this.jButtonDuplicarLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy = 1;
			this.gridBagConstraintsLiquidacionImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLiquidacionImpor.add(this.jButtonCopiarLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy = 1;
			this.gridBagConstraintsLiquidacionImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLiquidacionImpor.add(this.jButtonVerFormLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy = 1;
			this.gridBagConstraintsLiquidacionImpor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionLiquidacionImpor.add(this.jButtonCerrarLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
		
		
		this.jButtonRecargarInformacionLiquidacionImpor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionLiquidacionImpor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionLiquidacionImpor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesLiquidacionImpor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesLiquidacionImpor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesLiquidacionImpor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesLiquidacionImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesLiquidacionImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesLiquidacionImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesLiquidacionImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesLiquidacionImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesLiquidacionImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionLiquidacionImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionLiquidacionImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionLiquidacionImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesLiquidacionImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesLiquidacionImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesLiquidacionImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesLiquidacionImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLiquidacionImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLiquidacionImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarLiquidacionImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarLiquidacionImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarLiquidacionImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaLiquidacionImpor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaLiquidacionImpor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaLiquidacionImpor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteLiquidacionImpor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteLiquidacionImpor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteLiquidacionImpor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosLiquidacionImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosLiquidacionImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosLiquidacionImpor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosLiquidacionImpor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosLiquidacionImpor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosLiquidacionImpor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesLiquidacionImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesLiquidacionImpor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1LiquidacionImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2LiquidacionImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3LiquidacionImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4LiquidacionImpor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesLiquidacionImpor.setLayout(gridaBagParametrosReportesLiquidacionImpor);
			this.jPanelParametrosReportesAccionesLiquidacionImpor.setLayout(gridaBagParametrosReportesAccionesLiquidacionImpor);
			
			
			this.jPanelParametrosAuxiliar1LiquidacionImpor.setLayout(gridaBagParametrosAuxiliar1LiquidacionImpor);
			this.jPanelParametrosAuxiliar2LiquidacionImpor.setLayout(gridaBagParametrosAuxiliar2LiquidacionImpor);
			this.jPanelParametrosAuxiliar3LiquidacionImpor.setLayout(gridaBagParametrosAuxiliar3LiquidacionImpor);
			this.jPanelParametrosAuxiliar4LiquidacionImpor.setLayout(gridaBagParametrosAuxiliar4LiquidacionImpor);
			//this.jPanelParametrosAuxiliar5LiquidacionImpor.setLayout(gridaBagParametrosAuxiliar2LiquidacionImpor);			
			
			
			
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLiquidacionImpor.add(this.jButtonRecargarInformacionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LiquidacionImpor.add(this.jComboBoxTiposPaginacionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LiquidacionImpor.add(this.jCheckBoxConAltoMaximoTablaLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LiquidacionImpor.add(this.jComboBoxTiposArchivosReportesLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLiquidacionImpor.add(this.jPanelParametrosAuxiliar1LiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4LiquidacionImpor.add(this.jComboBoxTiposReportesLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);																		
			
			
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4LiquidacionImpor.add(this.jComboBoxTiposGraficosReportesLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLiquidacionImpor.add(this.jPanelParametrosAuxiliar4LiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLiquidacionImpor.add(this.jComboBoxTiposReportesLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLiquidacionImpor.add(this.jCheckBoxGenerarReporteLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLiquidacionImpor.add(this.jPanelParametrosAuxiliar2LiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLiquidacionImpor.add(this.jLabelAccionesLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
				this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsLiquidacionImpor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesLiquidacionImpor.add(this.jButtonAbrirOrderByLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLiquidacionImpor.add(this.jComboBoxTiposSeleccionarLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);			
			
			
			/*
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLiquidacionImpor.add(this.jCheckBoxSeleccionarTodosLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLiquidacionImpor.add(this.jCheckBoxConGraficoReporteLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3LiquidacionImpor.add(this.jCheckBoxSeleccionarTodosLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);															
				
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3LiquidacionImpor.add(this.jCheckBoxSeleccionadosLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);															
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3LiquidacionImpor.add(this.jCheckBoxConGraficoReporteLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLiquidacionImpor.add(this.jPanelParametrosAuxiliar3LiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLiquidacionImpor.add(this.jComboBoxTiposRelacionesLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
				
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLiquidacionImpor.add(this.jComboBoxTiposAccionesLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
	
				
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLiquidacionImpor.add(this.jTextFieldValorCampoGeneralLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosLiquidacionImpor = new GridBagLayout();

			this.jScrollPanelDatosLiquidacionImpor.setLayout(gridaBagLayoutDatosLiquidacionImpor);
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy = 0;
			this.gridBagConstraintsLiquidacionImpor.gridx = 0;
			
			this.jScrollPanelDatosLiquidacionImpor.add(this.jTableDatosLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosLiquidacionImpor.setViewportView(this.jTableDatosLiquidacionImpor);
		this.jTableDatosLiquidacionImpor.setFillsViewportHeight(true);
		this.jTableDatosLiquidacionImpor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesLiquidacionImpor= new GridBagLayout();
		this.jPanelAccionesLiquidacionImpor.setLayout(gridaBagLayoutAccionesLiquidacionImpor);
		
		
		/*	
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 0;
			
		this.jPanelAccionesLiquidacionImpor.add(this.jButtonNuevoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCentroCostoLiquidacionImpor= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoLiquidacionImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoLiquidacionImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoLiquidacionImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoLiquidacionImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoLiquidacionImpor.setLayout(gridaBagLayoutFK_IdCentroCostoLiquidacionImpor);

		gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpor.gridy = 0;
		gridBagConstraintsLiquidacionImpor.gridx = 0;
		jPanelFK_IdCentroCostoLiquidacionImpor.add(jLabelid_centro_costoFK_IdCentroCostoLiquidacionImpor, gridBagConstraintsLiquidacionImpor);

		gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpor.gridy = 0;
		gridBagConstraintsLiquidacionImpor.gridx = 1;
		jPanelFK_IdCentroCostoLiquidacionImpor.add(jComboBoxid_centro_costoFK_IdCentroCostoLiquidacionImpor, gridBagConstraintsLiquidacionImpor);

		gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpor.gridy = 1;
		gridBagConstraintsLiquidacionImpor.gridx =1;
		jPanelFK_IdCentroCostoLiquidacionImpor.add(jButtonFK_IdCentroCostoLiquidacionImpor, gridBagConstraintsLiquidacionImpor);

		jTabbedPaneBusquedasLiquidacionImpor.addTab("1.-Por Centro Costo ", jPanelFK_IdCentroCostoLiquidacionImpor);
		jTabbedPaneBusquedasLiquidacionImpor.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableLiquidacionImpor= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableLiquidacionImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableLiquidacionImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableLiquidacionImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableLiquidacionImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableLiquidacionImpor.setLayout(gridaBagLayoutFK_IdCuentaContableLiquidacionImpor);

		gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpor.gridy = 0;
		gridBagConstraintsLiquidacionImpor.gridx = 0;
		jPanelFK_IdCuentaContableLiquidacionImpor.add(jLabelid_cuenta_contableFK_IdCuentaContableLiquidacionImpor, gridBagConstraintsLiquidacionImpor);

		gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpor.gridy = 0;
		gridBagConstraintsLiquidacionImpor.gridx = 1;
		jPanelFK_IdCuentaContableLiquidacionImpor.add(jComboBoxid_cuenta_contableFK_IdCuentaContableLiquidacionImpor, gridBagConstraintsLiquidacionImpor);

		gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpor.gridy = 1;
		gridBagConstraintsLiquidacionImpor.gridx =1;
		jPanelFK_IdCuentaContableLiquidacionImpor.add(jButtonFK_IdCuentaContableLiquidacionImpor, gridBagConstraintsLiquidacionImpor);

		jTabbedPaneBusquedasLiquidacionImpor.addTab("2.-Por Cuenta Contable ", jPanelFK_IdCuentaContableLiquidacionImpor);
		jTabbedPaneBusquedasLiquidacionImpor.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPaisLiquidacionImpor= new GridBagLayout();
		gridaBagLayoutFK_IdPaisLiquidacionImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisLiquidacionImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisLiquidacionImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisLiquidacionImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisLiquidacionImpor.setLayout(gridaBagLayoutFK_IdPaisLiquidacionImpor);

		gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpor.gridy = 0;
		gridBagConstraintsLiquidacionImpor.gridx = 0;
		jPanelFK_IdPaisLiquidacionImpor.add(jLabelid_paisFK_IdPaisLiquidacionImpor, gridBagConstraintsLiquidacionImpor);

		gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpor.gridy = 0;
		gridBagConstraintsLiquidacionImpor.gridx = 1;
		jPanelFK_IdPaisLiquidacionImpor.add(jComboBoxid_paisFK_IdPaisLiquidacionImpor, gridBagConstraintsLiquidacionImpor);

		gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpor.gridy = 1;
		gridBagConstraintsLiquidacionImpor.gridx =1;
		jPanelFK_IdPaisLiquidacionImpor.add(jButtonFK_IdPaisLiquidacionImpor, gridBagConstraintsLiquidacionImpor);

		jTabbedPaneBusquedasLiquidacionImpor.addTab("3.-Por Pais ", jPanelFK_IdPaisLiquidacionImpor);
		jTabbedPaneBusquedasLiquidacionImpor.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdPuertoLiquidacionImpor= new GridBagLayout();
		gridaBagLayoutFK_IdPuertoLiquidacionImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPuertoLiquidacionImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPuertoLiquidacionImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPuertoLiquidacionImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPuertoLiquidacionImpor.setLayout(gridaBagLayoutFK_IdPuertoLiquidacionImpor);

		gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpor.gridy = 0;
		gridBagConstraintsLiquidacionImpor.gridx = 0;
		jPanelFK_IdPuertoLiquidacionImpor.add(jLabelid_puertoFK_IdPuertoLiquidacionImpor, gridBagConstraintsLiquidacionImpor);

		gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpor.gridy = 0;
		gridBagConstraintsLiquidacionImpor.gridx = 1;
		jPanelFK_IdPuertoLiquidacionImpor.add(jComboBoxid_puertoFK_IdPuertoLiquidacionImpor, gridBagConstraintsLiquidacionImpor);

		gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpor.gridy = 1;
		gridBagConstraintsLiquidacionImpor.gridx =1;
		jPanelFK_IdPuertoLiquidacionImpor.add(jButtonFK_IdPuertoLiquidacionImpor, gridBagConstraintsLiquidacionImpor);

		jTabbedPaneBusquedasLiquidacionImpor.addTab("4.-Por Puerto ", jPanelFK_IdPuertoLiquidacionImpor);
		jTabbedPaneBusquedasLiquidacionImpor.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutLiquidacionImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutLiquidacionImpor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();						
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLiquidacionImpor.gridx = 0;		
			//this.gridBagConstraintsLiquidacionImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsLiquidacionImpor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsLiquidacionImpor.gridx = 0;		
		//this.gridBagConstraintsLiquidacionImpor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsLiquidacionImpor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLiquidacionImpor.gridx = 0;		
			this.gridBagConstraintsLiquidacionImpor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsLiquidacionImpor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);								
		
		
		/*
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		*/		
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsLiquidacionImpor.gridx =0;
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsLiquidacionImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
				
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(LiquidacionImporJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosLiquidacionImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosLiquidacionImpor = new GridBagLayout();
			this.jPanelBusquedasParametrosLiquidacionImpor.setLayout(gridaBagLayoutBusquedasParametrosLiquidacionImpor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralLiquidacionImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralLiquidacionImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLiquidacionImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLiquidacionImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
			
			
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
			
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralLiquidacionImpor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoLiquidacionImpor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoLiquidacionImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoLiquidacionImpor.setName("jPanelReporteDinamicoLiquidacionImpor"); 
		
		this.jPanelReporteDinamicoLiquidacionImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoLiquidacionImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoLiquidacionImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoLiquidacionImpor.setLayout(gridaBagLayoutReporteDinamicoLiquidacionImpor);
		
		
		this.jInternalFrameReporteDinamicoLiquidacionImpor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoLiquidacionImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteLiquidacionImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoLiquidacionImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoLiquidacionImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoLiquidacionImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoLiquidacionImpor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoLiquidacionImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoLiquidacionImpor.setResizable(true);
	    this.jInternalFrameReporteDinamicoLiquidacionImpor.setClosable(true);
	    this.jInternalFrameReporteDinamicoLiquidacionImpor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoLiquidacionImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoLiquidacionImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoLiquidacionImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Liquidacion Impores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteLiquidacionImpor = new JLabelMe();

		this.jLabelColumnasSelectReporteLiquidacionImpor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jLabelColumnasSelectReporteLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteLiquidacionImpor = new JList<Reporte>();
		this.jListColumnasSelectReporteLiquidacionImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteLiquidacionImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteLiquidacionImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteLiquidacionImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteLiquidacionImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteLiquidacionImpor=new JScrollPane(this.jListColumnasSelectReporteLiquidacionImpor);
			
			this.jScrollColumnasSelectReporteLiquidacionImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteLiquidacionImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteLiquidacionImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoLiquidacionImpor.add(this.jListColumnasSelectReporteLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jScrollColumnasSelectReporteLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteLiquidacionImpor = new JLabelMe();

		this.jLabelRelacionesSelectReporteLiquidacionImpor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jLabelRelacionesSelectReporteLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteLiquidacionImpor = new JList<Reporte>();
		this.jListRelacionesSelectReporteLiquidacionImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteLiquidacionImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteLiquidacionImpor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteLiquidacionImpor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteLiquidacionImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteLiquidacionImpor=new JScrollPane(this.jListRelacionesSelectReporteLiquidacionImpor);
			
			this.jScrollRelacionesSelectReporteLiquidacionImpor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteLiquidacionImpor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteLiquidacionImpor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoLiquidacionImpor.add(this.jListRelacionesSelectReporteLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jScrollRelacionesSelectReporteLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoLiquidacionImpor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoLiquidacionImpor = new JComboBoxMe();
		this.jListColumnasValoresGraficoLiquidacionImpor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoLiquidacionImpor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoLiquidacionImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoLiquidacionImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoLiquidacionImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoLiquidacionImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoLiquidacionImpor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoLiquidacionImpor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoLiquidacionImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoLiquidacionImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoLiquidacionImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoLiquidacionImpor = new JLabelMe();

		this.jLabelConGraficoDinamicoLiquidacionImpor.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jLabelConGraficoDinamicoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoLiquidacionImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoLiquidacionImpor.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoLiquidacionImpor.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoLiquidacionImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoLiquidacionImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoLiquidacionImpor.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jCheckBoxConGraficoDinamicoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoLiquidacionImpor = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoLiquidacionImpor.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jLabelColumnaCategoriaGraficoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoLiquidacionImpor.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoLiquidacionImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoLiquidacionImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoLiquidacionImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoLiquidacionImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jComboBoxColumnaCategoriaGraficoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorLiquidacionImpor = new JLabelMe();

		this.jLabelColumnaCategoriaValorLiquidacionImpor.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jLabelColumnaCategoriaValorLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorLiquidacionImpor.setText("Accion");
        this.jComboBoxColumnaCategoriaValorLiquidacionImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorLiquidacionImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorLiquidacionImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorLiquidacionImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jComboBoxColumnaCategoriaValorLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoLiquidacionImpor = new JLabelMe();

		this.jLabelColumnasValoresGraficoLiquidacionImpor.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jLabelColumnasValoresGraficoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoLiquidacionImpor = new JList<Reporte>();
		this.jListColumnasValoresGraficoLiquidacionImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoLiquidacionImpor.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoLiquidacionImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoLiquidacionImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoLiquidacionImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoLiquidacionImpor=new JScrollPane(this.jListColumnasValoresGraficoLiquidacionImpor);
			
			this.jScrollColumnasValoresGraficoLiquidacionImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoLiquidacionImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoLiquidacionImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoLiquidacionImpor.add(this.jListColumnasSelectReporteLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jScrollColumnasValoresGraficoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoLiquidacionImpor = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoLiquidacionImpor.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jLabelTiposGraficosReportesDinamicoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoLiquidacionImpor.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoLiquidacionImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoLiquidacionImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoLiquidacionImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoLiquidacionImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jComboBoxTiposGraficosReportesDinamicoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoLiquidacionImpor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoLiquidacionImpor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jLabelGenerarExcelReporteDinamicoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoLiquidacionImpor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoLiquidacionImpor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoLiquidacionImpor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoLiquidacionImpor.setToolTipText("Generar EXCEL"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoLiquidacionImpor.add(this.jButtonGenerarExcelReporteDinamicoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jComboBoxTiposReportesDinamicoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoLiquidacionImpor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoLiquidacionImpor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jLabelTiposArchivoReporteDinamicoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jComboBoxTiposArchivosReportesDinamicoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoLiquidacionImpor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoLiquidacionImpor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoLiquidacionImpor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoLiquidacionImpor.setToolTipText("Generar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jButtonGenerarReporteDinamicoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoLiquidacionImpor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoLiquidacionImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoLiquidacionImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoLiquidacionImpor.setToolTipText("Cancelar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLiquidacionImpor.add(this.jButtonCerrarReporteDinamicoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalLiquidacionImpor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoLiquidacionImpor= new JScrollPane(jPanelReporteDinamicoLiquidacionImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoLiquidacionImpor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoLiquidacionImpor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoLiquidacionImpor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Liquidacion Impores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsLiquidacionImpor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoLiquidacionImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoLiquidacionImpor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalLiquidacionImpor);
		this.jInternalFrameReporteDinamicoLiquidacionImpor.getContentPane().add(this.jScrollPanelReporteDinamicoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionLiquidacionImpor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionLiquidacionImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionLiquidacionImpor.setName("jPanelImportacionLiquidacionImpor"); 
		
		this.jPanelImportacionLiquidacionImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionLiquidacionImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionLiquidacionImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionLiquidacionImpor.setLayout(gridaBagLayoutImportacionLiquidacionImpor);
		
		
		this.jInternalFrameImportacionLiquidacionImpor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionLiquidacionImpor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionLiquidacionImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteLiquidacionImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionLiquidacionImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionLiquidacionImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionLiquidacionImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionLiquidacionImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionLiquidacionImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionLiquidacionImpor.setResizable(true);
	    this.jInternalFrameImportacionLiquidacionImpor.setClosable(true);
	    this.jInternalFrameImportacionLiquidacionImpor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionLiquidacionImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionLiquidacionImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionLiquidacionImpor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionLiquidacionImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionLiquidacionImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionLiquidacionImpor.setResizable(true);
	    this.jInternalFrameImportacionLiquidacionImpor.setClosable(true);
	    this.jInternalFrameImportacionLiquidacionImpor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionLiquidacionImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionLiquidacionImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionLiquidacionImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Liquidacion Impores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionLiquidacionImpor = new JLabelMe();

		this.jLabelArchivoImportacionLiquidacionImpor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionLiquidacionImpor.add(this.jLabelArchivoImportacionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionLiquidacionImpor = new JFileChooser();		
		this.jFileChooserImportacionLiquidacionImpor.setToolTipText("ESCOGER ARCHIVO"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionLiquidacionImpor = new JButtonMe();
		this.jButtonAbrirImportacionLiquidacionImpor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionLiquidacionImpor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionLiquidacionImpor.setToolTipText("Generar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLiquidacionImpor.add(this.jButtonAbrirImportacionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionLiquidacionImpor = new JLabelMe();

		this.jLabelPathArchivoImportacionLiquidacionImpor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionLiquidacionImpor.add(this.jLabelPathArchivoImportacionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionLiquidacionImpor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionLiquidacionImpor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionLiquidacionImpor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionLiquidacionImpor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLiquidacionImpor.add(this.jTextFieldPathArchivoImportacionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionLiquidacionImpor = new JButtonMe();
		this.jButtonGenerarImportacionLiquidacionImpor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionLiquidacionImpor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionLiquidacionImpor.setToolTipText("Generar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLiquidacionImpor.add(this.jButtonGenerarImportacionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionLiquidacionImpor = new JButtonMe();
		this.jButtonCerrarImportacionLiquidacionImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionLiquidacionImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionLiquidacionImpor.setToolTipText("Cancelar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLiquidacionImpor.add(this.jButtonCerrarImportacionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalLiquidacionImpor = new GridBagLayout();
		
		this.jScrollPanelImportacionLiquidacionImpor= new JScrollPane(jPanelImportacionLiquidacionImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy =iPosYImportacion;
		this.gridBagConstraintsLiquidacionImpor.gridx =iPosXImportacion;
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionLiquidacionImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionLiquidacionImpor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalLiquidacionImpor);
		this.jInternalFrameImportacionLiquidacionImpor.getContentPane().add(this.jScrollPanelImportacionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByLiquidacionImpor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByLiquidacionImpor = new JButtonMe();
			this.jButtonAbrirOrderByLiquidacionImpor.setText("Orden");
			this.jButtonAbrirOrderByLiquidacionImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByLiquidacionImpor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByLiquidacionImpor";
			inputMap = this.jButtonAbrirOrderByLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByLiquidacionImpor"));
		
		
			GridBagLayout gridaBagLayoutOrderByLiquidacionImpor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByLiquidacionImpor.setName("jPanelOrderByLiquidacionImpor"); 
			
			this.jPanelOrderByLiquidacionImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByLiquidacionImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByLiquidacionImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByLiquidacionImpor.setLayout(gridaBagLayoutOrderByLiquidacionImpor);
			
			
			this.jTableDatosLiquidacionImporOrderBy = new JTableMe();        
			this.jTableDatosLiquidacionImporOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosLiquidacionImporOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosLiquidacionImporOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosLiquidacionImporOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosLiquidacionImporOrderBy.setViewportView(this.jTableDatosLiquidacionImporOrderBy);
			this.jTableDatosLiquidacionImporOrderBy.setFillsViewportHeight(true);
			this.jTableDatosLiquidacionImporOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByLiquidacionImpor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByLiquidacionImpor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByLiquidacionImpor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteLiquidacionImpor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByLiquidacionImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByLiquidacionImpor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByLiquidacionImpor.setTitle("Orden");
			this.jInternalFrameOrderByLiquidacionImpor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByLiquidacionImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByLiquidacionImpor.setResizable(true);
			this.jInternalFrameOrderByLiquidacionImpor.setClosable(true);
			this.jInternalFrameOrderByLiquidacionImpor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByLiquidacionImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByLiquidacionImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByLiquidacionImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Liquidacion Impores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsLiquidacionImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsLiquidacionImpor.ipady =150;
				
			this.jPanelOrderByLiquidacionImpor.add(jScrollPanelDatosLiquidacionImporOrderBy, this.gridBagConstraintsLiquidacionImpor);//this.jTableDatosLiquidacionImporTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByLiquidacionImpor = new JButtonMe();
			this.jButtonCerrarOrderByLiquidacionImpor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByLiquidacionImpor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByLiquidacionImpor.setToolTipText("Cancelar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsLiquidacionImpor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByLiquidacionImpor.add(this.jButtonCerrarOrderByLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalLiquidacionImpor = new GridBagLayout();
			
			this.jScrollPanelOrderByLiquidacionImpor= new JScrollPane(jPanelOrderByLiquidacionImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.gridy =iPosYOrderBy;
			this.gridBagConstraintsLiquidacionImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByLiquidacionImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByLiquidacionImpor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalLiquidacionImpor);
			
			this.jInternalFrameOrderByLiquidacionImpor.getContentPane().add(this.jScrollPanelOrderByLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);			
		
		} else {
			this.jButtonAbrirOrderByLiquidacionImpor = new JButtonMe();
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
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.liquidacionimporSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosLiquidacionImpor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosLiquidacionImpor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosLiquidacionImpor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosLiquidacionImpor.getRowHeight();//LiquidacionImporConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > LiquidacionImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaLiquidacionImpor.isSelected()) {
					iHeightTable=LiquidacionImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < LiquidacionImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=LiquidacionImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > LiquidacionImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaLiquidacionImpor.isSelected()) {
					iHeightTable=LiquidacionImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < LiquidacionImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=LiquidacionImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosLiquidacionImpor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosLiquidacionImpor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosLiquidacionImpor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosLiquidacionImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosLiquidacionImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosLiquidacionImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByLiquidacionImpor!=null && this.jInternalFrameOrderByLiquidacionImpor.getjTableDatosOrderBy()!=null) {
			//if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByLiquidacionImpor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByLiquidacionImpor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByLiquidacionImpor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByLiquidacionImpor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByLiquidacionImpor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByLiquidacionImpor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByLiquidacionImpor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosLiquidacionImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosLiquidacionImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosLiquidacionImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=liquidacionimporLogic.getLiquidacionImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=liquidacionimpors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<LiquidacionImpor> TraerLiquidacionImporBeans(List<LiquidacionImpor> liquidacionimpors,ArrayList<Classe> classes)throws Exception {
		try {
			for(LiquidacionImpor liquidacionimpor:liquidacionimpors) {
					
				if(!(LiquidacionImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || LiquidacionImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					liquidacionimpor.setsDetalleGeneralEntityReporte(LiquidacionImporConstantesFunciones.getLiquidacionImporDescripcion(liquidacionimpor));
										
						
					
					

					if(liquidacionimpor.getDetalleLiquidacionImpors()!=null && Funciones.existeClass(classes,DetalleLiquidacionImpor.class)) {
						try{liquidacionimpor.setdetalleliquidacionimporsDescripcionReporte(new JRBeanCollectionDataSource(DetalleLiquidacionImporJInternalFrame.TraerDetalleLiquidacionImporBeans(liquidacionimpor.getDetalleLiquidacionImpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//liquidacionimpor.setsDetalleGeneralEntityReporte(liquidacionimpor.getsDetalleGeneralEntityReporte());
										
				}
				
				//liquidacionimporbeans.add(liquidacionimporbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return liquidacionimpors;
    }
	//PARA REPORTES FIN
}
