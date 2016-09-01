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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.SaldosCuentasPorPagarConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class SaldosCuentasPorPagarJInternalFrame extends SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSaldosCuentasPorPagar;
	
	protected JMenuBar jmenuBarSaldosCuentasPorPagar;
	
	protected JMenu jmenuSaldosCuentasPorPagar;
	protected JMenu jmenuDatosSaldosCuentasPorPagar;
	protected JMenu jmenuArchivoSaldosCuentasPorPagar;
	protected JMenu jmenuAccionesSaldosCuentasPorPagar;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSaldosCuentasPorPagar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSaldosCuentasPorPagar;	
	protected GridBagConstraints gridBagConstraintsSaldosCuentasPorPagar;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SaldosCuentasPorPagarDetalleFormJInternalFrame jInternalFrameDetalleFormSaldosCuentasPorPagar;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSaldosCuentasPorPagar;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSaldosCuentasPorPagar;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public SaldosCuentasPorPagarSessionBean saldoscuentasporpagarSessionBean;
		
	
	
	public ZonaSessionBean zonaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SaldosCuentasPorPagar> saldoscuentasporpagars;		
	public List<SaldosCuentasPorPagar> saldoscuentasporpagarsEliminados;	
	public List<SaldosCuentasPorPagar> saldoscuentasporpagarsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySaldosCuentasPorPagar;		
	protected JButton jButtonAbrirOrderBySaldosCuentasPorPagar;
	
	
	//protected JPanel jPanelOrderBySaldosCuentasPorPagar;
	//public JScrollPane jScrollPanelOrderBySaldosCuentasPorPagar;	
	//protected JButton jButtonCerrarOrderBySaldosCuentasPorPagar;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SaldosCuentasPorPagarLogic saldoscuentasporpagarLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSaldosCuentasPorPagar;
	public JScrollPane jScrollPanelDatosEdicionSaldosCuentasPorPagar;
	public JScrollPane jScrollPanelDatosGeneralSaldosCuentasPorPagar;
    
	
	
	//public JScrollPane jScrollPanelDatosSaldosCuentasPorPagarOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSaldosCuentasPorPagar;
	//public JScrollPane jScrollPanelImportacionSaldosCuentasPorPagar;
	
	
	
	protected JPanel jPanelAccionesSaldosCuentasPorPagar;
	
    protected JPanel jPanelPaginacionSaldosCuentasPorPagar;
    protected JPanel jPanelParametrosReportesSaldosCuentasPorPagar;
	protected JPanel jPanelParametrosReportesAccionesSaldosCuentasPorPagar;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SaldosCuentasPorPagar;
	protected JPanel jPanelParametrosAuxiliar2SaldosCuentasPorPagar;
	protected JPanel jPanelParametrosAuxiliar3SaldosCuentasPorPagar;
	protected JPanel jPanelParametrosAuxiliar4SaldosCuentasPorPagar;
	//protected JPanel jPanelParametrosAuxiliar5SaldosCuentasPorPagar;
	
	
	
	//protected JPanel jPanelReporteDinamicoSaldosCuentasPorPagar;
	//protected JPanel jPanelImportacionSaldosCuentasPorPagar;
	
	
	public JTable jTableDatosSaldosCuentasPorPagar;
	
	
	
	//public JTable jTableDatosSaldosCuentasPorPagarOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSaldosCuentasPorPagar;
	protected JButton jButtonDuplicarSaldosCuentasPorPagar;
	protected JButton jButtonCopiarSaldosCuentasPorPagar;
	protected JButton jButtonVerFormSaldosCuentasPorPagar;
	protected JButton jButtonNuevoRelacionesSaldosCuentasPorPagar;
	protected JButton jButtonModificarSaldosCuentasPorPagar;
	
    protected JButton jButtonGuardarCambiosTablaSaldosCuentasPorPagar;
	protected JButton jButtonCerrarSaldosCuentasPorPagar;
	
	
	protected JButton jButtonRecargarInformacionSaldosCuentasPorPagar;
	protected JButton jButtonProcesarInformacionSaldosCuentasPorPagar;
	
	
	protected JButton jButtonAnterioresSaldosCuentasPorPagar;
	protected JButton jButtonSiguientesSaldosCuentasPorPagar;
	protected JButton jButtonNuevoGuardarCambiosSaldosCuentasPorPagar;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSaldosCuentasPorPagar;
	//protected JButton jButtonCerrarReporteDinamicoSaldosCuentasPorPagar;
	//protected JButton jButtonGenerarExcelReporteDinamicoSaldosCuentasPorPagar;	
	
	
	
	//protected JButton jButtonAbrirImportacionSaldosCuentasPorPagar;
	//protected JButton jButtonGenerarImportacionSaldosCuentasPorPagar;
	//protected JButton jButtonCerrarImportacionSaldosCuentasPorPagar;
	//protected JFileChooser jFileChooserImportacionSaldosCuentasPorPagar;
	//protected File fileImportacionSaldosCuentasPorPagar;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSaldosCuentasPorPagar;
	protected JButton jButtonDuplicarToolBarSaldosCuentasPorPagar;
	protected JButton jButtonNuevoRelacionesToolBarSaldosCuentasPorPagar;
	
	
	public JButton jButtonGuardarCambiosToolBarSaldosCuentasPorPagar;
	protected JButton jButtonCopiarToolBarSaldosCuentasPorPagar;
	protected JButton jButtonVerFormToolBarSaldosCuentasPorPagar;
	public JButton jButtonGuardarCambiosTablaToolBarSaldosCuentasPorPagar;
	protected JButton jButtonMostrarOcultarTablaToolBarSaldosCuentasPorPagar;
	protected JButton jButtonCerrarToolBarSaldosCuentasPorPagar;
	
	protected JButton jButtonRecargarInformacionToolBarSaldosCuentasPorPagar;
	protected JButton jButtonProcesarInformacionToolBarSaldosCuentasPorPagar;
	protected JButton jButtonAnterioresToolBarSaldosCuentasPorPagar;
	protected JButton jButtonSiguientesToolBarSaldosCuentasPorPagar;
	protected JButton jButtonNuevoGuardarCambiosToolBarSaldosCuentasPorPagar;
	protected JButton jButtonAbrirOrderByToolBarSaldosCuentasPorPagar;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemDuplicarSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemNuevoRelacionesSaldosCuentasPorPagar;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemCopiarSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemVerFormSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemGuardarCambiosTablaSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemCerrarSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemDetalleCerrarSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySaldosCuentasPorPagar;
	protected JMenuItem jMenuItemDetalleMostarOcultarSaldosCuentasPorPagar;
	
	protected JMenuItem jMenuItemRecargarInformacionSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemProcesarInformacionSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemAnterioresSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemSiguientesSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemAbrirOrderBySaldosCuentasPorPagar;
	protected JMenuItem jMenuItemMostrarOcultarSaldosCuentasPorPagar;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSaldosCuentasPorPagar;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSaldosCuentasPorPagar;
	protected JCheckBox jCheckBoxSeleccionadosSaldosCuentasPorPagar;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSaldosCuentasPorPagar;
	protected JCheckBox jCheckBoxConGraficoReporteSaldosCuentasPorPagar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSaldosCuentasPorPagar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSaldosCuentasPorPagar;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSaldosCuentasPorPagar;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSaldosCuentasPorPagar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSaldosCuentasPorPagar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSaldosCuentasPorPagar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSaldosCuentasPorPagar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSaldosCuentasPorPagar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSaldosCuentasPorPagar;
	protected JTextField jTextFieldValorCampoGeneralSaldosCuentasPorPagar;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSaldosCuentasPorPagar;
	//public JList<Reporte> jListColumnasSelectReporteSaldosCuentasPorPagar;
	//public JScrollPane jScrollColumnasSelectReporteSaldosCuentasPorPagar;
	
	//public JLabel jLabelRelacionesSelectReporteSaldosCuentasPorPagar;
	//public JList<Reporte> jListRelacionesSelectReporteSaldosCuentasPorPagar;
	//public JScrollPane jScrollRelacionesSelectReporteSaldosCuentasPorPagar;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSaldosCuentasPorPagar;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSaldosCuentasPorPagar;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSaldosCuentasPorPagar;
	//public JLabel jLabelTiposArchivoReporteDinamicoSaldosCuentasPorPagar;
	
		
	//public JLabel jLabelArchivoImportacionSaldosCuentasPorPagar;	
	//public JLabel jLabelPathArchivoImportacionSaldosCuentasPorPagar;
	//protected JTextField jTextFieldPathArchivoImportacionSaldosCuentasPorPagar;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSaldosCuentasPorPagar;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSaldosCuentasPorPagar;
	
	//public JLabel jLabelColumnaCategoriaValorSaldosCuentasPorPagar;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSaldosCuentasPorPagar;
	
	//public JLabel jLabelColumnasValoresGraficoSaldosCuentasPorPagar;
	//public JList<Reporte> jListColumnasValoresGraficoSaldosCuentasPorPagar;
	//public JScrollPane jScrollColumnasValoresGraficoSaldosCuentasPorPagar;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSaldosCuentasPorPagar;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSaldosCuentasPorPagar;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSaldosCuentasPorPagar;
	public JPanel jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar;
	public JButton jButtonBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar;
	
	public JPanel jPanelid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar;
	public JLabel jLabelid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar;
	public JButton jButtonid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar= new JButtonMe();
	public JButton jButtonid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagarUpdate= new JButtonMe();
	public JButton jButtonid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar;
	public JLabel jLabelid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar;
	public JButton jButtonid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagarUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar;
	public JLabel jLabelid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar;
	public JButton jButtonid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar= new JButtonMe();
	public JButton jButtonid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagarUpdate= new JButtonMe();
	public JButton jButtonid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagarBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar;
	public JLabel jLabelfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar;
	public JButton jButtonfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagarBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=440;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public SaldosCuentasPorPagarJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SaldosCuentasPorPagar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosCuentasPorPagarJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldosCuentasPorPagar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosCuentasPorPagarJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldosCuentasPorPagar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosCuentasPorPagarJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SaldosCuentasPorPagar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSaldosCuentasPorPagar)	{
		this.jButtonRecargarInformacionSaldosCuentasPorPagar = jButtonRecargarInformacionSaldosCuentasPorPagar;
	}
	
	public JButton getjButtonProcesarInformacionSaldosCuentasPorPagar() {
		return this.jButtonProcesarInformacionSaldosCuentasPorPagar;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSaldosCuentasPorPagar)	{
		this.jButtonProcesarInformacionSaldosCuentasPorPagar = jButtonProcesarInformacionSaldosCuentasPorPagar;
	}
	
	
	public JButton getjButtonRecargarInformacionSaldosCuentasPorPagar() {
		return this.jButtonRecargarInformacionSaldosCuentasPorPagar;
	}
	
	
	public List<SaldosCuentasPorPagar> getsaldoscuentasporpagars() {
		return this.saldoscuentasporpagars;
	}

	public void setsaldoscuentasporpagars(List<SaldosCuentasPorPagar> saldoscuentasporpagars) {
		this.saldoscuentasporpagars = saldoscuentasporpagars;
	}
	
	public List<SaldosCuentasPorPagar> getsaldoscuentasporpagarsAux() {
		return this.saldoscuentasporpagarsAux;
	}

	public void setsaldoscuentasporpagarsAux(List<SaldosCuentasPorPagar> saldoscuentasporpagarsAux) {
		this.saldoscuentasporpagarsAux = saldoscuentasporpagarsAux;
	}
	
	public List<SaldosCuentasPorPagar> getsaldoscuentasporpagarsEliminados() {
		return this.saldoscuentasporpagarsEliminados;
	}

	public void setSaldosCuentasPorPagarsEliminados(List<SaldosCuentasPorPagar> saldoscuentasporpagarsEliminados) {
		this.saldoscuentasporpagarsEliminados = saldoscuentasporpagarsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSaldosCuentasPorPagar() {
		return jComboBoxTiposSeleccionarSaldosCuentasPorPagar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSaldosCuentasPorPagar(
			JComboBox jComboBoxTiposSeleccionarSaldosCuentasPorPagar) {
		this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar = jComboBoxTiposSeleccionarSaldosCuentasPorPagar;
	}
	
	public void setBorderResaltarTiposSeleccionarSaldosCuentasPorPagar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSaldosCuentasPorPagar.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSaldosCuentasPorPagar() {
		return jTextFieldValorCampoGeneralSaldosCuentasPorPagar;
	}

	public void setjTextFieldValorCampoGeneralSaldosCuentasPorPagar(
			JTextField jTextFieldValorCampoGeneralSaldosCuentasPorPagar) {
		this.jTextFieldValorCampoGeneralSaldosCuentasPorPagar = jTextFieldValorCampoGeneralSaldosCuentasPorPagar;
	}

	public void setBorderResaltarValorCampoGeneralSaldosCuentasPorPagar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosCuentasPorPagar.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSaldosCuentasPorPagar .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSaldosCuentasPorPagar() {
		return this.jCheckBoxSeleccionarTodosSaldosCuentasPorPagar;
	}

	public void setjCheckBoxSeleccionarTodosSaldosCuentasPorPagar(
			JCheckBox jCheckBoxSeleccionarTodosSaldosCuentasPorPagar) {
		this.jCheckBoxSeleccionarTodosSaldosCuentasPorPagar = jCheckBoxSeleccionarTodosSaldosCuentasPorPagar;
	}

	public void setBorderResaltarSeleccionarTodosSaldosCuentasPorPagar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosCuentasPorPagar.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSaldosCuentasPorPagar .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSaldosCuentasPorPagar() {
		return this.jCheckBoxSeleccionadosSaldosCuentasPorPagar;
	}

	public void setjCheckBoxSeleccionadosSaldosCuentasPorPagar(
			JCheckBox jCheckBoxSeleccionadosSaldosCuentasPorPagar) {
		this.jCheckBoxSeleccionadosSaldosCuentasPorPagar = jCheckBoxSeleccionadosSaldosCuentasPorPagar;
	}
	
	public void setBorderResaltarSeleccionadosSaldosCuentasPorPagar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosCuentasPorPagar.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSaldosCuentasPorPagar .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSaldosCuentasPorPagar() {
		return this.jComboBoxTiposArchivosReportesSaldosCuentasPorPagar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSaldosCuentasPorPagar(
			JComboBox jComboBoxTiposArchivosReportesSaldosCuentasPorPagar) {
		this.jComboBoxTiposArchivosReportesSaldosCuentasPorPagar = jComboBoxTiposArchivosReportesSaldosCuentasPorPagar;
	}

	public void setBorderResaltarTiposArchivosReportesSaldosCuentasPorPagar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosCuentasPorPagar.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSaldosCuentasPorPagar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSaldosCuentasPorPagar() {
		return this.jComboBoxTiposReportesSaldosCuentasPorPagar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSaldosCuentasPorPagar(
			JComboBox jComboBoxTiposReportesSaldosCuentasPorPagar) {
		this.jComboBoxTiposReportesSaldosCuentasPorPagar = jComboBoxTiposReportesSaldosCuentasPorPagar;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSaldosCuentasPorPagar() {
	//	return jComboBoxTiposReportesDinamicoSaldosCuentasPorPagar;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSaldosCuentasPorPagar(
	//		JComboBox jComboBoxTiposReportesDinamicoSaldosCuentasPorPagar) {
	//	this.jComboBoxTiposReportesDinamicoSaldosCuentasPorPagar = jComboBoxTiposReportesDinamicoSaldosCuentasPorPagar;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSaldosCuentasPorPagar() {
	//	return jComboBoxTiposArchivosReportesDinamicoSaldosCuentasPorPagar;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSaldosCuentasPorPagar(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSaldosCuentasPorPagar) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSaldosCuentasPorPagar = jComboBoxTiposArchivosReportesDinamicoSaldosCuentasPorPagar;
	//}
	
	public void setBorderResaltarTiposReportesSaldosCuentasPorPagar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosCuentasPorPagar.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSaldosCuentasPorPagar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSaldosCuentasPorPagar() {
		return this.jComboBoxTiposGraficosReportesSaldosCuentasPorPagar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSaldosCuentasPorPagar(
			JComboBox jComboBoxTiposGraficosReportesSaldosCuentasPorPagar) {
		this.jComboBoxTiposGraficosReportesSaldosCuentasPorPagar = jComboBoxTiposGraficosReportesSaldosCuentasPorPagar;
	}
	
	public void setBorderResaltarTiposGraficosReportesSaldosCuentasPorPagar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosCuentasPorPagar.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSaldosCuentasPorPagar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSaldosCuentasPorPagar() {
		return this.jComboBoxTiposPaginacionSaldosCuentasPorPagar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSaldosCuentasPorPagar(
			JComboBox jComboBoxTiposPaginacionSaldosCuentasPorPagar) {
		this.jComboBoxTiposPaginacionSaldosCuentasPorPagar = jComboBoxTiposPaginacionSaldosCuentasPorPagar;
	}
	
	public void setBorderResaltarTiposPaginacionSaldosCuentasPorPagar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosCuentasPorPagar.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSaldosCuentasPorPagar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSaldosCuentasPorPagar() {
		return this.jComboBoxTiposRelacionesSaldosCuentasPorPagar;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSaldosCuentasPorPagar() {
		return this.jComboBoxTiposAccionesSaldosCuentasPorPagar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSaldosCuentasPorPagar(
			JComboBox jComboBoxTiposRelacionesSaldosCuentasPorPagar) {
		this.jComboBoxTiposRelacionesSaldosCuentasPorPagar = jComboBoxTiposRelacionesSaldosCuentasPorPagar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSaldosCuentasPorPagar(
			JComboBox jComboBoxTiposAccionesSaldosCuentasPorPagar) {
		this.jComboBoxTiposAccionesSaldosCuentasPorPagar = jComboBoxTiposAccionesSaldosCuentasPorPagar;
	}
	
	public void setBorderResaltarTiposRelacionesSaldosCuentasPorPagar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosCuentasPorPagar.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSaldosCuentasPorPagar .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSaldosCuentasPorPagar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosCuentasPorPagar.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSaldosCuentasPorPagar .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSaldosCuentasPorPagar() {
	//	return jCheckBoxConGraficoDinamicoSaldosCuentasPorPagar;
	//}

	//public void setjCheckBoxConGraficoDinamicoSaldosCuentasPorPagar(
	//		JCheckBox jCheckBoxConGraficoDinamicoSaldosCuentasPorPagar) {
	//	this.jCheckBoxConGraficoDinamicoSaldosCuentasPorPagar = jCheckBoxConGraficoDinamicoSaldosCuentasPorPagar;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSaldosCuentasPorPagar() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSaldosCuentasPorPagar.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSaldosCuentasPorPagar .setBorder(borderResaltar);		
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
		this.saldoscuentasporpagarSessionBean=new SaldosCuentasPorPagarSessionBean();
		
		this.saldoscuentasporpagarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.saldoscuentasporpagarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SaldosCuentasPorPagarJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SaldosCuentasPorPagarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SaldosCuentasPorPagarJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SaldosCuentasPorPagarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SaldosCuentasPorPagarJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Saldos Cuentas Por Pagar MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
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
		
		SaldosCuentasPorPagarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SaldosCuentasPorPagar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSaldosCuentasPorPagar= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSaldosCuentasPorPagar,this.jTtoolBarSaldosCuentasPorPagar,
							"nuevo","nuevo","Nuevo"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSaldosCuentasPorPagar,this.jTtoolBarSaldosCuentasPorPagar,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSaldosCuentasPorPagar,this.jTtoolBarSaldosCuentasPorPagar,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSaldosCuentasPorPagar,this.jTtoolBarSaldosCuentasPorPagar,
							"duplicar","duplicar","Duplicar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSaldosCuentasPorPagar,this.jTtoolBarSaldosCuentasPorPagar,
							"copiar","copiar","Copiar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSaldosCuentasPorPagar,this.jTtoolBarSaldosCuentasPorPagar,
							"ver_form","ver_form","Ver"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSaldosCuentasPorPagar,this.jTtoolBarSaldosCuentasPorPagar,
							"recargar","recargar","Buscar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSaldosCuentasPorPagar,this.jTtoolBarSaldosCuentasPorPagar,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSaldosCuentasPorPagar,this.jTtoolBarSaldosCuentasPorPagar,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSaldosCuentasPorPagar,this.jTtoolBarSaldosCuentasPorPagar,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSaldosCuentasPorPagar,this.jTtoolBarSaldosCuentasPorPagar,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSaldosCuentasPorPagar,this.jTtoolBarSaldosCuentasPorPagar,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSaldosCuentasPorPagar,this.jTtoolBarSaldosCuentasPorPagar,
							"cerrar","cerrar","Salir"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSaldosCuentasPorPagar=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSaldosCuentasPorPagar;
			
				this.jButtonProcesarInformacionToolBarSaldosCuentasPorPagar=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSaldosCuentasPorPagar;
				
		//protected JButton jButtonModificarToolBarSaldosCuentasPorPagar;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSaldosCuentasPorPagar=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSaldosCuentasPorPagar=new JMenuMe("General");
		this.jmenuArchivoSaldosCuentasPorPagar=new JMenuMe("Archivo");
		this.jmenuAccionesSaldosCuentasPorPagar=new JMenuMe("Acciones");
		this.jmenuDatosSaldosCuentasPorPagar=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSaldosCuentasPorPagar= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSaldosCuentasPorPagar.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSaldosCuentasPorPagar,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSaldosCuentasPorPagar= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSaldosCuentasPorPagar.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSaldosCuentasPorPagar,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSaldosCuentasPorPagar= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSaldosCuentasPorPagar.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSaldosCuentasPorPagar,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSaldosCuentasPorPagar= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSaldosCuentasPorPagar.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSaldosCuentasPorPagar,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSaldosCuentasPorPagar= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSaldosCuentasPorPagar.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSaldosCuentasPorPagar,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSaldosCuentasPorPagar= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSaldosCuentasPorPagar.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSaldosCuentasPorPagar,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSaldosCuentasPorPagar= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSaldosCuentasPorPagar.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSaldosCuentasPorPagar,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSaldosCuentasPorPagar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSaldosCuentasPorPagar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSaldosCuentasPorPagar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSaldosCuentasPorPagar= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSaldosCuentasPorPagar.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSaldosCuentasPorPagar,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSaldosCuentasPorPagar= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSaldosCuentasPorPagar.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSaldosCuentasPorPagar,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSaldosCuentasPorPagar= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSaldosCuentasPorPagar.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSaldosCuentasPorPagar,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSaldosCuentasPorPagar= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSaldosCuentasPorPagar.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSaldosCuentasPorPagar,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySaldosCuentasPorPagar= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySaldosCuentasPorPagar.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySaldosCuentasPorPagar,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSaldosCuentasPorPagar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSaldosCuentasPorPagar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSaldosCuentasPorPagar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySaldosCuentasPorPagar= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySaldosCuentasPorPagar.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySaldosCuentasPorPagar,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSaldosCuentasPorPagar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSaldosCuentasPorPagar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSaldosCuentasPorPagar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSaldosCuentasPorPagar= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSaldosCuentasPorPagar.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSaldosCuentasPorPagar,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSaldosCuentasPorPagar.add(this.jMenuItemCerrarSaldosCuentasPorPagar);
			
			this.jmenuAccionesSaldosCuentasPorPagar.add(this.jMenuItemNuevoSaldosCuentasPorPagar);
			this.jmenuAccionesSaldosCuentasPorPagar.add(this.jMenuItemNuevoGuardarCambiosSaldosCuentasPorPagar);
			this.jmenuAccionesSaldosCuentasPorPagar.add(this.jMenuItemNuevoRelacionesSaldosCuentasPorPagar);
			this.jmenuAccionesSaldosCuentasPorPagar.add(this.jMenuItemGuardarCambiosTablaSaldosCuentasPorPagar);		
			this.jmenuAccionesSaldosCuentasPorPagar.add(this.jMenuItemDuplicarSaldosCuentasPorPagar);		
			this.jmenuAccionesSaldosCuentasPorPagar.add(this.jMenuItemCopiarSaldosCuentasPorPagar);		
			this.jmenuAccionesSaldosCuentasPorPagar.add(this.jMenuItemVerFormSaldosCuentasPorPagar);		
			
			this.jmenuDatosSaldosCuentasPorPagar.add(this.jMenuItemRecargarInformacionSaldosCuentasPorPagar);				
			this.jmenuDatosSaldosCuentasPorPagar.add(this.jMenuItemAnterioresSaldosCuentasPorPagar);				
			this.jmenuDatosSaldosCuentasPorPagar.add(this.jMenuItemSiguientesSaldosCuentasPorPagar);				
			this.jmenuDatosSaldosCuentasPorPagar.add(this.jMenuItemAbrirOrderBySaldosCuentasPorPagar);				
			this.jmenuDatosSaldosCuentasPorPagar.add(this.jMenuItemMostrarOcultarSaldosCuentasPorPagar);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSaldosCuentasPorPagar.add(this.jMenuItemGuardarCambiosSaldosCuentasPorPagar);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSaldosCuentasPorPagar.add(this.jmenuArchivoSaldosCuentasPorPagar);		
			this.jmenuBarSaldosCuentasPorPagar.add(this.jmenuAccionesSaldosCuentasPorPagar);		
			this.jmenuBarSaldosCuentasPorPagar.add(this.jmenuDatosSaldosCuentasPorPagar);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSaldosCuentasPorPagar);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSaldosCuentasPorPagar() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setToolTipText("Buscar Por Zona Por Grupo Cliente Por Cliente Por Fecha Emision Hasta ");
		this.jButtonBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar= new JButtonMe();
		this.jButtonBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setText("Buscar");
		this.jButtonBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setToolTipText("Buscar Por Zona Por Grupo Cliente Por Cliente Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar,"buscar_button","Buscar Por Zona Por Grupo Cliente Por Cliente Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar = new JLabelMe();
		jLabelid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setText("Zona :");
		jLabelid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setToolTipText("Zona");
		jLabelid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar= new JComboBoxMe();
		jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar = new JLabelMe();
		jLabelid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setText("Grupo Cliente :");
		jLabelid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setToolTipText("Grupo Cliente");
		jLabelid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar= new JComboBoxMe();
		jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar = new JLabelMe();
		jLabelid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setText("Cliente :");
		jLabelid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setToolTipText("Cliente");
		jLabelid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar= new JComboBoxMe();
		jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasSaldosCuentasPorPagar=new JTabbedPane();


		this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSaldosCuentasPorPagar = new SaldosCuentasPorPagarDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Saldos Cuentas Por Pagar DATOS");
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar = new SaldosCuentasPorPagarDetalleFormJInternalFrame(jDesktopPane,this.saldoscuentasporpagarSessionBean.getConGuardarRelaciones(),this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar = null;//new SaldosCuentasPorPagarDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSaldosCuentasPorPagar= new GridBagLayout();
		
		
		this.jTableDatosSaldosCuentasPorPagar = new JTableMe();      
		
		String sToolTipSaldosCuentasPorPagar="";
		sToolTipSaldosCuentasPorPagar=SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSaldosCuentasPorPagar+="(Cartera.SaldosCuentasPorPagar)";
		}
		
		if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
			sToolTipSaldosCuentasPorPagar+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSaldosCuentasPorPagar.setToolTipText(sToolTipSaldosCuentasPorPagar);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSaldosCuentasPorPagar);
		this.jTableDatosSaldosCuentasPorPagar.setAutoCreateRowSorter(true);
		this.jTableDatosSaldosCuentasPorPagar.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSaldosCuentasPorPagar.setRowSelectionAllowed(true);
		this.jTableDatosSaldosCuentasPorPagar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonDuplicarSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonCopiarSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonVerFormSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonNuevoRelacionesSaldosCuentasPorPagar = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonCerrarSaldosCuentasPorPagar = new JButtonMe();
		
		this.jScrollPanelDatosSaldosCuentasPorPagar = new JScrollPane();   
        this.jScrollPanelDatosGeneralSaldosCuentasPorPagar = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSaldosCuentasPorPagar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Saldos Cuentas Por Pagar";
		
		if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Cuentas Por Pagares" + this.sPath));
		} else {
			this.jScrollPanelDatosSaldosCuentasPorPagar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSaldosCuentasPorPagar.setToolTipText("Acciones");
        this.jPanelAccionesSaldosCuentasPorPagar.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar=new ReporteDinamicoJInternalFrame(SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSaldosCuentasPorPagar();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSaldosCuentasPorPagar=new ImportacionJInternalFrame(SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSaldosCuentasPorPagar();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySaldosCuentasPorPagar = new JButtonMe();
		
		this.jButtonAbrirOrderBySaldosCuentasPorPagar.setText("Orden");
		this.jButtonAbrirOrderBySaldosCuentasPorPagar.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySaldosCuentasPorPagar,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySaldosCuentasPorPagar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySaldosCuentasPorPagar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldosCuentasPorPagar,false,this);
			
			//this.cargarOrderBySaldosCuentasPorPagar(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySaldosCuentasPorPagar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldosCuentasPorPagar,true,this);
			
			//this.cargarOrderBySaldosCuentasPorPagar(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSaldosCuentasPorPagar.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosSaldosCuentasPorPagar.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosSaldosCuentasPorPagar.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosSaldosCuentasPorPagar.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSaldosCuentasPorPagar.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSaldosCuentasPorPagar.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSaldosCuentasPorPagar.setText("Nuevo");
		this.jButtonDuplicarSaldosCuentasPorPagar.setText("Duplicar");
		this.jButtonCopiarSaldosCuentasPorPagar.setText("Copiar");
		this.jButtonVerFormSaldosCuentasPorPagar.setText("Ver");
		this.jButtonNuevoRelacionesSaldosCuentasPorPagar.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar.setText("Guardar");
		this.jButtonCerrarSaldosCuentasPorPagar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSaldosCuentasPorPagar,"nuevo_button","Nuevo",this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSaldosCuentasPorPagar,"duplicar_button","Duplicar",this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSaldosCuentasPorPagar,"copiar_button","Copiar",this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSaldosCuentasPorPagar,"ver_form","Ver",this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSaldosCuentasPorPagar,"nuevorelaciones_button","Nuevo Rel",this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar,"guardarcambiostabla_button","Guardar",this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSaldosCuentasPorPagar,"cerrar_button","Salir",this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSaldosCuentasPorPagar.setToolTipText("Nuevo"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSaldosCuentasPorPagar.setToolTipText("Duplicar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSaldosCuentasPorPagar.setToolTipText("Copiar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSaldosCuentasPorPagar.setToolTipText("Ver"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSaldosCuentasPorPagar.setToolTipText("Nuevo Rel"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar.setToolTipText("Guardar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSaldosCuentasPorPagar.setToolTipText("Salir"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSaldosCuentasPorPagar";
		inputMap = this.jButtonNuevoSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSaldosCuentasPorPagar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSaldosCuentasPorPagar"));
		
		//DUPLICAR
		sMapKey = "DuplicarSaldosCuentasPorPagar";
		inputMap = this.jButtonDuplicarSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSaldosCuentasPorPagar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSaldosCuentasPorPagar"));
		
		//COPIAR
		sMapKey = "CopiarSaldosCuentasPorPagar";
		inputMap = this.jButtonCopiarSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSaldosCuentasPorPagar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSaldosCuentasPorPagar"));
		
		//VEr FORM
		sMapKey = "VerFormSaldosCuentasPorPagar";
		inputMap = this.jButtonVerFormSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSaldosCuentasPorPagar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSaldosCuentasPorPagar"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSaldosCuentasPorPagar";
		inputMap = this.jButtonNuevoRelacionesSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSaldosCuentasPorPagar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSaldosCuentasPorPagar"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSaldosCuentasPorPagar";
		inputMap = this.jButtonModificarSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSaldosCuentasPorPagar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSaldosCuentasPorPagar"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSaldosCuentasPorPagar";
		inputMap = this.jButtonCerrarSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSaldosCuentasPorPagar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSaldosCuentasPorPagar"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSaldosCuentasPorPagar";
		inputMap = this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSaldosCuentasPorPagar"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSaldosCuentasPorPagar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSaldosCuentasPorPagar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSaldosCuentasPorPagar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SaldosCuentasPorPagar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SaldosCuentasPorPagar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SaldosCuentasPorPagar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SaldosCuentasPorPagar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SaldosCuentasPorPagar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSaldosCuentasPorPagar.setName("jPanelParametrosReportesSaldosCuentasPorPagar"); 
		
		this.jPanelParametrosReportesAccionesSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSaldosCuentasPorPagar.setName("jPanelParametrosReportesAccionesSaldosCuentasPorPagar"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonRecargarInformacionSaldosCuentasPorPagar.setText("Buscar");
		this.jButtonRecargarInformacionSaldosCuentasPorPagar.setToolTipText("Buscar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSaldosCuentasPorPagar,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionSaldosCuentasPorPagar.setVisible(false);
		
		
		this.jButtonProcesarInformacionSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonProcesarInformacionSaldosCuentasPorPagar.setText("Procesar");
		this.jButtonProcesarInformacionSaldosCuentasPorPagar.setToolTipText("Procesar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSaldosCuentasPorPagar.setVisible(false);
			
		this.jButtonProcesarInformacionSaldosCuentasPorPagar.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSaldosCuentasPorPagar.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSaldosCuentasPorPagar.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSaldosCuentasPorPagar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSaldosCuentasPorPagar.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSaldosCuentasPorPagar.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSaldosCuentasPorPagar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSaldosCuentasPorPagar.setText("TIPO");       
		this.jComboBoxTiposReportesSaldosCuentasPorPagar.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSaldosCuentasPorPagar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSaldosCuentasPorPagar.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSaldosCuentasPorPagar.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSaldosCuentasPorPagar = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSaldosCuentasPorPagar.setText("Paginacion");
		this.jComboBoxTiposPaginacionSaldosCuentasPorPagar.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSaldosCuentasPorPagar = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSaldosCuentasPorPagar.setText("Accion");
		this.jComboBoxTiposRelacionesSaldosCuentasPorPagar.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSaldosCuentasPorPagar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setText("Accion");
		this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar.setText("Accion");
		this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSaldosCuentasPorPagar=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSaldosCuentasPorPagar.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSaldosCuentasPorPagar.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSaldosCuentasPorPagar.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSaldosCuentasPorPagar = new JLabelMe();
		
		this.jLabelAccionesSaldosCuentasPorPagar.setText("Acciones");		
		this.jLabelAccionesSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSaldosCuentasPorPagar = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSaldosCuentasPorPagar.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSaldosCuentasPorPagar.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSaldosCuentasPorPagar = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSaldosCuentasPorPagar.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSaldosCuentasPorPagar.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSaldosCuentasPorPagar = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSaldosCuentasPorPagar.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSaldosCuentasPorPagar.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSaldosCuentasPorPagar = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSaldosCuentasPorPagar.setText("Graf.");
		this.jCheckBoxConGraficoReporteSaldosCuentasPorPagar.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSaldosCuentasPorPagar = new JButtonMe();
		//this.jButtonAnterioresSaldosCuentasPorPagar.setText("<<");
        this.jButtonAnterioresSaldosCuentasPorPagar.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSaldosCuentasPorPagar,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSaldosCuentasPorPagar = new JButtonMe();
		//this.jButtonSiguientesSaldosCuentasPorPagar.setText(">>");
        this.jButtonSiguientesSaldosCuentasPorPagar.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSaldosCuentasPorPagar,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSaldosCuentasPorPagar.setText("Nue");
        this.jButtonNuevoGuardarCambiosSaldosCuentasPorPagar.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSaldosCuentasPorPagar,"nuevoguardarcambios_button","Nue",this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSaldosCuentasPorPagar";
		inputMap = this.jButtonNuevoGuardarCambiosSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSaldosCuentasPorPagar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSaldosCuentasPorPagar"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSaldosCuentasPorPagar";
		inputMap = this.jButtonRecargarInformacionSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSaldosCuentasPorPagar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSaldosCuentasPorPagar"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSaldosCuentasPorPagar";
		inputMap = this.jButtonSiguientesSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSaldosCuentasPorPagar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSaldosCuentasPorPagar"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSaldosCuentasPorPagar";
		inputMap = this.jButtonAnterioresSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSaldosCuentasPorPagar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSaldosCuentasPorPagar"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSaldosCuentasPorPagar();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSaldosCuentasPorPagar.setMinimumSize(new Dimension(this.getWidth(),SaldosCuentasPorPagarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SaldosCuentasPorPagarBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSaldosCuentasPorPagar.setMaximumSize(new Dimension(this.getWidth(),SaldosCuentasPorPagarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SaldosCuentasPorPagarBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSaldosCuentasPorPagar.setPreferredSize(new Dimension(this.getWidth(),SaldosCuentasPorPagarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SaldosCuentasPorPagarBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSaldosCuentasPorPagar = new GridBagLayout();

			this.jPanelPaginacionSaldosCuentasPorPagar.setLayout(gridaBagLayoutPaginacionSaldosCuentasPorPagar);						
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSaldosCuentasPorPagar.add(this.jButtonAnterioresSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
					
						
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
			
			this.jPanelPaginacionSaldosCuentasPorPagar.add(this.jButtonNuevoGuardarCambiosSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
						
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
			this.jPanelPaginacionSaldosCuentasPorPagar.add(this.jButtonSiguientesSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 1;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldosCuentasPorPagar.add(this.jButtonNuevoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
						
			
			
			if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
				this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 1;
				this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSaldosCuentasPorPagar.add(this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
			}
			
			
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 1;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldosCuentasPorPagar.add(this.jButtonDuplicarSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 1;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldosCuentasPorPagar.add(this.jButtonCopiarSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 1;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldosCuentasPorPagar.add(this.jButtonVerFormSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 1;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSaldosCuentasPorPagar.add(this.jButtonCerrarSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
		
		
		this.jButtonRecargarInformacionSaldosCuentasPorPagar.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSaldosCuentasPorPagar.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSaldosCuentasPorPagar.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSaldosCuentasPorPagar.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSaldosCuentasPorPagar.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSaldosCuentasPorPagar.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSaldosCuentasPorPagar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSaldosCuentasPorPagar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSaldosCuentasPorPagar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSaldosCuentasPorPagar.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSaldosCuentasPorPagar.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSaldosCuentasPorPagar.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSaldosCuentasPorPagar.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSaldosCuentasPorPagar.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSaldosCuentasPorPagar.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSaldosCuentasPorPagar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSaldosCuentasPorPagar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSaldosCuentasPorPagar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSaldosCuentasPorPagar.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSaldosCuentasPorPagar.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSaldosCuentasPorPagar.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSaldosCuentasPorPagar.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSaldosCuentasPorPagar.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSaldosCuentasPorPagar.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSaldosCuentasPorPagar.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSaldosCuentasPorPagar.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSaldosCuentasPorPagar.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSaldosCuentasPorPagar.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSaldosCuentasPorPagar.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSaldosCuentasPorPagar.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSaldosCuentasPorPagar = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSaldosCuentasPorPagar = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SaldosCuentasPorPagar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SaldosCuentasPorPagar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SaldosCuentasPorPagar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SaldosCuentasPorPagar = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSaldosCuentasPorPagar.setLayout(gridaBagParametrosReportesSaldosCuentasPorPagar);
			this.jPanelParametrosReportesAccionesSaldosCuentasPorPagar.setLayout(gridaBagParametrosReportesAccionesSaldosCuentasPorPagar);
			
			
			this.jPanelParametrosAuxiliar1SaldosCuentasPorPagar.setLayout(gridaBagParametrosAuxiliar1SaldosCuentasPorPagar);
			this.jPanelParametrosAuxiliar2SaldosCuentasPorPagar.setLayout(gridaBagParametrosAuxiliar2SaldosCuentasPorPagar);
			this.jPanelParametrosAuxiliar3SaldosCuentasPorPagar.setLayout(gridaBagParametrosAuxiliar3SaldosCuentasPorPagar);
			this.jPanelParametrosAuxiliar4SaldosCuentasPorPagar.setLayout(gridaBagParametrosAuxiliar4SaldosCuentasPorPagar);
			//this.jPanelParametrosAuxiliar5SaldosCuentasPorPagar.setLayout(gridaBagParametrosAuxiliar2SaldosCuentasPorPagar);			
			
			
			
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldosCuentasPorPagar.add(this.jButtonRecargarInformacionSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SaldosCuentasPorPagar.add(this.jComboBoxTiposPaginacionSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SaldosCuentasPorPagar.add(this.jCheckBoxConAltoMaximoTablaSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SaldosCuentasPorPagar.add(this.jComboBoxTiposArchivosReportesSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldosCuentasPorPagar.add(this.jPanelParametrosAuxiliar1SaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SaldosCuentasPorPagar.add(this.jComboBoxTiposReportesSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);																		
			
			
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4SaldosCuentasPorPagar.add(this.jComboBoxTiposGraficosReportesSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldosCuentasPorPagar.add(this.jPanelParametrosAuxiliar4SaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldosCuentasPorPagar.add(this.jComboBoxTiposReportesSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldosCuentasPorPagar.add(this.jCheckBoxGenerarReporteSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldosCuentasPorPagar.add(this.jPanelParametrosAuxiliar2SaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldosCuentasPorPagar.add(this.jLabelAccionesSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
				this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSaldosCuentasPorPagar.add(this.jButtonAbrirOrderBySaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldosCuentasPorPagar.add(this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);			
			
			
			/*
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldosCuentasPorPagar.add(this.jCheckBoxSeleccionarTodosSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldosCuentasPorPagar.add(this.jCheckBoxConGraficoReporteSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SaldosCuentasPorPagar.add(this.jCheckBoxSeleccionarTodosSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);															
				
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SaldosCuentasPorPagar.add(this.jCheckBoxSeleccionadosSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);															
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SaldosCuentasPorPagar.add(this.jCheckBoxConGraficoReporteSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldosCuentasPorPagar.add(this.jPanelParametrosAuxiliar3SaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldosCuentasPorPagar.add(this.jComboBoxTiposAccionesSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSaldosCuentasPorPagar = new GridBagLayout();

			this.jScrollPanelDatosSaldosCuentasPorPagar.setLayout(gridaBagLayoutDatosSaldosCuentasPorPagar);
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
			
			this.jScrollPanelDatosSaldosCuentasPorPagar.add(this.jTableDatosSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSaldosCuentasPorPagar.setViewportView(this.jTableDatosSaldosCuentasPorPagar);
		this.jTableDatosSaldosCuentasPorPagar.setFillsViewportHeight(true);
		this.jTableDatosSaldosCuentasPorPagar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSaldosCuentasPorPagar= new GridBagLayout();
		this.jPanelAccionesSaldosCuentasPorPagar.setLayout(gridaBagLayoutAccionesSaldosCuentasPorPagar);
		
		
		/*	
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
			
		this.jPanelAccionesSaldosCuentasPorPagar.add(this.jButtonNuevoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar= new GridBagLayout();
		gridaBagLayoutBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setLayout(gridaBagLayoutBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar);

		gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
		jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.add(jLabelid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar, gridBagConstraintsSaldosCuentasPorPagar);

		gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
		jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.add(jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar, gridBagConstraintsSaldosCuentasPorPagar);


		gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosCuentasPorPagar.gridy = 1;
		gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
		jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.add(jLabelid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar, gridBagConstraintsSaldosCuentasPorPagar);

		gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosCuentasPorPagar.gridy = 1;
		gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
		jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.add(jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar, gridBagConstraintsSaldosCuentasPorPagar);


		gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosCuentasPorPagar.gridy = 2;
		gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
		jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.add(jLabelid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar, gridBagConstraintsSaldosCuentasPorPagar);

		gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosCuentasPorPagar.gridy = 2;
		gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
		jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.add(jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar, gridBagConstraintsSaldosCuentasPorPagar);


		gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosCuentasPorPagar.gridy = 3;
		gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
		jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.add(jLabelfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar, gridBagConstraintsSaldosCuentasPorPagar);

		gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosCuentasPorPagar.gridy = 3;
		gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
		jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.add(jDateChooserfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar, gridBagConstraintsSaldosCuentasPorPagar);

		gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosCuentasPorPagar.gridy = 4;
		gridBagConstraintsSaldosCuentasPorPagar.gridx =1;
		jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.add(jButtonBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar, gridBagConstraintsSaldosCuentasPorPagar);

		jTabbedPaneBusquedasSaldosCuentasPorPagar.addTab("1.-Por Zona Por Grupo Cliente Por Cliente Por Fecha Emision Hasta ", jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar);
		jTabbedPaneBusquedasSaldosCuentasPorPagar.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSaldosCuentasPorPagar = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSaldosCuentasPorPagar);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();						
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;		
			//this.gridBagConstraintsSaldosCuentasPorPagar.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;		
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSaldosCuentasPorPagar);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;		
			this.gridBagConstraintsSaldosCuentasPorPagar.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);								
		
		
		/*
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		*/		
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx =0;
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSaldosCuentasPorPagar.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
				
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SaldosCuentasPorPagarJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSaldosCuentasPorPagar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSaldosCuentasPorPagar = new GridBagLayout();
			this.jPanelBusquedasParametrosSaldosCuentasPorPagar.setLayout(gridaBagLayoutBusquedasParametrosSaldosCuentasPorPagar);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSaldosCuentasPorPagar=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSaldosCuentasPorPagar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldosCuentasPorPagar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldosCuentasPorPagar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
			
			
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
			
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSaldosCuentasPorPagar;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSaldosCuentasPorPagar() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSaldosCuentasPorPagar = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSaldosCuentasPorPagar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.setName("jPanelReporteDinamicoSaldosCuentasPorPagar"); 
		
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.setLayout(gridaBagLayoutReporteDinamicoSaldosCuentasPorPagar);
		
		
		this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSaldosCuentasPorPagar = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSaldosCuentasPorPagar= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setResizable(true);
	    this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setClosable(true);
	    this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSaldosCuentasPorPagar.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSaldosCuentasPorPagar.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSaldosCuentasPorPagar.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Cuentas Por Pagares"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSaldosCuentasPorPagar = new JLabelMe();

		this.jLabelColumnasSelectReporteSaldosCuentasPorPagar.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jLabelColumnasSelectReporteSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSaldosCuentasPorPagar = new JList<Reporte>();
		this.jListColumnasSelectReporteSaldosCuentasPorPagar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSaldosCuentasPorPagar.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSaldosCuentasPorPagar.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSaldosCuentasPorPagar.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSaldosCuentasPorPagar.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSaldosCuentasPorPagar=new JScrollPane(this.jListColumnasSelectReporteSaldosCuentasPorPagar);
			
			this.jScrollColumnasSelectReporteSaldosCuentasPorPagar.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSaldosCuentasPorPagar.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSaldosCuentasPorPagar.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jListColumnasSelectReporteSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jScrollColumnasSelectReporteSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSaldosCuentasPorPagar = new JLabelMe();

		this.jLabelRelacionesSelectReporteSaldosCuentasPorPagar.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSaldosCuentasPorPagar = new JList<Reporte>();
		this.jListRelacionesSelectReporteSaldosCuentasPorPagar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSaldosCuentasPorPagar.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSaldosCuentasPorPagar.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSaldosCuentasPorPagar.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSaldosCuentasPorPagar.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSaldosCuentasPorPagar=new JScrollPane(this.jListRelacionesSelectReporteSaldosCuentasPorPagar);
			
			this.jScrollRelacionesSelectReporteSaldosCuentasPorPagar.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSaldosCuentasPorPagar.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSaldosCuentasPorPagar.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSaldosCuentasPorPagar = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSaldosCuentasPorPagar = new JComboBoxMe();
		this.jListColumnasValoresGraficoSaldosCuentasPorPagar = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSaldosCuentasPorPagar = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSaldosCuentasPorPagar.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSaldosCuentasPorPagar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSaldosCuentasPorPagar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSaldosCuentasPorPagar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSaldosCuentasPorPagar = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSaldosCuentasPorPagar.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSaldosCuentasPorPagar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSaldosCuentasPorPagar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSaldosCuentasPorPagar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSaldosCuentasPorPagar = new JLabelMe();

		this.jLabelConGraficoDinamicoSaldosCuentasPorPagar.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jLabelConGraficoDinamicoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSaldosCuentasPorPagar = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSaldosCuentasPorPagar.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSaldosCuentasPorPagar.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSaldosCuentasPorPagar.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSaldosCuentasPorPagar.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSaldosCuentasPorPagar.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jCheckBoxConGraficoDinamicoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSaldosCuentasPorPagar = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSaldosCuentasPorPagar.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jLabelColumnaCategoriaGraficoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSaldosCuentasPorPagar = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSaldosCuentasPorPagar.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSaldosCuentasPorPagar.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSaldosCuentasPorPagar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSaldosCuentasPorPagar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSaldosCuentasPorPagar.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jComboBoxColumnaCategoriaGraficoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSaldosCuentasPorPagar = new JLabelMe();

		this.jLabelColumnaCategoriaValorSaldosCuentasPorPagar.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jLabelColumnaCategoriaValorSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSaldosCuentasPorPagar = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSaldosCuentasPorPagar.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSaldosCuentasPorPagar.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSaldosCuentasPorPagar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSaldosCuentasPorPagar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSaldosCuentasPorPagar.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jComboBoxColumnaCategoriaValorSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSaldosCuentasPorPagar = new JLabelMe();

		this.jLabelColumnasValoresGraficoSaldosCuentasPorPagar.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jLabelColumnasValoresGraficoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSaldosCuentasPorPagar = new JList<Reporte>();
		this.jListColumnasValoresGraficoSaldosCuentasPorPagar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSaldosCuentasPorPagar.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSaldosCuentasPorPagar.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSaldosCuentasPorPagar.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSaldosCuentasPorPagar.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSaldosCuentasPorPagar=new JScrollPane(this.jListColumnasValoresGraficoSaldosCuentasPorPagar);
			
			this.jScrollColumnasValoresGraficoSaldosCuentasPorPagar.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSaldosCuentasPorPagar.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSaldosCuentasPorPagar.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jListColumnasSelectReporteSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jScrollColumnasValoresGraficoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSaldosCuentasPorPagar = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSaldosCuentasPorPagar.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jLabelTiposGraficosReportesDinamicoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSaldosCuentasPorPagar = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSaldosCuentasPorPagar.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSaldosCuentasPorPagar.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSaldosCuentasPorPagar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSaldosCuentasPorPagar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSaldosCuentasPorPagar.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jComboBoxTiposGraficosReportesDinamicoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSaldosCuentasPorPagar = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSaldosCuentasPorPagar.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jLabelGenerarExcelReporteDinamicoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSaldosCuentasPorPagar.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSaldosCuentasPorPagar,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSaldosCuentasPorPagar.setToolTipText("Generar EXCEL"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jButtonGenerarExcelReporteDinamicoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jComboBoxTiposReportesDinamicoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSaldosCuentasPorPagar = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSaldosCuentasPorPagar.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jLabelTiposArchivoReporteDinamicoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jComboBoxTiposArchivosReportesDinamicoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSaldosCuentasPorPagar.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSaldosCuentasPorPagar,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSaldosCuentasPorPagar.setToolTipText("Generar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jButtonGenerarReporteDinamicoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSaldosCuentasPorPagar.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSaldosCuentasPorPagar,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSaldosCuentasPorPagar.setToolTipText("Cancelar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldosCuentasPorPagar.add(this.jButtonCerrarReporteDinamicoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSaldosCuentasPorPagar = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSaldosCuentasPorPagar= new JScrollPane(jPanelReporteDinamicoSaldosCuentasPorPagar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSaldosCuentasPorPagar.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSaldosCuentasPorPagar.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSaldosCuentasPorPagar.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Cuentas Por Pagares"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSaldosCuentasPorPagar);
		this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getContentPane().add(this.jScrollPanelReporteDinamicoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSaldosCuentasPorPagar() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSaldosCuentasPorPagar = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSaldosCuentasPorPagar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSaldosCuentasPorPagar.setName("jPanelImportacionSaldosCuentasPorPagar"); 
		
		this.jPanelImportacionSaldosCuentasPorPagar.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSaldosCuentasPorPagar.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSaldosCuentasPorPagar.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSaldosCuentasPorPagar.setLayout(gridaBagLayoutImportacionSaldosCuentasPorPagar);
		
		
		this.jInternalFrameImportacionSaldosCuentasPorPagar= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSaldosCuentasPorPagar= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSaldosCuentasPorPagar = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSaldosCuentasPorPagar= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSaldosCuentasPorPagar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSaldosCuentasPorPagar.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSaldosCuentasPorPagar.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSaldosCuentasPorPagar.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSaldosCuentasPorPagar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSaldosCuentasPorPagar.setResizable(true);
	    this.jInternalFrameImportacionSaldosCuentasPorPagar.setClosable(true);
	    this.jInternalFrameImportacionSaldosCuentasPorPagar.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSaldosCuentasPorPagar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSaldosCuentasPorPagar.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSaldosCuentasPorPagar.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSaldosCuentasPorPagar.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSaldosCuentasPorPagar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSaldosCuentasPorPagar.setResizable(true);
	    this.jInternalFrameImportacionSaldosCuentasPorPagar.setClosable(true);
	    this.jInternalFrameImportacionSaldosCuentasPorPagar.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSaldosCuentasPorPagar.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSaldosCuentasPorPagar.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSaldosCuentasPorPagar.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Cuentas Por Pagares"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSaldosCuentasPorPagar = new JLabelMe();

		this.jLabelArchivoImportacionSaldosCuentasPorPagar.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYImportacion;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSaldosCuentasPorPagar.add(this.jLabelArchivoImportacionSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSaldosCuentasPorPagar = new JFileChooser();		
		this.jFileChooserImportacionSaldosCuentasPorPagar.setToolTipText("ESCOGER ARCHIVO"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonAbrirImportacionSaldosCuentasPorPagar.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSaldosCuentasPorPagar,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSaldosCuentasPorPagar.setToolTipText("Generar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldosCuentasPorPagar.add(this.jButtonAbrirImportacionSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSaldosCuentasPorPagar = new JLabelMe();

		this.jLabelPathArchivoImportacionSaldosCuentasPorPagar.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYImportacion;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSaldosCuentasPorPagar.add(this.jLabelPathArchivoImportacionSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSaldosCuentasPorPagar=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSaldosCuentasPorPagar.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSaldosCuentasPorPagar.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSaldosCuentasPorPagar.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldosCuentasPorPagar.add(this.jTextFieldPathArchivoImportacionSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonGenerarImportacionSaldosCuentasPorPagar.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSaldosCuentasPorPagar,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSaldosCuentasPorPagar.setToolTipText("Generar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldosCuentasPorPagar.add(this.jButtonGenerarImportacionSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonCerrarImportacionSaldosCuentasPorPagar.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSaldosCuentasPorPagar,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSaldosCuentasPorPagar.setToolTipText("Cancelar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldosCuentasPorPagar.add(this.jButtonCerrarImportacionSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSaldosCuentasPorPagar = new GridBagLayout();
		
		this.jScrollPanelImportacionSaldosCuentasPorPagar= new JScrollPane(jPanelImportacionSaldosCuentasPorPagar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy =iPosYImportacion;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx =iPosXImportacion;
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSaldosCuentasPorPagar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSaldosCuentasPorPagar.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSaldosCuentasPorPagar);
		this.jInternalFrameImportacionSaldosCuentasPorPagar.getContentPane().add(this.jScrollPanelImportacionSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySaldosCuentasPorPagar(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySaldosCuentasPorPagar = new JButtonMe();
			this.jButtonAbrirOrderBySaldosCuentasPorPagar.setText("Orden");
			this.jButtonAbrirOrderBySaldosCuentasPorPagar.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySaldosCuentasPorPagar,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySaldosCuentasPorPagar";
			inputMap = this.jButtonAbrirOrderBySaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySaldosCuentasPorPagar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySaldosCuentasPorPagar"));
		
		
			GridBagLayout gridaBagLayoutOrderBySaldosCuentasPorPagar = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySaldosCuentasPorPagar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySaldosCuentasPorPagar.setName("jPanelOrderBySaldosCuentasPorPagar"); 
			
			this.jPanelOrderBySaldosCuentasPorPagar.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySaldosCuentasPorPagar.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySaldosCuentasPorPagar.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySaldosCuentasPorPagar.setLayout(gridaBagLayoutOrderBySaldosCuentasPorPagar);
			
			
			this.jTableDatosSaldosCuentasPorPagarOrderBy = new JTableMe();        
			this.jTableDatosSaldosCuentasPorPagarOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSaldosCuentasPorPagarOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSaldosCuentasPorPagarOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSaldosCuentasPorPagarOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSaldosCuentasPorPagarOrderBy.setViewportView(this.jTableDatosSaldosCuentasPorPagarOrderBy);
			this.jTableDatosSaldosCuentasPorPagarOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSaldosCuentasPorPagarOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySaldosCuentasPorPagar= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySaldosCuentasPorPagar= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySaldosCuentasPorPagar = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSaldosCuentasPorPagar= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySaldosCuentasPorPagar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySaldosCuentasPorPagar.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySaldosCuentasPorPagar.setTitle("Orden");
			this.jInternalFrameOrderBySaldosCuentasPorPagar.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySaldosCuentasPorPagar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySaldosCuentasPorPagar.setResizable(true);
			this.jInternalFrameOrderBySaldosCuentasPorPagar.setClosable(true);
			this.jInternalFrameOrderBySaldosCuentasPorPagar.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySaldosCuentasPorPagar.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySaldosCuentasPorPagar.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySaldosCuentasPorPagar.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Cuentas Por Pagares"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx =iPosXOrderBy;
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSaldosCuentasPorPagar.ipady =150;
				
			this.jPanelOrderBySaldosCuentasPorPagar.add(jScrollPanelDatosSaldosCuentasPorPagarOrderBy, this.gridBagConstraintsSaldosCuentasPorPagar);//this.jTableDatosSaldosCuentasPorPagarTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySaldosCuentasPorPagar = new JButtonMe();
			this.jButtonCerrarOrderBySaldosCuentasPorPagar.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySaldosCuentasPorPagar,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySaldosCuentasPorPagar.setToolTipText("Cancelar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySaldosCuentasPorPagar.add(this.jButtonCerrarOrderBySaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSaldosCuentasPorPagar = new GridBagLayout();
			
			this.jScrollPanelOrderBySaldosCuentasPorPagar= new JScrollPane(jPanelOrderBySaldosCuentasPorPagar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy =iPosYOrderBy;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx =iPosXOrderBy;
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySaldosCuentasPorPagar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySaldosCuentasPorPagar.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSaldosCuentasPorPagar);
			
			this.jInternalFrameOrderBySaldosCuentasPorPagar.getContentPane().add(this.jScrollPanelOrderBySaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);			
		
		} else {
			this.jButtonAbrirOrderBySaldosCuentasPorPagar = new JButtonMe();
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
		int iWidthTableCalculado=0;//2230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.saldoscuentasporpagarSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosSaldosCuentasPorPagar.getRowHeight();//SaldosCuentasPorPagarConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SaldosCuentasPorPagarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSaldosCuentasPorPagar.isSelected()) {
					iHeightTable=SaldosCuentasPorPagarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SaldosCuentasPorPagarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SaldosCuentasPorPagarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SaldosCuentasPorPagarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSaldosCuentasPorPagar.isSelected()) {
					iHeightTable=SaldosCuentasPorPagarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SaldosCuentasPorPagarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SaldosCuentasPorPagarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSaldosCuentasPorPagar.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSaldosCuentasPorPagar.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSaldosCuentasPorPagar.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSaldosCuentasPorPagar.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSaldosCuentasPorPagar.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSaldosCuentasPorPagar.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySaldosCuentasPorPagar!=null && this.jInternalFrameOrderBySaldosCuentasPorPagar.getjTableDatosOrderBy()!=null) {
			//if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySaldosCuentasPorPagar.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySaldosCuentasPorPagar.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySaldosCuentasPorPagar.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySaldosCuentasPorPagar.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySaldosCuentasPorPagar.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySaldosCuentasPorPagar.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySaldosCuentasPorPagar.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSaldosCuentasPorPagar.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSaldosCuentasPorPagar.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSaldosCuentasPorPagar.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=saldoscuentasporpagars.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SaldosCuentasPorPagar> TraerSaldosCuentasPorPagarBeans(List<SaldosCuentasPorPagar> saldoscuentasporpagars,ArrayList<Classe> classes)throws Exception {
		try {
			for(SaldosCuentasPorPagar saldoscuentasporpagar:saldoscuentasporpagars) {
					
				if(!(SaldosCuentasPorPagarConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SaldosCuentasPorPagarConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					saldoscuentasporpagar.setsDetalleGeneralEntityReporte(SaldosCuentasPorPagarConstantesFunciones.getSaldosCuentasPorPagarDescripcion(saldoscuentasporpagar));
										
						
					
						
					
				} else  {
							
					//saldoscuentasporpagar.setsDetalleGeneralEntityReporte(saldoscuentasporpagar.getsDetalleGeneralEntityReporte());
										
				}
				
				//saldoscuentasporpagarbeans.add(saldoscuentasporpagarbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return saldoscuentasporpagars;
    }
	//PARA REPORTES FIN
}
