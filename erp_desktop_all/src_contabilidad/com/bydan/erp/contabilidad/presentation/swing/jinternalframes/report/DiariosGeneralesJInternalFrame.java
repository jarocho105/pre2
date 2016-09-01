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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.DiariosGeneralesConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class DiariosGeneralesJInternalFrame extends DiariosGeneralesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDiariosGenerales;
	
	protected JMenuBar jmenuBarDiariosGenerales;
	
	protected JMenu jmenuDiariosGenerales;
	protected JMenu jmenuDatosDiariosGenerales;
	protected JMenu jmenuArchivoDiariosGenerales;
	protected JMenu jmenuAccionesDiariosGenerales;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDiariosGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDiariosGenerales;	
	protected GridBagConstraints gridBagConstraintsDiariosGenerales;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DiariosGeneralesDetalleFormJInternalFrame jInternalFrameDetalleFormDiariosGenerales;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDiariosGenerales;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDiariosGenerales;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public DiariosGeneralesSessionBean diariosgeneralesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DiariosGenerales> diariosgeneraless;		
	public List<DiariosGenerales> diariosgeneralessEliminados;	
	public List<DiariosGenerales> diariosgeneralessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDiariosGenerales;		
	protected JButton jButtonAbrirOrderByDiariosGenerales;
	
	
	//protected JPanel jPanelOrderByDiariosGenerales;
	//public JScrollPane jScrollPanelOrderByDiariosGenerales;	
	//protected JButton jButtonCerrarOrderByDiariosGenerales;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DiariosGeneralesLogic diariosgeneralesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDiariosGenerales;
	public JScrollPane jScrollPanelDatosEdicionDiariosGenerales;
	public JScrollPane jScrollPanelDatosGeneralDiariosGenerales;
    
	
	
	//public JScrollPane jScrollPanelDatosDiariosGeneralesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDiariosGenerales;
	//public JScrollPane jScrollPanelImportacionDiariosGenerales;
	
	
	
	protected JPanel jPanelAccionesDiariosGenerales;
	
    protected JPanel jPanelPaginacionDiariosGenerales;
    protected JPanel jPanelParametrosReportesDiariosGenerales;
	protected JPanel jPanelParametrosReportesAccionesDiariosGenerales;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DiariosGenerales;
	protected JPanel jPanelParametrosAuxiliar2DiariosGenerales;
	protected JPanel jPanelParametrosAuxiliar3DiariosGenerales;
	protected JPanel jPanelParametrosAuxiliar4DiariosGenerales;
	//protected JPanel jPanelParametrosAuxiliar5DiariosGenerales;
	
	
	
	//protected JPanel jPanelReporteDinamicoDiariosGenerales;
	//protected JPanel jPanelImportacionDiariosGenerales;
	
	
	public JTable jTableDatosDiariosGenerales;
	
	
	
	//public JTable jTableDatosDiariosGeneralesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDiariosGenerales;
	protected JButton jButtonDuplicarDiariosGenerales;
	protected JButton jButtonCopiarDiariosGenerales;
	protected JButton jButtonVerFormDiariosGenerales;
	protected JButton jButtonNuevoRelacionesDiariosGenerales;
	protected JButton jButtonModificarDiariosGenerales;
	
    protected JButton jButtonGuardarCambiosTablaDiariosGenerales;
	protected JButton jButtonCerrarDiariosGenerales;
	
	
	protected JButton jButtonRecargarInformacionDiariosGenerales;
	protected JButton jButtonProcesarInformacionDiariosGenerales;
	
	
	protected JButton jButtonAnterioresDiariosGenerales;
	protected JButton jButtonSiguientesDiariosGenerales;
	protected JButton jButtonNuevoGuardarCambiosDiariosGenerales;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDiariosGenerales;
	//protected JButton jButtonCerrarReporteDinamicoDiariosGenerales;
	//protected JButton jButtonGenerarExcelReporteDinamicoDiariosGenerales;	
	
	
	
	//protected JButton jButtonAbrirImportacionDiariosGenerales;
	//protected JButton jButtonGenerarImportacionDiariosGenerales;
	//protected JButton jButtonCerrarImportacionDiariosGenerales;
	//protected JFileChooser jFileChooserImportacionDiariosGenerales;
	//protected File fileImportacionDiariosGenerales;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDiariosGenerales;
	protected JButton jButtonDuplicarToolBarDiariosGenerales;
	protected JButton jButtonNuevoRelacionesToolBarDiariosGenerales;
	
	
	public JButton jButtonGuardarCambiosToolBarDiariosGenerales;
	protected JButton jButtonCopiarToolBarDiariosGenerales;
	protected JButton jButtonVerFormToolBarDiariosGenerales;
	public JButton jButtonGuardarCambiosTablaToolBarDiariosGenerales;
	protected JButton jButtonMostrarOcultarTablaToolBarDiariosGenerales;
	protected JButton jButtonCerrarToolBarDiariosGenerales;
	
	protected JButton jButtonRecargarInformacionToolBarDiariosGenerales;
	protected JButton jButtonProcesarInformacionToolBarDiariosGenerales;
	protected JButton jButtonAnterioresToolBarDiariosGenerales;
	protected JButton jButtonSiguientesToolBarDiariosGenerales;
	protected JButton jButtonNuevoGuardarCambiosToolBarDiariosGenerales;
	protected JButton jButtonAbrirOrderByToolBarDiariosGenerales;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDiariosGenerales;
	protected JMenuItem jMenuItemDuplicarDiariosGenerales;
	protected JMenuItem jMenuItemNuevoRelacionesDiariosGenerales;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDiariosGenerales;
	protected JMenuItem jMenuItemCopiarDiariosGenerales;
	protected JMenuItem jMenuItemVerFormDiariosGenerales;
	protected JMenuItem jMenuItemGuardarCambiosTablaDiariosGenerales;
	protected JMenuItem jMenuItemCerrarDiariosGenerales;
	protected JMenuItem jMenuItemDetalleCerrarDiariosGenerales;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDiariosGenerales;
	protected JMenuItem jMenuItemDetalleMostarOcultarDiariosGenerales;
	
	protected JMenuItem jMenuItemRecargarInformacionDiariosGenerales;
	protected JMenuItem jMenuItemProcesarInformacionDiariosGenerales;
	protected JMenuItem jMenuItemAnterioresDiariosGenerales;
	protected JMenuItem jMenuItemSiguientesDiariosGenerales;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDiariosGenerales;
	protected JMenuItem jMenuItemAbrirOrderByDiariosGenerales;
	protected JMenuItem jMenuItemMostrarOcultarDiariosGenerales;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDiariosGenerales;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDiariosGenerales;
	protected JCheckBox jCheckBoxSeleccionadosDiariosGenerales;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDiariosGenerales;
	protected JCheckBox jCheckBoxConGraficoReporteDiariosGenerales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDiariosGenerales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDiariosGenerales;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDiariosGenerales;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDiariosGenerales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDiariosGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDiariosGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDiariosGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDiariosGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDiariosGenerales;
	protected JTextField jTextFieldValorCampoGeneralDiariosGenerales;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDiariosGenerales;
	//public JList<Reporte> jListColumnasSelectReporteDiariosGenerales;
	//public JScrollPane jScrollColumnasSelectReporteDiariosGenerales;
	
	//public JLabel jLabelRelacionesSelectReporteDiariosGenerales;
	//public JList<Reporte> jListRelacionesSelectReporteDiariosGenerales;
	//public JScrollPane jScrollRelacionesSelectReporteDiariosGenerales;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDiariosGenerales;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDiariosGenerales;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDiariosGenerales;
	//public JLabel jLabelTiposArchivoReporteDinamicoDiariosGenerales;
	
		
	//public JLabel jLabelArchivoImportacionDiariosGenerales;	
	//public JLabel jLabelPathArchivoImportacionDiariosGenerales;
	//protected JTextField jTextFieldPathArchivoImportacionDiariosGenerales;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDiariosGenerales;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDiariosGenerales;
	
	//public JLabel jLabelColumnaCategoriaValorDiariosGenerales;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDiariosGenerales;
	
	//public JLabel jLabelColumnasValoresGraficoDiariosGenerales;
	//public JList<Reporte> jListColumnasValoresGraficoDiariosGenerales;
	//public JScrollPane jScrollColumnasValoresGraficoDiariosGenerales;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDiariosGenerales;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDiariosGenerales;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDiariosGenerales;
	public JPanel jPanelBusquedaDiariosGeneralesDiariosGenerales;
	public JButton jButtonBusquedaDiariosGeneralesDiariosGenerales;
	
	public JPanel jPanelid_ejercicioBusquedaDiariosGeneralesDiariosGenerales;
	public JLabel jLabelid_ejercicioBusquedaDiariosGeneralesDiariosGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales;
	public JButton jButtonid_ejercicioBusquedaDiariosGeneralesDiariosGenerales= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaDiariosGeneralesDiariosGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaDiariosGeneralesDiariosGeneralesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales;
	public JLabel jLabelid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales;
	public JButton jButtonid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales= new JButtonMe();
	public JButton jButtonid_tipo_movimientoBusquedaDiariosGeneralesDiariosGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoBusquedaDiariosGeneralesDiariosGeneralesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales;
	public JLabel jLabelfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales;
	public JButton jButtonfecha_emision_desdeBusquedaDiariosGeneralesDiariosGeneralesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales;
	public JLabel jLabelfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales;
	public JButton jButtonfecha_emision_hastaBusquedaDiariosGeneralesDiariosGeneralesBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=660;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DiariosGeneralesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DiariosGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiariosGeneralesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DiariosGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiariosGeneralesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DiariosGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiariosGeneralesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DiariosGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDiariosGenerales)	{
		this.jButtonRecargarInformacionDiariosGenerales = jButtonRecargarInformacionDiariosGenerales;
	}
	
	public JButton getjButtonProcesarInformacionDiariosGenerales() {
		return this.jButtonProcesarInformacionDiariosGenerales;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDiariosGenerales)	{
		this.jButtonProcesarInformacionDiariosGenerales = jButtonProcesarInformacionDiariosGenerales;
	}
	
	
	public JButton getjButtonRecargarInformacionDiariosGenerales() {
		return this.jButtonRecargarInformacionDiariosGenerales;
	}
	
	
	public List<DiariosGenerales> getdiariosgeneraless() {
		return this.diariosgeneraless;
	}

	public void setdiariosgeneraless(List<DiariosGenerales> diariosgeneraless) {
		this.diariosgeneraless = diariosgeneraless;
	}
	
	public List<DiariosGenerales> getdiariosgeneralessAux() {
		return this.diariosgeneralessAux;
	}

	public void setdiariosgeneralessAux(List<DiariosGenerales> diariosgeneralessAux) {
		this.diariosgeneralessAux = diariosgeneralessAux;
	}
	
	public List<DiariosGenerales> getdiariosgeneralessEliminados() {
		return this.diariosgeneralessEliminados;
	}

	public void setDiariosGeneralessEliminados(List<DiariosGenerales> diariosgeneralessEliminados) {
		this.diariosgeneralessEliminados = diariosgeneralessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDiariosGenerales() {
		return jComboBoxTiposSeleccionarDiariosGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDiariosGenerales(
			JComboBox jComboBoxTiposSeleccionarDiariosGenerales) {
		this.jComboBoxTiposSeleccionarDiariosGenerales = jComboBoxTiposSeleccionarDiariosGenerales;
	}
	
	public void setBorderResaltarTiposSeleccionarDiariosGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDiariosGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDiariosGenerales .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDiariosGenerales() {
		return jTextFieldValorCampoGeneralDiariosGenerales;
	}

	public void setjTextFieldValorCampoGeneralDiariosGenerales(
			JTextField jTextFieldValorCampoGeneralDiariosGenerales) {
		this.jTextFieldValorCampoGeneralDiariosGenerales = jTextFieldValorCampoGeneralDiariosGenerales;
	}

	public void setBorderResaltarValorCampoGeneralDiariosGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiariosGenerales.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDiariosGenerales .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDiariosGenerales() {
		return this.jCheckBoxSeleccionarTodosDiariosGenerales;
	}

	public void setjCheckBoxSeleccionarTodosDiariosGenerales(
			JCheckBox jCheckBoxSeleccionarTodosDiariosGenerales) {
		this.jCheckBoxSeleccionarTodosDiariosGenerales = jCheckBoxSeleccionarTodosDiariosGenerales;
	}

	public void setBorderResaltarSeleccionarTodosDiariosGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiariosGenerales.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDiariosGenerales .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDiariosGenerales() {
		return this.jCheckBoxSeleccionadosDiariosGenerales;
	}

	public void setjCheckBoxSeleccionadosDiariosGenerales(
			JCheckBox jCheckBoxSeleccionadosDiariosGenerales) {
		this.jCheckBoxSeleccionadosDiariosGenerales = jCheckBoxSeleccionadosDiariosGenerales;
	}
	
	public void setBorderResaltarSeleccionadosDiariosGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiariosGenerales.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDiariosGenerales .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDiariosGenerales() {
		return this.jComboBoxTiposArchivosReportesDiariosGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDiariosGenerales(
			JComboBox jComboBoxTiposArchivosReportesDiariosGenerales) {
		this.jComboBoxTiposArchivosReportesDiariosGenerales = jComboBoxTiposArchivosReportesDiariosGenerales;
	}

	public void setBorderResaltarTiposArchivosReportesDiariosGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiariosGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDiariosGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDiariosGenerales() {
		return this.jComboBoxTiposReportesDiariosGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDiariosGenerales(
			JComboBox jComboBoxTiposReportesDiariosGenerales) {
		this.jComboBoxTiposReportesDiariosGenerales = jComboBoxTiposReportesDiariosGenerales;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDiariosGenerales() {
	//	return jComboBoxTiposReportesDinamicoDiariosGenerales;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDiariosGenerales(
	//		JComboBox jComboBoxTiposReportesDinamicoDiariosGenerales) {
	//	this.jComboBoxTiposReportesDinamicoDiariosGenerales = jComboBoxTiposReportesDinamicoDiariosGenerales;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDiariosGenerales() {
	//	return jComboBoxTiposArchivosReportesDinamicoDiariosGenerales;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDiariosGenerales(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDiariosGenerales) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDiariosGenerales = jComboBoxTiposArchivosReportesDinamicoDiariosGenerales;
	//}
	
	public void setBorderResaltarTiposReportesDiariosGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiariosGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDiariosGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDiariosGenerales() {
		return this.jComboBoxTiposGraficosReportesDiariosGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDiariosGenerales(
			JComboBox jComboBoxTiposGraficosReportesDiariosGenerales) {
		this.jComboBoxTiposGraficosReportesDiariosGenerales = jComboBoxTiposGraficosReportesDiariosGenerales;
	}
	
	public void setBorderResaltarTiposGraficosReportesDiariosGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiariosGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDiariosGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDiariosGenerales() {
		return this.jComboBoxTiposPaginacionDiariosGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDiariosGenerales(
			JComboBox jComboBoxTiposPaginacionDiariosGenerales) {
		this.jComboBoxTiposPaginacionDiariosGenerales = jComboBoxTiposPaginacionDiariosGenerales;
	}
	
	public void setBorderResaltarTiposPaginacionDiariosGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiariosGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDiariosGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDiariosGenerales() {
		return this.jComboBoxTiposRelacionesDiariosGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDiariosGenerales() {
		return this.jComboBoxTiposAccionesDiariosGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDiariosGenerales(
			JComboBox jComboBoxTiposRelacionesDiariosGenerales) {
		this.jComboBoxTiposRelacionesDiariosGenerales = jComboBoxTiposRelacionesDiariosGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDiariosGenerales(
			JComboBox jComboBoxTiposAccionesDiariosGenerales) {
		this.jComboBoxTiposAccionesDiariosGenerales = jComboBoxTiposAccionesDiariosGenerales;
	}
	
	public void setBorderResaltarTiposRelacionesDiariosGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiariosGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDiariosGenerales .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDiariosGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiariosGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDiariosGenerales .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDiariosGenerales() {
	//	return jCheckBoxConGraficoDinamicoDiariosGenerales;
	//}

	//public void setjCheckBoxConGraficoDinamicoDiariosGenerales(
	//		JCheckBox jCheckBoxConGraficoDinamicoDiariosGenerales) {
	//	this.jCheckBoxConGraficoDinamicoDiariosGenerales = jCheckBoxConGraficoDinamicoDiariosGenerales;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDiariosGenerales() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDiariosGenerales.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDiariosGenerales .setBorder(borderResaltar);		
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
		this.diariosgeneralesSessionBean=new DiariosGeneralesSessionBean();
		
		this.diariosgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.diariosgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.diariosgeneralesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DiariosGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DiariosGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DiariosGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DiariosGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DiariosGeneralesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Diarios Generales MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
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
		
		DiariosGeneralesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DiariosGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDiariosGenerales= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDiariosGenerales,this.jTtoolBarDiariosGenerales,
							"nuevo","nuevo","Nuevo"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDiariosGenerales,this.jTtoolBarDiariosGenerales,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDiariosGenerales,this.jTtoolBarDiariosGenerales,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDiariosGenerales,this.jTtoolBarDiariosGenerales,
							"duplicar","duplicar","Duplicar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDiariosGenerales,this.jTtoolBarDiariosGenerales,
							"copiar","copiar","Copiar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDiariosGenerales,this.jTtoolBarDiariosGenerales,
							"ver_form","ver_form","Ver"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDiariosGenerales,this.jTtoolBarDiariosGenerales,
							"recargar","recargar","Buscar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDiariosGenerales,this.jTtoolBarDiariosGenerales,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDiariosGenerales,this.jTtoolBarDiariosGenerales,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDiariosGenerales,this.jTtoolBarDiariosGenerales,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDiariosGenerales,this.jTtoolBarDiariosGenerales,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDiariosGenerales,this.jTtoolBarDiariosGenerales,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDiariosGenerales,this.jTtoolBarDiariosGenerales,
							"cerrar","cerrar","Salir"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDiariosGenerales=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDiariosGenerales;
			
				this.jButtonProcesarInformacionToolBarDiariosGenerales=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDiariosGenerales;
				
		//protected JButton jButtonModificarToolBarDiariosGenerales;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDiariosGenerales=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDiariosGenerales=new JMenuMe("General");
		this.jmenuArchivoDiariosGenerales=new JMenuMe("Archivo");
		this.jmenuAccionesDiariosGenerales=new JMenuMe("Acciones");
		this.jmenuDatosDiariosGenerales=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDiariosGenerales= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDiariosGenerales.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDiariosGenerales,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDiariosGenerales= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDiariosGenerales.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDiariosGenerales,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDiariosGenerales= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDiariosGenerales.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDiariosGenerales,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDiariosGenerales= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDiariosGenerales.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDiariosGenerales,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDiariosGenerales= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDiariosGenerales.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDiariosGenerales,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDiariosGenerales= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDiariosGenerales.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDiariosGenerales,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDiariosGenerales= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDiariosGenerales.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDiariosGenerales,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDiariosGenerales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDiariosGenerales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDiariosGenerales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDiariosGenerales= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDiariosGenerales.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDiariosGenerales,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDiariosGenerales= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDiariosGenerales.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDiariosGenerales,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDiariosGenerales= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDiariosGenerales.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDiariosGenerales,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDiariosGenerales= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDiariosGenerales.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDiariosGenerales,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDiariosGenerales= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDiariosGenerales.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDiariosGenerales,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDiariosGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDiariosGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDiariosGenerales,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDiariosGenerales= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDiariosGenerales.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDiariosGenerales,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDiariosGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDiariosGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDiariosGenerales,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDiariosGenerales= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDiariosGenerales.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDiariosGenerales,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDiariosGenerales.add(this.jMenuItemCerrarDiariosGenerales);
			
			this.jmenuAccionesDiariosGenerales.add(this.jMenuItemNuevoDiariosGenerales);
			this.jmenuAccionesDiariosGenerales.add(this.jMenuItemNuevoGuardarCambiosDiariosGenerales);
			this.jmenuAccionesDiariosGenerales.add(this.jMenuItemNuevoRelacionesDiariosGenerales);
			this.jmenuAccionesDiariosGenerales.add(this.jMenuItemGuardarCambiosTablaDiariosGenerales);		
			this.jmenuAccionesDiariosGenerales.add(this.jMenuItemDuplicarDiariosGenerales);		
			this.jmenuAccionesDiariosGenerales.add(this.jMenuItemCopiarDiariosGenerales);		
			this.jmenuAccionesDiariosGenerales.add(this.jMenuItemVerFormDiariosGenerales);		
			
			this.jmenuDatosDiariosGenerales.add(this.jMenuItemRecargarInformacionDiariosGenerales);				
			this.jmenuDatosDiariosGenerales.add(this.jMenuItemAnterioresDiariosGenerales);				
			this.jmenuDatosDiariosGenerales.add(this.jMenuItemSiguientesDiariosGenerales);				
			this.jmenuDatosDiariosGenerales.add(this.jMenuItemAbrirOrderByDiariosGenerales);				
			this.jmenuDatosDiariosGenerales.add(this.jMenuItemMostrarOcultarDiariosGenerales);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDiariosGenerales.add(this.jMenuItemGuardarCambiosDiariosGenerales);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDiariosGenerales.add(this.jmenuArchivoDiariosGenerales);		
			this.jmenuBarDiariosGenerales.add(this.jmenuAccionesDiariosGenerales);		
			this.jmenuBarDiariosGenerales.add(this.jmenuDatosDiariosGenerales);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDiariosGenerales);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDiariosGenerales() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaDiariosGeneralesDiariosGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaDiariosGeneralesDiariosGenerales.setToolTipText("Buscar Por Ejercicio Por Tipo Movimiento Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaDiariosGeneralesDiariosGenerales= new JButtonMe();
		this.jButtonBusquedaDiariosGeneralesDiariosGenerales.setText("Buscar");
		this.jButtonBusquedaDiariosGeneralesDiariosGenerales.setToolTipText("Buscar Por Ejercicio Por Tipo Movimiento Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaDiariosGeneralesDiariosGenerales,"buscar_button","Buscar Por Ejercicio Por Tipo Movimiento Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaDiariosGeneralesDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaDiariosGeneralesDiariosGenerales = new JLabelMe();
		jLabelid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaDiariosGeneralesDiariosGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales = new JLabelMe();
		jLabelid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.setText("Tipo Movimiento :");
		jLabelid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.setToolTipText("Tipo Movimiento");
		jLabelid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales= new JComboBoxMe();
		jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasDiariosGenerales=new JTabbedPane();


		this.jTabbedPaneBusquedasDiariosGenerales.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasDiariosGenerales.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasDiariosGenerales.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDiariosGenerales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDiariosGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDiariosGenerales = new DiariosGeneralesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Diarios Generales DATOS");
			this.jInternalFrameDetalleFormDiariosGenerales = new DiariosGeneralesDetalleFormJInternalFrame(jDesktopPane,this.diariosgeneralesSessionBean.getConGuardarRelaciones(),this.diariosgeneralesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDiariosGenerales = null;//new DiariosGeneralesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDiariosGenerales= new GridBagLayout();
		
		
		this.jTableDatosDiariosGenerales = new JTableMe();      
		
		String sToolTipDiariosGenerales="";
		sToolTipDiariosGenerales=DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDiariosGenerales+="(Contabilidad.DiariosGenerales)";
		}
		
		if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
			sToolTipDiariosGenerales+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDiariosGenerales.setToolTipText(sToolTipDiariosGenerales);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDiariosGenerales);
		this.jTableDatosDiariosGenerales.setAutoCreateRowSorter(true);
		this.jTableDatosDiariosGenerales.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDiariosGenerales.setRowSelectionAllowed(true);
		this.jTableDatosDiariosGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDiariosGenerales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDiariosGenerales = new JButtonMe();
		this.jButtonDuplicarDiariosGenerales = new JButtonMe();
		this.jButtonCopiarDiariosGenerales = new JButtonMe();
		this.jButtonVerFormDiariosGenerales = new JButtonMe();
		this.jButtonNuevoRelacionesDiariosGenerales = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDiariosGenerales = new JButtonMe();
		this.jButtonCerrarDiariosGenerales = new JButtonMe();
		
		this.jScrollPanelDatosDiariosGenerales = new JScrollPane();   
        this.jScrollPanelDatosGeneralDiariosGenerales = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDiariosGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Diarios Generales";
		
		if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diarios Generaleses" + this.sPath));
		} else {
			this.jScrollPanelDatosDiariosGenerales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDiariosGenerales.setToolTipText("Acciones");
        this.jPanelAccionesDiariosGenerales.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDiariosGenerales=new ReporteDinamicoJInternalFrame(DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDiariosGenerales();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDiariosGenerales=new ImportacionJInternalFrame(DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDiariosGenerales();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDiariosGenerales = new JButtonMe();
		
		this.jButtonAbrirOrderByDiariosGenerales.setText("Orden");
		this.jButtonAbrirOrderByDiariosGenerales.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDiariosGenerales,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDiariosGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDiariosGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDiariosGenerales,false,this);
			
			//this.cargarOrderByDiariosGenerales(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDiariosGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDiariosGenerales,true,this);
			
			//this.cargarOrderByDiariosGenerales(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDiariosGenerales.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosDiariosGenerales.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosDiariosGenerales.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosDiariosGenerales.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDiariosGenerales.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDiariosGenerales.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDiariosGenerales.setText("Nuevo");
		this.jButtonDuplicarDiariosGenerales.setText("Duplicar");
		this.jButtonCopiarDiariosGenerales.setText("Copiar");
		this.jButtonVerFormDiariosGenerales.setText("Ver");
		this.jButtonNuevoRelacionesDiariosGenerales.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDiariosGenerales.setText("Guardar");
		this.jButtonCerrarDiariosGenerales.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDiariosGenerales,"nuevo_button","Nuevo",this.diariosgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDiariosGenerales,"duplicar_button","Duplicar",this.diariosgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDiariosGenerales,"copiar_button","Copiar",this.diariosgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDiariosGenerales,"ver_form","Ver",this.diariosgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDiariosGenerales,"nuevorelaciones_button","Nuevo Rel",this.diariosgeneralesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDiariosGenerales,"guardarcambiostabla_button","Guardar",this.diariosgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDiariosGenerales,"cerrar_button","Salir",this.diariosgeneralesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDiariosGenerales.setToolTipText("Nuevo"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDiariosGenerales.setToolTipText("Duplicar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDiariosGenerales.setToolTipText("Copiar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDiariosGenerales.setToolTipText("Ver"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDiariosGenerales.setToolTipText("Nuevo Rel"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDiariosGenerales.setToolTipText("Guardar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDiariosGenerales.setToolTipText("Salir"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDiariosGenerales";
		inputMap = this.jButtonNuevoDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDiariosGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDiariosGenerales"));
		
		//DUPLICAR
		sMapKey = "DuplicarDiariosGenerales";
		inputMap = this.jButtonDuplicarDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDiariosGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDiariosGenerales"));
		
		//COPIAR
		sMapKey = "CopiarDiariosGenerales";
		inputMap = this.jButtonCopiarDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDiariosGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDiariosGenerales"));
		
		//VEr FORM
		sMapKey = "VerFormDiariosGenerales";
		inputMap = this.jButtonVerFormDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDiariosGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDiariosGenerales"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDiariosGenerales";
		inputMap = this.jButtonNuevoRelacionesDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDiariosGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDiariosGenerales"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDiariosGenerales";
		inputMap = this.jButtonModificarDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDiariosGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDiariosGenerales"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDiariosGenerales";
		inputMap = this.jButtonCerrarDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDiariosGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDiariosGenerales"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDiariosGenerales";
		inputMap = this.jButtonGuardarCambiosTablaDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDiariosGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDiariosGenerales"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDiariosGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDiariosGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDiariosGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DiariosGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DiariosGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DiariosGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DiariosGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DiariosGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDiariosGenerales.setName("jPanelParametrosReportesDiariosGenerales"); 
		
		this.jPanelParametrosReportesAccionesDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDiariosGenerales.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDiariosGenerales.setName("jPanelParametrosReportesAccionesDiariosGenerales"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDiariosGenerales = new JButtonMe();
		this.jButtonRecargarInformacionDiariosGenerales.setText("Buscar");
		this.jButtonRecargarInformacionDiariosGenerales.setToolTipText("Buscar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDiariosGenerales,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionDiariosGenerales.setVisible(false);
		
		
		this.jButtonProcesarInformacionDiariosGenerales = new JButtonMe();
		this.jButtonProcesarInformacionDiariosGenerales.setText("Procesar");
		this.jButtonProcesarInformacionDiariosGenerales.setToolTipText("Procesar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDiariosGenerales.setVisible(false);
			
		this.jButtonProcesarInformacionDiariosGenerales.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDiariosGenerales.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDiariosGenerales.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDiariosGenerales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDiariosGenerales.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDiariosGenerales.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDiariosGenerales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDiariosGenerales.setText("TIPO");       
		this.jComboBoxTiposReportesDiariosGenerales.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDiariosGenerales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDiariosGenerales.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDiariosGenerales.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDiariosGenerales = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDiariosGenerales.setText("Paginacion");
		this.jComboBoxTiposPaginacionDiariosGenerales.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDiariosGenerales = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDiariosGenerales.setText("Accion");
		this.jComboBoxTiposRelacionesDiariosGenerales.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDiariosGenerales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDiariosGenerales.setText("Accion");
		this.jComboBoxTiposAccionesDiariosGenerales.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDiariosGenerales = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDiariosGenerales.setText("Accion");
		this.jComboBoxTiposSeleccionarDiariosGenerales.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDiariosGenerales=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDiariosGenerales.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDiariosGenerales.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDiariosGenerales.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDiariosGenerales = new JLabelMe();
		
		this.jLabelAccionesDiariosGenerales.setText("Acciones");		
		this.jLabelAccionesDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDiariosGenerales = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDiariosGenerales.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDiariosGenerales.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDiariosGenerales = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDiariosGenerales.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDiariosGenerales.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDiariosGenerales = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDiariosGenerales.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDiariosGenerales.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDiariosGenerales = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDiariosGenerales.setText("Graf.");
		this.jCheckBoxConGraficoReporteDiariosGenerales.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDiariosGenerales = new JButtonMe();
		//this.jButtonAnterioresDiariosGenerales.setText("<<");
        this.jButtonAnterioresDiariosGenerales.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDiariosGenerales,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDiariosGenerales = new JButtonMe();
		//this.jButtonSiguientesDiariosGenerales.setText(">>");
        this.jButtonSiguientesDiariosGenerales.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDiariosGenerales,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDiariosGenerales = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDiariosGenerales.setText("Nue");
        this.jButtonNuevoGuardarCambiosDiariosGenerales.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDiariosGenerales,"nuevoguardarcambios_button","Nue",this.diariosgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDiariosGenerales";
		inputMap = this.jButtonNuevoGuardarCambiosDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDiariosGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDiariosGenerales"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDiariosGenerales";
		inputMap = this.jButtonRecargarInformacionDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDiariosGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDiariosGenerales"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDiariosGenerales";
		inputMap = this.jButtonSiguientesDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDiariosGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDiariosGenerales"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDiariosGenerales";
		inputMap = this.jButtonAnterioresDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDiariosGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDiariosGenerales"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDiariosGenerales();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDiariosGenerales.setMinimumSize(new Dimension(this.getWidth(),DiariosGeneralesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DiariosGeneralesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDiariosGenerales.setMaximumSize(new Dimension(this.getWidth(),DiariosGeneralesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DiariosGeneralesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDiariosGenerales.setPreferredSize(new Dimension(this.getWidth(),DiariosGeneralesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DiariosGeneralesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDiariosGenerales = new GridBagLayout();

			this.jPanelPaginacionDiariosGenerales.setLayout(gridaBagLayoutPaginacionDiariosGenerales);						
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy = 0;
			this.gridBagConstraintsDiariosGenerales.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDiariosGenerales.add(this.jButtonAnterioresDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
					
						
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDiariosGenerales.gridy = 0;
			
			this.jPanelPaginacionDiariosGenerales.add(this.jButtonNuevoGuardarCambiosDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
						
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDiariosGenerales.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDiariosGenerales.gridy = 0;
			this.jPanelPaginacionDiariosGenerales.add(this.jButtonSiguientesDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy = 1;
			this.gridBagConstraintsDiariosGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDiariosGenerales.add(this.jButtonNuevoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
						
			
			
			if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
				this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDiariosGenerales.gridy = 1;
				this.gridBagConstraintsDiariosGenerales.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDiariosGenerales.add(this.jButtonGuardarCambiosTablaDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
			}
			
			
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy = 1;
			this.gridBagConstraintsDiariosGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDiariosGenerales.add(this.jButtonDuplicarDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy = 1;
			this.gridBagConstraintsDiariosGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDiariosGenerales.add(this.jButtonCopiarDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy = 1;
			this.gridBagConstraintsDiariosGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDiariosGenerales.add(this.jButtonVerFormDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy = 1;
			this.gridBagConstraintsDiariosGenerales.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDiariosGenerales.add(this.jButtonCerrarDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
		
		
		this.jButtonRecargarInformacionDiariosGenerales.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDiariosGenerales.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDiariosGenerales.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDiariosGenerales.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDiariosGenerales.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDiariosGenerales.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDiariosGenerales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDiariosGenerales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDiariosGenerales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDiariosGenerales.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDiariosGenerales.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDiariosGenerales.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDiariosGenerales.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDiariosGenerales.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDiariosGenerales.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDiariosGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDiariosGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDiariosGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDiariosGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDiariosGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDiariosGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDiariosGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDiariosGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDiariosGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDiariosGenerales.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDiariosGenerales.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDiariosGenerales.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDiariosGenerales.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDiariosGenerales.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDiariosGenerales.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDiariosGenerales.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDiariosGenerales.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDiariosGenerales.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDiariosGenerales.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDiariosGenerales.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDiariosGenerales.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDiariosGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDiariosGenerales = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DiariosGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DiariosGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DiariosGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DiariosGenerales = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDiariosGenerales.setLayout(gridaBagParametrosReportesDiariosGenerales);
			this.jPanelParametrosReportesAccionesDiariosGenerales.setLayout(gridaBagParametrosReportesAccionesDiariosGenerales);
			
			
			this.jPanelParametrosAuxiliar1DiariosGenerales.setLayout(gridaBagParametrosAuxiliar1DiariosGenerales);
			this.jPanelParametrosAuxiliar2DiariosGenerales.setLayout(gridaBagParametrosAuxiliar2DiariosGenerales);
			this.jPanelParametrosAuxiliar3DiariosGenerales.setLayout(gridaBagParametrosAuxiliar3DiariosGenerales);
			this.jPanelParametrosAuxiliar4DiariosGenerales.setLayout(gridaBagParametrosAuxiliar4DiariosGenerales);
			//this.jPanelParametrosAuxiliar5DiariosGenerales.setLayout(gridaBagParametrosAuxiliar2DiariosGenerales);			
			
			
			
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDiariosGenerales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDiariosGenerales.add(this.jButtonRecargarInformacionDiariosGenerales, this.gridBagConstraintsDiariosGenerales);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDiariosGenerales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DiariosGenerales.add(this.jComboBoxTiposPaginacionDiariosGenerales, this.gridBagConstraintsDiariosGenerales);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDiariosGenerales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DiariosGenerales.add(this.jCheckBoxConAltoMaximoTablaDiariosGenerales, this.gridBagConstraintsDiariosGenerales);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDiariosGenerales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DiariosGenerales.add(this.jComboBoxTiposArchivosReportesDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiariosGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiariosGenerales.add(this.jPanelParametrosAuxiliar1DiariosGenerales, this.gridBagConstraintsDiariosGenerales);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiariosGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DiariosGenerales.add(this.jComboBoxTiposReportesDiariosGenerales, this.gridBagConstraintsDiariosGenerales);																		
			
			
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiariosGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DiariosGenerales.add(this.jComboBoxTiposGraficosReportesDiariosGenerales, this.gridBagConstraintsDiariosGenerales);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiariosGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiariosGenerales.add(this.jPanelParametrosAuxiliar4DiariosGenerales, this.gridBagConstraintsDiariosGenerales);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDiariosGenerales.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiariosGenerales.add(this.jComboBoxTiposReportesDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiariosGenerales.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDiariosGenerales.add(this.jCheckBoxGenerarReporteDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiariosGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiariosGenerales.add(this.jPanelParametrosAuxiliar2DiariosGenerales, this.gridBagConstraintsDiariosGenerales);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDiariosGenerales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDiariosGenerales.add(this.jLabelAccionesDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
				this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDiariosGenerales.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDiariosGenerales.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDiariosGenerales.add(this.jButtonAbrirOrderByDiariosGenerales, this.gridBagConstraintsDiariosGenerales);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiariosGenerales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDiariosGenerales.add(this.jComboBoxTiposSeleccionarDiariosGenerales, this.gridBagConstraintsDiariosGenerales);			
			
			
			/*
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDiariosGenerales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDiariosGenerales.add(this.jCheckBoxSeleccionarTodosDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDiariosGenerales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDiariosGenerales.add(this.jCheckBoxConGraficoReporteDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiariosGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DiariosGenerales.add(this.jCheckBoxSeleccionarTodosDiariosGenerales, this.gridBagConstraintsDiariosGenerales);															
				
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiariosGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DiariosGenerales.add(this.jCheckBoxSeleccionadosDiariosGenerales, this.gridBagConstraintsDiariosGenerales);															
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiariosGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DiariosGenerales.add(this.jCheckBoxConGraficoReporteDiariosGenerales, this.gridBagConstraintsDiariosGenerales);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiariosGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiariosGenerales.add(this.jPanelParametrosAuxiliar3DiariosGenerales, this.gridBagConstraintsDiariosGenerales);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiariosGenerales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDiariosGenerales.add(this.jComboBoxTiposAccionesDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDiariosGenerales = new GridBagLayout();

			this.jScrollPanelDatosDiariosGenerales.setLayout(gridaBagLayoutDatosDiariosGenerales);
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy = 0;
			this.gridBagConstraintsDiariosGenerales.gridx = 0;
			
			this.jScrollPanelDatosDiariosGenerales.add(this.jTableDatosDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDiariosGenerales.setViewportView(this.jTableDatosDiariosGenerales);
		this.jTableDatosDiariosGenerales.setFillsViewportHeight(true);
		this.jTableDatosDiariosGenerales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDiariosGenerales= new GridBagLayout();
		this.jPanelAccionesDiariosGenerales.setLayout(gridaBagLayoutAccionesDiariosGenerales);
		
		
		/*	
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 0;
			
		this.jPanelAccionesDiariosGenerales.add(this.jButtonNuevoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaDiariosGeneralesDiariosGenerales= new GridBagLayout();
		gridaBagLayoutBusquedaDiariosGeneralesDiariosGenerales.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaDiariosGeneralesDiariosGenerales.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaDiariosGeneralesDiariosGenerales.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaDiariosGeneralesDiariosGenerales.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaDiariosGeneralesDiariosGenerales.setLayout(gridaBagLayoutBusquedaDiariosGeneralesDiariosGenerales);

		gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiariosGenerales.gridy = 0;
		gridBagConstraintsDiariosGenerales.gridx = 0;
		jPanelBusquedaDiariosGeneralesDiariosGenerales.add(jLabelid_ejercicioBusquedaDiariosGeneralesDiariosGenerales, gridBagConstraintsDiariosGenerales);

		gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiariosGenerales.gridy = 0;
		gridBagConstraintsDiariosGenerales.gridx = 1;
		jPanelBusquedaDiariosGeneralesDiariosGenerales.add(jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales, gridBagConstraintsDiariosGenerales);


		gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiariosGenerales.gridy = 1;
		gridBagConstraintsDiariosGenerales.gridx = 0;
		jPanelBusquedaDiariosGeneralesDiariosGenerales.add(jLabelid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales, gridBagConstraintsDiariosGenerales);

		gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiariosGenerales.gridy = 1;
		gridBagConstraintsDiariosGenerales.gridx = 1;
		jPanelBusquedaDiariosGeneralesDiariosGenerales.add(jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales, gridBagConstraintsDiariosGenerales);


		gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiariosGenerales.gridy = 2;
		gridBagConstraintsDiariosGenerales.gridx = 0;
		jPanelBusquedaDiariosGeneralesDiariosGenerales.add(jLabelfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales, gridBagConstraintsDiariosGenerales);

		gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiariosGenerales.gridy = 2;
		gridBagConstraintsDiariosGenerales.gridx = 1;
		jPanelBusquedaDiariosGeneralesDiariosGenerales.add(jDateChooserfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales, gridBagConstraintsDiariosGenerales);


		gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiariosGenerales.gridy = 3;
		gridBagConstraintsDiariosGenerales.gridx = 0;
		jPanelBusquedaDiariosGeneralesDiariosGenerales.add(jLabelfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales, gridBagConstraintsDiariosGenerales);

		gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiariosGenerales.gridy = 3;
		gridBagConstraintsDiariosGenerales.gridx = 1;
		jPanelBusquedaDiariosGeneralesDiariosGenerales.add(jDateChooserfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales, gridBagConstraintsDiariosGenerales);

		gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiariosGenerales.gridy = 4;
		gridBagConstraintsDiariosGenerales.gridx =1;
		jPanelBusquedaDiariosGeneralesDiariosGenerales.add(jButtonBusquedaDiariosGeneralesDiariosGenerales, gridBagConstraintsDiariosGenerales);

		jTabbedPaneBusquedasDiariosGenerales.addTab("1.-Por Ejercicio Por Tipo Movimiento Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaDiariosGeneralesDiariosGenerales);
		jTabbedPaneBusquedasDiariosGenerales.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDiariosGenerales = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDiariosGenerales);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();						
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDiariosGenerales.gridx = 0;		
			//this.gridBagConstraintsDiariosGenerales.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDiariosGenerales.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDiariosGenerales, this.gridBagConstraintsDiariosGenerales);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDiariosGenerales.gridx = 0;		
		//this.gridBagConstraintsDiariosGenerales.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDiariosGenerales.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDiariosGenerales);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDiariosGenerales.gridx = 0;		
			this.gridBagConstraintsDiariosGenerales.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDiariosGenerales.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDiariosGenerales, this.gridBagConstraintsDiariosGenerales);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiariosGenerales.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDiariosGenerales, this.gridBagConstraintsDiariosGenerales);								
		
		
		/*
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiariosGenerales.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		*/		
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDiariosGenerales.gridx =0;
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDiariosGenerales.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
				
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiariosGenerales.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DiariosGeneralesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDiariosGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDiariosGenerales = new GridBagLayout();
			this.jPanelBusquedasParametrosDiariosGenerales.setLayout(gridaBagLayoutBusquedasParametrosDiariosGenerales);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDiariosGenerales=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDiariosGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDiariosGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDiariosGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiariosGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
			
			
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiariosGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
			
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDiariosGenerales.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDiariosGenerales;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDiariosGenerales() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDiariosGenerales = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDiariosGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDiariosGenerales.setName("jPanelReporteDinamicoDiariosGenerales"); 
		
		this.jPanelReporteDinamicoDiariosGenerales.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDiariosGenerales.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDiariosGenerales.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDiariosGenerales.setLayout(gridaBagLayoutReporteDinamicoDiariosGenerales);
		
		
		this.jInternalFrameReporteDinamicoDiariosGenerales= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDiariosGenerales = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDiariosGenerales= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDiariosGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDiariosGenerales.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDiariosGenerales.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDiariosGenerales.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDiariosGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDiariosGenerales.setResizable(true);
	    this.jInternalFrameReporteDinamicoDiariosGenerales.setClosable(true);
	    this.jInternalFrameReporteDinamicoDiariosGenerales.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDiariosGenerales.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDiariosGenerales.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDiariosGenerales.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diarios Generaleses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDiariosGenerales = new JLabelMe();

		this.jLabelColumnasSelectReporteDiariosGenerales.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jLabelColumnasSelectReporteDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDiariosGenerales = new JList<Reporte>();
		this.jListColumnasSelectReporteDiariosGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDiariosGenerales.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDiariosGenerales.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDiariosGenerales.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDiariosGenerales.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDiariosGenerales=new JScrollPane(this.jListColumnasSelectReporteDiariosGenerales);
			
			this.jScrollColumnasSelectReporteDiariosGenerales.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDiariosGenerales.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDiariosGenerales.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDiariosGenerales.add(this.jListColumnasSelectReporteDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jScrollColumnasSelectReporteDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDiariosGenerales = new JLabelMe();

		this.jLabelRelacionesSelectReporteDiariosGenerales.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDiariosGenerales = new JList<Reporte>();
		this.jListRelacionesSelectReporteDiariosGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDiariosGenerales.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDiariosGenerales.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDiariosGenerales.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDiariosGenerales.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDiariosGenerales=new JScrollPane(this.jListRelacionesSelectReporteDiariosGenerales);
			
			this.jScrollRelacionesSelectReporteDiariosGenerales.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDiariosGenerales.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDiariosGenerales.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDiariosGenerales = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDiariosGenerales = new JComboBoxMe();
		this.jListColumnasValoresGraficoDiariosGenerales = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDiariosGenerales = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDiariosGenerales.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDiariosGenerales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDiariosGenerales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDiariosGenerales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDiariosGenerales = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDiariosGenerales.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDiariosGenerales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDiariosGenerales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDiariosGenerales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDiariosGenerales = new JLabelMe();

		this.jLabelConGraficoDinamicoDiariosGenerales.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jLabelConGraficoDinamicoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDiariosGenerales = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDiariosGenerales.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDiariosGenerales.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDiariosGenerales.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDiariosGenerales.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDiariosGenerales.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jCheckBoxConGraficoDinamicoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDiariosGenerales = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDiariosGenerales.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jLabelColumnaCategoriaGraficoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDiariosGenerales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDiariosGenerales.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDiariosGenerales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDiariosGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDiariosGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDiariosGenerales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jComboBoxColumnaCategoriaGraficoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDiariosGenerales = new JLabelMe();

		this.jLabelColumnaCategoriaValorDiariosGenerales.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jLabelColumnaCategoriaValorDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDiariosGenerales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDiariosGenerales.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDiariosGenerales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDiariosGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDiariosGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDiariosGenerales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jComboBoxColumnaCategoriaValorDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDiariosGenerales = new JLabelMe();

		this.jLabelColumnasValoresGraficoDiariosGenerales.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jLabelColumnasValoresGraficoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDiariosGenerales = new JList<Reporte>();
		this.jListColumnasValoresGraficoDiariosGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDiariosGenerales.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDiariosGenerales.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDiariosGenerales.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDiariosGenerales.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDiariosGenerales=new JScrollPane(this.jListColumnasValoresGraficoDiariosGenerales);
			
			this.jScrollColumnasValoresGraficoDiariosGenerales.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDiariosGenerales.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDiariosGenerales.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDiariosGenerales.add(this.jListColumnasSelectReporteDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jScrollColumnasValoresGraficoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDiariosGenerales = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDiariosGenerales.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jLabelTiposGraficosReportesDinamicoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDiariosGenerales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDiariosGenerales.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDiariosGenerales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDiariosGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDiariosGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDiariosGenerales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jComboBoxTiposGraficosReportesDinamicoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDiariosGenerales = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDiariosGenerales.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jLabelGenerarExcelReporteDinamicoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDiariosGenerales = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDiariosGenerales.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDiariosGenerales,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDiariosGenerales.setToolTipText("Generar EXCEL"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDiariosGenerales.add(this.jButtonGenerarExcelReporteDinamicoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jComboBoxTiposReportesDinamicoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDiariosGenerales = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDiariosGenerales.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jLabelTiposArchivoReporteDinamicoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jComboBoxTiposArchivosReportesDinamicoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDiariosGenerales = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDiariosGenerales.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDiariosGenerales,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDiariosGenerales.setToolTipText("Generar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jButtonGenerarReporteDinamicoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDiariosGenerales = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDiariosGenerales.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDiariosGenerales,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDiariosGenerales.setToolTipText("Cancelar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDiariosGenerales.add(this.jButtonCerrarReporteDinamicoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDiariosGenerales = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDiariosGenerales= new JScrollPane(jPanelReporteDinamicoDiariosGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDiariosGenerales.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDiariosGenerales.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDiariosGenerales.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diarios Generaleses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDiariosGenerales.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDiariosGenerales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDiariosGenerales.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDiariosGenerales);
		this.jInternalFrameReporteDinamicoDiariosGenerales.getContentPane().add(this.jScrollPanelReporteDinamicoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDiariosGenerales() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDiariosGenerales = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDiariosGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDiariosGenerales.setName("jPanelImportacionDiariosGenerales"); 
		
		this.jPanelImportacionDiariosGenerales.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDiariosGenerales.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDiariosGenerales.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDiariosGenerales.setLayout(gridaBagLayoutImportacionDiariosGenerales);
		
		
		this.jInternalFrameImportacionDiariosGenerales= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDiariosGenerales= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDiariosGenerales = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDiariosGenerales= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDiariosGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDiariosGenerales.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDiariosGenerales.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDiariosGenerales.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDiariosGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDiariosGenerales.setResizable(true);
	    this.jInternalFrameImportacionDiariosGenerales.setClosable(true);
	    this.jInternalFrameImportacionDiariosGenerales.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDiariosGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDiariosGenerales.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDiariosGenerales.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDiariosGenerales.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDiariosGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDiariosGenerales.setResizable(true);
	    this.jInternalFrameImportacionDiariosGenerales.setClosable(true);
	    this.jInternalFrameImportacionDiariosGenerales.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDiariosGenerales.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDiariosGenerales.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDiariosGenerales.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diarios Generaleses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDiariosGenerales = new JLabelMe();

		this.jLabelArchivoImportacionDiariosGenerales.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYImportacion;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDiariosGenerales.add(this.jLabelArchivoImportacionDiariosGenerales, this.gridBagConstraintsDiariosGenerales);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDiariosGenerales = new JFileChooser();		
		this.jFileChooserImportacionDiariosGenerales.setToolTipText("ESCOGER ARCHIVO"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDiariosGenerales = new JButtonMe();
		this.jButtonAbrirImportacionDiariosGenerales.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDiariosGenerales,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDiariosGenerales.setToolTipText("Generar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDiariosGenerales.add(this.jButtonAbrirImportacionDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDiariosGenerales = new JLabelMe();

		this.jLabelPathArchivoImportacionDiariosGenerales.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYImportacion;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDiariosGenerales.add(this.jLabelPathArchivoImportacionDiariosGenerales, this.gridBagConstraintsDiariosGenerales);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDiariosGenerales=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDiariosGenerales.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDiariosGenerales.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDiariosGenerales.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDiariosGenerales.add(this.jTextFieldPathArchivoImportacionDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDiariosGenerales = new JButtonMe();
		this.jButtonGenerarImportacionDiariosGenerales.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDiariosGenerales,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDiariosGenerales.setToolTipText("Generar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDiariosGenerales.add(this.jButtonGenerarImportacionDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDiariosGenerales = new JButtonMe();
		this.jButtonCerrarImportacionDiariosGenerales.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDiariosGenerales,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDiariosGenerales.setToolTipText("Cancelar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiariosGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDiariosGenerales.add(this.jButtonCerrarImportacionDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDiariosGenerales = new GridBagLayout();
		
		this.jScrollPanelImportacionDiariosGenerales= new JScrollPane(jPanelImportacionDiariosGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy =iPosYImportacion;
		this.gridBagConstraintsDiariosGenerales.gridx =iPosXImportacion;
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDiariosGenerales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDiariosGenerales.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDiariosGenerales);
		this.jInternalFrameImportacionDiariosGenerales.getContentPane().add(this.jScrollPanelImportacionDiariosGenerales, this.gridBagConstraintsDiariosGenerales);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDiariosGenerales(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDiariosGenerales = new JButtonMe();
			this.jButtonAbrirOrderByDiariosGenerales.setText("Orden");
			this.jButtonAbrirOrderByDiariosGenerales.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDiariosGenerales,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDiariosGenerales";
			inputMap = this.jButtonAbrirOrderByDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDiariosGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDiariosGenerales"));
		
		
			GridBagLayout gridaBagLayoutOrderByDiariosGenerales = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDiariosGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDiariosGenerales.setName("jPanelOrderByDiariosGenerales"); 
			
			this.jPanelOrderByDiariosGenerales.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDiariosGenerales.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDiariosGenerales.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDiariosGenerales.setLayout(gridaBagLayoutOrderByDiariosGenerales);
			
			
			this.jTableDatosDiariosGeneralesOrderBy = new JTableMe();        
			this.jTableDatosDiariosGeneralesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDiariosGeneralesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDiariosGeneralesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDiariosGeneralesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDiariosGeneralesOrderBy.setViewportView(this.jTableDatosDiariosGeneralesOrderBy);
			this.jTableDatosDiariosGeneralesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDiariosGeneralesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDiariosGenerales= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDiariosGenerales= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDiariosGenerales = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDiariosGenerales= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDiariosGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDiariosGenerales.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDiariosGenerales.setTitle("Orden");
			this.jInternalFrameOrderByDiariosGenerales.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDiariosGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDiariosGenerales.setResizable(true);
			this.jInternalFrameOrderByDiariosGenerales.setClosable(true);
			this.jInternalFrameOrderByDiariosGenerales.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDiariosGenerales.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDiariosGenerales.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDiariosGenerales.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diarios Generaleses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDiariosGenerales.gridx =iPosXOrderBy;
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDiariosGenerales.ipady =150;
				
			this.jPanelOrderByDiariosGenerales.add(jScrollPanelDatosDiariosGeneralesOrderBy, this.gridBagConstraintsDiariosGenerales);//this.jTableDatosDiariosGeneralesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDiariosGenerales = new JButtonMe();
			this.jButtonCerrarOrderByDiariosGenerales.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDiariosGenerales,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDiariosGenerales.setToolTipText("Cancelar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDiariosGenerales.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDiariosGenerales.add(this.jButtonCerrarOrderByDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDiariosGenerales = new GridBagLayout();
			
			this.jScrollPanelOrderByDiariosGenerales= new JScrollPane(jPanelOrderByDiariosGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.gridy =iPosYOrderBy;
			this.gridBagConstraintsDiariosGenerales.gridx =iPosXOrderBy;
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDiariosGenerales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDiariosGenerales.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDiariosGenerales);
			
			this.jInternalFrameOrderByDiariosGenerales.getContentPane().add(this.jScrollPanelOrderByDiariosGenerales, this.gridBagConstraintsDiariosGenerales);			
		
		} else {
			this.jButtonAbrirOrderByDiariosGenerales = new JButtonMe();
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
		//	&& this.diariosgeneralesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDiariosGenerales.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDiariosGenerales.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDiariosGenerales.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosDiariosGenerales.getRowHeight();//DiariosGeneralesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DiariosGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDiariosGenerales.isSelected()) {
					iHeightTable=DiariosGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DiariosGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DiariosGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DiariosGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDiariosGenerales.isSelected()) {
					iHeightTable=DiariosGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DiariosGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DiariosGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDiariosGenerales.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDiariosGenerales.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDiariosGenerales.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDiariosGenerales.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDiariosGenerales.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDiariosGenerales.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDiariosGenerales!=null && this.jInternalFrameOrderByDiariosGenerales.getjTableDatosOrderBy()!=null) {
			//if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDiariosGenerales.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDiariosGenerales.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDiariosGenerales.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDiariosGenerales.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDiariosGenerales.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDiariosGenerales.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDiariosGenerales.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDiariosGenerales.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDiariosGenerales.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDiariosGenerales.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=diariosgeneralesLogic.getDiariosGeneraless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=diariosgeneraless.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DiariosGenerales> TraerDiariosGeneralesBeans(List<DiariosGenerales> diariosgeneraless,ArrayList<Classe> classes)throws Exception {
		try {
			for(DiariosGenerales diariosgenerales:diariosgeneraless) {
					
				if(!(DiariosGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DiariosGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					diariosgenerales.setsDetalleGeneralEntityReporte(DiariosGeneralesConstantesFunciones.getDiariosGeneralesDescripcion(diariosgenerales));
										
						
					
						
					
				} else  {
							
					//diariosgenerales.setsDetalleGeneralEntityReporte(diariosgenerales.getsDetalleGeneralEntityReporte());
										
				}
				
				//diariosgeneralesbeans.add(diariosgeneralesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return diariosgeneraless;
    }
	//PARA REPORTES FIN
}
