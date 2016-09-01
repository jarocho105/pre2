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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.OrdenProduConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class OrdenProduJInternalFrame extends OrdenProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarOrdenProdu;
	
	protected JMenuBar jmenuBarOrdenProdu;
	
	protected JMenu jmenuOrdenProdu;
	protected JMenu jmenuDatosOrdenProdu;
	protected JMenu jmenuArchivoOrdenProdu;
	protected JMenu jmenuAccionesOrdenProdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutOrdenProdu;	
	protected GridBagConstraints gridBagConstraintsOrdenProdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public OrdenProduDetalleFormJInternalFrame jInternalFrameDetalleFormOrdenProdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoOrdenProdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionOrdenProdu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoPrioridadEmpresaProduBeanSwingJInternalFrame tipoprioridadempresaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprioridadempresaprodu="";

	protected EmpleadoBeanSwingJInternalFrame empleadoresponsableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadoresponsable="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected EstadoOrdenProduBeanSwingJInternalFrame estadoordenproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoordenprodu="";
	
	public OrdenProduSessionBean ordenproduSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoPrioridadEmpresaProduSessionBean tipoprioridadempresaproduSessionBean;
	public EmpleadoSessionBean empleadoresponsableSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public EstadoOrdenProduSessionBean estadoordenproduSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<OrdenProdu> ordenprodus;		
	public List<OrdenProdu> ordenprodusEliminados;	
	public List<OrdenProdu> ordenprodusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByOrdenProdu;		
	protected JButton jButtonAbrirOrderByOrdenProdu;
	
	
	//protected JPanel jPanelOrderByOrdenProdu;
	//public JScrollPane jScrollPanelOrderByOrdenProdu;	
	//protected JButton jButtonCerrarOrderByOrdenProdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public OrdenProduLogic ordenproduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosOrdenProdu;
	public JScrollPane jScrollPanelDatosEdicionOrdenProdu;
	public JScrollPane jScrollPanelDatosGeneralOrdenProdu;
    
	
	
	//public JScrollPane jScrollPanelDatosOrdenProduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoOrdenProdu;
	//public JScrollPane jScrollPanelImportacionOrdenProdu;
	
	
	
	protected JPanel jPanelAccionesOrdenProdu;
	
    protected JPanel jPanelPaginacionOrdenProdu;
    protected JPanel jPanelParametrosReportesOrdenProdu;
	protected JPanel jPanelParametrosReportesAccionesOrdenProdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1OrdenProdu;
	protected JPanel jPanelParametrosAuxiliar2OrdenProdu;
	protected JPanel jPanelParametrosAuxiliar3OrdenProdu;
	protected JPanel jPanelParametrosAuxiliar4OrdenProdu;
	//protected JPanel jPanelParametrosAuxiliar5OrdenProdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoOrdenProdu;
	//protected JPanel jPanelImportacionOrdenProdu;
	
	
	public JTable jTableDatosOrdenProdu;
	
	
	
	//public JTable jTableDatosOrdenProduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoOrdenProdu;
	protected JButton jButtonDuplicarOrdenProdu;
	protected JButton jButtonCopiarOrdenProdu;
	protected JButton jButtonVerFormOrdenProdu;
	protected JButton jButtonNuevoRelacionesOrdenProdu;
	protected JButton jButtonModificarOrdenProdu;
	
    protected JButton jButtonGuardarCambiosTablaOrdenProdu;
	protected JButton jButtonCerrarOrdenProdu;
	
	
	protected JButton jButtonRecargarInformacionOrdenProdu;
	protected JButton jButtonProcesarInformacionOrdenProdu;
	
	
	protected JButton jButtonAnterioresOrdenProdu;
	protected JButton jButtonSiguientesOrdenProdu;
	protected JButton jButtonNuevoGuardarCambiosOrdenProdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoOrdenProdu;
	//protected JButton jButtonCerrarReporteDinamicoOrdenProdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoOrdenProdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionOrdenProdu;
	//protected JButton jButtonGenerarImportacionOrdenProdu;
	//protected JButton jButtonCerrarImportacionOrdenProdu;
	//protected JFileChooser jFileChooserImportacionOrdenProdu;
	//protected File fileImportacionOrdenProdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarOrdenProdu;
	protected JButton jButtonDuplicarToolBarOrdenProdu;
	protected JButton jButtonNuevoRelacionesToolBarOrdenProdu;
	
	
	public JButton jButtonGuardarCambiosToolBarOrdenProdu;
	protected JButton jButtonCopiarToolBarOrdenProdu;
	protected JButton jButtonVerFormToolBarOrdenProdu;
	public JButton jButtonGuardarCambiosTablaToolBarOrdenProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarOrdenProdu;
	protected JButton jButtonCerrarToolBarOrdenProdu;
	
	protected JButton jButtonRecargarInformacionToolBarOrdenProdu;
	protected JButton jButtonProcesarInformacionToolBarOrdenProdu;
	protected JButton jButtonAnterioresToolBarOrdenProdu;
	protected JButton jButtonSiguientesToolBarOrdenProdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarOrdenProdu;
	protected JButton jButtonAbrirOrderByToolBarOrdenProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoOrdenProdu;
	protected JMenuItem jMenuItemDuplicarOrdenProdu;
	protected JMenuItem jMenuItemNuevoRelacionesOrdenProdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosOrdenProdu;
	protected JMenuItem jMenuItemCopiarOrdenProdu;
	protected JMenuItem jMenuItemVerFormOrdenProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaOrdenProdu;
	protected JMenuItem jMenuItemCerrarOrdenProdu;
	protected JMenuItem jMenuItemDetalleCerrarOrdenProdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByOrdenProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarOrdenProdu;
	
	protected JMenuItem jMenuItemRecargarInformacionOrdenProdu;
	protected JMenuItem jMenuItemProcesarInformacionOrdenProdu;
	protected JMenuItem jMenuItemAnterioresOrdenProdu;
	protected JMenuItem jMenuItemSiguientesOrdenProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosOrdenProdu;
	protected JMenuItem jMenuItemAbrirOrderByOrdenProdu;
	protected JMenuItem jMenuItemMostrarOcultarOrdenProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesOrdenProdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosOrdenProdu;
	protected JCheckBox jCheckBoxSeleccionadosOrdenProdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaOrdenProdu;
	protected JCheckBox jCheckBoxConGraficoReporteOrdenProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesOrdenProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesOrdenProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoOrdenProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoOrdenProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesOrdenProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionOrdenProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesOrdenProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesOrdenProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarOrdenProdu;
	protected JTextField jTextFieldValorCampoGeneralOrdenProdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteOrdenProdu;
	//public JList<Reporte> jListColumnasSelectReporteOrdenProdu;
	//public JScrollPane jScrollColumnasSelectReporteOrdenProdu;
	
	//public JLabel jLabelRelacionesSelectReporteOrdenProdu;
	//public JList<Reporte> jListRelacionesSelectReporteOrdenProdu;
	//public JScrollPane jScrollRelacionesSelectReporteOrdenProdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoOrdenProdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoOrdenProdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoOrdenProdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoOrdenProdu;
	
		
	//public JLabel jLabelArchivoImportacionOrdenProdu;	
	//public JLabel jLabelPathArchivoImportacionOrdenProdu;
	//protected JTextField jTextFieldPathArchivoImportacionOrdenProdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoOrdenProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoOrdenProdu;
	
	//public JLabel jLabelColumnaCategoriaValorOrdenProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorOrdenProdu;
	
	//public JLabel jLabelColumnasValoresGraficoOrdenProdu;
	//public JList<Reporte> jListColumnasValoresGraficoOrdenProdu;
	//public JScrollPane jScrollColumnasValoresGraficoOrdenProdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoOrdenProdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoOrdenProdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasOrdenProdu;
	public JPanel jPanelFK_IdClienteOrdenProdu;
	public JButton jButtonFK_IdClienteOrdenProdu;
	public JPanel jPanelFK_IdEmpleadoResponsableOrdenProdu;
	public JButton jButtonFK_IdEmpleadoResponsableOrdenProdu;
	public JPanel jPanelFK_IdEstadoOrdenProduOrdenProdu;
	public JButton jButtonFK_IdEstadoOrdenProduOrdenProdu;
	public JPanel jPanelFK_IdFormatoOrdenProdu;
	public JButton jButtonFK_IdFormatoOrdenProdu;
	public JPanel jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu;
	public JButton jButtonFK_IdTipoPrioridadEmpresaProduOrdenProdu;
	
	public JPanel jPanelid_clienteFK_IdClienteOrdenProdu;
	public JLabel jLabelid_clienteFK_IdClienteOrdenProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteOrdenProdu;
	public JButton jButtonid_clienteFK_IdClienteOrdenProdu= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteOrdenProduUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteOrdenProduBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteOrdenProdu;
	
	public JPanel jPanelid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu;
	public JLabel jLabelid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu;
	public JButton jButtonid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu= new JButtonMe();
	public JButton jButtonid_empleado_responsableFK_IdEmpleadoResponsableOrdenProduUpdate= new JButtonMe();
	public JButton jButtonid_empleado_responsableFK_IdEmpleadoResponsableOrdenProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu;
	public JLabel jLabelid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu;
	public JButton jButtonid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu= new JButtonMe();
	public JButton jButtonid_estado_orden_produFK_IdEstadoOrdenProduOrdenProduUpdate= new JButtonMe();
	public JButton jButtonid_estado_orden_produFK_IdEstadoOrdenProduOrdenProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formatoFK_IdFormatoOrdenProdu;
	public JLabel jLabelid_formatoFK_IdFormatoOrdenProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFK_IdFormatoOrdenProdu;
	public JButton jButtonid_formatoFK_IdFormatoOrdenProdu= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoOrdenProduUpdate= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoOrdenProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu;
	public JLabel jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu;
	public JButton jButtonid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu= new JButtonMe();
	public JButton jButtonid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProduUpdate= new JButtonMe();
	public JButton jButtonid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProduBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public OrdenProduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("OrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenProduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("OrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenProduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("OrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenProduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("OrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionOrdenProdu)	{
		this.jButtonRecargarInformacionOrdenProdu = jButtonRecargarInformacionOrdenProdu;
	}
	
	public JButton getjButtonProcesarInformacionOrdenProdu() {
		return this.jButtonProcesarInformacionOrdenProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionOrdenProdu)	{
		this.jButtonProcesarInformacionOrdenProdu = jButtonProcesarInformacionOrdenProdu;
	}
	
	
	public JButton getjButtonRecargarInformacionOrdenProdu() {
		return this.jButtonRecargarInformacionOrdenProdu;
	}
	
	
	public List<OrdenProdu> getordenprodus() {
		return this.ordenprodus;
	}

	public void setordenprodus(List<OrdenProdu> ordenprodus) {
		this.ordenprodus = ordenprodus;
	}
	
	public List<OrdenProdu> getordenprodusAux() {
		return this.ordenprodusAux;
	}

	public void setordenprodusAux(List<OrdenProdu> ordenprodusAux) {
		this.ordenprodusAux = ordenprodusAux;
	}
	
	public List<OrdenProdu> getordenprodusEliminados() {
		return this.ordenprodusEliminados;
	}

	public void setOrdenProdusEliminados(List<OrdenProdu> ordenprodusEliminados) {
		this.ordenprodusEliminados = ordenprodusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarOrdenProdu() {
		return jComboBoxTiposSeleccionarOrdenProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarOrdenProdu(
			JComboBox jComboBoxTiposSeleccionarOrdenProdu) {
		this.jComboBoxTiposSeleccionarOrdenProdu = jComboBoxTiposSeleccionarOrdenProdu;
	}
	
	public void setBorderResaltarTiposSeleccionarOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarOrdenProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarOrdenProdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralOrdenProdu() {
		return jTextFieldValorCampoGeneralOrdenProdu;
	}

	public void setjTextFieldValorCampoGeneralOrdenProdu(
			JTextField jTextFieldValorCampoGeneralOrdenProdu) {
		this.jTextFieldValorCampoGeneralOrdenProdu = jTextFieldValorCampoGeneralOrdenProdu;
	}

	public void setBorderResaltarValorCampoGeneralOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenProdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralOrdenProdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosOrdenProdu() {
		return this.jCheckBoxSeleccionarTodosOrdenProdu;
	}

	public void setjCheckBoxSeleccionarTodosOrdenProdu(
			JCheckBox jCheckBoxSeleccionarTodosOrdenProdu) {
		this.jCheckBoxSeleccionarTodosOrdenProdu = jCheckBoxSeleccionarTodosOrdenProdu;
	}

	public void setBorderResaltarSeleccionarTodosOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosOrdenProdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosOrdenProdu() {
		return this.jCheckBoxSeleccionadosOrdenProdu;
	}

	public void setjCheckBoxSeleccionadosOrdenProdu(
			JCheckBox jCheckBoxSeleccionadosOrdenProdu) {
		this.jCheckBoxSeleccionadosOrdenProdu = jCheckBoxSeleccionadosOrdenProdu;
	}
	
	public void setBorderResaltarSeleccionadosOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosOrdenProdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesOrdenProdu() {
		return this.jComboBoxTiposArchivosReportesOrdenProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesOrdenProdu(
			JComboBox jComboBoxTiposArchivosReportesOrdenProdu) {
		this.jComboBoxTiposArchivosReportesOrdenProdu = jComboBoxTiposArchivosReportesOrdenProdu;
	}

	public void setBorderResaltarTiposArchivosReportesOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesOrdenProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesOrdenProdu() {
		return this.jComboBoxTiposReportesOrdenProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesOrdenProdu(
			JComboBox jComboBoxTiposReportesOrdenProdu) {
		this.jComboBoxTiposReportesOrdenProdu = jComboBoxTiposReportesOrdenProdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoOrdenProdu() {
	//	return jComboBoxTiposReportesDinamicoOrdenProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoOrdenProdu(
	//		JComboBox jComboBoxTiposReportesDinamicoOrdenProdu) {
	//	this.jComboBoxTiposReportesDinamicoOrdenProdu = jComboBoxTiposReportesDinamicoOrdenProdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoOrdenProdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoOrdenProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoOrdenProdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoOrdenProdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoOrdenProdu = jComboBoxTiposArchivosReportesDinamicoOrdenProdu;
	//}
	
	public void setBorderResaltarTiposReportesOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesOrdenProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesOrdenProdu() {
		return this.jComboBoxTiposGraficosReportesOrdenProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesOrdenProdu(
			JComboBox jComboBoxTiposGraficosReportesOrdenProdu) {
		this.jComboBoxTiposGraficosReportesOrdenProdu = jComboBoxTiposGraficosReportesOrdenProdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesOrdenProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionOrdenProdu() {
		return this.jComboBoxTiposPaginacionOrdenProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionOrdenProdu(
			JComboBox jComboBoxTiposPaginacionOrdenProdu) {
		this.jComboBoxTiposPaginacionOrdenProdu = jComboBoxTiposPaginacionOrdenProdu;
	}
	
	public void setBorderResaltarTiposPaginacionOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionOrdenProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesOrdenProdu() {
		return this.jComboBoxTiposRelacionesOrdenProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesOrdenProdu() {
		return this.jComboBoxTiposAccionesOrdenProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesOrdenProdu(
			JComboBox jComboBoxTiposRelacionesOrdenProdu) {
		this.jComboBoxTiposRelacionesOrdenProdu = jComboBoxTiposRelacionesOrdenProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesOrdenProdu(
			JComboBox jComboBoxTiposAccionesOrdenProdu) {
		this.jComboBoxTiposAccionesOrdenProdu = jComboBoxTiposAccionesOrdenProdu;
	}
	
	public void setBorderResaltarTiposRelacionesOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesOrdenProdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesOrdenProdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoOrdenProdu() {
	//	return jCheckBoxConGraficoDinamicoOrdenProdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoOrdenProdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoOrdenProdu) {
	//	this.jCheckBoxConGraficoDinamicoOrdenProdu = jCheckBoxConGraficoDinamicoOrdenProdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoOrdenProdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarOrdenProdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoOrdenProdu .setBorder(borderResaltar);		
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
		this.ordenproduSessionBean=new OrdenProduSessionBean();
		
		this.ordenproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ordenproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ordenproduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=OrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=OrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		OrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		OrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		OrdenProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Orden Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
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
		
		OrdenProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("OrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarOrdenProdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarOrdenProdu,this.jTtoolBarOrdenProdu,
							"nuevo","nuevo","Nuevo"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarOrdenProdu,this.jTtoolBarOrdenProdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarOrdenProdu,this.jTtoolBarOrdenProdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarOrdenProdu,this.jTtoolBarOrdenProdu,
							"duplicar","duplicar","Duplicar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarOrdenProdu,this.jTtoolBarOrdenProdu,
							"copiar","copiar","Copiar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarOrdenProdu,this.jTtoolBarOrdenProdu,
							"ver_form","ver_form","Ver"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarOrdenProdu,this.jTtoolBarOrdenProdu,
							"recargar","recargar","Recargar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarOrdenProdu,this.jTtoolBarOrdenProdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarOrdenProdu,this.jTtoolBarOrdenProdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarOrdenProdu,this.jTtoolBarOrdenProdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarOrdenProdu,this.jTtoolBarOrdenProdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarOrdenProdu,this.jTtoolBarOrdenProdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarOrdenProdu,this.jTtoolBarOrdenProdu,
							"cerrar","cerrar","Salir"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarOrdenProdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarOrdenProdu;
			
				this.jButtonProcesarInformacionToolBarOrdenProdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarOrdenProdu;
				
		//protected JButton jButtonModificarToolBarOrdenProdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarOrdenProdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuOrdenProdu=new JMenuMe("General");
		this.jmenuArchivoOrdenProdu=new JMenuMe("Archivo");
		this.jmenuAccionesOrdenProdu=new JMenuMe("Acciones");
		this.jmenuDatosOrdenProdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoOrdenProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoOrdenProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoOrdenProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarOrdenProdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarOrdenProdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarOrdenProdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesOrdenProdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesOrdenProdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesOrdenProdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosOrdenProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosOrdenProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosOrdenProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarOrdenProdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarOrdenProdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarOrdenProdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormOrdenProdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormOrdenProdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormOrdenProdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaOrdenProdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaOrdenProdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaOrdenProdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarOrdenProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarOrdenProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarOrdenProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionOrdenProdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionOrdenProdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionOrdenProdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionOrdenProdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionOrdenProdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionOrdenProdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresOrdenProdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresOrdenProdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresOrdenProdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesOrdenProdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesOrdenProdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesOrdenProdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByOrdenProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByOrdenProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByOrdenProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarOrdenProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarOrdenProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarOrdenProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByOrdenProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByOrdenProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByOrdenProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarOrdenProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarOrdenProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarOrdenProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosOrdenProdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosOrdenProdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosOrdenProdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoOrdenProdu.add(this.jMenuItemCerrarOrdenProdu);
			
			this.jmenuAccionesOrdenProdu.add(this.jMenuItemNuevoOrdenProdu);
			this.jmenuAccionesOrdenProdu.add(this.jMenuItemNuevoGuardarCambiosOrdenProdu);
			this.jmenuAccionesOrdenProdu.add(this.jMenuItemNuevoRelacionesOrdenProdu);
			this.jmenuAccionesOrdenProdu.add(this.jMenuItemGuardarCambiosTablaOrdenProdu);		
			this.jmenuAccionesOrdenProdu.add(this.jMenuItemDuplicarOrdenProdu);		
			this.jmenuAccionesOrdenProdu.add(this.jMenuItemCopiarOrdenProdu);		
			this.jmenuAccionesOrdenProdu.add(this.jMenuItemVerFormOrdenProdu);		
			
			this.jmenuDatosOrdenProdu.add(this.jMenuItemRecargarInformacionOrdenProdu);				
			this.jmenuDatosOrdenProdu.add(this.jMenuItemAnterioresOrdenProdu);				
			this.jmenuDatosOrdenProdu.add(this.jMenuItemSiguientesOrdenProdu);				
			this.jmenuDatosOrdenProdu.add(this.jMenuItemAbrirOrderByOrdenProdu);				
			this.jmenuDatosOrdenProdu.add(this.jMenuItemMostrarOcultarOrdenProdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesOrdenProdu.add(this.jMenuItemGuardarCambiosOrdenProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarOrdenProdu.add(this.jmenuArchivoOrdenProdu);		
			this.jmenuBarOrdenProdu.add(this.jmenuAccionesOrdenProdu);		
			this.jmenuBarOrdenProdu.add(this.jmenuDatosOrdenProdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarOrdenProdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasOrdenProdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteOrdenProdu.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteOrdenProdu= new JButtonMe();
		this.jButtonFK_IdClienteOrdenProdu.setText("Buscar");
		this.jButtonFK_IdClienteOrdenProdu.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteOrdenProdu,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteOrdenProdu = new JLabelMe();
		jLabelid_clienteFK_IdClienteOrdenProdu.setText("Cliente :");
		jLabelid_clienteFK_IdClienteOrdenProdu.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteOrdenProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteOrdenProdu= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteOrdenProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteOrdenProdu= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteOrdenProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteOrdenProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteOrdenProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteOrdenProdu.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteOrdenProdu.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteOrdenProdu.setFocusable(false);

		this.jPanelFK_IdEmpleadoResponsableOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoResponsableOrdenProdu.setToolTipText("Buscar Por Empleado Responsable ");
		this.jButtonFK_IdEmpleadoResponsableOrdenProdu= new JButtonMe();
		this.jButtonFK_IdEmpleadoResponsableOrdenProdu.setText("Buscar");
		this.jButtonFK_IdEmpleadoResponsableOrdenProdu.setToolTipText("Buscar Por Empleado Responsable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoResponsableOrdenProdu,"buscar_button","Buscar Por Empleado Responsable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoResponsableOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu = new JLabelMe();
		jLabelid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.setText("Empleado Responsable :");
		jLabelid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.setToolTipText("Empleado Responsable");
		jLabelid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu= new JComboBoxMe();
		jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoOrdenProduOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoOrdenProduOrdenProdu.setToolTipText("Buscar Por Estado Orden Produ ");
		this.jButtonFK_IdEstadoOrdenProduOrdenProdu= new JButtonMe();
		this.jButtonFK_IdEstadoOrdenProduOrdenProdu.setText("Buscar");
		this.jButtonFK_IdEstadoOrdenProduOrdenProdu.setToolTipText("Buscar Por Estado Orden Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoOrdenProduOrdenProdu,"buscar_button","Buscar Por Estado Orden Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoOrdenProduOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu = new JLabelMe();
		jLabelid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.setText("Estado Orden Produ :");
		jLabelid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.setToolTipText("Estado Orden Produ");
		jLabelid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu= new JComboBoxMe();
		jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoOrdenProdu.setToolTipText("Buscar Por Formato ");
		this.jButtonFK_IdFormatoOrdenProdu= new JButtonMe();
		this.jButtonFK_IdFormatoOrdenProdu.setText("Buscar");
		this.jButtonFK_IdFormatoOrdenProdu.setToolTipText("Buscar Por Formato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoOrdenProdu,"buscar_button","Buscar Por Formato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formatoFK_IdFormatoOrdenProdu = new JLabelMe();
		jLabelid_formatoFK_IdFormatoOrdenProdu.setText("Formato :");
		jLabelid_formatoFK_IdFormatoOrdenProdu.setToolTipText("Formato");
		jLabelid_formatoFK_IdFormatoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFK_IdFormatoOrdenProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formatoFK_IdFormatoOrdenProdu= new JComboBoxMe();
		jComboBoxid_formatoFK_IdFormatoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFK_IdFormatoOrdenProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu.setToolTipText("Buscar Por Tipo Priorad Empresa Produ ");
		this.jButtonFK_IdTipoPrioridadEmpresaProduOrdenProdu= new JButtonMe();
		this.jButtonFK_IdTipoPrioridadEmpresaProduOrdenProdu.setText("Buscar");
		this.jButtonFK_IdTipoPrioridadEmpresaProduOrdenProdu.setToolTipText("Buscar Por Tipo Priorad Empresa Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrioridadEmpresaProduOrdenProdu,"buscar_button","Buscar Por Tipo Priorad Empresa Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrioridadEmpresaProduOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu = new JLabelMe();
		jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.setText("Tipo Priorad Empresa Produ :");
		jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.setToolTipText("Tipo Priorad Empresa Produ");
		jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu= new JComboBoxMe();
		jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasOrdenProdu=new JTabbedPane();


		this.jTabbedPaneBusquedasOrdenProdu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasOrdenProdu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasOrdenProdu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasOrdenProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasOrdenProdu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleOrdenProdu = new OrdenProduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Orden Produccion DATOS");
			this.jInternalFrameDetalleFormOrdenProdu = new OrdenProduDetalleFormJInternalFrame(jDesktopPane,this.ordenproduSessionBean.getConGuardarRelaciones(),this.ordenproduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormOrdenProdu = null;//new OrdenProduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutOrdenProdu= new GridBagLayout();
		
		
		this.jTableDatosOrdenProdu = new JTableMe();      
		
		String sToolTipOrdenProdu="";
		sToolTipOrdenProdu=OrdenProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipOrdenProdu+="(Produccion.OrdenProdu)";
		}
		
		if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipOrdenProdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosOrdenProdu.setToolTipText(sToolTipOrdenProdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosOrdenProdu);
		this.jTableDatosOrdenProdu.setAutoCreateRowSorter(true);
		this.jTableDatosOrdenProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosOrdenProdu.setRowSelectionAllowed(true);
		this.jTableDatosOrdenProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosOrdenProdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoOrdenProdu = new JButtonMe();
		this.jButtonDuplicarOrdenProdu = new JButtonMe();
		this.jButtonCopiarOrdenProdu = new JButtonMe();
		this.jButtonVerFormOrdenProdu = new JButtonMe();
		this.jButtonNuevoRelacionesOrdenProdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaOrdenProdu = new JButtonMe();
		this.jButtonCerrarOrdenProdu = new JButtonMe();
		
		this.jScrollPanelDatosOrdenProdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralOrdenProdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Orden Produccion";
		
		if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosOrdenProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesOrdenProdu.setToolTipText("Acciones");
        this.jPanelAccionesOrdenProdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoOrdenProdu=new ReporteDinamicoJInternalFrame(OrdenProduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoOrdenProdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionOrdenProdu=new ImportacionJInternalFrame(OrdenProduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionOrdenProdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByOrdenProdu = new JButtonMe();
		
		this.jButtonAbrirOrderByOrdenProdu.setText("Orden");
		this.jButtonAbrirOrderByOrdenProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByOrdenProdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByOrdenProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByOrdenProdu,false,this);
			
			//this.cargarOrderByOrdenProdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByOrdenProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByOrdenProdu,true,this);
			
			//this.cargarOrderByOrdenProdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosOrdenProdu.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosOrdenProdu.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosOrdenProdu.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosOrdenProdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosOrdenProdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosOrdenProdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoOrdenProdu.setText("Nuevo");
		this.jButtonDuplicarOrdenProdu.setText("Duplicar");
		this.jButtonCopiarOrdenProdu.setText("Copiar");
		this.jButtonVerFormOrdenProdu.setText("Ver");
		this.jButtonNuevoRelacionesOrdenProdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaOrdenProdu.setText("Guardar");
		this.jButtonCerrarOrdenProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoOrdenProdu,"nuevo_button","Nuevo",this.ordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarOrdenProdu,"duplicar_button","Duplicar",this.ordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarOrdenProdu,"copiar_button","Copiar",this.ordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormOrdenProdu,"ver_form","Ver",this.ordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesOrdenProdu,"nuevorelaciones_button","Nuevo Rel",this.ordenproduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaOrdenProdu,"guardarcambiostabla_button","Guardar",this.ordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrdenProdu,"cerrar_button","Salir",this.ordenproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoOrdenProdu.setToolTipText("Nuevo"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarOrdenProdu.setToolTipText("Duplicar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarOrdenProdu.setToolTipText("Copiar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormOrdenProdu.setToolTipText("Ver"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesOrdenProdu.setToolTipText("Nuevo Rel"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaOrdenProdu.setToolTipText("Guardar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarOrdenProdu.setToolTipText("Salir"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoOrdenProdu";
		inputMap = this.jButtonNuevoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoOrdenProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoOrdenProdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarOrdenProdu";
		inputMap = this.jButtonDuplicarOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarOrdenProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarOrdenProdu"));
		
		//COPIAR
		sMapKey = "CopiarOrdenProdu";
		inputMap = this.jButtonCopiarOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarOrdenProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarOrdenProdu"));
		
		//VEr FORM
		sMapKey = "VerFormOrdenProdu";
		inputMap = this.jButtonVerFormOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormOrdenProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormOrdenProdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesOrdenProdu";
		inputMap = this.jButtonNuevoRelacionesOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesOrdenProdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarOrdenProdu";
		inputMap = this.jButtonModificarOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarOrdenProdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarOrdenProdu";
		inputMap = this.jButtonCerrarOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarOrdenProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaOrdenProdu";
		inputMap = this.jButtonGuardarCambiosTablaOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaOrdenProdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1OrdenProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2OrdenProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3OrdenProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4OrdenProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5OrdenProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesOrdenProdu.setName("jPanelParametrosReportesOrdenProdu"); 
		
		this.jPanelParametrosReportesAccionesOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesOrdenProdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesOrdenProdu.setName("jPanelParametrosReportesAccionesOrdenProdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionOrdenProdu = new JButtonMe();
		this.jButtonRecargarInformacionOrdenProdu.setText("Recargar");
		this.jButtonRecargarInformacionOrdenProdu.setToolTipText("Recargar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionOrdenProdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionOrdenProdu = new JButtonMe();
		this.jButtonProcesarInformacionOrdenProdu.setText("Procesar");
		this.jButtonProcesarInformacionOrdenProdu.setToolTipText("Procesar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionOrdenProdu.setVisible(false);
			
		this.jButtonProcesarInformacionOrdenProdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionOrdenProdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionOrdenProdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesOrdenProdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesOrdenProdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesOrdenProdu.setText("TIPO");       
		this.jComboBoxTiposReportesOrdenProdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesOrdenProdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesOrdenProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionOrdenProdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionOrdenProdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesOrdenProdu.setText("Accion");
		this.jComboBoxTiposRelacionesOrdenProdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesOrdenProdu.setText("Accion");
		this.jComboBoxTiposAccionesOrdenProdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarOrdenProdu.setText("Accion");
		this.jComboBoxTiposSeleccionarOrdenProdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralOrdenProdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralOrdenProdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralOrdenProdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralOrdenProdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesOrdenProdu = new JLabelMe();
		
		this.jLabelAccionesOrdenProdu.setText("Acciones");		
		this.jLabelAccionesOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosOrdenProdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosOrdenProdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosOrdenProdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosOrdenProdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosOrdenProdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosOrdenProdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaOrdenProdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaOrdenProdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaOrdenProdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteOrdenProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteOrdenProdu.setText("Graf.");
		this.jCheckBoxConGraficoReporteOrdenProdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresOrdenProdu = new JButtonMe();
		//this.jButtonAnterioresOrdenProdu.setText("<<");
        this.jButtonAnterioresOrdenProdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresOrdenProdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesOrdenProdu = new JButtonMe();
		//this.jButtonSiguientesOrdenProdu.setText(">>");
        this.jButtonSiguientesOrdenProdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesOrdenProdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosOrdenProdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosOrdenProdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosOrdenProdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosOrdenProdu,"nuevoguardarcambios_button","Nue",this.ordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosOrdenProdu";
		inputMap = this.jButtonNuevoGuardarCambiosOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosOrdenProdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionOrdenProdu";
		inputMap = this.jButtonRecargarInformacionOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionOrdenProdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesOrdenProdu";
		inputMap = this.jButtonSiguientesOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesOrdenProdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresOrdenProdu";
		inputMap = this.jButtonAnterioresOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresOrdenProdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasOrdenProdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesOrdenProdu.setMinimumSize(new Dimension(this.getWidth(),OrdenProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(OrdenProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesOrdenProdu.setMaximumSize(new Dimension(this.getWidth(),OrdenProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(OrdenProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesOrdenProdu.setPreferredSize(new Dimension(this.getWidth(),OrdenProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(OrdenProduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionOrdenProdu = new GridBagLayout();

			this.jPanelPaginacionOrdenProdu.setLayout(gridaBagLayoutPaginacionOrdenProdu);						
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.gridy = 0;
			this.gridBagConstraintsOrdenProdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionOrdenProdu.add(this.jButtonAnterioresOrdenProdu, this.gridBagConstraintsOrdenProdu);
					
						
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsOrdenProdu.gridy = 0;
			
			this.jPanelPaginacionOrdenProdu.add(this.jButtonNuevoGuardarCambiosOrdenProdu, this.gridBagConstraintsOrdenProdu);
						
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsOrdenProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsOrdenProdu.gridy = 0;
			this.jPanelPaginacionOrdenProdu.add(this.jButtonSiguientesOrdenProdu, this.gridBagConstraintsOrdenProdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.gridy = 1;
			this.gridBagConstraintsOrdenProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionOrdenProdu.add(this.jButtonNuevoOrdenProdu, this.gridBagConstraintsOrdenProdu);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
				this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsOrdenProdu.gridy = 1;
				this.gridBagConstraintsOrdenProdu.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionOrdenProdu.add(this.jButtonNuevoRelacionesOrdenProdu, this.gridBagConstraintsOrdenProdu);
			}
			
			
			if(!this.ordenproduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
				this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsOrdenProdu.gridy = 1;
				this.gridBagConstraintsOrdenProdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionOrdenProdu.add(this.jButtonGuardarCambiosTablaOrdenProdu, this.gridBagConstraintsOrdenProdu);
			}
			
			
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.gridy = 1;
			this.gridBagConstraintsOrdenProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionOrdenProdu.add(this.jButtonDuplicarOrdenProdu, this.gridBagConstraintsOrdenProdu);
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.gridy = 1;
			this.gridBagConstraintsOrdenProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionOrdenProdu.add(this.jButtonCopiarOrdenProdu, this.gridBagConstraintsOrdenProdu);
		
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.gridy = 1;
			this.gridBagConstraintsOrdenProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionOrdenProdu.add(this.jButtonVerFormOrdenProdu, this.gridBagConstraintsOrdenProdu);
		
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.gridy = 1;
			this.gridBagConstraintsOrdenProdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionOrdenProdu.add(this.jButtonCerrarOrdenProdu, this.gridBagConstraintsOrdenProdu);
		
		
		
		this.jButtonRecargarInformacionOrdenProdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionOrdenProdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionOrdenProdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesOrdenProdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesOrdenProdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesOrdenProdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesOrdenProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesOrdenProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesOrdenProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesOrdenProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesOrdenProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesOrdenProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionOrdenProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionOrdenProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionOrdenProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesOrdenProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesOrdenProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesOrdenProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesOrdenProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesOrdenProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesOrdenProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarOrdenProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarOrdenProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarOrdenProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaOrdenProdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaOrdenProdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaOrdenProdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteOrdenProdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteOrdenProdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteOrdenProdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosOrdenProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosOrdenProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosOrdenProdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosOrdenProdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosOrdenProdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosOrdenProdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesOrdenProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesOrdenProdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1OrdenProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2OrdenProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3OrdenProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4OrdenProdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesOrdenProdu.setLayout(gridaBagParametrosReportesOrdenProdu);
			this.jPanelParametrosReportesAccionesOrdenProdu.setLayout(gridaBagParametrosReportesAccionesOrdenProdu);
			
			
			this.jPanelParametrosAuxiliar1OrdenProdu.setLayout(gridaBagParametrosAuxiliar1OrdenProdu);
			this.jPanelParametrosAuxiliar2OrdenProdu.setLayout(gridaBagParametrosAuxiliar2OrdenProdu);
			this.jPanelParametrosAuxiliar3OrdenProdu.setLayout(gridaBagParametrosAuxiliar3OrdenProdu);
			this.jPanelParametrosAuxiliar4OrdenProdu.setLayout(gridaBagParametrosAuxiliar4OrdenProdu);
			//this.jPanelParametrosAuxiliar5OrdenProdu.setLayout(gridaBagParametrosAuxiliar2OrdenProdu);			
			
			
			
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsOrdenProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOrdenProdu.add(this.jButtonRecargarInformacionOrdenProdu, this.gridBagConstraintsOrdenProdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1OrdenProdu.add(this.jComboBoxTiposPaginacionOrdenProdu, this.gridBagConstraintsOrdenProdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1OrdenProdu.add(this.jCheckBoxConAltoMaximoTablaOrdenProdu, this.gridBagConstraintsOrdenProdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1OrdenProdu.add(this.jComboBoxTiposArchivosReportesOrdenProdu, this.gridBagConstraintsOrdenProdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOrdenProdu.add(this.jPanelParametrosAuxiliar1OrdenProdu, this.gridBagConstraintsOrdenProdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsOrdenProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4OrdenProdu.add(this.jComboBoxTiposReportesOrdenProdu, this.gridBagConstraintsOrdenProdu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOrdenProdu.add(this.jPanelParametrosAuxiliar4OrdenProdu, this.gridBagConstraintsOrdenProdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenProdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOrdenProdu.add(this.jComboBoxTiposReportesOrdenProdu, this.gridBagConstraintsOrdenProdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenProdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesOrdenProdu.add(this.jCheckBoxGenerarReporteOrdenProdu, this.gridBagConstraintsOrdenProdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOrdenProdu.add(this.jPanelParametrosAuxiliar2OrdenProdu, this.gridBagConstraintsOrdenProdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsOrdenProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesOrdenProdu.add(this.jLabelAccionesOrdenProdu, this.gridBagConstraintsOrdenProdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
				this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsOrdenProdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesOrdenProdu.add(this.jButtonAbrirOrderByOrdenProdu, this.gridBagConstraintsOrdenProdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOrdenProdu.add(this.jComboBoxTiposSeleccionarOrdenProdu, this.gridBagConstraintsOrdenProdu);			
			
			
			/*
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsOrdenProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesOrdenProdu.add(this.jCheckBoxSeleccionarTodosOrdenProdu, this.gridBagConstraintsOrdenProdu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsOrdenProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3OrdenProdu.add(this.jCheckBoxSeleccionarTodosOrdenProdu, this.gridBagConstraintsOrdenProdu);															
				
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsOrdenProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3OrdenProdu.add(this.jCheckBoxSeleccionadosOrdenProdu, this.gridBagConstraintsOrdenProdu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOrdenProdu.add(this.jPanelParametrosAuxiliar3OrdenProdu, this.gridBagConstraintsOrdenProdu);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOrdenProdu.add(this.jComboBoxTiposRelacionesOrdenProdu, this.gridBagConstraintsOrdenProdu);
				
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOrdenProdu.add(this.jComboBoxTiposAccionesOrdenProdu, this.gridBagConstraintsOrdenProdu);
	
				
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOrdenProdu.add(this.jTextFieldValorCampoGeneralOrdenProdu, this.gridBagConstraintsOrdenProdu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosOrdenProdu = new GridBagLayout();

			this.jScrollPanelDatosOrdenProdu.setLayout(gridaBagLayoutDatosOrdenProdu);
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.gridy = 0;
			this.gridBagConstraintsOrdenProdu.gridx = 0;
			
			this.jScrollPanelDatosOrdenProdu.add(this.jTableDatosOrdenProdu, this.gridBagConstraintsOrdenProdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosOrdenProdu.setViewportView(this.jTableDatosOrdenProdu);
		this.jTableDatosOrdenProdu.setFillsViewportHeight(true);
		this.jTableDatosOrdenProdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesOrdenProdu= new GridBagLayout();
		this.jPanelAccionesOrdenProdu.setLayout(gridaBagLayoutAccionesOrdenProdu);
		
		
		/*	
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 0;
			
		this.jPanelAccionesOrdenProdu.add(this.jButtonNuevoOrdenProdu, this.gridBagConstraintsOrdenProdu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteOrdenProdu= new GridBagLayout();
		gridaBagLayoutFK_IdClienteOrdenProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteOrdenProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteOrdenProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteOrdenProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteOrdenProdu.setLayout(gridaBagLayoutFK_IdClienteOrdenProdu);

		gridBagConstraintsOrdenProdu = new GridBagConstraints();
		gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenProdu.gridy = 0;
		gridBagConstraintsOrdenProdu.gridx = 0;
		jPanelFK_IdClienteOrdenProdu.add(jLabelid_clienteFK_IdClienteOrdenProdu, gridBagConstraintsOrdenProdu);

		gridBagConstraintsOrdenProdu = new GridBagConstraints();
		gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenProdu.gridy = 0;
		gridBagConstraintsOrdenProdu.gridx = 1;
		jPanelFK_IdClienteOrdenProdu.add(jComboBoxid_clienteFK_IdClienteOrdenProdu, gridBagConstraintsOrdenProdu);


		gridBagConstraintsOrdenProdu = new GridBagConstraints();
		gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.EAST;
		gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
		gridBagConstraintsOrdenProdu.gridy = 0;
		gridBagConstraintsOrdenProdu.gridx = 0;
		jPanelFK_IdClienteOrdenProdu.add(this.jButtonBuscarFK_IdClienteid_clienteOrdenProdu, gridBagConstraintsOrdenProdu);

		gridBagConstraintsOrdenProdu = new GridBagConstraints();
		gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenProdu.gridy = 1;
		gridBagConstraintsOrdenProdu.gridx =1;
		jPanelFK_IdClienteOrdenProdu.add(jButtonFK_IdClienteOrdenProdu, gridBagConstraintsOrdenProdu);

		jTabbedPaneBusquedasOrdenProdu.addTab("1.-Por Cliente ", jPanelFK_IdClienteOrdenProdu);
		jTabbedPaneBusquedasOrdenProdu.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoResponsableOrdenProdu= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoResponsableOrdenProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoResponsableOrdenProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoResponsableOrdenProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoResponsableOrdenProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoResponsableOrdenProdu.setLayout(gridaBagLayoutFK_IdEmpleadoResponsableOrdenProdu);

		gridBagConstraintsOrdenProdu = new GridBagConstraints();
		gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenProdu.gridy = 0;
		gridBagConstraintsOrdenProdu.gridx = 0;
		jPanelFK_IdEmpleadoResponsableOrdenProdu.add(jLabelid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu, gridBagConstraintsOrdenProdu);

		gridBagConstraintsOrdenProdu = new GridBagConstraints();
		gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenProdu.gridy = 0;
		gridBagConstraintsOrdenProdu.gridx = 1;
		jPanelFK_IdEmpleadoResponsableOrdenProdu.add(jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu, gridBagConstraintsOrdenProdu);

		gridBagConstraintsOrdenProdu = new GridBagConstraints();
		gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenProdu.gridy = 1;
		gridBagConstraintsOrdenProdu.gridx =1;
		jPanelFK_IdEmpleadoResponsableOrdenProdu.add(jButtonFK_IdEmpleadoResponsableOrdenProdu, gridBagConstraintsOrdenProdu);

		jTabbedPaneBusquedasOrdenProdu.addTab("2.-Por Empleado Responsable ", jPanelFK_IdEmpleadoResponsableOrdenProdu);
		jTabbedPaneBusquedasOrdenProdu.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstadoOrdenProduOrdenProdu= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoOrdenProduOrdenProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoOrdenProduOrdenProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoOrdenProduOrdenProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoOrdenProduOrdenProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoOrdenProduOrdenProdu.setLayout(gridaBagLayoutFK_IdEstadoOrdenProduOrdenProdu);

		gridBagConstraintsOrdenProdu = new GridBagConstraints();
		gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenProdu.gridy = 0;
		gridBagConstraintsOrdenProdu.gridx = 0;
		jPanelFK_IdEstadoOrdenProduOrdenProdu.add(jLabelid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu, gridBagConstraintsOrdenProdu);

		gridBagConstraintsOrdenProdu = new GridBagConstraints();
		gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenProdu.gridy = 0;
		gridBagConstraintsOrdenProdu.gridx = 1;
		jPanelFK_IdEstadoOrdenProduOrdenProdu.add(jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu, gridBagConstraintsOrdenProdu);

		gridBagConstraintsOrdenProdu = new GridBagConstraints();
		gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenProdu.gridy = 1;
		gridBagConstraintsOrdenProdu.gridx =1;
		jPanelFK_IdEstadoOrdenProduOrdenProdu.add(jButtonFK_IdEstadoOrdenProduOrdenProdu, gridBagConstraintsOrdenProdu);

		jTabbedPaneBusquedasOrdenProdu.addTab("3.-Por Estado Orden Produ ", jPanelFK_IdEstadoOrdenProduOrdenProdu);
		jTabbedPaneBusquedasOrdenProdu.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdFormatoOrdenProdu= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoOrdenProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoOrdenProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoOrdenProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoOrdenProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoOrdenProdu.setLayout(gridaBagLayoutFK_IdFormatoOrdenProdu);

		gridBagConstraintsOrdenProdu = new GridBagConstraints();
		gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenProdu.gridy = 0;
		gridBagConstraintsOrdenProdu.gridx = 0;
		jPanelFK_IdFormatoOrdenProdu.add(jLabelid_formatoFK_IdFormatoOrdenProdu, gridBagConstraintsOrdenProdu);

		gridBagConstraintsOrdenProdu = new GridBagConstraints();
		gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenProdu.gridy = 0;
		gridBagConstraintsOrdenProdu.gridx = 1;
		jPanelFK_IdFormatoOrdenProdu.add(jComboBoxid_formatoFK_IdFormatoOrdenProdu, gridBagConstraintsOrdenProdu);

		gridBagConstraintsOrdenProdu = new GridBagConstraints();
		gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenProdu.gridy = 1;
		gridBagConstraintsOrdenProdu.gridx =1;
		jPanelFK_IdFormatoOrdenProdu.add(jButtonFK_IdFormatoOrdenProdu, gridBagConstraintsOrdenProdu);

		jTabbedPaneBusquedasOrdenProdu.addTab("4.-Por Formato ", jPanelFK_IdFormatoOrdenProdu);
		jTabbedPaneBusquedasOrdenProdu.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoPrioridadEmpresaProduOrdenProdu= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrioridadEmpresaProduOrdenProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrioridadEmpresaProduOrdenProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrioridadEmpresaProduOrdenProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrioridadEmpresaProduOrdenProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu.setLayout(gridaBagLayoutFK_IdTipoPrioridadEmpresaProduOrdenProdu);

		gridBagConstraintsOrdenProdu = new GridBagConstraints();
		gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenProdu.gridy = 0;
		gridBagConstraintsOrdenProdu.gridx = 0;
		jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu.add(jLabelid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu, gridBagConstraintsOrdenProdu);

		gridBagConstraintsOrdenProdu = new GridBagConstraints();
		gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenProdu.gridy = 0;
		gridBagConstraintsOrdenProdu.gridx = 1;
		jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu.add(jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu, gridBagConstraintsOrdenProdu);

		gridBagConstraintsOrdenProdu = new GridBagConstraints();
		gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenProdu.gridy = 1;
		gridBagConstraintsOrdenProdu.gridx =1;
		jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu.add(jButtonFK_IdTipoPrioridadEmpresaProduOrdenProdu, gridBagConstraintsOrdenProdu);

		jTabbedPaneBusquedasOrdenProdu.addTab("5.-Por Tipo Priorad Empresa Produ ", jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu);
		jTabbedPaneBusquedasOrdenProdu.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutOrdenProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutOrdenProdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ordenproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();						
			this.gridBagConstraintsOrdenProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsOrdenProdu.gridx = 0;		
			//this.gridBagConstraintsOrdenProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsOrdenProdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarOrdenProdu, this.gridBagConstraintsOrdenProdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsOrdenProdu.gridx = 0;		
		//this.gridBagConstraintsOrdenProdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsOrdenProdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsOrdenProdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsOrdenProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsOrdenProdu.gridx = 0;		
			this.gridBagConstraintsOrdenProdu.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsOrdenProdu.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasOrdenProdu, this.gridBagConstraintsOrdenProdu);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenProdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesOrdenProdu, this.gridBagConstraintsOrdenProdu);								
		
		
		/*
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesOrdenProdu, this.gridBagConstraintsOrdenProdu);
		*/		
		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsOrdenProdu.gridx =0;
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsOrdenProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosOrdenProdu, this.gridBagConstraintsOrdenProdu);
				
		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionOrdenProdu, this.gridBagConstraintsOrdenProdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(OrdenProduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosOrdenProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosOrdenProdu = new GridBagLayout();
			this.jPanelBusquedasParametrosOrdenProdu.setLayout(gridaBagLayoutBusquedasParametrosOrdenProdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralOrdenProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralOrdenProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralOrdenProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralOrdenProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOrdenProdu, this.gridBagConstraintsOrdenProdu);
			
			
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosOrdenProdu, this.gridBagConstraintsOrdenProdu);
		
			
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsOrdenProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesOrdenProdu, this.gridBagConstraintsOrdenProdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralOrdenProdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoOrdenProdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoOrdenProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoOrdenProdu.setName("jPanelReporteDinamicoOrdenProdu"); 
		
		this.jPanelReporteDinamicoOrdenProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoOrdenProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoOrdenProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoOrdenProdu.setLayout(gridaBagLayoutReporteDinamicoOrdenProdu);
		
		
		this.jInternalFrameReporteDinamicoOrdenProdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoOrdenProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteOrdenProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoOrdenProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoOrdenProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoOrdenProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoOrdenProdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoOrdenProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoOrdenProdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoOrdenProdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoOrdenProdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoOrdenProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoOrdenProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoOrdenProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Producciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteOrdenProdu = new JLabelMe();

		this.jLabelColumnasSelectReporteOrdenProdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoOrdenProdu.add(this.jLabelColumnasSelectReporteOrdenProdu, this.gridBagConstraintsOrdenProdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteOrdenProdu = new JList<Reporte>();
		this.jListColumnasSelectReporteOrdenProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteOrdenProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteOrdenProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteOrdenProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteOrdenProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteOrdenProdu=new JScrollPane(this.jListColumnasSelectReporteOrdenProdu);
			
			this.jScrollColumnasSelectReporteOrdenProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteOrdenProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteOrdenProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoOrdenProdu.add(this.jListColumnasSelectReporteOrdenProdu, this.gridBagConstraintsOrdenProdu);
		this.jPanelReporteDinamicoOrdenProdu.add(this.jScrollColumnasSelectReporteOrdenProdu, this.gridBagConstraintsOrdenProdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteOrdenProdu = new JLabelMe();

		this.jLabelRelacionesSelectReporteOrdenProdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoOrdenProdu.add(this.jLabelRelacionesSelectReporteOrdenProdu, this.gridBagConstraintsOrdenProdu);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteOrdenProdu = new JList<Reporte>();
		this.jListRelacionesSelectReporteOrdenProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteOrdenProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteOrdenProdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteOrdenProdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteOrdenProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteOrdenProdu=new JScrollPane(this.jListRelacionesSelectReporteOrdenProdu);
			
			this.jScrollRelacionesSelectReporteOrdenProdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteOrdenProdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteOrdenProdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoOrdenProdu.add(this.jListRelacionesSelectReporteOrdenProdu, this.gridBagConstraintsOrdenProdu);
		this.jPanelReporteDinamicoOrdenProdu.add(this.jScrollRelacionesSelectReporteOrdenProdu, this.gridBagConstraintsOrdenProdu);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoOrdenProdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoOrdenProdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoOrdenProdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoOrdenProdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoOrdenProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoOrdenProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoOrdenProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoOrdenProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoOrdenProdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoOrdenProdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoOrdenProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoOrdenProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoOrdenProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoOrdenProdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoOrdenProdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoOrdenProdu.add(this.jLabelGenerarExcelReporteDinamicoOrdenProdu, this.gridBagConstraintsOrdenProdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoOrdenProdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoOrdenProdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoOrdenProdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoOrdenProdu.setToolTipText("Generar EXCEL"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsOrdenProdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsOrdenProdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoOrdenProdu.add(this.jButtonGenerarExcelReporteDinamicoOrdenProdu, this.gridBagConstraintsOrdenProdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsOrdenProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoOrdenProdu.add(this.jComboBoxTiposReportesDinamicoOrdenProdu, this.gridBagConstraintsOrdenProdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoOrdenProdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoOrdenProdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoOrdenProdu.add(this.jLabelTiposArchivoReporteDinamicoOrdenProdu, this.gridBagConstraintsOrdenProdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsOrdenProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoOrdenProdu.add(this.jComboBoxTiposArchivosReportesDinamicoOrdenProdu, this.gridBagConstraintsOrdenProdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoOrdenProdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoOrdenProdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoOrdenProdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoOrdenProdu.setToolTipText("Generar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsOrdenProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoOrdenProdu.add(this.jButtonGenerarReporteDinamicoOrdenProdu, this.gridBagConstraintsOrdenProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoOrdenProdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoOrdenProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoOrdenProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoOrdenProdu.setToolTipText("Cancelar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsOrdenProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoOrdenProdu.add(this.jButtonCerrarReporteDinamicoOrdenProdu, this.gridBagConstraintsOrdenProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalOrdenProdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoOrdenProdu= new JScrollPane(jPanelReporteDinamicoOrdenProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoOrdenProdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoOrdenProdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoOrdenProdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Producciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsOrdenProdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoOrdenProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoOrdenProdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalOrdenProdu);
		this.jInternalFrameReporteDinamicoOrdenProdu.getContentPane().add(this.jScrollPanelReporteDinamicoOrdenProdu, this.gridBagConstraintsOrdenProdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionOrdenProdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionOrdenProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionOrdenProdu.setName("jPanelImportacionOrdenProdu"); 
		
		this.jPanelImportacionOrdenProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionOrdenProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionOrdenProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionOrdenProdu.setLayout(gridaBagLayoutImportacionOrdenProdu);
		
		
		this.jInternalFrameImportacionOrdenProdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionOrdenProdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionOrdenProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteOrdenProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionOrdenProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionOrdenProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionOrdenProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionOrdenProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionOrdenProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionOrdenProdu.setResizable(true);
	    this.jInternalFrameImportacionOrdenProdu.setClosable(true);
	    this.jInternalFrameImportacionOrdenProdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionOrdenProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionOrdenProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionOrdenProdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionOrdenProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionOrdenProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionOrdenProdu.setResizable(true);
	    this.jInternalFrameImportacionOrdenProdu.setClosable(true);
	    this.jInternalFrameImportacionOrdenProdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionOrdenProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionOrdenProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionOrdenProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Producciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionOrdenProdu = new JLabelMe();

		this.jLabelArchivoImportacionOrdenProdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsOrdenProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionOrdenProdu.add(this.jLabelArchivoImportacionOrdenProdu, this.gridBagConstraintsOrdenProdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionOrdenProdu = new JFileChooser();		
		this.jFileChooserImportacionOrdenProdu.setToolTipText("ESCOGER ARCHIVO"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionOrdenProdu = new JButtonMe();
		this.jButtonAbrirImportacionOrdenProdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionOrdenProdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionOrdenProdu.setToolTipText("Generar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsOrdenProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionOrdenProdu.add(this.jButtonAbrirImportacionOrdenProdu, this.gridBagConstraintsOrdenProdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionOrdenProdu = new JLabelMe();

		this.jLabelPathArchivoImportacionOrdenProdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsOrdenProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionOrdenProdu.add(this.jLabelPathArchivoImportacionOrdenProdu, this.gridBagConstraintsOrdenProdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionOrdenProdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionOrdenProdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionOrdenProdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionOrdenProdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsOrdenProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionOrdenProdu.add(this.jTextFieldPathArchivoImportacionOrdenProdu, this.gridBagConstraintsOrdenProdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionOrdenProdu = new JButtonMe();
		this.jButtonGenerarImportacionOrdenProdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionOrdenProdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionOrdenProdu.setToolTipText("Generar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsOrdenProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionOrdenProdu.add(this.jButtonGenerarImportacionOrdenProdu, this.gridBagConstraintsOrdenProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionOrdenProdu = new JButtonMe();
		this.jButtonCerrarImportacionOrdenProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionOrdenProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionOrdenProdu.setToolTipText("Cancelar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsOrdenProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionOrdenProdu.add(this.jButtonCerrarImportacionOrdenProdu, this.gridBagConstraintsOrdenProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalOrdenProdu = new GridBagLayout();
		
		this.jScrollPanelImportacionOrdenProdu= new JScrollPane(jPanelImportacionOrdenProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy =iPosYImportacion;
		this.gridBagConstraintsOrdenProdu.gridx =iPosXImportacion;
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionOrdenProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionOrdenProdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalOrdenProdu);
		this.jInternalFrameImportacionOrdenProdu.getContentPane().add(this.jScrollPanelImportacionOrdenProdu, this.gridBagConstraintsOrdenProdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByOrdenProdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByOrdenProdu = new JButtonMe();
			this.jButtonAbrirOrderByOrdenProdu.setText("Orden");
			this.jButtonAbrirOrderByOrdenProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByOrdenProdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByOrdenProdu";
			inputMap = this.jButtonAbrirOrderByOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByOrdenProdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByOrdenProdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByOrdenProdu.setName("jPanelOrderByOrdenProdu"); 
			
			this.jPanelOrderByOrdenProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByOrdenProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByOrdenProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByOrdenProdu.setLayout(gridaBagLayoutOrderByOrdenProdu);
			
			
			this.jTableDatosOrdenProduOrderBy = new JTableMe();        
			this.jTableDatosOrdenProduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosOrdenProduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosOrdenProduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosOrdenProduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosOrdenProduOrderBy.setViewportView(this.jTableDatosOrdenProduOrderBy);
			this.jTableDatosOrdenProduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosOrdenProduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByOrdenProdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByOrdenProdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByOrdenProdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteOrdenProdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByOrdenProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByOrdenProdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByOrdenProdu.setTitle("Orden");
			this.jInternalFrameOrderByOrdenProdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByOrdenProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByOrdenProdu.setResizable(true);
			this.jInternalFrameOrderByOrdenProdu.setClosable(true);
			this.jInternalFrameOrderByOrdenProdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByOrdenProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByOrdenProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByOrdenProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Producciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsOrdenProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsOrdenProdu.ipady =150;
				
			this.jPanelOrderByOrdenProdu.add(jScrollPanelDatosOrdenProduOrderBy, this.gridBagConstraintsOrdenProdu);//this.jTableDatosOrdenProduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByOrdenProdu = new JButtonMe();
			this.jButtonCerrarOrderByOrdenProdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByOrdenProdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByOrdenProdu.setToolTipText("Cancelar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsOrdenProdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByOrdenProdu.add(this.jButtonCerrarOrderByOrdenProdu, this.gridBagConstraintsOrdenProdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalOrdenProdu = new GridBagLayout();
			
			this.jScrollPanelOrderByOrdenProdu= new JScrollPane(jPanelOrderByOrdenProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsOrdenProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByOrdenProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByOrdenProdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalOrdenProdu);
			
			this.jInternalFrameOrderByOrdenProdu.getContentPane().add(this.jScrollPanelOrderByOrdenProdu, this.gridBagConstraintsOrdenProdu);			
		
		} else {
			this.jButtonAbrirOrderByOrdenProdu = new JButtonMe();
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
		int iWidthTableCalculado=0;//3830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.ordenproduSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosOrdenProdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosOrdenProdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosOrdenProdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosOrdenProdu.getRowHeight();//OrdenProduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > OrdenProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaOrdenProdu.isSelected()) {
					iHeightTable=OrdenProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < OrdenProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=OrdenProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > OrdenProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaOrdenProdu.isSelected()) {
					iHeightTable=OrdenProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < OrdenProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=OrdenProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosOrdenProdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosOrdenProdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosOrdenProdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosOrdenProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosOrdenProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosOrdenProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByOrdenProdu!=null && this.jInternalFrameOrderByOrdenProdu.getjTableDatosOrderBy()!=null) {
			//if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByOrdenProdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByOrdenProdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByOrdenProdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByOrdenProdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByOrdenProdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByOrdenProdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByOrdenProdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosOrdenProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosOrdenProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosOrdenProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=ordenproduLogic.getOrdenProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ordenprodus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<OrdenProdu> TraerOrdenProduBeans(List<OrdenProdu> ordenprodus,ArrayList<Classe> classes)throws Exception {
		try {
			for(OrdenProdu ordenprodu:ordenprodus) {
					
				if(!(OrdenProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || OrdenProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ordenprodu.setsDetalleGeneralEntityReporte(OrdenProduConstantesFunciones.getOrdenProduDescripcion(ordenprodu));
										
					ordenprodu.setes_uso_interno_descripcion(OrdenProduConstantesFunciones.getes_uso_internoDescripcion(ordenprodu));	
					
					

					if(ordenprodu.getOrdenDetaProdus()!=null && Funciones.existeClass(classes,OrdenDetaProdu.class)) {
						try{ordenprodu.setordendetaprodusDescripcionReporte(new JRBeanCollectionDataSource(OrdenDetaProduJInternalFrame.TraerOrdenDetaProduBeans(ordenprodu.getOrdenDetaProdus(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//ordenprodu.setsDetalleGeneralEntityReporte(ordenprodu.getsDetalleGeneralEntityReporte());
										
				}
				
				//ordenprodubeans.add(ordenprodubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ordenprodus;
    }
	//PARA REPORTES FIN
}
