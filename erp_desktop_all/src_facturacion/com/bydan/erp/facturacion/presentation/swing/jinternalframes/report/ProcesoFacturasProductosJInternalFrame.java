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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.ProcesoFacturasProductosConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class ProcesoFacturasProductosJInternalFrame extends ProcesoFacturasProductosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoFacturasProductos;
	
	protected JMenuBar jmenuBarProcesoFacturasProductos;
	
	protected JMenu jmenuProcesoFacturasProductos;
	protected JMenu jmenuDatosProcesoFacturasProductos;
	protected JMenu jmenuArchivoProcesoFacturasProductos;
	protected JMenu jmenuAccionesProcesoFacturasProductos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoFacturasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoFacturasProductos;	
	protected GridBagConstraints gridBagConstraintsProcesoFacturasProductos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoFacturasProductosDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoFacturasProductos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoFacturasProductos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoFacturasProductos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";
	
	public ProcesoFacturasProductosSessionBean procesofacturasproductosSessionBean;
		
	
	
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoFacturasProductos> procesofacturasproductoss;		
	public List<ProcesoFacturasProductos> procesofacturasproductossEliminados;	
	public List<ProcesoFacturasProductos> procesofacturasproductossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoFacturasProductos;		
	protected JButton jButtonAbrirOrderByProcesoFacturasProductos;
	
	
	//protected JPanel jPanelOrderByProcesoFacturasProductos;
	//public JScrollPane jScrollPanelOrderByProcesoFacturasProductos;	
	//protected JButton jButtonCerrarOrderByProcesoFacturasProductos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoFacturasProductosLogic procesofacturasproductosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoFacturasProductos;
	public JScrollPane jScrollPanelDatosEdicionProcesoFacturasProductos;
	public JScrollPane jScrollPanelDatosGeneralProcesoFacturasProductos;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoFacturasProductosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoFacturasProductos;
	//public JScrollPane jScrollPanelImportacionProcesoFacturasProductos;
	
	
	
	protected JPanel jPanelAccionesProcesoFacturasProductos;
	
    protected JPanel jPanelPaginacionProcesoFacturasProductos;
    protected JPanel jPanelParametrosReportesProcesoFacturasProductos;
	protected JPanel jPanelParametrosReportesAccionesProcesoFacturasProductos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoFacturasProductos;
	protected JPanel jPanelParametrosAuxiliar2ProcesoFacturasProductos;
	protected JPanel jPanelParametrosAuxiliar3ProcesoFacturasProductos;
	protected JPanel jPanelParametrosAuxiliar4ProcesoFacturasProductos;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoFacturasProductos;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoFacturasProductos;
	//protected JPanel jPanelImportacionProcesoFacturasProductos;
	
	
	public JTable jTableDatosProcesoFacturasProductos;
	
	
	
	//public JTable jTableDatosProcesoFacturasProductosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoFacturasProductos;
	protected JButton jButtonDuplicarProcesoFacturasProductos;
	protected JButton jButtonCopiarProcesoFacturasProductos;
	protected JButton jButtonVerFormProcesoFacturasProductos;
	protected JButton jButtonNuevoRelacionesProcesoFacturasProductos;
	protected JButton jButtonModificarProcesoFacturasProductos;
	
    protected JButton jButtonGuardarCambiosTablaProcesoFacturasProductos;
	protected JButton jButtonCerrarProcesoFacturasProductos;
	
	
	protected JButton jButtonRecargarInformacionProcesoFacturasProductos;
	protected JButton jButtonProcesarInformacionProcesoFacturasProductos;
	
	
	protected JButton jButtonAnterioresProcesoFacturasProductos;
	protected JButton jButtonSiguientesProcesoFacturasProductos;
	protected JButton jButtonNuevoGuardarCambiosProcesoFacturasProductos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoFacturasProductos;
	//protected JButton jButtonCerrarReporteDinamicoProcesoFacturasProductos;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoFacturasProductos;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoFacturasProductos;
	//protected JButton jButtonGenerarImportacionProcesoFacturasProductos;
	//protected JButton jButtonCerrarImportacionProcesoFacturasProductos;
	//protected JFileChooser jFileChooserImportacionProcesoFacturasProductos;
	//protected File fileImportacionProcesoFacturasProductos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoFacturasProductos;
	protected JButton jButtonDuplicarToolBarProcesoFacturasProductos;
	protected JButton jButtonNuevoRelacionesToolBarProcesoFacturasProductos;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoFacturasProductos;
	protected JButton jButtonCopiarToolBarProcesoFacturasProductos;
	protected JButton jButtonVerFormToolBarProcesoFacturasProductos;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoFacturasProductos;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoFacturasProductos;
	protected JButton jButtonCerrarToolBarProcesoFacturasProductos;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoFacturasProductos;
	protected JButton jButtonProcesarInformacionToolBarProcesoFacturasProductos;
	protected JButton jButtonAnterioresToolBarProcesoFacturasProductos;
	protected JButton jButtonSiguientesToolBarProcesoFacturasProductos;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoFacturasProductos;
	protected JButton jButtonAbrirOrderByToolBarProcesoFacturasProductos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoFacturasProductos;
	protected JMenuItem jMenuItemDuplicarProcesoFacturasProductos;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoFacturasProductos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoFacturasProductos;
	protected JMenuItem jMenuItemCopiarProcesoFacturasProductos;
	protected JMenuItem jMenuItemVerFormProcesoFacturasProductos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoFacturasProductos;
	protected JMenuItem jMenuItemCerrarProcesoFacturasProductos;
	protected JMenuItem jMenuItemDetalleCerrarProcesoFacturasProductos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoFacturasProductos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoFacturasProductos;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoFacturasProductos;
	protected JMenuItem jMenuItemProcesarInformacionProcesoFacturasProductos;
	protected JMenuItem jMenuItemAnterioresProcesoFacturasProductos;
	protected JMenuItem jMenuItemSiguientesProcesoFacturasProductos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoFacturasProductos;
	protected JMenuItem jMenuItemAbrirOrderByProcesoFacturasProductos;
	protected JMenuItem jMenuItemMostrarOcultarProcesoFacturasProductos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoFacturasProductos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoFacturasProductos;
	protected JCheckBox jCheckBoxSeleccionadosProcesoFacturasProductos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoFacturasProductos;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoFacturasProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoFacturasProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoFacturasProductos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoFacturasProductos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoFacturasProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoFacturasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoFacturasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoFacturasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoFacturasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoFacturasProductos;
	protected JTextField jTextFieldValorCampoGeneralProcesoFacturasProductos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoFacturasProductos;
	//public JList<Reporte> jListColumnasSelectReporteProcesoFacturasProductos;
	//public JScrollPane jScrollColumnasSelectReporteProcesoFacturasProductos;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoFacturasProductos;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoFacturasProductos;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoFacturasProductos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoFacturasProductos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoFacturasProductos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoFacturasProductos;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoFacturasProductos;
	
		
	//public JLabel jLabelArchivoImportacionProcesoFacturasProductos;	
	//public JLabel jLabelPathArchivoImportacionProcesoFacturasProductos;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoFacturasProductos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoFacturasProductos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoFacturasProductos;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoFacturasProductos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoFacturasProductos;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoFacturasProductos;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoFacturasProductos;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoFacturasProductos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoFacturasProductos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoFacturasProductos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoFacturasProductos;
	public JPanel jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	public JButton jButtonBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	
	public JPanel jPanelid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	public JLabel jLabelid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	public JButton jButtonid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos= new JButtonMe();
	public JButton jButtonid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductosUpdate= new JButtonMe();
	public JButton jButtonid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	public JLabel jLabelid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	public JButton jButtonid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos= new JButtonMe();
	public JButton jButtonid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductosUpdate= new JButtonMe();
	public JButton jButtonid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	public JLabel jLabelid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	public JButton jButtonid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductosUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	public JLabel jLabelid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	public JButton jButtonid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos= new JButtonMe();
	public JButton jButtonid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductosUpdate= new JButtonMe();
	public JButton jButtonid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	public JLabel jLabelcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	public JTextField jTextFieldcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	public JButton jButtoncodigoBusquedaProcesoFacturasProductosProcesoFacturasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelnombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	public JLabel jLabelnombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	public JTextArea jTextAreanombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos;
	public JButton jButtonnombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductosBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	//public int iHeightFormulario=1034;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoFacturasProductosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoFacturasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoFacturasProductosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoFacturasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoFacturasProductosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoFacturasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoFacturasProductosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoFacturasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoFacturasProductos)	{
		this.jButtonRecargarInformacionProcesoFacturasProductos = jButtonRecargarInformacionProcesoFacturasProductos;
	}
	
	public JButton getjButtonProcesarInformacionProcesoFacturasProductos() {
		return this.jButtonProcesarInformacionProcesoFacturasProductos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoFacturasProductos)	{
		this.jButtonProcesarInformacionProcesoFacturasProductos = jButtonProcesarInformacionProcesoFacturasProductos;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoFacturasProductos() {
		return this.jButtonRecargarInformacionProcesoFacturasProductos;
	}
	
	
	public List<ProcesoFacturasProductos> getprocesofacturasproductoss() {
		return this.procesofacturasproductoss;
	}

	public void setprocesofacturasproductoss(List<ProcesoFacturasProductos> procesofacturasproductoss) {
		this.procesofacturasproductoss = procesofacturasproductoss;
	}
	
	public List<ProcesoFacturasProductos> getprocesofacturasproductossAux() {
		return this.procesofacturasproductossAux;
	}

	public void setprocesofacturasproductossAux(List<ProcesoFacturasProductos> procesofacturasproductossAux) {
		this.procesofacturasproductossAux = procesofacturasproductossAux;
	}
	
	public List<ProcesoFacturasProductos> getprocesofacturasproductossEliminados() {
		return this.procesofacturasproductossEliminados;
	}

	public void setProcesoFacturasProductossEliminados(List<ProcesoFacturasProductos> procesofacturasproductossEliminados) {
		this.procesofacturasproductossEliminados = procesofacturasproductossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoFacturasProductos() {
		return jComboBoxTiposSeleccionarProcesoFacturasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoFacturasProductos(
			JComboBox jComboBoxTiposSeleccionarProcesoFacturasProductos) {
		this.jComboBoxTiposSeleccionarProcesoFacturasProductos = jComboBoxTiposSeleccionarProcesoFacturasProductos;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoFacturasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoFacturasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoFacturasProductos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoFacturasProductos() {
		return jTextFieldValorCampoGeneralProcesoFacturasProductos;
	}

	public void setjTextFieldValorCampoGeneralProcesoFacturasProductos(
			JTextField jTextFieldValorCampoGeneralProcesoFacturasProductos) {
		this.jTextFieldValorCampoGeneralProcesoFacturasProductos = jTextFieldValorCampoGeneralProcesoFacturasProductos;
	}

	public void setBorderResaltarValorCampoGeneralProcesoFacturasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoFacturasProductos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoFacturasProductos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoFacturasProductos() {
		return this.jCheckBoxSeleccionarTodosProcesoFacturasProductos;
	}

	public void setjCheckBoxSeleccionarTodosProcesoFacturasProductos(
			JCheckBox jCheckBoxSeleccionarTodosProcesoFacturasProductos) {
		this.jCheckBoxSeleccionarTodosProcesoFacturasProductos = jCheckBoxSeleccionarTodosProcesoFacturasProductos;
	}

	public void setBorderResaltarSeleccionarTodosProcesoFacturasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoFacturasProductos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoFacturasProductos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoFacturasProductos() {
		return this.jCheckBoxSeleccionadosProcesoFacturasProductos;
	}

	public void setjCheckBoxSeleccionadosProcesoFacturasProductos(
			JCheckBox jCheckBoxSeleccionadosProcesoFacturasProductos) {
		this.jCheckBoxSeleccionadosProcesoFacturasProductos = jCheckBoxSeleccionadosProcesoFacturasProductos;
	}
	
	public void setBorderResaltarSeleccionadosProcesoFacturasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoFacturasProductos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoFacturasProductos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoFacturasProductos() {
		return this.jComboBoxTiposArchivosReportesProcesoFacturasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoFacturasProductos(
			JComboBox jComboBoxTiposArchivosReportesProcesoFacturasProductos) {
		this.jComboBoxTiposArchivosReportesProcesoFacturasProductos = jComboBoxTiposArchivosReportesProcesoFacturasProductos;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoFacturasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoFacturasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoFacturasProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoFacturasProductos() {
		return this.jComboBoxTiposReportesProcesoFacturasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoFacturasProductos(
			JComboBox jComboBoxTiposReportesProcesoFacturasProductos) {
		this.jComboBoxTiposReportesProcesoFacturasProductos = jComboBoxTiposReportesProcesoFacturasProductos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoFacturasProductos() {
	//	return jComboBoxTiposReportesDinamicoProcesoFacturasProductos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoFacturasProductos(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoFacturasProductos) {
	//	this.jComboBoxTiposReportesDinamicoProcesoFacturasProductos = jComboBoxTiposReportesDinamicoProcesoFacturasProductos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoFacturasProductos() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoFacturasProductos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoFacturasProductos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoFacturasProductos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoFacturasProductos = jComboBoxTiposArchivosReportesDinamicoProcesoFacturasProductos;
	//}
	
	public void setBorderResaltarTiposReportesProcesoFacturasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoFacturasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoFacturasProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoFacturasProductos() {
		return this.jComboBoxTiposGraficosReportesProcesoFacturasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoFacturasProductos(
			JComboBox jComboBoxTiposGraficosReportesProcesoFacturasProductos) {
		this.jComboBoxTiposGraficosReportesProcesoFacturasProductos = jComboBoxTiposGraficosReportesProcesoFacturasProductos;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoFacturasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoFacturasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoFacturasProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoFacturasProductos() {
		return this.jComboBoxTiposPaginacionProcesoFacturasProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoFacturasProductos(
			JComboBox jComboBoxTiposPaginacionProcesoFacturasProductos) {
		this.jComboBoxTiposPaginacionProcesoFacturasProductos = jComboBoxTiposPaginacionProcesoFacturasProductos;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoFacturasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoFacturasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoFacturasProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoFacturasProductos() {
		return this.jComboBoxTiposRelacionesProcesoFacturasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoFacturasProductos() {
		return this.jComboBoxTiposAccionesProcesoFacturasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoFacturasProductos(
			JComboBox jComboBoxTiposRelacionesProcesoFacturasProductos) {
		this.jComboBoxTiposRelacionesProcesoFacturasProductos = jComboBoxTiposRelacionesProcesoFacturasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoFacturasProductos(
			JComboBox jComboBoxTiposAccionesProcesoFacturasProductos) {
		this.jComboBoxTiposAccionesProcesoFacturasProductos = jComboBoxTiposAccionesProcesoFacturasProductos;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoFacturasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoFacturasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoFacturasProductos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoFacturasProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoFacturasProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoFacturasProductos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoFacturasProductos() {
	//	return jCheckBoxConGraficoDinamicoProcesoFacturasProductos;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoFacturasProductos(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoFacturasProductos) {
	//	this.jCheckBoxConGraficoDinamicoProcesoFacturasProductos = jCheckBoxConGraficoDinamicoProcesoFacturasProductos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoFacturasProductos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoFacturasProductos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoFacturasProductos .setBorder(borderResaltar);		
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
		this.procesofacturasproductosSessionBean=new ProcesoFacturasProductosSessionBean();
		
		this.procesofacturasproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesofacturasproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesofacturasproductosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoFacturasProductosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoFacturasProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoFacturasProductosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoFacturasProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoFacturasProductosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Facturas Productos MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoFacturasProductosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoFacturasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoFacturasProductos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoFacturasProductos,this.jTtoolBarProcesoFacturasProductos,
							"nuevo","nuevo","Nuevo"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoFacturasProductos,this.jTtoolBarProcesoFacturasProductos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoFacturasProductos,this.jTtoolBarProcesoFacturasProductos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoFacturasProductos,this.jTtoolBarProcesoFacturasProductos,
							"duplicar","duplicar","Duplicar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoFacturasProductos,this.jTtoolBarProcesoFacturasProductos,
							"copiar","copiar","Copiar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoFacturasProductos,this.jTtoolBarProcesoFacturasProductos,
							"ver_form","ver_form","Ver"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoFacturasProductos,this.jTtoolBarProcesoFacturasProductos,
							"recargar","recargar","Buscar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoFacturasProductos,this.jTtoolBarProcesoFacturasProductos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoFacturasProductos,this.jTtoolBarProcesoFacturasProductos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoFacturasProductos,this.jTtoolBarProcesoFacturasProductos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoFacturasProductos,this.jTtoolBarProcesoFacturasProductos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoFacturasProductos,this.jTtoolBarProcesoFacturasProductos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoFacturasProductos,this.jTtoolBarProcesoFacturasProductos,
							"cerrar","cerrar","Salir"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoFacturasProductos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoFacturasProductos;
			
				this.jButtonProcesarInformacionToolBarProcesoFacturasProductos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoFacturasProductos;
				
		//protected JButton jButtonModificarToolBarProcesoFacturasProductos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoFacturasProductos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoFacturasProductos=new JMenuMe("General");
		this.jmenuArchivoProcesoFacturasProductos=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoFacturasProductos=new JMenuMe("Acciones");
		this.jmenuDatosProcesoFacturasProductos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoFacturasProductos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoFacturasProductos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoFacturasProductos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoFacturasProductos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoFacturasProductos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoFacturasProductos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoFacturasProductos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoFacturasProductos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoFacturasProductos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoFacturasProductos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoFacturasProductos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoFacturasProductos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoFacturasProductos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoFacturasProductos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoFacturasProductos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoFacturasProductos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoFacturasProductos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoFacturasProductos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoFacturasProductos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoFacturasProductos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoFacturasProductos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoFacturasProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoFacturasProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoFacturasProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoFacturasProductos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoFacturasProductos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoFacturasProductos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoFacturasProductos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoFacturasProductos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoFacturasProductos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoFacturasProductos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoFacturasProductos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoFacturasProductos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoFacturasProductos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoFacturasProductos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoFacturasProductos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoFacturasProductos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoFacturasProductos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoFacturasProductos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoFacturasProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoFacturasProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoFacturasProductos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoFacturasProductos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoFacturasProductos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoFacturasProductos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoFacturasProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoFacturasProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoFacturasProductos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoFacturasProductos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoFacturasProductos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoFacturasProductos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoFacturasProductos.add(this.jMenuItemCerrarProcesoFacturasProductos);
			
			this.jmenuAccionesProcesoFacturasProductos.add(this.jMenuItemNuevoProcesoFacturasProductos);
			this.jmenuAccionesProcesoFacturasProductos.add(this.jMenuItemNuevoGuardarCambiosProcesoFacturasProductos);
			this.jmenuAccionesProcesoFacturasProductos.add(this.jMenuItemNuevoRelacionesProcesoFacturasProductos);
			this.jmenuAccionesProcesoFacturasProductos.add(this.jMenuItemGuardarCambiosTablaProcesoFacturasProductos);		
			this.jmenuAccionesProcesoFacturasProductos.add(this.jMenuItemDuplicarProcesoFacturasProductos);		
			this.jmenuAccionesProcesoFacturasProductos.add(this.jMenuItemCopiarProcesoFacturasProductos);		
			this.jmenuAccionesProcesoFacturasProductos.add(this.jMenuItemVerFormProcesoFacturasProductos);		
			
			this.jmenuDatosProcesoFacturasProductos.add(this.jMenuItemRecargarInformacionProcesoFacturasProductos);				
			this.jmenuDatosProcesoFacturasProductos.add(this.jMenuItemAnterioresProcesoFacturasProductos);				
			this.jmenuDatosProcesoFacturasProductos.add(this.jMenuItemSiguientesProcesoFacturasProductos);				
			this.jmenuDatosProcesoFacturasProductos.add(this.jMenuItemAbrirOrderByProcesoFacturasProductos);				
			this.jmenuDatosProcesoFacturasProductos.add(this.jMenuItemMostrarOcultarProcesoFacturasProductos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoFacturasProductos.add(this.jMenuItemGuardarCambiosProcesoFacturasProductos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoFacturasProductos.add(this.jmenuArchivoProcesoFacturasProductos);		
			this.jmenuBarProcesoFacturasProductos.add(this.jmenuAccionesProcesoFacturasProductos);		
			this.jmenuBarProcesoFacturasProductos.add(this.jmenuDatosProcesoFacturasProductos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoFacturasProductos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoFacturasProductos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos.setToolTipText("Buscar Por Ciudad Por Zona Por Grupo Cliente Por Vendedor Por Codigo Por Nombre Completo ");
		this.jButtonBusquedaProcesoFacturasProductosProcesoFacturasProductos= new JButtonMe();
		this.jButtonBusquedaProcesoFacturasProductosProcesoFacturasProductos.setText("Buscar");
		this.jButtonBusquedaProcesoFacturasProductosProcesoFacturasProductos.setToolTipText("Buscar Por Ciudad Por Zona Por Grupo Cliente Por Vendedor Por Codigo Por Nombre Completo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoFacturasProductosProcesoFacturasProductos,"buscar_button","Buscar Por Ciudad Por Zona Por Grupo Cliente Por Vendedor Por Codigo Por Nombre Completo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoFacturasProductosProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos = new JLabelMe();
		jLabelid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.setText("Ciudad :");
		jLabelid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.setToolTipText("Ciudad");
		jLabelid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos= new JComboBoxMe();
		jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos = new JLabelMe();
		jLabelid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.setText("Zona :");
		jLabelid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.setToolTipText("Zona");
		jLabelid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos= new JComboBoxMe();
		jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos = new JLabelMe();
		jLabelid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.setText("Grupo Cliente :");
		jLabelid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.setToolTipText("Grupo Cliente");
		jLabelid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos= new JComboBoxMe();
		jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos = new JLabelMe();
		jLabelid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.setText("Vendedor :");
		jLabelid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.setToolTipText("Vendedor");
		jLabelid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos= new JComboBoxMe();
		jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos = new JLabelMe();
		jLabelcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos.setText("Codigo :");
		jLabelcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos.setToolTipText("Codigo");
		jLabelcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos= new JTextFieldMe();
		jTextFieldcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelnombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos = new JLabelMe();
		jLabelnombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos.setText("Nombre Completo :");
		jLabelnombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos.setToolTipText("Nombre Completo");
		jLabelnombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos= new JTextAreaMe();
		jTextAreanombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoFacturasProductos=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoFacturasProductos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasProcesoFacturasProductos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasProcesoFacturasProductos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));

		//this.jTabbedPaneBusquedasProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesoFacturasProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoFacturasProductos = new ProcesoFacturasProductosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Facturas Productos DATOS");
			this.jInternalFrameDetalleFormProcesoFacturasProductos = new ProcesoFacturasProductosDetalleFormJInternalFrame(jDesktopPane,this.procesofacturasproductosSessionBean.getConGuardarRelaciones(),this.procesofacturasproductosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoFacturasProductos = null;//new ProcesoFacturasProductosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoFacturasProductos= new GridBagLayout();
		
		
		this.jTableDatosProcesoFacturasProductos = new JTableMe();      
		
		String sToolTipProcesoFacturasProductos="";
		sToolTipProcesoFacturasProductos=ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoFacturasProductos+="(Facturacion.ProcesoFacturasProductos)";
		}
		
		if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoFacturasProductos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoFacturasProductos.setToolTipText(sToolTipProcesoFacturasProductos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoFacturasProductos);
		this.jTableDatosProcesoFacturasProductos.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoFacturasProductos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoFacturasProductos.setRowSelectionAllowed(true);
		this.jTableDatosProcesoFacturasProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoFacturasProductos = new JButtonMe();
		this.jButtonDuplicarProcesoFacturasProductos = new JButtonMe();
		this.jButtonCopiarProcesoFacturasProductos = new JButtonMe();
		this.jButtonVerFormProcesoFacturasProductos = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoFacturasProductos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoFacturasProductos = new JButtonMe();
		this.jButtonCerrarProcesoFacturasProductos = new JButtonMe();
		
		this.jScrollPanelDatosProcesoFacturasProductos = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoFacturasProductos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoFacturasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Facturas Productos";
		
		if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Facturas Productoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoFacturasProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoFacturasProductos.setToolTipText("Acciones");
        this.jPanelAccionesProcesoFacturasProductos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoFacturasProductos=new ReporteDinamicoJInternalFrame(ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoFacturasProductos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoFacturasProductos=new ImportacionJInternalFrame(ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoFacturasProductos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoFacturasProductos = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoFacturasProductos.setText("Orden");
		this.jButtonAbrirOrderByProcesoFacturasProductos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoFacturasProductos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoFacturasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoFacturasProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoFacturasProductos,false,this);
			
			//this.cargarOrderByProcesoFacturasProductos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoFacturasProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoFacturasProductos,true,this);
			
			//this.cargarOrderByProcesoFacturasProductos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoFacturasProductos.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosProcesoFacturasProductos.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosProcesoFacturasProductos.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosProcesoFacturasProductos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoFacturasProductos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoFacturasProductos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoFacturasProductos.setText("Nuevo");
		this.jButtonDuplicarProcesoFacturasProductos.setText("Duplicar");
		this.jButtonCopiarProcesoFacturasProductos.setText("Copiar");
		this.jButtonVerFormProcesoFacturasProductos.setText("Ver");
		this.jButtonNuevoRelacionesProcesoFacturasProductos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoFacturasProductos.setText("Guardar");
		this.jButtonCerrarProcesoFacturasProductos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoFacturasProductos,"nuevo_button","Nuevo",this.procesofacturasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoFacturasProductos,"duplicar_button","Duplicar",this.procesofacturasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoFacturasProductos,"copiar_button","Copiar",this.procesofacturasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoFacturasProductos,"ver_form","Ver",this.procesofacturasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoFacturasProductos,"nuevorelaciones_button","Nuevo Rel",this.procesofacturasproductosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoFacturasProductos,"guardarcambiostabla_button","Guardar",this.procesofacturasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoFacturasProductos,"cerrar_button","Salir",this.procesofacturasproductosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoFacturasProductos.setToolTipText("Nuevo"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoFacturasProductos.setToolTipText("Duplicar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoFacturasProductos.setToolTipText("Copiar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoFacturasProductos.setToolTipText("Ver"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoFacturasProductos.setToolTipText("Nuevo Rel"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoFacturasProductos.setToolTipText("Guardar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoFacturasProductos.setToolTipText("Salir"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoFacturasProductos";
		inputMap = this.jButtonNuevoProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoFacturasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoFacturasProductos"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoFacturasProductos";
		inputMap = this.jButtonDuplicarProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoFacturasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoFacturasProductos"));
		
		//COPIAR
		sMapKey = "CopiarProcesoFacturasProductos";
		inputMap = this.jButtonCopiarProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoFacturasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoFacturasProductos"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoFacturasProductos";
		inputMap = this.jButtonVerFormProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoFacturasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoFacturasProductos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoFacturasProductos";
		inputMap = this.jButtonNuevoRelacionesProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoFacturasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoFacturasProductos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoFacturasProductos";
		inputMap = this.jButtonModificarProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoFacturasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoFacturasProductos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoFacturasProductos";
		inputMap = this.jButtonCerrarProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoFacturasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoFacturasProductos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoFacturasProductos";
		inputMap = this.jButtonGuardarCambiosTablaProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoFacturasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoFacturasProductos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoFacturasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoFacturasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoFacturasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoFacturasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoFacturasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoFacturasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoFacturasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoFacturasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoFacturasProductos.setName("jPanelParametrosReportesProcesoFacturasProductos"); 
		
		this.jPanelParametrosReportesAccionesProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoFacturasProductos.setName("jPanelParametrosReportesAccionesProcesoFacturasProductos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoFacturasProductos = new JButtonMe();
		this.jButtonRecargarInformacionProcesoFacturasProductos.setText("Buscar");
		this.jButtonRecargarInformacionProcesoFacturasProductos.setToolTipText("Buscar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoFacturasProductos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProcesoFacturasProductos.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoFacturasProductos = new JButtonMe();
		this.jButtonProcesarInformacionProcesoFacturasProductos.setText("Procesar");
		this.jButtonProcesarInformacionProcesoFacturasProductos.setToolTipText("Procesar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoFacturasProductos.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoFacturasProductos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoFacturasProductos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoFacturasProductos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoFacturasProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoFacturasProductos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoFacturasProductos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoFacturasProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoFacturasProductos.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoFacturasProductos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoFacturasProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoFacturasProductos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoFacturasProductos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoFacturasProductos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoFacturasProductos.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoFacturasProductos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoFacturasProductos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoFacturasProductos.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoFacturasProductos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoFacturasProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoFacturasProductos.setText("Accion");
		this.jComboBoxTiposAccionesProcesoFacturasProductos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoFacturasProductos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoFacturasProductos.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoFacturasProductos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoFacturasProductos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoFacturasProductos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoFacturasProductos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoFacturasProductos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoFacturasProductos = new JLabelMe();
		
		this.jLabelAccionesProcesoFacturasProductos.setText("Acciones");		
		this.jLabelAccionesProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoFacturasProductos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoFacturasProductos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoFacturasProductos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoFacturasProductos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoFacturasProductos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoFacturasProductos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoFacturasProductos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoFacturasProductos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoFacturasProductos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoFacturasProductos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoFacturasProductos.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoFacturasProductos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoFacturasProductos = new JButtonMe();
		//this.jButtonAnterioresProcesoFacturasProductos.setText("<<");
        this.jButtonAnterioresProcesoFacturasProductos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoFacturasProductos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoFacturasProductos = new JButtonMe();
		//this.jButtonSiguientesProcesoFacturasProductos.setText(">>");
        this.jButtonSiguientesProcesoFacturasProductos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoFacturasProductos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoFacturasProductos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoFacturasProductos.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoFacturasProductos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoFacturasProductos,"nuevoguardarcambios_button","Nue",this.procesofacturasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoFacturasProductos";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoFacturasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoFacturasProductos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoFacturasProductos";
		inputMap = this.jButtonRecargarInformacionProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoFacturasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoFacturasProductos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoFacturasProductos";
		inputMap = this.jButtonSiguientesProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoFacturasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoFacturasProductos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoFacturasProductos";
		inputMap = this.jButtonAnterioresProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoFacturasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoFacturasProductos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoFacturasProductos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoFacturasProductos.setMinimumSize(new Dimension(this.getWidth(),ProcesoFacturasProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoFacturasProductosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoFacturasProductos.setMaximumSize(new Dimension(this.getWidth(),ProcesoFacturasProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoFacturasProductosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoFacturasProductos.setPreferredSize(new Dimension(this.getWidth(),ProcesoFacturasProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoFacturasProductosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoFacturasProductos = new GridBagLayout();

			this.jPanelPaginacionProcesoFacturasProductos.setLayout(gridaBagLayoutPaginacionProcesoFacturasProductos);						
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoFacturasProductos.add(this.jButtonAnterioresProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
					
						
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
			
			this.jPanelPaginacionProcesoFacturasProductos.add(this.jButtonNuevoGuardarCambiosProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
						
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
			this.jPanelPaginacionProcesoFacturasProductos.add(this.jButtonSiguientesProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = 1;
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoFacturasProductos.add(this.jButtonNuevoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
						
			
			
			if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
				this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoFacturasProductos.gridy = 1;
				this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoFacturasProductos.add(this.jButtonGuardarCambiosTablaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
			}
			
			
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = 1;
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoFacturasProductos.add(this.jButtonDuplicarProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = 1;
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoFacturasProductos.add(this.jButtonCopiarProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = 1;
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoFacturasProductos.add(this.jButtonVerFormProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = 1;
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoFacturasProductos.add(this.jButtonCerrarProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
		
		
		this.jButtonRecargarInformacionProcesoFacturasProductos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoFacturasProductos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoFacturasProductos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoFacturasProductos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoFacturasProductos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoFacturasProductos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoFacturasProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoFacturasProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoFacturasProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoFacturasProductos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoFacturasProductos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoFacturasProductos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoFacturasProductos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoFacturasProductos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoFacturasProductos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoFacturasProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoFacturasProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoFacturasProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoFacturasProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoFacturasProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoFacturasProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoFacturasProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoFacturasProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoFacturasProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoFacturasProductos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoFacturasProductos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoFacturasProductos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoFacturasProductos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoFacturasProductos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoFacturasProductos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoFacturasProductos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoFacturasProductos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoFacturasProductos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoFacturasProductos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoFacturasProductos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoFacturasProductos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoFacturasProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoFacturasProductos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoFacturasProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoFacturasProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoFacturasProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoFacturasProductos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoFacturasProductos.setLayout(gridaBagParametrosReportesProcesoFacturasProductos);
			this.jPanelParametrosReportesAccionesProcesoFacturasProductos.setLayout(gridaBagParametrosReportesAccionesProcesoFacturasProductos);
			
			
			this.jPanelParametrosAuxiliar1ProcesoFacturasProductos.setLayout(gridaBagParametrosAuxiliar1ProcesoFacturasProductos);
			this.jPanelParametrosAuxiliar2ProcesoFacturasProductos.setLayout(gridaBagParametrosAuxiliar2ProcesoFacturasProductos);
			this.jPanelParametrosAuxiliar3ProcesoFacturasProductos.setLayout(gridaBagParametrosAuxiliar3ProcesoFacturasProductos);
			this.jPanelParametrosAuxiliar4ProcesoFacturasProductos.setLayout(gridaBagParametrosAuxiliar4ProcesoFacturasProductos);
			//this.jPanelParametrosAuxiliar5ProcesoFacturasProductos.setLayout(gridaBagParametrosAuxiliar2ProcesoFacturasProductos);			
			
			
			
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoFacturasProductos.add(this.jButtonRecargarInformacionProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoFacturasProductos.add(this.jComboBoxTiposPaginacionProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoFacturasProductos.add(this.jCheckBoxConAltoMaximoTablaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoFacturasProductos.add(this.jComboBoxTiposArchivosReportesProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoFacturasProductos.add(this.jPanelParametrosAuxiliar1ProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoFacturasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoFacturasProductos.add(this.jComboBoxTiposReportesProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);																		
			
			
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoFacturasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProcesoFacturasProductos.add(this.jComboBoxTiposGraficosReportesProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoFacturasProductos.add(this.jPanelParametrosAuxiliar4ProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoFacturasProductos.add(this.jComboBoxTiposReportesProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoFacturasProductos.add(this.jCheckBoxGenerarReporteProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoFacturasProductos.add(this.jPanelParametrosAuxiliar2ProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoFacturasProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoFacturasProductos.add(this.jLabelAccionesProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
				this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProcesoFacturasProductos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProcesoFacturasProductos.add(this.jButtonAbrirOrderByProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoFacturasProductos.add(this.jComboBoxTiposSeleccionarProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);			
			
			
			/*
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoFacturasProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoFacturasProductos.add(this.jCheckBoxSeleccionarTodosProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoFacturasProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoFacturasProductos.add(this.jCheckBoxConGraficoReporteProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoFacturasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoFacturasProductos.add(this.jCheckBoxSeleccionarTodosProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);															
				
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoFacturasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoFacturasProductos.add(this.jCheckBoxSeleccionadosProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);															
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoFacturasProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoFacturasProductos.add(this.jCheckBoxConGraficoReporteProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoFacturasProductos.add(this.jPanelParametrosAuxiliar3ProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoFacturasProductos.add(this.jComboBoxTiposAccionesProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoFacturasProductos = new GridBagLayout();

			this.jScrollPanelDatosProcesoFacturasProductos.setLayout(gridaBagLayoutDatosProcesoFacturasProductos);
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
			this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
			
			this.jScrollPanelDatosProcesoFacturasProductos.add(this.jTableDatosProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoFacturasProductos.setViewportView(this.jTableDatosProcesoFacturasProductos);
		this.jTableDatosProcesoFacturasProductos.setFillsViewportHeight(true);
		this.jTableDatosProcesoFacturasProductos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoFacturasProductos= new GridBagLayout();
		this.jPanelAccionesProcesoFacturasProductos.setLayout(gridaBagLayoutAccionesProcesoFacturasProductos);
		
		
		/*	
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
			
		this.jPanelAccionesProcesoFacturasProductos.add(this.jButtonNuevoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoFacturasProductosProcesoFacturasProductos= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoFacturasProductosProcesoFacturasProductos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoFacturasProductosProcesoFacturasProductos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoFacturasProductosProcesoFacturasProductos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoFacturasProductosProcesoFacturasProductos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos.setLayout(gridaBagLayoutBusquedaProcesoFacturasProductosProcesoFacturasProductos);

		gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		gridBagConstraintsProcesoFacturasProductos.gridx = 0;
		jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos.add(jLabelid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos, gridBagConstraintsProcesoFacturasProductos);

		gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		gridBagConstraintsProcesoFacturasProductos.gridx = 1;
		jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos.add(jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos, gridBagConstraintsProcesoFacturasProductos);


		gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoFacturasProductos.gridy = 1;
		gridBagConstraintsProcesoFacturasProductos.gridx = 0;
		jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos.add(jLabelid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos, gridBagConstraintsProcesoFacturasProductos);

		gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoFacturasProductos.gridy = 1;
		gridBagConstraintsProcesoFacturasProductos.gridx = 1;
		jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos.add(jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos, gridBagConstraintsProcesoFacturasProductos);


		gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoFacturasProductos.gridy = 2;
		gridBagConstraintsProcesoFacturasProductos.gridx = 0;
		jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos.add(jLabelid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos, gridBagConstraintsProcesoFacturasProductos);

		gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoFacturasProductos.gridy = 2;
		gridBagConstraintsProcesoFacturasProductos.gridx = 1;
		jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos.add(jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos, gridBagConstraintsProcesoFacturasProductos);


		gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoFacturasProductos.gridy = 3;
		gridBagConstraintsProcesoFacturasProductos.gridx = 0;
		jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos.add(jLabelid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos, gridBagConstraintsProcesoFacturasProductos);

		gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoFacturasProductos.gridy = 3;
		gridBagConstraintsProcesoFacturasProductos.gridx = 1;
		jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos.add(jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos, gridBagConstraintsProcesoFacturasProductos);


		gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoFacturasProductos.gridy = 4;
		gridBagConstraintsProcesoFacturasProductos.gridx = 0;
		jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos.add(jLabelcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos, gridBagConstraintsProcesoFacturasProductos);

		gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoFacturasProductos.gridy = 4;
		gridBagConstraintsProcesoFacturasProductos.gridx = 1;
		jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos.add(jTextFieldcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos, gridBagConstraintsProcesoFacturasProductos);


		gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoFacturasProductos.gridy = 5;
		gridBagConstraintsProcesoFacturasProductos.gridx = 0;
		jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos.add(jLabelnombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos, gridBagConstraintsProcesoFacturasProductos);

		gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoFacturasProductos.gridy = 5;
		gridBagConstraintsProcesoFacturasProductos.gridx = 1;
		jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos.add(jTextAreanombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos, gridBagConstraintsProcesoFacturasProductos);

		gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoFacturasProductos.gridy = 6;
		gridBagConstraintsProcesoFacturasProductos.gridx =1;
		jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos.add(jButtonBusquedaProcesoFacturasProductosProcesoFacturasProductos, gridBagConstraintsProcesoFacturasProductos);

		jTabbedPaneBusquedasProcesoFacturasProductos.addTab("1.-Por Ciudad Por Zona Por Grupo Cliente Por Vendedor Por Codigo Por Nombre Completo ", jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos);
		jTabbedPaneBusquedasProcesoFacturasProductos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoFacturasProductos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();						
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;		
			//this.gridBagConstraintsProcesoFacturasProductos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoFacturasProductos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;		
		//this.gridBagConstraintsProcesoFacturasProductos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoFacturasProductos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;		
			this.gridBagConstraintsProcesoFacturasProductos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoFacturasProductos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);								
		
		
		/*
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		*/		
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoFacturasProductos.gridx =0;
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoFacturasProductos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
				
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoFacturasProductosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoFacturasProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoFacturasProductos = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoFacturasProductos.setLayout(gridaBagLayoutBusquedasParametrosProcesoFacturasProductos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoFacturasProductos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoFacturasProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoFacturasProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoFacturasProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
			
			
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
			
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProcesoFacturasProductos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoFacturasProductos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoFacturasProductos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoFacturasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoFacturasProductos.setName("jPanelReporteDinamicoProcesoFacturasProductos"); 
		
		this.jPanelReporteDinamicoProcesoFacturasProductos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoFacturasProductos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoFacturasProductos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoFacturasProductos.setLayout(gridaBagLayoutReporteDinamicoProcesoFacturasProductos);
		
		
		this.jInternalFrameReporteDinamicoProcesoFacturasProductos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoFacturasProductos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoFacturasProductos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoFacturasProductos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoFacturasProductos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoFacturasProductos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Facturas Productoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoFacturasProductos = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoFacturasProductos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jLabelColumnasSelectReporteProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoFacturasProductos = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoFacturasProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoFacturasProductos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoFacturasProductos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoFacturasProductos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoFacturasProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoFacturasProductos=new JScrollPane(this.jListColumnasSelectReporteProcesoFacturasProductos);
			
			this.jScrollColumnasSelectReporteProcesoFacturasProductos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoFacturasProductos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoFacturasProductos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jListColumnasSelectReporteProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jScrollColumnasSelectReporteProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoFacturasProductos = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoFacturasProductos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoFacturasProductos = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoFacturasProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoFacturasProductos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoFacturasProductos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoFacturasProductos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoFacturasProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoFacturasProductos=new JScrollPane(this.jListRelacionesSelectReporteProcesoFacturasProductos);
			
			this.jScrollRelacionesSelectReporteProcesoFacturasProductos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoFacturasProductos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoFacturasProductos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoFacturasProductos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoFacturasProductos = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoFacturasProductos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoFacturasProductos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoFacturasProductos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoFacturasProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoFacturasProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoFacturasProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoFacturasProductos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoFacturasProductos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoFacturasProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoFacturasProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoFacturasProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProcesoFacturasProductos = new JLabelMe();

		this.jLabelConGraficoDinamicoProcesoFacturasProductos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jLabelConGraficoDinamicoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProcesoFacturasProductos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProcesoFacturasProductos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProcesoFacturasProductos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProcesoFacturasProductos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoFacturasProductos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoFacturasProductos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jCheckBoxConGraficoDinamicoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProcesoFacturasProductos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProcesoFacturasProductos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jLabelColumnaCategoriaGraficoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProcesoFacturasProductos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoFacturasProductos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProcesoFacturasProductos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProcesoFacturasProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoFacturasProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoFacturasProductos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jComboBoxColumnaCategoriaGraficoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProcesoFacturasProductos = new JLabelMe();

		this.jLabelColumnaCategoriaValorProcesoFacturasProductos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jLabelColumnaCategoriaValorProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProcesoFacturasProductos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProcesoFacturasProductos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProcesoFacturasProductos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProcesoFacturasProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoFacturasProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoFacturasProductos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jComboBoxColumnaCategoriaValorProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProcesoFacturasProductos = new JLabelMe();

		this.jLabelColumnasValoresGraficoProcesoFacturasProductos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jLabelColumnasValoresGraficoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProcesoFacturasProductos = new JList<Reporte>();
		this.jListColumnasValoresGraficoProcesoFacturasProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProcesoFacturasProductos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProcesoFacturasProductos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoFacturasProductos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoFacturasProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProcesoFacturasProductos=new JScrollPane(this.jListColumnasValoresGraficoProcesoFacturasProductos);
			
			this.jScrollColumnasValoresGraficoProcesoFacturasProductos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoFacturasProductos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoFacturasProductos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jListColumnasSelectReporteProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jScrollColumnasValoresGraficoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProcesoFacturasProductos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProcesoFacturasProductos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jLabelTiposGraficosReportesDinamicoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProcesoFacturasProductos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoFacturasProductos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProcesoFacturasProductos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProcesoFacturasProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoFacturasProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoFacturasProductos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jComboBoxTiposGraficosReportesDinamicoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoFacturasProductos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoFacturasProductos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jLabelGenerarExcelReporteDinamicoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoFacturasProductos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoFacturasProductos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoFacturasProductos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoFacturasProductos.setToolTipText("Generar EXCEL"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jButtonGenerarExcelReporteDinamicoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jComboBoxTiposReportesDinamicoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoFacturasProductos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoFacturasProductos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jLabelTiposArchivoReporteDinamicoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoFacturasProductos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoFacturasProductos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoFacturasProductos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoFacturasProductos.setToolTipText("Generar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jButtonGenerarReporteDinamicoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoFacturasProductos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoFacturasProductos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoFacturasProductos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoFacturasProductos.setToolTipText("Cancelar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoFacturasProductos.add(this.jButtonCerrarReporteDinamicoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoFacturasProductos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoFacturasProductos= new JScrollPane(jPanelReporteDinamicoProcesoFacturasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoFacturasProductos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoFacturasProductos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoFacturasProductos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Facturas Productoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoFacturasProductos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoFacturasProductos);
		this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoFacturasProductos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoFacturasProductos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoFacturasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoFacturasProductos.setName("jPanelImportacionProcesoFacturasProductos"); 
		
		this.jPanelImportacionProcesoFacturasProductos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoFacturasProductos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoFacturasProductos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoFacturasProductos.setLayout(gridaBagLayoutImportacionProcesoFacturasProductos);
		
		
		this.jInternalFrameImportacionProcesoFacturasProductos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoFacturasProductos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoFacturasProductos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoFacturasProductos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoFacturasProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoFacturasProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoFacturasProductos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoFacturasProductos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoFacturasProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoFacturasProductos.setResizable(true);
	    this.jInternalFrameImportacionProcesoFacturasProductos.setClosable(true);
	    this.jInternalFrameImportacionProcesoFacturasProductos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoFacturasProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoFacturasProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoFacturasProductos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoFacturasProductos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoFacturasProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoFacturasProductos.setResizable(true);
	    this.jInternalFrameImportacionProcesoFacturasProductos.setClosable(true);
	    this.jInternalFrameImportacionProcesoFacturasProductos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoFacturasProductos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoFacturasProductos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoFacturasProductos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Facturas Productoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoFacturasProductos = new JLabelMe();

		this.jLabelArchivoImportacionProcesoFacturasProductos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoFacturasProductos.add(this.jLabelArchivoImportacionProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoFacturasProductos = new JFileChooser();		
		this.jFileChooserImportacionProcesoFacturasProductos.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoFacturasProductos = new JButtonMe();
		this.jButtonAbrirImportacionProcesoFacturasProductos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoFacturasProductos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoFacturasProductos.setToolTipText("Generar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoFacturasProductos.add(this.jButtonAbrirImportacionProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoFacturasProductos = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoFacturasProductos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoFacturasProductos.add(this.jLabelPathArchivoImportacionProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoFacturasProductos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoFacturasProductos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoFacturasProductos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoFacturasProductos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoFacturasProductos.add(this.jTextFieldPathArchivoImportacionProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoFacturasProductos = new JButtonMe();
		this.jButtonGenerarImportacionProcesoFacturasProductos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoFacturasProductos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoFacturasProductos.setToolTipText("Generar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoFacturasProductos.add(this.jButtonGenerarImportacionProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoFacturasProductos = new JButtonMe();
		this.jButtonCerrarImportacionProcesoFacturasProductos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoFacturasProductos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoFacturasProductos.setToolTipText("Cancelar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoFacturasProductos.add(this.jButtonCerrarImportacionProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoFacturasProductos = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoFacturasProductos= new JScrollPane(jPanelImportacionProcesoFacturasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoFacturasProductos.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoFacturasProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoFacturasProductos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoFacturasProductos);
		this.jInternalFrameImportacionProcesoFacturasProductos.getContentPane().add(this.jScrollPanelImportacionProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoFacturasProductos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoFacturasProductos = new JButtonMe();
			this.jButtonAbrirOrderByProcesoFacturasProductos.setText("Orden");
			this.jButtonAbrirOrderByProcesoFacturasProductos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoFacturasProductos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoFacturasProductos";
			inputMap = this.jButtonAbrirOrderByProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoFacturasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoFacturasProductos"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoFacturasProductos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoFacturasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoFacturasProductos.setName("jPanelOrderByProcesoFacturasProductos"); 
			
			this.jPanelOrderByProcesoFacturasProductos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoFacturasProductos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoFacturasProductos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoFacturasProductos.setLayout(gridaBagLayoutOrderByProcesoFacturasProductos);
			
			
			this.jTableDatosProcesoFacturasProductosOrderBy = new JTableMe();        
			this.jTableDatosProcesoFacturasProductosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoFacturasProductosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoFacturasProductosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoFacturasProductosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoFacturasProductosOrderBy.setViewportView(this.jTableDatosProcesoFacturasProductosOrderBy);
			this.jTableDatosProcesoFacturasProductosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoFacturasProductosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoFacturasProductos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoFacturasProductos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoFacturasProductos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoFacturasProductos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoFacturasProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoFacturasProductos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoFacturasProductos.setTitle("Orden");
			this.jInternalFrameOrderByProcesoFacturasProductos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoFacturasProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoFacturasProductos.setResizable(true);
			this.jInternalFrameOrderByProcesoFacturasProductos.setClosable(true);
			this.jInternalFrameOrderByProcesoFacturasProductos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoFacturasProductos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoFacturasProductos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoFacturasProductos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Facturas Productoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoFacturasProductos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoFacturasProductos.ipady =150;
				
			this.jPanelOrderByProcesoFacturasProductos.add(jScrollPanelDatosProcesoFacturasProductosOrderBy, this.gridBagConstraintsProcesoFacturasProductos);//this.jTableDatosProcesoFacturasProductosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoFacturasProductos = new JButtonMe();
			this.jButtonCerrarOrderByProcesoFacturasProductos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoFacturasProductos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoFacturasProductos.setToolTipText("Cancelar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoFacturasProductos.add(this.jButtonCerrarOrderByProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoFacturasProductos = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoFacturasProductos= new JScrollPane(jPanelOrderByProcesoFacturasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoFacturasProductos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoFacturasProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoFacturasProductos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoFacturasProductos);
			
			this.jInternalFrameOrderByProcesoFacturasProductos.getContentPane().add(this.jScrollPanelOrderByProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);			
		
		} else {
			this.jButtonAbrirOrderByProcesoFacturasProductos = new JButtonMe();
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
		int iWidthTableCalculado=0;//3130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesofacturasproductosSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoFacturasProductos.getRowHeight();//ProcesoFacturasProductosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoFacturasProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoFacturasProductos.isSelected()) {
					iHeightTable=ProcesoFacturasProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoFacturasProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoFacturasProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoFacturasProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoFacturasProductos.isSelected()) {
					iHeightTable=ProcesoFacturasProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoFacturasProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoFacturasProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoFacturasProductos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoFacturasProductos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoFacturasProductos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoFacturasProductos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoFacturasProductos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoFacturasProductos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoFacturasProductos!=null && this.jInternalFrameOrderByProcesoFacturasProductos.getjTableDatosOrderBy()!=null) {
			//if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoFacturasProductos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoFacturasProductos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoFacturasProductos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoFacturasProductos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoFacturasProductos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoFacturasProductos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoFacturasProductos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoFacturasProductos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoFacturasProductos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoFacturasProductos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesofacturasproductosLogic.getProcesoFacturasProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesofacturasproductoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoFacturasProductos> TraerProcesoFacturasProductosBeans(List<ProcesoFacturasProductos> procesofacturasproductoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductoss) {
					
				if(!(ProcesoFacturasProductosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoFacturasProductosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesofacturasproductos.setsDetalleGeneralEntityReporte(ProcesoFacturasProductosConstantesFunciones.getProcesoFacturasProductosDescripcion(procesofacturasproductos));
										
						
					
						
					
				} else  {
							
					//procesofacturasproductos.setsDetalleGeneralEntityReporte(procesofacturasproductos.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesofacturasproductosbeans.add(procesofacturasproductosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesofacturasproductoss;
    }
	//PARA REPORTES FIN
}
