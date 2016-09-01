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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
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
import com.bydan.erp.facturacion.util.report.FacturasDescuentosLineasConstantesFunciones;

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
public class FacturasDescuentosLineasJInternalFrame extends FacturasDescuentosLineasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFacturasDescuentosLineas;
	
	protected JMenuBar jmenuBarFacturasDescuentosLineas;
	
	protected JMenu jmenuFacturasDescuentosLineas;
	protected JMenu jmenuDatosFacturasDescuentosLineas;
	protected JMenu jmenuArchivoFacturasDescuentosLineas;
	protected JMenu jmenuAccionesFacturasDescuentosLineas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFacturasDescuentosLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturasDescuentosLineas;	
	protected GridBagConstraints gridBagConstraintsFacturasDescuentosLineas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FacturasDescuentosLineasDetalleFormJInternalFrame jInternalFrameDetalleFormFacturasDescuentosLineas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFacturasDescuentosLineas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFacturasDescuentosLineas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";
	
	public FacturasDescuentosLineasSessionBean facturasdescuentoslineasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FacturasDescuentosLineas> facturasdescuentoslineass;		
	public List<FacturasDescuentosLineas> facturasdescuentoslineassEliminados;	
	public List<FacturasDescuentosLineas> facturasdescuentoslineassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFacturasDescuentosLineas;		
	protected JButton jButtonAbrirOrderByFacturasDescuentosLineas;
	
	
	//protected JPanel jPanelOrderByFacturasDescuentosLineas;
	//public JScrollPane jScrollPanelOrderByFacturasDescuentosLineas;	
	//protected JButton jButtonCerrarOrderByFacturasDescuentosLineas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FacturasDescuentosLineasLogic facturasdescuentoslineasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFacturasDescuentosLineas;
	public JScrollPane jScrollPanelDatosEdicionFacturasDescuentosLineas;
	public JScrollPane jScrollPanelDatosGeneralFacturasDescuentosLineas;
    
	
	
	//public JScrollPane jScrollPanelDatosFacturasDescuentosLineasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFacturasDescuentosLineas;
	//public JScrollPane jScrollPanelImportacionFacturasDescuentosLineas;
	
	
	
	protected JPanel jPanelAccionesFacturasDescuentosLineas;
	
    protected JPanel jPanelPaginacionFacturasDescuentosLineas;
    protected JPanel jPanelParametrosReportesFacturasDescuentosLineas;
	protected JPanel jPanelParametrosReportesAccionesFacturasDescuentosLineas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FacturasDescuentosLineas;
	protected JPanel jPanelParametrosAuxiliar2FacturasDescuentosLineas;
	protected JPanel jPanelParametrosAuxiliar3FacturasDescuentosLineas;
	protected JPanel jPanelParametrosAuxiliar4FacturasDescuentosLineas;
	//protected JPanel jPanelParametrosAuxiliar5FacturasDescuentosLineas;
	
	
	
	//protected JPanel jPanelReporteDinamicoFacturasDescuentosLineas;
	//protected JPanel jPanelImportacionFacturasDescuentosLineas;
	
	
	public JTable jTableDatosFacturasDescuentosLineas;
	
	
	
	//public JTable jTableDatosFacturasDescuentosLineasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFacturasDescuentosLineas;
	protected JButton jButtonDuplicarFacturasDescuentosLineas;
	protected JButton jButtonCopiarFacturasDescuentosLineas;
	protected JButton jButtonVerFormFacturasDescuentosLineas;
	protected JButton jButtonNuevoRelacionesFacturasDescuentosLineas;
	protected JButton jButtonModificarFacturasDescuentosLineas;
	
    protected JButton jButtonGuardarCambiosTablaFacturasDescuentosLineas;
	protected JButton jButtonCerrarFacturasDescuentosLineas;
	
	
	protected JButton jButtonRecargarInformacionFacturasDescuentosLineas;
	protected JButton jButtonProcesarInformacionFacturasDescuentosLineas;
	
	
	protected JButton jButtonAnterioresFacturasDescuentosLineas;
	protected JButton jButtonSiguientesFacturasDescuentosLineas;
	protected JButton jButtonNuevoGuardarCambiosFacturasDescuentosLineas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFacturasDescuentosLineas;
	//protected JButton jButtonCerrarReporteDinamicoFacturasDescuentosLineas;
	//protected JButton jButtonGenerarExcelReporteDinamicoFacturasDescuentosLineas;	
	
	
	
	//protected JButton jButtonAbrirImportacionFacturasDescuentosLineas;
	//protected JButton jButtonGenerarImportacionFacturasDescuentosLineas;
	//protected JButton jButtonCerrarImportacionFacturasDescuentosLineas;
	//protected JFileChooser jFileChooserImportacionFacturasDescuentosLineas;
	//protected File fileImportacionFacturasDescuentosLineas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturasDescuentosLineas;
	protected JButton jButtonDuplicarToolBarFacturasDescuentosLineas;
	protected JButton jButtonNuevoRelacionesToolBarFacturasDescuentosLineas;
	
	
	public JButton jButtonGuardarCambiosToolBarFacturasDescuentosLineas;
	protected JButton jButtonCopiarToolBarFacturasDescuentosLineas;
	protected JButton jButtonVerFormToolBarFacturasDescuentosLineas;
	public JButton jButtonGuardarCambiosTablaToolBarFacturasDescuentosLineas;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturasDescuentosLineas;
	protected JButton jButtonCerrarToolBarFacturasDescuentosLineas;
	
	protected JButton jButtonRecargarInformacionToolBarFacturasDescuentosLineas;
	protected JButton jButtonProcesarInformacionToolBarFacturasDescuentosLineas;
	protected JButton jButtonAnterioresToolBarFacturasDescuentosLineas;
	protected JButton jButtonSiguientesToolBarFacturasDescuentosLineas;
	protected JButton jButtonNuevoGuardarCambiosToolBarFacturasDescuentosLineas;
	protected JButton jButtonAbrirOrderByToolBarFacturasDescuentosLineas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturasDescuentosLineas;
	protected JMenuItem jMenuItemDuplicarFacturasDescuentosLineas;
	protected JMenuItem jMenuItemNuevoRelacionesFacturasDescuentosLineas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFacturasDescuentosLineas;
	protected JMenuItem jMenuItemCopiarFacturasDescuentosLineas;
	protected JMenuItem jMenuItemVerFormFacturasDescuentosLineas;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturasDescuentosLineas;
	protected JMenuItem jMenuItemCerrarFacturasDescuentosLineas;
	protected JMenuItem jMenuItemDetalleCerrarFacturasDescuentosLineas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFacturasDescuentosLineas;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturasDescuentosLineas;
	
	protected JMenuItem jMenuItemRecargarInformacionFacturasDescuentosLineas;
	protected JMenuItem jMenuItemProcesarInformacionFacturasDescuentosLineas;
	protected JMenuItem jMenuItemAnterioresFacturasDescuentosLineas;
	protected JMenuItem jMenuItemSiguientesFacturasDescuentosLineas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturasDescuentosLineas;
	protected JMenuItem jMenuItemAbrirOrderByFacturasDescuentosLineas;
	protected JMenuItem jMenuItemMostrarOcultarFacturasDescuentosLineas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturasDescuentosLineas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFacturasDescuentosLineas;
	protected JCheckBox jCheckBoxSeleccionadosFacturasDescuentosLineas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFacturasDescuentosLineas;
	protected JCheckBox jCheckBoxConGraficoReporteFacturasDescuentosLineas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFacturasDescuentosLineas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFacturasDescuentosLineas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFacturasDescuentosLineas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFacturasDescuentosLineas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFacturasDescuentosLineas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFacturasDescuentosLineas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturasDescuentosLineas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturasDescuentosLineas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFacturasDescuentosLineas;
	protected JTextField jTextFieldValorCampoGeneralFacturasDescuentosLineas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFacturasDescuentosLineas;
	//public JList<Reporte> jListColumnasSelectReporteFacturasDescuentosLineas;
	//public JScrollPane jScrollColumnasSelectReporteFacturasDescuentosLineas;
	
	//public JLabel jLabelRelacionesSelectReporteFacturasDescuentosLineas;
	//public JList<Reporte> jListRelacionesSelectReporteFacturasDescuentosLineas;
	//public JScrollPane jScrollRelacionesSelectReporteFacturasDescuentosLineas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFacturasDescuentosLineas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFacturasDescuentosLineas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFacturasDescuentosLineas;
	//public JLabel jLabelTiposArchivoReporteDinamicoFacturasDescuentosLineas;
	
		
	//public JLabel jLabelArchivoImportacionFacturasDescuentosLineas;	
	//public JLabel jLabelPathArchivoImportacionFacturasDescuentosLineas;
	//protected JTextField jTextFieldPathArchivoImportacionFacturasDescuentosLineas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFacturasDescuentosLineas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFacturasDescuentosLineas;
	
	//public JLabel jLabelColumnaCategoriaValorFacturasDescuentosLineas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFacturasDescuentosLineas;
	
	//public JLabel jLabelColumnasValoresGraficoFacturasDescuentosLineas;
	//public JList<Reporte> jListColumnasValoresGraficoFacturasDescuentosLineas;
	//public JScrollPane jScrollColumnasValoresGraficoFacturasDescuentosLineas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFacturasDescuentosLineas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFacturasDescuentosLineas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFacturasDescuentosLineas;
	public JPanel jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas;
	public JButton jButtonBusquedaFacturasDescuentosLineasFacturasDescuentosLineas;
	
	public JPanel jPanelid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas;
	public JLabel jLabelid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas;
	public JButton jButtonid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas= new JButtonMe();
	public JButton jButtonid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineasUpdate= new JButtonMe();
	public JButton jButtonid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas;
	public JLabel jLabelfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas;
	public JButton jButtonfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas;
	public JLabel jLabelfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas;
	public JButton jButtonfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineasBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FacturasDescuentosLineasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FacturasDescuentosLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasDescuentosLineasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturasDescuentosLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasDescuentosLineasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturasDescuentosLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasDescuentosLineasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturasDescuentosLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFacturasDescuentosLineas)	{
		this.jButtonRecargarInformacionFacturasDescuentosLineas = jButtonRecargarInformacionFacturasDescuentosLineas;
	}
	
	public JButton getjButtonProcesarInformacionFacturasDescuentosLineas() {
		return this.jButtonProcesarInformacionFacturasDescuentosLineas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturasDescuentosLineas)	{
		this.jButtonProcesarInformacionFacturasDescuentosLineas = jButtonProcesarInformacionFacturasDescuentosLineas;
	}
	
	
	public JButton getjButtonRecargarInformacionFacturasDescuentosLineas() {
		return this.jButtonRecargarInformacionFacturasDescuentosLineas;
	}
	
	
	public List<FacturasDescuentosLineas> getfacturasdescuentoslineass() {
		return this.facturasdescuentoslineass;
	}

	public void setfacturasdescuentoslineass(List<FacturasDescuentosLineas> facturasdescuentoslineass) {
		this.facturasdescuentoslineass = facturasdescuentoslineass;
	}
	
	public List<FacturasDescuentosLineas> getfacturasdescuentoslineassAux() {
		return this.facturasdescuentoslineassAux;
	}

	public void setfacturasdescuentoslineassAux(List<FacturasDescuentosLineas> facturasdescuentoslineassAux) {
		this.facturasdescuentoslineassAux = facturasdescuentoslineassAux;
	}
	
	public List<FacturasDescuentosLineas> getfacturasdescuentoslineassEliminados() {
		return this.facturasdescuentoslineassEliminados;
	}

	public void setFacturasDescuentosLineassEliminados(List<FacturasDescuentosLineas> facturasdescuentoslineassEliminados) {
		this.facturasdescuentoslineassEliminados = facturasdescuentoslineassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFacturasDescuentosLineas() {
		return jComboBoxTiposSeleccionarFacturasDescuentosLineas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFacturasDescuentosLineas(
			JComboBox jComboBoxTiposSeleccionarFacturasDescuentosLineas) {
		this.jComboBoxTiposSeleccionarFacturasDescuentosLineas = jComboBoxTiposSeleccionarFacturasDescuentosLineas;
	}
	
	public void setBorderResaltarTiposSeleccionarFacturasDescuentosLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFacturasDescuentosLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFacturasDescuentosLineas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFacturasDescuentosLineas() {
		return jTextFieldValorCampoGeneralFacturasDescuentosLineas;
	}

	public void setjTextFieldValorCampoGeneralFacturasDescuentosLineas(
			JTextField jTextFieldValorCampoGeneralFacturasDescuentosLineas) {
		this.jTextFieldValorCampoGeneralFacturasDescuentosLineas = jTextFieldValorCampoGeneralFacturasDescuentosLineas;
	}

	public void setBorderResaltarValorCampoGeneralFacturasDescuentosLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasDescuentosLineas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFacturasDescuentosLineas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFacturasDescuentosLineas() {
		return this.jCheckBoxSeleccionarTodosFacturasDescuentosLineas;
	}

	public void setjCheckBoxSeleccionarTodosFacturasDescuentosLineas(
			JCheckBox jCheckBoxSeleccionarTodosFacturasDescuentosLineas) {
		this.jCheckBoxSeleccionarTodosFacturasDescuentosLineas = jCheckBoxSeleccionarTodosFacturasDescuentosLineas;
	}

	public void setBorderResaltarSeleccionarTodosFacturasDescuentosLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasDescuentosLineas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFacturasDescuentosLineas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFacturasDescuentosLineas() {
		return this.jCheckBoxSeleccionadosFacturasDescuentosLineas;
	}

	public void setjCheckBoxSeleccionadosFacturasDescuentosLineas(
			JCheckBox jCheckBoxSeleccionadosFacturasDescuentosLineas) {
		this.jCheckBoxSeleccionadosFacturasDescuentosLineas = jCheckBoxSeleccionadosFacturasDescuentosLineas;
	}
	
	public void setBorderResaltarSeleccionadosFacturasDescuentosLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasDescuentosLineas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFacturasDescuentosLineas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFacturasDescuentosLineas() {
		return this.jComboBoxTiposArchivosReportesFacturasDescuentosLineas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFacturasDescuentosLineas(
			JComboBox jComboBoxTiposArchivosReportesFacturasDescuentosLineas) {
		this.jComboBoxTiposArchivosReportesFacturasDescuentosLineas = jComboBoxTiposArchivosReportesFacturasDescuentosLineas;
	}

	public void setBorderResaltarTiposArchivosReportesFacturasDescuentosLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasDescuentosLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFacturasDescuentosLineas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFacturasDescuentosLineas() {
		return this.jComboBoxTiposReportesFacturasDescuentosLineas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFacturasDescuentosLineas(
			JComboBox jComboBoxTiposReportesFacturasDescuentosLineas) {
		this.jComboBoxTiposReportesFacturasDescuentosLineas = jComboBoxTiposReportesFacturasDescuentosLineas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFacturasDescuentosLineas() {
	//	return jComboBoxTiposReportesDinamicoFacturasDescuentosLineas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFacturasDescuentosLineas(
	//		JComboBox jComboBoxTiposReportesDinamicoFacturasDescuentosLineas) {
	//	this.jComboBoxTiposReportesDinamicoFacturasDescuentosLineas = jComboBoxTiposReportesDinamicoFacturasDescuentosLineas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFacturasDescuentosLineas() {
	//	return jComboBoxTiposArchivosReportesDinamicoFacturasDescuentosLineas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFacturasDescuentosLineas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFacturasDescuentosLineas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFacturasDescuentosLineas = jComboBoxTiposArchivosReportesDinamicoFacturasDescuentosLineas;
	//}
	
	public void setBorderResaltarTiposReportesFacturasDescuentosLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasDescuentosLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFacturasDescuentosLineas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFacturasDescuentosLineas() {
		return this.jComboBoxTiposGraficosReportesFacturasDescuentosLineas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFacturasDescuentosLineas(
			JComboBox jComboBoxTiposGraficosReportesFacturasDescuentosLineas) {
		this.jComboBoxTiposGraficosReportesFacturasDescuentosLineas = jComboBoxTiposGraficosReportesFacturasDescuentosLineas;
	}
	
	public void setBorderResaltarTiposGraficosReportesFacturasDescuentosLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasDescuentosLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFacturasDescuentosLineas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFacturasDescuentosLineas() {
		return this.jComboBoxTiposPaginacionFacturasDescuentosLineas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFacturasDescuentosLineas(
			JComboBox jComboBoxTiposPaginacionFacturasDescuentosLineas) {
		this.jComboBoxTiposPaginacionFacturasDescuentosLineas = jComboBoxTiposPaginacionFacturasDescuentosLineas;
	}
	
	public void setBorderResaltarTiposPaginacionFacturasDescuentosLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasDescuentosLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFacturasDescuentosLineas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFacturasDescuentosLineas() {
		return this.jComboBoxTiposRelacionesFacturasDescuentosLineas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturasDescuentosLineas() {
		return this.jComboBoxTiposAccionesFacturasDescuentosLineas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturasDescuentosLineas(
			JComboBox jComboBoxTiposRelacionesFacturasDescuentosLineas) {
		this.jComboBoxTiposRelacionesFacturasDescuentosLineas = jComboBoxTiposRelacionesFacturasDescuentosLineas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturasDescuentosLineas(
			JComboBox jComboBoxTiposAccionesFacturasDescuentosLineas) {
		this.jComboBoxTiposAccionesFacturasDescuentosLineas = jComboBoxTiposAccionesFacturasDescuentosLineas;
	}
	
	public void setBorderResaltarTiposRelacionesFacturasDescuentosLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasDescuentosLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFacturasDescuentosLineas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFacturasDescuentosLineas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasDescuentosLineas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFacturasDescuentosLineas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFacturasDescuentosLineas() {
	//	return jCheckBoxConGraficoDinamicoFacturasDescuentosLineas;
	//}

	//public void setjCheckBoxConGraficoDinamicoFacturasDescuentosLineas(
	//		JCheckBox jCheckBoxConGraficoDinamicoFacturasDescuentosLineas) {
	//	this.jCheckBoxConGraficoDinamicoFacturasDescuentosLineas = jCheckBoxConGraficoDinamicoFacturasDescuentosLineas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFacturasDescuentosLineas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFacturasDescuentosLineas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFacturasDescuentosLineas .setBorder(borderResaltar);		
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
		this.facturasdescuentoslineasSessionBean=new FacturasDescuentosLineasSessionBean();
		
		this.facturasdescuentoslineasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturasdescuentoslineasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FacturasDescuentosLineasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FacturasDescuentosLineasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturasDescuentosLineasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturasDescuentosLineasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturasDescuentosLineasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Facturas Descuentos Lineas MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
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
		
		FacturasDescuentosLineasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FacturasDescuentosLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFacturasDescuentosLineas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFacturasDescuentosLineas,this.jTtoolBarFacturasDescuentosLineas,
							"nuevo","nuevo","Nuevo"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFacturasDescuentosLineas,this.jTtoolBarFacturasDescuentosLineas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFacturasDescuentosLineas,this.jTtoolBarFacturasDescuentosLineas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFacturasDescuentosLineas,this.jTtoolBarFacturasDescuentosLineas,
							"duplicar","duplicar","Duplicar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFacturasDescuentosLineas,this.jTtoolBarFacturasDescuentosLineas,
							"copiar","copiar","Copiar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFacturasDescuentosLineas,this.jTtoolBarFacturasDescuentosLineas,
							"ver_form","ver_form","Ver"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturasDescuentosLineas,this.jTtoolBarFacturasDescuentosLineas,
							"recargar","recargar","Buscar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturasDescuentosLineas,this.jTtoolBarFacturasDescuentosLineas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturasDescuentosLineas,this.jTtoolBarFacturasDescuentosLineas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFacturasDescuentosLineas,this.jTtoolBarFacturasDescuentosLineas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFacturasDescuentosLineas,this.jTtoolBarFacturasDescuentosLineas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFacturasDescuentosLineas,this.jTtoolBarFacturasDescuentosLineas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFacturasDescuentosLineas,this.jTtoolBarFacturasDescuentosLineas,
							"cerrar","cerrar","Salir"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFacturasDescuentosLineas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFacturasDescuentosLineas;
			
				this.jButtonProcesarInformacionToolBarFacturasDescuentosLineas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFacturasDescuentosLineas;
				
		//protected JButton jButtonModificarToolBarFacturasDescuentosLineas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFacturasDescuentosLineas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFacturasDescuentosLineas=new JMenuMe("General");
		this.jmenuArchivoFacturasDescuentosLineas=new JMenuMe("Archivo");
		this.jmenuAccionesFacturasDescuentosLineas=new JMenuMe("Acciones");
		this.jmenuDatosFacturasDescuentosLineas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturasDescuentosLineas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturasDescuentosLineas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturasDescuentosLineas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFacturasDescuentosLineas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFacturasDescuentosLineas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFacturasDescuentosLineas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFacturasDescuentosLineas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFacturasDescuentosLineas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFacturasDescuentosLineas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFacturasDescuentosLineas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturasDescuentosLineas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturasDescuentosLineas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFacturasDescuentosLineas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFacturasDescuentosLineas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFacturasDescuentosLineas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFacturasDescuentosLineas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFacturasDescuentosLineas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFacturasDescuentosLineas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFacturasDescuentosLineas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFacturasDescuentosLineas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFacturasDescuentosLineas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturasDescuentosLineas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturasDescuentosLineas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturasDescuentosLineas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFacturasDescuentosLineas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFacturasDescuentosLineas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFacturasDescuentosLineas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFacturasDescuentosLineas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFacturasDescuentosLineas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFacturasDescuentosLineas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFacturasDescuentosLineas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFacturasDescuentosLineas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFacturasDescuentosLineas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFacturasDescuentosLineas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFacturasDescuentosLineas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFacturasDescuentosLineas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFacturasDescuentosLineas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFacturasDescuentosLineas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFacturasDescuentosLineas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturasDescuentosLineas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturasDescuentosLineas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturasDescuentosLineas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFacturasDescuentosLineas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFacturasDescuentosLineas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFacturasDescuentosLineas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturasDescuentosLineas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturasDescuentosLineas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturasDescuentosLineas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFacturasDescuentosLineas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFacturasDescuentosLineas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFacturasDescuentosLineas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFacturasDescuentosLineas.add(this.jMenuItemCerrarFacturasDescuentosLineas);
			
			this.jmenuAccionesFacturasDescuentosLineas.add(this.jMenuItemNuevoFacturasDescuentosLineas);
			this.jmenuAccionesFacturasDescuentosLineas.add(this.jMenuItemNuevoGuardarCambiosFacturasDescuentosLineas);
			this.jmenuAccionesFacturasDescuentosLineas.add(this.jMenuItemNuevoRelacionesFacturasDescuentosLineas);
			this.jmenuAccionesFacturasDescuentosLineas.add(this.jMenuItemGuardarCambiosTablaFacturasDescuentosLineas);		
			this.jmenuAccionesFacturasDescuentosLineas.add(this.jMenuItemDuplicarFacturasDescuentosLineas);		
			this.jmenuAccionesFacturasDescuentosLineas.add(this.jMenuItemCopiarFacturasDescuentosLineas);		
			this.jmenuAccionesFacturasDescuentosLineas.add(this.jMenuItemVerFormFacturasDescuentosLineas);		
			
			this.jmenuDatosFacturasDescuentosLineas.add(this.jMenuItemRecargarInformacionFacturasDescuentosLineas);				
			this.jmenuDatosFacturasDescuentosLineas.add(this.jMenuItemAnterioresFacturasDescuentosLineas);				
			this.jmenuDatosFacturasDescuentosLineas.add(this.jMenuItemSiguientesFacturasDescuentosLineas);				
			this.jmenuDatosFacturasDescuentosLineas.add(this.jMenuItemAbrirOrderByFacturasDescuentosLineas);				
			this.jmenuDatosFacturasDescuentosLineas.add(this.jMenuItemMostrarOcultarFacturasDescuentosLineas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFacturasDescuentosLineas.add(this.jMenuItemGuardarCambiosFacturasDescuentosLineas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFacturasDescuentosLineas.add(this.jmenuArchivoFacturasDescuentosLineas);		
			this.jmenuBarFacturasDescuentosLineas.add(this.jmenuAccionesFacturasDescuentosLineas);		
			this.jmenuBarFacturasDescuentosLineas.add(this.jmenuDatosFacturasDescuentosLineas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFacturasDescuentosLineas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFacturasDescuentosLineas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setToolTipText("Buscar Por Vendedor Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaFacturasDescuentosLineasFacturasDescuentosLineas= new JButtonMe();
		this.jButtonBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setText("Buscar");
		this.jButtonBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setToolTipText("Buscar Por Vendedor Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaFacturasDescuentosLineasFacturasDescuentosLineas,"buscar_button","Buscar Por Vendedor Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaFacturasDescuentosLineasFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas = new JLabelMe();
		jLabelid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setText("Vendedor :");
		jLabelid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setToolTipText("Vendedor");
		jLabelid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas= new JComboBoxMe();
		jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasFacturasDescuentosLineas=new JTabbedPane();


		this.jTabbedPaneBusquedasFacturasDescuentosLineas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasFacturasDescuentosLineas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasFacturasDescuentosLineas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFacturasDescuentosLineas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFacturasDescuentosLineas = new FacturasDescuentosLineasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Facturas Descuentos Lineas DATOS");
			this.jInternalFrameDetalleFormFacturasDescuentosLineas = new FacturasDescuentosLineasDetalleFormJInternalFrame(jDesktopPane,this.facturasdescuentoslineasSessionBean.getConGuardarRelaciones(),this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas = null;//new FacturasDescuentosLineasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturasDescuentosLineas= new GridBagLayout();
		
		
		this.jTableDatosFacturasDescuentosLineas = new JTableMe();      
		
		String sToolTipFacturasDescuentosLineas="";
		sToolTipFacturasDescuentosLineas=FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturasDescuentosLineas+="(Facturacion.FacturasDescuentosLineas)";
		}
		
		if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturasDescuentosLineas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFacturasDescuentosLineas.setToolTipText(sToolTipFacturasDescuentosLineas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFacturasDescuentosLineas);
		this.jTableDatosFacturasDescuentosLineas.setAutoCreateRowSorter(true);
		this.jTableDatosFacturasDescuentosLineas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFacturasDescuentosLineas.setRowSelectionAllowed(true);
		this.jTableDatosFacturasDescuentosLineas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFacturasDescuentosLineas = new JButtonMe();
		this.jButtonDuplicarFacturasDescuentosLineas = new JButtonMe();
		this.jButtonCopiarFacturasDescuentosLineas = new JButtonMe();
		this.jButtonVerFormFacturasDescuentosLineas = new JButtonMe();
		this.jButtonNuevoRelacionesFacturasDescuentosLineas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFacturasDescuentosLineas = new JButtonMe();
		this.jButtonCerrarFacturasDescuentosLineas = new JButtonMe();
		
		this.jScrollPanelDatosFacturasDescuentosLineas = new JScrollPane();   
        this.jScrollPanelDatosGeneralFacturasDescuentosLineas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFacturasDescuentosLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Facturas Descuentos Lineas";
		
		if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Descuentos Lineases" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturasDescuentosLineas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturasDescuentosLineas.setToolTipText("Acciones");
        this.jPanelAccionesFacturasDescuentosLineas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFacturasDescuentosLineas=new ReporteDinamicoJInternalFrame(FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFacturasDescuentosLineas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFacturasDescuentosLineas=new ImportacionJInternalFrame(FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFacturasDescuentosLineas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFacturasDescuentosLineas = new JButtonMe();
		
		this.jButtonAbrirOrderByFacturasDescuentosLineas.setText("Orden");
		this.jButtonAbrirOrderByFacturasDescuentosLineas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturasDescuentosLineas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFacturasDescuentosLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturasDescuentosLineas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturasDescuentosLineas,false,this);
			
			//this.cargarOrderByFacturasDescuentosLineas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturasDescuentosLineas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturasDescuentosLineas,true,this);
			
			//this.cargarOrderByFacturasDescuentosLineas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFacturasDescuentosLineas.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosFacturasDescuentosLineas.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosFacturasDescuentosLineas.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosFacturasDescuentosLineas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturasDescuentosLineas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturasDescuentosLineas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFacturasDescuentosLineas.setText("Nuevo");
		this.jButtonDuplicarFacturasDescuentosLineas.setText("Duplicar");
		this.jButtonCopiarFacturasDescuentosLineas.setText("Copiar");
		this.jButtonVerFormFacturasDescuentosLineas.setText("Ver");
		this.jButtonNuevoRelacionesFacturasDescuentosLineas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFacturasDescuentosLineas.setText("Guardar");
		this.jButtonCerrarFacturasDescuentosLineas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturasDescuentosLineas,"nuevo_button","Nuevo",this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFacturasDescuentosLineas,"duplicar_button","Duplicar",this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFacturasDescuentosLineas,"copiar_button","Copiar",this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFacturasDescuentosLineas,"ver_form","Ver",this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFacturasDescuentosLineas,"nuevorelaciones_button","Nuevo Rel",this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturasDescuentosLineas,"guardarcambiostabla_button","Guardar",this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturasDescuentosLineas,"cerrar_button","Salir",this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFacturasDescuentosLineas.setToolTipText("Nuevo"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFacturasDescuentosLineas.setToolTipText("Duplicar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFacturasDescuentosLineas.setToolTipText("Copiar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFacturasDescuentosLineas.setToolTipText("Ver"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFacturasDescuentosLineas.setToolTipText("Nuevo Rel"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFacturasDescuentosLineas.setToolTipText("Guardar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturasDescuentosLineas.setToolTipText("Salir"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturasDescuentosLineas";
		inputMap = this.jButtonNuevoFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturasDescuentosLineas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturasDescuentosLineas"));
		
		//DUPLICAR
		sMapKey = "DuplicarFacturasDescuentosLineas";
		inputMap = this.jButtonDuplicarFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFacturasDescuentosLineas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFacturasDescuentosLineas"));
		
		//COPIAR
		sMapKey = "CopiarFacturasDescuentosLineas";
		inputMap = this.jButtonCopiarFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFacturasDescuentosLineas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFacturasDescuentosLineas"));
		
		//VEr FORM
		sMapKey = "VerFormFacturasDescuentosLineas";
		inputMap = this.jButtonVerFormFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFacturasDescuentosLineas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFacturasDescuentosLineas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFacturasDescuentosLineas";
		inputMap = this.jButtonNuevoRelacionesFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFacturasDescuentosLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFacturasDescuentosLineas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFacturasDescuentosLineas";
		inputMap = this.jButtonModificarFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFacturasDescuentosLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFacturasDescuentosLineas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFacturasDescuentosLineas";
		inputMap = this.jButtonCerrarFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturasDescuentosLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturasDescuentosLineas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturasDescuentosLineas";
		inputMap = this.jButtonGuardarCambiosTablaFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturasDescuentosLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturasDescuentosLineas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFacturasDescuentosLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFacturasDescuentosLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFacturasDescuentosLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FacturasDescuentosLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FacturasDescuentosLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FacturasDescuentosLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FacturasDescuentosLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FacturasDescuentosLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFacturasDescuentosLineas.setName("jPanelParametrosReportesFacturasDescuentosLineas"); 
		
		this.jPanelParametrosReportesAccionesFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFacturasDescuentosLineas.setName("jPanelParametrosReportesAccionesFacturasDescuentosLineas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFacturasDescuentosLineas = new JButtonMe();
		this.jButtonRecargarInformacionFacturasDescuentosLineas.setText("Buscar");
		this.jButtonRecargarInformacionFacturasDescuentosLineas.setToolTipText("Buscar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFacturasDescuentosLineas,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionFacturasDescuentosLineas.setVisible(false);
		
		
		this.jButtonProcesarInformacionFacturasDescuentosLineas = new JButtonMe();
		this.jButtonProcesarInformacionFacturasDescuentosLineas.setText("Procesar");
		this.jButtonProcesarInformacionFacturasDescuentosLineas.setToolTipText("Procesar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFacturasDescuentosLineas.setVisible(false);
			
		this.jButtonProcesarInformacionFacturasDescuentosLineas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturasDescuentosLineas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturasDescuentosLineas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFacturasDescuentosLineas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturasDescuentosLineas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFacturasDescuentosLineas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFacturasDescuentosLineas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturasDescuentosLineas.setText("TIPO");       
		this.jComboBoxTiposReportesFacturasDescuentosLineas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFacturasDescuentosLineas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturasDescuentosLineas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFacturasDescuentosLineas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFacturasDescuentosLineas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFacturasDescuentosLineas.setText("Paginacion");
		this.jComboBoxTiposPaginacionFacturasDescuentosLineas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFacturasDescuentosLineas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFacturasDescuentosLineas.setText("Accion");
		this.jComboBoxTiposRelacionesFacturasDescuentosLineas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFacturasDescuentosLineas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturasDescuentosLineas.setText("Accion");
		this.jComboBoxTiposAccionesFacturasDescuentosLineas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFacturasDescuentosLineas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFacturasDescuentosLineas.setText("Accion");
		this.jComboBoxTiposSeleccionarFacturasDescuentosLineas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFacturasDescuentosLineas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFacturasDescuentosLineas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturasDescuentosLineas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturasDescuentosLineas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFacturasDescuentosLineas = new JLabelMe();
		
		this.jLabelAccionesFacturasDescuentosLineas.setText("Acciones");		
		this.jLabelAccionesFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFacturasDescuentosLineas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFacturasDescuentosLineas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFacturasDescuentosLineas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFacturasDescuentosLineas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFacturasDescuentosLineas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFacturasDescuentosLineas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFacturasDescuentosLineas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFacturasDescuentosLineas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFacturasDescuentosLineas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFacturasDescuentosLineas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFacturasDescuentosLineas.setText("Graf.");
		this.jCheckBoxConGraficoReporteFacturasDescuentosLineas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFacturasDescuentosLineas = new JButtonMe();
		//this.jButtonAnterioresFacturasDescuentosLineas.setText("<<");
        this.jButtonAnterioresFacturasDescuentosLineas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFacturasDescuentosLineas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFacturasDescuentosLineas = new JButtonMe();
		//this.jButtonSiguientesFacturasDescuentosLineas.setText(">>");
        this.jButtonSiguientesFacturasDescuentosLineas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFacturasDescuentosLineas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFacturasDescuentosLineas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFacturasDescuentosLineas.setText("Nue");
        this.jButtonNuevoGuardarCambiosFacturasDescuentosLineas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFacturasDescuentosLineas,"nuevoguardarcambios_button","Nue",this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFacturasDescuentosLineas";
		inputMap = this.jButtonNuevoGuardarCambiosFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFacturasDescuentosLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFacturasDescuentosLineas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFacturasDescuentosLineas";
		inputMap = this.jButtonRecargarInformacionFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFacturasDescuentosLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFacturasDescuentosLineas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFacturasDescuentosLineas";
		inputMap = this.jButtonSiguientesFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFacturasDescuentosLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFacturasDescuentosLineas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFacturasDescuentosLineas";
		inputMap = this.jButtonAnterioresFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFacturasDescuentosLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFacturasDescuentosLineas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFacturasDescuentosLineas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFacturasDescuentosLineas.setMinimumSize(new Dimension(this.getWidth(),FacturasDescuentosLineasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturasDescuentosLineasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturasDescuentosLineas.setMaximumSize(new Dimension(this.getWidth(),FacturasDescuentosLineasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturasDescuentosLineasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturasDescuentosLineas.setPreferredSize(new Dimension(this.getWidth(),FacturasDescuentosLineasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturasDescuentosLineasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFacturasDescuentosLineas = new GridBagLayout();

			this.jPanelPaginacionFacturasDescuentosLineas.setLayout(gridaBagLayoutPaginacionFacturasDescuentosLineas);						
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFacturasDescuentosLineas.add(this.jButtonAnterioresFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
					
						
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
			
			this.jPanelPaginacionFacturasDescuentosLineas.add(this.jButtonNuevoGuardarCambiosFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
						
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
			this.jPanelPaginacionFacturasDescuentosLineas.add(this.jButtonSiguientesFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = 1;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturasDescuentosLineas.add(this.jButtonNuevoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
						
			
			
			if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
				this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFacturasDescuentosLineas.gridy = 1;
				this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFacturasDescuentosLineas.add(this.jButtonGuardarCambiosTablaFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
			}
			
			
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = 1;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturasDescuentosLineas.add(this.jButtonDuplicarFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = 1;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturasDescuentosLineas.add(this.jButtonCopiarFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = 1;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturasDescuentosLineas.add(this.jButtonVerFormFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = 1;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFacturasDescuentosLineas.add(this.jButtonCerrarFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
		
		
		this.jButtonRecargarInformacionFacturasDescuentosLineas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturasDescuentosLineas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturasDescuentosLineas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFacturasDescuentosLineas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturasDescuentosLineas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturasDescuentosLineas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFacturasDescuentosLineas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturasDescuentosLineas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturasDescuentosLineas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFacturasDescuentosLineas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturasDescuentosLineas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturasDescuentosLineas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFacturasDescuentosLineas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturasDescuentosLineas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturasDescuentosLineas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFacturasDescuentosLineas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturasDescuentosLineas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturasDescuentosLineas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFacturasDescuentosLineas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturasDescuentosLineas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturasDescuentosLineas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFacturasDescuentosLineas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturasDescuentosLineas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturasDescuentosLineas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFacturasDescuentosLineas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturasDescuentosLineas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturasDescuentosLineas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFacturasDescuentosLineas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturasDescuentosLineas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturasDescuentosLineas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFacturasDescuentosLineas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturasDescuentosLineas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturasDescuentosLineas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFacturasDescuentosLineas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturasDescuentosLineas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturasDescuentosLineas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFacturasDescuentosLineas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFacturasDescuentosLineas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FacturasDescuentosLineas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FacturasDescuentosLineas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FacturasDescuentosLineas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FacturasDescuentosLineas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFacturasDescuentosLineas.setLayout(gridaBagParametrosReportesFacturasDescuentosLineas);
			this.jPanelParametrosReportesAccionesFacturasDescuentosLineas.setLayout(gridaBagParametrosReportesAccionesFacturasDescuentosLineas);
			
			
			this.jPanelParametrosAuxiliar1FacturasDescuentosLineas.setLayout(gridaBagParametrosAuxiliar1FacturasDescuentosLineas);
			this.jPanelParametrosAuxiliar2FacturasDescuentosLineas.setLayout(gridaBagParametrosAuxiliar2FacturasDescuentosLineas);
			this.jPanelParametrosAuxiliar3FacturasDescuentosLineas.setLayout(gridaBagParametrosAuxiliar3FacturasDescuentosLineas);
			this.jPanelParametrosAuxiliar4FacturasDescuentosLineas.setLayout(gridaBagParametrosAuxiliar4FacturasDescuentosLineas);
			//this.jPanelParametrosAuxiliar5FacturasDescuentosLineas.setLayout(gridaBagParametrosAuxiliar2FacturasDescuentosLineas);			
			
			
			
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturasDescuentosLineas.add(this.jButtonRecargarInformacionFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturasDescuentosLineas.add(this.jComboBoxTiposPaginacionFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturasDescuentosLineas.add(this.jCheckBoxConAltoMaximoTablaFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturasDescuentosLineas.add(this.jComboBoxTiposArchivosReportesFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasDescuentosLineas.add(this.jPanelParametrosAuxiliar1FacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FacturasDescuentosLineas.add(this.jComboBoxTiposReportesFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);																		
			
			
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FacturasDescuentosLineas.add(this.jComboBoxTiposGraficosReportesFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasDescuentosLineas.add(this.jPanelParametrosAuxiliar4FacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasDescuentosLineas.add(this.jComboBoxTiposReportesFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturasDescuentosLineas.add(this.jCheckBoxGenerarReporteFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasDescuentosLineas.add(this.jPanelParametrosAuxiliar2FacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturasDescuentosLineas.add(this.jLabelAccionesFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
				this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFacturasDescuentosLineas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFacturasDescuentosLineas.add(this.jButtonAbrirOrderByFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturasDescuentosLineas.add(this.jComboBoxTiposSeleccionarFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);			
			
			
			/*
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturasDescuentosLineas.add(this.jCheckBoxSeleccionarTodosFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturasDescuentosLineas.add(this.jCheckBoxConGraficoReporteFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturasDescuentosLineas.add(this.jCheckBoxSeleccionarTodosFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);															
				
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturasDescuentosLineas.add(this.jCheckBoxSeleccionadosFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);															
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturasDescuentosLineas.add(this.jCheckBoxConGraficoReporteFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasDescuentosLineas.add(this.jPanelParametrosAuxiliar3FacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturasDescuentosLineas.add(this.jComboBoxTiposAccionesFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFacturasDescuentosLineas = new GridBagLayout();

			this.jScrollPanelDatosFacturasDescuentosLineas.setLayout(gridaBagLayoutDatosFacturasDescuentosLineas);
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
			
			this.jScrollPanelDatosFacturasDescuentosLineas.add(this.jTableDatosFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFacturasDescuentosLineas.setViewportView(this.jTableDatosFacturasDescuentosLineas);
		this.jTableDatosFacturasDescuentosLineas.setFillsViewportHeight(true);
		this.jTableDatosFacturasDescuentosLineas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFacturasDescuentosLineas= new GridBagLayout();
		this.jPanelAccionesFacturasDescuentosLineas.setLayout(gridaBagLayoutAccionesFacturasDescuentosLineas);
		
		
		/*	
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
			
		this.jPanelAccionesFacturasDescuentosLineas.add(this.jButtonNuevoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaFacturasDescuentosLineasFacturasDescuentosLineas= new GridBagLayout();
		gridaBagLayoutBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setLayout(gridaBagLayoutBusquedaFacturasDescuentosLineasFacturasDescuentosLineas);

		gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
		jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.add(jLabelid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas, gridBagConstraintsFacturasDescuentosLineas);

		gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
		jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.add(jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas, gridBagConstraintsFacturasDescuentosLineas);


		gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasDescuentosLineas.gridy = 1;
		gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
		jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.add(jLabelfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas, gridBagConstraintsFacturasDescuentosLineas);

		gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasDescuentosLineas.gridy = 1;
		gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
		jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.add(jDateChooserfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas, gridBagConstraintsFacturasDescuentosLineas);


		gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasDescuentosLineas.gridy = 2;
		gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
		jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.add(jLabelfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas, gridBagConstraintsFacturasDescuentosLineas);

		gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasDescuentosLineas.gridy = 2;
		gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
		jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.add(jDateChooserfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas, gridBagConstraintsFacturasDescuentosLineas);

		gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasDescuentosLineas.gridy = 3;
		gridBagConstraintsFacturasDescuentosLineas.gridx =1;
		jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.add(jButtonBusquedaFacturasDescuentosLineasFacturasDescuentosLineas, gridBagConstraintsFacturasDescuentosLineas);

		jTabbedPaneBusquedasFacturasDescuentosLineas.addTab("1.-Por Vendedor Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas);
		jTabbedPaneBusquedasFacturasDescuentosLineas.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturasDescuentosLineas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();						
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;		
			//this.gridBagConstraintsFacturasDescuentosLineas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;		
		//this.gridBagConstraintsFacturasDescuentosLineas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFacturasDescuentosLineas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;		
			this.gridBagConstraintsFacturasDescuentosLineas.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);								
		
		
		/*
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		*/		
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx =0;
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturasDescuentosLineas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
				
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FacturasDescuentosLineasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFacturasDescuentosLineas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturasDescuentosLineas = new GridBagLayout();
			this.jPanelBusquedasParametrosFacturasDescuentosLineas.setLayout(gridaBagLayoutBusquedasParametrosFacturasDescuentosLineas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFacturasDescuentosLineas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturasDescuentosLineas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturasDescuentosLineas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturasDescuentosLineas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
			
			
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
			
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFacturasDescuentosLineas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFacturasDescuentosLineas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFacturasDescuentosLineas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFacturasDescuentosLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFacturasDescuentosLineas.setName("jPanelReporteDinamicoFacturasDescuentosLineas"); 
		
		this.jPanelReporteDinamicoFacturasDescuentosLineas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturasDescuentosLineas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturasDescuentosLineas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFacturasDescuentosLineas.setLayout(gridaBagLayoutReporteDinamicoFacturasDescuentosLineas);
		
		
		this.jInternalFrameReporteDinamicoFacturasDescuentosLineas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFacturasDescuentosLineas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturasDescuentosLineas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setResizable(true);
	    this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setClosable(true);
	    this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFacturasDescuentosLineas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturasDescuentosLineas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturasDescuentosLineas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Descuentos Lineases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFacturasDescuentosLineas = new JLabelMe();

		this.jLabelColumnasSelectReporteFacturasDescuentosLineas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jLabelColumnasSelectReporteFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFacturasDescuentosLineas = new JList<Reporte>();
		this.jListColumnasSelectReporteFacturasDescuentosLineas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFacturasDescuentosLineas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFacturasDescuentosLineas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturasDescuentosLineas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturasDescuentosLineas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFacturasDescuentosLineas=new JScrollPane(this.jListColumnasSelectReporteFacturasDescuentosLineas);
			
			this.jScrollColumnasSelectReporteFacturasDescuentosLineas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturasDescuentosLineas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturasDescuentosLineas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jListColumnasSelectReporteFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jScrollColumnasSelectReporteFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFacturasDescuentosLineas = new JLabelMe();

		this.jLabelRelacionesSelectReporteFacturasDescuentosLineas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFacturasDescuentosLineas = new JList<Reporte>();
		this.jListRelacionesSelectReporteFacturasDescuentosLineas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFacturasDescuentosLineas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFacturasDescuentosLineas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturasDescuentosLineas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturasDescuentosLineas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFacturasDescuentosLineas=new JScrollPane(this.jListRelacionesSelectReporteFacturasDescuentosLineas);
			
			this.jScrollRelacionesSelectReporteFacturasDescuentosLineas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturasDescuentosLineas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturasDescuentosLineas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFacturasDescuentosLineas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFacturasDescuentosLineas = new JComboBoxMe();
		this.jListColumnasValoresGraficoFacturasDescuentosLineas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFacturasDescuentosLineas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFacturasDescuentosLineas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFacturasDescuentosLineas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturasDescuentosLineas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturasDescuentosLineas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFacturasDescuentosLineas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFacturasDescuentosLineas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFacturasDescuentosLineas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturasDescuentosLineas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturasDescuentosLineas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFacturasDescuentosLineas = new JLabelMe();

		this.jLabelConGraficoDinamicoFacturasDescuentosLineas.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jLabelConGraficoDinamicoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFacturasDescuentosLineas = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFacturasDescuentosLineas.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFacturasDescuentosLineas.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFacturasDescuentosLineas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturasDescuentosLineas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturasDescuentosLineas.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jCheckBoxConGraficoDinamicoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFacturasDescuentosLineas = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFacturasDescuentosLineas.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jLabelColumnaCategoriaGraficoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFacturasDescuentosLineas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturasDescuentosLineas.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFacturasDescuentosLineas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFacturasDescuentosLineas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturasDescuentosLineas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturasDescuentosLineas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jComboBoxColumnaCategoriaGraficoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFacturasDescuentosLineas = new JLabelMe();

		this.jLabelColumnaCategoriaValorFacturasDescuentosLineas.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jLabelColumnaCategoriaValorFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFacturasDescuentosLineas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFacturasDescuentosLineas.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFacturasDescuentosLineas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFacturasDescuentosLineas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturasDescuentosLineas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturasDescuentosLineas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jComboBoxColumnaCategoriaValorFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFacturasDescuentosLineas = new JLabelMe();

		this.jLabelColumnasValoresGraficoFacturasDescuentosLineas.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jLabelColumnasValoresGraficoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFacturasDescuentosLineas = new JList<Reporte>();
		this.jListColumnasValoresGraficoFacturasDescuentosLineas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFacturasDescuentosLineas.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFacturasDescuentosLineas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturasDescuentosLineas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturasDescuentosLineas.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFacturasDescuentosLineas=new JScrollPane(this.jListColumnasValoresGraficoFacturasDescuentosLineas);
			
			this.jScrollColumnasValoresGraficoFacturasDescuentosLineas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturasDescuentosLineas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturasDescuentosLineas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jListColumnasSelectReporteFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jScrollColumnasValoresGraficoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFacturasDescuentosLineas = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFacturasDescuentosLineas.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jLabelTiposGraficosReportesDinamicoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFacturasDescuentosLineas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturasDescuentosLineas.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFacturasDescuentosLineas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFacturasDescuentosLineas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturasDescuentosLineas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturasDescuentosLineas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jComboBoxTiposGraficosReportesDinamicoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFacturasDescuentosLineas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFacturasDescuentosLineas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jLabelGenerarExcelReporteDinamicoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFacturasDescuentosLineas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFacturasDescuentosLineas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFacturasDescuentosLineas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFacturasDescuentosLineas.setToolTipText("Generar EXCEL"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jButtonGenerarExcelReporteDinamicoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jComboBoxTiposReportesDinamicoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFacturasDescuentosLineas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFacturasDescuentosLineas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jLabelTiposArchivoReporteDinamicoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jComboBoxTiposArchivosReportesDinamicoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFacturasDescuentosLineas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFacturasDescuentosLineas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFacturasDescuentosLineas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFacturasDescuentosLineas.setToolTipText("Generar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jButtonGenerarReporteDinamicoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFacturasDescuentosLineas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFacturasDescuentosLineas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFacturasDescuentosLineas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFacturasDescuentosLineas.setToolTipText("Cancelar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturasDescuentosLineas.add(this.jButtonCerrarReporteDinamicoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFacturasDescuentosLineas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFacturasDescuentosLineas= new JScrollPane(jPanelReporteDinamicoFacturasDescuentosLineas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFacturasDescuentosLineas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturasDescuentosLineas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturasDescuentosLineas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Descuentos Lineases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFacturasDescuentosLineas);
		this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getContentPane().add(this.jScrollPanelReporteDinamicoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFacturasDescuentosLineas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFacturasDescuentosLineas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFacturasDescuentosLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFacturasDescuentosLineas.setName("jPanelImportacionFacturasDescuentosLineas"); 
		
		this.jPanelImportacionFacturasDescuentosLineas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturasDescuentosLineas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturasDescuentosLineas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFacturasDescuentosLineas.setLayout(gridaBagLayoutImportacionFacturasDescuentosLineas);
		
		
		this.jInternalFrameImportacionFacturasDescuentosLineas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFacturasDescuentosLineas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFacturasDescuentosLineas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturasDescuentosLineas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFacturasDescuentosLineas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturasDescuentosLineas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturasDescuentosLineas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFacturasDescuentosLineas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturasDescuentosLineas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturasDescuentosLineas.setResizable(true);
	    this.jInternalFrameImportacionFacturasDescuentosLineas.setClosable(true);
	    this.jInternalFrameImportacionFacturasDescuentosLineas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFacturasDescuentosLineas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturasDescuentosLineas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturasDescuentosLineas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFacturasDescuentosLineas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturasDescuentosLineas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturasDescuentosLineas.setResizable(true);
	    this.jInternalFrameImportacionFacturasDescuentosLineas.setClosable(true);
	    this.jInternalFrameImportacionFacturasDescuentosLineas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFacturasDescuentosLineas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturasDescuentosLineas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturasDescuentosLineas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Descuentos Lineases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFacturasDescuentosLineas = new JLabelMe();

		this.jLabelArchivoImportacionFacturasDescuentosLineas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturasDescuentosLineas.add(this.jLabelArchivoImportacionFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFacturasDescuentosLineas = new JFileChooser();		
		this.jFileChooserImportacionFacturasDescuentosLineas.setToolTipText("ESCOGER ARCHIVO"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFacturasDescuentosLineas = new JButtonMe();
		this.jButtonAbrirImportacionFacturasDescuentosLineas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFacturasDescuentosLineas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFacturasDescuentosLineas.setToolTipText("Generar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturasDescuentosLineas.add(this.jButtonAbrirImportacionFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFacturasDescuentosLineas = new JLabelMe();

		this.jLabelPathArchivoImportacionFacturasDescuentosLineas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturasDescuentosLineas.add(this.jLabelPathArchivoImportacionFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFacturasDescuentosLineas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFacturasDescuentosLineas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturasDescuentosLineas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturasDescuentosLineas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturasDescuentosLineas.add(this.jTextFieldPathArchivoImportacionFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFacturasDescuentosLineas = new JButtonMe();
		this.jButtonGenerarImportacionFacturasDescuentosLineas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFacturasDescuentosLineas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFacturasDescuentosLineas.setToolTipText("Generar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturasDescuentosLineas.add(this.jButtonGenerarImportacionFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFacturasDescuentosLineas = new JButtonMe();
		this.jButtonCerrarImportacionFacturasDescuentosLineas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFacturasDescuentosLineas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFacturasDescuentosLineas.setToolTipText("Cancelar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturasDescuentosLineas.add(this.jButtonCerrarImportacionFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFacturasDescuentosLineas = new GridBagLayout();
		
		this.jScrollPanelImportacionFacturasDescuentosLineas= new JScrollPane(jPanelImportacionFacturasDescuentosLineas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy =iPosYImportacion;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx =iPosXImportacion;
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFacturasDescuentosLineas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFacturasDescuentosLineas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFacturasDescuentosLineas);
		this.jInternalFrameImportacionFacturasDescuentosLineas.getContentPane().add(this.jScrollPanelImportacionFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFacturasDescuentosLineas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFacturasDescuentosLineas = new JButtonMe();
			this.jButtonAbrirOrderByFacturasDescuentosLineas.setText("Orden");
			this.jButtonAbrirOrderByFacturasDescuentosLineas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturasDescuentosLineas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFacturasDescuentosLineas";
			inputMap = this.jButtonAbrirOrderByFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFacturasDescuentosLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFacturasDescuentosLineas"));
		
		
			GridBagLayout gridaBagLayoutOrderByFacturasDescuentosLineas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFacturasDescuentosLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFacturasDescuentosLineas.setName("jPanelOrderByFacturasDescuentosLineas"); 
			
			this.jPanelOrderByFacturasDescuentosLineas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturasDescuentosLineas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturasDescuentosLineas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFacturasDescuentosLineas.setLayout(gridaBagLayoutOrderByFacturasDescuentosLineas);
			
			
			this.jTableDatosFacturasDescuentosLineasOrderBy = new JTableMe();        
			this.jTableDatosFacturasDescuentosLineasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFacturasDescuentosLineasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFacturasDescuentosLineasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFacturasDescuentosLineasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFacturasDescuentosLineasOrderBy.setViewportView(this.jTableDatosFacturasDescuentosLineasOrderBy);
			this.jTableDatosFacturasDescuentosLineasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFacturasDescuentosLineasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFacturasDescuentosLineas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFacturasDescuentosLineas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFacturasDescuentosLineas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFacturasDescuentosLineas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFacturasDescuentosLineas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFacturasDescuentosLineas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFacturasDescuentosLineas.setTitle("Orden");
			this.jInternalFrameOrderByFacturasDescuentosLineas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFacturasDescuentosLineas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFacturasDescuentosLineas.setResizable(true);
			this.jInternalFrameOrderByFacturasDescuentosLineas.setClosable(true);
			this.jInternalFrameOrderByFacturasDescuentosLineas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFacturasDescuentosLineas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturasDescuentosLineas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturasDescuentosLineas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Descuentos Lineases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFacturasDescuentosLineas.ipady =150;
				
			this.jPanelOrderByFacturasDescuentosLineas.add(jScrollPanelDatosFacturasDescuentosLineasOrderBy, this.gridBagConstraintsFacturasDescuentosLineas);//this.jTableDatosFacturasDescuentosLineasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFacturasDescuentosLineas = new JButtonMe();
			this.jButtonCerrarOrderByFacturasDescuentosLineas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFacturasDescuentosLineas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFacturasDescuentosLineas.setToolTipText("Cancelar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFacturasDescuentosLineas.add(this.jButtonCerrarOrderByFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFacturasDescuentosLineas = new GridBagLayout();
			
			this.jScrollPanelOrderByFacturasDescuentosLineas= new JScrollPane(jPanelOrderByFacturasDescuentosLineas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.gridy =iPosYOrderBy;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFacturasDescuentosLineas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFacturasDescuentosLineas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFacturasDescuentosLineas);
			
			this.jInternalFrameOrderByFacturasDescuentosLineas.getContentPane().add(this.jScrollPanelOrderByFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);			
		
		} else {
			this.jButtonAbrirOrderByFacturasDescuentosLineas = new JButtonMe();
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
		int iWidthTableCalculado=0;//3030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.facturasdescuentoslineasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosFacturasDescuentosLineas.getRowHeight();//FacturasDescuentosLineasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FacturasDescuentosLineasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturasDescuentosLineas.isSelected()) {
					iHeightTable=FacturasDescuentosLineasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturasDescuentosLineasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturasDescuentosLineasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FacturasDescuentosLineasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturasDescuentosLineas.isSelected()) {
					iHeightTable=FacturasDescuentosLineasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturasDescuentosLineasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturasDescuentosLineasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFacturasDescuentosLineas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturasDescuentosLineas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturasDescuentosLineas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFacturasDescuentosLineas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturasDescuentosLineas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturasDescuentosLineas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFacturasDescuentosLineas!=null && this.jInternalFrameOrderByFacturasDescuentosLineas.getjTableDatosOrderBy()!=null) {
			//if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFacturasDescuentosLineas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFacturasDescuentosLineas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFacturasDescuentosLineas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFacturasDescuentosLineas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFacturasDescuentosLineas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFacturasDescuentosLineas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFacturasDescuentosLineas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFacturasDescuentosLineas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturasDescuentosLineas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturasDescuentosLineas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=facturasdescuentoslineasLogic.getFacturasDescuentosLineass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturasdescuentoslineass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FacturasDescuentosLineas> TraerFacturasDescuentosLineasBeans(List<FacturasDescuentosLineas> facturasdescuentoslineass,ArrayList<Classe> classes)throws Exception {
		try {
			for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineass) {
					
				if(!(FacturasDescuentosLineasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FacturasDescuentosLineasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					facturasdescuentoslineas.setsDetalleGeneralEntityReporte(FacturasDescuentosLineasConstantesFunciones.getFacturasDescuentosLineasDescripcion(facturasdescuentoslineas));
										
						
					
						
					
				} else  {
							
					//facturasdescuentoslineas.setsDetalleGeneralEntityReporte(facturasdescuentoslineas.getsDetalleGeneralEntityReporte());
										
				}
				
				//facturasdescuentoslineasbeans.add(facturasdescuentoslineasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return facturasdescuentoslineass;
    }
	//PARA REPORTES FIN
}
