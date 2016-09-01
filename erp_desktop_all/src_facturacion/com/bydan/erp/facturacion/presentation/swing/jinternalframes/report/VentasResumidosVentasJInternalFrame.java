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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.facturacion.util.report.VentasResumidosVentasConstantesFunciones;

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
public class VentasResumidosVentasJInternalFrame extends VentasResumidosVentasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVentasResumidosVentas;
	
	protected JMenuBar jmenuBarVentasResumidosVentas;
	
	protected JMenu jmenuVentasResumidosVentas;
	protected JMenu jmenuDatosVentasResumidosVentas;
	protected JMenu jmenuArchivoVentasResumidosVentas;
	protected JMenu jmenuAccionesVentasResumidosVentas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVentasResumidosVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentasResumidosVentas;	
	protected GridBagConstraints gridBagConstraintsVentasResumidosVentas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VentasResumidosVentasDetalleFormJInternalFrame jInternalFrameDetalleFormVentasResumidosVentas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVentasResumidosVentas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVentasResumidosVentas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public VentasResumidosVentasSessionBean ventasresumidosventasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VentasResumidosVentas> ventasresumidosventass;		
	public List<VentasResumidosVentas> ventasresumidosventassEliminados;	
	public List<VentasResumidosVentas> ventasresumidosventassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVentasResumidosVentas;		
	protected JButton jButtonAbrirOrderByVentasResumidosVentas;
	
	
	//protected JPanel jPanelOrderByVentasResumidosVentas;
	//public JScrollPane jScrollPanelOrderByVentasResumidosVentas;	
	//protected JButton jButtonCerrarOrderByVentasResumidosVentas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VentasResumidosVentasLogic ventasresumidosventasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVentasResumidosVentas;
	public JScrollPane jScrollPanelDatosEdicionVentasResumidosVentas;
	public JScrollPane jScrollPanelDatosGeneralVentasResumidosVentas;
    
	
	
	//public JScrollPane jScrollPanelDatosVentasResumidosVentasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVentasResumidosVentas;
	//public JScrollPane jScrollPanelImportacionVentasResumidosVentas;
	
	
	
	protected JPanel jPanelAccionesVentasResumidosVentas;
	
    protected JPanel jPanelPaginacionVentasResumidosVentas;
    protected JPanel jPanelParametrosReportesVentasResumidosVentas;
	protected JPanel jPanelParametrosReportesAccionesVentasResumidosVentas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VentasResumidosVentas;
	protected JPanel jPanelParametrosAuxiliar2VentasResumidosVentas;
	protected JPanel jPanelParametrosAuxiliar3VentasResumidosVentas;
	protected JPanel jPanelParametrosAuxiliar4VentasResumidosVentas;
	//protected JPanel jPanelParametrosAuxiliar5VentasResumidosVentas;
	
	
	
	//protected JPanel jPanelReporteDinamicoVentasResumidosVentas;
	//protected JPanel jPanelImportacionVentasResumidosVentas;
	
	
	public JTable jTableDatosVentasResumidosVentas;
	
	
	
	//public JTable jTableDatosVentasResumidosVentasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVentasResumidosVentas;
	protected JButton jButtonDuplicarVentasResumidosVentas;
	protected JButton jButtonCopiarVentasResumidosVentas;
	protected JButton jButtonVerFormVentasResumidosVentas;
	protected JButton jButtonNuevoRelacionesVentasResumidosVentas;
	protected JButton jButtonModificarVentasResumidosVentas;
	
    protected JButton jButtonGuardarCambiosTablaVentasResumidosVentas;
	protected JButton jButtonCerrarVentasResumidosVentas;
	
	
	protected JButton jButtonRecargarInformacionVentasResumidosVentas;
	protected JButton jButtonProcesarInformacionVentasResumidosVentas;
	
	
	protected JButton jButtonAnterioresVentasResumidosVentas;
	protected JButton jButtonSiguientesVentasResumidosVentas;
	protected JButton jButtonNuevoGuardarCambiosVentasResumidosVentas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVentasResumidosVentas;
	//protected JButton jButtonCerrarReporteDinamicoVentasResumidosVentas;
	//protected JButton jButtonGenerarExcelReporteDinamicoVentasResumidosVentas;	
	
	
	
	//protected JButton jButtonAbrirImportacionVentasResumidosVentas;
	//protected JButton jButtonGenerarImportacionVentasResumidosVentas;
	//protected JButton jButtonCerrarImportacionVentasResumidosVentas;
	//protected JFileChooser jFileChooserImportacionVentasResumidosVentas;
	//protected File fileImportacionVentasResumidosVentas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentasResumidosVentas;
	protected JButton jButtonDuplicarToolBarVentasResumidosVentas;
	protected JButton jButtonNuevoRelacionesToolBarVentasResumidosVentas;
	
	
	public JButton jButtonGuardarCambiosToolBarVentasResumidosVentas;
	protected JButton jButtonCopiarToolBarVentasResumidosVentas;
	protected JButton jButtonVerFormToolBarVentasResumidosVentas;
	public JButton jButtonGuardarCambiosTablaToolBarVentasResumidosVentas;
	protected JButton jButtonMostrarOcultarTablaToolBarVentasResumidosVentas;
	protected JButton jButtonCerrarToolBarVentasResumidosVentas;
	
	protected JButton jButtonRecargarInformacionToolBarVentasResumidosVentas;
	protected JButton jButtonProcesarInformacionToolBarVentasResumidosVentas;
	protected JButton jButtonAnterioresToolBarVentasResumidosVentas;
	protected JButton jButtonSiguientesToolBarVentasResumidosVentas;
	protected JButton jButtonNuevoGuardarCambiosToolBarVentasResumidosVentas;
	protected JButton jButtonAbrirOrderByToolBarVentasResumidosVentas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentasResumidosVentas;
	protected JMenuItem jMenuItemDuplicarVentasResumidosVentas;
	protected JMenuItem jMenuItemNuevoRelacionesVentasResumidosVentas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVentasResumidosVentas;
	protected JMenuItem jMenuItemCopiarVentasResumidosVentas;
	protected JMenuItem jMenuItemVerFormVentasResumidosVentas;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentasResumidosVentas;
	protected JMenuItem jMenuItemCerrarVentasResumidosVentas;
	protected JMenuItem jMenuItemDetalleCerrarVentasResumidosVentas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVentasResumidosVentas;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentasResumidosVentas;
	
	protected JMenuItem jMenuItemRecargarInformacionVentasResumidosVentas;
	protected JMenuItem jMenuItemProcesarInformacionVentasResumidosVentas;
	protected JMenuItem jMenuItemAnterioresVentasResumidosVentas;
	protected JMenuItem jMenuItemSiguientesVentasResumidosVentas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentasResumidosVentas;
	protected JMenuItem jMenuItemAbrirOrderByVentasResumidosVentas;
	protected JMenuItem jMenuItemMostrarOcultarVentasResumidosVentas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentasResumidosVentas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVentasResumidosVentas;
	protected JCheckBox jCheckBoxSeleccionadosVentasResumidosVentas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVentasResumidosVentas;
	protected JCheckBox jCheckBoxConGraficoReporteVentasResumidosVentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVentasResumidosVentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVentasResumidosVentas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVentasResumidosVentas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVentasResumidosVentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVentasResumidosVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVentasResumidosVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentasResumidosVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentasResumidosVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVentasResumidosVentas;
	protected JTextField jTextFieldValorCampoGeneralVentasResumidosVentas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVentasResumidosVentas;
	//public JList<Reporte> jListColumnasSelectReporteVentasResumidosVentas;
	//public JScrollPane jScrollColumnasSelectReporteVentasResumidosVentas;
	
	//public JLabel jLabelRelacionesSelectReporteVentasResumidosVentas;
	//public JList<Reporte> jListRelacionesSelectReporteVentasResumidosVentas;
	//public JScrollPane jScrollRelacionesSelectReporteVentasResumidosVentas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVentasResumidosVentas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVentasResumidosVentas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVentasResumidosVentas;
	//public JLabel jLabelTiposArchivoReporteDinamicoVentasResumidosVentas;
	
		
	//public JLabel jLabelArchivoImportacionVentasResumidosVentas;	
	//public JLabel jLabelPathArchivoImportacionVentasResumidosVentas;
	//protected JTextField jTextFieldPathArchivoImportacionVentasResumidosVentas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVentasResumidosVentas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVentasResumidosVentas;
	
	//public JLabel jLabelColumnaCategoriaValorVentasResumidosVentas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVentasResumidosVentas;
	
	//public JLabel jLabelColumnasValoresGraficoVentasResumidosVentas;
	//public JList<Reporte> jListColumnasValoresGraficoVentasResumidosVentas;
	//public JScrollPane jScrollColumnasValoresGraficoVentasResumidosVentas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVentasResumidosVentas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVentasResumidosVentas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVentasResumidosVentas;
	public JPanel jPanelBusquedaVentasResumidosVentasVentasResumidosVentas;
	public JButton jButtonBusquedaVentasResumidosVentasVentasResumidosVentas;
	
	public JPanel jPanelfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas;
	public JLabel jLabelfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas;
	public JButton jButtonfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas;
	public JLabel jLabelfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas;
	public JButton jButtonfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentasBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public VentasResumidosVentasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VentasResumidosVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidosVentasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasResumidosVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidosVentasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasResumidosVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidosVentasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentasResumidosVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVentasResumidosVentas)	{
		this.jButtonRecargarInformacionVentasResumidosVentas = jButtonRecargarInformacionVentasResumidosVentas;
	}
	
	public JButton getjButtonProcesarInformacionVentasResumidosVentas() {
		return this.jButtonProcesarInformacionVentasResumidosVentas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentasResumidosVentas)	{
		this.jButtonProcesarInformacionVentasResumidosVentas = jButtonProcesarInformacionVentasResumidosVentas;
	}
	
	
	public JButton getjButtonRecargarInformacionVentasResumidosVentas() {
		return this.jButtonRecargarInformacionVentasResumidosVentas;
	}
	
	
	public List<VentasResumidosVentas> getventasresumidosventass() {
		return this.ventasresumidosventass;
	}

	public void setventasresumidosventass(List<VentasResumidosVentas> ventasresumidosventass) {
		this.ventasresumidosventass = ventasresumidosventass;
	}
	
	public List<VentasResumidosVentas> getventasresumidosventassAux() {
		return this.ventasresumidosventassAux;
	}

	public void setventasresumidosventassAux(List<VentasResumidosVentas> ventasresumidosventassAux) {
		this.ventasresumidosventassAux = ventasresumidosventassAux;
	}
	
	public List<VentasResumidosVentas> getventasresumidosventassEliminados() {
		return this.ventasresumidosventassEliminados;
	}

	public void setVentasResumidosVentassEliminados(List<VentasResumidosVentas> ventasresumidosventassEliminados) {
		this.ventasresumidosventassEliminados = ventasresumidosventassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVentasResumidosVentas() {
		return jComboBoxTiposSeleccionarVentasResumidosVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVentasResumidosVentas(
			JComboBox jComboBoxTiposSeleccionarVentasResumidosVentas) {
		this.jComboBoxTiposSeleccionarVentasResumidosVentas = jComboBoxTiposSeleccionarVentasResumidosVentas;
	}
	
	public void setBorderResaltarTiposSeleccionarVentasResumidosVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVentasResumidosVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVentasResumidosVentas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVentasResumidosVentas() {
		return jTextFieldValorCampoGeneralVentasResumidosVentas;
	}

	public void setjTextFieldValorCampoGeneralVentasResumidosVentas(
			JTextField jTextFieldValorCampoGeneralVentasResumidosVentas) {
		this.jTextFieldValorCampoGeneralVentasResumidosVentas = jTextFieldValorCampoGeneralVentasResumidosVentas;
	}

	public void setBorderResaltarValorCampoGeneralVentasResumidosVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidosVentas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVentasResumidosVentas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVentasResumidosVentas() {
		return this.jCheckBoxSeleccionarTodosVentasResumidosVentas;
	}

	public void setjCheckBoxSeleccionarTodosVentasResumidosVentas(
			JCheckBox jCheckBoxSeleccionarTodosVentasResumidosVentas) {
		this.jCheckBoxSeleccionarTodosVentasResumidosVentas = jCheckBoxSeleccionarTodosVentasResumidosVentas;
	}

	public void setBorderResaltarSeleccionarTodosVentasResumidosVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidosVentas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVentasResumidosVentas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVentasResumidosVentas() {
		return this.jCheckBoxSeleccionadosVentasResumidosVentas;
	}

	public void setjCheckBoxSeleccionadosVentasResumidosVentas(
			JCheckBox jCheckBoxSeleccionadosVentasResumidosVentas) {
		this.jCheckBoxSeleccionadosVentasResumidosVentas = jCheckBoxSeleccionadosVentasResumidosVentas;
	}
	
	public void setBorderResaltarSeleccionadosVentasResumidosVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidosVentas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVentasResumidosVentas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVentasResumidosVentas() {
		return this.jComboBoxTiposArchivosReportesVentasResumidosVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVentasResumidosVentas(
			JComboBox jComboBoxTiposArchivosReportesVentasResumidosVentas) {
		this.jComboBoxTiposArchivosReportesVentasResumidosVentas = jComboBoxTiposArchivosReportesVentasResumidosVentas;
	}

	public void setBorderResaltarTiposArchivosReportesVentasResumidosVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidosVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVentasResumidosVentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVentasResumidosVentas() {
		return this.jComboBoxTiposReportesVentasResumidosVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVentasResumidosVentas(
			JComboBox jComboBoxTiposReportesVentasResumidosVentas) {
		this.jComboBoxTiposReportesVentasResumidosVentas = jComboBoxTiposReportesVentasResumidosVentas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVentasResumidosVentas() {
	//	return jComboBoxTiposReportesDinamicoVentasResumidosVentas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVentasResumidosVentas(
	//		JComboBox jComboBoxTiposReportesDinamicoVentasResumidosVentas) {
	//	this.jComboBoxTiposReportesDinamicoVentasResumidosVentas = jComboBoxTiposReportesDinamicoVentasResumidosVentas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVentasResumidosVentas() {
	//	return jComboBoxTiposArchivosReportesDinamicoVentasResumidosVentas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVentasResumidosVentas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVentasResumidosVentas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVentasResumidosVentas = jComboBoxTiposArchivosReportesDinamicoVentasResumidosVentas;
	//}
	
	public void setBorderResaltarTiposReportesVentasResumidosVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidosVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVentasResumidosVentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVentasResumidosVentas() {
		return this.jComboBoxTiposGraficosReportesVentasResumidosVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVentasResumidosVentas(
			JComboBox jComboBoxTiposGraficosReportesVentasResumidosVentas) {
		this.jComboBoxTiposGraficosReportesVentasResumidosVentas = jComboBoxTiposGraficosReportesVentasResumidosVentas;
	}
	
	public void setBorderResaltarTiposGraficosReportesVentasResumidosVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidosVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVentasResumidosVentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVentasResumidosVentas() {
		return this.jComboBoxTiposPaginacionVentasResumidosVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVentasResumidosVentas(
			JComboBox jComboBoxTiposPaginacionVentasResumidosVentas) {
		this.jComboBoxTiposPaginacionVentasResumidosVentas = jComboBoxTiposPaginacionVentasResumidosVentas;
	}
	
	public void setBorderResaltarTiposPaginacionVentasResumidosVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidosVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVentasResumidosVentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVentasResumidosVentas() {
		return this.jComboBoxTiposRelacionesVentasResumidosVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentasResumidosVentas() {
		return this.jComboBoxTiposAccionesVentasResumidosVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentasResumidosVentas(
			JComboBox jComboBoxTiposRelacionesVentasResumidosVentas) {
		this.jComboBoxTiposRelacionesVentasResumidosVentas = jComboBoxTiposRelacionesVentasResumidosVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentasResumidosVentas(
			JComboBox jComboBoxTiposAccionesVentasResumidosVentas) {
		this.jComboBoxTiposAccionesVentasResumidosVentas = jComboBoxTiposAccionesVentasResumidosVentas;
	}
	
	public void setBorderResaltarTiposRelacionesVentasResumidosVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidosVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVentasResumidosVentas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVentasResumidosVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidosVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVentasResumidosVentas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVentasResumidosVentas() {
	//	return jCheckBoxConGraficoDinamicoVentasResumidosVentas;
	//}

	//public void setjCheckBoxConGraficoDinamicoVentasResumidosVentas(
	//		JCheckBox jCheckBoxConGraficoDinamicoVentasResumidosVentas) {
	//	this.jCheckBoxConGraficoDinamicoVentasResumidosVentas = jCheckBoxConGraficoDinamicoVentasResumidosVentas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVentasResumidosVentas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVentasResumidosVentas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVentasResumidosVentas .setBorder(borderResaltar);		
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
		this.ventasresumidosventasSessionBean=new VentasResumidosVentasSessionBean();
		
		this.ventasresumidosventasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventasresumidosventasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventasresumidosventasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VentasResumidosVentasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VentasResumidosVentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentasResumidosVentasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentasResumidosVentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentasResumidosVentasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ventas Resumidos Ventas MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
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
		
		VentasResumidosVentasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VentasResumidosVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVentasResumidosVentas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVentasResumidosVentas,this.jTtoolBarVentasResumidosVentas,
							"nuevo","nuevo","Nuevo"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVentasResumidosVentas,this.jTtoolBarVentasResumidosVentas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVentasResumidosVentas,this.jTtoolBarVentasResumidosVentas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVentasResumidosVentas,this.jTtoolBarVentasResumidosVentas,
							"duplicar","duplicar","Duplicar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVentasResumidosVentas,this.jTtoolBarVentasResumidosVentas,
							"copiar","copiar","Copiar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVentasResumidosVentas,this.jTtoolBarVentasResumidosVentas,
							"ver_form","ver_form","Ver"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasResumidosVentas,this.jTtoolBarVentasResumidosVentas,
							"recargar","recargar","Buscar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasResumidosVentas,this.jTtoolBarVentasResumidosVentas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasResumidosVentas,this.jTtoolBarVentasResumidosVentas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVentasResumidosVentas,this.jTtoolBarVentasResumidosVentas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVentasResumidosVentas,this.jTtoolBarVentasResumidosVentas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVentasResumidosVentas,this.jTtoolBarVentasResumidosVentas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVentasResumidosVentas,this.jTtoolBarVentasResumidosVentas,
							"cerrar","cerrar","Salir"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVentasResumidosVentas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVentasResumidosVentas;
			
				this.jButtonProcesarInformacionToolBarVentasResumidosVentas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVentasResumidosVentas;
				
		//protected JButton jButtonModificarToolBarVentasResumidosVentas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVentasResumidosVentas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVentasResumidosVentas=new JMenuMe("General");
		this.jmenuArchivoVentasResumidosVentas=new JMenuMe("Archivo");
		this.jmenuAccionesVentasResumidosVentas=new JMenuMe("Acciones");
		this.jmenuDatosVentasResumidosVentas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentasResumidosVentas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentasResumidosVentas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentasResumidosVentas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVentasResumidosVentas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVentasResumidosVentas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVentasResumidosVentas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVentasResumidosVentas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVentasResumidosVentas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVentasResumidosVentas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVentasResumidosVentas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentasResumidosVentas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentasResumidosVentas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVentasResumidosVentas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVentasResumidosVentas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVentasResumidosVentas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVentasResumidosVentas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVentasResumidosVentas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVentasResumidosVentas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVentasResumidosVentas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVentasResumidosVentas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVentasResumidosVentas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentasResumidosVentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentasResumidosVentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentasResumidosVentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVentasResumidosVentas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVentasResumidosVentas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVentasResumidosVentas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVentasResumidosVentas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVentasResumidosVentas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVentasResumidosVentas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVentasResumidosVentas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVentasResumidosVentas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVentasResumidosVentas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVentasResumidosVentas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVentasResumidosVentas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVentasResumidosVentas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVentasResumidosVentas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVentasResumidosVentas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVentasResumidosVentas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentasResumidosVentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentasResumidosVentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentasResumidosVentas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVentasResumidosVentas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVentasResumidosVentas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVentasResumidosVentas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentasResumidosVentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentasResumidosVentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentasResumidosVentas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVentasResumidosVentas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVentasResumidosVentas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVentasResumidosVentas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVentasResumidosVentas.add(this.jMenuItemCerrarVentasResumidosVentas);
			
			this.jmenuAccionesVentasResumidosVentas.add(this.jMenuItemNuevoVentasResumidosVentas);
			this.jmenuAccionesVentasResumidosVentas.add(this.jMenuItemNuevoGuardarCambiosVentasResumidosVentas);
			this.jmenuAccionesVentasResumidosVentas.add(this.jMenuItemNuevoRelacionesVentasResumidosVentas);
			this.jmenuAccionesVentasResumidosVentas.add(this.jMenuItemGuardarCambiosTablaVentasResumidosVentas);		
			this.jmenuAccionesVentasResumidosVentas.add(this.jMenuItemDuplicarVentasResumidosVentas);		
			this.jmenuAccionesVentasResumidosVentas.add(this.jMenuItemCopiarVentasResumidosVentas);		
			this.jmenuAccionesVentasResumidosVentas.add(this.jMenuItemVerFormVentasResumidosVentas);		
			
			this.jmenuDatosVentasResumidosVentas.add(this.jMenuItemRecargarInformacionVentasResumidosVentas);				
			this.jmenuDatosVentasResumidosVentas.add(this.jMenuItemAnterioresVentasResumidosVentas);				
			this.jmenuDatosVentasResumidosVentas.add(this.jMenuItemSiguientesVentasResumidosVentas);				
			this.jmenuDatosVentasResumidosVentas.add(this.jMenuItemAbrirOrderByVentasResumidosVentas);				
			this.jmenuDatosVentasResumidosVentas.add(this.jMenuItemMostrarOcultarVentasResumidosVentas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVentasResumidosVentas.add(this.jMenuItemGuardarCambiosVentasResumidosVentas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVentasResumidosVentas.add(this.jmenuArchivoVentasResumidosVentas);		
			this.jmenuBarVentasResumidosVentas.add(this.jmenuAccionesVentasResumidosVentas);		
			this.jmenuBarVentasResumidosVentas.add(this.jmenuDatosVentasResumidosVentas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVentasResumidosVentas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVentasResumidosVentas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaVentasResumidosVentasVentasResumidosVentas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaVentasResumidosVentasVentasResumidosVentas.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaVentasResumidosVentasVentasResumidosVentas= new JButtonMe();
		this.jButtonBusquedaVentasResumidosVentasVentasResumidosVentas.setText("Buscar");
		this.jButtonBusquedaVentasResumidosVentasVentasResumidosVentas.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaVentasResumidosVentasVentasResumidosVentas,"buscar_button","Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaVentasResumidosVentasVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasVentasResumidosVentas=new JTabbedPane();


		this.jTabbedPaneBusquedasVentasResumidosVentas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVentasResumidosVentas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVentasResumidosVentas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVentasResumidosVentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVentasResumidosVentas = new VentasResumidosVentasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ventas Resumidos Ventas DATOS");
			this.jInternalFrameDetalleFormVentasResumidosVentas = new VentasResumidosVentasDetalleFormJInternalFrame(jDesktopPane,this.ventasresumidosventasSessionBean.getConGuardarRelaciones(),this.ventasresumidosventasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVentasResumidosVentas = null;//new VentasResumidosVentasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentasResumidosVentas= new GridBagLayout();
		
		
		this.jTableDatosVentasResumidosVentas = new JTableMe();      
		
		String sToolTipVentasResumidosVentas="";
		sToolTipVentasResumidosVentas=VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentasResumidosVentas+="(Facturacion.VentasResumidosVentas)";
		}
		
		if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentasResumidosVentas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVentasResumidosVentas.setToolTipText(sToolTipVentasResumidosVentas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVentasResumidosVentas);
		this.jTableDatosVentasResumidosVentas.setAutoCreateRowSorter(true);
		this.jTableDatosVentasResumidosVentas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVentasResumidosVentas.setRowSelectionAllowed(true);
		this.jTableDatosVentasResumidosVentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVentasResumidosVentas = new JButtonMe();
		this.jButtonDuplicarVentasResumidosVentas = new JButtonMe();
		this.jButtonCopiarVentasResumidosVentas = new JButtonMe();
		this.jButtonVerFormVentasResumidosVentas = new JButtonMe();
		this.jButtonNuevoRelacionesVentasResumidosVentas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVentasResumidosVentas = new JButtonMe();
		this.jButtonCerrarVentasResumidosVentas = new JButtonMe();
		
		this.jScrollPanelDatosVentasResumidosVentas = new JScrollPane();   
        this.jScrollPanelDatosGeneralVentasResumidosVentas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVentasResumidosVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ventas Resumidos Ventas";
		
		if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidos Ventases" + this.sPath));
		} else {
			this.jScrollPanelDatosVentasResumidosVentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentasResumidosVentas.setToolTipText("Acciones");
        this.jPanelAccionesVentasResumidosVentas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVentasResumidosVentas=new ReporteDinamicoJInternalFrame(VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVentasResumidosVentas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVentasResumidosVentas=new ImportacionJInternalFrame(VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVentasResumidosVentas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVentasResumidosVentas = new JButtonMe();
		
		this.jButtonAbrirOrderByVentasResumidosVentas.setText("Orden");
		this.jButtonAbrirOrderByVentasResumidosVentas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentasResumidosVentas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVentasResumidosVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentasResumidosVentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasResumidosVentas,false,this);
			
			//this.cargarOrderByVentasResumidosVentas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentasResumidosVentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasResumidosVentas,true,this);
			
			//this.cargarOrderByVentasResumidosVentas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVentasResumidosVentas.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosVentasResumidosVentas.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosVentasResumidosVentas.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosVentasResumidosVentas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentasResumidosVentas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentasResumidosVentas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVentasResumidosVentas.setText("Nuevo");
		this.jButtonDuplicarVentasResumidosVentas.setText("Duplicar");
		this.jButtonCopiarVentasResumidosVentas.setText("Copiar");
		this.jButtonVerFormVentasResumidosVentas.setText("Ver");
		this.jButtonNuevoRelacionesVentasResumidosVentas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVentasResumidosVentas.setText("Guardar");
		this.jButtonCerrarVentasResumidosVentas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentasResumidosVentas,"nuevo_button","Nuevo",this.ventasresumidosventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVentasResumidosVentas,"duplicar_button","Duplicar",this.ventasresumidosventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVentasResumidosVentas,"copiar_button","Copiar",this.ventasresumidosventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVentasResumidosVentas,"ver_form","Ver",this.ventasresumidosventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVentasResumidosVentas,"nuevorelaciones_button","Nuevo Rel",this.ventasresumidosventasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentasResumidosVentas,"guardarcambiostabla_button","Guardar",this.ventasresumidosventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentasResumidosVentas,"cerrar_button","Salir",this.ventasresumidosventasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVentasResumidosVentas.setToolTipText("Nuevo"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVentasResumidosVentas.setToolTipText("Duplicar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVentasResumidosVentas.setToolTipText("Copiar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVentasResumidosVentas.setToolTipText("Ver"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVentasResumidosVentas.setToolTipText("Nuevo Rel"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVentasResumidosVentas.setToolTipText("Guardar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentasResumidosVentas.setToolTipText("Salir"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentasResumidosVentas";
		inputMap = this.jButtonNuevoVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentasResumidosVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentasResumidosVentas"));
		
		//DUPLICAR
		sMapKey = "DuplicarVentasResumidosVentas";
		inputMap = this.jButtonDuplicarVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVentasResumidosVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVentasResumidosVentas"));
		
		//COPIAR
		sMapKey = "CopiarVentasResumidosVentas";
		inputMap = this.jButtonCopiarVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVentasResumidosVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVentasResumidosVentas"));
		
		//VEr FORM
		sMapKey = "VerFormVentasResumidosVentas";
		inputMap = this.jButtonVerFormVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVentasResumidosVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVentasResumidosVentas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVentasResumidosVentas";
		inputMap = this.jButtonNuevoRelacionesVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVentasResumidosVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVentasResumidosVentas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVentasResumidosVentas";
		inputMap = this.jButtonModificarVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVentasResumidosVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVentasResumidosVentas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVentasResumidosVentas";
		inputMap = this.jButtonCerrarVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentasResumidosVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentasResumidosVentas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentasResumidosVentas";
		inputMap = this.jButtonGuardarCambiosTablaVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentasResumidosVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentasResumidosVentas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVentasResumidosVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVentasResumidosVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVentasResumidosVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VentasResumidosVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VentasResumidosVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VentasResumidosVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VentasResumidosVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VentasResumidosVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVentasResumidosVentas.setName("jPanelParametrosReportesVentasResumidosVentas"); 
		
		this.jPanelParametrosReportesAccionesVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVentasResumidosVentas.setName("jPanelParametrosReportesAccionesVentasResumidosVentas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVentasResumidosVentas = new JButtonMe();
		this.jButtonRecargarInformacionVentasResumidosVentas.setText("Buscar");
		this.jButtonRecargarInformacionVentasResumidosVentas.setToolTipText("Buscar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVentasResumidosVentas,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionVentasResumidosVentas.setVisible(false);
		
		
		this.jButtonProcesarInformacionVentasResumidosVentas = new JButtonMe();
		this.jButtonProcesarInformacionVentasResumidosVentas.setText("Procesar");
		this.jButtonProcesarInformacionVentasResumidosVentas.setToolTipText("Procesar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVentasResumidosVentas.setVisible(false);
			
		this.jButtonProcesarInformacionVentasResumidosVentas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentasResumidosVentas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentasResumidosVentas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVentasResumidosVentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasResumidosVentas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVentasResumidosVentas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVentasResumidosVentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasResumidosVentas.setText("TIPO");       
		this.jComboBoxTiposReportesVentasResumidosVentas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVentasResumidosVentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasResumidosVentas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVentasResumidosVentas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVentasResumidosVentas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVentasResumidosVentas.setText("Paginacion");
		this.jComboBoxTiposPaginacionVentasResumidosVentas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVentasResumidosVentas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVentasResumidosVentas.setText("Accion");
		this.jComboBoxTiposRelacionesVentasResumidosVentas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVentasResumidosVentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentasResumidosVentas.setText("Accion");
		this.jComboBoxTiposAccionesVentasResumidosVentas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVentasResumidosVentas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVentasResumidosVentas.setText("Accion");
		this.jComboBoxTiposSeleccionarVentasResumidosVentas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVentasResumidosVentas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVentasResumidosVentas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentasResumidosVentas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentasResumidosVentas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVentasResumidosVentas = new JLabelMe();
		
		this.jLabelAccionesVentasResumidosVentas.setText("Acciones");		
		this.jLabelAccionesVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVentasResumidosVentas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVentasResumidosVentas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVentasResumidosVentas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVentasResumidosVentas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVentasResumidosVentas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVentasResumidosVentas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVentasResumidosVentas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVentasResumidosVentas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVentasResumidosVentas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVentasResumidosVentas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVentasResumidosVentas.setText("Graf.");
		this.jCheckBoxConGraficoReporteVentasResumidosVentas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVentasResumidosVentas = new JButtonMe();
		//this.jButtonAnterioresVentasResumidosVentas.setText("<<");
        this.jButtonAnterioresVentasResumidosVentas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVentasResumidosVentas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVentasResumidosVentas = new JButtonMe();
		//this.jButtonSiguientesVentasResumidosVentas.setText(">>");
        this.jButtonSiguientesVentasResumidosVentas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVentasResumidosVentas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVentasResumidosVentas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVentasResumidosVentas.setText("Nue");
        this.jButtonNuevoGuardarCambiosVentasResumidosVentas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVentasResumidosVentas,"nuevoguardarcambios_button","Nue",this.ventasresumidosventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVentasResumidosVentas";
		inputMap = this.jButtonNuevoGuardarCambiosVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVentasResumidosVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVentasResumidosVentas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVentasResumidosVentas";
		inputMap = this.jButtonRecargarInformacionVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVentasResumidosVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVentasResumidosVentas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVentasResumidosVentas";
		inputMap = this.jButtonSiguientesVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVentasResumidosVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVentasResumidosVentas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVentasResumidosVentas";
		inputMap = this.jButtonAnterioresVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVentasResumidosVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVentasResumidosVentas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVentasResumidosVentas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVentasResumidosVentas.setMinimumSize(new Dimension(this.getWidth(),VentasResumidosVentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasResumidosVentasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentasResumidosVentas.setMaximumSize(new Dimension(this.getWidth(),VentasResumidosVentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasResumidosVentasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentasResumidosVentas.setPreferredSize(new Dimension(this.getWidth(),VentasResumidosVentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasResumidosVentasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVentasResumidosVentas = new GridBagLayout();

			this.jPanelPaginacionVentasResumidosVentas.setLayout(gridaBagLayoutPaginacionVentasResumidosVentas);						
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
			this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVentasResumidosVentas.add(this.jButtonAnterioresVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
					
						
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
			
			this.jPanelPaginacionVentasResumidosVentas.add(this.jButtonNuevoGuardarCambiosVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
						
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
			this.jPanelPaginacionVentasResumidosVentas.add(this.jButtonSiguientesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy = 1;
			this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasResumidosVentas.add(this.jButtonNuevoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
						
			
			
			if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
				this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVentasResumidosVentas.gridy = 1;
				this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVentasResumidosVentas.add(this.jButtonGuardarCambiosTablaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
			}
			
			
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy = 1;
			this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasResumidosVentas.add(this.jButtonDuplicarVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy = 1;
			this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasResumidosVentas.add(this.jButtonCopiarVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy = 1;
			this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasResumidosVentas.add(this.jButtonVerFormVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy = 1;
			this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVentasResumidosVentas.add(this.jButtonCerrarVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
		
		
		this.jButtonRecargarInformacionVentasResumidosVentas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentasResumidosVentas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentasResumidosVentas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVentasResumidosVentas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentasResumidosVentas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentasResumidosVentas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVentasResumidosVentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentasResumidosVentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentasResumidosVentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVentasResumidosVentas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentasResumidosVentas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentasResumidosVentas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVentasResumidosVentas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentasResumidosVentas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentasResumidosVentas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVentasResumidosVentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentasResumidosVentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentasResumidosVentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVentasResumidosVentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasResumidosVentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasResumidosVentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVentasResumidosVentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentasResumidosVentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentasResumidosVentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVentasResumidosVentas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentasResumidosVentas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentasResumidosVentas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVentasResumidosVentas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentasResumidosVentas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentasResumidosVentas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVentasResumidosVentas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentasResumidosVentas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentasResumidosVentas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVentasResumidosVentas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentasResumidosVentas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentasResumidosVentas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVentasResumidosVentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVentasResumidosVentas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VentasResumidosVentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VentasResumidosVentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VentasResumidosVentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VentasResumidosVentas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVentasResumidosVentas.setLayout(gridaBagParametrosReportesVentasResumidosVentas);
			this.jPanelParametrosReportesAccionesVentasResumidosVentas.setLayout(gridaBagParametrosReportesAccionesVentasResumidosVentas);
			
			
			this.jPanelParametrosAuxiliar1VentasResumidosVentas.setLayout(gridaBagParametrosAuxiliar1VentasResumidosVentas);
			this.jPanelParametrosAuxiliar2VentasResumidosVentas.setLayout(gridaBagParametrosAuxiliar2VentasResumidosVentas);
			this.jPanelParametrosAuxiliar3VentasResumidosVentas.setLayout(gridaBagParametrosAuxiliar3VentasResumidosVentas);
			this.jPanelParametrosAuxiliar4VentasResumidosVentas.setLayout(gridaBagParametrosAuxiliar4VentasResumidosVentas);
			//this.jPanelParametrosAuxiliar5VentasResumidosVentas.setLayout(gridaBagParametrosAuxiliar2VentasResumidosVentas);			
			
			
			
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidosVentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasResumidosVentas.add(this.jButtonRecargarInformacionVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidosVentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasResumidosVentas.add(this.jComboBoxTiposPaginacionVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidosVentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasResumidosVentas.add(this.jCheckBoxConAltoMaximoTablaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidosVentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasResumidosVentas.add(this.jComboBoxTiposArchivosReportesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidosVentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasResumidosVentas.add(this.jPanelParametrosAuxiliar1VentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidosVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VentasResumidosVentas.add(this.jComboBoxTiposReportesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);																		
			
			
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidosVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4VentasResumidosVentas.add(this.jComboBoxTiposGraficosReportesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidosVentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasResumidosVentas.add(this.jPanelParametrosAuxiliar4VentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidosVentas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasResumidosVentas.add(this.jComboBoxTiposReportesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidosVentas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasResumidosVentas.add(this.jCheckBoxGenerarReporteVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidosVentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasResumidosVentas.add(this.jPanelParametrosAuxiliar2VentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidosVentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasResumidosVentas.add(this.jLabelAccionesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
				this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVentasResumidosVentas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVentasResumidosVentas.add(this.jButtonAbrirOrderByVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidosVentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasResumidosVentas.add(this.jComboBoxTiposSeleccionarVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);			
			
			
			/*
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidosVentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasResumidosVentas.add(this.jCheckBoxSeleccionarTodosVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidosVentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasResumidosVentas.add(this.jCheckBoxConGraficoReporteVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidosVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasResumidosVentas.add(this.jCheckBoxSeleccionarTodosVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);															
				
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidosVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasResumidosVentas.add(this.jCheckBoxSeleccionadosVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);															
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidosVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasResumidosVentas.add(this.jCheckBoxConGraficoReporteVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidosVentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasResumidosVentas.add(this.jPanelParametrosAuxiliar3VentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidosVentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasResumidosVentas.add(this.jComboBoxTiposAccionesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVentasResumidosVentas = new GridBagLayout();

			this.jScrollPanelDatosVentasResumidosVentas.setLayout(gridaBagLayoutDatosVentasResumidosVentas);
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
			this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
			
			this.jScrollPanelDatosVentasResumidosVentas.add(this.jTableDatosVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVentasResumidosVentas.setViewportView(this.jTableDatosVentasResumidosVentas);
		this.jTableDatosVentasResumidosVentas.setFillsViewportHeight(true);
		this.jTableDatosVentasResumidosVentas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVentasResumidosVentas= new GridBagLayout();
		this.jPanelAccionesVentasResumidosVentas.setLayout(gridaBagLayoutAccionesVentasResumidosVentas);
		
		
		/*	
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
		this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
			
		this.jPanelAccionesVentasResumidosVentas.add(this.jButtonNuevoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaVentasResumidosVentasVentasResumidosVentas= new GridBagLayout();
		gridaBagLayoutBusquedaVentasResumidosVentasVentasResumidosVentas.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaVentasResumidosVentasVentasResumidosVentas.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaVentasResumidosVentasVentasResumidosVentas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaVentasResumidosVentasVentasResumidosVentas.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaVentasResumidosVentasVentasResumidosVentas.setLayout(gridaBagLayoutBusquedaVentasResumidosVentasVentasResumidosVentas);

		gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidosVentas.gridy = 0;
		gridBagConstraintsVentasResumidosVentas.gridx = 0;
		jPanelBusquedaVentasResumidosVentasVentasResumidosVentas.add(jLabelfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas, gridBagConstraintsVentasResumidosVentas);

		gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidosVentas.gridy = 0;
		gridBagConstraintsVentasResumidosVentas.gridx = 1;
		jPanelBusquedaVentasResumidosVentasVentasResumidosVentas.add(jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas, gridBagConstraintsVentasResumidosVentas);


		gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidosVentas.gridy = 1;
		gridBagConstraintsVentasResumidosVentas.gridx = 0;
		jPanelBusquedaVentasResumidosVentasVentasResumidosVentas.add(jLabelfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas, gridBagConstraintsVentasResumidosVentas);

		gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidosVentas.gridy = 1;
		gridBagConstraintsVentasResumidosVentas.gridx = 1;
		jPanelBusquedaVentasResumidosVentasVentasResumidosVentas.add(jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas, gridBagConstraintsVentasResumidosVentas);

		gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidosVentas.gridy = 2;
		gridBagConstraintsVentasResumidosVentas.gridx =1;
		jPanelBusquedaVentasResumidosVentasVentasResumidosVentas.add(jButtonBusquedaVentasResumidosVentasVentasResumidosVentas, gridBagConstraintsVentasResumidosVentas);

		jTabbedPaneBusquedasVentasResumidosVentas.addTab("1.-Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaVentasResumidosVentasVentasResumidosVentas);
		jTabbedPaneBusquedasVentasResumidosVentas.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentasResumidosVentas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentasResumidosVentas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();						
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasResumidosVentas.gridx = 0;		
			//this.gridBagConstraintsVentasResumidosVentas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentasResumidosVentas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVentasResumidosVentas.gridx = 0;		
		//this.gridBagConstraintsVentasResumidosVentas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVentasResumidosVentas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVentasResumidosVentas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasResumidosVentas.gridx = 0;		
			this.gridBagConstraintsVentasResumidosVentas.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVentasResumidosVentas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);								
		
		
		/*
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		*/		
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentasResumidosVentas.gridx =0;
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentasResumidosVentas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
				
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VentasResumidosVentasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVentasResumidosVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentasResumidosVentas = new GridBagLayout();
			this.jPanelBusquedasParametrosVentasResumidosVentas.setLayout(gridaBagLayoutBusquedasParametrosVentasResumidosVentas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVentasResumidosVentas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentasResumidosVentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasResumidosVentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasResumidosVentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
			
			
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
			
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidosVentas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVentasResumidosVentas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVentasResumidosVentas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVentasResumidosVentas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVentasResumidosVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVentasResumidosVentas.setName("jPanelReporteDinamicoVentasResumidosVentas"); 
		
		this.jPanelReporteDinamicoVentasResumidosVentas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentasResumidosVentas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentasResumidosVentas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVentasResumidosVentas.setLayout(gridaBagLayoutReporteDinamicoVentasResumidosVentas);
		
		
		this.jInternalFrameReporteDinamicoVentasResumidosVentas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVentasResumidosVentas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentasResumidosVentas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVentasResumidosVentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVentasResumidosVentas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVentasResumidosVentas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVentasResumidosVentas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVentasResumidosVentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVentasResumidosVentas.setResizable(true);
	    this.jInternalFrameReporteDinamicoVentasResumidosVentas.setClosable(true);
	    this.jInternalFrameReporteDinamicoVentasResumidosVentas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVentasResumidosVentas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentasResumidosVentas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentasResumidosVentas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidos Ventases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVentasResumidosVentas = new JLabelMe();

		this.jLabelColumnasSelectReporteVentasResumidosVentas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jLabelColumnasSelectReporteVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVentasResumidosVentas = new JList<Reporte>();
		this.jListColumnasSelectReporteVentasResumidosVentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVentasResumidosVentas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVentasResumidosVentas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentasResumidosVentas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentasResumidosVentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVentasResumidosVentas=new JScrollPane(this.jListColumnasSelectReporteVentasResumidosVentas);
			
			this.jScrollColumnasSelectReporteVentasResumidosVentas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentasResumidosVentas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentasResumidosVentas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jListColumnasSelectReporteVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jScrollColumnasSelectReporteVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVentasResumidosVentas = new JLabelMe();

		this.jLabelRelacionesSelectReporteVentasResumidosVentas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVentasResumidosVentas = new JList<Reporte>();
		this.jListRelacionesSelectReporteVentasResumidosVentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVentasResumidosVentas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVentasResumidosVentas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentasResumidosVentas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentasResumidosVentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVentasResumidosVentas=new JScrollPane(this.jListRelacionesSelectReporteVentasResumidosVentas);
			
			this.jScrollRelacionesSelectReporteVentasResumidosVentas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentasResumidosVentas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentasResumidosVentas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVentasResumidosVentas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVentasResumidosVentas = new JComboBoxMe();
		this.jListColumnasValoresGraficoVentasResumidosVentas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVentasResumidosVentas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVentasResumidosVentas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVentasResumidosVentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentasResumidosVentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentasResumidosVentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVentasResumidosVentas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVentasResumidosVentas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVentasResumidosVentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentasResumidosVentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentasResumidosVentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVentasResumidosVentas = new JLabelMe();

		this.jLabelConGraficoDinamicoVentasResumidosVentas.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jLabelConGraficoDinamicoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVentasResumidosVentas = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVentasResumidosVentas.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVentasResumidosVentas.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVentasResumidosVentas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentasResumidosVentas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentasResumidosVentas.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jCheckBoxConGraficoDinamicoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVentasResumidosVentas = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVentasResumidosVentas.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jLabelColumnaCategoriaGraficoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVentasResumidosVentas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentasResumidosVentas.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVentasResumidosVentas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVentasResumidosVentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentasResumidosVentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentasResumidosVentas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jComboBoxColumnaCategoriaGraficoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVentasResumidosVentas = new JLabelMe();

		this.jLabelColumnaCategoriaValorVentasResumidosVentas.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jLabelColumnaCategoriaValorVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVentasResumidosVentas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVentasResumidosVentas.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVentasResumidosVentas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVentasResumidosVentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentasResumidosVentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentasResumidosVentas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jComboBoxColumnaCategoriaValorVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVentasResumidosVentas = new JLabelMe();

		this.jLabelColumnasValoresGraficoVentasResumidosVentas.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jLabelColumnasValoresGraficoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVentasResumidosVentas = new JList<Reporte>();
		this.jListColumnasValoresGraficoVentasResumidosVentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVentasResumidosVentas.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVentasResumidosVentas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentasResumidosVentas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentasResumidosVentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVentasResumidosVentas=new JScrollPane(this.jListColumnasValoresGraficoVentasResumidosVentas);
			
			this.jScrollColumnasValoresGraficoVentasResumidosVentas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentasResumidosVentas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentasResumidosVentas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jListColumnasSelectReporteVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jScrollColumnasValoresGraficoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVentasResumidosVentas = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVentasResumidosVentas.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jLabelTiposGraficosReportesDinamicoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVentasResumidosVentas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentasResumidosVentas.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVentasResumidosVentas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVentasResumidosVentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentasResumidosVentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentasResumidosVentas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jComboBoxTiposGraficosReportesDinamicoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVentasResumidosVentas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVentasResumidosVentas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jLabelGenerarExcelReporteDinamicoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVentasResumidosVentas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVentasResumidosVentas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVentasResumidosVentas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVentasResumidosVentas.setToolTipText("Generar EXCEL"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jButtonGenerarExcelReporteDinamicoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jComboBoxTiposReportesDinamicoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVentasResumidosVentas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVentasResumidosVentas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jLabelTiposArchivoReporteDinamicoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jComboBoxTiposArchivosReportesDinamicoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVentasResumidosVentas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVentasResumidosVentas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVentasResumidosVentas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVentasResumidosVentas.setToolTipText("Generar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jButtonGenerarReporteDinamicoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVentasResumidosVentas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVentasResumidosVentas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVentasResumidosVentas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVentasResumidosVentas.setToolTipText("Cancelar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasResumidosVentas.add(this.jButtonCerrarReporteDinamicoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVentasResumidosVentas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVentasResumidosVentas= new JScrollPane(jPanelReporteDinamicoVentasResumidosVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVentasResumidosVentas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentasResumidosVentas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentasResumidosVentas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidos Ventases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVentasResumidosVentas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVentasResumidosVentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVentasResumidosVentas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVentasResumidosVentas);
		this.jInternalFrameReporteDinamicoVentasResumidosVentas.getContentPane().add(this.jScrollPanelReporteDinamicoVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVentasResumidosVentas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVentasResumidosVentas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVentasResumidosVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVentasResumidosVentas.setName("jPanelImportacionVentasResumidosVentas"); 
		
		this.jPanelImportacionVentasResumidosVentas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentasResumidosVentas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentasResumidosVentas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVentasResumidosVentas.setLayout(gridaBagLayoutImportacionVentasResumidosVentas);
		
		
		this.jInternalFrameImportacionVentasResumidosVentas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVentasResumidosVentas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVentasResumidosVentas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentasResumidosVentas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVentasResumidosVentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentasResumidosVentas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentasResumidosVentas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVentasResumidosVentas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentasResumidosVentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentasResumidosVentas.setResizable(true);
	    this.jInternalFrameImportacionVentasResumidosVentas.setClosable(true);
	    this.jInternalFrameImportacionVentasResumidosVentas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVentasResumidosVentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentasResumidosVentas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentasResumidosVentas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVentasResumidosVentas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentasResumidosVentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentasResumidosVentas.setResizable(true);
	    this.jInternalFrameImportacionVentasResumidosVentas.setClosable(true);
	    this.jInternalFrameImportacionVentasResumidosVentas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVentasResumidosVentas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentasResumidosVentas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentasResumidosVentas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidos Ventases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVentasResumidosVentas = new JLabelMe();

		this.jLabelArchivoImportacionVentasResumidosVentas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentasResumidosVentas.add(this.jLabelArchivoImportacionVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVentasResumidosVentas = new JFileChooser();		
		this.jFileChooserImportacionVentasResumidosVentas.setToolTipText("ESCOGER ARCHIVO"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVentasResumidosVentas = new JButtonMe();
		this.jButtonAbrirImportacionVentasResumidosVentas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVentasResumidosVentas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVentasResumidosVentas.setToolTipText("Generar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasResumidosVentas.add(this.jButtonAbrirImportacionVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVentasResumidosVentas = new JLabelMe();

		this.jLabelPathArchivoImportacionVentasResumidosVentas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentasResumidosVentas.add(this.jLabelPathArchivoImportacionVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVentasResumidosVentas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVentasResumidosVentas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentasResumidosVentas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentasResumidosVentas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasResumidosVentas.add(this.jTextFieldPathArchivoImportacionVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVentasResumidosVentas = new JButtonMe();
		this.jButtonGenerarImportacionVentasResumidosVentas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVentasResumidosVentas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVentasResumidosVentas.setToolTipText("Generar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasResumidosVentas.add(this.jButtonGenerarImportacionVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVentasResumidosVentas = new JButtonMe();
		this.jButtonCerrarImportacionVentasResumidosVentas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVentasResumidosVentas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVentasResumidosVentas.setToolTipText("Cancelar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasResumidosVentas.add(this.jButtonCerrarImportacionVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVentasResumidosVentas = new GridBagLayout();
		
		this.jScrollPanelImportacionVentasResumidosVentas= new JScrollPane(jPanelImportacionVentasResumidosVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy =iPosYImportacion;
		this.gridBagConstraintsVentasResumidosVentas.gridx =iPosXImportacion;
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVentasResumidosVentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVentasResumidosVentas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVentasResumidosVentas);
		this.jInternalFrameImportacionVentasResumidosVentas.getContentPane().add(this.jScrollPanelImportacionVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVentasResumidosVentas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVentasResumidosVentas = new JButtonMe();
			this.jButtonAbrirOrderByVentasResumidosVentas.setText("Orden");
			this.jButtonAbrirOrderByVentasResumidosVentas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentasResumidosVentas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVentasResumidosVentas";
			inputMap = this.jButtonAbrirOrderByVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVentasResumidosVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVentasResumidosVentas"));
		
		
			GridBagLayout gridaBagLayoutOrderByVentasResumidosVentas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVentasResumidosVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVentasResumidosVentas.setName("jPanelOrderByVentasResumidosVentas"); 
			
			this.jPanelOrderByVentasResumidosVentas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentasResumidosVentas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentasResumidosVentas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVentasResumidosVentas.setLayout(gridaBagLayoutOrderByVentasResumidosVentas);
			
			
			this.jTableDatosVentasResumidosVentasOrderBy = new JTableMe();        
			this.jTableDatosVentasResumidosVentasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVentasResumidosVentasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVentasResumidosVentasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVentasResumidosVentasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVentasResumidosVentasOrderBy.setViewportView(this.jTableDatosVentasResumidosVentasOrderBy);
			this.jTableDatosVentasResumidosVentasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVentasResumidosVentasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVentasResumidosVentas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVentasResumidosVentas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVentasResumidosVentas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVentasResumidosVentas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVentasResumidosVentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVentasResumidosVentas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVentasResumidosVentas.setTitle("Orden");
			this.jInternalFrameOrderByVentasResumidosVentas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVentasResumidosVentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVentasResumidosVentas.setResizable(true);
			this.jInternalFrameOrderByVentasResumidosVentas.setClosable(true);
			this.jInternalFrameOrderByVentasResumidosVentas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVentasResumidosVentas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentasResumidosVentas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentasResumidosVentas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidos Ventases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVentasResumidosVentas.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVentasResumidosVentas.ipady =150;
				
			this.jPanelOrderByVentasResumidosVentas.add(jScrollPanelDatosVentasResumidosVentasOrderBy, this.gridBagConstraintsVentasResumidosVentas);//this.jTableDatosVentasResumidosVentasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVentasResumidosVentas = new JButtonMe();
			this.jButtonCerrarOrderByVentasResumidosVentas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVentasResumidosVentas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVentasResumidosVentas.setToolTipText("Cancelar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVentasResumidosVentas.add(this.jButtonCerrarOrderByVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVentasResumidosVentas = new GridBagLayout();
			
			this.jScrollPanelOrderByVentasResumidosVentas= new JScrollPane(jPanelOrderByVentasResumidosVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.gridy =iPosYOrderBy;
			this.gridBagConstraintsVentasResumidosVentas.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVentasResumidosVentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVentasResumidosVentas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVentasResumidosVentas);
			
			this.jInternalFrameOrderByVentasResumidosVentas.getContentPane().add(this.jScrollPanelOrderByVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);			
		
		} else {
			this.jButtonAbrirOrderByVentasResumidosVentas = new JButtonMe();
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
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.ventasresumidosventasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVentasResumidosVentas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVentasResumidosVentas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVentasResumidosVentas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosVentasResumidosVentas.getRowHeight();//VentasResumidosVentasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VentasResumidosVentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentasResumidosVentas.isSelected()) {
					iHeightTable=VentasResumidosVentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentasResumidosVentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentasResumidosVentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VentasResumidosVentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentasResumidosVentas.isSelected()) {
					iHeightTable=VentasResumidosVentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentasResumidosVentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentasResumidosVentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVentasResumidosVentas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentasResumidosVentas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentasResumidosVentas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVentasResumidosVentas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentasResumidosVentas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentasResumidosVentas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVentasResumidosVentas!=null && this.jInternalFrameOrderByVentasResumidosVentas.getjTableDatosOrderBy()!=null) {
			//if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVentasResumidosVentas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVentasResumidosVentas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVentasResumidosVentas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVentasResumidosVentas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVentasResumidosVentas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVentasResumidosVentas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVentasResumidosVentas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVentasResumidosVentas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentasResumidosVentas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentasResumidosVentas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=ventasresumidosventasLogic.getVentasResumidosVentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventasresumidosventass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VentasResumidosVentas> TraerVentasResumidosVentasBeans(List<VentasResumidosVentas> ventasresumidosventass,ArrayList<Classe> classes)throws Exception {
		try {
			for(VentasResumidosVentas ventasresumidosventas:ventasresumidosventass) {
					
				if(!(VentasResumidosVentasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VentasResumidosVentasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ventasresumidosventas.setsDetalleGeneralEntityReporte(VentasResumidosVentasConstantesFunciones.getVentasResumidosVentasDescripcion(ventasresumidosventas));
										
						
					
						
					
				} else  {
							
					//ventasresumidosventas.setsDetalleGeneralEntityReporte(ventasresumidosventas.getsDetalleGeneralEntityReporte());
										
				}
				
				//ventasresumidosventasbeans.add(ventasresumidosventasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ventasresumidosventass;
    }
	//PARA REPORTES FIN
}
