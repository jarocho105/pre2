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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.importaciones.util.LiquidacionImpuestoImporConstantesFunciones;

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
public class LiquidacionImpuestoImporJInternalFrame extends LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarLiquidacionImpuestoImpor;
	
	protected JMenuBar jmenuBarLiquidacionImpuestoImpor;
	
	protected JMenu jmenuLiquidacionImpuestoImpor;
	protected JMenu jmenuDatosLiquidacionImpuestoImpor;
	protected JMenu jmenuArchivoLiquidacionImpuestoImpor;
	protected JMenu jmenuAccionesLiquidacionImpuestoImpor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutLiquidacionImpuestoImpor;	
	protected GridBagConstraints gridBagConstraintsLiquidacionImpuestoImpor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public LiquidacionImpuestoImporDetalleFormJInternalFrame jInternalFrameDetalleFormLiquidacionImpuestoImpor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoLiquidacionImpuestoImpor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionLiquidacionImpuestoImpor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedidocompraimpor="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";
	
	public LiquidacionImpuestoImporSessionBean liquidacionimpuestoimporSessionBean;
		
	
	
	public PedidoCompraImporSessionBean pedidocompraimporSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<LiquidacionImpuestoImpor> liquidacionimpuestoimpors;		
	public List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsEliminados;	
	public List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByLiquidacionImpuestoImpor;		
	protected JButton jButtonAbrirOrderByLiquidacionImpuestoImpor;
	
	
	//protected JPanel jPanelOrderByLiquidacionImpuestoImpor;
	//public JScrollPane jScrollPanelOrderByLiquidacionImpuestoImpor;	
	//protected JButton jButtonCerrarOrderByLiquidacionImpuestoImpor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public LiquidacionImpuestoImporLogic liquidacionimpuestoimporLogic;
	
	
	
	public JScrollPane jScrollPanelDatosLiquidacionImpuestoImpor;
	public JScrollPane jScrollPanelDatosEdicionLiquidacionImpuestoImpor;
	public JScrollPane jScrollPanelDatosGeneralLiquidacionImpuestoImpor;
    
	
	
	//public JScrollPane jScrollPanelDatosLiquidacionImpuestoImporOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoLiquidacionImpuestoImpor;
	//public JScrollPane jScrollPanelImportacionLiquidacionImpuestoImpor;
	
	
	
	protected JPanel jPanelAccionesLiquidacionImpuestoImpor;
	
    protected JPanel jPanelPaginacionLiquidacionImpuestoImpor;
    protected JPanel jPanelParametrosReportesLiquidacionImpuestoImpor;
	protected JPanel jPanelParametrosReportesAccionesLiquidacionImpuestoImpor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1LiquidacionImpuestoImpor;
	protected JPanel jPanelParametrosAuxiliar2LiquidacionImpuestoImpor;
	protected JPanel jPanelParametrosAuxiliar3LiquidacionImpuestoImpor;
	protected JPanel jPanelParametrosAuxiliar4LiquidacionImpuestoImpor;
	//protected JPanel jPanelParametrosAuxiliar5LiquidacionImpuestoImpor;
	
	
	
	//protected JPanel jPanelReporteDinamicoLiquidacionImpuestoImpor;
	//protected JPanel jPanelImportacionLiquidacionImpuestoImpor;
	
	
	public JTable jTableDatosLiquidacionImpuestoImpor;
	
	
	
	//public JTable jTableDatosLiquidacionImpuestoImporOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoLiquidacionImpuestoImpor;
	protected JButton jButtonDuplicarLiquidacionImpuestoImpor;
	protected JButton jButtonCopiarLiquidacionImpuestoImpor;
	protected JButton jButtonVerFormLiquidacionImpuestoImpor;
	protected JButton jButtonNuevoRelacionesLiquidacionImpuestoImpor;
	protected JButton jButtonModificarLiquidacionImpuestoImpor;
	
    protected JButton jButtonGuardarCambiosTablaLiquidacionImpuestoImpor;
	protected JButton jButtonCerrarLiquidacionImpuestoImpor;
	
	
	protected JButton jButtonRecargarInformacionLiquidacionImpuestoImpor;
	protected JButton jButtonProcesarInformacionLiquidacionImpuestoImpor;
	
	
	protected JButton jButtonAnterioresLiquidacionImpuestoImpor;
	protected JButton jButtonSiguientesLiquidacionImpuestoImpor;
	protected JButton jButtonNuevoGuardarCambiosLiquidacionImpuestoImpor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoLiquidacionImpuestoImpor;
	//protected JButton jButtonCerrarReporteDinamicoLiquidacionImpuestoImpor;
	//protected JButton jButtonGenerarExcelReporteDinamicoLiquidacionImpuestoImpor;	
	
	
	
	//protected JButton jButtonAbrirImportacionLiquidacionImpuestoImpor;
	//protected JButton jButtonGenerarImportacionLiquidacionImpuestoImpor;
	//protected JButton jButtonCerrarImportacionLiquidacionImpuestoImpor;
	//protected JFileChooser jFileChooserImportacionLiquidacionImpuestoImpor;
	//protected File fileImportacionLiquidacionImpuestoImpor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonDuplicarToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonNuevoRelacionesToolBarLiquidacionImpuestoImpor;
	
	
	public JButton jButtonGuardarCambiosToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonCopiarToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonVerFormToolBarLiquidacionImpuestoImpor;
	public JButton jButtonGuardarCambiosTablaToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonCerrarToolBarLiquidacionImpuestoImpor;
	
	protected JButton jButtonRecargarInformacionToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonProcesarInformacionToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonAnterioresToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonSiguientesToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonNuevoGuardarCambiosToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonAbrirOrderByToolBarLiquidacionImpuestoImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemDuplicarLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemNuevoRelacionesLiquidacionImpuestoImpor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemCopiarLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemVerFormLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemCerrarLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemDetalleCerrarLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarLiquidacionImpuestoImpor;
	
	protected JMenuItem jMenuItemRecargarInformacionLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemProcesarInformacionLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemAnterioresLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemSiguientesLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemAbrirOrderByLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemMostrarOcultarLiquidacionImpuestoImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesLiquidacionImpuestoImpor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor;
	protected JCheckBox jCheckBoxSeleccionadosLiquidacionImpuestoImpor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaLiquidacionImpuestoImpor;
	protected JCheckBox jCheckBoxConGraficoReporteLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesLiquidacionImpuestoImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoLiquidacionImpuestoImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarLiquidacionImpuestoImpor;
	protected JTextField jTextFieldValorCampoGeneralLiquidacionImpuestoImpor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteLiquidacionImpuestoImpor;
	//public JList<Reporte> jListColumnasSelectReporteLiquidacionImpuestoImpor;
	//public JScrollPane jScrollColumnasSelectReporteLiquidacionImpuestoImpor;
	
	//public JLabel jLabelRelacionesSelectReporteLiquidacionImpuestoImpor;
	//public JList<Reporte> jListRelacionesSelectReporteLiquidacionImpuestoImpor;
	//public JScrollPane jScrollRelacionesSelectReporteLiquidacionImpuestoImpor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoLiquidacionImpuestoImpor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoLiquidacionImpuestoImpor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoLiquidacionImpuestoImpor;
	//public JLabel jLabelTiposArchivoReporteDinamicoLiquidacionImpuestoImpor;
	
		
	//public JLabel jLabelArchivoImportacionLiquidacionImpuestoImpor;	
	//public JLabel jLabelPathArchivoImportacionLiquidacionImpuestoImpor;
	//protected JTextField jTextFieldPathArchivoImportacionLiquidacionImpuestoImpor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoLiquidacionImpuestoImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoLiquidacionImpuestoImpor;
	
	//public JLabel jLabelColumnaCategoriaValorLiquidacionImpuestoImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorLiquidacionImpuestoImpor;
	
	//public JLabel jLabelColumnasValoresGraficoLiquidacionImpuestoImpor;
	//public JList<Reporte> jListColumnasValoresGraficoLiquidacionImpuestoImpor;
	//public JScrollPane jScrollColumnasValoresGraficoLiquidacionImpuestoImpor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoLiquidacionImpuestoImpor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoLiquidacionImpuestoImpor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasLiquidacionImpuestoImpor;
	public JPanel jPanelFK_IdClienteLiquidacionImpuestoImpor;
	public JButton jButtonFK_IdClienteLiquidacionImpuestoImpor;
	public JPanel jPanelFK_IdFacturaLiquidacionImpuestoImpor;
	public JButton jButtonFK_IdFacturaLiquidacionImpuestoImpor;
	public JPanel jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor;
	public JButton jButtonFK_IdPedidoCompraImporLiquidacionImpuestoImpor;
	
	public JPanel jPanelid_clienteFK_IdClienteLiquidacionImpuestoImpor;
	public JLabel jLabelid_clienteFK_IdClienteLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor;
	public JButton jButtonid_clienteFK_IdClienteLiquidacionImpuestoImpor= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteLiquidacionImpuestoImporUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteLiquidacionImpuestoImpor;
	
	public JPanel jPanelid_facturaFK_IdFacturaLiquidacionImpuestoImpor;
	public JLabel jLabelid_facturaFK_IdFacturaLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor;
	public JButton jButtonid_facturaFK_IdFacturaLiquidacionImpuestoImpor= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaLiquidacionImpuestoImporUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaLiquidacionImpuestoImpor;
	
	public JPanel jPanelid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor;
	public JLabel jLabelid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor;
	public JButton jButtonid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor= new JButtonMe();
	public JButton jButtonid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImporUpdate= new JButtonMe();
	public JButton jButtonid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImporBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public LiquidacionImpuestoImporJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("LiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LiquidacionImpuestoImporJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LiquidacionImpuestoImporJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LiquidacionImpuestoImporJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("LiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionLiquidacionImpuestoImpor)	{
		this.jButtonRecargarInformacionLiquidacionImpuestoImpor = jButtonRecargarInformacionLiquidacionImpuestoImpor;
	}
	
	public JButton getjButtonProcesarInformacionLiquidacionImpuestoImpor() {
		return this.jButtonProcesarInformacionLiquidacionImpuestoImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionLiquidacionImpuestoImpor)	{
		this.jButtonProcesarInformacionLiquidacionImpuestoImpor = jButtonProcesarInformacionLiquidacionImpuestoImpor;
	}
	
	
	public JButton getjButtonRecargarInformacionLiquidacionImpuestoImpor() {
		return this.jButtonRecargarInformacionLiquidacionImpuestoImpor;
	}
	
	
	public List<LiquidacionImpuestoImpor> getliquidacionimpuestoimpors() {
		return this.liquidacionimpuestoimpors;
	}

	public void setliquidacionimpuestoimpors(List<LiquidacionImpuestoImpor> liquidacionimpuestoimpors) {
		this.liquidacionimpuestoimpors = liquidacionimpuestoimpors;
	}
	
	public List<LiquidacionImpuestoImpor> getliquidacionimpuestoimporsAux() {
		return this.liquidacionimpuestoimporsAux;
	}

	public void setliquidacionimpuestoimporsAux(List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsAux) {
		this.liquidacionimpuestoimporsAux = liquidacionimpuestoimporsAux;
	}
	
	public List<LiquidacionImpuestoImpor> getliquidacionimpuestoimporsEliminados() {
		return this.liquidacionimpuestoimporsEliminados;
	}

	public void setLiquidacionImpuestoImporsEliminados(List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsEliminados) {
		this.liquidacionimpuestoimporsEliminados = liquidacionimpuestoimporsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarLiquidacionImpuestoImpor() {
		return jComboBoxTiposSeleccionarLiquidacionImpuestoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposSeleccionarLiquidacionImpuestoImpor) {
		this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor = jComboBoxTiposSeleccionarLiquidacionImpuestoImpor;
	}
	
	public void setBorderResaltarTiposSeleccionarLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralLiquidacionImpuestoImpor() {
		return jTextFieldValorCampoGeneralLiquidacionImpuestoImpor;
	}

	public void setjTextFieldValorCampoGeneralLiquidacionImpuestoImpor(
			JTextField jTextFieldValorCampoGeneralLiquidacionImpuestoImpor) {
		this.jTextFieldValorCampoGeneralLiquidacionImpuestoImpor = jTextFieldValorCampoGeneralLiquidacionImpuestoImpor;
	}

	public void setBorderResaltarValorCampoGeneralLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosLiquidacionImpuestoImpor() {
		return this.jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor;
	}

	public void setjCheckBoxSeleccionarTodosLiquidacionImpuestoImpor(
			JCheckBox jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor) {
		this.jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor = jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor;
	}

	public void setBorderResaltarSeleccionarTodosLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosLiquidacionImpuestoImpor() {
		return this.jCheckBoxSeleccionadosLiquidacionImpuestoImpor;
	}

	public void setjCheckBoxSeleccionadosLiquidacionImpuestoImpor(
			JCheckBox jCheckBoxSeleccionadosLiquidacionImpuestoImpor) {
		this.jCheckBoxSeleccionadosLiquidacionImpuestoImpor = jCheckBoxSeleccionadosLiquidacionImpuestoImpor;
	}
	
	public void setBorderResaltarSeleccionadosLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesLiquidacionImpuestoImpor() {
		return this.jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor) {
		this.jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor = jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor;
	}

	public void setBorderResaltarTiposArchivosReportesLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesLiquidacionImpuestoImpor() {
		return this.jComboBoxTiposReportesLiquidacionImpuestoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposReportesLiquidacionImpuestoImpor) {
		this.jComboBoxTiposReportesLiquidacionImpuestoImpor = jComboBoxTiposReportesLiquidacionImpuestoImpor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoLiquidacionImpuestoImpor() {
	//	return jComboBoxTiposReportesDinamicoLiquidacionImpuestoImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoLiquidacionImpuestoImpor(
	//		JComboBox jComboBoxTiposReportesDinamicoLiquidacionImpuestoImpor) {
	//	this.jComboBoxTiposReportesDinamicoLiquidacionImpuestoImpor = jComboBoxTiposReportesDinamicoLiquidacionImpuestoImpor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoLiquidacionImpuestoImpor() {
	//	return jComboBoxTiposArchivosReportesDinamicoLiquidacionImpuestoImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoLiquidacionImpuestoImpor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoLiquidacionImpuestoImpor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoLiquidacionImpuestoImpor = jComboBoxTiposArchivosReportesDinamicoLiquidacionImpuestoImpor;
	//}
	
	public void setBorderResaltarTiposReportesLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesLiquidacionImpuestoImpor() {
		return this.jComboBoxTiposGraficosReportesLiquidacionImpuestoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposGraficosReportesLiquidacionImpuestoImpor) {
		this.jComboBoxTiposGraficosReportesLiquidacionImpuestoImpor = jComboBoxTiposGraficosReportesLiquidacionImpuestoImpor;
	}
	
	public void setBorderResaltarTiposGraficosReportesLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionLiquidacionImpuestoImpor() {
		return this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposPaginacionLiquidacionImpuestoImpor) {
		this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor = jComboBoxTiposPaginacionLiquidacionImpuestoImpor;
	}
	
	public void setBorderResaltarTiposPaginacionLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesLiquidacionImpuestoImpor() {
		return this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesLiquidacionImpuestoImpor() {
		return this.jComboBoxTiposAccionesLiquidacionImpuestoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposRelacionesLiquidacionImpuestoImpor) {
		this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor = jComboBoxTiposRelacionesLiquidacionImpuestoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposAccionesLiquidacionImpuestoImpor) {
		this.jComboBoxTiposAccionesLiquidacionImpuestoImpor = jComboBoxTiposAccionesLiquidacionImpuestoImpor;
	}
	
	public void setBorderResaltarTiposRelacionesLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoLiquidacionImpuestoImpor() {
	//	return jCheckBoxConGraficoDinamicoLiquidacionImpuestoImpor;
	//}

	//public void setjCheckBoxConGraficoDinamicoLiquidacionImpuestoImpor(
	//		JCheckBox jCheckBoxConGraficoDinamicoLiquidacionImpuestoImpor) {
	//	this.jCheckBoxConGraficoDinamicoLiquidacionImpuestoImpor = jCheckBoxConGraficoDinamicoLiquidacionImpuestoImpor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoLiquidacionImpuestoImpor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarLiquidacionImpuestoImpor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoLiquidacionImpuestoImpor .setBorder(borderResaltar);		
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
		this.liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
		
		this.liquidacionimpuestoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.liquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=LiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=LiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		LiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		LiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		LiquidacionImpuestoImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Liquidacion Impuesto Impor MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
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
		
		LiquidacionImpuestoImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("LiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarLiquidacionImpuestoImpor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarLiquidacionImpuestoImpor,this.jTtoolBarLiquidacionImpuestoImpor,
							"nuevo","nuevo","Nuevo"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarLiquidacionImpuestoImpor,this.jTtoolBarLiquidacionImpuestoImpor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarLiquidacionImpuestoImpor,this.jTtoolBarLiquidacionImpuestoImpor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarLiquidacionImpuestoImpor,this.jTtoolBarLiquidacionImpuestoImpor,
							"duplicar","duplicar","Duplicar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarLiquidacionImpuestoImpor,this.jTtoolBarLiquidacionImpuestoImpor,
							"copiar","copiar","Copiar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarLiquidacionImpuestoImpor,this.jTtoolBarLiquidacionImpuestoImpor,
							"ver_form","ver_form","Ver"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLiquidacionImpuestoImpor,this.jTtoolBarLiquidacionImpuestoImpor,
							"recargar","recargar","Recargar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLiquidacionImpuestoImpor,this.jTtoolBarLiquidacionImpuestoImpor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLiquidacionImpuestoImpor,this.jTtoolBarLiquidacionImpuestoImpor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarLiquidacionImpuestoImpor,this.jTtoolBarLiquidacionImpuestoImpor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarLiquidacionImpuestoImpor,this.jTtoolBarLiquidacionImpuestoImpor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarLiquidacionImpuestoImpor,this.jTtoolBarLiquidacionImpuestoImpor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarLiquidacionImpuestoImpor,this.jTtoolBarLiquidacionImpuestoImpor,
							"cerrar","cerrar","Salir"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarLiquidacionImpuestoImpor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarLiquidacionImpuestoImpor;
			
				this.jButtonProcesarInformacionToolBarLiquidacionImpuestoImpor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarLiquidacionImpuestoImpor;
				
		//protected JButton jButtonModificarToolBarLiquidacionImpuestoImpor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarLiquidacionImpuestoImpor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuLiquidacionImpuestoImpor=new JMenuMe("General");
		this.jmenuArchivoLiquidacionImpuestoImpor=new JMenuMe("Archivo");
		this.jmenuAccionesLiquidacionImpuestoImpor=new JMenuMe("Acciones");
		this.jmenuDatosLiquidacionImpuestoImpor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoLiquidacionImpuestoImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoLiquidacionImpuestoImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoLiquidacionImpuestoImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarLiquidacionImpuestoImpor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarLiquidacionImpuestoImpor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarLiquidacionImpuestoImpor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesLiquidacionImpuestoImpor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesLiquidacionImpuestoImpor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesLiquidacionImpuestoImpor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosLiquidacionImpuestoImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosLiquidacionImpuestoImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosLiquidacionImpuestoImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarLiquidacionImpuestoImpor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarLiquidacionImpuestoImpor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarLiquidacionImpuestoImpor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormLiquidacionImpuestoImpor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormLiquidacionImpuestoImpor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormLiquidacionImpuestoImpor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaLiquidacionImpuestoImpor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaLiquidacionImpuestoImpor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaLiquidacionImpuestoImpor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarLiquidacionImpuestoImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarLiquidacionImpuestoImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarLiquidacionImpuestoImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionLiquidacionImpuestoImpor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionLiquidacionImpuestoImpor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionLiquidacionImpuestoImpor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionLiquidacionImpuestoImpor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionLiquidacionImpuestoImpor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionLiquidacionImpuestoImpor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresLiquidacionImpuestoImpor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresLiquidacionImpuestoImpor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresLiquidacionImpuestoImpor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesLiquidacionImpuestoImpor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesLiquidacionImpuestoImpor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesLiquidacionImpuestoImpor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByLiquidacionImpuestoImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByLiquidacionImpuestoImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByLiquidacionImpuestoImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarLiquidacionImpuestoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarLiquidacionImpuestoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarLiquidacionImpuestoImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByLiquidacionImpuestoImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByLiquidacionImpuestoImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByLiquidacionImpuestoImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarLiquidacionImpuestoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarLiquidacionImpuestoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarLiquidacionImpuestoImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosLiquidacionImpuestoImpor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosLiquidacionImpuestoImpor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosLiquidacionImpuestoImpor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoLiquidacionImpuestoImpor.add(this.jMenuItemCerrarLiquidacionImpuestoImpor);
			
			this.jmenuAccionesLiquidacionImpuestoImpor.add(this.jMenuItemNuevoLiquidacionImpuestoImpor);
			this.jmenuAccionesLiquidacionImpuestoImpor.add(this.jMenuItemNuevoGuardarCambiosLiquidacionImpuestoImpor);
			this.jmenuAccionesLiquidacionImpuestoImpor.add(this.jMenuItemNuevoRelacionesLiquidacionImpuestoImpor);
			this.jmenuAccionesLiquidacionImpuestoImpor.add(this.jMenuItemGuardarCambiosTablaLiquidacionImpuestoImpor);		
			this.jmenuAccionesLiquidacionImpuestoImpor.add(this.jMenuItemDuplicarLiquidacionImpuestoImpor);		
			this.jmenuAccionesLiquidacionImpuestoImpor.add(this.jMenuItemCopiarLiquidacionImpuestoImpor);		
			this.jmenuAccionesLiquidacionImpuestoImpor.add(this.jMenuItemVerFormLiquidacionImpuestoImpor);		
			
			this.jmenuDatosLiquidacionImpuestoImpor.add(this.jMenuItemRecargarInformacionLiquidacionImpuestoImpor);				
			this.jmenuDatosLiquidacionImpuestoImpor.add(this.jMenuItemAnterioresLiquidacionImpuestoImpor);				
			this.jmenuDatosLiquidacionImpuestoImpor.add(this.jMenuItemSiguientesLiquidacionImpuestoImpor);				
			this.jmenuDatosLiquidacionImpuestoImpor.add(this.jMenuItemAbrirOrderByLiquidacionImpuestoImpor);				
			this.jmenuDatosLiquidacionImpuestoImpor.add(this.jMenuItemMostrarOcultarLiquidacionImpuestoImpor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesLiquidacionImpuestoImpor.add(this.jMenuItemGuardarCambiosLiquidacionImpuestoImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarLiquidacionImpuestoImpor.add(this.jmenuArchivoLiquidacionImpuestoImpor);		
			this.jmenuBarLiquidacionImpuestoImpor.add(this.jmenuAccionesLiquidacionImpuestoImpor);		
			this.jmenuBarLiquidacionImpuestoImpor.add(this.jmenuDatosLiquidacionImpuestoImpor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarLiquidacionImpuestoImpor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasLiquidacionImpuestoImpor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteLiquidacionImpuestoImpor.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteLiquidacionImpuestoImpor= new JButtonMe();
		this.jButtonFK_IdClienteLiquidacionImpuestoImpor.setText("Buscar");
		this.jButtonFK_IdClienteLiquidacionImpuestoImpor.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteLiquidacionImpuestoImpor,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteLiquidacionImpuestoImpor = new JLabelMe();
		jLabelid_clienteFK_IdClienteLiquidacionImpuestoImpor.setText("Cliente :");
		jLabelid_clienteFK_IdClienteLiquidacionImpuestoImpor.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteLiquidacionImpuestoImpor= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteLiquidacionImpuestoImpor.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteLiquidacionImpuestoImpor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteLiquidacionImpuestoImpor.setFocusable(false);

		this.jPanelFK_IdFacturaLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaLiquidacionImpuestoImpor.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaLiquidacionImpuestoImpor= new JButtonMe();
		this.jButtonFK_IdFacturaLiquidacionImpuestoImpor.setText("Buscar");
		this.jButtonFK_IdFacturaLiquidacionImpuestoImpor.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaLiquidacionImpuestoImpor,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaLiquidacionImpuestoImpor = new JLabelMe();
		jLabelid_facturaFK_IdFacturaLiquidacionImpuestoImpor.setText("Factura :");
		jLabelid_facturaFK_IdFacturaLiquidacionImpuestoImpor.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaLiquidacionImpuestoImpor= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaLiquidacionImpuestoImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaLiquidacionImpuestoImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaLiquidacionImpuestoImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaLiquidacionImpuestoImpor.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaLiquidacionImpuestoImpor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaLiquidacionImpuestoImpor.setFocusable(false);

		this.jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setToolTipText("Buscar Por Pedo Compra Impor ");
		this.jButtonFK_IdPedidoCompraImporLiquidacionImpuestoImpor= new JButtonMe();
		this.jButtonFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setText("Buscar");
		this.jButtonFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setToolTipText("Buscar Por Pedo Compra Impor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPedidoCompraImporLiquidacionImpuestoImpor,"buscar_button","Buscar Por Pedo Compra Impor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPedidoCompraImporLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor = new JLabelMe();
		jLabelid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setText("Pedo Compra Impor :");
		jLabelid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setToolTipText("Pedo Compra Impor");
		jLabelid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor= new JComboBoxMe();
		jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasLiquidacionImpuestoImpor=new JTabbedPane();


		this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleLiquidacionImpuestoImpor = new LiquidacionImpuestoImporDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Liquidacion Impuesto Impor DATOS");
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor = new LiquidacionImpuestoImporDetalleFormJInternalFrame(jDesktopPane,this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones(),this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor = null;//new LiquidacionImpuestoImporDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutLiquidacionImpuestoImpor= new GridBagLayout();
		
		
		this.jTableDatosLiquidacionImpuestoImpor = new JTableMe();      
		
		String sToolTipLiquidacionImpuestoImpor="";
		sToolTipLiquidacionImpuestoImpor=LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipLiquidacionImpuestoImpor+="(Importaciones.LiquidacionImpuestoImpor)";
		}
		
		if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipLiquidacionImpuestoImpor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosLiquidacionImpuestoImpor.setToolTipText(sToolTipLiquidacionImpuestoImpor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosLiquidacionImpuestoImpor);
		this.jTableDatosLiquidacionImpuestoImpor.setAutoCreateRowSorter(true);
		this.jTableDatosLiquidacionImpuestoImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosLiquidacionImpuestoImpor.setRowSelectionAllowed(true);
		this.jTableDatosLiquidacionImpuestoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonDuplicarLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonCopiarLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonVerFormLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonNuevoRelacionesLiquidacionImpuestoImpor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonCerrarLiquidacionImpuestoImpor = new JButtonMe();
		
		this.jScrollPanelDatosLiquidacionImpuestoImpor = new JScrollPane();   
        this.jScrollPanelDatosGeneralLiquidacionImpuestoImpor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Liquidacion Impuesto Impor";
		
		if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Liquidacion Impuesto Impores" + this.sPath));
		} else {
			this.jScrollPanelDatosLiquidacionImpuestoImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesLiquidacionImpuestoImpor.setToolTipText("Acciones");
        this.jPanelAccionesLiquidacionImpuestoImpor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor=new ReporteDinamicoJInternalFrame(LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoLiquidacionImpuestoImpor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionLiquidacionImpuestoImpor=new ImportacionJInternalFrame(LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionLiquidacionImpuestoImpor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByLiquidacionImpuestoImpor = new JButtonMe();
		
		this.jButtonAbrirOrderByLiquidacionImpuestoImpor.setText("Orden");
		this.jButtonAbrirOrderByLiquidacionImpuestoImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByLiquidacionImpuestoImpor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByLiquidacionImpuestoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLiquidacionImpuestoImpor,false,this);
			
			//this.cargarOrderByLiquidacionImpuestoImpor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByLiquidacionImpuestoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLiquidacionImpuestoImpor,true,this);
			
			//this.cargarOrderByLiquidacionImpuestoImpor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosLiquidacionImpuestoImpor.setMinimumSize(new Dimension(400,50));//1830
		this.jTableDatosLiquidacionImpuestoImpor.setMaximumSize(new Dimension(400,50));//1830
		this.jTableDatosLiquidacionImpuestoImpor.setPreferredSize(new Dimension(400,50));//1830
		
		this.jScrollPanelDatosLiquidacionImpuestoImpor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosLiquidacionImpuestoImpor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosLiquidacionImpuestoImpor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoLiquidacionImpuestoImpor.setText("Nuevo");
		this.jButtonDuplicarLiquidacionImpuestoImpor.setText("Duplicar");
		this.jButtonCopiarLiquidacionImpuestoImpor.setText("Copiar");
		this.jButtonVerFormLiquidacionImpuestoImpor.setText("Ver");
		this.jButtonNuevoRelacionesLiquidacionImpuestoImpor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor.setText("Guardar");
		this.jButtonCerrarLiquidacionImpuestoImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoLiquidacionImpuestoImpor,"nuevo_button","Nuevo",this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarLiquidacionImpuestoImpor,"duplicar_button","Duplicar",this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarLiquidacionImpuestoImpor,"copiar_button","Copiar",this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormLiquidacionImpuestoImpor,"ver_form","Ver",this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesLiquidacionImpuestoImpor,"nuevorelaciones_button","Nuevo Rel",this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor,"guardarcambiostabla_button","Guardar",this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarLiquidacionImpuestoImpor,"cerrar_button","Salir",this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoLiquidacionImpuestoImpor.setToolTipText("Nuevo"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarLiquidacionImpuestoImpor.setToolTipText("Duplicar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarLiquidacionImpuestoImpor.setToolTipText("Copiar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormLiquidacionImpuestoImpor.setToolTipText("Ver"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesLiquidacionImpuestoImpor.setToolTipText("Nuevo Rel"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor.setToolTipText("Guardar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarLiquidacionImpuestoImpor.setToolTipText("Salir"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoLiquidacionImpuestoImpor";
		inputMap = this.jButtonNuevoLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoLiquidacionImpuestoImpor"));
		
		//DUPLICAR
		sMapKey = "DuplicarLiquidacionImpuestoImpor";
		inputMap = this.jButtonDuplicarLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarLiquidacionImpuestoImpor"));
		
		//COPIAR
		sMapKey = "CopiarLiquidacionImpuestoImpor";
		inputMap = this.jButtonCopiarLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarLiquidacionImpuestoImpor"));
		
		//VEr FORM
		sMapKey = "VerFormLiquidacionImpuestoImpor";
		inputMap = this.jButtonVerFormLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormLiquidacionImpuestoImpor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesLiquidacionImpuestoImpor";
		inputMap = this.jButtonNuevoRelacionesLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesLiquidacionImpuestoImpor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarLiquidacionImpuestoImpor";
		inputMap = this.jButtonModificarLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarLiquidacionImpuestoImpor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarLiquidacionImpuestoImpor";
		inputMap = this.jButtonCerrarLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarLiquidacionImpuestoImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaLiquidacionImpuestoImpor";
		inputMap = this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaLiquidacionImpuestoImpor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1LiquidacionImpuestoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2LiquidacionImpuestoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3LiquidacionImpuestoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4LiquidacionImpuestoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5LiquidacionImpuestoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesLiquidacionImpuestoImpor.setName("jPanelParametrosReportesLiquidacionImpuestoImpor"); 
		
		this.jPanelParametrosReportesAccionesLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesLiquidacionImpuestoImpor.setName("jPanelParametrosReportesAccionesLiquidacionImpuestoImpor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonRecargarInformacionLiquidacionImpuestoImpor.setText("Recargar");
		this.jButtonRecargarInformacionLiquidacionImpuestoImpor.setToolTipText("Recargar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionLiquidacionImpuestoImpor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonProcesarInformacionLiquidacionImpuestoImpor.setText("Procesar");
		this.jButtonProcesarInformacionLiquidacionImpuestoImpor.setToolTipText("Procesar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionLiquidacionImpuestoImpor.setVisible(false);
			
		this.jButtonProcesarInformacionLiquidacionImpuestoImpor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionLiquidacionImpuestoImpor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionLiquidacionImpuestoImpor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor.setText("TIPO");       
		this.jComboBoxTiposReportesLiquidacionImpuestoImpor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesLiquidacionImpuestoImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor.setText("Paginacion");
		this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor.setText("Accion");
		this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setText("Accion");
		this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor.setText("Accion");
		this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralLiquidacionImpuestoImpor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralLiquidacionImpuestoImpor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralLiquidacionImpuestoImpor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralLiquidacionImpuestoImpor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesLiquidacionImpuestoImpor = new JLabelMe();
		
		this.jLabelAccionesLiquidacionImpuestoImpor.setText("Acciones");		
		this.jLabelAccionesLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosLiquidacionImpuestoImpor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosLiquidacionImpuestoImpor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosLiquidacionImpuestoImpor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaLiquidacionImpuestoImpor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaLiquidacionImpuestoImpor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaLiquidacionImpuestoImpor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteLiquidacionImpuestoImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteLiquidacionImpuestoImpor.setText("Graf.");
		this.jCheckBoxConGraficoReporteLiquidacionImpuestoImpor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresLiquidacionImpuestoImpor = new JButtonMe();
		//this.jButtonAnterioresLiquidacionImpuestoImpor.setText("<<");
        this.jButtonAnterioresLiquidacionImpuestoImpor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresLiquidacionImpuestoImpor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesLiquidacionImpuestoImpor = new JButtonMe();
		//this.jButtonSiguientesLiquidacionImpuestoImpor.setText(">>");
        this.jButtonSiguientesLiquidacionImpuestoImpor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesLiquidacionImpuestoImpor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosLiquidacionImpuestoImpor.setText("Nue");
        this.jButtonNuevoGuardarCambiosLiquidacionImpuestoImpor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosLiquidacionImpuestoImpor,"nuevoguardarcambios_button","Nue",this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosLiquidacionImpuestoImpor";
		inputMap = this.jButtonNuevoGuardarCambiosLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosLiquidacionImpuestoImpor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionLiquidacionImpuestoImpor";
		inputMap = this.jButtonRecargarInformacionLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionLiquidacionImpuestoImpor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesLiquidacionImpuestoImpor";
		inputMap = this.jButtonSiguientesLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesLiquidacionImpuestoImpor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresLiquidacionImpuestoImpor";
		inputMap = this.jButtonAnterioresLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresLiquidacionImpuestoImpor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasLiquidacionImpuestoImpor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesLiquidacionImpuestoImpor.setMinimumSize(new Dimension(this.getWidth(),LiquidacionImpuestoImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LiquidacionImpuestoImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesLiquidacionImpuestoImpor.setMaximumSize(new Dimension(this.getWidth(),LiquidacionImpuestoImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LiquidacionImpuestoImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesLiquidacionImpuestoImpor.setPreferredSize(new Dimension(this.getWidth(),LiquidacionImpuestoImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LiquidacionImpuestoImporBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionLiquidacionImpuestoImpor = new GridBagLayout();

			this.jPanelPaginacionLiquidacionImpuestoImpor.setLayout(gridaBagLayoutPaginacionLiquidacionImpuestoImpor);						
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionLiquidacionImpuestoImpor.add(this.jButtonAnterioresLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
					
						
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
			
			this.jPanelPaginacionLiquidacionImpuestoImpor.add(this.jButtonNuevoGuardarCambiosLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
						
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
			this.jPanelPaginacionLiquidacionImpuestoImpor.add(this.jButtonSiguientesLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 1;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLiquidacionImpuestoImpor.add(this.jButtonNuevoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
				this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 1;
				this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionLiquidacionImpuestoImpor.add(this.jButtonNuevoRelacionesLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
			}
			
			
			if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
				this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 1;
				this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionLiquidacionImpuestoImpor.add(this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
			}
			
			
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 1;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLiquidacionImpuestoImpor.add(this.jButtonDuplicarLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 1;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLiquidacionImpuestoImpor.add(this.jButtonCopiarLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 1;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLiquidacionImpuestoImpor.add(this.jButtonVerFormLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 1;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionLiquidacionImpuestoImpor.add(this.jButtonCerrarLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
		
		
		this.jButtonRecargarInformacionLiquidacionImpuestoImpor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionLiquidacionImpuestoImpor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionLiquidacionImpuestoImpor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesLiquidacionImpuestoImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesLiquidacionImpuestoImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesLiquidacionImpuestoImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesLiquidacionImpuestoImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesLiquidacionImpuestoImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesLiquidacionImpuestoImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaLiquidacionImpuestoImpor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaLiquidacionImpuestoImpor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaLiquidacionImpuestoImpor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosLiquidacionImpuestoImpor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosLiquidacionImpuestoImpor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosLiquidacionImpuestoImpor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesLiquidacionImpuestoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesLiquidacionImpuestoImpor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1LiquidacionImpuestoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2LiquidacionImpuestoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3LiquidacionImpuestoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4LiquidacionImpuestoImpor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesLiquidacionImpuestoImpor.setLayout(gridaBagParametrosReportesLiquidacionImpuestoImpor);
			this.jPanelParametrosReportesAccionesLiquidacionImpuestoImpor.setLayout(gridaBagParametrosReportesAccionesLiquidacionImpuestoImpor);
			
			
			this.jPanelParametrosAuxiliar1LiquidacionImpuestoImpor.setLayout(gridaBagParametrosAuxiliar1LiquidacionImpuestoImpor);
			this.jPanelParametrosAuxiliar2LiquidacionImpuestoImpor.setLayout(gridaBagParametrosAuxiliar2LiquidacionImpuestoImpor);
			this.jPanelParametrosAuxiliar3LiquidacionImpuestoImpor.setLayout(gridaBagParametrosAuxiliar3LiquidacionImpuestoImpor);
			this.jPanelParametrosAuxiliar4LiquidacionImpuestoImpor.setLayout(gridaBagParametrosAuxiliar4LiquidacionImpuestoImpor);
			//this.jPanelParametrosAuxiliar5LiquidacionImpuestoImpor.setLayout(gridaBagParametrosAuxiliar2LiquidacionImpuestoImpor);			
			
			
			
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLiquidacionImpuestoImpor.add(this.jButtonRecargarInformacionLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LiquidacionImpuestoImpor.add(this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LiquidacionImpuestoImpor.add(this.jCheckBoxConAltoMaximoTablaLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LiquidacionImpuestoImpor.add(this.jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLiquidacionImpuestoImpor.add(this.jPanelParametrosAuxiliar1LiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4LiquidacionImpuestoImpor.add(this.jComboBoxTiposReportesLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);																		
			
			
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4LiquidacionImpuestoImpor.add(this.jComboBoxTiposGraficosReportesLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLiquidacionImpuestoImpor.add(this.jPanelParametrosAuxiliar4LiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLiquidacionImpuestoImpor.add(this.jComboBoxTiposReportesLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLiquidacionImpuestoImpor.add(this.jCheckBoxGenerarReporteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLiquidacionImpuestoImpor.add(this.jPanelParametrosAuxiliar2LiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLiquidacionImpuestoImpor.add(this.jLabelAccionesLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
				this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesLiquidacionImpuestoImpor.add(this.jButtonAbrirOrderByLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLiquidacionImpuestoImpor.add(this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);			
			
			
			/*
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLiquidacionImpuestoImpor.add(this.jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLiquidacionImpuestoImpor.add(this.jCheckBoxConGraficoReporteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3LiquidacionImpuestoImpor.add(this.jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);															
				
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3LiquidacionImpuestoImpor.add(this.jCheckBoxSeleccionadosLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);															
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3LiquidacionImpuestoImpor.add(this.jCheckBoxConGraficoReporteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLiquidacionImpuestoImpor.add(this.jPanelParametrosAuxiliar3LiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLiquidacionImpuestoImpor.add(this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
				
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLiquidacionImpuestoImpor.add(this.jComboBoxTiposAccionesLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
	
				
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLiquidacionImpuestoImpor.add(this.jTextFieldValorCampoGeneralLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosLiquidacionImpuestoImpor = new GridBagLayout();

			this.jScrollPanelDatosLiquidacionImpuestoImpor.setLayout(gridaBagLayoutDatosLiquidacionImpuestoImpor);
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
			
			this.jScrollPanelDatosLiquidacionImpuestoImpor.add(this.jTableDatosLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosLiquidacionImpuestoImpor.setViewportView(this.jTableDatosLiquidacionImpuestoImpor);
		this.jTableDatosLiquidacionImpuestoImpor.setFillsViewportHeight(true);
		this.jTableDatosLiquidacionImpuestoImpor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesLiquidacionImpuestoImpor= new GridBagLayout();
		this.jPanelAccionesLiquidacionImpuestoImpor.setLayout(gridaBagLayoutAccionesLiquidacionImpuestoImpor);
		
		
		/*	
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
			
		this.jPanelAccionesLiquidacionImpuestoImpor.add(this.jButtonNuevoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteLiquidacionImpuestoImpor= new GridBagLayout();
		gridaBagLayoutFK_IdClienteLiquidacionImpuestoImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteLiquidacionImpuestoImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteLiquidacionImpuestoImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteLiquidacionImpuestoImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteLiquidacionImpuestoImpor.setLayout(gridaBagLayoutFK_IdClienteLiquidacionImpuestoImpor);

		gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
		jPanelFK_IdClienteLiquidacionImpuestoImpor.add(jLabelid_clienteFK_IdClienteLiquidacionImpuestoImpor, gridBagConstraintsLiquidacionImpuestoImpor);

		gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
		jPanelFK_IdClienteLiquidacionImpuestoImpor.add(jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor, gridBagConstraintsLiquidacionImpuestoImpor);


		gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
		gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
		jPanelFK_IdClienteLiquidacionImpuestoImpor.add(this.jButtonBuscarFK_IdClienteid_clienteLiquidacionImpuestoImpor, gridBagConstraintsLiquidacionImpuestoImpor);

		gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpuestoImpor.gridy = 1;
		gridBagConstraintsLiquidacionImpuestoImpor.gridx =1;
		jPanelFK_IdClienteLiquidacionImpuestoImpor.add(jButtonFK_IdClienteLiquidacionImpuestoImpor, gridBagConstraintsLiquidacionImpuestoImpor);

		jTabbedPaneBusquedasLiquidacionImpuestoImpor.addTab("1.-Por Cliente ", jPanelFK_IdClienteLiquidacionImpuestoImpor);
		jTabbedPaneBusquedasLiquidacionImpuestoImpor.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdFacturaLiquidacionImpuestoImpor= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaLiquidacionImpuestoImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaLiquidacionImpuestoImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaLiquidacionImpuestoImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaLiquidacionImpuestoImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaLiquidacionImpuestoImpor.setLayout(gridaBagLayoutFK_IdFacturaLiquidacionImpuestoImpor);

		gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
		jPanelFK_IdFacturaLiquidacionImpuestoImpor.add(jLabelid_facturaFK_IdFacturaLiquidacionImpuestoImpor, gridBagConstraintsLiquidacionImpuestoImpor);

		gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
		jPanelFK_IdFacturaLiquidacionImpuestoImpor.add(jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor, gridBagConstraintsLiquidacionImpuestoImpor);


		gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
		gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
		jPanelFK_IdFacturaLiquidacionImpuestoImpor.add(this.jButtonBuscarFK_IdFacturaid_facturaLiquidacionImpuestoImpor, gridBagConstraintsLiquidacionImpuestoImpor);

		gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpuestoImpor.gridy = 1;
		gridBagConstraintsLiquidacionImpuestoImpor.gridx =1;
		jPanelFK_IdFacturaLiquidacionImpuestoImpor.add(jButtonFK_IdFacturaLiquidacionImpuestoImpor, gridBagConstraintsLiquidacionImpuestoImpor);

		jTabbedPaneBusquedasLiquidacionImpuestoImpor.addTab("2.-Por Factura ", jPanelFK_IdFacturaLiquidacionImpuestoImpor);
		jTabbedPaneBusquedasLiquidacionImpuestoImpor.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPedidoCompraImporLiquidacionImpuestoImpor= new GridBagLayout();
		gridaBagLayoutFK_IdPedidoCompraImporLiquidacionImpuestoImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPedidoCompraImporLiquidacionImpuestoImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPedidoCompraImporLiquidacionImpuestoImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPedidoCompraImporLiquidacionImpuestoImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setLayout(gridaBagLayoutFK_IdPedidoCompraImporLiquidacionImpuestoImpor);

		gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
		jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor.add(jLabelid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor, gridBagConstraintsLiquidacionImpuestoImpor);

		gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
		jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor.add(jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor, gridBagConstraintsLiquidacionImpuestoImpor);

		gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLiquidacionImpuestoImpor.gridy = 1;
		gridBagConstraintsLiquidacionImpuestoImpor.gridx =1;
		jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor.add(jButtonFK_IdPedidoCompraImporLiquidacionImpuestoImpor, gridBagConstraintsLiquidacionImpuestoImpor);

		jTabbedPaneBusquedasLiquidacionImpuestoImpor.addTab("3.-Por Pedo Compra Impor ", jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor);
		jTabbedPaneBusquedasLiquidacionImpuestoImpor.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutLiquidacionImpuestoImpor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();						
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;		
			//this.gridBagConstraintsLiquidacionImpuestoImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;		
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsLiquidacionImpuestoImpor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);								
		
		
		/*
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		*/		
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsLiquidacionImpuestoImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
				
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(LiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosLiquidacionImpuestoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosLiquidacionImpuestoImpor = new GridBagLayout();
			this.jPanelBusquedasParametrosLiquidacionImpuestoImpor.setLayout(gridaBagLayoutBusquedasParametrosLiquidacionImpuestoImpor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralLiquidacionImpuestoImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
			
			
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
			
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralLiquidacionImpuestoImpor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoLiquidacionImpuestoImpor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoLiquidacionImpuestoImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.setName("jPanelReporteDinamicoLiquidacionImpuestoImpor"); 
		
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.setLayout(gridaBagLayoutReporteDinamicoLiquidacionImpuestoImpor);
		
		
		this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoLiquidacionImpuestoImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteLiquidacionImpuestoImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setResizable(true);
	    this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setClosable(true);
	    this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Liquidacion Impuesto Impores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelColumnasSelectReporteLiquidacionImpuestoImpor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jLabelColumnasSelectReporteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteLiquidacionImpuestoImpor = new JList<Reporte>();
		this.jListColumnasSelectReporteLiquidacionImpuestoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteLiquidacionImpuestoImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteLiquidacionImpuestoImpor=new JScrollPane(this.jListColumnasSelectReporteLiquidacionImpuestoImpor);
			
			this.jScrollColumnasSelectReporteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jListColumnasSelectReporteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jScrollColumnasSelectReporteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelRelacionesSelectReporteLiquidacionImpuestoImpor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jLabelRelacionesSelectReporteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteLiquidacionImpuestoImpor = new JList<Reporte>();
		this.jListRelacionesSelectReporteLiquidacionImpuestoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteLiquidacionImpuestoImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteLiquidacionImpuestoImpor=new JScrollPane(this.jListRelacionesSelectReporteLiquidacionImpuestoImpor);
			
			this.jScrollRelacionesSelectReporteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jListRelacionesSelectReporteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jScrollRelacionesSelectReporteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoLiquidacionImpuestoImpor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoLiquidacionImpuestoImpor = new JComboBoxMe();
		this.jListColumnasValoresGraficoLiquidacionImpuestoImpor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoLiquidacionImpuestoImpor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoLiquidacionImpuestoImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoLiquidacionImpuestoImpor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoLiquidacionImpuestoImpor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelConGraficoDinamicoLiquidacionImpuestoImpor.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jLabelConGraficoDinamicoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoLiquidacionImpuestoImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoLiquidacionImpuestoImpor.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoLiquidacionImpuestoImpor.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jCheckBoxConGraficoDinamicoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoLiquidacionImpuestoImpor.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jLabelColumnaCategoriaGraficoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoLiquidacionImpuestoImpor.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoLiquidacionImpuestoImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jComboBoxColumnaCategoriaGraficoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelColumnaCategoriaValorLiquidacionImpuestoImpor.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jLabelColumnaCategoriaValorLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorLiquidacionImpuestoImpor.setText("Accion");
        this.jComboBoxColumnaCategoriaValorLiquidacionImpuestoImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jComboBoxColumnaCategoriaValorLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelColumnasValoresGraficoLiquidacionImpuestoImpor.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jLabelColumnasValoresGraficoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoLiquidacionImpuestoImpor = new JList<Reporte>();
		this.jListColumnasValoresGraficoLiquidacionImpuestoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoLiquidacionImpuestoImpor.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoLiquidacionImpuestoImpor=new JScrollPane(this.jListColumnasValoresGraficoLiquidacionImpuestoImpor);
			
			this.jScrollColumnasValoresGraficoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jListColumnasSelectReporteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jScrollColumnasValoresGraficoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoLiquidacionImpuestoImpor.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jLabelTiposGraficosReportesDinamicoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoLiquidacionImpuestoImpor.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoLiquidacionImpuestoImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jComboBoxTiposGraficosReportesDinamicoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoLiquidacionImpuestoImpor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jLabelGenerarExcelReporteDinamicoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoLiquidacionImpuestoImpor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoLiquidacionImpuestoImpor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoLiquidacionImpuestoImpor.setToolTipText("Generar EXCEL"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jButtonGenerarExcelReporteDinamicoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jComboBoxTiposReportesDinamicoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoLiquidacionImpuestoImpor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jLabelTiposArchivoReporteDinamicoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jComboBoxTiposArchivosReportesDinamicoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoLiquidacionImpuestoImpor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoLiquidacionImpuestoImpor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoLiquidacionImpuestoImpor.setToolTipText("Generar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jButtonGenerarReporteDinamicoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoLiquidacionImpuestoImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoLiquidacionImpuestoImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoLiquidacionImpuestoImpor.setToolTipText("Cancelar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLiquidacionImpuestoImpor.add(this.jButtonCerrarReporteDinamicoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalLiquidacionImpuestoImpor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoLiquidacionImpuestoImpor= new JScrollPane(jPanelReporteDinamicoLiquidacionImpuestoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Liquidacion Impuesto Impores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalLiquidacionImpuestoImpor);
		this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getContentPane().add(this.jScrollPanelReporteDinamicoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionLiquidacionImpuestoImpor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionLiquidacionImpuestoImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionLiquidacionImpuestoImpor.setName("jPanelImportacionLiquidacionImpuestoImpor"); 
		
		this.jPanelImportacionLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionLiquidacionImpuestoImpor.setLayout(gridaBagLayoutImportacionLiquidacionImpuestoImpor);
		
		
		this.jInternalFrameImportacionLiquidacionImpuestoImpor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionLiquidacionImpuestoImpor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionLiquidacionImpuestoImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteLiquidacionImpuestoImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionLiquidacionImpuestoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionLiquidacionImpuestoImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionLiquidacionImpuestoImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionLiquidacionImpuestoImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionLiquidacionImpuestoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionLiquidacionImpuestoImpor.setResizable(true);
	    this.jInternalFrameImportacionLiquidacionImpuestoImpor.setClosable(true);
	    this.jInternalFrameImportacionLiquidacionImpuestoImpor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionLiquidacionImpuestoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionLiquidacionImpuestoImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionLiquidacionImpuestoImpor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionLiquidacionImpuestoImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionLiquidacionImpuestoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionLiquidacionImpuestoImpor.setResizable(true);
	    this.jInternalFrameImportacionLiquidacionImpuestoImpor.setClosable(true);
	    this.jInternalFrameImportacionLiquidacionImpuestoImpor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Liquidacion Impuesto Impores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelArchivoImportacionLiquidacionImpuestoImpor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionLiquidacionImpuestoImpor.add(this.jLabelArchivoImportacionLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionLiquidacionImpuestoImpor = new JFileChooser();		
		this.jFileChooserImportacionLiquidacionImpuestoImpor.setToolTipText("ESCOGER ARCHIVO"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonAbrirImportacionLiquidacionImpuestoImpor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionLiquidacionImpuestoImpor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionLiquidacionImpuestoImpor.setToolTipText("Generar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLiquidacionImpuestoImpor.add(this.jButtonAbrirImportacionLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelPathArchivoImportacionLiquidacionImpuestoImpor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionLiquidacionImpuestoImpor.add(this.jLabelPathArchivoImportacionLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionLiquidacionImpuestoImpor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionLiquidacionImpuestoImpor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionLiquidacionImpuestoImpor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionLiquidacionImpuestoImpor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLiquidacionImpuestoImpor.add(this.jTextFieldPathArchivoImportacionLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonGenerarImportacionLiquidacionImpuestoImpor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionLiquidacionImpuestoImpor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionLiquidacionImpuestoImpor.setToolTipText("Generar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLiquidacionImpuestoImpor.add(this.jButtonGenerarImportacionLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonCerrarImportacionLiquidacionImpuestoImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionLiquidacionImpuestoImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionLiquidacionImpuestoImpor.setToolTipText("Cancelar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLiquidacionImpuestoImpor.add(this.jButtonCerrarImportacionLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalLiquidacionImpuestoImpor = new GridBagLayout();
		
		this.jScrollPanelImportacionLiquidacionImpuestoImpor= new JScrollPane(jPanelImportacionLiquidacionImpuestoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy =iPosYImportacion;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =iPosXImportacion;
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionLiquidacionImpuestoImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionLiquidacionImpuestoImpor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalLiquidacionImpuestoImpor);
		this.jInternalFrameImportacionLiquidacionImpuestoImpor.getContentPane().add(this.jScrollPanelImportacionLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByLiquidacionImpuestoImpor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByLiquidacionImpuestoImpor = new JButtonMe();
			this.jButtonAbrirOrderByLiquidacionImpuestoImpor.setText("Orden");
			this.jButtonAbrirOrderByLiquidacionImpuestoImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByLiquidacionImpuestoImpor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByLiquidacionImpuestoImpor";
			inputMap = this.jButtonAbrirOrderByLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByLiquidacionImpuestoImpor"));
		
		
			GridBagLayout gridaBagLayoutOrderByLiquidacionImpuestoImpor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByLiquidacionImpuestoImpor.setName("jPanelOrderByLiquidacionImpuestoImpor"); 
			
			this.jPanelOrderByLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByLiquidacionImpuestoImpor.setLayout(gridaBagLayoutOrderByLiquidacionImpuestoImpor);
			
			
			this.jTableDatosLiquidacionImpuestoImporOrderBy = new JTableMe();        
			this.jTableDatosLiquidacionImpuestoImporOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosLiquidacionImpuestoImporOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosLiquidacionImpuestoImporOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosLiquidacionImpuestoImporOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosLiquidacionImpuestoImporOrderBy.setViewportView(this.jTableDatosLiquidacionImpuestoImporOrderBy);
			this.jTableDatosLiquidacionImpuestoImporOrderBy.setFillsViewportHeight(true);
			this.jTableDatosLiquidacionImpuestoImporOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByLiquidacionImpuestoImpor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByLiquidacionImpuestoImpor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByLiquidacionImpuestoImpor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteLiquidacionImpuestoImpor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.setTitle("Orden");
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.setResizable(true);
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.setClosable(true);
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Liquidacion Impuesto Impores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsLiquidacionImpuestoImpor.ipady =150;
				
			this.jPanelOrderByLiquidacionImpuestoImpor.add(jScrollPanelDatosLiquidacionImpuestoImporOrderBy, this.gridBagConstraintsLiquidacionImpuestoImpor);//this.jTableDatosLiquidacionImpuestoImporTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByLiquidacionImpuestoImpor = new JButtonMe();
			this.jButtonCerrarOrderByLiquidacionImpuestoImpor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByLiquidacionImpuestoImpor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByLiquidacionImpuestoImpor.setToolTipText("Cancelar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByLiquidacionImpuestoImpor.add(this.jButtonCerrarOrderByLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalLiquidacionImpuestoImpor = new GridBagLayout();
			
			this.jScrollPanelOrderByLiquidacionImpuestoImpor= new JScrollPane(jPanelOrderByLiquidacionImpuestoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy =iPosYOrderBy;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalLiquidacionImpuestoImpor);
			
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.getContentPane().add(this.jScrollPanelOrderByLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);			
		
		} else {
			this.jButtonAbrirOrderByLiquidacionImpuestoImpor = new JButtonMe();
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
		int iWidthTableCalculado=0;//3830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosLiquidacionImpuestoImpor.getRowHeight();//LiquidacionImpuestoImporConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > LiquidacionImpuestoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaLiquidacionImpuestoImpor.isSelected()) {
					iHeightTable=LiquidacionImpuestoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < LiquidacionImpuestoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=LiquidacionImpuestoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > LiquidacionImpuestoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaLiquidacionImpuestoImpor.isSelected()) {
					iHeightTable=LiquidacionImpuestoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < LiquidacionImpuestoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=LiquidacionImpuestoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByLiquidacionImpuestoImpor!=null && this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjTableDatosOrderBy()!=null) {
			//if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=liquidacionimpuestoimpors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<LiquidacionImpuestoImpor> TraerLiquidacionImpuestoImporBeans(List<LiquidacionImpuestoImpor> liquidacionimpuestoimpors,ArrayList<Classe> classes)throws Exception {
		try {
			for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimpors) {
					
				if(!(LiquidacionImpuestoImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || LiquidacionImpuestoImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					liquidacionimpuestoimpor.setsDetalleGeneralEntityReporte(LiquidacionImpuestoImporConstantesFunciones.getLiquidacionImpuestoImporDescripcion(liquidacionimpuestoimpor));
										
						
					
					

					if(liquidacionimpuestoimpor.getDetalleLiquidacionImpuestoImpors()!=null && Funciones.existeClass(classes,DetalleLiquidacionImpuestoImpor.class)) {
						try{liquidacionimpuestoimpor.setdetalleliquidacionimpuestoimporsDescripcionReporte(new JRBeanCollectionDataSource(DetalleLiquidacionImpuestoImporJInternalFrame.TraerDetalleLiquidacionImpuestoImporBeans(liquidacionimpuestoimpor.getDetalleLiquidacionImpuestoImpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//liquidacionimpuestoimpor.setsDetalleGeneralEntityReporte(liquidacionimpuestoimpor.getsDetalleGeneralEntityReporte());
										
				}
				
				//liquidacionimpuestoimporbeans.add(liquidacionimpuestoimporbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return liquidacionimpuestoimpors;
    }
	//PARA REPORTES FIN
}
