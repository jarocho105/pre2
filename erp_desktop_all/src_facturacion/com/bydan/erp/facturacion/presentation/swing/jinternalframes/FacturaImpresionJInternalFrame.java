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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.facturacion.util.FacturaImpresionConstantesFunciones;

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
public class FacturaImpresionJInternalFrame extends FacturaImpresionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFacturaImpresion;
	
	protected JMenuBar jmenuBarFacturaImpresion;
	
	protected JMenu jmenuFacturaImpresion;
	protected JMenu jmenuDatosFacturaImpresion;
	protected JMenu jmenuArchivoFacturaImpresion;
	protected JMenu jmenuAccionesFacturaImpresion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFacturaImpresion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturaImpresion;	
	protected GridBagConstraints gridBagConstraintsFacturaImpresion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FacturaImpresionDetalleFormJInternalFrame jInternalFrameDetalleFormFacturaImpresion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFacturaImpresion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFacturaImpresion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected EstadoFactuImpreBeanSwingJInternalFrame estadofactuimpreBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadofactuimpre="";
	
	public FacturaImpresionSessionBean facturaimpresionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public EstadoFactuImpreSessionBean estadofactuimpreSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FacturaImpresion> facturaimpresions;		
	public List<FacturaImpresion> facturaimpresionsEliminados;	
	public List<FacturaImpresion> facturaimpresionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFacturaImpresion;		
	protected JButton jButtonAbrirOrderByFacturaImpresion;
	
	
	//protected JPanel jPanelOrderByFacturaImpresion;
	//public JScrollPane jScrollPanelOrderByFacturaImpresion;	
	//protected JButton jButtonCerrarOrderByFacturaImpresion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FacturaImpresionLogic facturaimpresionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFacturaImpresion;
	public JScrollPane jScrollPanelDatosEdicionFacturaImpresion;
	public JScrollPane jScrollPanelDatosGeneralFacturaImpresion;
    
	
	
	//public JScrollPane jScrollPanelDatosFacturaImpresionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFacturaImpresion;
	//public JScrollPane jScrollPanelImportacionFacturaImpresion;
	
	
	
	protected JPanel jPanelAccionesFacturaImpresion;
	
    protected JPanel jPanelPaginacionFacturaImpresion;
    protected JPanel jPanelParametrosReportesFacturaImpresion;
	protected JPanel jPanelParametrosReportesAccionesFacturaImpresion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FacturaImpresion;
	protected JPanel jPanelParametrosAuxiliar2FacturaImpresion;
	protected JPanel jPanelParametrosAuxiliar3FacturaImpresion;
	protected JPanel jPanelParametrosAuxiliar4FacturaImpresion;
	//protected JPanel jPanelParametrosAuxiliar5FacturaImpresion;
	
	
	
	//protected JPanel jPanelReporteDinamicoFacturaImpresion;
	//protected JPanel jPanelImportacionFacturaImpresion;
	
	
	public JTable jTableDatosFacturaImpresion;
	
	
	
	//public JTable jTableDatosFacturaImpresionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFacturaImpresion;
	protected JButton jButtonDuplicarFacturaImpresion;
	protected JButton jButtonCopiarFacturaImpresion;
	protected JButton jButtonVerFormFacturaImpresion;
	protected JButton jButtonNuevoRelacionesFacturaImpresion;
	protected JButton jButtonModificarFacturaImpresion;
	
    protected JButton jButtonGuardarCambiosTablaFacturaImpresion;
	protected JButton jButtonCerrarFacturaImpresion;
	
	
	protected JButton jButtonRecargarInformacionFacturaImpresion;
	protected JButton jButtonProcesarInformacionFacturaImpresion;
	
	
	protected JButton jButtonAnterioresFacturaImpresion;
	protected JButton jButtonSiguientesFacturaImpresion;
	protected JButton jButtonNuevoGuardarCambiosFacturaImpresion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFacturaImpresion;
	//protected JButton jButtonCerrarReporteDinamicoFacturaImpresion;
	//protected JButton jButtonGenerarExcelReporteDinamicoFacturaImpresion;	
	
	
	
	//protected JButton jButtonAbrirImportacionFacturaImpresion;
	//protected JButton jButtonGenerarImportacionFacturaImpresion;
	//protected JButton jButtonCerrarImportacionFacturaImpresion;
	//protected JFileChooser jFileChooserImportacionFacturaImpresion;
	//protected File fileImportacionFacturaImpresion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturaImpresion;
	protected JButton jButtonDuplicarToolBarFacturaImpresion;
	protected JButton jButtonNuevoRelacionesToolBarFacturaImpresion;
	
	
	public JButton jButtonGuardarCambiosToolBarFacturaImpresion;
	protected JButton jButtonCopiarToolBarFacturaImpresion;
	protected JButton jButtonVerFormToolBarFacturaImpresion;
	public JButton jButtonGuardarCambiosTablaToolBarFacturaImpresion;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturaImpresion;
	protected JButton jButtonCerrarToolBarFacturaImpresion;
	
	protected JButton jButtonRecargarInformacionToolBarFacturaImpresion;
	protected JButton jButtonProcesarInformacionToolBarFacturaImpresion;
	protected JButton jButtonAnterioresToolBarFacturaImpresion;
	protected JButton jButtonSiguientesToolBarFacturaImpresion;
	protected JButton jButtonNuevoGuardarCambiosToolBarFacturaImpresion;
	protected JButton jButtonAbrirOrderByToolBarFacturaImpresion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturaImpresion;
	protected JMenuItem jMenuItemDuplicarFacturaImpresion;
	protected JMenuItem jMenuItemNuevoRelacionesFacturaImpresion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFacturaImpresion;
	protected JMenuItem jMenuItemCopiarFacturaImpresion;
	protected JMenuItem jMenuItemVerFormFacturaImpresion;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturaImpresion;
	protected JMenuItem jMenuItemCerrarFacturaImpresion;
	protected JMenuItem jMenuItemDetalleCerrarFacturaImpresion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFacturaImpresion;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturaImpresion;
	
	protected JMenuItem jMenuItemRecargarInformacionFacturaImpresion;
	protected JMenuItem jMenuItemProcesarInformacionFacturaImpresion;
	protected JMenuItem jMenuItemAnterioresFacturaImpresion;
	protected JMenuItem jMenuItemSiguientesFacturaImpresion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturaImpresion;
	protected JMenuItem jMenuItemAbrirOrderByFacturaImpresion;
	protected JMenuItem jMenuItemMostrarOcultarFacturaImpresion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturaImpresion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFacturaImpresion;
	protected JCheckBox jCheckBoxSeleccionadosFacturaImpresion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFacturaImpresion;
	protected JCheckBox jCheckBoxConGraficoReporteFacturaImpresion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFacturaImpresion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFacturaImpresion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFacturaImpresion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFacturaImpresion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFacturaImpresion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFacturaImpresion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturaImpresion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturaImpresion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFacturaImpresion;
	protected JTextField jTextFieldValorCampoGeneralFacturaImpresion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFacturaImpresion;
	//public JList<Reporte> jListColumnasSelectReporteFacturaImpresion;
	//public JScrollPane jScrollColumnasSelectReporteFacturaImpresion;
	
	//public JLabel jLabelRelacionesSelectReporteFacturaImpresion;
	//public JList<Reporte> jListRelacionesSelectReporteFacturaImpresion;
	//public JScrollPane jScrollRelacionesSelectReporteFacturaImpresion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFacturaImpresion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFacturaImpresion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFacturaImpresion;
	//public JLabel jLabelTiposArchivoReporteDinamicoFacturaImpresion;
	
		
	//public JLabel jLabelArchivoImportacionFacturaImpresion;	
	//public JLabel jLabelPathArchivoImportacionFacturaImpresion;
	//protected JTextField jTextFieldPathArchivoImportacionFacturaImpresion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFacturaImpresion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFacturaImpresion;
	
	//public JLabel jLabelColumnaCategoriaValorFacturaImpresion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFacturaImpresion;
	
	//public JLabel jLabelColumnasValoresGraficoFacturaImpresion;
	//public JList<Reporte> jListColumnasValoresGraficoFacturaImpresion;
	//public JScrollPane jScrollColumnasValoresGraficoFacturaImpresion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFacturaImpresion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFacturaImpresion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFacturaImpresion;
	public JPanel jPanelFK_IdEstadoFactuImpreFacturaImpresion;
	public JButton jButtonFK_IdEstadoFactuImpreFacturaImpresion;
	public JPanel jPanelFK_IdFacturaFacturaImpresion;
	public JButton jButtonFK_IdFacturaFacturaImpresion;
	
	public JPanel jPanelid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion;
	public JLabel jLabelid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion;
	public JButton jButtonid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion= new JButtonMe();
	public JButton jButtonid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresionUpdate= new JButtonMe();
	public JButton jButtonid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_facturaFK_IdFacturaFacturaImpresion;
	public JLabel jLabelid_facturaFK_IdFacturaFacturaImpresion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaFacturaImpresion;
	public JButton jButtonid_facturaFK_IdFacturaFacturaImpresion= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaFacturaImpresionUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaFacturaImpresionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaFacturaImpresion;
	
	
	
	
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
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FacturaImpresionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FacturaImpresion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaImpresionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaImpresion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaImpresionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaImpresion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaImpresionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturaImpresion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFacturaImpresion)	{
		this.jButtonRecargarInformacionFacturaImpresion = jButtonRecargarInformacionFacturaImpresion;
	}
	
	public JButton getjButtonProcesarInformacionFacturaImpresion() {
		return this.jButtonProcesarInformacionFacturaImpresion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturaImpresion)	{
		this.jButtonProcesarInformacionFacturaImpresion = jButtonProcesarInformacionFacturaImpresion;
	}
	
	
	public JButton getjButtonRecargarInformacionFacturaImpresion() {
		return this.jButtonRecargarInformacionFacturaImpresion;
	}
	
	
	public List<FacturaImpresion> getfacturaimpresions() {
		return this.facturaimpresions;
	}

	public void setfacturaimpresions(List<FacturaImpresion> facturaimpresions) {
		this.facturaimpresions = facturaimpresions;
	}
	
	public List<FacturaImpresion> getfacturaimpresionsAux() {
		return this.facturaimpresionsAux;
	}

	public void setfacturaimpresionsAux(List<FacturaImpresion> facturaimpresionsAux) {
		this.facturaimpresionsAux = facturaimpresionsAux;
	}
	
	public List<FacturaImpresion> getfacturaimpresionsEliminados() {
		return this.facturaimpresionsEliminados;
	}

	public void setFacturaImpresionsEliminados(List<FacturaImpresion> facturaimpresionsEliminados) {
		this.facturaimpresionsEliminados = facturaimpresionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFacturaImpresion() {
		return jComboBoxTiposSeleccionarFacturaImpresion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFacturaImpresion(
			JComboBox jComboBoxTiposSeleccionarFacturaImpresion) {
		this.jComboBoxTiposSeleccionarFacturaImpresion = jComboBoxTiposSeleccionarFacturaImpresion;
	}
	
	public void setBorderResaltarTiposSeleccionarFacturaImpresion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFacturaImpresion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFacturaImpresion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFacturaImpresion() {
		return jTextFieldValorCampoGeneralFacturaImpresion;
	}

	public void setjTextFieldValorCampoGeneralFacturaImpresion(
			JTextField jTextFieldValorCampoGeneralFacturaImpresion) {
		this.jTextFieldValorCampoGeneralFacturaImpresion = jTextFieldValorCampoGeneralFacturaImpresion;
	}

	public void setBorderResaltarValorCampoGeneralFacturaImpresion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaImpresion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFacturaImpresion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFacturaImpresion() {
		return this.jCheckBoxSeleccionarTodosFacturaImpresion;
	}

	public void setjCheckBoxSeleccionarTodosFacturaImpresion(
			JCheckBox jCheckBoxSeleccionarTodosFacturaImpresion) {
		this.jCheckBoxSeleccionarTodosFacturaImpresion = jCheckBoxSeleccionarTodosFacturaImpresion;
	}

	public void setBorderResaltarSeleccionarTodosFacturaImpresion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaImpresion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFacturaImpresion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFacturaImpresion() {
		return this.jCheckBoxSeleccionadosFacturaImpresion;
	}

	public void setjCheckBoxSeleccionadosFacturaImpresion(
			JCheckBox jCheckBoxSeleccionadosFacturaImpresion) {
		this.jCheckBoxSeleccionadosFacturaImpresion = jCheckBoxSeleccionadosFacturaImpresion;
	}
	
	public void setBorderResaltarSeleccionadosFacturaImpresion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaImpresion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFacturaImpresion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFacturaImpresion() {
		return this.jComboBoxTiposArchivosReportesFacturaImpresion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFacturaImpresion(
			JComboBox jComboBoxTiposArchivosReportesFacturaImpresion) {
		this.jComboBoxTiposArchivosReportesFacturaImpresion = jComboBoxTiposArchivosReportesFacturaImpresion;
	}

	public void setBorderResaltarTiposArchivosReportesFacturaImpresion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaImpresion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFacturaImpresion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFacturaImpresion() {
		return this.jComboBoxTiposReportesFacturaImpresion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFacturaImpresion(
			JComboBox jComboBoxTiposReportesFacturaImpresion) {
		this.jComboBoxTiposReportesFacturaImpresion = jComboBoxTiposReportesFacturaImpresion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFacturaImpresion() {
	//	return jComboBoxTiposReportesDinamicoFacturaImpresion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFacturaImpresion(
	//		JComboBox jComboBoxTiposReportesDinamicoFacturaImpresion) {
	//	this.jComboBoxTiposReportesDinamicoFacturaImpresion = jComboBoxTiposReportesDinamicoFacturaImpresion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFacturaImpresion() {
	//	return jComboBoxTiposArchivosReportesDinamicoFacturaImpresion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFacturaImpresion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFacturaImpresion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFacturaImpresion = jComboBoxTiposArchivosReportesDinamicoFacturaImpresion;
	//}
	
	public void setBorderResaltarTiposReportesFacturaImpresion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaImpresion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFacturaImpresion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFacturaImpresion() {
		return this.jComboBoxTiposGraficosReportesFacturaImpresion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFacturaImpresion(
			JComboBox jComboBoxTiposGraficosReportesFacturaImpresion) {
		this.jComboBoxTiposGraficosReportesFacturaImpresion = jComboBoxTiposGraficosReportesFacturaImpresion;
	}
	
	public void setBorderResaltarTiposGraficosReportesFacturaImpresion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaImpresion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFacturaImpresion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFacturaImpresion() {
		return this.jComboBoxTiposPaginacionFacturaImpresion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFacturaImpresion(
			JComboBox jComboBoxTiposPaginacionFacturaImpresion) {
		this.jComboBoxTiposPaginacionFacturaImpresion = jComboBoxTiposPaginacionFacturaImpresion;
	}
	
	public void setBorderResaltarTiposPaginacionFacturaImpresion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaImpresion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFacturaImpresion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFacturaImpresion() {
		return this.jComboBoxTiposRelacionesFacturaImpresion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturaImpresion() {
		return this.jComboBoxTiposAccionesFacturaImpresion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturaImpresion(
			JComboBox jComboBoxTiposRelacionesFacturaImpresion) {
		this.jComboBoxTiposRelacionesFacturaImpresion = jComboBoxTiposRelacionesFacturaImpresion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturaImpresion(
			JComboBox jComboBoxTiposAccionesFacturaImpresion) {
		this.jComboBoxTiposAccionesFacturaImpresion = jComboBoxTiposAccionesFacturaImpresion;
	}
	
	public void setBorderResaltarTiposRelacionesFacturaImpresion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaImpresion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFacturaImpresion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFacturaImpresion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaImpresion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFacturaImpresion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFacturaImpresion() {
	//	return jCheckBoxConGraficoDinamicoFacturaImpresion;
	//}

	//public void setjCheckBoxConGraficoDinamicoFacturaImpresion(
	//		JCheckBox jCheckBoxConGraficoDinamicoFacturaImpresion) {
	//	this.jCheckBoxConGraficoDinamicoFacturaImpresion = jCheckBoxConGraficoDinamicoFacturaImpresion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFacturaImpresion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFacturaImpresion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFacturaImpresion .setBorder(borderResaltar);		
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
		this.facturaimpresionSessionBean=new FacturaImpresionSessionBean();
		
		this.facturaimpresionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturaimpresionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturaimpresionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FacturaImpresionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FacturaImpresionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturaImpresionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturaImpresionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturaImpresionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Factura Impresion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
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
		
		FacturaImpresionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FacturaImpresion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFacturaImpresion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFacturaImpresion,this.jTtoolBarFacturaImpresion,
							"nuevo","nuevo","Nuevo"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFacturaImpresion,this.jTtoolBarFacturaImpresion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFacturaImpresion,this.jTtoolBarFacturaImpresion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFacturaImpresion,this.jTtoolBarFacturaImpresion,
							"duplicar","duplicar","Duplicar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFacturaImpresion,this.jTtoolBarFacturaImpresion,
							"copiar","copiar","Copiar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFacturaImpresion,this.jTtoolBarFacturaImpresion,
							"ver_form","ver_form","Ver"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaImpresion,this.jTtoolBarFacturaImpresion,
							"recargar","recargar","Recargar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaImpresion,this.jTtoolBarFacturaImpresion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaImpresion,this.jTtoolBarFacturaImpresion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFacturaImpresion,this.jTtoolBarFacturaImpresion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFacturaImpresion,this.jTtoolBarFacturaImpresion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFacturaImpresion,this.jTtoolBarFacturaImpresion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFacturaImpresion,this.jTtoolBarFacturaImpresion,
							"cerrar","cerrar","Salir"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFacturaImpresion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFacturaImpresion;
			
				this.jButtonProcesarInformacionToolBarFacturaImpresion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFacturaImpresion;
				
		//protected JButton jButtonModificarToolBarFacturaImpresion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFacturaImpresion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFacturaImpresion=new JMenuMe("General");
		this.jmenuArchivoFacturaImpresion=new JMenuMe("Archivo");
		this.jmenuAccionesFacturaImpresion=new JMenuMe("Acciones");
		this.jmenuDatosFacturaImpresion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturaImpresion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturaImpresion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturaImpresion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFacturaImpresion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFacturaImpresion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFacturaImpresion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFacturaImpresion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFacturaImpresion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFacturaImpresion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFacturaImpresion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturaImpresion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturaImpresion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFacturaImpresion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFacturaImpresion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFacturaImpresion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFacturaImpresion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFacturaImpresion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFacturaImpresion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFacturaImpresion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFacturaImpresion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFacturaImpresion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturaImpresion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturaImpresion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturaImpresion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFacturaImpresion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFacturaImpresion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFacturaImpresion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFacturaImpresion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFacturaImpresion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFacturaImpresion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFacturaImpresion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFacturaImpresion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFacturaImpresion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFacturaImpresion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFacturaImpresion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFacturaImpresion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFacturaImpresion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFacturaImpresion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFacturaImpresion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturaImpresion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturaImpresion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturaImpresion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFacturaImpresion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFacturaImpresion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFacturaImpresion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturaImpresion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturaImpresion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturaImpresion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFacturaImpresion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFacturaImpresion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFacturaImpresion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFacturaImpresion.add(this.jMenuItemCerrarFacturaImpresion);
			
			this.jmenuAccionesFacturaImpresion.add(this.jMenuItemNuevoFacturaImpresion);
			this.jmenuAccionesFacturaImpresion.add(this.jMenuItemNuevoGuardarCambiosFacturaImpresion);
			this.jmenuAccionesFacturaImpresion.add(this.jMenuItemNuevoRelacionesFacturaImpresion);
			this.jmenuAccionesFacturaImpresion.add(this.jMenuItemGuardarCambiosTablaFacturaImpresion);		
			this.jmenuAccionesFacturaImpresion.add(this.jMenuItemDuplicarFacturaImpresion);		
			this.jmenuAccionesFacturaImpresion.add(this.jMenuItemCopiarFacturaImpresion);		
			this.jmenuAccionesFacturaImpresion.add(this.jMenuItemVerFormFacturaImpresion);		
			
			this.jmenuDatosFacturaImpresion.add(this.jMenuItemRecargarInformacionFacturaImpresion);				
			this.jmenuDatosFacturaImpresion.add(this.jMenuItemAnterioresFacturaImpresion);				
			this.jmenuDatosFacturaImpresion.add(this.jMenuItemSiguientesFacturaImpresion);				
			this.jmenuDatosFacturaImpresion.add(this.jMenuItemAbrirOrderByFacturaImpresion);				
			this.jmenuDatosFacturaImpresion.add(this.jMenuItemMostrarOcultarFacturaImpresion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFacturaImpresion.add(this.jMenuItemGuardarCambiosFacturaImpresion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFacturaImpresion.add(this.jmenuArchivoFacturaImpresion);		
			this.jmenuBarFacturaImpresion.add(this.jmenuAccionesFacturaImpresion);		
			this.jmenuBarFacturaImpresion.add(this.jmenuDatosFacturaImpresion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFacturaImpresion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFacturaImpresion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEstadoFactuImpreFacturaImpresion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoFactuImpreFacturaImpresion.setToolTipText("Buscar Por Estado Factu Impre ");
		this.jButtonFK_IdEstadoFactuImpreFacturaImpresion= new JButtonMe();
		this.jButtonFK_IdEstadoFactuImpreFacturaImpresion.setText("Buscar");
		this.jButtonFK_IdEstadoFactuImpreFacturaImpresion.setToolTipText("Buscar Por Estado Factu Impre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoFactuImpreFacturaImpresion,"buscar_button","Buscar Por Estado Factu Impre ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoFactuImpreFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion = new JLabelMe();
		jLabelid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.setText("Estado Factu Impre :");
		jLabelid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.setToolTipText("Estado Factu Impre");
		jLabelid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion= new JComboBoxMe();
		jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaFacturaImpresion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaFacturaImpresion.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaFacturaImpresion= new JButtonMe();
		this.jButtonFK_IdFacturaFacturaImpresion.setText("Buscar");
		this.jButtonFK_IdFacturaFacturaImpresion.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaFacturaImpresion,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaFacturaImpresion = new JLabelMe();
		jLabelid_facturaFK_IdFacturaFacturaImpresion.setText("Factura :");
		jLabelid_facturaFK_IdFacturaFacturaImpresion.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaFacturaImpresion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaFacturaImpresion= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaFacturaImpresion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaFacturaImpresion= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaFacturaImpresion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaFacturaImpresion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaFacturaImpresion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaFacturaImpresion.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaFacturaImpresion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaFacturaImpresion.setFocusable(false);


		this.jTabbedPaneBusquedasFacturaImpresion=new JTabbedPane();


		this.jTabbedPaneBusquedasFacturaImpresion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFacturaImpresion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFacturaImpresion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFacturaImpresion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFacturaImpresion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFacturaImpresion = new FacturaImpresionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Factura Impresion DATOS");
			this.jInternalFrameDetalleFormFacturaImpresion = new FacturaImpresionDetalleFormJInternalFrame(jDesktopPane,this.facturaimpresionSessionBean.getConGuardarRelaciones(),this.facturaimpresionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFacturaImpresion = null;//new FacturaImpresionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturaImpresion= new GridBagLayout();
		
		
		this.jTableDatosFacturaImpresion = new JTableMe();      
		
		String sToolTipFacturaImpresion="";
		sToolTipFacturaImpresion=FacturaImpresionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturaImpresion+="(Facturacion.FacturaImpresion)";
		}
		
		if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturaImpresion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFacturaImpresion.setToolTipText(sToolTipFacturaImpresion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFacturaImpresion);
		this.jTableDatosFacturaImpresion.setAutoCreateRowSorter(true);
		this.jTableDatosFacturaImpresion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFacturaImpresion.setRowSelectionAllowed(true);
		this.jTableDatosFacturaImpresion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFacturaImpresion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFacturaImpresion = new JButtonMe();
		this.jButtonDuplicarFacturaImpresion = new JButtonMe();
		this.jButtonCopiarFacturaImpresion = new JButtonMe();
		this.jButtonVerFormFacturaImpresion = new JButtonMe();
		this.jButtonNuevoRelacionesFacturaImpresion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFacturaImpresion = new JButtonMe();
		this.jButtonCerrarFacturaImpresion = new JButtonMe();
		
		this.jScrollPanelDatosFacturaImpresion = new JScrollPane();   
        this.jScrollPanelDatosGeneralFacturaImpresion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFacturaImpresion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Factura Impresion";
		
		if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Impresiones" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturaImpresion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturaImpresion.setToolTipText("Acciones");
        this.jPanelAccionesFacturaImpresion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFacturaImpresion=new ReporteDinamicoJInternalFrame(FacturaImpresionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFacturaImpresion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFacturaImpresion=new ImportacionJInternalFrame(FacturaImpresionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFacturaImpresion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFacturaImpresion = new JButtonMe();
		
		this.jButtonAbrirOrderByFacturaImpresion.setText("Orden");
		this.jButtonAbrirOrderByFacturaImpresion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturaImpresion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFacturaImpresion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturaImpresion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaImpresion,false,this);
			
			//this.cargarOrderByFacturaImpresion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturaImpresion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaImpresion,true,this);
			
			//this.cargarOrderByFacturaImpresion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFacturaImpresion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosFacturaImpresion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosFacturaImpresion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosFacturaImpresion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturaImpresion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturaImpresion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFacturaImpresion.setText("Nuevo");
		this.jButtonDuplicarFacturaImpresion.setText("Duplicar");
		this.jButtonCopiarFacturaImpresion.setText("Copiar");
		this.jButtonVerFormFacturaImpresion.setText("Ver");
		this.jButtonNuevoRelacionesFacturaImpresion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFacturaImpresion.setText("Guardar");
		this.jButtonCerrarFacturaImpresion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturaImpresion,"nuevo_button","Nuevo",this.facturaimpresionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFacturaImpresion,"duplicar_button","Duplicar",this.facturaimpresionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFacturaImpresion,"copiar_button","Copiar",this.facturaimpresionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFacturaImpresion,"ver_form","Ver",this.facturaimpresionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFacturaImpresion,"nuevorelaciones_button","Nuevo Rel",this.facturaimpresionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturaImpresion,"guardarcambiostabla_button","Guardar",this.facturaimpresionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturaImpresion,"cerrar_button","Salir",this.facturaimpresionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFacturaImpresion.setToolTipText("Nuevo"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFacturaImpresion.setToolTipText("Duplicar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFacturaImpresion.setToolTipText("Copiar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFacturaImpresion.setToolTipText("Ver"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFacturaImpresion.setToolTipText("Nuevo Rel"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFacturaImpresion.setToolTipText("Guardar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturaImpresion.setToolTipText("Salir"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturaImpresion";
		inputMap = this.jButtonNuevoFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturaImpresion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturaImpresion"));
		
		//DUPLICAR
		sMapKey = "DuplicarFacturaImpresion";
		inputMap = this.jButtonDuplicarFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFacturaImpresion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFacturaImpresion"));
		
		//COPIAR
		sMapKey = "CopiarFacturaImpresion";
		inputMap = this.jButtonCopiarFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFacturaImpresion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFacturaImpresion"));
		
		//VEr FORM
		sMapKey = "VerFormFacturaImpresion";
		inputMap = this.jButtonVerFormFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFacturaImpresion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFacturaImpresion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFacturaImpresion";
		inputMap = this.jButtonNuevoRelacionesFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFacturaImpresion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFacturaImpresion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFacturaImpresion";
		inputMap = this.jButtonModificarFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFacturaImpresion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFacturaImpresion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFacturaImpresion";
		inputMap = this.jButtonCerrarFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturaImpresion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturaImpresion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturaImpresion";
		inputMap = this.jButtonGuardarCambiosTablaFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturaImpresion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturaImpresion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFacturaImpresion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFacturaImpresion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFacturaImpresion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FacturaImpresion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FacturaImpresion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FacturaImpresion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FacturaImpresion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FacturaImpresion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFacturaImpresion.setName("jPanelParametrosReportesFacturaImpresion"); 
		
		this.jPanelParametrosReportesAccionesFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFacturaImpresion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFacturaImpresion.setName("jPanelParametrosReportesAccionesFacturaImpresion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFacturaImpresion = new JButtonMe();
		this.jButtonRecargarInformacionFacturaImpresion.setText("Recargar");
		this.jButtonRecargarInformacionFacturaImpresion.setToolTipText("Recargar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFacturaImpresion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFacturaImpresion = new JButtonMe();
		this.jButtonProcesarInformacionFacturaImpresion.setText("Procesar");
		this.jButtonProcesarInformacionFacturaImpresion.setToolTipText("Procesar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFacturaImpresion.setVisible(false);
			
		this.jButtonProcesarInformacionFacturaImpresion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturaImpresion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturaImpresion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFacturaImpresion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaImpresion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFacturaImpresion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFacturaImpresion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaImpresion.setText("TIPO");       
		this.jComboBoxTiposReportesFacturaImpresion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFacturaImpresion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaImpresion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFacturaImpresion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFacturaImpresion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFacturaImpresion.setText("Paginacion");
		this.jComboBoxTiposPaginacionFacturaImpresion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFacturaImpresion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFacturaImpresion.setText("Accion");
		this.jComboBoxTiposRelacionesFacturaImpresion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFacturaImpresion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturaImpresion.setText("Accion");
		this.jComboBoxTiposAccionesFacturaImpresion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFacturaImpresion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFacturaImpresion.setText("Accion");
		this.jComboBoxTiposSeleccionarFacturaImpresion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFacturaImpresion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFacturaImpresion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturaImpresion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturaImpresion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFacturaImpresion = new JLabelMe();
		
		this.jLabelAccionesFacturaImpresion.setText("Acciones");		
		this.jLabelAccionesFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFacturaImpresion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFacturaImpresion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFacturaImpresion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFacturaImpresion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFacturaImpresion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFacturaImpresion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFacturaImpresion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFacturaImpresion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFacturaImpresion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFacturaImpresion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFacturaImpresion.setText("Graf.");
		this.jCheckBoxConGraficoReporteFacturaImpresion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFacturaImpresion = new JButtonMe();
		//this.jButtonAnterioresFacturaImpresion.setText("<<");
        this.jButtonAnterioresFacturaImpresion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFacturaImpresion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFacturaImpresion = new JButtonMe();
		//this.jButtonSiguientesFacturaImpresion.setText(">>");
        this.jButtonSiguientesFacturaImpresion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFacturaImpresion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFacturaImpresion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFacturaImpresion.setText("Nue");
        this.jButtonNuevoGuardarCambiosFacturaImpresion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFacturaImpresion,"nuevoguardarcambios_button","Nue",this.facturaimpresionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFacturaImpresion";
		inputMap = this.jButtonNuevoGuardarCambiosFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFacturaImpresion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFacturaImpresion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFacturaImpresion";
		inputMap = this.jButtonRecargarInformacionFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFacturaImpresion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFacturaImpresion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFacturaImpresion";
		inputMap = this.jButtonSiguientesFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFacturaImpresion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFacturaImpresion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFacturaImpresion";
		inputMap = this.jButtonAnterioresFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFacturaImpresion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFacturaImpresion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFacturaImpresion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFacturaImpresion.setMinimumSize(new Dimension(this.getWidth(),FacturaImpresionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaImpresionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturaImpresion.setMaximumSize(new Dimension(this.getWidth(),FacturaImpresionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaImpresionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturaImpresion.setPreferredSize(new Dimension(this.getWidth(),FacturaImpresionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaImpresionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFacturaImpresion = new GridBagLayout();

			this.jPanelPaginacionFacturaImpresion.setLayout(gridaBagLayoutPaginacionFacturaImpresion);						
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.gridy = 0;
			this.gridBagConstraintsFacturaImpresion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFacturaImpresion.add(this.jButtonAnterioresFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
					
						
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturaImpresion.gridy = 0;
			
			this.jPanelPaginacionFacturaImpresion.add(this.jButtonNuevoGuardarCambiosFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
						
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFacturaImpresion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturaImpresion.gridy = 0;
			this.jPanelPaginacionFacturaImpresion.add(this.jButtonSiguientesFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.gridy = 1;
			this.gridBagConstraintsFacturaImpresion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturaImpresion.add(this.jButtonNuevoFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
						
			
			
			if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
				this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFacturaImpresion.gridy = 1;
				this.gridBagConstraintsFacturaImpresion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFacturaImpresion.add(this.jButtonGuardarCambiosTablaFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
			}
			
			
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.gridy = 1;
			this.gridBagConstraintsFacturaImpresion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturaImpresion.add(this.jButtonDuplicarFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.gridy = 1;
			this.gridBagConstraintsFacturaImpresion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturaImpresion.add(this.jButtonCopiarFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.gridy = 1;
			this.gridBagConstraintsFacturaImpresion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturaImpresion.add(this.jButtonVerFormFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.gridy = 1;
			this.gridBagConstraintsFacturaImpresion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFacturaImpresion.add(this.jButtonCerrarFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		
		
		
		this.jButtonRecargarInformacionFacturaImpresion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturaImpresion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturaImpresion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFacturaImpresion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturaImpresion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturaImpresion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFacturaImpresion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturaImpresion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturaImpresion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFacturaImpresion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturaImpresion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturaImpresion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFacturaImpresion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturaImpresion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturaImpresion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFacturaImpresion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturaImpresion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturaImpresion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFacturaImpresion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaImpresion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaImpresion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFacturaImpresion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturaImpresion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturaImpresion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFacturaImpresion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturaImpresion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturaImpresion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFacturaImpresion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturaImpresion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturaImpresion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFacturaImpresion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturaImpresion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturaImpresion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFacturaImpresion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturaImpresion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturaImpresion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFacturaImpresion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFacturaImpresion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FacturaImpresion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FacturaImpresion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FacturaImpresion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FacturaImpresion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFacturaImpresion.setLayout(gridaBagParametrosReportesFacturaImpresion);
			this.jPanelParametrosReportesAccionesFacturaImpresion.setLayout(gridaBagParametrosReportesAccionesFacturaImpresion);
			
			
			this.jPanelParametrosAuxiliar1FacturaImpresion.setLayout(gridaBagParametrosAuxiliar1FacturaImpresion);
			this.jPanelParametrosAuxiliar2FacturaImpresion.setLayout(gridaBagParametrosAuxiliar2FacturaImpresion);
			this.jPanelParametrosAuxiliar3FacturaImpresion.setLayout(gridaBagParametrosAuxiliar3FacturaImpresion);
			this.jPanelParametrosAuxiliar4FacturaImpresion.setLayout(gridaBagParametrosAuxiliar4FacturaImpresion);
			//this.jPanelParametrosAuxiliar5FacturaImpresion.setLayout(gridaBagParametrosAuxiliar2FacturaImpresion);			
			
			
			
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaImpresion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaImpresion.add(this.jButtonRecargarInformacionFacturaImpresion, this.gridBagConstraintsFacturaImpresion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaImpresion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaImpresion.add(this.jComboBoxTiposPaginacionFacturaImpresion, this.gridBagConstraintsFacturaImpresion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaImpresion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaImpresion.add(this.jCheckBoxConAltoMaximoTablaFacturaImpresion, this.gridBagConstraintsFacturaImpresion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaImpresion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaImpresion.add(this.jComboBoxTiposArchivosReportesFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaImpresion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaImpresion.add(this.jPanelParametrosAuxiliar1FacturaImpresion, this.gridBagConstraintsFacturaImpresion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaImpresion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FacturaImpresion.add(this.jComboBoxTiposReportesFacturaImpresion, this.gridBagConstraintsFacturaImpresion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaImpresion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaImpresion.add(this.jPanelParametrosAuxiliar4FacturaImpresion, this.gridBagConstraintsFacturaImpresion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaImpresion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaImpresion.add(this.jComboBoxTiposReportesFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaImpresion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaImpresion.add(this.jCheckBoxGenerarReporteFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaImpresion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaImpresion.add(this.jPanelParametrosAuxiliar2FacturaImpresion, this.gridBagConstraintsFacturaImpresion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaImpresion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaImpresion.add(this.jLabelAccionesFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
				this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFacturaImpresion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFacturaImpresion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFacturaImpresion.add(this.jButtonAbrirOrderByFacturaImpresion, this.gridBagConstraintsFacturaImpresion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaImpresion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaImpresion.add(this.jComboBoxTiposSeleccionarFacturaImpresion, this.gridBagConstraintsFacturaImpresion);			
			
			
			/*
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaImpresion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaImpresion.add(this.jCheckBoxSeleccionarTodosFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaImpresion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaImpresion.add(this.jCheckBoxSeleccionarTodosFacturaImpresion, this.gridBagConstraintsFacturaImpresion);															
				
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaImpresion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaImpresion.add(this.jCheckBoxSeleccionadosFacturaImpresion, this.gridBagConstraintsFacturaImpresion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaImpresion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaImpresion.add(this.jPanelParametrosAuxiliar3FacturaImpresion, this.gridBagConstraintsFacturaImpresion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaImpresion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaImpresion.add(this.jComboBoxTiposAccionesFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
	
				
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaImpresion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaImpresion.add(this.jTextFieldValorCampoGeneralFacturaImpresion, this.gridBagConstraintsFacturaImpresion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFacturaImpresion = new GridBagLayout();

			this.jScrollPanelDatosFacturaImpresion.setLayout(gridaBagLayoutDatosFacturaImpresion);
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.gridy = 0;
			this.gridBagConstraintsFacturaImpresion.gridx = 0;
			
			this.jScrollPanelDatosFacturaImpresion.add(this.jTableDatosFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFacturaImpresion.setViewportView(this.jTableDatosFacturaImpresion);
		this.jTableDatosFacturaImpresion.setFillsViewportHeight(true);
		this.jTableDatosFacturaImpresion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFacturaImpresion= new GridBagLayout();
		this.jPanelAccionesFacturaImpresion.setLayout(gridaBagLayoutAccionesFacturaImpresion);
		
		
		/*	
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaImpresion.gridy = 0;
		this.gridBagConstraintsFacturaImpresion.gridx = 0;
			
		this.jPanelAccionesFacturaImpresion.add(this.jButtonNuevoFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEstadoFactuImpreFacturaImpresion= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoFactuImpreFacturaImpresion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoFactuImpreFacturaImpresion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoFactuImpreFacturaImpresion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoFactuImpreFacturaImpresion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoFactuImpreFacturaImpresion.setLayout(gridaBagLayoutFK_IdEstadoFactuImpreFacturaImpresion);

		gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaImpresion.gridy = 0;
		gridBagConstraintsFacturaImpresion.gridx = 0;
		jPanelFK_IdEstadoFactuImpreFacturaImpresion.add(jLabelid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion, gridBagConstraintsFacturaImpresion);

		gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaImpresion.gridy = 0;
		gridBagConstraintsFacturaImpresion.gridx = 1;
		jPanelFK_IdEstadoFactuImpreFacturaImpresion.add(jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion, gridBagConstraintsFacturaImpresion);

		gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaImpresion.gridy = 1;
		gridBagConstraintsFacturaImpresion.gridx =1;
		jPanelFK_IdEstadoFactuImpreFacturaImpresion.add(jButtonFK_IdEstadoFactuImpreFacturaImpresion, gridBagConstraintsFacturaImpresion);

		jTabbedPaneBusquedasFacturaImpresion.addTab("1.-Por Estado Factu Impre ", jPanelFK_IdEstadoFactuImpreFacturaImpresion);
		jTabbedPaneBusquedasFacturaImpresion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdFacturaFacturaImpresion= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaFacturaImpresion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaFacturaImpresion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaFacturaImpresion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaFacturaImpresion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaFacturaImpresion.setLayout(gridaBagLayoutFK_IdFacturaFacturaImpresion);

		gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaImpresion.gridy = 0;
		gridBagConstraintsFacturaImpresion.gridx = 0;
		jPanelFK_IdFacturaFacturaImpresion.add(jLabelid_facturaFK_IdFacturaFacturaImpresion, gridBagConstraintsFacturaImpresion);

		gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaImpresion.gridy = 0;
		gridBagConstraintsFacturaImpresion.gridx = 1;
		jPanelFK_IdFacturaFacturaImpresion.add(jComboBoxid_facturaFK_IdFacturaFacturaImpresion, gridBagConstraintsFacturaImpresion);


		gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.NONE;
		gridBagConstraintsFacturaImpresion.gridy = 0;
		gridBagConstraintsFacturaImpresion.gridx = 0;
		jPanelFK_IdFacturaFacturaImpresion.add(this.jButtonBuscarFK_IdFacturaid_facturaFacturaImpresion, gridBagConstraintsFacturaImpresion);

		gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaImpresion.gridy = 1;
		gridBagConstraintsFacturaImpresion.gridx =1;
		jPanelFK_IdFacturaFacturaImpresion.add(jButtonFK_IdFacturaFacturaImpresion, gridBagConstraintsFacturaImpresion);

		jTabbedPaneBusquedasFacturaImpresion.addTab("2.-Por Factura ", jPanelFK_IdFacturaFacturaImpresion);
		jTabbedPaneBusquedasFacturaImpresion.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturaImpresion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturaImpresion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();						
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaImpresion.gridx = 0;		
			//this.gridBagConstraintsFacturaImpresion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturaImpresion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFacturaImpresion, this.gridBagConstraintsFacturaImpresion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFacturaImpresion.gridx = 0;		
		//this.gridBagConstraintsFacturaImpresion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFacturaImpresion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFacturaImpresion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaImpresion.gridx = 0;		
			this.gridBagConstraintsFacturaImpresion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFacturaImpresion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFacturaImpresion, this.gridBagConstraintsFacturaImpresion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaImpresion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFacturaImpresion, this.gridBagConstraintsFacturaImpresion);								
		
		
		/*
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaImpresion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		*/		
		
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturaImpresion.gridx =0;
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturaImpresion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
				
		
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaImpresion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FacturaImpresionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFacturaImpresion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturaImpresion = new GridBagLayout();
			this.jPanelBusquedasParametrosFacturaImpresion.setLayout(gridaBagLayoutBusquedasParametrosFacturaImpresion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFacturaImpresion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturaImpresion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaImpresion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaImpresion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaImpresion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
			
			
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaImpresion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		
			
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturaImpresion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFacturaImpresion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFacturaImpresion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFacturaImpresion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFacturaImpresion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFacturaImpresion.setName("jPanelReporteDinamicoFacturaImpresion"); 
		
		this.jPanelReporteDinamicoFacturaImpresion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturaImpresion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturaImpresion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFacturaImpresion.setLayout(gridaBagLayoutReporteDinamicoFacturaImpresion);
		
		
		this.jInternalFrameReporteDinamicoFacturaImpresion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFacturaImpresion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturaImpresion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFacturaImpresion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFacturaImpresion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFacturaImpresion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFacturaImpresion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFacturaImpresion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFacturaImpresion.setResizable(true);
	    this.jInternalFrameReporteDinamicoFacturaImpresion.setClosable(true);
	    this.jInternalFrameReporteDinamicoFacturaImpresion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFacturaImpresion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturaImpresion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturaImpresion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Impresiones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFacturaImpresion = new JLabelMe();

		this.jLabelColumnasSelectReporteFacturaImpresion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaImpresion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaImpresion.add(this.jLabelColumnasSelectReporteFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFacturaImpresion = new JList<Reporte>();
		this.jListColumnasSelectReporteFacturaImpresion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFacturaImpresion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFacturaImpresion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturaImpresion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturaImpresion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFacturaImpresion=new JScrollPane(this.jListColumnasSelectReporteFacturaImpresion);
			
			this.jScrollColumnasSelectReporteFacturaImpresion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturaImpresion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturaImpresion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaImpresion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFacturaImpresion.add(this.jListColumnasSelectReporteFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		this.jPanelReporteDinamicoFacturaImpresion.add(this.jScrollColumnasSelectReporteFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFacturaImpresion = new JLabelMe();

		this.jLabelRelacionesSelectReporteFacturaImpresion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFacturaImpresion = new JList<Reporte>();
		this.jListRelacionesSelectReporteFacturaImpresion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFacturaImpresion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFacturaImpresion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturaImpresion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturaImpresion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFacturaImpresion=new JScrollPane(this.jListRelacionesSelectReporteFacturaImpresion);
			
			this.jScrollRelacionesSelectReporteFacturaImpresion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturaImpresion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturaImpresion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFacturaImpresion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFacturaImpresion = new JComboBoxMe();
		this.jListColumnasValoresGraficoFacturaImpresion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFacturaImpresion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFacturaImpresion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFacturaImpresion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturaImpresion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturaImpresion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFacturaImpresion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFacturaImpresion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFacturaImpresion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturaImpresion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturaImpresion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFacturaImpresion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFacturaImpresion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaImpresion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaImpresion.add(this.jLabelGenerarExcelReporteDinamicoFacturaImpresion, this.gridBagConstraintsFacturaImpresion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFacturaImpresion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFacturaImpresion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFacturaImpresion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFacturaImpresion.setToolTipText("Generar EXCEL"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		//this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFacturaImpresion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFacturaImpresion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFacturaImpresion.add(this.jButtonGenerarExcelReporteDinamicoFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaImpresion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaImpresion.add(this.jComboBoxTiposReportesDinamicoFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFacturaImpresion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFacturaImpresion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaImpresion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaImpresion.add(this.jLabelTiposArchivoReporteDinamicoFacturaImpresion, this.gridBagConstraintsFacturaImpresion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaImpresion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaImpresion.add(this.jComboBoxTiposArchivosReportesDinamicoFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFacturaImpresion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFacturaImpresion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFacturaImpresion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFacturaImpresion.setToolTipText("Generar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaImpresion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaImpresion.add(this.jButtonGenerarReporteDinamicoFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFacturaImpresion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFacturaImpresion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFacturaImpresion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFacturaImpresion.setToolTipText("Cancelar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaImpresion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaImpresion.add(this.jButtonCerrarReporteDinamicoFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFacturaImpresion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFacturaImpresion= new JScrollPane(jPanelReporteDinamicoFacturaImpresion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFacturaImpresion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturaImpresion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturaImpresion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Impresiones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFacturaImpresion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFacturaImpresion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFacturaImpresion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFacturaImpresion);
		this.jInternalFrameReporteDinamicoFacturaImpresion.getContentPane().add(this.jScrollPanelReporteDinamicoFacturaImpresion, this.gridBagConstraintsFacturaImpresion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFacturaImpresion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFacturaImpresion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFacturaImpresion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFacturaImpresion.setName("jPanelImportacionFacturaImpresion"); 
		
		this.jPanelImportacionFacturaImpresion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturaImpresion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturaImpresion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFacturaImpresion.setLayout(gridaBagLayoutImportacionFacturaImpresion);
		
		
		this.jInternalFrameImportacionFacturaImpresion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFacturaImpresion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFacturaImpresion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturaImpresion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFacturaImpresion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturaImpresion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturaImpresion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFacturaImpresion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturaImpresion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturaImpresion.setResizable(true);
	    this.jInternalFrameImportacionFacturaImpresion.setClosable(true);
	    this.jInternalFrameImportacionFacturaImpresion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFacturaImpresion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturaImpresion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturaImpresion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFacturaImpresion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturaImpresion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturaImpresion.setResizable(true);
	    this.jInternalFrameImportacionFacturaImpresion.setClosable(true);
	    this.jInternalFrameImportacionFacturaImpresion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFacturaImpresion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturaImpresion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturaImpresion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Impresiones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFacturaImpresion = new JLabelMe();

		this.jLabelArchivoImportacionFacturaImpresion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaImpresion.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturaImpresion.add(this.jLabelArchivoImportacionFacturaImpresion, this.gridBagConstraintsFacturaImpresion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFacturaImpresion = new JFileChooser();		
		this.jFileChooserImportacionFacturaImpresion.setToolTipText("ESCOGER ARCHIVO"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFacturaImpresion = new JButtonMe();
		this.jButtonAbrirImportacionFacturaImpresion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFacturaImpresion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFacturaImpresion.setToolTipText("Generar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaImpresion.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaImpresion.add(this.jButtonAbrirImportacionFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFacturaImpresion = new JLabelMe();

		this.jLabelPathArchivoImportacionFacturaImpresion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaImpresion.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturaImpresion.add(this.jLabelPathArchivoImportacionFacturaImpresion, this.gridBagConstraintsFacturaImpresion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFacturaImpresion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFacturaImpresion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturaImpresion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturaImpresion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaImpresion.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaImpresion.add(this.jTextFieldPathArchivoImportacionFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFacturaImpresion = new JButtonMe();
		this.jButtonGenerarImportacionFacturaImpresion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFacturaImpresion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFacturaImpresion.setToolTipText("Generar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaImpresion.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaImpresion.add(this.jButtonGenerarImportacionFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFacturaImpresion = new JButtonMe();
		this.jButtonCerrarImportacionFacturaImpresion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFacturaImpresion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFacturaImpresion.setToolTipText("Cancelar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaImpresion.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaImpresion.add(this.jButtonCerrarImportacionFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFacturaImpresion = new GridBagLayout();
		
		this.jScrollPanelImportacionFacturaImpresion= new JScrollPane(jPanelImportacionFacturaImpresion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy =iPosYImportacion;
		this.gridBagConstraintsFacturaImpresion.gridx =iPosXImportacion;
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFacturaImpresion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFacturaImpresion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFacturaImpresion);
		this.jInternalFrameImportacionFacturaImpresion.getContentPane().add(this.jScrollPanelImportacionFacturaImpresion, this.gridBagConstraintsFacturaImpresion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFacturaImpresion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFacturaImpresion = new JButtonMe();
			this.jButtonAbrirOrderByFacturaImpresion.setText("Orden");
			this.jButtonAbrirOrderByFacturaImpresion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturaImpresion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFacturaImpresion";
			inputMap = this.jButtonAbrirOrderByFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFacturaImpresion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFacturaImpresion"));
		
		
			GridBagLayout gridaBagLayoutOrderByFacturaImpresion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFacturaImpresion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFacturaImpresion.setName("jPanelOrderByFacturaImpresion"); 
			
			this.jPanelOrderByFacturaImpresion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturaImpresion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturaImpresion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFacturaImpresion.setLayout(gridaBagLayoutOrderByFacturaImpresion);
			
			
			this.jTableDatosFacturaImpresionOrderBy = new JTableMe();        
			this.jTableDatosFacturaImpresionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFacturaImpresionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFacturaImpresionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFacturaImpresionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFacturaImpresionOrderBy.setViewportView(this.jTableDatosFacturaImpresionOrderBy);
			this.jTableDatosFacturaImpresionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFacturaImpresionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFacturaImpresion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFacturaImpresion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFacturaImpresion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFacturaImpresion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFacturaImpresion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFacturaImpresion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFacturaImpresion.setTitle("Orden");
			this.jInternalFrameOrderByFacturaImpresion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFacturaImpresion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFacturaImpresion.setResizable(true);
			this.jInternalFrameOrderByFacturaImpresion.setClosable(true);
			this.jInternalFrameOrderByFacturaImpresion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFacturaImpresion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturaImpresion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturaImpresion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Impresiones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFacturaImpresion.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFacturaImpresion.ipady =150;
				
			this.jPanelOrderByFacturaImpresion.add(jScrollPanelDatosFacturaImpresionOrderBy, this.gridBagConstraintsFacturaImpresion);//this.jTableDatosFacturaImpresionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFacturaImpresion = new JButtonMe();
			this.jButtonCerrarOrderByFacturaImpresion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFacturaImpresion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFacturaImpresion.setToolTipText("Cancelar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFacturaImpresion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFacturaImpresion.add(this.jButtonCerrarOrderByFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFacturaImpresion = new GridBagLayout();
			
			this.jScrollPanelOrderByFacturaImpresion= new JScrollPane(jPanelOrderByFacturaImpresion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.gridy =iPosYOrderBy;
			this.gridBagConstraintsFacturaImpresion.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFacturaImpresion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFacturaImpresion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFacturaImpresion);
			
			this.jInternalFrameOrderByFacturaImpresion.getContentPane().add(this.jScrollPanelOrderByFacturaImpresion, this.gridBagConstraintsFacturaImpresion);			
		
		} else {
			this.jButtonAbrirOrderByFacturaImpresion = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.facturaimpresionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFacturaImpresion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFacturaImpresion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFacturaImpresion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFacturaImpresion.getRowHeight();//FacturaImpresionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FacturaImpresionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturaImpresion.isSelected()) {
					iHeightTable=FacturaImpresionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturaImpresionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturaImpresionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FacturaImpresionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturaImpresion.isSelected()) {
					iHeightTable=FacturaImpresionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturaImpresionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturaImpresionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFacturaImpresion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturaImpresion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturaImpresion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFacturaImpresion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturaImpresion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturaImpresion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFacturaImpresion!=null && this.jInternalFrameOrderByFacturaImpresion.getjTableDatosOrderBy()!=null) {
			//if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFacturaImpresion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFacturaImpresion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFacturaImpresion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFacturaImpresion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFacturaImpresion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFacturaImpresion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFacturaImpresion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFacturaImpresion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturaImpresion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturaImpresion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=facturaimpresionLogic.getFacturaImpresions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturaimpresions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FacturaImpresion> TraerFacturaImpresionBeans(List<FacturaImpresion> facturaimpresions,ArrayList<Classe> classes)throws Exception {
		try {
			for(FacturaImpresion facturaimpresion:facturaimpresions) {
					
				if(!(FacturaImpresionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FacturaImpresionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					facturaimpresion.setsDetalleGeneralEntityReporte(FacturaImpresionConstantesFunciones.getFacturaImpresionDescripcion(facturaimpresion));
										
						
					
						
					
				} else  {
							
					//facturaimpresion.setsDetalleGeneralEntityReporte(facturaimpresion.getsDetalleGeneralEntityReporte());
										
				}
				
				//facturaimpresionbeans.add(facturaimpresionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return facturaimpresions;
    }
	//PARA REPORTES FIN
}
