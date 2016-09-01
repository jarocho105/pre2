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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TareaClienteConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TareaClienteJInternalFrame extends TareaClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTareaCliente;
	
	protected JMenuBar jmenuBarTareaCliente;
	
	protected JMenu jmenuTareaCliente;
	protected JMenu jmenuDatosTareaCliente;
	protected JMenu jmenuArchivoTareaCliente;
	protected JMenu jmenuAccionesTareaCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTareaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTareaCliente;	
	protected GridBagConstraints gridBagConstraintsTareaCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TareaClienteDetalleFormJInternalFrame jInternalFrameDetalleFormTareaCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTareaCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTareaCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public TareaClienteSessionBean tareaclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TareaCliente> tareaclientes;		
	public List<TareaCliente> tareaclientesEliminados;	
	public List<TareaCliente> tareaclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTareaCliente;		
	protected JButton jButtonAbrirOrderByTareaCliente;
	
	
	//protected JPanel jPanelOrderByTareaCliente;
	//public JScrollPane jScrollPanelOrderByTareaCliente;	
	//protected JButton jButtonCerrarOrderByTareaCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TareaClienteLogic tareaclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTareaCliente;
	public JScrollPane jScrollPanelDatosEdicionTareaCliente;
	public JScrollPane jScrollPanelDatosGeneralTareaCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosTareaClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTareaCliente;
	//public JScrollPane jScrollPanelImportacionTareaCliente;
	
	
	
	protected JPanel jPanelAccionesTareaCliente;
	
    protected JPanel jPanelPaginacionTareaCliente;
    protected JPanel jPanelParametrosReportesTareaCliente;
	protected JPanel jPanelParametrosReportesAccionesTareaCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TareaCliente;
	protected JPanel jPanelParametrosAuxiliar2TareaCliente;
	protected JPanel jPanelParametrosAuxiliar3TareaCliente;
	protected JPanel jPanelParametrosAuxiliar4TareaCliente;
	//protected JPanel jPanelParametrosAuxiliar5TareaCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoTareaCliente;
	//protected JPanel jPanelImportacionTareaCliente;
	
	
	public JTable jTableDatosTareaCliente;
	
	
	
	//public JTable jTableDatosTareaClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTareaCliente;
	protected JButton jButtonDuplicarTareaCliente;
	protected JButton jButtonCopiarTareaCliente;
	protected JButton jButtonVerFormTareaCliente;
	protected JButton jButtonNuevoRelacionesTareaCliente;
	protected JButton jButtonModificarTareaCliente;
	
    protected JButton jButtonGuardarCambiosTablaTareaCliente;
	protected JButton jButtonCerrarTareaCliente;
	
	
	protected JButton jButtonRecargarInformacionTareaCliente;
	protected JButton jButtonProcesarInformacionTareaCliente;
	
	
	protected JButton jButtonAnterioresTareaCliente;
	protected JButton jButtonSiguientesTareaCliente;
	protected JButton jButtonNuevoGuardarCambiosTareaCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTareaCliente;
	//protected JButton jButtonCerrarReporteDinamicoTareaCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoTareaCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionTareaCliente;
	//protected JButton jButtonGenerarImportacionTareaCliente;
	//protected JButton jButtonCerrarImportacionTareaCliente;
	//protected JFileChooser jFileChooserImportacionTareaCliente;
	//protected File fileImportacionTareaCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTareaCliente;
	protected JButton jButtonDuplicarToolBarTareaCliente;
	protected JButton jButtonNuevoRelacionesToolBarTareaCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarTareaCliente;
	protected JButton jButtonCopiarToolBarTareaCliente;
	protected JButton jButtonVerFormToolBarTareaCliente;
	public JButton jButtonGuardarCambiosTablaToolBarTareaCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarTareaCliente;
	protected JButton jButtonCerrarToolBarTareaCliente;
	
	protected JButton jButtonRecargarInformacionToolBarTareaCliente;
	protected JButton jButtonProcesarInformacionToolBarTareaCliente;
	protected JButton jButtonAnterioresToolBarTareaCliente;
	protected JButton jButtonSiguientesToolBarTareaCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarTareaCliente;
	protected JButton jButtonAbrirOrderByToolBarTareaCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTareaCliente;
	protected JMenuItem jMenuItemDuplicarTareaCliente;
	protected JMenuItem jMenuItemNuevoRelacionesTareaCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTareaCliente;
	protected JMenuItem jMenuItemCopiarTareaCliente;
	protected JMenuItem jMenuItemVerFormTareaCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaTareaCliente;
	protected JMenuItem jMenuItemCerrarTareaCliente;
	protected JMenuItem jMenuItemDetalleCerrarTareaCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTareaCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarTareaCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionTareaCliente;
	protected JMenuItem jMenuItemProcesarInformacionTareaCliente;
	protected JMenuItem jMenuItemAnterioresTareaCliente;
	protected JMenuItem jMenuItemSiguientesTareaCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTareaCliente;
	protected JMenuItem jMenuItemAbrirOrderByTareaCliente;
	protected JMenuItem jMenuItemMostrarOcultarTareaCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTareaCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTareaCliente;
	protected JCheckBox jCheckBoxSeleccionadosTareaCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTareaCliente;
	protected JCheckBox jCheckBoxConGraficoReporteTareaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTareaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTareaCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTareaCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTareaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTareaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTareaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTareaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTareaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTareaCliente;
	protected JTextField jTextFieldValorCampoGeneralTareaCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTareaCliente;
	//public JList<Reporte> jListColumnasSelectReporteTareaCliente;
	//public JScrollPane jScrollColumnasSelectReporteTareaCliente;
	
	//public JLabel jLabelRelacionesSelectReporteTareaCliente;
	//public JList<Reporte> jListRelacionesSelectReporteTareaCliente;
	//public JScrollPane jScrollRelacionesSelectReporteTareaCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTareaCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTareaCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTareaCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoTareaCliente;
	
		
	//public JLabel jLabelArchivoImportacionTareaCliente;	
	//public JLabel jLabelPathArchivoImportacionTareaCliente;
	//protected JTextField jTextFieldPathArchivoImportacionTareaCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTareaCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTareaCliente;
	
	//public JLabel jLabelColumnaCategoriaValorTareaCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTareaCliente;
	
	//public JLabel jLabelColumnasValoresGraficoTareaCliente;
	//public JList<Reporte> jListColumnasValoresGraficoTareaCliente;
	//public JScrollPane jScrollColumnasValoresGraficoTareaCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTareaCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTareaCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTareaCliente;
	public JPanel jPanelFK_IdClienteTareaCliente;
	public JButton jButtonFK_IdClienteTareaCliente;
	public JPanel jPanelFK_IdFacturaTareaCliente;
	public JButton jButtonFK_IdFacturaTareaCliente;
	public JPanel jPanelFK_IdProductoTareaCliente;
	public JButton jButtonFK_IdProductoTareaCliente;
	public JPanel jPanelFK_IdUnidadTareaCliente;
	public JButton jButtonFK_IdUnidadTareaCliente;
	
	public JPanel jPanelid_clienteFK_IdClienteTareaCliente;
	public JLabel jLabelid_clienteFK_IdClienteTareaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteTareaCliente;
	public JButton jButtonid_clienteFK_IdClienteTareaCliente= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteTareaClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteTareaClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteTareaCliente;
	
	public JPanel jPanelid_facturaFK_IdFacturaTareaCliente;
	public JLabel jLabelid_facturaFK_IdFacturaTareaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaTareaCliente;
	public JButton jButtonid_facturaFK_IdFacturaTareaCliente= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaTareaClienteUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaTareaClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaTareaCliente;
	
	public JPanel jPanelid_productoFK_IdProductoTareaCliente;
	public JLabel jLabelid_productoFK_IdProductoTareaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoTareaCliente;
	public JButton jButtonid_productoFK_IdProductoTareaCliente= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoTareaClienteUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoTareaClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoTareaCliente;
	
	public JPanel jPanelid_unidadFK_IdUnidadTareaCliente;
	public JLabel jLabelid_unidadFK_IdUnidadTareaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadTareaCliente;
	public JButton jButtonid_unidadFK_IdUnidadTareaCliente= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadTareaClienteUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadTareaClienteBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TareaClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TareaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TareaClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TareaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TareaClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TareaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TareaClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TareaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTareaCliente)	{
		this.jButtonRecargarInformacionTareaCliente = jButtonRecargarInformacionTareaCliente;
	}
	
	public JButton getjButtonProcesarInformacionTareaCliente() {
		return this.jButtonProcesarInformacionTareaCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTareaCliente)	{
		this.jButtonProcesarInformacionTareaCliente = jButtonProcesarInformacionTareaCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionTareaCliente() {
		return this.jButtonRecargarInformacionTareaCliente;
	}
	
	
	public List<TareaCliente> gettareaclientes() {
		return this.tareaclientes;
	}

	public void settareaclientes(List<TareaCliente> tareaclientes) {
		this.tareaclientes = tareaclientes;
	}
	
	public List<TareaCliente> gettareaclientesAux() {
		return this.tareaclientesAux;
	}

	public void settareaclientesAux(List<TareaCliente> tareaclientesAux) {
		this.tareaclientesAux = tareaclientesAux;
	}
	
	public List<TareaCliente> gettareaclientesEliminados() {
		return this.tareaclientesEliminados;
	}

	public void setTareaClientesEliminados(List<TareaCliente> tareaclientesEliminados) {
		this.tareaclientesEliminados = tareaclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTareaCliente() {
		return jComboBoxTiposSeleccionarTareaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTareaCliente(
			JComboBox jComboBoxTiposSeleccionarTareaCliente) {
		this.jComboBoxTiposSeleccionarTareaCliente = jComboBoxTiposSeleccionarTareaCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarTareaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTareaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTareaCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTareaCliente() {
		return jTextFieldValorCampoGeneralTareaCliente;
	}

	public void setjTextFieldValorCampoGeneralTareaCliente(
			JTextField jTextFieldValorCampoGeneralTareaCliente) {
		this.jTextFieldValorCampoGeneralTareaCliente = jTextFieldValorCampoGeneralTareaCliente;
	}

	public void setBorderResaltarValorCampoGeneralTareaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTareaCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTareaCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTareaCliente() {
		return this.jCheckBoxSeleccionarTodosTareaCliente;
	}

	public void setjCheckBoxSeleccionarTodosTareaCliente(
			JCheckBox jCheckBoxSeleccionarTodosTareaCliente) {
		this.jCheckBoxSeleccionarTodosTareaCliente = jCheckBoxSeleccionarTodosTareaCliente;
	}

	public void setBorderResaltarSeleccionarTodosTareaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTareaCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTareaCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTareaCliente() {
		return this.jCheckBoxSeleccionadosTareaCliente;
	}

	public void setjCheckBoxSeleccionadosTareaCliente(
			JCheckBox jCheckBoxSeleccionadosTareaCliente) {
		this.jCheckBoxSeleccionadosTareaCliente = jCheckBoxSeleccionadosTareaCliente;
	}
	
	public void setBorderResaltarSeleccionadosTareaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTareaCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTareaCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTareaCliente() {
		return this.jComboBoxTiposArchivosReportesTareaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTareaCliente(
			JComboBox jComboBoxTiposArchivosReportesTareaCliente) {
		this.jComboBoxTiposArchivosReportesTareaCliente = jComboBoxTiposArchivosReportesTareaCliente;
	}

	public void setBorderResaltarTiposArchivosReportesTareaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTareaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTareaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTareaCliente() {
		return this.jComboBoxTiposReportesTareaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTareaCliente(
			JComboBox jComboBoxTiposReportesTareaCliente) {
		this.jComboBoxTiposReportesTareaCliente = jComboBoxTiposReportesTareaCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTareaCliente() {
	//	return jComboBoxTiposReportesDinamicoTareaCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTareaCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoTareaCliente) {
	//	this.jComboBoxTiposReportesDinamicoTareaCliente = jComboBoxTiposReportesDinamicoTareaCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTareaCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoTareaCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTareaCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTareaCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTareaCliente = jComboBoxTiposArchivosReportesDinamicoTareaCliente;
	//}
	
	public void setBorderResaltarTiposReportesTareaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTareaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTareaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTareaCliente() {
		return this.jComboBoxTiposGraficosReportesTareaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTareaCliente(
			JComboBox jComboBoxTiposGraficosReportesTareaCliente) {
		this.jComboBoxTiposGraficosReportesTareaCliente = jComboBoxTiposGraficosReportesTareaCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesTareaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTareaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTareaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTareaCliente() {
		return this.jComboBoxTiposPaginacionTareaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTareaCliente(
			JComboBox jComboBoxTiposPaginacionTareaCliente) {
		this.jComboBoxTiposPaginacionTareaCliente = jComboBoxTiposPaginacionTareaCliente;
	}
	
	public void setBorderResaltarTiposPaginacionTareaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTareaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTareaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTareaCliente() {
		return this.jComboBoxTiposRelacionesTareaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTareaCliente() {
		return this.jComboBoxTiposAccionesTareaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTareaCliente(
			JComboBox jComboBoxTiposRelacionesTareaCliente) {
		this.jComboBoxTiposRelacionesTareaCliente = jComboBoxTiposRelacionesTareaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTareaCliente(
			JComboBox jComboBoxTiposAccionesTareaCliente) {
		this.jComboBoxTiposAccionesTareaCliente = jComboBoxTiposAccionesTareaCliente;
	}
	
	public void setBorderResaltarTiposRelacionesTareaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTareaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTareaCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTareaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTareaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTareaCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTareaCliente() {
	//	return jCheckBoxConGraficoDinamicoTareaCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoTareaCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoTareaCliente) {
	//	this.jCheckBoxConGraficoDinamicoTareaCliente = jCheckBoxConGraficoDinamicoTareaCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTareaCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTareaCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTareaCliente .setBorder(borderResaltar);		
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
		this.tareaclienteSessionBean=new TareaClienteSessionBean();
		
		this.tareaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tareaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tareaclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TareaClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TareaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TareaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TareaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TareaClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tarea Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		TareaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TareaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTareaCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTareaCliente,this.jTtoolBarTareaCliente,
							"nuevo","nuevo","Nuevo"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTareaCliente,this.jTtoolBarTareaCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTareaCliente,this.jTtoolBarTareaCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTareaCliente,this.jTtoolBarTareaCliente,
							"duplicar","duplicar","Duplicar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTareaCliente,this.jTtoolBarTareaCliente,
							"copiar","copiar","Copiar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTareaCliente,this.jTtoolBarTareaCliente,
							"ver_form","ver_form","Ver"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTareaCliente,this.jTtoolBarTareaCliente,
							"recargar","recargar","Recargar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTareaCliente,this.jTtoolBarTareaCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTareaCliente,this.jTtoolBarTareaCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTareaCliente,this.jTtoolBarTareaCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTareaCliente,this.jTtoolBarTareaCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTareaCliente,this.jTtoolBarTareaCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTareaCliente,this.jTtoolBarTareaCliente,
							"cerrar","cerrar","Salir"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTareaCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTareaCliente;
			
				this.jButtonProcesarInformacionToolBarTareaCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTareaCliente;
				
		//protected JButton jButtonModificarToolBarTareaCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTareaCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTareaCliente=new JMenuMe("General");
		this.jmenuArchivoTareaCliente=new JMenuMe("Archivo");
		this.jmenuAccionesTareaCliente=new JMenuMe("Acciones");
		this.jmenuDatosTareaCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTareaCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTareaCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTareaCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTareaCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTareaCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTareaCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTareaCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTareaCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTareaCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTareaCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTareaCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTareaCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTareaCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTareaCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTareaCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTareaCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTareaCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTareaCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTareaCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTareaCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTareaCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTareaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTareaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTareaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTareaCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTareaCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTareaCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTareaCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTareaCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTareaCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTareaCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTareaCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTareaCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTareaCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTareaCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTareaCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTareaCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTareaCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTareaCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTareaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTareaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTareaCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTareaCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTareaCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTareaCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTareaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTareaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTareaCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTareaCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTareaCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTareaCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTareaCliente.add(this.jMenuItemCerrarTareaCliente);
			
			this.jmenuAccionesTareaCliente.add(this.jMenuItemNuevoTareaCliente);
			this.jmenuAccionesTareaCliente.add(this.jMenuItemNuevoGuardarCambiosTareaCliente);
			this.jmenuAccionesTareaCliente.add(this.jMenuItemNuevoRelacionesTareaCliente);
			this.jmenuAccionesTareaCliente.add(this.jMenuItemGuardarCambiosTablaTareaCliente);		
			this.jmenuAccionesTareaCliente.add(this.jMenuItemDuplicarTareaCliente);		
			this.jmenuAccionesTareaCliente.add(this.jMenuItemCopiarTareaCliente);		
			this.jmenuAccionesTareaCliente.add(this.jMenuItemVerFormTareaCliente);		
			
			this.jmenuDatosTareaCliente.add(this.jMenuItemRecargarInformacionTareaCliente);				
			this.jmenuDatosTareaCliente.add(this.jMenuItemAnterioresTareaCliente);				
			this.jmenuDatosTareaCliente.add(this.jMenuItemSiguientesTareaCliente);				
			this.jmenuDatosTareaCliente.add(this.jMenuItemAbrirOrderByTareaCliente);				
			this.jmenuDatosTareaCliente.add(this.jMenuItemMostrarOcultarTareaCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTareaCliente.add(this.jMenuItemGuardarCambiosTareaCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTareaCliente.add(this.jmenuArchivoTareaCliente);		
			this.jmenuBarTareaCliente.add(this.jmenuAccionesTareaCliente);		
			this.jmenuBarTareaCliente.add(this.jmenuDatosTareaCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTareaCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTareaCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteTareaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteTareaCliente.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteTareaCliente= new JButtonMe();
		this.jButtonFK_IdClienteTareaCliente.setText("Buscar");
		this.jButtonFK_IdClienteTareaCliente.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteTareaCliente,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteTareaCliente = new JLabelMe();
		jLabelid_clienteFK_IdClienteTareaCliente.setText("Cliente :");
		jLabelid_clienteFK_IdClienteTareaCliente.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteTareaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteTareaCliente= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteTareaCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteTareaCliente= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteTareaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteTareaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteTareaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteTareaCliente.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteTareaCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteTareaCliente.setFocusable(false);

		this.jPanelFK_IdFacturaTareaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaTareaCliente.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaTareaCliente= new JButtonMe();
		this.jButtonFK_IdFacturaTareaCliente.setText("Buscar");
		this.jButtonFK_IdFacturaTareaCliente.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaTareaCliente,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaTareaCliente = new JLabelMe();
		jLabelid_facturaFK_IdFacturaTareaCliente.setText("Factura :");
		jLabelid_facturaFK_IdFacturaTareaCliente.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaTareaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaTareaCliente= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaTareaCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaTareaCliente= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaTareaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaTareaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaTareaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaTareaCliente.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaTareaCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaTareaCliente.setFocusable(false);

		this.jPanelFK_IdProductoTareaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoTareaCliente.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoTareaCliente= new JButtonMe();
		this.jButtonFK_IdProductoTareaCliente.setText("Buscar");
		this.jButtonFK_IdProductoTareaCliente.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoTareaCliente,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoTareaCliente = new JLabelMe();
		jLabelid_productoFK_IdProductoTareaCliente.setText("Producto :");
		jLabelid_productoFK_IdProductoTareaCliente.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoTareaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoTareaCliente= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoTareaCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoTareaCliente= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoTareaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoTareaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoTareaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoTareaCliente.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoTareaCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoTareaCliente.setFocusable(false);

		this.jPanelFK_IdUnidadTareaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadTareaCliente.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadTareaCliente= new JButtonMe();
		this.jButtonFK_IdUnidadTareaCliente.setText("Buscar");
		this.jButtonFK_IdUnidadTareaCliente.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadTareaCliente,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadTareaCliente = new JLabelMe();
		jLabelid_unidadFK_IdUnidadTareaCliente.setText("Unad :");
		jLabelid_unidadFK_IdUnidadTareaCliente.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadTareaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadTareaCliente= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadTareaCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTareaCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasTareaCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTareaCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTareaCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTareaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTareaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTareaCliente = new TareaClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tarea Cliente DATOS");
			this.jInternalFrameDetalleFormTareaCliente = new TareaClienteDetalleFormJInternalFrame(jDesktopPane,this.tareaclienteSessionBean.getConGuardarRelaciones(),this.tareaclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTareaCliente = null;//new TareaClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTareaCliente= new GridBagLayout();
		
		
		this.jTableDatosTareaCliente = new JTableMe();      
		
		String sToolTipTareaCliente="";
		sToolTipTareaCliente=TareaClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTareaCliente+="(Facturacion.TareaCliente)";
		}
		
		if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTareaCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTareaCliente.setToolTipText(sToolTipTareaCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTareaCliente);
		this.jTableDatosTareaCliente.setAutoCreateRowSorter(true);
		this.jTableDatosTareaCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTareaCliente.setRowSelectionAllowed(true);
		this.jTableDatosTareaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTareaCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTareaCliente = new JButtonMe();
		this.jButtonDuplicarTareaCliente = new JButtonMe();
		this.jButtonCopiarTareaCliente = new JButtonMe();
		this.jButtonVerFormTareaCliente = new JButtonMe();
		this.jButtonNuevoRelacionesTareaCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTareaCliente = new JButtonMe();
		this.jButtonCerrarTareaCliente = new JButtonMe();
		
		this.jScrollPanelDatosTareaCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralTareaCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTareaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tarea Cliente";
		
		if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarea Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosTareaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTareaCliente.setToolTipText("Acciones");
        this.jPanelAccionesTareaCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTareaCliente=new ReporteDinamicoJInternalFrame(TareaClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTareaCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTareaCliente=new ImportacionJInternalFrame(TareaClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTareaCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTareaCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByTareaCliente.setText("Orden");
		this.jButtonAbrirOrderByTareaCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTareaCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTareaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTareaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTareaCliente,false,this);
			
			//this.cargarOrderByTareaCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTareaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTareaCliente,true,this);
			
			//this.cargarOrderByTareaCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTareaCliente.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosTareaCliente.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosTareaCliente.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosTareaCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTareaCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTareaCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTareaCliente.setText("Nuevo");
		this.jButtonDuplicarTareaCliente.setText("Duplicar");
		this.jButtonCopiarTareaCliente.setText("Copiar");
		this.jButtonVerFormTareaCliente.setText("Ver");
		this.jButtonNuevoRelacionesTareaCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTareaCliente.setText("Guardar");
		this.jButtonCerrarTareaCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTareaCliente,"nuevo_button","Nuevo",this.tareaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTareaCliente,"duplicar_button","Duplicar",this.tareaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTareaCliente,"copiar_button","Copiar",this.tareaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTareaCliente,"ver_form","Ver",this.tareaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTareaCliente,"nuevorelaciones_button","Nuevo Rel",this.tareaclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTareaCliente,"guardarcambiostabla_button","Guardar",this.tareaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTareaCliente,"cerrar_button","Salir",this.tareaclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTareaCliente.setToolTipText("Nuevo"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTareaCliente.setToolTipText("Duplicar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTareaCliente.setToolTipText("Copiar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTareaCliente.setToolTipText("Ver"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTareaCliente.setToolTipText("Nuevo Rel"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTareaCliente.setToolTipText("Guardar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTareaCliente.setToolTipText("Salir"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTareaCliente";
		inputMap = this.jButtonNuevoTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTareaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTareaCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarTareaCliente";
		inputMap = this.jButtonDuplicarTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTareaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTareaCliente"));
		
		//COPIAR
		sMapKey = "CopiarTareaCliente";
		inputMap = this.jButtonCopiarTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTareaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTareaCliente"));
		
		//VEr FORM
		sMapKey = "VerFormTareaCliente";
		inputMap = this.jButtonVerFormTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTareaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTareaCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTareaCliente";
		inputMap = this.jButtonNuevoRelacionesTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTareaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTareaCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTareaCliente";
		inputMap = this.jButtonModificarTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTareaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTareaCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTareaCliente";
		inputMap = this.jButtonCerrarTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTareaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTareaCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTareaCliente";
		inputMap = this.jButtonGuardarCambiosTablaTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTareaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTareaCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTareaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTareaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTareaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TareaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TareaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TareaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TareaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TareaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTareaCliente.setName("jPanelParametrosReportesTareaCliente"); 
		
		this.jPanelParametrosReportesAccionesTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTareaCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTareaCliente.setName("jPanelParametrosReportesAccionesTareaCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTareaCliente = new JButtonMe();
		this.jButtonRecargarInformacionTareaCliente.setText("Recargar");
		this.jButtonRecargarInformacionTareaCliente.setToolTipText("Recargar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTareaCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTareaCliente = new JButtonMe();
		this.jButtonProcesarInformacionTareaCliente.setText("Procesar");
		this.jButtonProcesarInformacionTareaCliente.setToolTipText("Procesar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTareaCliente.setVisible(false);
			
		this.jButtonProcesarInformacionTareaCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTareaCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTareaCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTareaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTareaCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTareaCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTareaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTareaCliente.setText("TIPO");       
		this.jComboBoxTiposReportesTareaCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTareaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTareaCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTareaCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTareaCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTareaCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionTareaCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTareaCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTareaCliente.setText("Accion");
		this.jComboBoxTiposRelacionesTareaCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTareaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTareaCliente.setText("Accion");
		this.jComboBoxTiposAccionesTareaCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTareaCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTareaCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarTareaCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTareaCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTareaCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTareaCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTareaCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTareaCliente = new JLabelMe();
		
		this.jLabelAccionesTareaCliente.setText("Acciones");		
		this.jLabelAccionesTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTareaCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTareaCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTareaCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTareaCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTareaCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTareaCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTareaCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTareaCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTareaCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTareaCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTareaCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteTareaCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTareaCliente = new JButtonMe();
		//this.jButtonAnterioresTareaCliente.setText("<<");
        this.jButtonAnterioresTareaCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTareaCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTareaCliente = new JButtonMe();
		//this.jButtonSiguientesTareaCliente.setText(">>");
        this.jButtonSiguientesTareaCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTareaCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTareaCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTareaCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosTareaCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTareaCliente,"nuevoguardarcambios_button","Nue",this.tareaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTareaCliente";
		inputMap = this.jButtonNuevoGuardarCambiosTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTareaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTareaCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTareaCliente";
		inputMap = this.jButtonRecargarInformacionTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTareaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTareaCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTareaCliente";
		inputMap = this.jButtonSiguientesTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTareaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTareaCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTareaCliente";
		inputMap = this.jButtonAnterioresTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTareaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTareaCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTareaCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTareaCliente.setMinimumSize(new Dimension(this.getWidth(),TareaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TareaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTareaCliente.setMaximumSize(new Dimension(this.getWidth(),TareaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TareaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTareaCliente.setPreferredSize(new Dimension(this.getWidth(),TareaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TareaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTareaCliente = new GridBagLayout();

			this.jPanelPaginacionTareaCliente.setLayout(gridaBagLayoutPaginacionTareaCliente);						
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy = 0;
			this.gridBagConstraintsTareaCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTareaCliente.add(this.jButtonAnterioresTareaCliente, this.gridBagConstraintsTareaCliente);
					
						
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTareaCliente.gridy = 0;
			
			this.jPanelPaginacionTareaCliente.add(this.jButtonNuevoGuardarCambiosTareaCliente, this.gridBagConstraintsTareaCliente);
						
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTareaCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTareaCliente.gridy = 0;
			this.jPanelPaginacionTareaCliente.add(this.jButtonSiguientesTareaCliente, this.gridBagConstraintsTareaCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy = 1;
			this.gridBagConstraintsTareaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTareaCliente.add(this.jButtonNuevoTareaCliente, this.gridBagConstraintsTareaCliente);
						
			
			
			if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTareaCliente = new GridBagConstraints();
				this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTareaCliente.gridy = 1;
				this.gridBagConstraintsTareaCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTareaCliente.add(this.jButtonGuardarCambiosTablaTareaCliente, this.gridBagConstraintsTareaCliente);
			}
			
			
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy = 1;
			this.gridBagConstraintsTareaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTareaCliente.add(this.jButtonDuplicarTareaCliente, this.gridBagConstraintsTareaCliente);
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy = 1;
			this.gridBagConstraintsTareaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTareaCliente.add(this.jButtonCopiarTareaCliente, this.gridBagConstraintsTareaCliente);
		
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy = 1;
			this.gridBagConstraintsTareaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTareaCliente.add(this.jButtonVerFormTareaCliente, this.gridBagConstraintsTareaCliente);
		
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy = 1;
			this.gridBagConstraintsTareaCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTareaCliente.add(this.jButtonCerrarTareaCliente, this.gridBagConstraintsTareaCliente);
		
		
		
		this.jButtonRecargarInformacionTareaCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTareaCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTareaCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTareaCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTareaCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTareaCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTareaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTareaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTareaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTareaCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTareaCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTareaCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTareaCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTareaCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTareaCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTareaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTareaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTareaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTareaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTareaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTareaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTareaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTareaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTareaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTareaCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTareaCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTareaCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTareaCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTareaCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTareaCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTareaCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTareaCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTareaCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTareaCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTareaCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTareaCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTareaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTareaCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TareaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TareaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TareaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TareaCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTareaCliente.setLayout(gridaBagParametrosReportesTareaCliente);
			this.jPanelParametrosReportesAccionesTareaCliente.setLayout(gridaBagParametrosReportesAccionesTareaCliente);
			
			
			this.jPanelParametrosAuxiliar1TareaCliente.setLayout(gridaBagParametrosAuxiliar1TareaCliente);
			this.jPanelParametrosAuxiliar2TareaCliente.setLayout(gridaBagParametrosAuxiliar2TareaCliente);
			this.jPanelParametrosAuxiliar3TareaCliente.setLayout(gridaBagParametrosAuxiliar3TareaCliente);
			this.jPanelParametrosAuxiliar4TareaCliente.setLayout(gridaBagParametrosAuxiliar4TareaCliente);
			//this.jPanelParametrosAuxiliar5TareaCliente.setLayout(gridaBagParametrosAuxiliar2TareaCliente);			
			
			
			
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTareaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTareaCliente.add(this.jButtonRecargarInformacionTareaCliente, this.gridBagConstraintsTareaCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTareaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TareaCliente.add(this.jComboBoxTiposPaginacionTareaCliente, this.gridBagConstraintsTareaCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTareaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TareaCliente.add(this.jCheckBoxConAltoMaximoTablaTareaCliente, this.gridBagConstraintsTareaCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTareaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TareaCliente.add(this.jComboBoxTiposArchivosReportesTareaCliente, this.gridBagConstraintsTareaCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTareaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTareaCliente.add(this.jPanelParametrosAuxiliar1TareaCliente, this.gridBagConstraintsTareaCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTareaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TareaCliente.add(this.jComboBoxTiposReportesTareaCliente, this.gridBagConstraintsTareaCliente);																		
			
			
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTareaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TareaCliente.add(this.jComboBoxTiposGraficosReportesTareaCliente, this.gridBagConstraintsTareaCliente);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTareaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTareaCliente.add(this.jPanelParametrosAuxiliar4TareaCliente, this.gridBagConstraintsTareaCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTareaCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTareaCliente.add(this.jComboBoxTiposReportesTareaCliente, this.gridBagConstraintsTareaCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTareaCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTareaCliente.add(this.jCheckBoxGenerarReporteTareaCliente, this.gridBagConstraintsTareaCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTareaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTareaCliente.add(this.jPanelParametrosAuxiliar2TareaCliente, this.gridBagConstraintsTareaCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTareaCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTareaCliente.add(this.jLabelAccionesTareaCliente, this.gridBagConstraintsTareaCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTareaCliente = new GridBagConstraints();
				this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTareaCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTareaCliente.add(this.jButtonAbrirOrderByTareaCliente, this.gridBagConstraintsTareaCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTareaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTareaCliente.add(this.jComboBoxTiposSeleccionarTareaCliente, this.gridBagConstraintsTareaCliente);			
			
			
			/*
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTareaCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTareaCliente.add(this.jCheckBoxSeleccionarTodosTareaCliente, this.gridBagConstraintsTareaCliente);
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTareaCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTareaCliente.add(this.jCheckBoxConGraficoReporteTareaCliente, this.gridBagConstraintsTareaCliente);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTareaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TareaCliente.add(this.jCheckBoxSeleccionarTodosTareaCliente, this.gridBagConstraintsTareaCliente);															
				
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTareaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TareaCliente.add(this.jCheckBoxSeleccionadosTareaCliente, this.gridBagConstraintsTareaCliente);															
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTareaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TareaCliente.add(this.jCheckBoxConGraficoReporteTareaCliente, this.gridBagConstraintsTareaCliente);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTareaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTareaCliente.add(this.jPanelParametrosAuxiliar3TareaCliente, this.gridBagConstraintsTareaCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTareaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTareaCliente.add(this.jComboBoxTiposAccionesTareaCliente, this.gridBagConstraintsTareaCliente);
	
				
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTareaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTareaCliente.add(this.jTextFieldValorCampoGeneralTareaCliente, this.gridBagConstraintsTareaCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTareaCliente = new GridBagLayout();

			this.jScrollPanelDatosTareaCliente.setLayout(gridaBagLayoutDatosTareaCliente);
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy = 0;
			this.gridBagConstraintsTareaCliente.gridx = 0;
			
			this.jScrollPanelDatosTareaCliente.add(this.jTableDatosTareaCliente, this.gridBagConstraintsTareaCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTareaCliente.setViewportView(this.jTableDatosTareaCliente);
		this.jTableDatosTareaCliente.setFillsViewportHeight(true);
		this.jTableDatosTareaCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTareaCliente= new GridBagLayout();
		this.jPanelAccionesTareaCliente.setLayout(gridaBagLayoutAccionesTareaCliente);
		
		
		/*	
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx = 0;
			
		this.jPanelAccionesTareaCliente.add(this.jButtonNuevoTareaCliente, this.gridBagConstraintsTareaCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteTareaCliente= new GridBagLayout();
		gridaBagLayoutFK_IdClienteTareaCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteTareaCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteTareaCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteTareaCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteTareaCliente.setLayout(gridaBagLayoutFK_IdClienteTareaCliente);

		gridBagConstraintsTareaCliente = new GridBagConstraints();
		gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTareaCliente.gridy = 0;
		gridBagConstraintsTareaCliente.gridx = 0;
		jPanelFK_IdClienteTareaCliente.add(jLabelid_clienteFK_IdClienteTareaCliente, gridBagConstraintsTareaCliente);

		gridBagConstraintsTareaCliente = new GridBagConstraints();
		gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTareaCliente.gridy = 0;
		gridBagConstraintsTareaCliente.gridx = 1;
		jPanelFK_IdClienteTareaCliente.add(jComboBoxid_clienteFK_IdClienteTareaCliente, gridBagConstraintsTareaCliente);


		gridBagConstraintsTareaCliente = new GridBagConstraints();
		gridBagConstraintsTareaCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTareaCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsTareaCliente.gridy = 0;
		gridBagConstraintsTareaCliente.gridx = 0;
		jPanelFK_IdClienteTareaCliente.add(this.jButtonBuscarFK_IdClienteid_clienteTareaCliente, gridBagConstraintsTareaCliente);

		gridBagConstraintsTareaCliente = new GridBagConstraints();
		gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTareaCliente.gridy = 1;
		gridBagConstraintsTareaCliente.gridx =1;
		jPanelFK_IdClienteTareaCliente.add(jButtonFK_IdClienteTareaCliente, gridBagConstraintsTareaCliente);

		jTabbedPaneBusquedasTareaCliente.addTab("1.-Por Cliente ", jPanelFK_IdClienteTareaCliente);
		jTabbedPaneBusquedasTareaCliente.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdFacturaTareaCliente= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaTareaCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaTareaCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaTareaCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaTareaCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaTareaCliente.setLayout(gridaBagLayoutFK_IdFacturaTareaCliente);

		gridBagConstraintsTareaCliente = new GridBagConstraints();
		gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTareaCliente.gridy = 0;
		gridBagConstraintsTareaCliente.gridx = 0;
		jPanelFK_IdFacturaTareaCliente.add(jLabelid_facturaFK_IdFacturaTareaCliente, gridBagConstraintsTareaCliente);

		gridBagConstraintsTareaCliente = new GridBagConstraints();
		gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTareaCliente.gridy = 0;
		gridBagConstraintsTareaCliente.gridx = 1;
		jPanelFK_IdFacturaTareaCliente.add(jComboBoxid_facturaFK_IdFacturaTareaCliente, gridBagConstraintsTareaCliente);


		gridBagConstraintsTareaCliente = new GridBagConstraints();
		gridBagConstraintsTareaCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTareaCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsTareaCliente.gridy = 0;
		gridBagConstraintsTareaCliente.gridx = 0;
		jPanelFK_IdFacturaTareaCliente.add(this.jButtonBuscarFK_IdFacturaid_facturaTareaCliente, gridBagConstraintsTareaCliente);

		gridBagConstraintsTareaCliente = new GridBagConstraints();
		gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTareaCliente.gridy = 1;
		gridBagConstraintsTareaCliente.gridx =1;
		jPanelFK_IdFacturaTareaCliente.add(jButtonFK_IdFacturaTareaCliente, gridBagConstraintsTareaCliente);

		jTabbedPaneBusquedasTareaCliente.addTab("2.-Por Factura ", jPanelFK_IdFacturaTareaCliente);
		jTabbedPaneBusquedasTareaCliente.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoTareaCliente= new GridBagLayout();
		gridaBagLayoutFK_IdProductoTareaCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoTareaCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoTareaCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoTareaCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoTareaCliente.setLayout(gridaBagLayoutFK_IdProductoTareaCliente);

		gridBagConstraintsTareaCliente = new GridBagConstraints();
		gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTareaCliente.gridy = 0;
		gridBagConstraintsTareaCliente.gridx = 0;
		jPanelFK_IdProductoTareaCliente.add(jLabelid_productoFK_IdProductoTareaCliente, gridBagConstraintsTareaCliente);

		gridBagConstraintsTareaCliente = new GridBagConstraints();
		gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTareaCliente.gridy = 0;
		gridBagConstraintsTareaCliente.gridx = 1;
		jPanelFK_IdProductoTareaCliente.add(jComboBoxid_productoFK_IdProductoTareaCliente, gridBagConstraintsTareaCliente);


		gridBagConstraintsTareaCliente = new GridBagConstraints();
		gridBagConstraintsTareaCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTareaCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsTareaCliente.gridy = 0;
		gridBagConstraintsTareaCliente.gridx = 0;
		jPanelFK_IdProductoTareaCliente.add(this.jButtonBuscarFK_IdProductoid_productoTareaCliente, gridBagConstraintsTareaCliente);

		gridBagConstraintsTareaCliente = new GridBagConstraints();
		gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTareaCliente.gridy = 1;
		gridBagConstraintsTareaCliente.gridx =1;
		jPanelFK_IdProductoTareaCliente.add(jButtonFK_IdProductoTareaCliente, gridBagConstraintsTareaCliente);

		jTabbedPaneBusquedasTareaCliente.addTab("3.-Por Producto ", jPanelFK_IdProductoTareaCliente);
		jTabbedPaneBusquedasTareaCliente.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdUnidadTareaCliente= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadTareaCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadTareaCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadTareaCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadTareaCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadTareaCliente.setLayout(gridaBagLayoutFK_IdUnidadTareaCliente);

		gridBagConstraintsTareaCliente = new GridBagConstraints();
		gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTareaCliente.gridy = 0;
		gridBagConstraintsTareaCliente.gridx = 0;
		jPanelFK_IdUnidadTareaCliente.add(jLabelid_unidadFK_IdUnidadTareaCliente, gridBagConstraintsTareaCliente);

		gridBagConstraintsTareaCliente = new GridBagConstraints();
		gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTareaCliente.gridy = 0;
		gridBagConstraintsTareaCliente.gridx = 1;
		jPanelFK_IdUnidadTareaCliente.add(jComboBoxid_unidadFK_IdUnidadTareaCliente, gridBagConstraintsTareaCliente);

		gridBagConstraintsTareaCliente = new GridBagConstraints();
		gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTareaCliente.gridy = 1;
		gridBagConstraintsTareaCliente.gridx =1;
		jPanelFK_IdUnidadTareaCliente.add(jButtonFK_IdUnidadTareaCliente, gridBagConstraintsTareaCliente);

		jTabbedPaneBusquedasTareaCliente.addTab("4.-Por Unad ", jPanelFK_IdUnidadTareaCliente);
		jTabbedPaneBusquedasTareaCliente.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTareaCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTareaCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tareaclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();						
			this.gridBagConstraintsTareaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTareaCliente.gridx = 0;		
			//this.gridBagConstraintsTareaCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTareaCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTareaCliente, this.gridBagConstraintsTareaCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTareaCliente.gridx = 0;		
		//this.gridBagConstraintsTareaCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTareaCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTareaCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTareaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTareaCliente.gridx = 0;		
			this.gridBagConstraintsTareaCliente.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTareaCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTareaCliente, this.gridBagConstraintsTareaCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTareaCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTareaCliente, this.gridBagConstraintsTareaCliente);								
		
		
		/*
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTareaCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTareaCliente, this.gridBagConstraintsTareaCliente);
		*/		
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTareaCliente.gridx =0;
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTareaCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTareaCliente, this.gridBagConstraintsTareaCliente);
				
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTareaCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTareaCliente, this.gridBagConstraintsTareaCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TareaClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTareaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTareaCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosTareaCliente.setLayout(gridaBagLayoutBusquedasParametrosTareaCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTareaCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTareaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTareaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTareaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTareaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTareaCliente, this.gridBagConstraintsTareaCliente);
			
			
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTareaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTareaCliente, this.gridBagConstraintsTareaCliente);
		
			
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTareaCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTareaCliente, this.gridBagConstraintsTareaCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTareaCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTareaCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTareaCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTareaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTareaCliente.setName("jPanelReporteDinamicoTareaCliente"); 
		
		this.jPanelReporteDinamicoTareaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTareaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTareaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTareaCliente.setLayout(gridaBagLayoutReporteDinamicoTareaCliente);
		
		
		this.jInternalFrameReporteDinamicoTareaCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTareaCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTareaCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTareaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTareaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTareaCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTareaCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTareaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTareaCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoTareaCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoTareaCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTareaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTareaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTareaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarea Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTareaCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteTareaCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTareaCliente.add(this.jLabelColumnasSelectReporteTareaCliente, this.gridBagConstraintsTareaCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTareaCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteTareaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTareaCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTareaCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTareaCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTareaCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTareaCliente=new JScrollPane(this.jListColumnasSelectReporteTareaCliente);
			
			this.jScrollColumnasSelectReporteTareaCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTareaCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTareaCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTareaCliente.add(this.jListColumnasSelectReporteTareaCliente, this.gridBagConstraintsTareaCliente);
		this.jPanelReporteDinamicoTareaCliente.add(this.jScrollColumnasSelectReporteTareaCliente, this.gridBagConstraintsTareaCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTareaCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteTareaCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTareaCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteTareaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTareaCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTareaCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTareaCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTareaCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTareaCliente=new JScrollPane(this.jListRelacionesSelectReporteTareaCliente);
			
			this.jScrollRelacionesSelectReporteTareaCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTareaCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTareaCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTareaCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTareaCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoTareaCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTareaCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTareaCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTareaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTareaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTareaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTareaCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTareaCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTareaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTareaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTareaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTareaCliente = new JLabelMe();

		this.jLabelConGraficoDinamicoTareaCliente.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTareaCliente.add(this.jLabelConGraficoDinamicoTareaCliente, this.gridBagConstraintsTareaCliente);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTareaCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTareaCliente.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTareaCliente.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTareaCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTareaCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTareaCliente.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTareaCliente.add(this.jCheckBoxConGraficoDinamicoTareaCliente, this.gridBagConstraintsTareaCliente);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTareaCliente = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTareaCliente.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTareaCliente.add(this.jLabelColumnaCategoriaGraficoTareaCliente, this.gridBagConstraintsTareaCliente);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTareaCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTareaCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTareaCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTareaCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTareaCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTareaCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTareaCliente.add(this.jComboBoxColumnaCategoriaGraficoTareaCliente, this.gridBagConstraintsTareaCliente);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTareaCliente = new JLabelMe();

		this.jLabelColumnaCategoriaValorTareaCliente.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTareaCliente.add(this.jLabelColumnaCategoriaValorTareaCliente, this.gridBagConstraintsTareaCliente);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTareaCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTareaCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTareaCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTareaCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTareaCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTareaCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTareaCliente.add(this.jComboBoxColumnaCategoriaValorTareaCliente, this.gridBagConstraintsTareaCliente);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTareaCliente = new JLabelMe();

		this.jLabelColumnasValoresGraficoTareaCliente.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTareaCliente.add(this.jLabelColumnasValoresGraficoTareaCliente, this.gridBagConstraintsTareaCliente);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTareaCliente = new JList<Reporte>();
		this.jListColumnasValoresGraficoTareaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTareaCliente.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTareaCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTareaCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTareaCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTareaCliente=new JScrollPane(this.jListColumnasValoresGraficoTareaCliente);
			
			this.jScrollColumnasValoresGraficoTareaCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTareaCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTareaCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTareaCliente.add(this.jListColumnasSelectReporteTareaCliente, this.gridBagConstraintsTareaCliente);
		this.jPanelReporteDinamicoTareaCliente.add(this.jScrollColumnasValoresGraficoTareaCliente, this.gridBagConstraintsTareaCliente);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTareaCliente = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTareaCliente.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTareaCliente.add(this.jLabelTiposGraficosReportesDinamicoTareaCliente, this.gridBagConstraintsTareaCliente);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTareaCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTareaCliente.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTareaCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTareaCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTareaCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTareaCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTareaCliente.add(this.jComboBoxTiposGraficosReportesDinamicoTareaCliente, this.gridBagConstraintsTareaCliente);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTareaCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTareaCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTareaCliente.add(this.jLabelGenerarExcelReporteDinamicoTareaCliente, this.gridBagConstraintsTareaCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTareaCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTareaCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTareaCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTareaCliente.setToolTipText("Generar EXCEL"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTareaCliente.add(this.jButtonGenerarExcelReporteDinamicoTareaCliente, this.gridBagConstraintsTareaCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTareaCliente.add(this.jComboBoxTiposReportesDinamicoTareaCliente, this.gridBagConstraintsTareaCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTareaCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTareaCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTareaCliente.add(this.jLabelTiposArchivoReporteDinamicoTareaCliente, this.gridBagConstraintsTareaCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTareaCliente.add(this.jComboBoxTiposArchivosReportesDinamicoTareaCliente, this.gridBagConstraintsTareaCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTareaCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTareaCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTareaCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTareaCliente.setToolTipText("Generar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTareaCliente.add(this.jButtonGenerarReporteDinamicoTareaCliente, this.gridBagConstraintsTareaCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTareaCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTareaCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTareaCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTareaCliente.setToolTipText("Cancelar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTareaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTareaCliente.add(this.jButtonCerrarReporteDinamicoTareaCliente, this.gridBagConstraintsTareaCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTareaCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTareaCliente= new JScrollPane(jPanelReporteDinamicoTareaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTareaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTareaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTareaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarea Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTareaCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTareaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTareaCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTareaCliente);
		this.jInternalFrameReporteDinamicoTareaCliente.getContentPane().add(this.jScrollPanelReporteDinamicoTareaCliente, this.gridBagConstraintsTareaCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTareaCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTareaCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTareaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTareaCliente.setName("jPanelImportacionTareaCliente"); 
		
		this.jPanelImportacionTareaCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTareaCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTareaCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTareaCliente.setLayout(gridaBagLayoutImportacionTareaCliente);
		
		
		this.jInternalFrameImportacionTareaCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTareaCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTareaCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTareaCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTareaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTareaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTareaCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTareaCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTareaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTareaCliente.setResizable(true);
	    this.jInternalFrameImportacionTareaCliente.setClosable(true);
	    this.jInternalFrameImportacionTareaCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTareaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTareaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTareaCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTareaCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTareaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTareaCliente.setResizable(true);
	    this.jInternalFrameImportacionTareaCliente.setClosable(true);
	    this.jInternalFrameImportacionTareaCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTareaCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTareaCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTareaCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarea Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTareaCliente = new JLabelMe();

		this.jLabelArchivoImportacionTareaCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTareaCliente.add(this.jLabelArchivoImportacionTareaCliente, this.gridBagConstraintsTareaCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTareaCliente = new JFileChooser();		
		this.jFileChooserImportacionTareaCliente.setToolTipText("ESCOGER ARCHIVO"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTareaCliente = new JButtonMe();
		this.jButtonAbrirImportacionTareaCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTareaCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTareaCliente.setToolTipText("Generar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTareaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTareaCliente.add(this.jButtonAbrirImportacionTareaCliente, this.gridBagConstraintsTareaCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTareaCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionTareaCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTareaCliente.add(this.jLabelPathArchivoImportacionTareaCliente, this.gridBagConstraintsTareaCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTareaCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTareaCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTareaCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTareaCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTareaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTareaCliente.add(this.jTextFieldPathArchivoImportacionTareaCliente, this.gridBagConstraintsTareaCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTareaCliente = new JButtonMe();
		this.jButtonGenerarImportacionTareaCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTareaCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTareaCliente.setToolTipText("Generar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTareaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTareaCliente.add(this.jButtonGenerarImportacionTareaCliente, this.gridBagConstraintsTareaCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTareaCliente = new JButtonMe();
		this.jButtonCerrarImportacionTareaCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTareaCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTareaCliente.setToolTipText("Cancelar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTareaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTareaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTareaCliente.add(this.jButtonCerrarImportacionTareaCliente, this.gridBagConstraintsTareaCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTareaCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionTareaCliente= new JScrollPane(jPanelImportacionTareaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsTareaCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTareaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTareaCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTareaCliente);
		this.jInternalFrameImportacionTareaCliente.getContentPane().add(this.jScrollPanelImportacionTareaCliente, this.gridBagConstraintsTareaCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTareaCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTareaCliente = new JButtonMe();
			this.jButtonAbrirOrderByTareaCliente.setText("Orden");
			this.jButtonAbrirOrderByTareaCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTareaCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTareaCliente";
			inputMap = this.jButtonAbrirOrderByTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTareaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTareaCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByTareaCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTareaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTareaCliente.setName("jPanelOrderByTareaCliente"); 
			
			this.jPanelOrderByTareaCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTareaCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTareaCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTareaCliente.setLayout(gridaBagLayoutOrderByTareaCliente);
			
			
			this.jTableDatosTareaClienteOrderBy = new JTableMe();        
			this.jTableDatosTareaClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTareaClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTareaClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTareaClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTareaClienteOrderBy.setViewportView(this.jTableDatosTareaClienteOrderBy);
			this.jTableDatosTareaClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTareaClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTareaCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTareaCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTareaCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTareaCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTareaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTareaCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTareaCliente.setTitle("Orden");
			this.jInternalFrameOrderByTareaCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTareaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTareaCliente.setResizable(true);
			this.jInternalFrameOrderByTareaCliente.setClosable(true);
			this.jInternalFrameOrderByTareaCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTareaCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTareaCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTareaCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarea Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTareaCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTareaCliente.ipady =150;
				
			this.jPanelOrderByTareaCliente.add(jScrollPanelDatosTareaClienteOrderBy, this.gridBagConstraintsTareaCliente);//this.jTableDatosTareaClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTareaCliente = new JButtonMe();
			this.jButtonCerrarOrderByTareaCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTareaCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTareaCliente.setToolTipText("Cancelar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTareaCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTareaCliente.add(this.jButtonCerrarOrderByTareaCliente, this.gridBagConstraintsTareaCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTareaCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByTareaCliente= new JScrollPane(jPanelOrderByTareaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsTareaCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTareaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTareaCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTareaCliente);
			
			this.jInternalFrameOrderByTareaCliente.getContentPane().add(this.jScrollPanelOrderByTareaCliente, this.gridBagConstraintsTareaCliente);			
		
		} else {
			this.jButtonAbrirOrderByTareaCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//2030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tareaclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTareaCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTareaCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTareaCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTareaCliente.getRowHeight();//TareaClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TareaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTareaCliente.isSelected()) {
					iHeightTable=TareaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TareaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TareaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TareaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTareaCliente.isSelected()) {
					iHeightTable=TareaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TareaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TareaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTareaCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTareaCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTareaCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTareaCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTareaCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTareaCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTareaCliente!=null && this.jInternalFrameOrderByTareaCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTareaCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTareaCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTareaCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTareaCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTareaCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTareaCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTareaCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTareaCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTareaCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTareaCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tareaclienteLogic.getTareaClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tareaclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TareaCliente> TraerTareaClienteBeans(List<TareaCliente> tareaclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(TareaCliente tareacliente:tareaclientes) {
					
				if(!(TareaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TareaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tareacliente.setsDetalleGeneralEntityReporte(TareaClienteConstantesFunciones.getTareaClienteDescripcion(tareacliente));
										
						
					
						
					
				} else  {
							
					//tareacliente.setsDetalleGeneralEntityReporte(tareacliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//tareaclientebeans.add(tareaclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tareaclientes;
    }
	//PARA REPORTES FIN
}
