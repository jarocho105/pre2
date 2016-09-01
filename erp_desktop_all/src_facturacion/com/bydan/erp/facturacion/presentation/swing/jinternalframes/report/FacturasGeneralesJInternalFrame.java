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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.facturacion.util.report.FacturasGeneralesConstantesFunciones;

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
public class FacturasGeneralesJInternalFrame extends FacturasGeneralesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFacturasGenerales;
	
	protected JMenuBar jmenuBarFacturasGenerales;
	
	protected JMenu jmenuFacturasGenerales;
	protected JMenu jmenuDatosFacturasGenerales;
	protected JMenu jmenuArchivoFacturasGenerales;
	protected JMenu jmenuAccionesFacturasGenerales;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFacturasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturasGenerales;	
	protected GridBagConstraints gridBagConstraintsFacturasGenerales;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FacturasGeneralesDetalleFormJInternalFrame jInternalFrameDetalleFormFacturasGenerales;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFacturasGenerales;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFacturasGenerales;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoFacturaBeanSwingJInternalFrame tipofacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofactura="";
	
	public FacturasGeneralesSessionBean facturasgeneralesSessionBean;
		
	
	
	public ZonaSessionBean zonaSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoFacturaSessionBean tipofacturaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FacturasGenerales> facturasgeneraless;		
	public List<FacturasGenerales> facturasgeneralessEliminados;	
	public List<FacturasGenerales> facturasgeneralessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFacturasGenerales;		
	protected JButton jButtonAbrirOrderByFacturasGenerales;
	
	
	//protected JPanel jPanelOrderByFacturasGenerales;
	//public JScrollPane jScrollPanelOrderByFacturasGenerales;	
	//protected JButton jButtonCerrarOrderByFacturasGenerales;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FacturasGeneralesLogic facturasgeneralesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFacturasGenerales;
	public JScrollPane jScrollPanelDatosEdicionFacturasGenerales;
	public JScrollPane jScrollPanelDatosGeneralFacturasGenerales;
    
	
	
	//public JScrollPane jScrollPanelDatosFacturasGeneralesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFacturasGenerales;
	//public JScrollPane jScrollPanelImportacionFacturasGenerales;
	
	
	
	protected JPanel jPanelAccionesFacturasGenerales;
	
    protected JPanel jPanelPaginacionFacturasGenerales;
    protected JPanel jPanelParametrosReportesFacturasGenerales;
	protected JPanel jPanelParametrosReportesAccionesFacturasGenerales;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FacturasGenerales;
	protected JPanel jPanelParametrosAuxiliar2FacturasGenerales;
	protected JPanel jPanelParametrosAuxiliar3FacturasGenerales;
	protected JPanel jPanelParametrosAuxiliar4FacturasGenerales;
	//protected JPanel jPanelParametrosAuxiliar5FacturasGenerales;
	
	
	
	//protected JPanel jPanelReporteDinamicoFacturasGenerales;
	//protected JPanel jPanelImportacionFacturasGenerales;
	
	
	public JTable jTableDatosFacturasGenerales;
	
	
	
	//public JTable jTableDatosFacturasGeneralesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFacturasGenerales;
	protected JButton jButtonDuplicarFacturasGenerales;
	protected JButton jButtonCopiarFacturasGenerales;
	protected JButton jButtonVerFormFacturasGenerales;
	protected JButton jButtonNuevoRelacionesFacturasGenerales;
	protected JButton jButtonModificarFacturasGenerales;
	
    protected JButton jButtonGuardarCambiosTablaFacturasGenerales;
	protected JButton jButtonCerrarFacturasGenerales;
	
	
	protected JButton jButtonRecargarInformacionFacturasGenerales;
	protected JButton jButtonProcesarInformacionFacturasGenerales;
	
	
	protected JButton jButtonAnterioresFacturasGenerales;
	protected JButton jButtonSiguientesFacturasGenerales;
	protected JButton jButtonNuevoGuardarCambiosFacturasGenerales;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFacturasGenerales;
	//protected JButton jButtonCerrarReporteDinamicoFacturasGenerales;
	//protected JButton jButtonGenerarExcelReporteDinamicoFacturasGenerales;	
	
	
	
	//protected JButton jButtonAbrirImportacionFacturasGenerales;
	//protected JButton jButtonGenerarImportacionFacturasGenerales;
	//protected JButton jButtonCerrarImportacionFacturasGenerales;
	//protected JFileChooser jFileChooserImportacionFacturasGenerales;
	//protected File fileImportacionFacturasGenerales;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturasGenerales;
	protected JButton jButtonDuplicarToolBarFacturasGenerales;
	protected JButton jButtonNuevoRelacionesToolBarFacturasGenerales;
	
	
	public JButton jButtonGuardarCambiosToolBarFacturasGenerales;
	protected JButton jButtonCopiarToolBarFacturasGenerales;
	protected JButton jButtonVerFormToolBarFacturasGenerales;
	public JButton jButtonGuardarCambiosTablaToolBarFacturasGenerales;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturasGenerales;
	protected JButton jButtonCerrarToolBarFacturasGenerales;
	
	protected JButton jButtonRecargarInformacionToolBarFacturasGenerales;
	protected JButton jButtonProcesarInformacionToolBarFacturasGenerales;
	protected JButton jButtonAnterioresToolBarFacturasGenerales;
	protected JButton jButtonSiguientesToolBarFacturasGenerales;
	protected JButton jButtonNuevoGuardarCambiosToolBarFacturasGenerales;
	protected JButton jButtonAbrirOrderByToolBarFacturasGenerales;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturasGenerales;
	protected JMenuItem jMenuItemDuplicarFacturasGenerales;
	protected JMenuItem jMenuItemNuevoRelacionesFacturasGenerales;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFacturasGenerales;
	protected JMenuItem jMenuItemCopiarFacturasGenerales;
	protected JMenuItem jMenuItemVerFormFacturasGenerales;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturasGenerales;
	protected JMenuItem jMenuItemCerrarFacturasGenerales;
	protected JMenuItem jMenuItemDetalleCerrarFacturasGenerales;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFacturasGenerales;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturasGenerales;
	
	protected JMenuItem jMenuItemRecargarInformacionFacturasGenerales;
	protected JMenuItem jMenuItemProcesarInformacionFacturasGenerales;
	protected JMenuItem jMenuItemAnterioresFacturasGenerales;
	protected JMenuItem jMenuItemSiguientesFacturasGenerales;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturasGenerales;
	protected JMenuItem jMenuItemAbrirOrderByFacturasGenerales;
	protected JMenuItem jMenuItemMostrarOcultarFacturasGenerales;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturasGenerales;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFacturasGenerales;
	protected JCheckBox jCheckBoxSeleccionadosFacturasGenerales;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFacturasGenerales;
	protected JCheckBox jCheckBoxConGraficoReporteFacturasGenerales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFacturasGenerales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFacturasGenerales;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFacturasGenerales;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFacturasGenerales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFacturasGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFacturasGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturasGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturasGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFacturasGenerales;
	protected JTextField jTextFieldValorCampoGeneralFacturasGenerales;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFacturasGenerales;
	//public JList<Reporte> jListColumnasSelectReporteFacturasGenerales;
	//public JScrollPane jScrollColumnasSelectReporteFacturasGenerales;
	
	//public JLabel jLabelRelacionesSelectReporteFacturasGenerales;
	//public JList<Reporte> jListRelacionesSelectReporteFacturasGenerales;
	//public JScrollPane jScrollRelacionesSelectReporteFacturasGenerales;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFacturasGenerales;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFacturasGenerales;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFacturasGenerales;
	//public JLabel jLabelTiposArchivoReporteDinamicoFacturasGenerales;
	
		
	//public JLabel jLabelArchivoImportacionFacturasGenerales;	
	//public JLabel jLabelPathArchivoImportacionFacturasGenerales;
	//protected JTextField jTextFieldPathArchivoImportacionFacturasGenerales;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFacturasGenerales;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFacturasGenerales;
	
	//public JLabel jLabelColumnaCategoriaValorFacturasGenerales;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFacturasGenerales;
	
	//public JLabel jLabelColumnasValoresGraficoFacturasGenerales;
	//public JList<Reporte> jListColumnasValoresGraficoFacturasGenerales;
	//public JScrollPane jScrollColumnasValoresGraficoFacturasGenerales;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFacturasGenerales;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFacturasGenerales;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFacturasGenerales;
	public JPanel jPanelBusquedaFacturasGeneralesFacturasGenerales;
	public JButton jButtonBusquedaFacturasGeneralesFacturasGenerales;
	
	public JPanel jPanelid_zonaBusquedaFacturasGeneralesFacturasGenerales;
	public JLabel jLabelid_zonaBusquedaFacturasGeneralesFacturasGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales;
	public JButton jButtonid_zonaBusquedaFacturasGeneralesFacturasGenerales= new JButtonMe();
	public JButton jButtonid_zonaBusquedaFacturasGeneralesFacturasGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_zonaBusquedaFacturasGeneralesFacturasGeneralesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales;
	public JLabel jLabelid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales;
	public JTextField jTextFieldid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales;
	public JButton jButtonid_tipo_clienteBusquedaFacturasGeneralesFacturasGeneralesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales;
	public JLabel jLabelid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales;
	public JButton jButtonid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales= new JButtonMe();
	public JButton jButtonid_tipo_facturaBusquedaFacturasGeneralesFacturasGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_tipo_facturaBusquedaFacturasGeneralesFacturasGeneralesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales;
	public JLabel jLabelfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales;
	public JButton jButtonfecha_emision_desdeBusquedaFacturasGeneralesFacturasGeneralesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales;
	public JLabel jLabelfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales;
	public JButton jButtonfecha_emision_hastaBusquedaFacturasGeneralesFacturasGeneralesBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FacturasGeneralesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FacturasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasGeneralesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasGeneralesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasGeneralesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFacturasGenerales)	{
		this.jButtonRecargarInformacionFacturasGenerales = jButtonRecargarInformacionFacturasGenerales;
	}
	
	public JButton getjButtonProcesarInformacionFacturasGenerales() {
		return this.jButtonProcesarInformacionFacturasGenerales;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturasGenerales)	{
		this.jButtonProcesarInformacionFacturasGenerales = jButtonProcesarInformacionFacturasGenerales;
	}
	
	
	public JButton getjButtonRecargarInformacionFacturasGenerales() {
		return this.jButtonRecargarInformacionFacturasGenerales;
	}
	
	
	public List<FacturasGenerales> getfacturasgeneraless() {
		return this.facturasgeneraless;
	}

	public void setfacturasgeneraless(List<FacturasGenerales> facturasgeneraless) {
		this.facturasgeneraless = facturasgeneraless;
	}
	
	public List<FacturasGenerales> getfacturasgeneralessAux() {
		return this.facturasgeneralessAux;
	}

	public void setfacturasgeneralessAux(List<FacturasGenerales> facturasgeneralessAux) {
		this.facturasgeneralessAux = facturasgeneralessAux;
	}
	
	public List<FacturasGenerales> getfacturasgeneralessEliminados() {
		return this.facturasgeneralessEliminados;
	}

	public void setFacturasGeneralessEliminados(List<FacturasGenerales> facturasgeneralessEliminados) {
		this.facturasgeneralessEliminados = facturasgeneralessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFacturasGenerales() {
		return jComboBoxTiposSeleccionarFacturasGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFacturasGenerales(
			JComboBox jComboBoxTiposSeleccionarFacturasGenerales) {
		this.jComboBoxTiposSeleccionarFacturasGenerales = jComboBoxTiposSeleccionarFacturasGenerales;
	}
	
	public void setBorderResaltarTiposSeleccionarFacturasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFacturasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFacturasGenerales .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFacturasGenerales() {
		return jTextFieldValorCampoGeneralFacturasGenerales;
	}

	public void setjTextFieldValorCampoGeneralFacturasGenerales(
			JTextField jTextFieldValorCampoGeneralFacturasGenerales) {
		this.jTextFieldValorCampoGeneralFacturasGenerales = jTextFieldValorCampoGeneralFacturasGenerales;
	}

	public void setBorderResaltarValorCampoGeneralFacturasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasGenerales.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFacturasGenerales .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFacturasGenerales() {
		return this.jCheckBoxSeleccionarTodosFacturasGenerales;
	}

	public void setjCheckBoxSeleccionarTodosFacturasGenerales(
			JCheckBox jCheckBoxSeleccionarTodosFacturasGenerales) {
		this.jCheckBoxSeleccionarTodosFacturasGenerales = jCheckBoxSeleccionarTodosFacturasGenerales;
	}

	public void setBorderResaltarSeleccionarTodosFacturasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasGenerales.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFacturasGenerales .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFacturasGenerales() {
		return this.jCheckBoxSeleccionadosFacturasGenerales;
	}

	public void setjCheckBoxSeleccionadosFacturasGenerales(
			JCheckBox jCheckBoxSeleccionadosFacturasGenerales) {
		this.jCheckBoxSeleccionadosFacturasGenerales = jCheckBoxSeleccionadosFacturasGenerales;
	}
	
	public void setBorderResaltarSeleccionadosFacturasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasGenerales.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFacturasGenerales .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFacturasGenerales() {
		return this.jComboBoxTiposArchivosReportesFacturasGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFacturasGenerales(
			JComboBox jComboBoxTiposArchivosReportesFacturasGenerales) {
		this.jComboBoxTiposArchivosReportesFacturasGenerales = jComboBoxTiposArchivosReportesFacturasGenerales;
	}

	public void setBorderResaltarTiposArchivosReportesFacturasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFacturasGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFacturasGenerales() {
		return this.jComboBoxTiposReportesFacturasGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFacturasGenerales(
			JComboBox jComboBoxTiposReportesFacturasGenerales) {
		this.jComboBoxTiposReportesFacturasGenerales = jComboBoxTiposReportesFacturasGenerales;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFacturasGenerales() {
	//	return jComboBoxTiposReportesDinamicoFacturasGenerales;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFacturasGenerales(
	//		JComboBox jComboBoxTiposReportesDinamicoFacturasGenerales) {
	//	this.jComboBoxTiposReportesDinamicoFacturasGenerales = jComboBoxTiposReportesDinamicoFacturasGenerales;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFacturasGenerales() {
	//	return jComboBoxTiposArchivosReportesDinamicoFacturasGenerales;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFacturasGenerales(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFacturasGenerales) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFacturasGenerales = jComboBoxTiposArchivosReportesDinamicoFacturasGenerales;
	//}
	
	public void setBorderResaltarTiposReportesFacturasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFacturasGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFacturasGenerales() {
		return this.jComboBoxTiposGraficosReportesFacturasGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFacturasGenerales(
			JComboBox jComboBoxTiposGraficosReportesFacturasGenerales) {
		this.jComboBoxTiposGraficosReportesFacturasGenerales = jComboBoxTiposGraficosReportesFacturasGenerales;
	}
	
	public void setBorderResaltarTiposGraficosReportesFacturasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFacturasGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFacturasGenerales() {
		return this.jComboBoxTiposPaginacionFacturasGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFacturasGenerales(
			JComboBox jComboBoxTiposPaginacionFacturasGenerales) {
		this.jComboBoxTiposPaginacionFacturasGenerales = jComboBoxTiposPaginacionFacturasGenerales;
	}
	
	public void setBorderResaltarTiposPaginacionFacturasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFacturasGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFacturasGenerales() {
		return this.jComboBoxTiposRelacionesFacturasGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturasGenerales() {
		return this.jComboBoxTiposAccionesFacturasGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturasGenerales(
			JComboBox jComboBoxTiposRelacionesFacturasGenerales) {
		this.jComboBoxTiposRelacionesFacturasGenerales = jComboBoxTiposRelacionesFacturasGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturasGenerales(
			JComboBox jComboBoxTiposAccionesFacturasGenerales) {
		this.jComboBoxTiposAccionesFacturasGenerales = jComboBoxTiposAccionesFacturasGenerales;
	}
	
	public void setBorderResaltarTiposRelacionesFacturasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFacturasGenerales .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFacturasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFacturasGenerales .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFacturasGenerales() {
	//	return jCheckBoxConGraficoDinamicoFacturasGenerales;
	//}

	//public void setjCheckBoxConGraficoDinamicoFacturasGenerales(
	//		JCheckBox jCheckBoxConGraficoDinamicoFacturasGenerales) {
	//	this.jCheckBoxConGraficoDinamicoFacturasGenerales = jCheckBoxConGraficoDinamicoFacturasGenerales;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFacturasGenerales() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFacturasGenerales.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFacturasGenerales .setBorder(borderResaltar);		
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
		this.facturasgeneralesSessionBean=new FacturasGeneralesSessionBean();
		
		this.facturasgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturasgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturasgeneralesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FacturasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FacturasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturasGeneralesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Facturas Generales MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
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
		
		FacturasGeneralesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FacturasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFacturasGenerales= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFacturasGenerales,this.jTtoolBarFacturasGenerales,
							"nuevo","nuevo","Nuevo"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFacturasGenerales,this.jTtoolBarFacturasGenerales,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFacturasGenerales,this.jTtoolBarFacturasGenerales,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFacturasGenerales,this.jTtoolBarFacturasGenerales,
							"duplicar","duplicar","Duplicar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFacturasGenerales,this.jTtoolBarFacturasGenerales,
							"copiar","copiar","Copiar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFacturasGenerales,this.jTtoolBarFacturasGenerales,
							"ver_form","ver_form","Ver"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturasGenerales,this.jTtoolBarFacturasGenerales,
							"recargar","recargar","Buscar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturasGenerales,this.jTtoolBarFacturasGenerales,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturasGenerales,this.jTtoolBarFacturasGenerales,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFacturasGenerales,this.jTtoolBarFacturasGenerales,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFacturasGenerales,this.jTtoolBarFacturasGenerales,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFacturasGenerales,this.jTtoolBarFacturasGenerales,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFacturasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFacturasGenerales,this.jTtoolBarFacturasGenerales,
							"cerrar","cerrar","Salir"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFacturasGenerales=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFacturasGenerales;
			
				this.jButtonProcesarInformacionToolBarFacturasGenerales=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFacturasGenerales;
				
		//protected JButton jButtonModificarToolBarFacturasGenerales;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFacturasGenerales=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFacturasGenerales=new JMenuMe("General");
		this.jmenuArchivoFacturasGenerales=new JMenuMe("Archivo");
		this.jmenuAccionesFacturasGenerales=new JMenuMe("Acciones");
		this.jmenuDatosFacturasGenerales=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturasGenerales= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturasGenerales.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturasGenerales,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFacturasGenerales= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFacturasGenerales.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFacturasGenerales,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFacturasGenerales= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFacturasGenerales.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFacturasGenerales,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFacturasGenerales= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturasGenerales.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturasGenerales,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFacturasGenerales= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFacturasGenerales.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFacturasGenerales,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFacturasGenerales= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFacturasGenerales.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFacturasGenerales,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFacturasGenerales= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFacturasGenerales.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFacturasGenerales,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturasGenerales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturasGenerales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturasGenerales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFacturasGenerales= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFacturasGenerales.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFacturasGenerales,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFacturasGenerales= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFacturasGenerales.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFacturasGenerales,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFacturasGenerales= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFacturasGenerales.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFacturasGenerales,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFacturasGenerales= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFacturasGenerales.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFacturasGenerales,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFacturasGenerales= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFacturasGenerales.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFacturasGenerales,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturasGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturasGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturasGenerales,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFacturasGenerales= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFacturasGenerales.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFacturasGenerales,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturasGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturasGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturasGenerales,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFacturasGenerales= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFacturasGenerales.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFacturasGenerales,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFacturasGenerales.add(this.jMenuItemCerrarFacturasGenerales);
			
			this.jmenuAccionesFacturasGenerales.add(this.jMenuItemNuevoFacturasGenerales);
			this.jmenuAccionesFacturasGenerales.add(this.jMenuItemNuevoGuardarCambiosFacturasGenerales);
			this.jmenuAccionesFacturasGenerales.add(this.jMenuItemNuevoRelacionesFacturasGenerales);
			this.jmenuAccionesFacturasGenerales.add(this.jMenuItemGuardarCambiosTablaFacturasGenerales);		
			this.jmenuAccionesFacturasGenerales.add(this.jMenuItemDuplicarFacturasGenerales);		
			this.jmenuAccionesFacturasGenerales.add(this.jMenuItemCopiarFacturasGenerales);		
			this.jmenuAccionesFacturasGenerales.add(this.jMenuItemVerFormFacturasGenerales);		
			
			this.jmenuDatosFacturasGenerales.add(this.jMenuItemRecargarInformacionFacturasGenerales);				
			this.jmenuDatosFacturasGenerales.add(this.jMenuItemAnterioresFacturasGenerales);				
			this.jmenuDatosFacturasGenerales.add(this.jMenuItemSiguientesFacturasGenerales);				
			this.jmenuDatosFacturasGenerales.add(this.jMenuItemAbrirOrderByFacturasGenerales);				
			this.jmenuDatosFacturasGenerales.add(this.jMenuItemMostrarOcultarFacturasGenerales);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFacturasGenerales.add(this.jMenuItemGuardarCambiosFacturasGenerales);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFacturasGenerales.add(this.jmenuArchivoFacturasGenerales);		
			this.jmenuBarFacturasGenerales.add(this.jmenuAccionesFacturasGenerales);		
			this.jmenuBarFacturasGenerales.add(this.jmenuDatosFacturasGenerales);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFacturasGenerales);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFacturasGenerales() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaFacturasGeneralesFacturasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaFacturasGeneralesFacturasGenerales.setToolTipText("Buscar Por Zona Por Tipo Cliente Por Tipo Factura Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaFacturasGeneralesFacturasGenerales= new JButtonMe();
		this.jButtonBusquedaFacturasGeneralesFacturasGenerales.setText("Buscar");
		this.jButtonBusquedaFacturasGeneralesFacturasGenerales.setToolTipText("Buscar Por Zona Por Tipo Cliente Por Tipo Factura Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaFacturasGeneralesFacturasGenerales,"buscar_button","Buscar Por Zona Por Tipo Cliente Por Tipo Factura Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaFacturasGeneralesFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_zonaBusquedaFacturasGeneralesFacturasGenerales = new JLabelMe();
		jLabelid_zonaBusquedaFacturasGeneralesFacturasGenerales.setText("Zona :");
		jLabelid_zonaBusquedaFacturasGeneralesFacturasGenerales.setToolTipText("Zona");
		jLabelid_zonaBusquedaFacturasGeneralesFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaBusquedaFacturasGeneralesFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaBusquedaFacturasGeneralesFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_zonaBusquedaFacturasGeneralesFacturasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales= new JComboBoxMe();
		jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales = new JLabelMe();
		jLabelid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales.setText("Tipo Cliente :");
		jLabelid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales.setToolTipText("Tipo Cliente");
		jLabelid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales= new JTextFieldMe();
		jTextFieldid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

	FuncionesSwing.setBoldTextField(jTextFieldid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);
		jTextFieldid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales.setText("0");



	
		jLabelid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales = new JLabelMe();
		jLabelid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.setText("Tipo Factura :");
		jLabelid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.setToolTipText("Tipo Factura");
		jLabelid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales= new JComboBoxMe();
		jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasFacturasGenerales=new JTabbedPane();


		this.jTabbedPaneBusquedasFacturasGenerales.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasFacturasGenerales.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasFacturasGenerales.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));

		//this.jTabbedPaneBusquedasFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFacturasGenerales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFacturasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFacturasGenerales = new FacturasGeneralesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Facturas Generales DATOS");
			this.jInternalFrameDetalleFormFacturasGenerales = new FacturasGeneralesDetalleFormJInternalFrame(jDesktopPane,this.facturasgeneralesSessionBean.getConGuardarRelaciones(),this.facturasgeneralesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFacturasGenerales = null;//new FacturasGeneralesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturasGenerales= new GridBagLayout();
		
		
		this.jTableDatosFacturasGenerales = new JTableMe();      
		
		String sToolTipFacturasGenerales="";
		sToolTipFacturasGenerales=FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturasGenerales+="(Facturacion.FacturasGenerales)";
		}
		
		if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturasGenerales+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFacturasGenerales.setToolTipText(sToolTipFacturasGenerales);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFacturasGenerales);
		this.jTableDatosFacturasGenerales.setAutoCreateRowSorter(true);
		this.jTableDatosFacturasGenerales.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFacturasGenerales.setRowSelectionAllowed(true);
		this.jTableDatosFacturasGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFacturasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFacturasGenerales = new JButtonMe();
		this.jButtonDuplicarFacturasGenerales = new JButtonMe();
		this.jButtonCopiarFacturasGenerales = new JButtonMe();
		this.jButtonVerFormFacturasGenerales = new JButtonMe();
		this.jButtonNuevoRelacionesFacturasGenerales = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFacturasGenerales = new JButtonMe();
		this.jButtonCerrarFacturasGenerales = new JButtonMe();
		
		this.jScrollPanelDatosFacturasGenerales = new JScrollPane();   
        this.jScrollPanelDatosGeneralFacturasGenerales = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFacturasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Facturas Generales";
		
		if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Generaleses" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturasGenerales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturasGenerales.setToolTipText("Acciones");
        this.jPanelAccionesFacturasGenerales.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFacturasGenerales=new ReporteDinamicoJInternalFrame(FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFacturasGenerales();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFacturasGenerales=new ImportacionJInternalFrame(FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFacturasGenerales();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFacturasGenerales = new JButtonMe();
		
		this.jButtonAbrirOrderByFacturasGenerales.setText("Orden");
		this.jButtonAbrirOrderByFacturasGenerales.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturasGenerales,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFacturasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturasGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturasGenerales,false,this);
			
			//this.cargarOrderByFacturasGenerales(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturasGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturasGenerales,true,this);
			
			//this.cargarOrderByFacturasGenerales(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFacturasGenerales.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosFacturasGenerales.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosFacturasGenerales.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosFacturasGenerales.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturasGenerales.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturasGenerales.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFacturasGenerales.setText("Nuevo");
		this.jButtonDuplicarFacturasGenerales.setText("Duplicar");
		this.jButtonCopiarFacturasGenerales.setText("Copiar");
		this.jButtonVerFormFacturasGenerales.setText("Ver");
		this.jButtonNuevoRelacionesFacturasGenerales.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFacturasGenerales.setText("Guardar");
		this.jButtonCerrarFacturasGenerales.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturasGenerales,"nuevo_button","Nuevo",this.facturasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFacturasGenerales,"duplicar_button","Duplicar",this.facturasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFacturasGenerales,"copiar_button","Copiar",this.facturasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFacturasGenerales,"ver_form","Ver",this.facturasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFacturasGenerales,"nuevorelaciones_button","Nuevo Rel",this.facturasgeneralesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturasGenerales,"guardarcambiostabla_button","Guardar",this.facturasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturasGenerales,"cerrar_button","Salir",this.facturasgeneralesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFacturasGenerales.setToolTipText("Nuevo"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFacturasGenerales.setToolTipText("Duplicar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFacturasGenerales.setToolTipText("Copiar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFacturasGenerales.setToolTipText("Ver"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFacturasGenerales.setToolTipText("Nuevo Rel"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFacturasGenerales.setToolTipText("Guardar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturasGenerales.setToolTipText("Salir"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturasGenerales";
		inputMap = this.jButtonNuevoFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturasGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturasGenerales"));
		
		//DUPLICAR
		sMapKey = "DuplicarFacturasGenerales";
		inputMap = this.jButtonDuplicarFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFacturasGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFacturasGenerales"));
		
		//COPIAR
		sMapKey = "CopiarFacturasGenerales";
		inputMap = this.jButtonCopiarFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFacturasGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFacturasGenerales"));
		
		//VEr FORM
		sMapKey = "VerFormFacturasGenerales";
		inputMap = this.jButtonVerFormFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFacturasGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFacturasGenerales"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFacturasGenerales";
		inputMap = this.jButtonNuevoRelacionesFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFacturasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFacturasGenerales"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFacturasGenerales";
		inputMap = this.jButtonModificarFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFacturasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFacturasGenerales"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFacturasGenerales";
		inputMap = this.jButtonCerrarFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturasGenerales"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturasGenerales";
		inputMap = this.jButtonGuardarCambiosTablaFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturasGenerales"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFacturasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFacturasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFacturasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FacturasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FacturasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FacturasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FacturasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FacturasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFacturasGenerales.setName("jPanelParametrosReportesFacturasGenerales"); 
		
		this.jPanelParametrosReportesAccionesFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFacturasGenerales.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFacturasGenerales.setName("jPanelParametrosReportesAccionesFacturasGenerales"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFacturasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFacturasGenerales = new JButtonMe();
		this.jButtonRecargarInformacionFacturasGenerales.setText("Buscar");
		this.jButtonRecargarInformacionFacturasGenerales.setToolTipText("Buscar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFacturasGenerales,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionFacturasGenerales.setVisible(false);
		
		
		this.jButtonProcesarInformacionFacturasGenerales = new JButtonMe();
		this.jButtonProcesarInformacionFacturasGenerales.setText("Procesar");
		this.jButtonProcesarInformacionFacturasGenerales.setToolTipText("Procesar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFacturasGenerales.setVisible(false);
			
		this.jButtonProcesarInformacionFacturasGenerales.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturasGenerales.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturasGenerales.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFacturasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturasGenerales.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFacturasGenerales.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFacturasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturasGenerales.setText("TIPO");       
		this.jComboBoxTiposReportesFacturasGenerales.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFacturasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturasGenerales.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFacturasGenerales.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFacturasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFacturasGenerales.setText("Paginacion");
		this.jComboBoxTiposPaginacionFacturasGenerales.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFacturasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFacturasGenerales.setText("Accion");
		this.jComboBoxTiposRelacionesFacturasGenerales.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFacturasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturasGenerales.setText("Accion");
		this.jComboBoxTiposAccionesFacturasGenerales.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFacturasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFacturasGenerales.setText("Accion");
		this.jComboBoxTiposSeleccionarFacturasGenerales.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFacturasGenerales=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFacturasGenerales.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturasGenerales.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturasGenerales.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFacturasGenerales = new JLabelMe();
		
		this.jLabelAccionesFacturasGenerales.setText("Acciones");		
		this.jLabelAccionesFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFacturasGenerales = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFacturasGenerales.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFacturasGenerales.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFacturasGenerales = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFacturasGenerales.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFacturasGenerales.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFacturasGenerales = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFacturasGenerales.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFacturasGenerales.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFacturasGenerales = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFacturasGenerales.setText("Graf.");
		this.jCheckBoxConGraficoReporteFacturasGenerales.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFacturasGenerales = new JButtonMe();
		//this.jButtonAnterioresFacturasGenerales.setText("<<");
        this.jButtonAnterioresFacturasGenerales.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFacturasGenerales,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFacturasGenerales = new JButtonMe();
		//this.jButtonSiguientesFacturasGenerales.setText(">>");
        this.jButtonSiguientesFacturasGenerales.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFacturasGenerales,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFacturasGenerales = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFacturasGenerales.setText("Nue");
        this.jButtonNuevoGuardarCambiosFacturasGenerales.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFacturasGenerales,"nuevoguardarcambios_button","Nue",this.facturasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFacturasGenerales";
		inputMap = this.jButtonNuevoGuardarCambiosFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFacturasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFacturasGenerales"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFacturasGenerales";
		inputMap = this.jButtonRecargarInformacionFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFacturasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFacturasGenerales"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFacturasGenerales";
		inputMap = this.jButtonSiguientesFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFacturasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFacturasGenerales"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFacturasGenerales";
		inputMap = this.jButtonAnterioresFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFacturasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFacturasGenerales"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFacturasGenerales();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFacturasGenerales.setMinimumSize(new Dimension(this.getWidth(),FacturasGeneralesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturasGeneralesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturasGenerales.setMaximumSize(new Dimension(this.getWidth(),FacturasGeneralesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturasGeneralesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturasGenerales.setPreferredSize(new Dimension(this.getWidth(),FacturasGeneralesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturasGeneralesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFacturasGenerales = new GridBagLayout();

			this.jPanelPaginacionFacturasGenerales.setLayout(gridaBagLayoutPaginacionFacturasGenerales);						
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy = 0;
			this.gridBagConstraintsFacturasGenerales.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFacturasGenerales.add(this.jButtonAnterioresFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
					
						
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturasGenerales.gridy = 0;
			
			this.jPanelPaginacionFacturasGenerales.add(this.jButtonNuevoGuardarCambiosFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
						
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFacturasGenerales.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturasGenerales.gridy = 0;
			this.jPanelPaginacionFacturasGenerales.add(this.jButtonSiguientesFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy = 1;
			this.gridBagConstraintsFacturasGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturasGenerales.add(this.jButtonNuevoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
						
			
			
			if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
				this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFacturasGenerales.gridy = 1;
				this.gridBagConstraintsFacturasGenerales.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFacturasGenerales.add(this.jButtonGuardarCambiosTablaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
			}
			
			
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy = 1;
			this.gridBagConstraintsFacturasGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturasGenerales.add(this.jButtonDuplicarFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy = 1;
			this.gridBagConstraintsFacturasGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturasGenerales.add(this.jButtonCopiarFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy = 1;
			this.gridBagConstraintsFacturasGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturasGenerales.add(this.jButtonVerFormFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy = 1;
			this.gridBagConstraintsFacturasGenerales.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFacturasGenerales.add(this.jButtonCerrarFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
		
		
		this.jButtonRecargarInformacionFacturasGenerales.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturasGenerales.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturasGenerales.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFacturasGenerales.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturasGenerales.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturasGenerales.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFacturasGenerales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturasGenerales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturasGenerales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFacturasGenerales.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturasGenerales.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturasGenerales.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFacturasGenerales.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturasGenerales.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturasGenerales.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFacturasGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturasGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturasGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFacturasGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturasGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturasGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFacturasGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturasGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturasGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFacturasGenerales.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturasGenerales.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturasGenerales.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFacturasGenerales.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturasGenerales.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturasGenerales.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFacturasGenerales.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturasGenerales.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturasGenerales.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFacturasGenerales.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturasGenerales.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturasGenerales.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFacturasGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFacturasGenerales = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FacturasGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FacturasGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FacturasGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FacturasGenerales = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFacturasGenerales.setLayout(gridaBagParametrosReportesFacturasGenerales);
			this.jPanelParametrosReportesAccionesFacturasGenerales.setLayout(gridaBagParametrosReportesAccionesFacturasGenerales);
			
			
			this.jPanelParametrosAuxiliar1FacturasGenerales.setLayout(gridaBagParametrosAuxiliar1FacturasGenerales);
			this.jPanelParametrosAuxiliar2FacturasGenerales.setLayout(gridaBagParametrosAuxiliar2FacturasGenerales);
			this.jPanelParametrosAuxiliar3FacturasGenerales.setLayout(gridaBagParametrosAuxiliar3FacturasGenerales);
			this.jPanelParametrosAuxiliar4FacturasGenerales.setLayout(gridaBagParametrosAuxiliar4FacturasGenerales);
			//this.jPanelParametrosAuxiliar5FacturasGenerales.setLayout(gridaBagParametrosAuxiliar2FacturasGenerales);			
			
			
			
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturasGenerales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturasGenerales.add(this.jButtonRecargarInformacionFacturasGenerales, this.gridBagConstraintsFacturasGenerales);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasGenerales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturasGenerales.add(this.jComboBoxTiposPaginacionFacturasGenerales, this.gridBagConstraintsFacturasGenerales);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasGenerales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturasGenerales.add(this.jCheckBoxConAltoMaximoTablaFacturasGenerales, this.gridBagConstraintsFacturasGenerales);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasGenerales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturasGenerales.add(this.jComboBoxTiposArchivosReportesFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasGenerales.add(this.jPanelParametrosAuxiliar1FacturasGenerales, this.gridBagConstraintsFacturasGenerales);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FacturasGenerales.add(this.jComboBoxTiposReportesFacturasGenerales, this.gridBagConstraintsFacturasGenerales);																		
			
			
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FacturasGenerales.add(this.jComboBoxTiposGraficosReportesFacturasGenerales, this.gridBagConstraintsFacturasGenerales);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasGenerales.add(this.jPanelParametrosAuxiliar4FacturasGenerales, this.gridBagConstraintsFacturasGenerales);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasGenerales.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasGenerales.add(this.jComboBoxTiposReportesFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasGenerales.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturasGenerales.add(this.jCheckBoxGenerarReporteFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasGenerales.add(this.jPanelParametrosAuxiliar2FacturasGenerales, this.gridBagConstraintsFacturasGenerales);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturasGenerales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturasGenerales.add(this.jLabelAccionesFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
				this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFacturasGenerales.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFacturasGenerales.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFacturasGenerales.add(this.jButtonAbrirOrderByFacturasGenerales, this.gridBagConstraintsFacturasGenerales);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasGenerales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturasGenerales.add(this.jComboBoxTiposSeleccionarFacturasGenerales, this.gridBagConstraintsFacturasGenerales);			
			
			
			/*
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturasGenerales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturasGenerales.add(this.jCheckBoxSeleccionarTodosFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturasGenerales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturasGenerales.add(this.jCheckBoxConGraficoReporteFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturasGenerales.add(this.jCheckBoxSeleccionarTodosFacturasGenerales, this.gridBagConstraintsFacturasGenerales);															
				
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturasGenerales.add(this.jCheckBoxSeleccionadosFacturasGenerales, this.gridBagConstraintsFacturasGenerales);															
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturasGenerales.add(this.jCheckBoxConGraficoReporteFacturasGenerales, this.gridBagConstraintsFacturasGenerales);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasGenerales.add(this.jPanelParametrosAuxiliar3FacturasGenerales, this.gridBagConstraintsFacturasGenerales);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasGenerales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturasGenerales.add(this.jComboBoxTiposAccionesFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFacturasGenerales = new GridBagLayout();

			this.jScrollPanelDatosFacturasGenerales.setLayout(gridaBagLayoutDatosFacturasGenerales);
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy = 0;
			this.gridBagConstraintsFacturasGenerales.gridx = 0;
			
			this.jScrollPanelDatosFacturasGenerales.add(this.jTableDatosFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFacturasGenerales.setViewportView(this.jTableDatosFacturasGenerales);
		this.jTableDatosFacturasGenerales.setFillsViewportHeight(true);
		this.jTableDatosFacturasGenerales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFacturasGenerales= new GridBagLayout();
		this.jPanelAccionesFacturasGenerales.setLayout(gridaBagLayoutAccionesFacturasGenerales);
		
		
		/*	
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasGenerales.gridy = 0;
		this.gridBagConstraintsFacturasGenerales.gridx = 0;
			
		this.jPanelAccionesFacturasGenerales.add(this.jButtonNuevoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaFacturasGeneralesFacturasGenerales= new GridBagLayout();
		gridaBagLayoutBusquedaFacturasGeneralesFacturasGenerales.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaFacturasGeneralesFacturasGenerales.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaFacturasGeneralesFacturasGenerales.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaFacturasGeneralesFacturasGenerales.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaFacturasGeneralesFacturasGenerales.setLayout(gridaBagLayoutBusquedaFacturasGeneralesFacturasGenerales);

		gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasGenerales.gridy = 0;
		gridBagConstraintsFacturasGenerales.gridx = 0;
		jPanelBusquedaFacturasGeneralesFacturasGenerales.add(jLabelid_zonaBusquedaFacturasGeneralesFacturasGenerales, gridBagConstraintsFacturasGenerales);

		gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasGenerales.gridy = 0;
		gridBagConstraintsFacturasGenerales.gridx = 1;
		jPanelBusquedaFacturasGeneralesFacturasGenerales.add(jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales, gridBagConstraintsFacturasGenerales);


		gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasGenerales.gridy = 1;
		gridBagConstraintsFacturasGenerales.gridx = 0;
		jPanelBusquedaFacturasGeneralesFacturasGenerales.add(jLabelid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales, gridBagConstraintsFacturasGenerales);

		gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasGenerales.gridy = 1;
		gridBagConstraintsFacturasGenerales.gridx = 1;
		jPanelBusquedaFacturasGeneralesFacturasGenerales.add(jTextFieldid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales, gridBagConstraintsFacturasGenerales);


		gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasGenerales.gridy = 2;
		gridBagConstraintsFacturasGenerales.gridx = 0;
		jPanelBusquedaFacturasGeneralesFacturasGenerales.add(jLabelid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales, gridBagConstraintsFacturasGenerales);

		gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasGenerales.gridy = 2;
		gridBagConstraintsFacturasGenerales.gridx = 1;
		jPanelBusquedaFacturasGeneralesFacturasGenerales.add(jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales, gridBagConstraintsFacturasGenerales);


		gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasGenerales.gridy = 3;
		gridBagConstraintsFacturasGenerales.gridx = 0;
		jPanelBusquedaFacturasGeneralesFacturasGenerales.add(jLabelfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales, gridBagConstraintsFacturasGenerales);

		gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasGenerales.gridy = 3;
		gridBagConstraintsFacturasGenerales.gridx = 1;
		jPanelBusquedaFacturasGeneralesFacturasGenerales.add(jDateChooserfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales, gridBagConstraintsFacturasGenerales);


		gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasGenerales.gridy = 4;
		gridBagConstraintsFacturasGenerales.gridx = 0;
		jPanelBusquedaFacturasGeneralesFacturasGenerales.add(jLabelfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales, gridBagConstraintsFacturasGenerales);

		gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasGenerales.gridy = 4;
		gridBagConstraintsFacturasGenerales.gridx = 1;
		jPanelBusquedaFacturasGeneralesFacturasGenerales.add(jDateChooserfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales, gridBagConstraintsFacturasGenerales);

		gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasGenerales.gridy = 5;
		gridBagConstraintsFacturasGenerales.gridx =1;
		jPanelBusquedaFacturasGeneralesFacturasGenerales.add(jButtonBusquedaFacturasGeneralesFacturasGenerales, gridBagConstraintsFacturasGenerales);

		jTabbedPaneBusquedasFacturasGenerales.addTab("1.-Por Zona Por Tipo Cliente Por Tipo Factura Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaFacturasGeneralesFacturasGenerales);
		jTabbedPaneBusquedasFacturasGenerales.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturasGenerales = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturasGenerales);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();						
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturasGenerales.gridx = 0;		
			//this.gridBagConstraintsFacturasGenerales.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturasGenerales.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFacturasGenerales, this.gridBagConstraintsFacturasGenerales);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFacturasGenerales.gridx = 0;		
		//this.gridBagConstraintsFacturasGenerales.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFacturasGenerales.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFacturasGenerales);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFacturasGenerales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturasGenerales.gridx = 0;		
			this.gridBagConstraintsFacturasGenerales.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFacturasGenerales.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFacturasGenerales, this.gridBagConstraintsFacturasGenerales);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasGenerales.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFacturasGenerales, this.gridBagConstraintsFacturasGenerales);								
		
		
		/*
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasGenerales.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		*/		
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturasGenerales.gridx =0;
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturasGenerales.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
				
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasGenerales.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FacturasGeneralesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFacturasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturasGenerales = new GridBagLayout();
			this.jPanelBusquedasParametrosFacturasGenerales.setLayout(gridaBagLayoutBusquedasParametrosFacturasGenerales);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFacturasGenerales=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturasGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturasGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturasGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
			
			
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
			
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturasGenerales.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFacturasGenerales;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFacturasGenerales() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFacturasGenerales = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFacturasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFacturasGenerales.setName("jPanelReporteDinamicoFacturasGenerales"); 
		
		this.jPanelReporteDinamicoFacturasGenerales.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturasGenerales.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturasGenerales.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFacturasGenerales.setLayout(gridaBagLayoutReporteDinamicoFacturasGenerales);
		
		
		this.jInternalFrameReporteDinamicoFacturasGenerales= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFacturasGenerales = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturasGenerales= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFacturasGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFacturasGenerales.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFacturasGenerales.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFacturasGenerales.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFacturasGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFacturasGenerales.setResizable(true);
	    this.jInternalFrameReporteDinamicoFacturasGenerales.setClosable(true);
	    this.jInternalFrameReporteDinamicoFacturasGenerales.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFacturasGenerales.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturasGenerales.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturasGenerales.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Generaleses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFacturasGenerales = new JLabelMe();

		this.jLabelColumnasSelectReporteFacturasGenerales.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jLabelColumnasSelectReporteFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFacturasGenerales = new JList<Reporte>();
		this.jListColumnasSelectReporteFacturasGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFacturasGenerales.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFacturasGenerales.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturasGenerales.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturasGenerales.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFacturasGenerales=new JScrollPane(this.jListColumnasSelectReporteFacturasGenerales);
			
			this.jScrollColumnasSelectReporteFacturasGenerales.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturasGenerales.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturasGenerales.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFacturasGenerales.add(this.jListColumnasSelectReporteFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jScrollColumnasSelectReporteFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFacturasGenerales = new JLabelMe();

		this.jLabelRelacionesSelectReporteFacturasGenerales.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFacturasGenerales = new JList<Reporte>();
		this.jListRelacionesSelectReporteFacturasGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFacturasGenerales.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFacturasGenerales.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturasGenerales.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturasGenerales.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFacturasGenerales=new JScrollPane(this.jListRelacionesSelectReporteFacturasGenerales);
			
			this.jScrollRelacionesSelectReporteFacturasGenerales.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturasGenerales.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturasGenerales.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFacturasGenerales = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFacturasGenerales = new JComboBoxMe();
		this.jListColumnasValoresGraficoFacturasGenerales = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFacturasGenerales = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFacturasGenerales.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFacturasGenerales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturasGenerales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturasGenerales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFacturasGenerales = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFacturasGenerales.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFacturasGenerales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturasGenerales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturasGenerales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFacturasGenerales = new JLabelMe();

		this.jLabelConGraficoDinamicoFacturasGenerales.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jLabelConGraficoDinamicoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFacturasGenerales = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFacturasGenerales.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFacturasGenerales.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFacturasGenerales.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturasGenerales.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturasGenerales.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jCheckBoxConGraficoDinamicoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFacturasGenerales = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFacturasGenerales.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jLabelColumnaCategoriaGraficoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFacturasGenerales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturasGenerales.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFacturasGenerales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFacturasGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturasGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturasGenerales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jComboBoxColumnaCategoriaGraficoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFacturasGenerales = new JLabelMe();

		this.jLabelColumnaCategoriaValorFacturasGenerales.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jLabelColumnaCategoriaValorFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFacturasGenerales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFacturasGenerales.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFacturasGenerales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFacturasGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturasGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturasGenerales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jComboBoxColumnaCategoriaValorFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFacturasGenerales = new JLabelMe();

		this.jLabelColumnasValoresGraficoFacturasGenerales.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jLabelColumnasValoresGraficoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFacturasGenerales = new JList<Reporte>();
		this.jListColumnasValoresGraficoFacturasGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFacturasGenerales.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFacturasGenerales.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturasGenerales.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturasGenerales.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFacturasGenerales=new JScrollPane(this.jListColumnasValoresGraficoFacturasGenerales);
			
			this.jScrollColumnasValoresGraficoFacturasGenerales.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturasGenerales.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturasGenerales.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFacturasGenerales.add(this.jListColumnasSelectReporteFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jScrollColumnasValoresGraficoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFacturasGenerales = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFacturasGenerales.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jLabelTiposGraficosReportesDinamicoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFacturasGenerales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturasGenerales.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFacturasGenerales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFacturasGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturasGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturasGenerales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jComboBoxTiposGraficosReportesDinamicoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFacturasGenerales = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFacturasGenerales.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jLabelGenerarExcelReporteDinamicoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFacturasGenerales = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFacturasGenerales.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFacturasGenerales,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFacturasGenerales.setToolTipText("Generar EXCEL"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFacturasGenerales.add(this.jButtonGenerarExcelReporteDinamicoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jComboBoxTiposReportesDinamicoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFacturasGenerales = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFacturasGenerales.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jLabelTiposArchivoReporteDinamicoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jComboBoxTiposArchivosReportesDinamicoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFacturasGenerales = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFacturasGenerales.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFacturasGenerales,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFacturasGenerales.setToolTipText("Generar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jButtonGenerarReporteDinamicoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFacturasGenerales = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFacturasGenerales.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFacturasGenerales,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFacturasGenerales.setToolTipText("Cancelar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturasGenerales.add(this.jButtonCerrarReporteDinamicoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFacturasGenerales = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFacturasGenerales= new JScrollPane(jPanelReporteDinamicoFacturasGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFacturasGenerales.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturasGenerales.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturasGenerales.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Generaleses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFacturasGenerales.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFacturasGenerales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFacturasGenerales.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFacturasGenerales);
		this.jInternalFrameReporteDinamicoFacturasGenerales.getContentPane().add(this.jScrollPanelReporteDinamicoFacturasGenerales, this.gridBagConstraintsFacturasGenerales);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFacturasGenerales() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFacturasGenerales = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFacturasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFacturasGenerales.setName("jPanelImportacionFacturasGenerales"); 
		
		this.jPanelImportacionFacturasGenerales.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturasGenerales.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturasGenerales.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFacturasGenerales.setLayout(gridaBagLayoutImportacionFacturasGenerales);
		
		
		this.jInternalFrameImportacionFacturasGenerales= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFacturasGenerales= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFacturasGenerales = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturasGenerales= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFacturasGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturasGenerales.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturasGenerales.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFacturasGenerales.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturasGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturasGenerales.setResizable(true);
	    this.jInternalFrameImportacionFacturasGenerales.setClosable(true);
	    this.jInternalFrameImportacionFacturasGenerales.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFacturasGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturasGenerales.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturasGenerales.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFacturasGenerales.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturasGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturasGenerales.setResizable(true);
	    this.jInternalFrameImportacionFacturasGenerales.setClosable(true);
	    this.jInternalFrameImportacionFacturasGenerales.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFacturasGenerales.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturasGenerales.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturasGenerales.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Generaleses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFacturasGenerales = new JLabelMe();

		this.jLabelArchivoImportacionFacturasGenerales.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturasGenerales.add(this.jLabelArchivoImportacionFacturasGenerales, this.gridBagConstraintsFacturasGenerales);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFacturasGenerales = new JFileChooser();		
		this.jFileChooserImportacionFacturasGenerales.setToolTipText("ESCOGER ARCHIVO"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFacturasGenerales = new JButtonMe();
		this.jButtonAbrirImportacionFacturasGenerales.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFacturasGenerales,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFacturasGenerales.setToolTipText("Generar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturasGenerales.add(this.jButtonAbrirImportacionFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFacturasGenerales = new JLabelMe();

		this.jLabelPathArchivoImportacionFacturasGenerales.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFacturasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturasGenerales.add(this.jLabelPathArchivoImportacionFacturasGenerales, this.gridBagConstraintsFacturasGenerales);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFacturasGenerales=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFacturasGenerales.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturasGenerales.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturasGenerales.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturasGenerales.add(this.jTextFieldPathArchivoImportacionFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFacturasGenerales = new JButtonMe();
		this.jButtonGenerarImportacionFacturasGenerales.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFacturasGenerales,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFacturasGenerales.setToolTipText("Generar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturasGenerales.add(this.jButtonGenerarImportacionFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFacturasGenerales = new JButtonMe();
		this.jButtonCerrarImportacionFacturasGenerales.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFacturasGenerales,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFacturasGenerales.setToolTipText("Cancelar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturasGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturasGenerales.add(this.jButtonCerrarImportacionFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFacturasGenerales = new GridBagLayout();
		
		this.jScrollPanelImportacionFacturasGenerales= new JScrollPane(jPanelImportacionFacturasGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
		this.gridBagConstraintsFacturasGenerales.gridy =iPosYImportacion;
		this.gridBagConstraintsFacturasGenerales.gridx =iPosXImportacion;
		this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFacturasGenerales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFacturasGenerales.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFacturasGenerales);
		this.jInternalFrameImportacionFacturasGenerales.getContentPane().add(this.jScrollPanelImportacionFacturasGenerales, this.gridBagConstraintsFacturasGenerales);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFacturasGenerales(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFacturasGenerales = new JButtonMe();
			this.jButtonAbrirOrderByFacturasGenerales.setText("Orden");
			this.jButtonAbrirOrderByFacturasGenerales.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturasGenerales,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFacturasGenerales";
			inputMap = this.jButtonAbrirOrderByFacturasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFacturasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFacturasGenerales"));
		
		
			GridBagLayout gridaBagLayoutOrderByFacturasGenerales = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFacturasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFacturasGenerales.setName("jPanelOrderByFacturasGenerales"); 
			
			this.jPanelOrderByFacturasGenerales.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturasGenerales.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturasGenerales.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFacturasGenerales.setLayout(gridaBagLayoutOrderByFacturasGenerales);
			
			
			this.jTableDatosFacturasGeneralesOrderBy = new JTableMe();        
			this.jTableDatosFacturasGeneralesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFacturasGeneralesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFacturasGeneralesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFacturasGeneralesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFacturasGeneralesOrderBy.setViewportView(this.jTableDatosFacturasGeneralesOrderBy);
			this.jTableDatosFacturasGeneralesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFacturasGeneralesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFacturasGenerales= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFacturasGenerales= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFacturasGenerales = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFacturasGenerales= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFacturasGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFacturasGenerales.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFacturasGenerales.setTitle("Orden");
			this.jInternalFrameOrderByFacturasGenerales.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFacturasGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFacturasGenerales.setResizable(true);
			this.jInternalFrameOrderByFacturasGenerales.setClosable(true);
			this.jInternalFrameOrderByFacturasGenerales.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFacturasGenerales.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturasGenerales.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturasGenerales.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFacturasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Generaleses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFacturasGenerales.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFacturasGenerales.ipady =150;
				
			this.jPanelOrderByFacturasGenerales.add(jScrollPanelDatosFacturasGeneralesOrderBy, this.gridBagConstraintsFacturasGenerales);//this.jTableDatosFacturasGeneralesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFacturasGenerales = new JButtonMe();
			this.jButtonCerrarOrderByFacturasGenerales.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFacturasGenerales,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFacturasGenerales.setToolTipText("Cancelar"+" "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFacturasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasGenerales.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFacturasGenerales.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFacturasGenerales.add(this.jButtonCerrarOrderByFacturasGenerales, this.gridBagConstraintsFacturasGenerales);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFacturasGenerales = new GridBagLayout();
			
			this.jScrollPanelOrderByFacturasGenerales= new JScrollPane(jPanelOrderByFacturasGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFacturasGenerales = new GridBagConstraints();
			this.gridBagConstraintsFacturasGenerales.gridy =iPosYOrderBy;
			this.gridBagConstraintsFacturasGenerales.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturasGenerales.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFacturasGenerales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFacturasGenerales.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFacturasGenerales);
			
			this.jInternalFrameOrderByFacturasGenerales.getContentPane().add(this.jScrollPanelOrderByFacturasGenerales, this.gridBagConstraintsFacturasGenerales);			
		
		} else {
			this.jButtonAbrirOrderByFacturasGenerales = new JButtonMe();
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
		int iWidthTableCalculado=0;//3330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.facturasgeneralesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFacturasGenerales.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFacturasGenerales.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFacturasGenerales.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosFacturasGenerales.getRowHeight();//FacturasGeneralesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FacturasGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturasGenerales.isSelected()) {
					iHeightTable=FacturasGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturasGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturasGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FacturasGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturasGenerales.isSelected()) {
					iHeightTable=FacturasGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturasGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturasGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFacturasGenerales.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturasGenerales.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturasGenerales.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFacturasGenerales.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturasGenerales.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturasGenerales.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFacturasGenerales!=null && this.jInternalFrameOrderByFacturasGenerales.getjTableDatosOrderBy()!=null) {
			//if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFacturasGenerales.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFacturasGenerales.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFacturasGenerales.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFacturasGenerales.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFacturasGenerales.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFacturasGenerales.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFacturasGenerales.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFacturasGenerales.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturasGenerales.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturasGenerales.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=facturasgeneralesLogic.getFacturasGeneraless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturasgeneraless.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FacturasGenerales> TraerFacturasGeneralesBeans(List<FacturasGenerales> facturasgeneraless,ArrayList<Classe> classes)throws Exception {
		try {
			for(FacturasGenerales facturasgenerales:facturasgeneraless) {
					
				if(!(FacturasGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FacturasGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					facturasgenerales.setsDetalleGeneralEntityReporte(FacturasGeneralesConstantesFunciones.getFacturasGeneralesDescripcion(facturasgenerales));
										
						
					
						
					
				} else  {
							
					//facturasgenerales.setsDetalleGeneralEntityReporte(facturasgenerales.getsDetalleGeneralEntityReporte());
										
				}
				
				//facturasgeneralesbeans.add(facturasgeneralesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return facturasgeneraless;
    }
	//PARA REPORTES FIN
}
