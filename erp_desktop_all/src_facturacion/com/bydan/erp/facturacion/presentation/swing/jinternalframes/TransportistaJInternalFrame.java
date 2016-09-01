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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.facturacion.util.TransportistaConstantesFunciones;

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
public class TransportistaJInternalFrame extends TransportistaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTransportista;
	
	protected JMenuBar jmenuBarTransportista;
	
	protected JMenu jmenuTransportista;
	protected JMenu jmenuDatosTransportista;
	protected JMenu jmenuArchivoTransportista;
	protected JMenu jmenuAccionesTransportista;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTransportista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransportista;	
	protected GridBagConstraints gridBagConstraintsTransportista;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TransportistaDetalleFormJInternalFrame jInternalFrameDetalleFormTransportista;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTransportista;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTransportista;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoviatransporte="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public TransportistaSessionBean transportistaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoViaTransporteSessionBean tipoviatransporteSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Transportista> transportistas;		
	public List<Transportista> transportistasEliminados;	
	public List<Transportista> transportistasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTransportista;		
	protected JButton jButtonAbrirOrderByTransportista;
	
	
	//protected JPanel jPanelOrderByTransportista;
	//public JScrollPane jScrollPanelOrderByTransportista;	
	//protected JButton jButtonCerrarOrderByTransportista;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TransportistaLogic transportistaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTransportista;
	public JScrollPane jScrollPanelDatosEdicionTransportista;
	public JScrollPane jScrollPanelDatosGeneralTransportista;
    
	
	
	//public JScrollPane jScrollPanelDatosTransportistaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTransportista;
	//public JScrollPane jScrollPanelImportacionTransportista;
	
	
	
	protected JPanel jPanelAccionesTransportista;
	
    protected JPanel jPanelPaginacionTransportista;
    protected JPanel jPanelParametrosReportesTransportista;
	protected JPanel jPanelParametrosReportesAccionesTransportista;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Transportista;
	protected JPanel jPanelParametrosAuxiliar2Transportista;
	protected JPanel jPanelParametrosAuxiliar3Transportista;
	protected JPanel jPanelParametrosAuxiliar4Transportista;
	//protected JPanel jPanelParametrosAuxiliar5Transportista;
	
	
	
	//protected JPanel jPanelReporteDinamicoTransportista;
	//protected JPanel jPanelImportacionTransportista;
	
	
	public JTable jTableDatosTransportista;
	
	
	
	//public JTable jTableDatosTransportistaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTransportista;
	protected JButton jButtonDuplicarTransportista;
	protected JButton jButtonCopiarTransportista;
	protected JButton jButtonVerFormTransportista;
	protected JButton jButtonNuevoRelacionesTransportista;
	protected JButton jButtonModificarTransportista;
	
    protected JButton jButtonGuardarCambiosTablaTransportista;
	protected JButton jButtonCerrarTransportista;
	
	
	protected JButton jButtonRecargarInformacionTransportista;
	protected JButton jButtonProcesarInformacionTransportista;
	
	
	protected JButton jButtonAnterioresTransportista;
	protected JButton jButtonSiguientesTransportista;
	protected JButton jButtonNuevoGuardarCambiosTransportista;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTransportista;
	//protected JButton jButtonCerrarReporteDinamicoTransportista;
	//protected JButton jButtonGenerarExcelReporteDinamicoTransportista;	
	
	
	
	//protected JButton jButtonAbrirImportacionTransportista;
	//protected JButton jButtonGenerarImportacionTransportista;
	//protected JButton jButtonCerrarImportacionTransportista;
	//protected JFileChooser jFileChooserImportacionTransportista;
	//protected File fileImportacionTransportista;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransportista;
	protected JButton jButtonDuplicarToolBarTransportista;
	protected JButton jButtonNuevoRelacionesToolBarTransportista;
	
	
	public JButton jButtonGuardarCambiosToolBarTransportista;
	protected JButton jButtonCopiarToolBarTransportista;
	protected JButton jButtonVerFormToolBarTransportista;
	public JButton jButtonGuardarCambiosTablaToolBarTransportista;
	protected JButton jButtonMostrarOcultarTablaToolBarTransportista;
	protected JButton jButtonCerrarToolBarTransportista;
	
	protected JButton jButtonRecargarInformacionToolBarTransportista;
	protected JButton jButtonProcesarInformacionToolBarTransportista;
	protected JButton jButtonAnterioresToolBarTransportista;
	protected JButton jButtonSiguientesToolBarTransportista;
	protected JButton jButtonNuevoGuardarCambiosToolBarTransportista;
	protected JButton jButtonAbrirOrderByToolBarTransportista;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransportista;
	protected JMenuItem jMenuItemDuplicarTransportista;
	protected JMenuItem jMenuItemNuevoRelacionesTransportista;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTransportista;
	protected JMenuItem jMenuItemCopiarTransportista;
	protected JMenuItem jMenuItemVerFormTransportista;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransportista;
	protected JMenuItem jMenuItemCerrarTransportista;
	protected JMenuItem jMenuItemDetalleCerrarTransportista;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTransportista;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransportista;
	
	protected JMenuItem jMenuItemRecargarInformacionTransportista;
	protected JMenuItem jMenuItemProcesarInformacionTransportista;
	protected JMenuItem jMenuItemAnterioresTransportista;
	protected JMenuItem jMenuItemSiguientesTransportista;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransportista;
	protected JMenuItem jMenuItemAbrirOrderByTransportista;
	protected JMenuItem jMenuItemMostrarOcultarTransportista;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransportista;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTransportista;
	protected JCheckBox jCheckBoxSeleccionadosTransportista;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTransportista;
	protected JCheckBox jCheckBoxConGraficoReporteTransportista;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTransportista;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTransportista;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTransportista;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTransportista;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTransportista;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTransportista;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransportista;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransportista;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTransportista;
	protected JTextField jTextFieldValorCampoGeneralTransportista;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTransportista;
	//public JList<Reporte> jListColumnasSelectReporteTransportista;
	//public JScrollPane jScrollColumnasSelectReporteTransportista;
	
	//public JLabel jLabelRelacionesSelectReporteTransportista;
	//public JList<Reporte> jListRelacionesSelectReporteTransportista;
	//public JScrollPane jScrollRelacionesSelectReporteTransportista;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTransportista;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTransportista;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTransportista;
	//public JLabel jLabelTiposArchivoReporteDinamicoTransportista;
	
		
	//public JLabel jLabelArchivoImportacionTransportista;	
	//public JLabel jLabelPathArchivoImportacionTransportista;
	//protected JTextField jTextFieldPathArchivoImportacionTransportista;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTransportista;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTransportista;
	
	//public JLabel jLabelColumnaCategoriaValorTransportista;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTransportista;
	
	//public JLabel jLabelColumnasValoresGraficoTransportista;
	//public JList<Reporte> jListColumnasValoresGraficoTransportista;
	//public JScrollPane jScrollColumnasValoresGraficoTransportista;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTransportista;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTransportista;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTransportista;
	public JPanel jPanelBusquedaPorIdentificacionTransportista;
	public JButton jButtonBusquedaPorIdentificacionTransportista;
	public JPanel jPanelBusquedaPorNombreCompletoTransportista;
	public JButton jButtonBusquedaPorNombreCompletoTransportista;
	public JPanel jPanelBusquedaPorPlacaTransportista;
	public JButton jButtonBusquedaPorPlacaTransportista;
	public JPanel jPanelBusquedaPorRucTransportista;
	public JButton jButtonBusquedaPorRucTransportista;
	public JPanel jPanelBusquedaPorTelefonoTransportista;
	public JButton jButtonBusquedaPorTelefonoTransportista;
	public JPanel jPanelFK_IdClienteTransportista;
	public JButton jButtonFK_IdClienteTransportista;
	public JPanel jPanelFK_IdTipoViaTransporteTransportista;
	public JButton jButtonFK_IdTipoViaTransporteTransportista;
	
	public JPanel jPanelidentificacionBusquedaPorIdentificacionTransportista;
	public JLabel jLabelidentificacionBusquedaPorIdentificacionTransportista;
	public JTextField jTextFieldidentificacionBusquedaPorIdentificacionTransportista;
	public JButton jButtonidentificacionBusquedaPorIdentificacionTransportistaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombre_completoBusquedaPorNombreCompletoTransportista;
	public JLabel jLabelnombre_completoBusquedaPorNombreCompletoTransportista;
	public JTextArea jTextAreanombre_completoBusquedaPorNombreCompletoTransportista;
	public JButton jButtonnombre_completoBusquedaPorNombreCompletoTransportistaBusqueda= new JButtonMe();

	
	public JPanel jPanelplacaBusquedaPorPlacaTransportista;
	public JLabel jLabelplacaBusquedaPorPlacaTransportista;
	public JTextField jTextFieldplacaBusquedaPorPlacaTransportista;
	public JButton jButtonplacaBusquedaPorPlacaTransportistaBusqueda= new JButtonMe();

	
	public JPanel jPanelrucBusquedaPorRucTransportista;
	public JLabel jLabelrucBusquedaPorRucTransportista;
	public JTextField jTextFieldrucBusquedaPorRucTransportista;
	public JButton jButtonrucBusquedaPorRucTransportistaBusqueda= new JButtonMe();

	
	public JPanel jPaneltelefonoBusquedaPorTelefonoTransportista;
	public JLabel jLabeltelefonoBusquedaPorTelefonoTransportista;
	public JTextField jTextFieldtelefonoBusquedaPorTelefonoTransportista;
	public JButton jButtontelefonoBusquedaPorTelefonoTransportistaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteTransportista;
	public JLabel jLabelid_clienteFK_IdClienteTransportista;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteTransportista;
	public JButton jButtonid_clienteFK_IdClienteTransportista= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteTransportistaUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteTransportistaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteTransportista;
	
	public JPanel jPanelid_tipo_via_transporteFK_IdTipoViaTransporteTransportista;
	public JLabel jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransportista;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista;
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransporteTransportista= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransporteTransportistaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransporteTransportistaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=836;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TransportistaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Transportista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransportistaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transportista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransportistaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transportista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransportistaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Transportista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTransportista)	{
		this.jButtonRecargarInformacionTransportista = jButtonRecargarInformacionTransportista;
	}
	
	public JButton getjButtonProcesarInformacionTransportista() {
		return this.jButtonProcesarInformacionTransportista;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransportista)	{
		this.jButtonProcesarInformacionTransportista = jButtonProcesarInformacionTransportista;
	}
	
	
	public JButton getjButtonRecargarInformacionTransportista() {
		return this.jButtonRecargarInformacionTransportista;
	}
	
	
	public List<Transportista> gettransportistas() {
		return this.transportistas;
	}

	public void settransportistas(List<Transportista> transportistas) {
		this.transportistas = transportistas;
	}
	
	public List<Transportista> gettransportistasAux() {
		return this.transportistasAux;
	}

	public void settransportistasAux(List<Transportista> transportistasAux) {
		this.transportistasAux = transportistasAux;
	}
	
	public List<Transportista> gettransportistasEliminados() {
		return this.transportistasEliminados;
	}

	public void setTransportistasEliminados(List<Transportista> transportistasEliminados) {
		this.transportistasEliminados = transportistasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTransportista() {
		return jComboBoxTiposSeleccionarTransportista;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTransportista(
			JComboBox jComboBoxTiposSeleccionarTransportista) {
		this.jComboBoxTiposSeleccionarTransportista = jComboBoxTiposSeleccionarTransportista;
	}
	
	public void setBorderResaltarTiposSeleccionarTransportista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTransportista.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTransportista .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTransportista() {
		return jTextFieldValorCampoGeneralTransportista;
	}

	public void setjTextFieldValorCampoGeneralTransportista(
			JTextField jTextFieldValorCampoGeneralTransportista) {
		this.jTextFieldValorCampoGeneralTransportista = jTextFieldValorCampoGeneralTransportista;
	}

	public void setBorderResaltarValorCampoGeneralTransportista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransportista.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTransportista .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTransportista() {
		return this.jCheckBoxSeleccionarTodosTransportista;
	}

	public void setjCheckBoxSeleccionarTodosTransportista(
			JCheckBox jCheckBoxSeleccionarTodosTransportista) {
		this.jCheckBoxSeleccionarTodosTransportista = jCheckBoxSeleccionarTodosTransportista;
	}

	public void setBorderResaltarSeleccionarTodosTransportista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransportista.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTransportista .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTransportista() {
		return this.jCheckBoxSeleccionadosTransportista;
	}

	public void setjCheckBoxSeleccionadosTransportista(
			JCheckBox jCheckBoxSeleccionadosTransportista) {
		this.jCheckBoxSeleccionadosTransportista = jCheckBoxSeleccionadosTransportista;
	}
	
	public void setBorderResaltarSeleccionadosTransportista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransportista.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTransportista .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTransportista() {
		return this.jComboBoxTiposArchivosReportesTransportista;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTransportista(
			JComboBox jComboBoxTiposArchivosReportesTransportista) {
		this.jComboBoxTiposArchivosReportesTransportista = jComboBoxTiposArchivosReportesTransportista;
	}

	public void setBorderResaltarTiposArchivosReportesTransportista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransportista.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTransportista .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTransportista() {
		return this.jComboBoxTiposReportesTransportista;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTransportista(
			JComboBox jComboBoxTiposReportesTransportista) {
		this.jComboBoxTiposReportesTransportista = jComboBoxTiposReportesTransportista;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTransportista() {
	//	return jComboBoxTiposReportesDinamicoTransportista;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTransportista(
	//		JComboBox jComboBoxTiposReportesDinamicoTransportista) {
	//	this.jComboBoxTiposReportesDinamicoTransportista = jComboBoxTiposReportesDinamicoTransportista;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTransportista() {
	//	return jComboBoxTiposArchivosReportesDinamicoTransportista;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTransportista(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTransportista) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTransportista = jComboBoxTiposArchivosReportesDinamicoTransportista;
	//}
	
	public void setBorderResaltarTiposReportesTransportista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransportista.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTransportista .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTransportista() {
		return this.jComboBoxTiposGraficosReportesTransportista;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTransportista(
			JComboBox jComboBoxTiposGraficosReportesTransportista) {
		this.jComboBoxTiposGraficosReportesTransportista = jComboBoxTiposGraficosReportesTransportista;
	}
	
	public void setBorderResaltarTiposGraficosReportesTransportista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransportista.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTransportista .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTransportista() {
		return this.jComboBoxTiposPaginacionTransportista;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTransportista(
			JComboBox jComboBoxTiposPaginacionTransportista) {
		this.jComboBoxTiposPaginacionTransportista = jComboBoxTiposPaginacionTransportista;
	}
	
	public void setBorderResaltarTiposPaginacionTransportista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransportista.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTransportista .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTransportista() {
		return this.jComboBoxTiposRelacionesTransportista;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransportista() {
		return this.jComboBoxTiposAccionesTransportista;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransportista(
			JComboBox jComboBoxTiposRelacionesTransportista) {
		this.jComboBoxTiposRelacionesTransportista = jComboBoxTiposRelacionesTransportista;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransportista(
			JComboBox jComboBoxTiposAccionesTransportista) {
		this.jComboBoxTiposAccionesTransportista = jComboBoxTiposAccionesTransportista;
	}
	
	public void setBorderResaltarTiposRelacionesTransportista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransportista.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTransportista .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTransportista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransportista.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTransportista .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTransportista() {
	//	return jCheckBoxConGraficoDinamicoTransportista;
	//}

	//public void setjCheckBoxConGraficoDinamicoTransportista(
	//		JCheckBox jCheckBoxConGraficoDinamicoTransportista) {
	//	this.jCheckBoxConGraficoDinamicoTransportista = jCheckBoxConGraficoDinamicoTransportista;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTransportista() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTransportista.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTransportista .setBorder(borderResaltar);		
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
		this.transportistaSessionBean=new TransportistaSessionBean();
		
		this.transportistaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transportistaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transportistaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TransportistaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TransportistaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransportistaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransportistaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransportistaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transportista MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {
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
		
		TransportistaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Transportista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTransportista= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTransportista,this.jTtoolBarTransportista,
							"nuevo","nuevo","Nuevo"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTransportista,this.jTtoolBarTransportista,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTransportista,this.jTtoolBarTransportista,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTransportista,this.jTtoolBarTransportista,
							"duplicar","duplicar","Duplicar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTransportista,this.jTtoolBarTransportista,
							"copiar","copiar","Copiar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTransportista,this.jTtoolBarTransportista,
							"ver_form","ver_form","Ver"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransportista,this.jTtoolBarTransportista,
							"recargar","recargar","Recargar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransportista,this.jTtoolBarTransportista,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransportista,this.jTtoolBarTransportista,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTransportista,this.jTtoolBarTransportista,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTransportista,this.jTtoolBarTransportista,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTransportista,this.jTtoolBarTransportista,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTransportista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTransportista,this.jTtoolBarTransportista,
							"cerrar","cerrar","Salir"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTransportista=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTransportista;
			
				this.jButtonProcesarInformacionToolBarTransportista=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTransportista;
				
		//protected JButton jButtonModificarToolBarTransportista;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTransportista=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTransportista=new JMenuMe("General");
		this.jmenuArchivoTransportista=new JMenuMe("Archivo");
		this.jmenuAccionesTransportista=new JMenuMe("Acciones");
		this.jmenuDatosTransportista=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransportista= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransportista.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransportista,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTransportista= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTransportista.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTransportista,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTransportista= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTransportista.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTransportista,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTransportista= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransportista.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransportista,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTransportista= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTransportista.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTransportista,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTransportista= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTransportista.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTransportista,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTransportista= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTransportista.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTransportista,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransportista= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransportista.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransportista,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTransportista= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTransportista.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTransportista,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTransportista= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTransportista.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTransportista,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTransportista= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTransportista.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTransportista,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTransportista= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTransportista.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTransportista,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTransportista= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTransportista.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTransportista,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransportista= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransportista.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransportista,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTransportista= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTransportista.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTransportista,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransportista= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransportista.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransportista,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTransportista= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTransportista.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTransportista,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTransportista.add(this.jMenuItemCerrarTransportista);
			
			this.jmenuAccionesTransportista.add(this.jMenuItemNuevoTransportista);
			this.jmenuAccionesTransportista.add(this.jMenuItemNuevoGuardarCambiosTransportista);
			this.jmenuAccionesTransportista.add(this.jMenuItemNuevoRelacionesTransportista);
			this.jmenuAccionesTransportista.add(this.jMenuItemGuardarCambiosTablaTransportista);		
			this.jmenuAccionesTransportista.add(this.jMenuItemDuplicarTransportista);		
			this.jmenuAccionesTransportista.add(this.jMenuItemCopiarTransportista);		
			this.jmenuAccionesTransportista.add(this.jMenuItemVerFormTransportista);		
			
			this.jmenuDatosTransportista.add(this.jMenuItemRecargarInformacionTransportista);				
			this.jmenuDatosTransportista.add(this.jMenuItemAnterioresTransportista);				
			this.jmenuDatosTransportista.add(this.jMenuItemSiguientesTransportista);				
			this.jmenuDatosTransportista.add(this.jMenuItemAbrirOrderByTransportista);				
			this.jmenuDatosTransportista.add(this.jMenuItemMostrarOcultarTransportista);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTransportista.add(this.jMenuItemGuardarCambiosTransportista);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTransportista.add(this.jmenuArchivoTransportista);		
			this.jmenuBarTransportista.add(this.jmenuAccionesTransportista);		
			this.jmenuBarTransportista.add(this.jmenuDatosTransportista);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTransportista);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTransportista() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdentificacionTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdentificacionTransportista.setToolTipText("Buscar Por Identificacion ");
		this.jButtonBusquedaPorIdentificacionTransportista= new JButtonMe();
		this.jButtonBusquedaPorIdentificacionTransportista.setText("Buscar");
		this.jButtonBusquedaPorIdentificacionTransportista.setToolTipText("Buscar Por Identificacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdentificacionTransportista,"buscar_button","Buscar Por Identificacion ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdentificacionTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidentificacionBusquedaPorIdentificacionTransportista = new JLabelMe();
		jLabelidentificacionBusquedaPorIdentificacionTransportista.setText("Identificacion :");
		jLabelidentificacionBusquedaPorIdentificacionTransportista.setToolTipText("Identificacion");
		jLabelidentificacionBusquedaPorIdentificacionTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidentificacionBusquedaPorIdentificacionTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidentificacionBusquedaPorIdentificacionTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidentificacionBusquedaPorIdentificacionTransportista,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldidentificacionBusquedaPorIdentificacionTransportista= new JTextFieldMe();
		jTextFieldidentificacionBusquedaPorIdentificacionTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionBusquedaPorIdentificacionTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionBusquedaPorIdentificacionTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionBusquedaPorIdentificacionTransportista,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreCompletoTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreCompletoTransportista.setToolTipText("Buscar Por Nombre Completo ");
		this.jButtonBusquedaPorNombreCompletoTransportista= new JButtonMe();
		this.jButtonBusquedaPorNombreCompletoTransportista.setText("Buscar");
		this.jButtonBusquedaPorNombreCompletoTransportista.setToolTipText("Buscar Por Nombre Completo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreCompletoTransportista,"buscar_button","Buscar Por Nombre Completo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreCompletoTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombre_completoBusquedaPorNombreCompletoTransportista = new JLabelMe();
		jLabelnombre_completoBusquedaPorNombreCompletoTransportista.setText("Nombre Completo :");
		jLabelnombre_completoBusquedaPorNombreCompletoTransportista.setToolTipText("Nombre Completo");
		jLabelnombre_completoBusquedaPorNombreCompletoTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_completoBusquedaPorNombreCompletoTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_completoBusquedaPorNombreCompletoTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoBusquedaPorNombreCompletoTransportista,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombre_completoBusquedaPorNombreCompletoTransportista= new JTextAreaMe();
		jTextAreanombre_completoBusquedaPorNombreCompletoTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoBusquedaPorNombreCompletoTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoBusquedaPorNombreCompletoTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoBusquedaPorNombreCompletoTransportista,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorPlacaTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorPlacaTransportista.setToolTipText("Buscar Por Placa ");
		this.jButtonBusquedaPorPlacaTransportista= new JButtonMe();
		this.jButtonBusquedaPorPlacaTransportista.setText("Buscar");
		this.jButtonBusquedaPorPlacaTransportista.setToolTipText("Buscar Por Placa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorPlacaTransportista,"buscar_button","Buscar Por Placa ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorPlacaTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelplacaBusquedaPorPlacaTransportista = new JLabelMe();
		jLabelplacaBusquedaPorPlacaTransportista.setText("Placa :");
		jLabelplacaBusquedaPorPlacaTransportista.setToolTipText("Placa");
		jLabelplacaBusquedaPorPlacaTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelplacaBusquedaPorPlacaTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelplacaBusquedaPorPlacaTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelplacaBusquedaPorPlacaTransportista,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldplacaBusquedaPorPlacaTransportista= new JTextFieldMe();
		jTextFieldplacaBusquedaPorPlacaTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldplacaBusquedaPorPlacaTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldplacaBusquedaPorPlacaTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldplacaBusquedaPorPlacaTransportista,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorRucTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorRucTransportista.setToolTipText("Buscar Por Ruc ");
		this.jButtonBusquedaPorRucTransportista= new JButtonMe();
		this.jButtonBusquedaPorRucTransportista.setText("Buscar");
		this.jButtonBusquedaPorRucTransportista.setToolTipText("Buscar Por Ruc ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorRucTransportista,"buscar_button","Buscar Por Ruc ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorRucTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelrucBusquedaPorRucTransportista = new JLabelMe();
		jLabelrucBusquedaPorRucTransportista.setText("Ruc :");
		jLabelrucBusquedaPorRucTransportista.setToolTipText("Ruc");
		jLabelrucBusquedaPorRucTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaPorRucTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaPorRucTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelrucBusquedaPorRucTransportista,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldrucBusquedaPorRucTransportista= new JTextFieldMe();
		jTextFieldrucBusquedaPorRucTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaPorRucTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaPorRucTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucBusquedaPorRucTransportista,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorTelefonoTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorTelefonoTransportista.setToolTipText("Buscar Por Telefono ");
		this.jButtonBusquedaPorTelefonoTransportista= new JButtonMe();
		this.jButtonBusquedaPorTelefonoTransportista.setText("Buscar");
		this.jButtonBusquedaPorTelefonoTransportista.setToolTipText("Buscar Por Telefono ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorTelefonoTransportista,"buscar_button","Buscar Por Telefono ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorTelefonoTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabeltelefonoBusquedaPorTelefonoTransportista = new JLabelMe();
		jLabeltelefonoBusquedaPorTelefonoTransportista.setText("Telefono :");
		jLabeltelefonoBusquedaPorTelefonoTransportista.setToolTipText("Telefono");
		jLabeltelefonoBusquedaPorTelefonoTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeltelefonoBusquedaPorTelefonoTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeltelefonoBusquedaPorTelefonoTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabeltelefonoBusquedaPorTelefonoTransportista,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldtelefonoBusquedaPorTelefonoTransportista= new JTextFieldMe();
		jTextFieldtelefonoBusquedaPorTelefonoTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoBusquedaPorTelefonoTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoBusquedaPorTelefonoTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoBusquedaPorTelefonoTransportista,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteTransportista.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteTransportista= new JButtonMe();
		this.jButtonFK_IdClienteTransportista.setText("Buscar");
		this.jButtonFK_IdClienteTransportista.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteTransportista,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteTransportista = new JLabelMe();
		jLabelid_clienteFK_IdClienteTransportista.setText("Cliente :");
		jLabelid_clienteFK_IdClienteTransportista.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteTransportista,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteTransportista= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteTransportista,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteTransportista= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteTransportista.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteTransportista.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteTransportista.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteTransportista.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteTransportista.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteTransportista.setFocusable(false);

		this.jPanelFK_IdTipoViaTransporteTransportista=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoViaTransporteTransportista.setToolTipText("Buscar Por Tipo Via Transporte ");
		this.jButtonFK_IdTipoViaTransporteTransportista= new JButtonMe();
		this.jButtonFK_IdTipoViaTransporteTransportista.setText("Buscar");
		this.jButtonFK_IdTipoViaTransporteTransportista.setToolTipText("Buscar Por Tipo Via Transporte ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoViaTransporteTransportista,"buscar_button","Buscar Por Tipo Via Transporte ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoViaTransporteTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransportista = new JLabelMe();
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.setText("Tipo Via Transporte :");
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.setToolTipText("Tipo Via Transporte");
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransportista,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista= new JComboBoxMe();
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTransportista=new JTabbedPane();


		this.jTabbedPaneBusquedasTransportista.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTransportista.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTransportista.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTransportista.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTransportista,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTransportista = new TransportistaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Transportista DATOS");
			this.jInternalFrameDetalleFormTransportista = new TransportistaDetalleFormJInternalFrame(jDesktopPane,this.transportistaSessionBean.getConGuardarRelaciones(),this.transportistaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTransportista = null;//new TransportistaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransportista= new GridBagLayout();
		
		
		this.jTableDatosTransportista = new JTableMe();      
		
		String sToolTipTransportista="";
		sToolTipTransportista=TransportistaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransportista+="(Facturacion.Transportista)";
		}
		
		if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransportista+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTransportista.setToolTipText(sToolTipTransportista);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTransportista);
		this.jTableDatosTransportista.setAutoCreateRowSorter(true);
		this.jTableDatosTransportista.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTransportista.setRowSelectionAllowed(true);
		this.jTableDatosTransportista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTransportista,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTransportista = new JButtonMe();
		this.jButtonDuplicarTransportista = new JButtonMe();
		this.jButtonCopiarTransportista = new JButtonMe();
		this.jButtonVerFormTransportista = new JButtonMe();
		this.jButtonNuevoRelacionesTransportista = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTransportista = new JButtonMe();
		this.jButtonCerrarTransportista = new JButtonMe();
		
		this.jScrollPanelDatosTransportista = new JScrollPane();   
        this.jScrollPanelDatosGeneralTransportista = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTransportista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Transportista";
		
		if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transportistas" + this.sPath));
		} else {
			this.jScrollPanelDatosTransportista.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransportista.setToolTipText("Acciones");
        this.jPanelAccionesTransportista.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransportista, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransportista, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTransportista=new ReporteDinamicoJInternalFrame(TransportistaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTransportista();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTransportista=new ImportacionJInternalFrame(TransportistaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTransportista();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTransportista = new JButtonMe();
		
		this.jButtonAbrirOrderByTransportista.setText("Orden");
		this.jButtonAbrirOrderByTransportista.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransportista,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTransportista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransportista=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransportista,false,this);
			
			//this.cargarOrderByTransportista(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransportista=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransportista,true,this);
			
			//this.cargarOrderByTransportista(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTransportista.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosTransportista.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosTransportista.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosTransportista.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransportista.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransportista.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTransportista.setText("Nuevo");
		this.jButtonDuplicarTransportista.setText("Duplicar");
		this.jButtonCopiarTransportista.setText("Copiar");
		this.jButtonVerFormTransportista.setText("Ver");
		this.jButtonNuevoRelacionesTransportista.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTransportista.setText("Guardar");
		this.jButtonCerrarTransportista.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransportista,"nuevo_button","Nuevo",this.transportistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTransportista,"duplicar_button","Duplicar",this.transportistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTransportista,"copiar_button","Copiar",this.transportistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTransportista,"ver_form","Ver",this.transportistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTransportista,"nuevorelaciones_button","Nuevo Rel",this.transportistaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransportista,"guardarcambiostabla_button","Guardar",this.transportistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransportista,"cerrar_button","Salir",this.transportistaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTransportista, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTransportista.setToolTipText("Nuevo"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTransportista.setToolTipText("Duplicar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTransportista.setToolTipText("Copiar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTransportista.setToolTipText("Ver"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTransportista.setToolTipText("Nuevo Rel"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTransportista.setToolTipText("Guardar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransportista.setToolTipText("Salir"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransportista";
		inputMap = this.jButtonNuevoTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransportista.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransportista"));
		
		//DUPLICAR
		sMapKey = "DuplicarTransportista";
		inputMap = this.jButtonDuplicarTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTransportista.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTransportista"));
		
		//COPIAR
		sMapKey = "CopiarTransportista";
		inputMap = this.jButtonCopiarTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTransportista.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTransportista"));
		
		//VEr FORM
		sMapKey = "VerFormTransportista";
		inputMap = this.jButtonVerFormTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTransportista.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTransportista"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTransportista";
		inputMap = this.jButtonNuevoRelacionesTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTransportista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTransportista"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTransportista";
		inputMap = this.jButtonModificarTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTransportista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTransportista"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTransportista";
		inputMap = this.jButtonCerrarTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransportista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransportista"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransportista";
		inputMap = this.jButtonGuardarCambiosTablaTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransportista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransportista"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTransportista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTransportista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTransportista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Transportista= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Transportista= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Transportista= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Transportista= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Transportista= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTransportista.setName("jPanelParametrosReportesTransportista"); 
		
		this.jPanelParametrosReportesAccionesTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTransportista.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTransportista.setName("jPanelParametrosReportesAccionesTransportista"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTransportista, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTransportista, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTransportista = new JButtonMe();
		this.jButtonRecargarInformacionTransportista.setText("Recargar");
		this.jButtonRecargarInformacionTransportista.setToolTipText("Recargar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTransportista,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTransportista = new JButtonMe();
		this.jButtonProcesarInformacionTransportista.setText("Procesar");
		this.jButtonProcesarInformacionTransportista.setToolTipText("Procesar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTransportista.setVisible(false);
			
		this.jButtonProcesarInformacionTransportista.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransportista.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransportista.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTransportista = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransportista.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTransportista.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTransportista = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransportista.setText("TIPO");       
		this.jComboBoxTiposReportesTransportista.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTransportista = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransportista.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTransportista.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTransportista = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTransportista.setText("Paginacion");
		this.jComboBoxTiposPaginacionTransportista.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTransportista = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTransportista.setText("Accion");
		this.jComboBoxTiposRelacionesTransportista.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTransportista = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransportista.setText("Accion");
		this.jComboBoxTiposAccionesTransportista.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTransportista = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTransportista.setText("Accion");
		this.jComboBoxTiposSeleccionarTransportista.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTransportista=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTransportista.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransportista.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransportista.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTransportista = new JLabelMe();
		
		this.jLabelAccionesTransportista.setText("Acciones");		
		this.jLabelAccionesTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTransportista = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTransportista.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTransportista.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTransportista = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTransportista.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTransportista.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTransportista = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTransportista.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTransportista.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTransportista = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTransportista.setText("Graf.");
		this.jCheckBoxConGraficoReporteTransportista.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTransportista = new JButtonMe();
		//this.jButtonAnterioresTransportista.setText("<<");
        this.jButtonAnterioresTransportista.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTransportista,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTransportista = new JButtonMe();
		//this.jButtonSiguientesTransportista.setText(">>");
        this.jButtonSiguientesTransportista.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTransportista,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTransportista = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTransportista.setText("Nue");
        this.jButtonNuevoGuardarCambiosTransportista.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTransportista,"nuevoguardarcambios_button","Nue",this.transportistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTransportista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTransportista";
		inputMap = this.jButtonNuevoGuardarCambiosTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTransportista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTransportista"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTransportista";
		inputMap = this.jButtonRecargarInformacionTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTransportista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTransportista"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTransportista";
		inputMap = this.jButtonSiguientesTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTransportista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTransportista"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTransportista";
		inputMap = this.jButtonAnterioresTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTransportista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTransportista"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTransportista();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTransportista.setMinimumSize(new Dimension(this.getWidth(),TransportistaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransportistaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransportista.setMaximumSize(new Dimension(this.getWidth(),TransportistaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransportistaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransportista.setPreferredSize(new Dimension(this.getWidth(),TransportistaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransportistaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTransportista = new GridBagLayout();

			this.jPanelPaginacionTransportista.setLayout(gridaBagLayoutPaginacionTransportista);						
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.gridy = 0;
			this.gridBagConstraintsTransportista.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTransportista.add(this.jButtonAnterioresTransportista, this.gridBagConstraintsTransportista);
					
						
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransportista.gridy = 0;
			
			this.jPanelPaginacionTransportista.add(this.jButtonNuevoGuardarCambiosTransportista, this.gridBagConstraintsTransportista);
						
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTransportista.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransportista.gridy = 0;
			this.jPanelPaginacionTransportista.add(this.jButtonSiguientesTransportista, this.gridBagConstraintsTransportista);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.gridy = 1;
			this.gridBagConstraintsTransportista.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransportista.add(this.jButtonNuevoTransportista, this.gridBagConstraintsTransportista);
						
			
			
			if(!this.transportistaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTransportista = new GridBagConstraints();
				this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTransportista.gridy = 1;
				this.gridBagConstraintsTransportista.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTransportista.add(this.jButtonGuardarCambiosTablaTransportista, this.gridBagConstraintsTransportista);
			}
			
			
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.gridy = 1;
			this.gridBagConstraintsTransportista.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransportista.add(this.jButtonDuplicarTransportista, this.gridBagConstraintsTransportista);
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.gridy = 1;
			this.gridBagConstraintsTransportista.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransportista.add(this.jButtonCopiarTransportista, this.gridBagConstraintsTransportista);
		
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.gridy = 1;
			this.gridBagConstraintsTransportista.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransportista.add(this.jButtonVerFormTransportista, this.gridBagConstraintsTransportista);
		
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.gridy = 1;
			this.gridBagConstraintsTransportista.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTransportista.add(this.jButtonCerrarTransportista, this.gridBagConstraintsTransportista);
		
		
		
		this.jButtonRecargarInformacionTransportista.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransportista.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransportista.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTransportista, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTransportista.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransportista.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransportista.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTransportista.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransportista.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransportista.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTransportista.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransportista.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransportista.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTransportista.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransportista.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransportista.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTransportista.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransportista.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransportista.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTransportista.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransportista.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransportista.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTransportista.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransportista.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransportista.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTransportista.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransportista.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransportista.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTransportista.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransportista.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransportista.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTransportista, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTransportista.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransportista.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransportista.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTransportista.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransportista.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransportista.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTransportista = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTransportista = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Transportista = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Transportista = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Transportista = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Transportista = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTransportista.setLayout(gridaBagParametrosReportesTransportista);
			this.jPanelParametrosReportesAccionesTransportista.setLayout(gridaBagParametrosReportesAccionesTransportista);
			
			
			this.jPanelParametrosAuxiliar1Transportista.setLayout(gridaBagParametrosAuxiliar1Transportista);
			this.jPanelParametrosAuxiliar2Transportista.setLayout(gridaBagParametrosAuxiliar2Transportista);
			this.jPanelParametrosAuxiliar3Transportista.setLayout(gridaBagParametrosAuxiliar3Transportista);
			this.jPanelParametrosAuxiliar4Transportista.setLayout(gridaBagParametrosAuxiliar4Transportista);
			//this.jPanelParametrosAuxiliar5Transportista.setLayout(gridaBagParametrosAuxiliar2Transportista);			
			
			
			
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransportista.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransportista.add(this.jButtonRecargarInformacionTransportista, this.gridBagConstraintsTransportista);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransportista.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransportista.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Transportista.add(this.jComboBoxTiposPaginacionTransportista, this.gridBagConstraintsTransportista);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransportista.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransportista.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Transportista.add(this.jCheckBoxConAltoMaximoTablaTransportista, this.gridBagConstraintsTransportista);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransportista.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransportista.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Transportista.add(this.jComboBoxTiposArchivosReportesTransportista, this.gridBagConstraintsTransportista);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransportista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransportista.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransportista.add(this.jPanelParametrosAuxiliar1Transportista, this.gridBagConstraintsTransportista);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransportista.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Transportista.add(this.jComboBoxTiposReportesTransportista, this.gridBagConstraintsTransportista);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransportista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransportista.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransportista.add(this.jPanelParametrosAuxiliar4Transportista, this.gridBagConstraintsTransportista);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransportista.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransportista.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransportista.add(this.jComboBoxTiposReportesTransportista, this.gridBagConstraintsTransportista);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransportista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransportista.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransportista.add(this.jCheckBoxGenerarReporteTransportista, this.gridBagConstraintsTransportista);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransportista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransportista.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransportista.add(this.jPanelParametrosAuxiliar2Transportista, this.gridBagConstraintsTransportista);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransportista.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransportista.add(this.jLabelAccionesTransportista, this.gridBagConstraintsTransportista);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTransportista = new GridBagConstraints();
				this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTransportista.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTransportista.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTransportista.add(this.jButtonAbrirOrderByTransportista, this.gridBagConstraintsTransportista);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTransportista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransportista.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransportista.add(this.jComboBoxTiposSeleccionarTransportista, this.gridBagConstraintsTransportista);			
			
			
			/*
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransportista.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransportista.add(this.jCheckBoxSeleccionarTodosTransportista, this.gridBagConstraintsTransportista);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransportista.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Transportista.add(this.jCheckBoxSeleccionarTodosTransportista, this.gridBagConstraintsTransportista);															
				
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransportista.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Transportista.add(this.jCheckBoxSeleccionadosTransportista, this.gridBagConstraintsTransportista);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransportista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransportista.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransportista.add(this.jPanelParametrosAuxiliar3Transportista, this.gridBagConstraintsTransportista);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransportista.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransportista.add(this.jComboBoxTiposRelacionesTransportista, this.gridBagConstraintsTransportista);
				
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransportista.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransportista.add(this.jComboBoxTiposAccionesTransportista, this.gridBagConstraintsTransportista);
	
				
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransportista.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransportista.add(this.jTextFieldValorCampoGeneralTransportista, this.gridBagConstraintsTransportista);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTransportista = new GridBagLayout();

			this.jScrollPanelDatosTransportista.setLayout(gridaBagLayoutDatosTransportista);
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.gridy = 0;
			this.gridBagConstraintsTransportista.gridx = 0;
			
			this.jScrollPanelDatosTransportista.add(this.jTableDatosTransportista, this.gridBagConstraintsTransportista);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTransportista.setViewportView(this.jTableDatosTransportista);
		this.jTableDatosTransportista.setFillsViewportHeight(true);
		this.jTableDatosTransportista.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTransportista= new GridBagLayout();
		this.jPanelAccionesTransportista.setLayout(gridaBagLayoutAccionesTransportista);
		
		
		/*	
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransportista.gridy = 0;
		this.gridBagConstraintsTransportista.gridx = 0;
			
		this.jPanelAccionesTransportista.add(this.jButtonNuevoTransportista, this.gridBagConstraintsTransportista);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdentificacionTransportista= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdentificacionTransportista.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdentificacionTransportista.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdentificacionTransportista.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdentificacionTransportista.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdentificacionTransportista.setLayout(gridaBagLayoutBusquedaPorIdentificacionTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 0;
		gridBagConstraintsTransportista.gridx = 0;
		jPanelBusquedaPorIdentificacionTransportista.add(jLabelidentificacionBusquedaPorIdentificacionTransportista, gridBagConstraintsTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 0;
		gridBagConstraintsTransportista.gridx = 1;
		jPanelBusquedaPorIdentificacionTransportista.add(jTextFieldidentificacionBusquedaPorIdentificacionTransportista, gridBagConstraintsTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 1;
		gridBagConstraintsTransportista.gridx =1;
		jPanelBusquedaPorIdentificacionTransportista.add(jButtonBusquedaPorIdentificacionTransportista, gridBagConstraintsTransportista);

		jTabbedPaneBusquedasTransportista.addTab("1.-Por Identificacion ", jPanelBusquedaPorIdentificacionTransportista);
		jTabbedPaneBusquedasTransportista.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreCompletoTransportista= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreCompletoTransportista.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCompletoTransportista.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCompletoTransportista.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreCompletoTransportista.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreCompletoTransportista.setLayout(gridaBagLayoutBusquedaPorNombreCompletoTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 0;
		gridBagConstraintsTransportista.gridx = 0;
		jPanelBusquedaPorNombreCompletoTransportista.add(jLabelnombre_completoBusquedaPorNombreCompletoTransportista, gridBagConstraintsTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 0;
		gridBagConstraintsTransportista.gridx = 1;
		jPanelBusquedaPorNombreCompletoTransportista.add(jTextAreanombre_completoBusquedaPorNombreCompletoTransportista, gridBagConstraintsTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 1;
		gridBagConstraintsTransportista.gridx =1;
		jPanelBusquedaPorNombreCompletoTransportista.add(jButtonBusquedaPorNombreCompletoTransportista, gridBagConstraintsTransportista);

		jTabbedPaneBusquedasTransportista.addTab("2.-Por Nombre Completo ", jPanelBusquedaPorNombreCompletoTransportista);
		jTabbedPaneBusquedasTransportista.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorPlacaTransportista= new GridBagLayout();
		gridaBagLayoutBusquedaPorPlacaTransportista.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorPlacaTransportista.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorPlacaTransportista.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorPlacaTransportista.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorPlacaTransportista.setLayout(gridaBagLayoutBusquedaPorPlacaTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 0;
		gridBagConstraintsTransportista.gridx = 0;
		jPanelBusquedaPorPlacaTransportista.add(jLabelplacaBusquedaPorPlacaTransportista, gridBagConstraintsTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 0;
		gridBagConstraintsTransportista.gridx = 1;
		jPanelBusquedaPorPlacaTransportista.add(jTextFieldplacaBusquedaPorPlacaTransportista, gridBagConstraintsTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 1;
		gridBagConstraintsTransportista.gridx =1;
		jPanelBusquedaPorPlacaTransportista.add(jButtonBusquedaPorPlacaTransportista, gridBagConstraintsTransportista);

		jTabbedPaneBusquedasTransportista.addTab("3.-Por Placa ", jPanelBusquedaPorPlacaTransportista);
		jTabbedPaneBusquedasTransportista.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutBusquedaPorRucTransportista= new GridBagLayout();
		gridaBagLayoutBusquedaPorRucTransportista.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorRucTransportista.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorRucTransportista.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorRucTransportista.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorRucTransportista.setLayout(gridaBagLayoutBusquedaPorRucTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 0;
		gridBagConstraintsTransportista.gridx = 0;
		jPanelBusquedaPorRucTransportista.add(jLabelrucBusquedaPorRucTransportista, gridBagConstraintsTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 0;
		gridBagConstraintsTransportista.gridx = 1;
		jPanelBusquedaPorRucTransportista.add(jTextFieldrucBusquedaPorRucTransportista, gridBagConstraintsTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 1;
		gridBagConstraintsTransportista.gridx =1;
		jPanelBusquedaPorRucTransportista.add(jButtonBusquedaPorRucTransportista, gridBagConstraintsTransportista);

		jTabbedPaneBusquedasTransportista.addTab("4.-Por Ruc ", jPanelBusquedaPorRucTransportista);
		jTabbedPaneBusquedasTransportista.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutBusquedaPorTelefonoTransportista= new GridBagLayout();
		gridaBagLayoutBusquedaPorTelefonoTransportista.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorTelefonoTransportista.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorTelefonoTransportista.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorTelefonoTransportista.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorTelefonoTransportista.setLayout(gridaBagLayoutBusquedaPorTelefonoTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 0;
		gridBagConstraintsTransportista.gridx = 0;
		jPanelBusquedaPorTelefonoTransportista.add(jLabeltelefonoBusquedaPorTelefonoTransportista, gridBagConstraintsTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 0;
		gridBagConstraintsTransportista.gridx = 1;
		jPanelBusquedaPorTelefonoTransportista.add(jTextFieldtelefonoBusquedaPorTelefonoTransportista, gridBagConstraintsTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 1;
		gridBagConstraintsTransportista.gridx =1;
		jPanelBusquedaPorTelefonoTransportista.add(jButtonBusquedaPorTelefonoTransportista, gridBagConstraintsTransportista);

		jTabbedPaneBusquedasTransportista.addTab("5.-Por Telefono ", jPanelBusquedaPorTelefonoTransportista);
		jTabbedPaneBusquedasTransportista.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdClienteTransportista= new GridBagLayout();
		gridaBagLayoutFK_IdClienteTransportista.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteTransportista.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteTransportista.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteTransportista.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteTransportista.setLayout(gridaBagLayoutFK_IdClienteTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 0;
		gridBagConstraintsTransportista.gridx = 0;
		jPanelFK_IdClienteTransportista.add(jLabelid_clienteFK_IdClienteTransportista, gridBagConstraintsTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 0;
		gridBagConstraintsTransportista.gridx = 1;
		jPanelFK_IdClienteTransportista.add(jComboBoxid_clienteFK_IdClienteTransportista, gridBagConstraintsTransportista);


		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.NONE;
		gridBagConstraintsTransportista.gridy = 0;
		gridBagConstraintsTransportista.gridx = 0;
		jPanelFK_IdClienteTransportista.add(this.jButtonBuscarFK_IdClienteid_clienteTransportista, gridBagConstraintsTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 1;
		gridBagConstraintsTransportista.gridx =1;
		jPanelFK_IdClienteTransportista.add(jButtonFK_IdClienteTransportista, gridBagConstraintsTransportista);

		jTabbedPaneBusquedasTransportista.addTab("6.-Por Cliente ", jPanelFK_IdClienteTransportista);
		jTabbedPaneBusquedasTransportista.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoViaTransporteTransportista= new GridBagLayout();
		gridaBagLayoutFK_IdTipoViaTransporteTransportista.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoViaTransporteTransportista.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoViaTransporteTransportista.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoViaTransporteTransportista.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoViaTransporteTransportista.setLayout(gridaBagLayoutFK_IdTipoViaTransporteTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 0;
		gridBagConstraintsTransportista.gridx = 0;
		jPanelFK_IdTipoViaTransporteTransportista.add(jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransportista, gridBagConstraintsTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 0;
		gridBagConstraintsTransportista.gridx = 1;
		jPanelFK_IdTipoViaTransporteTransportista.add(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista, gridBagConstraintsTransportista);

		gridBagConstraintsTransportista = new GridBagConstraints();
		gridBagConstraintsTransportista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransportista.gridy = 1;
		gridBagConstraintsTransportista.gridx =1;
		jPanelFK_IdTipoViaTransporteTransportista.add(jButtonFK_IdTipoViaTransporteTransportista, gridBagConstraintsTransportista);

		jTabbedPaneBusquedasTransportista.addTab("7.-Por Tipo Via Transporte ", jPanelFK_IdTipoViaTransporteTransportista);
		jTabbedPaneBusquedasTransportista.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransportista = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransportista);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transportistaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransportista = new GridBagConstraints();						
			this.gridBagConstraintsTransportista.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransportista.gridx = 0;		
			//this.gridBagConstraintsTransportista.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransportista.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTransportista, this.gridBagConstraintsTransportista);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTransportista.gridx = 0;		
		//this.gridBagConstraintsTransportista.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransportista.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTransportista.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTransportista);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTransportista.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransportista.gridx = 0;		
			this.gridBagConstraintsTransportista.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTransportista.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTransportista, this.gridBagConstraintsTransportista);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransportista.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTransportista, this.gridBagConstraintsTransportista);								
		
		
		/*
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransportista.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTransportista, this.gridBagConstraintsTransportista);
		*/		
		
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransportista.gridx =0;
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransportista.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransportista, this.gridBagConstraintsTransportista);
				
		
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransportista.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTransportista, this.gridBagConstraintsTransportista);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TransportistaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTransportista= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransportista = new GridBagLayout();
			this.jPanelBusquedasParametrosTransportista.setLayout(gridaBagLayoutBusquedasParametrosTransportista);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTransportista=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransportista.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransportista.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransportista.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransportista.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransportista, this.gridBagConstraintsTransportista);
			
			
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransportista.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransportista, this.gridBagConstraintsTransportista);
		
			
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransportista.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransportista, this.gridBagConstraintsTransportista);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTransportista;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTransportista() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTransportista = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTransportista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTransportista.setName("jPanelReporteDinamicoTransportista"); 
		
		this.jPanelReporteDinamicoTransportista.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransportista.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransportista.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTransportista.setLayout(gridaBagLayoutReporteDinamicoTransportista);
		
		
		this.jInternalFrameReporteDinamicoTransportista= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTransportista = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransportista= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTransportista.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTransportista.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTransportista.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTransportista.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTransportista.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTransportista.setResizable(true);
	    this.jInternalFrameReporteDinamicoTransportista.setClosable(true);
	    this.jInternalFrameReporteDinamicoTransportista.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTransportista.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransportista.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransportista.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transportistas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTransportista = new JLabelMe();

		this.jLabelColumnasSelectReporteTransportista.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransportista.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransportista.add(this.jLabelColumnasSelectReporteTransportista, this.gridBagConstraintsTransportista);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTransportista = new JList<Reporte>();
		this.jListColumnasSelectReporteTransportista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTransportista.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTransportista.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransportista.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransportista.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTransportista=new JScrollPane(this.jListColumnasSelectReporteTransportista);
			
			this.jScrollColumnasSelectReporteTransportista.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransportista.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransportista.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransportista.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTransportista.add(this.jListColumnasSelectReporteTransportista, this.gridBagConstraintsTransportista);
		this.jPanelReporteDinamicoTransportista.add(this.jScrollColumnasSelectReporteTransportista, this.gridBagConstraintsTransportista);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTransportista = new JLabelMe();

		this.jLabelRelacionesSelectReporteTransportista.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTransportista = new JList<Reporte>();
		this.jListRelacionesSelectReporteTransportista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTransportista.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTransportista.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransportista.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransportista.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTransportista=new JScrollPane(this.jListRelacionesSelectReporteTransportista);
			
			this.jScrollRelacionesSelectReporteTransportista.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransportista.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransportista.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTransportista = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTransportista = new JComboBoxMe();
		this.jListColumnasValoresGraficoTransportista = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTransportista = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTransportista.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTransportista.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransportista.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransportista.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTransportista = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTransportista.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTransportista.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransportista.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransportista.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTransportista = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTransportista.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransportista.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransportista.add(this.jLabelGenerarExcelReporteDinamicoTransportista, this.gridBagConstraintsTransportista);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTransportista = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTransportista.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTransportista,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTransportista.setToolTipText("Generar EXCEL"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTransportista = new GridBagConstraints();
		//this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTransportista.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTransportista.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTransportista.add(this.jButtonGenerarExcelReporteDinamicoTransportista, this.gridBagConstraintsTransportista);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransportista.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransportista.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransportista.add(this.jComboBoxTiposReportesDinamicoTransportista, this.gridBagConstraintsTransportista);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTransportista = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTransportista.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransportista.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransportista.add(this.jLabelTiposArchivoReporteDinamicoTransportista, this.gridBagConstraintsTransportista);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransportista.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransportista.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransportista.add(this.jComboBoxTiposArchivosReportesDinamicoTransportista, this.gridBagConstraintsTransportista);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTransportista = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTransportista.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTransportista,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTransportista.setToolTipText("Generar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransportista.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransportista.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransportista.add(this.jButtonGenerarReporteDinamicoTransportista, this.gridBagConstraintsTransportista);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTransportista = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTransportista.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTransportista,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTransportista.setToolTipText("Cancelar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransportista.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransportista.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransportista.add(this.jButtonCerrarReporteDinamicoTransportista, this.gridBagConstraintsTransportista);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTransportista = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTransportista= new JScrollPane(jPanelReporteDinamicoTransportista,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTransportista.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransportista.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransportista.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transportistas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTransportista.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTransportista.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTransportista.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTransportista);
		this.jInternalFrameReporteDinamicoTransportista.getContentPane().add(this.jScrollPanelReporteDinamicoTransportista, this.gridBagConstraintsTransportista);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTransportista() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTransportista = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTransportista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTransportista.setName("jPanelImportacionTransportista"); 
		
		this.jPanelImportacionTransportista.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransportista.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransportista.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTransportista.setLayout(gridaBagLayoutImportacionTransportista);
		
		
		this.jInternalFrameImportacionTransportista= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTransportista= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTransportista = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransportista= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTransportista.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransportista.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransportista.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTransportista.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransportista.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransportista.setResizable(true);
	    this.jInternalFrameImportacionTransportista.setClosable(true);
	    this.jInternalFrameImportacionTransportista.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTransportista.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransportista.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransportista.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTransportista.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransportista.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransportista.setResizable(true);
	    this.jInternalFrameImportacionTransportista.setClosable(true);
	    this.jInternalFrameImportacionTransportista.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTransportista.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransportista.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransportista.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transportistas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTransportista = new JLabelMe();

		this.jLabelArchivoImportacionTransportista.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransportista.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransportista.add(this.jLabelArchivoImportacionTransportista, this.gridBagConstraintsTransportista);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTransportista = new JFileChooser();		
		this.jFileChooserImportacionTransportista.setToolTipText("ESCOGER ARCHIVO"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTransportista = new JButtonMe();
		this.jButtonAbrirImportacionTransportista.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTransportista,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTransportista.setToolTipText("Generar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransportista.gridy = iPosYImportacion;
		this.gridBagConstraintsTransportista.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransportista.add(this.jButtonAbrirImportacionTransportista, this.gridBagConstraintsTransportista);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTransportista = new JLabelMe();

		this.jLabelPathArchivoImportacionTransportista.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTransportista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransportista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransportista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransportista.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransportista.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransportista.add(this.jLabelPathArchivoImportacionTransportista, this.gridBagConstraintsTransportista);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTransportista=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTransportista.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransportista.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransportista.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransportista.gridy = iPosYImportacion;
		this.gridBagConstraintsTransportista.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransportista.add(this.jTextFieldPathArchivoImportacionTransportista, this.gridBagConstraintsTransportista);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTransportista = new JButtonMe();
		this.jButtonGenerarImportacionTransportista.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTransportista,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTransportista.setToolTipText("Generar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransportista.gridy = iPosYImportacion;
		this.gridBagConstraintsTransportista.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransportista.add(this.jButtonGenerarImportacionTransportista, this.gridBagConstraintsTransportista);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTransportista = new JButtonMe();
		this.jButtonCerrarImportacionTransportista.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTransportista,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTransportista.setToolTipText("Cancelar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransportista.gridy = iPosYImportacion;
		this.gridBagConstraintsTransportista.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransportista.add(this.jButtonCerrarImportacionTransportista, this.gridBagConstraintsTransportista);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTransportista = new GridBagLayout();
		
		this.jScrollPanelImportacionTransportista= new JScrollPane(jPanelImportacionTransportista,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTransportista = new GridBagConstraints();
		this.gridBagConstraintsTransportista.gridy =iPosYImportacion;
		this.gridBagConstraintsTransportista.gridx =iPosXImportacion;
		this.gridBagConstraintsTransportista.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTransportista.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTransportista.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTransportista);
		this.jInternalFrameImportacionTransportista.getContentPane().add(this.jScrollPanelImportacionTransportista, this.gridBagConstraintsTransportista);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTransportista(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTransportista = new JButtonMe();
			this.jButtonAbrirOrderByTransportista.setText("Orden");
			this.jButtonAbrirOrderByTransportista.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransportista,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTransportista";
			inputMap = this.jButtonAbrirOrderByTransportista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTransportista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTransportista"));
		
		
			GridBagLayout gridaBagLayoutOrderByTransportista = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTransportista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTransportista.setName("jPanelOrderByTransportista"); 
			
			this.jPanelOrderByTransportista.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransportista.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransportista.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTransportista.setLayout(gridaBagLayoutOrderByTransportista);
			
			
			this.jTableDatosTransportistaOrderBy = new JTableMe();        
			this.jTableDatosTransportistaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTransportistaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTransportistaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTransportistaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTransportistaOrderBy.setViewportView(this.jTableDatosTransportistaOrderBy);
			this.jTableDatosTransportistaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTransportistaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTransportista= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTransportista= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTransportista = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTransportista= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTransportista.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTransportista.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTransportista.setTitle("Orden");
			this.jInternalFrameOrderByTransportista.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTransportista.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTransportista.setResizable(true);
			this.jInternalFrameOrderByTransportista.setClosable(true);
			this.jInternalFrameOrderByTransportista.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTransportista.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransportista.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransportista.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTransportista.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transportistas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTransportista.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTransportista.ipady =150;
				
			this.jPanelOrderByTransportista.add(jScrollPanelDatosTransportistaOrderBy, this.gridBagConstraintsTransportista);//this.jTableDatosTransportistaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTransportista = new JButtonMe();
			this.jButtonCerrarOrderByTransportista.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTransportista,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTransportista.setToolTipText("Cancelar"+" "+TransportistaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTransportista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransportista.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTransportista.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTransportista.add(this.jButtonCerrarOrderByTransportista, this.gridBagConstraintsTransportista);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTransportista = new GridBagLayout();
			
			this.jScrollPanelOrderByTransportista= new JScrollPane(jPanelOrderByTransportista,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTransportista = new GridBagConstraints();
			this.gridBagConstraintsTransportista.gridy =iPosYOrderBy;
			this.gridBagConstraintsTransportista.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransportista.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTransportista.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTransportista.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTransportista);
			
			this.jInternalFrameOrderByTransportista.getContentPane().add(this.jScrollPanelOrderByTransportista, this.gridBagConstraintsTransportista);			
		
		} else {
			this.jButtonAbrirOrderByTransportista = new JButtonMe();
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
		int iWidthTableCalculado=0;//2930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.transportistaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTransportista.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTransportista.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTransportista.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTransportista.getRowHeight();//TransportistaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TransportistaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransportista.isSelected()) {
					iHeightTable=TransportistaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransportistaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransportistaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TransportistaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransportista.isSelected()) {
					iHeightTable=TransportistaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransportistaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransportistaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTransportista.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransportista.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransportista.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTransportista.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransportista.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransportista.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTransportista!=null && this.jInternalFrameOrderByTransportista.getjTableDatosOrderBy()!=null) {
			//if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTransportista.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTransportista.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTransportista.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTransportista.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTransportista.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTransportista.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTransportista.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTransportista.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransportista.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransportista.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=transportistaLogic.getTransportistas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transportistas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Transportista> TraerTransportistaBeans(List<Transportista> transportistas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Transportista transportista:transportistas) {
					
				if(!(TransportistaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TransportistaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					transportista.setsDetalleGeneralEntityReporte(TransportistaConstantesFunciones.getTransportistaDescripcion(transportista));
										
						
					
						
					
				} else  {
							
					//transportista.setsDetalleGeneralEntityReporte(transportista.getsDetalleGeneralEntityReporte());
										
				}
				
				//transportistabeans.add(transportistabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return transportistas;
    }
	//PARA REPORTES FIN
}
