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
import com.bydan.erp.contabilidad.util.report.ProcesoMayorizarDiarioConstantesFunciones;

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
public class ProcesoMayorizarDiarioJInternalFrame extends ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoMayorizarDiario;
	
	protected JMenuBar jmenuBarProcesoMayorizarDiario;
	
	protected JMenu jmenuProcesoMayorizarDiario;
	protected JMenu jmenuDatosProcesoMayorizarDiario;
	protected JMenu jmenuArchivoProcesoMayorizarDiario;
	protected JMenu jmenuAccionesProcesoMayorizarDiario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoMayorizarDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoMayorizarDiario;	
	protected GridBagConstraints gridBagConstraintsProcesoMayorizarDiario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoMayorizarDiarioDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoMayorizarDiario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoMayorizarDiario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoMayorizarDiario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public ProcesoMayorizarDiarioSessionBean procesomayorizardiarioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoMayorizarDiario> procesomayorizardiarios;		
	public List<ProcesoMayorizarDiario> procesomayorizardiariosEliminados;	
	public List<ProcesoMayorizarDiario> procesomayorizardiariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoMayorizarDiario;		
	protected JButton jButtonAbrirOrderByProcesoMayorizarDiario;
	
	
	//protected JPanel jPanelOrderByProcesoMayorizarDiario;
	//public JScrollPane jScrollPanelOrderByProcesoMayorizarDiario;	
	//protected JButton jButtonCerrarOrderByProcesoMayorizarDiario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoMayorizarDiarioLogic procesomayorizardiarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoMayorizarDiario;
	public JScrollPane jScrollPanelDatosEdicionProcesoMayorizarDiario;
	public JScrollPane jScrollPanelDatosGeneralProcesoMayorizarDiario;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoMayorizarDiarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoMayorizarDiario;
	//public JScrollPane jScrollPanelImportacionProcesoMayorizarDiario;
	
	
	
	protected JPanel jPanelAccionesProcesoMayorizarDiario;
	
    protected JPanel jPanelPaginacionProcesoMayorizarDiario;
    protected JPanel jPanelParametrosReportesProcesoMayorizarDiario;
	protected JPanel jPanelParametrosReportesAccionesProcesoMayorizarDiario;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoMayorizarDiario;
	protected JPanel jPanelParametrosAuxiliar2ProcesoMayorizarDiario;
	protected JPanel jPanelParametrosAuxiliar3ProcesoMayorizarDiario;
	protected JPanel jPanelParametrosAuxiliar4ProcesoMayorizarDiario;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoMayorizarDiario;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoMayorizarDiario;
	//protected JPanel jPanelImportacionProcesoMayorizarDiario;
	
	
	public JTable jTableDatosProcesoMayorizarDiario;
	
	
	
	//public JTable jTableDatosProcesoMayorizarDiarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoMayorizarDiario;
	protected JButton jButtonDuplicarProcesoMayorizarDiario;
	protected JButton jButtonCopiarProcesoMayorizarDiario;
	protected JButton jButtonVerFormProcesoMayorizarDiario;
	protected JButton jButtonNuevoRelacionesProcesoMayorizarDiario;
	protected JButton jButtonModificarProcesoMayorizarDiario;
	
    protected JButton jButtonGuardarCambiosTablaProcesoMayorizarDiario;
	protected JButton jButtonCerrarProcesoMayorizarDiario;
	
	
	protected JButton jButtonRecargarInformacionProcesoMayorizarDiario;
	protected JButton jButtonProcesarInformacionProcesoMayorizarDiario;
	
	
	protected JButton jButtonAnterioresProcesoMayorizarDiario;
	protected JButton jButtonSiguientesProcesoMayorizarDiario;
	protected JButton jButtonNuevoGuardarCambiosProcesoMayorizarDiario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoMayorizarDiario;
	//protected JButton jButtonCerrarReporteDinamicoProcesoMayorizarDiario;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoMayorizarDiario;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoMayorizarDiario;
	//protected JButton jButtonGenerarImportacionProcesoMayorizarDiario;
	//protected JButton jButtonCerrarImportacionProcesoMayorizarDiario;
	//protected JFileChooser jFileChooserImportacionProcesoMayorizarDiario;
	//protected File fileImportacionProcesoMayorizarDiario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoMayorizarDiario;
	protected JButton jButtonDuplicarToolBarProcesoMayorizarDiario;
	protected JButton jButtonNuevoRelacionesToolBarProcesoMayorizarDiario;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoMayorizarDiario;
	protected JButton jButtonCopiarToolBarProcesoMayorizarDiario;
	protected JButton jButtonVerFormToolBarProcesoMayorizarDiario;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoMayorizarDiario;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoMayorizarDiario;
	protected JButton jButtonCerrarToolBarProcesoMayorizarDiario;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoMayorizarDiario;
	protected JButton jButtonProcesarInformacionToolBarProcesoMayorizarDiario;
	protected JButton jButtonAnterioresToolBarProcesoMayorizarDiario;
	protected JButton jButtonSiguientesToolBarProcesoMayorizarDiario;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoMayorizarDiario;
	protected JButton jButtonAbrirOrderByToolBarProcesoMayorizarDiario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoMayorizarDiario;
	protected JMenuItem jMenuItemDuplicarProcesoMayorizarDiario;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoMayorizarDiario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoMayorizarDiario;
	protected JMenuItem jMenuItemCopiarProcesoMayorizarDiario;
	protected JMenuItem jMenuItemVerFormProcesoMayorizarDiario;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoMayorizarDiario;
	protected JMenuItem jMenuItemCerrarProcesoMayorizarDiario;
	protected JMenuItem jMenuItemDetalleCerrarProcesoMayorizarDiario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoMayorizarDiario;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoMayorizarDiario;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoMayorizarDiario;
	protected JMenuItem jMenuItemProcesarInformacionProcesoMayorizarDiario;
	protected JMenuItem jMenuItemAnterioresProcesoMayorizarDiario;
	protected JMenuItem jMenuItemSiguientesProcesoMayorizarDiario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoMayorizarDiario;
	protected JMenuItem jMenuItemAbrirOrderByProcesoMayorizarDiario;
	protected JMenuItem jMenuItemMostrarOcultarProcesoMayorizarDiario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoMayorizarDiario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoMayorizarDiario;
	protected JCheckBox jCheckBoxSeleccionadosProcesoMayorizarDiario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoMayorizarDiario;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoMayorizarDiario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoMayorizarDiario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoMayorizarDiario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoMayorizarDiario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoMayorizarDiario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoMayorizarDiario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoMayorizarDiario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoMayorizarDiario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoMayorizarDiario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoMayorizarDiario;
	protected JTextField jTextFieldValorCampoGeneralProcesoMayorizarDiario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoMayorizarDiario;
	//public JList<Reporte> jListColumnasSelectReporteProcesoMayorizarDiario;
	//public JScrollPane jScrollColumnasSelectReporteProcesoMayorizarDiario;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoMayorizarDiario;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoMayorizarDiario;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoMayorizarDiario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoMayorizarDiario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoMayorizarDiario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoMayorizarDiario;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoMayorizarDiario;
	
		
	//public JLabel jLabelArchivoImportacionProcesoMayorizarDiario;	
	//public JLabel jLabelPathArchivoImportacionProcesoMayorizarDiario;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoMayorizarDiario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoMayorizarDiario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoMayorizarDiario;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoMayorizarDiario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoMayorizarDiario;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoMayorizarDiario;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoMayorizarDiario;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoMayorizarDiario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoMayorizarDiario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoMayorizarDiario;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoMayorizarDiario;
	public JPanel jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario;
	public JButton jButtonBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario;
	
	public JPanel jPanelcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario;
	public JLabel jLabelcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario;
	public JTextField jTextFieldcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario;
	public JButton jButtoncodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario;
	public JLabel jLabelid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario;
	public JButton jButtonid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario= new JButtonMe();
	public JButton jButtonid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiarioBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario;
	public JLabel jLabelfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario;

	public JDateChooser jDateChooserfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario;
	public JButton jButtonfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiarioBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario;
	public JLabel jLabelfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario;
	//public JFormattedTextField jDateChooserfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario;

	public JDateChooser jDateChooserfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario;
	public JButton jButtonfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiarioBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoMayorizarDiarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoMayorizarDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoMayorizarDiarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoMayorizarDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoMayorizarDiarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoMayorizarDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoMayorizarDiarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoMayorizarDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoMayorizarDiario)	{
		this.jButtonRecargarInformacionProcesoMayorizarDiario = jButtonRecargarInformacionProcesoMayorizarDiario;
	}
	
	public JButton getjButtonProcesarInformacionProcesoMayorizarDiario() {
		return this.jButtonProcesarInformacionProcesoMayorizarDiario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoMayorizarDiario)	{
		this.jButtonProcesarInformacionProcesoMayorizarDiario = jButtonProcesarInformacionProcesoMayorizarDiario;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoMayorizarDiario() {
		return this.jButtonRecargarInformacionProcesoMayorizarDiario;
	}
	
	
	public List<ProcesoMayorizarDiario> getprocesomayorizardiarios() {
		return this.procesomayorizardiarios;
	}

	public void setprocesomayorizardiarios(List<ProcesoMayorizarDiario> procesomayorizardiarios) {
		this.procesomayorizardiarios = procesomayorizardiarios;
	}
	
	public List<ProcesoMayorizarDiario> getprocesomayorizardiariosAux() {
		return this.procesomayorizardiariosAux;
	}

	public void setprocesomayorizardiariosAux(List<ProcesoMayorizarDiario> procesomayorizardiariosAux) {
		this.procesomayorizardiariosAux = procesomayorizardiariosAux;
	}
	
	public List<ProcesoMayorizarDiario> getprocesomayorizardiariosEliminados() {
		return this.procesomayorizardiariosEliminados;
	}

	public void setProcesoMayorizarDiariosEliminados(List<ProcesoMayorizarDiario> procesomayorizardiariosEliminados) {
		this.procesomayorizardiariosEliminados = procesomayorizardiariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoMayorizarDiario() {
		return jComboBoxTiposSeleccionarProcesoMayorizarDiario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoMayorizarDiario(
			JComboBox jComboBoxTiposSeleccionarProcesoMayorizarDiario) {
		this.jComboBoxTiposSeleccionarProcesoMayorizarDiario = jComboBoxTiposSeleccionarProcesoMayorizarDiario;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoMayorizarDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoMayorizarDiario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoMayorizarDiario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoMayorizarDiario() {
		return jTextFieldValorCampoGeneralProcesoMayorizarDiario;
	}

	public void setjTextFieldValorCampoGeneralProcesoMayorizarDiario(
			JTextField jTextFieldValorCampoGeneralProcesoMayorizarDiario) {
		this.jTextFieldValorCampoGeneralProcesoMayorizarDiario = jTextFieldValorCampoGeneralProcesoMayorizarDiario;
	}

	public void setBorderResaltarValorCampoGeneralProcesoMayorizarDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoMayorizarDiario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoMayorizarDiario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoMayorizarDiario() {
		return this.jCheckBoxSeleccionarTodosProcesoMayorizarDiario;
	}

	public void setjCheckBoxSeleccionarTodosProcesoMayorizarDiario(
			JCheckBox jCheckBoxSeleccionarTodosProcesoMayorizarDiario) {
		this.jCheckBoxSeleccionarTodosProcesoMayorizarDiario = jCheckBoxSeleccionarTodosProcesoMayorizarDiario;
	}

	public void setBorderResaltarSeleccionarTodosProcesoMayorizarDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoMayorizarDiario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoMayorizarDiario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoMayorizarDiario() {
		return this.jCheckBoxSeleccionadosProcesoMayorizarDiario;
	}

	public void setjCheckBoxSeleccionadosProcesoMayorizarDiario(
			JCheckBox jCheckBoxSeleccionadosProcesoMayorizarDiario) {
		this.jCheckBoxSeleccionadosProcesoMayorizarDiario = jCheckBoxSeleccionadosProcesoMayorizarDiario;
	}
	
	public void setBorderResaltarSeleccionadosProcesoMayorizarDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoMayorizarDiario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoMayorizarDiario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoMayorizarDiario() {
		return this.jComboBoxTiposArchivosReportesProcesoMayorizarDiario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoMayorizarDiario(
			JComboBox jComboBoxTiposArchivosReportesProcesoMayorizarDiario) {
		this.jComboBoxTiposArchivosReportesProcesoMayorizarDiario = jComboBoxTiposArchivosReportesProcesoMayorizarDiario;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoMayorizarDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoMayorizarDiario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoMayorizarDiario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoMayorizarDiario() {
		return this.jComboBoxTiposReportesProcesoMayorizarDiario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoMayorizarDiario(
			JComboBox jComboBoxTiposReportesProcesoMayorizarDiario) {
		this.jComboBoxTiposReportesProcesoMayorizarDiario = jComboBoxTiposReportesProcesoMayorizarDiario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoMayorizarDiario() {
	//	return jComboBoxTiposReportesDinamicoProcesoMayorizarDiario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoMayorizarDiario(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoMayorizarDiario) {
	//	this.jComboBoxTiposReportesDinamicoProcesoMayorizarDiario = jComboBoxTiposReportesDinamicoProcesoMayorizarDiario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoMayorizarDiario() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoMayorizarDiario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoMayorizarDiario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoMayorizarDiario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoMayorizarDiario = jComboBoxTiposArchivosReportesDinamicoProcesoMayorizarDiario;
	//}
	
	public void setBorderResaltarTiposReportesProcesoMayorizarDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoMayorizarDiario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoMayorizarDiario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoMayorizarDiario() {
		return this.jComboBoxTiposGraficosReportesProcesoMayorizarDiario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoMayorizarDiario(
			JComboBox jComboBoxTiposGraficosReportesProcesoMayorizarDiario) {
		this.jComboBoxTiposGraficosReportesProcesoMayorizarDiario = jComboBoxTiposGraficosReportesProcesoMayorizarDiario;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoMayorizarDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoMayorizarDiario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoMayorizarDiario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoMayorizarDiario() {
		return this.jComboBoxTiposPaginacionProcesoMayorizarDiario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoMayorizarDiario(
			JComboBox jComboBoxTiposPaginacionProcesoMayorizarDiario) {
		this.jComboBoxTiposPaginacionProcesoMayorizarDiario = jComboBoxTiposPaginacionProcesoMayorizarDiario;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoMayorizarDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoMayorizarDiario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoMayorizarDiario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoMayorizarDiario() {
		return this.jComboBoxTiposRelacionesProcesoMayorizarDiario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoMayorizarDiario() {
		return this.jComboBoxTiposAccionesProcesoMayorizarDiario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoMayorizarDiario(
			JComboBox jComboBoxTiposRelacionesProcesoMayorizarDiario) {
		this.jComboBoxTiposRelacionesProcesoMayorizarDiario = jComboBoxTiposRelacionesProcesoMayorizarDiario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoMayorizarDiario(
			JComboBox jComboBoxTiposAccionesProcesoMayorizarDiario) {
		this.jComboBoxTiposAccionesProcesoMayorizarDiario = jComboBoxTiposAccionesProcesoMayorizarDiario;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoMayorizarDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoMayorizarDiario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoMayorizarDiario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoMayorizarDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoMayorizarDiario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoMayorizarDiario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoMayorizarDiario() {
	//	return jCheckBoxConGraficoDinamicoProcesoMayorizarDiario;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoMayorizarDiario(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoMayorizarDiario) {
	//	this.jCheckBoxConGraficoDinamicoProcesoMayorizarDiario = jCheckBoxConGraficoDinamicoProcesoMayorizarDiario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoMayorizarDiario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoMayorizarDiario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoMayorizarDiario .setBorder(borderResaltar);		
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
		this.procesomayorizardiarioSessionBean=new ProcesoMayorizarDiarioSessionBean();
		
		this.procesomayorizardiarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesomayorizardiarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoMayorizarDiarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoMayorizarDiarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoMayorizarDiarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoMayorizarDiarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoMayorizarDiarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Mayorizar Diario MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoMayorizarDiarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoMayorizarDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoMayorizarDiario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoMayorizarDiario,this.jTtoolBarProcesoMayorizarDiario,
							"nuevo","nuevo","Nuevo"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoMayorizarDiario,this.jTtoolBarProcesoMayorizarDiario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoMayorizarDiario,this.jTtoolBarProcesoMayorizarDiario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoMayorizarDiario,this.jTtoolBarProcesoMayorizarDiario,
							"duplicar","duplicar","Duplicar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoMayorizarDiario,this.jTtoolBarProcesoMayorizarDiario,
							"copiar","copiar","Copiar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoMayorizarDiario,this.jTtoolBarProcesoMayorizarDiario,
							"ver_form","ver_form","Ver"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoMayorizarDiario,this.jTtoolBarProcesoMayorizarDiario,
							"recargar","recargar","Buscar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoMayorizarDiario,this.jTtoolBarProcesoMayorizarDiario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoMayorizarDiario,this.jTtoolBarProcesoMayorizarDiario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoMayorizarDiario,this.jTtoolBarProcesoMayorizarDiario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoMayorizarDiario,this.jTtoolBarProcesoMayorizarDiario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoMayorizarDiario,this.jTtoolBarProcesoMayorizarDiario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoMayorizarDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoMayorizarDiario,this.jTtoolBarProcesoMayorizarDiario,
							"cerrar","cerrar","Salir"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoMayorizarDiario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoMayorizarDiario;
			
				this.jButtonProcesarInformacionToolBarProcesoMayorizarDiario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoMayorizarDiario;
				
		//protected JButton jButtonModificarToolBarProcesoMayorizarDiario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoMayorizarDiario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoMayorizarDiario=new JMenuMe("General");
		this.jmenuArchivoProcesoMayorizarDiario=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoMayorizarDiario=new JMenuMe("Acciones");
		this.jmenuDatosProcesoMayorizarDiario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoMayorizarDiario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoMayorizarDiario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoMayorizarDiario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoMayorizarDiario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoMayorizarDiario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoMayorizarDiario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoMayorizarDiario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoMayorizarDiario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoMayorizarDiario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoMayorizarDiario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoMayorizarDiario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoMayorizarDiario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoMayorizarDiario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoMayorizarDiario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoMayorizarDiario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoMayorizarDiario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoMayorizarDiario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoMayorizarDiario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoMayorizarDiario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoMayorizarDiario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoMayorizarDiario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoMayorizarDiario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoMayorizarDiario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoMayorizarDiario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoMayorizarDiario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoMayorizarDiario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoMayorizarDiario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoMayorizarDiario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoMayorizarDiario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoMayorizarDiario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoMayorizarDiario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoMayorizarDiario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoMayorizarDiario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoMayorizarDiario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoMayorizarDiario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoMayorizarDiario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoMayorizarDiario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoMayorizarDiario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoMayorizarDiario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoMayorizarDiario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoMayorizarDiario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoMayorizarDiario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoMayorizarDiario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoMayorizarDiario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoMayorizarDiario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoMayorizarDiario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoMayorizarDiario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoMayorizarDiario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoMayorizarDiario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoMayorizarDiario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoMayorizarDiario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoMayorizarDiario.add(this.jMenuItemCerrarProcesoMayorizarDiario);
			
			this.jmenuAccionesProcesoMayorizarDiario.add(this.jMenuItemNuevoProcesoMayorizarDiario);
			this.jmenuAccionesProcesoMayorizarDiario.add(this.jMenuItemNuevoGuardarCambiosProcesoMayorizarDiario);
			this.jmenuAccionesProcesoMayorizarDiario.add(this.jMenuItemNuevoRelacionesProcesoMayorizarDiario);
			this.jmenuAccionesProcesoMayorizarDiario.add(this.jMenuItemGuardarCambiosTablaProcesoMayorizarDiario);		
			this.jmenuAccionesProcesoMayorizarDiario.add(this.jMenuItemDuplicarProcesoMayorizarDiario);		
			this.jmenuAccionesProcesoMayorizarDiario.add(this.jMenuItemCopiarProcesoMayorizarDiario);		
			this.jmenuAccionesProcesoMayorizarDiario.add(this.jMenuItemVerFormProcesoMayorizarDiario);		
			
			this.jmenuDatosProcesoMayorizarDiario.add(this.jMenuItemRecargarInformacionProcesoMayorizarDiario);				
			this.jmenuDatosProcesoMayorizarDiario.add(this.jMenuItemAnterioresProcesoMayorizarDiario);				
			this.jmenuDatosProcesoMayorizarDiario.add(this.jMenuItemSiguientesProcesoMayorizarDiario);				
			this.jmenuDatosProcesoMayorizarDiario.add(this.jMenuItemAbrirOrderByProcesoMayorizarDiario);				
			this.jmenuDatosProcesoMayorizarDiario.add(this.jMenuItemMostrarOcultarProcesoMayorizarDiario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoMayorizarDiario.add(this.jMenuItemGuardarCambiosProcesoMayorizarDiario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoMayorizarDiario.add(this.jmenuArchivoProcesoMayorizarDiario);		
			this.jmenuBarProcesoMayorizarDiario.add(this.jmenuAccionesProcesoMayorizarDiario);		
			this.jmenuBarProcesoMayorizarDiario.add(this.jmenuDatosProcesoMayorizarDiario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoMayorizarDiario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoMayorizarDiario() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setToolTipText("Buscar Por Codigo Por Tipo Movimiento Por Fecha Inicio Por Fecha Fin ");
		this.jButtonBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario= new JButtonMe();
		this.jButtonBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setText("Buscar");
		this.jButtonBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setToolTipText("Buscar Por Codigo Por Tipo Movimiento Por Fecha Inicio Por Fecha Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario,"buscar_button","Buscar Por Codigo Por Tipo Movimiento Por Fecha Inicio Por Fecha Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario = new JLabelMe();
		jLabelcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setText("Codigo :");
		jLabelcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setToolTipText("Codigo");
		jLabelcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario= new JTextFieldMe();
		jTextFieldcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario = new JLabelMe();
		jLabelid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setText("Tipo Movimiento :");
		jLabelid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setToolTipText("Tipo Movimiento");
		jLabelid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario= new JComboBoxMe();
		jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario = new JLabelMe();
		jLabelfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario= new JDateChooser();
		jDateChooserfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setDate(new Date());
		jDateChooserfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario = new JLabelMe();
		jLabelfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setText("Fecha Fin :");
		jLabelfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setToolTipText("Fecha Fin");
		jLabelfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario= new JDateChooser();
		jDateChooserfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setDate(new Date());
		jDateChooserfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasProcesoMayorizarDiario=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoMayorizarDiario.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasProcesoMayorizarDiario.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasProcesoMayorizarDiario.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesoMayorizarDiario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoMayorizarDiario = new ProcesoMayorizarDiarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Mayorizar Diario DATOS");
			this.jInternalFrameDetalleFormProcesoMayorizarDiario = new ProcesoMayorizarDiarioDetalleFormJInternalFrame(jDesktopPane,this.procesomayorizardiarioSessionBean.getConGuardarRelaciones(),this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario = null;//new ProcesoMayorizarDiarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoMayorizarDiario= new GridBagLayout();
		
		
		this.jTableDatosProcesoMayorizarDiario = new JTableMe();      
		
		String sToolTipProcesoMayorizarDiario="";
		sToolTipProcesoMayorizarDiario=ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoMayorizarDiario+="(Contabilidad.ProcesoMayorizarDiario)";
		}
		
		if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoMayorizarDiario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoMayorizarDiario.setToolTipText(sToolTipProcesoMayorizarDiario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoMayorizarDiario);
		this.jTableDatosProcesoMayorizarDiario.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoMayorizarDiario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoMayorizarDiario.setRowSelectionAllowed(true);
		this.jTableDatosProcesoMayorizarDiario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoMayorizarDiario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoMayorizarDiario = new JButtonMe();
		this.jButtonDuplicarProcesoMayorizarDiario = new JButtonMe();
		this.jButtonCopiarProcesoMayorizarDiario = new JButtonMe();
		this.jButtonVerFormProcesoMayorizarDiario = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoMayorizarDiario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoMayorizarDiario = new JButtonMe();
		this.jButtonCerrarProcesoMayorizarDiario = new JButtonMe();
		
		this.jScrollPanelDatosProcesoMayorizarDiario = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoMayorizarDiario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoMayorizarDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Mayorizar Diario";
		
		if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Mayorizar Diarioes" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoMayorizarDiario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoMayorizarDiario.setToolTipText("Acciones");
        this.jPanelAccionesProcesoMayorizarDiario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoMayorizarDiario=new ReporteDinamicoJInternalFrame(ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoMayorizarDiario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoMayorizarDiario=new ImportacionJInternalFrame(ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoMayorizarDiario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoMayorizarDiario = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoMayorizarDiario.setText("Orden");
		this.jButtonAbrirOrderByProcesoMayorizarDiario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoMayorizarDiario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoMayorizarDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoMayorizarDiario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoMayorizarDiario,false,this);
			
			//this.cargarOrderByProcesoMayorizarDiario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoMayorizarDiario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoMayorizarDiario,true,this);
			
			//this.cargarOrderByProcesoMayorizarDiario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoMayorizarDiario.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosProcesoMayorizarDiario.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosProcesoMayorizarDiario.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosProcesoMayorizarDiario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoMayorizarDiario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoMayorizarDiario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoMayorizarDiario.setText("Nuevo");
		this.jButtonDuplicarProcesoMayorizarDiario.setText("Duplicar");
		this.jButtonCopiarProcesoMayorizarDiario.setText("Copiar");
		this.jButtonVerFormProcesoMayorizarDiario.setText("Ver");
		this.jButtonNuevoRelacionesProcesoMayorizarDiario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoMayorizarDiario.setText("Guardar");
		this.jButtonCerrarProcesoMayorizarDiario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoMayorizarDiario,"nuevo_button","Nuevo",this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoMayorizarDiario,"duplicar_button","Duplicar",this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoMayorizarDiario,"copiar_button","Copiar",this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoMayorizarDiario,"ver_form","Ver",this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoMayorizarDiario,"nuevorelaciones_button","Nuevo Rel",this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoMayorizarDiario,"guardarcambiostabla_button","Guardar",this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoMayorizarDiario,"cerrar_button","Salir",this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoMayorizarDiario.setToolTipText("Nuevo"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoMayorizarDiario.setToolTipText("Duplicar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoMayorizarDiario.setToolTipText("Copiar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoMayorizarDiario.setToolTipText("Ver"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoMayorizarDiario.setToolTipText("Nuevo Rel"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoMayorizarDiario.setToolTipText("Guardar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoMayorizarDiario.setToolTipText("Salir"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoMayorizarDiario";
		inputMap = this.jButtonNuevoProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoMayorizarDiario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoMayorizarDiario"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoMayorizarDiario";
		inputMap = this.jButtonDuplicarProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoMayorizarDiario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoMayorizarDiario"));
		
		//COPIAR
		sMapKey = "CopiarProcesoMayorizarDiario";
		inputMap = this.jButtonCopiarProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoMayorizarDiario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoMayorizarDiario"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoMayorizarDiario";
		inputMap = this.jButtonVerFormProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoMayorizarDiario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoMayorizarDiario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoMayorizarDiario";
		inputMap = this.jButtonNuevoRelacionesProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoMayorizarDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoMayorizarDiario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoMayorizarDiario";
		inputMap = this.jButtonModificarProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoMayorizarDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoMayorizarDiario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoMayorizarDiario";
		inputMap = this.jButtonCerrarProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoMayorizarDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoMayorizarDiario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoMayorizarDiario";
		inputMap = this.jButtonGuardarCambiosTablaProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoMayorizarDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoMayorizarDiario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoMayorizarDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoMayorizarDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoMayorizarDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoMayorizarDiario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoMayorizarDiario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoMayorizarDiario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoMayorizarDiario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoMayorizarDiario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoMayorizarDiario.setName("jPanelParametrosReportesProcesoMayorizarDiario"); 
		
		this.jPanelParametrosReportesAccionesProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoMayorizarDiario.setName("jPanelParametrosReportesAccionesProcesoMayorizarDiario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoMayorizarDiario = new JButtonMe();
		this.jButtonRecargarInformacionProcesoMayorizarDiario.setText("Buscar");
		this.jButtonRecargarInformacionProcesoMayorizarDiario.setToolTipText("Buscar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoMayorizarDiario,"recargar_button","Buscar");		
		
		
		
		
		this.jButtonProcesarInformacionProcesoMayorizarDiario = new JButtonMe();
		this.jButtonProcesarInformacionProcesoMayorizarDiario.setText("Procesar");
		this.jButtonProcesarInformacionProcesoMayorizarDiario.setToolTipText("Procesar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoMayorizarDiario.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoMayorizarDiario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoMayorizarDiario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoMayorizarDiario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoMayorizarDiario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoMayorizarDiario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoMayorizarDiario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoMayorizarDiario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoMayorizarDiario.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoMayorizarDiario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoMayorizarDiario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoMayorizarDiario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoMayorizarDiario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoMayorizarDiario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoMayorizarDiario.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoMayorizarDiario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoMayorizarDiario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoMayorizarDiario.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoMayorizarDiario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoMayorizarDiario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoMayorizarDiario.setText("Accion");
		this.jComboBoxTiposAccionesProcesoMayorizarDiario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoMayorizarDiario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoMayorizarDiario.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoMayorizarDiario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoMayorizarDiario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoMayorizarDiario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoMayorizarDiario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoMayorizarDiario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoMayorizarDiario = new JLabelMe();
		
		this.jLabelAccionesProcesoMayorizarDiario.setText("Acciones");		
		this.jLabelAccionesProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoMayorizarDiario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoMayorizarDiario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoMayorizarDiario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoMayorizarDiario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoMayorizarDiario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoMayorizarDiario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoMayorizarDiario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoMayorizarDiario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoMayorizarDiario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoMayorizarDiario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoMayorizarDiario.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoMayorizarDiario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoMayorizarDiario = new JButtonMe();
		//this.jButtonAnterioresProcesoMayorizarDiario.setText("<<");
        this.jButtonAnterioresProcesoMayorizarDiario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoMayorizarDiario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoMayorizarDiario = new JButtonMe();
		//this.jButtonSiguientesProcesoMayorizarDiario.setText(">>");
        this.jButtonSiguientesProcesoMayorizarDiario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoMayorizarDiario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoMayorizarDiario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoMayorizarDiario.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoMayorizarDiario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoMayorizarDiario,"nuevoguardarcambios_button","Nue",this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoMayorizarDiario";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoMayorizarDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoMayorizarDiario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoMayorizarDiario";
		inputMap = this.jButtonRecargarInformacionProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoMayorizarDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoMayorizarDiario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoMayorizarDiario";
		inputMap = this.jButtonSiguientesProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoMayorizarDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoMayorizarDiario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoMayorizarDiario";
		inputMap = this.jButtonAnterioresProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoMayorizarDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoMayorizarDiario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoMayorizarDiario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoMayorizarDiario.setMinimumSize(new Dimension(this.getWidth(),ProcesoMayorizarDiarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoMayorizarDiarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoMayorizarDiario.setMaximumSize(new Dimension(this.getWidth(),ProcesoMayorizarDiarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoMayorizarDiarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoMayorizarDiario.setPreferredSize(new Dimension(this.getWidth(),ProcesoMayorizarDiarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoMayorizarDiarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoMayorizarDiario = new GridBagLayout();

			this.jPanelPaginacionProcesoMayorizarDiario.setLayout(gridaBagLayoutPaginacionProcesoMayorizarDiario);						
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoMayorizarDiario.add(this.jButtonAnterioresProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
					
						
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
			
			this.jPanelPaginacionProcesoMayorizarDiario.add(this.jButtonNuevoGuardarCambiosProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
						
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
			this.jPanelPaginacionProcesoMayorizarDiario.add(this.jButtonSiguientesProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = 1;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoMayorizarDiario.add(this.jButtonNuevoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
						
			
			
			if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
				this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoMayorizarDiario.gridy = 1;
				this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoMayorizarDiario.add(this.jButtonGuardarCambiosTablaProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
			}
			
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = 1;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoMayorizarDiario.add(this.jButtonProcesarInformacionProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = 1;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoMayorizarDiario.add(this.jButtonDuplicarProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = 1;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoMayorizarDiario.add(this.jButtonCopiarProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = 1;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoMayorizarDiario.add(this.jButtonVerFormProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = 1;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoMayorizarDiario.add(this.jButtonCerrarProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
		
		
		this.jButtonRecargarInformacionProcesoMayorizarDiario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoMayorizarDiario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoMayorizarDiario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoMayorizarDiario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoMayorizarDiario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoMayorizarDiario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoMayorizarDiario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoMayorizarDiario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoMayorizarDiario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoMayorizarDiario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoMayorizarDiario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoMayorizarDiario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoMayorizarDiario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoMayorizarDiario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoMayorizarDiario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoMayorizarDiario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoMayorizarDiario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoMayorizarDiario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoMayorizarDiario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoMayorizarDiario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoMayorizarDiario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoMayorizarDiario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoMayorizarDiario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoMayorizarDiario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoMayorizarDiario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoMayorizarDiario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoMayorizarDiario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoMayorizarDiario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoMayorizarDiario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoMayorizarDiario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoMayorizarDiario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoMayorizarDiario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoMayorizarDiario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoMayorizarDiario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoMayorizarDiario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoMayorizarDiario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoMayorizarDiario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoMayorizarDiario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoMayorizarDiario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoMayorizarDiario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoMayorizarDiario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoMayorizarDiario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoMayorizarDiario.setLayout(gridaBagParametrosReportesProcesoMayorizarDiario);
			this.jPanelParametrosReportesAccionesProcesoMayorizarDiario.setLayout(gridaBagParametrosReportesAccionesProcesoMayorizarDiario);
			
			
			this.jPanelParametrosAuxiliar1ProcesoMayorizarDiario.setLayout(gridaBagParametrosAuxiliar1ProcesoMayorizarDiario);
			this.jPanelParametrosAuxiliar2ProcesoMayorizarDiario.setLayout(gridaBagParametrosAuxiliar2ProcesoMayorizarDiario);
			this.jPanelParametrosAuxiliar3ProcesoMayorizarDiario.setLayout(gridaBagParametrosAuxiliar3ProcesoMayorizarDiario);
			this.jPanelParametrosAuxiliar4ProcesoMayorizarDiario.setLayout(gridaBagParametrosAuxiliar4ProcesoMayorizarDiario);
			//this.jPanelParametrosAuxiliar5ProcesoMayorizarDiario.setLayout(gridaBagParametrosAuxiliar2ProcesoMayorizarDiario);			
			
			
			
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoMayorizarDiario.add(this.jButtonRecargarInformacionProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoMayorizarDiario.add(this.jComboBoxTiposPaginacionProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoMayorizarDiario.add(this.jCheckBoxConAltoMaximoTablaProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoMayorizarDiario.add(this.jComboBoxTiposArchivosReportesProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoMayorizarDiario.add(this.jPanelParametrosAuxiliar1ProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoMayorizarDiario.add(this.jComboBoxTiposReportesProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);																		
			
			
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProcesoMayorizarDiario.add(this.jComboBoxTiposGraficosReportesProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoMayorizarDiario.add(this.jPanelParametrosAuxiliar4ProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoMayorizarDiario.add(this.jComboBoxTiposReportesProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoMayorizarDiario.add(this.jCheckBoxGenerarReporteProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoMayorizarDiario.add(this.jPanelParametrosAuxiliar2ProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoMayorizarDiario.add(this.jLabelAccionesProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoMayorizarDiario.add(this.jComboBoxTiposSeleccionarProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);			
			
			
			/*
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoMayorizarDiario.add(this.jCheckBoxSeleccionarTodosProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoMayorizarDiario.add(this.jCheckBoxConGraficoReporteProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoMayorizarDiario.add(this.jCheckBoxSeleccionarTodosProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);															
				
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoMayorizarDiario.add(this.jCheckBoxSeleccionadosProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);															
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoMayorizarDiario.add(this.jCheckBoxConGraficoReporteProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoMayorizarDiario.add(this.jPanelParametrosAuxiliar3ProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoMayorizarDiario.add(this.jComboBoxTiposAccionesProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoMayorizarDiario = new GridBagLayout();

			this.jScrollPanelDatosProcesoMayorizarDiario.setLayout(gridaBagLayoutDatosProcesoMayorizarDiario);
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
			
			this.jScrollPanelDatosProcesoMayorizarDiario.add(this.jTableDatosProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoMayorizarDiario.setViewportView(this.jTableDatosProcesoMayorizarDiario);
		this.jTableDatosProcesoMayorizarDiario.setFillsViewportHeight(true);
		this.jTableDatosProcesoMayorizarDiario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoMayorizarDiario= new GridBagLayout();
		this.jPanelAccionesProcesoMayorizarDiario.setLayout(gridaBagLayoutAccionesProcesoMayorizarDiario);
		
		
		/*	
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
			
		this.jPanelAccionesProcesoMayorizarDiario.add(this.jButtonNuevoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setLayout(gridaBagLayoutBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario);

		gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
		jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.add(jLabelcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario, gridBagConstraintsProcesoMayorizarDiario);

		gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoMayorizarDiario.gridy = 0;
		gridBagConstraintsProcesoMayorizarDiario.gridx = 1;
		jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.add(jTextFieldcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario, gridBagConstraintsProcesoMayorizarDiario);


		gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoMayorizarDiario.gridy = 1;
		gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
		jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.add(jLabelid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario, gridBagConstraintsProcesoMayorizarDiario);

		gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoMayorizarDiario.gridy = 1;
		gridBagConstraintsProcesoMayorizarDiario.gridx = 1;
		jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.add(jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario, gridBagConstraintsProcesoMayorizarDiario);


		gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoMayorizarDiario.gridy = 2;
		gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
		jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.add(jLabelfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario, gridBagConstraintsProcesoMayorizarDiario);

		gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoMayorizarDiario.gridy = 2;
		gridBagConstraintsProcesoMayorizarDiario.gridx = 1;
		jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.add(jDateChooserfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario, gridBagConstraintsProcesoMayorizarDiario);


		gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoMayorizarDiario.gridy = 3;
		gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
		jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.add(jLabelfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario, gridBagConstraintsProcesoMayorizarDiario);

		gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoMayorizarDiario.gridy = 3;
		gridBagConstraintsProcesoMayorizarDiario.gridx = 1;
		jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.add(jDateChooserfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario, gridBagConstraintsProcesoMayorizarDiario);

		gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoMayorizarDiario.gridy = 4;
		gridBagConstraintsProcesoMayorizarDiario.gridx =1;
		jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.add(jButtonBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario, gridBagConstraintsProcesoMayorizarDiario);

		jTabbedPaneBusquedasProcesoMayorizarDiario.addTab("1.-Por Codigo Por Tipo Movimiento Por Fecha Inicio Por Fecha Fin ", jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario);
		jTabbedPaneBusquedasProcesoMayorizarDiario.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoMayorizarDiario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoMayorizarDiario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();						
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;		
			//this.gridBagConstraintsProcesoMayorizarDiario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;		
		//this.gridBagConstraintsProcesoMayorizarDiario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoMayorizarDiario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;		
			this.gridBagConstraintsProcesoMayorizarDiario.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoMayorizarDiario.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);								
		
		
		/*
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		*/		
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx =0;
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoMayorizarDiario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
				
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoMayorizarDiarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoMayorizarDiario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoMayorizarDiario = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoMayorizarDiario.setLayout(gridaBagLayoutBusquedasParametrosProcesoMayorizarDiario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoMayorizarDiario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoMayorizarDiario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoMayorizarDiario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoMayorizarDiario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
			
			
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
			
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		*/
		
			
     	//pack();
		
		
		
		this.jButtonRecargarInformacionProcesoMayorizarDiario.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoMayorizarDiario.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoMayorizarDiario.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoMayorizarDiario.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoMayorizarDiario.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoMayorizarDiario.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoMayorizarDiario.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoMayorizarDiario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoMayorizarDiario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoMayorizarDiario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoMayorizarDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoMayorizarDiario.setName("jPanelReporteDinamicoProcesoMayorizarDiario"); 
		
		this.jPanelReporteDinamicoProcesoMayorizarDiario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoMayorizarDiario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoMayorizarDiario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoMayorizarDiario.setLayout(gridaBagLayoutReporteDinamicoProcesoMayorizarDiario);
		
		
		this.jInternalFrameReporteDinamicoProcesoMayorizarDiario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoMayorizarDiario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoMayorizarDiario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoMayorizarDiario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoMayorizarDiario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoMayorizarDiario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Mayorizar Diarioes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoMayorizarDiario = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoMayorizarDiario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jLabelColumnasSelectReporteProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoMayorizarDiario = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoMayorizarDiario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoMayorizarDiario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoMayorizarDiario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoMayorizarDiario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoMayorizarDiario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoMayorizarDiario=new JScrollPane(this.jListColumnasSelectReporteProcesoMayorizarDiario);
			
			this.jScrollColumnasSelectReporteProcesoMayorizarDiario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoMayorizarDiario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoMayorizarDiario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jListColumnasSelectReporteProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jScrollColumnasSelectReporteProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoMayorizarDiario = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoMayorizarDiario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoMayorizarDiario = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoMayorizarDiario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoMayorizarDiario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoMayorizarDiario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoMayorizarDiario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoMayorizarDiario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoMayorizarDiario=new JScrollPane(this.jListRelacionesSelectReporteProcesoMayorizarDiario);
			
			this.jScrollRelacionesSelectReporteProcesoMayorizarDiario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoMayorizarDiario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoMayorizarDiario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoMayorizarDiario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoMayorizarDiario = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoMayorizarDiario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoMayorizarDiario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoMayorizarDiario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoMayorizarDiario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoMayorizarDiario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoMayorizarDiario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoMayorizarDiario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoMayorizarDiario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoMayorizarDiario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoMayorizarDiario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoMayorizarDiario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProcesoMayorizarDiario = new JLabelMe();

		this.jLabelConGraficoDinamicoProcesoMayorizarDiario.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jLabelConGraficoDinamicoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProcesoMayorizarDiario = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProcesoMayorizarDiario.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProcesoMayorizarDiario.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProcesoMayorizarDiario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoMayorizarDiario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoMayorizarDiario.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jCheckBoxConGraficoDinamicoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProcesoMayorizarDiario = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProcesoMayorizarDiario.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jLabelColumnaCategoriaGraficoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProcesoMayorizarDiario = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoMayorizarDiario.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProcesoMayorizarDiario.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProcesoMayorizarDiario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoMayorizarDiario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoMayorizarDiario.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jComboBoxColumnaCategoriaGraficoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProcesoMayorizarDiario = new JLabelMe();

		this.jLabelColumnaCategoriaValorProcesoMayorizarDiario.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jLabelColumnaCategoriaValorProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProcesoMayorizarDiario = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProcesoMayorizarDiario.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProcesoMayorizarDiario.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProcesoMayorizarDiario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoMayorizarDiario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoMayorizarDiario.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jComboBoxColumnaCategoriaValorProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProcesoMayorizarDiario = new JLabelMe();

		this.jLabelColumnasValoresGraficoProcesoMayorizarDiario.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jLabelColumnasValoresGraficoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProcesoMayorizarDiario = new JList<Reporte>();
		this.jListColumnasValoresGraficoProcesoMayorizarDiario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProcesoMayorizarDiario.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProcesoMayorizarDiario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoMayorizarDiario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoMayorizarDiario.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProcesoMayorizarDiario=new JScrollPane(this.jListColumnasValoresGraficoProcesoMayorizarDiario);
			
			this.jScrollColumnasValoresGraficoProcesoMayorizarDiario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoMayorizarDiario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoMayorizarDiario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jListColumnasSelectReporteProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jScrollColumnasValoresGraficoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProcesoMayorizarDiario = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProcesoMayorizarDiario.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jLabelTiposGraficosReportesDinamicoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProcesoMayorizarDiario = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoMayorizarDiario.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProcesoMayorizarDiario.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProcesoMayorizarDiario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoMayorizarDiario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoMayorizarDiario.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jComboBoxTiposGraficosReportesDinamicoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoMayorizarDiario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoMayorizarDiario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jLabelGenerarExcelReporteDinamicoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoMayorizarDiario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoMayorizarDiario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoMayorizarDiario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoMayorizarDiario.setToolTipText("Generar EXCEL"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		//this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jButtonGenerarExcelReporteDinamicoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jComboBoxTiposReportesDinamicoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoMayorizarDiario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoMayorizarDiario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jLabelTiposArchivoReporteDinamicoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoMayorizarDiario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoMayorizarDiario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoMayorizarDiario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoMayorizarDiario.setToolTipText("Generar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jButtonGenerarReporteDinamicoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoMayorizarDiario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoMayorizarDiario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoMayorizarDiario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoMayorizarDiario.setToolTipText("Cancelar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoMayorizarDiario.add(this.jButtonCerrarReporteDinamicoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoMayorizarDiario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoMayorizarDiario= new JScrollPane(jPanelReporteDinamicoProcesoMayorizarDiario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoMayorizarDiario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoMayorizarDiario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoMayorizarDiario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Mayorizar Diarioes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoMayorizarDiario);
		this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoMayorizarDiario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoMayorizarDiario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoMayorizarDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoMayorizarDiario.setName("jPanelImportacionProcesoMayorizarDiario"); 
		
		this.jPanelImportacionProcesoMayorizarDiario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoMayorizarDiario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoMayorizarDiario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoMayorizarDiario.setLayout(gridaBagLayoutImportacionProcesoMayorizarDiario);
		
		
		this.jInternalFrameImportacionProcesoMayorizarDiario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoMayorizarDiario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoMayorizarDiario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoMayorizarDiario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoMayorizarDiario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoMayorizarDiario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoMayorizarDiario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoMayorizarDiario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoMayorizarDiario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoMayorizarDiario.setResizable(true);
	    this.jInternalFrameImportacionProcesoMayorizarDiario.setClosable(true);
	    this.jInternalFrameImportacionProcesoMayorizarDiario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoMayorizarDiario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoMayorizarDiario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoMayorizarDiario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoMayorizarDiario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoMayorizarDiario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoMayorizarDiario.setResizable(true);
	    this.jInternalFrameImportacionProcesoMayorizarDiario.setClosable(true);
	    this.jInternalFrameImportacionProcesoMayorizarDiario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoMayorizarDiario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoMayorizarDiario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoMayorizarDiario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Mayorizar Diarioes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoMayorizarDiario = new JLabelMe();

		this.jLabelArchivoImportacionProcesoMayorizarDiario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoMayorizarDiario.add(this.jLabelArchivoImportacionProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoMayorizarDiario = new JFileChooser();		
		this.jFileChooserImportacionProcesoMayorizarDiario.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoMayorizarDiario = new JButtonMe();
		this.jButtonAbrirImportacionProcesoMayorizarDiario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoMayorizarDiario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoMayorizarDiario.setToolTipText("Generar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoMayorizarDiario.add(this.jButtonAbrirImportacionProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoMayorizarDiario = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoMayorizarDiario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoMayorizarDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoMayorizarDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoMayorizarDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoMayorizarDiario.add(this.jLabelPathArchivoImportacionProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoMayorizarDiario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoMayorizarDiario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoMayorizarDiario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoMayorizarDiario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoMayorizarDiario.add(this.jTextFieldPathArchivoImportacionProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoMayorizarDiario = new JButtonMe();
		this.jButtonGenerarImportacionProcesoMayorizarDiario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoMayorizarDiario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoMayorizarDiario.setToolTipText("Generar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoMayorizarDiario.add(this.jButtonGenerarImportacionProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoMayorizarDiario = new JButtonMe();
		this.jButtonCerrarImportacionProcesoMayorizarDiario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoMayorizarDiario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoMayorizarDiario.setToolTipText("Cancelar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoMayorizarDiario.add(this.jButtonCerrarImportacionProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoMayorizarDiario = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoMayorizarDiario= new JScrollPane(jPanelImportacionProcesoMayorizarDiario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
		this.gridBagConstraintsProcesoMayorizarDiario.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoMayorizarDiario.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoMayorizarDiario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoMayorizarDiario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoMayorizarDiario);
		this.jInternalFrameImportacionProcesoMayorizarDiario.getContentPane().add(this.jScrollPanelImportacionProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoMayorizarDiario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoMayorizarDiario = new JButtonMe();
			this.jButtonAbrirOrderByProcesoMayorizarDiario.setText("Orden");
			this.jButtonAbrirOrderByProcesoMayorizarDiario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoMayorizarDiario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoMayorizarDiario";
			inputMap = this.jButtonAbrirOrderByProcesoMayorizarDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoMayorizarDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoMayorizarDiario"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoMayorizarDiario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoMayorizarDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoMayorizarDiario.setName("jPanelOrderByProcesoMayorizarDiario"); 
			
			this.jPanelOrderByProcesoMayorizarDiario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoMayorizarDiario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoMayorizarDiario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoMayorizarDiario.setLayout(gridaBagLayoutOrderByProcesoMayorizarDiario);
			
			
			this.jTableDatosProcesoMayorizarDiarioOrderBy = new JTableMe();        
			this.jTableDatosProcesoMayorizarDiarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoMayorizarDiarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoMayorizarDiarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoMayorizarDiarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoMayorizarDiarioOrderBy.setViewportView(this.jTableDatosProcesoMayorizarDiarioOrderBy);
			this.jTableDatosProcesoMayorizarDiarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoMayorizarDiarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoMayorizarDiario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoMayorizarDiario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoMayorizarDiario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoMayorizarDiario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoMayorizarDiario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoMayorizarDiario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoMayorizarDiario.setTitle("Orden");
			this.jInternalFrameOrderByProcesoMayorizarDiario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoMayorizarDiario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoMayorizarDiario.setResizable(true);
			this.jInternalFrameOrderByProcesoMayorizarDiario.setClosable(true);
			this.jInternalFrameOrderByProcesoMayorizarDiario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoMayorizarDiario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoMayorizarDiario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoMayorizarDiario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoMayorizarDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Mayorizar Diarioes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoMayorizarDiario.ipady =150;
				
			this.jPanelOrderByProcesoMayorizarDiario.add(jScrollPanelDatosProcesoMayorizarDiarioOrderBy, this.gridBagConstraintsProcesoMayorizarDiario);//this.jTableDatosProcesoMayorizarDiarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoMayorizarDiario = new JButtonMe();
			this.jButtonCerrarOrderByProcesoMayorizarDiario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoMayorizarDiario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoMayorizarDiario.setToolTipText("Cancelar"+" "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoMayorizarDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoMayorizarDiario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoMayorizarDiario.add(this.jButtonCerrarOrderByProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoMayorizarDiario = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoMayorizarDiario= new JScrollPane(jPanelOrderByProcesoMayorizarDiario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoMayorizarDiario = new GridBagConstraints();
			this.gridBagConstraintsProcesoMayorizarDiario.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoMayorizarDiario.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoMayorizarDiario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoMayorizarDiario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoMayorizarDiario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoMayorizarDiario);
			
			this.jInternalFrameOrderByProcesoMayorizarDiario.getContentPane().add(this.jScrollPanelOrderByProcesoMayorizarDiario, this.gridBagConstraintsProcesoMayorizarDiario);			
		
		} else {
			this.jButtonAbrirOrderByProcesoMayorizarDiario = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesomayorizardiarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoMayorizarDiario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoMayorizarDiario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoMayorizarDiario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoMayorizarDiario.getRowHeight();//ProcesoMayorizarDiarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoMayorizarDiarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoMayorizarDiario.isSelected()) {
					iHeightTable=ProcesoMayorizarDiarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoMayorizarDiarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoMayorizarDiarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoMayorizarDiarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoMayorizarDiario.isSelected()) {
					iHeightTable=ProcesoMayorizarDiarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoMayorizarDiarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoMayorizarDiarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoMayorizarDiario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoMayorizarDiario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoMayorizarDiario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoMayorizarDiario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoMayorizarDiario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoMayorizarDiario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoMayorizarDiario!=null && this.jInternalFrameOrderByProcesoMayorizarDiario.getjTableDatosOrderBy()!=null) {
			//if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoMayorizarDiario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoMayorizarDiario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoMayorizarDiario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoMayorizarDiario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoMayorizarDiario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoMayorizarDiario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoMayorizarDiario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoMayorizarDiario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoMayorizarDiario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoMayorizarDiario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesomayorizardiarioLogic.getProcesoMayorizarDiarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesomayorizardiarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoMayorizarDiario> TraerProcesoMayorizarDiarioBeans(List<ProcesoMayorizarDiario> procesomayorizardiarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoMayorizarDiario procesomayorizardiario:procesomayorizardiarios) {
					
				if(!(ProcesoMayorizarDiarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoMayorizarDiarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesomayorizardiario.setsDetalleGeneralEntityReporte(ProcesoMayorizarDiarioConstantesFunciones.getProcesoMayorizarDiarioDescripcion(procesomayorizardiario));
										
						
					
						
					
				} else  {
							
					//procesomayorizardiario.setsDetalleGeneralEntityReporte(procesomayorizardiario.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesomayorizardiariobeans.add(procesomayorizardiariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesomayorizardiarios;
    }
	//PARA REPORTES FIN
}
