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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.PoliticasClienteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class PoliticasClienteJInternalFrame extends PoliticasClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPoliticasCliente;
	
	protected JMenuBar jmenuBarPoliticasCliente;
	
	protected JMenu jmenuPoliticasCliente;
	protected JMenu jmenuDatosPoliticasCliente;
	protected JMenu jmenuArchivoPoliticasCliente;
	protected JMenu jmenuAccionesPoliticasCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPoliticasCliente;	
	protected GridBagConstraints gridBagConstraintsPoliticasCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PoliticasClienteDetalleFormJInternalFrame jInternalFrameDetalleFormPoliticasCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPoliticasCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPoliticasCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";

	protected LineaNegocioBeanSwingJInternalFrame lineanegocioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineanegocio="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected TipoCuentaBancoGlobalBeanSwingJInternalFrame tipocuentabancoglobalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentabancoglobal="";

	protected EstadoPoliticasClienteBeanSwingJInternalFrame estadopoliticasclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopoliticascliente="";
	
	public PoliticasClienteSessionBean politicasclienteSessionBean;
		
	
	
	public ClienteSessionBean clienteSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public TransporteSessionBean transporteSessionBean;
	public LineaNegocioSessionBean lineanegocioSessionBean;
	public BancoSessionBean bancoSessionBean;
	public TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean;
	public EstadoPoliticasClienteSessionBean estadopoliticasclienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PoliticasCliente> politicasclientes;		
	public List<PoliticasCliente> politicasclientesEliminados;	
	public List<PoliticasCliente> politicasclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPoliticasCliente;		
	protected JButton jButtonAbrirOrderByPoliticasCliente;
	
	
	//protected JPanel jPanelOrderByPoliticasCliente;
	//public JScrollPane jScrollPanelOrderByPoliticasCliente;	
	//protected JButton jButtonCerrarOrderByPoliticasCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PoliticasClienteLogic politicasclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPoliticasCliente;
	public JScrollPane jScrollPanelDatosEdicionPoliticasCliente;
	public JScrollPane jScrollPanelDatosGeneralPoliticasCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosPoliticasClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPoliticasCliente;
	//public JScrollPane jScrollPanelImportacionPoliticasCliente;
	
	
	
	protected JPanel jPanelAccionesPoliticasCliente;
	
    protected JPanel jPanelPaginacionPoliticasCliente;
    protected JPanel jPanelParametrosReportesPoliticasCliente;
	protected JPanel jPanelParametrosReportesAccionesPoliticasCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PoliticasCliente;
	protected JPanel jPanelParametrosAuxiliar2PoliticasCliente;
	protected JPanel jPanelParametrosAuxiliar3PoliticasCliente;
	protected JPanel jPanelParametrosAuxiliar4PoliticasCliente;
	//protected JPanel jPanelParametrosAuxiliar5PoliticasCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoPoliticasCliente;
	//protected JPanel jPanelImportacionPoliticasCliente;
	
	
	public JTable jTableDatosPoliticasCliente;
	
	
	
	//public JTable jTableDatosPoliticasClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPoliticasCliente;
	protected JButton jButtonDuplicarPoliticasCliente;
	protected JButton jButtonCopiarPoliticasCliente;
	protected JButton jButtonVerFormPoliticasCliente;
	protected JButton jButtonNuevoRelacionesPoliticasCliente;
	protected JButton jButtonModificarPoliticasCliente;
	
    protected JButton jButtonGuardarCambiosTablaPoliticasCliente;
	protected JButton jButtonCerrarPoliticasCliente;
	
	
	protected JButton jButtonRecargarInformacionPoliticasCliente;
	protected JButton jButtonProcesarInformacionPoliticasCliente;
	
	
	protected JButton jButtonAnterioresPoliticasCliente;
	protected JButton jButtonSiguientesPoliticasCliente;
	protected JButton jButtonNuevoGuardarCambiosPoliticasCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPoliticasCliente;
	//protected JButton jButtonCerrarReporteDinamicoPoliticasCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoPoliticasCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionPoliticasCliente;
	//protected JButton jButtonGenerarImportacionPoliticasCliente;
	//protected JButton jButtonCerrarImportacionPoliticasCliente;
	//protected JFileChooser jFileChooserImportacionPoliticasCliente;
	//protected File fileImportacionPoliticasCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPoliticasCliente;
	protected JButton jButtonDuplicarToolBarPoliticasCliente;
	protected JButton jButtonNuevoRelacionesToolBarPoliticasCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarPoliticasCliente;
	protected JButton jButtonCopiarToolBarPoliticasCliente;
	protected JButton jButtonVerFormToolBarPoliticasCliente;
	public JButton jButtonGuardarCambiosTablaToolBarPoliticasCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarPoliticasCliente;
	protected JButton jButtonCerrarToolBarPoliticasCliente;
	
	protected JButton jButtonRecargarInformacionToolBarPoliticasCliente;
	protected JButton jButtonProcesarInformacionToolBarPoliticasCliente;
	protected JButton jButtonAnterioresToolBarPoliticasCliente;
	protected JButton jButtonSiguientesToolBarPoliticasCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarPoliticasCliente;
	protected JButton jButtonAbrirOrderByToolBarPoliticasCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPoliticasCliente;
	protected JMenuItem jMenuItemDuplicarPoliticasCliente;
	protected JMenuItem jMenuItemNuevoRelacionesPoliticasCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPoliticasCliente;
	protected JMenuItem jMenuItemCopiarPoliticasCliente;
	protected JMenuItem jMenuItemVerFormPoliticasCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaPoliticasCliente;
	protected JMenuItem jMenuItemCerrarPoliticasCliente;
	protected JMenuItem jMenuItemDetalleCerrarPoliticasCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPoliticasCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarPoliticasCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionPoliticasCliente;
	protected JMenuItem jMenuItemProcesarInformacionPoliticasCliente;
	protected JMenuItem jMenuItemAnterioresPoliticasCliente;
	protected JMenuItem jMenuItemSiguientesPoliticasCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPoliticasCliente;
	protected JMenuItem jMenuItemAbrirOrderByPoliticasCliente;
	protected JMenuItem jMenuItemMostrarOcultarPoliticasCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPoliticasCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPoliticasCliente;
	protected JCheckBox jCheckBoxSeleccionadosPoliticasCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPoliticasCliente;
	protected JCheckBox jCheckBoxConGraficoReportePoliticasCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPoliticasCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPoliticasCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPoliticasCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPoliticasCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPoliticasCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPoliticasCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPoliticasCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPoliticasCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPoliticasCliente;
	protected JTextField jTextFieldValorCampoGeneralPoliticasCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePoliticasCliente;
	//public JList<Reporte> jListColumnasSelectReportePoliticasCliente;
	//public JScrollPane jScrollColumnasSelectReportePoliticasCliente;
	
	//public JLabel jLabelRelacionesSelectReportePoliticasCliente;
	//public JList<Reporte> jListRelacionesSelectReportePoliticasCliente;
	//public JScrollPane jScrollRelacionesSelectReportePoliticasCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPoliticasCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPoliticasCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPoliticasCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoPoliticasCliente;
	
		
	//public JLabel jLabelArchivoImportacionPoliticasCliente;	
	//public JLabel jLabelPathArchivoImportacionPoliticasCliente;
	//protected JTextField jTextFieldPathArchivoImportacionPoliticasCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPoliticasCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPoliticasCliente;
	
	//public JLabel jLabelColumnaCategoriaValorPoliticasCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPoliticasCliente;
	
	//public JLabel jLabelColumnasValoresGraficoPoliticasCliente;
	//public JList<Reporte> jListColumnasValoresGraficoPoliticasCliente;
	//public JScrollPane jScrollColumnasValoresGraficoPoliticasCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPoliticasCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPoliticasCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPoliticasCliente;
	public JPanel jPanelFK_IdBancoPoliticasCliente;
	public JButton jButtonFK_IdBancoPoliticasCliente;
	public JPanel jPanelFK_IdClientePoliticasCliente;
	public JButton jButtonFK_IdClientePoliticasCliente;
	public JPanel jPanelFK_IdEstadoPoliticasClientePoliticasCliente;
	public JButton jButtonFK_IdEstadoPoliticasClientePoliticasCliente;
	public JPanel jPanelFK_IdLineaNegocioPoliticasCliente;
	public JButton jButtonFK_IdLineaNegocioPoliticasCliente;
	public JPanel jPanelFK_IdTipoCuentaBancoGlobalPoliticasCliente;
	public JButton jButtonFK_IdTipoCuentaBancoGlobalPoliticasCliente;
	public JPanel jPanelFK_IdTipoPrecioPoliticasCliente;
	public JButton jButtonFK_IdTipoPrecioPoliticasCliente;
	public JPanel jPanelFK_IdTransportePoliticasCliente;
	public JButton jButtonFK_IdTransportePoliticasCliente;
	
	public JPanel jPanelid_bancoFK_IdBancoPoliticasCliente;
	public JLabel jLabelid_bancoFK_IdBancoPoliticasCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoFK_IdBancoPoliticasCliente;
	public JButton jButtonid_bancoFK_IdBancoPoliticasCliente= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoPoliticasClienteUpdate= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoPoliticasClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClientePoliticasCliente;
	public JLabel jLabelid_clienteFK_IdClientePoliticasCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClientePoliticasCliente;
	public JButton jButtonid_clienteFK_IdClientePoliticasCliente= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePoliticasClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePoliticasClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clientePoliticasCliente;
	
	public JPanel jPanelid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente;
	public JLabel jLabelid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente;
	public JButton jButtonid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente= new JButtonMe();
	public JButton jButtonid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_negocioFK_IdLineaNegocioPoliticasCliente;
	public JLabel jLabelid_linea_negocioFK_IdLineaNegocioPoliticasCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_negocioFK_IdLineaNegocioPoliticasCliente;
	public JButton jButtonid_linea_negocioFK_IdLineaNegocioPoliticasCliente= new JButtonMe();
	public JButton jButtonid_linea_negocioFK_IdLineaNegocioPoliticasClienteUpdate= new JButtonMe();
	public JButton jButtonid_linea_negocioFK_IdLineaNegocioPoliticasClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente;
	public JLabel jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente;
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_precioFK_IdTipoPrecioPoliticasCliente;
	public JLabel jLabelid_tipo_precioFK_IdTipoPrecioPoliticasCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioFK_IdTipoPrecioPoliticasCliente;
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioPoliticasCliente= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioPoliticasClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioPoliticasClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transporteFK_IdTransportePoliticasCliente;
	public JLabel jLabelid_transporteFK_IdTransportePoliticasCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transporteFK_IdTransportePoliticasCliente;
	public JButton jButtonid_transporteFK_IdTransportePoliticasCliente= new JButtonMe();
	public JButton jButtonid_transporteFK_IdTransportePoliticasClienteUpdate= new JButtonMe();
	public JButton jButtonid_transporteFK_IdTransportePoliticasClienteBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=968;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PoliticasClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticasClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticasClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticasClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPoliticasCliente)	{
		this.jButtonRecargarInformacionPoliticasCliente = jButtonRecargarInformacionPoliticasCliente;
	}
	
	public JButton getjButtonProcesarInformacionPoliticasCliente() {
		return this.jButtonProcesarInformacionPoliticasCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPoliticasCliente)	{
		this.jButtonProcesarInformacionPoliticasCliente = jButtonProcesarInformacionPoliticasCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionPoliticasCliente() {
		return this.jButtonRecargarInformacionPoliticasCliente;
	}
	
	
	public List<PoliticasCliente> getpoliticasclientes() {
		return this.politicasclientes;
	}

	public void setpoliticasclientes(List<PoliticasCliente> politicasclientes) {
		this.politicasclientes = politicasclientes;
	}
	
	public List<PoliticasCliente> getpoliticasclientesAux() {
		return this.politicasclientesAux;
	}

	public void setpoliticasclientesAux(List<PoliticasCliente> politicasclientesAux) {
		this.politicasclientesAux = politicasclientesAux;
	}
	
	public List<PoliticasCliente> getpoliticasclientesEliminados() {
		return this.politicasclientesEliminados;
	}

	public void setPoliticasClientesEliminados(List<PoliticasCliente> politicasclientesEliminados) {
		this.politicasclientesEliminados = politicasclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPoliticasCliente() {
		return jComboBoxTiposSeleccionarPoliticasCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPoliticasCliente(
			JComboBox jComboBoxTiposSeleccionarPoliticasCliente) {
		this.jComboBoxTiposSeleccionarPoliticasCliente = jComboBoxTiposSeleccionarPoliticasCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPoliticasCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPoliticasCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPoliticasCliente() {
		return jTextFieldValorCampoGeneralPoliticasCliente;
	}

	public void setjTextFieldValorCampoGeneralPoliticasCliente(
			JTextField jTextFieldValorCampoGeneralPoliticasCliente) {
		this.jTextFieldValorCampoGeneralPoliticasCliente = jTextFieldValorCampoGeneralPoliticasCliente;
	}

	public void setBorderResaltarValorCampoGeneralPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticasCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPoliticasCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPoliticasCliente() {
		return this.jCheckBoxSeleccionarTodosPoliticasCliente;
	}

	public void setjCheckBoxSeleccionarTodosPoliticasCliente(
			JCheckBox jCheckBoxSeleccionarTodosPoliticasCliente) {
		this.jCheckBoxSeleccionarTodosPoliticasCliente = jCheckBoxSeleccionarTodosPoliticasCliente;
	}

	public void setBorderResaltarSeleccionarTodosPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticasCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPoliticasCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPoliticasCliente() {
		return this.jCheckBoxSeleccionadosPoliticasCliente;
	}

	public void setjCheckBoxSeleccionadosPoliticasCliente(
			JCheckBox jCheckBoxSeleccionadosPoliticasCliente) {
		this.jCheckBoxSeleccionadosPoliticasCliente = jCheckBoxSeleccionadosPoliticasCliente;
	}
	
	public void setBorderResaltarSeleccionadosPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticasCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPoliticasCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPoliticasCliente() {
		return this.jComboBoxTiposArchivosReportesPoliticasCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPoliticasCliente(
			JComboBox jComboBoxTiposArchivosReportesPoliticasCliente) {
		this.jComboBoxTiposArchivosReportesPoliticasCliente = jComboBoxTiposArchivosReportesPoliticasCliente;
	}

	public void setBorderResaltarTiposArchivosReportesPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticasCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPoliticasCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPoliticasCliente() {
		return this.jComboBoxTiposReportesPoliticasCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPoliticasCliente(
			JComboBox jComboBoxTiposReportesPoliticasCliente) {
		this.jComboBoxTiposReportesPoliticasCliente = jComboBoxTiposReportesPoliticasCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPoliticasCliente() {
	//	return jComboBoxTiposReportesDinamicoPoliticasCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPoliticasCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoPoliticasCliente) {
	//	this.jComboBoxTiposReportesDinamicoPoliticasCliente = jComboBoxTiposReportesDinamicoPoliticasCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPoliticasCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoPoliticasCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPoliticasCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPoliticasCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPoliticasCliente = jComboBoxTiposArchivosReportesDinamicoPoliticasCliente;
	//}
	
	public void setBorderResaltarTiposReportesPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticasCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPoliticasCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPoliticasCliente() {
		return this.jComboBoxTiposGraficosReportesPoliticasCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPoliticasCliente(
			JComboBox jComboBoxTiposGraficosReportesPoliticasCliente) {
		this.jComboBoxTiposGraficosReportesPoliticasCliente = jComboBoxTiposGraficosReportesPoliticasCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticasCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPoliticasCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPoliticasCliente() {
		return this.jComboBoxTiposPaginacionPoliticasCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPoliticasCliente(
			JComboBox jComboBoxTiposPaginacionPoliticasCliente) {
		this.jComboBoxTiposPaginacionPoliticasCliente = jComboBoxTiposPaginacionPoliticasCliente;
	}
	
	public void setBorderResaltarTiposPaginacionPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticasCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPoliticasCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPoliticasCliente() {
		return this.jComboBoxTiposRelacionesPoliticasCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPoliticasCliente() {
		return this.jComboBoxTiposAccionesPoliticasCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPoliticasCliente(
			JComboBox jComboBoxTiposRelacionesPoliticasCliente) {
		this.jComboBoxTiposRelacionesPoliticasCliente = jComboBoxTiposRelacionesPoliticasCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPoliticasCliente(
			JComboBox jComboBoxTiposAccionesPoliticasCliente) {
		this.jComboBoxTiposAccionesPoliticasCliente = jComboBoxTiposAccionesPoliticasCliente;
	}
	
	public void setBorderResaltarTiposRelacionesPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticasCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPoliticasCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticasCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPoliticasCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPoliticasCliente() {
	//	return jCheckBoxConGraficoDinamicoPoliticasCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoPoliticasCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoPoliticasCliente) {
	//	this.jCheckBoxConGraficoDinamicoPoliticasCliente = jCheckBoxConGraficoDinamicoPoliticasCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPoliticasCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPoliticasCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPoliticasCliente .setBorder(borderResaltar);		
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
		this.politicasclienteSessionBean=new PoliticasClienteSessionBean();
		
		this.politicasclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.politicasclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.politicasclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PoliticasClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Politicas Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 3050) {
			iWidth=3050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.politicasclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPoliticasCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPoliticasCliente,this.jTtoolBarPoliticasCliente,
							"nuevo","nuevo","Nuevo"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPoliticasCliente,this.jTtoolBarPoliticasCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPoliticasCliente,this.jTtoolBarPoliticasCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPoliticasCliente,this.jTtoolBarPoliticasCliente,
							"duplicar","duplicar","Duplicar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPoliticasCliente,this.jTtoolBarPoliticasCliente,
							"copiar","copiar","Copiar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPoliticasCliente,this.jTtoolBarPoliticasCliente,
							"ver_form","ver_form","Ver"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPoliticasCliente,this.jTtoolBarPoliticasCliente,
							"recargar","recargar","Recargar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPoliticasCliente,this.jTtoolBarPoliticasCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPoliticasCliente,this.jTtoolBarPoliticasCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPoliticasCliente,this.jTtoolBarPoliticasCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPoliticasCliente,this.jTtoolBarPoliticasCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPoliticasCliente,this.jTtoolBarPoliticasCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPoliticasCliente,this.jTtoolBarPoliticasCliente,
							"cerrar","cerrar","Salir"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPoliticasCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPoliticasCliente;
			
				this.jButtonProcesarInformacionToolBarPoliticasCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPoliticasCliente;
				
		//protected JButton jButtonModificarToolBarPoliticasCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPoliticasCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPoliticasCliente=new JMenuMe("General");
		this.jmenuArchivoPoliticasCliente=new JMenuMe("Archivo");
		this.jmenuAccionesPoliticasCliente=new JMenuMe("Acciones");
		this.jmenuDatosPoliticasCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPoliticasCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPoliticasCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPoliticasCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPoliticasCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPoliticasCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPoliticasCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPoliticasCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPoliticasCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPoliticasCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPoliticasCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPoliticasCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPoliticasCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPoliticasCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPoliticasCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPoliticasCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPoliticasCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPoliticasCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPoliticasCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPoliticasCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPoliticasCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPoliticasCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPoliticasCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPoliticasCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPoliticasCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPoliticasCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPoliticasCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPoliticasCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPoliticasCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPoliticasCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPoliticasCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPoliticasCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPoliticasCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPoliticasCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPoliticasCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPoliticasCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPoliticasCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPoliticasCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPoliticasCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPoliticasCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPoliticasCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPoliticasCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPoliticasCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPoliticasCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPoliticasCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPoliticasCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPoliticasCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPoliticasCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPoliticasCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPoliticasCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPoliticasCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPoliticasCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPoliticasCliente.add(this.jMenuItemCerrarPoliticasCliente);
			
			this.jmenuAccionesPoliticasCliente.add(this.jMenuItemNuevoPoliticasCliente);
			this.jmenuAccionesPoliticasCliente.add(this.jMenuItemNuevoGuardarCambiosPoliticasCliente);
			this.jmenuAccionesPoliticasCliente.add(this.jMenuItemNuevoRelacionesPoliticasCliente);
			this.jmenuAccionesPoliticasCliente.add(this.jMenuItemGuardarCambiosTablaPoliticasCliente);		
			this.jmenuAccionesPoliticasCliente.add(this.jMenuItemDuplicarPoliticasCliente);		
			this.jmenuAccionesPoliticasCliente.add(this.jMenuItemCopiarPoliticasCliente);		
			this.jmenuAccionesPoliticasCliente.add(this.jMenuItemVerFormPoliticasCliente);		
			
			this.jmenuDatosPoliticasCliente.add(this.jMenuItemRecargarInformacionPoliticasCliente);				
			this.jmenuDatosPoliticasCliente.add(this.jMenuItemAnterioresPoliticasCliente);				
			this.jmenuDatosPoliticasCliente.add(this.jMenuItemSiguientesPoliticasCliente);				
			this.jmenuDatosPoliticasCliente.add(this.jMenuItemAbrirOrderByPoliticasCliente);				
			this.jmenuDatosPoliticasCliente.add(this.jMenuItemMostrarOcultarPoliticasCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPoliticasCliente.add(this.jMenuItemGuardarCambiosPoliticasCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPoliticasCliente.add(this.jmenuArchivoPoliticasCliente);		
			this.jmenuBarPoliticasCliente.add(this.jmenuAccionesPoliticasCliente);		
			this.jmenuBarPoliticasCliente.add(this.jmenuDatosPoliticasCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPoliticasCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPoliticasCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBancoPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBancoPoliticasCliente.setToolTipText("Buscar Por Banco ");
		this.jButtonFK_IdBancoPoliticasCliente= new JButtonMe();
		this.jButtonFK_IdBancoPoliticasCliente.setText("Buscar");
		this.jButtonFK_IdBancoPoliticasCliente.setToolTipText("Buscar Por Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBancoPoliticasCliente,"buscar_button","Buscar Por Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBancoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bancoFK_IdBancoPoliticasCliente = new JLabelMe();
		jLabelid_bancoFK_IdBancoPoliticasCliente.setText("Banco :");
		jLabelid_bancoFK_IdBancoPoliticasCliente.setToolTipText("Banco");
		jLabelid_bancoFK_IdBancoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bancoFK_IdBancoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bancoFK_IdBancoPoliticasCliente= new JComboBoxMe();
		jComboBoxid_bancoFK_IdBancoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoFK_IdBancoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClientePoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClientePoliticasCliente.setToolTipText("Buscar Por  ");
		this.jButtonFK_IdClientePoliticasCliente= new JButtonMe();
		this.jButtonFK_IdClientePoliticasCliente.setText("Buscar");
		this.jButtonFK_IdClientePoliticasCliente.setToolTipText("Buscar Por  ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClientePoliticasCliente,"buscar_button","Buscar Por  ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClientePoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClientePoliticasCliente = new JLabelMe();
		jLabelid_clienteFK_IdClientePoliticasCliente.setText(" :");
		jLabelid_clienteFK_IdClientePoliticasCliente.setToolTipText("");
		jLabelid_clienteFK_IdClientePoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClientePoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClientePoliticasCliente= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClientePoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClientePoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clientePoliticasCliente= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clientePoliticasCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePoliticasCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePoliticasCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clientePoliticasCliente.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePoliticasCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePoliticasCliente.setFocusable(false);

		this.jPanelFK_IdEstadoPoliticasClientePoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoPoliticasClientePoliticasCliente.setToolTipText("Buscar Por Estado Politicas Cliente ");
		this.jButtonFK_IdEstadoPoliticasClientePoliticasCliente= new JButtonMe();
		this.jButtonFK_IdEstadoPoliticasClientePoliticasCliente.setText("Buscar");
		this.jButtonFK_IdEstadoPoliticasClientePoliticasCliente.setToolTipText("Buscar Por Estado Politicas Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoPoliticasClientePoliticasCliente,"buscar_button","Buscar Por Estado Politicas Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoPoliticasClientePoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente = new JLabelMe();
		jLabelid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente.setText("Estado Politicas Cliente :");
		jLabelid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente.setToolTipText("Estado Politicas Cliente");
		jLabelid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente= new JComboBoxMe();
		jComboBoxid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaNegocioPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaNegocioPoliticasCliente.setToolTipText("Buscar Por Linea Negocio ");
		this.jButtonFK_IdLineaNegocioPoliticasCliente= new JButtonMe();
		this.jButtonFK_IdLineaNegocioPoliticasCliente.setText("Buscar");
		this.jButtonFK_IdLineaNegocioPoliticasCliente.setToolTipText("Buscar Por Linea Negocio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaNegocioPoliticasCliente,"buscar_button","Buscar Por Linea Negocio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaNegocioPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_linea_negocioFK_IdLineaNegocioPoliticasCliente = new JLabelMe();
		jLabelid_linea_negocioFK_IdLineaNegocioPoliticasCliente.setText("Linea Negocio :");
		jLabelid_linea_negocioFK_IdLineaNegocioPoliticasCliente.setToolTipText("Linea Negocio");
		jLabelid_linea_negocioFK_IdLineaNegocioPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_negocioFK_IdLineaNegocioPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_negocioFK_IdLineaNegocioPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_negocioFK_IdLineaNegocioPoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_negocioFK_IdLineaNegocioPoliticasCliente= new JComboBoxMe();
		jComboBoxid_linea_negocioFK_IdLineaNegocioPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_negocioFK_IdLineaNegocioPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_negocioFK_IdLineaNegocioPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_negocioFK_IdLineaNegocioPoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCuentaBancoGlobalPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCuentaBancoGlobalPoliticasCliente.setToolTipText("Buscar Por Tipo Cuenta Banco Global ");
		this.jButtonFK_IdTipoCuentaBancoGlobalPoliticasCliente= new JButtonMe();
		this.jButtonFK_IdTipoCuentaBancoGlobalPoliticasCliente.setText("Buscar");
		this.jButtonFK_IdTipoCuentaBancoGlobalPoliticasCliente.setToolTipText("Buscar Por Tipo Cuenta Banco Global ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCuentaBancoGlobalPoliticasCliente,"buscar_button","Buscar Por Tipo Cuenta Banco Global ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCuentaBancoGlobalPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente = new JLabelMe();
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente.setText("Tipo Cuenta Banco Global :");
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente.setToolTipText("Tipo Cuenta Banco Global");
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente= new JComboBoxMe();
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPrecioPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrecioPoliticasCliente.setToolTipText("Buscar Por Tipo Precio ");
		this.jButtonFK_IdTipoPrecioPoliticasCliente= new JButtonMe();
		this.jButtonFK_IdTipoPrecioPoliticasCliente.setText("Buscar");
		this.jButtonFK_IdTipoPrecioPoliticasCliente.setToolTipText("Buscar Por Tipo Precio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrecioPoliticasCliente,"buscar_button","Buscar Por Tipo Precio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrecioPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_precioFK_IdTipoPrecioPoliticasCliente = new JLabelMe();
		jLabelid_tipo_precioFK_IdTipoPrecioPoliticasCliente.setText("Tipo Precio :");
		jLabelid_tipo_precioFK_IdTipoPrecioPoliticasCliente.setToolTipText("Tipo Precio");
		jLabelid_tipo_precioFK_IdTipoPrecioPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioFK_IdTipoPrecioPoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_precioFK_IdTipoPrecioPoliticasCliente= new JComboBoxMe();
		jComboBoxid_tipo_precioFK_IdTipoPrecioPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioFK_IdTipoPrecioPoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransportePoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransportePoliticasCliente.setToolTipText("Buscar Por Transporte ");
		this.jButtonFK_IdTransportePoliticasCliente= new JButtonMe();
		this.jButtonFK_IdTransportePoliticasCliente.setText("Buscar");
		this.jButtonFK_IdTransportePoliticasCliente.setToolTipText("Buscar Por Transporte ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransportePoliticasCliente,"buscar_button","Buscar Por Transporte ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransportePoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transporteFK_IdTransportePoliticasCliente = new JLabelMe();
		jLabelid_transporteFK_IdTransportePoliticasCliente.setText("Transporte :");
		jLabelid_transporteFK_IdTransportePoliticasCliente.setToolTipText("Transporte");
		jLabelid_transporteFK_IdTransportePoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transporteFK_IdTransportePoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transporteFK_IdTransportePoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transporteFK_IdTransportePoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transporteFK_IdTransportePoliticasCliente= new JComboBoxMe();
		jComboBoxid_transporteFK_IdTransportePoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteFK_IdTransportePoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteFK_IdTransportePoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transporteFK_IdTransportePoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPoliticasCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasPoliticasCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPoliticasCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPoliticasCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPoliticasCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePoliticasCliente = new PoliticasClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Politicas Cliente DATOS");
			this.jInternalFrameDetalleFormPoliticasCliente = new PoliticasClienteDetalleFormJInternalFrame(jDesktopPane,this.politicasclienteSessionBean.getConGuardarRelaciones(),this.politicasclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPoliticasCliente = null;//new PoliticasClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPoliticasCliente= new GridBagLayout();
		
		
		this.jTableDatosPoliticasCliente = new JTableMe();      
		
		String sToolTipPoliticasCliente="";
		sToolTipPoliticasCliente=PoliticasClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPoliticasCliente+="(Cartera.PoliticasCliente)";
		}
		
		if(!this.politicasclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipPoliticasCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPoliticasCliente.setToolTipText(sToolTipPoliticasCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPoliticasCliente);
		this.jTableDatosPoliticasCliente.setAutoCreateRowSorter(true);
		this.jTableDatosPoliticasCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPoliticasCliente.setRowSelectionAllowed(true);
		this.jTableDatosPoliticasCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPoliticasCliente = new JButtonMe();
		this.jButtonDuplicarPoliticasCliente = new JButtonMe();
		this.jButtonCopiarPoliticasCliente = new JButtonMe();
		this.jButtonVerFormPoliticasCliente = new JButtonMe();
		this.jButtonNuevoRelacionesPoliticasCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPoliticasCliente = new JButtonMe();
		this.jButtonCerrarPoliticasCliente = new JButtonMe();
		
		this.jScrollPanelDatosPoliticasCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralPoliticasCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Politicas Cliente";
		
		if(!this.politicasclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politicas Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosPoliticasCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPoliticasCliente.setToolTipText("Acciones");
        this.jPanelAccionesPoliticasCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPoliticasCliente=new ReporteDinamicoJInternalFrame(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPoliticasCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPoliticasCliente=new ImportacionJInternalFrame(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPoliticasCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPoliticasCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByPoliticasCliente.setText("Orden");
		this.jButtonAbrirOrderByPoliticasCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPoliticasCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPoliticasCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPoliticasCliente,false,this);
			
			//this.cargarOrderByPoliticasCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPoliticasCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPoliticasCliente,true,this);
			
			//this.cargarOrderByPoliticasCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPoliticasCliente.setMinimumSize(new Dimension(400,50));//3030
		this.jTableDatosPoliticasCliente.setMaximumSize(new Dimension(400,50));//3030
		this.jTableDatosPoliticasCliente.setPreferredSize(new Dimension(400,50));//3030
		
		this.jScrollPanelDatosPoliticasCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPoliticasCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPoliticasCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPoliticasCliente.setText("Nuevo");
		this.jButtonDuplicarPoliticasCliente.setText("Duplicar");
		this.jButtonCopiarPoliticasCliente.setText("Copiar");
		this.jButtonVerFormPoliticasCliente.setText("Ver");
		this.jButtonNuevoRelacionesPoliticasCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPoliticasCliente.setText("Guardar");
		this.jButtonCerrarPoliticasCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPoliticasCliente,"nuevo_button","Nuevo",this.politicasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPoliticasCliente,"duplicar_button","Duplicar",this.politicasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPoliticasCliente,"copiar_button","Copiar",this.politicasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPoliticasCliente,"ver_form","Ver",this.politicasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPoliticasCliente,"nuevorelaciones_button","Nuevo Rel",this.politicasclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPoliticasCliente,"guardarcambiostabla_button","Guardar",this.politicasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPoliticasCliente,"cerrar_button","Salir",this.politicasclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPoliticasCliente.setToolTipText("Nuevo"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPoliticasCliente.setToolTipText("Duplicar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPoliticasCliente.setToolTipText("Copiar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPoliticasCliente.setToolTipText("Ver"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPoliticasCliente.setToolTipText("Nuevo Rel"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPoliticasCliente.setToolTipText("Guardar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPoliticasCliente.setToolTipText("Salir"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPoliticasCliente";
		inputMap = this.jButtonNuevoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPoliticasCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPoliticasCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarPoliticasCliente";
		inputMap = this.jButtonDuplicarPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPoliticasCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPoliticasCliente"));
		
		//COPIAR
		sMapKey = "CopiarPoliticasCliente";
		inputMap = this.jButtonCopiarPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPoliticasCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPoliticasCliente"));
		
		//VEr FORM
		sMapKey = "VerFormPoliticasCliente";
		inputMap = this.jButtonVerFormPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPoliticasCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPoliticasCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPoliticasCliente";
		inputMap = this.jButtonNuevoRelacionesPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPoliticasCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPoliticasCliente";
		inputMap = this.jButtonModificarPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPoliticasCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPoliticasCliente";
		inputMap = this.jButtonCerrarPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPoliticasCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPoliticasCliente";
		inputMap = this.jButtonGuardarCambiosTablaPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPoliticasCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PoliticasCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PoliticasCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PoliticasCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PoliticasCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PoliticasCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPoliticasCliente.setName("jPanelParametrosReportesPoliticasCliente"); 
		
		this.jPanelParametrosReportesAccionesPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPoliticasCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPoliticasCliente.setName("jPanelParametrosReportesAccionesPoliticasCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPoliticasCliente = new JButtonMe();
		this.jButtonRecargarInformacionPoliticasCliente.setText("Recargar");
		this.jButtonRecargarInformacionPoliticasCliente.setToolTipText("Recargar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPoliticasCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPoliticasCliente = new JButtonMe();
		this.jButtonProcesarInformacionPoliticasCliente.setText("Procesar");
		this.jButtonProcesarInformacionPoliticasCliente.setToolTipText("Procesar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPoliticasCliente.setVisible(false);
			
		this.jButtonProcesarInformacionPoliticasCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPoliticasCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPoliticasCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPoliticasCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPoliticasCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPoliticasCliente.setText("TIPO");       
		this.jComboBoxTiposReportesPoliticasCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPoliticasCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPoliticasCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPoliticasCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionPoliticasCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPoliticasCliente.setText("Accion");
		this.jComboBoxTiposRelacionesPoliticasCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPoliticasCliente.setText("Accion");
		this.jComboBoxTiposAccionesPoliticasCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPoliticasCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarPoliticasCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPoliticasCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPoliticasCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPoliticasCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPoliticasCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPoliticasCliente = new JLabelMe();
		
		this.jLabelAccionesPoliticasCliente.setText("Acciones");		
		this.jLabelAccionesPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPoliticasCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPoliticasCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPoliticasCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPoliticasCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPoliticasCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPoliticasCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPoliticasCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPoliticasCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPoliticasCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePoliticasCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePoliticasCliente.setText("Graf.");
		this.jCheckBoxConGraficoReportePoliticasCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPoliticasCliente = new JButtonMe();
		//this.jButtonAnterioresPoliticasCliente.setText("<<");
        this.jButtonAnterioresPoliticasCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPoliticasCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPoliticasCliente = new JButtonMe();
		//this.jButtonSiguientesPoliticasCliente.setText(">>");
        this.jButtonSiguientesPoliticasCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPoliticasCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPoliticasCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPoliticasCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosPoliticasCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPoliticasCliente,"nuevoguardarcambios_button","Nue",this.politicasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPoliticasCliente";
		inputMap = this.jButtonNuevoGuardarCambiosPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPoliticasCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPoliticasCliente";
		inputMap = this.jButtonRecargarInformacionPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPoliticasCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPoliticasCliente";
		inputMap = this.jButtonSiguientesPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPoliticasCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPoliticasCliente";
		inputMap = this.jButtonAnterioresPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPoliticasCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPoliticasCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPoliticasCliente.setMinimumSize(new Dimension(this.getWidth(),PoliticasClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PoliticasClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPoliticasCliente.setMaximumSize(new Dimension(this.getWidth(),PoliticasClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PoliticasClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPoliticasCliente.setPreferredSize(new Dimension(this.getWidth(),PoliticasClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PoliticasClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPoliticasCliente = new GridBagLayout();

			this.jPanelPaginacionPoliticasCliente.setLayout(gridaBagLayoutPaginacionPoliticasCliente);						
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy = 0;
			this.gridBagConstraintsPoliticasCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPoliticasCliente.add(this.jButtonAnterioresPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
					
						
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPoliticasCliente.gridy = 0;
			
			this.jPanelPaginacionPoliticasCliente.add(this.jButtonNuevoGuardarCambiosPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
						
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPoliticasCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPoliticasCliente.gridy = 0;
			this.jPanelPaginacionPoliticasCliente.add(this.jButtonSiguientesPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy = 1;
			this.gridBagConstraintsPoliticasCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPoliticasCliente.add(this.jButtonNuevoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
						
			
			
			if(!this.politicasclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
				this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPoliticasCliente.gridy = 1;
				this.gridBagConstraintsPoliticasCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPoliticasCliente.add(this.jButtonGuardarCambiosTablaPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
			}
			
			
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy = 1;
			this.gridBagConstraintsPoliticasCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPoliticasCliente.add(this.jButtonDuplicarPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy = 1;
			this.gridBagConstraintsPoliticasCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPoliticasCliente.add(this.jButtonCopiarPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy = 1;
			this.gridBagConstraintsPoliticasCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPoliticasCliente.add(this.jButtonVerFormPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy = 1;
			this.gridBagConstraintsPoliticasCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPoliticasCliente.add(this.jButtonCerrarPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
		
		
		this.jButtonRecargarInformacionPoliticasCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPoliticasCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPoliticasCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPoliticasCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPoliticasCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPoliticasCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPoliticasCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPoliticasCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPoliticasCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPoliticasCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPoliticasCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPoliticasCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPoliticasCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPoliticasCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPoliticasCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPoliticasCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPoliticasCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPoliticasCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPoliticasCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPoliticasCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPoliticasCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPoliticasCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPoliticasCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPoliticasCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPoliticasCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPoliticasCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPoliticasCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePoliticasCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePoliticasCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePoliticasCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPoliticasCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPoliticasCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPoliticasCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPoliticasCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPoliticasCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPoliticasCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPoliticasCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPoliticasCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PoliticasCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PoliticasCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PoliticasCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PoliticasCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPoliticasCliente.setLayout(gridaBagParametrosReportesPoliticasCliente);
			this.jPanelParametrosReportesAccionesPoliticasCliente.setLayout(gridaBagParametrosReportesAccionesPoliticasCliente);
			
			
			this.jPanelParametrosAuxiliar1PoliticasCliente.setLayout(gridaBagParametrosAuxiliar1PoliticasCliente);
			this.jPanelParametrosAuxiliar2PoliticasCliente.setLayout(gridaBagParametrosAuxiliar2PoliticasCliente);
			this.jPanelParametrosAuxiliar3PoliticasCliente.setLayout(gridaBagParametrosAuxiliar3PoliticasCliente);
			this.jPanelParametrosAuxiliar4PoliticasCliente.setLayout(gridaBagParametrosAuxiliar4PoliticasCliente);
			//this.jPanelParametrosAuxiliar5PoliticasCliente.setLayout(gridaBagParametrosAuxiliar2PoliticasCliente);			
			
			
			
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPoliticasCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPoliticasCliente.add(this.jButtonRecargarInformacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticasCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PoliticasCliente.add(this.jComboBoxTiposPaginacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticasCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PoliticasCliente.add(this.jCheckBoxConAltoMaximoTablaPoliticasCliente, this.gridBagConstraintsPoliticasCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticasCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PoliticasCliente.add(this.jComboBoxTiposArchivosReportesPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticasCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticasCliente.add(this.jPanelParametrosAuxiliar1PoliticasCliente, this.gridBagConstraintsPoliticasCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPoliticasCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PoliticasCliente.add(this.jComboBoxTiposReportesPoliticasCliente, this.gridBagConstraintsPoliticasCliente);																		
			
			
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPoliticasCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PoliticasCliente.add(this.jComboBoxTiposGraficosReportesPoliticasCliente, this.gridBagConstraintsPoliticasCliente);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticasCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticasCliente.add(this.jPanelParametrosAuxiliar4PoliticasCliente, this.gridBagConstraintsPoliticasCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticasCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticasCliente.add(this.jComboBoxTiposReportesPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticasCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPoliticasCliente.add(this.jCheckBoxGenerarReportePoliticasCliente, this.gridBagConstraintsPoliticasCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticasCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticasCliente.add(this.jPanelParametrosAuxiliar2PoliticasCliente, this.gridBagConstraintsPoliticasCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPoliticasCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPoliticasCliente.add(this.jLabelAccionesPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticasCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPoliticasCliente.add(this.jComboBoxTiposSeleccionarPoliticasCliente, this.gridBagConstraintsPoliticasCliente);			
			
			
			/*
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPoliticasCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPoliticasCliente.add(this.jCheckBoxSeleccionarTodosPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPoliticasCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPoliticasCliente.add(this.jCheckBoxConGraficoReportePoliticasCliente, this.gridBagConstraintsPoliticasCliente);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPoliticasCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PoliticasCliente.add(this.jCheckBoxSeleccionarTodosPoliticasCliente, this.gridBagConstraintsPoliticasCliente);															
				
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPoliticasCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PoliticasCliente.add(this.jCheckBoxSeleccionadosPoliticasCliente, this.gridBagConstraintsPoliticasCliente);															
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPoliticasCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PoliticasCliente.add(this.jCheckBoxConGraficoReportePoliticasCliente, this.gridBagConstraintsPoliticasCliente);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticasCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticasCliente.add(this.jPanelParametrosAuxiliar3PoliticasCliente, this.gridBagConstraintsPoliticasCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticasCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPoliticasCliente.add(this.jComboBoxTiposAccionesPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPoliticasCliente = new GridBagLayout();

			this.jScrollPanelDatosPoliticasCliente.setLayout(gridaBagLayoutDatosPoliticasCliente);
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy = 0;
			this.gridBagConstraintsPoliticasCliente.gridx = 0;
			
			this.jScrollPanelDatosPoliticasCliente.add(this.jTableDatosPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPoliticasCliente.setViewportView(this.jTableDatosPoliticasCliente);
		this.jTableDatosPoliticasCliente.setFillsViewportHeight(true);
		this.jTableDatosPoliticasCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPoliticasCliente= new GridBagLayout();
		this.jPanelAccionesPoliticasCliente.setLayout(gridaBagLayoutAccionesPoliticasCliente);
		
		
		/*	
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 0;
			
		this.jPanelAccionesPoliticasCliente.add(this.jButtonNuevoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBancoPoliticasCliente= new GridBagLayout();
		gridaBagLayoutFK_IdBancoPoliticasCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBancoPoliticasCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBancoPoliticasCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBancoPoliticasCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBancoPoliticasCliente.setLayout(gridaBagLayoutFK_IdBancoPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 0;
		gridBagConstraintsPoliticasCliente.gridx = 0;
		jPanelFK_IdBancoPoliticasCliente.add(jLabelid_bancoFK_IdBancoPoliticasCliente, gridBagConstraintsPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 0;
		gridBagConstraintsPoliticasCliente.gridx = 1;
		jPanelFK_IdBancoPoliticasCliente.add(jComboBoxid_bancoFK_IdBancoPoliticasCliente, gridBagConstraintsPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 1;
		gridBagConstraintsPoliticasCliente.gridx =1;
		jPanelFK_IdBancoPoliticasCliente.add(jButtonFK_IdBancoPoliticasCliente, gridBagConstraintsPoliticasCliente);

		jTabbedPaneBusquedasPoliticasCliente.addTab("1.-Por Banco ", jPanelFK_IdBancoPoliticasCliente);
		jTabbedPaneBusquedasPoliticasCliente.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClientePoliticasCliente= new GridBagLayout();
		gridaBagLayoutFK_IdClientePoliticasCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClientePoliticasCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClientePoliticasCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClientePoliticasCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClientePoliticasCliente.setLayout(gridaBagLayoutFK_IdClientePoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 0;
		gridBagConstraintsPoliticasCliente.gridx = 0;
		jPanelFK_IdClientePoliticasCliente.add(jLabelid_clienteFK_IdClientePoliticasCliente, gridBagConstraintsPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 0;
		gridBagConstraintsPoliticasCliente.gridx = 1;
		jPanelFK_IdClientePoliticasCliente.add(jComboBoxid_clienteFK_IdClientePoliticasCliente, gridBagConstraintsPoliticasCliente);


		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsPoliticasCliente.gridy = 0;
		gridBagConstraintsPoliticasCliente.gridx = 0;
		jPanelFK_IdClientePoliticasCliente.add(this.jButtonBuscarFK_IdClienteid_clientePoliticasCliente, gridBagConstraintsPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 1;
		gridBagConstraintsPoliticasCliente.gridx =1;
		jPanelFK_IdClientePoliticasCliente.add(jButtonFK_IdClientePoliticasCliente, gridBagConstraintsPoliticasCliente);

		jTabbedPaneBusquedasPoliticasCliente.addTab("2.-Por  ", jPanelFK_IdClientePoliticasCliente);
		jTabbedPaneBusquedasPoliticasCliente.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstadoPoliticasClientePoliticasCliente= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoPoliticasClientePoliticasCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoPoliticasClientePoliticasCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoPoliticasClientePoliticasCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoPoliticasClientePoliticasCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoPoliticasClientePoliticasCliente.setLayout(gridaBagLayoutFK_IdEstadoPoliticasClientePoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 0;
		gridBagConstraintsPoliticasCliente.gridx = 0;
		jPanelFK_IdEstadoPoliticasClientePoliticasCliente.add(jLabelid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente, gridBagConstraintsPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 0;
		gridBagConstraintsPoliticasCliente.gridx = 1;
		jPanelFK_IdEstadoPoliticasClientePoliticasCliente.add(jComboBoxid_estado_politicas_clienteFK_IdEstadoPoliticasClientePoliticasCliente, gridBagConstraintsPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 1;
		gridBagConstraintsPoliticasCliente.gridx =1;
		jPanelFK_IdEstadoPoliticasClientePoliticasCliente.add(jButtonFK_IdEstadoPoliticasClientePoliticasCliente, gridBagConstraintsPoliticasCliente);

		jTabbedPaneBusquedasPoliticasCliente.addTab("3.-Por Estado Politicas Cliente ", jPanelFK_IdEstadoPoliticasClientePoliticasCliente);
		jTabbedPaneBusquedasPoliticasCliente.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdLineaNegocioPoliticasCliente= new GridBagLayout();
		gridaBagLayoutFK_IdLineaNegocioPoliticasCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaNegocioPoliticasCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaNegocioPoliticasCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaNegocioPoliticasCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaNegocioPoliticasCliente.setLayout(gridaBagLayoutFK_IdLineaNegocioPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 0;
		gridBagConstraintsPoliticasCliente.gridx = 0;
		jPanelFK_IdLineaNegocioPoliticasCliente.add(jLabelid_linea_negocioFK_IdLineaNegocioPoliticasCliente, gridBagConstraintsPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 0;
		gridBagConstraintsPoliticasCliente.gridx = 1;
		jPanelFK_IdLineaNegocioPoliticasCliente.add(jComboBoxid_linea_negocioFK_IdLineaNegocioPoliticasCliente, gridBagConstraintsPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 1;
		gridBagConstraintsPoliticasCliente.gridx =1;
		jPanelFK_IdLineaNegocioPoliticasCliente.add(jButtonFK_IdLineaNegocioPoliticasCliente, gridBagConstraintsPoliticasCliente);

		jTabbedPaneBusquedasPoliticasCliente.addTab("4.-Por Linea Negocio ", jPanelFK_IdLineaNegocioPoliticasCliente);
		jTabbedPaneBusquedasPoliticasCliente.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoCuentaBancoGlobalPoliticasCliente= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalPoliticasCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalPoliticasCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalPoliticasCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalPoliticasCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCuentaBancoGlobalPoliticasCliente.setLayout(gridaBagLayoutFK_IdTipoCuentaBancoGlobalPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 0;
		gridBagConstraintsPoliticasCliente.gridx = 0;
		jPanelFK_IdTipoCuentaBancoGlobalPoliticasCliente.add(jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente, gridBagConstraintsPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 0;
		gridBagConstraintsPoliticasCliente.gridx = 1;
		jPanelFK_IdTipoCuentaBancoGlobalPoliticasCliente.add(jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalPoliticasCliente, gridBagConstraintsPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 1;
		gridBagConstraintsPoliticasCliente.gridx =1;
		jPanelFK_IdTipoCuentaBancoGlobalPoliticasCliente.add(jButtonFK_IdTipoCuentaBancoGlobalPoliticasCliente, gridBagConstraintsPoliticasCliente);

		jTabbedPaneBusquedasPoliticasCliente.addTab("5.-Por Tipo Cuenta Banco Global ", jPanelFK_IdTipoCuentaBancoGlobalPoliticasCliente);
		jTabbedPaneBusquedasPoliticasCliente.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoPrecioPoliticasCliente= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrecioPoliticasCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioPoliticasCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioPoliticasCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrecioPoliticasCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrecioPoliticasCliente.setLayout(gridaBagLayoutFK_IdTipoPrecioPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 0;
		gridBagConstraintsPoliticasCliente.gridx = 0;
		jPanelFK_IdTipoPrecioPoliticasCliente.add(jLabelid_tipo_precioFK_IdTipoPrecioPoliticasCliente, gridBagConstraintsPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 0;
		gridBagConstraintsPoliticasCliente.gridx = 1;
		jPanelFK_IdTipoPrecioPoliticasCliente.add(jComboBoxid_tipo_precioFK_IdTipoPrecioPoliticasCliente, gridBagConstraintsPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 1;
		gridBagConstraintsPoliticasCliente.gridx =1;
		jPanelFK_IdTipoPrecioPoliticasCliente.add(jButtonFK_IdTipoPrecioPoliticasCliente, gridBagConstraintsPoliticasCliente);

		jTabbedPaneBusquedasPoliticasCliente.addTab("6.-Por Tipo Precio ", jPanelFK_IdTipoPrecioPoliticasCliente);
		jTabbedPaneBusquedasPoliticasCliente.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTransportePoliticasCliente= new GridBagLayout();
		gridaBagLayoutFK_IdTransportePoliticasCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransportePoliticasCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransportePoliticasCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransportePoliticasCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransportePoliticasCliente.setLayout(gridaBagLayoutFK_IdTransportePoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 0;
		gridBagConstraintsPoliticasCliente.gridx = 0;
		jPanelFK_IdTransportePoliticasCliente.add(jLabelid_transporteFK_IdTransportePoliticasCliente, gridBagConstraintsPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 0;
		gridBagConstraintsPoliticasCliente.gridx = 1;
		jPanelFK_IdTransportePoliticasCliente.add(jComboBoxid_transporteFK_IdTransportePoliticasCliente, gridBagConstraintsPoliticasCliente);

		gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticasCliente.gridy = 1;
		gridBagConstraintsPoliticasCliente.gridx =1;
		jPanelFK_IdTransportePoliticasCliente.add(jButtonFK_IdTransportePoliticasCliente, gridBagConstraintsPoliticasCliente);

		jTabbedPaneBusquedasPoliticasCliente.addTab("7.-Por Transporte ", jPanelFK_IdTransportePoliticasCliente);
		jTabbedPaneBusquedasPoliticasCliente.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPoliticasCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPoliticasCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.politicasclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();						
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPoliticasCliente.gridx = 0;		
			//this.gridBagConstraintsPoliticasCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPoliticasCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPoliticasCliente, this.gridBagConstraintsPoliticasCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPoliticasCliente.gridx = 0;		
		//this.gridBagConstraintsPoliticasCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPoliticasCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPoliticasCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPoliticasCliente.gridx = 0;		
			this.gridBagConstraintsPoliticasCliente.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPoliticasCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPoliticasCliente, this.gridBagConstraintsPoliticasCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticasCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPoliticasCliente, this.gridBagConstraintsPoliticasCliente);								
		
		
		/*
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticasCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		*/		
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPoliticasCliente.gridx =0;
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPoliticasCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
				
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticasCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PoliticasClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPoliticasCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPoliticasCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosPoliticasCliente.setLayout(gridaBagLayoutBusquedasParametrosPoliticasCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPoliticasCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPoliticasCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPoliticasCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPoliticasCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticasCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
			
			
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticasCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
			
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPoliticasCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPoliticasCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPoliticasCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPoliticasCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPoliticasCliente.setName("jPanelReporteDinamicoPoliticasCliente"); 
		
		this.jPanelReporteDinamicoPoliticasCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPoliticasCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPoliticasCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPoliticasCliente.setLayout(gridaBagLayoutReporteDinamicoPoliticasCliente);
		
		
		this.jInternalFrameReporteDinamicoPoliticasCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPoliticasCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePoliticasCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPoliticasCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPoliticasCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPoliticasCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPoliticasCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPoliticasCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPoliticasCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoPoliticasCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoPoliticasCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPoliticasCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPoliticasCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPoliticasCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politicas Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePoliticasCliente = new JLabelMe();

		this.jLabelColumnasSelectReportePoliticasCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jLabelColumnasSelectReportePoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePoliticasCliente = new JList<Reporte>();
		this.jListColumnasSelectReportePoliticasCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePoliticasCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePoliticasCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePoliticasCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePoliticasCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePoliticasCliente=new JScrollPane(this.jListColumnasSelectReportePoliticasCliente);
			
			this.jScrollColumnasSelectReportePoliticasCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePoliticasCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePoliticasCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPoliticasCliente.add(this.jListColumnasSelectReportePoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jScrollColumnasSelectReportePoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePoliticasCliente = new JLabelMe();

		this.jLabelRelacionesSelectReportePoliticasCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePoliticasCliente = new JList<Reporte>();
		this.jListRelacionesSelectReportePoliticasCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePoliticasCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePoliticasCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePoliticasCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePoliticasCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePoliticasCliente=new JScrollPane(this.jListRelacionesSelectReportePoliticasCliente);
			
			this.jScrollRelacionesSelectReportePoliticasCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePoliticasCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePoliticasCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPoliticasCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPoliticasCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoPoliticasCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPoliticasCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPoliticasCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPoliticasCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPoliticasCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPoliticasCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPoliticasCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPoliticasCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPoliticasCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPoliticasCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPoliticasCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPoliticasCliente = new JLabelMe();

		this.jLabelConGraficoDinamicoPoliticasCliente.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jLabelConGraficoDinamicoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPoliticasCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPoliticasCliente.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPoliticasCliente.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPoliticasCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPoliticasCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPoliticasCliente.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jCheckBoxConGraficoDinamicoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPoliticasCliente = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPoliticasCliente.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jLabelColumnaCategoriaGraficoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPoliticasCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPoliticasCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPoliticasCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPoliticasCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPoliticasCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jComboBoxColumnaCategoriaGraficoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPoliticasCliente = new JLabelMe();

		this.jLabelColumnaCategoriaValorPoliticasCliente.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jLabelColumnaCategoriaValorPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPoliticasCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPoliticasCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPoliticasCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPoliticasCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPoliticasCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jComboBoxColumnaCategoriaValorPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPoliticasCliente = new JLabelMe();

		this.jLabelColumnasValoresGraficoPoliticasCliente.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jLabelColumnasValoresGraficoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPoliticasCliente = new JList<Reporte>();
		this.jListColumnasValoresGraficoPoliticasCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPoliticasCliente.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPoliticasCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPoliticasCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPoliticasCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPoliticasCliente=new JScrollPane(this.jListColumnasValoresGraficoPoliticasCliente);
			
			this.jScrollColumnasValoresGraficoPoliticasCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPoliticasCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPoliticasCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPoliticasCliente.add(this.jListColumnasSelectReportePoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jScrollColumnasValoresGraficoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPoliticasCliente = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPoliticasCliente.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jLabelTiposGraficosReportesDinamicoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPoliticasCliente.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPoliticasCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPoliticasCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPoliticasCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPoliticasCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jComboBoxTiposGraficosReportesDinamicoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPoliticasCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPoliticasCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jLabelGenerarExcelReporteDinamicoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPoliticasCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPoliticasCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPoliticasCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPoliticasCliente.setToolTipText("Generar EXCEL"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPoliticasCliente.add(this.jButtonGenerarExcelReporteDinamicoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jComboBoxTiposReportesDinamicoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPoliticasCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPoliticasCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jLabelTiposArchivoReporteDinamicoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jComboBoxTiposArchivosReportesDinamicoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPoliticasCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPoliticasCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPoliticasCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPoliticasCliente.setToolTipText("Generar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jButtonGenerarReporteDinamicoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPoliticasCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPoliticasCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPoliticasCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPoliticasCliente.setToolTipText("Cancelar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPoliticasCliente.add(this.jButtonCerrarReporteDinamicoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPoliticasCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPoliticasCliente= new JScrollPane(jPanelReporteDinamicoPoliticasCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPoliticasCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPoliticasCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPoliticasCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politicas Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPoliticasCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPoliticasCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPoliticasCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPoliticasCliente);
		this.jInternalFrameReporteDinamicoPoliticasCliente.getContentPane().add(this.jScrollPanelReporteDinamicoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPoliticasCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPoliticasCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPoliticasCliente.setName("jPanelImportacionPoliticasCliente"); 
		
		this.jPanelImportacionPoliticasCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPoliticasCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPoliticasCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPoliticasCliente.setLayout(gridaBagLayoutImportacionPoliticasCliente);
		
		
		this.jInternalFrameImportacionPoliticasCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPoliticasCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPoliticasCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePoliticasCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPoliticasCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPoliticasCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPoliticasCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPoliticasCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPoliticasCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPoliticasCliente.setResizable(true);
	    this.jInternalFrameImportacionPoliticasCliente.setClosable(true);
	    this.jInternalFrameImportacionPoliticasCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPoliticasCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPoliticasCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPoliticasCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPoliticasCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPoliticasCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPoliticasCliente.setResizable(true);
	    this.jInternalFrameImportacionPoliticasCliente.setClosable(true);
	    this.jInternalFrameImportacionPoliticasCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPoliticasCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPoliticasCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPoliticasCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politicas Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPoliticasCliente = new JLabelMe();

		this.jLabelArchivoImportacionPoliticasCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPoliticasCliente.add(this.jLabelArchivoImportacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPoliticasCliente = new JFileChooser();		
		this.jFileChooserImportacionPoliticasCliente.setToolTipText("ESCOGER ARCHIVO"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPoliticasCliente = new JButtonMe();
		this.jButtonAbrirImportacionPoliticasCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPoliticasCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPoliticasCliente.setToolTipText("Generar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPoliticasCliente.add(this.jButtonAbrirImportacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPoliticasCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionPoliticasCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPoliticasCliente.add(this.jLabelPathArchivoImportacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPoliticasCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPoliticasCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPoliticasCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPoliticasCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPoliticasCliente.add(this.jTextFieldPathArchivoImportacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPoliticasCliente = new JButtonMe();
		this.jButtonGenerarImportacionPoliticasCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPoliticasCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPoliticasCliente.setToolTipText("Generar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPoliticasCliente.add(this.jButtonGenerarImportacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPoliticasCliente = new JButtonMe();
		this.jButtonCerrarImportacionPoliticasCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPoliticasCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPoliticasCliente.setToolTipText("Cancelar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticasCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPoliticasCliente.add(this.jButtonCerrarImportacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPoliticasCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionPoliticasCliente= new JScrollPane(jPanelImportacionPoliticasCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsPoliticasCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPoliticasCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPoliticasCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPoliticasCliente);
		this.jInternalFrameImportacionPoliticasCliente.getContentPane().add(this.jScrollPanelImportacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPoliticasCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPoliticasCliente = new JButtonMe();
			this.jButtonAbrirOrderByPoliticasCliente.setText("Orden");
			this.jButtonAbrirOrderByPoliticasCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPoliticasCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPoliticasCliente";
			inputMap = this.jButtonAbrirOrderByPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPoliticasCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByPoliticasCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPoliticasCliente.setName("jPanelOrderByPoliticasCliente"); 
			
			this.jPanelOrderByPoliticasCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPoliticasCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPoliticasCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPoliticasCliente.setLayout(gridaBagLayoutOrderByPoliticasCliente);
			
			
			this.jTableDatosPoliticasClienteOrderBy = new JTableMe();        
			this.jTableDatosPoliticasClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPoliticasClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPoliticasClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPoliticasClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPoliticasClienteOrderBy.setViewportView(this.jTableDatosPoliticasClienteOrderBy);
			this.jTableDatosPoliticasClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPoliticasClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPoliticasCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPoliticasCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPoliticasCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePoliticasCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPoliticasCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPoliticasCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPoliticasCliente.setTitle("Orden");
			this.jInternalFrameOrderByPoliticasCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPoliticasCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPoliticasCliente.setResizable(true);
			this.jInternalFrameOrderByPoliticasCliente.setClosable(true);
			this.jInternalFrameOrderByPoliticasCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPoliticasCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPoliticasCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPoliticasCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politicas Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPoliticasCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPoliticasCliente.ipady =150;
				
			this.jPanelOrderByPoliticasCliente.add(jScrollPanelDatosPoliticasClienteOrderBy, this.gridBagConstraintsPoliticasCliente);//this.jTableDatosPoliticasClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPoliticasCliente = new JButtonMe();
			this.jButtonCerrarOrderByPoliticasCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPoliticasCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPoliticasCliente.setToolTipText("Cancelar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPoliticasCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPoliticasCliente.add(this.jButtonCerrarOrderByPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPoliticasCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByPoliticasCliente= new JScrollPane(jPanelOrderByPoliticasCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsPoliticasCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPoliticasCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPoliticasCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPoliticasCliente);
			
			this.jInternalFrameOrderByPoliticasCliente.getContentPane().add(this.jScrollPanelOrderByPoliticasCliente, this.gridBagConstraintsPoliticasCliente);			
		
		} else {
			this.jButtonAbrirOrderByPoliticasCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//6030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.politicasclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPoliticasCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPoliticasCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPoliticasCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPoliticasCliente.getRowHeight();//PoliticasClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.politicasclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PoliticasClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPoliticasCliente.isSelected()) {
					iHeightTable=PoliticasClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PoliticasClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PoliticasClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PoliticasClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPoliticasCliente.isSelected()) {
					iHeightTable=PoliticasClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PoliticasClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PoliticasClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPoliticasCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPoliticasCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPoliticasCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPoliticasCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPoliticasCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPoliticasCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPoliticasCliente!=null && this.jInternalFrameOrderByPoliticasCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.politicasclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPoliticasCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPoliticasCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPoliticasCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPoliticasCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPoliticasCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPoliticasCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPoliticasCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPoliticasCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPoliticasCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPoliticasCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=politicasclienteLogic.getPoliticasClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=politicasclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PoliticasCliente> TraerPoliticasClienteBeans(List<PoliticasCliente> politicasclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(PoliticasCliente politicascliente:politicasclientes) {
					
				if(!(PoliticasClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PoliticasClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					politicascliente.setsDetalleGeneralEntityReporte(PoliticasClienteConstantesFunciones.getPoliticasClienteDescripcion(politicascliente));
										
					politicascliente.setcon_lista_precio_descripcion(PoliticasClienteConstantesFunciones.getcon_lista_precioDescripcion(politicascliente));politicascliente.setcon_impuestos_descripcion(PoliticasClienteConstantesFunciones.getcon_impuestosDescripcion(politicascliente));politicascliente.setactivar_monto_facturacion_descripcion(PoliticasClienteConstantesFunciones.getactivar_monto_facturacionDescripcion(politicascliente));	
					
						
					
				} else  {
							
					//politicascliente.setsDetalleGeneralEntityReporte(politicascliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//politicasclientebeans.add(politicasclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return politicasclientes;
    }
	//PARA REPORTES FIN
}
