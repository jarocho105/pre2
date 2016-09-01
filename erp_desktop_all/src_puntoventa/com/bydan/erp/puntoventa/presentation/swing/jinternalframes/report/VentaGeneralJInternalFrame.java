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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.puntoventa.util.report.VentaGeneralConstantesFunciones;

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
public class VentaGeneralJInternalFrame extends VentaGeneralBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVentaGeneral;
	
	protected JMenuBar jmenuBarVentaGeneral;
	
	protected JMenu jmenuVentaGeneral;
	protected JMenu jmenuDatosVentaGeneral;
	protected JMenu jmenuArchivoVentaGeneral;
	protected JMenu jmenuAccionesVentaGeneral;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVentaGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentaGeneral;	
	protected GridBagConstraints gridBagConstraintsVentaGeneral;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VentaGeneralDetalleFormJInternalFrame jInternalFrameDetalleFormVentaGeneral;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVentaGeneral;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVentaGeneral;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public VentaGeneralSessionBean ventageneralSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public ProductoSessionBean productoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VentaGeneral> ventagenerals;		
	public List<VentaGeneral> ventageneralsEliminados;	
	public List<VentaGeneral> ventageneralsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVentaGeneral;		
	protected JButton jButtonAbrirOrderByVentaGeneral;
	
	
	//protected JPanel jPanelOrderByVentaGeneral;
	//public JScrollPane jScrollPanelOrderByVentaGeneral;	
	//protected JButton jButtonCerrarOrderByVentaGeneral;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VentaGeneralLogic ventageneralLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVentaGeneral;
	public JScrollPane jScrollPanelDatosEdicionVentaGeneral;
	public JScrollPane jScrollPanelDatosGeneralVentaGeneral;
    
	
	
	//public JScrollPane jScrollPanelDatosVentaGeneralOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVentaGeneral;
	//public JScrollPane jScrollPanelImportacionVentaGeneral;
	
	
	
	protected JPanel jPanelAccionesVentaGeneral;
	
    protected JPanel jPanelPaginacionVentaGeneral;
    protected JPanel jPanelParametrosReportesVentaGeneral;
	protected JPanel jPanelParametrosReportesAccionesVentaGeneral;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VentaGeneral;
	protected JPanel jPanelParametrosAuxiliar2VentaGeneral;
	protected JPanel jPanelParametrosAuxiliar3VentaGeneral;
	protected JPanel jPanelParametrosAuxiliar4VentaGeneral;
	//protected JPanel jPanelParametrosAuxiliar5VentaGeneral;
	
	
	
	//protected JPanel jPanelReporteDinamicoVentaGeneral;
	//protected JPanel jPanelImportacionVentaGeneral;
	
	
	public JTable jTableDatosVentaGeneral;
	
	
	
	//public JTable jTableDatosVentaGeneralOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVentaGeneral;
	protected JButton jButtonDuplicarVentaGeneral;
	protected JButton jButtonCopiarVentaGeneral;
	protected JButton jButtonVerFormVentaGeneral;
	protected JButton jButtonNuevoRelacionesVentaGeneral;
	protected JButton jButtonModificarVentaGeneral;
	
    protected JButton jButtonGuardarCambiosTablaVentaGeneral;
	protected JButton jButtonCerrarVentaGeneral;
	
	
	protected JButton jButtonRecargarInformacionVentaGeneral;
	protected JButton jButtonProcesarInformacionVentaGeneral;
	
	
	protected JButton jButtonAnterioresVentaGeneral;
	protected JButton jButtonSiguientesVentaGeneral;
	protected JButton jButtonNuevoGuardarCambiosVentaGeneral;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVentaGeneral;
	//protected JButton jButtonCerrarReporteDinamicoVentaGeneral;
	//protected JButton jButtonGenerarExcelReporteDinamicoVentaGeneral;	
	
	
	
	//protected JButton jButtonAbrirImportacionVentaGeneral;
	//protected JButton jButtonGenerarImportacionVentaGeneral;
	//protected JButton jButtonCerrarImportacionVentaGeneral;
	//protected JFileChooser jFileChooserImportacionVentaGeneral;
	//protected File fileImportacionVentaGeneral;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentaGeneral;
	protected JButton jButtonDuplicarToolBarVentaGeneral;
	protected JButton jButtonNuevoRelacionesToolBarVentaGeneral;
	
	
	public JButton jButtonGuardarCambiosToolBarVentaGeneral;
	protected JButton jButtonCopiarToolBarVentaGeneral;
	protected JButton jButtonVerFormToolBarVentaGeneral;
	public JButton jButtonGuardarCambiosTablaToolBarVentaGeneral;
	protected JButton jButtonMostrarOcultarTablaToolBarVentaGeneral;
	protected JButton jButtonCerrarToolBarVentaGeneral;
	
	protected JButton jButtonRecargarInformacionToolBarVentaGeneral;
	protected JButton jButtonProcesarInformacionToolBarVentaGeneral;
	protected JButton jButtonAnterioresToolBarVentaGeneral;
	protected JButton jButtonSiguientesToolBarVentaGeneral;
	protected JButton jButtonNuevoGuardarCambiosToolBarVentaGeneral;
	protected JButton jButtonAbrirOrderByToolBarVentaGeneral;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentaGeneral;
	protected JMenuItem jMenuItemDuplicarVentaGeneral;
	protected JMenuItem jMenuItemNuevoRelacionesVentaGeneral;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVentaGeneral;
	protected JMenuItem jMenuItemCopiarVentaGeneral;
	protected JMenuItem jMenuItemVerFormVentaGeneral;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentaGeneral;
	protected JMenuItem jMenuItemCerrarVentaGeneral;
	protected JMenuItem jMenuItemDetalleCerrarVentaGeneral;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVentaGeneral;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentaGeneral;
	
	protected JMenuItem jMenuItemRecargarInformacionVentaGeneral;
	protected JMenuItem jMenuItemProcesarInformacionVentaGeneral;
	protected JMenuItem jMenuItemAnterioresVentaGeneral;
	protected JMenuItem jMenuItemSiguientesVentaGeneral;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentaGeneral;
	protected JMenuItem jMenuItemAbrirOrderByVentaGeneral;
	protected JMenuItem jMenuItemMostrarOcultarVentaGeneral;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentaGeneral;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVentaGeneral;
	protected JCheckBox jCheckBoxSeleccionadosVentaGeneral;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVentaGeneral;
	protected JCheckBox jCheckBoxConGraficoReporteVentaGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVentaGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVentaGeneral;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVentaGeneral;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVentaGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVentaGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVentaGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentaGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentaGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVentaGeneral;
	protected JTextField jTextFieldValorCampoGeneralVentaGeneral;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVentaGeneral;
	//public JList<Reporte> jListColumnasSelectReporteVentaGeneral;
	//public JScrollPane jScrollColumnasSelectReporteVentaGeneral;
	
	//public JLabel jLabelRelacionesSelectReporteVentaGeneral;
	//public JList<Reporte> jListRelacionesSelectReporteVentaGeneral;
	//public JScrollPane jScrollRelacionesSelectReporteVentaGeneral;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVentaGeneral;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVentaGeneral;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVentaGeneral;
	//public JLabel jLabelTiposArchivoReporteDinamicoVentaGeneral;
	
		
	//public JLabel jLabelArchivoImportacionVentaGeneral;	
	//public JLabel jLabelPathArchivoImportacionVentaGeneral;
	//protected JTextField jTextFieldPathArchivoImportacionVentaGeneral;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVentaGeneral;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVentaGeneral;
	
	//public JLabel jLabelColumnaCategoriaValorVentaGeneral;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVentaGeneral;
	
	//public JLabel jLabelColumnasValoresGraficoVentaGeneral;
	//public JList<Reporte> jListColumnasValoresGraficoVentaGeneral;
	//public JScrollPane jScrollColumnasValoresGraficoVentaGeneral;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVentaGeneral;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVentaGeneral;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVentaGeneral;
	public JPanel jPanelBusquedaVentaGeneralVentaGeneral;
	public JButton jButtonBusquedaVentaGeneralVentaGeneral;
	
	public JPanel jPanelfecha_desdeBusquedaVentaGeneralVentaGeneral;
	public JLabel jLabelfecha_desdeBusquedaVentaGeneralVentaGeneral;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaVentaGeneralVentaGeneral;

	public JDateChooser jDateChooserfecha_desdeBusquedaVentaGeneralVentaGeneral;
	public JButton jButtonfecha_desdeBusquedaVentaGeneralVentaGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaVentaGeneralVentaGeneral;
	public JLabel jLabelfecha_hastaBusquedaVentaGeneralVentaGeneral;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaVentaGeneralVentaGeneral;

	public JDateChooser jDateChooserfecha_hastaBusquedaVentaGeneralVentaGeneral;
	public JButton jButtonfecha_hastaBusquedaVentaGeneralVentaGeneralBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public VentaGeneralJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VentaGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentaGeneralJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentaGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentaGeneralJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentaGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentaGeneralJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentaGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVentaGeneral)	{
		this.jButtonRecargarInformacionVentaGeneral = jButtonRecargarInformacionVentaGeneral;
	}
	
	public JButton getjButtonProcesarInformacionVentaGeneral() {
		return this.jButtonProcesarInformacionVentaGeneral;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentaGeneral)	{
		this.jButtonProcesarInformacionVentaGeneral = jButtonProcesarInformacionVentaGeneral;
	}
	
	
	public JButton getjButtonRecargarInformacionVentaGeneral() {
		return this.jButtonRecargarInformacionVentaGeneral;
	}
	
	
	public List<VentaGeneral> getventagenerals() {
		return this.ventagenerals;
	}

	public void setventagenerals(List<VentaGeneral> ventagenerals) {
		this.ventagenerals = ventagenerals;
	}
	
	public List<VentaGeneral> getventageneralsAux() {
		return this.ventageneralsAux;
	}

	public void setventageneralsAux(List<VentaGeneral> ventageneralsAux) {
		this.ventageneralsAux = ventageneralsAux;
	}
	
	public List<VentaGeneral> getventageneralsEliminados() {
		return this.ventageneralsEliminados;
	}

	public void setVentaGeneralsEliminados(List<VentaGeneral> ventageneralsEliminados) {
		this.ventageneralsEliminados = ventageneralsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVentaGeneral() {
		return jComboBoxTiposSeleccionarVentaGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVentaGeneral(
			JComboBox jComboBoxTiposSeleccionarVentaGeneral) {
		this.jComboBoxTiposSeleccionarVentaGeneral = jComboBoxTiposSeleccionarVentaGeneral;
	}
	
	public void setBorderResaltarTiposSeleccionarVentaGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVentaGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVentaGeneral .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVentaGeneral() {
		return jTextFieldValorCampoGeneralVentaGeneral;
	}

	public void setjTextFieldValorCampoGeneralVentaGeneral(
			JTextField jTextFieldValorCampoGeneralVentaGeneral) {
		this.jTextFieldValorCampoGeneralVentaGeneral = jTextFieldValorCampoGeneralVentaGeneral;
	}

	public void setBorderResaltarValorCampoGeneralVentaGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaGeneral.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVentaGeneral .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVentaGeneral() {
		return this.jCheckBoxSeleccionarTodosVentaGeneral;
	}

	public void setjCheckBoxSeleccionarTodosVentaGeneral(
			JCheckBox jCheckBoxSeleccionarTodosVentaGeneral) {
		this.jCheckBoxSeleccionarTodosVentaGeneral = jCheckBoxSeleccionarTodosVentaGeneral;
	}

	public void setBorderResaltarSeleccionarTodosVentaGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaGeneral.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVentaGeneral .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVentaGeneral() {
		return this.jCheckBoxSeleccionadosVentaGeneral;
	}

	public void setjCheckBoxSeleccionadosVentaGeneral(
			JCheckBox jCheckBoxSeleccionadosVentaGeneral) {
		this.jCheckBoxSeleccionadosVentaGeneral = jCheckBoxSeleccionadosVentaGeneral;
	}
	
	public void setBorderResaltarSeleccionadosVentaGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaGeneral.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVentaGeneral .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVentaGeneral() {
		return this.jComboBoxTiposArchivosReportesVentaGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVentaGeneral(
			JComboBox jComboBoxTiposArchivosReportesVentaGeneral) {
		this.jComboBoxTiposArchivosReportesVentaGeneral = jComboBoxTiposArchivosReportesVentaGeneral;
	}

	public void setBorderResaltarTiposArchivosReportesVentaGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVentaGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVentaGeneral() {
		return this.jComboBoxTiposReportesVentaGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVentaGeneral(
			JComboBox jComboBoxTiposReportesVentaGeneral) {
		this.jComboBoxTiposReportesVentaGeneral = jComboBoxTiposReportesVentaGeneral;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVentaGeneral() {
	//	return jComboBoxTiposReportesDinamicoVentaGeneral;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVentaGeneral(
	//		JComboBox jComboBoxTiposReportesDinamicoVentaGeneral) {
	//	this.jComboBoxTiposReportesDinamicoVentaGeneral = jComboBoxTiposReportesDinamicoVentaGeneral;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVentaGeneral() {
	//	return jComboBoxTiposArchivosReportesDinamicoVentaGeneral;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVentaGeneral(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVentaGeneral) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVentaGeneral = jComboBoxTiposArchivosReportesDinamicoVentaGeneral;
	//}
	
	public void setBorderResaltarTiposReportesVentaGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVentaGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVentaGeneral() {
		return this.jComboBoxTiposGraficosReportesVentaGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVentaGeneral(
			JComboBox jComboBoxTiposGraficosReportesVentaGeneral) {
		this.jComboBoxTiposGraficosReportesVentaGeneral = jComboBoxTiposGraficosReportesVentaGeneral;
	}
	
	public void setBorderResaltarTiposGraficosReportesVentaGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVentaGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVentaGeneral() {
		return this.jComboBoxTiposPaginacionVentaGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVentaGeneral(
			JComboBox jComboBoxTiposPaginacionVentaGeneral) {
		this.jComboBoxTiposPaginacionVentaGeneral = jComboBoxTiposPaginacionVentaGeneral;
	}
	
	public void setBorderResaltarTiposPaginacionVentaGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVentaGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVentaGeneral() {
		return this.jComboBoxTiposRelacionesVentaGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentaGeneral() {
		return this.jComboBoxTiposAccionesVentaGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentaGeneral(
			JComboBox jComboBoxTiposRelacionesVentaGeneral) {
		this.jComboBoxTiposRelacionesVentaGeneral = jComboBoxTiposRelacionesVentaGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentaGeneral(
			JComboBox jComboBoxTiposAccionesVentaGeneral) {
		this.jComboBoxTiposAccionesVentaGeneral = jComboBoxTiposAccionesVentaGeneral;
	}
	
	public void setBorderResaltarTiposRelacionesVentaGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVentaGeneral .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVentaGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVentaGeneral .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVentaGeneral() {
	//	return jCheckBoxConGraficoDinamicoVentaGeneral;
	//}

	//public void setjCheckBoxConGraficoDinamicoVentaGeneral(
	//		JCheckBox jCheckBoxConGraficoDinamicoVentaGeneral) {
	//	this.jCheckBoxConGraficoDinamicoVentaGeneral = jCheckBoxConGraficoDinamicoVentaGeneral;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVentaGeneral() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVentaGeneral.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVentaGeneral .setBorder(borderResaltar);		
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
		this.ventageneralSessionBean=new VentaGeneralSessionBean();
		
		this.ventageneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventageneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventageneralSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VentaGeneralJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VentaGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentaGeneralJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentaGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentaGeneralJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Venta General MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {
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
		
		VentaGeneralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VentaGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVentaGeneral= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVentaGeneral,this.jTtoolBarVentaGeneral,
							"nuevo","nuevo","Nuevo"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVentaGeneral,this.jTtoolBarVentaGeneral,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVentaGeneral,this.jTtoolBarVentaGeneral,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVentaGeneral,this.jTtoolBarVentaGeneral,
							"duplicar","duplicar","Duplicar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVentaGeneral,this.jTtoolBarVentaGeneral,
							"copiar","copiar","Copiar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVentaGeneral,this.jTtoolBarVentaGeneral,
							"ver_form","ver_form","Ver"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentaGeneral,this.jTtoolBarVentaGeneral,
							"recargar","recargar","Buscar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentaGeneral,this.jTtoolBarVentaGeneral,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentaGeneral,this.jTtoolBarVentaGeneral,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVentaGeneral,this.jTtoolBarVentaGeneral,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVentaGeneral,this.jTtoolBarVentaGeneral,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVentaGeneral,this.jTtoolBarVentaGeneral,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVentaGeneral,this.jTtoolBarVentaGeneral,
							"cerrar","cerrar","Salir"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVentaGeneral=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVentaGeneral;
			
				this.jButtonProcesarInformacionToolBarVentaGeneral=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVentaGeneral;
				
		//protected JButton jButtonModificarToolBarVentaGeneral;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVentaGeneral=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVentaGeneral=new JMenuMe("General");
		this.jmenuArchivoVentaGeneral=new JMenuMe("Archivo");
		this.jmenuAccionesVentaGeneral=new JMenuMe("Acciones");
		this.jmenuDatosVentaGeneral=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentaGeneral= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentaGeneral.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentaGeneral,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVentaGeneral= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVentaGeneral.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVentaGeneral,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVentaGeneral= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVentaGeneral.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVentaGeneral,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVentaGeneral= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentaGeneral.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentaGeneral,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVentaGeneral= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVentaGeneral.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVentaGeneral,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVentaGeneral= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVentaGeneral.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVentaGeneral,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVentaGeneral= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVentaGeneral.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVentaGeneral,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentaGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentaGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentaGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVentaGeneral= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVentaGeneral.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVentaGeneral,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVentaGeneral= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVentaGeneral.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVentaGeneral,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVentaGeneral= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVentaGeneral.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVentaGeneral,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVentaGeneral= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVentaGeneral.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVentaGeneral,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVentaGeneral= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVentaGeneral.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVentaGeneral,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentaGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentaGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentaGeneral,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVentaGeneral= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVentaGeneral.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVentaGeneral,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentaGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentaGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentaGeneral,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVentaGeneral= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVentaGeneral.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVentaGeneral,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVentaGeneral.add(this.jMenuItemCerrarVentaGeneral);
			
			this.jmenuAccionesVentaGeneral.add(this.jMenuItemNuevoVentaGeneral);
			this.jmenuAccionesVentaGeneral.add(this.jMenuItemNuevoGuardarCambiosVentaGeneral);
			this.jmenuAccionesVentaGeneral.add(this.jMenuItemNuevoRelacionesVentaGeneral);
			this.jmenuAccionesVentaGeneral.add(this.jMenuItemGuardarCambiosTablaVentaGeneral);		
			this.jmenuAccionesVentaGeneral.add(this.jMenuItemDuplicarVentaGeneral);		
			this.jmenuAccionesVentaGeneral.add(this.jMenuItemCopiarVentaGeneral);		
			this.jmenuAccionesVentaGeneral.add(this.jMenuItemVerFormVentaGeneral);		
			
			this.jmenuDatosVentaGeneral.add(this.jMenuItemRecargarInformacionVentaGeneral);				
			this.jmenuDatosVentaGeneral.add(this.jMenuItemAnterioresVentaGeneral);				
			this.jmenuDatosVentaGeneral.add(this.jMenuItemSiguientesVentaGeneral);				
			this.jmenuDatosVentaGeneral.add(this.jMenuItemAbrirOrderByVentaGeneral);				
			this.jmenuDatosVentaGeneral.add(this.jMenuItemMostrarOcultarVentaGeneral);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVentaGeneral.add(this.jMenuItemGuardarCambiosVentaGeneral);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVentaGeneral.add(this.jmenuArchivoVentaGeneral);		
			this.jmenuBarVentaGeneral.add(this.jmenuAccionesVentaGeneral);		
			this.jmenuBarVentaGeneral.add(this.jmenuDatosVentaGeneral);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVentaGeneral);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVentaGeneral() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaVentaGeneralVentaGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaVentaGeneralVentaGeneral.setToolTipText("Buscar Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaVentaGeneralVentaGeneral= new JButtonMe();
		this.jButtonBusquedaVentaGeneralVentaGeneral.setText("Buscar");
		this.jButtonBusquedaVentaGeneralVentaGeneral.setToolTipText("Buscar Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaVentaGeneralVentaGeneral,"buscar_button","Buscar Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaVentaGeneralVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_desdeBusquedaVentaGeneralVentaGeneral = new JLabelMe();
		jLabelfecha_desdeBusquedaVentaGeneralVentaGeneral.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaVentaGeneralVentaGeneral.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaVentaGeneralVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaVentaGeneralVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaVentaGeneralVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaVentaGeneralVentaGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaVentaGeneralVentaGeneral= new JDateChooser();
		jDateChooserfecha_desdeBusquedaVentaGeneralVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaVentaGeneralVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaVentaGeneralVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaVentaGeneralVentaGeneral,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaVentaGeneralVentaGeneral.setDate(new Date());
		jDateChooserfecha_desdeBusquedaVentaGeneralVentaGeneral.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaVentaGeneralVentaGeneral.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaVentaGeneralVentaGeneral = new JLabelMe();
		jLabelfecha_hastaBusquedaVentaGeneralVentaGeneral.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaVentaGeneralVentaGeneral.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaVentaGeneralVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaVentaGeneralVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaVentaGeneralVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaVentaGeneralVentaGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaVentaGeneralVentaGeneral= new JDateChooser();
		jDateChooserfecha_hastaBusquedaVentaGeneralVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaVentaGeneralVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaVentaGeneralVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaVentaGeneralVentaGeneral,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaVentaGeneralVentaGeneral.setDate(new Date());
		jDateChooserfecha_hastaBusquedaVentaGeneralVentaGeneral.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaVentaGeneralVentaGeneral.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasVentaGeneral=new JTabbedPane();


		this.jTabbedPaneBusquedasVentaGeneral.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVentaGeneral.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVentaGeneral.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVentaGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVentaGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVentaGeneral = new VentaGeneralDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Venta General DATOS");
			this.jInternalFrameDetalleFormVentaGeneral = new VentaGeneralDetalleFormJInternalFrame(jDesktopPane,this.ventageneralSessionBean.getConGuardarRelaciones(),this.ventageneralSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVentaGeneral = null;//new VentaGeneralDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentaGeneral= new GridBagLayout();
		
		
		this.jTableDatosVentaGeneral = new JTableMe();      
		
		String sToolTipVentaGeneral="";
		sToolTipVentaGeneral=VentaGeneralConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentaGeneral+="(PuntoVenta.VentaGeneral)";
		}
		
		if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentaGeneral+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVentaGeneral.setToolTipText(sToolTipVentaGeneral);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVentaGeneral);
		this.jTableDatosVentaGeneral.setAutoCreateRowSorter(true);
		this.jTableDatosVentaGeneral.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVentaGeneral.setRowSelectionAllowed(true);
		this.jTableDatosVentaGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVentaGeneral,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVentaGeneral = new JButtonMe();
		this.jButtonDuplicarVentaGeneral = new JButtonMe();
		this.jButtonCopiarVentaGeneral = new JButtonMe();
		this.jButtonVerFormVentaGeneral = new JButtonMe();
		this.jButtonNuevoRelacionesVentaGeneral = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVentaGeneral = new JButtonMe();
		this.jButtonCerrarVentaGeneral = new JButtonMe();
		
		this.jScrollPanelDatosVentaGeneral = new JScrollPane();   
        this.jScrollPanelDatosGeneralVentaGeneral = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVentaGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Venta General";
		
		if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Venta Generales" + this.sPath));
		} else {
			this.jScrollPanelDatosVentaGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentaGeneral.setToolTipText("Acciones");
        this.jPanelAccionesVentaGeneral.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVentaGeneral=new ReporteDinamicoJInternalFrame(VentaGeneralConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVentaGeneral();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVentaGeneral=new ImportacionJInternalFrame(VentaGeneralConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVentaGeneral();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVentaGeneral = new JButtonMe();
		
		this.jButtonAbrirOrderByVentaGeneral.setText("Orden");
		this.jButtonAbrirOrderByVentaGeneral.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentaGeneral,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVentaGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentaGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentaGeneral,false,this);
			
			//this.cargarOrderByVentaGeneral(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentaGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentaGeneral,true,this);
			
			//this.cargarOrderByVentaGeneral(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVentaGeneral.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosVentaGeneral.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosVentaGeneral.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosVentaGeneral.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentaGeneral.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentaGeneral.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVentaGeneral.setText("Nuevo");
		this.jButtonDuplicarVentaGeneral.setText("Duplicar");
		this.jButtonCopiarVentaGeneral.setText("Copiar");
		this.jButtonVerFormVentaGeneral.setText("Ver");
		this.jButtonNuevoRelacionesVentaGeneral.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVentaGeneral.setText("Guardar");
		this.jButtonCerrarVentaGeneral.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentaGeneral,"nuevo_button","Nuevo",this.ventageneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVentaGeneral,"duplicar_button","Duplicar",this.ventageneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVentaGeneral,"copiar_button","Copiar",this.ventageneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVentaGeneral,"ver_form","Ver",this.ventageneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVentaGeneral,"nuevorelaciones_button","Nuevo Rel",this.ventageneralSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentaGeneral,"guardarcambiostabla_button","Guardar",this.ventageneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentaGeneral,"cerrar_button","Salir",this.ventageneralSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVentaGeneral.setToolTipText("Nuevo"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVentaGeneral.setToolTipText("Duplicar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVentaGeneral.setToolTipText("Copiar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVentaGeneral.setToolTipText("Ver"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVentaGeneral.setToolTipText("Nuevo Rel"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVentaGeneral.setToolTipText("Guardar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentaGeneral.setToolTipText("Salir"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentaGeneral";
		inputMap = this.jButtonNuevoVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentaGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentaGeneral"));
		
		//DUPLICAR
		sMapKey = "DuplicarVentaGeneral";
		inputMap = this.jButtonDuplicarVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVentaGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVentaGeneral"));
		
		//COPIAR
		sMapKey = "CopiarVentaGeneral";
		inputMap = this.jButtonCopiarVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVentaGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVentaGeneral"));
		
		//VEr FORM
		sMapKey = "VerFormVentaGeneral";
		inputMap = this.jButtonVerFormVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVentaGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVentaGeneral"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVentaGeneral";
		inputMap = this.jButtonNuevoRelacionesVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVentaGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVentaGeneral"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVentaGeneral";
		inputMap = this.jButtonModificarVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVentaGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVentaGeneral"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVentaGeneral";
		inputMap = this.jButtonCerrarVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentaGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentaGeneral"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentaGeneral";
		inputMap = this.jButtonGuardarCambiosTablaVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentaGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentaGeneral"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVentaGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVentaGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVentaGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VentaGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VentaGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VentaGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VentaGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VentaGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVentaGeneral.setName("jPanelParametrosReportesVentaGeneral"); 
		
		this.jPanelParametrosReportesAccionesVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVentaGeneral.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVentaGeneral.setName("jPanelParametrosReportesAccionesVentaGeneral"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVentaGeneral = new JButtonMe();
		this.jButtonRecargarInformacionVentaGeneral.setText("Buscar");
		this.jButtonRecargarInformacionVentaGeneral.setToolTipText("Buscar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVentaGeneral,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionVentaGeneral.setVisible(false);
		
		
		this.jButtonProcesarInformacionVentaGeneral = new JButtonMe();
		this.jButtonProcesarInformacionVentaGeneral.setText("Procesar");
		this.jButtonProcesarInformacionVentaGeneral.setToolTipText("Procesar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVentaGeneral.setVisible(false);
			
		this.jButtonProcesarInformacionVentaGeneral.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentaGeneral.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentaGeneral.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVentaGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentaGeneral.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVentaGeneral.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVentaGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentaGeneral.setText("TIPO");       
		this.jComboBoxTiposReportesVentaGeneral.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVentaGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentaGeneral.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVentaGeneral.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVentaGeneral = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVentaGeneral.setText("Paginacion");
		this.jComboBoxTiposPaginacionVentaGeneral.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVentaGeneral = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVentaGeneral.setText("Accion");
		this.jComboBoxTiposRelacionesVentaGeneral.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVentaGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentaGeneral.setText("Accion");
		this.jComboBoxTiposAccionesVentaGeneral.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVentaGeneral = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVentaGeneral.setText("Accion");
		this.jComboBoxTiposSeleccionarVentaGeneral.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVentaGeneral=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVentaGeneral.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentaGeneral.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentaGeneral.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVentaGeneral = new JLabelMe();
		
		this.jLabelAccionesVentaGeneral.setText("Acciones");		
		this.jLabelAccionesVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVentaGeneral = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVentaGeneral.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVentaGeneral.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVentaGeneral = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVentaGeneral.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVentaGeneral.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVentaGeneral = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVentaGeneral.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVentaGeneral.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVentaGeneral = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVentaGeneral.setText("Graf.");
		this.jCheckBoxConGraficoReporteVentaGeneral.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVentaGeneral = new JButtonMe();
		//this.jButtonAnterioresVentaGeneral.setText("<<");
        this.jButtonAnterioresVentaGeneral.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVentaGeneral,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVentaGeneral = new JButtonMe();
		//this.jButtonSiguientesVentaGeneral.setText(">>");
        this.jButtonSiguientesVentaGeneral.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVentaGeneral,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVentaGeneral = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVentaGeneral.setText("Nue");
        this.jButtonNuevoGuardarCambiosVentaGeneral.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVentaGeneral,"nuevoguardarcambios_button","Nue",this.ventageneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVentaGeneral";
		inputMap = this.jButtonNuevoGuardarCambiosVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVentaGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVentaGeneral"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVentaGeneral";
		inputMap = this.jButtonRecargarInformacionVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVentaGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVentaGeneral"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVentaGeneral";
		inputMap = this.jButtonSiguientesVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVentaGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVentaGeneral"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVentaGeneral";
		inputMap = this.jButtonAnterioresVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVentaGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVentaGeneral"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVentaGeneral();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVentaGeneral.setMinimumSize(new Dimension(this.getWidth(),VentaGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentaGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentaGeneral.setMaximumSize(new Dimension(this.getWidth(),VentaGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentaGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentaGeneral.setPreferredSize(new Dimension(this.getWidth(),VentaGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentaGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVentaGeneral = new GridBagLayout();

			this.jPanelPaginacionVentaGeneral.setLayout(gridaBagLayoutPaginacionVentaGeneral);						
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy = 0;
			this.gridBagConstraintsVentaGeneral.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVentaGeneral.add(this.jButtonAnterioresVentaGeneral, this.gridBagConstraintsVentaGeneral);
					
						
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentaGeneral.gridy = 0;
			
			this.jPanelPaginacionVentaGeneral.add(this.jButtonNuevoGuardarCambiosVentaGeneral, this.gridBagConstraintsVentaGeneral);
						
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVentaGeneral.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentaGeneral.gridy = 0;
			this.jPanelPaginacionVentaGeneral.add(this.jButtonSiguientesVentaGeneral, this.gridBagConstraintsVentaGeneral);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy = 1;
			this.gridBagConstraintsVentaGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentaGeneral.add(this.jButtonNuevoVentaGeneral, this.gridBagConstraintsVentaGeneral);
						
			
			
			if(!this.ventageneralSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
				this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVentaGeneral.gridy = 1;
				this.gridBagConstraintsVentaGeneral.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVentaGeneral.add(this.jButtonGuardarCambiosTablaVentaGeneral, this.gridBagConstraintsVentaGeneral);
			}
			
			
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy = 1;
			this.gridBagConstraintsVentaGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentaGeneral.add(this.jButtonDuplicarVentaGeneral, this.gridBagConstraintsVentaGeneral);
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy = 1;
			this.gridBagConstraintsVentaGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentaGeneral.add(this.jButtonCopiarVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy = 1;
			this.gridBagConstraintsVentaGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentaGeneral.add(this.jButtonVerFormVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy = 1;
			this.gridBagConstraintsVentaGeneral.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVentaGeneral.add(this.jButtonCerrarVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
		
		
		this.jButtonRecargarInformacionVentaGeneral.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentaGeneral.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentaGeneral.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVentaGeneral.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentaGeneral.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentaGeneral.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVentaGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentaGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentaGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVentaGeneral.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentaGeneral.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentaGeneral.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVentaGeneral.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentaGeneral.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentaGeneral.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVentaGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentaGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentaGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVentaGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentaGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentaGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVentaGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentaGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentaGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVentaGeneral.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentaGeneral.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentaGeneral.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVentaGeneral.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentaGeneral.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentaGeneral.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVentaGeneral.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentaGeneral.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentaGeneral.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVentaGeneral.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentaGeneral.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentaGeneral.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVentaGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVentaGeneral = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VentaGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VentaGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VentaGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VentaGeneral = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVentaGeneral.setLayout(gridaBagParametrosReportesVentaGeneral);
			this.jPanelParametrosReportesAccionesVentaGeneral.setLayout(gridaBagParametrosReportesAccionesVentaGeneral);
			
			
			this.jPanelParametrosAuxiliar1VentaGeneral.setLayout(gridaBagParametrosAuxiliar1VentaGeneral);
			this.jPanelParametrosAuxiliar2VentaGeneral.setLayout(gridaBagParametrosAuxiliar2VentaGeneral);
			this.jPanelParametrosAuxiliar3VentaGeneral.setLayout(gridaBagParametrosAuxiliar3VentaGeneral);
			this.jPanelParametrosAuxiliar4VentaGeneral.setLayout(gridaBagParametrosAuxiliar4VentaGeneral);
			//this.jPanelParametrosAuxiliar5VentaGeneral.setLayout(gridaBagParametrosAuxiliar2VentaGeneral);			
			
			
			
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentaGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentaGeneral.add(this.jButtonRecargarInformacionVentaGeneral, this.gridBagConstraintsVentaGeneral);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentaGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentaGeneral.add(this.jComboBoxTiposPaginacionVentaGeneral, this.gridBagConstraintsVentaGeneral);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentaGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentaGeneral.add(this.jCheckBoxConAltoMaximoTablaVentaGeneral, this.gridBagConstraintsVentaGeneral);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentaGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentaGeneral.add(this.jComboBoxTiposArchivosReportesVentaGeneral, this.gridBagConstraintsVentaGeneral);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentaGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentaGeneral.add(this.jPanelParametrosAuxiliar1VentaGeneral, this.gridBagConstraintsVentaGeneral);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentaGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VentaGeneral.add(this.jComboBoxTiposReportesVentaGeneral, this.gridBagConstraintsVentaGeneral);																		
			
			
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentaGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4VentaGeneral.add(this.jComboBoxTiposGraficosReportesVentaGeneral, this.gridBagConstraintsVentaGeneral);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentaGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentaGeneral.add(this.jPanelParametrosAuxiliar4VentaGeneral, this.gridBagConstraintsVentaGeneral);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaGeneral.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentaGeneral.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentaGeneral.add(this.jComboBoxTiposReportesVentaGeneral, this.gridBagConstraintsVentaGeneral);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentaGeneral.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentaGeneral.add(this.jCheckBoxGenerarReporteVentaGeneral, this.gridBagConstraintsVentaGeneral);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentaGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentaGeneral.add(this.jPanelParametrosAuxiliar2VentaGeneral, this.gridBagConstraintsVentaGeneral);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentaGeneral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentaGeneral.add(this.jLabelAccionesVentaGeneral, this.gridBagConstraintsVentaGeneral);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
				this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVentaGeneral.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVentaGeneral.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVentaGeneral.add(this.jButtonAbrirOrderByVentaGeneral, this.gridBagConstraintsVentaGeneral);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVentaGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentaGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentaGeneral.add(this.jComboBoxTiposSeleccionarVentaGeneral, this.gridBagConstraintsVentaGeneral);			
			
			
			/*
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentaGeneral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentaGeneral.add(this.jCheckBoxSeleccionarTodosVentaGeneral, this.gridBagConstraintsVentaGeneral);
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentaGeneral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentaGeneral.add(this.jCheckBoxConGraficoReporteVentaGeneral, this.gridBagConstraintsVentaGeneral);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentaGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentaGeneral.add(this.jCheckBoxSeleccionarTodosVentaGeneral, this.gridBagConstraintsVentaGeneral);															
				
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentaGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentaGeneral.add(this.jCheckBoxSeleccionadosVentaGeneral, this.gridBagConstraintsVentaGeneral);															
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentaGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentaGeneral.add(this.jCheckBoxConGraficoReporteVentaGeneral, this.gridBagConstraintsVentaGeneral);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentaGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentaGeneral.add(this.jPanelParametrosAuxiliar3VentaGeneral, this.gridBagConstraintsVentaGeneral);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentaGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentaGeneral.add(this.jComboBoxTiposAccionesVentaGeneral, this.gridBagConstraintsVentaGeneral);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVentaGeneral = new GridBagLayout();

			this.jScrollPanelDatosVentaGeneral.setLayout(gridaBagLayoutDatosVentaGeneral);
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy = 0;
			this.gridBagConstraintsVentaGeneral.gridx = 0;
			
			this.jScrollPanelDatosVentaGeneral.add(this.jTableDatosVentaGeneral, this.gridBagConstraintsVentaGeneral);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVentaGeneral.setViewportView(this.jTableDatosVentaGeneral);
		this.jTableDatosVentaGeneral.setFillsViewportHeight(true);
		this.jTableDatosVentaGeneral.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVentaGeneral= new GridBagLayout();
		this.jPanelAccionesVentaGeneral.setLayout(gridaBagLayoutAccionesVentaGeneral);
		
		
		/*	
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 0;
			
		this.jPanelAccionesVentaGeneral.add(this.jButtonNuevoVentaGeneral, this.gridBagConstraintsVentaGeneral);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaVentaGeneralVentaGeneral= new GridBagLayout();
		gridaBagLayoutBusquedaVentaGeneralVentaGeneral.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaVentaGeneralVentaGeneral.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaVentaGeneralVentaGeneral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaVentaGeneralVentaGeneral.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaVentaGeneralVentaGeneral.setLayout(gridaBagLayoutBusquedaVentaGeneralVentaGeneral);

		gridBagConstraintsVentaGeneral = new GridBagConstraints();
		gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentaGeneral.gridy = 0;
		gridBagConstraintsVentaGeneral.gridx = 0;
		jPanelBusquedaVentaGeneralVentaGeneral.add(jLabelfecha_desdeBusquedaVentaGeneralVentaGeneral, gridBagConstraintsVentaGeneral);

		gridBagConstraintsVentaGeneral = new GridBagConstraints();
		gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentaGeneral.gridy = 0;
		gridBagConstraintsVentaGeneral.gridx = 1;
		jPanelBusquedaVentaGeneralVentaGeneral.add(jDateChooserfecha_desdeBusquedaVentaGeneralVentaGeneral, gridBagConstraintsVentaGeneral);


		gridBagConstraintsVentaGeneral = new GridBagConstraints();
		gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentaGeneral.gridy = 1;
		gridBagConstraintsVentaGeneral.gridx = 0;
		jPanelBusquedaVentaGeneralVentaGeneral.add(jLabelfecha_hastaBusquedaVentaGeneralVentaGeneral, gridBagConstraintsVentaGeneral);

		gridBagConstraintsVentaGeneral = new GridBagConstraints();
		gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentaGeneral.gridy = 1;
		gridBagConstraintsVentaGeneral.gridx = 1;
		jPanelBusquedaVentaGeneralVentaGeneral.add(jDateChooserfecha_hastaBusquedaVentaGeneralVentaGeneral, gridBagConstraintsVentaGeneral);

		gridBagConstraintsVentaGeneral = new GridBagConstraints();
		gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentaGeneral.gridy = 2;
		gridBagConstraintsVentaGeneral.gridx =1;
		jPanelBusquedaVentaGeneralVentaGeneral.add(jButtonBusquedaVentaGeneralVentaGeneral, gridBagConstraintsVentaGeneral);

		jTabbedPaneBusquedasVentaGeneral.addTab("1.-Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaVentaGeneralVentaGeneral);
		jTabbedPaneBusquedasVentaGeneral.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentaGeneral = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentaGeneral);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventageneralSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();						
			this.gridBagConstraintsVentaGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentaGeneral.gridx = 0;		
			//this.gridBagConstraintsVentaGeneral.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentaGeneral.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVentaGeneral, this.gridBagConstraintsVentaGeneral);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVentaGeneral.gridx = 0;		
		//this.gridBagConstraintsVentaGeneral.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVentaGeneral.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVentaGeneral);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVentaGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentaGeneral.gridx = 0;		
			this.gridBagConstraintsVentaGeneral.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVentaGeneral.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVentaGeneral, this.gridBagConstraintsVentaGeneral);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentaGeneral.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVentaGeneral, this.gridBagConstraintsVentaGeneral);								
		
		
		/*
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentaGeneral.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVentaGeneral, this.gridBagConstraintsVentaGeneral);
		*/		
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentaGeneral.gridx =0;
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentaGeneral.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentaGeneral, this.gridBagConstraintsVentaGeneral);
				
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentaGeneral.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVentaGeneral, this.gridBagConstraintsVentaGeneral);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VentaGeneralJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVentaGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentaGeneral = new GridBagLayout();
			this.jPanelBusquedasParametrosVentaGeneral.setLayout(gridaBagLayoutBusquedasParametrosVentaGeneral);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVentaGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentaGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentaGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentaGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentaGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentaGeneral, this.gridBagConstraintsVentaGeneral);
			
			
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentaGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
			
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentaGeneral.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentaGeneral, this.gridBagConstraintsVentaGeneral);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVentaGeneral;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVentaGeneral() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVentaGeneral = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVentaGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVentaGeneral.setName("jPanelReporteDinamicoVentaGeneral"); 
		
		this.jPanelReporteDinamicoVentaGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentaGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentaGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVentaGeneral.setLayout(gridaBagLayoutReporteDinamicoVentaGeneral);
		
		
		this.jInternalFrameReporteDinamicoVentaGeneral= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVentaGeneral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentaGeneral= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVentaGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVentaGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVentaGeneral.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVentaGeneral.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVentaGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVentaGeneral.setResizable(true);
	    this.jInternalFrameReporteDinamicoVentaGeneral.setClosable(true);
	    this.jInternalFrameReporteDinamicoVentaGeneral.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVentaGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentaGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentaGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Venta Generales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVentaGeneral = new JLabelMe();

		this.jLabelColumnasSelectReporteVentaGeneral.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentaGeneral.add(this.jLabelColumnasSelectReporteVentaGeneral, this.gridBagConstraintsVentaGeneral);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVentaGeneral = new JList<Reporte>();
		this.jListColumnasSelectReporteVentaGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVentaGeneral.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVentaGeneral.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentaGeneral.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentaGeneral.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVentaGeneral=new JScrollPane(this.jListColumnasSelectReporteVentaGeneral);
			
			this.jScrollColumnasSelectReporteVentaGeneral.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentaGeneral.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentaGeneral.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVentaGeneral.add(this.jListColumnasSelectReporteVentaGeneral, this.gridBagConstraintsVentaGeneral);
		this.jPanelReporteDinamicoVentaGeneral.add(this.jScrollColumnasSelectReporteVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVentaGeneral = new JLabelMe();

		this.jLabelRelacionesSelectReporteVentaGeneral.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVentaGeneral = new JList<Reporte>();
		this.jListRelacionesSelectReporteVentaGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVentaGeneral.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVentaGeneral.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentaGeneral.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentaGeneral.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVentaGeneral=new JScrollPane(this.jListRelacionesSelectReporteVentaGeneral);
			
			this.jScrollRelacionesSelectReporteVentaGeneral.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentaGeneral.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentaGeneral.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVentaGeneral = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVentaGeneral = new JComboBoxMe();
		this.jListColumnasValoresGraficoVentaGeneral = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVentaGeneral = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVentaGeneral.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVentaGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentaGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentaGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVentaGeneral = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVentaGeneral.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVentaGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentaGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentaGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVentaGeneral = new JLabelMe();

		this.jLabelConGraficoDinamicoVentaGeneral.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentaGeneral.add(this.jLabelConGraficoDinamicoVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVentaGeneral = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVentaGeneral.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVentaGeneral.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVentaGeneral.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentaGeneral.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentaGeneral.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentaGeneral.add(this.jCheckBoxConGraficoDinamicoVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVentaGeneral = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVentaGeneral.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentaGeneral.add(this.jLabelColumnaCategoriaGraficoVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVentaGeneral = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentaGeneral.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVentaGeneral.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVentaGeneral.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentaGeneral.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentaGeneral.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVentaGeneral.add(this.jComboBoxColumnaCategoriaGraficoVentaGeneral, this.gridBagConstraintsVentaGeneral);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVentaGeneral = new JLabelMe();

		this.jLabelColumnaCategoriaValorVentaGeneral.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentaGeneral.add(this.jLabelColumnaCategoriaValorVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVentaGeneral = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVentaGeneral.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVentaGeneral.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVentaGeneral.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentaGeneral.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentaGeneral.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVentaGeneral.add(this.jComboBoxColumnaCategoriaValorVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVentaGeneral = new JLabelMe();

		this.jLabelColumnasValoresGraficoVentaGeneral.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentaGeneral.add(this.jLabelColumnasValoresGraficoVentaGeneral, this.gridBagConstraintsVentaGeneral);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVentaGeneral = new JList<Reporte>();
		this.jListColumnasValoresGraficoVentaGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVentaGeneral.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVentaGeneral.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentaGeneral.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentaGeneral.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVentaGeneral=new JScrollPane(this.jListColumnasValoresGraficoVentaGeneral);
			
			this.jScrollColumnasValoresGraficoVentaGeneral.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentaGeneral.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentaGeneral.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVentaGeneral.add(this.jListColumnasSelectReporteVentaGeneral, this.gridBagConstraintsVentaGeneral);
		this.jPanelReporteDinamicoVentaGeneral.add(this.jScrollColumnasValoresGraficoVentaGeneral, this.gridBagConstraintsVentaGeneral);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVentaGeneral = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVentaGeneral.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentaGeneral.add(this.jLabelTiposGraficosReportesDinamicoVentaGeneral, this.gridBagConstraintsVentaGeneral);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVentaGeneral = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentaGeneral.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVentaGeneral.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVentaGeneral.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentaGeneral.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentaGeneral.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentaGeneral.add(this.jComboBoxTiposGraficosReportesDinamicoVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVentaGeneral = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVentaGeneral.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentaGeneral.add(this.jLabelGenerarExcelReporteDinamicoVentaGeneral, this.gridBagConstraintsVentaGeneral);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVentaGeneral = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVentaGeneral.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVentaGeneral,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVentaGeneral.setToolTipText("Generar EXCEL"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVentaGeneral.add(this.jButtonGenerarExcelReporteDinamicoVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentaGeneral.add(this.jComboBoxTiposReportesDinamicoVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVentaGeneral = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVentaGeneral.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentaGeneral.add(this.jLabelTiposArchivoReporteDinamicoVentaGeneral, this.gridBagConstraintsVentaGeneral);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentaGeneral.add(this.jComboBoxTiposArchivosReportesDinamicoVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVentaGeneral = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVentaGeneral.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVentaGeneral,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVentaGeneral.setToolTipText("Generar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentaGeneral.add(this.jButtonGenerarReporteDinamicoVentaGeneral, this.gridBagConstraintsVentaGeneral);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVentaGeneral = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVentaGeneral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVentaGeneral,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVentaGeneral.setToolTipText("Cancelar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentaGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentaGeneral.add(this.jButtonCerrarReporteDinamicoVentaGeneral, this.gridBagConstraintsVentaGeneral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVentaGeneral = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVentaGeneral= new JScrollPane(jPanelReporteDinamicoVentaGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVentaGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentaGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentaGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Venta Generales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVentaGeneral.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVentaGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVentaGeneral.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVentaGeneral);
		this.jInternalFrameReporteDinamicoVentaGeneral.getContentPane().add(this.jScrollPanelReporteDinamicoVentaGeneral, this.gridBagConstraintsVentaGeneral);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVentaGeneral() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVentaGeneral = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVentaGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVentaGeneral.setName("jPanelImportacionVentaGeneral"); 
		
		this.jPanelImportacionVentaGeneral.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentaGeneral.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentaGeneral.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVentaGeneral.setLayout(gridaBagLayoutImportacionVentaGeneral);
		
		
		this.jInternalFrameImportacionVentaGeneral= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVentaGeneral= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVentaGeneral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentaGeneral= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVentaGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentaGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentaGeneral.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVentaGeneral.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentaGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentaGeneral.setResizable(true);
	    this.jInternalFrameImportacionVentaGeneral.setClosable(true);
	    this.jInternalFrameImportacionVentaGeneral.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVentaGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentaGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentaGeneral.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVentaGeneral.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentaGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentaGeneral.setResizable(true);
	    this.jInternalFrameImportacionVentaGeneral.setClosable(true);
	    this.jInternalFrameImportacionVentaGeneral.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVentaGeneral.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentaGeneral.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentaGeneral.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Venta Generales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVentaGeneral = new JLabelMe();

		this.jLabelArchivoImportacionVentaGeneral.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentaGeneral.add(this.jLabelArchivoImportacionVentaGeneral, this.gridBagConstraintsVentaGeneral);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVentaGeneral = new JFileChooser();		
		this.jFileChooserImportacionVentaGeneral.setToolTipText("ESCOGER ARCHIVO"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVentaGeneral = new JButtonMe();
		this.jButtonAbrirImportacionVentaGeneral.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVentaGeneral,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVentaGeneral.setToolTipText("Generar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsVentaGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentaGeneral.add(this.jButtonAbrirImportacionVentaGeneral, this.gridBagConstraintsVentaGeneral);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVentaGeneral = new JLabelMe();

		this.jLabelPathArchivoImportacionVentaGeneral.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentaGeneral.add(this.jLabelPathArchivoImportacionVentaGeneral, this.gridBagConstraintsVentaGeneral);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVentaGeneral=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVentaGeneral.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentaGeneral.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentaGeneral.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsVentaGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentaGeneral.add(this.jTextFieldPathArchivoImportacionVentaGeneral, this.gridBagConstraintsVentaGeneral);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVentaGeneral = new JButtonMe();
		this.jButtonGenerarImportacionVentaGeneral.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVentaGeneral,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVentaGeneral.setToolTipText("Generar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsVentaGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentaGeneral.add(this.jButtonGenerarImportacionVentaGeneral, this.gridBagConstraintsVentaGeneral);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVentaGeneral = new JButtonMe();
		this.jButtonCerrarImportacionVentaGeneral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVentaGeneral,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVentaGeneral.setToolTipText("Cancelar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsVentaGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentaGeneral.add(this.jButtonCerrarImportacionVentaGeneral, this.gridBagConstraintsVentaGeneral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVentaGeneral = new GridBagLayout();
		
		this.jScrollPanelImportacionVentaGeneral= new JScrollPane(jPanelImportacionVentaGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy =iPosYImportacion;
		this.gridBagConstraintsVentaGeneral.gridx =iPosXImportacion;
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVentaGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVentaGeneral.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVentaGeneral);
		this.jInternalFrameImportacionVentaGeneral.getContentPane().add(this.jScrollPanelImportacionVentaGeneral, this.gridBagConstraintsVentaGeneral);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVentaGeneral(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVentaGeneral = new JButtonMe();
			this.jButtonAbrirOrderByVentaGeneral.setText("Orden");
			this.jButtonAbrirOrderByVentaGeneral.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentaGeneral,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVentaGeneral";
			inputMap = this.jButtonAbrirOrderByVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVentaGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVentaGeneral"));
		
		
			GridBagLayout gridaBagLayoutOrderByVentaGeneral = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVentaGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVentaGeneral.setName("jPanelOrderByVentaGeneral"); 
			
			this.jPanelOrderByVentaGeneral.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentaGeneral.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentaGeneral.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVentaGeneral.setLayout(gridaBagLayoutOrderByVentaGeneral);
			
			
			this.jTableDatosVentaGeneralOrderBy = new JTableMe();        
			this.jTableDatosVentaGeneralOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVentaGeneralOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVentaGeneralOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVentaGeneralOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVentaGeneralOrderBy.setViewportView(this.jTableDatosVentaGeneralOrderBy);
			this.jTableDatosVentaGeneralOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVentaGeneralOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVentaGeneral= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVentaGeneral= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVentaGeneral = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVentaGeneral= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVentaGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVentaGeneral.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVentaGeneral.setTitle("Orden");
			this.jInternalFrameOrderByVentaGeneral.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVentaGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVentaGeneral.setResizable(true);
			this.jInternalFrameOrderByVentaGeneral.setClosable(true);
			this.jInternalFrameOrderByVentaGeneral.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVentaGeneral.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentaGeneral.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentaGeneral.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Venta Generales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVentaGeneral.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVentaGeneral.ipady =150;
				
			this.jPanelOrderByVentaGeneral.add(jScrollPanelDatosVentaGeneralOrderBy, this.gridBagConstraintsVentaGeneral);//this.jTableDatosVentaGeneralTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVentaGeneral = new JButtonMe();
			this.jButtonCerrarOrderByVentaGeneral.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVentaGeneral,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVentaGeneral.setToolTipText("Cancelar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVentaGeneral.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVentaGeneral.add(this.jButtonCerrarOrderByVentaGeneral, this.gridBagConstraintsVentaGeneral);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVentaGeneral = new GridBagLayout();
			
			this.jScrollPanelOrderByVentaGeneral= new JScrollPane(jPanelOrderByVentaGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.gridy =iPosYOrderBy;
			this.gridBagConstraintsVentaGeneral.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVentaGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVentaGeneral.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVentaGeneral);
			
			this.jInternalFrameOrderByVentaGeneral.getContentPane().add(this.jScrollPanelOrderByVentaGeneral, this.gridBagConstraintsVentaGeneral);			
		
		} else {
			this.jButtonAbrirOrderByVentaGeneral = new JButtonMe();
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
		int iWidthTableCalculado=0;//2730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.ventageneralSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVentaGeneral.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVentaGeneral.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVentaGeneral.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosVentaGeneral.getRowHeight();//VentaGeneralConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VentaGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentaGeneral.isSelected()) {
					iHeightTable=VentaGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentaGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentaGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VentaGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentaGeneral.isSelected()) {
					iHeightTable=VentaGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentaGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentaGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVentaGeneral.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentaGeneral.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentaGeneral.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVentaGeneral.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentaGeneral.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentaGeneral.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVentaGeneral!=null && this.jInternalFrameOrderByVentaGeneral.getjTableDatosOrderBy()!=null) {
			//if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVentaGeneral.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVentaGeneral.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVentaGeneral.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVentaGeneral.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVentaGeneral.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVentaGeneral.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVentaGeneral.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVentaGeneral.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentaGeneral.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentaGeneral.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=ventageneralLogic.getVentaGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventagenerals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VentaGeneral> TraerVentaGeneralBeans(List<VentaGeneral> ventagenerals,ArrayList<Classe> classes)throws Exception {
		try {
			for(VentaGeneral ventageneral:ventagenerals) {
					
				if(!(VentaGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VentaGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ventageneral.setsDetalleGeneralEntityReporte(VentaGeneralConstantesFunciones.getVentaGeneralDescripcion(ventageneral));
										
						
					
						
					
				} else  {
							
					//ventageneral.setsDetalleGeneralEntityReporte(ventageneral.getsDetalleGeneralEntityReporte());
										
				}
				
				//ventageneralbeans.add(ventageneralbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ventagenerals;
    }
	//PARA REPORTES FIN
}
