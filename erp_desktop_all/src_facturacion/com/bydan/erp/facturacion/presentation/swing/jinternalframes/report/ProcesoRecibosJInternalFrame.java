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
import com.bydan.erp.facturacion.util.report.ProcesoRecibosConstantesFunciones;

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
public class ProcesoRecibosJInternalFrame extends ProcesoRecibosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoRecibos;
	
	protected JMenuBar jmenuBarProcesoRecibos;
	
	protected JMenu jmenuProcesoRecibos;
	protected JMenu jmenuDatosProcesoRecibos;
	protected JMenu jmenuArchivoProcesoRecibos;
	protected JMenu jmenuAccionesProcesoRecibos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoRecibos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoRecibos;	
	protected GridBagConstraints gridBagConstraintsProcesoRecibos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoRecibosDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoRecibos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoRecibos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoRecibos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";
	
	public ProcesoRecibosSessionBean procesorecibosSessionBean;
		
	
	
	public ProvinciaSessionBean provinciaSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoRecibos> procesoreciboss;		
	public List<ProcesoRecibos> procesorecibossEliminados;	
	public List<ProcesoRecibos> procesorecibossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoRecibos;		
	protected JButton jButtonAbrirOrderByProcesoRecibos;
	
	
	//protected JPanel jPanelOrderByProcesoRecibos;
	//public JScrollPane jScrollPanelOrderByProcesoRecibos;	
	//protected JButton jButtonCerrarOrderByProcesoRecibos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoRecibosLogic procesorecibosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoRecibos;
	public JScrollPane jScrollPanelDatosEdicionProcesoRecibos;
	public JScrollPane jScrollPanelDatosGeneralProcesoRecibos;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoRecibosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoRecibos;
	//public JScrollPane jScrollPanelImportacionProcesoRecibos;
	
	
	
	protected JPanel jPanelAccionesProcesoRecibos;
	
    protected JPanel jPanelPaginacionProcesoRecibos;
    protected JPanel jPanelParametrosReportesProcesoRecibos;
	protected JPanel jPanelParametrosReportesAccionesProcesoRecibos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoRecibos;
	protected JPanel jPanelParametrosAuxiliar2ProcesoRecibos;
	protected JPanel jPanelParametrosAuxiliar3ProcesoRecibos;
	protected JPanel jPanelParametrosAuxiliar4ProcesoRecibos;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoRecibos;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoRecibos;
	//protected JPanel jPanelImportacionProcesoRecibos;
	
	
	public JTable jTableDatosProcesoRecibos;
	
	
	
	//public JTable jTableDatosProcesoRecibosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoRecibos;
	protected JButton jButtonDuplicarProcesoRecibos;
	protected JButton jButtonCopiarProcesoRecibos;
	protected JButton jButtonVerFormProcesoRecibos;
	protected JButton jButtonNuevoRelacionesProcesoRecibos;
	protected JButton jButtonModificarProcesoRecibos;
	
    protected JButton jButtonGuardarCambiosTablaProcesoRecibos;
	protected JButton jButtonCerrarProcesoRecibos;
	
	
	protected JButton jButtonRecargarInformacionProcesoRecibos;
	protected JButton jButtonProcesarInformacionProcesoRecibos;
	
	
	protected JButton jButtonAnterioresProcesoRecibos;
	protected JButton jButtonSiguientesProcesoRecibos;
	protected JButton jButtonNuevoGuardarCambiosProcesoRecibos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoRecibos;
	//protected JButton jButtonCerrarReporteDinamicoProcesoRecibos;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoRecibos;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoRecibos;
	//protected JButton jButtonGenerarImportacionProcesoRecibos;
	//protected JButton jButtonCerrarImportacionProcesoRecibos;
	//protected JFileChooser jFileChooserImportacionProcesoRecibos;
	//protected File fileImportacionProcesoRecibos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoRecibos;
	protected JButton jButtonDuplicarToolBarProcesoRecibos;
	protected JButton jButtonNuevoRelacionesToolBarProcesoRecibos;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoRecibos;
	protected JButton jButtonCopiarToolBarProcesoRecibos;
	protected JButton jButtonVerFormToolBarProcesoRecibos;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoRecibos;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoRecibos;
	protected JButton jButtonCerrarToolBarProcesoRecibos;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoRecibos;
	protected JButton jButtonProcesarInformacionToolBarProcesoRecibos;
	protected JButton jButtonAnterioresToolBarProcesoRecibos;
	protected JButton jButtonSiguientesToolBarProcesoRecibos;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoRecibos;
	protected JButton jButtonAbrirOrderByToolBarProcesoRecibos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoRecibos;
	protected JMenuItem jMenuItemDuplicarProcesoRecibos;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoRecibos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoRecibos;
	protected JMenuItem jMenuItemCopiarProcesoRecibos;
	protected JMenuItem jMenuItemVerFormProcesoRecibos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoRecibos;
	protected JMenuItem jMenuItemCerrarProcesoRecibos;
	protected JMenuItem jMenuItemDetalleCerrarProcesoRecibos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoRecibos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoRecibos;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoRecibos;
	protected JMenuItem jMenuItemProcesarInformacionProcesoRecibos;
	protected JMenuItem jMenuItemAnterioresProcesoRecibos;
	protected JMenuItem jMenuItemSiguientesProcesoRecibos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoRecibos;
	protected JMenuItem jMenuItemAbrirOrderByProcesoRecibos;
	protected JMenuItem jMenuItemMostrarOcultarProcesoRecibos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoRecibos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoRecibos;
	protected JCheckBox jCheckBoxSeleccionadosProcesoRecibos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoRecibos;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoRecibos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoRecibos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoRecibos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoRecibos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoRecibos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoRecibos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoRecibos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoRecibos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoRecibos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoRecibos;
	protected JTextField jTextFieldValorCampoGeneralProcesoRecibos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoRecibos;
	//public JList<Reporte> jListColumnasSelectReporteProcesoRecibos;
	//public JScrollPane jScrollColumnasSelectReporteProcesoRecibos;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoRecibos;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoRecibos;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoRecibos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoRecibos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoRecibos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoRecibos;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoRecibos;
	
		
	//public JLabel jLabelArchivoImportacionProcesoRecibos;	
	//public JLabel jLabelPathArchivoImportacionProcesoRecibos;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoRecibos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoRecibos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoRecibos;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoRecibos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoRecibos;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoRecibos;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoRecibos;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoRecibos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoRecibos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoRecibos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoRecibos;
	public JPanel jPanelBusquedaProcesoRecibosProcesoRecibos;
	public JButton jButtonBusquedaProcesoRecibosProcesoRecibos;
	
	public JPanel jPanelid_provinciaBusquedaProcesoRecibosProcesoRecibos;
	public JLabel jLabelid_provinciaBusquedaProcesoRecibosProcesoRecibos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos;
	public JButton jButtonid_provinciaBusquedaProcesoRecibosProcesoRecibos= new JButtonMe();
	public JButton jButtonid_provinciaBusquedaProcesoRecibosProcesoRecibosUpdate= new JButtonMe();
	public JButton jButtonid_provinciaBusquedaProcesoRecibosProcesoRecibosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ciudadBusquedaProcesoRecibosProcesoRecibos;
	public JLabel jLabelid_ciudadBusquedaProcesoRecibosProcesoRecibos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos;
	public JButton jButtonid_ciudadBusquedaProcesoRecibosProcesoRecibos= new JButtonMe();
	public JButton jButtonid_ciudadBusquedaProcesoRecibosProcesoRecibosUpdate= new JButtonMe();
	public JButton jButtonid_ciudadBusquedaProcesoRecibosProcesoRecibosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_zonaBusquedaProcesoRecibosProcesoRecibos;
	public JLabel jLabelid_zonaBusquedaProcesoRecibosProcesoRecibos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos;
	public JButton jButtonid_zonaBusquedaProcesoRecibosProcesoRecibos= new JButtonMe();
	public JButton jButtonid_zonaBusquedaProcesoRecibosProcesoRecibosUpdate= new JButtonMe();
	public JButton jButtonid_zonaBusquedaProcesoRecibosProcesoRecibosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos;
	public JLabel jLabelid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos;
	public JButton jButtonid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaProcesoRecibosProcesoRecibosUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaProcesoRecibosProcesoRecibosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorBusquedaProcesoRecibosProcesoRecibos;
	public JLabel jLabelid_vendedorBusquedaProcesoRecibosProcesoRecibos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos;
	public JButton jButtonid_vendedorBusquedaProcesoRecibosProcesoRecibos= new JButtonMe();
	public JButton jButtonid_vendedorBusquedaProcesoRecibosProcesoRecibosUpdate= new JButtonMe();
	public JButton jButtonid_vendedorBusquedaProcesoRecibosProcesoRecibosBusqueda= new JButtonMe();

	
	
	
	
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
	public ProcesoRecibosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoRecibos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoRecibosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoRecibos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoRecibosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoRecibos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoRecibosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoRecibos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoRecibos)	{
		this.jButtonRecargarInformacionProcesoRecibos = jButtonRecargarInformacionProcesoRecibos;
	}
	
	public JButton getjButtonProcesarInformacionProcesoRecibos() {
		return this.jButtonProcesarInformacionProcesoRecibos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoRecibos)	{
		this.jButtonProcesarInformacionProcesoRecibos = jButtonProcesarInformacionProcesoRecibos;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoRecibos() {
		return this.jButtonRecargarInformacionProcesoRecibos;
	}
	
	
	public List<ProcesoRecibos> getprocesoreciboss() {
		return this.procesoreciboss;
	}

	public void setprocesoreciboss(List<ProcesoRecibos> procesoreciboss) {
		this.procesoreciboss = procesoreciboss;
	}
	
	public List<ProcesoRecibos> getprocesorecibossAux() {
		return this.procesorecibossAux;
	}

	public void setprocesorecibossAux(List<ProcesoRecibos> procesorecibossAux) {
		this.procesorecibossAux = procesorecibossAux;
	}
	
	public List<ProcesoRecibos> getprocesorecibossEliminados() {
		return this.procesorecibossEliminados;
	}

	public void setProcesoRecibossEliminados(List<ProcesoRecibos> procesorecibossEliminados) {
		this.procesorecibossEliminados = procesorecibossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoRecibos() {
		return jComboBoxTiposSeleccionarProcesoRecibos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoRecibos(
			JComboBox jComboBoxTiposSeleccionarProcesoRecibos) {
		this.jComboBoxTiposSeleccionarProcesoRecibos = jComboBoxTiposSeleccionarProcesoRecibos;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoRecibos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoRecibos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoRecibos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoRecibos() {
		return jTextFieldValorCampoGeneralProcesoRecibos;
	}

	public void setjTextFieldValorCampoGeneralProcesoRecibos(
			JTextField jTextFieldValorCampoGeneralProcesoRecibos) {
		this.jTextFieldValorCampoGeneralProcesoRecibos = jTextFieldValorCampoGeneralProcesoRecibos;
	}

	public void setBorderResaltarValorCampoGeneralProcesoRecibos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecibos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoRecibos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoRecibos() {
		return this.jCheckBoxSeleccionarTodosProcesoRecibos;
	}

	public void setjCheckBoxSeleccionarTodosProcesoRecibos(
			JCheckBox jCheckBoxSeleccionarTodosProcesoRecibos) {
		this.jCheckBoxSeleccionarTodosProcesoRecibos = jCheckBoxSeleccionarTodosProcesoRecibos;
	}

	public void setBorderResaltarSeleccionarTodosProcesoRecibos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecibos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoRecibos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoRecibos() {
		return this.jCheckBoxSeleccionadosProcesoRecibos;
	}

	public void setjCheckBoxSeleccionadosProcesoRecibos(
			JCheckBox jCheckBoxSeleccionadosProcesoRecibos) {
		this.jCheckBoxSeleccionadosProcesoRecibos = jCheckBoxSeleccionadosProcesoRecibos;
	}
	
	public void setBorderResaltarSeleccionadosProcesoRecibos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecibos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoRecibos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoRecibos() {
		return this.jComboBoxTiposArchivosReportesProcesoRecibos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoRecibos(
			JComboBox jComboBoxTiposArchivosReportesProcesoRecibos) {
		this.jComboBoxTiposArchivosReportesProcesoRecibos = jComboBoxTiposArchivosReportesProcesoRecibos;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoRecibos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecibos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoRecibos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoRecibos() {
		return this.jComboBoxTiposReportesProcesoRecibos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoRecibos(
			JComboBox jComboBoxTiposReportesProcesoRecibos) {
		this.jComboBoxTiposReportesProcesoRecibos = jComboBoxTiposReportesProcesoRecibos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoRecibos() {
	//	return jComboBoxTiposReportesDinamicoProcesoRecibos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoRecibos(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoRecibos) {
	//	this.jComboBoxTiposReportesDinamicoProcesoRecibos = jComboBoxTiposReportesDinamicoProcesoRecibos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoRecibos() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoRecibos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoRecibos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoRecibos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoRecibos = jComboBoxTiposArchivosReportesDinamicoProcesoRecibos;
	//}
	
	public void setBorderResaltarTiposReportesProcesoRecibos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecibos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoRecibos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoRecibos() {
		return this.jComboBoxTiposGraficosReportesProcesoRecibos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoRecibos(
			JComboBox jComboBoxTiposGraficosReportesProcesoRecibos) {
		this.jComboBoxTiposGraficosReportesProcesoRecibos = jComboBoxTiposGraficosReportesProcesoRecibos;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoRecibos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecibos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoRecibos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoRecibos() {
		return this.jComboBoxTiposPaginacionProcesoRecibos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoRecibos(
			JComboBox jComboBoxTiposPaginacionProcesoRecibos) {
		this.jComboBoxTiposPaginacionProcesoRecibos = jComboBoxTiposPaginacionProcesoRecibos;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoRecibos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecibos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoRecibos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoRecibos() {
		return this.jComboBoxTiposRelacionesProcesoRecibos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoRecibos() {
		return this.jComboBoxTiposAccionesProcesoRecibos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoRecibos(
			JComboBox jComboBoxTiposRelacionesProcesoRecibos) {
		this.jComboBoxTiposRelacionesProcesoRecibos = jComboBoxTiposRelacionesProcesoRecibos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoRecibos(
			JComboBox jComboBoxTiposAccionesProcesoRecibos) {
		this.jComboBoxTiposAccionesProcesoRecibos = jComboBoxTiposAccionesProcesoRecibos;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoRecibos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecibos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoRecibos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoRecibos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecibos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoRecibos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoRecibos() {
	//	return jCheckBoxConGraficoDinamicoProcesoRecibos;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoRecibos(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoRecibos) {
	//	this.jCheckBoxConGraficoDinamicoProcesoRecibos = jCheckBoxConGraficoDinamicoProcesoRecibos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoRecibos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoRecibos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoRecibos .setBorder(borderResaltar);		
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
		this.procesorecibosSessionBean=new ProcesoRecibosSessionBean();
		
		this.procesorecibosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesorecibosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesorecibosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoRecibosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoRecibosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoRecibosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoRecibosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoRecibosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Recibos MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoRecibosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoRecibos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoRecibos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoRecibos,this.jTtoolBarProcesoRecibos,
							"nuevo","nuevo","Nuevo"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoRecibos,this.jTtoolBarProcesoRecibos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoRecibos,this.jTtoolBarProcesoRecibos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoRecibos,this.jTtoolBarProcesoRecibos,
							"duplicar","duplicar","Duplicar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoRecibos,this.jTtoolBarProcesoRecibos,
							"copiar","copiar","Copiar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoRecibos,this.jTtoolBarProcesoRecibos,
							"ver_form","ver_form","Ver"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoRecibos,this.jTtoolBarProcesoRecibos,
							"recargar","recargar","Buscar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoRecibos,this.jTtoolBarProcesoRecibos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoRecibos,this.jTtoolBarProcesoRecibos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoRecibos,this.jTtoolBarProcesoRecibos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoRecibos,this.jTtoolBarProcesoRecibos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoRecibos,this.jTtoolBarProcesoRecibos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoRecibos,this.jTtoolBarProcesoRecibos,
							"cerrar","cerrar","Salir"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoRecibos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoRecibos;
			
				this.jButtonProcesarInformacionToolBarProcesoRecibos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoRecibos;
				
		//protected JButton jButtonModificarToolBarProcesoRecibos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoRecibos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoRecibos=new JMenuMe("General");
		this.jmenuArchivoProcesoRecibos=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoRecibos=new JMenuMe("Acciones");
		this.jmenuDatosProcesoRecibos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoRecibos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoRecibos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoRecibos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoRecibos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoRecibos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoRecibos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoRecibos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoRecibos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoRecibos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoRecibos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoRecibos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoRecibos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoRecibos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoRecibos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoRecibos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoRecibos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoRecibos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoRecibos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoRecibos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoRecibos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoRecibos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoRecibos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoRecibos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoRecibos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoRecibos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoRecibos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoRecibos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoRecibos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoRecibos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoRecibos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoRecibos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoRecibos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoRecibos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoRecibos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoRecibos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoRecibos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoRecibos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoRecibos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoRecibos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoRecibos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoRecibos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoRecibos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoRecibos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoRecibos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoRecibos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoRecibos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoRecibos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoRecibos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoRecibos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoRecibos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoRecibos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoRecibos.add(this.jMenuItemCerrarProcesoRecibos);
			
			this.jmenuAccionesProcesoRecibos.add(this.jMenuItemNuevoProcesoRecibos);
			this.jmenuAccionesProcesoRecibos.add(this.jMenuItemNuevoGuardarCambiosProcesoRecibos);
			this.jmenuAccionesProcesoRecibos.add(this.jMenuItemNuevoRelacionesProcesoRecibos);
			this.jmenuAccionesProcesoRecibos.add(this.jMenuItemGuardarCambiosTablaProcesoRecibos);		
			this.jmenuAccionesProcesoRecibos.add(this.jMenuItemDuplicarProcesoRecibos);		
			this.jmenuAccionesProcesoRecibos.add(this.jMenuItemCopiarProcesoRecibos);		
			this.jmenuAccionesProcesoRecibos.add(this.jMenuItemVerFormProcesoRecibos);		
			
			this.jmenuDatosProcesoRecibos.add(this.jMenuItemRecargarInformacionProcesoRecibos);				
			this.jmenuDatosProcesoRecibos.add(this.jMenuItemAnterioresProcesoRecibos);				
			this.jmenuDatosProcesoRecibos.add(this.jMenuItemSiguientesProcesoRecibos);				
			this.jmenuDatosProcesoRecibos.add(this.jMenuItemAbrirOrderByProcesoRecibos);				
			this.jmenuDatosProcesoRecibos.add(this.jMenuItemMostrarOcultarProcesoRecibos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoRecibos.add(this.jMenuItemGuardarCambiosProcesoRecibos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoRecibos.add(this.jmenuArchivoProcesoRecibos);		
			this.jmenuBarProcesoRecibos.add(this.jmenuAccionesProcesoRecibos);		
			this.jmenuBarProcesoRecibos.add(this.jmenuDatosProcesoRecibos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoRecibos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoRecibos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoRecibosProcesoRecibos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoRecibosProcesoRecibos.setToolTipText("Buscar Por Provincia Por Ciudad Por Zona Por Grupo Cliente Por Vendedor ");
		this.jButtonBusquedaProcesoRecibosProcesoRecibos= new JButtonMe();
		this.jButtonBusquedaProcesoRecibosProcesoRecibos.setText("Buscar");
		this.jButtonBusquedaProcesoRecibosProcesoRecibos.setToolTipText("Buscar Por Provincia Por Ciudad Por Zona Por Grupo Cliente Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoRecibosProcesoRecibos,"buscar_button","Buscar Por Provincia Por Ciudad Por Zona Por Grupo Cliente Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoRecibosProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_provinciaBusquedaProcesoRecibosProcesoRecibos = new JLabelMe();
		jLabelid_provinciaBusquedaProcesoRecibosProcesoRecibos.setText("Provincia :");
		jLabelid_provinciaBusquedaProcesoRecibosProcesoRecibos.setToolTipText("Provincia");
		jLabelid_provinciaBusquedaProcesoRecibosProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaBusquedaProcesoRecibosProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaBusquedaProcesoRecibosProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaBusquedaProcesoRecibosProcesoRecibos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos= new JComboBoxMe();
		jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_ciudadBusquedaProcesoRecibosProcesoRecibos = new JLabelMe();
		jLabelid_ciudadBusquedaProcesoRecibosProcesoRecibos.setText("Ciudad :");
		jLabelid_ciudadBusquedaProcesoRecibosProcesoRecibos.setToolTipText("Ciudad");
		jLabelid_ciudadBusquedaProcesoRecibosProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadBusquedaProcesoRecibosProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadBusquedaProcesoRecibosProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadBusquedaProcesoRecibosProcesoRecibos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos= new JComboBoxMe();
		jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_zonaBusquedaProcesoRecibosProcesoRecibos = new JLabelMe();
		jLabelid_zonaBusquedaProcesoRecibosProcesoRecibos.setText("Zona :");
		jLabelid_zonaBusquedaProcesoRecibosProcesoRecibos.setToolTipText("Zona");
		jLabelid_zonaBusquedaProcesoRecibosProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaBusquedaProcesoRecibosProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaBusquedaProcesoRecibosProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_zonaBusquedaProcesoRecibosProcesoRecibos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos= new JComboBoxMe();
		jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos = new JLabelMe();
		jLabelid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.setText("Grupo Cliente :");
		jLabelid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.setToolTipText("Grupo Cliente");
		jLabelid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos= new JComboBoxMe();
		jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_vendedorBusquedaProcesoRecibosProcesoRecibos = new JLabelMe();
		jLabelid_vendedorBusquedaProcesoRecibosProcesoRecibos.setText("Vendedor :");
		jLabelid_vendedorBusquedaProcesoRecibosProcesoRecibos.setToolTipText("Vendedor");
		jLabelid_vendedorBusquedaProcesoRecibosProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorBusquedaProcesoRecibosProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorBusquedaProcesoRecibosProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorBusquedaProcesoRecibosProcesoRecibos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos= new JComboBoxMe();
		jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoRecibos=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoRecibos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasProcesoRecibos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasProcesoRecibos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));

		//this.jTabbedPaneBusquedasProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesoRecibos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoRecibos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoRecibos = new ProcesoRecibosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Recibos DATOS");
			this.jInternalFrameDetalleFormProcesoRecibos = new ProcesoRecibosDetalleFormJInternalFrame(jDesktopPane,this.procesorecibosSessionBean.getConGuardarRelaciones(),this.procesorecibosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoRecibos = null;//new ProcesoRecibosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoRecibos= new GridBagLayout();
		
		
		this.jTableDatosProcesoRecibos = new JTableMe();      
		
		String sToolTipProcesoRecibos="";
		sToolTipProcesoRecibos=ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoRecibos+="(Facturacion.ProcesoRecibos)";
		}
		
		if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoRecibos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoRecibos.setToolTipText(sToolTipProcesoRecibos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoRecibos);
		this.jTableDatosProcesoRecibos.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoRecibos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoRecibos.setRowSelectionAllowed(true);
		this.jTableDatosProcesoRecibos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoRecibos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoRecibos = new JButtonMe();
		this.jButtonDuplicarProcesoRecibos = new JButtonMe();
		this.jButtonCopiarProcesoRecibos = new JButtonMe();
		this.jButtonVerFormProcesoRecibos = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoRecibos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoRecibos = new JButtonMe();
		this.jButtonCerrarProcesoRecibos = new JButtonMe();
		
		this.jScrollPanelDatosProcesoRecibos = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoRecibos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoRecibos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Recibos";
		
		if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Reciboses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoRecibos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoRecibos.setToolTipText("Acciones");
        this.jPanelAccionesProcesoRecibos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoRecibos=new ReporteDinamicoJInternalFrame(ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoRecibos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoRecibos=new ImportacionJInternalFrame(ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoRecibos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoRecibos = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoRecibos.setText("Orden");
		this.jButtonAbrirOrderByProcesoRecibos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoRecibos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoRecibos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoRecibos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoRecibos,false,this);
			
			//this.cargarOrderByProcesoRecibos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoRecibos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoRecibos,true,this);
			
			//this.cargarOrderByProcesoRecibos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoRecibos.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosProcesoRecibos.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosProcesoRecibos.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosProcesoRecibos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoRecibos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoRecibos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoRecibos.setText("Nuevo");
		this.jButtonDuplicarProcesoRecibos.setText("Duplicar");
		this.jButtonCopiarProcesoRecibos.setText("Copiar");
		this.jButtonVerFormProcesoRecibos.setText("Ver");
		this.jButtonNuevoRelacionesProcesoRecibos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoRecibos.setText("Guardar");
		this.jButtonCerrarProcesoRecibos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoRecibos,"nuevo_button","Nuevo",this.procesorecibosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoRecibos,"duplicar_button","Duplicar",this.procesorecibosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoRecibos,"copiar_button","Copiar",this.procesorecibosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoRecibos,"ver_form","Ver",this.procesorecibosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoRecibos,"nuevorelaciones_button","Nuevo Rel",this.procesorecibosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoRecibos,"guardarcambiostabla_button","Guardar",this.procesorecibosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoRecibos,"cerrar_button","Salir",this.procesorecibosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoRecibos.setToolTipText("Nuevo"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoRecibos.setToolTipText("Duplicar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoRecibos.setToolTipText("Copiar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoRecibos.setToolTipText("Ver"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoRecibos.setToolTipText("Nuevo Rel"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoRecibos.setToolTipText("Guardar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoRecibos.setToolTipText("Salir"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoRecibos";
		inputMap = this.jButtonNuevoProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoRecibos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoRecibos"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoRecibos";
		inputMap = this.jButtonDuplicarProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoRecibos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoRecibos"));
		
		//COPIAR
		sMapKey = "CopiarProcesoRecibos";
		inputMap = this.jButtonCopiarProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoRecibos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoRecibos"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoRecibos";
		inputMap = this.jButtonVerFormProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoRecibos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoRecibos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoRecibos";
		inputMap = this.jButtonNuevoRelacionesProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoRecibos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoRecibos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoRecibos";
		inputMap = this.jButtonModificarProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoRecibos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoRecibos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoRecibos";
		inputMap = this.jButtonCerrarProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoRecibos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoRecibos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoRecibos";
		inputMap = this.jButtonGuardarCambiosTablaProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoRecibos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoRecibos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoRecibos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoRecibos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoRecibos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoRecibos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoRecibos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoRecibos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoRecibos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoRecibos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoRecibos.setName("jPanelParametrosReportesProcesoRecibos"); 
		
		this.jPanelParametrosReportesAccionesProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoRecibos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoRecibos.setName("jPanelParametrosReportesAccionesProcesoRecibos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoRecibos = new JButtonMe();
		this.jButtonRecargarInformacionProcesoRecibos.setText("Buscar");
		this.jButtonRecargarInformacionProcesoRecibos.setToolTipText("Buscar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoRecibos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProcesoRecibos.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoRecibos = new JButtonMe();
		this.jButtonProcesarInformacionProcesoRecibos.setText("Procesar");
		this.jButtonProcesarInformacionProcesoRecibos.setToolTipText("Procesar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoRecibos.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoRecibos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoRecibos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoRecibos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoRecibos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoRecibos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoRecibos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoRecibos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoRecibos.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoRecibos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoRecibos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoRecibos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoRecibos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoRecibos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoRecibos.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoRecibos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoRecibos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoRecibos.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoRecibos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoRecibos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoRecibos.setText("Accion");
		this.jComboBoxTiposAccionesProcesoRecibos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoRecibos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoRecibos.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoRecibos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoRecibos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoRecibos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoRecibos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoRecibos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoRecibos = new JLabelMe();
		
		this.jLabelAccionesProcesoRecibos.setText("Acciones");		
		this.jLabelAccionesProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoRecibos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoRecibos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoRecibos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoRecibos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoRecibos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoRecibos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoRecibos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoRecibos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoRecibos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoRecibos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoRecibos.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoRecibos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoRecibos = new JButtonMe();
		//this.jButtonAnterioresProcesoRecibos.setText("<<");
        this.jButtonAnterioresProcesoRecibos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoRecibos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoRecibos = new JButtonMe();
		//this.jButtonSiguientesProcesoRecibos.setText(">>");
        this.jButtonSiguientesProcesoRecibos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoRecibos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoRecibos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoRecibos.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoRecibos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoRecibos,"nuevoguardarcambios_button","Nue",this.procesorecibosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoRecibos";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoRecibos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoRecibos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoRecibos";
		inputMap = this.jButtonRecargarInformacionProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoRecibos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoRecibos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoRecibos";
		inputMap = this.jButtonSiguientesProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoRecibos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoRecibos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoRecibos";
		inputMap = this.jButtonAnterioresProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoRecibos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoRecibos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoRecibos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoRecibos.setMinimumSize(new Dimension(this.getWidth(),ProcesoRecibosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoRecibosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoRecibos.setMaximumSize(new Dimension(this.getWidth(),ProcesoRecibosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoRecibosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoRecibos.setPreferredSize(new Dimension(this.getWidth(),ProcesoRecibosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoRecibosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoRecibos = new GridBagLayout();

			this.jPanelPaginacionProcesoRecibos.setLayout(gridaBagLayoutPaginacionProcesoRecibos);						
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.gridy = 0;
			this.gridBagConstraintsProcesoRecibos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoRecibos.add(this.jButtonAnterioresProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
					
						
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoRecibos.gridy = 0;
			
			this.jPanelPaginacionProcesoRecibos.add(this.jButtonNuevoGuardarCambiosProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
						
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoRecibos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoRecibos.gridy = 0;
			this.jPanelPaginacionProcesoRecibos.add(this.jButtonSiguientesProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.gridy = 1;
			this.gridBagConstraintsProcesoRecibos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoRecibos.add(this.jButtonNuevoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
						
			
			
			if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
				this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoRecibos.gridy = 1;
				this.gridBagConstraintsProcesoRecibos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoRecibos.add(this.jButtonGuardarCambiosTablaProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
			}
			
			
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.gridy = 1;
			this.gridBagConstraintsProcesoRecibos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoRecibos.add(this.jButtonDuplicarProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.gridy = 1;
			this.gridBagConstraintsProcesoRecibos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoRecibos.add(this.jButtonCopiarProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.gridy = 1;
			this.gridBagConstraintsProcesoRecibos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoRecibos.add(this.jButtonVerFormProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.gridy = 1;
			this.gridBagConstraintsProcesoRecibos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoRecibos.add(this.jButtonCerrarProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		
		
		
		this.jButtonRecargarInformacionProcesoRecibos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoRecibos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoRecibos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoRecibos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoRecibos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoRecibos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoRecibos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoRecibos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoRecibos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoRecibos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoRecibos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoRecibos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoRecibos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoRecibos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoRecibos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoRecibos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoRecibos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoRecibos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoRecibos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoRecibos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoRecibos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoRecibos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoRecibos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoRecibos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoRecibos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoRecibos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoRecibos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoRecibos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoRecibos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoRecibos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoRecibos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoRecibos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoRecibos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoRecibos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoRecibos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoRecibos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoRecibos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoRecibos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoRecibos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoRecibos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoRecibos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoRecibos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoRecibos.setLayout(gridaBagParametrosReportesProcesoRecibos);
			this.jPanelParametrosReportesAccionesProcesoRecibos.setLayout(gridaBagParametrosReportesAccionesProcesoRecibos);
			
			
			this.jPanelParametrosAuxiliar1ProcesoRecibos.setLayout(gridaBagParametrosAuxiliar1ProcesoRecibos);
			this.jPanelParametrosAuxiliar2ProcesoRecibos.setLayout(gridaBagParametrosAuxiliar2ProcesoRecibos);
			this.jPanelParametrosAuxiliar3ProcesoRecibos.setLayout(gridaBagParametrosAuxiliar3ProcesoRecibos);
			this.jPanelParametrosAuxiliar4ProcesoRecibos.setLayout(gridaBagParametrosAuxiliar4ProcesoRecibos);
			//this.jPanelParametrosAuxiliar5ProcesoRecibos.setLayout(gridaBagParametrosAuxiliar2ProcesoRecibos);			
			
			
			
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoRecibos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoRecibos.add(this.jButtonRecargarInformacionProcesoRecibos, this.gridBagConstraintsProcesoRecibos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecibos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoRecibos.add(this.jComboBoxTiposPaginacionProcesoRecibos, this.gridBagConstraintsProcesoRecibos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecibos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoRecibos.add(this.jCheckBoxConAltoMaximoTablaProcesoRecibos, this.gridBagConstraintsProcesoRecibos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecibos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoRecibos.add(this.jComboBoxTiposArchivosReportesProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecibos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoRecibos.add(this.jPanelParametrosAuxiliar1ProcesoRecibos, this.gridBagConstraintsProcesoRecibos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoRecibos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoRecibos.add(this.jComboBoxTiposReportesProcesoRecibos, this.gridBagConstraintsProcesoRecibos);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecibos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoRecibos.add(this.jPanelParametrosAuxiliar4ProcesoRecibos, this.gridBagConstraintsProcesoRecibos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecibos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoRecibos.add(this.jComboBoxTiposReportesProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecibos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoRecibos.add(this.jCheckBoxGenerarReporteProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecibos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoRecibos.add(this.jPanelParametrosAuxiliar2ProcesoRecibos, this.gridBagConstraintsProcesoRecibos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoRecibos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoRecibos.add(this.jLabelAccionesProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
				this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProcesoRecibos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProcesoRecibos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProcesoRecibos.add(this.jButtonAbrirOrderByProcesoRecibos, this.gridBagConstraintsProcesoRecibos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecibos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoRecibos.add(this.jComboBoxTiposSeleccionarProcesoRecibos, this.gridBagConstraintsProcesoRecibos);			
			
			
			/*
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoRecibos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoRecibos.add(this.jCheckBoxSeleccionarTodosProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoRecibos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoRecibos.add(this.jCheckBoxSeleccionarTodosProcesoRecibos, this.gridBagConstraintsProcesoRecibos);															
				
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoRecibos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoRecibos.add(this.jCheckBoxSeleccionadosProcesoRecibos, this.gridBagConstraintsProcesoRecibos);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecibos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoRecibos.add(this.jPanelParametrosAuxiliar3ProcesoRecibos, this.gridBagConstraintsProcesoRecibos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecibos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoRecibos.add(this.jComboBoxTiposAccionesProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoRecibos = new GridBagLayout();

			this.jScrollPanelDatosProcesoRecibos.setLayout(gridaBagLayoutDatosProcesoRecibos);
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.gridy = 0;
			this.gridBagConstraintsProcesoRecibos.gridx = 0;
			
			this.jScrollPanelDatosProcesoRecibos.add(this.jTableDatosProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoRecibos.setViewportView(this.jTableDatosProcesoRecibos);
		this.jTableDatosProcesoRecibos.setFillsViewportHeight(true);
		this.jTableDatosProcesoRecibos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoRecibos= new GridBagLayout();
		this.jPanelAccionesProcesoRecibos.setLayout(gridaBagLayoutAccionesProcesoRecibos);
		
		
		/*	
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 0;
			
		this.jPanelAccionesProcesoRecibos.add(this.jButtonNuevoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoRecibosProcesoRecibos= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoRecibosProcesoRecibos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoRecibosProcesoRecibos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoRecibosProcesoRecibos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoRecibosProcesoRecibos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoRecibosProcesoRecibos.setLayout(gridaBagLayoutBusquedaProcesoRecibosProcesoRecibos);

		gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecibos.gridy = 0;
		gridBagConstraintsProcesoRecibos.gridx = 0;
		jPanelBusquedaProcesoRecibosProcesoRecibos.add(jLabelid_provinciaBusquedaProcesoRecibosProcesoRecibos, gridBagConstraintsProcesoRecibos);

		gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecibos.gridy = 0;
		gridBagConstraintsProcesoRecibos.gridx = 1;
		jPanelBusquedaProcesoRecibosProcesoRecibos.add(jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos, gridBagConstraintsProcesoRecibos);


		gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecibos.gridy = 1;
		gridBagConstraintsProcesoRecibos.gridx = 0;
		jPanelBusquedaProcesoRecibosProcesoRecibos.add(jLabelid_ciudadBusquedaProcesoRecibosProcesoRecibos, gridBagConstraintsProcesoRecibos);

		gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecibos.gridy = 1;
		gridBagConstraintsProcesoRecibos.gridx = 1;
		jPanelBusquedaProcesoRecibosProcesoRecibos.add(jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos, gridBagConstraintsProcesoRecibos);


		gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecibos.gridy = 2;
		gridBagConstraintsProcesoRecibos.gridx = 0;
		jPanelBusquedaProcesoRecibosProcesoRecibos.add(jLabelid_zonaBusquedaProcesoRecibosProcesoRecibos, gridBagConstraintsProcesoRecibos);

		gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecibos.gridy = 2;
		gridBagConstraintsProcesoRecibos.gridx = 1;
		jPanelBusquedaProcesoRecibosProcesoRecibos.add(jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos, gridBagConstraintsProcesoRecibos);


		gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecibos.gridy = 3;
		gridBagConstraintsProcesoRecibos.gridx = 0;
		jPanelBusquedaProcesoRecibosProcesoRecibos.add(jLabelid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos, gridBagConstraintsProcesoRecibos);

		gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecibos.gridy = 3;
		gridBagConstraintsProcesoRecibos.gridx = 1;
		jPanelBusquedaProcesoRecibosProcesoRecibos.add(jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos, gridBagConstraintsProcesoRecibos);


		gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecibos.gridy = 4;
		gridBagConstraintsProcesoRecibos.gridx = 0;
		jPanelBusquedaProcesoRecibosProcesoRecibos.add(jLabelid_vendedorBusquedaProcesoRecibosProcesoRecibos, gridBagConstraintsProcesoRecibos);

		gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecibos.gridy = 4;
		gridBagConstraintsProcesoRecibos.gridx = 1;
		jPanelBusquedaProcesoRecibosProcesoRecibos.add(jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos, gridBagConstraintsProcesoRecibos);

		gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecibos.gridy = 5;
		gridBagConstraintsProcesoRecibos.gridx =1;
		jPanelBusquedaProcesoRecibosProcesoRecibos.add(jButtonBusquedaProcesoRecibosProcesoRecibos, gridBagConstraintsProcesoRecibos);

		jTabbedPaneBusquedasProcesoRecibos.addTab("1.-Por Provincia Por Ciudad Por Zona Por Grupo Cliente Por Vendedor ", jPanelBusquedaProcesoRecibosProcesoRecibos);
		jTabbedPaneBusquedasProcesoRecibos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoRecibos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoRecibos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesorecibosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();						
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoRecibos.gridx = 0;		
			//this.gridBagConstraintsProcesoRecibos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoRecibos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoRecibos, this.gridBagConstraintsProcesoRecibos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoRecibos.gridx = 0;		
		//this.gridBagConstraintsProcesoRecibos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoRecibos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoRecibos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoRecibos.gridx = 0;		
			this.gridBagConstraintsProcesoRecibos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoRecibos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoRecibos, this.gridBagConstraintsProcesoRecibos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecibos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoRecibos, this.gridBagConstraintsProcesoRecibos);								
		
		
		/*
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecibos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		*/		
		
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoRecibos.gridx =0;
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoRecibos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
				
		
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecibos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoRecibosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoRecibos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoRecibos = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoRecibos.setLayout(gridaBagLayoutBusquedasParametrosProcesoRecibos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoRecibos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoRecibos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoRecibos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoRecibos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecibos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
			
			
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecibos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		
			
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecibos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProcesoRecibos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoRecibos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoRecibos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoRecibos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoRecibos.setName("jPanelReporteDinamicoProcesoRecibos"); 
		
		this.jPanelReporteDinamicoProcesoRecibos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoRecibos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoRecibos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoRecibos.setLayout(gridaBagLayoutReporteDinamicoProcesoRecibos);
		
		
		this.jInternalFrameReporteDinamicoProcesoRecibos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoRecibos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoRecibos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoRecibos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoRecibos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoRecibos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoRecibos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoRecibos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoRecibos.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoRecibos.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoRecibos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoRecibos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoRecibos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoRecibos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Reciboses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoRecibos = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoRecibos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoRecibos.add(this.jLabelColumnasSelectReporteProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoRecibos = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoRecibos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoRecibos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoRecibos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoRecibos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoRecibos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoRecibos=new JScrollPane(this.jListColumnasSelectReporteProcesoRecibos);
			
			this.jScrollColumnasSelectReporteProcesoRecibos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoRecibos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoRecibos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoRecibos.add(this.jListColumnasSelectReporteProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		this.jPanelReporteDinamicoProcesoRecibos.add(this.jScrollColumnasSelectReporteProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoRecibos = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoRecibos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoRecibos = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoRecibos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoRecibos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoRecibos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoRecibos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoRecibos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoRecibos=new JScrollPane(this.jListRelacionesSelectReporteProcesoRecibos);
			
			this.jScrollRelacionesSelectReporteProcesoRecibos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoRecibos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoRecibos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoRecibos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoRecibos = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoRecibos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoRecibos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoRecibos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoRecibos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoRecibos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoRecibos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoRecibos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoRecibos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoRecibos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoRecibos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoRecibos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoRecibos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoRecibos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoRecibos.add(this.jLabelGenerarExcelReporteDinamicoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoRecibos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoRecibos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoRecibos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoRecibos.setToolTipText("Generar EXCEL"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoRecibos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoRecibos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoRecibos.add(this.jButtonGenerarExcelReporteDinamicoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecibos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoRecibos.add(this.jComboBoxTiposReportesDinamicoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoRecibos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoRecibos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoRecibos.add(this.jLabelTiposArchivoReporteDinamicoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecibos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoRecibos.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoRecibos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoRecibos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoRecibos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoRecibos.setToolTipText("Generar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecibos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoRecibos.add(this.jButtonGenerarReporteDinamicoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoRecibos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoRecibos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoRecibos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoRecibos.setToolTipText("Cancelar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecibos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoRecibos.add(this.jButtonCerrarReporteDinamicoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoRecibos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoRecibos= new JScrollPane(jPanelReporteDinamicoProcesoRecibos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoRecibos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoRecibos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoRecibos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Reciboses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoRecibos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoRecibos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoRecibos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoRecibos);
		this.jInternalFrameReporteDinamicoProcesoRecibos.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoRecibos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoRecibos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoRecibos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoRecibos.setName("jPanelImportacionProcesoRecibos"); 
		
		this.jPanelImportacionProcesoRecibos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoRecibos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoRecibos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoRecibos.setLayout(gridaBagLayoutImportacionProcesoRecibos);
		
		
		this.jInternalFrameImportacionProcesoRecibos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoRecibos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoRecibos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoRecibos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoRecibos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoRecibos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoRecibos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoRecibos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoRecibos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoRecibos.setResizable(true);
	    this.jInternalFrameImportacionProcesoRecibos.setClosable(true);
	    this.jInternalFrameImportacionProcesoRecibos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoRecibos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoRecibos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoRecibos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoRecibos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoRecibos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoRecibos.setResizable(true);
	    this.jInternalFrameImportacionProcesoRecibos.setClosable(true);
	    this.jInternalFrameImportacionProcesoRecibos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoRecibos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoRecibos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoRecibos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Reciboses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoRecibos = new JLabelMe();

		this.jLabelArchivoImportacionProcesoRecibos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoRecibos.add(this.jLabelArchivoImportacionProcesoRecibos, this.gridBagConstraintsProcesoRecibos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoRecibos = new JFileChooser();		
		this.jFileChooserImportacionProcesoRecibos.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoRecibos = new JButtonMe();
		this.jButtonAbrirImportacionProcesoRecibos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoRecibos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoRecibos.setToolTipText("Generar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecibos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoRecibos.add(this.jButtonAbrirImportacionProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoRecibos = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoRecibos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoRecibos.add(this.jLabelPathArchivoImportacionProcesoRecibos, this.gridBagConstraintsProcesoRecibos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoRecibos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoRecibos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoRecibos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoRecibos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecibos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoRecibos.add(this.jTextFieldPathArchivoImportacionProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoRecibos = new JButtonMe();
		this.jButtonGenerarImportacionProcesoRecibos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoRecibos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoRecibos.setToolTipText("Generar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecibos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoRecibos.add(this.jButtonGenerarImportacionProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoRecibos = new JButtonMe();
		this.jButtonCerrarImportacionProcesoRecibos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoRecibos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoRecibos.setToolTipText("Cancelar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecibos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoRecibos.add(this.jButtonCerrarImportacionProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoRecibos = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoRecibos= new JScrollPane(jPanelImportacionProcesoRecibos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoRecibos.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoRecibos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoRecibos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoRecibos);
		this.jInternalFrameImportacionProcesoRecibos.getContentPane().add(this.jScrollPanelImportacionProcesoRecibos, this.gridBagConstraintsProcesoRecibos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoRecibos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoRecibos = new JButtonMe();
			this.jButtonAbrirOrderByProcesoRecibos.setText("Orden");
			this.jButtonAbrirOrderByProcesoRecibos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoRecibos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoRecibos";
			inputMap = this.jButtonAbrirOrderByProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoRecibos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoRecibos"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoRecibos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoRecibos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoRecibos.setName("jPanelOrderByProcesoRecibos"); 
			
			this.jPanelOrderByProcesoRecibos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoRecibos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoRecibos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoRecibos.setLayout(gridaBagLayoutOrderByProcesoRecibos);
			
			
			this.jTableDatosProcesoRecibosOrderBy = new JTableMe();        
			this.jTableDatosProcesoRecibosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoRecibosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoRecibosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoRecibosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoRecibosOrderBy.setViewportView(this.jTableDatosProcesoRecibosOrderBy);
			this.jTableDatosProcesoRecibosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoRecibosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoRecibos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoRecibos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoRecibos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoRecibos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoRecibos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoRecibos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoRecibos.setTitle("Orden");
			this.jInternalFrameOrderByProcesoRecibos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoRecibos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoRecibos.setResizable(true);
			this.jInternalFrameOrderByProcesoRecibos.setClosable(true);
			this.jInternalFrameOrderByProcesoRecibos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoRecibos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoRecibos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoRecibos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Reciboses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoRecibos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoRecibos.ipady =150;
				
			this.jPanelOrderByProcesoRecibos.add(jScrollPanelDatosProcesoRecibosOrderBy, this.gridBagConstraintsProcesoRecibos);//this.jTableDatosProcesoRecibosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoRecibos = new JButtonMe();
			this.jButtonCerrarOrderByProcesoRecibos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoRecibos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoRecibos.setToolTipText("Cancelar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoRecibos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoRecibos.add(this.jButtonCerrarOrderByProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoRecibos = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoRecibos= new JScrollPane(jPanelOrderByProcesoRecibos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoRecibos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoRecibos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoRecibos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoRecibos);
			
			this.jInternalFrameOrderByProcesoRecibos.getContentPane().add(this.jScrollPanelOrderByProcesoRecibos, this.gridBagConstraintsProcesoRecibos);			
		
		} else {
			this.jButtonAbrirOrderByProcesoRecibos = new JButtonMe();
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
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesorecibosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoRecibos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoRecibos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoRecibos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoRecibos.getRowHeight();//ProcesoRecibosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoRecibosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoRecibos.isSelected()) {
					iHeightTable=ProcesoRecibosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoRecibosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoRecibosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoRecibosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoRecibos.isSelected()) {
					iHeightTable=ProcesoRecibosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoRecibosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoRecibosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoRecibos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoRecibos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoRecibos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoRecibos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoRecibos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoRecibos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoRecibos!=null && this.jInternalFrameOrderByProcesoRecibos.getjTableDatosOrderBy()!=null) {
			//if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoRecibos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoRecibos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoRecibos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoRecibos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoRecibos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoRecibos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoRecibos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoRecibos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoRecibos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoRecibos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesorecibosLogic.getProcesoReciboss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoreciboss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoRecibos> TraerProcesoRecibosBeans(List<ProcesoRecibos> procesoreciboss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoRecibos procesorecibos:procesoreciboss) {
					
				if(!(ProcesoRecibosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoRecibosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesorecibos.setsDetalleGeneralEntityReporte(ProcesoRecibosConstantesFunciones.getProcesoRecibosDescripcion(procesorecibos));
										
						
					
						
					
				} else  {
							
					//procesorecibos.setsDetalleGeneralEntityReporte(procesorecibos.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesorecibosbeans.add(procesorecibosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesoreciboss;
    }
	//PARA REPORTES FIN
}
