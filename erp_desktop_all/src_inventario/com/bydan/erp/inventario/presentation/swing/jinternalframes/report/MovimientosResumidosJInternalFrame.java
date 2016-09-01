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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.MovimientosResumidosConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class MovimientosResumidosJInternalFrame extends MovimientosResumidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMovimientosResumidos;
	
	protected JMenuBar jmenuBarMovimientosResumidos;
	
	protected JMenu jmenuMovimientosResumidos;
	protected JMenu jmenuDatosMovimientosResumidos;
	protected JMenu jmenuArchivoMovimientosResumidos;
	protected JMenu jmenuAccionesMovimientosResumidos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMovimientosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMovimientosResumidos;	
	protected GridBagConstraints gridBagConstraintsMovimientosResumidos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MovimientosResumidosDetalleFormJInternalFrame jInternalFrameDetalleFormMovimientosResumidos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMovimientosResumidos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMovimientosResumidos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";
	
	public MovimientosResumidosSessionBean movimientosresumidosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<MovimientosResumidos> movimientosresumidoss;		
	public List<MovimientosResumidos> movimientosresumidossEliminados;	
	public List<MovimientosResumidos> movimientosresumidossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMovimientosResumidos;		
	protected JButton jButtonAbrirOrderByMovimientosResumidos;
	
	
	//protected JPanel jPanelOrderByMovimientosResumidos;
	//public JScrollPane jScrollPanelOrderByMovimientosResumidos;	
	//protected JButton jButtonCerrarOrderByMovimientosResumidos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MovimientosResumidosLogic movimientosresumidosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMovimientosResumidos;
	public JScrollPane jScrollPanelDatosEdicionMovimientosResumidos;
	public JScrollPane jScrollPanelDatosGeneralMovimientosResumidos;
    
	
	
	//public JScrollPane jScrollPanelDatosMovimientosResumidosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMovimientosResumidos;
	//public JScrollPane jScrollPanelImportacionMovimientosResumidos;
	
	
	
	protected JPanel jPanelAccionesMovimientosResumidos;
	
    protected JPanel jPanelPaginacionMovimientosResumidos;
    protected JPanel jPanelParametrosReportesMovimientosResumidos;
	protected JPanel jPanelParametrosReportesAccionesMovimientosResumidos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1MovimientosResumidos;
	protected JPanel jPanelParametrosAuxiliar2MovimientosResumidos;
	protected JPanel jPanelParametrosAuxiliar3MovimientosResumidos;
	protected JPanel jPanelParametrosAuxiliar4MovimientosResumidos;
	//protected JPanel jPanelParametrosAuxiliar5MovimientosResumidos;
	
	
	
	//protected JPanel jPanelReporteDinamicoMovimientosResumidos;
	//protected JPanel jPanelImportacionMovimientosResumidos;
	
	
	public JTable jTableDatosMovimientosResumidos;
	
	
	
	//public JTable jTableDatosMovimientosResumidosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMovimientosResumidos;
	protected JButton jButtonDuplicarMovimientosResumidos;
	protected JButton jButtonCopiarMovimientosResumidos;
	protected JButton jButtonVerFormMovimientosResumidos;
	protected JButton jButtonNuevoRelacionesMovimientosResumidos;
	protected JButton jButtonModificarMovimientosResumidos;
	
    protected JButton jButtonGuardarCambiosTablaMovimientosResumidos;
	protected JButton jButtonCerrarMovimientosResumidos;
	
	
	protected JButton jButtonRecargarInformacionMovimientosResumidos;
	protected JButton jButtonProcesarInformacionMovimientosResumidos;
	
	
	protected JButton jButtonAnterioresMovimientosResumidos;
	protected JButton jButtonSiguientesMovimientosResumidos;
	protected JButton jButtonNuevoGuardarCambiosMovimientosResumidos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMovimientosResumidos;
	//protected JButton jButtonCerrarReporteDinamicoMovimientosResumidos;
	//protected JButton jButtonGenerarExcelReporteDinamicoMovimientosResumidos;	
	
	
	
	//protected JButton jButtonAbrirImportacionMovimientosResumidos;
	//protected JButton jButtonGenerarImportacionMovimientosResumidos;
	//protected JButton jButtonCerrarImportacionMovimientosResumidos;
	//protected JFileChooser jFileChooserImportacionMovimientosResumidos;
	//protected File fileImportacionMovimientosResumidos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMovimientosResumidos;
	protected JButton jButtonDuplicarToolBarMovimientosResumidos;
	protected JButton jButtonNuevoRelacionesToolBarMovimientosResumidos;
	
	
	public JButton jButtonGuardarCambiosToolBarMovimientosResumidos;
	protected JButton jButtonCopiarToolBarMovimientosResumidos;
	protected JButton jButtonVerFormToolBarMovimientosResumidos;
	public JButton jButtonGuardarCambiosTablaToolBarMovimientosResumidos;
	protected JButton jButtonMostrarOcultarTablaToolBarMovimientosResumidos;
	protected JButton jButtonCerrarToolBarMovimientosResumidos;
	
	protected JButton jButtonRecargarInformacionToolBarMovimientosResumidos;
	protected JButton jButtonProcesarInformacionToolBarMovimientosResumidos;
	protected JButton jButtonAnterioresToolBarMovimientosResumidos;
	protected JButton jButtonSiguientesToolBarMovimientosResumidos;
	protected JButton jButtonNuevoGuardarCambiosToolBarMovimientosResumidos;
	protected JButton jButtonAbrirOrderByToolBarMovimientosResumidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMovimientosResumidos;
	protected JMenuItem jMenuItemDuplicarMovimientosResumidos;
	protected JMenuItem jMenuItemNuevoRelacionesMovimientosResumidos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMovimientosResumidos;
	protected JMenuItem jMenuItemCopiarMovimientosResumidos;
	protected JMenuItem jMenuItemVerFormMovimientosResumidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaMovimientosResumidos;
	protected JMenuItem jMenuItemCerrarMovimientosResumidos;
	protected JMenuItem jMenuItemDetalleCerrarMovimientosResumidos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMovimientosResumidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarMovimientosResumidos;
	
	protected JMenuItem jMenuItemRecargarInformacionMovimientosResumidos;
	protected JMenuItem jMenuItemProcesarInformacionMovimientosResumidos;
	protected JMenuItem jMenuItemAnterioresMovimientosResumidos;
	protected JMenuItem jMenuItemSiguientesMovimientosResumidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMovimientosResumidos;
	protected JMenuItem jMenuItemAbrirOrderByMovimientosResumidos;
	protected JMenuItem jMenuItemMostrarOcultarMovimientosResumidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMovimientosResumidos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMovimientosResumidos;
	protected JCheckBox jCheckBoxSeleccionadosMovimientosResumidos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMovimientosResumidos;
	protected JCheckBox jCheckBoxConGraficoReporteMovimientosResumidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMovimientosResumidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMovimientosResumidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMovimientosResumidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMovimientosResumidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMovimientosResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMovimientosResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMovimientosResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMovimientosResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMovimientosResumidos;
	protected JTextField jTextFieldValorCampoGeneralMovimientosResumidos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMovimientosResumidos;
	//public JList<Reporte> jListColumnasSelectReporteMovimientosResumidos;
	//public JScrollPane jScrollColumnasSelectReporteMovimientosResumidos;
	
	//public JLabel jLabelRelacionesSelectReporteMovimientosResumidos;
	//public JList<Reporte> jListRelacionesSelectReporteMovimientosResumidos;
	//public JScrollPane jScrollRelacionesSelectReporteMovimientosResumidos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMovimientosResumidos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMovimientosResumidos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMovimientosResumidos;
	//public JLabel jLabelTiposArchivoReporteDinamicoMovimientosResumidos;
	
		
	//public JLabel jLabelArchivoImportacionMovimientosResumidos;	
	//public JLabel jLabelPathArchivoImportacionMovimientosResumidos;
	//protected JTextField jTextFieldPathArchivoImportacionMovimientosResumidos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMovimientosResumidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMovimientosResumidos;
	
	//public JLabel jLabelColumnaCategoriaValorMovimientosResumidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMovimientosResumidos;
	
	//public JLabel jLabelColumnasValoresGraficoMovimientosResumidos;
	//public JList<Reporte> jListColumnasValoresGraficoMovimientosResumidos;
	//public JScrollPane jScrollColumnasValoresGraficoMovimientosResumidos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMovimientosResumidos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMovimientosResumidos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasMovimientosResumidos;
	public JPanel jPanelBusquedaMovimientosResumidosMovimientosResumidos;
	public JButton jButtonBusquedaMovimientosResumidosMovimientosResumidos;
	
	public JPanel jPanelid_transaccionBusquedaMovimientosResumidosMovimientosResumidos;
	public JLabel jLabelid_transaccionBusquedaMovimientosResumidosMovimientosResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos;
	public JButton jButtonid_transaccionBusquedaMovimientosResumidosMovimientosResumidos= new JButtonMe();
	public JButton jButtonid_transaccionBusquedaMovimientosResumidosMovimientosResumidosUpdate= new JButtonMe();
	public JButton jButtonid_transaccionBusquedaMovimientosResumidosMovimientosResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos;
	public JLabel jLabelfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos;
	public JButton jButtonfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos;
	public JLabel jLabelfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos;
	public JButton jButtonfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=748;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public MovimientosResumidosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("MovimientosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientosResumidosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MovimientosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientosResumidosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MovimientosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientosResumidosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MovimientosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMovimientosResumidos)	{
		this.jButtonRecargarInformacionMovimientosResumidos = jButtonRecargarInformacionMovimientosResumidos;
	}
	
	public JButton getjButtonProcesarInformacionMovimientosResumidos() {
		return this.jButtonProcesarInformacionMovimientosResumidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMovimientosResumidos)	{
		this.jButtonProcesarInformacionMovimientosResumidos = jButtonProcesarInformacionMovimientosResumidos;
	}
	
	
	public JButton getjButtonRecargarInformacionMovimientosResumidos() {
		return this.jButtonRecargarInformacionMovimientosResumidos;
	}
	
	
	public List<MovimientosResumidos> getmovimientosresumidoss() {
		return this.movimientosresumidoss;
	}

	public void setmovimientosresumidoss(List<MovimientosResumidos> movimientosresumidoss) {
		this.movimientosresumidoss = movimientosresumidoss;
	}
	
	public List<MovimientosResumidos> getmovimientosresumidossAux() {
		return this.movimientosresumidossAux;
	}

	public void setmovimientosresumidossAux(List<MovimientosResumidos> movimientosresumidossAux) {
		this.movimientosresumidossAux = movimientosresumidossAux;
	}
	
	public List<MovimientosResumidos> getmovimientosresumidossEliminados() {
		return this.movimientosresumidossEliminados;
	}

	public void setMovimientosResumidossEliminados(List<MovimientosResumidos> movimientosresumidossEliminados) {
		this.movimientosresumidossEliminados = movimientosresumidossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMovimientosResumidos() {
		return jComboBoxTiposSeleccionarMovimientosResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMovimientosResumidos(
			JComboBox jComboBoxTiposSeleccionarMovimientosResumidos) {
		this.jComboBoxTiposSeleccionarMovimientosResumidos = jComboBoxTiposSeleccionarMovimientosResumidos;
	}
	
	public void setBorderResaltarTiposSeleccionarMovimientosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMovimientosResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMovimientosResumidos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMovimientosResumidos() {
		return jTextFieldValorCampoGeneralMovimientosResumidos;
	}

	public void setjTextFieldValorCampoGeneralMovimientosResumidos(
			JTextField jTextFieldValorCampoGeneralMovimientosResumidos) {
		this.jTextFieldValorCampoGeneralMovimientosResumidos = jTextFieldValorCampoGeneralMovimientosResumidos;
	}

	public void setBorderResaltarValorCampoGeneralMovimientosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosResumidos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMovimientosResumidos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMovimientosResumidos() {
		return this.jCheckBoxSeleccionarTodosMovimientosResumidos;
	}

	public void setjCheckBoxSeleccionarTodosMovimientosResumidos(
			JCheckBox jCheckBoxSeleccionarTodosMovimientosResumidos) {
		this.jCheckBoxSeleccionarTodosMovimientosResumidos = jCheckBoxSeleccionarTodosMovimientosResumidos;
	}

	public void setBorderResaltarSeleccionarTodosMovimientosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosResumidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMovimientosResumidos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMovimientosResumidos() {
		return this.jCheckBoxSeleccionadosMovimientosResumidos;
	}

	public void setjCheckBoxSeleccionadosMovimientosResumidos(
			JCheckBox jCheckBoxSeleccionadosMovimientosResumidos) {
		this.jCheckBoxSeleccionadosMovimientosResumidos = jCheckBoxSeleccionadosMovimientosResumidos;
	}
	
	public void setBorderResaltarSeleccionadosMovimientosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosResumidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMovimientosResumidos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMovimientosResumidos() {
		return this.jComboBoxTiposArchivosReportesMovimientosResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMovimientosResumidos(
			JComboBox jComboBoxTiposArchivosReportesMovimientosResumidos) {
		this.jComboBoxTiposArchivosReportesMovimientosResumidos = jComboBoxTiposArchivosReportesMovimientosResumidos;
	}

	public void setBorderResaltarTiposArchivosReportesMovimientosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMovimientosResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMovimientosResumidos() {
		return this.jComboBoxTiposReportesMovimientosResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMovimientosResumidos(
			JComboBox jComboBoxTiposReportesMovimientosResumidos) {
		this.jComboBoxTiposReportesMovimientosResumidos = jComboBoxTiposReportesMovimientosResumidos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMovimientosResumidos() {
	//	return jComboBoxTiposReportesDinamicoMovimientosResumidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMovimientosResumidos(
	//		JComboBox jComboBoxTiposReportesDinamicoMovimientosResumidos) {
	//	this.jComboBoxTiposReportesDinamicoMovimientosResumidos = jComboBoxTiposReportesDinamicoMovimientosResumidos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMovimientosResumidos() {
	//	return jComboBoxTiposArchivosReportesDinamicoMovimientosResumidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMovimientosResumidos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMovimientosResumidos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMovimientosResumidos = jComboBoxTiposArchivosReportesDinamicoMovimientosResumidos;
	//}
	
	public void setBorderResaltarTiposReportesMovimientosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMovimientosResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMovimientosResumidos() {
		return this.jComboBoxTiposGraficosReportesMovimientosResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMovimientosResumidos(
			JComboBox jComboBoxTiposGraficosReportesMovimientosResumidos) {
		this.jComboBoxTiposGraficosReportesMovimientosResumidos = jComboBoxTiposGraficosReportesMovimientosResumidos;
	}
	
	public void setBorderResaltarTiposGraficosReportesMovimientosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMovimientosResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMovimientosResumidos() {
		return this.jComboBoxTiposPaginacionMovimientosResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMovimientosResumidos(
			JComboBox jComboBoxTiposPaginacionMovimientosResumidos) {
		this.jComboBoxTiposPaginacionMovimientosResumidos = jComboBoxTiposPaginacionMovimientosResumidos;
	}
	
	public void setBorderResaltarTiposPaginacionMovimientosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMovimientosResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMovimientosResumidos() {
		return this.jComboBoxTiposRelacionesMovimientosResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMovimientosResumidos() {
		return this.jComboBoxTiposAccionesMovimientosResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMovimientosResumidos(
			JComboBox jComboBoxTiposRelacionesMovimientosResumidos) {
		this.jComboBoxTiposRelacionesMovimientosResumidos = jComboBoxTiposRelacionesMovimientosResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMovimientosResumidos(
			JComboBox jComboBoxTiposAccionesMovimientosResumidos) {
		this.jComboBoxTiposAccionesMovimientosResumidos = jComboBoxTiposAccionesMovimientosResumidos;
	}
	
	public void setBorderResaltarTiposRelacionesMovimientosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMovimientosResumidos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMovimientosResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMovimientosResumidos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMovimientosResumidos() {
	//	return jCheckBoxConGraficoDinamicoMovimientosResumidos;
	//}

	//public void setjCheckBoxConGraficoDinamicoMovimientosResumidos(
	//		JCheckBox jCheckBoxConGraficoDinamicoMovimientosResumidos) {
	//	this.jCheckBoxConGraficoDinamicoMovimientosResumidos = jCheckBoxConGraficoDinamicoMovimientosResumidos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMovimientosResumidos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMovimientosResumidos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMovimientosResumidos .setBorder(borderResaltar);		
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
		this.movimientosresumidosSessionBean=new MovimientosResumidosSessionBean();
		
		this.movimientosresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.movimientosresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.movimientosresumidosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MovimientosResumidosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MovimientosResumidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MovimientosResumidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MovimientosResumidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MovimientosResumidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Movimientos Resumidos MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
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
		
		MovimientosResumidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("MovimientosResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMovimientosResumidos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMovimientosResumidos,this.jTtoolBarMovimientosResumidos,
							"nuevo","nuevo","Nuevo"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMovimientosResumidos,this.jTtoolBarMovimientosResumidos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMovimientosResumidos,this.jTtoolBarMovimientosResumidos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMovimientosResumidos,this.jTtoolBarMovimientosResumidos,
							"duplicar","duplicar","Duplicar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMovimientosResumidos,this.jTtoolBarMovimientosResumidos,
							"copiar","copiar","Copiar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMovimientosResumidos,this.jTtoolBarMovimientosResumidos,
							"ver_form","ver_form","Ver"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMovimientosResumidos,this.jTtoolBarMovimientosResumidos,
							"recargar","recargar","Buscar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMovimientosResumidos,this.jTtoolBarMovimientosResumidos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMovimientosResumidos,this.jTtoolBarMovimientosResumidos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMovimientosResumidos,this.jTtoolBarMovimientosResumidos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMovimientosResumidos,this.jTtoolBarMovimientosResumidos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMovimientosResumidos,this.jTtoolBarMovimientosResumidos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMovimientosResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMovimientosResumidos,this.jTtoolBarMovimientosResumidos,
							"cerrar","cerrar","Salir"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMovimientosResumidos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMovimientosResumidos;
			
				this.jButtonProcesarInformacionToolBarMovimientosResumidos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMovimientosResumidos;
				
		//protected JButton jButtonModificarToolBarMovimientosResumidos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMovimientosResumidos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMovimientosResumidos=new JMenuMe("General");
		this.jmenuArchivoMovimientosResumidos=new JMenuMe("Archivo");
		this.jmenuAccionesMovimientosResumidos=new JMenuMe("Acciones");
		this.jmenuDatosMovimientosResumidos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMovimientosResumidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMovimientosResumidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMovimientosResumidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMovimientosResumidos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMovimientosResumidos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMovimientosResumidos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMovimientosResumidos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMovimientosResumidos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMovimientosResumidos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMovimientosResumidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMovimientosResumidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMovimientosResumidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMovimientosResumidos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMovimientosResumidos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMovimientosResumidos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMovimientosResumidos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMovimientosResumidos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMovimientosResumidos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMovimientosResumidos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMovimientosResumidos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMovimientosResumidos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMovimientosResumidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMovimientosResumidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMovimientosResumidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMovimientosResumidos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMovimientosResumidos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMovimientosResumidos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMovimientosResumidos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMovimientosResumidos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMovimientosResumidos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMovimientosResumidos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMovimientosResumidos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMovimientosResumidos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMovimientosResumidos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMovimientosResumidos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMovimientosResumidos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMovimientosResumidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMovimientosResumidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMovimientosResumidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMovimientosResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMovimientosResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMovimientosResumidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMovimientosResumidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMovimientosResumidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMovimientosResumidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMovimientosResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMovimientosResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMovimientosResumidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMovimientosResumidos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMovimientosResumidos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMovimientosResumidos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMovimientosResumidos.add(this.jMenuItemCerrarMovimientosResumidos);
			
			this.jmenuAccionesMovimientosResumidos.add(this.jMenuItemNuevoMovimientosResumidos);
			this.jmenuAccionesMovimientosResumidos.add(this.jMenuItemNuevoGuardarCambiosMovimientosResumidos);
			this.jmenuAccionesMovimientosResumidos.add(this.jMenuItemNuevoRelacionesMovimientosResumidos);
			this.jmenuAccionesMovimientosResumidos.add(this.jMenuItemGuardarCambiosTablaMovimientosResumidos);		
			this.jmenuAccionesMovimientosResumidos.add(this.jMenuItemDuplicarMovimientosResumidos);		
			this.jmenuAccionesMovimientosResumidos.add(this.jMenuItemCopiarMovimientosResumidos);		
			this.jmenuAccionesMovimientosResumidos.add(this.jMenuItemVerFormMovimientosResumidos);		
			
			this.jmenuDatosMovimientosResumidos.add(this.jMenuItemRecargarInformacionMovimientosResumidos);				
			this.jmenuDatosMovimientosResumidos.add(this.jMenuItemAnterioresMovimientosResumidos);				
			this.jmenuDatosMovimientosResumidos.add(this.jMenuItemSiguientesMovimientosResumidos);				
			this.jmenuDatosMovimientosResumidos.add(this.jMenuItemAbrirOrderByMovimientosResumidos);				
			this.jmenuDatosMovimientosResumidos.add(this.jMenuItemMostrarOcultarMovimientosResumidos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMovimientosResumidos.add(this.jMenuItemGuardarCambiosMovimientosResumidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMovimientosResumidos.add(this.jmenuArchivoMovimientosResumidos);		
			this.jmenuBarMovimientosResumidos.add(this.jmenuAccionesMovimientosResumidos);		
			this.jmenuBarMovimientosResumidos.add(this.jmenuDatosMovimientosResumidos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMovimientosResumidos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMovimientosResumidos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaMovimientosResumidosMovimientosResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaMovimientosResumidosMovimientosResumidos.setToolTipText("Buscar Por Transaccion Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaMovimientosResumidosMovimientosResumidos= new JButtonMe();
		this.jButtonBusquedaMovimientosResumidosMovimientosResumidos.setText("Buscar");
		this.jButtonBusquedaMovimientosResumidosMovimientosResumidos.setToolTipText("Buscar Por Transaccion Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaMovimientosResumidosMovimientosResumidos,"buscar_button","Buscar Por Transaccion Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaMovimientosResumidosMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionBusquedaMovimientosResumidosMovimientosResumidos = new JLabelMe();
		jLabelid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.setText("Transaccion :");
		jLabelid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.setToolTipText("Transaccion");
		jLabelid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionBusquedaMovimientosResumidosMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos= new JComboBoxMe();
		jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasMovimientosResumidos=new JTabbedPane();


		this.jTabbedPaneBusquedasMovimientosResumidos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasMovimientosResumidos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasMovimientosResumidos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasMovimientosResumidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleMovimientosResumidos = new MovimientosResumidosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Movimientos Resumidos DATOS");
			this.jInternalFrameDetalleFormMovimientosResumidos = new MovimientosResumidosDetalleFormJInternalFrame(jDesktopPane,this.movimientosresumidosSessionBean.getConGuardarRelaciones(),this.movimientosresumidosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMovimientosResumidos = null;//new MovimientosResumidosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMovimientosResumidos= new GridBagLayout();
		
		
		this.jTableDatosMovimientosResumidos = new JTableMe();      
		
		String sToolTipMovimientosResumidos="";
		sToolTipMovimientosResumidos=MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMovimientosResumidos+="(Inventario.MovimientosResumidos)";
		}
		
		if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipMovimientosResumidos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMovimientosResumidos.setToolTipText(sToolTipMovimientosResumidos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMovimientosResumidos);
		this.jTableDatosMovimientosResumidos.setAutoCreateRowSorter(true);
		this.jTableDatosMovimientosResumidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMovimientosResumidos.setRowSelectionAllowed(true);
		this.jTableDatosMovimientosResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMovimientosResumidos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMovimientosResumidos = new JButtonMe();
		this.jButtonDuplicarMovimientosResumidos = new JButtonMe();
		this.jButtonCopiarMovimientosResumidos = new JButtonMe();
		this.jButtonVerFormMovimientosResumidos = new JButtonMe();
		this.jButtonNuevoRelacionesMovimientosResumidos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMovimientosResumidos = new JButtonMe();
		this.jButtonCerrarMovimientosResumidos = new JButtonMe();
		
		this.jScrollPanelDatosMovimientosResumidos = new JScrollPane();   
        this.jScrollPanelDatosGeneralMovimientosResumidos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMovimientosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Movimientos Resumidos";
		
		if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimientos Resumidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosMovimientosResumidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMovimientosResumidos.setToolTipText("Acciones");
        this.jPanelAccionesMovimientosResumidos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoMovimientosResumidos=new ReporteDinamicoJInternalFrame(MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMovimientosResumidos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMovimientosResumidos=new ImportacionJInternalFrame(MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMovimientosResumidos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMovimientosResumidos = new JButtonMe();
		
		this.jButtonAbrirOrderByMovimientosResumidos.setText("Orden");
		this.jButtonAbrirOrderByMovimientosResumidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMovimientosResumidos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMovimientosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMovimientosResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMovimientosResumidos,false,this);
			
			//this.cargarOrderByMovimientosResumidos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMovimientosResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMovimientosResumidos,true,this);
			
			//this.cargarOrderByMovimientosResumidos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMovimientosResumidos.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosMovimientosResumidos.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosMovimientosResumidos.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosMovimientosResumidos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMovimientosResumidos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMovimientosResumidos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMovimientosResumidos.setText("Nuevo");
		this.jButtonDuplicarMovimientosResumidos.setText("Duplicar");
		this.jButtonCopiarMovimientosResumidos.setText("Copiar");
		this.jButtonVerFormMovimientosResumidos.setText("Ver");
		this.jButtonNuevoRelacionesMovimientosResumidos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMovimientosResumidos.setText("Guardar");
		this.jButtonCerrarMovimientosResumidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMovimientosResumidos,"nuevo_button","Nuevo",this.movimientosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMovimientosResumidos,"duplicar_button","Duplicar",this.movimientosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMovimientosResumidos,"copiar_button","Copiar",this.movimientosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMovimientosResumidos,"ver_form","Ver",this.movimientosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMovimientosResumidos,"nuevorelaciones_button","Nuevo Rel",this.movimientosresumidosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMovimientosResumidos,"guardarcambiostabla_button","Guardar",this.movimientosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMovimientosResumidos,"cerrar_button","Salir",this.movimientosresumidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMovimientosResumidos.setToolTipText("Nuevo"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMovimientosResumidos.setToolTipText("Duplicar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMovimientosResumidos.setToolTipText("Copiar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMovimientosResumidos.setToolTipText("Ver"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMovimientosResumidos.setToolTipText("Nuevo Rel"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMovimientosResumidos.setToolTipText("Guardar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMovimientosResumidos.setToolTipText("Salir"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMovimientosResumidos";
		inputMap = this.jButtonNuevoMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMovimientosResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMovimientosResumidos"));
		
		//DUPLICAR
		sMapKey = "DuplicarMovimientosResumidos";
		inputMap = this.jButtonDuplicarMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMovimientosResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMovimientosResumidos"));
		
		//COPIAR
		sMapKey = "CopiarMovimientosResumidos";
		inputMap = this.jButtonCopiarMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMovimientosResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMovimientosResumidos"));
		
		//VEr FORM
		sMapKey = "VerFormMovimientosResumidos";
		inputMap = this.jButtonVerFormMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMovimientosResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMovimientosResumidos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMovimientosResumidos";
		inputMap = this.jButtonNuevoRelacionesMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMovimientosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMovimientosResumidos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMovimientosResumidos";
		inputMap = this.jButtonModificarMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMovimientosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMovimientosResumidos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMovimientosResumidos";
		inputMap = this.jButtonCerrarMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMovimientosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMovimientosResumidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMovimientosResumidos";
		inputMap = this.jButtonGuardarCambiosTablaMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMovimientosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMovimientosResumidos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMovimientosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMovimientosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMovimientosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1MovimientosResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2MovimientosResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3MovimientosResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4MovimientosResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5MovimientosResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMovimientosResumidos.setName("jPanelParametrosReportesMovimientosResumidos"); 
		
		this.jPanelParametrosReportesAccionesMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMovimientosResumidos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMovimientosResumidos.setName("jPanelParametrosReportesAccionesMovimientosResumidos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMovimientosResumidos = new JButtonMe();
		this.jButtonRecargarInformacionMovimientosResumidos.setText("Buscar");
		this.jButtonRecargarInformacionMovimientosResumidos.setToolTipText("Buscar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMovimientosResumidos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionMovimientosResumidos.setVisible(false);
		
		
		this.jButtonProcesarInformacionMovimientosResumidos = new JButtonMe();
		this.jButtonProcesarInformacionMovimientosResumidos.setText("Procesar");
		this.jButtonProcesarInformacionMovimientosResumidos.setToolTipText("Procesar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMovimientosResumidos.setVisible(false);
			
		this.jButtonProcesarInformacionMovimientosResumidos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMovimientosResumidos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMovimientosResumidos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMovimientosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMovimientosResumidos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMovimientosResumidos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMovimientosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMovimientosResumidos.setText("TIPO");       
		this.jComboBoxTiposReportesMovimientosResumidos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMovimientosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMovimientosResumidos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMovimientosResumidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMovimientosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMovimientosResumidos.setText("Paginacion");
		this.jComboBoxTiposPaginacionMovimientosResumidos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMovimientosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMovimientosResumidos.setText("Accion");
		this.jComboBoxTiposRelacionesMovimientosResumidos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMovimientosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMovimientosResumidos.setText("Accion");
		this.jComboBoxTiposAccionesMovimientosResumidos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMovimientosResumidos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMovimientosResumidos.setText("Accion");
		this.jComboBoxTiposSeleccionarMovimientosResumidos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMovimientosResumidos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMovimientosResumidos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMovimientosResumidos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMovimientosResumidos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMovimientosResumidos = new JLabelMe();
		
		this.jLabelAccionesMovimientosResumidos.setText("Acciones");		
		this.jLabelAccionesMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMovimientosResumidos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMovimientosResumidos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMovimientosResumidos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMovimientosResumidos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMovimientosResumidos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMovimientosResumidos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMovimientosResumidos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMovimientosResumidos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMovimientosResumidos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMovimientosResumidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMovimientosResumidos.setText("Graf.");
		this.jCheckBoxConGraficoReporteMovimientosResumidos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMovimientosResumidos = new JButtonMe();
		//this.jButtonAnterioresMovimientosResumidos.setText("<<");
        this.jButtonAnterioresMovimientosResumidos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMovimientosResumidos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMovimientosResumidos = new JButtonMe();
		//this.jButtonSiguientesMovimientosResumidos.setText(">>");
        this.jButtonSiguientesMovimientosResumidos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMovimientosResumidos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMovimientosResumidos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMovimientosResumidos.setText("Nue");
        this.jButtonNuevoGuardarCambiosMovimientosResumidos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMovimientosResumidos,"nuevoguardarcambios_button","Nue",this.movimientosresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMovimientosResumidos";
		inputMap = this.jButtonNuevoGuardarCambiosMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMovimientosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMovimientosResumidos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMovimientosResumidos";
		inputMap = this.jButtonRecargarInformacionMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMovimientosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMovimientosResumidos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMovimientosResumidos";
		inputMap = this.jButtonSiguientesMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMovimientosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMovimientosResumidos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMovimientosResumidos";
		inputMap = this.jButtonAnterioresMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMovimientosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMovimientosResumidos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMovimientosResumidos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMovimientosResumidos.setMinimumSize(new Dimension(this.getWidth(),MovimientosResumidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MovimientosResumidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMovimientosResumidos.setMaximumSize(new Dimension(this.getWidth(),MovimientosResumidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MovimientosResumidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMovimientosResumidos.setPreferredSize(new Dimension(this.getWidth(),MovimientosResumidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MovimientosResumidosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMovimientosResumidos = new GridBagLayout();

			this.jPanelPaginacionMovimientosResumidos.setLayout(gridaBagLayoutPaginacionMovimientosResumidos);						
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy = 0;
			this.gridBagConstraintsMovimientosResumidos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMovimientosResumidos.add(this.jButtonAnterioresMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
					
						
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMovimientosResumidos.gridy = 0;
			
			this.jPanelPaginacionMovimientosResumidos.add(this.jButtonNuevoGuardarCambiosMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
						
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMovimientosResumidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMovimientosResumidos.gridy = 0;
			this.jPanelPaginacionMovimientosResumidos.add(this.jButtonSiguientesMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy = 1;
			this.gridBagConstraintsMovimientosResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMovimientosResumidos.add(this.jButtonNuevoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
						
			
			
			if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
				this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMovimientosResumidos.gridy = 1;
				this.gridBagConstraintsMovimientosResumidos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionMovimientosResumidos.add(this.jButtonGuardarCambiosTablaMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
			}
			
			
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy = 1;
			this.gridBagConstraintsMovimientosResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMovimientosResumidos.add(this.jButtonDuplicarMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy = 1;
			this.gridBagConstraintsMovimientosResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMovimientosResumidos.add(this.jButtonCopiarMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy = 1;
			this.gridBagConstraintsMovimientosResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMovimientosResumidos.add(this.jButtonVerFormMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy = 1;
			this.gridBagConstraintsMovimientosResumidos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMovimientosResumidos.add(this.jButtonCerrarMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
		
		
		this.jButtonRecargarInformacionMovimientosResumidos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMovimientosResumidos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMovimientosResumidos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMovimientosResumidos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMovimientosResumidos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMovimientosResumidos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMovimientosResumidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMovimientosResumidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMovimientosResumidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMovimientosResumidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMovimientosResumidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMovimientosResumidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMovimientosResumidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMovimientosResumidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMovimientosResumidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMovimientosResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMovimientosResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMovimientosResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMovimientosResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMovimientosResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMovimientosResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMovimientosResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMovimientosResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMovimientosResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMovimientosResumidos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMovimientosResumidos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMovimientosResumidos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMovimientosResumidos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMovimientosResumidos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMovimientosResumidos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMovimientosResumidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMovimientosResumidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMovimientosResumidos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMovimientosResumidos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMovimientosResumidos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMovimientosResumidos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMovimientosResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMovimientosResumidos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1MovimientosResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2MovimientosResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3MovimientosResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4MovimientosResumidos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMovimientosResumidos.setLayout(gridaBagParametrosReportesMovimientosResumidos);
			this.jPanelParametrosReportesAccionesMovimientosResumidos.setLayout(gridaBagParametrosReportesAccionesMovimientosResumidos);
			
			
			this.jPanelParametrosAuxiliar1MovimientosResumidos.setLayout(gridaBagParametrosAuxiliar1MovimientosResumidos);
			this.jPanelParametrosAuxiliar2MovimientosResumidos.setLayout(gridaBagParametrosAuxiliar2MovimientosResumidos);
			this.jPanelParametrosAuxiliar3MovimientosResumidos.setLayout(gridaBagParametrosAuxiliar3MovimientosResumidos);
			this.jPanelParametrosAuxiliar4MovimientosResumidos.setLayout(gridaBagParametrosAuxiliar4MovimientosResumidos);
			//this.jPanelParametrosAuxiliar5MovimientosResumidos.setLayout(gridaBagParametrosAuxiliar2MovimientosResumidos);			
			
			
			
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosResumidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMovimientosResumidos.add(this.jButtonRecargarInformacionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosResumidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MovimientosResumidos.add(this.jComboBoxTiposPaginacionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosResumidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MovimientosResumidos.add(this.jCheckBoxConAltoMaximoTablaMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosResumidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MovimientosResumidos.add(this.jComboBoxTiposArchivosReportesMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientosResumidos.add(this.jPanelParametrosAuxiliar1MovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4MovimientosResumidos.add(this.jComboBoxTiposReportesMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);																		
			
			
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4MovimientosResumidos.add(this.jComboBoxTiposGraficosReportesMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientosResumidos.add(this.jPanelParametrosAuxiliar4MovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosResumidos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientosResumidos.add(this.jComboBoxTiposReportesMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosResumidos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMovimientosResumidos.add(this.jCheckBoxGenerarReporteMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientosResumidos.add(this.jPanelParametrosAuxiliar2MovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosResumidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMovimientosResumidos.add(this.jLabelAccionesMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
				this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMovimientosResumidos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMovimientosResumidos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMovimientosResumidos.add(this.jButtonAbrirOrderByMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosResumidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMovimientosResumidos.add(this.jComboBoxTiposSeleccionarMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);			
			
			
			/*
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosResumidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMovimientosResumidos.add(this.jCheckBoxSeleccionarTodosMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosResumidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMovimientosResumidos.add(this.jCheckBoxConGraficoReporteMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MovimientosResumidos.add(this.jCheckBoxSeleccionarTodosMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);															
				
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MovimientosResumidos.add(this.jCheckBoxSeleccionadosMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);															
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MovimientosResumidos.add(this.jCheckBoxConGraficoReporteMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientosResumidos.add(this.jPanelParametrosAuxiliar3MovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosResumidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMovimientosResumidos.add(this.jComboBoxTiposAccionesMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMovimientosResumidos = new GridBagLayout();

			this.jScrollPanelDatosMovimientosResumidos.setLayout(gridaBagLayoutDatosMovimientosResumidos);
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy = 0;
			this.gridBagConstraintsMovimientosResumidos.gridx = 0;
			
			this.jScrollPanelDatosMovimientosResumidos.add(this.jTableDatosMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMovimientosResumidos.setViewportView(this.jTableDatosMovimientosResumidos);
		this.jTableDatosMovimientosResumidos.setFillsViewportHeight(true);
		this.jTableDatosMovimientosResumidos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMovimientosResumidos= new GridBagLayout();
		this.jPanelAccionesMovimientosResumidos.setLayout(gridaBagLayoutAccionesMovimientosResumidos);
		
		
		/*	
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = 0;
		this.gridBagConstraintsMovimientosResumidos.gridx = 0;
			
		this.jPanelAccionesMovimientosResumidos.add(this.jButtonNuevoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaMovimientosResumidosMovimientosResumidos= new GridBagLayout();
		gridaBagLayoutBusquedaMovimientosResumidosMovimientosResumidos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaMovimientosResumidosMovimientosResumidos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaMovimientosResumidosMovimientosResumidos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaMovimientosResumidosMovimientosResumidos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaMovimientosResumidosMovimientosResumidos.setLayout(gridaBagLayoutBusquedaMovimientosResumidosMovimientosResumidos);

		gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosResumidos.gridy = 0;
		gridBagConstraintsMovimientosResumidos.gridx = 0;
		jPanelBusquedaMovimientosResumidosMovimientosResumidos.add(jLabelid_transaccionBusquedaMovimientosResumidosMovimientosResumidos, gridBagConstraintsMovimientosResumidos);

		gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosResumidos.gridy = 0;
		gridBagConstraintsMovimientosResumidos.gridx = 1;
		jPanelBusquedaMovimientosResumidosMovimientosResumidos.add(jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos, gridBagConstraintsMovimientosResumidos);


		gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosResumidos.gridy = 1;
		gridBagConstraintsMovimientosResumidos.gridx = 0;
		jPanelBusquedaMovimientosResumidosMovimientosResumidos.add(jLabelfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos, gridBagConstraintsMovimientosResumidos);

		gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosResumidos.gridy = 1;
		gridBagConstraintsMovimientosResumidos.gridx = 1;
		jPanelBusquedaMovimientosResumidosMovimientosResumidos.add(jDateChooserfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos, gridBagConstraintsMovimientosResumidos);


		gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosResumidos.gridy = 2;
		gridBagConstraintsMovimientosResumidos.gridx = 0;
		jPanelBusquedaMovimientosResumidosMovimientosResumidos.add(jLabelfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos, gridBagConstraintsMovimientosResumidos);

		gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosResumidos.gridy = 2;
		gridBagConstraintsMovimientosResumidos.gridx = 1;
		jPanelBusquedaMovimientosResumidosMovimientosResumidos.add(jDateChooserfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos, gridBagConstraintsMovimientosResumidos);

		gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosResumidos.gridy = 3;
		gridBagConstraintsMovimientosResumidos.gridx =1;
		jPanelBusquedaMovimientosResumidosMovimientosResumidos.add(jButtonBusquedaMovimientosResumidosMovimientosResumidos, gridBagConstraintsMovimientosResumidos);

		jTabbedPaneBusquedasMovimientosResumidos.addTab("1.-Por Transaccion Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaMovimientosResumidosMovimientosResumidos);
		jTabbedPaneBusquedasMovimientosResumidos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMovimientosResumidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMovimientosResumidos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();						
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMovimientosResumidos.gridx = 0;		
			//this.gridBagConstraintsMovimientosResumidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMovimientosResumidos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMovimientosResumidos.gridx = 0;		
		//this.gridBagConstraintsMovimientosResumidos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMovimientosResumidos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMovimientosResumidos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsMovimientosResumidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMovimientosResumidos.gridx = 0;		
			this.gridBagConstraintsMovimientosResumidos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsMovimientosResumidos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosResumidos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);								
		
		
		/*
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosResumidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		*/		
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMovimientosResumidos.gridx =0;
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMovimientosResumidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
				
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosResumidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(MovimientosResumidosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMovimientosResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMovimientosResumidos = new GridBagLayout();
			this.jPanelBusquedasParametrosMovimientosResumidos.setLayout(gridaBagLayoutBusquedasParametrosMovimientosResumidos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMovimientosResumidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMovimientosResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMovimientosResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMovimientosResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
			
			
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
			
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosResumidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMovimientosResumidos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMovimientosResumidos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMovimientosResumidos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMovimientosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMovimientosResumidos.setName("jPanelReporteDinamicoMovimientosResumidos"); 
		
		this.jPanelReporteDinamicoMovimientosResumidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMovimientosResumidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMovimientosResumidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMovimientosResumidos.setLayout(gridaBagLayoutReporteDinamicoMovimientosResumidos);
		
		
		this.jInternalFrameReporteDinamicoMovimientosResumidos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMovimientosResumidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMovimientosResumidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMovimientosResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMovimientosResumidos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMovimientosResumidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMovimientosResumidos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMovimientosResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMovimientosResumidos.setResizable(true);
	    this.jInternalFrameReporteDinamicoMovimientosResumidos.setClosable(true);
	    this.jInternalFrameReporteDinamicoMovimientosResumidos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMovimientosResumidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMovimientosResumidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMovimientosResumidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimientos Resumidoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMovimientosResumidos = new JLabelMe();

		this.jLabelColumnasSelectReporteMovimientosResumidos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jLabelColumnasSelectReporteMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMovimientosResumidos = new JList<Reporte>();
		this.jListColumnasSelectReporteMovimientosResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMovimientosResumidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMovimientosResumidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMovimientosResumidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMovimientosResumidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMovimientosResumidos=new JScrollPane(this.jListColumnasSelectReporteMovimientosResumidos);
			
			this.jScrollColumnasSelectReporteMovimientosResumidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMovimientosResumidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMovimientosResumidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMovimientosResumidos.add(this.jListColumnasSelectReporteMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jScrollColumnasSelectReporteMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMovimientosResumidos = new JLabelMe();

		this.jLabelRelacionesSelectReporteMovimientosResumidos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMovimientosResumidos = new JList<Reporte>();
		this.jListRelacionesSelectReporteMovimientosResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMovimientosResumidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMovimientosResumidos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMovimientosResumidos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMovimientosResumidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMovimientosResumidos=new JScrollPane(this.jListRelacionesSelectReporteMovimientosResumidos);
			
			this.jScrollRelacionesSelectReporteMovimientosResumidos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMovimientosResumidos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMovimientosResumidos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoMovimientosResumidos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMovimientosResumidos = new JComboBoxMe();
		this.jListColumnasValoresGraficoMovimientosResumidos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMovimientosResumidos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMovimientosResumidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMovimientosResumidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMovimientosResumidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMovimientosResumidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMovimientosResumidos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMovimientosResumidos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMovimientosResumidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMovimientosResumidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMovimientosResumidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoMovimientosResumidos = new JLabelMe();

		this.jLabelConGraficoDinamicoMovimientosResumidos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jLabelConGraficoDinamicoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoMovimientosResumidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoMovimientosResumidos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoMovimientosResumidos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoMovimientosResumidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMovimientosResumidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMovimientosResumidos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jCheckBoxConGraficoDinamicoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoMovimientosResumidos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoMovimientosResumidos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jLabelColumnaCategoriaGraficoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoMovimientosResumidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMovimientosResumidos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoMovimientosResumidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoMovimientosResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMovimientosResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMovimientosResumidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jComboBoxColumnaCategoriaGraficoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorMovimientosResumidos = new JLabelMe();

		this.jLabelColumnaCategoriaValorMovimientosResumidos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jLabelColumnaCategoriaValorMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorMovimientosResumidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorMovimientosResumidos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorMovimientosResumidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorMovimientosResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMovimientosResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMovimientosResumidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jComboBoxColumnaCategoriaValorMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoMovimientosResumidos = new JLabelMe();

		this.jLabelColumnasValoresGraficoMovimientosResumidos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jLabelColumnasValoresGraficoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoMovimientosResumidos = new JList<Reporte>();
		this.jListColumnasValoresGraficoMovimientosResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoMovimientosResumidos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoMovimientosResumidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMovimientosResumidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMovimientosResumidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoMovimientosResumidos=new JScrollPane(this.jListColumnasValoresGraficoMovimientosResumidos);
			
			this.jScrollColumnasValoresGraficoMovimientosResumidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMovimientosResumidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMovimientosResumidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoMovimientosResumidos.add(this.jListColumnasSelectReporteMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jScrollColumnasValoresGraficoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoMovimientosResumidos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoMovimientosResumidos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jLabelTiposGraficosReportesDinamicoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoMovimientosResumidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMovimientosResumidos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoMovimientosResumidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoMovimientosResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMovimientosResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMovimientosResumidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jComboBoxTiposGraficosReportesDinamicoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMovimientosResumidos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMovimientosResumidos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jLabelGenerarExcelReporteDinamicoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMovimientosResumidos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMovimientosResumidos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMovimientosResumidos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMovimientosResumidos.setToolTipText("Generar EXCEL"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMovimientosResumidos.add(this.jButtonGenerarExcelReporteDinamicoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jComboBoxTiposReportesDinamicoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMovimientosResumidos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMovimientosResumidos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jLabelTiposArchivoReporteDinamicoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jComboBoxTiposArchivosReportesDinamicoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMovimientosResumidos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMovimientosResumidos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMovimientosResumidos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMovimientosResumidos.setToolTipText("Generar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jButtonGenerarReporteDinamicoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMovimientosResumidos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMovimientosResumidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMovimientosResumidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMovimientosResumidos.setToolTipText("Cancelar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMovimientosResumidos.add(this.jButtonCerrarReporteDinamicoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMovimientosResumidos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMovimientosResumidos= new JScrollPane(jPanelReporteDinamicoMovimientosResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMovimientosResumidos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMovimientosResumidos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMovimientosResumidos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimientos Resumidoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMovimientosResumidos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMovimientosResumidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMovimientosResumidos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMovimientosResumidos);
		this.jInternalFrameReporteDinamicoMovimientosResumidos.getContentPane().add(this.jScrollPanelReporteDinamicoMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMovimientosResumidos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMovimientosResumidos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMovimientosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMovimientosResumidos.setName("jPanelImportacionMovimientosResumidos"); 
		
		this.jPanelImportacionMovimientosResumidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMovimientosResumidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMovimientosResumidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMovimientosResumidos.setLayout(gridaBagLayoutImportacionMovimientosResumidos);
		
		
		this.jInternalFrameImportacionMovimientosResumidos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMovimientosResumidos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMovimientosResumidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMovimientosResumidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMovimientosResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMovimientosResumidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMovimientosResumidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMovimientosResumidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMovimientosResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMovimientosResumidos.setResizable(true);
	    this.jInternalFrameImportacionMovimientosResumidos.setClosable(true);
	    this.jInternalFrameImportacionMovimientosResumidos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMovimientosResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMovimientosResumidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMovimientosResumidos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMovimientosResumidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMovimientosResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMovimientosResumidos.setResizable(true);
	    this.jInternalFrameImportacionMovimientosResumidos.setClosable(true);
	    this.jInternalFrameImportacionMovimientosResumidos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMovimientosResumidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMovimientosResumidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMovimientosResumidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimientos Resumidoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMovimientosResumidos = new JLabelMe();

		this.jLabelArchivoImportacionMovimientosResumidos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMovimientosResumidos.add(this.jLabelArchivoImportacionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMovimientosResumidos = new JFileChooser();		
		this.jFileChooserImportacionMovimientosResumidos.setToolTipText("ESCOGER ARCHIVO"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMovimientosResumidos = new JButtonMe();
		this.jButtonAbrirImportacionMovimientosResumidos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMovimientosResumidos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMovimientosResumidos.setToolTipText("Generar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMovimientosResumidos.add(this.jButtonAbrirImportacionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMovimientosResumidos = new JLabelMe();

		this.jLabelPathArchivoImportacionMovimientosResumidos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMovimientosResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMovimientosResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMovimientosResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMovimientosResumidos.add(this.jLabelPathArchivoImportacionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMovimientosResumidos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMovimientosResumidos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMovimientosResumidos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMovimientosResumidos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMovimientosResumidos.add(this.jTextFieldPathArchivoImportacionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMovimientosResumidos = new JButtonMe();
		this.jButtonGenerarImportacionMovimientosResumidos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMovimientosResumidos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMovimientosResumidos.setToolTipText("Generar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMovimientosResumidos.add(this.jButtonGenerarImportacionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMovimientosResumidos = new JButtonMe();
		this.jButtonCerrarImportacionMovimientosResumidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMovimientosResumidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMovimientosResumidos.setToolTipText("Cancelar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsMovimientosResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMovimientosResumidos.add(this.jButtonCerrarImportacionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMovimientosResumidos = new GridBagLayout();
		
		this.jScrollPanelImportacionMovimientosResumidos= new JScrollPane(jPanelImportacionMovimientosResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
		this.gridBagConstraintsMovimientosResumidos.gridy =iPosYImportacion;
		this.gridBagConstraintsMovimientosResumidos.gridx =iPosXImportacion;
		this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMovimientosResumidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMovimientosResumidos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMovimientosResumidos);
		this.jInternalFrameImportacionMovimientosResumidos.getContentPane().add(this.jScrollPanelImportacionMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMovimientosResumidos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMovimientosResumidos = new JButtonMe();
			this.jButtonAbrirOrderByMovimientosResumidos.setText("Orden");
			this.jButtonAbrirOrderByMovimientosResumidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMovimientosResumidos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMovimientosResumidos";
			inputMap = this.jButtonAbrirOrderByMovimientosResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMovimientosResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMovimientosResumidos"));
		
		
			GridBagLayout gridaBagLayoutOrderByMovimientosResumidos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMovimientosResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMovimientosResumidos.setName("jPanelOrderByMovimientosResumidos"); 
			
			this.jPanelOrderByMovimientosResumidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMovimientosResumidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMovimientosResumidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMovimientosResumidos.setLayout(gridaBagLayoutOrderByMovimientosResumidos);
			
			
			this.jTableDatosMovimientosResumidosOrderBy = new JTableMe();        
			this.jTableDatosMovimientosResumidosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMovimientosResumidosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMovimientosResumidosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMovimientosResumidosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMovimientosResumidosOrderBy.setViewportView(this.jTableDatosMovimientosResumidosOrderBy);
			this.jTableDatosMovimientosResumidosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMovimientosResumidosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMovimientosResumidos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMovimientosResumidos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMovimientosResumidos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMovimientosResumidos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMovimientosResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMovimientosResumidos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMovimientosResumidos.setTitle("Orden");
			this.jInternalFrameOrderByMovimientosResumidos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMovimientosResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMovimientosResumidos.setResizable(true);
			this.jInternalFrameOrderByMovimientosResumidos.setClosable(true);
			this.jInternalFrameOrderByMovimientosResumidos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMovimientosResumidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMovimientosResumidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMovimientosResumidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMovimientosResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimientos Resumidoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMovimientosResumidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMovimientosResumidos.ipady =150;
				
			this.jPanelOrderByMovimientosResumidos.add(jScrollPanelDatosMovimientosResumidosOrderBy, this.gridBagConstraintsMovimientosResumidos);//this.jTableDatosMovimientosResumidosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMovimientosResumidos = new JButtonMe();
			this.jButtonCerrarOrderByMovimientosResumidos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMovimientosResumidos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMovimientosResumidos.setToolTipText("Cancelar"+" "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMovimientosResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosResumidos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMovimientosResumidos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMovimientosResumidos.add(this.jButtonCerrarOrderByMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMovimientosResumidos = new GridBagLayout();
			
			this.jScrollPanelOrderByMovimientosResumidos= new JScrollPane(jPanelOrderByMovimientosResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMovimientosResumidos = new GridBagConstraints();
			this.gridBagConstraintsMovimientosResumidos.gridy =iPosYOrderBy;
			this.gridBagConstraintsMovimientosResumidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsMovimientosResumidos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMovimientosResumidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMovimientosResumidos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMovimientosResumidos);
			
			this.jInternalFrameOrderByMovimientosResumidos.getContentPane().add(this.jScrollPanelOrderByMovimientosResumidos, this.gridBagConstraintsMovimientosResumidos);			
		
		} else {
			this.jButtonAbrirOrderByMovimientosResumidos = new JButtonMe();
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
		int iWidthTableCalculado=0;//3430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.movimientosresumidosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMovimientosResumidos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMovimientosResumidos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosMovimientosResumidos.getRowHeight();//MovimientosResumidosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MovimientosResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMovimientosResumidos.isSelected()) {
					iHeightTable=MovimientosResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MovimientosResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MovimientosResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MovimientosResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMovimientosResumidos.isSelected()) {
					iHeightTable=MovimientosResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MovimientosResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MovimientosResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMovimientosResumidos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMovimientosResumidos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMovimientosResumidos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMovimientosResumidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMovimientosResumidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMovimientosResumidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMovimientosResumidos!=null && this.jInternalFrameOrderByMovimientosResumidos.getjTableDatosOrderBy()!=null) {
			//if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMovimientosResumidos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMovimientosResumidos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMovimientosResumidos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMovimientosResumidos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMovimientosResumidos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMovimientosResumidos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMovimientosResumidos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMovimientosResumidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMovimientosResumidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMovimientosResumidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=movimientosresumidosLogic.getMovimientosResumidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=movimientosresumidoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<MovimientosResumidos> TraerMovimientosResumidosBeans(List<MovimientosResumidos> movimientosresumidoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(MovimientosResumidos movimientosresumidos:movimientosresumidoss) {
					
				if(!(MovimientosResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MovimientosResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					movimientosresumidos.setsDetalleGeneralEntityReporte(MovimientosResumidosConstantesFunciones.getMovimientosResumidosDescripcion(movimientosresumidos));
										
						
					
						
					
				} else  {
							
					//movimientosresumidos.setsDetalleGeneralEntityReporte(movimientosresumidos.getsDetalleGeneralEntityReporte());
										
				}
				
				//movimientosresumidosbeans.add(movimientosresumidosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return movimientosresumidoss;
    }
	//PARA REPORTES FIN
}
