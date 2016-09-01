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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.ComprobanteTarjetaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class ComprobanteTarjetaJInternalFrame extends ComprobanteTarjetaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarComprobanteTarjeta;
	
	protected JMenuBar jmenuBarComprobanteTarjeta;
	
	protected JMenu jmenuComprobanteTarjeta;
	protected JMenu jmenuDatosComprobanteTarjeta;
	protected JMenu jmenuArchivoComprobanteTarjeta;
	protected JMenu jmenuAccionesComprobanteTarjeta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosComprobanteTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComprobanteTarjeta;	
	protected GridBagConstraints gridBagConstraintsComprobanteTarjeta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ComprobanteTarjetaDetalleFormJInternalFrame jInternalFrameDetalleFormComprobanteTarjeta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoComprobanteTarjeta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionComprobanteTarjeta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";
	
	public ComprobanteTarjetaSessionBean comprobantetarjetaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public CajaSessionBean cajaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ComprobanteTarjeta> comprobantetarjetas;		
	public List<ComprobanteTarjeta> comprobantetarjetasEliminados;	
	public List<ComprobanteTarjeta> comprobantetarjetasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByComprobanteTarjeta;		
	protected JButton jButtonAbrirOrderByComprobanteTarjeta;
	
	
	//protected JPanel jPanelOrderByComprobanteTarjeta;
	//public JScrollPane jScrollPanelOrderByComprobanteTarjeta;	
	//protected JButton jButtonCerrarOrderByComprobanteTarjeta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ComprobanteTarjetaLogic comprobantetarjetaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosComprobanteTarjeta;
	public JScrollPane jScrollPanelDatosEdicionComprobanteTarjeta;
	public JScrollPane jScrollPanelDatosGeneralComprobanteTarjeta;
    
	
	
	//public JScrollPane jScrollPanelDatosComprobanteTarjetaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoComprobanteTarjeta;
	//public JScrollPane jScrollPanelImportacionComprobanteTarjeta;
	
	
	
	protected JPanel jPanelAccionesComprobanteTarjeta;
	
    protected JPanel jPanelPaginacionComprobanteTarjeta;
    protected JPanel jPanelParametrosReportesComprobanteTarjeta;
	protected JPanel jPanelParametrosReportesAccionesComprobanteTarjeta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ComprobanteTarjeta;
	protected JPanel jPanelParametrosAuxiliar2ComprobanteTarjeta;
	protected JPanel jPanelParametrosAuxiliar3ComprobanteTarjeta;
	protected JPanel jPanelParametrosAuxiliar4ComprobanteTarjeta;
	//protected JPanel jPanelParametrosAuxiliar5ComprobanteTarjeta;
	
	
	
	//protected JPanel jPanelReporteDinamicoComprobanteTarjeta;
	//protected JPanel jPanelImportacionComprobanteTarjeta;
	
	
	public JTable jTableDatosComprobanteTarjeta;
	
	
	
	//public JTable jTableDatosComprobanteTarjetaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoComprobanteTarjeta;
	protected JButton jButtonDuplicarComprobanteTarjeta;
	protected JButton jButtonCopiarComprobanteTarjeta;
	protected JButton jButtonVerFormComprobanteTarjeta;
	protected JButton jButtonNuevoRelacionesComprobanteTarjeta;
	protected JButton jButtonModificarComprobanteTarjeta;
	
    protected JButton jButtonGuardarCambiosTablaComprobanteTarjeta;
	protected JButton jButtonCerrarComprobanteTarjeta;
	
	
	protected JButton jButtonRecargarInformacionComprobanteTarjeta;
	protected JButton jButtonProcesarInformacionComprobanteTarjeta;
	
	
	protected JButton jButtonAnterioresComprobanteTarjeta;
	protected JButton jButtonSiguientesComprobanteTarjeta;
	protected JButton jButtonNuevoGuardarCambiosComprobanteTarjeta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoComprobanteTarjeta;
	//protected JButton jButtonCerrarReporteDinamicoComprobanteTarjeta;
	//protected JButton jButtonGenerarExcelReporteDinamicoComprobanteTarjeta;	
	
	
	
	//protected JButton jButtonAbrirImportacionComprobanteTarjeta;
	//protected JButton jButtonGenerarImportacionComprobanteTarjeta;
	//protected JButton jButtonCerrarImportacionComprobanteTarjeta;
	//protected JFileChooser jFileChooserImportacionComprobanteTarjeta;
	//protected File fileImportacionComprobanteTarjeta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComprobanteTarjeta;
	protected JButton jButtonDuplicarToolBarComprobanteTarjeta;
	protected JButton jButtonNuevoRelacionesToolBarComprobanteTarjeta;
	
	
	public JButton jButtonGuardarCambiosToolBarComprobanteTarjeta;
	protected JButton jButtonCopiarToolBarComprobanteTarjeta;
	protected JButton jButtonVerFormToolBarComprobanteTarjeta;
	public JButton jButtonGuardarCambiosTablaToolBarComprobanteTarjeta;
	protected JButton jButtonMostrarOcultarTablaToolBarComprobanteTarjeta;
	protected JButton jButtonCerrarToolBarComprobanteTarjeta;
	
	protected JButton jButtonRecargarInformacionToolBarComprobanteTarjeta;
	protected JButton jButtonProcesarInformacionToolBarComprobanteTarjeta;
	protected JButton jButtonAnterioresToolBarComprobanteTarjeta;
	protected JButton jButtonSiguientesToolBarComprobanteTarjeta;
	protected JButton jButtonNuevoGuardarCambiosToolBarComprobanteTarjeta;
	protected JButton jButtonAbrirOrderByToolBarComprobanteTarjeta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComprobanteTarjeta;
	protected JMenuItem jMenuItemDuplicarComprobanteTarjeta;
	protected JMenuItem jMenuItemNuevoRelacionesComprobanteTarjeta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosComprobanteTarjeta;
	protected JMenuItem jMenuItemCopiarComprobanteTarjeta;
	protected JMenuItem jMenuItemVerFormComprobanteTarjeta;
	protected JMenuItem jMenuItemGuardarCambiosTablaComprobanteTarjeta;
	protected JMenuItem jMenuItemCerrarComprobanteTarjeta;
	protected JMenuItem jMenuItemDetalleCerrarComprobanteTarjeta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByComprobanteTarjeta;
	protected JMenuItem jMenuItemDetalleMostarOcultarComprobanteTarjeta;
	
	protected JMenuItem jMenuItemRecargarInformacionComprobanteTarjeta;
	protected JMenuItem jMenuItemProcesarInformacionComprobanteTarjeta;
	protected JMenuItem jMenuItemAnterioresComprobanteTarjeta;
	protected JMenuItem jMenuItemSiguientesComprobanteTarjeta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComprobanteTarjeta;
	protected JMenuItem jMenuItemAbrirOrderByComprobanteTarjeta;
	protected JMenuItem jMenuItemMostrarOcultarComprobanteTarjeta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComprobanteTarjeta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosComprobanteTarjeta;
	protected JCheckBox jCheckBoxSeleccionadosComprobanteTarjeta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaComprobanteTarjeta;
	protected JCheckBox jCheckBoxConGraficoReporteComprobanteTarjeta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesComprobanteTarjeta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesComprobanteTarjeta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoComprobanteTarjeta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoComprobanteTarjeta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesComprobanteTarjeta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionComprobanteTarjeta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComprobanteTarjeta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComprobanteTarjeta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarComprobanteTarjeta;
	protected JTextField jTextFieldValorCampoGeneralComprobanteTarjeta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteComprobanteTarjeta;
	//public JList<Reporte> jListColumnasSelectReporteComprobanteTarjeta;
	//public JScrollPane jScrollColumnasSelectReporteComprobanteTarjeta;
	
	//public JLabel jLabelRelacionesSelectReporteComprobanteTarjeta;
	//public JList<Reporte> jListRelacionesSelectReporteComprobanteTarjeta;
	//public JScrollPane jScrollRelacionesSelectReporteComprobanteTarjeta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoComprobanteTarjeta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoComprobanteTarjeta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoComprobanteTarjeta;
	//public JLabel jLabelTiposArchivoReporteDinamicoComprobanteTarjeta;
	
		
	//public JLabel jLabelArchivoImportacionComprobanteTarjeta;	
	//public JLabel jLabelPathArchivoImportacionComprobanteTarjeta;
	//protected JTextField jTextFieldPathArchivoImportacionComprobanteTarjeta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoComprobanteTarjeta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoComprobanteTarjeta;
	
	//public JLabel jLabelColumnaCategoriaValorComprobanteTarjeta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorComprobanteTarjeta;
	
	//public JLabel jLabelColumnasValoresGraficoComprobanteTarjeta;
	//public JList<Reporte> jListColumnasValoresGraficoComprobanteTarjeta;
	//public JScrollPane jScrollColumnasValoresGraficoComprobanteTarjeta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoComprobanteTarjeta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoComprobanteTarjeta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasComprobanteTarjeta;
	public JPanel jPanelBusquedaComprobanteTarjetaComprobanteTarjeta;
	public JButton jButtonBusquedaComprobanteTarjetaComprobanteTarjeta;
	
	public JPanel jPanelfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta;
	public JLabel jLabelfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta;

	public JDateChooser jDateChooserfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta;
	public JButton jButtonfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjetaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta;
	public JLabel jLabelfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta;
	//public JFormattedTextField jDateChooserfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta;

	public JDateChooser jDateChooserfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta;
	public JButton jButtonfecha_finBusquedaComprobanteTarjetaComprobanteTarjetaBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=696;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ComprobanteTarjetaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ComprobanteTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteTarjetaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobanteTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteTarjetaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobanteTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteTarjetaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComprobanteTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionComprobanteTarjeta)	{
		this.jButtonRecargarInformacionComprobanteTarjeta = jButtonRecargarInformacionComprobanteTarjeta;
	}
	
	public JButton getjButtonProcesarInformacionComprobanteTarjeta() {
		return this.jButtonProcesarInformacionComprobanteTarjeta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComprobanteTarjeta)	{
		this.jButtonProcesarInformacionComprobanteTarjeta = jButtonProcesarInformacionComprobanteTarjeta;
	}
	
	
	public JButton getjButtonRecargarInformacionComprobanteTarjeta() {
		return this.jButtonRecargarInformacionComprobanteTarjeta;
	}
	
	
	public List<ComprobanteTarjeta> getcomprobantetarjetas() {
		return this.comprobantetarjetas;
	}

	public void setcomprobantetarjetas(List<ComprobanteTarjeta> comprobantetarjetas) {
		this.comprobantetarjetas = comprobantetarjetas;
	}
	
	public List<ComprobanteTarjeta> getcomprobantetarjetasAux() {
		return this.comprobantetarjetasAux;
	}

	public void setcomprobantetarjetasAux(List<ComprobanteTarjeta> comprobantetarjetasAux) {
		this.comprobantetarjetasAux = comprobantetarjetasAux;
	}
	
	public List<ComprobanteTarjeta> getcomprobantetarjetasEliminados() {
		return this.comprobantetarjetasEliminados;
	}

	public void setComprobanteTarjetasEliminados(List<ComprobanteTarjeta> comprobantetarjetasEliminados) {
		this.comprobantetarjetasEliminados = comprobantetarjetasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarComprobanteTarjeta() {
		return jComboBoxTiposSeleccionarComprobanteTarjeta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarComprobanteTarjeta(
			JComboBox jComboBoxTiposSeleccionarComprobanteTarjeta) {
		this.jComboBoxTiposSeleccionarComprobanteTarjeta = jComboBoxTiposSeleccionarComprobanteTarjeta;
	}
	
	public void setBorderResaltarTiposSeleccionarComprobanteTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarComprobanteTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarComprobanteTarjeta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralComprobanteTarjeta() {
		return jTextFieldValorCampoGeneralComprobanteTarjeta;
	}

	public void setjTextFieldValorCampoGeneralComprobanteTarjeta(
			JTextField jTextFieldValorCampoGeneralComprobanteTarjeta) {
		this.jTextFieldValorCampoGeneralComprobanteTarjeta = jTextFieldValorCampoGeneralComprobanteTarjeta;
	}

	public void setBorderResaltarValorCampoGeneralComprobanteTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteTarjeta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralComprobanteTarjeta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosComprobanteTarjeta() {
		return this.jCheckBoxSeleccionarTodosComprobanteTarjeta;
	}

	public void setjCheckBoxSeleccionarTodosComprobanteTarjeta(
			JCheckBox jCheckBoxSeleccionarTodosComprobanteTarjeta) {
		this.jCheckBoxSeleccionarTodosComprobanteTarjeta = jCheckBoxSeleccionarTodosComprobanteTarjeta;
	}

	public void setBorderResaltarSeleccionarTodosComprobanteTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteTarjeta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosComprobanteTarjeta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosComprobanteTarjeta() {
		return this.jCheckBoxSeleccionadosComprobanteTarjeta;
	}

	public void setjCheckBoxSeleccionadosComprobanteTarjeta(
			JCheckBox jCheckBoxSeleccionadosComprobanteTarjeta) {
		this.jCheckBoxSeleccionadosComprobanteTarjeta = jCheckBoxSeleccionadosComprobanteTarjeta;
	}
	
	public void setBorderResaltarSeleccionadosComprobanteTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteTarjeta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosComprobanteTarjeta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesComprobanteTarjeta() {
		return this.jComboBoxTiposArchivosReportesComprobanteTarjeta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesComprobanteTarjeta(
			JComboBox jComboBoxTiposArchivosReportesComprobanteTarjeta) {
		this.jComboBoxTiposArchivosReportesComprobanteTarjeta = jComboBoxTiposArchivosReportesComprobanteTarjeta;
	}

	public void setBorderResaltarTiposArchivosReportesComprobanteTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesComprobanteTarjeta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesComprobanteTarjeta() {
		return this.jComboBoxTiposReportesComprobanteTarjeta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesComprobanteTarjeta(
			JComboBox jComboBoxTiposReportesComprobanteTarjeta) {
		this.jComboBoxTiposReportesComprobanteTarjeta = jComboBoxTiposReportesComprobanteTarjeta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoComprobanteTarjeta() {
	//	return jComboBoxTiposReportesDinamicoComprobanteTarjeta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoComprobanteTarjeta(
	//		JComboBox jComboBoxTiposReportesDinamicoComprobanteTarjeta) {
	//	this.jComboBoxTiposReportesDinamicoComprobanteTarjeta = jComboBoxTiposReportesDinamicoComprobanteTarjeta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoComprobanteTarjeta() {
	//	return jComboBoxTiposArchivosReportesDinamicoComprobanteTarjeta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoComprobanteTarjeta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoComprobanteTarjeta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoComprobanteTarjeta = jComboBoxTiposArchivosReportesDinamicoComprobanteTarjeta;
	//}
	
	public void setBorderResaltarTiposReportesComprobanteTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesComprobanteTarjeta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesComprobanteTarjeta() {
		return this.jComboBoxTiposGraficosReportesComprobanteTarjeta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesComprobanteTarjeta(
			JComboBox jComboBoxTiposGraficosReportesComprobanteTarjeta) {
		this.jComboBoxTiposGraficosReportesComprobanteTarjeta = jComboBoxTiposGraficosReportesComprobanteTarjeta;
	}
	
	public void setBorderResaltarTiposGraficosReportesComprobanteTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesComprobanteTarjeta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionComprobanteTarjeta() {
		return this.jComboBoxTiposPaginacionComprobanteTarjeta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionComprobanteTarjeta(
			JComboBox jComboBoxTiposPaginacionComprobanteTarjeta) {
		this.jComboBoxTiposPaginacionComprobanteTarjeta = jComboBoxTiposPaginacionComprobanteTarjeta;
	}
	
	public void setBorderResaltarTiposPaginacionComprobanteTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionComprobanteTarjeta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesComprobanteTarjeta() {
		return this.jComboBoxTiposRelacionesComprobanteTarjeta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComprobanteTarjeta() {
		return this.jComboBoxTiposAccionesComprobanteTarjeta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComprobanteTarjeta(
			JComboBox jComboBoxTiposRelacionesComprobanteTarjeta) {
		this.jComboBoxTiposRelacionesComprobanteTarjeta = jComboBoxTiposRelacionesComprobanteTarjeta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComprobanteTarjeta(
			JComboBox jComboBoxTiposAccionesComprobanteTarjeta) {
		this.jComboBoxTiposAccionesComprobanteTarjeta = jComboBoxTiposAccionesComprobanteTarjeta;
	}
	
	public void setBorderResaltarTiposRelacionesComprobanteTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesComprobanteTarjeta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesComprobanteTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesComprobanteTarjeta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoComprobanteTarjeta() {
	//	return jCheckBoxConGraficoDinamicoComprobanteTarjeta;
	//}

	//public void setjCheckBoxConGraficoDinamicoComprobanteTarjeta(
	//		JCheckBox jCheckBoxConGraficoDinamicoComprobanteTarjeta) {
	//	this.jCheckBoxConGraficoDinamicoComprobanteTarjeta = jCheckBoxConGraficoDinamicoComprobanteTarjeta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoComprobanteTarjeta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarComprobanteTarjeta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoComprobanteTarjeta .setBorder(borderResaltar);		
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
		this.comprobantetarjetaSessionBean=new ComprobanteTarjetaSessionBean();
		
		this.comprobantetarjetaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comprobantetarjetaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comprobantetarjetaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ComprobanteTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ComprobanteTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComprobanteTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComprobanteTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComprobanteTarjetaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comprobante Tarjeta MANTENIMIENTO"));
		
		
		if(iWidth > 2350) {
			iWidth=2350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
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
		
		ComprobanteTarjetaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ComprobanteTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarComprobanteTarjeta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarComprobanteTarjeta,this.jTtoolBarComprobanteTarjeta,
							"nuevo","nuevo","Nuevo"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarComprobanteTarjeta,this.jTtoolBarComprobanteTarjeta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarComprobanteTarjeta,this.jTtoolBarComprobanteTarjeta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarComprobanteTarjeta,this.jTtoolBarComprobanteTarjeta,
							"duplicar","duplicar","Duplicar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarComprobanteTarjeta,this.jTtoolBarComprobanteTarjeta,
							"copiar","copiar","Copiar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarComprobanteTarjeta,this.jTtoolBarComprobanteTarjeta,
							"ver_form","ver_form","Ver"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComprobanteTarjeta,this.jTtoolBarComprobanteTarjeta,
							"recargar","recargar","Buscar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComprobanteTarjeta,this.jTtoolBarComprobanteTarjeta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComprobanteTarjeta,this.jTtoolBarComprobanteTarjeta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarComprobanteTarjeta,this.jTtoolBarComprobanteTarjeta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarComprobanteTarjeta,this.jTtoolBarComprobanteTarjeta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarComprobanteTarjeta,this.jTtoolBarComprobanteTarjeta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarComprobanteTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarComprobanteTarjeta,this.jTtoolBarComprobanteTarjeta,
							"cerrar","cerrar","Salir"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarComprobanteTarjeta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarComprobanteTarjeta;
			
				this.jButtonProcesarInformacionToolBarComprobanteTarjeta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarComprobanteTarjeta;
				
		//protected JButton jButtonModificarToolBarComprobanteTarjeta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarComprobanteTarjeta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuComprobanteTarjeta=new JMenuMe("General");
		this.jmenuArchivoComprobanteTarjeta=new JMenuMe("Archivo");
		this.jmenuAccionesComprobanteTarjeta=new JMenuMe("Acciones");
		this.jmenuDatosComprobanteTarjeta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComprobanteTarjeta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComprobanteTarjeta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComprobanteTarjeta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarComprobanteTarjeta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarComprobanteTarjeta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarComprobanteTarjeta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesComprobanteTarjeta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesComprobanteTarjeta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesComprobanteTarjeta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosComprobanteTarjeta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComprobanteTarjeta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComprobanteTarjeta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarComprobanteTarjeta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarComprobanteTarjeta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarComprobanteTarjeta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormComprobanteTarjeta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormComprobanteTarjeta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormComprobanteTarjeta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaComprobanteTarjeta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaComprobanteTarjeta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaComprobanteTarjeta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComprobanteTarjeta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComprobanteTarjeta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComprobanteTarjeta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionComprobanteTarjeta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionComprobanteTarjeta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionComprobanteTarjeta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionComprobanteTarjeta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionComprobanteTarjeta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionComprobanteTarjeta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresComprobanteTarjeta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresComprobanteTarjeta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresComprobanteTarjeta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesComprobanteTarjeta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesComprobanteTarjeta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesComprobanteTarjeta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByComprobanteTarjeta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByComprobanteTarjeta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByComprobanteTarjeta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComprobanteTarjeta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComprobanteTarjeta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComprobanteTarjeta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByComprobanteTarjeta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByComprobanteTarjeta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByComprobanteTarjeta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComprobanteTarjeta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComprobanteTarjeta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComprobanteTarjeta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosComprobanteTarjeta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosComprobanteTarjeta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosComprobanteTarjeta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoComprobanteTarjeta.add(this.jMenuItemCerrarComprobanteTarjeta);
			
			this.jmenuAccionesComprobanteTarjeta.add(this.jMenuItemNuevoComprobanteTarjeta);
			this.jmenuAccionesComprobanteTarjeta.add(this.jMenuItemNuevoGuardarCambiosComprobanteTarjeta);
			this.jmenuAccionesComprobanteTarjeta.add(this.jMenuItemNuevoRelacionesComprobanteTarjeta);
			this.jmenuAccionesComprobanteTarjeta.add(this.jMenuItemGuardarCambiosTablaComprobanteTarjeta);		
			this.jmenuAccionesComprobanteTarjeta.add(this.jMenuItemDuplicarComprobanteTarjeta);		
			this.jmenuAccionesComprobanteTarjeta.add(this.jMenuItemCopiarComprobanteTarjeta);		
			this.jmenuAccionesComprobanteTarjeta.add(this.jMenuItemVerFormComprobanteTarjeta);		
			
			this.jmenuDatosComprobanteTarjeta.add(this.jMenuItemRecargarInformacionComprobanteTarjeta);				
			this.jmenuDatosComprobanteTarjeta.add(this.jMenuItemAnterioresComprobanteTarjeta);				
			this.jmenuDatosComprobanteTarjeta.add(this.jMenuItemSiguientesComprobanteTarjeta);				
			this.jmenuDatosComprobanteTarjeta.add(this.jMenuItemAbrirOrderByComprobanteTarjeta);				
			this.jmenuDatosComprobanteTarjeta.add(this.jMenuItemMostrarOcultarComprobanteTarjeta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesComprobanteTarjeta.add(this.jMenuItemGuardarCambiosComprobanteTarjeta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarComprobanteTarjeta.add(this.jmenuArchivoComprobanteTarjeta);		
			this.jmenuBarComprobanteTarjeta.add(this.jmenuAccionesComprobanteTarjeta);		
			this.jmenuBarComprobanteTarjeta.add(this.jmenuDatosComprobanteTarjeta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarComprobanteTarjeta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasComprobanteTarjeta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaComprobanteTarjetaComprobanteTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaComprobanteTarjetaComprobanteTarjeta.setToolTipText("Buscar Por Fecha Inicio Por Fecha Fin ");
		this.jButtonBusquedaComprobanteTarjetaComprobanteTarjeta= new JButtonMe();
		this.jButtonBusquedaComprobanteTarjetaComprobanteTarjeta.setText("Buscar");
		this.jButtonBusquedaComprobanteTarjetaComprobanteTarjeta.setToolTipText("Buscar Por Fecha Inicio Por Fecha Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaComprobanteTarjetaComprobanteTarjeta,"buscar_button","Buscar Por Fecha Inicio Por Fecha Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaComprobanteTarjetaComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta = new JLabelMe();
		jLabelfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta= new JDateChooser();
		jDateChooserfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta.setDate(new Date());
		jDateChooserfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta = new JLabelMe();
		jLabelfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta.setText("Fecha Fin :");
		jLabelfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta.setToolTipText("Fecha Fin");
		jLabelfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta= new JDateChooser();
		jDateChooserfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta.setDate(new Date());
		jDateChooserfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasComprobanteTarjeta=new JTabbedPane();


		this.jTabbedPaneBusquedasComprobanteTarjeta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComprobanteTarjeta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComprobanteTarjeta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasComprobanteTarjeta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleComprobanteTarjeta = new ComprobanteTarjetaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Comprobante Tarjeta DATOS");
			this.jInternalFrameDetalleFormComprobanteTarjeta = new ComprobanteTarjetaDetalleFormJInternalFrame(jDesktopPane,this.comprobantetarjetaSessionBean.getConGuardarRelaciones(),this.comprobantetarjetaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormComprobanteTarjeta = null;//new ComprobanteTarjetaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComprobanteTarjeta= new GridBagLayout();
		
		
		this.jTableDatosComprobanteTarjeta = new JTableMe();      
		
		String sToolTipComprobanteTarjeta="";
		sToolTipComprobanteTarjeta=ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComprobanteTarjeta+="(PuntoVenta.ComprobanteTarjeta)";
		}
		
		if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
			sToolTipComprobanteTarjeta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosComprobanteTarjeta.setToolTipText(sToolTipComprobanteTarjeta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosComprobanteTarjeta);
		this.jTableDatosComprobanteTarjeta.setAutoCreateRowSorter(true);
		this.jTableDatosComprobanteTarjeta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosComprobanteTarjeta.setRowSelectionAllowed(true);
		this.jTableDatosComprobanteTarjeta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosComprobanteTarjeta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoComprobanteTarjeta = new JButtonMe();
		this.jButtonDuplicarComprobanteTarjeta = new JButtonMe();
		this.jButtonCopiarComprobanteTarjeta = new JButtonMe();
		this.jButtonVerFormComprobanteTarjeta = new JButtonMe();
		this.jButtonNuevoRelacionesComprobanteTarjeta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaComprobanteTarjeta = new JButtonMe();
		this.jButtonCerrarComprobanteTarjeta = new JButtonMe();
		
		this.jScrollPanelDatosComprobanteTarjeta = new JScrollPane();   
        this.jScrollPanelDatosGeneralComprobanteTarjeta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesComprobanteTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Comprobante Tarjeta";
		
		if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Tarjetas" + this.sPath));
		} else {
			this.jScrollPanelDatosComprobanteTarjeta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComprobanteTarjeta.setToolTipText("Acciones");
        this.jPanelAccionesComprobanteTarjeta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoComprobanteTarjeta=new ReporteDinamicoJInternalFrame(ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoComprobanteTarjeta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionComprobanteTarjeta=new ImportacionJInternalFrame(ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionComprobanteTarjeta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByComprobanteTarjeta = new JButtonMe();
		
		this.jButtonAbrirOrderByComprobanteTarjeta.setText("Orden");
		this.jButtonAbrirOrderByComprobanteTarjeta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComprobanteTarjeta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByComprobanteTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComprobanteTarjeta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobanteTarjeta,false,this);
			
			//this.cargarOrderByComprobanteTarjeta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComprobanteTarjeta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobanteTarjeta,true,this);
			
			//this.cargarOrderByComprobanteTarjeta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosComprobanteTarjeta.setMinimumSize(new Dimension(400,50));//2130
		this.jTableDatosComprobanteTarjeta.setMaximumSize(new Dimension(400,50));//2130
		this.jTableDatosComprobanteTarjeta.setPreferredSize(new Dimension(400,50));//2130
		
		this.jScrollPanelDatosComprobanteTarjeta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosComprobanteTarjeta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosComprobanteTarjeta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoComprobanteTarjeta.setText("Nuevo");
		this.jButtonDuplicarComprobanteTarjeta.setText("Duplicar");
		this.jButtonCopiarComprobanteTarjeta.setText("Copiar");
		this.jButtonVerFormComprobanteTarjeta.setText("Ver");
		this.jButtonNuevoRelacionesComprobanteTarjeta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaComprobanteTarjeta.setText("Guardar");
		this.jButtonCerrarComprobanteTarjeta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComprobanteTarjeta,"nuevo_button","Nuevo",this.comprobantetarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarComprobanteTarjeta,"duplicar_button","Duplicar",this.comprobantetarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarComprobanteTarjeta,"copiar_button","Copiar",this.comprobantetarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormComprobanteTarjeta,"ver_form","Ver",this.comprobantetarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesComprobanteTarjeta,"nuevorelaciones_button","Nuevo Rel",this.comprobantetarjetaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComprobanteTarjeta,"guardarcambiostabla_button","Guardar",this.comprobantetarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComprobanteTarjeta,"cerrar_button","Salir",this.comprobantetarjetaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoComprobanteTarjeta.setToolTipText("Nuevo"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarComprobanteTarjeta.setToolTipText("Duplicar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarComprobanteTarjeta.setToolTipText("Copiar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormComprobanteTarjeta.setToolTipText("Ver"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesComprobanteTarjeta.setToolTipText("Nuevo Rel"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaComprobanteTarjeta.setToolTipText("Guardar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComprobanteTarjeta.setToolTipText("Salir"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComprobanteTarjeta";
		inputMap = this.jButtonNuevoComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComprobanteTarjeta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComprobanteTarjeta"));
		
		//DUPLICAR
		sMapKey = "DuplicarComprobanteTarjeta";
		inputMap = this.jButtonDuplicarComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarComprobanteTarjeta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarComprobanteTarjeta"));
		
		//COPIAR
		sMapKey = "CopiarComprobanteTarjeta";
		inputMap = this.jButtonCopiarComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarComprobanteTarjeta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarComprobanteTarjeta"));
		
		//VEr FORM
		sMapKey = "VerFormComprobanteTarjeta";
		inputMap = this.jButtonVerFormComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormComprobanteTarjeta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormComprobanteTarjeta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesComprobanteTarjeta";
		inputMap = this.jButtonNuevoRelacionesComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesComprobanteTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesComprobanteTarjeta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarComprobanteTarjeta";
		inputMap = this.jButtonModificarComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarComprobanteTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarComprobanteTarjeta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarComprobanteTarjeta";
		inputMap = this.jButtonCerrarComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComprobanteTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComprobanteTarjeta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComprobanteTarjeta";
		inputMap = this.jButtonGuardarCambiosTablaComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComprobanteTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComprobanteTarjeta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesComprobanteTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesComprobanteTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionComprobanteTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ComprobanteTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ComprobanteTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ComprobanteTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ComprobanteTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ComprobanteTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesComprobanteTarjeta.setName("jPanelParametrosReportesComprobanteTarjeta"); 
		
		this.jPanelParametrosReportesAccionesComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesComprobanteTarjeta.setName("jPanelParametrosReportesAccionesComprobanteTarjeta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionComprobanteTarjeta = new JButtonMe();
		this.jButtonRecargarInformacionComprobanteTarjeta.setText("Buscar");
		this.jButtonRecargarInformacionComprobanteTarjeta.setToolTipText("Buscar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionComprobanteTarjeta,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionComprobanteTarjeta.setVisible(false);
		
		
		this.jButtonProcesarInformacionComprobanteTarjeta = new JButtonMe();
		this.jButtonProcesarInformacionComprobanteTarjeta.setText("Procesar");
		this.jButtonProcesarInformacionComprobanteTarjeta.setToolTipText("Procesar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionComprobanteTarjeta.setVisible(false);
			
		this.jButtonProcesarInformacionComprobanteTarjeta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComprobanteTarjeta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComprobanteTarjeta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesComprobanteTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComprobanteTarjeta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesComprobanteTarjeta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesComprobanteTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComprobanteTarjeta.setText("TIPO");       
		this.jComboBoxTiposReportesComprobanteTarjeta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesComprobanteTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComprobanteTarjeta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesComprobanteTarjeta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionComprobanteTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionComprobanteTarjeta.setText("Paginacion");
		this.jComboBoxTiposPaginacionComprobanteTarjeta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesComprobanteTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesComprobanteTarjeta.setText("Accion");
		this.jComboBoxTiposRelacionesComprobanteTarjeta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesComprobanteTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComprobanteTarjeta.setText("Accion");
		this.jComboBoxTiposAccionesComprobanteTarjeta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarComprobanteTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarComprobanteTarjeta.setText("Accion");
		this.jComboBoxTiposSeleccionarComprobanteTarjeta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralComprobanteTarjeta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralComprobanteTarjeta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComprobanteTarjeta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComprobanteTarjeta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesComprobanteTarjeta = new JLabelMe();
		
		this.jLabelAccionesComprobanteTarjeta.setText("Acciones");		
		this.jLabelAccionesComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosComprobanteTarjeta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosComprobanteTarjeta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosComprobanteTarjeta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosComprobanteTarjeta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosComprobanteTarjeta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosComprobanteTarjeta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaComprobanteTarjeta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaComprobanteTarjeta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaComprobanteTarjeta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteComprobanteTarjeta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteComprobanteTarjeta.setText("Graf.");
		this.jCheckBoxConGraficoReporteComprobanteTarjeta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresComprobanteTarjeta = new JButtonMe();
		//this.jButtonAnterioresComprobanteTarjeta.setText("<<");
        this.jButtonAnterioresComprobanteTarjeta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresComprobanteTarjeta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesComprobanteTarjeta = new JButtonMe();
		//this.jButtonSiguientesComprobanteTarjeta.setText(">>");
        this.jButtonSiguientesComprobanteTarjeta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesComprobanteTarjeta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosComprobanteTarjeta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosComprobanteTarjeta.setText("Nue");
        this.jButtonNuevoGuardarCambiosComprobanteTarjeta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosComprobanteTarjeta,"nuevoguardarcambios_button","Nue",this.comprobantetarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosComprobanteTarjeta";
		inputMap = this.jButtonNuevoGuardarCambiosComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosComprobanteTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosComprobanteTarjeta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionComprobanteTarjeta";
		inputMap = this.jButtonRecargarInformacionComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionComprobanteTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionComprobanteTarjeta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesComprobanteTarjeta";
		inputMap = this.jButtonSiguientesComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesComprobanteTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesComprobanteTarjeta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresComprobanteTarjeta";
		inputMap = this.jButtonAnterioresComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresComprobanteTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresComprobanteTarjeta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasComprobanteTarjeta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesComprobanteTarjeta.setMinimumSize(new Dimension(this.getWidth(),ComprobanteTarjetaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComprobanteTarjetaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComprobanteTarjeta.setMaximumSize(new Dimension(this.getWidth(),ComprobanteTarjetaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComprobanteTarjetaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComprobanteTarjeta.setPreferredSize(new Dimension(this.getWidth(),ComprobanteTarjetaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComprobanteTarjetaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionComprobanteTarjeta = new GridBagLayout();

			this.jPanelPaginacionComprobanteTarjeta.setLayout(gridaBagLayoutPaginacionComprobanteTarjeta);						
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
			this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionComprobanteTarjeta.add(this.jButtonAnterioresComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
					
						
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
			
			this.jPanelPaginacionComprobanteTarjeta.add(this.jButtonNuevoGuardarCambiosComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
						
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
			this.jPanelPaginacionComprobanteTarjeta.add(this.jButtonSiguientesComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy = 1;
			this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobanteTarjeta.add(this.jButtonNuevoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
						
			
			
			if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
				this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsComprobanteTarjeta.gridy = 1;
				this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionComprobanteTarjeta.add(this.jButtonGuardarCambiosTablaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
			}
			
			
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy = 1;
			this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobanteTarjeta.add(this.jButtonDuplicarComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy = 1;
			this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobanteTarjeta.add(this.jButtonCopiarComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy = 1;
			this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobanteTarjeta.add(this.jButtonVerFormComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy = 1;
			this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionComprobanteTarjeta.add(this.jButtonCerrarComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
		
		
		this.jButtonRecargarInformacionComprobanteTarjeta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComprobanteTarjeta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComprobanteTarjeta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesComprobanteTarjeta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComprobanteTarjeta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComprobanteTarjeta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesComprobanteTarjeta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComprobanteTarjeta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComprobanteTarjeta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesComprobanteTarjeta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComprobanteTarjeta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComprobanteTarjeta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionComprobanteTarjeta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComprobanteTarjeta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComprobanteTarjeta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesComprobanteTarjeta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComprobanteTarjeta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComprobanteTarjeta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesComprobanteTarjeta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobanteTarjeta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobanteTarjeta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarComprobanteTarjeta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComprobanteTarjeta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComprobanteTarjeta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaComprobanteTarjeta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComprobanteTarjeta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComprobanteTarjeta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteComprobanteTarjeta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComprobanteTarjeta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComprobanteTarjeta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosComprobanteTarjeta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComprobanteTarjeta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComprobanteTarjeta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosComprobanteTarjeta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComprobanteTarjeta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComprobanteTarjeta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesComprobanteTarjeta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesComprobanteTarjeta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ComprobanteTarjeta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ComprobanteTarjeta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ComprobanteTarjeta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ComprobanteTarjeta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesComprobanteTarjeta.setLayout(gridaBagParametrosReportesComprobanteTarjeta);
			this.jPanelParametrosReportesAccionesComprobanteTarjeta.setLayout(gridaBagParametrosReportesAccionesComprobanteTarjeta);
			
			
			this.jPanelParametrosAuxiliar1ComprobanteTarjeta.setLayout(gridaBagParametrosAuxiliar1ComprobanteTarjeta);
			this.jPanelParametrosAuxiliar2ComprobanteTarjeta.setLayout(gridaBagParametrosAuxiliar2ComprobanteTarjeta);
			this.jPanelParametrosAuxiliar3ComprobanteTarjeta.setLayout(gridaBagParametrosAuxiliar3ComprobanteTarjeta);
			this.jPanelParametrosAuxiliar4ComprobanteTarjeta.setLayout(gridaBagParametrosAuxiliar4ComprobanteTarjeta);
			//this.jPanelParametrosAuxiliar5ComprobanteTarjeta.setLayout(gridaBagParametrosAuxiliar2ComprobanteTarjeta);			
			
			
			
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteTarjeta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComprobanteTarjeta.add(this.jButtonRecargarInformacionComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteTarjeta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComprobanteTarjeta.add(this.jComboBoxTiposPaginacionComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteTarjeta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComprobanteTarjeta.add(this.jCheckBoxConAltoMaximoTablaComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteTarjeta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComprobanteTarjeta.add(this.jComboBoxTiposArchivosReportesComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteTarjeta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteTarjeta.add(this.jPanelParametrosAuxiliar1ComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteTarjeta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ComprobanteTarjeta.add(this.jComboBoxTiposReportesComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);																		
			
			
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteTarjeta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ComprobanteTarjeta.add(this.jComboBoxTiposGraficosReportesComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteTarjeta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteTarjeta.add(this.jPanelParametrosAuxiliar4ComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteTarjeta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteTarjeta.add(this.jComboBoxTiposReportesComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteTarjeta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobanteTarjeta.add(this.jCheckBoxGenerarReporteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteTarjeta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteTarjeta.add(this.jPanelParametrosAuxiliar2ComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteTarjeta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobanteTarjeta.add(this.jLabelAccionesComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
				this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsComprobanteTarjeta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesComprobanteTarjeta.add(this.jButtonAbrirOrderByComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteTarjeta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComprobanteTarjeta.add(this.jComboBoxTiposSeleccionarComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);			
			
			
			/*
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteTarjeta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobanteTarjeta.add(this.jCheckBoxSeleccionarTodosComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteTarjeta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobanteTarjeta.add(this.jCheckBoxConGraficoReporteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteTarjeta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComprobanteTarjeta.add(this.jCheckBoxSeleccionarTodosComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);															
				
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteTarjeta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComprobanteTarjeta.add(this.jCheckBoxSeleccionadosComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);															
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteTarjeta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComprobanteTarjeta.add(this.jCheckBoxConGraficoReporteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteTarjeta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteTarjeta.add(this.jPanelParametrosAuxiliar3ComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteTarjeta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComprobanteTarjeta.add(this.jComboBoxTiposAccionesComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosComprobanteTarjeta = new GridBagLayout();

			this.jScrollPanelDatosComprobanteTarjeta.setLayout(gridaBagLayoutDatosComprobanteTarjeta);
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
			this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
			
			this.jScrollPanelDatosComprobanteTarjeta.add(this.jTableDatosComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosComprobanteTarjeta.setViewportView(this.jTableDatosComprobanteTarjeta);
		this.jTableDatosComprobanteTarjeta.setFillsViewportHeight(true);
		this.jTableDatosComprobanteTarjeta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesComprobanteTarjeta= new GridBagLayout();
		this.jPanelAccionesComprobanteTarjeta.setLayout(gridaBagLayoutAccionesComprobanteTarjeta);
		
		
		/*	
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = 0;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
			
		this.jPanelAccionesComprobanteTarjeta.add(this.jButtonNuevoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaComprobanteTarjetaComprobanteTarjeta= new GridBagLayout();
		gridaBagLayoutBusquedaComprobanteTarjetaComprobanteTarjeta.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaComprobanteTarjetaComprobanteTarjeta.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaComprobanteTarjetaComprobanteTarjeta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaComprobanteTarjetaComprobanteTarjeta.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaComprobanteTarjetaComprobanteTarjeta.setLayout(gridaBagLayoutBusquedaComprobanteTarjetaComprobanteTarjeta);

		gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteTarjeta.gridy = 0;
		gridBagConstraintsComprobanteTarjeta.gridx = 0;
		jPanelBusquedaComprobanteTarjetaComprobanteTarjeta.add(jLabelfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta, gridBagConstraintsComprobanteTarjeta);

		gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteTarjeta.gridy = 0;
		gridBagConstraintsComprobanteTarjeta.gridx = 1;
		jPanelBusquedaComprobanteTarjetaComprobanteTarjeta.add(jDateChooserfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta, gridBagConstraintsComprobanteTarjeta);


		gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteTarjeta.gridy = 1;
		gridBagConstraintsComprobanteTarjeta.gridx = 0;
		jPanelBusquedaComprobanteTarjetaComprobanteTarjeta.add(jLabelfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta, gridBagConstraintsComprobanteTarjeta);

		gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteTarjeta.gridy = 1;
		gridBagConstraintsComprobanteTarjeta.gridx = 1;
		jPanelBusquedaComprobanteTarjetaComprobanteTarjeta.add(jDateChooserfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta, gridBagConstraintsComprobanteTarjeta);

		gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteTarjeta.gridy = 2;
		gridBagConstraintsComprobanteTarjeta.gridx =1;
		jPanelBusquedaComprobanteTarjetaComprobanteTarjeta.add(jButtonBusquedaComprobanteTarjetaComprobanteTarjeta, gridBagConstraintsComprobanteTarjeta);

		jTabbedPaneBusquedasComprobanteTarjeta.addTab("1.-Por Fecha Inicio Por Fecha Fin ", jPanelBusquedaComprobanteTarjetaComprobanteTarjeta);
		jTabbedPaneBusquedasComprobanteTarjeta.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComprobanteTarjeta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComprobanteTarjeta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();						
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComprobanteTarjeta.gridx = 0;		
			//this.gridBagConstraintsComprobanteTarjeta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComprobanteTarjeta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsComprobanteTarjeta.gridx = 0;		
		//this.gridBagConstraintsComprobanteTarjeta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsComprobanteTarjeta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsComprobanteTarjeta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComprobanteTarjeta.gridx = 0;		
			this.gridBagConstraintsComprobanteTarjeta.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsComprobanteTarjeta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);								
		
		
		/*
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		*/		
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComprobanteTarjeta.gridx =0;
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComprobanteTarjeta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
				
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ComprobanteTarjetaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosComprobanteTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComprobanteTarjeta = new GridBagLayout();
			this.jPanelBusquedasParametrosComprobanteTarjeta.setLayout(gridaBagLayoutBusquedasParametrosComprobanteTarjeta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralComprobanteTarjeta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComprobanteTarjeta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobanteTarjeta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobanteTarjeta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
			
			
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
			
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteTarjeta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralComprobanteTarjeta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoComprobanteTarjeta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoComprobanteTarjeta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoComprobanteTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoComprobanteTarjeta.setName("jPanelReporteDinamicoComprobanteTarjeta"); 
		
		this.jPanelReporteDinamicoComprobanteTarjeta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComprobanteTarjeta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComprobanteTarjeta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoComprobanteTarjeta.setLayout(gridaBagLayoutReporteDinamicoComprobanteTarjeta);
		
		
		this.jInternalFrameReporteDinamicoComprobanteTarjeta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoComprobanteTarjeta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComprobanteTarjeta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoComprobanteTarjeta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoComprobanteTarjeta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoComprobanteTarjeta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoComprobanteTarjeta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoComprobanteTarjeta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoComprobanteTarjeta.setResizable(true);
	    this.jInternalFrameReporteDinamicoComprobanteTarjeta.setClosable(true);
	    this.jInternalFrameReporteDinamicoComprobanteTarjeta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoComprobanteTarjeta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComprobanteTarjeta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComprobanteTarjeta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Tarjetas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteComprobanteTarjeta = new JLabelMe();

		this.jLabelColumnasSelectReporteComprobanteTarjeta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jLabelColumnasSelectReporteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteComprobanteTarjeta = new JList<Reporte>();
		this.jListColumnasSelectReporteComprobanteTarjeta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteComprobanteTarjeta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteComprobanteTarjeta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComprobanteTarjeta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComprobanteTarjeta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteComprobanteTarjeta=new JScrollPane(this.jListColumnasSelectReporteComprobanteTarjeta);
			
			this.jScrollColumnasSelectReporteComprobanteTarjeta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComprobanteTarjeta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComprobanteTarjeta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jListColumnasSelectReporteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jScrollColumnasSelectReporteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteComprobanteTarjeta = new JLabelMe();

		this.jLabelRelacionesSelectReporteComprobanteTarjeta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteComprobanteTarjeta = new JList<Reporte>();
		this.jListRelacionesSelectReporteComprobanteTarjeta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteComprobanteTarjeta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteComprobanteTarjeta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComprobanteTarjeta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComprobanteTarjeta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteComprobanteTarjeta=new JScrollPane(this.jListRelacionesSelectReporteComprobanteTarjeta);
			
			this.jScrollRelacionesSelectReporteComprobanteTarjeta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComprobanteTarjeta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComprobanteTarjeta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoComprobanteTarjeta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoComprobanteTarjeta = new JComboBoxMe();
		this.jListColumnasValoresGraficoComprobanteTarjeta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoComprobanteTarjeta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoComprobanteTarjeta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoComprobanteTarjeta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComprobanteTarjeta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComprobanteTarjeta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteTarjeta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteTarjeta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteTarjeta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteTarjeta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteTarjeta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoComprobanteTarjeta = new JLabelMe();

		this.jLabelConGraficoDinamicoComprobanteTarjeta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jLabelConGraficoDinamicoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoComprobanteTarjeta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoComprobanteTarjeta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoComprobanteTarjeta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoComprobanteTarjeta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComprobanteTarjeta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComprobanteTarjeta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jCheckBoxConGraficoDinamicoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoComprobanteTarjeta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoComprobanteTarjeta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jLabelColumnaCategoriaGraficoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoComprobanteTarjeta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComprobanteTarjeta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoComprobanteTarjeta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoComprobanteTarjeta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComprobanteTarjeta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComprobanteTarjeta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jComboBoxColumnaCategoriaGraficoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorComprobanteTarjeta = new JLabelMe();

		this.jLabelColumnaCategoriaValorComprobanteTarjeta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jLabelColumnaCategoriaValorComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorComprobanteTarjeta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorComprobanteTarjeta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorComprobanteTarjeta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorComprobanteTarjeta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComprobanteTarjeta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComprobanteTarjeta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jComboBoxColumnaCategoriaValorComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoComprobanteTarjeta = new JLabelMe();

		this.jLabelColumnasValoresGraficoComprobanteTarjeta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jLabelColumnasValoresGraficoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoComprobanteTarjeta = new JList<Reporte>();
		this.jListColumnasValoresGraficoComprobanteTarjeta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoComprobanteTarjeta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoComprobanteTarjeta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComprobanteTarjeta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComprobanteTarjeta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoComprobanteTarjeta=new JScrollPane(this.jListColumnasValoresGraficoComprobanteTarjeta);
			
			this.jScrollColumnasValoresGraficoComprobanteTarjeta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComprobanteTarjeta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComprobanteTarjeta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jListColumnasSelectReporteComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jScrollColumnasValoresGraficoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoComprobanteTarjeta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoComprobanteTarjeta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jLabelTiposGraficosReportesDinamicoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoComprobanteTarjeta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComprobanteTarjeta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoComprobanteTarjeta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoComprobanteTarjeta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComprobanteTarjeta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComprobanteTarjeta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jComboBoxTiposGraficosReportesDinamicoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoComprobanteTarjeta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoComprobanteTarjeta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jLabelGenerarExcelReporteDinamicoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoComprobanteTarjeta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoComprobanteTarjeta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoComprobanteTarjeta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoComprobanteTarjeta.setToolTipText("Generar EXCEL"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jButtonGenerarExcelReporteDinamicoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jComboBoxTiposReportesDinamicoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoComprobanteTarjeta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoComprobanteTarjeta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jLabelTiposArchivoReporteDinamicoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jComboBoxTiposArchivosReportesDinamicoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoComprobanteTarjeta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoComprobanteTarjeta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoComprobanteTarjeta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoComprobanteTarjeta.setToolTipText("Generar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jButtonGenerarReporteDinamicoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoComprobanteTarjeta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoComprobanteTarjeta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoComprobanteTarjeta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoComprobanteTarjeta.setToolTipText("Cancelar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobanteTarjeta.add(this.jButtonCerrarReporteDinamicoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalComprobanteTarjeta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoComprobanteTarjeta= new JScrollPane(jPanelReporteDinamicoComprobanteTarjeta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoComprobanteTarjeta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComprobanteTarjeta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComprobanteTarjeta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Tarjetas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteTarjeta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoComprobanteTarjeta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoComprobanteTarjeta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalComprobanteTarjeta);
		this.jInternalFrameReporteDinamicoComprobanteTarjeta.getContentPane().add(this.jScrollPanelReporteDinamicoComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionComprobanteTarjeta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionComprobanteTarjeta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionComprobanteTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionComprobanteTarjeta.setName("jPanelImportacionComprobanteTarjeta"); 
		
		this.jPanelImportacionComprobanteTarjeta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComprobanteTarjeta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComprobanteTarjeta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionComprobanteTarjeta.setLayout(gridaBagLayoutImportacionComprobanteTarjeta);
		
		
		this.jInternalFrameImportacionComprobanteTarjeta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionComprobanteTarjeta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionComprobanteTarjeta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComprobanteTarjeta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionComprobanteTarjeta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComprobanteTarjeta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComprobanteTarjeta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionComprobanteTarjeta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComprobanteTarjeta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComprobanteTarjeta.setResizable(true);
	    this.jInternalFrameImportacionComprobanteTarjeta.setClosable(true);
	    this.jInternalFrameImportacionComprobanteTarjeta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionComprobanteTarjeta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComprobanteTarjeta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComprobanteTarjeta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionComprobanteTarjeta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComprobanteTarjeta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComprobanteTarjeta.setResizable(true);
	    this.jInternalFrameImportacionComprobanteTarjeta.setClosable(true);
	    this.jInternalFrameImportacionComprobanteTarjeta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionComprobanteTarjeta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComprobanteTarjeta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComprobanteTarjeta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Tarjetas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionComprobanteTarjeta = new JLabelMe();

		this.jLabelArchivoImportacionComprobanteTarjeta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYImportacion;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComprobanteTarjeta.add(this.jLabelArchivoImportacionComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionComprobanteTarjeta = new JFileChooser();		
		this.jFileChooserImportacionComprobanteTarjeta.setToolTipText("ESCOGER ARCHIVO"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionComprobanteTarjeta = new JButtonMe();
		this.jButtonAbrirImportacionComprobanteTarjeta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionComprobanteTarjeta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionComprobanteTarjeta.setToolTipText("Generar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobanteTarjeta.add(this.jButtonAbrirImportacionComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionComprobanteTarjeta = new JLabelMe();

		this.jLabelPathArchivoImportacionComprobanteTarjeta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionComprobanteTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComprobanteTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComprobanteTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYImportacion;		
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComprobanteTarjeta.add(this.jLabelPathArchivoImportacionComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionComprobanteTarjeta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionComprobanteTarjeta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComprobanteTarjeta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComprobanteTarjeta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobanteTarjeta.add(this.jTextFieldPathArchivoImportacionComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionComprobanteTarjeta = new JButtonMe();
		this.jButtonGenerarImportacionComprobanteTarjeta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionComprobanteTarjeta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionComprobanteTarjeta.setToolTipText("Generar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobanteTarjeta.add(this.jButtonGenerarImportacionComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionComprobanteTarjeta = new JButtonMe();
		this.jButtonCerrarImportacionComprobanteTarjeta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionComprobanteTarjeta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionComprobanteTarjeta.setToolTipText("Cancelar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobanteTarjeta.add(this.jButtonCerrarImportacionComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalComprobanteTarjeta = new GridBagLayout();
		
		this.jScrollPanelImportacionComprobanteTarjeta= new JScrollPane(jPanelImportacionComprobanteTarjeta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
		this.gridBagConstraintsComprobanteTarjeta.gridy =iPosYImportacion;
		this.gridBagConstraintsComprobanteTarjeta.gridx =iPosXImportacion;
		this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionComprobanteTarjeta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionComprobanteTarjeta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalComprobanteTarjeta);
		this.jInternalFrameImportacionComprobanteTarjeta.getContentPane().add(this.jScrollPanelImportacionComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByComprobanteTarjeta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByComprobanteTarjeta = new JButtonMe();
			this.jButtonAbrirOrderByComprobanteTarjeta.setText("Orden");
			this.jButtonAbrirOrderByComprobanteTarjeta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComprobanteTarjeta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByComprobanteTarjeta";
			inputMap = this.jButtonAbrirOrderByComprobanteTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByComprobanteTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByComprobanteTarjeta"));
		
		
			GridBagLayout gridaBagLayoutOrderByComprobanteTarjeta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByComprobanteTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByComprobanteTarjeta.setName("jPanelOrderByComprobanteTarjeta"); 
			
			this.jPanelOrderByComprobanteTarjeta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComprobanteTarjeta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComprobanteTarjeta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByComprobanteTarjeta.setLayout(gridaBagLayoutOrderByComprobanteTarjeta);
			
			
			this.jTableDatosComprobanteTarjetaOrderBy = new JTableMe();        
			this.jTableDatosComprobanteTarjetaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosComprobanteTarjetaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosComprobanteTarjetaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosComprobanteTarjetaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosComprobanteTarjetaOrderBy.setViewportView(this.jTableDatosComprobanteTarjetaOrderBy);
			this.jTableDatosComprobanteTarjetaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosComprobanteTarjetaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByComprobanteTarjeta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByComprobanteTarjeta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByComprobanteTarjeta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteComprobanteTarjeta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByComprobanteTarjeta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByComprobanteTarjeta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByComprobanteTarjeta.setTitle("Orden");
			this.jInternalFrameOrderByComprobanteTarjeta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByComprobanteTarjeta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByComprobanteTarjeta.setResizable(true);
			this.jInternalFrameOrderByComprobanteTarjeta.setClosable(true);
			this.jInternalFrameOrderByComprobanteTarjeta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByComprobanteTarjeta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComprobanteTarjeta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComprobanteTarjeta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByComprobanteTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Tarjetas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsComprobanteTarjeta.gridx =iPosXOrderBy;
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsComprobanteTarjeta.ipady =150;
				
			this.jPanelOrderByComprobanteTarjeta.add(jScrollPanelDatosComprobanteTarjetaOrderBy, this.gridBagConstraintsComprobanteTarjeta);//this.jTableDatosComprobanteTarjetaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByComprobanteTarjeta = new JButtonMe();
			this.jButtonCerrarOrderByComprobanteTarjeta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByComprobanteTarjeta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByComprobanteTarjeta.setToolTipText("Cancelar"+" "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByComprobanteTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteTarjeta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsComprobanteTarjeta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByComprobanteTarjeta.add(this.jButtonCerrarOrderByComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalComprobanteTarjeta = new GridBagLayout();
			
			this.jScrollPanelOrderByComprobanteTarjeta= new JScrollPane(jPanelOrderByComprobanteTarjeta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsComprobanteTarjeta = new GridBagConstraints();
			this.gridBagConstraintsComprobanteTarjeta.gridy =iPosYOrderBy;
			this.gridBagConstraintsComprobanteTarjeta.gridx =iPosXOrderBy;
			this.gridBagConstraintsComprobanteTarjeta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByComprobanteTarjeta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByComprobanteTarjeta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalComprobanteTarjeta);
			
			this.jInternalFrameOrderByComprobanteTarjeta.getContentPane().add(this.jScrollPanelOrderByComprobanteTarjeta, this.gridBagConstraintsComprobanteTarjeta);			
		
		} else {
			this.jButtonAbrirOrderByComprobanteTarjeta = new JButtonMe();
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
		int iWidthTableCalculado=0;//4730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.comprobantetarjetaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosComprobanteTarjeta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosComprobanteTarjeta.getRowHeight();//ComprobanteTarjetaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ComprobanteTarjetaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComprobanteTarjeta.isSelected()) {
					iHeightTable=ComprobanteTarjetaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComprobanteTarjetaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComprobanteTarjetaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ComprobanteTarjetaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComprobanteTarjeta.isSelected()) {
					iHeightTable=ComprobanteTarjetaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComprobanteTarjetaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComprobanteTarjetaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosComprobanteTarjeta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComprobanteTarjeta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComprobanteTarjeta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosComprobanteTarjeta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComprobanteTarjeta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComprobanteTarjeta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByComprobanteTarjeta!=null && this.jInternalFrameOrderByComprobanteTarjeta.getjTableDatosOrderBy()!=null) {
			//if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByComprobanteTarjeta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByComprobanteTarjeta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByComprobanteTarjeta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByComprobanteTarjeta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByComprobanteTarjeta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByComprobanteTarjeta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByComprobanteTarjeta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosComprobanteTarjeta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComprobanteTarjeta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComprobanteTarjeta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=comprobantetarjetaLogic.getComprobanteTarjetas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comprobantetarjetas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ComprobanteTarjeta> TraerComprobanteTarjetaBeans(List<ComprobanteTarjeta> comprobantetarjetas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetas) {
					
				if(!(ComprobanteTarjetaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ComprobanteTarjetaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					comprobantetarjeta.setsDetalleGeneralEntityReporte(ComprobanteTarjetaConstantesFunciones.getComprobanteTarjetaDescripcion(comprobantetarjeta));
										
						
					
						
					
				} else  {
							
					//comprobantetarjeta.setsDetalleGeneralEntityReporte(comprobantetarjeta.getsDetalleGeneralEntityReporte());
										
				}
				
				//comprobantetarjetabeans.add(comprobantetarjetabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return comprobantetarjetas;
    }
	//PARA REPORTES FIN
}
